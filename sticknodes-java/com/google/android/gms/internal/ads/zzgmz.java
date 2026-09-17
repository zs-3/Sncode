package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgmz implements com.google.android.gms.internal.ads.zzggt {
    private static final byte[] zza = null;
    private static final byte[] zzb = null;
    private static final byte[] zzc = null;
    private static final java.lang.ThreadLocal zzd = null;
    private final javax.crypto.SecretKey zze;
    private final byte[] zzf;

    static {
            java.lang.String r0 = "808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f"
            byte[] r0 = com.google.android.gms.internal.ads.zzgyo.zza(r0)
            com.google.android.gms.internal.ads.zzgmz.zza = r0
            java.lang.String r0 = "070000004041424344454647"
            byte[] r0 = com.google.android.gms.internal.ads.zzgyo.zza(r0)
            com.google.android.gms.internal.ads.zzgmz.zzb = r0
            java.lang.String r0 = "a0784d7a4716f3feb4f64e7f4b39bf04"
            byte[] r0 = com.google.android.gms.internal.ads.zzgyo.zza(r0)
            com.google.android.gms.internal.ads.zzgmz.zzc = r0
            com.google.android.gms.internal.ads.zzgmy r0 = new com.google.android.gms.internal.ads.zzgmy
            r0.<init>()
            com.google.android.gms.internal.ads.zzgmz.zzd = r0
            return
    }

    private zzgmz(byte[] r3, byte[] r4) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            r0 = 1
            boolean r0 = com.google.android.gms.internal.ads.zzgnw.zza(r0)
            if (r0 == 0) goto L31
            boolean r0 = zze()
            if (r0 == 0) goto L29
            int r0 = r3.length
            r1 = 32
            if (r0 != r1) goto L21
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "ChaCha20"
            r0.<init>(r3, r1)
            r2.zze = r0
            r2.zzf = r4
            return
        L21:
            java.security.InvalidKeyException r3 = new java.security.InvalidKeyException
            java.lang.String r4 = "The key length in bytes must be 32."
            r3.<init>(r4)
            throw r3
        L29:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "JCE does not support algorithm: ChaCha20-Poly1305"
            r3.<init>(r4)
            throw r3
        L31:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Can not use ChaCha20Poly1305 in FIPS-mode."
            r3.<init>(r4)
            throw r3
    }

    public static com.google.android.gms.internal.ads.zzggt zzb(com.google.android.gms.internal.ads.zzgkh r3) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgmz r0 = new com.google.android.gms.internal.ads.zzgmz
            com.google.android.gms.internal.ads.zzgyy r1 = r3.zzd()
            com.google.android.gms.internal.ads.zzghw r2 = com.google.android.gms.internal.ads.zzghc.zza()
            byte[] r1 = r1.zzd(r2)
            com.google.android.gms.internal.ads.zzgyx r3 = r3.zzc()
            byte[] r3 = r3.zzc()
            r0.<init>(r1, r3)
            return r0
    }

    static javax.crypto.Cipher zzc() {
            java.lang.ThreadLocal r0 = com.google.android.gms.internal.ads.zzgmz.zzd
            java.lang.Object r0 = r0.get()
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzd(javax.crypto.Cipher r0) {
            boolean r0 = zzf(r0)
            return r0
    }

    public static boolean zze() {
            java.lang.ThreadLocal r0 = com.google.android.gms.internal.ads.zzgmz.zzd
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private static boolean zzf(javax.crypto.Cipher r7) {
            java.lang.String r0 = "ChaCha20"
            r1 = 0
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec     // Catch: java.security.GeneralSecurityException -> L31
            byte[] r3 = com.google.android.gms.internal.ads.zzgmz.zzb     // Catch: java.security.GeneralSecurityException -> L31
            r2.<init>(r3)     // Catch: java.security.GeneralSecurityException -> L31
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.GeneralSecurityException -> L31
            byte[] r4 = com.google.android.gms.internal.ads.zzgmz.zza     // Catch: java.security.GeneralSecurityException -> L31
            r3.<init>(r4, r0)     // Catch: java.security.GeneralSecurityException -> L31
            r5 = 2
            r7.init(r5, r3, r2)     // Catch: java.security.GeneralSecurityException -> L31
            byte[] r3 = com.google.android.gms.internal.ads.zzgmz.zzc     // Catch: java.security.GeneralSecurityException -> L31
            byte[] r6 = r7.doFinal(r3)     // Catch: java.security.GeneralSecurityException -> L31
            int r6 = r6.length     // Catch: java.security.GeneralSecurityException -> L31
            if (r6 == 0) goto L1f
            return r1
        L1f:
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.GeneralSecurityException -> L31
            r6.<init>(r4, r0)     // Catch: java.security.GeneralSecurityException -> L31
            r7.init(r5, r6, r2)     // Catch: java.security.GeneralSecurityException -> L31
            byte[] r7 = r7.doFinal(r3)     // Catch: java.security.GeneralSecurityException -> L31
            int r7 = r7.length     // Catch: java.security.GeneralSecurityException -> L31
            if (r7 == 0) goto L2f
            return r1
        L2f:
            r7 = 1
            return r7
        L31:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzggt
    public final byte[] zza(byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
            r5 = this;
            java.lang.String r0 = "ciphertext is null"
            java.util.Objects.requireNonNull(r6, r0)
            byte[] r0 = r5.zzf
            int r1 = r6.length
            int r2 = r0.length
            int r2 = r2 + 28
            if (r1 < r2) goto L4e
            boolean r0 = com.google.android.gms.internal.ads.zzgrg.zzc(r0, r6)
            if (r0 == 0) goto L46
            byte[] r0 = r5.zzf
            int r0 = r0.length
            r2 = 12
            byte[] r3 = new byte[r2]
            r4 = 0
            java.lang.System.arraycopy(r6, r0, r3, r4, r2)
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec
            r0.<init>(r3)
            java.lang.ThreadLocal r2 = com.google.android.gms.internal.ads.zzgmz.zzd
            java.lang.Object r2 = r2.get()
            javax.crypto.Cipher r2 = (javax.crypto.Cipher) r2
            r3 = 2
            javax.crypto.SecretKey r4 = r5.zze
            r2.init(r3, r4, r0)
            if (r7 == 0) goto L39
            int r0 = r7.length
            if (r0 == 0) goto L39
            r2.updateAAD(r7)
        L39:
            byte[] r7 = r5.zzf
            int r7 = r7.length
            int r0 = r7 + 12
            int r1 = r1 - r7
            int r1 = r1 + (-12)
            byte[] r6 = r2.doFinal(r6, r0, r1)
            return r6
        L46:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "Decryption failed (OutputPrefix mismatch)."
            r6.<init>(r7)
            throw r6
        L4e:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "ciphertext too short"
            r6.<init>(r7)
            throw r6
    }
}
