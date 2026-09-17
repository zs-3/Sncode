package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbwc {
    private final java.util.List zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final boolean zzd;
    private final boolean zze;
    private final java.lang.String zzf;
    private final int zzg;
    private final org.json.JSONObject zzh;
    private final java.lang.String zzi;
    private final long zzj;
    private final long zzk;

    public zzbwc(org.json.JSONObject r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "url"
            java.lang.String r0 = r3.optString(r0)
            r2.zzf = r0
            java.lang.String r0 = "base_uri"
            java.lang.String r0 = r3.optString(r0)
            r2.zzb = r0
            java.lang.String r0 = "post_parameters"
            java.lang.String r0 = r3.optString(r0)
            r2.zzc = r0
            java.lang.String r0 = "drt_include"
            java.lang.String r0 = r3.optString(r0)
            boolean r0 = zzm(r0)
            r2.zzd = r0
            java.lang.String r0 = "cookies_include"
            java.lang.String r1 = "true"
            java.lang.String r0 = r3.optString(r0, r1)
            boolean r0 = zzm(r0)
            r2.zze = r0
            java.lang.String r0 = "request_id"
            r3.optString(r0)
            java.lang.String r0 = "type"
            r3.optString(r0)
            java.lang.String r0 = "errors"
            java.lang.String r0 = r3.optString(r0)
            if (r0 != 0) goto L49
            r0 = 0
            goto L53
        L49:
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
        L53:
            r2.zza = r0
            r0 = 0
            java.lang.String r1 = "valid"
            int r0 = r3.optInt(r1, r0)
            r1 = 1
            if (r0 != r1) goto L60
            r1 = -2
        L60:
            r2.zzg = r1
            java.lang.String r0 = "fetched_ad"
            r3.optString(r0)
            java.lang.String r0 = "render_test_ad_label"
            r3.optBoolean(r0)
            java.lang.String r0 = "preprocessor_flags"
            org.json.JSONObject r0 = r3.optJSONObject(r0)
            if (r0 != 0) goto L79
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L79:
            r2.zzh = r0
            java.lang.String r0 = "analytics_query_ad_event_id"
            r3.optString(r0)
            java.lang.String r0 = "is_analytics_logging_enabled"
            r3.optBoolean(r0)
            java.lang.String r0 = "pool_key"
            java.lang.String r0 = r3.optString(r0)
            r2.zzi = r0
            java.lang.String r0 = "start_time"
            java.lang.String r0 = r3.optString(r0)
            java.lang.Long r0 = zzl(r0)
            long r0 = r0.longValue()
            r2.zzj = r0
            java.lang.String r0 = "end_time"
            java.lang.String r3 = r3.optString(r0)
            java.lang.Long r3 = zzl(r3)
            long r0 = r3.longValue()
            r2.zzk = r0
            return
    }

    private static java.lang.Long zzl(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            if (r0 == 0) goto Ld
            return r1
        Ld:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L12
            return r3
        L12:
            return r1
    }

    private static boolean zzm(java.lang.String r3) {
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L16
            java.lang.String r2 = "1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L17
            java.lang.String r2 = "true"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L15
            goto L16
        L15:
            return r0
        L16:
            r0 = 0
        L17:
            return r0
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzg
            return r0
    }

    public final long zzb() {
            r2 = this;
            long r0 = r2.zzk
            return r0
    }

    public final long zzc() {
            r2 = this;
            long r0 = r2.zzj
            return r0
    }

    public final java.lang.String zzd() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public final java.lang.String zze() {
            r1 = this;
            java.lang.String r0 = r1.zzi
            return r0
    }

    public final java.lang.String zzf() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public final java.lang.String zzg() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    public final java.util.List zzh() {
            r1 = this;
            java.util.List r0 = r1.zza
            return r0
    }

    public final org.json.JSONObject zzi() {
            r1 = this;
            org.json.JSONObject r0 = r1.zzh
            return r0
    }

    public final boolean zzj() {
            r1 = this;
            boolean r0 = r1.zze
            return r0
    }

    public final boolean zzk() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }
}
