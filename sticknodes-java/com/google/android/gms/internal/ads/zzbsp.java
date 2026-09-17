package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzbsp {
    private final com.google.android.gms.internal.ads.zzcfo zza;
    private final java.lang.String zzb;

    public zzbsp(com.google.android.gms.internal.ads.zzcfo r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final void zzg(int r3, int r4, int r5, int r6) {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L25
            r0.<init>()     // Catch: org.json.JSONException -> L25
            java.lang.String r1 = "x"
            org.json.JSONObject r3 = r0.put(r1, r3)     // Catch: org.json.JSONException -> L25
            java.lang.String r0 = "y"
            org.json.JSONObject r3 = r3.put(r0, r4)     // Catch: org.json.JSONException -> L25
            java.lang.String r4 = "width"
            org.json.JSONObject r3 = r3.put(r4, r5)     // Catch: org.json.JSONException -> L25
            java.lang.String r4 = "height"
            org.json.JSONObject r3 = r3.put(r4, r6)     // Catch: org.json.JSONException -> L25
            com.google.android.gms.internal.ads.zzcfo r4 = r2.zza     // Catch: org.json.JSONException -> L25
            java.lang.String r5 = "onDefaultPositionReceived"
            r4.zze(r5, r3)     // Catch: org.json.JSONException -> L25
            return
        L25:
            r3 = move-exception
            java.lang.String r4 = "Error occurred while dispatching default position."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r4, r3)
            return
    }

    public final void zzh(java.lang.String r3) {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1d
            r0.<init>()     // Catch: org.json.JSONException -> L1d
            java.lang.String r1 = "message"
            org.json.JSONObject r3 = r0.put(r1, r3)     // Catch: org.json.JSONException -> L1d
            java.lang.String r0 = "action"
            java.lang.String r1 = r2.zzb     // Catch: org.json.JSONException -> L1d
            org.json.JSONObject r3 = r3.put(r0, r1)     // Catch: org.json.JSONException -> L1d
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zza     // Catch: org.json.JSONException -> L1d
            if (r0 == 0) goto L1c
            java.lang.String r1 = "onError"
            r0.zze(r1, r3)     // Catch: org.json.JSONException -> L1d
        L1c:
            return
        L1d:
            r3 = move-exception
            java.lang.String r0 = "Error occurred while dispatching error event."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r3)
            return
    }

    public final void zzi(java.lang.String r3) {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L13
            r0.<init>()     // Catch: org.json.JSONException -> L13
            java.lang.String r1 = "js"
            org.json.JSONObject r3 = r0.put(r1, r3)     // Catch: org.json.JSONException -> L13
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zza     // Catch: org.json.JSONException -> L13
            java.lang.String r1 = "onReadyEventReceived"
            r0.zze(r1, r3)     // Catch: org.json.JSONException -> L13
            return
        L13:
            r3 = move-exception
            java.lang.String r0 = "Error occurred while dispatching ready Event."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r3)
            return
    }

    public final void zzj(int r3, int r4, int r5, int r6, float r7, int r8) {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L32
            r0.<init>()     // Catch: org.json.JSONException -> L32
            java.lang.String r1 = "width"
            org.json.JSONObject r3 = r0.put(r1, r3)     // Catch: org.json.JSONException -> L32
            java.lang.String r0 = "height"
            org.json.JSONObject r3 = r3.put(r0, r4)     // Catch: org.json.JSONException -> L32
            java.lang.String r4 = "maxSizeWidth"
            org.json.JSONObject r3 = r3.put(r4, r5)     // Catch: org.json.JSONException -> L32
            java.lang.String r4 = "maxSizeHeight"
            org.json.JSONObject r3 = r3.put(r4, r6)     // Catch: org.json.JSONException -> L32
            java.lang.String r4 = "density"
            double r5 = (double) r7     // Catch: org.json.JSONException -> L32
            org.json.JSONObject r3 = r3.put(r4, r5)     // Catch: org.json.JSONException -> L32
            java.lang.String r4 = "rotation"
            org.json.JSONObject r3 = r3.put(r4, r8)     // Catch: org.json.JSONException -> L32
            com.google.android.gms.internal.ads.zzcfo r4 = r2.zza     // Catch: org.json.JSONException -> L32
            java.lang.String r5 = "onScreenInfoChanged"
            r4.zze(r5, r3)     // Catch: org.json.JSONException -> L32
            return
        L32:
            r3 = move-exception
            java.lang.String r4 = "Error occurred while obtaining screen information."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r4, r3)
            return
    }

    public final void zzk(int r3, int r4, int r5, int r6) {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L25
            r0.<init>()     // Catch: org.json.JSONException -> L25
            java.lang.String r1 = "x"
            org.json.JSONObject r3 = r0.put(r1, r3)     // Catch: org.json.JSONException -> L25
            java.lang.String r0 = "y"
            org.json.JSONObject r3 = r3.put(r0, r4)     // Catch: org.json.JSONException -> L25
            java.lang.String r4 = "width"
            org.json.JSONObject r3 = r3.put(r4, r5)     // Catch: org.json.JSONException -> L25
            java.lang.String r4 = "height"
            org.json.JSONObject r3 = r3.put(r4, r6)     // Catch: org.json.JSONException -> L25
            com.google.android.gms.internal.ads.zzcfo r4 = r2.zza     // Catch: org.json.JSONException -> L25
            java.lang.String r5 = "onSizeChanged"
            r4.zze(r5, r3)     // Catch: org.json.JSONException -> L25
            return
        L25:
            r3 = move-exception
            java.lang.String r4 = "Error occurred while dispatching size change."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r4, r3)
            return
    }

    public final void zzl(java.lang.String r3) {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L13
            r0.<init>()     // Catch: org.json.JSONException -> L13
            java.lang.String r1 = "state"
            org.json.JSONObject r3 = r0.put(r1, r3)     // Catch: org.json.JSONException -> L13
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zza     // Catch: org.json.JSONException -> L13
            java.lang.String r1 = "onStateChanged"
            r0.zze(r1, r3)     // Catch: org.json.JSONException -> L13
            return
        L13:
            r3 = move-exception
            java.lang.String r0 = "Error occurred while dispatching state change."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r3)
            return
    }
}
