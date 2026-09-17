package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcbl implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcbn zza;

    zzcbl(com.google.android.gms.internal.ads.zzcbn r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcbn r0 = r2.zza
            com.google.android.gms.internal.ads.zzcbo r1 = com.google.android.gms.internal.ads.zzcbn.zzi(r0)
            if (r1 == 0) goto L24
            boolean r1 = com.google.android.gms.internal.ads.zzcbn.zzv(r0)
            if (r1 != 0) goto L1b
            com.google.android.gms.internal.ads.zzcbo r0 = com.google.android.gms.internal.ads.zzcbn.zzi(r0)
            r0.zzg()
            com.google.android.gms.internal.ads.zzcbn r0 = r2.zza
            r1 = 1
            com.google.android.gms.internal.ads.zzcbn.zzk(r0, r1)
        L1b:
            com.google.android.gms.internal.ads.zzcbn r0 = r2.zza
            com.google.android.gms.internal.ads.zzcbo r0 = com.google.android.gms.internal.ads.zzcbn.zzi(r0)
            r0.zze()
        L24:
            return
    }
}
