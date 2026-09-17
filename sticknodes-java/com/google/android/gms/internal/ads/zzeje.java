package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeje implements com.google.android.gms.internal.ads.zzeiy {
    private final com.google.android.gms.internal.ads.zzdiy zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;
    private final com.google.android.gms.internal.ads.zzdni zzc;
    private final com.google.android.gms.internal.ads.zzfib zzd;
    private final com.google.android.gms.internal.ads.zzdpz zze;
    private final com.google.android.gms.internal.ads.zzdty zzf;

    public zzeje(com.google.android.gms.internal.ads.zzdiy r1, com.google.android.gms.internal.ads.zzgfz r2, com.google.android.gms.internal.ads.zzdni r3, com.google.android.gms.internal.ads.zzfib r4, com.google.android.gms.internal.ads.zzdpz r5, com.google.android.gms.internal.ads.zzdty r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            return
    }

    private final com.google.common.util.concurrent.ListenableFuture zzg(com.google.android.gms.internal.ads.zzfgt r10, com.google.android.gms.internal.ads.zzfgh r11, org.json.JSONObject r12) {
            r9 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzch
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L29
            com.google.android.gms.internal.ads.zzdty r0 = r9.zzf
            android.os.Bundle r0 = r0.zza()
            com.google.android.gms.internal.ads.zzdtm r1 = com.google.android.gms.internal.ads.zzdtm.zzs
            java.lang.String r1 = r1.zza()
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()
            long r2 = r2.currentTimeMillis()
            r0.putLong(r1, r2)
        L29:
            com.google.android.gms.internal.ads.zzfib r0 = r9.zzd
            com.google.android.gms.internal.ads.zzdni r1 = r9.zzc
            com.google.common.util.concurrent.ListenableFuture r5 = r0.zza()
            com.google.common.util.concurrent.ListenableFuture r4 = r1.zza(r10, r11, r12)
            r0 = 2
            com.google.common.util.concurrent.ListenableFuture[] r0 = new com.google.common.util.concurrent.ListenableFuture[r0]
            r1 = 0
            r0[r1] = r5
            r1 = 1
            r0[r1] = r4
            com.google.android.gms.internal.ads.zzgfn r0 = com.google.android.gms.internal.ads.zzgfo.zzc(r0)
            com.google.android.gms.internal.ads.zzeiz r1 = new com.google.android.gms.internal.ads.zzeiz
            r2 = r1
            r3 = r9
            r6 = r10
            r7 = r11
            r8 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.google.android.gms.internal.ads.zzgfz r10 = r9.zzb
            com.google.common.util.concurrent.ListenableFuture r10 = r0.zza(r1, r10)
            return r10
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfgt r4, com.google.android.gms.internal.ads.zzfgh r5) {
            r3 = this;
            com.google.android.gms.internal.ads.zzfib r0 = r3.zzd
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zza()
            com.google.android.gms.internal.ads.zzejb r1 = new com.google.android.gms.internal.ads.zzejb
            r1.<init>(r3, r5)
            com.google.android.gms.internal.ads.zzgfz r2 = r3.zzb
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzn(r0, r1, r2)
            com.google.android.gms.internal.ads.zzejc r1 = new com.google.android.gms.internal.ads.zzejc
            r1.<init>(r3, r4, r5)
            com.google.android.gms.internal.ads.zzgfz r4 = r3.zzb
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzn(r0, r1, r4)
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(com.google.android.gms.internal.ads.zzfgt r1, com.google.android.gms.internal.ads.zzfgh r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzfgm r1 = r2.zzs
            if (r1 == 0) goto La
            org.json.JSONObject r1 = r1.zzc
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdkk zzc(com.google.common.util.concurrent.ListenableFuture r6, com.google.common.util.concurrent.ListenableFuture r7, com.google.android.gms.internal.ads.zzfgt r8, com.google.android.gms.internal.ads.zzfgh r9, org.json.JSONObject r10) throws java.lang.Exception {
            r5 = this;
            java.lang.Object r6 = r6.get()
            com.google.android.gms.internal.ads.zzdkp r6 = (com.google.android.gms.internal.ads.zzdkp) r6
            java.lang.Object r7 = r7.get()
            com.google.android.gms.internal.ads.zzdpt r7 = (com.google.android.gms.internal.ads.zzdpt) r7
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzch
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r1.zza(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L35
            com.google.android.gms.internal.ads.zzdty r1 = r5.zzf
            android.os.Bundle r1 = r1.zza()
            com.google.android.gms.internal.ads.zzdtm r2 = com.google.android.gms.internal.ads.zzdtm.zzt
            java.lang.String r2 = r2.zza()
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()
            long r3 = r3.currentTimeMillis()
            r1.putLong(r2, r3)
        L35:
            com.google.android.gms.internal.ads.zzdiy r1 = r5.zza
            com.google.android.gms.internal.ads.zzctu r2 = new com.google.android.gms.internal.ads.zzctu
            r3 = 0
            r2.<init>(r8, r9, r3)
            com.google.android.gms.internal.ads.zzdlb r8 = new com.google.android.gms.internal.ads.zzdlb
            r8.<init>(r6)
            com.google.android.gms.internal.ads.zzdjn r9 = new com.google.android.gms.internal.ads.zzdjn
            r9.<init>(r10, r7)
            com.google.android.gms.internal.ads.zzdkq r8 = r1.zzd(r2, r8, r9)
            com.google.android.gms.internal.ads.zzbct r9 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r9 = r9.zza(r0)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L81
            com.google.android.gms.common.util.Clock r9 = com.google.android.gms.ads.internal.zzu.zzB()
            long r9 = r9.currentTimeMillis()
            com.google.android.gms.internal.ads.zzdty r1 = r5.zzf
            android.os.Bundle r1 = r1.zza()
            com.google.android.gms.internal.ads.zzdtm r2 = com.google.android.gms.internal.ads.zzdtm.zzu
            java.lang.String r2 = r2.zza()
            r1.putLong(r2, r9)
            com.google.android.gms.internal.ads.zzdty r1 = r5.zzf
            android.os.Bundle r1 = r1.zza()
            com.google.android.gms.internal.ads.zzdtm r2 = com.google.android.gms.internal.ads.zzdtm.zzv
            java.lang.String r2 = r2.zza()
            r1.putLong(r2, r9)
        L81:
            com.google.android.gms.internal.ads.zzdpf r9 = r8.zzh()
            r9.zzb()
            com.google.android.gms.internal.ads.zzdpp r9 = r8.zzi()
            r9.zza(r7)
            com.google.android.gms.internal.ads.zzdoo r7 = r8.zzg()
            com.google.android.gms.internal.ads.zzcfo r9 = r6.zzs()
            r7.zza(r9)
            com.google.android.gms.internal.ads.zzdpy r7 = r8.zzl()
            com.google.android.gms.internal.ads.zzdpz r9 = r5.zze
            com.google.android.gms.internal.ads.zzcfo r6 = r6.zzq()
            r7.zza(r9, r6)
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r6.zza(r0)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto Lce
            com.google.android.gms.internal.ads.zzdty r6 = r5.zzf
            android.os.Bundle r6 = r6.zza()
            com.google.android.gms.internal.ads.zzdtm r7 = com.google.android.gms.internal.ads.zzdtm.zzw
            java.lang.String r7 = r7.zza()
            com.google.android.gms.common.util.Clock r9 = com.google.android.gms.ads.internal.zzu.zzB()
            long r9 = r9.currentTimeMillis()
            r6.putLong(r7, r9)
        Lce:
            com.google.android.gms.internal.ads.zzdkk r6 = r8.zza()
            return r6
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(com.google.android.gms.internal.ads.zzdpt r2, org.json.JSONObject r3) throws java.lang.Exception {
            r1 = this;
            com.google.android.gms.internal.ads.zzfib r0 = r1.zzd
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzh(r2)
            r0.zzb(r2)
            java.lang.String r2 = "success"
            boolean r2 = r3.optBoolean(r2)
            if (r2 == 0) goto L22
            java.lang.String r2 = "json"
            org.json.JSONObject r2 = r3.getJSONObject(r2)
            java.lang.String r3 = "ads"
            org.json.JSONArray r2 = r2.getJSONArray(r3)
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzh(r2)
            return r2
        L22:
            com.google.android.gms.internal.ads.zzboc r2 = new com.google.android.gms.internal.ads.zzboc
            java.lang.String r3 = "process json failed"
            r2.<init>(r3)
            throw r2
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zze(com.google.android.gms.internal.ads.zzfgh r5, com.google.android.gms.internal.ads.zzdpt r6) throws java.lang.Exception {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "isNonagon"
            r2 = 1
            r0.put(r1, r2)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzik
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r3.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L28
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastR()
            if (r1 == 0) goto L28
            java.lang.String r1 = "skipDeepLinkValidation"
            r0.put(r1, r2)
        L28:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.google.android.gms.internal.ads.zzfgm r5 = r5.zzs
            org.json.JSONObject r5 = r5.zzc
            java.lang.String r2 = "response"
            r1.put(r2, r5)
            java.lang.String r5 = "sdk_params"
            r1.put(r5, r0)
            java.lang.String r5 = "google.afma.nativeAds.preProcessJson"
            com.google.common.util.concurrent.ListenableFuture r5 = r6.zzg(r5, r1)
            com.google.android.gms.internal.ads.zzeja r0 = new com.google.android.gms.internal.ads.zzeja
            r0.<init>(r4, r6)
            com.google.android.gms.internal.ads.zzgfz r6 = r4.zzb
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzn(r5, r0, r6)
            return r5
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzf(com.google.android.gms.internal.ads.zzfgt r7, com.google.android.gms.internal.ads.zzfgh r8, org.json.JSONArray r9) throws java.lang.Exception {
            r6 = this;
            int r0 = r9.length()
            r1 = 3
            if (r0 != 0) goto L12
            com.google.android.gms.internal.ads.zzdye r7 = new com.google.android.gms.internal.ads.zzdye
            r7.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r7 = com.google.android.gms.internal.ads.zzgfo.zzg(r7)
            goto L94
        L12:
            com.google.android.gms.internal.ads.zzfgq r0 = r7.zza
            com.google.android.gms.internal.ads.zzfhc r0 = r0.zza
            int r0 = r0.zzk
            r2 = 0
            r3 = 1
            if (r0 <= r3) goto L81
            int r0 = r9.length()
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzci
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L3d
            com.google.android.gms.internal.ads.zzdty r3 = r6.zzf
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r5 = "nsl"
            r3.zzc(r5, r4)
        L3d:
            com.google.android.gms.internal.ads.zzfib r3 = r6.zzd
            com.google.android.gms.internal.ads.zzfgq r4 = r7.zza
            com.google.android.gms.internal.ads.zzfhc r4 = r4.zza
            int r4 = r4.zzk
            int r4 = java.lang.Math.min(r0, r4)
            r3.zzc(r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            com.google.android.gms.internal.ads.zzfgq r4 = r7.zza
            com.google.android.gms.internal.ads.zzfhc r4 = r4.zza
            int r4 = r4.zzk
            r3.<init>(r4)
        L57:
            com.google.android.gms.internal.ads.zzfgq r4 = r7.zza
            com.google.android.gms.internal.ads.zzfhc r4 = r4.zza
            int r4 = r4.zzk
            if (r2 >= r4) goto L7c
            if (r2 >= r0) goto L6d
            org.json.JSONObject r4 = r9.getJSONObject(r2)
            com.google.common.util.concurrent.ListenableFuture r4 = r6.zzg(r7, r8, r4)
            r3.add(r4)
            goto L79
        L6d:
            com.google.android.gms.internal.ads.zzdye r4 = new com.google.android.gms.internal.ads.zzdye
            r4.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzg(r4)
            r3.add(r4)
        L79:
            int r2 = r2 + 1
            goto L57
        L7c:
            com.google.common.util.concurrent.ListenableFuture r7 = com.google.android.gms.internal.ads.zzgfo.zzh(r3)
            goto L94
        L81:
            org.json.JSONObject r9 = r9.getJSONObject(r2)
            com.google.common.util.concurrent.ListenableFuture r7 = r6.zzg(r7, r8, r9)
            com.google.android.gms.internal.ads.zzejd r8 = new com.google.android.gms.internal.ads.zzejd
            r8.<init>()
            com.google.android.gms.internal.ads.zzgfz r9 = r6.zzb
            com.google.common.util.concurrent.ListenableFuture r7 = com.google.android.gms.internal.ads.zzgfo.zzm(r7, r8, r9)
        L94:
            return r7
    }
}
