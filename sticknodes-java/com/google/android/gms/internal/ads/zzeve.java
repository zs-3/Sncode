package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeve implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final com.google.android.gms.internal.ads.zzfhc zzb;
    private final android.content.pm.PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzeve(com.google.android.gms.internal.ads.zzgfz r1, com.google.android.gms.internal.ads.zzfhc r2, android.content.pm.PackageInfo r3, com.google.android.gms.ads.internal.util.zzg r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzevf zzc(com.google.android.gms.internal.ads.zzeve r2) {
            com.google.android.gms.internal.ads.zzfhc r0 = r2.zzb
            java.util.ArrayList r0 = r0.zzg
            if (r0 != 0) goto Lc
            com.google.android.gms.internal.ads.zzevb r2 = new com.google.android.gms.internal.ads.zzevb
            r2.<init>()
            goto L1e
        Lc:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L18
            com.google.android.gms.internal.ads.zzevc r2 = new com.google.android.gms.internal.ads.zzevc
            r2.<init>()
            goto L1e
        L18:
            com.google.android.gms.internal.ads.zzevd r1 = new com.google.android.gms.internal.ads.zzevd
            r1.<init>(r2, r0)
            r2 = r1
        L1e:
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 26
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeva r0 = new com.google.android.gms.internal.ads.zzeva
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            return r0
    }

    final /* synthetic */ void zzd(java.util.ArrayList r9, android.os.Bundle r10) {
            r8 = this;
            java.lang.String r0 = "native_version"
            r1 = 3
            r10.putInt(r0, r1)
            java.lang.String r0 = "native_templates"
            r10.putStringArrayList(r0, r9)
            com.google.android.gms.internal.ads.zzfhc r9 = r8.zzb
            java.util.ArrayList r9 = r9.zzh
            java.lang.String r0 = "native_custom_templates"
            r10.putStringArrayList(r0, r9)
            com.google.android.gms.internal.ads.zzfhc r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbfr r9 = r9.zzi
            int r9 = r9.zza
            java.lang.String r0 = "landscape"
            java.lang.String r2 = "portrait"
            java.lang.String r3 = "any"
            java.lang.String r4 = "unknown"
            r5 = 2
            r6 = 1
            if (r9 <= r1) goto L4f
            java.lang.String r9 = "enable_native_media_orientation"
            r10.putBoolean(r9, r6)
            com.google.android.gms.internal.ads.zzfhc r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbfr r9 = r9.zzi
            int r9 = r9.zzh
            if (r9 == r6) goto L43
            if (r9 == r5) goto L41
            if (r9 == r1) goto L3f
            r7 = 4
            if (r9 == r7) goto L3c
            r9 = r4
            goto L44
        L3c:
            java.lang.String r9 = "square"
            goto L44
        L3f:
            r9 = r2
            goto L44
        L41:
            r9 = r0
            goto L44
        L43:
            r9 = r3
        L44:
            boolean r7 = r4.equals(r9)
            if (r7 != 0) goto L4f
            java.lang.String r7 = "native_media_orientation"
            r10.putString(r7, r9)
        L4f:
            com.google.android.gms.internal.ads.zzfhc r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbfr r9 = r9.zzi
            int r9 = r9.zzc
            if (r9 == 0) goto L5f
            if (r9 == r6) goto L5d
            if (r9 == r5) goto L60
            r0 = r4
            goto L60
        L5d:
            r0 = r2
            goto L60
        L5f:
            r0 = r3
        L60:
            boolean r9 = r4.equals(r0)
            if (r9 != 0) goto L6b
            java.lang.String r9 = "native_image_orientation"
            r10.putString(r9, r0)
        L6b:
            com.google.android.gms.internal.ads.zzfhc r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbfr r9 = r9.zzi
            boolean r9 = r9.zzd
            java.lang.String r0 = "native_multiple_images"
            r10.putBoolean(r0, r9)
            com.google.android.gms.internal.ads.zzfhc r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbfr r9 = r9.zzi
            boolean r9 = r9.zzg
            java.lang.String r0 = "use_custom_mute"
            r10.putBoolean(r0, r9)
            com.google.android.gms.internal.ads.zzfhc r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbfr r9 = r9.zzi
            int r0 = r9.zzi
            if (r0 == 0) goto L9b
            boolean r9 = r9.zzj
            java.lang.String r0 = "sccg_tap"
            r10.putBoolean(r0, r9)
            com.google.android.gms.internal.ads.zzfhc r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbfr r9 = r9.zzi
            int r9 = r9.zzi
            java.lang.String r0 = "sccg_dir"
            r10.putInt(r0, r9)
        L9b:
            android.content.pm.PackageInfo r9 = r8.zzc
            if (r9 != 0) goto La1
            r9 = 0
            goto La3
        La1:
            int r9 = r9.versionCode
        La3:
            com.google.android.gms.ads.internal.util.zzg r0 = r8.zzd
            int r0 = r0.zza()
            if (r9 <= r0) goto Lb5
            com.google.android.gms.ads.internal.util.zzg r0 = r8.zzd
            r0.zzt()
            com.google.android.gms.ads.internal.util.zzg r0 = r8.zzd
            r0.zzw(r9)
        Lb5:
            com.google.android.gms.ads.internal.util.zzg r9 = r8.zzd
            org.json.JSONObject r9 = r9.zzq()
            r0 = 0
            if (r9 == 0) goto Lcc
            com.google.android.gms.internal.ads.zzfhc r2 = r8.zzb
            java.lang.String r2 = r2.zzf
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            if (r9 == 0) goto Lcc
            java.lang.String r0 = r9.toString()
        Lcc:
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            if (r9 != 0) goto Ld7
            java.lang.String r9 = "native_advanced_settings"
            r10.putString(r9, r0)
        Ld7:
            com.google.android.gms.internal.ads.zzfhc r9 = r8.zzb
            int r9 = r9.zzk
            if (r9 <= r6) goto Le2
            java.lang.String r0 = "max_num_ads"
            r10.putInt(r0, r9)
        Le2:
            com.google.android.gms.internal.ads.zzfhc r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbmg r9 = r9.zzb
            if (r9 == 0) goto L131
            java.lang.String r0 = r9.zzc
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L125
            int r0 = r9.zza
            java.lang.String r2 = "p"
            java.lang.String r3 = "l"
            if (r0 < r5) goto Lff
            int r9 = r9.zzd
            if (r9 == r5) goto L11e
            if (r9 == r1) goto L11f
            goto L11e
        Lff:
            int r9 = r9.zzb
            if (r9 == r6) goto L11e
            if (r9 == r5) goto L11f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Instream ad video aspect ratio "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = " is wrong."
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r9)
        L11e:
            r2 = r3
        L11f:
            java.lang.String r9 = "ia_var"
            r10.putString(r9, r2)
            goto L12c
        L125:
            java.lang.String r9 = r9.zzc
            java.lang.String r0 = "ad_tag"
            r10.putString(r0, r9)
        L12c:
            java.lang.String r9 = "instr"
            r10.putBoolean(r9, r6)
        L131:
            com.google.android.gms.internal.ads.zzfhc r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbht r9 = r9.zza()
            if (r9 == 0) goto L13e
            java.lang.String r9 = "has_delayed_banner_listener"
            r10.putBoolean(r9, r6)
        L13e:
            com.google.android.gms.internal.ads.zzbcm r9 = com.google.android.gms.internal.ads.zzbcv.zzlu
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r9 = r0.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L19f
            com.google.android.gms.internal.ads.zzfhc r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbfr r9 = r9.zzi
            com.google.android.gms.ads.internal.client.zzgb r9 = r9.zzf
            if (r9 == 0) goto L189
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            com.google.android.gms.internal.ads.zzfhc r0 = r8.zzb
            com.google.android.gms.internal.ads.zzbfr r0 = r0.zzi
            com.google.android.gms.ads.internal.client.zzgb r0 = r0.zzf
            boolean r0 = r0.zza
            java.lang.String r1 = "startMuted"
            r9.putBoolean(r1, r0)
            com.google.android.gms.internal.ads.zzfhc r0 = r8.zzb
            com.google.android.gms.internal.ads.zzbfr r0 = r0.zzi
            com.google.android.gms.ads.internal.client.zzgb r0 = r0.zzf
            boolean r0 = r0.zzc
            java.lang.String r1 = "clickToExpandRequested"
            r9.putBoolean(r1, r0)
            com.google.android.gms.internal.ads.zzfhc r0 = r8.zzb
            com.google.android.gms.internal.ads.zzbfr r0 = r0.zzi
            com.google.android.gms.ads.internal.client.zzgb r0 = r0.zzf
            boolean r0 = r0.zzb
            java.lang.String r1 = "customControlsRequested"
            r9.putBoolean(r1, r0)
            java.lang.String r0 = "video"
            r10.putBundle(r0, r9)
        L189:
            com.google.android.gms.internal.ads.zzfhc r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbfr r9 = r9.zzi
            boolean r9 = r9.zzb
            java.lang.String r0 = "disable_image_loading"
            r10.putBoolean(r0, r9)
            com.google.android.gms.internal.ads.zzfhc r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbfr r9 = r9.zzi
            int r9 = r9.zze
            java.lang.String r0 = "preferred_ad_choices_position"
            r10.putInt(r0, r9)
        L19f:
            return
    }
}
