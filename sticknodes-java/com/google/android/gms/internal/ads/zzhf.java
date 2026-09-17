package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhf extends com.google.android.gms.internal.ads.zzfz {
    private final android.content.Context zza;
    private com.google.android.gms.internal.ads.zzgm zzb;
    private android.content.res.AssetFileDescriptor zzc;
    private java.io.InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzhf(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            android.content.Context r2 = r2.getApplicationContext()
            r1.zza = r2
            return
    }

    @java.lang.Deprecated
    public static android.net.Uri buildRawResourceUri(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "rawresource:///"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
    }

    private static int zzk(java.lang.String r3) throws com.google.android.gms.internal.ads.zzhe {
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L5
            return r3
        L5:
            com.google.android.gms.internal.ads.zzhe r3 = new com.google.android.gms.internal.ads.zzhe
            r0 = 0
            r1 = 1004(0x3ec, float:1.407E-42)
            java.lang.String r2 = "Resource identifier must be an integer."
            r3.<init>(r2, r0, r1)
            throw r3
    }

    private static android.content.res.AssetFileDescriptor zzl(android.content.Context r5, com.google.android.gms.internal.ads.zzgm r6) throws com.google.android.gms.internal.ads.zzhe {
            android.net.Uri r6 = r6.zza
            android.net.Uri r6 = r6.normalizeScheme()
            java.lang.String r0 = r6.getScheme()
            java.lang.String r1 = "rawresource"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            r1 = 1
            r2 = 2005(0x7d5, float:2.81E-42)
            r3 = 0
            if (r0 == 0) goto L4c
            android.content.res.Resources r5 = r5.getResources()
            java.util.List r0 = r6.getPathSegments()
            int r4 = r0.size()
            if (r4 != r1) goto L31
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = zzk(r0)
            goto Lbe
        L31:
            com.google.android.gms.internal.ads.zzhe r5 = new com.google.android.gms.internal.ads.zzhe
            int r6 = r0.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "rawresource:// URI must have exactly one path element, found "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L4c:
            java.lang.String r0 = r6.getScheme()
            java.lang.String r4 = "android.resource"
            boolean r0 = android.text.TextUtils.equals(r4, r0)
            if (r0 == 0) goto Lef
            java.lang.String r0 = r6.getPath()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r4 = "/"
            boolean r4 = r0.startsWith(r4)
            if (r4 == 0) goto L6b
            java.lang.String r0 = r0.substring(r1)
        L6b:
            java.lang.String r1 = r6.getHost()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L7a
            java.lang.String r1 = r5.getPackageName()
            goto L7e
        L7a:
            java.lang.String r1 = r6.getHost()
        L7e:
            java.lang.String r4 = r5.getPackageName()
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L8d
            android.content.res.Resources r5 = r5.getResources()
            goto L95
        L8d:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le6
            android.content.res.Resources r5 = r5.getResourcesForApplication(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le6
        L95:
            java.lang.String r4 = "\\d+"
            boolean r4 = r0.matches(r4)
            if (r4 == 0) goto La2
            int r0 = zzk(r0)
            goto Lbe
        La2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = ":"
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "raw"
            int r0 = r5.getIdentifier(r0, r1, r3)
            if (r0 == 0) goto Lde
        Lbe:
            android.content.res.AssetFileDescriptor r5 = r5.openRawResourceFd(r0)     // Catch: android.content.res.Resources.NotFoundException -> Ld7
            if (r5 == 0) goto Lc5
            return r5
        Lc5:
            com.google.android.gms.internal.ads.zzhe r5 = new com.google.android.gms.internal.ads.zzhe
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "Resource is compressed: "
            java.lang.String r6 = r0.concat(r6)
            r0 = 2000(0x7d0, float:2.803E-42)
            r5.<init>(r6, r3, r0)
            throw r5
        Ld7:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzhe r6 = new com.google.android.gms.internal.ads.zzhe
            r6.<init>(r3, r5, r2)
            throw r6
        Lde:
            com.google.android.gms.internal.ads.zzhe r5 = new com.google.android.gms.internal.ads.zzhe
            java.lang.String r6 = "Resource not found."
            r5.<init>(r6, r3, r2)
            throw r5
        Le6:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzhe r6 = new com.google.android.gms.internal.ads.zzhe
            java.lang.String r0 = "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility."
            r6.<init>(r0, r5, r2)
            throw r6
        Lef:
            com.google.android.gms.internal.ads.zzhe r5 = new com.google.android.gms.internal.ads.zzhe
            java.lang.String r6 = r6.getScheme()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported URI scheme ("
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = "). Only android.resource is supported."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r0 = 1004(0x3ec, float:1.407E-42)
            r5.<init>(r6, r3, r0)
            throw r5
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] r10, int r11, int r12) throws com.google.android.gms.internal.ads.zzhe {
            r9 = this;
            if (r12 != 0) goto L4
            r10 = 0
            return r10
        L4:
            long r0 = r9.zze
            r2 = 0
            r4 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L4f
            r2 = 2000(0x7d0, float:2.803E-42)
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L1b
            long r7 = (long) r12
            long r0 = java.lang.Math.min(r0, r7)     // Catch: java.io.IOException -> L47
            int r12 = (int) r0     // Catch: java.io.IOException -> L47
        L1b:
            java.io.InputStream r0 = r9.zzd     // Catch: java.io.IOException -> L47
            int r1 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.io.IOException -> L47
            int r10 = r0.read(r10, r11, r12)     // Catch: java.io.IOException -> L47
            if (r10 != r4) goto L39
            long r10 = r9.zze
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 != 0) goto L2c
            return r4
        L2c:
            com.google.android.gms.internal.ads.zzhe r10 = new com.google.android.gms.internal.ads.zzhe
            java.io.EOFException r11 = new java.io.EOFException
            r11.<init>()
            java.lang.String r12 = "End of stream reached having not read sufficient data."
            r10.<init>(r12, r11, r2)
            throw r10
        L39:
            long r11 = r9.zze
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 == 0) goto L43
            long r0 = (long) r10
            long r11 = r11 - r0
            r9.zze = r11
        L43:
            r9.zzg(r10)
            return r10
        L47:
            r10 = move-exception
            com.google.android.gms.internal.ads.zzhe r11 = new com.google.android.gms.internal.ads.zzhe
            r12 = 0
            r11.<init>(r12, r10, r2)
            throw r11
        L4f:
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(com.google.android.gms.internal.ads.zzgm r14) throws com.google.android.gms.internal.ads.zzhe {
            r13 = this;
            r13.zzb = r14
            r13.zzi(r14)
            android.content.Context r0 = r13.zza
            android.content.res.AssetFileDescriptor r0 = zzl(r0, r14)
            r13.zzc = r0
            long r0 = r0.getLength()
            java.io.FileInputStream r2 = new java.io.FileInputStream
            android.content.res.AssetFileDescriptor r3 = r13.zzc
            java.io.FileDescriptor r3 = r3.getFileDescriptor()
            r2.<init>(r3)
            r13.zzd = r2
            r3 = 2008(0x7d8, float:2.814E-42)
            r4 = -1
            r6 = 0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 == 0) goto L34
            long r8 = r14.zze     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r10 > 0) goto L2e
            goto L34
        L2e:
            com.google.android.gms.internal.ads.zzhe r14 = new com.google.android.gms.internal.ads.zzhe     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            r14.<init>(r6, r6, r3)     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            throw r14     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
        L34:
            android.content.res.AssetFileDescriptor r8 = r13.zzc     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            long r8 = r8.getStartOffset()     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            long r10 = r14.zze     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            long r10 = r10 + r8
            long r10 = r2.skip(r10)     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            long r10 = r10 - r8
            long r8 = r14.zze     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 != 0) goto La1
            r8 = 0
            if (r7 != 0) goto L72
            java.nio.channels.FileChannel r0 = r2.getChannel()     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            long r1 = r0.size()     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 != 0) goto L5c
            r13.zze = r4     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            r1 = r4
            goto L7a
        L5c:
            long r1 = r0.size()     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            long r10 = r0.position()     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            long r1 = r1 - r10
            r13.zze = r1     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto L6c
            goto L7a
        L6c:
            com.google.android.gms.internal.ads.zzhe r14 = new com.google.android.gms.internal.ads.zzhe     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            r14.<init>(r6, r6, r3)     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            throw r14     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
        L72:
            long r1 = r0 - r10
            r13.zze = r1     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto L9b
        L7a:
            long r6 = r14.zzf
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L8b
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L85
            goto L89
        L85:
            long r6 = java.lang.Math.min(r1, r6)
        L89:
            r13.zze = r6
        L8b:
            r0 = 1
            r13.zzf = r0
            r13.zzj(r14)
            long r0 = r14.zzf
            int r14 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r14 == 0) goto L98
            return r0
        L98:
            long r0 = r13.zze
            return r0
        L9b:
            com.google.android.gms.internal.ads.zzgh r14 = new com.google.android.gms.internal.ads.zzgh     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            r14.<init>(r3)     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            throw r14     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
        La1:
            com.google.android.gms.internal.ads.zzhe r14 = new com.google.android.gms.internal.ads.zzhe     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            r14.<init>(r6, r6, r3)     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
            throw r14     // Catch: java.io.IOException -> La7 com.google.android.gms.internal.ads.zzhe -> Lb0
        La7:
            r14 = move-exception
            com.google.android.gms.internal.ads.zzhe r0 = new com.google.android.gms.internal.ads.zzhe
            r1 = 2000(0x7d0, float:2.803E-42)
            r0.<init>(r6, r14, r1)
            throw r0
        Lb0:
            r14 = move-exception
            throw r14
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final android.net.Uri zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgm r0 = r1.zzb
            if (r0 == 0) goto L7
            android.net.Uri r0 = r0.zza
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() throws com.google.android.gms.internal.ads.zzhe {
            r5 = this;
            r0 = 0
            r5.zzb = r0
            r1 = 0
            r2 = 2000(0x7d0, float:2.803E-42)
            java.io.InputStream r3 = r5.zzd     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
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
            com.google.android.gms.internal.ads.zzhe r4 = new com.google.android.gms.internal.ads.zzhe     // Catch: java.lang.Throwable -> L22
            r4.<init>(r0, r3, r2)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r3 = move-exception
            goto L34
        L2d:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzhe r4 = new com.google.android.gms.internal.ads.zzhe     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r0, r3, r2)     // Catch: java.lang.Throwable -> L2b
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
            com.google.android.gms.internal.ads.zzhe r4 = new com.google.android.gms.internal.ads.zzhe     // Catch: java.lang.Throwable -> L22
            r4.<init>(r0, r3, r2)     // Catch: java.lang.Throwable -> L22
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
