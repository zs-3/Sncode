package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzj {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzdui zzd;
    private final java.util.concurrent.ExecutorService zze;

    zzj(android.content.Context r2, com.google.android.gms.internal.ads.zzdui r3, java.util.concurrent.ExecutorService r4) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzb = r0
            r1.zzc = r2
            r1.zzd = r3
            r1.zze = r4
            return
    }

    private final void zzh(boolean r4) {
            r3 = this;
            java.util.Map r0 = r3.zzb
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L20
            java.util.Map r0 = r3.zzb
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.put(r1, r2)
            java.util.concurrent.ExecutorService r0 = r3.zze
            com.google.android.gms.ads.nonagon.signalgeneration.zzh r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzh
            r1.<init>(r3, r4)
            r0.submit(r1)
        L20:
            return
    }

    private final void zzi(com.google.android.gms.ads.nonagon.signalgeneration.zzl r12, android.util.Pair r13, boolean r14) {
            r11 = this;
            r12.zzd()
            com.google.android.gms.ads.query.QueryInfo r0 = r12.zzb()
            if (r0 == 0) goto L11
            java.lang.Object r1 = r13.first
            com.google.android.gms.ads.query.QueryInfoGenerationCallback r1 = (com.google.android.gms.ads.query.QueryInfoGenerationCallback) r1
            r1.onSuccess(r0)
            goto L1c
        L11:
            java.lang.Object r0 = r13.first
            com.google.android.gms.ads.query.QueryInfoGenerationCallback r0 = (com.google.android.gms.ads.query.QueryInfoGenerationCallback) r0
            java.lang.String r1 = r12.zzc()
            r0.onFailure(r1)
        L1c:
            com.google.android.gms.internal.ads.zzdui r0 = r11.zzd
            r1 = 7
            android.util.Pair[] r1 = new android.util.Pair[r1]
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r3 = "se"
            java.lang.String r4 = "query_g"
            r2.<init>(r3, r4)
            r3 = 0
            r1[r3] = r2
            android.util.Pair r2 = new android.util.Pair
            com.google.android.gms.ads.AdFormat r4 = com.google.android.gms.ads.AdFormat.BANNER
            java.lang.String r4 = r4.name()
            java.lang.String r5 = "ad_format"
            r2.<init>(r5, r4)
            r4 = 1
            r1[r4] = r2
            r2 = 2
            android.util.Pair r5 = new android.util.Pair
            r6 = 6
            java.lang.String r7 = java.lang.Integer.toString(r6)
            java.lang.String r8 = "rtype"
            r5.<init>(r8, r7)
            r1[r2] = r5
            r2 = 3
            android.util.Pair r5 = new android.util.Pair
            java.lang.String r7 = "scar"
            java.lang.String r8 = "true"
            r5.<init>(r7, r8)
            r1[r2] = r5
            r2 = 4
            android.util.Pair r5 = new android.util.Pair
            com.google.android.gms.common.util.Clock r7 = com.google.android.gms.ads.internal.zzu.zzB()
            long r7 = r7.currentTimeMillis()
            java.lang.Object r13 = r13.second
            java.lang.Long r13 = (java.lang.Long) r13
            long r9 = r13.longValue()
            long r7 = r7 - r9
            java.lang.String r13 = java.lang.Long.toString(r7)
            java.lang.String r7 = "lat_ms"
            r5.<init>(r7, r13)
            r1[r2] = r5
            r13 = 5
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r14 = java.lang.Boolean.toString(r14)
            java.lang.String r5 = "sgpc_h"
            r2.<init>(r5, r14)
            r1[r13] = r2
            android.util.Pair r13 = new android.util.Pair
            com.google.android.gms.ads.query.QueryInfo r12 = r12.zzb()
            if (r12 == 0) goto L8e
            r3 = 1
        L8e:
            java.lang.String r12 = java.lang.Boolean.toString(r3)
            java.lang.String r14 = "sgpc_rs"
            r13.<init>(r14, r12)
            r1[r6] = r13
            r12 = 0
            java.lang.String r13 = "sgpcr"
            com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(r0, r12, r13, r1)
            return
    }

    private final synchronized void zzj(boolean r8, boolean r9) {
            r7 = this;
            monitor-enter(r7)
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L85
            r0.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = "query_info_type"
            java.lang.String r2 = "requester_type_6"
            r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = "accept_3p_cookie"
            r0.putBoolean(r1, r8)     // Catch: java.lang.Throwable -> L85
            java.util.Map r1 = r7.zza     // Catch: java.lang.Throwable -> L85
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.ads.nonagon.signalgeneration.zzl r1 = (com.google.android.gms.ads.nonagon.signalgeneration.zzl) r1     // Catch: java.lang.Throwable -> L85
            r3 = 0
            if (r9 == 0) goto L2c
            if (r1 != 0) goto L24
            goto L2c
        L24:
            int r9 = r1.zza()     // Catch: java.lang.Throwable -> L85
            int r3 = r9 + 1
            r4 = r3
            goto L2d
        L2c:
            r4 = 0
        L2d:
            java.util.Map r9 = r7.zza     // Catch: java.lang.Throwable -> L85
            java.lang.Object r9 = r9.get(r2)     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.ads.nonagon.signalgeneration.zzl r9 = (com.google.android.gms.ads.nonagon.signalgeneration.zzl) r9     // Catch: java.lang.Throwable -> L85
            if (r9 != 0) goto L3a
            r9 = 0
        L38:
            r5 = r9
            goto L43
        L3a:
            boolean r9 = r9.zzf()     // Catch: java.lang.Throwable -> L85
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L85
            goto L38
        L43:
            com.google.android.gms.internal.ads.zzdui r6 = r7.zzd     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.ads.nonagon.signalgeneration.zzk r9 = new com.google.android.gms.ads.nonagon.signalgeneration.zzk     // Catch: java.lang.Throwable -> L85
            r1 = r9
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.ads.AdRequest$Builder r8 = new com.google.android.gms.ads.AdRequest$Builder     // Catch: java.lang.Throwable -> L85
            r8.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r1 = com.google.ads.mediation.admob.AdMobAdapter.class
            com.google.android.gms.ads.AbstractAdRequestBuilder r8 = r8.addNetworkExtrasBundle(r1, r0)     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.ads.AdRequest$Builder r8 = (com.google.android.gms.ads.AdRequest.Builder) r8     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.ads.AdRequest r8 = r8.build()     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkJ     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L85
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L7c
            java.util.concurrent.ExecutorService r0 = r7.zze     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.ads.nonagon.signalgeneration.zzi r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzi     // Catch: java.lang.Throwable -> L85
            r1.<init>(r7, r8, r9)     // Catch: java.lang.Throwable -> L85
            r0.submit(r1)     // Catch: java.lang.Throwable -> L85
            monitor-exit(r7)
            return
        L7c:
            android.content.Context r0 = r7.zzc     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.ads.AdFormat r1 = com.google.android.gms.ads.AdFormat.BANNER     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.ads.query.QueryInfo.generate(r0, r1, r8, r9)     // Catch: java.lang.Throwable -> L85
            monitor-exit(r7)
            return
        L85:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    final /* synthetic */ java.lang.Object zza(com.google.android.gms.ads.AdRequest r3, com.google.android.gms.ads.nonagon.signalgeneration.zzk r4) throws java.lang.Exception {
            r2 = this;
            android.content.Context r0 = r2.zzc
            com.google.android.gms.ads.AdFormat r1 = com.google.android.gms.ads.AdFormat.BANNER
            com.google.android.gms.ads.query.QueryInfo.generate(r0, r1, r3, r4)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
    }

    public final synchronized void zzb() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.zzh(r0)     // Catch: java.lang.Throwable -> Lb
            r0 = 0
            r1.zzh(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    final /* synthetic */ void zzc(boolean r2) {
            r1 = this;
            r0 = 0
            r1.zzj(r2, r0)
            return
    }

    final /* synthetic */ void zzd(boolean r1, boolean r2) {
            r0 = this;
            r0.zzj(r1, r2)
            return
    }

    final /* synthetic */ void zze(java.lang.Object r4, android.util.Pair r5) {
            r3 = this;
            boolean r0 = r4 instanceof android.webkit.WebView
            r1 = 0
            if (r0 != 0) goto L6
            goto L19
        L6:
            android.content.Context r0 = r3.zzc
            com.google.android.gms.ads.internal.util.zzab r2 = com.google.android.gms.ads.internal.zzu.zzq()
            android.webkit.CookieManager r0 = r2.zza(r0)
            if (r0 != 0) goto L13
            goto L19
        L13:
            android.webkit.WebView r4 = (android.webkit.WebView) r4
            boolean r1 = r0.acceptThirdPartyCookies(r4)
        L19:
            java.util.Map r4 = r3.zza
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r4 = r4.get(r0)
            com.google.android.gms.ads.nonagon.signalgeneration.zzl r4 = (com.google.android.gms.ads.nonagon.signalgeneration.zzl) r4
            if (r4 == 0) goto L33
            boolean r1 = r4.zze()
            if (r1 == 0) goto L2e
            goto L33
        L2e:
            r0 = 1
            r3.zzi(r4, r5, r0)
            return
        L33:
            java.util.Map r4 = r3.zzb
            java.lang.Object r4 = r4.get(r0)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L47
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Map r1 = r3.zzb
            r1.put(r0, r4)
        L47:
            r4.add(r5)
            return
    }

    final synchronized void zzf(boolean r9, com.google.android.gms.ads.nonagon.signalgeneration.zzl r10) {
            r8 = this;
            monitor-enter(r8)
            java.util.Map r0 = r8.zza     // Catch: java.lang.Throwable -> L8b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.ads.nonagon.signalgeneration.zzl r0 = (com.google.android.gms.ads.nonagon.signalgeneration.zzl) r0     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L21
            boolean r2 = r0.zze()     // Catch: java.lang.Throwable -> L8b
            if (r2 != 0) goto L21
            com.google.android.gms.ads.query.QueryInfo r0 = r0.zzb()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L21
            com.google.android.gms.ads.query.QueryInfo r0 = r10.zzb()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L26
        L21:
            java.util.Map r0 = r8.zza     // Catch: java.lang.Throwable -> L8b
            r0.put(r1, r10)     // Catch: java.lang.Throwable -> L8b
        L26:
            com.google.android.gms.ads.query.QueryInfo r0 = r10.zzb()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L39
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjy     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L8b
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L8b
            goto L45
        L39:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjz     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L8b
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L8b
        L45:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.ads.query.QueryInfo r2 = r10.zzb()     // Catch: java.lang.Throwable -> L8b
            r3 = 0
            if (r2 != 0) goto L52
            r2 = 1
            goto L53
        L52:
            r2 = 0
        L53:
            java.util.concurrent.ScheduledExecutorService r4 = com.google.android.gms.internal.ads.zzcan.zzd     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.ads.nonagon.signalgeneration.zzg r5 = new com.google.android.gms.ads.nonagon.signalgeneration.zzg     // Catch: java.lang.Throwable -> L8b
            r5.<init>(r8, r9, r2)     // Catch: java.lang.Throwable -> L8b
            long r6 = (long) r0     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L8b
            r4.schedule(r5, r6, r9)     // Catch: java.lang.Throwable -> L8b
            java.util.Map r9 = r8.zzb     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r9 = r9.get(r1)     // Catch: java.lang.Throwable -> L8b
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L8b
            java.util.Map r0 = r8.zzb     // Catch: java.lang.Throwable -> L8b
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8b
            r2.<init>()     // Catch: java.lang.Throwable -> L8b
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8b
            if (r9 != 0) goto L75
            goto L89
        L75:
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L8b
        L79:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L89
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L8b
            android.util.Pair r0 = (android.util.Pair) r0     // Catch: java.lang.Throwable -> L8b
            r8.zzi(r10, r0, r3)     // Catch: java.lang.Throwable -> L8b
            goto L79
        L89:
            monitor-exit(r8)
            return
        L8b:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    public final synchronized void zzg(java.lang.Object r4, com.google.android.gms.ads.query.QueryInfoGenerationCallback r5) {
            r3 = this;
            monitor-enter(r3)
            android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L1e
            long r1 = r1.currentTimeMillis()     // Catch: java.lang.Throwable -> L1e
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzgfz r5 = com.google.android.gms.internal.ads.zzcan.zze     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.ads.nonagon.signalgeneration.zzf r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzf     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r3, r4, r0)     // Catch: java.lang.Throwable -> L1e
            r5.execute(r1)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r3)
            return
        L1e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }
}
