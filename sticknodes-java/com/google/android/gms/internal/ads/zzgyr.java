package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgyr implements com.google.android.gms.internal.ads.zzgto {
    private static final java.lang.ThreadLocal zza = null;
    private final javax.crypto.SecretKey zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    static {
            com.google.android.gms.internal.ads.zzgyq r0 = new com.google.android.gms.internal.ads.zzgyq
            r0.<init>()
            com.google.android.gms.internal.ads.zzgyr.zza = r0
            return
    }

    public zzgyr(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            com.google.android.gms.internal.ads.zzgyv.zza(r0)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)
            r2.zzb = r0
            javax.crypto.Cipher r3 = zzb()
            r1 = 1
            r3.init(r1, r0)
            r0 = 16
            byte[] r0 = new byte[r0]
            byte[] r3 = r3.doFinal(r0)
            byte[] r3 = com.google.android.gms.internal.ads.zzgtf.zza(r3)
            r2.zzc = r3
            byte[] r3 = com.google.android.gms.internal.ads.zzgtf.zza(r3)
            r2.zzd = r3
            return
    }

    private static javax.crypto.Cipher zzb() throws java.security.GeneralSecurityException {
            r0 = 1
            boolean r0 = com.google.android.gms.internal.ads.zzgnw.zza(r0)
            if (r0 == 0) goto L10
            java.lang.ThreadLocal r0 = com.google.android.gms.internal.ads.zzgyr.zza
            java.lang.Object r0 = r0.get()
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            return r0
        L10:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Can not use AES-CMAC in FIPS-mode."
            r0.<init>(r1)
            throw r0
    }

    private static void zzc(byte[] r3, byte[] r4, int r5, byte[] r6) {
            r0 = 0
        L1:
            r1 = 16
            if (r0 >= r1) goto L12
            r1 = r3[r0]
            int r2 = r0 + r5
            r2 = r4[r2]
            r1 = r1 ^ r2
            byte r1 = (byte) r1
            r6[r0] = r1
            int r0 = r0 + 1
            goto L1
        L12:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgto
    public final byte[] zza(byte[] r11, int r12) throws java.security.GeneralSecurityException {
            r10 = this;
            r0 = 16
            if (r12 > r0) goto L83
            javax.crypto.SecretKey r1 = r10.zzb
            javax.crypto.Cipher r2 = zzb()
            r3 = 1
            r2.init(r3, r1)
            int r1 = r11.length
            if (r1 != 0) goto L12
            goto L17
        L12:
            int r4 = r1 + (-1)
            int r4 = r4 >> 4
            int r3 = r3 + r4
        L17:
            int r4 = r3 + (-1)
            int r5 = r4 * 16
            int r3 = r3 * 16
            r6 = 0
            if (r3 != r1) goto L27
            byte[] r1 = r10.zzc
            byte[] r1 = com.google.android.gms.internal.ads.zzgxv.zzc(r11, r5, r1, r6, r0)
            goto L3f
        L27:
            byte[] r1 = java.util.Arrays.copyOfRange(r11, r5, r1)
            int r3 = r1.length
            if (r3 >= r0) goto L7b
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)
            r5 = -128(0xffffffffffffff80, float:NaN)
            r1[r3] = r5
            byte[] r3 = r10.zzd
            int r5 = r1.length
            if (r5 != r0) goto L73
            byte[] r1 = com.google.android.gms.internal.ads.zzgxv.zzc(r1, r6, r3, r6, r0)
        L3f:
            byte[] r3 = new byte[r0]
            byte[] r5 = new byte[r0]
            r7 = 0
        L44:
            java.lang.String r8 = "Cipher didn't write full block"
            if (r7 >= r4) goto L5c
            int r9 = r7 * 16
            zzc(r3, r11, r9, r5)
            int r9 = r2.doFinal(r5, r6, r0, r3)
            if (r9 != r0) goto L56
            int r7 = r7 + 1
            goto L44
        L56:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r8)
            throw r11
        L5c:
            zzc(r3, r1, r6, r5)
            int r11 = r2.doFinal(r5, r6, r0, r3)
            if (r11 != r0) goto L6d
            if (r12 != r0) goto L68
            return r3
        L68:
            byte[] r11 = java.util.Arrays.copyOf(r3, r12)
            return r11
        L6d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r8)
            throw r11
        L73:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "The lengths of x and y should match."
            r11.<init>(r12)
            throw r11
        L7b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "x must be smaller than a block."
            r11.<init>(r12)
            throw r11
        L83:
            java.security.InvalidAlgorithmParameterException r11 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r12 = "outputLength too large, max is 16 bytes"
            r11.<init>(r12)
            throw r11
    }
}
