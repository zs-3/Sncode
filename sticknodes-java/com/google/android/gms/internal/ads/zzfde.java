package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfde implements com.google.android.gms.internal.ads.zzfdy {
    private final com.google.android.gms.internal.ads.zzfdy zza;
    private final com.google.android.gms.internal.ads.zzfdy zzb;
    private final com.google.android.gms.internal.ads.zzfjm zzc;
    private final java.lang.String zzd;
    private com.google.android.gms.internal.ads.zzcxh zze;
    private final java.util.concurrent.Executor zzf;

    public zzfde(com.google.android.gms.internal.ads.zzfdy r1, com.google.android.gms.internal.ads.zzfdy r2, com.google.android.gms.internal.ads.zzfjm r3, java.lang.String r4, java.util.concurrent.Executor r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zzf = r5
            return
    }

    private final com.google.common.util.concurrent.ListenableFuture zzg(com.google.android.gms.internal.ads.zzfiz r3, com.google.android.gms.internal.ads.zzfdz r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcxh r0 = r3.zza
            r2.zze = r0
            com.google.android.gms.internal.ads.zzcte r1 = r3.zzc
            if (r1 == 0) goto L24
            com.google.android.gms.internal.ads.zzfdv r4 = r0.zzf()
            if (r4 == 0) goto L1d
            com.google.android.gms.internal.ads.zzcte r4 = r3.zzc
            com.google.android.gms.internal.ads.zzfdv r4 = r4.zzp()
            com.google.android.gms.internal.ads.zzcxh r0 = r3.zza
            com.google.android.gms.internal.ads.zzfdv r0 = r0.zzf()
            r4.zzl(r0)
        L1d:
            com.google.android.gms.internal.ads.zzcte r3 = r3.zzc
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzh(r3)
            return r3
        L24:
            com.google.android.gms.internal.ads.zzcum r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzfgt r1 = r3.zzb
            r0.zzl(r1)
            com.google.android.gms.internal.ads.zzfdy r0 = r2.zza
            com.google.android.gms.internal.ads.zzcxh r3 = r3.zza
            com.google.android.gms.internal.ads.zzfdo r0 = (com.google.android.gms.internal.ads.zzfdo) r0
            r1 = 0
            com.google.common.util.concurrent.ListenableFuture r3 = r0.zzb(r4, r1, r3)
            return r3
    }

    public final synchronized com.google.android.gms.internal.ads.zzcxh zza() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcxh r0 = r1.zze     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfdz r9, com.google.android.gms.internal.ads.zzfdd r10, com.google.android.gms.internal.ads.zzfdx r11, com.google.android.gms.internal.ads.zzcxh r12, com.google.android.gms.internal.ads.zzfdj r13) throws java.lang.Exception {
            r8 = this;
            if (r13 == 0) goto L4e
            com.google.android.gms.internal.ads.zzfdx r1 = r10.zza
            com.google.android.gms.internal.ads.zzfdz r2 = r10.zzb
            com.google.android.gms.ads.internal.client.zzm r3 = r10.zzc
            java.lang.String r4 = r10.zzd
            java.util.concurrent.Executor r5 = r10.zze
            com.google.android.gms.ads.internal.client.zzy r6 = r10.zzf
            com.google.android.gms.internal.ads.zzfja r7 = r13.zza
            com.google.android.gms.internal.ads.zzfdd r10 = new com.google.android.gms.internal.ads.zzfdd
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.google.android.gms.internal.ads.zzfiz r0 = r13.zzc
            r1 = 0
            if (r0 == 0) goto L29
            r8.zze = r1
            com.google.android.gms.internal.ads.zzfjm r11 = r8.zzc
            r11.zze(r10)
            com.google.android.gms.internal.ads.zzfiz r10 = r13.zzc
            com.google.common.util.concurrent.ListenableFuture r9 = r8.zzg(r10, r9)
            return r9
        L29:
            com.google.android.gms.internal.ads.zzfjm r0 = r8.zzc
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zza(r10)
            if (r0 == 0) goto L3f
            r8.zze = r1
            com.google.android.gms.internal.ads.zzfda r9 = new com.google.android.gms.internal.ads.zzfda
            r9.<init>(r8)
            java.util.concurrent.Executor r10 = r8.zzf
            com.google.common.util.concurrent.ListenableFuture r9 = com.google.android.gms.internal.ads.zzgfo.zzn(r0, r9, r10)
            return r9
        L3f:
            com.google.android.gms.internal.ads.zzfjm r0 = r8.zzc
            r0.zze(r10)
            com.google.android.gms.internal.ads.zzfdw r9 = r9.zzb
            com.google.android.gms.internal.ads.zzbwa r10 = r13.zzb
            com.google.android.gms.internal.ads.zzfdz r13 = new com.google.android.gms.internal.ads.zzfdz
            r13.<init>(r9, r10)
            r9 = r13
        L4e:
            com.google.android.gms.internal.ads.zzfdy r10 = r8.zza
            com.google.android.gms.internal.ads.zzfdo r10 = (com.google.android.gms.internal.ads.zzfdo) r10
            com.google.common.util.concurrent.ListenableFuture r9 = r10.zzb(r9, r11, r12)
            r8.zze = r12
            return r9
    }

    @Override // com.google.android.gms.internal.ads.zzfdy
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfdz r1, com.google.android.gms.internal.ads.zzfdx r2, java.lang.Object r3) {
            r0 = this;
            r3 = 0
            com.google.common.util.concurrent.ListenableFuture r1 = r0.zzf(r1, r2, r3)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzfdy
    public final /* bridge */ /* synthetic */ java.lang.Object zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcxh r0 = r1.zza()
            return r0
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zze(com.google.android.gms.internal.ads.zzfjj r5) throws java.lang.Exception {
            r4 = this;
            if (r5 == 0) goto L41
            com.google.android.gms.internal.ads.zzfiz r0 = r5.zza
            if (r0 == 0) goto L41
            com.google.android.gms.internal.ads.zzfjl r0 = r5.zzb
            if (r0 == 0) goto L41
            com.google.android.gms.internal.ads.zzfdd r0 = (com.google.android.gms.internal.ads.zzfdd) r0
            com.google.android.gms.internal.ads.zzbcb$zzb$zzc r1 = com.google.android.gms.internal.ads.zzbcb.zzb.zzd()
            com.google.android.gms.internal.ads.zzbcb$zzb$zza$zza r2 = com.google.android.gms.internal.ads.zzbcb.zzb.zza.zza()
            com.google.android.gms.internal.ads.zzbcb$zzb$zzd r3 = com.google.android.gms.internal.ads.zzbcb.zzb.zzd.zzb
            r2.zzf(r3)
            com.google.android.gms.internal.ads.zzbcb$zzb$zze r3 = com.google.android.gms.internal.ads.zzbcb.zzb.zze.zzi()
            r2.zzh(r3)
            r1.zzd(r2)
            com.google.android.gms.internal.ads.zzhbe r1 = r1.zzbn()
            com.google.android.gms.internal.ads.zzbcb$zzb r1 = (com.google.android.gms.internal.ads.zzbcb.zzb) r1
            com.google.android.gms.internal.ads.zzfiz r2 = r5.zza
            com.google.android.gms.internal.ads.zzcxh r2 = r2.zza
            com.google.android.gms.internal.ads.zzcum r2 = r2.zzb()
            com.google.android.gms.internal.ads.zzddi r2 = r2.zzc()
            r2.zzm(r1)
            com.google.android.gms.internal.ads.zzfiz r5 = r5.zza
            com.google.android.gms.internal.ads.zzfdz r0 = r0.zzb
            com.google.common.util.concurrent.ListenableFuture r5 = r4.zzg(r5, r0)
            return r5
        L41:
            com.google.android.gms.internal.ads.zzdye r5 = new com.google.android.gms.internal.ads.zzdye
            r0 = 1
            java.lang.String r1 = "Empty prefetch"
            r5.<init>(r0, r1)
            throw r5
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzf(com.google.android.gms.internal.ads.zzfdz r17, com.google.android.gms.internal.ads.zzfdx r18, com.google.android.gms.internal.ads.zzcxh r19) {
            r16 = this;
            r7 = r16
            r0 = r17
            r5 = r18
            monitor-enter(r16)
            com.google.android.gms.internal.ads.zzfdw r1 = r0.zzb     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzcxg r1 = r5.zza(r1)     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzfdf r2 = new com.google.android.gms.internal.ads.zzfdf     // Catch: java.lang.Throwable -> L78
            java.lang.String r3 = r7.zzd     // Catch: java.lang.Throwable -> L78
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L78
            r1.zza(r2)     // Catch: java.lang.Throwable -> L78
            java.lang.Object r1 = r1.zzh()     // Catch: java.lang.Throwable -> L78
            r6 = r1
            com.google.android.gms.internal.ads.zzcxh r6 = (com.google.android.gms.internal.ads.zzcxh) r6     // Catch: java.lang.Throwable -> L78
            r6.zzg()     // Catch: java.lang.Throwable -> L78
            r6.zzg()     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzfhc r1 = r6.zzg()     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.ads.internal.client.zzm r1 = r1.zzd     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.ads.internal.client.zzc r2 = r1.zzs     // Catch: java.lang.Throwable -> L78
            if (r2 != 0) goto L6c
            java.lang.String r1 = r1.zzx     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L33
            goto L6c
        L33:
            com.google.android.gms.internal.ads.zzfhc r1 = r6.zzg()     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.ads.internal.client.zzm r11 = r1.zzd     // Catch: java.lang.Throwable -> L78
            java.lang.String r12 = r1.zzf     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.ads.internal.client.zzy r14 = r1.zzj     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.Executor r13 = r7.zzf     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzfdd r4 = new com.google.android.gms.internal.ads.zzfdd     // Catch: java.lang.Throwable -> L78
            r15 = 0
            r8 = r4
            r9 = r18
            r10 = r17
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzfdy r1 = r7.zzb     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzfdk r1 = (com.google.android.gms.internal.ads.zzfdk) r1     // Catch: java.lang.Throwable -> L78
            com.google.common.util.concurrent.ListenableFuture r1 = r1.zzb(r0, r5, r6)     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzgff r8 = com.google.android.gms.internal.ads.zzgff.zzu(r1)     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzfdb r9 = new com.google.android.gms.internal.ads.zzfdb     // Catch: java.lang.Throwable -> L78
            r1 = r9
            r2 = r16
            r3 = r17
            r5 = r18
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.Executor r0 = r7.zzf     // Catch: java.lang.Throwable -> L78
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzn(r8, r9, r0)     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzgff r0 = (com.google.android.gms.internal.ads.zzgff) r0     // Catch: java.lang.Throwable -> L78
            monitor-exit(r16)
            return r0
        L6c:
            r7.zze = r6     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzfdy r1 = r7.zza     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzfdo r1 = (com.google.android.gms.internal.ads.zzfdo) r1     // Catch: java.lang.Throwable -> L78
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0, r5, r6)     // Catch: java.lang.Throwable -> L78
            monitor-exit(r16)
            return r0
        L78:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
    }
}
