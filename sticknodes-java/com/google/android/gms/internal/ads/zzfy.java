package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfy extends com.google.android.gms.internal.ads.zzfz {
    private final android.content.res.AssetManager zza;
    private android.net.Uri zzb;
    private java.io.InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzfy(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            android.content.res.AssetManager r2 = r2.getAssets()
            r1.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] r8, int r9, int r10) throws com.google.android.gms.internal.ads.zzfx {
            r7 = this;
            if (r10 != 0) goto L4
            r8 = 0
            return r8
        L4:
            long r0 = r7.zzd
            r2 = 0
            r4 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L3b
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L19
            long r5 = (long) r10
            long r0 = java.lang.Math.min(r0, r5)     // Catch: java.io.IOException -> L32
            int r10 = (int) r0     // Catch: java.io.IOException -> L32
        L19:
            java.io.InputStream r0 = r7.zzc     // Catch: java.io.IOException -> L32
            int r1 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.io.IOException -> L32
            int r8 = r0.read(r8, r9, r10)     // Catch: java.io.IOException -> L32
            if (r8 != r4) goto L24
            return r4
        L24:
            long r9 = r7.zzd
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 == 0) goto L2e
            long r0 = (long) r8
            long r9 = r9 - r0
            r7.zzd = r9
        L2e:
            r7.zzg(r8)
            return r8
        L32:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzfx r9 = new com.google.android.gms.internal.ads.zzfx
            r10 = 2000(0x7d0, float:2.803E-42)
            r9.<init>(r8, r10)
            throw r9
        L3b:
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(com.google.android.gms.internal.ads.zzgm r9) throws com.google.android.gms.internal.ads.zzfx {
            r8 = this;
            r0 = 1
            android.net.Uri r1 = r9.zza     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            r8.zzb = r1     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            java.lang.String r1 = r1.getPath()     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            java.util.Objects.requireNonNull(r1)
            java.lang.String r2 = "/android_asset/"
            boolean r2 = r1.startsWith(r2)     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            if (r2 == 0) goto L1b
            r2 = 15
            java.lang.String r1 = r1.substring(r2)     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            goto L27
        L1b:
            java.lang.String r2 = "/"
            boolean r2 = r1.startsWith(r2)     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            if (r2 == 0) goto L27
            java.lang.String r1 = r1.substring(r0)     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
        L27:
            r8.zzi(r9)     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            android.content.res.AssetManager r2 = r8.zza     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            java.io.InputStream r1 = r2.open(r1, r0)     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            r8.zzc = r1     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            long r2 = r9.zze     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            long r1 = r1.skip(r2)     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            long r3 = r9.zze     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L63
            long r1 = r9.zzf     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L49
            r8.zzd = r1     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            goto L5b
        L49:
            java.io.InputStream r1 = r8.zzc     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            int r1 = r1.available()     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            long r1 = (long) r1     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            r8.zzd = r1     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L5b
            r8.zzd = r3     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
        L5b:
            r8.zze = r0
            r8.zzj(r9)
            long r0 = r8.zzd
            return r0
        L63:
            com.google.android.gms.internal.ads.zzfx r9 = new com.google.android.gms.internal.ads.zzfx     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            r1 = 0
            r2 = 2008(0x7d8, float:2.814E-42)
            r9.<init>(r1, r2)     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
            throw r9     // Catch: java.io.IOException -> L6c com.google.android.gms.internal.ads.zzfx -> L7c
        L6c:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzfx r1 = new com.google.android.gms.internal.ads.zzfx
            boolean r2 = r9 instanceof java.io.FileNotFoundException
            if (r0 == r2) goto L76
            r0 = 2000(0x7d0, float:2.803E-42)
            goto L78
        L76:
            r0 = 2005(0x7d5, float:2.81E-42)
        L78:
            r1.<init>(r9, r0)
            throw r1
        L7c:
            r9 = move-exception
            throw r9
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final android.net.Uri zzc() {
            r1 = this;
            android.net.Uri r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() throws com.google.android.gms.internal.ads.zzfx {
            r5 = this;
            r0 = 0
            r5.zzb = r0
            r1 = 0
            java.io.InputStream r2 = r5.zzc     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.zzc = r0
            boolean r0 = r5.zze
            if (r0 == 0) goto L16
            r5.zze = r1
            r5.zzh()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzfx r3 = new com.google.android.gms.internal.ads.zzfx     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.zzc = r0
            boolean r0 = r5.zze
            if (r0 != 0) goto L29
            goto L2e
        L29:
            r5.zze = r1
            r5.zzh()
        L2e:
            throw r2
    }
}
