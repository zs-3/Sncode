package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdrd {
    private final com.google.android.gms.internal.ads.zzcxy zza;
    private final com.google.android.gms.internal.ads.zzdfy zzb;
    private final com.google.android.gms.internal.ads.zzczh zzc;
    private final com.google.android.gms.internal.ads.zzczu zzd;
    private final com.google.android.gms.internal.ads.zzdag zze;
    private final com.google.android.gms.internal.ads.zzdcx zzf;
    private final java.util.concurrent.Executor zzg;
    private final com.google.android.gms.internal.ads.zzdfu zzh;
    private final com.google.android.gms.internal.ads.zzcpm zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final com.google.android.gms.internal.ads.zzbyk zzk;
    private final com.google.android.gms.internal.ads.zzavn zzl;
    private final com.google.android.gms.internal.ads.zzdco zzm;
    private final com.google.android.gms.internal.ads.zzeey zzn;
    private final com.google.android.gms.internal.ads.zzfng zzo;
    private final com.google.android.gms.internal.ads.zzdud zzp;
    private final com.google.android.gms.internal.ads.zzcop zzq;
    private final com.google.android.gms.internal.ads.zzdrj zzr;

    public zzdrd(com.google.android.gms.internal.ads.zzcxy r3, com.google.android.gms.internal.ads.zzczh r4, com.google.android.gms.internal.ads.zzczu r5, com.google.android.gms.internal.ads.zzdag r6, com.google.android.gms.internal.ads.zzdcx r7, java.util.concurrent.Executor r8, com.google.android.gms.internal.ads.zzdfu r9, com.google.android.gms.internal.ads.zzcpm r10, com.google.android.gms.ads.internal.zzb r11, com.google.android.gms.internal.ads.zzbyk r12, com.google.android.gms.internal.ads.zzavn r13, com.google.android.gms.internal.ads.zzdco r14, com.google.android.gms.internal.ads.zzeey r15, com.google.android.gms.internal.ads.zzfng r16, com.google.android.gms.internal.ads.zzdud r17, com.google.android.gms.internal.ads.zzdfy r18, com.google.android.gms.internal.ads.zzcop r19, com.google.android.gms.internal.ads.zzdrj r20) {
            r2 = this;
            r0 = r2
            r2.<init>()
            r1 = r3
            r0.zza = r1
            r1 = r4
            r0.zzc = r1
            r1 = r5
            r0.zzd = r1
            r1 = r6
            r0.zze = r1
            r1 = r7
            r0.zzf = r1
            r1 = r8
            r0.zzg = r1
            r1 = r9
            r0.zzh = r1
            r1 = r10
            r0.zzi = r1
            r1 = r11
            r0.zzj = r1
            r1 = r12
            r0.zzk = r1
            r1 = r13
            r0.zzl = r1
            r1 = r14
            r0.zzm = r1
            r1 = r15
            r0.zzn = r1
            r1 = r16
            r0.zzo = r1
            r1 = r17
            r0.zzp = r1
            r1 = r18
            r0.zzb = r1
            r1 = r19
            r0.zzq = r1
            r1 = r20
            r0.zzr = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzczh zza(com.google.android.gms.internal.ads.zzdrd r0) {
            com.google.android.gms.internal.ads.zzczh r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdco zzb(com.google.android.gms.internal.ads.zzdrd r0) {
            com.google.android.gms.internal.ads.zzdco r0 = r0.zzm
            return r0
    }

    public static final com.google.common.util.concurrent.ListenableFuture zzj(com.google.android.gms.internal.ads.zzcfo r3, java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzch
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L23
            com.google.android.gms.internal.ads.zzdtm r0 = com.google.android.gms.internal.ads.zzdtm.zzx
            java.lang.String r0 = r0.zza()
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()
            long r1 = r1.currentTimeMillis()
            r6.putLong(r0, r1)
        L23:
            com.google.android.gms.internal.ads.zzcas r0 = new com.google.android.gms.internal.ads.zzcas
            r0.<init>()
            com.google.android.gms.internal.ads.zzchg r1 = r3.zzN()
            com.google.android.gms.internal.ads.zzdqu r2 = new com.google.android.gms.internal.ads.zzdqu
            r2.<init>(r6, r0)
            r1.zzB(r2)
            r6 = 0
            r3.zzae(r4, r5, r6)
            return r0
    }

    final /* synthetic */ void zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcxy r0 = r1.zza
            r0.onAdClicked()
            return
    }

    final /* synthetic */ void zzd(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdcx r0 = r1.zzf
            r0.zzb(r2, r3)
            return
    }

    final /* synthetic */ void zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzczh r0 = r1.zzc
            r0.zzb()
            return
    }

    final /* synthetic */ void zzf(android.view.View r1) {
            r0 = this;
            com.google.android.gms.ads.internal.zzb r1 = r0.zzj
            r1.zza()
            return
    }

    final /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzcfo r1, com.google.android.gms.internal.ads.zzcfo r2, java.util.Map r3) {
            r0 = this;
            com.google.android.gms.internal.ads.zzcpm r2 = r0.zzi
            r2.zzh(r1)
            return
    }

    final /* synthetic */ boolean zzh(android.view.View r3, android.view.MotionEvent r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjG
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1f
            if (r4 == 0) goto L1f
            int r0 = r4.getAction()
            if (r0 != 0) goto L1f
            com.google.android.gms.internal.ads.zzdrj r0 = r2.zzr
            r0.zzb(r4)
        L1f:
            com.google.android.gms.ads.internal.zzb r4 = r2.zzj
            r4.zza()
            if (r3 == 0) goto L29
            r3.performClick()
        L29:
            r3 = 0
            return r3
    }

    public final void zzi(com.google.android.gms.internal.ads.zzcfo r28, boolean r29, com.google.android.gms.internal.ads.zzbjz r30, android.os.Bundle r31) {
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r31
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzch
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r4.zza(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L29
            com.google.android.gms.internal.ads.zzdtm r4 = com.google.android.gms.internal.ads.zzdtm.zzv
            java.lang.String r4 = r4.zza()
            com.google.android.gms.common.util.Clock r5 = com.google.android.gms.ads.internal.zzu.zzB()
            long r5 = r5.currentTimeMillis()
            r2.putLong(r4, r5)
        L29:
            com.google.android.gms.internal.ads.zzchg r7 = r28.zzN()
            com.google.android.gms.internal.ads.zzdqv r4 = new com.google.android.gms.internal.ads.zzdqv
            r8 = r4
            r4.<init>(r0)
            com.google.android.gms.internal.ads.zzczu r9 = r0.zzd
            com.google.android.gms.internal.ads.zzdag r10 = r0.zze
            com.google.android.gms.internal.ads.zzdqw r4 = new com.google.android.gms.internal.ads.zzdqw
            r11 = r4
            r4.<init>(r0)
            com.google.android.gms.internal.ads.zzdqx r4 = new com.google.android.gms.internal.ads.zzdqx
            r12 = r4
            r4.<init>(r0)
            com.google.android.gms.ads.internal.zzb r15 = r0.zzj
            com.google.android.gms.internal.ads.zzdrc r4 = new com.google.android.gms.internal.ads.zzdrc
            r16 = r4
            r4.<init>(r0)
            com.google.android.gms.internal.ads.zzbyk r4 = r0.zzk
            r17 = r4
            com.google.android.gms.internal.ads.zzeey r4 = r0.zzn
            r18 = r4
            com.google.android.gms.internal.ads.zzfng r4 = r0.zzo
            r19 = r4
            com.google.android.gms.internal.ads.zzdud r4 = r0.zzp
            r20 = r4
            r21 = 0
            com.google.android.gms.internal.ads.zzdfy r4 = r0.zzb
            r22 = r4
            r23 = 0
            r24 = 0
            r25 = 0
            com.google.android.gms.internal.ads.zzcop r4 = r0.zzq
            r26 = r4
            r13 = r29
            r14 = r30
            r7.zzS(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            com.google.android.gms.internal.ads.zzdqy r4 = new com.google.android.gms.internal.ads.zzdqy
            r4.<init>(r0)
            r1.setOnTouchListener(r4)
            com.google.android.gms.internal.ads.zzdqz r4 = new com.google.android.gms.internal.ads.zzdqz
            r4.<init>(r0)
            r1.setOnClickListener(r4)
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzcG
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto La4
            com.google.android.gms.internal.ads.zzavn r4 = r0.zzl
            com.google.android.gms.internal.ads.zzavi r4 = r4.zzc()
            if (r4 == 0) goto La4
            android.view.View r5 = r28.zzF()
            r4.zzo(r5)
        La4:
            com.google.android.gms.internal.ads.zzdfu r4 = r0.zzh
            java.util.concurrent.Executor r5 = r0.zzg
            r4.zzo(r1, r5)
            com.google.android.gms.internal.ads.zzdfu r4 = r0.zzh
            com.google.android.gms.internal.ads.zzdra r5 = new com.google.android.gms.internal.ads.zzdra
            r5.<init>(r1)
            java.util.concurrent.Executor r6 = r0.zzg
            r4.zzo(r5, r6)
            com.google.android.gms.internal.ads.zzdfu r4 = r0.zzh
            android.view.View r5 = r28.zzF()
            r4.zza(r5)
            com.google.android.gms.internal.ads.zzdrb r4 = new com.google.android.gms.internal.ads.zzdrb
            r4.<init>(r0, r1)
            java.lang.String r5 = "/trackActiveViewUnit"
            r1.zzag(r5, r4)
            com.google.android.gms.internal.ads.zzcpm r4 = r0.zzi
            r4.zzi(r1)
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r1.zza(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lf0
            com.google.android.gms.internal.ads.zzdtm r1 = com.google.android.gms.internal.ads.zzdtm.zzw
            java.lang.String r1 = r1.zza()
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()
            long r3 = r3.currentTimeMillis()
            r2.putLong(r1, r3)
        Lf0:
            return
    }
}
