package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public abstract class BackgroundPriorityRunnable implements java.lang.Runnable {
    public BackgroundPriorityRunnable() {
            r0 = this;
            r0.<init>()
            return
    }

    protected abstract void onRun();

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            r1.onRun()
            return
    }
}
