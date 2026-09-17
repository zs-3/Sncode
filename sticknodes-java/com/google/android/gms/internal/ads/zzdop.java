package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdop {
    private final com.google.android.gms.internal.ads.zzfhc zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzdre zzc;
    private final com.google.android.gms.internal.ads.zzdpz zzd;
    private final android.content.Context zze;
    private final com.google.android.gms.internal.ads.zzdud zzf;
    private final com.google.android.gms.internal.ads.zzfng zzg;
    private final com.google.android.gms.internal.ads.zzeey zzh;

    public zzdop(com.google.android.gms.internal.ads.zzfhc r1, java.util.concurrent.Executor r2, com.google.android.gms.internal.ads.zzdre r3, android.content.Context r4, com.google.android.gms.internal.ads.zzdud r5, com.google.android.gms.internal.ads.zzfng r6, com.google.android.gms.internal.ads.zzeey r7, com.google.android.gms.internal.ads.zzdpz r8) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zze = r4
            r0.zzf = r5
            r0.zzg = r6
            r0.zzh = r7
            r0.zzd = r8
            return
    }

    private final void zzh(com.google.android.gms.internal.ads.zzcfo r9) {
            r8 = this;
            zzj(r9)
            com.google.android.gms.internal.ads.zzbjw r0 = com.google.android.gms.internal.ads.zzbjv.zzl
            java.lang.String r1 = "/video"
            r9.zzag(r1, r0)
            com.google.android.gms.internal.ads.zzbjw r0 = com.google.android.gms.internal.ads.zzbjv.zzm
            java.lang.String r1 = "/videoMeta"
            r9.zzag(r1, r0)
            com.google.android.gms.internal.ads.zzcdw r0 = new com.google.android.gms.internal.ads.zzcdw
            r0.<init>()
            java.lang.String r1 = "/precache"
            r9.zzag(r1, r0)
            com.google.android.gms.internal.ads.zzbjw r0 = com.google.android.gms.internal.ads.zzbjv.zzp
            java.lang.String r1 = "/delayPageLoaded"
            r9.zzag(r1, r0)
            com.google.android.gms.internal.ads.zzbjw r0 = com.google.android.gms.internal.ads.zzbjv.zzn
            java.lang.String r1 = "/instrument"
            r9.zzag(r1, r0)
            com.google.android.gms.internal.ads.zzbjw r0 = com.google.android.gms.internal.ads.zzbjv.zzg
            java.lang.String r1 = "/log"
            r9.zzag(r1, r0)
            com.google.android.gms.internal.ads.zzbiu r0 = new com.google.android.gms.internal.ads.zzbiu
            r1 = 0
            r0.<init>(r1, r1)
            java.lang.String r1 = "/click"
            r9.zzag(r1, r0)
            com.google.android.gms.internal.ads.zzfhc r0 = r8.zza
            com.google.android.gms.internal.ads.zzbmg r0 = r0.zzb
            if (r0 == 0) goto L5a
            com.google.android.gms.internal.ads.zzchg r0 = r9.zzN()
            r1 = 1
            r0.zzE(r1)
            com.google.android.gms.internal.ads.zzbki r0 = new com.google.android.gms.internal.ads.zzbki
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.String r1 = "/open"
            r9.zzag(r1, r0)
            goto L62
        L5a:
            com.google.android.gms.internal.ads.zzchg r0 = r9.zzN()
            r1 = 0
            r0.zzE(r1)
        L62:
            com.google.android.gms.internal.ads.zzbyz r0 = com.google.android.gms.ads.internal.zzu.zzn()
            android.content.Context r1 = r9.getContext()
            boolean r0 = r0.zzp(r1)
            if (r0 == 0) goto L8f
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.gms.internal.ads.zzfgh r1 = r9.zzD()
            if (r1 == 0) goto L81
            com.google.android.gms.internal.ads.zzfgh r0 = r9.zzD()
            java.util.Map r0 = r0.zzaw
        L81:
            com.google.android.gms.internal.ads.zzbkc r1 = new com.google.android.gms.internal.ads.zzbkc
            android.content.Context r2 = r9.getContext()
            r1.<init>(r2, r0)
            java.lang.String r0 = "/logScionEvent"
            r9.zzag(r0, r1)
        L8f:
            return
    }

    private final void zzi(com.google.android.gms.internal.ads.zzcfo r2, com.google.android.gms.internal.ads.zzcar r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfhc r0 = r1.zza
            com.google.android.gms.ads.internal.client.zzgb r0 = r0.zza
            if (r0 == 0) goto L17
            com.google.android.gms.internal.ads.zzcgq r0 = r2.zzq()
            if (r0 == 0) goto L17
            com.google.android.gms.internal.ads.zzcgq r2 = r2.zzq()
            com.google.android.gms.internal.ads.zzfhc r0 = r1.zza
            com.google.android.gms.ads.internal.client.zzgb r0 = r0.zza
            r2.zzs(r0)
        L17:
            r3.zzb()
            return
    }

    private static final void zzj(com.google.android.gms.internal.ads.zzcfo r2) {
            com.google.android.gms.internal.ads.zzbjw r0 = com.google.android.gms.internal.ads.zzbjv.zzh
            java.lang.String r1 = "/videoClicked"
            r2.zzag(r1, r0)
            com.google.android.gms.internal.ads.zzchg r0 = r2.zzN()
            r1 = 1
            r0.zzG(r1)
            com.google.android.gms.internal.ads.zzbjw r0 = com.google.android.gms.internal.ads.zzbjv.zzs
            java.lang.String r1 = "/getNativeAdViewSignals"
            r2.zzag(r1, r0)
            com.google.android.gms.internal.ads.zzbjw r0 = com.google.android.gms.internal.ads.zzbjv.zzt
            java.lang.String r1 = "/getNativeClickMeta"
            r2.zzag(r1, r0)
            return
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(org.json.JSONObject r4) {
            r3 = this;
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            com.google.android.gms.internal.ads.zzdog r1 = new com.google.android.gms.internal.ads.zzdog
            r1.<init>(r3)
            java.util.concurrent.Executor r2 = r3.zzb
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzn(r0, r1, r2)
            com.google.android.gms.internal.ads.zzdof r1 = new com.google.android.gms.internal.ads.zzdof
            r1.<init>(r3, r4)
            java.util.concurrent.Executor r4 = r3.zzb
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzn(r0, r1, r4)
            return r4
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(java.lang.String r10, java.lang.String r11, com.google.android.gms.internal.ads.zzfgh r12, com.google.android.gms.internal.ads.zzfgk r13, com.google.android.gms.ads.internal.client.zzs r14) {
            r9 = this;
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            com.google.android.gms.internal.ads.zzdoe r8 = new com.google.android.gms.internal.ads.zzdoe
            r1 = r8
            r2 = r9
            r3 = r14
            r4 = r12
            r5 = r13
            r6 = r10
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.util.concurrent.Executor r10 = r9.zzb
            com.google.common.util.concurrent.ListenableFuture r10 = com.google.android.gms.internal.ads.zzgfo.zzn(r0, r8, r10)
            return r10
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(org.json.JSONObject r4, com.google.android.gms.internal.ads.zzcfo r5) throws java.lang.Exception {
            r3 = this;
            com.google.android.gms.internal.ads.zzfhc r0 = r3.zza
            com.google.android.gms.internal.ads.zzbmg r0 = r0.zzb
            com.google.android.gms.internal.ads.zzcar r1 = com.google.android.gms.internal.ads.zzcar.zza(r5)
            if (r0 == 0) goto L12
            com.google.android.gms.internal.ads.zzchi r0 = com.google.android.gms.internal.ads.zzchi.zzd()
            r5.zzaj(r0)
            goto L19
        L12:
            com.google.android.gms.internal.ads.zzchi r0 = com.google.android.gms.internal.ads.zzchi.zze()
            r5.zzaj(r0)
        L19:
            com.google.android.gms.internal.ads.zzchg r0 = r5.zzN()
            com.google.android.gms.internal.ads.zzdoh r2 = new com.google.android.gms.internal.ads.zzdoh
            r2.<init>(r3, r5, r1)
            r0.zzB(r2)
            java.lang.String r0 = "google.afma.nativeAds.renderVideo"
            r5.zzl(r0, r4)
            return r1
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(com.google.android.gms.ads.internal.client.zzs r26, com.google.android.gms.internal.ads.zzfgh r27, com.google.android.gms.internal.ads.zzfgk r28, java.lang.String r29, java.lang.String r30, java.lang.Object r31) throws java.lang.Exception {
            r25 = this;
            r0 = r25
            com.google.android.gms.internal.ads.zzdre r1 = r0.zzc
            r2 = r26
            r3 = r27
            r4 = r28
            com.google.android.gms.internal.ads.zzcfo r1 = r1.zza(r2, r3, r4)
            com.google.android.gms.internal.ads.zzcar r2 = com.google.android.gms.internal.ads.zzcar.zza(r1)
            com.google.android.gms.internal.ads.zzfhc r3 = r0.zza
            com.google.android.gms.internal.ads.zzbmg r3 = r3.zzb
            r4 = 0
            if (r3 == 0) goto L24
            r0.zzh(r1)
            com.google.android.gms.internal.ads.zzchi r3 = com.google.android.gms.internal.ads.zzchi.zzd()
            r1.zzaj(r3)
            goto L5c
        L24:
            com.google.android.gms.internal.ads.zzdpz r3 = r0.zzd
            com.google.android.gms.internal.ads.zzdpw r10 = r3.zzb()
            r6 = r10
            r8 = r10
            r20 = r10
            r9 = r10
            r7 = r10
            com.google.android.gms.internal.ads.zzchg r5 = r1.zzN()
            android.content.Context r3 = r0.zze
            r11 = 0
            r12 = 0
            com.google.android.gms.ads.internal.zzb r14 = new com.google.android.gms.ads.internal.zzb
            r13 = r14
            r14.<init>(r3, r4, r4)
            r14 = 0
            r15 = 0
            com.google.android.gms.internal.ads.zzeey r3 = r0.zzh
            r16 = r3
            com.google.android.gms.internal.ads.zzfng r3 = r0.zzg
            r17 = r3
            com.google.android.gms.internal.ads.zzdud r3 = r0.zzf
            r18 = r3
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r5.zzS(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            zzj(r1)
        L5c:
            com.google.android.gms.internal.ads.zzchg r3 = r1.zzN()
            com.google.android.gms.internal.ads.zzdoi r5 = new com.google.android.gms.internal.ads.zzdoi
            r5.<init>(r0, r1, r2)
            r3.zzB(r5)
            r3 = r29
            r5 = r30
            r1.zzae(r3, r5, r4)
            return r2
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zze(java.lang.Object r4) throws java.lang.Exception {
            r3 = this;
            com.google.android.gms.internal.ads.zzdre r4 = r3.zzc
            com.google.android.gms.ads.internal.client.zzs r0 = com.google.android.gms.ads.internal.client.zzs.zzc()
            r1 = 0
            com.google.android.gms.internal.ads.zzcfo r4 = r4.zza(r0, r1, r1)
            com.google.android.gms.internal.ads.zzcar r0 = com.google.android.gms.internal.ads.zzcar.zza(r4)
            r3.zzh(r4)
            com.google.android.gms.internal.ads.zzchg r1 = r4.zzN()
            com.google.android.gms.internal.ads.zzdoj r2 = new com.google.android.gms.internal.ads.zzdoj
            r2.<init>(r0)
            r1.zzH(r2)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzdJ
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.String r1 = (java.lang.String) r1
            UX.aTqO5.a()
            return r0
    }

    final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzcfo r3, com.google.android.gms.internal.ads.zzcar r4, boolean r5, int r6, java.lang.String r7, java.lang.String r8) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdR
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L43
            if (r5 == 0) goto L18
            r2.zzi(r3, r4)
            return
        L18:
            com.google.android.gms.internal.ads.zzeki r3 = new com.google.android.gms.internal.ads.zzeki
            r5 = 1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Native Video WebView failed to load. Error code: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ", Description: "
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = ", Failing URL: "
            r0.append(r6)
            r0.append(r8)
            java.lang.String r6 = r0.toString()
            r3.<init>(r5, r6)
            r4.zzd(r3)
            return
        L43:
            r2.zzi(r3, r4)
            return
    }

    final /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzcfo r3, com.google.android.gms.internal.ads.zzcar r4, boolean r5, int r6, java.lang.String r7, java.lang.String r8) {
            r2 = this;
            if (r5 == 0) goto L1d
            com.google.android.gms.internal.ads.zzfhc r5 = r2.zza
            com.google.android.gms.ads.internal.client.zzgb r5 = r5.zza
            if (r5 == 0) goto L19
            com.google.android.gms.internal.ads.zzcgq r5 = r3.zzq()
            if (r5 == 0) goto L19
            com.google.android.gms.internal.ads.zzcgq r3 = r3.zzq()
            com.google.android.gms.internal.ads.zzfhc r5 = r2.zza
            com.google.android.gms.ads.internal.client.zzgb r5 = r5.zza
            r3.zzs(r5)
        L19:
            r4.zzb()
            return
        L1d:
            com.google.android.gms.internal.ads.zzeki r3 = new com.google.android.gms.internal.ads.zzeki
            r5 = 1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Html video Web View failed to load. Error code: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ", Description: "
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = ", Failing URL: "
            r0.append(r6)
            r0.append(r8)
            java.lang.String r6 = r0.toString()
            r3.<init>(r5, r6)
            r4.zzd(r3)
            return
    }
}
