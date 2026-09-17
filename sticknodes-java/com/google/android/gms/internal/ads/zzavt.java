package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzavt {
    private static javax.crypto.Cipher zza;
    private static final java.lang.Object zzb = null;
    private static final java.lang.Object zzc = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzavt.zzb = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzavt.zzc = r0
            return
    }

    public zzavt(java.security.SecureRandom r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private static final javax.crypto.Cipher zzc() throws java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException {
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzavt.zzc
            monitor-enter(r0)
            javax.crypto.Cipher r1 = com.google.android.gms.internal.ads.zzavt.zza     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto Lf
            java.lang.String r1 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.ads.zzavt.zza = r1     // Catch: java.lang.Throwable -> L13
        Lf:
            javax.crypto.Cipher r1 = com.google.android.gms.internal.ads.zzavt.zza     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L13:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    public final java.lang.String zza(byte[] r5, byte[] r6) throws com.google.android.gms.internal.ads.zzavs {
            r4 = this;
            int r0 = r5.length
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch: javax.crypto.BadPaddingException -> L44 javax.crypto.NoSuchPaddingException -> L4b javax.crypto.IllegalBlockSizeException -> L52 java.security.InvalidKeyException -> L59 java.security.NoSuchAlgorithmException -> L60
            java.lang.String r1 = "AES"
            r0.<init>(r5, r1)     // Catch: javax.crypto.BadPaddingException -> L44 javax.crypto.NoSuchPaddingException -> L4b javax.crypto.IllegalBlockSizeException -> L52 java.security.InvalidKeyException -> L59 java.security.NoSuchAlgorithmException -> L60
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzavt.zzb     // Catch: javax.crypto.BadPaddingException -> L44 javax.crypto.NoSuchPaddingException -> L4b javax.crypto.IllegalBlockSizeException -> L52 java.security.InvalidKeyException -> L59 java.security.NoSuchAlgorithmException -> L60
            monitor-enter(r5)     // Catch: javax.crypto.BadPaddingException -> L44 javax.crypto.NoSuchPaddingException -> L4b javax.crypto.IllegalBlockSizeException -> L52 java.security.InvalidKeyException -> L59 java.security.NoSuchAlgorithmException -> L60
            javax.crypto.Cipher r1 = zzc()     // Catch: java.lang.Throwable -> L41
            r2 = 1
            r3 = 0
            r1.init(r2, r0, r3)     // Catch: java.lang.Throwable -> L41
            javax.crypto.Cipher r0 = zzc()     // Catch: java.lang.Throwable -> L41
            byte[] r6 = r0.doFinal(r6)     // Catch: java.lang.Throwable -> L41
            javax.crypto.Cipher r0 = zzc()     // Catch: java.lang.Throwable -> L41
            byte[] r0 = r0.getIV()     // Catch: java.lang.Throwable -> L41
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L41
            int r5 = r6.length     // Catch: javax.crypto.BadPaddingException -> L44 javax.crypto.NoSuchPaddingException -> L4b javax.crypto.IllegalBlockSizeException -> L52 java.security.InvalidKeyException -> L59 java.security.NoSuchAlgorithmException -> L60
            int r1 = r0.length     // Catch: javax.crypto.BadPaddingException -> L44 javax.crypto.NoSuchPaddingException -> L4b javax.crypto.IllegalBlockSizeException -> L52 java.security.InvalidKeyException -> L59 java.security.NoSuchAlgorithmException -> L60
            int r5 = r5 + r1
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r5)     // Catch: javax.crypto.BadPaddingException -> L44 javax.crypto.NoSuchPaddingException -> L4b javax.crypto.IllegalBlockSizeException -> L52 java.security.InvalidKeyException -> L59 java.security.NoSuchAlgorithmException -> L60
            java.nio.ByteBuffer r0 = r1.put(r0)     // Catch: javax.crypto.BadPaddingException -> L44 javax.crypto.NoSuchPaddingException -> L4b javax.crypto.IllegalBlockSizeException -> L52 java.security.InvalidKeyException -> L59 java.security.NoSuchAlgorithmException -> L60
            r0.put(r6)     // Catch: javax.crypto.BadPaddingException -> L44 javax.crypto.NoSuchPaddingException -> L4b javax.crypto.IllegalBlockSizeException -> L52 java.security.InvalidKeyException -> L59 java.security.NoSuchAlgorithmException -> L60
            r1.flip()     // Catch: javax.crypto.BadPaddingException -> L44 javax.crypto.NoSuchPaddingException -> L4b javax.crypto.IllegalBlockSizeException -> L52 java.security.InvalidKeyException -> L59 java.security.NoSuchAlgorithmException -> L60
            byte[] r5 = new byte[r5]     // Catch: javax.crypto.BadPaddingException -> L44 javax.crypto.NoSuchPaddingException -> L4b javax.crypto.IllegalBlockSizeException -> L52 java.security.InvalidKeyException -> L59 java.security.NoSuchAlgorithmException -> L60
            r1.get(r5)     // Catch: javax.crypto.BadPaddingException -> L44 javax.crypto.NoSuchPaddingException -> L4b javax.crypto.IllegalBlockSizeException -> L52 java.security.InvalidKeyException -> L59 java.security.NoSuchAlgorithmException -> L60
            r6 = 0
            java.lang.String r5 = com.google.android.gms.internal.ads.zzatx.zza(r5, r6)     // Catch: javax.crypto.BadPaddingException -> L44 javax.crypto.NoSuchPaddingException -> L4b javax.crypto.IllegalBlockSizeException -> L52 java.security.InvalidKeyException -> L59 java.security.NoSuchAlgorithmException -> L60
            return r5
        L41:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L41
            throw r6     // Catch: javax.crypto.BadPaddingException -> L44 javax.crypto.NoSuchPaddingException -> L4b javax.crypto.IllegalBlockSizeException -> L52 java.security.InvalidKeyException -> L59 java.security.NoSuchAlgorithmException -> L60
        L44:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzavs r6 = new com.google.android.gms.internal.ads.zzavs
            r6.<init>(r4, r5)
            throw r6
        L4b:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzavs r6 = new com.google.android.gms.internal.ads.zzavs
            r6.<init>(r4, r5)
            throw r6
        L52:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzavs r6 = new com.google.android.gms.internal.ads.zzavs
            r6.<init>(r4, r5)
            throw r6
        L59:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzavs r6 = new com.google.android.gms.internal.ads.zzavs
            r6.<init>(r4, r5)
            throw r6
        L60:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzavs r6 = new com.google.android.gms.internal.ads.zzavs
            r6.<init>(r4, r5)
            throw r6
    }

    public final byte[] zzb(byte[] r6, java.lang.String r7) throws com.google.android.gms.internal.ads.zzavs {
            r5 = this;
            int r0 = r6.length
            r0 = 0
            byte[] r7 = com.google.android.gms.internal.ads.zzatx.zzb(r7, r0)     // Catch: java.lang.IllegalArgumentException -> L4b java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L59 javax.crypto.NoSuchPaddingException -> L60 javax.crypto.IllegalBlockSizeException -> L67 java.security.InvalidKeyException -> L6e java.security.NoSuchAlgorithmException -> L75
            int r0 = r7.length     // Catch: java.lang.IllegalArgumentException -> L4b java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L59 javax.crypto.NoSuchPaddingException -> L60 javax.crypto.IllegalBlockSizeException -> L67 java.security.InvalidKeyException -> L6e java.security.NoSuchAlgorithmException -> L75
            r1 = 16
            if (r0 <= r1) goto L45
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r0)     // Catch: java.lang.IllegalArgumentException -> L4b java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L59 javax.crypto.NoSuchPaddingException -> L60 javax.crypto.IllegalBlockSizeException -> L67 java.security.InvalidKeyException -> L6e java.security.NoSuchAlgorithmException -> L75
            r2.put(r7)     // Catch: java.lang.IllegalArgumentException -> L4b java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L59 javax.crypto.NoSuchPaddingException -> L60 javax.crypto.IllegalBlockSizeException -> L67 java.security.InvalidKeyException -> L6e java.security.NoSuchAlgorithmException -> L75
            r2.flip()     // Catch: java.lang.IllegalArgumentException -> L4b java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L59 javax.crypto.NoSuchPaddingException -> L60 javax.crypto.IllegalBlockSizeException -> L67 java.security.InvalidKeyException -> L6e java.security.NoSuchAlgorithmException -> L75
            byte[] r7 = new byte[r1]     // Catch: java.lang.IllegalArgumentException -> L4b java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L59 javax.crypto.NoSuchPaddingException -> L60 javax.crypto.IllegalBlockSizeException -> L67 java.security.InvalidKeyException -> L6e java.security.NoSuchAlgorithmException -> L75
            int r0 = r0 + (-16)
            byte[] r0 = new byte[r0]     // Catch: java.lang.IllegalArgumentException -> L4b java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L59 javax.crypto.NoSuchPaddingException -> L60 javax.crypto.IllegalBlockSizeException -> L67 java.security.InvalidKeyException -> L6e java.security.NoSuchAlgorithmException -> L75
            r2.get(r7)     // Catch: java.lang.IllegalArgumentException -> L4b java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L59 javax.crypto.NoSuchPaddingException -> L60 javax.crypto.IllegalBlockSizeException -> L67 java.security.InvalidKeyException -> L6e java.security.NoSuchAlgorithmException -> L75
            r2.get(r0)     // Catch: java.lang.IllegalArgumentException -> L4b java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L59 javax.crypto.NoSuchPaddingException -> L60 javax.crypto.IllegalBlockSizeException -> L67 java.security.InvalidKeyException -> L6e java.security.NoSuchAlgorithmException -> L75
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.IllegalArgumentException -> L4b java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L59 javax.crypto.NoSuchPaddingException -> L60 javax.crypto.IllegalBlockSizeException -> L67 java.security.InvalidKeyException -> L6e java.security.NoSuchAlgorithmException -> L75
            java.lang.String r2 = "AES"
            r1.<init>(r6, r2)     // Catch: java.lang.IllegalArgumentException -> L4b java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L59 javax.crypto.NoSuchPaddingException -> L60 javax.crypto.IllegalBlockSizeException -> L67 java.security.InvalidKeyException -> L6e java.security.NoSuchAlgorithmException -> L75
            java.lang.Object r6 = com.google.android.gms.internal.ads.zzavt.zzb     // Catch: java.lang.IllegalArgumentException -> L4b java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L59 javax.crypto.NoSuchPaddingException -> L60 javax.crypto.IllegalBlockSizeException -> L67 java.security.InvalidKeyException -> L6e java.security.NoSuchAlgorithmException -> L75
            monitor-enter(r6)     // Catch: java.lang.IllegalArgumentException -> L4b java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L59 javax.crypto.NoSuchPaddingException -> L60 javax.crypto.IllegalBlockSizeException -> L67 java.security.InvalidKeyException -> L6e java.security.NoSuchAlgorithmException -> L75
            javax.crypto.Cipher r2 = zzc()     // Catch: java.lang.Throwable -> L42
            r3 = 2
            javax.crypto.spec.IvParameterSpec r4 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L42
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L42
            r2.init(r3, r1, r4)     // Catch: java.lang.Throwable -> L42
            javax.crypto.Cipher r7 = zzc()     // Catch: java.lang.Throwable -> L42
            byte[] r7 = r7.doFinal(r0)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L42
            return r7
        L42:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L42
            throw r7     // Catch: java.lang.IllegalArgumentException -> L4b java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L59 javax.crypto.NoSuchPaddingException -> L60 javax.crypto.IllegalBlockSizeException -> L67 java.security.InvalidKeyException -> L6e java.security.NoSuchAlgorithmException -> L75
        L45:
            com.google.android.gms.internal.ads.zzavs r6 = new com.google.android.gms.internal.ads.zzavs     // Catch: java.lang.IllegalArgumentException -> L4b java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L59 javax.crypto.NoSuchPaddingException -> L60 javax.crypto.IllegalBlockSizeException -> L67 java.security.InvalidKeyException -> L6e java.security.NoSuchAlgorithmException -> L75
            r6.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L4b java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L59 javax.crypto.NoSuchPaddingException -> L60 javax.crypto.IllegalBlockSizeException -> L67 java.security.InvalidKeyException -> L6e java.security.NoSuchAlgorithmException -> L75
            throw r6     // Catch: java.lang.IllegalArgumentException -> L4b java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L59 javax.crypto.NoSuchPaddingException -> L60 javax.crypto.IllegalBlockSizeException -> L67 java.security.InvalidKeyException -> L6e java.security.NoSuchAlgorithmException -> L75
        L4b:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzavs r7 = new com.google.android.gms.internal.ads.zzavs
            r7.<init>(r5, r6)
            throw r7
        L52:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzavs r7 = new com.google.android.gms.internal.ads.zzavs
            r7.<init>(r5, r6)
            throw r7
        L59:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzavs r7 = new com.google.android.gms.internal.ads.zzavs
            r7.<init>(r5, r6)
            throw r7
        L60:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzavs r7 = new com.google.android.gms.internal.ads.zzavs
            r7.<init>(r5, r6)
            throw r7
        L67:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzavs r7 = new com.google.android.gms.internal.ads.zzavs
            r7.<init>(r5, r6)
            throw r7
        L6e:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzavs r7 = new com.google.android.gms.internal.ads.zzavs
            r7.<init>(r5, r6)
            throw r7
        L75:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzavs r7 = new com.google.android.gms.internal.ads.zzavs
            r7.<init>(r5, r6)
            throw r7
    }
}
