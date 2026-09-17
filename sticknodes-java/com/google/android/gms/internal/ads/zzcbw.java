package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcbw implements java.lang.Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcbx zzb;

    zzcbw(com.google.android.gms.internal.ads.zzcbx r1, boolean r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "isVisible"
            r0[r1] = r2
            boolean r1 = r3.zza
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            com.google.android.gms.internal.ads.zzcbx r1 = r3.zzb
            java.lang.String r2 = "windowVisibilityChanged"
            com.google.android.gms.internal.ads.zzcbx.zzm(r1, r2, r0)
            return
    }
}
