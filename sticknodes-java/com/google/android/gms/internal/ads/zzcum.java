package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcum {
    private final com.google.android.gms.internal.ads.zzdzl zza;
    private final com.google.android.gms.internal.ads.zzfhc zzb;
    private final com.google.android.gms.internal.ads.zzflg zzc;
    private final com.google.android.gms.internal.ads.zzcnd zzd;
    private final com.google.android.gms.internal.ads.zzekl zze;
    private final com.google.android.gms.internal.ads.zzddi zzf;
    private com.google.android.gms.internal.ads.zzfgt zzg;
    private final com.google.android.gms.internal.ads.zzeat zzh;
    private final com.google.android.gms.internal.ads.zzcxe zzi;
    private final java.util.concurrent.Executor zzj;
    private final com.google.android.gms.internal.ads.zzead zzk;
    private final com.google.android.gms.internal.ads.zzegp zzl;
    private final com.google.android.gms.internal.ads.zzebj zzm;
    private final com.google.android.gms.internal.ads.zzebq zzn;

    zzcum(com.google.android.gms.internal.ads.zzdzl r1, com.google.android.gms.internal.ads.zzfhc r2, com.google.android.gms.internal.ads.zzflg r3, com.google.android.gms.internal.ads.zzcnd r4, com.google.android.gms.internal.ads.zzekl r5, com.google.android.gms.internal.ads.zzddi r6, com.google.android.gms.internal.ads.zzfgt r7, com.google.android.gms.internal.ads.zzeat r8, com.google.android.gms.internal.ads.zzcxe r9, java.util.concurrent.Executor r10, com.google.android.gms.internal.ads.zzead r11, com.google.android.gms.internal.ads.zzegp r12, com.google.android.gms.internal.ads.zzebj r13, com.google.android.gms.internal.ads.zzebq r14) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            r0.zzi = r9
            r0.zzj = r10
            r0.zzk = r11
            r0.zzl = r12
            r0.zzm = r13
            r0.zzn = r14
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzddi zzb(com.google.android.gms.internal.ads.zzcum r0) {
            com.google.android.gms.internal.ads.zzddi r0 = r0.zzf
            return r0
    }

    public final com.google.android.gms.ads.internal.client.zze zza(java.lang.Throwable r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzegp r0 = r1.zzl
            com.google.android.gms.ads.internal.client.zze r2 = com.google.android.gms.internal.ads.zzfie.zzb(r2, r0)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzddi zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzddi r0 = r1.zzf
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfgt zzd(com.google.android.gms.internal.ads.zzfgt r2) throws java.lang.Exception {
            r1 = this;
            com.google.android.gms.internal.ads.zzcnd r0 = r1.zzd
            r0.zza(r2)
            return r2
    }

    public final com.google.common.util.concurrent.ListenableFuture zze(com.google.android.gms.internal.ads.zzfix r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzcxe r0 = r3.zzi
            com.google.android.gms.internal.ads.zzflg r1 = r3.zzc
            com.google.android.gms.internal.ads.zzfla r2 = com.google.android.gms.internal.ads.zzfla.zzx
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzc()
            com.google.android.gms.internal.ads.zzfkx r0 = r1.zzb(r2, r0)
            com.google.android.gms.internal.ads.zzcui r1 = new com.google.android.gms.internal.ads.zzcui
            r1.<init>(r3, r4)
            com.google.android.gms.internal.ads.zzfkx r4 = r0.zzf(r1)
            com.google.android.gms.internal.ads.zzfkl r4 = r4.zza()
            com.google.android.gms.internal.ads.zzcuk r0 = new com.google.android.gms.internal.ads.zzcuk
            r0.<init>(r3)
            java.util.concurrent.Executor r1 = r3.zzj
            com.google.android.gms.internal.ads.zzgfo.zzr(r4, r0, r1)
            return r4
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzf(com.google.android.gms.internal.ads.zzfix r1, com.google.android.gms.internal.ads.zzbwa r2) throws java.lang.Exception {
            r0 = this;
            r2.zzi = r1
            com.google.android.gms.internal.ads.zzeat r1 = r0.zzh
            com.google.common.util.concurrent.ListenableFuture r1 = r1.zza(r2)
            return r1
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzg(com.google.common.util.concurrent.ListenableFuture r2, com.google.common.util.concurrent.ListenableFuture r3, com.google.common.util.concurrent.ListenableFuture r4) throws java.lang.Exception {
            r1 = this;
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.zzbwa r2 = (com.google.android.gms.internal.ads.zzbwa) r2
            java.lang.Object r3 = r3.get()
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.lang.Object r4 = r4.get()
            com.google.android.gms.internal.ads.zzbwc r4 = (com.google.android.gms.internal.ads.zzbwc) r4
            com.google.android.gms.internal.ads.zzebq r0 = r1.zzn
            com.google.common.util.concurrent.ListenableFuture r2 = r0.zzc(r2, r3, r4)
            return r2
    }

    public final com.google.common.util.concurrent.ListenableFuture zzh(com.google.android.gms.internal.ads.zzbwa r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzeat r0 = r3.zzh
            com.google.android.gms.internal.ads.zzflg r1 = r3.zzc
            com.google.android.gms.internal.ads.zzfla r2 = com.google.android.gms.internal.ads.zzfla.zzy
            com.google.common.util.concurrent.ListenableFuture r4 = r0.zzg(r4)
            com.google.android.gms.internal.ads.zzfkx r4 = r1.zzb(r2, r4)
            com.google.android.gms.internal.ads.zzfkl r4 = r4.zza()
            com.google.android.gms.internal.ads.zzcul r0 = new com.google.android.gms.internal.ads.zzcul
            r0.<init>(r3)
            java.util.concurrent.Executor r1 = r3.zzj
            com.google.android.gms.internal.ads.zzgfo.zzr(r4, r0, r1)
            return r4
    }

    public final com.google.common.util.concurrent.ListenableFuture zzi(com.google.common.util.concurrent.ListenableFuture r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzflg r0 = r3.zzc
            com.google.android.gms.internal.ads.zzfla r1 = com.google.android.gms.internal.ads.zzfla.zzd
            com.google.android.gms.internal.ads.zzfkx r4 = r0.zzb(r1, r4)
            com.google.android.gms.internal.ads.zzcud r0 = new com.google.android.gms.internal.ads.zzcud
            r0.<init>(r3)
            com.google.android.gms.internal.ads.zzfkx r4 = r4.zze(r0)
            com.google.android.gms.internal.ads.zzekl r0 = r3.zze
            com.google.android.gms.internal.ads.zzfkx r4 = r4.zzf(r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfp
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L40
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfq
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            com.google.android.gms.internal.ads.zzfkx r4 = r4.zzi(r0, r2)
        L40:
            com.google.android.gms.internal.ads.zzfkl r4 = r4.zza()
            return r4
    }

    public final com.google.common.util.concurrent.ListenableFuture zzj() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfhc r0 = r3.zzb
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzd
            java.lang.String r1 = r0.zzx
            if (r1 != 0) goto L18
            com.google.android.gms.ads.internal.client.zzc r0 = r0.zzs
            if (r0 == 0) goto Ld
            goto L18
        Ld:
            com.google.android.gms.internal.ads.zzcxe r0 = r3.zzi
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzc()
            com.google.common.util.concurrent.ListenableFuture r0 = r3.zzk(r0)
            return r0
        L18:
            com.google.android.gms.internal.ads.zzflg r0 = r3.zzc
            com.google.android.gms.internal.ads.zzdzl r1 = r3.zza
            com.google.android.gms.internal.ads.zzfla r2 = com.google.android.gms.internal.ads.zzfla.zzA
            com.google.common.util.concurrent.ListenableFuture r1 = r1.zza()
            com.google.android.gms.internal.ads.zzfkx r0 = com.google.android.gms.internal.ads.zzfkq.zzc(r1, r2, r0)
            com.google.android.gms.internal.ads.zzfkl r0 = r0.zza()
            return r0
    }

    public final com.google.common.util.concurrent.ListenableFuture zzk(com.google.common.util.concurrent.ListenableFuture r7) {
            r6 = this;
            com.google.android.gms.internal.ads.zzfgt r0 = r6.zzg
            if (r0 == 0) goto L15
            com.google.android.gms.internal.ads.zzflg r7 = r6.zzc
            com.google.android.gms.internal.ads.zzfla r1 = com.google.android.gms.internal.ads.zzfla.zzc
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            com.google.android.gms.internal.ads.zzfkx r7 = com.google.android.gms.internal.ads.zzfkq.zzc(r0, r1, r7)
            com.google.android.gms.internal.ads.zzfkl r7 = r7.zza()
            return r7
        L15:
            com.google.android.gms.internal.ads.zzbbc r0 = com.google.android.gms.ads.internal.zzu.zzc()
            r0.zzj()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzlh
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L91
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbex.zzc
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L91
            com.google.android.gms.internal.ads.zzebj r0 = r6.zzm
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzcue r1 = new com.google.android.gms.internal.ads.zzcue
            r1.<init>(r0)
            java.util.concurrent.Executor r0 = r6.zzj
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzn(r7, r1, r0)
            com.google.android.gms.internal.ads.zzflg r1 = r6.zzc
            com.google.android.gms.internal.ads.zzfla r2 = com.google.android.gms.internal.ads.zzfla.zzg
            com.google.android.gms.internal.ads.zzfkx r1 = r1.zzb(r2, r0)
            com.google.android.gms.internal.ads.zzeat r2 = r6.zzh
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.ads.zzcuf r3 = new com.google.android.gms.internal.ads.zzcuf
            r3.<init>(r2)
            com.google.android.gms.internal.ads.zzfkx r1 = r1.zzf(r3)
            com.google.android.gms.internal.ads.zzfkl r1 = r1.zza()
            com.google.android.gms.internal.ads.zzflg r2 = r6.zzc
            com.google.android.gms.internal.ads.zzfla r3 = com.google.android.gms.internal.ads.zzfla.zzc
            r4 = 3
            com.google.common.util.concurrent.ListenableFuture[] r4 = new com.google.common.util.concurrent.ListenableFuture[r4]
            r5 = 0
            r4[r5] = r7
            r5 = 1
            r4[r5] = r0
            r5 = 2
            r4[r5] = r1
            com.google.android.gms.internal.ads.zzfko r2 = r2.zza(r3, r4)
            com.google.android.gms.internal.ads.zzcug r3 = new com.google.android.gms.internal.ads.zzcug
            r3.<init>(r6, r7, r0, r1)
            com.google.android.gms.internal.ads.zzfkx r7 = r2.zza(r3)
            com.google.android.gms.internal.ads.zzcuh r0 = new com.google.android.gms.internal.ads.zzcuh
            r0.<init>()
            com.google.android.gms.internal.ads.zzfkx r7 = r7.zzf(r0)
            com.google.android.gms.internal.ads.zzfkl r7 = r7.zza()
            return r7
        L91:
            com.google.android.gms.internal.ads.zzflg r0 = r6.zzc
            com.google.android.gms.internal.ads.zzfla r1 = com.google.android.gms.internal.ads.zzfla.zzc
            com.google.android.gms.internal.ads.zzfkx r7 = r0.zzb(r1, r7)
            com.google.android.gms.internal.ads.zzead r0 = r6.zzk
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzcuj r1 = new com.google.android.gms.internal.ads.zzcuj
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzfkx r7 = r7.zzf(r1)
            com.google.android.gms.internal.ads.zzfkl r7 = r7.zza()
            return r7
    }

    public final void zzl(com.google.android.gms.internal.ads.zzfgt r1) {
            r0 = this;
            r0.zzg = r1
            return
    }
}
