package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgxt implements com.google.android.gms.internal.ads.zzggt {
    private static final java.lang.ThreadLocal zza = null;
    private static final java.lang.ThreadLocal zzb = null;
    private final byte[] zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final javax.crypto.spec.SecretKeySpec zzf;
    private final int zzg;

    static {
            com.google.android.gms.internal.ads.zzgxr r0 = new com.google.android.gms.internal.ads.zzgxr
            r0.<init>()
            com.google.android.gms.internal.ads.zzgxt.zza = r0
            com.google.android.gms.internal.ads.zzgxs r0 = new com.google.android.gms.internal.ads.zzgxs
            r0.<init>()
            com.google.android.gms.internal.ads.zzgxt.zzb = r0
            return
    }

    private zzgxt(byte[] r4, int r5, byte[] r6) throws java.security.GeneralSecurityException {
            r3 = this;
            r3.<init>()
            r0 = 1
            boolean r1 = com.google.android.gms.internal.ads.zzgnw.zza(r0)
            if (r1 == 0) goto L4a
            r1 = 12
            r2 = 16
            if (r5 == r1) goto L1b
            if (r5 != r2) goto L13
            goto L1b
        L13:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "IV size should be either 12 or 16 bytes"
            r4.<init>(r5)
            throw r4
        L1b:
            r3.zzg = r5
            int r5 = r4.length
            com.google.android.gms.internal.ads.zzgyv.zza(r5)
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r5.<init>(r4, r1)
            r3.zzf = r5
            java.lang.ThreadLocal r4 = com.google.android.gms.internal.ads.zzgxt.zza
            java.lang.Object r4 = r4.get()
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            r4.init(r0, r5)
            byte[] r5 = new byte[r2]
            byte[] r4 = r4.doFinal(r5)
            byte[] r4 = zzd(r4)
            r3.zzc = r4
            byte[] r4 = zzd(r4)
            r3.zzd = r4
            r3.zze = r6
            return
        L4a:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "Can not use AES-EAX in FIPS-mode."
            r4.<init>(r5)
            throw r4
    }

    public static com.google.android.gms.internal.ads.zzggt zzb(com.google.android.gms.internal.ads.zzgiy r3) throws java.security.GeneralSecurityException {
            r0 = 1
            boolean r0 = com.google.android.gms.internal.ads.zzgnw.zza(r0)
            if (r0 == 0) goto L29
            com.google.android.gms.internal.ads.zzgxt r0 = new com.google.android.gms.internal.ads.zzgxt
            com.google.android.gms.internal.ads.zzgyy r1 = r3.zzd()
            com.google.android.gms.internal.ads.zzghw r2 = com.google.android.gms.internal.ads.zzghc.zza()
            byte[] r1 = r1.zzd(r2)
            com.google.android.gms.internal.ads.zzgjg r2 = r3.zzb()
            int r2 = r2.zzb()
            com.google.android.gms.internal.ads.zzgyx r3 = r3.zzc()
            byte[] r3 = r3.zzc()
            r0.<init>(r1, r2, r3)
            return r0
        L29:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Can not use AES-EAX in FIPS-mode."
            r3.<init>(r0)
            throw r3
    }

    private static void zzc(byte[] r4, byte[] r5) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lf
            r2 = r4[r1]
            r3 = r5[r1]
            r2 = r2 ^ r3
            byte r2 = (byte) r2
            r4[r1] = r2
            int r1 = r1 + 1
            goto L2
        Lf:
            return
    }

    private static byte[] zzd(byte[] r6) {
            r0 = 16
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = 0
        L6:
            r3 = 15
            if (r2 >= r3) goto L1d
            r3 = r6[r2]
            int r3 = r3 + r3
            int r4 = r2 + 1
            r5 = r6[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 >>> 7
            r3 = r3 ^ r5
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r0[r2] = r3
            r2 = r4
            goto L6
        L1d:
            r2 = r6[r3]
            int r2 = r2 + r2
            r6 = r6[r1]
            int r6 = r6 >> 7
            r6 = r6 & 135(0x87, float:1.89E-43)
            r6 = r6 ^ r2
            byte r6 = (byte) r6
            r0[r3] = r6
            return r0
    }

    private final byte[] zze(javax.crypto.Cipher r9, int r10, byte[] r11, int r12, int r13) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException, javax.crypto.ShortBufferException {
            r8 = this;
            r0 = 16
            byte[] r1 = new byte[r0]
            byte r10 = (byte) r10
            r2 = 15
            r1[r2] = r10
            if (r13 != 0) goto L15
            byte[] r10 = r8.zzc
            zzc(r1, r10)
            byte[] r9 = r9.doFinal(r1)
            return r9
        L15:
            byte[] r10 = new byte[r0]
            r2 = 0
            r9.doFinal(r1, r2, r0, r10)
            r3 = 0
        L1c:
            r7 = r1
            r1 = r10
            r10 = r7
            int r4 = r13 - r3
            if (r4 <= r0) goto L3a
            r4 = 0
        L24:
            if (r4 >= r0) goto L34
            int r5 = r12 + r3
            r6 = r1[r4]
            int r5 = r5 + r4
            r5 = r11[r5]
            r5 = r5 ^ r6
            byte r5 = (byte) r5
            r1[r4] = r5
            int r4 = r4 + 1
            goto L24
        L34:
            r9.doFinal(r1, r2, r0, r10)
            int r3 = r3 + 16
            goto L1c
        L3a:
            int r3 = r3 + r12
            int r12 = r12 + r13
            byte[] r11 = java.util.Arrays.copyOfRange(r11, r3, r12)
            int r12 = r11.length
            if (r12 != r0) goto L49
            byte[] r12 = r8.zzc
            zzc(r11, r12)
            goto L66
        L49:
            byte[] r12 = r8.zzd
            byte[] r12 = java.util.Arrays.copyOf(r12, r0)
            r13 = 0
        L50:
            int r3 = r11.length
            if (r13 >= r3) goto L5e
            r3 = r12[r13]
            r4 = r11[r13]
            r3 = r3 ^ r4
            byte r3 = (byte) r3
            r12[r13] = r3
            int r13 = r13 + 1
            goto L50
        L5e:
            r11 = r12[r3]
            r11 = r11 ^ 128(0x80, float:1.794E-43)
            byte r11 = (byte) r11
            r12[r3] = r11
            r11 = r12
        L66:
            zzc(r1, r11)
            r9.doFinal(r1, r2, r0, r10)
            return r10
    }

    @Override // com.google.android.gms.internal.ads.zzggt
    public final byte[] zza(byte[] r13, byte[] r14) throws java.security.GeneralSecurityException {
            r12 = this;
            byte[] r0 = r12.zze
            int r1 = r13.length
            int r2 = r0.length
            int r2 = r1 - r2
            int r3 = r12.zzg
            int r2 = r2 - r3
            int r2 = r2 + (-16)
            if (r2 < 0) goto L95
            boolean r0 = com.google.android.gms.internal.ads.zzgrg.zzc(r0, r13)
            if (r0 == 0) goto L8d
            java.lang.ThreadLocal r0 = com.google.android.gms.internal.ads.zzgxt.zza
            java.lang.Object r0 = r0.get()
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            javax.crypto.spec.SecretKeySpec r3 = r12.zzf
            r9 = 1
            r0.init(r9, r3)
            r5 = 0
            byte[] r3 = r12.zze
            int r8 = r12.zzg
            int r7 = r3.length
            r3 = r12
            r4 = r0
            r6 = r13
            byte[] r10 = r3.zze(r4, r5, r6, r7, r8)
            r11 = 0
            if (r14 != 0) goto L33
            byte[] r14 = new byte[r11]
        L33:
            r6 = r14
            r5 = 1
            r7 = 0
            int r8 = r6.length
            r3 = r12
            r4 = r0
            byte[] r14 = r3.zze(r4, r5, r6, r7, r8)
            r5 = 2
            byte[] r3 = r12.zze
            int r4 = r12.zzg
            int r3 = r3.length
            int r7 = r3 + r4
            r3 = r12
            r4 = r0
            r6 = r13
            r8 = r2
            byte[] r0 = r3.zze(r4, r5, r6, r7, r8)
            int r1 = r1 + (-16)
            r3 = 0
        L50:
            r4 = 16
            if (r11 >= r4) goto L66
            int r4 = r1 + r11
            r4 = r13[r4]
            r5 = r14[r11]
            r4 = r4 ^ r5
            r5 = r10[r11]
            r4 = r4 ^ r5
            r5 = r0[r11]
            r4 = r4 ^ r5
            r3 = r3 | r4
            byte r3 = (byte) r3
            int r11 = r11 + 1
            goto L50
        L66:
            if (r3 != 0) goto L85
            java.lang.ThreadLocal r14 = com.google.android.gms.internal.ads.zzgxt.zzb
            java.lang.Object r14 = r14.get()
            javax.crypto.Cipher r14 = (javax.crypto.Cipher) r14
            javax.crypto.spec.SecretKeySpec r0 = r12.zzf
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec
            r1.<init>(r10)
            r14.init(r9, r0, r1)
            byte[] r0 = r12.zze
            int r1 = r12.zzg
            int r0 = r0.length
            int r0 = r0 + r1
            byte[] r13 = r14.doFinal(r13, r0, r2)
            return r13
        L85:
            javax.crypto.AEADBadTagException r13 = new javax.crypto.AEADBadTagException
            java.lang.String r14 = "tag mismatch"
            r13.<init>(r14)
            throw r13
        L8d:
            java.security.GeneralSecurityException r13 = new java.security.GeneralSecurityException
            java.lang.String r14 = "Decryption failed (OutputPrefix mismatch)."
            r13.<init>(r14)
            throw r13
        L95:
            java.security.GeneralSecurityException r13 = new java.security.GeneralSecurityException
            java.lang.String r14 = "ciphertext too short"
            r13.<init>(r14)
            throw r13
    }
}
