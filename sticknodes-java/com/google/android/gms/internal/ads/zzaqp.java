package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaqp implements com.google.android.gms.internal.ads.zzaqb {
    private final java.util.Map zza;
    private final com.google.android.gms.internal.ads.zzapo zzb;
    private final java.util.concurrent.BlockingQueue zzc;
    private final com.google.android.gms.internal.ads.zzapt zzd;

    zzaqp(com.google.android.gms.internal.ads.zzapo r2, java.util.concurrent.BlockingQueue r3, com.google.android.gms.internal.ads.zzapt r4) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            r1.zzd = r4
            r1.zzb = r2
            r1.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final synchronized void zza(com.google.android.gms.internal.ads.zzaqc r6) {
            r5 = this;
            monitor-enter(r5)
            java.util.Map r0 = r5.zza     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = r6.zzj()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r0.remove(r6)     // Catch: java.lang.Throwable -> L62
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L60
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r1 != 0) goto L60
            boolean r1 = com.google.android.gms.internal.ads.zzaqo.zzb     // Catch: java.lang.Throwable -> L62
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2f
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L62
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L62
            r1[r3] = r4     // Catch: java.lang.Throwable -> L62
            r1[r2] = r6     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = "%d waiting requests for cacheKey=%s; resend to network"
            com.google.android.gms.internal.ads.zzaqo.zzd(r4, r1)     // Catch: java.lang.Throwable -> L62
        L2f:
            java.lang.Object r1 = r0.remove(r3)     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzaqc r1 = (com.google.android.gms.internal.ads.zzaqc) r1     // Catch: java.lang.Throwable -> L62
            java.util.Map r4 = r5.zza     // Catch: java.lang.Throwable -> L62
            r4.put(r6, r0)     // Catch: java.lang.Throwable -> L62
            r1.zzu(r5)     // Catch: java.lang.Throwable -> L62
            java.util.concurrent.BlockingQueue r6 = r5.zzc     // Catch: java.lang.InterruptedException -> L44 java.lang.Throwable -> L62
            r6.put(r1)     // Catch: java.lang.InterruptedException -> L44 java.lang.Throwable -> L62
            monitor-exit(r5)
            return
        L44:
            r6 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L62
            r0[r3] = r6     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = "Couldn't add request to queue. %s"
            com.google.android.gms.internal.ads.zzaqo.zzb(r6, r0)     // Catch: java.lang.Throwable -> L62
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L62
            r6.interrupt()     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzapo r6 = r5.zzb     // Catch: java.lang.Throwable -> L62
            r6.zzb()     // Catch: java.lang.Throwable -> L62
            monitor-exit(r5)
            return
        L60:
            monitor-exit(r5)
            return
        L62:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void zzb(com.google.android.gms.internal.ads.zzaqc r5, com.google.android.gms.internal.ads.zzaqi r6) {
            r4 = this;
            com.google.android.gms.internal.ads.zzapl r0 = r6.zzb
            if (r0 == 0) goto L54
            long r1 = java.lang.System.currentTimeMillis()
            boolean r0 = r0.zza(r1)
            if (r0 == 0) goto Lf
            goto L54
        Lf:
            java.lang.String r5 = r5.zzj()
            monitor-enter(r4)
            java.util.Map r0 = r4.zza     // Catch: java.lang.Throwable -> L51
            java.lang.Object r0 = r0.remove(r5)     // Catch: java.lang.Throwable -> L51
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L51
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L50
            boolean r1 = com.google.android.gms.internal.ads.zzaqo.zzb
            if (r1 == 0) goto L39
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r0.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            r1[r2] = r5
            java.lang.String r5 = "Releasing %d waiting requests for cacheKey=%s."
            com.google.android.gms.internal.ads.zzaqo.zzd(r5, r1)
        L39:
            java.util.Iterator r5 = r0.iterator()
        L3d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r0 = r5.next()
            com.google.android.gms.internal.ads.zzaqc r0 = (com.google.android.gms.internal.ads.zzaqc) r0
            com.google.android.gms.internal.ads.zzapt r1 = r4.zzd
            r2 = 0
            r1.zzb(r0, r6, r2)
            goto L3d
        L50:
            return
        L51:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            throw r5
        L54:
            r4.zza(r5)
            return
    }

    final synchronized boolean zzc(com.google.android.gms.internal.ads.zzaqc r6) {
            r5 = this;
            monitor-enter(r5)
            java.util.Map r0 = r5.zza     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = r6.zzj()     // Catch: java.lang.Throwable -> L52
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L52
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            java.util.Map r0 = r5.zza     // Catch: java.lang.Throwable -> L52
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L52
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L1e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L52
            r0.<init>()     // Catch: java.lang.Throwable -> L52
        L1e:
            java.lang.String r4 = "waiting-for-response"
            r6.zzm(r4)     // Catch: java.lang.Throwable -> L52
            r0.add(r6)     // Catch: java.lang.Throwable -> L52
            java.util.Map r6 = r5.zza     // Catch: java.lang.Throwable -> L52
            r6.put(r1, r0)     // Catch: java.lang.Throwable -> L52
            boolean r6 = com.google.android.gms.internal.ads.zzaqo.zzb     // Catch: java.lang.Throwable -> L52
            if (r6 == 0) goto L38
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L52
            r6[r3] = r1     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = "Request for cacheKey=%s is in flight, putting on hold."
            com.google.android.gms.internal.ads.zzaqo.zza(r0, r6)     // Catch: java.lang.Throwable -> L52
        L38:
            monitor-exit(r5)
            return r2
        L3a:
            java.util.Map r0 = r5.zza     // Catch: java.lang.Throwable -> L52
            r4 = 0
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L52
            r6.zzu(r5)     // Catch: java.lang.Throwable -> L52
            boolean r6 = com.google.android.gms.internal.ads.zzaqo.zzb     // Catch: java.lang.Throwable -> L52
            if (r6 == 0) goto L50
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L52
            r6[r3] = r1     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = "new request, sending to network %s"
            com.google.android.gms.internal.ads.zzaqo.zza(r0, r6)     // Catch: java.lang.Throwable -> L52
        L50:
            monitor-exit(r5)
            return r3
        L52:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }
}
