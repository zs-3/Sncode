package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcbj implements java.lang.Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcbn zzc;

    zzcbj(com.google.android.gms.internal.ads.zzcbn r1, int r2, int r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.internal.ads.zzcbn r0 = r3.zzc
            com.google.android.gms.internal.ads.zzcbo r1 = com.google.android.gms.internal.ads.zzcbn.zzi(r0)
            if (r1 == 0) goto L13
            int r1 = r3.zza
            int r2 = r3.zzb
            com.google.android.gms.internal.ads.zzcbo r0 = com.google.android.gms.internal.ads.zzcbn.zzi(r0)
            r0.zzj(r1, r2)
        L13:
            return
    }
}
