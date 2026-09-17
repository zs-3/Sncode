package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbpg {
    public zzbpg() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final java.util.List zza(org.json.JSONObject r2, java.lang.String r3) throws org.json.JSONException {
            org.json.JSONArray r2 = r2.optJSONArray(r3)
            if (r2 == 0) goto L25
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = r2.length()
            r3.<init>(r0)
            r0 = 0
        L10:
            int r1 = r2.length()
            if (r0 >= r1) goto L20
            java.lang.String r1 = r2.getString(r0)
            r3.add(r1)
            int r0 = r0 + 1
            goto L10
        L20:
            java.util.List r2 = java.util.Collections.unmodifiableList(r3)
            return r2
        L25:
            r2 = 0
            return r2
    }
}
