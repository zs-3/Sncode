package com.google.android.gms.internal.base;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public class zau extends android.os.Handler {
    private final android.os.Looper zaa;

    public zau() {
            r1 = this;
            r1.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.zaa = r0
            return
    }

    public zau(android.os.Looper r1) {
            r0 = this;
            r0.<init>(r1)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.zaa = r1
            return
    }

    public zau(android.os.Looper r1, android.os.Handler.Callback r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.zaa = r1
            return
    }
}
