package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public class zzcaz {
    private final com.google.android.gms.internal.ads.zzcas zza;
    private final java.util.concurrent.atomic.AtomicInteger zzb;

    public zzcaz() {
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.ads.zzcas r0 = new com.google.android.gms.internal.ads.zzcas
            r0.<init>()
            r3.zza = r0
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r2 = 0
            r1.<init>(r2)
            r3.zzb = r1
            com.google.android.gms.internal.ads.zzcax r1 = new com.google.android.gms.internal.ads.zzcax
            r1.<init>(r3)
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.atomic.AtomicInteger zzf(com.google.android.gms.internal.ads.zzcaz r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.zzb
            return r0
    }

    @java.lang.Deprecated
    public final int zze() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.zzb
            int r0 = r0.get()
            return r0
    }

    @java.lang.Deprecated
    public final void zzg() {
            r2 = this;
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            com.google.android.gms.internal.ads.zzcas r1 = r2.zza
            r1.zzd(r0)
            return
    }

    @java.lang.Deprecated
    public final void zzh(java.lang.Throwable r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcas r0 = r2.zza
            r0.zzd(r3)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzho
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1e
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            r0.zzv(r3, r4)
        L1e:
            return
    }

    @java.lang.Deprecated
    public final void zzi(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcas r0 = r1.zza
            r0.zzc(r2)
            return
    }

    @java.lang.Deprecated
    public final void zzj(com.google.android.gms.internal.ads.zzcaw r2, com.google.android.gms.internal.ads.zzcau r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcay r0 = new com.google.android.gms.internal.ads.zzcay
            r0.<init>(r1, r2, r3)
            com.google.android.gms.internal.ads.zzcas r2 = r1.zza
            com.google.android.gms.internal.ads.zzgfz r3 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.android.gms.internal.ads.zzgfo.zzr(r2, r0, r3)
            return
    }
}
