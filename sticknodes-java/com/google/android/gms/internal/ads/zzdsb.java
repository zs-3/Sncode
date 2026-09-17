package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdsb {
    public static java.lang.String zza(org.json.JSONObject r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = ""
            if (r4 != 0) goto L5
            goto L3b
        L5:
            org.json.JSONArray r4 = r4.optJSONArray(r6)
            if (r4 == 0) goto L3b
            r6 = 0
        Lc:
            int r1 = r4.length()
            if (r6 >= r1) goto L3b
            org.json.JSONObject r1 = r4.optJSONObject(r6)
            if (r1 != 0) goto L19
            goto L38
        L19:
            java.lang.String r2 = "including"
            org.json.JSONArray r2 = r1.optJSONArray(r2)
            java.lang.String r3 = "excluding"
            org.json.JSONArray r3 = r1.optJSONArray(r3)
            boolean r2 = zzb(r2, r5)
            if (r2 == 0) goto L38
            boolean r2 = zzb(r3, r5)
            if (r2 != 0) goto L38
            java.lang.String r4 = "effective_ad_unit_id"
            java.lang.String r4 = r1.optString(r4, r0)
            return r4
        L38:
            int r6 = r6 + 1
            goto Lc
        L3b:
            return r0
    }

    private static boolean zzb(org.json.JSONArray r5, java.lang.String r6) {
            r0 = 0
            if (r5 == 0) goto L46
            if (r6 == 0) goto L46
            r1 = 0
        L6:
            int r2 = r5.length()
            if (r1 >= r2) goto L46
            java.lang.String r2 = r5.optString(r1)
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzkA     // Catch: java.util.regex.PatternSyntaxException -> L39
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.util.regex.PatternSyntaxException -> L39
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.util.regex.PatternSyntaxException -> L39
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.util.regex.PatternSyntaxException -> L39
            boolean r3 = r3.booleanValue()     // Catch: java.util.regex.PatternSyntaxException -> L39
            if (r3 == 0) goto L28
            r3 = 2
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)     // Catch: java.util.regex.PatternSyntaxException -> L39
            goto L2c
        L28:
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch: java.util.regex.PatternSyntaxException -> L39
        L2c:
            java.util.regex.Matcher r2 = r2.matcher(r6)     // Catch: java.util.regex.PatternSyntaxException -> L39
            boolean r2 = r2.lookingAt()     // Catch: java.util.regex.PatternSyntaxException -> L39
            if (r2 != 0) goto L37
            goto L43
        L37:
            r5 = 1
            return r5
        L39:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r4 = "RtbAdapterMap.hasAtleastOneRegexMatch"
            r3.zzw(r2, r4)
        L43:
            int r1 = r1 + 1
            goto L6
        L46:
            return r0
    }
}
