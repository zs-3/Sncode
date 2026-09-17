package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcdd implements com.google.android.gms.internal.ads.zzgg {
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
    private com.google.android.gms.internal.ads.zzgm zzl;

    public zzcdd(android.content.Context r1, com.google.android.gms.internal.ads.zzgg r2, java.lang.String r3, int r4, com.google.android.gms.internal.ads.zzhh r5, com.google.android.gms.internal.ads.zzcdc r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r1 = 0
            r0.zzj = r1
            r0.zzk = r1
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            r2 = -1
            r1.<init>(r2)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzbT
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.zze = r1
            return
    }

    private final boolean zzg() {
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
            boolean r0 = r4.zzj
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
            boolean r0 = r4.zzk
            if (r0 != 0) goto L36
            return r2
        L36:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.zzg
            if (r0 == 0) goto L14
            java.io.InputStream r0 = r1.zzf
            if (r0 == 0) goto Ld
            int r2 = r0.read(r2, r3, r4)
            goto L13
        Ld:
            com.google.android.gms.internal.ads.zzgg r0 = r1.zzb
            int r2 = r0.zza(r2, r3, r4)
        L13:
            return r2
        L14:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Attempt to read closed CacheDataSource."
            r2.<init>(r3)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(com.google.android.gms.internal.ads.zzgm r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = r5.zzg
            if (r0 != 0) goto L11c
            r0 = 1
            r5.zzg = r0
            android.net.Uri r0 = r6.zza
            r5.zzh = r0
            r5.zzl = r6
            com.google.android.gms.internal.ads.zzbbg r0 = com.google.android.gms.internal.ads.zzbbg.zza(r0)
            r5.zzi = r0
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzei
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto Lb3
            com.google.android.gms.internal.ads.zzbbg r0 = r5.zzi
            if (r0 == 0) goto Lfa
            com.google.android.gms.internal.ads.zzbbg r0 = r5.zzi
            long r2 = r6.zze
            r0.zzh = r2
            com.google.android.gms.internal.ads.zzbbg r6 = r5.zzi
            java.lang.String r0 = r5.zzc
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfyo.zzc(r0)
            r6.zzi = r0
            com.google.android.gms.internal.ads.zzbbg r6 = r5.zzi
            int r0 = r5.zzd
            r6.zzj = r0
            com.google.android.gms.internal.ads.zzbbg r6 = r5.zzi
            boolean r6 = r6.zzg
            if (r6 == 0) goto L53
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzek
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r0.zza(r6)
            java.lang.Long r6 = (java.lang.Long) r6
            goto L5f
        L53:
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzej
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r0.zza(r6)
            java.lang.Long r6 = (java.lang.Long) r6
        L5f:
            long r2 = r6.longValue()
            com.google.android.gms.common.util.Clock r6 = com.google.android.gms.ads.internal.zzu.zzB()
            r6.elapsedRealtime()
            com.google.android.gms.ads.internal.zzu.zzd()
            android.content.Context r6 = r5.zza
            com.google.android.gms.internal.ads.zzbbg r0 = r5.zzi
            java.util.concurrent.Future r6 = com.google.android.gms.internal.ads.zzbbr.zza(r6, r0)
            r0 = 0
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La8 java.lang.Throwable -> Lab
            java.lang.Object r2 = r6.get(r2, r4)     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La8 java.lang.Throwable -> Lab
            com.google.android.gms.internal.ads.zzbbs r2 = (com.google.android.gms.internal.ads.zzbbs) r2     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La8 java.lang.Throwable -> Lab
            r2.zzd()     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La8 java.lang.Throwable -> Lab
            boolean r3 = r2.zzf()     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La8 java.lang.Throwable -> Lab
            r5.zzj = r3     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La8 java.lang.Throwable -> Lab
            boolean r3 = r2.zze()     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La8 java.lang.Throwable -> Lab
            r5.zzk = r3     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La8 java.lang.Throwable -> Lab
            r2.zza()     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La8 java.lang.Throwable -> Lab
            boolean r3 = r5.zzg()     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La8 java.lang.Throwable -> Lab
            if (r3 != 0) goto Lab
            java.io.InputStream r2 = r2.zzc()     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La8 java.lang.Throwable -> Lab
            r5.zzf = r2     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La8 java.lang.Throwable -> Lab
            goto Lab
        L9d:
            r6.cancel(r0)     // Catch: java.lang.Throwable -> Lab
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lab
            r6.interrupt()     // Catch: java.lang.Throwable -> Lab
            goto Lab
        La8:
            r6.cancel(r0)     // Catch: java.lang.Throwable -> Lab
        Lab:
            com.google.android.gms.common.util.Clock r6 = com.google.android.gms.ads.internal.zzu.zzB()
            r6.elapsedRealtime()
            throw r1
        Lb3:
            com.google.android.gms.internal.ads.zzbbg r0 = r5.zzi
            if (r0 == 0) goto Ld7
            com.google.android.gms.internal.ads.zzbbg r0 = r5.zzi
            long r1 = r6.zze
            r0.zzh = r1
            com.google.android.gms.internal.ads.zzbbg r0 = r5.zzi
            java.lang.String r1 = r5.zzc
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfyo.zzc(r1)
            r0.zzi = r1
            com.google.android.gms.internal.ads.zzbbg r0 = r5.zzi
            int r1 = r5.zzd
            r0.zzj = r1
            com.google.android.gms.internal.ads.zzbbc r0 = com.google.android.gms.ads.internal.zzu.zzc()
            com.google.android.gms.internal.ads.zzbbg r1 = r5.zzi
            com.google.android.gms.internal.ads.zzbbd r1 = r0.zzb(r1)
        Ld7:
            if (r1 == 0) goto Lfa
            boolean r0 = r1.zze()
            if (r0 == 0) goto Lfa
            boolean r0 = r1.zzg()
            r5.zzj = r0
            boolean r0 = r1.zzf()
            r5.zzk = r0
            boolean r0 = r5.zzg()
            if (r0 != 0) goto Lfa
            java.io.InputStream r6 = r1.zzc()
            r5.zzf = r6
            r0 = -1
            return r0
        Lfa:
            com.google.android.gms.internal.ads.zzbbg r0 = r5.zzi
            if (r0 == 0) goto L113
            com.google.android.gms.internal.ads.zzgk r6 = r6.zza()
            com.google.android.gms.internal.ads.zzbbg r0 = r5.zzi
            java.lang.String r0 = r0.zza
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r6.zzd(r0)
            com.google.android.gms.internal.ads.zzgm r6 = r6.zze()
            r5.zzl = r6
        L113:
            com.google.android.gms.internal.ads.zzgg r6 = r5.zzb
            com.google.android.gms.internal.ads.zzgm r0 = r5.zzl
            long r0 = r6.zzb(r0)
            return r0
        L11c:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "Attempt to open an already open CacheDataSource."
            r6.<init>(r0)
            throw r6
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final android.net.Uri zzc() {
            r1 = this;
            android.net.Uri r0 = r1.zzh
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.zzg
            if (r0 == 0) goto L1a
            r0 = 0
            r2.zzg = r0
            r0 = 0
            r2.zzh = r0
            java.io.InputStream r1 = r2.zzf
            if (r1 == 0) goto L14
            com.google.android.gms.common.util.IOUtils.closeQuietly(r1)
            r2.zzf = r0
            return
        L14:
            com.google.android.gms.internal.ads.zzgg r0 = r2.zzb
            r0.zzd()
            return
        L1a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Attempt to close an already closed CacheDataSource."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final /* synthetic */ java.util.Map zze() {
            r1 = this;
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzf(com.google.android.gms.internal.ads.zzhh r1) {
            r0 = this;
            return
    }
}
