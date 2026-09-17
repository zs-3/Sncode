package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbnz {
    private final java.lang.Object zza;
    private final android.content.Context zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final com.google.android.gms.internal.ads.zzfmd zze;
    private final com.google.android.gms.ads.internal.util.zzbd zzf;
    private final com.google.android.gms.ads.internal.util.zzbd zzg;
    private com.google.android.gms.internal.ads.zzbny zzh;
    private int zzi;

    public zzbnz(android.content.Context r2, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3, java.lang.String r4, com.google.android.gms.ads.internal.util.zzbd r5, com.google.android.gms.ads.internal.util.zzbd r6, com.google.android.gms.internal.ads.zzfmd r7) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            r0 = 1
            r1.zzi = r0
            r1.zzc = r4
            android.content.Context r2 = r2.getApplicationContext()
            r1.zzb = r2
            r1.zzd = r3
            r1.zze = r7
            r1.zzf = r5
            r1.zzg = r6
            return
    }

    static /* bridge */ /* synthetic */ int zza(com.google.android.gms.internal.ads.zzbnz r0) {
            int r0 = r0.zzi
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzbny zzc(com.google.android.gms.internal.ads.zzbnz r0) {
            com.google.android.gms.internal.ads.zzbny r0 = r0.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfmd zze(com.google.android.gms.internal.ads.zzbnz r0) {
            com.google.android.gms.internal.ads.zzfmd r0 = r0.zze
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object zzf(com.google.android.gms.internal.ads.zzbnz r0) {
            java.lang.Object r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzbnz r0, com.google.android.gms.internal.ads.zzbny r1) {
            r0.zzh = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzbnz r0, int r1) {
            r0.zzi = r1
            return
    }

    public final com.google.android.gms.internal.ads.zzbnt zzb(com.google.android.gms.internal.ads.zzavn r5) {
            r4 = this;
            java.lang.String r5 = "getEngine: Trying to acquire lock"
            com.google.android.gms.ads.internal.util.zze.zza(r5)
            java.lang.Object r5 = r4.zza
            monitor-enter(r5)
            java.lang.String r0 = "getEngine: Lock acquired"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "refreshIfDestroyed: Trying to acquire lock"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r4.zza     // Catch: java.lang.Throwable -> L8e
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = "refreshIfDestroyed: Lock acquired"
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.internal.ads.zzbny r1 = r4.zzh     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L2f
            int r2 = r4.zzi     // Catch: java.lang.Throwable -> L8b
            if (r2 != 0) goto L2f
            com.google.android.gms.internal.ads.zzbnf r2 = new com.google.android.gms.internal.ads.zzbnf     // Catch: java.lang.Throwable -> L8b
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.internal.ads.zzbng r3 = new com.google.android.gms.internal.ads.zzbng     // Catch: java.lang.Throwable -> L8b
            r3.<init>()     // Catch: java.lang.Throwable -> L8b
            r1.zzj(r2, r3)     // Catch: java.lang.Throwable -> L8b
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "refreshIfDestroyed: Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzbny r0 = r4.zzh     // Catch: java.lang.Throwable -> L8e
            r1 = 0
            r2 = 2
            if (r0 == 0) goto L76
            int r0 = r0.zze()     // Catch: java.lang.Throwable -> L8e
            r3 = -1
            if (r0 != r3) goto L43
            goto L76
        L43:
            int r0 = r4.zzi     // Catch: java.lang.Throwable -> L8e
            if (r0 != 0) goto L54
            java.lang.String r0 = "getEngine (NO_UPDATE): Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzbny r0 = r4.zzh     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzbnt r0 = r0.zza()     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8e
            return r0
        L54:
            r3 = 1
            if (r0 != r3) goto L69
            r4.zzi = r2     // Catch: java.lang.Throwable -> L8e
            r4.zzd(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "getEngine (PENDING_UPDATE): Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzbny r0 = r4.zzh     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzbnt r0 = r0.zza()     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8e
            return r0
        L69:
            java.lang.String r0 = "getEngine (UPDATING): Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzbny r0 = r4.zzh     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzbnt r0 = r0.zza()     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8e
            return r0
        L76:
            r4.zzi = r2     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzbny r0 = r4.zzd(r1)     // Catch: java.lang.Throwable -> L8e
            r4.zzh = r0     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "getEngine (NULL or REJECTED): Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzbny r0 = r4.zzh     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzbnt r0 = r0.zza()     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8e
            return r0
        L8b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            throw r1     // Catch: java.lang.Throwable -> L8e
        L8e:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8e
            throw r0
    }

    protected final com.google.android.gms.internal.ads.zzbny zzd(com.google.android.gms.internal.ads.zzavn r5) {
            r4 = this;
            android.content.Context r5 = r4.zzb
            r0 = 6
            com.google.android.gms.internal.ads.zzflp r5 = com.google.android.gms.internal.ads.zzflo.zza(r5, r0)
            r5.zzi()
            com.google.android.gms.internal.ads.zzbny r0 = new com.google.android.gms.internal.ads.zzbny
            com.google.android.gms.ads.internal.util.zzbd r1 = r4.zzg
            r0.<init>(r1)
            java.lang.String r1 = "loadJavascriptEngine > Before UI_THREAD_EXECUTOR"
            com.google.android.gms.ads.internal.util.zze.zza(r1)
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zze
            com.google.android.gms.internal.ads.zzbnj r2 = new com.google.android.gms.internal.ads.zzbnj
            r3 = 0
            r2.<init>(r4, r3, r0)
            r1.execute(r2)
            java.lang.String r1 = "loadNewJavascriptEngine: Promise created"
            com.google.android.gms.ads.internal.util.zze.zza(r1)
            com.google.android.gms.internal.ads.zzbno r1 = new com.google.android.gms.internal.ads.zzbno
            r1.<init>(r4, r0, r5)
            com.google.android.gms.internal.ads.zzbnp r2 = new com.google.android.gms.internal.ads.zzbnp
            r2.<init>(r4, r0, r5)
            r0.zzj(r1, r2)
            return r0
    }

    final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzbny r5, com.google.android.gms.internal.ads.zzbmu r6, java.util.ArrayList r7, long r8) {
            r4 = this;
            java.lang.String r0 = "loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            java.lang.Object r0 = r4.zza
            monitor-enter(r0)
            java.lang.String r1 = "loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired"
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> Lb9
            int r1 = r5.zze()     // Catch: java.lang.Throwable -> Lb9
            r2 = -1
            if (r1 == r2) goto Lb2
            int r1 = r5.zze()     // Catch: java.lang.Throwable -> Lb9
            r2 = 1
            if (r1 != r2) goto L1d
            goto Lb2
        L1d:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzho     // Catch: java.lang.Throwable -> Lb9
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lb9
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lb9
            if (r1 == 0) goto L3c
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r2 = "Unable to receive /jsLoaded GMSG."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r2 = "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener"
            r5.zzh(r1, r2)     // Catch: java.lang.Throwable -> Lb9
            goto L3f
        L3c:
            r5.zzg()     // Catch: java.lang.Throwable -> Lb9
        L3f:
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zze     // Catch: java.lang.Throwable -> Lb9
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.Throwable -> Lb9
            com.google.android.gms.internal.ads.zzbnh r2 = new com.google.android.gms.internal.ads.zzbnh     // Catch: java.lang.Throwable -> Lb9
            r2.<init>(r6)     // Catch: java.lang.Throwable -> Lb9
            r1.execute(r2)     // Catch: java.lang.Throwable -> Lb9
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzb     // Catch: java.lang.Throwable -> Lb9
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r6 = r1.zza(r6)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Lb9
            int r5 = r5.zze()     // Catch: java.lang.Throwable -> Lb9
            int r1 = r4.zzi     // Catch: java.lang.Throwable -> Lb9
            r2 = 0
            java.lang.Object r7 = r7.get(r2)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> Lb9
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> Lb9
            long r2 = r2.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb9
            long r2 = r2 - r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb9
            r8.<init>()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r9 = "Could not receive /jsLoaded in "
            r8.append(r9)     // Catch: java.lang.Throwable -> Lb9
            r8.append(r6)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r6 = " ms. JS engine session reference status(onEngLoadedTimeout) is "
            r8.append(r6)     // Catch: java.lang.Throwable -> Lb9
            r8.append(r5)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = ". Update status(onEngLoadedTimeout) is "
            r8.append(r5)     // Catch: java.lang.Throwable -> Lb9
            r8.append(r1)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is "
            r8.append(r5)     // Catch: java.lang.Throwable -> Lb9
            r8.append(r7)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = " ms. Total latency(onEngLoadedTimeout) is "
            r8.append(r5)     // Catch: java.lang.Throwable -> Lb9
            r8.append(r2)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = " ms. Rejecting."
            r8.append(r5)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> Lb9
            com.google.android.gms.ads.internal.util.zze.zza(r5)     // Catch: java.lang.Throwable -> Lb9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = "loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r5)
            return
        Lb2:
            java.lang.String r5 = "loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled"
            com.google.android.gms.ads.internal.util.zze.zza(r5)     // Catch: java.lang.Throwable -> Lb9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb9
            return
        Lb9:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb9
            throw r5
    }

    final /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzavn r13, com.google.android.gms.internal.ads.zzbny r14) {
            r12 = this;
            com.google.android.gms.common.util.Clock r13 = com.google.android.gms.ads.internal.zzu.zzB()
            long r7 = r13.currentTimeMillis()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.String r0 = "loadJavascriptEngine > Before createJavascriptEngine"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> Ld7
            android.content.Context r0 = r12.zzb     // Catch: java.lang.Throwable -> Ld7
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r12.zzd     // Catch: java.lang.Throwable -> Ld7
            com.google.android.gms.internal.ads.zzbnc r9 = new com.google.android.gms.internal.ads.zzbnc     // Catch: java.lang.Throwable -> Ld7
            r10 = 0
            r9.<init>(r0, r1, r10, r10)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = "loadJavascriptEngine > After createJavascriptEngine"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = "loadJavascriptEngine > Before setting new engine loaded listener"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            com.google.android.gms.internal.ads.zzbni r11 = new com.google.android.gms.internal.ads.zzbni
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r7
            r5 = r14
            r6 = r9
            r0.<init>(r1, r2, r3, r5, r6)
            r9.zzk(r11)
            java.lang.String r0 = "loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            com.google.android.gms.internal.ads.zzbnk r6 = new com.google.android.gms.internal.ads.zzbnk
            r0 = r6
            r2 = r7
            r4 = r14
            r5 = r9
            r0.<init>(r1, r2, r4, r5)
            java.lang.String r0 = "/jsLoaded"
            r9.zzq(r0, r6)
            com.google.android.gms.ads.internal.util.zzby r0 = new com.google.android.gms.ads.internal.util.zzby
            r0.<init>()
            com.google.android.gms.internal.ads.zzbnl r1 = new com.google.android.gms.internal.ads.zzbnl
            r1.<init>(r12, r10, r9, r0)
            r0.zzb(r1)
            java.lang.String r0 = "loadJavascriptEngine > Before registering GmsgHandler for /requestReload"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            java.lang.String r0 = "/requestReload"
            r9.zzq(r0, r1)
            java.lang.String r0 = r12.zzc
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "loadJavascriptEngine > javascriptPath: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            java.lang.String r0 = r12.zzc
            java.lang.String r1 = ".js"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L87
            java.lang.String r0 = "loadJavascriptEngine > Before newEngine.loadJavascript"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            java.lang.String r0 = r12.zzc
            r9.zzh(r0)
            java.lang.String r0 = "loadJavascriptEngine > After newEngine.loadJavascript"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            goto Lb0
        L87:
            java.lang.String r0 = r12.zzc
            java.lang.String r1 = "<html>"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto La1
            java.lang.String r0 = "loadJavascriptEngine > Before newEngine.loadHtml"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            java.lang.String r0 = r12.zzc
            r9.zzf(r0)
            java.lang.String r0 = "loadJavascriptEngine > After newEngine.loadHtml"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            goto Lb0
        La1:
            java.lang.String r0 = "loadJavascriptEngine > Before newEngine.loadHtmlWrapper"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            java.lang.String r0 = r12.zzc
            r9.zzg(r0)
            java.lang.String r0 = "loadJavascriptEngine > After newEngine.loadHtmlWrapper"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
        Lb0:
            java.lang.String r0 = "loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            com.google.android.gms.internal.ads.zzfun r10 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzbnn r11 = new com.google.android.gms.internal.ads.zzbnn
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r9
            r4 = r13
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.internal.ads.zzbcm r13 = com.google.android.gms.internal.ads.zzbcv.zzc
            com.google.android.gms.internal.ads.zzbct r14 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r13 = r14.zza(r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            long r13 = (long) r13
            r10.postDelayed(r11, r13)
            return
        Ld7:
            r13 = move-exception
            java.lang.String r0 = "Error creating webview."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r13)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzho
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lf5
            java.lang.String r0 = "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine"
            r14.zzh(r13, r0)
            return
        Lf5:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhq
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "SdkJavascriptFactory.loadJavascriptEngine"
            if (r0 == 0) goto L114
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            r0.zzv(r13, r1)
            r14.zzg()
            return
        L114:
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            r0.zzw(r13, r1)
            r14.zzg()
            return
    }

    final /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzbmu r1) {
            r0 = this;
            boolean r1 = r1.zzi()
            if (r1 == 0) goto L9
            r1 = 1
            r0.zzi = r1
        L9:
            return
    }
}
