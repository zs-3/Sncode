package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzctt {
    private final java.util.concurrent.Executor zza;
    private final java.util.concurrent.ScheduledExecutorService zzb;
    private final com.google.common.util.concurrent.ListenableFuture zzc;
    private volatile boolean zzd;

    public zzctt(java.util.concurrent.Executor r2, java.util.concurrent.ScheduledExecutorService r3, com.google.common.util.concurrent.ListenableFuture r4) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zzd = r0
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r4
            return
    }

    static /* bridge */ /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzctt r5, java.util.List r6, com.google.android.gms.internal.ads.zzgfk r7) {
            if (r6 == 0) goto L42
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L9
            goto L42
        L9:
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            java.util.Iterator r6 = r6.iterator()
        L12:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r6.next()
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            com.google.android.gms.internal.ads.zzctp r2 = new com.google.android.gms.internal.ads.zzctp
            r2.<init>(r7)
            java.util.concurrent.Executor r3 = r5.zza
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzf(r0, r4, r2, r3)
            com.google.android.gms.internal.ads.zzctq r2 = new com.google.android.gms.internal.ads.zzctq
            r2.<init>(r5, r7, r1)
            java.util.concurrent.Executor r1 = r5.zza
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzn(r0, r2, r1)
            goto L12
        L37:
            com.google.android.gms.internal.ads.zzcts r6 = new com.google.android.gms.internal.ads.zzcts
            r6.<init>(r5, r7)
            java.util.concurrent.Executor r5 = r5.zza
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r6, r5)
            return
        L42:
            java.util.concurrent.Executor r5 = r5.zza
            com.google.android.gms.internal.ads.zzcto r6 = new com.google.android.gms.internal.ads.zzcto
            r6.<init>(r7)
            r5.execute(r6)
            return
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzctt r2) {
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zze
            com.google.android.gms.internal.ads.zzctn r1 = new com.google.android.gms.internal.ads.zzctn
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzgfk r3, com.google.common.util.concurrent.ListenableFuture r4, com.google.android.gms.internal.ads.zzcte r5) throws java.lang.Exception {
            r2 = this;
            if (r5 == 0) goto L5
            r3.zzb(r5)
        L5:
            com.google.android.gms.internal.ads.zzbeb r3 = com.google.android.gms.internal.ads.zzbfe.zza
            java.lang.Object r3 = r3.zze()
            java.lang.Long r3 = (java.lang.Long) r3
            long r0 = r3.longValue()
            java.util.concurrent.ScheduledExecutorService r3 = r2.zzb
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzo(r4, r0, r5, r3)
            return r3
    }

    final /* synthetic */ void zzd() {
            r1 = this;
            r0 = 0
            r1.zzd = r0
            return
    }

    public final void zze(com.google.android.gms.internal.ads.zzgfk r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzctr r0 = new com.google.android.gms.internal.ads.zzctr
            r0.<init>(r2, r3)
            java.util.concurrent.Executor r3 = r2.zza
            com.google.common.util.concurrent.ListenableFuture r1 = r2.zzc
            com.google.android.gms.internal.ads.zzgfo.zzr(r1, r0, r3)
            return
    }

    public final boolean zzf() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }
}
