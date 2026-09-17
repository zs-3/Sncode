package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzejt implements com.google.android.gms.internal.ads.zzegk {
    public zzejt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.os.Bundle zzd(android.os.Bundle r1) {
            if (r1 != 0) goto L8
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            goto Le
        L8:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r1)
            r1 = r0
        Le:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfgt r36, com.google.android.gms.internal.ads.zzfgh r37) {
            r35 = this;
            r0 = r36
            r1 = r37
            org.json.JSONObject r2 = r1.zzv
            java.lang.String r3 = "pubid"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.optString(r3, r4)
            com.google.android.gms.internal.ads.zzfgq r3 = r0.zza
            com.google.android.gms.internal.ads.zzfhc r3 = r3.zza
            com.google.android.gms.internal.ads.zzfha r4 = new com.google.android.gms.internal.ads.zzfha
            r4.<init>()
            r4.zzq(r3)
            r4.zzt(r2)
            com.google.android.gms.ads.internal.client.zzm r2 = r3.zzd
            android.os.Bundle r2 = r2.zzm
            android.os.Bundle r2 = zzd(r2)
            java.lang.String r5 = "com.google.ads.mediation.admob.AdMobAdapter"
            android.os.Bundle r6 = r2.getBundle(r5)
            android.os.Bundle r9 = zzd(r6)
            java.lang.String r6 = "gw"
            r7 = 1
            r9.putInt(r6, r7)
            org.json.JSONObject r6 = r1.zzv
            java.lang.String r8 = "mad_hac"
            r10 = 0
            java.lang.String r6 = r6.optString(r8, r10)
            if (r6 == 0) goto L43
            r9.putString(r8, r6)
        L43:
            org.json.JSONObject r6 = r1.zzv
            java.lang.String r8 = "adJson"
            java.lang.String r6 = r6.optString(r8, r10)
            if (r6 == 0) goto L52
            java.lang.String r8 = "_ad"
            r9.putString(r8, r6)
        L52:
            java.lang.String r6 = "_noRefresh"
            r9.putBoolean(r6, r7)
            org.json.JSONObject r6 = r1.zzD
            java.util.Iterator r6 = r6.keys()
        L5d:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L75
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            org.json.JSONObject r11 = r1.zzD
            java.lang.String r11 = r11.optString(r8, r10)
            if (r8 == 0) goto L5d
            r9.putString(r8, r11)
            goto L5d
        L75:
            r2.putBundle(r5, r9)
            com.google.android.gms.ads.internal.client.zzm r3 = r3.zzd
            android.os.Bundle r5 = r3.zzn
            r20 = r5
            java.util.List r5 = r3.zzo
            r21 = r5
            java.lang.String r5 = r3.zzp
            r22 = r5
            java.lang.String r5 = r3.zzq
            r23 = r5
            boolean r5 = r3.zzr
            r24 = r5
            com.google.android.gms.ads.internal.client.zzc r5 = r3.zzs
            r25 = r5
            int r5 = r3.zzt
            r26 = r5
            java.lang.String r5 = r3.zzu
            r27 = r5
            java.util.List r5 = r3.zzv
            r28 = r5
            int r5 = r3.zzw
            r29 = r5
            java.lang.String r5 = r3.zzx
            r30 = r5
            int r5 = r3.zzy
            r31 = r5
            long r5 = r3.zzz
            r32 = r5
            int r10 = r3.zzd
            java.util.List r11 = r3.zze
            boolean r12 = r3.zzf
            int r13 = r3.zzg
            boolean r14 = r3.zzh
            java.lang.String r15 = r3.zzi
            com.google.android.gms.ads.internal.client.zzfy r5 = r3.zzj
            r16 = r5
            android.location.Location r5 = r3.zzk
            r17 = r5
            java.lang.String r5 = r3.zzl
            r18 = r5
            com.google.android.gms.ads.internal.client.zzm r8 = new com.google.android.gms.ads.internal.client.zzm
            r5 = r8
            int r6 = r3.zza
            r34 = r8
            long r7 = r3.zzb
            r3 = r34
            r19 = r2
            r5.<init>(r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r4.zzH(r3)
            com.google.android.gms.internal.ads.zzfhc r2 = r4.zzJ()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            com.google.android.gms.internal.ads.zzfgs r4 = r0.zzb
            com.google.android.gms.internal.ads.zzfgk r4 = r4.zzb
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r7 = r4.zza
            r6.<init>(r7)
            java.lang.String r7 = "nofill_urls"
            r5.putStringArrayList(r7, r6)
            int r6 = r4.zzc
            java.lang.String r7 = "refresh_interval"
            r5.putInt(r7, r6)
            java.lang.String r4 = r4.zzb
            java.lang.String r6 = "gws_query_id"
            r5.putString(r6, r4)
            java.lang.String r4 = "parent_common_config"
            r3.putBundle(r4, r5)
            com.google.android.gms.internal.ads.zzfgq r4 = r0.zza
            com.google.android.gms.internal.ads.zzfhc r4 = r4.zza
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r4 = r4.zzf
            java.lang.String r6 = "initial_ad_unit_id"
            r5.putString(r6, r4)
            java.lang.String r4 = r1.zzw
            java.lang.String r6 = "allocation_id"
            r5.putString(r6, r4)
            java.lang.String r4 = r1.zzF
            java.lang.String r6 = "ad_source_name"
            r5.putString(r6, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r6 = r1.zzc
            r4.<init>(r6)
            java.lang.String r6 = "click_urls"
            r5.putStringArrayList(r6, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r6 = r1.zzd
            r4.<init>(r6)
            java.lang.String r6 = "imp_urls"
            r5.putStringArrayList(r6, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r6 = r1.zzp
            r4.<init>(r6)
            java.lang.String r6 = "manual_tracking_urls"
            r5.putStringArrayList(r6, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r6 = r1.zzm
            r4.<init>(r6)
            java.lang.String r6 = "fill_urls"
            r5.putStringArrayList(r6, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r6 = r1.zzg
            r4.<init>(r6)
            java.lang.String r6 = "video_start_urls"
            r5.putStringArrayList(r6, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r6 = r1.zzh
            r4.<init>(r6)
            java.lang.String r6 = "video_reward_urls"
            r5.putStringArrayList(r6, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r6 = r1.zzi
            r4.<init>(r6)
            java.lang.String r6 = "video_complete_urls"
            r5.putStringArrayList(r6, r4)
            java.lang.String r4 = r1.zzj
            java.lang.String r6 = "transaction_id"
            r5.putString(r6, r4)
            java.lang.String r4 = r1.zzk
            java.lang.String r6 = "valid_from_timestamp"
            r5.putString(r6, r4)
            boolean r4 = r1.zzP
            java.lang.String r6 = "is_closable_area_disabled"
            r5.putBoolean(r6, r4)
            java.lang.String r4 = r1.zzao
            java.lang.String r6 = "recursive_server_response_data"
            r5.putString(r6, r4)
            com.google.android.gms.internal.ads.zzbwy r4 = r1.zzl
            if (r4 == 0) goto L1be
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            com.google.android.gms.internal.ads.zzbwy r6 = r1.zzl
            int r6 = r6.zzb
            java.lang.String r7 = "rb_amount"
            r4.putInt(r7, r6)
            com.google.android.gms.internal.ads.zzbwy r6 = r1.zzl
            java.lang.String r6 = r6.zza
            java.lang.String r7 = "rb_type"
            r4.putString(r7, r6)
            r6 = 1
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            r7 = 0
            r6[r7] = r4
            java.lang.String r4 = "rewards"
            r5.putParcelableArray(r4, r6)
        L1be:
            java.lang.String r4 = "parent_ad_config"
            r3.putBundle(r4, r5)
            r4 = r35
            com.google.common.util.concurrent.ListenableFuture r0 = r4.zzc(r2, r3, r1, r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(com.google.android.gms.internal.ads.zzfgt r2, com.google.android.gms.internal.ads.zzfgh r3) {
            r1 = this;
            org.json.JSONObject r2 = r3.zzv
            java.lang.String r3 = "pubid"
            java.lang.String r0 = ""
            java.lang.String r2 = r2.optString(r3, r0)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    protected abstract com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfhc r1, android.os.Bundle r2, com.google.android.gms.internal.ads.zzfgh r3, com.google.android.gms.internal.ads.zzfgt r4);
}
