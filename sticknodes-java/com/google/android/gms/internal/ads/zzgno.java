package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgno implements com.google.android.gms.internal.ads.zzggt {
    private final byte[] zza;
    private final byte[] zzb;

    private zzgno(byte[] r3, byte[] r4) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            r0 = 1
            boolean r0 = com.google.android.gms.internal.ads.zzgnw.zza(r0)
            if (r0 == 0) goto L2a
            boolean r0 = zzc()
            if (r0 == 0) goto L22
            int r0 = r3.length
            r1 = 32
            if (r0 != r1) goto L1a
            r2.zza = r3
            r2.zzb = r4
            return
        L1a:
            java.security.InvalidKeyException r3 = new java.security.InvalidKeyException
            java.lang.String r4 = "The key length in bytes must be 32."
            r3.<init>(r4)
            throw r3
        L22:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "JCE does not support algorithm: ChaCha20-Poly1305"
            r3.<init>(r4)
            throw r3
        L2a:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Can not use ChaCha20Poly1305 in FIPS-mode."
            r3.<init>(r4)
            throw r3
    }

    public static com.google.android.gms.internal.ads.zzggt zzb(com.google.android.gms.internal.ads.zzglv r3) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgno r0 = new com.google.android.gms.internal.ads.zzgno
            com.google.android.gms.internal.ads.zzgyy r1 = r3.zzd()
            com.google.android.gms.internal.ads.zzghw r2 = com.google.android.gms.internal.ads.zzghc.zza()
            byte[] r1 = r1.zzd(r2)
            com.google.android.gms.internal.ads.zzgyx r3 = r3.zzc()
            byte[] r3 = r3.zzc()
            r0.<init>(r1, r3)
            return r0
    }

    public static boolean zzc() {
            javax.crypto.Cipher r0 = com.google.android.gms.internal.ads.zzgmz.zzc()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzggt
    public final byte[] zza(byte[] r9, byte[] r10) throws java.security.GeneralSecurityException {
            r8 = this;
            java.lang.String r0 = "ciphertext is null"
            java.util.Objects.requireNonNull(r9, r0)
            byte[] r0 = r8.zzb
            int r1 = r9.length
            int r2 = r0.length
            int r2 = r2 + 40
            if (r1 < r2) goto L81
            boolean r0 = com.google.android.gms.internal.ads.zzgrg.zzc(r0, r9)
            if (r0 == 0) goto L79
            byte[] r0 = r8.zzb
            int r0 = r0.length
            r2 = 24
            byte[] r3 = new byte[r2]
            r4 = 0
            java.lang.System.arraycopy(r9, r0, r3, r4, r2)
            byte[] r0 = r8.zza
            int[] r0 = com.google.android.gms.internal.ads.zzgnf.zze(r0)
            int[] r2 = com.google.android.gms.internal.ads.zzgnf.zze(r3)
            int[] r0 = com.google.android.gms.internal.ads.zzgnf.zzd(r0, r2)
            int r2 = r0.length
            r4 = 4
            int r2 = r2 * 4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r5)
            java.nio.IntBuffer r5 = r2.asIntBuffer()
            r5.put(r0)
            byte[] r0 = r2.array()
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r5 = "ChaCha20"
            r2.<init>(r0, r5)
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec
            r5 = 16
            r6 = 12
            byte[] r6 = new byte[r6]
            r7 = 8
            java.lang.System.arraycopy(r3, r5, r6, r4, r7)
            r0.<init>(r6)
            javax.crypto.Cipher r3 = com.google.android.gms.internal.ads.zzgmz.zzc()
            r4 = 2
            r3.init(r4, r2, r0)
            if (r10 == 0) goto L6c
            int r0 = r10.length
            if (r0 == 0) goto L6c
            r3.updateAAD(r10)
        L6c:
            byte[] r10 = r8.zzb
            int r10 = r10.length
            int r0 = r10 + 24
            int r1 = r1 - r10
            int r1 = r1 + (-24)
            byte[] r9 = r3.doFinal(r9, r0, r1)
            return r9
        L79:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "Decryption failed (OutputPrefix mismatch)."
            r9.<init>(r10)
            throw r9
        L81:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "ciphertext too short"
            r9.<init>(r10)
            throw r9
    }
}
