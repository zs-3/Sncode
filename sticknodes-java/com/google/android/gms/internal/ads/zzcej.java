package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcej extends com.google.android.gms.internal.ads.zzfz {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgg zzb;
    private final java.lang.String zzc;
    private final int zzd;
    private final boolean zze;
    private java.io.InputStream zzf;
    private boolean zzg;
    private android.net.Uri zzh;
    private volatile com.google.android.gms.internal.ads.zzbbg zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private com.google.common.util.concurrent.ListenableFuture zzo;
    private final java.util.concurrent.atomic.AtomicLong zzp;
    private final com.google.android.gms.internal.ads.zzceu zzq;

    public zzcej(android.content.Context r2, com.google.android.gms.internal.ads.zzgg r3, java.lang.String r4, int r5, com.google.android.gms.internal.ads.zzhh r6, com.google.android.gms.internal.ads.zzceu r7) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.zza = r2
            r1.zzb = r3
            r1.zzq = r7
            r1.zzc = r4
            r1.zzd = r5
            r1.zzj = r0
            r1.zzk = r0
            r1.zzl = r0
            r1.zzm = r0
            r2 = 0
            r1.zzn = r2
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r3 = -1
            r2.<init>(r3)
            r1.zzp = r2
            r2 = 0
            r1.zzo = r2
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzbT
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r1.zze = r2
            r1.zzf(r6)
            return
    }

    private final boolean zzr() {
            r4 = this;
            boolean r0 = r4.zze
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzel
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L1f
            boolean r0 = r4.zzl
            if (r0 == 0) goto L1e
            goto L1f
        L1e:
            return r2
        L1f:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzem
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L36
            boolean r0 = r4.zzm
            if (r0 != 0) goto L36
            return r2
        L36:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.zzg
            if (r0 == 0) goto L1f
            java.io.InputStream r0 = r1.zzf
            if (r0 == 0) goto Ld
            int r2 = r0.read(r2, r3, r4)
            goto L13
        Ld:
            com.google.android.gms.internal.ads.zzgg r0 = r1.zzb
            int r2 = r0.zza(r2, r3, r4)
        L13:
            boolean r3 = r1.zze
            if (r3 == 0) goto L1b
            java.io.InputStream r3 = r1.zzf
            if (r3 == 0) goto L1e
        L1b:
            r1.zzg(r2)
        L1e:
            return r2
        L1f:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Attempt to read closed GcacheDataSource."
            r2.<init>(r3)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(com.google.android.gms.internal.ads.zzgm r14) throws java.io.IOException {
            r13 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = "Cache connection took "
            boolean r2 = r13.zzg
            if (r2 != 0) goto L202
            r2 = 1
            r13.zzg = r2
            android.net.Uri r3 = r14.zza
            r13.zzh = r3
            boolean r3 = r13.zze
            if (r3 != 0) goto L16
            r13.zzj(r14)
        L16:
            android.net.Uri r3 = r14.zza
            com.google.android.gms.internal.ads.zzbbg r3 = com.google.android.gms.internal.ads.zzbbg.zza(r3)
            r13.zzi = r3
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzei
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = -1
            r6 = 0
            if (r3 == 0) goto L186
            com.google.android.gms.internal.ads.zzbbg r3 = r13.zzi
            if (r3 == 0) goto L1e2
            com.google.android.gms.internal.ads.zzbbg r3 = r13.zzi
            long r7 = r14.zze
            r3.zzh = r7
            com.google.android.gms.internal.ads.zzbbg r3 = r13.zzi
            java.lang.String r7 = r13.zzc
            java.lang.String r7 = com.google.android.gms.internal.ads.zzfyo.zzc(r7)
            r3.zzi = r7
            com.google.android.gms.internal.ads.zzbbg r3 = r13.zzi
            int r7 = r13.zzd
            r3.zzj = r7
            com.google.android.gms.internal.ads.zzbbg r3 = r13.zzi
            boolean r3 = r3.zzg
            if (r3 == 0) goto L60
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzek
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r7.zza(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            goto L6c
        L60:
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzej
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r7.zza(r3)
            java.lang.Long r3 = (java.lang.Long) r3
        L6c:
            long r7 = r3.longValue()
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()
            long r9 = r3.elapsedRealtime()
            com.google.android.gms.ads.internal.zzu.zzd()
            android.content.Context r3 = r13.zza
            com.google.android.gms.internal.ads.zzbbg r11 = r13.zzi
            java.util.concurrent.Future r3 = com.google.android.gms.internal.ads.zzbbr.zza(r3, r11)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L109 java.lang.InterruptedException -> L10c java.lang.Throwable -> L12f
            java.lang.Object r7 = r3.get(r7, r11)     // Catch: java.lang.Throwable -> L109 java.lang.InterruptedException -> L10c java.lang.Throwable -> L12f
            com.google.android.gms.internal.ads.zzbbs r7 = (com.google.android.gms.internal.ads.zzbbs) r7     // Catch: java.lang.Throwable -> L109 java.lang.InterruptedException -> L10c java.lang.Throwable -> L12f
            boolean r8 = r7.zzd()     // Catch: java.lang.Throwable -> L103 java.lang.InterruptedException -> L105 java.lang.Throwable -> L107
            r13.zzj = r8     // Catch: java.lang.Throwable -> L103 java.lang.InterruptedException -> L105 java.lang.Throwable -> L107
            boolean r8 = r7.zzf()     // Catch: java.lang.Throwable -> L103 java.lang.InterruptedException -> L105 java.lang.Throwable -> L107
            r13.zzl = r8     // Catch: java.lang.Throwable -> L103 java.lang.InterruptedException -> L105 java.lang.Throwable -> L107
            boolean r8 = r7.zze()     // Catch: java.lang.Throwable -> L103 java.lang.InterruptedException -> L105 java.lang.Throwable -> L107
            r13.zzm = r8     // Catch: java.lang.Throwable -> L103 java.lang.InterruptedException -> L105 java.lang.Throwable -> L107
            long r11 = r7.zza()     // Catch: java.lang.Throwable -> L103 java.lang.InterruptedException -> L105 java.lang.Throwable -> L107
            r13.zzn = r11     // Catch: java.lang.Throwable -> L103 java.lang.InterruptedException -> L105 java.lang.Throwable -> L107
            boolean r8 = r13.zzr()     // Catch: java.lang.Throwable -> L103 java.lang.InterruptedException -> L105 java.lang.Throwable -> L107
            if (r8 != 0) goto Lde
            java.io.InputStream r7 = r7.zzc()     // Catch: java.lang.Throwable -> L103 java.lang.InterruptedException -> L105 java.lang.Throwable -> L107
            r13.zzf = r7     // Catch: java.lang.Throwable -> L103 java.lang.InterruptedException -> L105 java.lang.Throwable -> L107
            boolean r7 = r13.zze     // Catch: java.lang.Throwable -> L103 java.lang.InterruptedException -> L105 java.lang.Throwable -> L107
            if (r7 == 0) goto Lb6
            r13.zzj(r14)     // Catch: java.lang.Throwable -> L103 java.lang.InterruptedException -> L105 java.lang.Throwable -> L107
        Lb6:
            com.google.android.gms.common.util.Clock r14 = com.google.android.gms.ads.internal.zzu.zzB()
            long r6 = r14.elapsedRealtime()
            long r6 = r6 - r9
            com.google.android.gms.internal.ads.zzceu r14 = r13.zzq
            com.google.android.gms.internal.ads.zzcew r14 = r14.zza
            r14.zzab(r2, r6)
            r13.zzk = r2
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r1)
            r14.append(r6)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r14)
            return r4
        Lde:
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()
            long r3 = r3.elapsedRealtime()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.zzceu r5 = r13.zzq
            com.google.android.gms.internal.ads.zzcew r5 = r5.zza
            r5.zzab(r2, r3)
            r13.zzk = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L157
        L103:
            r14 = move-exception
            goto L15e
        L105:
            r4 = 1
            goto L10d
        L107:
            r4 = 1
            goto L130
        L109:
            r14 = move-exception
            r2 = 0
            goto L15e
        L10c:
            r4 = 0
        L10d:
            r3.cancel(r2)     // Catch: java.lang.Throwable -> L15c
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L15c
            r2.interrupt()     // Catch: java.lang.Throwable -> L15c
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()
            long r2 = r2.elapsedRealtime()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.zzceu r5 = r13.zzq
            com.google.android.gms.internal.ads.zzcew r5 = r5.zza
            r5.zzab(r4, r2)
            r13.zzk = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L14a
        L12f:
            r4 = 0
        L130:
            r3.cancel(r2)     // Catch: java.lang.Throwable -> L15c
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()
            long r2 = r2.elapsedRealtime()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.zzceu r5 = r13.zzq
            com.google.android.gms.internal.ads.zzcew r5 = r5.zza
            r5.zzab(r4, r2)
            r13.zzk = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L14a:
            r4.append(r1)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L157:
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            goto L1e2
        L15c:
            r14 = move-exception
            r2 = r4
        L15e:
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()
            long r3 = r3.elapsedRealtime()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.zzceu r5 = r13.zzq
            com.google.android.gms.internal.ads.zzcew r5 = r5.zza
            r5.zzab(r2, r3)
            r13.zzk = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            throw r14
        L186:
            com.google.android.gms.internal.ads.zzbbg r0 = r13.zzi
            if (r0 == 0) goto L1ab
            com.google.android.gms.internal.ads.zzbbg r0 = r13.zzi
            long r7 = r14.zze
            r0.zzh = r7
            com.google.android.gms.internal.ads.zzbbg r0 = r13.zzi
            java.lang.String r1 = r13.zzc
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfyo.zzc(r1)
            r0.zzi = r1
            com.google.android.gms.internal.ads.zzbbg r0 = r13.zzi
            int r1 = r13.zzd
            r0.zzj = r1
            com.google.android.gms.internal.ads.zzbbc r0 = com.google.android.gms.ads.internal.zzu.zzc()
            com.google.android.gms.internal.ads.zzbbg r1 = r13.zzi
            com.google.android.gms.internal.ads.zzbbd r0 = r0.zzb(r1)
            goto L1ac
        L1ab:
            r0 = 0
        L1ac:
            if (r0 == 0) goto L1e2
            boolean r1 = r0.zze()
            if (r1 == 0) goto L1e2
            boolean r1 = r0.zzd()
            r13.zzj = r1
            boolean r1 = r0.zzg()
            r13.zzl = r1
            boolean r1 = r0.zzf()
            r13.zzm = r1
            long r7 = r0.zza()
            r13.zzn = r7
            r13.zzk = r2
            boolean r1 = r13.zzr()
            if (r1 != 0) goto L1e2
            java.io.InputStream r0 = r0.zzc()
            r13.zzf = r0
            boolean r0 = r13.zze
            if (r0 == 0) goto L1e1
            r13.zzj(r14)
        L1e1:
            return r4
        L1e2:
            r13.zzk = r6
            com.google.android.gms.internal.ads.zzbbg r0 = r13.zzi
            if (r0 == 0) goto L1fb
            com.google.android.gms.internal.ads.zzgk r14 = r14.zza()
            com.google.android.gms.internal.ads.zzbbg r0 = r13.zzi
            java.lang.String r0 = r0.zza
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r14.zzd(r0)
            com.google.android.gms.internal.ads.zzgm r14 = r14.zze()
        L1fb:
            com.google.android.gms.internal.ads.zzgg r0 = r13.zzb
            long r0 = r0.zzb(r14)
            return r0
        L202:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = "Attempt to open an already open GcacheDataSource."
            r14.<init>(r0)
            throw r14
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final android.net.Uri zzc() {
            r1 = this;
            android.net.Uri r0 = r1.zzh
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() throws java.io.IOException {
            r4 = this;
            boolean r0 = r4.zzg
            if (r0 == 0) goto L29
            r0 = 0
            r4.zzg = r0
            r1 = 0
            r4.zzh = r1
            boolean r2 = r4.zze
            r3 = 1
            if (r2 == 0) goto L13
            java.io.InputStream r2 = r4.zzf
            if (r2 == 0) goto L14
        L13:
            r0 = 1
        L14:
            java.io.InputStream r2 = r4.zzf
            if (r2 == 0) goto L1e
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
            r4.zzf = r1
            goto L23
        L1e:
            com.google.android.gms.internal.ads.zzgg r1 = r4.zzb
            r1.zzd()
        L23:
            if (r0 == 0) goto L28
            r4.zzh()
        L28:
            return
        L29:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Attempt to close an already closed GcacheDataSource."
            r0.<init>(r1)
            throw r0
    }

    public final long zzk() {
            r2 = this;
            long r0 = r2.zzn
            return r0
    }

    public final long zzl() {
            r5 = this;
            com.google.android.gms.internal.ads.zzbbg r0 = r5.zzi
            r1 = -1
            if (r0 != 0) goto L7
            goto L4b
        L7:
            java.util.concurrent.atomic.AtomicLong r0 = r5.zzp
            long r3 = r0.get()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L18
            java.util.concurrent.atomic.AtomicLong r0 = r5.zzp
            long r0 = r0.get()
            return r0
        L18:
            monitor-enter(r5)
            com.google.common.util.concurrent.ListenableFuture r0 = r5.zzo     // Catch: java.lang.Throwable -> L4c
            if (r0 != 0) goto L2a
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zza     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzcei r3 = new com.google.android.gms.internal.ads.zzcei     // Catch: java.lang.Throwable -> L4c
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L4c
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb(r3)     // Catch: java.lang.Throwable -> L4c
            r5.zzo = r0     // Catch: java.lang.Throwable -> L4c
        L2a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4c
            com.google.common.util.concurrent.ListenableFuture r0 = r5.zzo
            boolean r0 = r0.isDone()
            if (r0 == 0) goto L4b
            java.util.concurrent.atomic.AtomicLong r0 = r5.zzp     // Catch: java.lang.Throwable -> L4b
            com.google.common.util.concurrent.ListenableFuture r3 = r5.zzo     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L4b
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L4b
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L4b
            r0.compareAndSet(r1, r3)     // Catch: java.lang.Throwable -> L4b
            java.util.concurrent.atomic.AtomicLong r0 = r5.zzp
            long r0 = r0.get()
            return r0
        L4b:
            return r1
        L4c:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4c
            throw r0
    }

    final /* synthetic */ java.lang.Long zzm() throws java.lang.Exception {
            r2 = this;
            com.google.android.gms.internal.ads.zzbbc r0 = com.google.android.gms.ads.internal.zzu.zzc()
            com.google.android.gms.internal.ads.zzbbg r1 = r2.zzi
            long r0 = r0.zza(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    public final boolean zzn() {
            r1 = this;
            boolean r0 = r1.zzj
            return r0
    }

    public final boolean zzo() {
            r1 = this;
            boolean r0 = r1.zzm
            return r0
    }

    public final boolean zzp() {
            r1 = this;
            boolean r0 = r1.zzl
            return r0
    }

    public final boolean zzq() {
            r1 = this;
            boolean r0 = r1.zzk
            return r0
    }
}
