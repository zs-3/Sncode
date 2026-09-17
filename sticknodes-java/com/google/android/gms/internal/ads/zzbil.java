package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbil implements com.google.android.gms.internal.ads.zzbjw {
    private final com.google.android.gms.internal.ads.zzbim zza;

    public zzbil(com.google.android.gms.internal.ads.zzbim r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(java.lang.Object r4, java.util.Map r5) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbim r4 = r3.zza
            if (r4 != 0) goto L5
            return
        L5:
            java.lang.String r4 = "name"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L16
            java.lang.String r4 = "Ad metadata with no name parameter."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r4)
            java.lang.String r4 = ""
        L16:
            java.lang.String r0 = "info"
            boolean r1 = r5.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L35
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2f
            java.lang.Object r5 = r5.get(r0)     // Catch: org.json.JSONException -> L2f
            java.lang.String r5 = (java.lang.String) r5     // Catch: org.json.JSONException -> L2f
            r1.<init>(r5)     // Catch: org.json.JSONException -> L2f
            android.os.Bundle r2 = com.google.android.gms.ads.internal.util.zzbs.zza(r1)     // Catch: org.json.JSONException -> L2f
            goto L35
        L2f:
            r5 = move-exception
            java.lang.String r0 = "Failed to convert ad metadata to JSON."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r5)
        L35:
            if (r2 != 0) goto L3d
            java.lang.String r4 = "Failed to convert ad metadata to Bundle."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r4)
            return
        L3d:
            com.google.android.gms.internal.ads.zzbim r5 = r3.zza
            r5.zza(r4, r2)
            return
    }
}
