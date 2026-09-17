package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfhf {
    private final org.json.JSONObject zza;

    public zzfhf(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final java.lang.String zza() {
            r2 = this;
            int r0 = r2.zzc()
            int r0 = r0 + (-1)
            r1 = 1
            if (r0 == r1) goto Lc
            java.lang.String r0 = "javascript"
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final boolean zzb() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeZ
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r1 = r3.zza
            r2 = 1
            boolean r0 = r1.optBoolean(r0, r2)
            return r0
    }

    public final int zzc() {
            r3 = this;
            org.json.JSONObject r0 = r3.zza
            java.lang.String r1 = "media_type"
            r2 = -1
            int r0 = r0.optInt(r1, r2)
            if (r0 == 0) goto L11
            r1 = 1
            if (r0 == r1) goto L10
            r0 = 3
            return r0
        L10:
            return r1
        L11:
            r0 = 2
            return r0
    }
}
