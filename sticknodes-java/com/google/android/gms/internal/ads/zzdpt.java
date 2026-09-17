package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdpt {
    private final com.google.android.gms.internal.ads.zzdpg zza;
    private final com.google.android.gms.ads.internal.zza zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzdud zzd;
    private final java.util.concurrent.Executor zze;
    private final com.google.android.gms.internal.ads.zzavn zzf;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzg;
    private final com.google.android.gms.internal.ads.zzbkm zzh;
    private final com.google.android.gms.internal.ads.zzeey zzi;
    private final com.google.android.gms.internal.ads.zzfng zzj;
    private final com.google.android.gms.internal.ads.zzefj zzk;
    private final com.google.android.gms.internal.ads.zzfhg zzl;
    private com.google.common.util.concurrent.ListenableFuture zzm;

    zzdpt(com.google.android.gms.internal.ads.zzdpq r2) {
            r1 = this;
            r1.<init>()
            android.content.Context r0 = com.google.android.gms.internal.ads.zzdpq.zza(r2)
            r1.zzc = r0
            java.util.concurrent.Executor r0 = com.google.android.gms.internal.ads.zzdpq.zzj(r2)
            r1.zze = r0
            com.google.android.gms.internal.ads.zzavn r0 = com.google.android.gms.internal.ads.zzdpq.zzb(r2)
            r1.zzf = r0
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = com.google.android.gms.internal.ads.zzdpq.zzd(r2)
            r1.zzg = r0
            com.google.android.gms.ads.internal.zza r0 = com.google.android.gms.internal.ads.zzdpq.zzc(r2)
            r1.zzb = r0
            com.google.android.gms.internal.ads.zzdpg r0 = new com.google.android.gms.internal.ads.zzdpg
            r0.<init>()
            r1.zza = r0
            com.google.android.gms.internal.ads.zzbkm r0 = new com.google.android.gms.internal.ads.zzbkm
            r0.<init>()
            r1.zzh = r0
            com.google.android.gms.internal.ads.zzeey r0 = com.google.android.gms.internal.ads.zzdpq.zzf(r2)
            r1.zzi = r0
            com.google.android.gms.internal.ads.zzfng r0 = com.google.android.gms.internal.ads.zzdpq.zzi(r2)
            r1.zzj = r0
            com.google.android.gms.internal.ads.zzdud r0 = com.google.android.gms.internal.ads.zzdpq.zze(r2)
            r1.zzd = r0
            com.google.android.gms.internal.ads.zzefj r0 = com.google.android.gms.internal.ads.zzdpq.zzg(r2)
            r1.zzk = r0
            com.google.android.gms.internal.ads.zzfhg r2 = com.google.android.gms.internal.ads.zzdpq.zzh(r2)
            r1.zzl = r2
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdpg zzb(com.google.android.gms.internal.ads.zzdpt r0) {
            com.google.android.gms.internal.ads.zzdpg r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdud zzc(com.google.android.gms.internal.ads.zzdpt r0) {
            com.google.android.gms.internal.ads.zzdud r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzeey zzd(com.google.android.gms.internal.ads.zzdpt r0) {
            com.google.android.gms.internal.ads.zzeey r0 = r0.zzi
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfng zze(com.google.android.gms.internal.ads.zzdpt r0) {
            com.google.android.gms.internal.ads.zzfng r0 = r0.zzj
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzcfo zza(com.google.android.gms.internal.ads.zzcfo r25) {
            r24 = this;
            r0 = r24
            r1 = r25
            com.google.android.gms.internal.ads.zzbkm r2 = r0.zzh
            java.lang.String r3 = "/result"
            r1.zzag(r3, r2)
            com.google.android.gms.internal.ads.zzchg r4 = r25.zzN()
            com.google.android.gms.ads.internal.zzb r2 = new com.google.android.gms.ads.internal.zzb
            r12 = r2
            android.content.Context r3 = r0.zzc
            r5 = 0
            r2.<init>(r3, r5, r5)
            com.google.android.gms.internal.ads.zzeey r15 = r0.zzi
            com.google.android.gms.internal.ads.zzfng r2 = r0.zzj
            r16 = r2
            com.google.android.gms.internal.ads.zzdud r2 = r0.zzd
            r17 = r2
            com.google.android.gms.internal.ads.zzdpg r6 = r0.zza
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r4.zzS(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r1
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzf(java.lang.String r2, org.json.JSONObject r3, com.google.android.gms.internal.ads.zzcfo r4) throws java.lang.Exception {
            r1 = this;
            com.google.android.gms.internal.ads.zzbkm r0 = r1.zzh
            com.google.common.util.concurrent.ListenableFuture r2 = r0.zzb(r4, r2, r3)
            return r2
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzg(java.lang.String r3, org.json.JSONObject r4) {
            r2 = this;
            monitor-enter(r2)
            com.google.common.util.concurrent.ListenableFuture r0 = r2.zzm     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto Lc
            r3 = 0
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzh(r3)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return r3
        Lc:
            com.google.android.gms.internal.ads.zzdph r1 = new com.google.android.gms.internal.ads.zzdph     // Catch: java.lang.Throwable -> L19
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.Executor r3 = r2.zze     // Catch: java.lang.Throwable -> L19
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzn(r0, r1, r3)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return r3
        L19:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized void zzh(com.google.android.gms.internal.ads.zzfgh r3, com.google.android.gms.internal.ads.zzfgk r4, com.google.android.gms.internal.ads.zzcop r5) {
            r2 = this;
            monitor-enter(r2)
            com.google.common.util.concurrent.ListenableFuture r0 = r2.zzm     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            com.google.android.gms.internal.ads.zzdpn r1 = new com.google.android.gms.internal.ads.zzdpn     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L13
            java.util.concurrent.Executor r3 = r2.zze     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r1, r3)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return
        L13:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized void zzi() {
            r3 = this;
            monitor-enter(r3)
            com.google.common.util.concurrent.ListenableFuture r0 = r3.zzm     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L7
            monitor-exit(r3)
            return
        L7:
            com.google.android.gms.internal.ads.zzdpj r1 = new com.google.android.gms.internal.ads.zzdpj     // Catch: java.lang.Throwable -> L16
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.Executor r2 = r3.zze     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r1, r2)     // Catch: java.lang.Throwable -> L16
            r0 = 0
            r3.zzm = r0     // Catch: java.lang.Throwable -> L16
            monitor-exit(r3)
            return
        L16:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final synchronized void zzj(java.lang.String r3, java.util.Map r4) {
            r2 = this;
            monitor-enter(r2)
            com.google.common.util.concurrent.ListenableFuture r3 = r2.zzm     // Catch: java.lang.Throwable -> L15
            if (r3 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            com.google.android.gms.internal.ads.zzdpm r0 = new com.google.android.gms.internal.ads.zzdpm     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "sendMessageToNativeJs"
            r0.<init>(r2, r1, r4)     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.Executor r4 = r2.zze     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.ads.zzgfo.zzr(r3, r0, r4)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return
        L15:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized void zzk() {
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdI     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L3a
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.zzcfz r0 = new com.google.android.gms.internal.ads.zzcfz     // Catch: java.lang.Throwable -> L3a
            android.content.Context r2 = r9.zzc     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.zzavn r3 = r9.zzf     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = r9.zzg     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.ads.internal.zza r5 = r9.zzb     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.zzefj r6 = r9.zzk     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.zzfhg r7 = r9.zzl     // Catch: java.lang.Throwable -> L3a
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zze     // Catch: java.lang.Throwable -> L3a
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzk(r0, r1)     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.zzdpi r1 = new com.google.android.gms.internal.ads.zzdpi     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L3a
            java.util.concurrent.Executor r2 = r9.zze     // Catch: java.lang.Throwable -> L3a
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r2)     // Catch: java.lang.Throwable -> L3a
            r9.zzm = r0     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = "NativeJavascriptExecutor.initializeEngine"
            com.google.android.gms.internal.ads.zzcaq.zza(r0, r1)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r9)
            return
        L3a:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
    }

    public final synchronized void zzl(java.lang.String r3, com.google.android.gms.internal.ads.zzbjw r4) {
            r2 = this;
            monitor-enter(r2)
            com.google.common.util.concurrent.ListenableFuture r0 = r2.zzm     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            com.google.android.gms.internal.ads.zzdpk r1 = new com.google.android.gms.internal.ads.zzdpk     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L13
            java.util.concurrent.Executor r3 = r2.zze     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r1, r3)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return
        L13:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final void zzm(java.lang.ref.WeakReference r8, java.lang.String r9, com.google.android.gms.internal.ads.zzbjw r10) {
            r7 = this;
            com.google.android.gms.internal.ads.zzdps r6 = new com.google.android.gms.internal.ads.zzdps
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r7.zzl(r9, r6)
            return
    }

    public final synchronized void zzn(java.lang.String r3, com.google.android.gms.internal.ads.zzbjw r4) {
            r2 = this;
            monitor-enter(r2)
            com.google.common.util.concurrent.ListenableFuture r0 = r2.zzm     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            com.google.android.gms.internal.ads.zzdpl r1 = new com.google.android.gms.internal.ads.zzdpl     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L13
            java.util.concurrent.Executor r3 = r2.zze     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r1, r3)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return
        L13:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
