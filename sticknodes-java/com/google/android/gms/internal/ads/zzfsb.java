package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfsb {
    public static boolean zza(int r1) {
            int r1 = r1 + (-1)
            r0 = 2
            if (r1 == r0) goto L13
            r0 = 4
            if (r1 == r0) goto L13
            r0 = 5
            if (r1 == r0) goto L13
            r0 = 6
            if (r1 == r0) goto L13
            r0 = 7
            if (r1 == r0) goto L13
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public static final int zzb(android.content.Context r14, com.google.android.gms.internal.ads.zzfqz r15) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            android.content.pm.ApplicationInfo r2 = r14.getApplicationInfo()
            java.lang.String r2 = r2.dataDir
            r1.<init>(r2)
            java.lang.String r2 = "lib"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            r2 = 5017(0x1399, float:7.03E-42)
            r3 = 8
            r4 = 7
            r5 = 6
            r6 = 1000(0x3e8, float:1.401E-42)
            r7 = 0
            r8 = 5
            r9 = 3
            r10 = 1
            if (r1 != 0) goto L2d
            java.lang.String r0 = "No lib/"
            r15.zzb(r2, r0)
        L29:
            r0 = 1000(0x3e8, float:1.401E-42)
            goto Lc6
        L2d:
            com.google.android.gms.internal.ads.zzgdi r1 = new com.google.android.gms.internal.ads.zzgdi
            java.lang.String r11 = ".*\\.so$"
            r12 = 2
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11, r12)
            r1.<init>(r11)
            java.io.File[] r0 = r0.listFiles(r1)
            if (r0 == 0) goto Lbf
            int r1 = r0.length
            if (r1 != 0) goto L44
            goto Lbf
        L44:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.IOException -> Lb5
            r2 = 0
            r0 = r0[r2]     // Catch: java.io.IOException -> Lb5
            r1.<init>(r0)     // Catch: java.io.IOException -> Lb5
            r0 = 20
            byte[] r11 = new byte[r0]     // Catch: java.lang.Throwable -> Lab
            int r13 = r1.read(r11)     // Catch: java.lang.Throwable -> Lab
            if (r13 != r0) goto L63
            byte[] r0 = new byte[r12]     // Catch: java.lang.Throwable -> Lab
            r0[r2] = r2     // Catch: java.lang.Throwable -> Lab
            r0[r10] = r2     // Catch: java.lang.Throwable -> Lab
            r13 = r11[r8]     // Catch: java.lang.Throwable -> Lab
            if (r13 != r12) goto L67
            zzd(r11, r7, r14, r15)     // Catch: java.lang.Throwable -> Lab
        L63:
            r1.close()     // Catch: java.io.IOException -> Lb5
            goto Lbd
        L67:
            r12 = 19
            r12 = r11[r12]     // Catch: java.lang.Throwable -> Lab
            r0[r2] = r12     // Catch: java.lang.Throwable -> Lab
            r2 = 18
            r2 = r11[r2]     // Catch: java.lang.Throwable -> Lab
            r0[r10] = r2     // Catch: java.lang.Throwable -> Lab
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch: java.lang.Throwable -> Lab
            short r0 = r0.getShort()     // Catch: java.lang.Throwable -> Lab
            if (r0 == r9) goto La6
            r2 = 40
            if (r0 == r2) goto La1
            r2 = 62
            if (r0 == r2) goto L9c
            r2 = 183(0xb7, float:2.56E-43)
            if (r0 == r2) goto L97
            r2 = 243(0xf3, float:3.4E-43)
            if (r0 == r2) goto L91
            zzd(r11, r7, r14, r15)     // Catch: java.lang.Throwable -> Lab
            goto L63
        L91:
            r1.close()     // Catch: java.io.IOException -> Lb5
            r0 = 8
            goto Lc6
        L97:
            r1.close()     // Catch: java.io.IOException -> Lb5
            r0 = 6
            goto Lc6
        L9c:
            r1.close()     // Catch: java.io.IOException -> Lb5
            r0 = 7
            goto Lc6
        La1:
            r1.close()     // Catch: java.io.IOException -> Lb5
            r0 = 3
            goto Lc6
        La6:
            r1.close()     // Catch: java.io.IOException -> Lb5
            r0 = 5
            goto Lc6
        Lab:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> Lb0
            goto Lb4
        Lb0:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.io.IOException -> Lb5
        Lb4:
            throw r0     // Catch: java.io.IOException -> Lb5
        Lb5:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            zzd(r7, r0, r14, r15)
        Lbd:
            r0 = 1
            goto Lc6
        Lbf:
            java.lang.String r0 = "No .so"
            r15.zzb(r2, r0)
            goto L29
        Lc6:
            if (r0 != r6) goto L121
            java.lang.String r0 = zzc(r14, r15)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Ld9
            java.lang.String r0 = "Empty dev arch"
            zzd(r7, r0, r14, r15)
        Ld7:
            r0 = 1
            goto L121
        Ld9:
            java.lang.String r1 = "i686"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L120
            java.lang.String r1 = "x86"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto Lea
            goto L120
        Lea:
            java.lang.String r1 = "x86_64"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto Lf4
            r0 = 7
            goto L121
        Lf4:
            java.lang.String r1 = "arm64-v8a"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto Lfe
            r0 = 6
            goto L121
        Lfe:
            java.lang.String r1 = "armeabi-v7a"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L11e
            java.lang.String r1 = "armv71"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L10f
            goto L11e
        L10f:
            java.lang.String r1 = "riscv64"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L11a
            r0 = 8
            goto L121
        L11a:
            zzd(r7, r0, r14, r15)
            goto Ld7
        L11e:
            r0 = 3
            goto L121
        L120:
            r0 = 5
        L121:
            if (r0 == r10) goto L13f
            if (r0 == r9) goto L13c
            if (r0 == r8) goto L139
            if (r0 == r5) goto L136
            if (r0 == r4) goto L133
            if (r0 == r3) goto L130
            java.lang.String r14 = "null"
            goto L141
        L130:
            java.lang.String r14 = "RISCV64"
            goto L141
        L133:
            java.lang.String r14 = "X86_64"
            goto L141
        L136:
            java.lang.String r14 = "ARM64"
            goto L141
        L139:
            java.lang.String r14 = "X86"
            goto L141
        L13c:
            java.lang.String r14 = "ARM7"
            goto L141
        L13f:
            java.lang.String r14 = "UNSUPPORTED"
        L141:
            r1 = 5018(0x139a, float:7.032E-42)
            r15.zzb(r1, r14)
            return r0
    }

    private static final java.lang.String zzc(android.content.Context r4, com.google.android.gms.internal.ads.zzfqz r5) {
            java.util.HashSet r4 = new java.util.HashSet
            java.lang.String r0 = "i686"
            java.lang.String r1 = "armv71"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r4.<init>(r0)
            com.google.android.gms.internal.ads.zzfyn r0 = com.google.android.gms.internal.ads.zzfyn.zzu
            java.lang.String r0 = r0.zza()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L25
            boolean r4 = r4.contains(r0)
            if (r4 != 0) goto L24
            goto L25
        L24:
            return r0
        L25:
            r0 = 0
            r4 = 2024(0x7e8, float:2.836E-42)
            java.lang.Class<android.os.Build> r2 = android.os.Build.class
            java.lang.String r3 = "SUPPORTED_ABIS"
            java.lang.reflect.Field r2 = r2.getField(r3)     // Catch: java.lang.IllegalAccessException -> L41 java.lang.NoSuchFieldException -> L46
            r3 = 0
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.IllegalAccessException -> L41 java.lang.NoSuchFieldException -> L46
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch: java.lang.IllegalAccessException -> L41 java.lang.NoSuchFieldException -> L46
            if (r2 == 0) goto L4a
            int r3 = r2.length     // Catch: java.lang.IllegalAccessException -> L41 java.lang.NoSuchFieldException -> L46
            if (r3 <= 0) goto L4a
            r3 = 0
            r4 = r2[r3]     // Catch: java.lang.IllegalAccessException -> L41 java.lang.NoSuchFieldException -> L46
            return r4
        L41:
            r2 = move-exception
            r5.zzc(r4, r0, r2)
            goto L4a
        L46:
            r2 = move-exception
            r5.zzc(r4, r0, r2)
        L4a:
            java.lang.String r4 = android.os.Build.CPU_ABI
            if (r4 == 0) goto L4f
            return r4
        L4f:
            java.lang.String r4 = android.os.Build.CPU_ABI2
            return r4
    }

    private static final void zzd(byte[] r3, java.lang.String r4, android.content.Context r5, com.google.android.gms.internal.ads.zzfqz r6) {
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "os.arch:"
            r5.append(r0)
            com.google.android.gms.internal.ads.zzfyn r0 = com.google.android.gms.internal.ads.zzfyn.zzu
            java.lang.String r0 = r0.zza()
            r5.append(r0)
            java.lang.String r0 = ";"
            r5.append(r0)
            java.lang.Class<android.os.Build> r1 = android.os.Build.class
            java.lang.String r2 = "SUPPORTED_ABIS"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L39
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L3a
            java.lang.String r2 = "supported_abis:"
            r5.append(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch: java.lang.Throwable -> L39
            r5.append(r1)     // Catch: java.lang.Throwable -> L39
            r5.append(r0)     // Catch: java.lang.Throwable -> L39
            goto L3a
        L39:
        L3a:
            java.lang.String r1 = "CPU_ABI:"
            r5.append(r1)
            java.lang.String r1 = android.os.Build.CPU_ABI
            r5.append(r1)
            java.lang.String r1 = ";CPU_ABI2:"
            r5.append(r1)
            java.lang.String r1 = android.os.Build.CPU_ABI2
            r5.append(r1)
            r5.append(r0)
            if (r3 == 0) goto L62
            java.lang.String r1 = "ELF:"
            r5.append(r1)
            java.lang.String r3 = java.util.Arrays.toString(r3)
            r5.append(r3)
            r5.append(r0)
        L62:
            if (r4 == 0) goto L6f
            java.lang.String r3 = "dbg:"
            r5.append(r3)
            r5.append(r4)
            r5.append(r0)
        L6f:
            r3 = 4007(0xfa7, float:5.615E-42)
            java.lang.String r4 = r5.toString()
            r6.zzb(r3, r4)
            return
    }
}
