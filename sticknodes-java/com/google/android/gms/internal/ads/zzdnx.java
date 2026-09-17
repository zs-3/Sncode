package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdnx {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdnb zzb;
    private final com.google.android.gms.internal.ads.zzavn zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final com.google.android.gms.internal.ads.zzbbu zzf;
    private final java.util.concurrent.Executor zzg;
    private final com.google.android.gms.internal.ads.zzbfr zzh;
    private final com.google.android.gms.internal.ads.zzdop zzi;
    private final com.google.android.gms.internal.ads.zzdre zzj;
    private final java.util.concurrent.ScheduledExecutorService zzk;
    private final com.google.android.gms.internal.ads.zzdpz zzl;
    private final com.google.android.gms.internal.ads.zzdud zzm;
    private final com.google.android.gms.internal.ads.zzfng zzn;
    private final com.google.android.gms.internal.ads.zzeey zzo;
    private final com.google.android.gms.internal.ads.zzefj zzp;
    private final com.google.android.gms.internal.ads.zzfhg zzq;

    public zzdnx(android.content.Context r3, com.google.android.gms.internal.ads.zzdnb r4, com.google.android.gms.internal.ads.zzavn r5, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6, com.google.android.gms.ads.internal.zza r7, com.google.android.gms.internal.ads.zzbbu r8, java.util.concurrent.Executor r9, com.google.android.gms.internal.ads.zzfhc r10, com.google.android.gms.internal.ads.zzdop r11, com.google.android.gms.internal.ads.zzdre r12, java.util.concurrent.ScheduledExecutorService r13, com.google.android.gms.internal.ads.zzdud r14, com.google.android.gms.internal.ads.zzfng r15, com.google.android.gms.internal.ads.zzeey r16, com.google.android.gms.internal.ads.zzdpz r17, com.google.android.gms.internal.ads.zzefj r18, com.google.android.gms.internal.ads.zzfhg r19) {
            r2 = this;
            r0 = r2
            r2.<init>()
            r1 = r3
            r0.zza = r1
            r1 = r4
            r0.zzb = r1
            r1 = r5
            r0.zzc = r1
            r1 = r6
            r0.zzd = r1
            r1 = r7
            r0.zze = r1
            r1 = r8
            r0.zzf = r1
            r1 = r9
            r0.zzg = r1
            r1 = r10
            com.google.android.gms.internal.ads.zzbfr r1 = r1.zzi
            r0.zzh = r1
            r1 = r11
            r0.zzi = r1
            r1 = r12
            r0.zzj = r1
            r1 = r13
            r0.zzk = r1
            r1 = r14
            r0.zzm = r1
            r1 = r15
            r0.zzn = r1
            r1 = r16
            r0.zzo = r1
            r1 = r17
            r0.zzl = r1
            r1 = r18
            r0.zzp = r1
            r1 = r19
            r0.zzq = r1
            return
    }

    public static final com.google.android.gms.ads.internal.client.zzfa zzi(org.json.JSONObject r1) {
            java.lang.String r0 = "mute"
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            if (r1 != 0) goto L9
            goto L16
        L9:
            java.lang.String r0 = "default_reason"
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            if (r1 == 0) goto L16
            com.google.android.gms.ads.internal.client.zzfa r1 = zzr(r1)
            return r1
        L16:
            r1 = 0
            return r1
    }

    public static final java.util.List zzj(org.json.JSONObject r3) {
            java.lang.String r0 = "mute"
            org.json.JSONObject r3 = r3.optJSONObject(r0)
            if (r3 != 0) goto Ld
            com.google.android.gms.internal.ads.zzgax r3 = com.google.android.gms.internal.ads.zzgax.zzn()
            return r3
        Ld:
            java.lang.String r0 = "reasons"
            org.json.JSONArray r3 = r3.optJSONArray(r0)
            if (r3 == 0) goto L3d
            int r0 = r3.length()
            if (r0 > 0) goto L1c
            goto L3d
        L1c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L22:
            int r2 = r3.length()
            if (r1 >= r2) goto L38
            org.json.JSONObject r2 = r3.optJSONObject(r1)
            com.google.android.gms.ads.internal.client.zzfa r2 = zzr(r2)
            if (r2 == 0) goto L35
            r0.add(r2)
        L35:
            int r1 = r1 + 1
            goto L22
        L38:
            com.google.android.gms.internal.ads.zzgax r3 = com.google.android.gms.internal.ads.zzgax.zzl(r0)
            return r3
        L3d:
            com.google.android.gms.internal.ads.zzgax r3 = com.google.android.gms.internal.ads.zzgax.zzn()
            return r3
    }

    private final com.google.android.gms.ads.internal.client.zzs zzk(int r4, int r5) {
            r3 = this;
            if (r4 != 0) goto Lb
            if (r5 == 0) goto L6
            r4 = 0
            goto Lb
        L6:
            com.google.android.gms.ads.internal.client.zzs r4 = com.google.android.gms.ads.internal.client.zzs.zzc()
            return r4
        Lb:
            android.content.Context r0 = r3.zza
            com.google.android.gms.ads.internal.client.zzs r1 = new com.google.android.gms.ads.internal.client.zzs
            com.google.android.gms.ads.AdSize r2 = new com.google.android.gms.ads.AdSize
            r2.<init>(r4, r5)
            r1.<init>(r0, r2)
            return r1
    }

    private static com.google.common.util.concurrent.ListenableFuture zzl(com.google.common.util.concurrent.ListenableFuture r2, java.lang.Object r3) {
            com.google.android.gms.internal.ads.zzdnt r3 = new com.google.android.gms.internal.ads.zzdnt
            r0 = 0
            r3.<init>(r0)
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zzf
            java.lang.Class<java.lang.Exception> r1 = java.lang.Exception.class
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzf(r2, r1, r3, r0)
            return r2
    }

    private static com.google.common.util.concurrent.ListenableFuture zzm(boolean r0, com.google.common.util.concurrent.ListenableFuture r1, java.lang.Object r2) {
            if (r0 == 0) goto Le
            com.google.android.gms.internal.ads.zzdnu r0 = new com.google.android.gms.internal.ads.zzdnu
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzn(r1, r0, r2)
            goto L13
        Le:
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = zzl(r1, r0)
        L13:
            return r0
    }

    private final com.google.common.util.concurrent.ListenableFuture zzn(org.json.JSONObject r13, boolean r14) {
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L8
            com.google.common.util.concurrent.ListenableFuture r13 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r13
        L8:
            java.lang.String r1 = "url"
            java.lang.String r3 = r13.optString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L19
            com.google.common.util.concurrent.ListenableFuture r13 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r13
        L19:
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r4 = "scale"
            double r8 = r13.optDouble(r4, r1)
            r1 = 1
            java.lang.String r2 = "is_transparent"
            boolean r1 = r13.optBoolean(r2, r1)
            java.lang.String r2 = "width"
            r4 = -1
            int r10 = r13.optInt(r2, r4)
            java.lang.String r2 = "height"
            int r11 = r13.optInt(r2, r4)
            if (r14 == 0) goto L47
            com.google.android.gms.internal.ads.zzbfp r13 = new com.google.android.gms.internal.ads.zzbfp
            r6 = 0
            android.net.Uri r7 = android.net.Uri.parse(r3)
            r5 = r13
            r5.<init>(r6, r7, r8, r10, r11)
            com.google.common.util.concurrent.ListenableFuture r13 = com.google.android.gms.internal.ads.zzgfo.zzh(r13)
            return r13
        L47:
            com.google.android.gms.internal.ads.zzdnb r14 = r12.zzb
            com.google.common.util.concurrent.ListenableFuture r14 = r14.zzb(r3, r8, r1)
            com.google.android.gms.internal.ads.zzdnl r1 = new com.google.android.gms.internal.ads.zzdnl
            r2 = r1
            r4 = r8
            r6 = r10
            r7 = r11
            r2.<init>(r3, r4, r6, r7)
            java.util.concurrent.Executor r2 = r12.zzg
            com.google.common.util.concurrent.ListenableFuture r14 = com.google.android.gms.internal.ads.zzgfo.zzm(r14, r1, r2)
            java.lang.String r1 = "require"
            boolean r13 = r13.optBoolean(r1)
            com.google.common.util.concurrent.ListenableFuture r13 = zzm(r13, r14, r0)
            return r13
    }

    private final com.google.common.util.concurrent.ListenableFuture zzo(org.json.JSONArray r4, boolean r5, boolean r6) {
            r3 = this;
            if (r4 == 0) goto L37
            int r0 = r4.length()
            if (r0 > 0) goto L9
            goto L37
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r6 == 0) goto L15
            int r6 = r4.length()
            goto L16
        L15:
            r6 = 1
        L16:
            r1 = 0
        L17:
            if (r1 >= r6) goto L27
            org.json.JSONObject r2 = r4.optJSONObject(r1)
            com.google.common.util.concurrent.ListenableFuture r2 = r3.zzn(r2, r5)
            r0.add(r2)
            int r1 = r1 + 1
            goto L17
        L27:
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzd(r0)
            com.google.android.gms.internal.ads.zzdnq r5 = new com.google.android.gms.internal.ads.zzdnq
            r5.<init>()
            java.util.concurrent.Executor r6 = r3.zzg
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzm(r4, r5, r6)
            return r4
        L37:
            java.util.List r4 = java.util.Collections.emptyList()
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzh(r4)
            return r4
    }

    private final com.google.common.util.concurrent.ListenableFuture zzp(org.json.JSONObject r8, com.google.android.gms.internal.ads.zzfgh r9, com.google.android.gms.internal.ads.zzfgk r10) {
            r7 = this;
            java.lang.String r0 = "base_url"
            java.lang.String r2 = r8.optString(r0)
            java.lang.String r0 = "html"
            java.lang.String r3 = r8.optString(r0)
            java.lang.String r0 = "width"
            r1 = 0
            int r0 = r8.optInt(r0, r1)
            java.lang.String r4 = "height"
            int r8 = r8.optInt(r4, r1)
            com.google.android.gms.ads.internal.client.zzs r6 = r7.zzk(r0, r8)
            com.google.android.gms.internal.ads.zzdop r1 = r7.zzi
            r4 = r9
            r5 = r10
            com.google.common.util.concurrent.ListenableFuture r8 = r1.zzb(r2, r3, r4, r5, r6)
            com.google.android.gms.internal.ads.zzdnm r9 = new com.google.android.gms.internal.ads.zzdnm
            r9.<init>(r8)
            com.google.android.gms.internal.ads.zzgfz r10 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.common.util.concurrent.ListenableFuture r8 = com.google.android.gms.internal.ads.zzgfo.zzn(r8, r9, r10)
            return r8
    }

    private static java.lang.Integer zzq(org.json.JSONObject r2, java.lang.String r3) {
            org.json.JSONObject r2 = r2.getJSONObject(r3)     // Catch: org.json.JSONException -> L1f
            java.lang.String r3 = "r"
            int r3 = r2.getInt(r3)     // Catch: org.json.JSONException -> L1f
            java.lang.String r0 = "g"
            int r0 = r2.getInt(r0)     // Catch: org.json.JSONException -> L1f
            java.lang.String r1 = "b"
            int r2 = r2.getInt(r1)     // Catch: org.json.JSONException -> L1f
            int r2 = android.graphics.Color.rgb(r3, r0, r2)     // Catch: org.json.JSONException -> L1f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: org.json.JSONException -> L1f
            return r2
        L1f:
            r2 = 0
            return r2
    }

    private static final com.google.android.gms.ads.internal.client.zzfa zzr(org.json.JSONObject r2) {
            if (r2 != 0) goto L3
            goto L21
        L3:
            java.lang.String r0 = "reason"
            java.lang.String r0 = r2.optString(r0)
            java.lang.String r1 = "ping_url"
            java.lang.String r2 = r2.optString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L21
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L21
            com.google.android.gms.ads.internal.client.zzfa r1 = new com.google.android.gms.ads.internal.client.zzfa
            r1.<init>(r0, r2)
            return r1
        L21:
            r2 = 0
            return r2
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbfm zza(org.json.JSONObject r13, java.util.List r14) {
            r12 = this;
            r0 = 0
            if (r14 == 0) goto L4e
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto La
            goto L4e
        La:
            java.lang.String r1 = "text"
            java.lang.String r3 = r13.optString(r1)
            java.lang.String r1 = "bg_color"
            java.lang.Integer r5 = zzq(r13, r1)
            java.lang.String r1 = "text_color"
            java.lang.Integer r6 = zzq(r13, r1)
            r1 = -1
            java.lang.String r2 = "text_size"
            int r1 = r13.optInt(r2, r1)
            java.lang.String r2 = "allow_pub_rendering"
            boolean r10 = r13.optBoolean(r2)
            r2 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r4 = "animation_ms"
            int r2 = r13.optInt(r4, r2)
            r4 = 4000(0xfa0, float:5.605E-42)
            java.lang.String r7 = "presentation_ms"
            int r13 = r13.optInt(r7, r4)
            com.google.android.gms.internal.ads.zzbfm r11 = new com.google.android.gms.internal.ads.zzbfm
            if (r1 <= 0) goto L41
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L41:
            r7 = r0
            int r8 = r13 + r2
            com.google.android.gms.internal.ads.zzbfr r13 = r12.zzh
            int r9 = r13.zze
            r2 = r11
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r11
        L4e:
            return r0
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.ads.internal.client.zzs r25, com.google.android.gms.internal.ads.zzfgh r26, com.google.android.gms.internal.ads.zzfgk r27, java.lang.String r28, java.lang.String r29, java.lang.Object r30) throws java.lang.Exception {
            r24 = this;
            r0 = r24
            com.google.android.gms.internal.ads.zzdre r1 = r0.zzj
            r2 = r25
            r3 = r26
            r4 = r27
            com.google.android.gms.internal.ads.zzcfo r1 = r1.zza(r2, r3, r4)
            com.google.android.gms.internal.ads.zzcar r2 = com.google.android.gms.internal.ads.zzcar.zza(r1)
            com.google.android.gms.internal.ads.zzdpz r3 = r0.zzl
            com.google.android.gms.internal.ads.zzdpw r9 = r3.zzb()
            r5 = r9
            r7 = r9
            r19 = r9
            r8 = r9
            r6 = r9
            com.google.android.gms.internal.ads.zzchg r4 = r1.zzN()
            com.google.android.gms.ads.internal.zzb r3 = new com.google.android.gms.ads.internal.zzb
            r12 = r3
            android.content.Context r10 = r0.zza
            r14 = 0
            r3.<init>(r10, r14, r14)
            com.google.android.gms.internal.ads.zzeey r15 = r0.zzo
            com.google.android.gms.internal.ads.zzfng r3 = r0.zzn
            r16 = r3
            com.google.android.gms.internal.ads.zzdud r3 = r0.zzm
            r17 = r3
            r10 = 0
            r11 = 0
            r13 = 0
            r3 = 0
            r14 = r3
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r4.zzS(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.google.android.gms.internal.ads.zzbjw r3 = com.google.android.gms.internal.ads.zzbjv.zzs
            java.lang.String r4 = "/getNativeAdViewSignals"
            r1.zzag(r4, r3)
            com.google.android.gms.internal.ads.zzbjw r3 = com.google.android.gms.internal.ads.zzbjv.zzt
            java.lang.String r4 = "/getNativeClickMeta"
            r1.zzag(r4, r3)
            com.google.android.gms.internal.ads.zzchg r3 = r1.zzN()
            com.google.android.gms.internal.ads.zzdnp r4 = new com.google.android.gms.internal.ads.zzdnp
            r4.<init>(r2)
            r3.zzB(r4)
            r3 = r28
            r4 = r29
            r5 = 0
            r1.zzae(r3, r4, r5)
            return r2
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(java.lang.String r19, java.lang.Object r20) throws java.lang.Exception {
            r18 = this;
            r0 = r18
            com.google.android.gms.ads.internal.zzu.zzz()
            android.content.Context r1 = r0.zza
            com.google.android.gms.internal.ads.zzchi r2 = com.google.android.gms.internal.ads.zzchi.zza()
            com.google.android.gms.internal.ads.zzavn r6 = r0.zzc
            com.google.android.gms.ads.internal.zza r11 = r0.zze
            com.google.android.gms.internal.ads.zzefj r15 = r0.zzp
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r8 = r0.zzd
            com.google.android.gms.internal.ads.zzbbu r12 = r0.zzf
            com.google.android.gms.internal.ads.zzfhg r14 = r0.zzq
            java.lang.String r3 = "native-omid"
            r4 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r16 = 0
            r17 = r14
            r14 = r16
            r16 = r17
            com.google.android.gms.internal.ads.zzcfo r1 = com.google.android.gms.internal.ads.zzcgb.zza(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.google.android.gms.internal.ads.zzcar r2 = com.google.android.gms.internal.ads.zzcar.zza(r1)
            com.google.android.gms.internal.ads.zzchg r3 = r1.zzN()
            com.google.android.gms.internal.ads.zzdnr r4 = new com.google.android.gms.internal.ads.zzdnr
            r4.<init>(r2)
            r3.zzB(r4)
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzfa
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.String r4 = "text/html"
            if (r3 == 0) goto L5e
            byte[] r3 = r19.getBytes()
            r5 = 1
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r5)
            java.lang.String r5 = "base64"
            UX.aTqO5.a()
            goto L65
        L5e:
            java.lang.String r3 = "UTF-8"
            r5 = r19
            UX.aTqO5.a()
        L65:
            return r2
    }

    public final com.google.common.util.concurrent.ListenableFuture zzd(org.json.JSONObject r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r5 = "attribution"
            org.json.JSONObject r4 = r4.optJSONObject(r5)
            r5 = 0
            if (r4 != 0) goto Le
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzh(r5)
            return r4
        Le:
            java.lang.String r0 = "images"
            org.json.JSONArray r0 = r4.optJSONArray(r0)
            java.lang.String r1 = "image"
            org.json.JSONObject r1 = r4.optJSONObject(r1)
            if (r0 != 0) goto L26
            if (r1 == 0) goto L26
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r0.put(r1)
        L26:
            r1 = 0
            r2 = 1
            com.google.common.util.concurrent.ListenableFuture r0 = r3.zzo(r0, r1, r2)
            com.google.android.gms.internal.ads.zzdns r1 = new com.google.android.gms.internal.ads.zzdns
            r1.<init>(r3, r4)
            java.util.concurrent.Executor r2 = r3.zzg
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r2)
            java.lang.String r1 = "require"
            boolean r4 = r4.optBoolean(r1)
            com.google.common.util.concurrent.ListenableFuture r4 = zzm(r4, r0, r5)
            return r4
    }

    public final com.google.common.util.concurrent.ListenableFuture zze(org.json.JSONObject r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbfr r0 = r1.zzh
            org.json.JSONObject r2 = r2.optJSONObject(r3)
            boolean r3 = r0.zzb
            com.google.common.util.concurrent.ListenableFuture r2 = r1.zzn(r2, r3)
            return r2
    }

    public final com.google.common.util.concurrent.ListenableFuture zzf(org.json.JSONObject r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbfr r3 = r1.zzh
            java.lang.String r0 = "images"
            org.json.JSONArray r2 = r2.optJSONArray(r0)
            boolean r0 = r3.zzb
            boolean r3 = r3.zzd
            com.google.common.util.concurrent.ListenableFuture r2 = r1.zzo(r2, r0, r3)
            return r2
    }

    public final com.google.common.util.concurrent.ListenableFuture zzg(org.json.JSONObject r10, java.lang.String r11, com.google.android.gms.internal.ads.zzfgh r12, com.google.android.gms.internal.ads.zzfgk r13) {
            r9 = this;
            com.google.android.gms.internal.ads.zzbcm r11 = com.google.android.gms.internal.ads.zzbcv.zzjF
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r11 = r0.zza(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r0 = 0
            if (r11 != 0) goto L18
            com.google.common.util.concurrent.ListenableFuture r10 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r10
        L18:
            java.lang.String r11 = "images"
            org.json.JSONArray r10 = r10.optJSONArray(r11)
            if (r10 == 0) goto L79
            int r11 = r10.length()
            if (r11 > 0) goto L27
            goto L79
        L27:
            r11 = 0
            org.json.JSONObject r10 = r10.optJSONObject(r11)
            if (r10 != 0) goto L33
            com.google.common.util.concurrent.ListenableFuture r10 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r10
        L33:
            java.lang.String r1 = "base_url"
            java.lang.String r7 = r10.optString(r1)
            java.lang.String r1 = "html"
            java.lang.String r8 = r10.optString(r1)
            java.lang.String r1 = "width"
            int r1 = r10.optInt(r1, r11)
            java.lang.String r2 = "height"
            int r10 = r10.optInt(r2, r11)
            com.google.android.gms.ads.internal.client.zzs r4 = r9.zzk(r1, r10)
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            if (r10 == 0) goto L5a
            com.google.common.util.concurrent.ListenableFuture r10 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r10
        L5a:
            com.google.common.util.concurrent.ListenableFuture r10 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            com.google.android.gms.internal.ads.zzdnn r11 = new com.google.android.gms.internal.ads.zzdnn
            r2 = r11
            r3 = r9
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.google.android.gms.internal.ads.zzgfz r12 = com.google.android.gms.internal.ads.zzcan.zze
            com.google.common.util.concurrent.ListenableFuture r10 = com.google.android.gms.internal.ads.zzgfo.zzn(r10, r11, r12)
            com.google.android.gms.internal.ads.zzdno r11 = new com.google.android.gms.internal.ads.zzdno
            r11.<init>(r10)
            com.google.android.gms.internal.ads.zzgfz r12 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.common.util.concurrent.ListenableFuture r10 = com.google.android.gms.internal.ads.zzgfo.zzn(r10, r11, r12)
            return r10
        L79:
            com.google.common.util.concurrent.ListenableFuture r10 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r10
    }

    public final com.google.common.util.concurrent.ListenableFuture zzh(org.json.JSONObject r5, com.google.android.gms.internal.ads.zzfgh r6, com.google.android.gms.internal.ads.zzfgk r7) {
            r4 = this;
            java.lang.String r0 = "html_containers"
            java.lang.String r1 = "instream"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            org.json.JSONObject r0 = com.google.android.gms.ads.internal.util.zzbs.zzh(r5, r0)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "video"
            org.json.JSONObject r5 = r5.optJSONObject(r0)
            r0 = 0
            if (r5 != 0) goto L1c
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            goto L7a
        L1c:
            java.lang.String r1 = "vast_xml"
            java.lang.String r1 = r5.optString(r1)
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzjE
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L3e
            java.lang.String r2 = "html"
            boolean r2 = r5.has(r2)
            if (r2 == 0) goto L3e
            r3 = 1
        L3e:
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L50
            if (r3 != 0) goto L59
            java.lang.String r5 = "Required field 'vast_xml' or 'html' is missing"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r5)
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            goto L7a
        L50:
            if (r3 != 0) goto L59
            com.google.android.gms.internal.ads.zzdop r6 = r4.zzi
            com.google.common.util.concurrent.ListenableFuture r5 = r6.zza(r5)
            goto L5d
        L59:
            com.google.common.util.concurrent.ListenableFuture r5 = r4.zzp(r5, r6, r7)
        L5d:
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzdK
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r7.zza(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            long r6 = (long) r6
            java.util.concurrent.ScheduledExecutorService r1 = r4.zzk
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzo(r5, r6, r2, r1)
            com.google.common.util.concurrent.ListenableFuture r5 = zzl(r5, r0)
        L7a:
            return r5
        L7b:
            com.google.common.util.concurrent.ListenableFuture r5 = r4.zzp(r0, r6, r7)
            return r5
    }
}
