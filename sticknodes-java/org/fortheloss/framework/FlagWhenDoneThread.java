package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class FlagWhenDoneThread extends java.lang.Thread {
    private volatile boolean _isDone;

    public FlagWhenDoneThread() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._isDone = r0
            return
    }

    public synchronized boolean isDone() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1._isDone     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    protected synchronized void setDone() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1._isDone = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
