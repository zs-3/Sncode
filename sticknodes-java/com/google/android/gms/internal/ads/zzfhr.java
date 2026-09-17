package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfhr {
    public zzfhr() {
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.ads.zzgia.zza()     // Catch: java.security.GeneralSecurityException -> L7
            return
        L7:
            r0 = move-exception
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = "Failed to Configure Aead. "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.ads.internal.util.zze.zza(r1)
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "CryptoUtils.registerAead"
            r1.zzw(r0, r2)
            return
    }

    public static final java.lang.String zza() {
            java.lang.String r0 = "AES128_GCM"
            com.google.android.gms.internal.ads.zzgpm r1 = com.google.android.gms.internal.ads.zzgpm.zzb()     // Catch: java.security.GeneralSecurityException -> L2b
            com.google.android.gms.internal.ads.zzghs r0 = r1.zza(r0)     // Catch: java.security.GeneralSecurityException -> L2b
            com.google.android.gms.internal.ads.zzghs r0 = com.google.android.gms.internal.ads.zzghg.zza(r0)     // Catch: java.security.GeneralSecurityException -> L2b
            com.google.android.gms.internal.ads.zzgho r0 = com.google.android.gms.internal.ads.zzgho.zzb(r0)     // Catch: java.security.GeneralSecurityException -> L2b
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L23 java.security.GeneralSecurityException -> L2b
            r1.<init>()     // Catch: java.io.IOException -> L23 java.security.GeneralSecurityException -> L2b
            com.google.android.gms.internal.ads.zzggv r2 = com.google.android.gms.internal.ads.zzggv.zzb(r1)     // Catch: java.io.IOException -> L23 java.security.GeneralSecurityException -> L2b
            com.google.android.gms.internal.ads.zzggw.zzb(r0, r2)     // Catch: java.io.IOException -> L23 java.security.GeneralSecurityException -> L2b
            byte[] r0 = r1.toByteArray()     // Catch: java.io.IOException -> L23 java.security.GeneralSecurityException -> L2b
            goto L45
        L23:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.security.GeneralSecurityException -> L2b
            java.lang.String r1 = "Serialize keyset failed"
            r0.<init>(r1)     // Catch: java.security.GeneralSecurityException -> L2b
            throw r0     // Catch: java.security.GeneralSecurityException -> L2b
        L2b:
            r0 = move-exception
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = "Failed to generate key"
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.ads.internal.util.zze.zza(r1)
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "CryptoUtils.generateKey"
            r1.zzw(r0, r2)
            r0 = 0
            byte[] r0 = new byte[r0]
        L45:
            r1 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            return r0
    }

    public static final java.lang.String zzb(byte[] r3, byte[] r4, java.lang.String r5, com.google.android.gms.internal.ads.zzdty r6) {
            com.google.android.gms.internal.ads.zzgho r5 = zzc(r5)
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            java.lang.Class<com.google.android.gms.internal.ads.zzggt> r1 = com.google.android.gms.internal.ads.zzggt.class
            com.google.android.gms.internal.ads.zzgqv r2 = com.google.android.gms.internal.ads.zzgqv.zzd()     // Catch: java.lang.UnsupportedOperationException -> L2b java.io.UnsupportedEncodingException -> L2d java.security.GeneralSecurityException -> L2f
            java.lang.Object r5 = r5.zzd(r2, r1)     // Catch: java.lang.UnsupportedOperationException -> L2b java.io.UnsupportedEncodingException -> L2d java.security.GeneralSecurityException -> L2f
            com.google.android.gms.internal.ads.zzggt r5 = (com.google.android.gms.internal.ads.zzggt) r5     // Catch: java.lang.UnsupportedOperationException -> L2b java.io.UnsupportedEncodingException -> L2d java.security.GeneralSecurityException -> L2f
            byte[] r3 = r5.zza(r3, r4)     // Catch: java.lang.UnsupportedOperationException -> L2b java.io.UnsupportedEncodingException -> L2d java.security.GeneralSecurityException -> L2f
            java.util.Map r4 = r6.zzb()     // Catch: java.lang.UnsupportedOperationException -> L2b java.io.UnsupportedEncodingException -> L2d java.security.GeneralSecurityException -> L2f
            java.lang.String r5 = "ds"
            java.lang.String r1 = "1"
            r4.put(r5, r1)     // Catch: java.lang.UnsupportedOperationException -> L2b java.io.UnsupportedEncodingException -> L2d java.security.GeneralSecurityException -> L2f
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.UnsupportedOperationException -> L2b java.io.UnsupportedEncodingException -> L2d java.security.GeneralSecurityException -> L2f
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.UnsupportedOperationException -> L2b java.io.UnsupportedEncodingException -> L2d java.security.GeneralSecurityException -> L2f
            return r4
        L2b:
            r3 = move-exception
            goto L30
        L2d:
            r3 = move-exception
            goto L30
        L2f:
            r3 = move-exception
        L30:
            java.lang.String r4 = r3.toString()
            java.lang.String r5 = "Failed to decrypt "
            java.lang.String r4 = r5.concat(r4)
            com.google.android.gms.ads.internal.util.zze.zza(r4)
            com.google.android.gms.internal.ads.zzcad r4 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r5 = "CryptoUtils.decrypt"
            r4.zzw(r3, r5)
            java.util.Map r4 = r6.zzb()
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "dsf"
            r4.put(r5, r3)
            return r0
    }

    private static final com.google.android.gms.internal.ads.zzgho zzc(java.lang.String r2) {
            r0 = 11
            byte[] r2 = android.util.Base64.decode(r2, r0)     // Catch: java.security.GeneralSecurityException -> L17
            com.google.android.gms.internal.ads.zzggu r2 = com.google.android.gms.internal.ads.zzggu.zzb(r2)     // Catch: java.io.IOException -> Lf java.security.GeneralSecurityException -> L17
            com.google.android.gms.internal.ads.zzgho r2 = com.google.android.gms.internal.ads.zzggw.zza(r2)     // Catch: java.io.IOException -> Lf java.security.GeneralSecurityException -> L17
            goto L2f
        Lf:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.security.GeneralSecurityException -> L17
            java.lang.String r0 = "Parse keyset failed"
            r2.<init>(r0)     // Catch: java.security.GeneralSecurityException -> L17
            throw r2     // Catch: java.security.GeneralSecurityException -> L17
        L17:
            r2 = move-exception
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "Failed to get keysethandle"
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "CryptoUtils.getHandle"
            r0.zzw(r2, r1)
            r2 = 0
        L2f:
            return r2
    }
}
