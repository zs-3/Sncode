package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzblt implements com.google.android.gms.internal.ads.zzapv {
    private volatile com.google.android.gms.internal.ads.zzblg zza;
    private final android.content.Context zzb;

    public zzblt(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzblg zzb(com.google.android.gms.internal.ads.zzblt r0) {
            com.google.android.gms.internal.ads.zzblg r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzblt r1) {
            com.google.android.gms.internal.ads.zzblg r0 = r1.zza
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzblg r1 = r1.zza
            r1.disconnect()
            android.os.Binder.flushPendingCommands()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzapv
    public final com.google.android.gms.internal.ads.zzapy zza(com.google.android.gms.internal.ads.zzaqc r14) throws com.google.android.gms.internal.ads.zzaql {
            r13 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = "Http assets remote cache took "
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzblh> r2 = com.google.android.gms.internal.ads.zzblh.CREATOR
            java.util.Map r2 = r14.zzl()
            int r3 = r2.size()
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String[] r3 = new java.lang.String[r3]
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
            r6 = 0
        L1c:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L3b
            java.lang.Object r7 = r2.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.String r8 = (java.lang.String) r8
            r4[r6] = r8
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            r3[r6] = r7
            int r6 = r6 + 1
            goto L1c
        L3b:
            com.google.android.gms.internal.ads.zzblh r2 = new com.google.android.gms.internal.ads.zzblh
            java.lang.String r14 = r14.zzk()
            r2.<init>(r14, r4, r3)
            com.google.android.gms.common.util.Clock r14 = com.google.android.gms.ads.internal.zzu.zzB()
            long r3 = r14.elapsedRealtime()
            r14 = 0
            com.google.android.gms.internal.ads.zzcas r6 = new com.google.android.gms.internal.ads.zzcas     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            r6.<init>()     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            com.google.android.gms.internal.ads.zzblr r7 = new com.google.android.gms.internal.ads.zzblr     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            r7.<init>(r13, r6)     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            com.google.android.gms.internal.ads.zzbls r8 = new com.google.android.gms.internal.ads.zzbls     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            r8.<init>(r13, r6)     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            com.google.android.gms.internal.ads.zzblg r9 = new com.google.android.gms.internal.ads.zzblg     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            android.content.Context r10 = r13.zzb     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            com.google.android.gms.ads.internal.util.zzbt r11 = com.google.android.gms.ads.internal.zzu.zzt()     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            android.os.Looper r11 = r11.zzb()     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            r9.<init>(r10, r11, r7, r8)     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            r13.zza = r9     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            com.google.android.gms.internal.ads.zzblg r7 = r13.zza     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            r7.checkAvailabilityAndConnect()     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            com.google.android.gms.internal.ads.zzblp r7 = new com.google.android.gms.internal.ads.zzblp     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            r7.<init>(r13, r2)     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zza     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            com.google.common.util.concurrent.ListenableFuture r6 = com.google.android.gms.internal.ads.zzgfo.zzn(r6, r7, r2)     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            com.google.android.gms.internal.ads.zzbcm r7 = com.google.android.gms.internal.ads.zzbcv.zzeq     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            java.lang.Object r7 = r8.zza(r7)     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            long r7 = (long) r7     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            java.util.concurrent.ScheduledExecutorService r10 = com.google.android.gms.internal.ads.zzcan.zzd     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            com.google.common.util.concurrent.ListenableFuture r6 = com.google.android.gms.internal.ads.zzgfo.zzo(r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            com.google.android.gms.internal.ads.zzblq r7 = new com.google.android.gms.internal.ads.zzblq     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            r7.<init>(r13)     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            r6.addListener(r7, r2)     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            java.lang.Object r2 = r6.get()     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            android.os.ParcelFileDescriptor r2 = (android.os.ParcelFileDescriptor) r2     // Catch: java.lang.Throwable -> L10c java.lang.Throwable -> L12c
            com.google.android.gms.common.util.Clock r6 = com.google.android.gms.ads.internal.zzu.zzB()
            long r6 = r6.elapsedRealtime()
            long r6 = r6 - r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r6)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            com.google.android.gms.internal.ads.zzbvy r0 = new com.google.android.gms.internal.ads.zzbvy
            r0.<init>(r2)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzblj> r1 = com.google.android.gms.internal.ads.zzblj.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r0 = r0.zza(r1)
            com.google.android.gms.internal.ads.zzblj r0 = (com.google.android.gms.internal.ads.zzblj) r0
            if (r0 != 0) goto Ld2
            return r14
        Ld2:
            boolean r1 = r0.zza
            if (r1 != 0) goto L104
            java.lang.String[] r1 = r0.zze
            java.lang.String[] r2 = r0.zzf
            int r1 = r1.length
            int r2 = r2.length
            if (r1 == r2) goto Ldf
            goto L103
        Ldf:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
        Le4:
            java.lang.String[] r14 = r0.zze
            int r1 = r14.length
            if (r5 >= r1) goto Lf5
            r14 = r14[r5]
            java.lang.String[] r1 = r0.zzf
            r1 = r1[r5]
            r9.put(r14, r1)
            int r5 = r5 + 1
            goto Le4
        Lf5:
            int r7 = r0.zzc
            byte[] r8 = r0.zzd
            boolean r10 = r0.zzg
            long r11 = r0.zzh
            com.google.android.gms.internal.ads.zzapy r14 = new com.google.android.gms.internal.ads.zzapy
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11)
        L103:
            return r14
        L104:
            java.lang.String r14 = r0.zzb
            com.google.android.gms.internal.ads.zzaql r0 = new com.google.android.gms.internal.ads.zzaql
            r0.<init>(r14)
            throw r0
        L10c:
            r14 = move-exception
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()
            long r5 = r2.elapsedRealtime()
            long r5 = r5 - r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            throw r14
        L12c:
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()
            long r5 = r2.elapsedRealtime()
            long r5 = r5 - r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return r14
    }
}
