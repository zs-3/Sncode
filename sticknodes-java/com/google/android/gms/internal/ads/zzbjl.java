package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbjl implements com.google.android.gms.internal.ads.zzbjw {
    zzbjl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r5, java.util.Map r6) {
            r4 = this;
            com.google.android.gms.internal.ads.zzcfo r5 = (com.google.android.gms.internal.ads.zzcfo) r5
            java.lang.String r0 = "args"
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L83
            r0.<init>(r6)     // Catch: org.json.JSONException -> L83
            java.util.Iterator r6 = r0.keys()     // Catch: org.json.JSONException -> L83
            android.content.Context r5 = r5.getContext()     // Catch: org.json.JSONException -> L83
            android.content.SharedPreferences r5 = android.preference.PreferenceManager.getDefaultSharedPreferences(r5)     // Catch: org.json.JSONException -> L83
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: org.json.JSONException -> L83
        L1f:
            boolean r1 = r6.hasNext()     // Catch: org.json.JSONException -> L83
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r6.next()     // Catch: org.json.JSONException -> L83
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> L83
            java.lang.Object r2 = r0.get(r1)     // Catch: org.json.JSONException -> L83
            boolean r3 = r2 instanceof java.lang.Integer     // Catch: org.json.JSONException -> L83
            if (r3 == 0) goto L3d
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: org.json.JSONException -> L83
            int r2 = r2.intValue()     // Catch: org.json.JSONException -> L83
            r5.putInt(r1, r2)     // Catch: org.json.JSONException -> L83
            goto L1f
        L3d:
            boolean r3 = r2 instanceof java.lang.Long     // Catch: org.json.JSONException -> L83
            if (r3 == 0) goto L4b
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: org.json.JSONException -> L83
            long r2 = r2.longValue()     // Catch: org.json.JSONException -> L83
            r5.putLong(r1, r2)     // Catch: org.json.JSONException -> L83
            goto L1f
        L4b:
            boolean r3 = r2 instanceof java.lang.Double     // Catch: org.json.JSONException -> L83
            if (r3 == 0) goto L59
            java.lang.Double r2 = (java.lang.Double) r2     // Catch: org.json.JSONException -> L83
            float r2 = r2.floatValue()     // Catch: org.json.JSONException -> L83
            r5.putFloat(r1, r2)     // Catch: org.json.JSONException -> L83
            goto L1f
        L59:
            boolean r3 = r2 instanceof java.lang.Float     // Catch: org.json.JSONException -> L83
            if (r3 == 0) goto L67
            java.lang.Float r2 = (java.lang.Float) r2     // Catch: org.json.JSONException -> L83
            float r2 = r2.floatValue()     // Catch: org.json.JSONException -> L83
            r5.putFloat(r1, r2)     // Catch: org.json.JSONException -> L83
            goto L1f
        L67:
            boolean r3 = r2 instanceof java.lang.Boolean     // Catch: org.json.JSONException -> L83
            if (r3 == 0) goto L75
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: org.json.JSONException -> L83
            boolean r2 = r2.booleanValue()     // Catch: org.json.JSONException -> L83
            r5.putBoolean(r1, r2)     // Catch: org.json.JSONException -> L83
            goto L1f
        L75:
            boolean r3 = r2 instanceof java.lang.String     // Catch: org.json.JSONException -> L83
            if (r3 == 0) goto L1f
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L83
            r5.putString(r1, r2)     // Catch: org.json.JSONException -> L83
            goto L1f
        L7f:
            r5.apply()     // Catch: org.json.JSONException -> L83
            return
        L83:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzcad r6 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r0 = "GMSG write local storage KV pairs handler"
            r6.zzw(r5, r0)
            return
    }
}
