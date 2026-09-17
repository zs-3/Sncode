package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdun {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final java.util.List zzb;
    private boolean zzc;
    private boolean zzd;
    private final java.lang.String zze;
    private final com.google.android.gms.internal.ads.zzdui zzf;

    public zzdun(java.lang.String r2, com.google.android.gms.internal.ads.zzdui r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzb = r0
            r0 = 0
            r1.zzc = r0
            r1.zzd = r0
            r1.zze = r2
            r1.zzf = r3
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r2 = r2.zzi()
            r1.zza = r2
            return
    }

    private final java.util.Map zzg() {
            r4 = this;
            com.google.android.gms.internal.ads.zzdui r0 = r4.zzf
            java.util.Map r0 = r0.zza()
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()
            long r1 = r1.elapsedRealtime()
            r3 = 10
            java.lang.String r1 = java.lang.Long.toString(r1, r3)
            java.lang.String r2 = "tms"
            r0.put(r2, r1)
            com.google.android.gms.ads.internal.util.zzg r1 = r4.zza
            boolean r1 = r1.zzS()
            if (r1 == 0) goto L24
            java.lang.String r1 = ""
            goto L26
        L24:
            java.lang.String r1 = r4.zze
        L26:
            java.lang.String r2 = "tid"
            r0.put(r2, r1)
            return r0
    }

    public final synchronized void zza(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzcc     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r3 = r0.zza(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L15
            monitor-exit(r2)
            return
        L15:
            java.util.Map r3 = r2.zzg()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "action"
            java.lang.String r1 = "aaia"
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "aair"
            java.lang.String r1 = "MalformedJson"
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L2e
            java.util.List r0 = r2.zzb     // Catch: java.lang.Throwable -> L2e
            r0.add(r3)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r2)
            return
        L2e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized void zzb(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcc     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L31
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L15
            monitor-exit(r3)
            return
        L15:
            java.util.Map r0 = r3.zzg()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "action"
            java.lang.String r2 = "adapter_init_finished"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "ancn"
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = "rqe"
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L31
            java.util.List r4 = r3.zzb     // Catch: java.lang.Throwable -> L31
            r4.add(r0)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r3)
            return
        L31:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized void zzc(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcc     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L15
            monitor-exit(r3)
            return
        L15:
            java.util.Map r0 = r3.zzg()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "action"
            java.lang.String r2 = "adapter_init_started"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "ancn"
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L2c
            java.util.List r4 = r3.zzb     // Catch: java.lang.Throwable -> L2c
            r4.add(r0)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)
            return
        L2c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized void zzd(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcc     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L15
            monitor-exit(r3)
            return
        L15:
            java.util.Map r0 = r3.zzg()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "action"
            java.lang.String r2 = "adapter_init_finished"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "ancn"
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L2c
            java.util.List r4 = r3.zzb     // Catch: java.lang.Throwable -> L2c
            r4.add(r0)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)
            return
        L2c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized void zze() {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcc     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L14
            goto L45
        L14:
            boolean r0 = r3.zzd     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L45
            java.util.Map r0 = r3.zzg()     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_finished"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L47
            java.util.List r1 = r3.zzb     // Catch: java.lang.Throwable -> L47
            r1.add(r0)     // Catch: java.lang.Throwable -> L47
            java.util.List r0 = r3.zzb     // Catch: java.lang.Throwable -> L47
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L47
        L2e:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L47
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzdui r2 = r3.zzf     // Catch: java.lang.Throwable -> L47
            r2.zzf(r1)     // Catch: java.lang.Throwable -> L47
            goto L2e
        L40:
            r0 = 1
            r3.zzd = r0     // Catch: java.lang.Throwable -> L47
            monitor-exit(r3)
            return
        L45:
            monitor-exit(r3)
            return
        L47:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final synchronized void zzf() {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcc     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L14
            goto L2d
        L14:
            boolean r0 = r3.zzc     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L2d
            java.util.Map r0 = r3.zzg()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_started"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2f
            java.util.List r1 = r3.zzb     // Catch: java.lang.Throwable -> L2f
            r1.add(r0)     // Catch: java.lang.Throwable -> L2f
            r0 = 1
            r3.zzc = r0     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r3)
            return
        L2d:
            monitor-exit(r3)
            return
        L2f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }
}
