package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgxq implements com.google.android.gms.internal.ads.zzgyp {
    private static final java.lang.ThreadLocal zza = null;
    private final javax.crypto.spec.SecretKeySpec zzb;
    private final int zzc;
    private final int zzd;

    static {
            com.google.android.gms.internal.ads.zzgxp r0 = new com.google.android.gms.internal.ads.zzgxp
            r0.<init>()
            com.google.android.gms.internal.ads.zzgxq.zza = r0
            return
    }

    public zzgxq(byte[] r3, int r4) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            r0 = 2
            boolean r0 = com.google.android.gms.internal.ads.zzgnw.zza(r0)
            if (r0 == 0) goto L32
            int r0 = r3.length
            com.google.android.gms.internal.ads.zzgyv.zza(r0)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)
            r2.zzb = r0
            java.lang.ThreadLocal r3 = com.google.android.gms.internal.ads.zzgxq.zza
            java.lang.Object r3 = r3.get()
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            int r3 = r3.getBlockSize()
            r2.zzd = r3
            if (r4 > r3) goto L2a
            r2.zzc = r4
            return
        L2a:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "invalid IV size"
            r3.<init>(r4)
            throw r3
        L32:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available."
            r3.<init>(r4)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final byte[] zza(byte[] r11) throws java.security.GeneralSecurityException {
            r10 = this;
            int r0 = r11.length
            int r1 = r10.zzc
            if (r0 < r1) goto L3f
            byte[] r2 = new byte[r1]
            r3 = 0
            java.lang.System.arraycopy(r11, r3, r2, r3, r1)
            int r6 = r10.zzc
            int r0 = r0 - r6
            byte[] r1 = new byte[r0]
            java.lang.ThreadLocal r4 = com.google.android.gms.internal.ads.zzgxq.zza
            java.lang.Object r4 = r4.get()
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            int r5 = r10.zzd
            int r7 = r10.zzc
            byte[] r5 = new byte[r5]
            java.lang.System.arraycopy(r2, r3, r5, r3, r7)
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec
            r2.<init>(r5)
            r3 = 2
            javax.crypto.spec.SecretKeySpec r5 = r10.zzb
            r4.init(r3, r5, r2)
            r9 = 0
            r5 = r11
            r7 = r0
            r8 = r1
            int r11 = r4.doFinal(r5, r6, r7, r8, r9)
            if (r11 != r0) goto L37
            return r1
        L37:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r0 = "stored output's length does not match input's length"
            r11.<init>(r0)
            throw r11
        L3f:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r0 = "ciphertext too short"
            r11.<init>(r0)
            throw r11
    }
}
