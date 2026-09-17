package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgd extends com.google.android.gms.internal.ads.zzfz {
    private final android.content.ContentResolver zza;
    private android.net.Uri zzb;
    private android.content.res.AssetFileDescriptor zzc;
    private java.io.FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgd(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            android.content.ContentResolver r2 = r2.getContentResolver()
            r1.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] r8, int r9, int r10) throws com.google.android.gms.internal.ads.zzgc {
            r7 = this;
            if (r10 != 0) goto L4
            r8 = 0
            return r8
        L4:
            long r0 = r7.zze
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
            java.io.FileInputStream r0 = r7.zzd     // Catch: java.io.IOException -> L32
            int r1 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.io.IOException -> L32
            int r8 = r0.read(r8, r9, r10)     // Catch: java.io.IOException -> L32
            if (r8 != r4) goto L24
            return r4
        L24:
            long r9 = r7.zze
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 == 0) goto L2e
            long r0 = (long) r8
            long r9 = r9 - r0
            r7.zze = r9
        L2e:
            r7.zzg(r8)
            return r8
        L32:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzgc r9 = new com.google.android.gms.internal.ads.zzgc
            r10 = 2000(0x7d0, float:2.803E-42)
            r9.<init>(r8, r10)
            throw r9
        L3b:
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(com.google.android.gms.internal.ads.zzgm r18) throws com.google.android.gms.internal.ads.zzgc {
            r17 = this;
            r1 = r17
            r0 = r18
            r3 = 1
            android.net.Uri r4 = r0.zza     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            android.net.Uri r4 = r4.normalizeScheme()     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            r1.zzb = r4     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            r17.zzi(r18)     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            java.lang.String r5 = "content"
            java.lang.String r6 = r4.getScheme()     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            boolean r5 = r5.equals(r6)     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            if (r5 == 0) goto L2f
            android.os.Bundle r5 = new android.os.Bundle     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            r5.<init>()     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            java.lang.String r6 = "android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT"
            r5.putBoolean(r6, r3)     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            android.content.ContentResolver r6 = r1.zza     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            java.lang.String r7 = "*/*"
            android.content.res.AssetFileDescriptor r5 = r6.openTypedAssetFileDescriptor(r4, r7, r5)     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            goto L37
        L2f:
            android.content.ContentResolver r5 = r1.zza     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            java.lang.String r6 = "r"
            android.content.res.AssetFileDescriptor r5 = r5.openAssetFileDescriptor(r4, r6)     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
        L37:
            r1.zzc = r5     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            if (r5 == 0) goto Lcd
            long r6 = r5.getLength()     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            java.io.FileDescriptor r8 = r5.getFileDescriptor()     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            r4.<init>(r8)     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            r1.zzd = r4     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            r8 = 2008(0x7d8, float:2.814E-42)
            r9 = 0
            r10 = -1
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L60
            long r13 = r0.zze     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 > 0) goto L5a
            goto L60
        L5a:
            com.google.android.gms.internal.ads.zzgc r0 = new com.google.android.gms.internal.ads.zzgc     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            r0.<init>(r9, r8)     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            throw r0     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
        L60:
            long r13 = r5.getStartOffset()     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            long r2 = r0.zze     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            long r2 = r2 + r13
            long r2 = r4.skip(r2)     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            long r2 = r2 - r13
            long r13 = r0.zze     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            int r16 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r16 != 0) goto Lc7
            r13 = 0
            if (r12 != 0) goto L98
            java.nio.channels.FileChannel r2 = r4.getChannel()     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            long r3 = r2.size()     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 != 0) goto L86
            r1.zze = r10     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            r3 = r10
            goto La0
        L86:
            long r6 = r2.position()     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            long r3 = r3 - r6
            r1.zze = r3     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 < 0) goto L92
            goto La0
        L92:
            com.google.android.gms.internal.ads.zzgc r0 = new com.google.android.gms.internal.ads.zzgc     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            r0.<init>(r9, r8)     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            throw r0     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
        L98:
            long r3 = r6 - r2
            r1.zze = r3     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 < 0) goto Lc1
        La0:
            long r5 = r0.zzf
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 == 0) goto Lb1
            int r2 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r2 != 0) goto Lab
            goto Laf
        Lab:
            long r5 = java.lang.Math.min(r3, r5)
        Laf:
            r1.zze = r5
        Lb1:
            r2 = 1
            r1.zzf = r2
            r17.zzj(r18)
            long r2 = r0.zzf
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto Lbe
            return r2
        Lbe:
            long r2 = r1.zze
            return r2
        Lc1:
            com.google.android.gms.internal.ads.zzgc r0 = new com.google.android.gms.internal.ads.zzgc     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            r0.<init>(r9, r8)     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            throw r0     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
        Lc7:
            com.google.android.gms.internal.ads.zzgc r0 = new com.google.android.gms.internal.ads.zzgc     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            r0.<init>(r9, r8)     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            throw r0     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
        Lcd:
            com.google.android.gms.internal.ads.zzgc r0 = new com.google.android.gms.internal.ads.zzgc     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            java.io.IOException r2 = new java.io.IOException     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            r4.<init>()     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            java.lang.String r6 = "Could not open file descriptor for: "
            r4.append(r6)     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            r4.append(r3)     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            java.lang.String r3 = r4.toString()     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            r2.<init>(r3)     // Catch: java.io.IOException -> Lf1 com.google.android.gms.internal.ads.zzgc -> L102
            r3 = 2000(0x7d0, float:2.803E-42)
            r0.<init>(r2, r3)     // Catch: java.io.IOException -> Lef com.google.android.gms.internal.ads.zzgc -> L102
            throw r0     // Catch: java.io.IOException -> Lef com.google.android.gms.internal.ads.zzgc -> L102
        Lef:
            r0 = move-exception
            goto Lf4
        Lf1:
            r0 = move-exception
            r3 = 2000(0x7d0, float:2.803E-42)
        Lf4:
            com.google.android.gms.internal.ads.zzgc r2 = new com.google.android.gms.internal.ads.zzgc
            boolean r4 = r0 instanceof java.io.FileNotFoundException
            r5 = 1
            if (r5 == r4) goto Lfc
            goto Lfe
        Lfc:
            r3 = 2005(0x7d5, float:2.81E-42)
        Lfe:
            r2.<init>(r0, r3)
            throw r2
        L102:
            r0 = move-exception
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final android.net.Uri zzc() {
            r1 = this;
            android.net.Uri r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() throws com.google.android.gms.internal.ads.zzgc {
            r5 = this;
            r0 = 0
            r5.zzb = r0
            r1 = 0
            r2 = 2000(0x7d0, float:2.803E-42)
            java.io.FileInputStream r3 = r5.zzd     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
        Ld:
            r5.zzd = r0
            android.content.res.AssetFileDescriptor r3 = r5.zzc     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.zzc = r0
            boolean r0 = r5.zzf
            if (r0 == 0) goto L21
            r5.zzf = r1
            r5.zzh()
        L21:
            return
        L22:
            r2 = move-exception
            goto L50
        L24:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzgc r4 = new com.google.android.gms.internal.ads.zzgc     // Catch: java.lang.Throwable -> L22
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r3 = move-exception
            goto L34
        L2d:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzgc r4 = new com.google.android.gms.internal.ads.zzgc     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L2b
            throw r4     // Catch: java.lang.Throwable -> L2b
        L34:
            r5.zzd = r0
            android.content.res.AssetFileDescriptor r4 = r5.zzc     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L49
            if (r4 == 0) goto L3d
            r4.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L49
        L3d:
            r5.zzc = r0
            boolean r0 = r5.zzf
            if (r0 == 0) goto L48
            r5.zzf = r1
            r5.zzh()
        L48:
            throw r3
        L49:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzgc r4 = new com.google.android.gms.internal.ads.zzgc     // Catch: java.lang.Throwable -> L22
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L50:
            r5.zzc = r0
            boolean r0 = r5.zzf
            if (r0 == 0) goto L5b
            r5.zzf = r1
            r5.zzh()
        L5b:
            throw r2
    }
}
