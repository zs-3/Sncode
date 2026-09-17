package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgxu implements com.google.android.gms.internal.ads.zzggt {
    private final javax.crypto.SecretKey zza;
    private final byte[] zzb;

    private zzgxu(byte[] r3, com.google.android.gms.internal.ads.zzgyx r4) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            r0 = 2
            boolean r0 = com.google.android.gms.internal.ads.zzgnw.zza(r0)
            if (r0 == 0) goto L20
            int r0 = com.google.android.gms.internal.ads.zzgmn.zza
            int r0 = r3.length
            com.google.android.gms.internal.ads.zzgyv.zza(r0)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)
            r2.zza = r0
            byte[] r3 = r4.zzc()
            r2.zzb = r3
            return
        L20:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."
            r3.<init>(r4)
            throw r3
    }

    public static com.google.android.gms.internal.ads.zzggt zzb(com.google.android.gms.internal.ads.zzgjk r3) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgxu r0 = new com.google.android.gms.internal.ads.zzgxu
            com.google.android.gms.internal.ads.zzgyy r1 = r3.zzd()
            com.google.android.gms.internal.ads.zzghw r2 = com.google.android.gms.internal.ads.zzghc.zza()
            byte[] r1 = r1.zzd(r2)
            com.google.android.gms.internal.ads.zzgyx r3 = r3.zzc()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzggt
    public final byte[] zza(byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
            r5 = this;
            java.lang.String r0 = "ciphertext is null"
            java.util.Objects.requireNonNull(r6, r0)
            byte[] r0 = r5.zzb
            int r1 = r6.length
            int r2 = r0.length
            int r2 = r2 + 28
            if (r1 < r2) goto L63
            boolean r0 = com.google.android.gms.internal.ads.zzgrg.zzc(r0, r6)
            if (r0 == 0) goto L5b
            byte[] r0 = r5.zzb
            int r2 = com.google.android.gms.internal.ads.zzgmn.zza
            java.lang.String r2 = "java.vendor"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.String r3 = "The Android Project"
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 != 0) goto L27
            r2 = 0
            goto L2d
        L27:
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L2d:
            if (r2 == 0) goto L32
            r2.intValue()
        L32:
            int r0 = r0.length
            javax.crypto.spec.GCMParameterSpec r2 = new javax.crypto.spec.GCMParameterSpec
            r3 = 128(0x80, float:1.794E-43)
            r4 = 12
            r2.<init>(r3, r6, r0, r4)
            javax.crypto.SecretKey r0 = r5.zza
            javax.crypto.Cipher r3 = com.google.android.gms.internal.ads.zzgmn.zza()
            r4 = 2
            r3.init(r4, r0, r2)
            if (r7 == 0) goto L4e
            int r0 = r7.length
            if (r0 == 0) goto L4e
            r3.updateAAD(r7)
        L4e:
            byte[] r7 = r5.zzb
            int r7 = r7.length
            int r0 = r7 + 12
            int r1 = r1 - r7
            int r1 = r1 + (-12)
            byte[] r6 = r3.doFinal(r6, r0, r1)
            return r6
        L5b:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "Decryption failed (OutputPrefix mismatch)."
            r6.<init>(r7)
            throw r6
        L63:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "ciphertext too short"
            r6.<init>(r7)
            throw r6
    }
}
