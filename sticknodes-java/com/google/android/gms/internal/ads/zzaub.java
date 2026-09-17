package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaub {
    static boolean zza;
    static final java.util.concurrent.CountDownLatch zzb = null;
    public static final /* synthetic */ int zzc = 0;
    private static java.security.MessageDigest zzd;
    private static final java.lang.Object zze = null;
    private static final java.lang.Object zzf = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzaub.zze = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzaub.zzf = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzaub.zzb = r0
            return
    }

    static java.lang.String zza(byte[] r8, java.lang.String r9) throws java.security.GeneralSecurityException, java.io.UnsupportedEncodingException {
            r0 = 255(0xff, float:3.57E-43)
            java.util.Vector r0 = zzb(r8, r0)
            r1 = 1
            if (r0 == 0) goto L4b
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L10
            goto L4b
        L10:
            com.google.android.gms.internal.ads.zzatt r2 = com.google.android.gms.internal.ads.zzatu.zza()
            int r3 = r0.size()
            r4 = 0
            r5 = 0
        L1a:
            if (r5 >= r3) goto L32
            java.lang.Object r6 = r0.get(r5)
            byte[] r6 = (byte[]) r6
            byte[] r6 = zzg(r6, r9, r4)
            r7 = 256(0x100, float:3.59E-43)
            com.google.android.gms.internal.ads.zzgzs r6 = com.google.android.gms.internal.ads.zzgzs.zzv(r6, r4, r7)
            r2.zza(r6)
            int r5 = r5 + 1
            goto L1a
        L32:
            byte[] r8 = zze(r8)
            com.google.android.gms.internal.ads.zzgzs r9 = com.google.android.gms.internal.ads.zzgzs.zzb
            int r9 = r8.length
            com.google.android.gms.internal.ads.zzgzs r8 = com.google.android.gms.internal.ads.zzgzs.zzv(r8, r4, r9)
            r2.zzb(r8)
            com.google.android.gms.internal.ads.zzhbe r8 = r2.zzbn()
            com.google.android.gms.internal.ads.zzatu r8 = (com.google.android.gms.internal.ads.zzatu) r8
            byte[] r8 = r8.zzaV()
            goto L59
        L4b:
            r8 = 4096(0x1000, float:5.74E-42)
            com.google.android.gms.internal.ads.zzath r8 = zzf(r8)
            byte[] r8 = r8.zzaV()
            byte[] r8 = zzg(r8, r9, r1)
        L59:
            java.lang.String r8 = com.google.android.gms.internal.ads.zzatx.zza(r8, r1)
            return r8
    }

    static java.util.Vector zzb(byte[] r7, int r8) {
            int r8 = r7.length
            r0 = 0
            if (r8 > 0) goto L5
            return r0
        L5:
            int r8 = r8 + 254
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            r2 = 0
        Ld:
            r3 = 255(0xff, float:3.57E-43)
            int r4 = r8 / 255
            if (r2 >= r4) goto L27
            int r4 = r2 * 255
            int r5 = r7.length     // Catch: java.lang.IndexOutOfBoundsException -> L26
            int r6 = r5 - r4
            if (r6 <= r3) goto L1c
            int r5 = r4 + 255
        L1c:
            byte[] r3 = java.util.Arrays.copyOfRange(r7, r4, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L26
            r1.add(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L26
            int r2 = r2 + 1
            goto Ld
        L26:
            return r0
        L27:
            return r1
    }

    static /* bridge */ /* synthetic */ void zzc(java.security.MessageDigest r0) {
            com.google.android.gms.internal.ads.zzaub.zzd = r0
            return
    }

    static void zzd() {
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzaub.zzf
            monitor-enter(r0)
            boolean r1 = com.google.android.gms.internal.ads.zzaub.zza     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L18
            r1 = 1
            com.google.android.gms.internal.ads.zzaub.zza = r1     // Catch: java.lang.Throwable -> L1a
            java.lang.Thread r1 = new java.lang.Thread     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.ads.zzaua r2 = new com.google.android.gms.internal.ads.zzaua     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1a
            r1.start()     // Catch: java.lang.Throwable -> L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
    }

    public static byte[] zze(byte[] r6) throws java.security.NoSuchAlgorithmException {
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzaub.zze
            monitor-enter(r0)
            zzd()     // Catch: java.lang.Throwable -> L34
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.google.android.gms.internal.ads.zzaub.zzb     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            r3 = 2
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            boolean r2 = r2.await(r3, r5)     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            if (r2 != 0) goto L14
            goto L1c
        L14:
            java.security.MessageDigest r2 = com.google.android.gms.internal.ads.zzaub.zzd     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L19
            goto L1c
        L19:
            r1 = r2
            goto L1c
        L1b:
        L1c:
            if (r1 == 0) goto L2c
            r1.reset()     // Catch: java.lang.Throwable -> L34
            r1.update(r6)     // Catch: java.lang.Throwable -> L34
            java.security.MessageDigest r6 = com.google.android.gms.internal.ads.zzaub.zzd     // Catch: java.lang.Throwable -> L34
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return r6
        L2c:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L34
            throw r6     // Catch: java.lang.Throwable -> L34
        L34:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r6
    }

    static com.google.android.gms.internal.ads.zzath zzf(int r2) {
            com.google.android.gms.internal.ads.zzasm r2 = com.google.android.gms.internal.ads.zzath.zza()
            r0 = 4096(0x1000, double:2.0237E-320)
            r2.zzD(r0)
            com.google.android.gms.internal.ads.zzhbe r2 = r2.zzbn()
            com.google.android.gms.internal.ads.zzath r2 = (com.google.android.gms.internal.ads.zzath) r2
            return r2
    }

    private static byte[] zzg(byte[] r4, java.lang.String r5, boolean r6) throws java.security.NoSuchAlgorithmException, java.io.UnsupportedEncodingException {
            int r0 = r4.length
            r1 = 1
            if (r1 == r6) goto L7
            r1 = 255(0xff, float:3.57E-43)
            goto L9
        L7:
            r1 = 239(0xef, float:3.35E-43)
        L9:
            if (r0 <= r1) goto L15
            r4 = 4096(0x1000, float:5.74E-42)
            com.google.android.gms.internal.ads.zzath r4 = zzf(r4)
            byte[] r4 = r4.zzaV()
        L15:
            int r0 = r1 + 1
            int r2 = r4.length
            byte r3 = (byte) r2
            if (r2 >= r1) goto L3b
            int r1 = r1 - r2
            byte[] r1 = new byte[r1]
            java.security.SecureRandom r2 = new java.security.SecureRandom
            r2.<init>()
            r2.nextBytes(r1)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteBuffer r0 = r0.put(r3)
            java.nio.ByteBuffer r4 = r0.put(r4)
            java.nio.ByteBuffer r4 = r4.put(r1)
            byte[] r4 = r4.array()
            goto L4b
        L3b:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteBuffer r0 = r0.put(r3)
            java.nio.ByteBuffer r4 = r0.put(r4)
            byte[] r4 = r4.array()
        L4b:
            r0 = 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L63
            byte[] r6 = zze(r4)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteBuffer r6 = r1.put(r6)
            java.nio.ByteBuffer r4 = r6.put(r4)
            byte[] r4 = r4.array()
        L63:
            byte[] r6 = new byte[r0]
            com.google.android.gms.internal.ads.zzavb r0 = new com.google.android.gms.internal.ads.zzavb
            r0.<init>()
            com.google.android.gms.internal.ads.zzauc[] r0 = r0.zzcG
            int r1 = r0.length
            r1 = 0
            r2 = 0
        L6f:
            r3 = 12
            if (r2 >= r3) goto L7b
            r3 = r0[r2]
            r3.zza(r4, r6)
            int r2 = r2 + 1
            goto L6f
        L7b:
            if (r5 == 0) goto L9d
            int r4 = r5.length()
            if (r4 <= 0) goto L9d
            int r4 = r5.length()
            r0 = 32
            if (r4 <= r0) goto L8f
            java.lang.String r5 = r5.substring(r1, r0)
        L8f:
            java.lang.String r4 = "UTF-8"
            byte[] r4 = r5.getBytes(r4)
            com.google.android.gms.internal.ads.zzatv r5 = new com.google.android.gms.internal.ads.zzatv
            r5.<init>(r4)
            r5.zza(r6)
        L9d:
            return r6
    }
}
