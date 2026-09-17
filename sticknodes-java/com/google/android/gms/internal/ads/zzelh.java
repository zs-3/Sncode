package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzelh implements com.google.android.gms.internal.ads.zzegk {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdre zzb;
    private final com.google.android.gms.internal.ads.zzdqn zzc;
    private final com.google.android.gms.internal.ads.zzfhc zzd;
    private final java.util.concurrent.Executor zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private final com.google.android.gms.internal.ads.zzbjz zzg;
    private final boolean zzh;
    private final com.google.android.gms.internal.ads.zzefj zzi;
    private final com.google.android.gms.internal.ads.zzdty zzj;

    public zzelh(android.content.Context r1, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2, com.google.android.gms.internal.ads.zzfhc r3, java.util.concurrent.Executor r4, com.google.android.gms.internal.ads.zzdqn r5, com.google.android.gms.internal.ads.zzdre r6, com.google.android.gms.internal.ads.zzbjz r7, com.google.android.gms.internal.ads.zzefj r8, com.google.android.gms.internal.ads.zzdty r9) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzd = r3
            r0.zzc = r5
            r0.zze = r4
            r0.zzf = r2
            r0.zzb = r6
            r0.zzg = r7
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziw
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.zzh = r1
            r0.zzi = r8
            r0.zzj = r9
            return
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfgt r4, com.google.android.gms.internal.ads.zzfgh r5) {
            r3 = this;
            com.google.android.gms.internal.ads.zzdri r0 = new com.google.android.gms.internal.ads.zzdri
            r0.<init>()
            r1 = 0
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgfo.zzh(r1)
            com.google.android.gms.internal.ads.zzela r2 = new com.google.android.gms.internal.ads.zzela
            r2.<init>(r3, r5, r4, r0)
            java.util.concurrent.Executor r4 = r3.zze
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzn(r1, r2, r4)
            com.google.android.gms.internal.ads.zzelb r5 = new com.google.android.gms.internal.ads.zzelb
            r5.<init>(r0)
            java.util.concurrent.Executor r0 = r3.zze
            r4.addListener(r5, r0)
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(com.google.android.gms.internal.ads.zzfgt r1, com.google.android.gms.internal.ads.zzfgh r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzfgm r1 = r2.zzs
            if (r1 == 0) goto La
            java.lang.String r1 = r1.zza
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfgh r24, com.google.android.gms.internal.ads.zzfgt r25, com.google.android.gms.internal.ads.zzdri r26, java.lang.Object r27) throws java.lang.Exception {
            r23 = this;
            r0 = r23
            r13 = r24
            r1 = r25
            com.google.android.gms.internal.ads.zzbcm r14 = com.google.android.gms.internal.ads.zzbcv.zzch
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r2.zza(r14)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2f
            com.google.android.gms.internal.ads.zzdty r2 = r0.zzj
            android.os.Bundle r2 = r2.zza()
            com.google.android.gms.internal.ads.zzdtm r3 = com.google.android.gms.internal.ads.zzdtm.zzs
            java.lang.String r3 = r3.zza()
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzu.zzB()
            long r4 = r4.currentTimeMillis()
            r2.putLong(r3, r4)
        L2f:
            com.google.android.gms.internal.ads.zzdre r2 = r0.zzb
            com.google.android.gms.internal.ads.zzfhc r3 = r0.zzd
            com.google.android.gms.internal.ads.zzfgs r4 = r1.zzb
            com.google.android.gms.internal.ads.zzfgk r4 = r4.zzb
            com.google.android.gms.ads.internal.client.zzs r3 = r3.zze
            com.google.android.gms.internal.ads.zzcfo r15 = r2.zza(r3, r13, r4)
            boolean r2 = r13.zzW
            r15.zzac(r2)
            android.content.Context r2 = r0.zza
            android.view.View r3 = r15.zzF()
            r4 = r26
            r4.zza(r2, r3)
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r2.zza(r14)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L74
            com.google.android.gms.internal.ads.zzdty r2 = r0.zzj
            android.os.Bundle r2 = r2.zza()
            com.google.android.gms.internal.ads.zzdtm r3 = com.google.android.gms.internal.ads.zzdtm.zzt
            java.lang.String r3 = r3.zza()
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzu.zzB()
            long r4 = r4.currentTimeMillis()
            r2.putLong(r3, r4)
        L74:
            com.google.android.gms.internal.ads.zzcas r12 = new com.google.android.gms.internal.ads.zzcas
            r12.<init>()
            com.google.android.gms.internal.ads.zzdqn r11 = r0.zzc
            com.google.android.gms.internal.ads.zzctu r10 = new com.google.android.gms.internal.ads.zzctu
            r9 = 0
            r10.<init>(r1, r13, r9)
            android.content.Context r2 = r0.zza
            com.google.android.gms.internal.ads.zzdre r3 = r0.zzb
            com.google.android.gms.internal.ads.zzfhc r4 = r0.zzd
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r5 = r0.zzf
            com.google.android.gms.internal.ads.zzbjz r8 = r0.zzg
            boolean r7 = r0.zzh
            com.google.android.gms.internal.ads.zzefj r6 = r0.zzi
            com.google.android.gms.internal.ads.zzdty r1 = r0.zzj
            com.google.android.gms.internal.ads.zzdqk r13 = new com.google.android.gms.internal.ads.zzdqk
            com.google.android.gms.internal.ads.zzelg r0 = new com.google.android.gms.internal.ads.zzelg
            r16 = r1
            r1 = r0
            r17 = r6
            r6 = r24
            r18 = r7
            r7 = r12
            r19 = r8
            r8 = r15
            r20 = r9
            r9 = r19
            r27 = r14
            r14 = r10
            r10 = r18
            r21 = r11
            r11 = r17
            r22 = r12
            r12 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.<init>(r0, r15)
            r0 = r21
            com.google.android.gms.internal.ads.zzdqj r0 = r0.zze(r14, r13)
            r1 = r22
            r1.zzc(r0)
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            r2 = r27
            java.lang.Object r1 = r1.zza(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lf0
            r1 = r23
            com.google.android.gms.internal.ads.zzdty r2 = r1.zzj
            android.os.Bundle r2 = r2.zza()
            com.google.android.gms.internal.ads.zzdtm r3 = com.google.android.gms.internal.ads.zzdtm.zzu
            java.lang.String r3 = r3.zza()
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzu.zzB()
            long r4 = r4.currentTimeMillis()
            r2.putLong(r3, r4)
            goto Lf2
        Lf0:
            r1 = r23
        Lf2:
            com.google.android.gms.internal.ads.zzdgj r2 = r0.zzg()
            com.google.android.gms.internal.ads.zzbko.zzb(r15, r2)
            com.google.android.gms.internal.ads.zzcys r2 = r0.zzc()
            com.google.android.gms.internal.ads.zzelc r3 = new com.google.android.gms.internal.ads.zzelc
            r3.<init>(r15)
            com.google.android.gms.internal.ads.zzgfz r4 = com.google.android.gms.internal.ads.zzcan.zzf
            r2.zzo(r3, r4)
            com.google.android.gms.internal.ads.zzdrd r2 = r0.zzl()
            boolean r3 = r1.zzh
            if (r3 == 0) goto L112
            com.google.android.gms.internal.ads.zzbjz r9 = r1.zzg
            goto L114
        L112:
            r9 = r20
        L114:
            com.google.android.gms.internal.ads.zzdty r3 = r1.zzj
            android.os.Bundle r3 = r3.zza()
            r4 = 1
            r2.zzi(r15, r4, r9, r3)
            r2 = r24
            com.google.android.gms.internal.ads.zzfgm r3 = r2.zzs
            java.lang.String r3 = r3.zza
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzeX
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L14d
            com.google.android.gms.internal.ads.zzegd r5 = r0.zzm()
            boolean r5 = r5.zze(r4)
            if (r5 == 0) goto L14d
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = 0
            java.lang.String r6 = com.google.android.gms.internal.ads.zzcgz.zza(r24)
            r4[r5] = r6
            java.lang.String r3 = com.google.android.gms.internal.ads.zzcgz.zzb(r3, r4)
        L14d:
            r0.zzl()
            com.google.android.gms.internal.ads.zzfgm r4 = r2.zzs
            java.lang.String r4 = r4.zzb
            com.google.android.gms.internal.ads.zzdty r5 = r1.zzj
            android.os.Bundle r5 = r5.zza()
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzdrd.zzj(r15, r4, r3, r5)
            com.google.android.gms.internal.ads.zzeld r4 = new com.google.android.gms.internal.ads.zzeld
            r4.<init>(r1, r15, r2, r0)
            java.util.concurrent.Executor r0 = r1.zze
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r3, r4, r0)
            return r0
    }
}
