package com.google.firebase.installations;

/* loaded from: classes2.dex */
class CrossProcessLock {
    private final java.nio.channels.FileChannel channel;
    private final java.nio.channels.FileLock lock;

    private CrossProcessLock(java.nio.channels.FileChannel r1, java.nio.channels.FileLock r2) {
            r0 = this;
            r0.<init>()
            r0.channel = r1
            r0.lock = r2
            return
    }

    static com.google.firebase.installations.CrossProcessLock acquire(android.content.Context r4, java.lang.String r5) {
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L2e java.io.IOException -> L30
            java.io.File r4 = r4.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L2e java.io.IOException -> L30
            r1.<init>(r4, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L2e java.io.IOException -> L30
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L2e java.io.IOException -> L30
            java.lang.String r5 = "rw"
            r4.<init>(r1, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L2e java.io.IOException -> L30
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L2e java.io.IOException -> L30
            java.nio.channels.FileLock r5 = r4.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L25 java.lang.Error -> L27 java.io.IOException -> L29
            com.google.firebase.installations.CrossProcessLock r1 = new com.google.firebase.installations.CrossProcessLock     // Catch: java.nio.channels.OverlappingFileLockException -> L1f java.lang.Error -> L21 java.io.IOException -> L23
            r1.<init>(r4, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L1f java.lang.Error -> L21 java.io.IOException -> L23
            return r1
        L1f:
            r1 = move-exception
            goto L33
        L21:
            r1 = move-exception
            goto L33
        L23:
            r1 = move-exception
            goto L33
        L25:
            r1 = move-exception
            goto L2a
        L27:
            r1 = move-exception
            goto L2a
        L29:
            r1 = move-exception
        L2a:
            r5 = r0
            goto L33
        L2c:
            r1 = move-exception
            goto L31
        L2e:
            r1 = move-exception
            goto L31
        L30:
            r1 = move-exception
        L31:
            r4 = r0
            r5 = r4
        L33:
            java.lang.String r2 = "CrossProcessLock"
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r2, r3, r1)
            if (r5 == 0) goto L41
            r5.release()     // Catch: java.io.IOException -> L40
            goto L41
        L40:
        L41:
            if (r4 == 0) goto L46
            r4.close()     // Catch: java.io.IOException -> L46
        L46:
            return r0
    }

    void releaseAndClose() {
            r3 = this;
            java.nio.channels.FileLock r0 = r3.lock     // Catch: java.io.IOException -> Lb
            r0.release()     // Catch: java.io.IOException -> Lb
            java.nio.channels.FileChannel r0 = r3.channel     // Catch: java.io.IOException -> Lb
            r0.close()     // Catch: java.io.IOException -> Lb
            goto L13
        Lb:
            r0 = move-exception
            java.lang.String r1 = "CrossProcessLock"
            java.lang.String r2 = "encountered error while releasing, ignoring"
            android.util.Log.e(r1, r2, r0)
        L13:
            return
    }
}
