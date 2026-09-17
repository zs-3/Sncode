package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgw extends com.google.android.gms.internal.ads.zzfz {
    private java.io.RandomAccessFile zza;
    private android.net.Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzgw() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] r6, int r7, int r8) throws com.google.android.gms.internal.ads.zzgv {
            r5 = this;
            if (r8 != 0) goto L4
            r6 = 0
            return r6
        L4:
            long r0 = r5.zzc
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r6 = -1
            return r6
        Le:
            java.io.RandomAccessFile r2 = r5.zza     // Catch: java.io.IOException -> L28
            int r3 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.io.IOException -> L28
            long r3 = (long) r8     // Catch: java.io.IOException -> L28
            long r0 = java.lang.Math.min(r0, r3)     // Catch: java.io.IOException -> L28
            int r8 = (int) r0     // Catch: java.io.IOException -> L28
            int r6 = r2.read(r6, r7, r8)     // Catch: java.io.IOException -> L28
            if (r6 <= 0) goto L27
            long r7 = r5.zzc
            long r0 = (long) r6
            long r7 = r7 - r0
            r5.zzc = r7
            r5.zzg(r6)
        L27:
            return r6
        L28:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzgv r7 = new com.google.android.gms.internal.ads.zzgv
            r8 = 2000(0x7d0, float:2.803E-42)
            r7.<init>(r6, r8)
            throw r7
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(com.google.android.gms.internal.ads.zzgm r8) throws com.google.android.gms.internal.ads.zzgv {
            r7 = this;
            android.net.Uri r0 = r8.zza
            r7.zzb = r0
            r7.zzi(r8)
            r1 = 1
            r2 = 2000(0x7d0, float:2.803E-42)
            r3 = 2006(0x7d6, float:2.811E-42)
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            java.lang.String r5 = r0.getPath()     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            java.util.Objects.requireNonNull(r5)
            java.lang.String r6 = "r"
            r4.<init>(r5, r6)     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            r7.zza = r4
            long r5 = r8.zze     // Catch: java.io.IOException -> L4b
            r4.seek(r5)     // Catch: java.io.IOException -> L4b
            long r3 = r8.zzf     // Catch: java.io.IOException -> L4b
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L32
            java.io.RandomAccessFile r0 = r7.zza     // Catch: java.io.IOException -> L4b
            long r3 = r0.length()     // Catch: java.io.IOException -> L4b
            long r5 = r8.zze     // Catch: java.io.IOException -> L4b
            long r3 = r3 - r5
        L32:
            r7.zzc = r3     // Catch: java.io.IOException -> L4b
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L42
            r7.zzd = r1
            r7.zzj(r8)
            long r0 = r7.zzc
            return r0
        L42:
            com.google.android.gms.internal.ads.zzgv r8 = new com.google.android.gms.internal.ads.zzgv
            r0 = 2008(0x7d8, float:2.814E-42)
            r1 = 0
            r8.<init>(r1, r1, r0)
            throw r8
        L4b:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzgv r0 = new com.google.android.gms.internal.ads.zzgv
            r0.<init>(r8, r2)
            throw r0
        L52:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzgv r0 = new com.google.android.gms.internal.ads.zzgv
            r0.<init>(r8, r2)
            throw r0
        L59:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzgv r0 = new com.google.android.gms.internal.ads.zzgv
            r0.<init>(r8, r3)
            throw r0
        L60:
            r8 = move-exception
            java.lang.String r2 = r0.getQuery()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L94
            java.lang.String r2 = r0.getFragment()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L94
            com.google.android.gms.internal.ads.zzgv r0 = new com.google.android.gms.internal.ads.zzgv
            java.lang.Throwable r1 = r8.getCause()
            boolean r1 = r1 instanceof android.system.ErrnoException
            r2 = 2005(0x7d5, float:2.81E-42)
            if (r1 == 0) goto L8e
            java.lang.Throwable r1 = r8.getCause()
            android.system.ErrnoException r1 = (android.system.ErrnoException) r1
            int r1 = r1.errno
            int r4 = android.system.OsConstants.EACCES
            if (r1 != r4) goto L8e
            goto L90
        L8e:
            r3 = 2005(0x7d5, float:2.81E-42)
        L90:
            r0.<init>(r8, r3)
            throw r0
        L94:
            com.google.android.gms.internal.ads.zzgv r2 = new com.google.android.gms.internal.ads.zzgv
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.String r5 = r0.getPath()
            r3[r4] = r5
            java.lang.String r4 = r0.getQuery()
            r3[r1] = r4
            r1 = 2
            java.lang.String r0 = r0.getFragment()
            r3[r1] = r0
            java.lang.String r0 = "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r1 = 1004(0x3ec, float:1.407E-42)
            r2.<init>(r0, r8, r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final android.net.Uri zzc() {
            r1 = this;
            android.net.Uri r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() throws com.google.android.gms.internal.ads.zzgv {
            r5 = this;
            r0 = 0
            r5.zzb = r0
            r1 = 0
            java.io.RandomAccessFile r2 = r5.zza     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.zza = r0
            boolean r0 = r5.zzd
            if (r0 == 0) goto L16
            r5.zzd = r1
            r5.zzh()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzgv r3 = new com.google.android.gms.internal.ads.zzgv     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.zza = r0
            boolean r0 = r5.zzd
            if (r0 != 0) goto L29
            goto L2e
        L29:
            r5.zzd = r1
            r5.zzh()
        L2e:
            throw r2
    }
}
