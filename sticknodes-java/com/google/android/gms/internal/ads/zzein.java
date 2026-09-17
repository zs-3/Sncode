package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzein implements com.google.android.gms.internal.ads.zzegk {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdre zzb;
    private final com.google.android.gms.internal.ads.zzdic zzc;
    private final com.google.android.gms.internal.ads.zzfhc zzd;
    private final java.util.concurrent.Executor zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private final com.google.android.gms.internal.ads.zzbjz zzg;
    private final boolean zzh;
    private final com.google.android.gms.internal.ads.zzefj zzi;
    private final com.google.android.gms.internal.ads.zzdty zzj;

    public zzein(android.content.Context r1, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2, com.google.android.gms.internal.ads.zzfhc r3, java.util.concurrent.Executor r4, com.google.android.gms.internal.ads.zzdic r5, com.google.android.gms.internal.ads.zzdre r6, com.google.android.gms.internal.ads.zzbjz r7, com.google.android.gms.internal.ads.zzefj r8, com.google.android.gms.internal.ads.zzdty r9) {
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
            com.google.android.gms.internal.ads.zzeik r2 = new com.google.android.gms.internal.ads.zzeik
            r2.<init>(r3, r5, r4, r0)
            java.util.concurrent.Executor r4 = r3.zze
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzn(r1, r2, r4)
            com.google.android.gms.internal.ads.zzeil r5 = new com.google.android.gms.internal.ads.zzeil
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

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfgh r20, com.google.android.gms.internal.ads.zzfgt r21, com.google.android.gms.internal.ads.zzdri r22, java.lang.Object r23) throws java.lang.Exception {
            r19 = this;
            r0 = r19
            r11 = r20
            r1 = r21
            com.google.android.gms.internal.ads.zzbcm r12 = com.google.android.gms.internal.ads.zzbcv.zzch
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r2.zza(r12)
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
            com.google.android.gms.internal.ads.zzcfo r13 = r2.zza(r3, r11, r4)
            boolean r2 = r11.zzW
            r13.zzac(r2)
            android.content.Context r2 = r0.zza
            android.view.View r3 = r13.zzF()
            r4 = r22
            r4.zza(r2, r3)
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r2.zza(r12)
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
            com.google.android.gms.internal.ads.zzcas r14 = new com.google.android.gms.internal.ads.zzcas
            r14.<init>()
            com.google.android.gms.internal.ads.zzdic r15 = r0.zzc
            com.google.android.gms.internal.ads.zzctu r10 = new com.google.android.gms.internal.ads.zzctu
            r9 = 0
            r10.<init>(r1, r11, r9)
            android.content.Context r2 = r0.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r0.zzf
            com.google.android.gms.internal.ads.zzfhc r7 = r0.zzd
            boolean r8 = r0.zzh
            com.google.android.gms.internal.ads.zzbjz r6 = r0.zzg
            com.google.android.gms.internal.ads.zzefj r5 = r0.zzi
            com.google.android.gms.internal.ads.zzdhc r4 = new com.google.android.gms.internal.ads.zzdhc
            com.google.android.gms.internal.ads.zzeim r1 = new com.google.android.gms.internal.ads.zzeim
            r21 = r1
            r11 = r4
            r4 = r14
            r16 = r5
            r5 = r20
            r17 = r6
            r6 = r13
            r18 = r9
            r9 = r17
            r0 = r10
            r10 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.<init>(r1, r13)
            com.google.android.gms.internal.ads.zzdgz r0 = r15.zze(r0, r11)
            r14.zzc(r0)
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r1.zza(r12)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lda
            r1 = r19
            com.google.android.gms.internal.ads.zzdty r2 = r1.zzj
            android.os.Bundle r2 = r2.zza()
            com.google.android.gms.internal.ads.zzdtm r3 = com.google.android.gms.internal.ads.zzdtm.zzu
            java.lang.String r3 = r3.zza()
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzu.zzB()
            long r4 = r4.currentTimeMillis()
            r2.putLong(r3, r4)
            goto Ldc
        Lda:
            r1 = r19
        Ldc:
            com.google.android.gms.internal.ads.zzcys r2 = r0.zzc()
            com.google.android.gms.internal.ads.zzeii r3 = new com.google.android.gms.internal.ads.zzeii
            r3.<init>(r13)
            com.google.android.gms.internal.ads.zzgfz r4 = com.google.android.gms.internal.ads.zzcan.zzf
            r2.zzo(r3, r4)
            r2 = r20
            com.google.android.gms.internal.ads.zzfgm r3 = r2.zzs
            java.lang.String r3 = r3.zza
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzeX
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 1
            if (r4 == 0) goto L11a
            com.google.android.gms.internal.ads.zzegd r4 = r0.zzl()
            boolean r4 = r4.zze(r5)
            if (r4 == 0) goto L11a
            java.lang.String[] r4 = new java.lang.String[r5]
            r6 = 0
            java.lang.String r7 = com.google.android.gms.internal.ads.zzcgz.zza(r20)
            r4[r6] = r7
            java.lang.String r3 = com.google.android.gms.internal.ads.zzcgz.zzb(r3, r4)
        L11a:
            com.google.android.gms.internal.ads.zzdrd r4 = r0.zzi()
            boolean r6 = r1.zzh
            if (r6 == 0) goto L125
            com.google.android.gms.internal.ads.zzbjz r9 = r1.zzg
            goto L127
        L125:
            r9 = r18
        L127:
            com.google.android.gms.internal.ads.zzdty r6 = r1.zzj
            android.os.Bundle r6 = r6.zza()
            r4.zzi(r13, r5, r9, r6)
            r0.zzi()
            com.google.android.gms.internal.ads.zzfgm r4 = r2.zzs
            java.lang.String r4 = r4.zzb
            com.google.android.gms.internal.ads.zzdty r5 = r1.zzj
            android.os.Bundle r5 = r5.zza()
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzdrd.zzj(r13, r4, r3, r5)
            com.google.android.gms.internal.ads.zzeij r4 = new com.google.android.gms.internal.ads.zzeij
            r4.<init>(r1, r13, r2, r0)
            java.util.concurrent.Executor r0 = r1.zze
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r3, r4, r0)
            return r0
    }
}
