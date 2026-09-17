package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzgnj {
    private final com.google.android.gms.internal.ads.zzgnh zza;
    private final com.google.android.gms.internal.ads.zzgnh zzb;

    public zzgnj(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            r0 = 1
            boolean r1 = com.google.android.gms.internal.ads.zzgnw.zza(r0)
            if (r1 == 0) goto L18
            com.google.android.gms.internal.ads.zzgnh r0 = r2.zza(r3, r0)
            r2.zza = r0
            r0 = 0
            com.google.android.gms.internal.ads.zzgnh r3 = r2.zza(r3, r0)
            r2.zzb = r3
            return
        L18:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Can not use ChaCha20Poly1305 in FIPS-mode."
            r3.<init>(r0)
            throw r3
    }

    abstract com.google.android.gms.internal.ads.zzgnh zza(byte[] r1, int r2) throws java.security.InvalidKeyException;

    public final byte[] zzb(java.nio.ByteBuffer r10, byte[] r11, byte[] r12) throws java.security.GeneralSecurityException {
            r9 = this;
            int r0 = r10.remaining()
            r1 = 16
            if (r0 < r1) goto L9b
            int r0 = r10.position()
            byte[] r1 = new byte[r1]
            int r2 = r10.limit()
            int r2 = r2 + (-16)
            r10.position(r2)
            r10.get(r1)
            r10.position(r0)
            int r2 = r10.limit()
            int r2 = r2 + (-16)
            r10.limit(r2)
            r2 = 0
            if (r12 != 0) goto L2b
            byte[] r12 = new byte[r2]
        L2b:
            com.google.android.gms.internal.ads.zzgnh r3 = r9.zzb     // Catch: java.security.GeneralSecurityException -> L90
            java.nio.ByteBuffer r2 = r3.zzc(r11, r2)     // Catch: java.security.GeneralSecurityException -> L90
            r3 = 32
            byte[] r3 = new byte[r3]     // Catch: java.security.GeneralSecurityException -> L90
            r2.get(r3)     // Catch: java.security.GeneralSecurityException -> L90
            int r2 = r12.length     // Catch: java.security.GeneralSecurityException -> L90
            r4 = r2 & 15
            if (r4 != 0) goto L3f
            r5 = r2
            goto L42
        L3f:
            int r5 = r2 + 16
            int r5 = r5 - r4
        L42:
            int r4 = r10.remaining()     // Catch: java.security.GeneralSecurityException -> L90
            int r6 = r4 % 16
            if (r6 != 0) goto L4c
            r7 = r4
            goto L4f
        L4c:
            int r7 = r4 + 16
            int r7 = r7 - r6
        L4f:
            int r7 = r7 + r5
            int r6 = r7 + 16
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r6)     // Catch: java.security.GeneralSecurityException -> L90
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.security.GeneralSecurityException -> L90
            java.nio.ByteBuffer r6 = r6.order(r8)     // Catch: java.security.GeneralSecurityException -> L90
            r6.put(r12)     // Catch: java.security.GeneralSecurityException -> L90
            r6.position(r5)     // Catch: java.security.GeneralSecurityException -> L90
            r6.put(r10)     // Catch: java.security.GeneralSecurityException -> L90
            r6.position(r7)     // Catch: java.security.GeneralSecurityException -> L90
            long r7 = (long) r2     // Catch: java.security.GeneralSecurityException -> L90
            r6.putLong(r7)     // Catch: java.security.GeneralSecurityException -> L90
            long r4 = (long) r4     // Catch: java.security.GeneralSecurityException -> L90
            r6.putLong(r4)     // Catch: java.security.GeneralSecurityException -> L90
            byte[] r12 = r6.array()     // Catch: java.security.GeneralSecurityException -> L90
            byte[] r12 = com.google.android.gms.internal.ads.zzgnn.zza(r3, r12)     // Catch: java.security.GeneralSecurityException -> L90
            boolean r12 = java.security.MessageDigest.isEqual(r12, r1)     // Catch: java.security.GeneralSecurityException -> L90
            if (r12 == 0) goto L88
            r10.position(r0)
            com.google.android.gms.internal.ads.zzgnh r12 = r9.zza
            byte[] r10 = r12.zzd(r11, r10)
            return r10
        L88:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException     // Catch: java.security.GeneralSecurityException -> L90
            java.lang.String r11 = "invalid MAC"
            r10.<init>(r11)     // Catch: java.security.GeneralSecurityException -> L90
            throw r10     // Catch: java.security.GeneralSecurityException -> L90
        L90:
            r10 = move-exception
            javax.crypto.AEADBadTagException r11 = new javax.crypto.AEADBadTagException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        L9b:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "ciphertext too short"
            r10.<init>(r11)
            throw r10
    }
}
