package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdxi implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private final org.json.JSONObject zza;
    private java.util.List zzb;

    zzdxi() {
            r1 = this;
            r1.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1.zza = r0
            return
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r2, java.lang.String r3) {
            r1 = this;
            if (r3 != 0) goto L3
            goto L2b
        L3:
            java.util.List r0 = r1.zzb
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L2b
            java.util.Map r2 = r2.getAll()     // Catch: org.json.JSONException -> L21
            java.lang.Object r2 = r2.get(r3)     // Catch: org.json.JSONException -> L21
            if (r2 != 0) goto L1b
            org.json.JSONObject r2 = r1.zza     // Catch: org.json.JSONException -> L21
            r2.remove(r3)     // Catch: org.json.JSONException -> L21
            return
        L1b:
            org.json.JSONObject r0 = r1.zza     // Catch: org.json.JSONException -> L21
            r0.put(r3, r2)     // Catch: org.json.JSONException -> L21
            return
        L21:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r0 = "InspectorSharedPreferenceCollector.onSharedPreferenceChanged"
            r3.zzv(r2, r0)
        L2b:
            return
    }

    public final org.json.JSONObject zza() throws org.json.JSONException {
            r1 = this;
            org.json.JSONObject r0 = r1.zza
            return r0
    }

    final void zzb(android.content.SharedPreferences r2, java.util.List r3) {
            r1 = this;
            r1.zzb = r3
            r2.registerOnSharedPreferenceChangeListener(r1)
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            r1.onSharedPreferenceChanged(r2, r0)
            goto L9
        L19:
            return
    }
}
