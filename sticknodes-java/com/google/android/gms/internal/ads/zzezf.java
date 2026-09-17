package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzezf implements com.google.android.gms.internal.ads.zzexg {
    final java.lang.String zza;
    final int zzb;

    public zzezf(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            java.lang.String r0 = r2.zza
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2b
            int r0 = r2.zzb
            r1 = -1
            if (r0 != r1) goto L10
            goto L2b
        L10:
            java.lang.String r0 = "pii"
            org.json.JSONObject r3 = com.google.android.gms.ads.internal.util.zzbs.zzg(r3, r0)     // Catch: org.json.JSONException -> L25
            java.lang.String r0 = "pvid"
            java.lang.String r1 = r2.zza     // Catch: org.json.JSONException -> L25
            r3.put(r0, r1)     // Catch: org.json.JSONException -> L25
            java.lang.String r0 = "pvid_s"
            int r1 = r2.zzb     // Catch: org.json.JSONException -> L25
            r3.put(r0, r1)     // Catch: org.json.JSONException -> L25
            return
        L25:
            r3 = move-exception
            java.lang.String r0 = "Failed putting gms core app set ID info."
            com.google.android.gms.ads.internal.util.zze.zzb(r0, r3)
        L2b:
            return
    }
}
