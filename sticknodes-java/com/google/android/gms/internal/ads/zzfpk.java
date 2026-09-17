package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfpk {
    private static final com.google.android.gms.internal.ads.zzfpk zza = null;

    static {
            com.google.android.gms.internal.ads.zzfpk r0 = new com.google.android.gms.internal.ads.zzfpk
            r0.<init>()
            com.google.android.gms.internal.ads.zzfpk.zza = r0
            return
    }

    private zzfpk() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final com.google.android.gms.internal.ads.zzfpk zza() {
            com.google.android.gms.internal.ads.zzfpk r0 = com.google.android.gms.internal.ads.zzfpk.zza
            return r0
    }

    public static final boolean zzj(android.webkit.WebView r1, java.lang.String r2) {
            if (r1 == 0) goto L1c
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1c
            r0 = 0
            r1.evaluateJavascript(r2, r0)     // Catch: java.lang.IllegalStateException -> Ld
            goto L1a
        Ld:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "javascript: "
            java.lang.String r2 = r0.concat(r2)
            r1.loadUrl(r2)
        L1a:
            r1 = 1
            return r1
        L1c:
            r1 = 0
            return r1
    }

    final void zzb(android.webkit.WebView r5, java.lang.String r6, java.lang.Object... r7) {
            r4 = this;
            if (r5 == 0) goto L7f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            java.lang.String r1 = "if(window.omidBridge!==undefined){omidBridge."
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = "("
            r0.append(r6)
            int r6 = r7.length
            r1 = 0
        L18:
            if (r1 >= r6) goto L4f
            r2 = r7[r1]
            if (r2 != 0) goto L24
            java.lang.String r2 = "null"
            r0.append(r2)
            goto L47
        L24:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L44
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "{"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L38
            r0.append(r2)
            goto L47
        L38:
            r3 = 34
            r0.append(r3)
            r0.append(r2)
            r0.append(r3)
            goto L47
        L44:
            r0.append(r2)
        L47:
            java.lang.String r2 = ","
            r0.append(r2)
            int r1 = r1 + 1
            goto L18
        L4f:
            int r6 = r0.length()
            int r6 = r6 + (-1)
            r0.setLength(r6)
            java.lang.String r6 = ")}"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.os.Handler r7 = r5.getHandler()
            if (r7 == 0) goto L7b
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = r7.getLooper()
            if (r0 != r1) goto L72
            goto L7b
        L72:
            com.google.android.gms.internal.ads.zzfpj r0 = new com.google.android.gms.internal.ads.zzfpj
            r0.<init>(r4, r5, r6)
            r7.post(r0)
            return
        L7b:
            zzj(r5, r6)
            return
        L7f:
            java.lang.Boolean r5 = com.google.android.gms.internal.ads.zzfof.zza
            r5.booleanValue()
            return
    }

    public final void zzc(android.webkit.WebView r3, java.lang.String r4) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r4 = "finishSession"
            r2.zzb(r3, r4, r0)
            return
    }

    public final void zzd(android.webkit.WebView r3, java.lang.String r4, org.json.JSONObject r5) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r5
            r5 = 1
            r0[r5] = r4
            java.lang.String r4 = "init"
            r2.zzb(r3, r4, r0)
            return
    }

    public final void zze(android.webkit.WebView r3, java.lang.String r4, float r5) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r1 = 0
            r0[r1] = r5
            r5 = 1
            r0[r5] = r4
            java.lang.String r4 = "setDeviceVolume"
            r2.zzb(r3, r4, r0)
            return
    }

    public final void zzf(android.webkit.WebView r3, org.json.JSONObject r4) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r4 = "setLastActivity"
            r2.zzb(r3, r4, r0)
            return
    }

    public final void zzg(android.webkit.WebView r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r5
            r5 = 1
            r0[r5] = r4
            java.lang.String r4 = "setNativeViewHierarchy"
            r2.zzb(r3, r4, r0)
            return
    }

    public final void zzh(android.webkit.WebView r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r5
            r5 = 1
            r0[r5] = r4
            java.lang.String r4 = "setState"
            r2.zzb(r3, r4, r0)
            return
    }

    public final void zzi(android.webkit.WebView r3, java.lang.String r4, org.json.JSONObject r5, org.json.JSONObject r6, org.json.JSONObject r7) {
            r2 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            r4 = 2
            r0[r4] = r6
            r4 = 3
            r0[r4] = r7
            java.lang.String r4 = "startSession"
            r2.zzb(r3, r4, r0)
            return
    }
}
