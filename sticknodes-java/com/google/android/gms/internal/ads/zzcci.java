package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcci {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final boolean zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final long zzm;
    public final long zzn;

    public zzcci(java.lang.String r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            if (r4 == 0) goto Le
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> Ld
            r1.<init>(r4)     // Catch: org.json.JSONException -> Ld
            r0 = r1
            goto Le
        Ld:
        Le:
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzP
            java.lang.String r1 = "aggressive_media_codec_release"
            boolean r4 = zza(r0, r1, r4)
            r3.zza = r4
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzi
            java.lang.String r1 = "byte_buffer_precache_limit"
            int r4 = zzb(r0, r1, r4)
            r3.zzb = r4
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzq
            java.lang.String r1 = "exo_cache_buffer_size"
            int r4 = zzb(r0, r1, r4)
            r3.zzc = r4
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zze
            java.lang.String r1 = "exo_connect_timeout_millis"
            int r4 = zzb(r0, r1, r4)
            r3.zzd = r4
            java.lang.String r4 = "exo_player_version"
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzd
            if (r0 == 0) goto L40
            r0.getString(r4)     // Catch: org.json.JSONException -> L40
            goto L4a
        L40:
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r4.zza(r1)
            java.lang.String r4 = (java.lang.String) r4
        L4a:
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzf
            java.lang.String r1 = "exo_read_timeout_millis"
            int r4 = zzb(r0, r1, r4)
            r3.zze = r4
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzg
            java.lang.String r1 = "load_check_interval_bytes"
            int r4 = zzb(r0, r1, r4)
            r3.zzf = r4
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzh
            java.lang.String r1 = "player_precache_limit"
            int r4 = zzb(r0, r1, r4)
            r3.zzg = r4
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzj
            java.lang.String r1 = "socket_receive_buffer_size"
            int r4 = zzb(r0, r1, r4)
            r3.zzh = r4
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzeh
            java.lang.String r1 = "use_cache_data_source"
            boolean r4 = zza(r0, r1, r4)
            r3.zzi = r4
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzk
            java.lang.String r1 = "min_retry_count"
            zzb(r0, r1, r4)
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzm
            java.lang.String r1 = "treat_load_exception_as_non_fatal"
            boolean r4 = zza(r0, r1, r4)
            r3.zzj = r4
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzbU
            java.lang.String r1 = "enable_multiple_video_playback"
            boolean r4 = zza(r0, r1, r4)
            r3.zzk = r4
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzbW
            java.lang.String r1 = "use_range_http_data_source"
            boolean r4 = zza(r0, r1, r4)
            r3.zzl = r4
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzbX
            java.lang.String r1 = "range_http_data_source_high_water_mark"
            long r1 = zzc(r0, r1, r4)
            r3.zzm = r1
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzbY
            java.lang.String r1 = "range_http_data_source_low_water_mark"
            long r0 = zzc(r0, r1, r4)
            r3.zzn = r0
            return
    }

    private static final boolean zza(org.json.JSONObject r1, java.lang.String r2, com.google.android.gms.internal.ads.zzbcm r3) {
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r0.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r1 == 0) goto L14
            boolean r3 = r1.getBoolean(r2)     // Catch: org.json.JSONException -> L14
        L14:
            return r3
    }

    private static final int zzb(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.zzbcm r2) {
            if (r0 == 0) goto L7
            int r0 = r0.getInt(r1)     // Catch: org.json.JSONException -> L7
            return r0
        L7:
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r0.zza(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    private static final long zzc(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.zzbcm r2) {
            if (r0 == 0) goto L7
            long r0 = r0.getLong(r1)     // Catch: org.json.JSONException -> L7
            return r0
        L7:
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r0.zza(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }
}
