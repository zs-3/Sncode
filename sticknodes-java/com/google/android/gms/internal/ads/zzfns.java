package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfns {
    private final java.util.concurrent.ConcurrentMap zza;
    private final java.util.concurrent.ConcurrentMap zzb;
    private final com.google.android.gms.internal.ads.zzfob zzc;

    zzfns(com.google.android.gms.internal.ads.zzfob r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zza = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zzb = r0
            r1.zzc = r2
            return
    }

    static java.lang.String zzd(java.lang.String r1, com.google.android.gms.ads.AdFormat r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = "NULL"
            goto L9
        L5:
            java.lang.String r2 = r2.name()
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private final synchronized java.util.List zzj(java.util.List r7) {
            r6 = this;
            monitor-enter(r6)
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lad
            r0.<init>()     // Catch: java.lang.Throwable -> Lad
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad
            r1.<init>()     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Lad
        Lf:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> Lad
            com.google.android.gms.ads.internal.client.zzfu r2 = (com.google.android.gms.ads.internal.client.zzfu) r2     // Catch: java.lang.Throwable -> Lad
            java.lang.String r3 = r2.zza     // Catch: java.lang.Throwable -> Lad
            int r4 = r2.zzb     // Catch: java.lang.Throwable -> Lad
            com.google.android.gms.ads.AdFormat r4 = com.google.android.gms.ads.AdFormat.getAdFormat(r4)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r3 = zzd(r3, r4)     // Catch: java.lang.Throwable -> Lad
            r0.add(r3)     // Catch: java.lang.Throwable -> Lad
            java.util.concurrent.ConcurrentMap r4 = r6.zza     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> Lad
            com.google.android.gms.internal.ads.zzfoa r4 = (com.google.android.gms.internal.ads.zzfoa) r4     // Catch: java.lang.Throwable -> Lad
            if (r4 == 0) goto L47
            com.google.android.gms.ads.internal.client.zzfu r5 = r4.zze     // Catch: java.lang.Throwable -> Lad
            boolean r2 = r5.equals(r2)     // Catch: java.lang.Throwable -> Lad
            if (r2 != 0) goto Lf
            java.util.concurrent.ConcurrentMap r2 = r6.zzb     // Catch: java.lang.Throwable -> Lad
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> Lad
            java.util.concurrent.ConcurrentMap r2 = r6.zza     // Catch: java.lang.Throwable -> Lad
            r2.remove(r3)     // Catch: java.lang.Throwable -> Lad
            goto Lf
        L47:
            r1.add(r2)     // Catch: java.lang.Throwable -> Lad
            goto Lf
        L4b:
            java.util.concurrent.ConcurrentMap r7 = r6.zza     // Catch: java.lang.Throwable -> Lad
            java.util.Set r7 = r7.entrySet()     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Lad
        L55:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r2 == 0) goto L82
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> Lad
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lad
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> Lad
            if (r3 != 0) goto L55
            java.util.concurrent.ConcurrentMap r3 = r6.zzb     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> Lad
            com.google.android.gms.internal.ads.zzfoa r2 = (com.google.android.gms.internal.ads.zzfoa) r2     // Catch: java.lang.Throwable -> Lad
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> Lad
            r7.remove()     // Catch: java.lang.Throwable -> Lad
            goto L55
        L82:
            java.util.concurrent.ConcurrentMap r7 = r6.zzb     // Catch: java.lang.Throwable -> Lad
            java.util.Set r7 = r7.entrySet()     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Lad
        L8c:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto Lab
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> Lad
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lad
            com.google.android.gms.internal.ads.zzfoa r0 = (com.google.android.gms.internal.ads.zzfoa) r0     // Catch: java.lang.Throwable -> Lad
            r0.zzk()     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r0.zzl()     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L8c
            r7.remove()     // Catch: java.lang.Throwable -> Lad
            goto L8c
        Lab:
            monitor-exit(r6)
            return r1
        Lad:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    private final synchronized java.util.Optional zzk(java.lang.Class r2, java.lang.String r3, com.google.android.gms.ads.AdFormat r4) {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.ConcurrentMap r0 = r1.zza     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = zzd(r3, r4)     // Catch: java.lang.Throwable -> L6b
            boolean r4 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L6b
            if (r4 != 0) goto L1c
            java.util.concurrent.ConcurrentMap r4 = r1.zzb     // Catch: java.lang.Throwable -> L6b
            boolean r4 = r4.containsKey(r3)     // Catch: java.lang.Throwable -> L6b
            if (r4 == 0) goto L16
            goto L1c
        L16:
            java.util.Optional r2 = java.util.Optional.empty()     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r1)
            return r2
        L1c:
            java.util.concurrent.ConcurrentMap r4 = r1.zza     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzfoa r4 = (com.google.android.gms.internal.ads.zzfoa) r4     // Catch: java.lang.Throwable -> L6b
            if (r4 != 0) goto L38
            java.util.concurrent.ConcurrentMap r4 = r1.zzb     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Throwable -> L6b
            r4 = r3
            com.google.android.gms.internal.ads.zzfoa r4 = (com.google.android.gms.internal.ads.zzfoa) r4     // Catch: java.lang.Throwable -> L6b
            if (r4 == 0) goto L32
            goto L38
        L32:
            java.util.Optional r2 = java.util.Optional.empty()     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r1)
            return r2
        L38:
            java.lang.Object r3 = r4.zzd()     // Catch: java.lang.ClassCastException -> L4e java.lang.Throwable -> L6b
            java.util.Optional r3 = java.util.Optional.ofNullable(r3)     // Catch: java.lang.ClassCastException -> L4e java.lang.Throwable -> L6b
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.ClassCastException -> L4e java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzfnr r4 = new com.google.android.gms.internal.ads.zzfnr     // Catch: java.lang.ClassCastException -> L4e java.lang.Throwable -> L6b
            r4.<init>(r2)     // Catch: java.lang.ClassCastException -> L4e java.lang.Throwable -> L6b
            java.util.Optional r2 = r3.map(r4)     // Catch: java.lang.ClassCastException -> L4e java.lang.Throwable -> L6b
            monitor-exit(r1)
            return r2
        L4e:
            r3 = move-exception
            java.lang.String r4 = "PreloadAdManager.pollAd"
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L6b
            r0.zzw(r3, r4)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = "Unable to cast ad to the requested type:"
            java.lang.String r2 = r4.concat(r2)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.ads.internal.util.zze.zzb(r2, r3)     // Catch: java.lang.Throwable -> L6b
            java.util.Optional r2 = java.util.Optional.empty()     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r1)
            return r2
        L6b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    private final synchronized void zzl(java.lang.String r2, com.google.android.gms.internal.ads.zzfoa r3) {
            r1 = this;
            monitor-enter(r1)
            r3.zzc()     // Catch: java.lang.Throwable -> Lb
            java.util.concurrent.ConcurrentMap r0 = r1.zza     // Catch: java.lang.Throwable -> Lb
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    private final synchronized boolean zzm(java.lang.String r2, com.google.android.gms.ads.AdFormat r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.ConcurrentMap r0 = r1.zza     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = zzd(r2, r3)     // Catch: java.lang.Throwable -> L39
            boolean r3 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L39
            r0 = 0
            if (r3 != 0) goto L19
            java.util.concurrent.ConcurrentMap r3 = r1.zzb     // Catch: java.lang.Throwable -> L39
            boolean r3 = r3.containsKey(r2)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L17
            goto L19
        L17:
            monitor-exit(r1)
            return r0
        L19:
            java.util.concurrent.ConcurrentMap r3 = r1.zza     // Catch: java.lang.Throwable -> L39
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzfoa r3 = (com.google.android.gms.internal.ads.zzfoa) r3     // Catch: java.lang.Throwable -> L39
            if (r3 != 0) goto L2c
            java.util.concurrent.ConcurrentMap r3 = r1.zzb     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L39
            r3 = r2
            com.google.android.gms.internal.ads.zzfoa r3 = (com.google.android.gms.internal.ads.zzfoa) r3     // Catch: java.lang.Throwable -> L39
        L2c:
            if (r3 == 0) goto L37
            boolean r2 = r3.zzl()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L37
            r2 = 1
            monitor-exit(r1)
            return r2
        L37:
            monitor-exit(r1)
            return r0
        L39:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized com.google.android.gms.internal.ads.zzbao zza(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.ads.AdFormat r0 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD     // Catch: java.lang.Throwable -> L12
            java.lang.Class<com.google.android.gms.internal.ads.zzbao> r1 = com.google.android.gms.internal.ads.zzbao.class
            java.util.Optional r3 = r2.zzk(r1, r3, r0)     // Catch: java.lang.Throwable -> L12
            r0 = 0
            java.lang.Object r3 = r3.orElse(r0)     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.internal.ads.zzbao r3 = (com.google.android.gms.internal.ads.zzbao) r3     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return r3
        L12:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzby zzb(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.ads.AdFormat r0 = com.google.android.gms.ads.AdFormat.INTERSTITIAL     // Catch: java.lang.Throwable -> L12
            java.lang.Class<com.google.android.gms.ads.internal.client.zzby> r1 = com.google.android.gms.ads.internal.client.zzby.class
            java.util.Optional r3 = r2.zzk(r1, r3, r0)     // Catch: java.lang.Throwable -> L12
            r0 = 0
            java.lang.Object r3 = r3.orElse(r0)     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.ads.internal.client.zzby r3 = (com.google.android.gms.ads.internal.client.zzby) r3     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return r3
        L12:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized com.google.android.gms.internal.ads.zzbxf zzc(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.ads.AdFormat r0 = com.google.android.gms.ads.AdFormat.REWARDED     // Catch: java.lang.Throwable -> L12
            java.lang.Class<com.google.android.gms.internal.ads.zzbxf> r1 = com.google.android.gms.internal.ads.zzbxf.class
            java.util.Optional r3 = r2.zzk(r1, r3, r0)     // Catch: java.lang.Throwable -> L12
            r0 = 0
            java.lang.Object r3 = r3.orElse(r0)     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.internal.ads.zzbxf r3 = (com.google.android.gms.internal.ads.zzbxf) r3     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return r3
        L12:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final void zze(com.google.android.gms.internal.ads.zzbpl r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfob r0 = r1.zzc
            r0.zzb(r2)
            return
    }

    public final synchronized void zzf(java.util.List r5, com.google.android.gms.ads.internal.client.zzcf r6) {
            r4 = this;
            monitor-enter(r4)
            java.util.List r5 = r4.zzj(r5)     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L31
        L9:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.ads.internal.client.zzfu r0 = (com.google.android.gms.ads.internal.client.zzfu) r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r0.zza     // Catch: java.lang.Throwable -> L31
            int r2 = r0.zzb     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.getAdFormat(r2)     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzfob r3 = r4.zzc     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzfoa r0 = r3.zza(r0, r6)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L9
            if (r0 == 0) goto L9
            java.lang.String r1 = zzd(r1, r2)     // Catch: java.lang.Throwable -> L31
            r4.zzl(r1, r0)     // Catch: java.lang.Throwable -> L31
            goto L9
        L2f:
            monitor-exit(r4)
            return
        L31:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public final synchronized boolean zzg(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.ads.AdFormat r0 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD     // Catch: java.lang.Throwable -> L9
            boolean r2 = r1.zzm(r2, r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized boolean zzh(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.ads.AdFormat r0 = com.google.android.gms.ads.AdFormat.INTERSTITIAL     // Catch: java.lang.Throwable -> L9
            boolean r2 = r1.zzm(r2, r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized boolean zzi(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.ads.AdFormat r0 = com.google.android.gms.ads.AdFormat.REWARDED     // Catch: java.lang.Throwable -> L9
            boolean r2 = r1.zzm(r2, r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
