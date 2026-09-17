package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdkt extends com.google.android.gms.internal.ads.zzdku {
    private final org.json.JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final java.lang.String zzg;
    private final org.json.JSONObject zzh;

    public zzdkt(com.google.android.gms.internal.ads.zzfgh r3, org.json.JSONObject r4) {
            r2 = this;
            r2.<init>(r3)
            java.lang.String r3 = "tracking_urls_and_actions"
            java.lang.String r0 = "active_view"
            java.lang.String[] r3 = new java.lang.String[]{r3, r0}
            org.json.JSONObject r3 = com.google.android.gms.ads.internal.util.zzbs.zzh(r4, r3)
            r2.zzb = r3
            java.lang.String r3 = "allow_pub_owned_ad_view"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            r0 = 0
            boolean r3 = com.google.android.gms.ads.internal.util.zzbs.zzl(r0, r4, r3)
            r2.zzc = r3
            java.lang.String r3 = "attribution"
            java.lang.String r1 = "allow_pub_rendering"
            java.lang.String[] r3 = new java.lang.String[]{r3, r1}
            boolean r3 = com.google.android.gms.ads.internal.util.zzbs.zzl(r0, r4, r3)
            r2.zzd = r3
            java.lang.String r3 = "enable_omid"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            boolean r3 = com.google.android.gms.ads.internal.util.zzbs.zzl(r0, r4, r3)
            r2.zze = r3
            java.lang.String r3 = "watermark_overlay_png_base64"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.lang.String r1 = ""
            java.lang.String r3 = com.google.android.gms.ads.internal.util.zzbs.zzb(r1, r4, r3)
            r2.zzg = r3
            java.lang.String r3 = "overlay"
            org.json.JSONObject r3 = r4.optJSONObject(r3)
            if (r3 == 0) goto L4f
            r0 = 1
        L4f:
            r2.zzf = r0
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzfb
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r0.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L6c
            java.lang.String r3 = "omid_settings"
            org.json.JSONObject r3 = r4.optJSONObject(r3)
        L69:
            r2.zzh = r3
            return
        L6c:
            r3 = 0
            goto L69
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final com.google.android.gms.internal.ads.zzfhf zza() {
            r2 = this;
            org.json.JSONObject r0 = r2.zzh
            if (r0 == 0) goto La
            com.google.android.gms.internal.ads.zzfhf r1 = new com.google.android.gms.internal.ads.zzfhf
            r1.<init>(r0)
            goto Le
        La:
            com.google.android.gms.internal.ads.zzfgh r0 = r2.zza
            com.google.android.gms.internal.ads.zzfhf r1 = r0.zzV
        Le:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final org.json.JSONObject zzc() {
            r2 = this;
            org.json.JSONObject r0 = r2.zzb
            if (r0 == 0) goto L5
            return r0
        L5:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lf
            com.google.android.gms.internal.ads.zzfgh r1 = r2.zza     // Catch: org.json.JSONException -> Lf
            java.lang.String r1 = r1.zzz     // Catch: org.json.JSONException -> Lf
            r0.<init>(r1)     // Catch: org.json.JSONException -> Lf
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final boolean zzd() {
            r1 = this;
            boolean r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final boolean zze() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final boolean zzf() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdku
    public final boolean zzg() {
            r1 = this;
            boolean r0 = r1.zzf
            return r0
    }
}
