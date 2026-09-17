package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfpx {
    static float zza;
    private static android.view.WindowManager zzb;
    private static final java.lang.String[] zzc = null;

    static {
            java.lang.String r0 = "x"
            java.lang.String r1 = "y"
            java.lang.String r2 = "width"
            java.lang.String r3 = "height"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            com.google.android.gms.internal.ads.zzfpx.zzc = r0
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            com.google.android.gms.internal.ads.zzfpx.zza = r0
            return
    }

    public static org.json.JSONObject zza(int r4, int r5, int r6, int r7) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "x"
            float r4 = (float) r4     // Catch: org.json.JSONException -> L2e
            float r2 = com.google.android.gms.internal.ads.zzfpx.zza     // Catch: org.json.JSONException -> L2e
            float r4 = r4 / r2
            double r2 = (double) r4     // Catch: org.json.JSONException -> L2e
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L2e
            java.lang.String r4 = "y"
            float r5 = (float) r5     // Catch: org.json.JSONException -> L2e
            float r1 = com.google.android.gms.internal.ads.zzfpx.zza     // Catch: org.json.JSONException -> L2e
            float r5 = r5 / r1
            double r1 = (double) r5     // Catch: org.json.JSONException -> L2e
            r0.put(r4, r1)     // Catch: org.json.JSONException -> L2e
            java.lang.String r4 = "width"
            float r5 = (float) r6     // Catch: org.json.JSONException -> L2e
            float r6 = com.google.android.gms.internal.ads.zzfpx.zza     // Catch: org.json.JSONException -> L2e
            float r5 = r5 / r6
            double r5 = (double) r5     // Catch: org.json.JSONException -> L2e
            r0.put(r4, r5)     // Catch: org.json.JSONException -> L2e
            java.lang.String r4 = "height"
            float r5 = (float) r7     // Catch: org.json.JSONException -> L2e
            float r6 = com.google.android.gms.internal.ads.zzfpx.zza     // Catch: org.json.JSONException -> L2e
            float r5 = r5 / r6
            double r5 = (double) r5     // Catch: org.json.JSONException -> L2e
            r0.put(r4, r5)     // Catch: org.json.JSONException -> L2e
            goto L34
        L2e:
            r4 = move-exception
            java.lang.String r5 = "Error with creating viewStateObject"
            com.google.android.gms.internal.ads.zzfpy.zza(r5, r4)
        L34:
            return r0
    }

    public static void zzb(org.json.JSONObject r1, java.lang.String r2) {
            java.lang.String r0 = "adSessionId"
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L6
            return
        L6:
            r1 = move-exception
            java.lang.String r2 = "Error with setting ad session id"
            com.google.android.gms.internal.ads.zzfpy.zza(r2, r1)
            return
    }

    public static void zzc(org.json.JSONObject r2, org.json.JSONObject r3) {
            java.lang.String r0 = "childViews"
            org.json.JSONArray r1 = r2.optJSONArray(r0)     // Catch: org.json.JSONException -> L14
            if (r1 != 0) goto L10
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L14
            r1.<init>()     // Catch: org.json.JSONException -> L14
            r2.put(r0, r1)     // Catch: org.json.JSONException -> L14
        L10:
            r1.put(r3)     // Catch: org.json.JSONException -> L14
            return
        L14:
            r2 = move-exception
            r2.printStackTrace()
            return
    }

    public static void zzd(android.content.Context r1) {
            if (r1 == 0) goto L18
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            com.google.android.gms.internal.ads.zzfpx.zza = r0
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            com.google.android.gms.internal.ads.zzfpx.zzb = r1
        L18:
            return
    }

    public static void zze(org.json.JSONObject r1, java.lang.String r2, java.lang.Object r3) {
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L4 java.lang.NullPointerException -> L6
            return
        L4:
            r1 = move-exception
            goto L7
        L6:
            r1 = move-exception
        L7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "JSONException during JSONObject.put for name ["
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = "]"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.google.android.gms.internal.ads.zzfpy.zza(r2, r1)
            return
    }

    public static void zzf(org.json.JSONObject r5) {
            android.view.WindowManager r0 = com.google.android.gms.internal.ads.zzfpx.zzb
            r1 = 0
            if (r0 == 0) goto L1f
            android.graphics.Point r0 = new android.graphics.Point
            r1 = 0
            r0.<init>(r1, r1)
            android.view.WindowManager r1 = com.google.android.gms.internal.ads.zzfpx.zzb
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getRealSize(r0)
            int r1 = r0.x
            float r1 = (float) r1
            float r2 = com.google.android.gms.internal.ads.zzfpx.zza
            float r1 = r1 / r2
            int r0 = r0.y
            float r0 = (float) r0
            float r0 = r0 / r2
            goto L20
        L1f:
            r0 = 0
        L20:
            java.lang.String r2 = "width"
            double r3 = (double) r1     // Catch: org.json.JSONException -> L2d
            r5.put(r2, r3)     // Catch: org.json.JSONException -> L2d
            java.lang.String r1 = "height"
            double r2 = (double) r0     // Catch: org.json.JSONException -> L2d
            r5.put(r1, r2)     // Catch: org.json.JSONException -> L2d
            return
        L2d:
            r5 = move-exception
            r5.printStackTrace()
            return
    }

    public static boolean zzg(org.json.JSONObject r9, org.json.JSONObject r10) {
            r0 = 1
            if (r9 != 0) goto L7
            if (r10 == 0) goto L6
            goto L7
        L6:
            return r0
        L7:
            r1 = 0
            if (r9 == 0) goto Lc3
            if (r10 != 0) goto Le
            goto Lc3
        Le:
            java.lang.String[] r2 = com.google.android.gms.internal.ads.zzfpx.zzc
            r3 = 0
        L11:
            r4 = 4
            if (r3 >= r4) goto L27
            r4 = r2[r3]
            double r5 = r9.optDouble(r4)
            double r7 = r10.optDouble(r4)
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 == 0) goto L24
            goto Lc3
        L24:
            int r3 = r3 + 1
            goto L11
        L27:
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r4 = r9.optString(r2, r3)
            java.lang.String r2 = r10.optString(r2, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lc3
            java.lang.String r2 = "noOutputDevice"
            boolean r4 = r9.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r10.optBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lc3
            java.lang.String r2 = "hasWindowFocus"
            boolean r4 = r9.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r10.optBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lc3
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r9.optJSONArray(r2)
            org.json.JSONArray r2 = r10.optJSONArray(r2)
            if (r4 != 0) goto L78
            if (r2 != 0) goto L78
            goto L96
        L78:
            boolean r5 = zzh(r4, r2)
            if (r5 == 0) goto Lc3
            r5 = 0
        L7f:
            int r6 = r4.length()
            if (r5 >= r6) goto L96
            java.lang.String r6 = r4.optString(r5, r3)
            java.lang.String r7 = r2.optString(r5, r3)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto Lc3
            int r5 = r5 + 1
            goto L7f
        L96:
            java.lang.String r2 = "childViews"
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            org.json.JSONArray r10 = r10.optJSONArray(r2)
            if (r9 != 0) goto La4
            if (r10 == 0) goto Lc2
        La4:
            boolean r2 = zzh(r9, r10)
            if (r2 == 0) goto Lc3
            r2 = 0
        Lab:
            int r3 = r9.length()
            if (r2 >= r3) goto Lc2
            org.json.JSONObject r3 = r9.optJSONObject(r2)
            org.json.JSONObject r4 = r10.optJSONObject(r2)
            boolean r3 = zzg(r3, r4)
            if (r3 == 0) goto Lc3
            int r2 = r2 + 1
            goto Lab
        Lc2:
            return r0
        Lc3:
            return r1
    }

    private static boolean zzh(org.json.JSONArray r2, org.json.JSONArray r3) {
            r0 = 1
            if (r2 != 0) goto L7
            if (r3 == 0) goto L6
            goto L7
        L6:
            return r0
        L7:
            r1 = 0
            if (r2 == 0) goto L18
            if (r3 != 0) goto Ld
            goto L18
        Ld:
            int r2 = r2.length()
            int r3 = r3.length()
            if (r2 != r3) goto L18
            return r0
        L18:
            return r1
    }
}
