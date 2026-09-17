package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcbu implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcbx zza;

    zzcbu(com.google.android.gms.internal.ads.zzcbx r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.internal.ads.zzcbx r0 = r3.zza
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "surfaceCreated"
            com.google.android.gms.internal.ads.zzcbx.zzm(r0, r2, r1)
            return
    }
}
