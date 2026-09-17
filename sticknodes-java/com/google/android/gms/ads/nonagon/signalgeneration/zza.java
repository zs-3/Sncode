package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zza {
    private final android.content.Context zza;
    private final android.content.pm.ApplicationInfo zzb;
    private final java.util.List zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final org.json.JSONObject zze;
    private final java.util.concurrent.atomic.AtomicBoolean zzf;

    zza(android.content.Context r2, com.google.android.gms.internal.ads.zzbce r3, java.util.List r4, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r5) {
            r1 = this;
            r1.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r1.zze = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r3.<init>(r0)
            r1.zzf = r3
            r1.zza = r2
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            r1.zzb = r2
            r1.zzc = r4
            r1.zzd = r5
            return
    }

    public final org.json.JSONObject zza() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.zzf
            boolean r0 = r0.get()
            if (r0 != 0) goto Lb
            r1.zzb()
        Lb:
            org.json.JSONObject r0 = r1.zze
            return r0
    }

    public final void zzb() {
            r9 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.zzf
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lb
            goto Lac
        Lb:
            r0 = 0
            r1 = 0
            android.content.pm.ApplicationInfo r2 = r9.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            if (r2 == 0) goto L21
            android.content.Context r2 = r9.zza     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            com.google.android.gms.common.wrappers.PackageManagerWrapper r2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            android.content.pm.ApplicationInfo r3 = r9.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            goto L21
        L20:
        L21:
            if (r1 == 0) goto L35
            org.json.JSONObject r2 = r9.zze     // Catch: org.json.JSONException -> Lad
            java.lang.String r3 = "vc"
            int r4 = r1.versionCode     // Catch: org.json.JSONException -> Lad
            r2.put(r3, r4)     // Catch: org.json.JSONException -> Lad
            org.json.JSONObject r2 = r9.zze     // Catch: org.json.JSONException -> Lad
            java.lang.String r3 = "vnm"
            java.lang.String r1 = r1.versionName     // Catch: org.json.JSONException -> Lad
            r2.put(r3, r1)     // Catch: org.json.JSONException -> Lad
        L35:
            android.content.pm.ApplicationInfo r1 = r9.zzb     // Catch: org.json.JSONException -> Lad
            if (r1 == 0) goto L42
            org.json.JSONObject r2 = r9.zze     // Catch: org.json.JSONException -> Lad
            java.lang.String r3 = "pn"
            java.lang.String r1 = r1.packageName     // Catch: org.json.JSONException -> Lad
            r2.put(r3, r1)     // Catch: org.json.JSONException -> Lad
        L42:
            org.json.JSONObject r1 = r9.zze     // Catch: org.json.JSONException -> Lad
            java.lang.String r2 = "eid"
            java.util.List r3 = r9.zzc     // Catch: org.json.JSONException -> Lad
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: org.json.JSONException -> Lad
            r4.<init>()     // Catch: org.json.JSONException -> Lad
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzjq     // Catch: org.json.JSONException -> Lad
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> Lad
            java.lang.Object r5 = r6.zza(r5)     // Catch: org.json.JSONException -> Lad
            java.lang.String r5 = (java.lang.String) r5     // Catch: org.json.JSONException -> Lad
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r5 = r5.split(r6, r7)     // Catch: org.json.JSONException -> Lad
            int r6 = r5.length     // Catch: org.json.JSONException -> Lad
        L61:
            if (r0 >= r6) goto L71
            r7 = r5[r0]     // Catch: org.json.JSONException -> Lad
            boolean r8 = r3.contains(r7)     // Catch: org.json.JSONException -> Lad
            if (r8 == 0) goto L6e
            r4.add(r7)     // Catch: org.json.JSONException -> Lad
        L6e:
            int r0 = r0 + 1
            goto L61
        L71:
            r1.put(r2, r4)     // Catch: org.json.JSONException -> Lad
            org.json.JSONObject r0 = r9.zze     // Catch: org.json.JSONException -> Lad
            java.lang.String r1 = "js"
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r9.zzd     // Catch: org.json.JSONException -> Lad
            java.lang.String r2 = r2.afmaVersion     // Catch: org.json.JSONException -> Lad
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lad
            org.json.JSONObject r0 = r9.zze     // Catch: org.json.JSONException -> Lad
            java.util.Iterator r0 = r0.keys()     // Catch: org.json.JSONException -> Lad
        L85:
            boolean r1 = r0.hasNext()     // Catch: org.json.JSONException -> Lad
            if (r1 == 0) goto Lac
            java.lang.Object r1 = r0.next()     // Catch: org.json.JSONException -> Lad
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> Lad
            org.json.JSONObject r2 = r9.zze     // Catch: org.json.JSONException -> Lad
            java.lang.Object r2 = r2.get(r1)     // Catch: org.json.JSONException -> Lad
            if (r2 == 0) goto L85
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> Lad
            byte[] r2 = r2.getBytes()     // Catch: org.json.JSONException -> Lad
            r3 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch: org.json.JSONException -> Lad
            org.json.JSONObject r3 = r9.zze     // Catch: org.json.JSONException -> Lad
            r3.put(r1, r2)     // Catch: org.json.JSONException -> Lad
            goto L85
        Lac:
            return
        Lad:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "PawAppSignalGenerator.initialize"
            r1.zzw(r0, r2)
            return
    }
}
