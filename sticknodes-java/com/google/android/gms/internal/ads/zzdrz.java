package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdrz {
    private final java.util.Map zza;
    private org.json.JSONObject zzb;
    private final java.util.concurrent.Executor zzc;
    private boolean zzd;
    private org.json.JSONObject zze;
    private final java.util.concurrent.atomic.AtomicBoolean zzf;

    public zzdrz(java.util.concurrent.Executor r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.zza = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.zzf = r0
            r2.zzc = r3
            return
    }

    public static /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzdrz r0) {
            r0.zzh()
            return
    }

    private final void zzg() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzf
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto L19
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()
            com.google.android.gms.internal.ads.zzdry r1 = new com.google.android.gms.internal.ads.zzdry
            r1.<init>(r2)
            r0.zzr(r1)
        L19:
            return
    }

    private final synchronized void zzh() {
            r7 = this;
            monitor-enter(r7)
            r0 = 1
            r7.zzd = r0     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzbzx r0 = r0.zzh()     // Catch: java.lang.Throwable -> L90
            if (r0 != 0) goto L14
            goto L8e
        L14:
            org.json.JSONObject r0 = r0.zzf()     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L8e
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzdX     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L90
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L90
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L33
            java.lang.String r1 = "common_settings"
            org.json.JSONObject r1 = r0.optJSONObject(r1)     // Catch: java.lang.Throwable -> L90
            goto L34
        L33:
            r1 = 0
        L34:
            r7.zzb = r1     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = "ad_unit_patterns"
            org.json.JSONObject r1 = r0.optJSONObject(r1)     // Catch: java.lang.Throwable -> L90
            r7.zze = r1     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = "ad_unit_id_settings"
            org.json.JSONArray r0 = r0.optJSONArray(r1)     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L8e
            r1 = 0
        L47:
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L90
            if (r1 >= r2) goto L8e
            org.json.JSONObject r2 = r0.optJSONObject(r1)     // Catch: java.lang.Throwable -> L90
            if (r2 != 0) goto L54
            goto L8b
        L54:
            java.lang.String r3 = "ad_unit_id"
            java.lang.String r3 = r2.optString(r3)     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = "format"
            java.lang.String r4 = r2.optString(r4)     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = "request_signals"
            org.json.JSONObject r2 = r2.optJSONObject(r5)     // Catch: java.lang.Throwable -> L90
            if (r3 == 0) goto L8b
            if (r2 == 0) goto L8b
            if (r4 == 0) goto L8b
            java.util.Map r5 = r7.zza     // Catch: java.lang.Throwable -> L90
            boolean r5 = r5.containsKey(r4)     // Catch: java.lang.Throwable -> L90
            if (r5 == 0) goto L7d
            java.util.Map r5 = r7.zza     // Catch: java.lang.Throwable -> L90
            java.lang.Object r4 = r5.get(r4)     // Catch: java.lang.Throwable -> L90
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Throwable -> L90
            goto L88
        L7d:
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L90
            r5.<init>()     // Catch: java.lang.Throwable -> L90
            java.util.Map r6 = r7.zza     // Catch: java.lang.Throwable -> L90
            r6.put(r4, r5)     // Catch: java.lang.Throwable -> L90
            r4 = r5
        L88:
            r4.put(r3, r2)     // Catch: java.lang.Throwable -> L90
        L8b:
            int r1 = r1 + 1
            goto L47
        L8e:
            monitor-exit(r7)
            return
        L90:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
    }

    public final org.json.JSONObject zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdX
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L14
            r0 = 0
            return r0
        L14:
            org.json.JSONObject r0 = r2.zzb
            return r0
    }

    public final org.json.JSONObject zzb(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdV
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            goto L55
        L13:
            if (r3 == 0) goto L55
            if (r4 == 0) goto L55
            boolean r0 = r2.zzd
            if (r0 != 0) goto L33
            r2.zzh()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdW
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L33
            r2.zzg()
        L33:
            java.util.Map r0 = r2.zza
            java.lang.Object r0 = r0.get(r4)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L55
            java.lang.Object r1 = r0.get(r3)
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto L46
            return r1
        L46:
            org.json.JSONObject r1 = r2.zze
            java.lang.String r3 = com.google.android.gms.internal.ads.zzdsb.zza(r1, r3, r4)
            if (r3 == 0) goto L55
            java.lang.Object r3 = r0.get(r3)
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            return r3
        L55:
            r3 = 0
            return r3
    }

    public final void zzd() {
            r2 = this;
            r2.zzg()
            com.google.android.gms.internal.ads.zzdrw r0 = new com.google.android.gms.internal.ads.zzdrw
            r0.<init>(r2)
            java.util.concurrent.Executor r1 = r2.zzc
            r1.execute(r0)
            return
    }

    final /* synthetic */ void zze() {
            r0 = this;
            r0.zzh()
            return
    }

    final /* synthetic */ void zzf() {
            r2 = this;
            com.google.android.gms.internal.ads.zzdrx r0 = new com.google.android.gms.internal.ads.zzdrx
            r0.<init>(r2)
            java.util.concurrent.Executor r1 = r2.zzc
            r1.execute(r0)
            return
    }
}
