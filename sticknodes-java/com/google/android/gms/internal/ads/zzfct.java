package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfct implements com.google.android.gms.internal.ads.zzeor {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzcho zzc;
    private final com.google.android.gms.internal.ads.zzeob zzd;
    private final com.google.android.gms.internal.ads.zzeof zze;
    private final android.view.ViewGroup zzf;
    private com.google.android.gms.internal.ads.zzbdq zzg;
    private final com.google.android.gms.internal.ads.zzdat zzh;
    private final com.google.android.gms.internal.ads.zzfmd zzi;
    private final com.google.android.gms.internal.ads.zzdcz zzj;
    private final com.google.android.gms.internal.ads.zzfha zzk;
    private com.google.common.util.concurrent.ListenableFuture zzl;
    private boolean zzm;
    private com.google.android.gms.ads.internal.client.zze zzn;
    private com.google.android.gms.internal.ads.zzeoq zzo;

    public zzfct(android.content.Context r1, java.util.concurrent.Executor r2, com.google.android.gms.ads.internal.client.zzs r3, com.google.android.gms.internal.ads.zzcho r4, com.google.android.gms.internal.ads.zzeob r5, com.google.android.gms.internal.ads.zzeof r6, com.google.android.gms.internal.ads.zzfha r7, com.google.android.gms.internal.ads.zzdcz r8) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r6
            r0.zzk = r7
            com.google.android.gms.internal.ads.zzdat r2 = r4.zzf()
            r0.zzh = r2
            com.google.android.gms.internal.ads.zzfmd r2 = r4.zzz()
            r0.zzi = r2
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r1)
            r0.zzf = r2
            r0.zzj = r8
            r7.zzs(r3)
            r1 = 1
            r0.zzm = r1
            r1 = 0
            r0.zzn = r1
            r0.zzo = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zze zzd(com.google.android.gms.internal.ads.zzfct r0) {
            com.google.android.gms.ads.internal.client.zze r0 = r0.zzn
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdat zze(com.google.android.gms.internal.ads.zzfct r0) {
            com.google.android.gms.internal.ads.zzdat r0 = r0.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdcz zzf(com.google.android.gms.internal.ads.zzfct r0) {
            com.google.android.gms.internal.ads.zzdcz r0 = r0.zzj
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfmd zzh(com.google.android.gms.internal.ads.zzfct r0) {
            com.google.android.gms.internal.ads.zzfmd r0 = r0.zzi
            return r0
    }

    static /* bridge */ /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzfct r0, com.google.android.gms.ads.internal.client.zze r1) {
            r0.zzn = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzfct r0) {
            r0.zzu()
            return
    }

    static /* bridge */ /* synthetic */ boolean zzs(com.google.android.gms.internal.ads.zzfct r0) {
            boolean r0 = r0.zzm
            return r0
    }

    private final void zzu() {
            r2 = this;
            r0 = 0
            r2.zzl = r0
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhM
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1f
            java.util.concurrent.Executor r0 = r2.zzb
            com.google.android.gms.internal.ads.zzfcp r1 = new com.google.android.gms.internal.ads.zzfcp
            r1.<init>(r2)
            r0.execute(r1)
        L1f:
            com.google.android.gms.internal.ads.zzeoq r0 = r2.zzo
            if (r0 == 0) goto L26
            r0.zza()
        L26:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzeor
    public final boolean zza() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzl
            if (r0 == 0) goto Lc
            boolean r0 = r0.isDone()
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzeor
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm r7, java.lang.String r8, com.google.android.gms.internal.ads.zzeop r9, com.google.android.gms.internal.ads.zzeoq r10) throws android.os.RemoteException {
            r6 = this;
            r9 = 0
            if (r8 != 0) goto L13
            java.lang.String r7 = "Ad unit ID should not be null for banner ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r7)
            java.util.concurrent.Executor r7 = r6.zzb
            com.google.android.gms.internal.ads.zzfcr r8 = new com.google.android.gms.internal.ads.zzfcr
            r8.<init>(r6)
            r7.execute(r8)
            return r9
        L13:
            boolean r0 = r6.zza()
            r1 = 1
            if (r0 == 0) goto L26
            com.google.android.gms.internal.ads.zzfha r7 = r6.zzk
            boolean r7 = r7.zzS()
            if (r7 != 0) goto Lb7
            r6.zzm = r1
            goto Lb7
        L26:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzix
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L45
            boolean r0 = r7.zzf
            if (r0 == 0) goto L45
            com.google.android.gms.internal.ads.zzcho r0 = r6.zzc
            com.google.android.gms.internal.ads.zzdxb r0 = r0.zzl()
            r0.zzo(r1)
        L45:
            r0 = 2
            android.util.Pair[] r0 = new android.util.Pair[r0]
            android.util.Pair r2 = new android.util.Pair
            com.google.android.gms.internal.ads.zzdtm r3 = com.google.android.gms.internal.ads.zzdtm.zza
            java.lang.String r3 = r3.zza()
            long r4 = r7.zzz
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.<init>(r3, r4)
            r0[r9] = r2
            android.util.Pair r2 = new android.util.Pair
            com.google.android.gms.internal.ads.zzdtm r3 = com.google.android.gms.internal.ads.zzdtm.zzb
            java.lang.String r3 = r3.zza()
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzu.zzB()
            long r4 = r4.currentTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.<init>(r3, r4)
            r0[r1] = r2
            android.os.Bundle r0 = com.google.android.gms.internal.ads.zzdto.zza(r0)
            com.google.android.gms.internal.ads.zzfha r2 = r6.zzk
            r2.zzt(r8)
            r2.zzH(r7)
            r2.zzA(r0)
            android.content.Context r8 = r6.zza
            com.google.android.gms.internal.ads.zzfhc r0 = r2.zzJ()
            int r2 = com.google.android.gms.internal.ads.zzflz.zzf(r0)
            r3 = 3
            com.google.android.gms.internal.ads.zzflp r8 = com.google.android.gms.internal.ads.zzflo.zzb(r8, r2, r3, r7)
            com.google.android.gms.internal.ads.zzbeb r2 = com.google.android.gms.internal.ads.zzbex.zze
            java.lang.Object r2 = r2.zze()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r4 = 0
            if (r2 == 0) goto Lb8
            com.google.android.gms.internal.ads.zzfha r2 = r6.zzk
            com.google.android.gms.ads.internal.client.zzs r2 = r2.zzh()
            boolean r2 = r2.zzk
            if (r2 == 0) goto Lb8
            com.google.android.gms.internal.ads.zzeob r7 = r6.zzd
            if (r7 == 0) goto Lb7
            r8 = 7
            com.google.android.gms.ads.internal.client.zze r8 = com.google.android.gms.internal.ads.zzfie.zzd(r8, r4, r4)
            r7.zzdB(r8)
        Lb7:
            return r9
        Lb8:
            com.google.android.gms.internal.ads.zzbcm r9 = com.google.android.gms.internal.ads.zzbcv.zzhM
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r9 = r2.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L12e
            com.google.android.gms.internal.ads.zzcho r9 = r6.zzc
            com.google.android.gms.internal.ads.zzcru r9 = r9.zze()
            com.google.android.gms.internal.ads.zzcxi r2 = new com.google.android.gms.internal.ads.zzcxi
            r2.<init>()
            android.content.Context r5 = r6.zza
            r2.zze(r5)
            r2.zzi(r0)
            com.google.android.gms.internal.ads.zzcxk r0 = r2.zzj()
            r9.zzi(r0)
            com.google.android.gms.internal.ads.zzdds r0 = new com.google.android.gms.internal.ads.zzdds
            r0.<init>()
            com.google.android.gms.internal.ads.zzeob r2 = r6.zzd
            java.util.concurrent.Executor r5 = r6.zzb
            r0.zzj(r2, r5)
            com.google.android.gms.internal.ads.zzeob r2 = r6.zzd
            java.util.concurrent.Executor r5 = r6.zzb
            r0.zzk(r2, r5)
            com.google.android.gms.internal.ads.zzddu r0 = r0.zzn()
            r9.zzf(r0)
            com.google.android.gms.internal.ads.zzemk r0 = new com.google.android.gms.internal.ads.zzemk
            com.google.android.gms.internal.ads.zzbdq r2 = r6.zzg
            r0.<init>(r2)
            r9.zze(r0)
            com.google.android.gms.internal.ads.zzdit r0 = new com.google.android.gms.internal.ads.zzdit
            com.google.android.gms.internal.ads.zzdla r2 = com.google.android.gms.internal.ads.zzdla.zza
            r0.<init>(r2, r4)
            r9.zzd(r0)
            com.google.android.gms.internal.ads.zzdat r0 = r6.zzh
            com.google.android.gms.internal.ads.zzdcz r2 = r6.zzj
            com.google.android.gms.internal.ads.zzcsw r5 = new com.google.android.gms.internal.ads.zzcsw
            r5.<init>(r0, r2)
            r9.zzg(r5)
            android.view.ViewGroup r0 = r6.zzf
            com.google.android.gms.internal.ads.zzcqo r2 = new com.google.android.gms.internal.ads.zzcqo
            r2.<init>(r0)
            r9.zzc(r2)
            com.google.android.gms.internal.ads.zzcrv r9 = r9.zzk()
            goto L1c8
        L12e:
            com.google.android.gms.internal.ads.zzcho r9 = r6.zzc
            com.google.android.gms.internal.ads.zzcru r9 = r9.zze()
            com.google.android.gms.internal.ads.zzcxi r2 = new com.google.android.gms.internal.ads.zzcxi
            r2.<init>()
            android.content.Context r5 = r6.zza
            r2.zze(r5)
            r2.zzi(r0)
            com.google.android.gms.internal.ads.zzcxk r0 = r2.zzj()
            r9.zzi(r0)
            com.google.android.gms.internal.ads.zzdds r0 = new com.google.android.gms.internal.ads.zzdds
            r0.<init>()
            com.google.android.gms.internal.ads.zzeob r2 = r6.zzd
            java.util.concurrent.Executor r5 = r6.zzb
            r0.zzj(r2, r5)
            com.google.android.gms.internal.ads.zzeob r2 = r6.zzd
            java.util.concurrent.Executor r5 = r6.zzb
            r0.zza(r2, r5)
            com.google.android.gms.internal.ads.zzeof r2 = r6.zze
            java.util.concurrent.Executor r5 = r6.zzb
            r0.zza(r2, r5)
            com.google.android.gms.internal.ads.zzeob r2 = r6.zzd
            java.util.concurrent.Executor r5 = r6.zzb
            r0.zzl(r2, r5)
            com.google.android.gms.internal.ads.zzeob r2 = r6.zzd
            java.util.concurrent.Executor r5 = r6.zzb
            r0.zzd(r2, r5)
            com.google.android.gms.internal.ads.zzeob r2 = r6.zzd
            java.util.concurrent.Executor r5 = r6.zzb
            r0.zze(r2, r5)
            com.google.android.gms.internal.ads.zzeob r2 = r6.zzd
            java.util.concurrent.Executor r5 = r6.zzb
            r0.zzf(r2, r5)
            com.google.android.gms.internal.ads.zzeob r2 = r6.zzd
            java.util.concurrent.Executor r5 = r6.zzb
            r0.zzb(r2, r5)
            com.google.android.gms.internal.ads.zzeob r2 = r6.zzd
            java.util.concurrent.Executor r5 = r6.zzb
            r0.zzk(r2, r5)
            com.google.android.gms.internal.ads.zzeob r2 = r6.zzd
            java.util.concurrent.Executor r5 = r6.zzb
            r0.zzi(r2, r5)
            com.google.android.gms.internal.ads.zzddu r0 = r0.zzn()
            r9.zzf(r0)
            com.google.android.gms.internal.ads.zzemk r0 = new com.google.android.gms.internal.ads.zzemk
            com.google.android.gms.internal.ads.zzbdq r2 = r6.zzg
            r0.<init>(r2)
            r9.zze(r0)
            com.google.android.gms.internal.ads.zzdit r0 = new com.google.android.gms.internal.ads.zzdit
            com.google.android.gms.internal.ads.zzdla r2 = com.google.android.gms.internal.ads.zzdla.zza
            r0.<init>(r2, r4)
            r9.zzd(r0)
            com.google.android.gms.internal.ads.zzdat r0 = r6.zzh
            com.google.android.gms.internal.ads.zzdcz r2 = r6.zzj
            com.google.android.gms.internal.ads.zzcsw r5 = new com.google.android.gms.internal.ads.zzcsw
            r5.<init>(r0, r2)
            r9.zzg(r5)
            android.view.ViewGroup r0 = r6.zzf
            com.google.android.gms.internal.ads.zzcqo r2 = new com.google.android.gms.internal.ads.zzcqo
            r2.<init>(r0)
            r9.zzc(r2)
            com.google.android.gms.internal.ads.zzcrv r9 = r9.zzk()
        L1c8:
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzc
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1e7
            com.google.android.gms.internal.ads.zzfma r4 = r9.zzj()
            r4.zzi(r3)
            java.lang.String r0 = r7.zzp
            r4.zzb(r0)
            android.os.Bundle r7 = r7.zzm
            r4.zzf(r7)
        L1e7:
            r6.zzo = r10
            com.google.android.gms.internal.ads.zzcum r7 = r9.zzd()
            com.google.common.util.concurrent.ListenableFuture r10 = r7.zzj()
            com.google.common.util.concurrent.ListenableFuture r7 = r7.zzi(r10)
            r6.zzl = r7
            com.google.android.gms.internal.ads.zzfcs r10 = new com.google.android.gms.internal.ads.zzfcs
            r10.<init>(r6, r4, r8, r9)
            java.util.concurrent.Executor r8 = r6.zzb
            com.google.android.gms.internal.ads.zzgfo.zzr(r7, r10, r8)
            return r1
    }

    public final android.view.ViewGroup zzc() {
            r1 = this;
            android.view.ViewGroup r0 = r1.zzf
            return r0
    }

    public final com.google.android.gms.internal.ads.zzfha zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfha r0 = r1.zzk
            return r0
    }

    final /* synthetic */ void zzk() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r2.zzd
            com.google.android.gms.ads.internal.client.zze r1 = r2.zzn
            r0.zzdB(r1)
            return
    }

    final /* synthetic */ void zzl() {
            r3 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r3.zzd
            r1 = 6
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r1 = com.google.android.gms.internal.ads.zzfie.zzd(r1, r2, r2)
            r0.zzdB(r1)
            return
    }

    public final void zzm() {
            r2 = this;
            com.google.android.gms.internal.ads.zzdcz r0 = r2.zzj
            com.google.android.gms.internal.ads.zzdat r1 = r2.zzh
            int r0 = r0.zzc()
            r1.zzd(r0)
            return
    }

    public final void zzn() {
            r2 = this;
            com.google.android.gms.internal.ads.zzdcz r0 = r2.zzj
            com.google.android.gms.internal.ads.zzdat r1 = r2.zzh
            int r0 = r0.zzd()
            r1.zze(r0)
            return
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzbi r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzeof r0 = r1.zze
            r0.zza(r2)
            return
    }

    public final void zzp(com.google.android.gms.internal.ads.zzdam r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.zzb
            com.google.android.gms.internal.ads.zzdat r1 = r2.zzh
            r1.zzo(r3, r0)
            return
    }

    public final void zzq(com.google.android.gms.internal.ads.zzbdq r1) {
            r0 = this;
            r0.zzg = r1
            return
    }

    public final void zzr() {
            r6 = this;
            monitor-enter(r6)
            com.google.common.util.concurrent.ListenableFuture r0 = r6.zzl     // Catch: java.lang.Throwable -> L102
            r1 = 1
            if (r0 == 0) goto Le8
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L102
            if (r0 == 0) goto Le8
            com.google.common.util.concurrent.ListenableFuture r0 = r6.zzl     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            java.lang.Object r0 = r0.get()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            com.google.android.gms.internal.ads.zzcqr r0 = (com.google.android.gms.internal.ads.zzcqr) r0     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            r2 = 0
            r6.zzl = r2     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            android.view.ViewGroup r2 = r6.zzf     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            r2.removeAllViews()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            android.view.View r2 = r0.zzd()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            if (r2 == 0) goto L60
            android.view.View r2 = r0.zzd()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            android.view.ViewParent r2 = r2.getParent()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            boolean r3 = r2 instanceof android.view.ViewGroup     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            if (r3 == 0) goto L60
            java.lang.String r3 = ""
            com.google.android.gms.internal.ads.zzcxt r4 = r0.zzm()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            if (r4 == 0) goto L3e
            com.google.android.gms.internal.ads.zzcxt r3 = r0.zzm()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            java.lang.String r3 = r3.zzg()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
        L3e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            r4.<init>()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            java.lang.String r5 = "Banner view provided from "
            r4.append(r5)     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            r4.append(r3)     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            java.lang.String r3 = " already has a parent view. Removing its old parent."
            r4.append(r3)     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            java.lang.String r3 = r4.toString()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            android.view.View r3 = r0.zzd()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            r2.removeView(r3)     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
        L60:
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzhM     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            java.lang.Object r3 = r3.zza(r2)     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            boolean r3 = r3.booleanValue()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            if (r3 == 0) goto L80
            com.google.android.gms.internal.ads.zzdci r3 = r0.zzo()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            com.google.android.gms.internal.ads.zzeob r4 = r6.zzd     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            r3.zza(r4)     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            com.google.android.gms.internal.ads.zzeof r4 = r6.zze     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            r3.zzc(r4)     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
        L80:
            android.view.ViewGroup r3 = r6.zzf     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            android.view.View r4 = r0.zzd()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            r3.addView(r4)     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            com.google.android.gms.internal.ads.zzeoq r3 = r6.zzo     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            r3.zzb(r0)     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            boolean r2 = r2.booleanValue()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            if (r2 == 0) goto Lad
            java.util.concurrent.Executor r2 = r6.zzb     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            com.google.android.gms.internal.ads.zzeob r3 = r6.zzd     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            com.google.android.gms.internal.ads.zzfcq r4 = new com.google.android.gms.internal.ads.zzfcq     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            r4.<init>(r3)     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            r2.execute(r4)     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
        Lad:
            int r2 = r0.zza()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            if (r2 < 0) goto Lc9
            r2 = 0
            r6.zzm = r2     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            com.google.android.gms.internal.ads.zzdat r2 = r6.zzh     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            int r3 = r0.zza()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            r2.zzd(r3)     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            com.google.android.gms.internal.ads.zzdat r2 = r6.zzh     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            int r0 = r0.zzc()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            r2.zze(r0)     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            goto L100
        Lc9:
            r6.zzm = r1     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            com.google.android.gms.internal.ads.zzdat r2 = r6.zzh     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            int r0 = r0.zzc()     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            r2.zzd(r0)     // Catch: java.lang.InterruptedException -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.lang.Throwable -> L102
            goto L100
        Ld5:
            r0 = move-exception
            goto Ld8
        Ld7:
            r0 = move-exception
        Ld8:
            r6.zzu()     // Catch: java.lang.Throwable -> L102
            java.lang.String r2 = "Error occurred while refreshing the ad. Making a new ad request."
            com.google.android.gms.ads.internal.util.zze.zzb(r2, r0)     // Catch: java.lang.Throwable -> L102
            r6.zzm = r1     // Catch: java.lang.Throwable -> L102
            com.google.android.gms.internal.ads.zzdat r0 = r6.zzh     // Catch: java.lang.Throwable -> L102
            r0.zza()     // Catch: java.lang.Throwable -> L102
            goto L100
        Le8:
            com.google.common.util.concurrent.ListenableFuture r0 = r6.zzl     // Catch: java.lang.Throwable -> L102
            if (r0 == 0) goto Lf4
            java.lang.String r0 = "Show timer went off but there is an ongoing ad request."
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L102
            r6.zzm = r1     // Catch: java.lang.Throwable -> L102
            goto L100
        Lf4:
            java.lang.String r0 = "No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad."
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L102
            r6.zzm = r1     // Catch: java.lang.Throwable -> L102
            com.google.android.gms.internal.ads.zzdat r0 = r6.zzh     // Catch: java.lang.Throwable -> L102
            r0.zza()     // Catch: java.lang.Throwable -> L102
        L100:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L102
            return
        L102:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L102
            throw r0
    }

    public final boolean zzt() {
            r2 = this;
            android.view.ViewGroup r0 = r2.zzf
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            android.view.View r0 = (android.view.View) r0
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r1 = r0.getContext()
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzW(r0, r1)
            return r0
    }
}
