package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgnv implements com.google.android.gms.internal.ads.zzggt {
    private static final byte[] zza = null;
    private static final byte[] zzb = null;
    private static final byte[] zzc = null;
    private static final byte[] zzd = null;
    private static final byte[] zze = null;
    private static final java.lang.ThreadLocal zzf = null;
    private final javax.crypto.SecretKey zzg;
    private final byte[] zzh;

    static {
            java.lang.String r0 = "7a806c"
            byte[] r0 = com.google.android.gms.internal.ads.zzgyo.zza(r0)
            com.google.android.gms.internal.ads.zzgnv.zza = r0
            java.lang.String r0 = "46bb91c3c5"
            byte[] r0 = com.google.android.gms.internal.ads.zzgyo.zza(r0)
            com.google.android.gms.internal.ads.zzgnv.zzb = r0
            java.lang.String r0 = "36864200e0eaf5284d884a0e77d31646"
            byte[] r0 = com.google.android.gms.internal.ads.zzgyo.zza(r0)
            com.google.android.gms.internal.ads.zzgnv.zzc = r0
            java.lang.String r0 = "bae8e37fc83441b16034566b"
            byte[] r0 = com.google.android.gms.internal.ads.zzgyo.zza(r0)
            com.google.android.gms.internal.ads.zzgnv.zzd = r0
            java.lang.String r0 = "af60eb711bd85bc1e4d3e0a462e074eea428a8"
            byte[] r0 = com.google.android.gms.internal.ads.zzgyo.zza(r0)
            com.google.android.gms.internal.ads.zzgnv.zze = r0
            com.google.android.gms.internal.ads.zzgnu r0 = new com.google.android.gms.internal.ads.zzgnu
            r0.<init>()
            com.google.android.gms.internal.ads.zzgnv.zzf = r0
            return
    }

    private zzgnv(byte[] r2, byte[] r3) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            r1.zzh = r3
            int r3 = r2.length
            com.google.android.gms.internal.ads.zzgyv.zza(r3)
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r0 = "AES"
            r3.<init>(r2, r0)
            r1.zzg = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzggt zzb(com.google.android.gms.internal.ads.zzgjx r3) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgnv r0 = new com.google.android.gms.internal.ads.zzgnv
            com.google.android.gms.internal.ads.zzgyy r1 = r3.zzd()
            com.google.android.gms.internal.ads.zzghw r2 = com.google.android.gms.internal.ads.zzghc.zza()
            byte[] r1 = r1.zzd(r2)
            com.google.android.gms.internal.ads.zzgyx r3 = r3.zzc()
            byte[] r3 = r3.zzc()
            r0.<init>(r1, r3)
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzc(javax.crypto.Cipher r0) {
            boolean r0 = zzd(r0)
            return r0
    }

    private static boolean zzd(javax.crypto.Cipher r6) {
            r0 = 0
            byte[] r1 = com.google.android.gms.internal.ads.zzgnv.zzd     // Catch: java.security.GeneralSecurityException -> L2b
            int r2 = r1.length     // Catch: java.security.GeneralSecurityException -> L2b
            javax.crypto.spec.GCMParameterSpec r3 = new javax.crypto.spec.GCMParameterSpec     // Catch: java.security.GeneralSecurityException -> L2b
            r4 = 128(0x80, float:1.794E-43)
            r3.<init>(r4, r1, r0, r2)     // Catch: java.security.GeneralSecurityException -> L2b
            r1 = 2
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.GeneralSecurityException -> L2b
            byte[] r4 = com.google.android.gms.internal.ads.zzgnv.zzc     // Catch: java.security.GeneralSecurityException -> L2b
            java.lang.String r5 = "AES"
            r2.<init>(r4, r5)     // Catch: java.security.GeneralSecurityException -> L2b
            r6.init(r1, r2, r3)     // Catch: java.security.GeneralSecurityException -> L2b
            byte[] r1 = com.google.android.gms.internal.ads.zzgnv.zzb     // Catch: java.security.GeneralSecurityException -> L2b
            r6.updateAAD(r1)     // Catch: java.security.GeneralSecurityException -> L2b
            byte[] r1 = com.google.android.gms.internal.ads.zzgnv.zze     // Catch: java.security.GeneralSecurityException -> L2b
            int r2 = r1.length     // Catch: java.security.GeneralSecurityException -> L2b
            byte[] r6 = r6.doFinal(r1, r0, r2)     // Catch: java.security.GeneralSecurityException -> L2b
            byte[] r1 = com.google.android.gms.internal.ads.zzgnv.zza     // Catch: java.security.GeneralSecurityException -> L2b
            boolean r6 = java.security.MessageDigest.isEqual(r6, r1)     // Catch: java.security.GeneralSecurityException -> L2b
            return r6
        L2b:
            return r0
    }

    private final byte[] zze(byte[] r7, byte[] r8) throws java.security.GeneralSecurityException {
            r6 = this;
            java.lang.ThreadLocal r0 = com.google.android.gms.internal.ads.zzgnv.zzf
            java.lang.Object r0 = r0.get()
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            if (r0 == 0) goto L36
            int r1 = r7.length
            r2 = 28
            if (r1 < r2) goto L2e
            javax.crypto.spec.GCMParameterSpec r2 = new javax.crypto.spec.GCMParameterSpec
            r3 = 128(0x80, float:1.794E-43)
            r4 = 0
            r5 = 12
            r2.<init>(r3, r7, r4, r5)
            r3 = 2
            javax.crypto.SecretKey r4 = r6.zzg
            r0.init(r3, r4, r2)
            if (r8 == 0) goto L27
            int r2 = r8.length
            if (r2 == 0) goto L27
            r0.updateAAD(r8)
        L27:
            int r1 = r1 + (-12)
            byte[] r7 = r0.doFinal(r7, r5, r1)
            return r7
        L2e:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r8 = "ciphertext too short"
            r7.<init>(r8)
            throw r7
        L36:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r8 = "AES GCM SIV cipher is not available or is invalid."
            r7.<init>(r8)
            throw r7
    }

    @Override // com.google.android.gms.internal.ads.zzggt
    public final byte[] zza(byte[] r3, byte[] r4) throws java.security.GeneralSecurityException {
            r2 = this;
            byte[] r0 = r2.zzh
            int r1 = r0.length
            if (r1 != 0) goto La
            byte[] r3 = r2.zze(r3, r4)
            return r3
        La:
            boolean r0 = com.google.android.gms.internal.ads.zzgrg.zzc(r0, r3)
            if (r0 == 0) goto L1d
            byte[] r0 = r2.zzh
            int r1 = r3.length
            int r0 = r0.length
            byte[] r3 = java.util.Arrays.copyOfRange(r3, r0, r1)
            byte[] r3 = r2.zze(r3, r4)
            return r3
        L1d:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Decryption failed (OutputPrefix mismatch)."
            r3.<init>(r4)
            throw r3
    }
}
