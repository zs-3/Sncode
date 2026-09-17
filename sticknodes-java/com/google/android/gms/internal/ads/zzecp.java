package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzecp extends com.google.android.gms.internal.ads.zzbvi {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;
    private final com.google.android.gms.internal.ads.zzedh zzc;
    private final com.google.android.gms.internal.ads.zzcnc zzd;
    private final java.util.ArrayDeque zze;
    private final com.google.android.gms.internal.ads.zzfmd zzf;
    private final com.google.android.gms.internal.ads.zzbwi zzg;

    public zzecp(android.content.Context r1, com.google.android.gms.internal.ads.zzgfz r2, com.google.android.gms.internal.ads.zzbwi r3, com.google.android.gms.internal.ads.zzcnc r4, com.google.android.gms.internal.ads.zzedh r5, java.util.ArrayDeque r6, com.google.android.gms.internal.ads.zzede r7, com.google.android.gms.internal.ads.zzfmd r8) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.ads.zzbcv.zza(r1)
            r0.zza = r1
            r0.zzb = r2
            r0.zzg = r3
            r0.zzc = r5
            r0.zzd = r4
            r0.zze = r6
            r0.zzf = r8
            return
    }

    private final synchronized com.google.android.gms.internal.ads.zzecm zzk(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayDeque r0 = r3.zze     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L23
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.zzecm r1 = (com.google.android.gms.internal.ads.zzecm) r1     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r1.zzc     // Catch: java.lang.Throwable -> L23
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L7
            r0.remove()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r3)
            return r1
        L20:
            r4 = 0
            monitor-exit(r3)
            return r4
        L23:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    private static com.google.common.util.concurrent.ListenableFuture zzl(com.google.common.util.concurrent.ListenableFuture r3, com.google.android.gms.internal.ads.zzflg r4, com.google.android.gms.internal.ads.zzbon r5, com.google.android.gms.internal.ads.zzfma r6, com.google.android.gms.internal.ads.zzflp r7) {
            com.google.android.gms.internal.ads.zzboh r0 = com.google.android.gms.internal.ads.zzbok.zza
            com.google.android.gms.internal.ads.zzech r1 = new com.google.android.gms.internal.ads.zzech
            r1.<init>()
            java.lang.String r2 = "AFMA_getAdDictionary"
            com.google.android.gms.internal.ads.zzbod r5 = r5.zza(r2, r0, r1)
            com.google.android.gms.internal.ads.zzflz.zzd(r3, r7)
            com.google.android.gms.internal.ads.zzfla r0 = com.google.android.gms.internal.ads.zzfla.zzg
            com.google.android.gms.internal.ads.zzfkx r3 = r4.zzb(r0, r3)
            com.google.android.gms.internal.ads.zzfkx r3 = r3.zzf(r5)
            com.google.android.gms.internal.ads.zzfkl r3 = r3.zza()
            com.google.android.gms.internal.ads.zzflz.zzc(r3, r6, r7)
            return r3
    }

    private static com.google.common.util.concurrent.ListenableFuture zzm(com.google.android.gms.internal.ads.zzbwa r2, com.google.android.gms.internal.ads.zzflg r3, com.google.android.gms.internal.ads.zzeyk r4) {
            com.google.android.gms.internal.ads.zzecb r0 = new com.google.android.gms.internal.ads.zzecb
            r0.<init>(r4, r2)
            com.google.android.gms.internal.ads.zzecc r4 = new com.google.android.gms.internal.ads.zzecc
            r4.<init>()
            com.google.android.gms.internal.ads.zzfla r1 = com.google.android.gms.internal.ads.zzfla.zze
            android.os.Bundle r2 = r2.zza
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzh(r2)
            com.google.android.gms.internal.ads.zzfkx r2 = r3.zzb(r1, r2)
            com.google.android.gms.internal.ads.zzfkx r2 = r2.zzf(r0)
            com.google.android.gms.internal.ads.zzfkx r2 = r2.zze(r4)
            com.google.android.gms.internal.ads.zzfkl r2 = r2.zza()
            return r2
    }

    private final synchronized void zzn(com.google.android.gms.internal.ads.zzecm r2) {
            r1 = this;
            monitor-enter(r1)
            r1.zzo()     // Catch: java.lang.Throwable -> Lb
            java.util.ArrayDeque r0 = r1.zze     // Catch: java.lang.Throwable -> Lb
            r0.addLast(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    private final synchronized void zzo() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbey.zzc     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L1d
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L1d
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L1d
        Ld:
            java.util.ArrayDeque r1 = r2.zze     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1d
            if (r1 < r0) goto L1b
            java.util.ArrayDeque r1 = r2.zze     // Catch: java.lang.Throwable -> L1d
            r1.removeFirst()     // Catch: java.lang.Throwable -> L1d
            goto Ld
        L1b:
            monitor-exit(r2)
            return
        L1d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    private final void zzp(com.google.common.util.concurrent.ListenableFuture r3, com.google.android.gms.internal.ads.zzbvt r4, com.google.android.gms.internal.ads.zzbwa r5) {
            r2 = this;
            com.google.android.gms.internal.ads.zzeci r0 = new com.google.android.gms.internal.ads.zzeci
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzn(r3, r0, r1)
            com.google.android.gms.internal.ads.zzecl r0 = new com.google.android.gms.internal.ads.zzecl
            r0.<init>(r2, r5, r4)
            com.google.android.gms.internal.ads.zzgfz r4 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.android.gms.internal.ads.zzgfo.zzr(r3, r0, r4)
            return
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzbwa r9, int r10) {
            r8 = this;
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbey.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1a
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r10 = "Split request is disabled."
            r9.<init>(r10)
            com.google.common.util.concurrent.ListenableFuture r9 = com.google.android.gms.internal.ads.zzgfo.zzg(r9)
            return r9
        L1a:
            com.google.android.gms.internal.ads.zzfix r0 = r9.zzi
            if (r0 != 0) goto L2a
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r10 = "Pool configuration missing from request."
            r9.<init>(r10)
            com.google.common.util.concurrent.ListenableFuture r9 = com.google.android.gms.internal.ads.zzgfo.zzg(r9)
            return r9
        L2a:
            int r1 = r0.zzc
            if (r1 == 0) goto L81
            int r0 = r0.zzd
            if (r0 != 0) goto L33
            goto L81
        L33:
            android.content.Context r0 = r8.zza
            com.google.android.gms.internal.ads.zzfmd r1 = r8.zzf
            com.google.android.gms.internal.ads.zzboe r2 = com.google.android.gms.ads.internal.zzu.zzf()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            com.google.android.gms.internal.ads.zzbon r0 = r2.zzb(r0, r3, r1)
            com.google.android.gms.internal.ads.zzcnc r1 = r8.zzd
            com.google.android.gms.internal.ads.zzeyk r10 = r1.zzr(r9, r10)
            com.google.android.gms.internal.ads.zzflg r1 = r10.zzc()
            com.google.common.util.concurrent.ListenableFuture r5 = zzm(r9, r1, r10)
            com.google.android.gms.internal.ads.zzfma r10 = r10.zzd()
            android.content.Context r2 = r8.zza
            r3 = 9
            com.google.android.gms.internal.ads.zzflp r7 = com.google.android.gms.internal.ads.zzflo.zza(r2, r3)
            com.google.common.util.concurrent.ListenableFuture r4 = zzl(r5, r1, r0, r10, r7)
            com.google.android.gms.internal.ads.zzfla r10 = com.google.android.gms.internal.ads.zzfla.zzz
            r0 = 2
            com.google.common.util.concurrent.ListenableFuture[] r0 = new com.google.common.util.concurrent.ListenableFuture[r0]
            r2 = 0
            r0[r2] = r5
            r2 = 1
            r0[r2] = r4
            com.google.android.gms.internal.ads.zzfko r10 = r1.zza(r10, r0)
            com.google.android.gms.internal.ads.zzecf r0 = new com.google.android.gms.internal.ads.zzecf
            r2 = r0
            r3 = r8
            r6 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            com.google.android.gms.internal.ads.zzfkx r9 = r10.zza(r0)
            com.google.android.gms.internal.ads.zzfkl r9 = r9.zza()
            return r9
        L81:
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r10 = "Caching is disabled."
            r9.<init>(r10)
            com.google.common.util.concurrent.ListenableFuture r9 = com.google.android.gms.internal.ads.zzgfo.zzg(r9)
            return r9
    }

    public final com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzbwa r14, int r15) {
            r13 = this;
            com.google.android.gms.internal.ads.zzboe r0 = com.google.android.gms.ads.internal.zzu.zzf()
            android.content.Context r1 = r13.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            com.google.android.gms.internal.ads.zzfmd r3 = r13.zzf
            com.google.android.gms.internal.ads.zzbon r0 = r0.zzb(r1, r2, r3)
            com.google.android.gms.internal.ads.zzcnc r1 = r13.zzd
            com.google.android.gms.internal.ads.zzeyk r1 = r1.zzr(r14, r15)
            com.google.android.gms.internal.ads.zzbog r2 = com.google.android.gms.internal.ads.zzeco.zza
            com.google.android.gms.internal.ads.zzbof r3 = com.google.android.gms.internal.ads.zzbok.zzb
            java.lang.String r4 = "google.afma.response.normalize"
            com.google.android.gms.internal.ads.zzbod r2 = r0.zza(r4, r2, r3)
            com.google.android.gms.internal.ads.zzbeb r3 = com.google.android.gms.internal.ads.zzbey.zza
            java.lang.Object r3 = r3.zze()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 0
            if (r3 != 0) goto L3f
            java.lang.String r3 = r14.zzj
            if (r3 == 0) goto L4c
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L4c
            java.lang.String r3 = "Request contained a PoolKey but split request is disabled."
            com.google.android.gms.ads.internal.util.zze.zza(r3)
            goto L4c
        L3f:
            java.lang.String r3 = r14.zzh
            com.google.android.gms.internal.ads.zzecm r4 = r13.zzk(r3)
            if (r4 != 0) goto L4c
            java.lang.String r3 = "Request contained a PoolKey but no matching parameters were found."
            com.google.android.gms.ads.internal.util.zze.zza(r3)
        L4c:
            if (r4 != 0) goto L57
            android.content.Context r3 = r13.zza
            r5 = 9
            com.google.android.gms.internal.ads.zzflp r3 = com.google.android.gms.internal.ads.zzflo.zza(r3, r5)
            goto L59
        L57:
            com.google.android.gms.internal.ads.zzflp r3 = r4.zzd
        L59:
            com.google.android.gms.internal.ads.zzfma r5 = r1.zzd()
            android.os.Bundle r6 = r14.zza
            java.lang.String r7 = "ad_types"
            java.util.ArrayList r6 = r6.getStringArrayList(r7)
            r5.zzd(r6)
            com.google.android.gms.internal.ads.zzedg r6 = new com.google.android.gms.internal.ads.zzedg
            java.lang.String r7 = r14.zzg
            r6.<init>(r7, r5, r3)
            android.content.Context r7 = r13.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r8 = r14.zzb
            java.lang.String r8 = r8.afmaVersion
            com.google.android.gms.internal.ads.zzbwi r9 = r13.zzg
            com.google.android.gms.internal.ads.zzedd r10 = new com.google.android.gms.internal.ads.zzedd
            r10.<init>(r7, r8, r9, r15)
            com.google.android.gms.internal.ads.zzflg r15 = r1.zzc()
            android.content.Context r7 = r13.zza
            r8 = 11
            com.google.android.gms.internal.ads.zzflp r7 = com.google.android.gms.internal.ads.zzflo.zza(r7, r8)
            r8 = 10
            r9 = 1
            r11 = 0
            r12 = 2
            if (r4 != 0) goto Lee
            com.google.common.util.concurrent.ListenableFuture r1 = zzm(r14, r15, r1)
            com.google.common.util.concurrent.ListenableFuture r0 = zzl(r1, r15, r0, r5, r3)
            android.content.Context r3 = r13.zza
            com.google.android.gms.internal.ads.zzflp r3 = com.google.android.gms.internal.ads.zzflo.zza(r3, r8)
            com.google.android.gms.internal.ads.zzfla r4 = com.google.android.gms.internal.ads.zzfla.zzi
            com.google.common.util.concurrent.ListenableFuture[] r8 = new com.google.common.util.concurrent.ListenableFuture[r12]
            r8[r11] = r0
            r8[r9] = r1
            com.google.android.gms.internal.ads.zzfko r4 = r15.zza(r4, r8)
            com.google.android.gms.internal.ads.zzecd r8 = new com.google.android.gms.internal.ads.zzecd
            r8.<init>(r0, r14, r1)
            com.google.android.gms.internal.ads.zzfkx r4 = r4.zza(r8)
            com.google.android.gms.internal.ads.zzfkx r4 = r4.zze(r6)
            com.google.android.gms.internal.ads.zzflv r6 = new com.google.android.gms.internal.ads.zzflv
            r6.<init>(r3)
            com.google.android.gms.internal.ads.zzfkx r4 = r4.zze(r6)
            com.google.android.gms.internal.ads.zzfkx r4 = r4.zze(r10)
            com.google.android.gms.internal.ads.zzfkl r4 = r4.zza()
            com.google.android.gms.internal.ads.zzflz.zza(r4, r5, r3)
            com.google.android.gms.internal.ads.zzflz.zzd(r4, r7)
            com.google.android.gms.internal.ads.zzfla r3 = com.google.android.gms.internal.ads.zzfla.zzk
            r6 = 3
            com.google.common.util.concurrent.ListenableFuture[] r6 = new com.google.common.util.concurrent.ListenableFuture[r6]
            r6[r11] = r1
            r6[r9] = r0
            r6[r12] = r4
            com.google.android.gms.internal.ads.zzfko r15 = r15.zza(r3, r6)
            com.google.android.gms.internal.ads.zzece r3 = new com.google.android.gms.internal.ads.zzece
            r3.<init>(r14, r4, r1, r0)
            com.google.android.gms.internal.ads.zzfkx r14 = r15.zza(r3)
            com.google.android.gms.internal.ads.zzfkx r14 = r14.zzf(r2)
            com.google.android.gms.internal.ads.zzfkl r14 = r14.zza()
            goto L143
        Lee:
            com.google.android.gms.internal.ads.zzedf r14 = new com.google.android.gms.internal.ads.zzedf
            org.json.JSONObject r0 = r4.zzb
            com.google.android.gms.internal.ads.zzbwc r1 = r4.zza
            r14.<init>(r0, r1)
            android.content.Context r0 = r13.zza
            com.google.android.gms.internal.ads.zzflp r0 = com.google.android.gms.internal.ads.zzflo.zza(r0, r8)
            com.google.android.gms.internal.ads.zzfla r1 = com.google.android.gms.internal.ads.zzfla.zzi
            com.google.common.util.concurrent.ListenableFuture r14 = com.google.android.gms.internal.ads.zzgfo.zzh(r14)
            com.google.android.gms.internal.ads.zzfkx r14 = r15.zzb(r1, r14)
            com.google.android.gms.internal.ads.zzfkx r14 = r14.zze(r6)
            com.google.android.gms.internal.ads.zzflv r1 = new com.google.android.gms.internal.ads.zzflv
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzfkx r14 = r14.zze(r1)
            com.google.android.gms.internal.ads.zzfkx r14 = r14.zze(r10)
            com.google.android.gms.internal.ads.zzfkl r14 = r14.zza()
            com.google.android.gms.internal.ads.zzflz.zza(r14, r5, r0)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r4)
            com.google.android.gms.internal.ads.zzflz.zzd(r14, r7)
            com.google.android.gms.internal.ads.zzfla r1 = com.google.android.gms.internal.ads.zzfla.zzk
            com.google.common.util.concurrent.ListenableFuture[] r3 = new com.google.common.util.concurrent.ListenableFuture[r12]
            r3[r11] = r14
            r3[r9] = r0
            com.google.android.gms.internal.ads.zzfko r15 = r15.zza(r1, r3)
            com.google.android.gms.internal.ads.zzeca r1 = new com.google.android.gms.internal.ads.zzeca
            r1.<init>(r14, r0)
            com.google.android.gms.internal.ads.zzfkx r14 = r15.zza(r1)
            com.google.android.gms.internal.ads.zzfkx r14 = r14.zzf(r2)
            com.google.android.gms.internal.ads.zzfkl r14 = r14.zza()
        L143:
            com.google.android.gms.internal.ads.zzflz.zza(r14, r5, r7)
            return r14
    }

    public final com.google.common.util.concurrent.ListenableFuture zzd(com.google.android.gms.internal.ads.zzbwa r7, int r8) {
            r6 = this;
            com.google.android.gms.internal.ads.zzboe r0 = com.google.android.gms.ads.internal.zzu.zzf()
            android.content.Context r1 = r6.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            com.google.android.gms.internal.ads.zzfmd r3 = r6.zzf
            com.google.android.gms.internal.ads.zzbon r0 = r0.zzb(r1, r2, r3)
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbfd.zza
            java.lang.Object r1 = r1.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2a
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r8 = "Signal collection disabled."
            r7.<init>(r8)
            com.google.common.util.concurrent.ListenableFuture r7 = com.google.android.gms.internal.ads.zzgfo.zzg(r7)
            return r7
        L2a:
            com.google.android.gms.internal.ads.zzcnc r1 = r6.zzd
            com.google.android.gms.internal.ads.zzeyk r8 = r1.zzr(r7, r8)
            com.google.android.gms.internal.ads.zzexk r1 = r8.zza()
            com.google.android.gms.internal.ads.zzboh r2 = com.google.android.gms.internal.ads.zzbok.zza
            com.google.android.gms.internal.ads.zzbof r3 = com.google.android.gms.internal.ads.zzbok.zzb
            java.lang.String r4 = "google.afma.request.getSignals"
            com.google.android.gms.internal.ads.zzbod r0 = r0.zza(r4, r2, r3)
            android.content.Context r2 = r6.zza
            r3 = 22
            com.google.android.gms.internal.ads.zzflp r2 = com.google.android.gms.internal.ads.zzflo.zza(r2, r3)
            com.google.android.gms.internal.ads.zzflg r3 = r8.zzc()
            com.google.android.gms.internal.ads.zzfla r4 = com.google.android.gms.internal.ads.zzfla.zzl
            android.os.Bundle r5 = r7.zza
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzh(r5)
            com.google.android.gms.internal.ads.zzfkx r3 = r3.zzb(r4, r5)
            com.google.android.gms.internal.ads.zzflv r4 = new com.google.android.gms.internal.ads.zzflv
            r4.<init>(r2)
            com.google.android.gms.internal.ads.zzfkx r3 = r3.zze(r4)
            com.google.android.gms.internal.ads.zzecj r4 = new com.google.android.gms.internal.ads.zzecj
            r4.<init>(r1, r7)
            com.google.android.gms.internal.ads.zzfkx r1 = r3.zzf(r4)
            com.google.android.gms.internal.ads.zzfla r3 = com.google.android.gms.internal.ads.zzfla.zzm
            com.google.android.gms.internal.ads.zzfkx r1 = r1.zzb(r3)
            com.google.android.gms.internal.ads.zzfkx r0 = r1.zzf(r0)
            com.google.android.gms.internal.ads.zzfkl r0 = r0.zza()
            com.google.android.gms.internal.ads.zzfma r8 = r8.zzd()
            android.os.Bundle r1 = r7.zza
            java.lang.String r3 = "ad_types"
            java.util.ArrayList r1 = r1.getStringArrayList(r3)
            r8.zzd(r1)
            android.os.Bundle r7 = r7.zza
            java.lang.String r1 = "extras"
            android.os.Bundle r7 = r7.getBundle(r1)
            r8.zzf(r7)
            com.google.android.gms.internal.ads.zzflz.zzb(r0, r8, r2)
            com.google.android.gms.internal.ads.zzbeb r7 = com.google.android.gms.internal.ads.zzber.zzg
            java.lang.Object r7 = r7.zze()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto Lb0
            com.google.android.gms.internal.ads.zzedh r7 = r6.zzc
            java.util.Objects.requireNonNull(r7)
            com.google.android.gms.internal.ads.zzecg r8 = new com.google.android.gms.internal.ads.zzecg
            r8.<init>(r7)
            com.google.android.gms.internal.ads.zzgfz r7 = r6.zzb
            r0.addListener(r8, r7)
        Lb0:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zze(com.google.android.gms.internal.ads.zzbwa r2, com.google.android.gms.internal.ads.zzbvt r3) {
            r1 = this;
            int r0 = android.os.Binder.getCallingUid()
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r2, r0)
            r1.zzp(r0, r3, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzf(com.google.android.gms.internal.ads.zzbwa r5, com.google.android.gms.internal.ads.zzbvt r6) {
            r4 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcf
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            android.os.Bundle r0 = r5.zzm
            if (r0 == 0) goto L27
            com.google.android.gms.internal.ads.zzdtm r1 = com.google.android.gms.internal.ads.zzdtm.zze
            java.lang.String r1 = r1.zza()
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()
            long r2 = r2.currentTimeMillis()
            r0.putLong(r1, r2)
        L27:
            int r0 = android.os.Binder.getCallingUid()
            com.google.common.util.concurrent.ListenableFuture r0 = r4.zzd(r5, r0)
            r4.zzp(r0, r6, r5)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzg(com.google.android.gms.internal.ads.zzbwa r5, com.google.android.gms.internal.ads.zzbvt r6) {
            r4 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcf
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            android.os.Bundle r0 = r5.zzm
            if (r0 == 0) goto L27
            com.google.android.gms.internal.ads.zzdtm r1 = com.google.android.gms.internal.ads.zzdtm.zze
            java.lang.String r1 = r1.zza()
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()
            long r2 = r2.currentTimeMillis()
            r0.putLong(r1, r2)
        L27:
            int r0 = android.os.Binder.getCallingUid()
            com.google.common.util.concurrent.ListenableFuture r0 = r4.zzc(r5, r0)
            r4.zzp(r0, r6, r5)
            com.google.android.gms.internal.ads.zzbeb r5 = com.google.android.gms.internal.ads.zzber.zze
            java.lang.Object r5 = r5.zze()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4f
            com.google.android.gms.internal.ads.zzedh r5 = r4.zzc
            java.util.Objects.requireNonNull(r5)
            com.google.android.gms.internal.ads.zzecg r6 = new com.google.android.gms.internal.ads.zzecg
            r6.<init>(r5)
            com.google.android.gms.internal.ads.zzgfz r5 = r4.zzb
            r0.addListener(r6, r5)
        L4f:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzh(java.lang.String r2, com.google.android.gms.internal.ads.zzbvt r3) {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r2 = r1.zzi(r2)
            r0 = 0
            r1.zzp(r2, r3, r0)
            return
    }

    public final com.google.common.util.concurrent.ListenableFuture zzi(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbey.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1a
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r0 = "Split request is disabled."
            r3.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzg(r3)
            return r3
        L1a:
            com.google.android.gms.internal.ads.zzeck r0 = new com.google.android.gms.internal.ads.zzeck
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzecm r1 = r2.zzk(r3)
            if (r1 != 0) goto L39
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "URL to be removed not found for cache key: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzg(r0)
            return r3
        L39:
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r3
    }

    final /* synthetic */ java.io.InputStream zzj(com.google.common.util.concurrent.ListenableFuture r8, com.google.common.util.concurrent.ListenableFuture r9, com.google.android.gms.internal.ads.zzbwa r10, com.google.android.gms.internal.ads.zzflp r11) throws java.lang.Exception {
            r7 = this;
            java.lang.Object r0 = r8.get()
            com.google.android.gms.internal.ads.zzbwc r0 = (com.google.android.gms.internal.ads.zzbwc) r0
            java.lang.String r0 = r0.zze()
            java.lang.Object r9 = r9.get()
            r3 = r9
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.lang.String r4 = r10.zzh
            com.google.android.gms.internal.ads.zzecm r9 = new com.google.android.gms.internal.ads.zzecm
            java.lang.Object r8 = r8.get()
            r2 = r8
            com.google.android.gms.internal.ads.zzbwc r2 = (com.google.android.gms.internal.ads.zzbwc) r2
            r1 = r9
            r5 = r0
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r7.zzn(r9)
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r9 = r0.getBytes(r9)
            r8.<init>(r9)
            return r8
    }
}
