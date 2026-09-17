package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcgz {
    private static final java.util.regex.Pattern zza = null;
    private static final java.util.regex.Pattern zzb = null;

    static {
            java.lang.String r0 = "^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.google.android.gms.internal.ads.zzcgz.zza = r0
            java.lang.String r0 = "^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.google.android.gms.internal.ads.zzcgz.zzb = r0
            return
    }

    public static java.lang.String zza(com.google.android.gms.internal.ads.zzfgh r4) {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeX
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L69
            boolean r0 = r4.zzT
            if (r0 == 0) goto L69
            com.google.android.gms.internal.ads.zzfhf r0 = r4.zzV
            boolean r0 = r0.zzb()
            if (r0 != 0) goto L20
            goto L69
        L20:
            int r0 = r4.zzb
            r2 = 4
            if (r0 == r2) goto L69
            com.google.android.gms.internal.ads.zzfhf r0 = r4.zzV
            int r0 = r0.zzc()
            r2 = 1
            if (r0 != r2) goto L31
            com.google.android.gms.internal.ads.zzegb r0 = com.google.android.gms.internal.ads.zzegb.zzc
            goto L33
        L31:
            com.google.android.gms.internal.ads.zzegb r0 = com.google.android.gms.internal.ads.zzegb.zza
        L33:
            java.lang.String r4 = r4.zzal
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "creativeType"
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> L63
            r2.put(r3, r0)     // Catch: org.json.JSONException -> L63
            java.lang.String r0 = "contentUrl"
            r2.put(r0, r4)     // Catch: org.json.JSONException -> L63
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return "
            r4.append(r0)
            java.lang.String r0 = r2.toString()
            r4.append(r0)
            java.lang.String r0 = "}});</script>"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        L63:
            r4 = move-exception
            java.lang.String r0 = "Unable to build OMID ENV JSON"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r4)
        L69:
            return r1
    }

    public static java.lang.String zzb(java.lang.String r4, java.lang.String... r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.regex.Pattern r1 = com.google.android.gms.internal.ads.zzcgz.zza
            java.util.regex.Matcher r1 = r1.matcher(r4)
            boolean r2 = r1.find()
            r3 = 0
            if (r2 == 0) goto L2c
            int r1 = r1.end()
            java.lang.String r2 = r4.substring(r3, r1)
            r0.append(r2)
            r5 = r5[r3]
            if (r5 == 0) goto L24
            r0.append(r5)
        L24:
            java.lang.String r4 = r4.substring(r1)
            r0.append(r4)
            goto L42
        L2c:
            java.util.regex.Pattern r1 = com.google.android.gms.internal.ads.zzcgz.zzb
            java.util.regex.Matcher r1 = r1.matcher(r4)
            boolean r1 = r1.find()
            if (r1 != 0) goto L3f
            r5 = r5[r3]
            if (r5 == 0) goto L3f
            r0.append(r5)
        L3f:
            r0.append(r4)
        L42:
            java.lang.String r4 = r0.toString()
            return r4
    }
}
