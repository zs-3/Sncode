package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhef {
    static final long zza = 0;
    static final boolean zzb = false;
    private static final sun.misc.Unsafe zzc = null;
    private static final java.lang.Class zzd = null;
    private static final boolean zze = false;
    private static final com.google.android.gms.internal.ads.zzhee zzf = null;
    private static final boolean zzg = false;
    private static final boolean zzh = false;
    private static final long zzi = 0;

    static {
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            java.lang.Class<double[]> r2 = double[].class
            java.lang.Class<float[]> r3 = float[].class
            java.lang.Class<long[]> r4 = long[].class
            java.lang.Class<int[]> r5 = int[].class
            java.lang.Class<boolean[]> r6 = boolean[].class
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            sun.misc.Unsafe r0 = zzi()
            com.google.android.gms.internal.ads.zzhef.zzc = r0
            int r8 = com.google.android.gms.internal.ads.zzgzf.zza
            java.lang.Class<libcore.io.Memory> r8 = libcore.io.Memory.class
            com.google.android.gms.internal.ads.zzhef.zzd = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = zzy(r8)
            com.google.android.gms.internal.ads.zzhef.zze = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = zzy(r10)
            r11 = 0
            if (r0 != 0) goto L2c
            goto L3b
        L2c:
            if (r9 == 0) goto L34
            com.google.android.gms.internal.ads.zzhed r11 = new com.google.android.gms.internal.ads.zzhed
            r11.<init>(r0)
            goto L3b
        L34:
            if (r10 == 0) goto L3b
            com.google.android.gms.internal.ads.zzhec r11 = new com.google.android.gms.internal.ads.zzhec
            r11.<init>(r0)
        L3b:
            com.google.android.gms.internal.ads.zzhef.zzf = r11
            java.lang.String r9 = "getLong"
            java.lang.String r10 = "objectFieldOffset"
            r12 = 2
            r13 = 1
            r14 = 0
            if (r11 != 0) goto L48
        L46:
            r0 = 0
            goto L6e
        L48:
            sun.misc.Unsafe r0 = r11.zza
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L69
            java.lang.Class[] r11 = new java.lang.Class[r13]     // Catch: java.lang.Throwable -> L69
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r11[r14] = r15     // Catch: java.lang.Throwable -> L69
            r0.getMethod(r10, r11)     // Catch: java.lang.Throwable -> L69
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> L69
            r11[r14] = r7     // Catch: java.lang.Throwable -> L69
            r11[r13] = r8     // Catch: java.lang.Throwable -> L69
            r0.getMethod(r9, r11)     // Catch: java.lang.Throwable -> L69
            java.lang.reflect.Field r0 = zzE()     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L67
            goto L46
        L67:
            r0 = 1
            goto L6e
        L69:
            r0 = move-exception
            zzj(r0)
            goto L46
        L6e:
            com.google.android.gms.internal.ads.zzhef.zzg = r0
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            if (r0 != 0) goto L76
        L74:
            r0 = 0
            goto Led
        L76:
            sun.misc.Unsafe r0 = r0.zza
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> Le8
            java.lang.Class[] r8 = new java.lang.Class[r13]     // Catch: java.lang.Throwable -> Le8
            java.lang.Class<java.lang.reflect.Field> r11 = java.lang.reflect.Field.class
            r8[r14] = r11     // Catch: java.lang.Throwable -> Le8
            r0.getMethod(r10, r8)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r8 = "arrayBaseOffset"
            java.lang.Class[] r10 = new java.lang.Class[r13]     // Catch: java.lang.Throwable -> Le8
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r10[r14] = r11     // Catch: java.lang.Throwable -> Le8
            r0.getMethod(r8, r10)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r8 = "arrayIndexScale"
            java.lang.Class[] r10 = new java.lang.Class[r13]     // Catch: java.lang.Throwable -> Le8
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r10[r14] = r11     // Catch: java.lang.Throwable -> Le8
            r0.getMethod(r8, r10)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r8 = "getInt"
            java.lang.Class[] r10 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> Le8
            r10[r14] = r7     // Catch: java.lang.Throwable -> Le8
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> Le8
            r10[r13] = r11     // Catch: java.lang.Throwable -> Le8
            r0.getMethod(r8, r10)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r8 = "putInt"
            r10 = 3
            java.lang.Class[] r15 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> Le8
            r15[r14] = r7     // Catch: java.lang.Throwable -> Le8
            r15[r13] = r11     // Catch: java.lang.Throwable -> Le8
            java.lang.Class r16 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Le8
            r15[r12] = r16     // Catch: java.lang.Throwable -> Le8
            r0.getMethod(r8, r15)     // Catch: java.lang.Throwable -> Le8
            java.lang.Class[] r8 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> Le8
            r8[r14] = r7     // Catch: java.lang.Throwable -> Le8
            r8[r13] = r11     // Catch: java.lang.Throwable -> Le8
            r0.getMethod(r9, r8)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r8 = "putLong"
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> Le8
            r9[r14] = r7     // Catch: java.lang.Throwable -> Le8
            r9[r13] = r11     // Catch: java.lang.Throwable -> Le8
            r9[r12] = r11     // Catch: java.lang.Throwable -> Le8
            r0.getMethod(r8, r9)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r8 = "getObject"
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> Le8
            r9[r14] = r7     // Catch: java.lang.Throwable -> Le8
            r9[r13] = r11     // Catch: java.lang.Throwable -> Le8
            r0.getMethod(r8, r9)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r8 = "putObject"
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> Le8
            r9[r14] = r7     // Catch: java.lang.Throwable -> Le8
            r9[r13] = r11     // Catch: java.lang.Throwable -> Le8
            r9[r12] = r7     // Catch: java.lang.Throwable -> Le8
            r0.getMethod(r8, r9)     // Catch: java.lang.Throwable -> Le8
            r0 = 1
            goto Led
        Le8:
            r0 = move-exception
            zzj(r0)
            goto L74
        Led:
            com.google.android.gms.internal.ads.zzhef.zzh = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = zzC(r0)
            long r7 = (long) r0
            com.google.android.gms.internal.ads.zzhef.zza = r7
            zzC(r6)
            zzD(r6)
            zzC(r5)
            zzD(r5)
            zzC(r4)
            zzD(r4)
            zzC(r3)
            zzD(r3)
            zzC(r2)
            zzD(r2)
            zzC(r1)
            zzD(r1)
            java.lang.reflect.Field r0 = zzE()
            r1 = -1
            if (r0 == 0) goto L12f
            com.google.android.gms.internal.ads.zzhee r3 = com.google.android.gms.internal.ads.zzhef.zzf
            if (r3 != 0) goto L129
            goto L12f
        L129:
            sun.misc.Unsafe r1 = r3.zza
            long r1 = r1.objectFieldOffset(r0)
        L12f:
            com.google.android.gms.internal.ads.zzhef.zzi = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L13a
            goto L13b
        L13a:
            r13 = 0
        L13b:
            com.google.android.gms.internal.ads.zzhef.zzb = r13
            return
    }

    private zzhef() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean zzA() {
            boolean r0 = com.google.android.gms.internal.ads.zzhef.zzh
            return r0
    }

    static boolean zzB() {
            boolean r0 = com.google.android.gms.internal.ads.zzhef.zzg
            return r0
    }

    private static int zzC(java.lang.Class r1) {
            boolean r0 = com.google.android.gms.internal.ads.zzhef.zzh
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            sun.misc.Unsafe r0 = r0.zza
            int r1 = r0.arrayBaseOffset(r1)
            return r1
        Ld:
            r1 = -1
            return r1
    }

    private static int zzD(java.lang.Class r1) {
            boolean r0 = com.google.android.gms.internal.ads.zzhef.zzh
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            sun.misc.Unsafe r0 = r0.zza
            int r1 = r0.arrayIndexScale(r1)
            return r1
        Ld:
            r1 = -1
            return r1
    }

    private static java.lang.reflect.Field zzE() {
            int r0 = com.google.android.gms.internal.ads.zzgzf.zza
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            java.lang.String r1 = "effectiveDirectAddress"
            java.lang.reflect.Field r0 = zzF(r0, r1)
            if (r0 != 0) goto L20
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            java.lang.String r1 = "address"
            java.lang.reflect.Field r0 = zzF(r0, r1)
            if (r0 == 0) goto L1f
            java.lang.Class r1 = r0.getType()
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r1 != r2) goto L1f
            return r0
        L1f:
            r0 = 0
        L20:
            return r0
    }

    private static java.lang.reflect.Field zzF(java.lang.Class r0, java.lang.String r1) {
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L5
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }

    private static void zzG(java.lang.Object r5, long r6, byte r8) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            sun.misc.Unsafe r1 = r0.zza
            r2 = -4
            long r2 = r2 & r6
            int r1 = r1.getInt(r5, r2)
            int r7 = (int) r6
            int r6 = ~r7
            r6 = r6 & 3
            int r6 = r6 << 3
            r7 = 255(0xff, float:3.57E-43)
            int r4 = r7 << r6
            int r4 = ~r4
            r1 = r1 & r4
            sun.misc.Unsafe r0 = r0.zza
            r7 = r7 & r8
            int r6 = r7 << r6
            r6 = r6 | r1
            r0.putInt(r5, r2, r6)
            return
    }

    private static void zzH(java.lang.Object r5, long r6, byte r8) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            sun.misc.Unsafe r1 = r0.zza
            r2 = -4
            long r2 = r2 & r6
            int r1 = r1.getInt(r5, r2)
            int r7 = (int) r6
            r6 = r7 & 3
            int r6 = r6 << 3
            r7 = 255(0xff, float:3.57E-43)
            int r4 = r7 << r6
            int r4 = ~r4
            r1 = r1 & r4
            sun.misc.Unsafe r0 = r0.zza
            r7 = r7 & r8
            int r6 = r7 << r6
            r6 = r6 | r1
            r0.putInt(r5, r2, r6)
            return
    }

    static byte zza(long r1) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            byte r1 = r0.zza(r1)
            return r1
    }

    static double zzb(java.lang.Object r1, long r2) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            double r1 = r0.zzb(r1, r2)
            return r1
    }

    static float zzc(java.lang.Object r1, long r2) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            float r1 = r0.zzc(r1, r2)
            return r1
    }

    static int zzd(java.lang.Object r1, long r2) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            sun.misc.Unsafe r0 = r0.zza
            int r1 = r0.getInt(r1, r2)
            return r1
    }

    static long zze(java.nio.ByteBuffer r3) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            long r1 = com.google.android.gms.internal.ads.zzhef.zzi
            sun.misc.Unsafe r0 = r0.zza
            long r0 = r0.getLong(r3, r1)
            return r0
    }

    static long zzf(java.lang.Object r1, long r2) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            sun.misc.Unsafe r0 = r0.zza
            long r1 = r0.getLong(r1, r2)
            return r1
    }

    static java.lang.Object zzg(java.lang.Class r1) {
            sun.misc.Unsafe r0 = com.google.android.gms.internal.ads.zzhef.zzc     // Catch: java.lang.InstantiationException -> L7
            java.lang.Object r1 = r0.allocateInstance(r1)     // Catch: java.lang.InstantiationException -> L7
            return r1
        L7:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    static java.lang.Object zzh(java.lang.Object r1, long r2) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            sun.misc.Unsafe r0 = r0.zza
            java.lang.Object r1 = r0.getObject(r1, r2)
            return r1
    }

    static sun.misc.Unsafe zzi() {
            com.google.android.gms.internal.ads.zzheb r0 = new com.google.android.gms.internal.ads.zzheb     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.lang.Throwable -> Lc
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch: java.lang.Throwable -> Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    static /* bridge */ /* synthetic */ void zzj(java.lang.Throwable r4) {
            java.lang.Class<com.google.android.gms.internal.ads.zzhef> r0 = com.google.android.gms.internal.ads.zzhef.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r4 = r4.toString()
            java.lang.String r2 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r4 = r2.concat(r4)
            java.lang.String r2 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r3 = "logMissingMethod"
            r0.logp(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void zzk(java.lang.Object r0, long r1, boolean r3) {
            zzG(r0, r1, r3)
            return
    }

    static /* synthetic */ void zzl(java.lang.Object r0, long r1, boolean r3) {
            zzH(r0, r1, r3)
            return
    }

    static /* bridge */ /* synthetic */ void zzm(java.lang.Object r0, long r1, byte r3) {
            zzG(r0, r1, r3)
            return
    }

    static /* bridge */ /* synthetic */ void zzn(java.lang.Object r0, long r1, byte r3) {
            zzH(r0, r1, r3)
            return
    }

    static void zzo(long r8, byte[] r10, long r11, long r13) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            r1 = r8
            r3 = r10
            r4 = r11
            r6 = r13
            r0.zzd(r1, r3, r4, r6)
            return
    }

    static void zzp(java.lang.Object r1, long r2, boolean r4) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            r0.zze(r1, r2, r4)
            return
    }

    static void zzq(byte[] r3, long r4, byte r6) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            long r1 = com.google.android.gms.internal.ads.zzhef.zza
            long r1 = r1 + r4
            r0.zzf(r3, r1, r6)
            return
    }

    static void zzr(java.lang.Object r6, long r7, double r9) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            r1 = r6
            r2 = r7
            r4 = r9
            r0.zzg(r1, r2, r4)
            return
    }

    static void zzs(java.lang.Object r1, long r2, float r4) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            r0.zzh(r1, r2, r4)
            return
    }

    static void zzt(java.lang.Object r1, long r2, int r4) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            sun.misc.Unsafe r0 = r0.zza
            r0.putInt(r1, r2, r4)
            return
    }

    static void zzu(java.lang.Object r7, long r8, long r10) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            sun.misc.Unsafe r1 = r0.zza
            r2 = r7
            r3 = r8
            r5 = r10
            r1.putLong(r2, r3, r5)
            return
    }

    static void zzv(java.lang.Object r1, long r2, java.lang.Object r4) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            sun.misc.Unsafe r0 = r0.zza
            r0.putObject(r1, r2, r4)
            return
    }

    static /* bridge */ /* synthetic */ boolean zzw(java.lang.Object r3, long r4) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            sun.misc.Unsafe r0 = r0.zza
            r1 = -4
            long r1 = r1 & r4
            int r3 = r0.getInt(r3, r1)
            long r4 = ~r4
            r0 = 3
            long r4 = r4 & r0
            r0 = 3
            long r4 = r4 << r0
            int r5 = (int) r4
            int r3 = r3 >>> r5
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            if (r3 == 0) goto L1a
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    static /* bridge */ /* synthetic */ boolean zzx(java.lang.Object r3, long r4) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            sun.misc.Unsafe r0 = r0.zza
            r1 = -4
            long r1 = r1 & r4
            int r3 = r0.getInt(r3, r1)
            r0 = 3
            long r4 = r4 & r0
            r0 = 3
            long r4 = r4 << r0
            int r5 = (int) r4
            int r3 = r3 >>> r5
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            if (r3 == 0) goto L19
            r3 = 1
            return r3
        L19:
            r3 = 0
            return r3
    }

    static boolean zzy(java.lang.Class r10) {
            java.lang.Class<byte[]> r0 = byte[].class
            int r1 = com.google.android.gms.internal.ads.zzgzf.zza
            r1 = 0
            java.lang.Class r2 = com.google.android.gms.internal.ads.zzhef.zzd     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "peekLong"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L76
            r5[r1] = r10     // Catch: java.lang.Throwable -> L76
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L76
            r7 = 1
            r5[r7] = r6     // Catch: java.lang.Throwable -> L76
            r2.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "pokeLong"
            r5 = 3
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L76
            r8[r1] = r10     // Catch: java.lang.Throwable -> L76
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L76
            r8[r7] = r9     // Catch: java.lang.Throwable -> L76
            r8[r4] = r6     // Catch: java.lang.Throwable -> L76
            r2.getMethod(r3, r8)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "pokeInt"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L76
            r8[r1] = r10     // Catch: java.lang.Throwable -> L76
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L76
            r8[r7] = r9     // Catch: java.lang.Throwable -> L76
            r8[r4] = r6     // Catch: java.lang.Throwable -> L76
            r2.getMethod(r3, r8)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "peekInt"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L76
            r8[r1] = r10     // Catch: java.lang.Throwable -> L76
            r8[r7] = r6     // Catch: java.lang.Throwable -> L76
            r2.getMethod(r3, r8)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "pokeByte"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L76
            r6[r1] = r10     // Catch: java.lang.Throwable -> L76
            java.lang.Class r8 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L76
            r6[r7] = r8     // Catch: java.lang.Throwable -> L76
            r2.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "peekByte"
            java.lang.Class[] r6 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L76
            r6[r1] = r10     // Catch: java.lang.Throwable -> L76
            r2.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "pokeByteArray"
            r6 = 4
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L76
            r8[r1] = r10     // Catch: java.lang.Throwable -> L76
            r8[r7] = r0     // Catch: java.lang.Throwable -> L76
            r8[r4] = r9     // Catch: java.lang.Throwable -> L76
            r8[r5] = r9     // Catch: java.lang.Throwable -> L76
            r2.getMethod(r3, r8)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "peekByteArray"
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L76
            r6[r1] = r10     // Catch: java.lang.Throwable -> L76
            r6[r7] = r0     // Catch: java.lang.Throwable -> L76
            r6[r4] = r9     // Catch: java.lang.Throwable -> L76
            r6[r5] = r9     // Catch: java.lang.Throwable -> L76
            r2.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L76
            return r7
        L76:
            return r1
    }

    static boolean zzz(java.lang.Object r1, long r2) {
            com.google.android.gms.internal.ads.zzhee r0 = com.google.android.gms.internal.ads.zzhef.zzf
            boolean r1 = r0.zzi(r1, r2)
            return r1
    }
}
