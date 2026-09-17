package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzq {
    private final int zza;
    private final long zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final java.util.Map zze;
    private final java.util.ArrayDeque zzf;
    private final java.util.ArrayDeque zzg;
    private final com.google.android.gms.internal.ads.zzdui zzh;
    private java.util.Map zzi;

    public zzq(com.google.android.gms.internal.ads.zzdui r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.zzf = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.zzg = r0
            r2.zzh = r3
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzgI
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r0.zza(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.zza = r3
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzgJ
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r0.zza(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r0 = r3.longValue()
            r2.zzb = r0
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzgN
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r0.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.zzc = r3
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzgM
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r0.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.zzd = r3
            com.google.android.gms.ads.nonagon.signalgeneration.zzo r3 = new com.google.android.gms.ads.nonagon.signalgeneration.zzo
            r3.<init>(r2)
            java.util.Map r3 = java.util.Collections.synchronizedMap(r3)
            r2.zze = r3
            return
    }

    static /* bridge */ /* synthetic */ int zza(com.google.android.gms.ads.nonagon.signalgeneration.zzq r0) {
            int r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.ArrayDeque zzc(com.google.android.gms.ads.nonagon.signalgeneration.zzq r0) {
            java.util.ArrayDeque r0 = r0.zzf
            return r0
    }

    private final synchronized void zzi(com.google.android.gms.internal.ads.zzdty r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.zzc     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L7
            monitor-exit(r4)
            return
        L7:
            java.util.ArrayDeque r0 = r4.zzg     // Catch: java.lang.Throwable -> L25
            java.util.ArrayDeque r1 = r0.clone()     // Catch: java.lang.Throwable -> L25
            r0.clear()     // Catch: java.lang.Throwable -> L25
            java.util.ArrayDeque r0 = r4.zzf     // Catch: java.lang.Throwable -> L25
            java.util.ArrayDeque r2 = r0.clone()     // Catch: java.lang.Throwable -> L25
            r0.clear()     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zza     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.ads.nonagon.signalgeneration.zzn r3 = new com.google.android.gms.ads.nonagon.signalgeneration.zzn     // Catch: java.lang.Throwable -> L25
            r3.<init>(r4, r5, r1, r2)     // Catch: java.lang.Throwable -> L25
            r0.execute(r3)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r4)
            return
        L25:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    private final void zzj(com.google.android.gms.internal.ads.zzdty r5, java.util.ArrayDeque r6, java.lang.String r7) {
            r4 = this;
        L0:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L7e
            java.lang.Object r0 = r6.poll()
            android.util.Pair r0 = (android.util.Pair) r0
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            java.util.Map r2 = r5.zzb()
            r1.<init>(r2)
            r4.zzi = r1
            java.lang.String r2 = "action"
            java.lang.String r3 = "ev"
            r1.put(r2, r3)
            java.util.Map r1 = r4.zzi
            java.lang.String r2 = "e_r"
            r1.put(r2, r7)
            java.util.Map r1 = r4.zzi
            java.lang.Object r2 = r0.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "e_id"
            r1.put(r3, r2)
            boolean r1 = r4.zzd
            if (r1 == 0) goto L76
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L59
            r1.<init>(r0)     // Catch: org.json.JSONException -> L59
            java.lang.String r0 = "request_agent"
            java.lang.String r0 = r1.getString(r0)     // Catch: org.json.JSONException -> L59
            java.lang.String r2 = "extras"
            org.json.JSONObject r1 = r1.getJSONObject(r2)     // Catch: org.json.JSONException -> L59
            java.lang.String r2 = "query_info_type"
            java.lang.String r1 = r1.getString(r2)     // Catch: org.json.JSONException -> L59
            android.util.Pair r2 = new android.util.Pair     // Catch: org.json.JSONException -> L59
            java.lang.String r1 = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(r1)     // Catch: org.json.JSONException -> L59
            r2.<init>(r1, r0)     // Catch: org.json.JSONException -> L59
            goto L60
        L59:
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r0 = ""
            r2.<init>(r0, r0)
        L60:
            java.util.Map r0 = r4.zzi
            java.lang.Object r1 = r2.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "e_type"
            zzl(r0, r3, r1)
            java.util.Map r0 = r4.zzi
            java.lang.Object r1 = r2.second
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "e_agent"
            zzl(r0, r2, r1)
        L76:
            com.google.android.gms.internal.ads.zzdui r0 = r4.zzh
            java.util.Map r1 = r4.zzi
            r0.zzf(r1)
            goto L0
        L7e:
            return
    }

    private final synchronized void zzk() {
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L5d
            long r0 = r0.currentTimeMillis()     // Catch: java.lang.Throwable -> L5d
            java.util.Map r2 = r9.zze     // Catch: java.lang.Throwable -> L5d
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L5d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r2.next()     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
            java.lang.Object r4 = r3.getValue()     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
            com.google.android.gms.ads.nonagon.signalgeneration.zzp r4 = (com.google.android.gms.ads.nonagon.signalgeneration.zzp) r4     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
            java.lang.Long r4 = r4.zza     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
            long r4 = r4.longValue()     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
            long r4 = r0 - r4
            long r6 = r9.zzb     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L4f
            java.util.ArrayDeque r4 = r9.zzg     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
            android.util.Pair r5 = new android.util.Pair     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
            java.lang.Object r6 = r3.getKey()     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
            java.lang.Object r3 = r3.getValue()     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
            com.google.android.gms.ads.nonagon.signalgeneration.zzp r3 = (com.google.android.gms.ads.nonagon.signalgeneration.zzp) r3     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
            java.lang.String r3 = r3.zzb     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
            r5.<init>(r6, r3)     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
            r4.add(r5)     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
            r2.remove()     // Catch: java.util.ConcurrentModificationException -> L51 java.lang.Throwable -> L5d
            goto L13
        L4f:
            monitor-exit(r9)
            return
        L51:
            r0 = move-exception
            java.lang.String r1 = "QueryJsonMap.removeExpiredEntries"
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L5d
            r2.zzw(r0, r1)     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r9)
            return
        L5d:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
    }

    private static final void zzl(java.util.Map r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L9
            r1.put(r2, r3)
        L9:
            return
    }

    public final synchronized java.lang.String zzb(java.lang.String r4, com.google.android.gms.internal.ads.zzdty r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.Map r0 = r3.zze     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.ads.nonagon.signalgeneration.zzp r0 = (com.google.android.gms.ads.nonagon.signalgeneration.zzp) r0     // Catch: java.lang.Throwable -> L48
            java.util.Map r1 = r5.zzb()     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = "request_id"
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzhh     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L48
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L2b
            java.util.Map r1 = r3.zze     // Catch: java.lang.Throwable -> L48
            r1.remove(r4)     // Catch: java.lang.Throwable -> L48
        L2b:
            java.lang.String r4 = r0.zzb     // Catch: java.lang.Throwable -> L48
            java.util.Map r5 = r5.zzb()     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = "mhit"
            java.lang.String r1 = "true"
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r3)
            return r4
        L3a:
            java.util.Map r4 = r5.zzb()     // Catch: java.lang.Throwable -> L48
            java.lang.String r5 = "mhit"
            java.lang.String r0 = "false"
            r4.put(r5, r0)     // Catch: java.lang.Throwable -> L48
            r4 = 0
            monitor-exit(r3)
            return r4
        L48:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized void zzd(java.lang.String r4, java.lang.String r5, com.google.android.gms.internal.ads.zzdty r6) {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.ads.nonagon.signalgeneration.zzp r0 = new com.google.android.gms.ads.nonagon.signalgeneration.zzp     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L24
            long r1 = r1.currentTimeMillis()     // Catch: java.lang.Throwable -> L24
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L24
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L24
            r2.<init>()     // Catch: java.lang.Throwable -> L24
            r0.<init>(r1, r5, r2)     // Catch: java.lang.Throwable -> L24
            java.util.Map r5 = r3.zze     // Catch: java.lang.Throwable -> L24
            r5.put(r4, r0)     // Catch: java.lang.Throwable -> L24
            r3.zzk()     // Catch: java.lang.Throwable -> L24
            r3.zzi(r6)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)
            return
        L24:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzdty r2, java.util.ArrayDeque r3, java.util.ArrayDeque r4) {
            r1 = this;
            java.lang.String r0 = "to"
            r1.zzj(r2, r3, r0)
            java.lang.String r3 = "of"
            r1.zzj(r2, r4, r3)
            return
    }

    public final synchronized void zzf(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zze     // Catch: java.lang.Throwable -> L8
            r0.remove(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized boolean zzg(java.lang.String r3, java.lang.String r4, int r5) {
            r2 = this;
            monitor-enter(r2)
            java.util.Map r0 = r2.zze     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.ads.nonagon.signalgeneration.zzp r3 = (com.google.android.gms.ads.nonagon.signalgeneration.zzp) r3     // Catch: java.lang.Throwable -> L20
            r0 = 0
            if (r3 == 0) goto L1e
            java.util.Set r1 = r3.zzc     // Catch: java.lang.Throwable -> L20
            r1.add(r4)     // Catch: java.lang.Throwable -> L20
            java.util.Set r3 = r3.zzc     // Catch: java.lang.Throwable -> L20
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L20
            if (r3 >= r5) goto L1c
            r3 = 1
            monitor-exit(r2)
            return r3
        L1c:
            monitor-exit(r2)
            return r0
        L1e:
            monitor-exit(r2)
            return r0
        L20:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized boolean zzh(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zze     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.ads.nonagon.signalgeneration.zzp r2 = (com.google.android.gms.ads.nonagon.signalgeneration.zzp) r2     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L16
            java.util.Set r2 = r2.zzc     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L16
            r2 = 1
        L14:
            monitor-exit(r1)
            return r2
        L16:
            r2 = 0
            goto L14
        L18:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
