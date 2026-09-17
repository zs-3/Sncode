package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzexk {
    private final android.content.Context zza;
    private final java.util.Set zzb;
    private final java.util.concurrent.Executor zzc;
    private final com.google.android.gms.internal.ads.zzfma zzd;
    private final com.google.android.gms.internal.ads.zzdud zze;
    private long zzf;
    private int zzg;

    public zzexk(android.content.Context r3, java.util.concurrent.Executor r4, java.util.Set r5, com.google.android.gms.internal.ads.zzfma r6, com.google.android.gms.internal.ads.zzdud r7) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zzf = r0
            r0 = 0
            r2.zzg = r0
            r2.zza = r3
            r2.zzc = r4
            r2.zzb = r5
            r2.zzd = r6
            r2.zze = r7
            return
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object r14, android.os.Bundle r15) {
            r13 = this;
            android.content.Context r0 = r13.zza
            r1 = 8
            com.google.android.gms.internal.ads.zzflp r0 = com.google.android.gms.internal.ads.zzflo.zza(r0, r1)
            r0.zzi()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r13.zzb
            int r2 = r2.size()
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzls
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r4.zza(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L41
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r2.zza(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)
            java.util.List r2 = java.util.Arrays.asList(r2)
        L41:
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()
            long r3 = r3.elapsedRealtime()
            r13.zzf = r3
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzcf
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L83
            if (r15 == 0) goto L83
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzu.zzB()
            long r4 = r4.currentTimeMillis()
            boolean r6 = r14 instanceof android.os.Bundle
            if (r6 == 0) goto L7a
            com.google.android.gms.internal.ads.zzdtm r6 = com.google.android.gms.internal.ads.zzdtm.zzc
            java.lang.String r6 = r6.zza()
            r15.putLong(r6, r4)
            goto L83
        L7a:
            com.google.android.gms.internal.ads.zzdtm r6 = com.google.android.gms.internal.ads.zzdtm.zzf
            java.lang.String r6 = r6.zza()
            r15.putLong(r6, r4)
        L83:
            java.util.Set r4 = r13.zzb
            java.util.Iterator r4 = r4.iterator()
        L89:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Ldb
            java.lang.Object r5 = r4.next()
            r9 = r5
            com.google.android.gms.internal.ads.zzexh r9 = (com.google.android.gms.internal.ads.zzexh) r9
            int r5 = r9.zza()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            boolean r5 = r2.contains(r5)
            if (r5 != 0) goto L89
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzfK
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Lbe
            int r5 = r9.zza()
            r6 = 44
            if (r5 == r6) goto L89
        Lbe:
            com.google.android.gms.common.util.Clock r5 = com.google.android.gms.ads.internal.zzu.zzB()
            long r7 = r5.elapsedRealtime()
            com.google.common.util.concurrent.ListenableFuture r11 = r9.zzb()
            com.google.android.gms.internal.ads.zzexi r12 = new com.google.android.gms.internal.ads.zzexi
            r5 = r12
            r6 = r13
            r10 = r3
            r5.<init>(r6, r7, r9, r10)
            com.google.android.gms.internal.ads.zzgfz r5 = com.google.android.gms.internal.ads.zzcan.zzf
            r11.addListener(r12, r5)
            r1.add(r11)
            goto L89
        Ldb:
            com.google.android.gms.internal.ads.zzgfn r2 = com.google.android.gms.internal.ads.zzgfo.zzb(r1)
            com.google.android.gms.internal.ads.zzexj r4 = new com.google.android.gms.internal.ads.zzexj
            r4.<init>(r1, r14, r15, r3)
            java.util.concurrent.Executor r14 = r13.zzc
            com.google.common.util.concurrent.ListenableFuture r14 = r2.zza(r4, r14)
            boolean r15 = com.google.android.gms.internal.ads.zzfmd.zza()
            if (r15 == 0) goto Lf5
            com.google.android.gms.internal.ads.zzfma r15 = r13.zzd
            com.google.android.gms.internal.ads.zzflz.zza(r14, r15, r0)
        Lf5:
            return r14
    }

    public final void zzb(long r5, com.google.android.gms.internal.ads.zzexh r7, android.os.Bundle r8) {
            r4 = this;
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.elapsedRealtime()
            long r0 = r0 - r5
            com.google.android.gms.internal.ads.zzbeb r5 = com.google.android.gms.internal.ads.zzbet.zza
            java.lang.Object r5 = r5.zze()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L3f
            java.lang.Class r5 = r7.getClass()
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.String r5 = com.google.android.gms.internal.ads.zzfyo.zzc(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "Signal runtime (ms) : "
            r6.append(r2)
            r6.append(r5)
            java.lang.String r5 = " = "
            r6.append(r5)
            r6.append(r0)
            java.lang.String r5 = r6.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r5)
        L3f:
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzcf
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L81
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzcj
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L81
            monitor-enter(r4)
            int r5 = r7.zza()     // Catch: java.lang.Throwable -> L7e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e
            r6.<init>()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = "sig"
            r6.append(r2)     // Catch: java.lang.Throwable -> L7e
            r6.append(r5)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L7e
            r8.putLong(r5, r0)     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7e
            goto L81
        L7e:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7e
            throw r5
        L81:
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzcd
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L94
            return
        L94:
            com.google.android.gms.internal.ads.zzdud r5 = r4.zze
            com.google.android.gms.internal.ads.zzduc r5 = r5.zza()
            java.lang.String r6 = "action"
            java.lang.String r8 = "lat_ms"
            r5.zzb(r6, r8)
            java.lang.String r6 = "lat_grp"
            java.lang.String r8 = "sig_lat_grp"
            r5.zzb(r6, r8)
            int r6 = r7.zza()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r8 = "lat_id"
            r5.zzb(r8, r6)
            java.lang.String r6 = java.lang.String.valueOf(r0)
            java.lang.String r8 = "clat_ms"
            r5.zzb(r8, r6)
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzce
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r8.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L131
            monitor-enter(r4)
            int r6 = r4.zzg     // Catch: java.lang.Throwable -> L12e
            int r6 = r6 + 1
            r4.zzg = r6     // Catch: java.lang.Throwable -> L12e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12e
            com.google.android.gms.internal.ads.zzcad r6 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.internal.ads.zzcah r6 = r6.zzh()
            java.lang.String r6 = r6.zzd()
            java.lang.String r8 = "seq_num"
            r5.zzb(r8, r6)
            monitor-enter(r4)
            int r6 = r4.zzg     // Catch: java.lang.Throwable -> L12b
            java.util.Set r8 = r4.zzb     // Catch: java.lang.Throwable -> L12b
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L12b
            if (r6 != r8) goto L129
            long r0 = r4.zzf     // Catch: java.lang.Throwable -> L12b
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L129
            r6 = 0
            r4.zzg = r6     // Catch: java.lang.Throwable -> L12b
            com.google.android.gms.common.util.Clock r6 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L12b
            long r0 = r6.elapsedRealtime()     // Catch: java.lang.Throwable -> L12b
            long r2 = r4.zzf     // Catch: java.lang.Throwable -> L12b
            long r0 = r0 - r2
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L12b
            int r8 = r7.zza()     // Catch: java.lang.Throwable -> L12b
            r0 = 39
            if (r8 <= r0) goto L124
            int r7 = r7.zza()     // Catch: java.lang.Throwable -> L12b
            r8 = 52
            if (r7 >= r8) goto L124
            java.lang.String r7 = "lat_gmssg"
            r5.zzb(r7, r6)     // Catch: java.lang.Throwable -> L12b
            goto L129
        L124:
            java.lang.String r7 = "lat_clsg"
            r5.zzb(r7, r6)     // Catch: java.lang.Throwable -> L12b
        L129:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12b
            goto L131
        L12b:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12b
            throw r5
        L12e:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12e
            throw r5
        L131:
            r5.zzg()
            return
    }
}
