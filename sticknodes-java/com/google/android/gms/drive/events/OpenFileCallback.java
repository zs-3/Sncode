package com.google.android.gms.drive.events;

/* loaded from: classes.dex */
public abstract class OpenFileCallback {
    public OpenFileCallback() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void onContents(com.google.android.gms.drive.DriveContents r1);

    public abstract void onError(java.lang.Exception r1);

    public abstract void onProgress(long r1, long r3);
}
