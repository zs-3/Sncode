package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfir implements com.google.android.gms.internal.ads.zzfiq {
    private final java.util.concurrent.ConcurrentHashMap zza;
    private final com.google.android.gms.internal.ads.zzfix zzb;
    private final com.google.android.gms.internal.ads.zzfit zzc;

    public zzfir(com.google.android.gms.internal.ads.zzfix r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            int r1 = r3.zzd
            r0.<init>(r1)
            r2.zza = r0
            r2.zzb = r3
            com.google.android.gms.internal.ads.zzfit r3 = new com.google.android.gms.internal.ads.zzfit
            r3.<init>()
            r2.zzc = r3
            return
    }

    private final void zzf() {
            r7 = this;
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzfix> r0 = com.google.android.gms.internal.ads.zzfix.CREATOR
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzgd
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.google.android.gms.internal.ads.zzfix r1 = r7.zzb
            com.google.android.gms.internal.ads.zzfiu r1 = r1.zzb
            r0.append(r1)
            java.lang.String r1 = " PoolCollection"
            r0.append(r1)
            com.google.android.gms.internal.ads.zzfit r1 = r7.zzc
            java.lang.String r1 = r1.zzb()
            r0.append(r1)
            java.util.concurrent.ConcurrentHashMap r1 = r7.zza
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
        L3a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lb1
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            int r3 = r3 + 1
            r0.append(r3)
            java.lang.String r5 = ". "
            r0.append(r5)
            java.lang.Object r5 = r4.getValue()
            r0.append(r5)
            java.lang.String r5 = "#"
            r0.append(r5)
            java.lang.Object r5 = r4.getKey()
            com.google.android.gms.internal.ads.zzfja r5 = (com.google.android.gms.internal.ads.zzfja) r5
            int r5 = r5.hashCode()
            r0.append(r5)
            java.lang.String r5 = "    "
            r0.append(r5)
            r5 = 0
        L6f:
            java.lang.Object r6 = r4.getValue()
            com.google.android.gms.internal.ads.zzfip r6 = (com.google.android.gms.internal.ads.zzfip) r6
            int r6 = r6.zzb()
            if (r5 >= r6) goto L83
            java.lang.String r6 = "[O]"
            r0.append(r6)
            int r5 = r5 + 1
            goto L6f
        L83:
            java.lang.Object r5 = r4.getValue()
            com.google.android.gms.internal.ads.zzfip r5 = (com.google.android.gms.internal.ads.zzfip) r5
            int r5 = r5.zzb()
        L8d:
            com.google.android.gms.internal.ads.zzfix r6 = r7.zzb
            int r6 = r6.zzd
            if (r5 >= r6) goto L9b
            java.lang.String r6 = "[ ]"
            r0.append(r6)
            int r5 = r5 + 1
            goto L8d
        L9b:
            java.lang.String r5 = "\n"
            r0.append(r5)
            java.lang.Object r4 = r4.getValue()
            com.google.android.gms.internal.ads.zzfip r4 = (com.google.android.gms.internal.ads.zzfip) r4
            java.lang.String r4 = r4.zzg()
            r0.append(r4)
            r0.append(r5)
            goto L3a
        Lb1:
            com.google.android.gms.internal.ads.zzfix r1 = r7.zzb
            int r1 = r1.zzc
            if (r3 >= r1) goto Lc2
            int r3 = r3 + 1
            r0.append(r3)
            java.lang.String r1 = ".\n"
            r0.append(r1)
            goto Lb1
        Lc2:
            java.lang.String r0 = r0.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
        Lc9:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfiq
    public final com.google.android.gms.internal.ads.zzfix zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfix r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfiq
    public final synchronized com.google.android.gms.internal.ads.zzfiz zzb(com.google.android.gms.internal.ads.zzfja r6) {
            r5 = this;
            monitor-enter(r5)
            java.util.concurrent.ConcurrentHashMap r0 = r5.zza     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.ads.zzfip r6 = (com.google.android.gms.internal.ads.zzfip) r6     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L54
            com.google.android.gms.internal.ads.zzfiz r0 = r6.zze()     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L16
            com.google.android.gms.internal.ads.zzfit r1 = r5.zzc     // Catch: java.lang.Throwable -> L5f
            r1.zze()     // Catch: java.lang.Throwable -> L5f
        L16:
            com.google.android.gms.internal.ads.zzfjn r6 = r6.zzf()     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L50
            com.google.android.gms.internal.ads.zzbcb$zzb$zzc r1 = com.google.android.gms.internal.ads.zzbcb.zzb.zzd()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.ads.zzbcb$zzb$zza$zza r2 = com.google.android.gms.internal.ads.zzbcb.zzb.zza.zza()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.ads.zzbcb$zzb$zzd r3 = com.google.android.gms.internal.ads.zzbcb.zzb.zzd.zzb     // Catch: java.lang.Throwable -> L5f
            r2.zzf(r3)     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.ads.zzbcb$zzb$zze$zza r3 = com.google.android.gms.internal.ads.zzbcb.zzb.zze.zzc()     // Catch: java.lang.Throwable -> L5f
            boolean r4 = r6.zza     // Catch: java.lang.Throwable -> L5f
            r3.zzd(r4)     // Catch: java.lang.Throwable -> L5f
            int r6 = r6.zzb     // Catch: java.lang.Throwable -> L5f
            r3.zze(r6)     // Catch: java.lang.Throwable -> L5f
            r2.zzg(r3)     // Catch: java.lang.Throwable -> L5f
            r1.zzd(r2)     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.ads.zzhbe r6 = r1.zzbn()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.ads.zzbcb$zzb r6 = (com.google.android.gms.internal.ads.zzbcb.zzb) r6     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.ads.zzcxh r1 = r0.zza     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.ads.zzcum r1 = r1.zzb()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.ads.zzddi r1 = r1.zzc()     // Catch: java.lang.Throwable -> L5f
            r1.zzi(r6)     // Catch: java.lang.Throwable -> L5f
        L50:
            r5.zzf()     // Catch: java.lang.Throwable -> L5f
            goto L5d
        L54:
            com.google.android.gms.internal.ads.zzfit r6 = r5.zzc     // Catch: java.lang.Throwable -> L5f
            r6.zzf()     // Catch: java.lang.Throwable -> L5f
            r5.zzf()     // Catch: java.lang.Throwable -> L5f
            r0 = 0
        L5d:
            monitor-exit(r5)
            return r0
        L5f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @Override // com.google.android.gms.internal.ads.zzfiq
    @java.lang.Deprecated
    public final com.google.android.gms.internal.ads.zzfja zzc(com.google.android.gms.ads.internal.client.zzm r8, java.lang.String r9, com.google.android.gms.ads.internal.client.zzy r10) {
            r7 = this;
            com.google.android.gms.internal.ads.zzbwd r0 = new com.google.android.gms.internal.ads.zzbwd
            com.google.android.gms.internal.ads.zzfix r1 = r7.zzb
            android.content.Context r1 = r1.zza
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzbwe r0 = r0.zza()
            int r4 = r0.zzj
            com.google.android.gms.internal.ads.zzfjb r0 = new com.google.android.gms.internal.ads.zzfjb
            com.google.android.gms.internal.ads.zzfix r1 = r7.zzb
            java.lang.String r5 = r1.zzf
            r1 = r0
            r2 = r8
            r3 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfiq
    public final synchronized boolean zzd(com.google.android.gms.internal.ads.zzfja r10, com.google.android.gms.internal.ads.zzfiz r11) {
            r9 = this;
            monitor-enter(r9)
            java.util.concurrent.ConcurrentHashMap r0 = r9.zza     // Catch: java.lang.Throwable -> L165
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzfip r0 = (com.google.android.gms.internal.ads.zzfip) r0     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L165
            long r1 = r1.currentTimeMillis()     // Catch: java.lang.Throwable -> L165
            r11.zzd = r1     // Catch: java.lang.Throwable -> L165
            if (r0 != 0) goto L114
            com.google.android.gms.internal.ads.zzfix r0 = r9.zzb     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzfip r1 = new com.google.android.gms.internal.ads.zzfip     // Catch: java.lang.Throwable -> L165
            int r2 = r0.zzd     // Catch: java.lang.Throwable -> L165
            int r0 = r0.zze     // Catch: java.lang.Throwable -> L165
            int r0 = r0 * 1000
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L165
            java.util.concurrent.ConcurrentHashMap r0 = r9.zza     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzfix r2 = r9.zzb     // Catch: java.lang.Throwable -> L165
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L165
            int r2 = r2.zzc     // Catch: java.lang.Throwable -> L165
            if (r0 != r2) goto L109
            com.google.android.gms.internal.ads.zzfix r0 = r9.zzb     // Catch: java.lang.Throwable -> L165
            int r0 = r0.zzg     // Catch: java.lang.Throwable -> L165
            int r2 = r0 + (-1)
            r3 = 0
            if (r0 == 0) goto L108
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto Lc4
            r0 = 1
            if (r2 == r0) goto L85
            r0 = 2
            if (r2 == r0) goto L46
            goto L102
        L46:
            java.util.concurrent.ConcurrentHashMap r0 = r9.zza     // Catch: java.lang.Throwable -> L165
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L165
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L165
            r2 = 2147483647(0x7fffffff, float:NaN)
        L53:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L165
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L165
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L165
            java.lang.Object r5 = r4.getValue()     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzfip r5 = (com.google.android.gms.internal.ads.zzfip) r5     // Catch: java.lang.Throwable -> L165
            int r5 = r5.zza()     // Catch: java.lang.Throwable -> L165
            if (r5 >= r2) goto L53
            java.lang.Object r2 = r4.getValue()     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzfip r2 = (com.google.android.gms.internal.ads.zzfip) r2     // Catch: java.lang.Throwable -> L165
            int r2 = r2.zza()     // Catch: java.lang.Throwable -> L165
            java.lang.Object r3 = r4.getKey()     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzfja r3 = (com.google.android.gms.internal.ads.zzfja) r3     // Catch: java.lang.Throwable -> L165
            goto L53
        L7c:
            if (r3 == 0) goto L102
            java.util.concurrent.ConcurrentHashMap r0 = r9.zza     // Catch: java.lang.Throwable -> L165
            r0.remove(r3)     // Catch: java.lang.Throwable -> L165
            goto L102
        L85:
            java.util.concurrent.ConcurrentHashMap r0 = r9.zza     // Catch: java.lang.Throwable -> L165
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L165
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L165
        L8f:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L165
            if (r2 == 0) goto Lbc
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L165
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L165
            java.lang.Object r6 = r2.getValue()     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzfip r6 = (com.google.android.gms.internal.ads.zzfip) r6     // Catch: java.lang.Throwable -> L165
            long r6 = r6.zzd()     // Catch: java.lang.Throwable -> L165
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto L8f
            java.lang.Object r3 = r2.getValue()     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzfip r3 = (com.google.android.gms.internal.ads.zzfip) r3     // Catch: java.lang.Throwable -> L165
            long r3 = r3.zzd()     // Catch: java.lang.Throwable -> L165
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzfja r2 = (com.google.android.gms.internal.ads.zzfja) r2     // Catch: java.lang.Throwable -> L165
            r4 = r3
            r3 = r2
            goto L8f
        Lbc:
            if (r3 == 0) goto L102
            java.util.concurrent.ConcurrentHashMap r0 = r9.zza     // Catch: java.lang.Throwable -> L165
            r0.remove(r3)     // Catch: java.lang.Throwable -> L165
            goto L102
        Lc4:
            java.util.concurrent.ConcurrentHashMap r0 = r9.zza     // Catch: java.lang.Throwable -> L165
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L165
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L165
        Lce:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L165
            if (r2 == 0) goto Lfb
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L165
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L165
            java.lang.Object r6 = r2.getValue()     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzfip r6 = (com.google.android.gms.internal.ads.zzfip) r6     // Catch: java.lang.Throwable -> L165
            long r6 = r6.zzc()     // Catch: java.lang.Throwable -> L165
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto Lce
            java.lang.Object r3 = r2.getValue()     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzfip r3 = (com.google.android.gms.internal.ads.zzfip) r3     // Catch: java.lang.Throwable -> L165
            long r3 = r3.zzc()     // Catch: java.lang.Throwable -> L165
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzfja r2 = (com.google.android.gms.internal.ads.zzfja) r2     // Catch: java.lang.Throwable -> L165
            r4 = r3
            r3 = r2
            goto Lce
        Lfb:
            if (r3 == 0) goto L102
            java.util.concurrent.ConcurrentHashMap r0 = r9.zza     // Catch: java.lang.Throwable -> L165
            r0.remove(r3)     // Catch: java.lang.Throwable -> L165
        L102:
            com.google.android.gms.internal.ads.zzfit r0 = r9.zzc     // Catch: java.lang.Throwable -> L165
            r0.zzg()     // Catch: java.lang.Throwable -> L165
            goto L109
        L108:
            throw r3     // Catch: java.lang.Throwable -> L165
        L109:
            java.util.concurrent.ConcurrentHashMap r0 = r9.zza     // Catch: java.lang.Throwable -> L165
            r0.put(r10, r1)     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzfit r10 = r9.zzc     // Catch: java.lang.Throwable -> L165
            r10.zzd()     // Catch: java.lang.Throwable -> L165
            r0 = r1
        L114:
            boolean r10 = r0.zzh(r11)     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzfit r1 = r9.zzc     // Catch: java.lang.Throwable -> L165
            r1.zzc()     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzfit r1 = r9.zzc     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzfis r1 = r1.zza()     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzfjn r0 = r0.zzf()     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzbcb$zzb$zzc r2 = com.google.android.gms.internal.ads.zzbcb.zzb.zzd()     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzbcb$zzb$zza$zza r3 = com.google.android.gms.internal.ads.zzbcb.zzb.zza.zza()     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzbcb$zzb$zzd r4 = com.google.android.gms.internal.ads.zzbcb.zzb.zzd.zzb     // Catch: java.lang.Throwable -> L165
            r3.zzf(r4)     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzbcb$zzb$zzg$zza r4 = com.google.android.gms.internal.ads.zzbcb.zzb.zzg.zzc()     // Catch: java.lang.Throwable -> L165
            boolean r5 = r1.zza     // Catch: java.lang.Throwable -> L165
            r4.zze(r5)     // Catch: java.lang.Throwable -> L165
            boolean r1 = r1.zzb     // Catch: java.lang.Throwable -> L165
            r4.zzf(r1)     // Catch: java.lang.Throwable -> L165
            int r0 = r0.zzb     // Catch: java.lang.Throwable -> L165
            r4.zzg(r0)     // Catch: java.lang.Throwable -> L165
            r3.zzi(r4)     // Catch: java.lang.Throwable -> L165
            r2.zzd(r3)     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzhbe r0 = r2.zzbn()     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzbcb$zzb r0 = (com.google.android.gms.internal.ads.zzbcb.zzb) r0     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzcxh r11 = r11.zza     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzcum r11 = r11.zzb()     // Catch: java.lang.Throwable -> L165
            com.google.android.gms.internal.ads.zzddi r11 = r11.zzc()     // Catch: java.lang.Throwable -> L165
            r11.zzj(r0)     // Catch: java.lang.Throwable -> L165
            r9.zzf()     // Catch: java.lang.Throwable -> L165
            monitor-exit(r9)
            return r10
        L165:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
    }

    @Override // com.google.android.gms.internal.ads.zzfiq
    public final synchronized boolean zze(com.google.android.gms.internal.ads.zzfja r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.ConcurrentHashMap r0 = r2.zza     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.internal.ads.zzfip r3 = (com.google.android.gms.internal.ads.zzfip) r3     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            if (r3 == 0) goto L1b
            com.google.android.gms.internal.ads.zzfix r1 = r2.zzb     // Catch: java.lang.Throwable -> L1d
            int r3 = r3.zzb()     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.zzd     // Catch: java.lang.Throwable -> L1d
            if (r3 >= r1) goto L18
            monitor-exit(r2)
            return r0
        L18:
            r3 = 0
            monitor-exit(r2)
            return r3
        L1b:
            monitor-exit(r2)
            return r0
        L1d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
