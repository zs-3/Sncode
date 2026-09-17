package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbvw extends com.google.android.gms.internal.ads.zzbvu {
    private final java.lang.Object zza;
    private final android.content.Context zzb;
    private android.content.SharedPreferences zzc;
    private final com.google.android.gms.internal.ads.zzbod zzd;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zze;

    public zzbvw(android.content.Context r2, com.google.android.gms.internal.ads.zzbod r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            android.content.Context r2 = r2.getApplicationContext()
            r1.zzb = r2
            r1.zze = r4
            r1.zzd = r3
            return
    }

    public static org.json.JSONObject zzc(android.content.Context r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzber.zzb     // Catch: org.json.JSONException -> L63
            java.lang.Object r1 = r1.zze()     // Catch: org.json.JSONException -> L63
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: org.json.JSONException -> L63
            boolean r1 = r1.booleanValue()     // Catch: org.json.JSONException -> L63
            if (r1 == 0) goto L1c
            java.lang.String r1 = "package_name"
            java.lang.String r2 = r3.getPackageName()     // Catch: org.json.JSONException -> L63
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L63
        L1c:
            java.lang.String r1 = "js"
            java.lang.String r4 = r4.afmaVersion     // Catch: org.json.JSONException -> L63
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L63
            java.lang.String r4 = "mf"
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzber.zzc     // Catch: org.json.JSONException -> L63
            java.lang.Object r1 = r1.zze()     // Catch: org.json.JSONException -> L63
            r0.put(r4, r1)     // Catch: org.json.JSONException -> L63
            java.lang.String r4 = "cl"
            java.lang.String r1 = "679313570"
            r0.put(r4, r1)     // Catch: org.json.JSONException -> L63
            java.lang.String r4 = "rapid_rc"
            java.lang.String r1 = "dev"
            r0.put(r4, r1)     // Catch: org.json.JSONException -> L63
            java.lang.String r4 = "rapid_rollup"
            java.lang.String r1 = "HEAD"
            r0.put(r4, r1)     // Catch: org.json.JSONException -> L63
            java.lang.String r4 = "admob_module_version"
            r1 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r0.put(r4, r1)     // Catch: org.json.JSONException -> L63
            java.lang.String r4 = "dynamite_local_version"
            r2 = 243220703(0xe7f40df, float:3.1462411E-30)
            r0.put(r4, r2)     // Catch: org.json.JSONException -> L63
            java.lang.String r4 = "dynamite_version"
            java.lang.String r2 = "com.google.android.gms.ads.dynamite"
            int r3 = com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(r3, r2)     // Catch: org.json.JSONException -> L63
            r0.put(r4, r3)     // Catch: org.json.JSONException -> L63
            java.lang.String r3 = "container_version"
            r0.put(r3, r1)     // Catch: org.json.JSONException -> L63
        L63:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final com.google.common.util.concurrent.ListenableFuture zza() {
            r5 = this;
            java.lang.Object r0 = r5.zza
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r5.zzc     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            goto L15
        L9:
            android.content.Context r1 = r5.zzb     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "google_ads_flags_meta"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)     // Catch: java.lang.Throwable -> L5b
            r5.zzc = r1     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
        L15:
            android.content.SharedPreferences r0 = r5.zzc
            r1 = 0
            if (r0 != 0) goto L1c
            goto L22
        L1c:
            java.lang.String r3 = "js_last_update"
            long r1 = r0.getLong(r3, r1)
        L22:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r3 = r0.currentTimeMillis()
            long r3 = r3 - r1
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzber.zzd
            java.lang.Object r0 = r0.zze()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L41
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
        L41:
            android.content.Context r0 = r5.zzb
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r5.zze
            com.google.android.gms.internal.ads.zzbod r2 = r5.zzd
            org.json.JSONObject r0 = zzc(r0, r1)
            com.google.common.util.concurrent.ListenableFuture r0 = r2.zzb(r0)
            com.google.android.gms.internal.ads.zzbvv r1 = new com.google.android.gms.internal.ads.zzbvv
            r1.<init>(r5)
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r2)
            return r0
        L5b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r1
    }

    final /* synthetic */ java.lang.Void zzb(org.json.JSONObject r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zza
            com.google.android.gms.ads.internal.client.zzbe.zzb()
            android.content.Context r0 = r3.zzb
            android.content.SharedPreferences r0 = com.google.android.gms.internal.ads.zzbco.zza(r0)
            if (r0 != 0) goto Le
            goto L3e
        Le:
            android.content.SharedPreferences$Editor r0 = r0.edit()
            com.google.android.gms.ads.internal.client.zzbe.zza()
            int r1 = com.google.android.gms.internal.ads.zzbeh.zza
            com.google.android.gms.internal.ads.zzbcn r1 = com.google.android.gms.ads.internal.client.zzbe.zza()
            r2 = 1
            r1.zze(r0, r2, r4)
            com.google.android.gms.ads.internal.client.zzbe.zzb()
            r0.commit()
            android.content.SharedPreferences r4 = r3.zzc
            if (r4 == 0) goto L3e
            android.content.SharedPreferences$Editor r4 = r4.edit()
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.currentTimeMillis()
            java.lang.String r2 = "js_last_update"
            android.content.SharedPreferences$Editor r4 = r4.putLong(r2, r0)
            r4.apply()
        L3e:
            r4 = 0
            return r4
    }
}
