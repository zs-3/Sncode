package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbdt extends androidx.browser.customtabs.CustomTabsCallback {
    private final java.util.concurrent.atomic.AtomicBoolean zza;
    private final java.util.List zzb;
    private final com.google.android.gms.internal.ads.zzbdw zzc;
    private final androidx.browser.customtabs.CustomTabsCallback zzd;
    private final com.google.android.gms.internal.ads.zzdui zze;

    zzbdt(com.google.android.gms.internal.ads.zzbdw r3, androidx.browser.customtabs.CustomTabsCallback r4, com.google.android.gms.internal.ads.zzdui r5) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.zza = r0
            r2.zzd = r4
            r2.zzc = r3
            r2.zze = r5
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzjv
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = ","
            java.lang.String[] r3 = r3.split(r4)
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.zzb = r3
            return
    }

    private final void zzb(java.lang.String r4) {
            r3 = this;
            r0 = 1
            android.util.Pair[] r0 = new android.util.Pair[r0]
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "pe"
            r1.<init>(r2, r4)
            r4 = 0
            r0[r4] = r1
            com.google.android.gms.internal.ads.zzdui r4 = r3.zze
            r1 = 0
            java.lang.String r2 = "pact_action"
            com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(r4, r1, r2, r0)
            return
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void extraCallback(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            androidx.browser.customtabs.CustomTabsCallback r0 = r1.zzd
            if (r0 == 0) goto L7
            r0.extraCallback(r2, r3)
        L7:
            return
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final android.os.Bundle extraCallbackWithResult(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            androidx.browser.customtabs.CustomTabsCallback r0 = r1.zzd
            if (r0 == 0) goto L9
            android.os.Bundle r2 = r0.extraCallbackWithResult(r2, r3)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public final void onActivityResized(int r2, int r3, android.os.Bundle r4) {
            r1 = this;
            androidx.browser.customtabs.CustomTabsCallback r0 = r1.zzd
            if (r0 == 0) goto L7
            r0.onActivityResized(r2, r3, r4)
        L7:
            return
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onMessageChannelReady(android.os.Bundle r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zza
            r1 = 0
            r0.set(r1)
            androidx.browser.customtabs.CustomTabsCallback r0 = r2.zzd
            if (r0 == 0) goto Ld
            r0.onMessageChannelReady(r3)
        Ld:
            return
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int r3, android.os.Bundle r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zza
            r1 = 0
            r0.set(r1)
            androidx.browser.customtabs.CustomTabsCallback r0 = r2.zzd
            if (r0 == 0) goto Ld
            r0.onNavigationEvent(r3, r4)
        Ld:
            com.google.android.gms.internal.ads.zzbdw r4 = r2.zzc
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.currentTimeMillis()
            r4.zzi(r0)
            com.google.android.gms.internal.ads.zzbdw r4 = r2.zzc
            if (r4 == 0) goto L36
            java.util.List r4 = r2.zzb
            if (r4 == 0) goto L36
            java.lang.String r3 = java.lang.String.valueOf(r3)
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L36
            com.google.android.gms.internal.ads.zzbdw r3 = r2.zzc
            r3.zzf()
            java.lang.String r3 = "pact_reqpmc"
            r2.zzb(r3)
        L36:
            return
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onPostMessage(java.lang.String r4, android.os.Bundle r5) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L25
            r0.<init>(r4)     // Catch: org.json.JSONException -> L25
            java.lang.String r1 = "gpa"
            r2 = -1
            int r1 = r0.optInt(r1, r2)     // Catch: org.json.JSONException -> L25
            if (r1 != 0) goto L2b
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.zza     // Catch: org.json.JSONException -> L25
            r2 = 1
            r1.set(r2)     // Catch: org.json.JSONException -> L25
            java.lang.String r1 = "pact_con"
            r3.zzb(r1)     // Catch: org.json.JSONException -> L25
            com.google.android.gms.internal.ads.zzbdw r1 = r3.zzc     // Catch: org.json.JSONException -> L25
            java.lang.String r2 = "paw_id"
            java.lang.String r0 = r0.getString(r2)     // Catch: org.json.JSONException -> L25
            r1.zzh(r0)     // Catch: org.json.JSONException -> L25
            goto L2b
        L25:
            r0 = move-exception
            java.lang.String r1 = "Message is not in JSON format: "
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r0)
        L2b:
            androidx.browser.customtabs.CustomTabsCallback r0 = r3.zzd
            if (r0 == 0) goto L32
            r0.onPostMessage(r4, r5)
        L32:
            return
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onRelationshipValidationResult(int r2, android.net.Uri r3, boolean r4, android.os.Bundle r5) {
            r1 = this;
            androidx.browser.customtabs.CustomTabsCallback r0 = r1.zzd
            if (r0 == 0) goto L7
            r0.onRelationshipValidationResult(r2, r3, r4, r5)
        L7:
            return
    }

    public final java.lang.Boolean zza() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.zza
            boolean r0 = r0.get()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }
}
