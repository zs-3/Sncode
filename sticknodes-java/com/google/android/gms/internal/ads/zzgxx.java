package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgxx implements com.google.android.gms.internal.ads.zzggt {
    private final com.google.android.gms.internal.ads.zzgyp zza;
    private final com.google.android.gms.internal.ads.zzghr zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzgxx(com.google.android.gms.internal.ads.zzgyp r1, com.google.android.gms.internal.ads.zzghr r2, int r3, byte[] r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public static com.google.android.gms.internal.ads.zzggt zzb(com.google.android.gms.internal.ads.zzgik r8) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgxx r0 = new com.google.android.gms.internal.ads.zzgxx
            com.google.android.gms.internal.ads.zzgxq r1 = new com.google.android.gms.internal.ads.zzgxq
            com.google.android.gms.internal.ads.zzgyy r2 = r8.zzd()
            com.google.android.gms.internal.ads.zzghw r3 = com.google.android.gms.internal.ads.zzghc.zza()
            byte[] r2 = r2.zzd(r3)
            com.google.android.gms.internal.ads.zzgiu r3 = r8.zzb()
            int r3 = r3.zzd()
            r1.<init>(r2, r3)
            com.google.android.gms.internal.ads.zzgyu r2 = new com.google.android.gms.internal.ads.zzgyu
            com.google.android.gms.internal.ads.zzgyt r3 = new com.google.android.gms.internal.ads.zzgyt
            com.google.android.gms.internal.ads.zzgiu r4 = r8.zzb()
            com.google.android.gms.internal.ads.zzgir r4 = r4.zzg()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec
            com.google.android.gms.internal.ads.zzgyy r6 = r8.zze()
            com.google.android.gms.internal.ads.zzghw r7 = com.google.android.gms.internal.ads.zzghc.zza()
            byte[] r6 = r6.zzd(r7)
            java.lang.String r7 = "HMAC"
            r5.<init>(r6, r7)
            java.lang.String r4 = r7.concat(r4)
            r3.<init>(r4, r5)
            com.google.android.gms.internal.ads.zzgiu r4 = r8.zzb()
            int r4 = r4.zze()
            r2.<init>(r3, r4)
            com.google.android.gms.internal.ads.zzgiu r3 = r8.zzb()
            int r3 = r3.zze()
            com.google.android.gms.internal.ads.zzgyx r8 = r8.zzc()
            byte[] r8 = r8.zzc()
            r0.<init>(r1, r2, r3, r8)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzggt
    public final byte[] zza(byte[] r9, byte[] r10) throws java.security.GeneralSecurityException {
            r8 = this;
            byte[] r0 = r8.zzd
            int r1 = r8.zzc
            int r2 = r0.length
            int r3 = r9.length
            int r1 = r1 + r2
            if (r3 < r1) goto L73
            boolean r0 = com.google.android.gms.internal.ads.zzgrg.zzc(r0, r9)
            if (r0 == 0) goto L6b
            byte[] r0 = r8.zzd
            int r1 = r8.zzc
            int r1 = r3 - r1
            int r0 = r0.length
            byte[] r0 = java.util.Arrays.copyOfRange(r9, r0, r1)
            int r1 = r8.zzc
            int r1 = r3 - r1
            byte[] r9 = java.util.Arrays.copyOfRange(r9, r1, r3)
            r1 = 0
            if (r10 != 0) goto L27
            byte[] r10 = new byte[r1]
        L27:
            r2 = 8
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r2)
            int r4 = r10.length
            long r4 = (long) r4
            r6 = 8
            long r4 = r4 * r6
            java.nio.ByteBuffer r3 = r3.putLong(r4)
            byte[] r3 = r3.array()
            byte[] r2 = java.util.Arrays.copyOf(r3, r2)
            com.google.android.gms.internal.ads.zzghr r3 = r8.zzb
            r4 = 3
            byte[][] r4 = new byte[r4][]
            r4[r1] = r10
            r10 = 1
            r4[r10] = r0
            r10 = 2
            r4[r10] = r2
            byte[] r10 = com.google.android.gms.internal.ads.zzgxv.zzb(r4)
            com.google.android.gms.internal.ads.zzgyu r3 = (com.google.android.gms.internal.ads.zzgyu) r3
            byte[] r10 = r3.zzc(r10)
            boolean r9 = java.security.MessageDigest.isEqual(r10, r9)
            if (r9 == 0) goto L63
            com.google.android.gms.internal.ads.zzgyp r9 = r8.zza
            byte[] r9 = r9.zza(r0)
            return r9
        L63:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "invalid MAC"
            r9.<init>(r10)
            throw r9
        L6b:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "Decryption failed (OutputPrefix mismatch)."
            r9.<init>(r10)
            throw r9
        L73:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "Decryption failed (ciphertext too short)."
            r9.<init>(r10)
            throw r9
    }
}
