package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgyt implements com.google.android.gms.internal.ads.zzgto {
    private final java.lang.ThreadLocal zza;
    private final java.lang.String zzb;
    private final java.security.Key zzc;
    private final int zzd;

    public zzgyt(java.lang.String r6, java.security.Key r7) throws java.security.GeneralSecurityException {
            r5 = this;
            r5.<init>()
            com.google.android.gms.internal.ads.zzgys r0 = new com.google.android.gms.internal.ads.zzgys
            r0.<init>(r5)
            r5.zza = r0
            r1 = 2
            boolean r2 = com.google.android.gms.internal.ads.zzgnw.zza(r1)
            if (r2 == 0) goto L8e
            r5.zzb = r6
            r5.zzc = r7
            byte[] r7 = r7.getEncoded()
            int r7 = r7.length
            r2 = 16
            if (r7 < r2) goto L86
            int r7 = r6.hashCode()
            r2 = 4
            r3 = 3
            r4 = 1
            switch(r7) {
                case -1823053428: goto L51;
                case 392315023: goto L47;
                case 392315118: goto L3d;
                case 392316170: goto L33;
                case 392317873: goto L29;
                default: goto L28;
            }
        L28:
            goto L5b
        L29:
            java.lang.String r7 = "HMACSHA512"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = 4
            goto L5c
        L33:
            java.lang.String r7 = "HMACSHA384"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = 3
            goto L5c
        L3d:
            java.lang.String r7 = "HMACSHA256"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = 2
            goto L5c
        L47:
            java.lang.String r7 = "HMACSHA224"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = 1
            goto L5c
        L51:
            java.lang.String r7 = "HMACSHA1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = 0
            goto L5c
        L5b:
            r7 = -1
        L5c:
            if (r7 == 0) goto L7e
            if (r7 == r4) goto L7b
            if (r7 == r1) goto L78
            if (r7 == r3) goto L75
            if (r7 != r2) goto L69
            r6 = 64
            goto L80
        L69:
            java.lang.String r7 = "unknown Hmac algorithm: "
            java.lang.String r6 = r7.concat(r6)
            java.security.NoSuchAlgorithmException r7 = new java.security.NoSuchAlgorithmException
            r7.<init>(r6)
            throw r7
        L75:
            r6 = 48
            goto L80
        L78:
            r6 = 32
            goto L80
        L7b:
            r6 = 28
            goto L80
        L7e:
            r6 = 20
        L80:
            r5.zzd = r6
            r0.get()
            return
        L86:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r7 = "key size too small, need at least 16 bytes"
            r6.<init>(r7)
            throw r6
        L8e:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r6.<init>(r7)
            throw r6
    }

    static /* bridge */ /* synthetic */ java.lang.String zzb(com.google.android.gms.internal.ads.zzgyt r0) {
            java.lang.String r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ java.security.Key zzc(com.google.android.gms.internal.ads.zzgyt r0) {
            java.security.Key r0 = r0.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgto
    public final byte[] zza(byte[] r2, int r3) throws java.security.GeneralSecurityException {
            r1 = this;
            int r0 = r1.zzd
            if (r3 > r0) goto L20
            java.lang.ThreadLocal r0 = r1.zza
            java.lang.Object r0 = r0.get()
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0
            r0.update(r2)
            java.lang.ThreadLocal r2 = r1.zza
            java.lang.Object r2 = r2.get()
            javax.crypto.Mac r2 = (javax.crypto.Mac) r2
            byte[] r2 = r2.doFinal()
            byte[] r2 = java.util.Arrays.copyOf(r2, r3)
            return r2
        L20:
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r3 = "tag size too big"
            r2.<init>(r3)
            throw r2
    }
}
