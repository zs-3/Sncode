package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzegv implements com.google.android.gms.internal.ads.zzegk {
    private final com.google.android.gms.internal.ads.zzcqf zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzdre zzc;
    private final com.google.android.gms.internal.ads.zzfhc zzd;
    private final java.util.concurrent.Executor zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private final com.google.android.gms.internal.ads.zzbjz zzg;
    private final boolean zzh;
    private final com.google.android.gms.internal.ads.zzefj zzi;
    private final com.google.android.gms.internal.ads.zzdty zzj;

    public zzegv(com.google.android.gms.internal.ads.zzcqf r1, android.content.Context r2, java.util.concurrent.Executor r3, com.google.android.gms.internal.ads.zzdre r4, com.google.android.gms.internal.ads.zzfhc r5, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6, com.google.android.gms.internal.ads.zzbjz r7, com.google.android.gms.internal.ads.zzefj r8, com.google.android.gms.internal.ads.zzdty r9) {
            r0 = this;
            r0.<init>()
            r0.zzb = r2
            r0.zza = r1
            r0.zze = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zzf = r6
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
            com.google.android.gms.internal.ads.zzegr r2 = new com.google.android.gms.internal.ads.zzegr
            r2.<init>(r3, r5, r4, r0)
            java.util.concurrent.Executor r4 = r3.zze
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzn(r1, r2, r4)
            com.google.android.gms.internal.ads.zzegs r5 = new com.google.android.gms.internal.ads.zzegs
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

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfgh r19, com.google.android.gms.internal.ads.zzfgt r20, com.google.android.gms.internal.ads.zzdri r21, java.lang.Object r22) throws java.lang.Exception {
            r18 = this;
            r0 = r18
            r10 = r19
            r1 = r20
            com.google.android.gms.internal.ads.zzbcm r11 = com.google.android.gms.internal.ads.zzbcv.zzch
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r2.zza(r11)
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
            com.google.android.gms.internal.ads.zzdre r2 = r0.zzc
            com.google.android.gms.internal.ads.zzfhc r3 = r0.zzd
            com.google.android.gms.internal.ads.zzfgs r4 = r1.zzb
            com.google.android.gms.internal.ads.zzfgk r4 = r4.zzb
            com.google.android.gms.ads.internal.client.zzs r3 = r3.zze
            com.google.android.gms.internal.ads.zzcfo r12 = r2.zza(r3, r10, r4)
            boolean r2 = r10.zzW
            r12.zzac(r2)
            android.content.Context r2 = r0.zzb
            android.view.View r3 = r12.zzF()
            r4 = r21
            r4.zza(r2, r3)
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r2.zza(r11)
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
            com.google.android.gms.internal.ads.zzcas r13 = new com.google.android.gms.internal.ads.zzcas
            r13.<init>()
            com.google.android.gms.internal.ads.zzcqf r14 = r0.zza
            com.google.android.gms.internal.ads.zzctu r15 = new com.google.android.gms.internal.ads.zzctu
            r9 = 0
            r15.<init>(r1, r10, r9)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r0.zzf
            com.google.android.gms.internal.ads.zzfhc r6 = r0.zzd
            boolean r7 = r0.zzh
            com.google.android.gms.internal.ads.zzbjz r8 = r0.zzg
            com.google.android.gms.internal.ads.zzefj r5 = r0.zzi
            com.google.android.gms.internal.ads.zzdhc r4 = new com.google.android.gms.internal.ads.zzdhc
            com.google.android.gms.internal.ads.zzegx r3 = new com.google.android.gms.internal.ads.zzegx
            r1 = r3
            r0 = r3
            r3 = r13
            r21 = r13
            r13 = r4
            r4 = r19
            r16 = r5
            r5 = r12
            r17 = r9
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r13.<init>(r0, r12)
            com.google.android.gms.internal.ads.zzcqd r0 = new com.google.android.gms.internal.ads.zzcqd
            int r1 = r10.zzaa
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzcqc r0 = r14.zza(r15, r13, r0)
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r1.zza(r11)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Ld9
            r1 = r18
            com.google.android.gms.internal.ads.zzdty r2 = r1.zzj
            android.os.Bundle r2 = r2.zza()
            com.google.android.gms.internal.ads.zzdtm r3 = com.google.android.gms.internal.ads.zzdtm.zzu
            java.lang.String r3 = r3.zza()
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzu.zzB()
            long r4 = r4.currentTimeMillis()
            r2.putLong(r3, r4)
            goto Ldb
        Ld9:
            r1 = r18
        Ldb:
            com.google.android.gms.internal.ads.zzdrd r2 = r0.zzh()
            boolean r3 = r1.zzh
            if (r3 == 0) goto Le6
            com.google.android.gms.internal.ads.zzbjz r9 = r1.zzg
            goto Le8
        Le6:
            r9 = r17
        Le8:
            com.google.android.gms.internal.ads.zzdty r3 = r1.zzj
            android.os.Bundle r3 = r3.zza()
            r4 = 0
            r2.zzi(r12, r4, r9, r3)
            r2 = r21
            r2.zzc(r0)
            com.google.android.gms.internal.ads.zzcys r2 = r0.zzc()
            com.google.android.gms.internal.ads.zzegt r3 = new com.google.android.gms.internal.ads.zzegt
            r3.<init>(r12)
            com.google.android.gms.internal.ads.zzgfz r5 = com.google.android.gms.internal.ads.zzcan.zzf
            r2.zzo(r3, r5)
            com.google.android.gms.internal.ads.zzfgm r2 = r10.zzs
            java.lang.String r2 = r2.zza
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzeX
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r5.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L132
            com.google.android.gms.internal.ads.zzegd r3 = r0.zzi()
            r5 = 1
            boolean r3 = r3.zze(r5)
            if (r3 == 0) goto L132
            java.lang.String[] r3 = new java.lang.String[r5]
            java.lang.String r5 = com.google.android.gms.internal.ads.zzcgz.zza(r19)
            r3[r4] = r5
            java.lang.String r2 = com.google.android.gms.internal.ads.zzcgz.zzb(r2, r3)
        L132:
            r0.zzh()
            com.google.android.gms.internal.ads.zzfgm r3 = r10.zzs
            java.lang.String r3 = r3.zzb
            com.google.android.gms.internal.ads.zzdty r4 = r1.zzj
            android.os.Bundle r4 = r4.zza()
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzdrd.zzj(r12, r3, r2, r4)
            com.google.android.gms.internal.ads.zzegu r3 = new com.google.android.gms.internal.ads.zzegu
            r3.<init>(r1, r12, r10, r0)
            java.util.concurrent.Executor r0 = r1.zze
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r2, r3, r0)
            return r0
    }
}
