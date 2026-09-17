package androidx.room.util;

/* loaded from: classes.dex */
public class CopyLock {
    private static final java.util.Map<java.lang.String, java.util.concurrent.locks.Lock> sThreadLocks = null;
    private final java.io.File mCopyLockFile;
    private final boolean mFileLevelLock;
    private java.nio.channels.FileChannel mLockChannel;
    private final java.util.concurrent.locks.Lock mThreadLock;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.room.util.CopyLock.sThreadLocks = r0
            return
    }

    public CopyLock(java.lang.String r3, java.io.File r4, boolean r5) {
            r2 = this;
            r2.<init>()
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = ".lck"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r4, r3)
            r2.mCopyLockFile = r0
            java.lang.String r3 = r0.getAbsolutePath()
            java.util.concurrent.locks.Lock r3 = getThreadLock(r3)
            r2.mThreadLock = r3
            r2.mFileLevelLock = r5
            return
    }

    private static java.util.concurrent.locks.Lock getThreadLock(java.lang.String r2) {
            java.util.Map<java.lang.String, java.util.concurrent.locks.Lock> r0 = androidx.room.util.CopyLock.sThreadLocks
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r2)     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.locks.Lock r1 = (java.util.concurrent.locks.Lock) r1     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L13
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r1
        L15:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r2
    }

    public void lock() {
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.mThreadLock
            r0.lock()
            boolean r0 = r3.mFileLevelLock
            if (r0 == 0) goto L23
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L1a
            java.io.File r1 = r3.mCopyLockFile     // Catch: java.io.IOException -> L1a
            r0.<init>(r1)     // Catch: java.io.IOException -> L1a
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch: java.io.IOException -> L1a
            r3.mLockChannel = r0     // Catch: java.io.IOException -> L1a
            r0.lock()     // Catch: java.io.IOException -> L1a
            goto L23
        L1a:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to grab copy lock."
            r1.<init>(r2, r0)
            throw r1
        L23:
            return
    }

    public void unlock() {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.mLockChannel
            if (r0 == 0) goto L7
            r0.close()     // Catch: java.io.IOException -> L7
        L7:
            java.util.concurrent.locks.Lock r0 = r1.mThreadLock
            r0.unlock()
            return
    }
}
