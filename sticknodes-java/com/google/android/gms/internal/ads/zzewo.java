package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzewo implements com.google.android.gms.internal.ads.zzexh {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private final android.content.Context zzd;
    private final com.google.android.gms.internal.ads.zzfhc zze;
    private final com.google.android.gms.internal.ads.zzcho zzf;

    zzewo(com.google.android.gms.internal.ads.zzgfz r1, java.util.concurrent.ScheduledExecutorService r2, java.lang.String r3, android.content.Context r4, com.google.android.gms.internal.ads.zzfhc r5, com.google.android.gms.internal.ads.zzcho r6) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zza = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            return
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzewo r5) {
            com.google.android.gms.internal.ads.zzcho r0 = r5.zzf
            com.google.android.gms.ads.nonagon.signalgeneration.zzw r0 = r0.zzp()
            com.google.android.gms.internal.ads.zzcxi r1 = new com.google.android.gms.internal.ads.zzcxi
            r1.<init>()
            android.content.Context r2 = r5.zzd
            r1.zze(r2)
            com.google.android.gms.internal.ads.zzfha r2 = new com.google.android.gms.internal.ads.zzfha
            r2.<init>()
            java.lang.String r3 = "adUnitId"
            r2.zzt(r3)
            com.google.android.gms.internal.ads.zzfhc r3 = r5.zze
            com.google.android.gms.ads.internal.client.zzm r3 = r3.zzd
            r2.zzH(r3)
            com.google.android.gms.ads.internal.client.zzs r3 = new com.google.android.gms.ads.internal.client.zzs
            r3.<init>()
            r2.zzs(r3)
            r3 = 1
            r2.zzz(r3)
            com.google.android.gms.internal.ads.zzfhc r2 = r2.zzJ()
            r1.zzi(r2)
            com.google.android.gms.internal.ads.zzcxk r1 = r1.zzj()
            r0.zza(r1)
            com.google.android.gms.ads.nonagon.signalgeneration.zzas r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzas
            r1.<init>()
            java.lang.String r2 = r5.zza
            r1.zza(r2)
            com.google.android.gms.ads.nonagon.signalgeneration.zzau r1 = r1.zzb()
            r0.zzb(r1)
            com.google.android.gms.internal.ads.zzdds r1 = new com.google.android.gms.internal.ads.zzdds
            r1.<init>()
            com.google.android.gms.ads.nonagon.signalgeneration.zzx r0 = r0.zzc()
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzgff r0 = com.google.android.gms.internal.ads.zzgff.zzu(r0)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgP
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledExecutorService r4 = r5.zzc
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzo(r0, r1, r3, r4)
            com.google.android.gms.internal.ads.zzgff r0 = (com.google.android.gms.internal.ads.zzgff) r0
            com.google.android.gms.internal.ads.zzewl r1 = new com.google.android.gms.internal.ads.zzewl
            r1.<init>()
            com.google.android.gms.internal.ads.zzgfz r2 = r5.zzb
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r2)
            com.google.android.gms.internal.ads.zzgff r0 = (com.google.android.gms.internal.ads.zzgff) r0
            com.google.android.gms.internal.ads.zzewm r1 = new com.google.android.gms.internal.ads.zzewm
            r1.<init>()
            com.google.android.gms.internal.ads.zzgfz r5 = r5.zzb
            java.lang.Class<java.lang.Exception> r2 = java.lang.Exception.class
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zze(r0, r2, r1, r5)
            com.google.android.gms.internal.ads.zzgff r5 = (com.google.android.gms.internal.ads.zzgff) r5
            return r5
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 33
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzgO
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L25
            com.google.android.gms.internal.ads.zzfhc r0 = r2.zze
            boolean r0 = r0.zzr
            if (r0 == 0) goto L19
            goto L25
        L19:
            com.google.android.gms.internal.ads.zzewn r0 = new com.google.android.gms.internal.ads.zzewn
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zzb
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzk(r0, r1)
            return r0
        L25:
            com.google.android.gms.internal.ads.zzewp r0 = new com.google.android.gms.internal.ads.zzewp
            r1 = 0
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
    }
}
