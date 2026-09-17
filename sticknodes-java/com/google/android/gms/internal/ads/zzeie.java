package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeie implements com.google.android.gms.internal.ads.zzegk {
    private final com.google.android.gms.internal.ads.zzcrv zza;
    private final com.google.android.gms.internal.ads.zzehl zzb;
    private final com.google.android.gms.internal.ads.zzgfz zzc;
    private final com.google.android.gms.internal.ads.zzcyc zzd;
    private final java.util.concurrent.ScheduledExecutorService zze;
    private final com.google.android.gms.internal.ads.zzdty zzf;

    public zzeie(com.google.android.gms.internal.ads.zzcrv r1, com.google.android.gms.internal.ads.zzehl r2, com.google.android.gms.internal.ads.zzcyc r3, java.util.concurrent.ScheduledExecutorService r4, com.google.android.gms.internal.ads.zzgfz r5, com.google.android.gms.internal.ads.zzdty r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzd = r3
            r0.zze = r4
            r0.zzc = r5
            r0.zzf = r6
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzcrv zzd(com.google.android.gms.internal.ads.zzeie r0) {
            com.google.android.gms.internal.ads.zzcrv r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzcyc zze(com.google.android.gms.internal.ads.zzeie r0) {
            com.google.android.gms.internal.ads.zzcyc r0 = r0.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfgt r2, com.google.android.gms.internal.ads.zzfgh r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzeic r0 = new com.google.android.gms.internal.ads.zzeic
            r0.<init>(r1, r2, r3)
            com.google.android.gms.internal.ads.zzgfz r2 = r1.zzc
            com.google.common.util.concurrent.ListenableFuture r2 = r2.zzb(r0)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(com.google.android.gms.internal.ads.zzfgt r7, com.google.android.gms.internal.ads.zzfgh r8) {
            r6 = this;
            com.google.android.gms.internal.ads.zzfgq r0 = r7.zza
            com.google.android.gms.internal.ads.zzfhc r0 = r0.zza
            com.google.android.gms.internal.ads.zzbht r0 = r0.zza()
            com.google.android.gms.internal.ads.zzehl r1 = r6.zzb
            boolean r7 = r1.zzb(r7, r8)
            com.google.android.gms.internal.ads.zzbcm r8 = com.google.android.gms.internal.ads.zzbcv.zzlB
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r8 = r1.zza(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r1 = 1
            if (r8 == 0) goto L43
            com.google.android.gms.internal.ads.zzdty r8 = r6.zzf
            java.lang.String r2 = "1"
            java.lang.String r3 = "0"
            if (r0 == 0) goto L2b
            r4 = r2
            goto L2c
        L2b:
            r4 = r3
        L2c:
            java.util.Map r8 = r8.zzb()
            java.lang.String r5 = "has_dbl"
            r8.put(r5, r4)
            com.google.android.gms.internal.ads.zzdty r8 = r6.zzf
            if (r1 == r7) goto L3a
            r2 = r3
        L3a:
            java.util.Map r8 = r8.zzb()
            java.lang.String r3 = "crdb"
            r8.put(r3, r2)
        L43:
            if (r0 == 0) goto L48
            if (r7 == 0) goto L48
            return r1
        L48:
            r7 = 0
            return r7
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzcqr zzc(com.google.android.gms.internal.ads.zzfgt r5, com.google.android.gms.internal.ads.zzfgh r6) throws java.lang.Exception {
            r4 = this;
            com.google.android.gms.internal.ads.zzctu r0 = new com.google.android.gms.internal.ads.zzctu
            r1 = 0
            r0.<init>(r5, r6, r1)
            com.google.android.gms.internal.ads.zzcsm r1 = new com.google.android.gms.internal.ads.zzcsm
            com.google.android.gms.internal.ads.zzfgq r2 = r5.zza
            com.google.android.gms.internal.ads.zzfhc r2 = r2.zza
            com.google.android.gms.internal.ads.zzbht r2 = r2.zza()
            com.google.android.gms.internal.ads.zzeib r3 = new com.google.android.gms.internal.ads.zzeib
            r3.<init>(r4, r5, r6)
            r1.<init>(r2, r3)
            com.google.android.gms.internal.ads.zzcrv r5 = r4.zza
            com.google.android.gms.internal.ads.zzcsl r5 = r5.zzb(r0, r1)
            com.google.android.gms.internal.ads.zzcqr r5 = r5.zza()
            return r5
    }

    final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzfgt r4, com.google.android.gms.internal.ads.zzfgh r5) {
            r3 = this;
            com.google.android.gms.internal.ads.zzehl r0 = r3.zzb
            com.google.common.util.concurrent.ListenableFuture r4 = r0.zza(r4, r5)
            int r5 = r5.zzR
            long r0 = (long) r5
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ScheduledExecutorService r2 = r3.zze
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzo(r4, r0, r5, r2)
            com.google.android.gms.internal.ads.zzeid r5 = new com.google.android.gms.internal.ads.zzeid
            r5.<init>(r3)
            com.google.android.gms.internal.ads.zzgfz r0 = r3.zzc
            com.google.android.gms.internal.ads.zzgfo.zzr(r4, r5, r0)
            return
    }
}
