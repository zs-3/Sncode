package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzccl implements java.lang.Runnable {
    private final com.google.android.gms.internal.ads.zzcbx zza;
    private boolean zzb;

    zzccl(com.google.android.gms.internal.ads.zzcbx r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzb = r0
            r1.zza = r2
            return
    }

    private final void zzc() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            r0.removeCallbacks(r3)
            r1 = 250(0xfa, double:1.235E-321)
            r0.postDelayed(r3, r1)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            boolean r0 = r1.zzb
            if (r0 != 0) goto Lc
            com.google.android.gms.internal.ads.zzcbx r0 = r1.zza
            r0.zzt()
            r1.zzc()
        Lc:
            return
    }

    public final void zza() {
            r1 = this;
            r0 = 1
            r1.zzb = r0
            com.google.android.gms.internal.ads.zzcbx r0 = r1.zza
            r0.zzt()
            return
    }

    public final void zzb() {
            r1 = this;
            r0 = 0
            r1.zzb = r0
            r1.zzc()
            return
    }
}
