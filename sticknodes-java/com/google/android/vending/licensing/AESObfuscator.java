package com.google.android.vending.licensing;

/* loaded from: classes2.dex */
public class AESObfuscator implements com.google.android.vending.licensing.Obfuscator {
    private static final java.lang.String CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final byte[] IV = null;
    private static final java.lang.String KEYGEN_ALGORITHM = "PBEWITHSHAAND256BITAES-CBC-BC";
    private static final java.lang.String UTF8 = "UTF-8";
    private static final java.lang.String header = "com.android.vending.licensing.AESObfuscator-1|";
    private javax.crypto.Cipher mDecryptor;
    private javax.crypto.Cipher mEncryptor;

    static {
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [16, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74} // fill-array
            com.google.android.vending.licensing.AESObfuscator.IV = r0
            return
    }

    public AESObfuscator(byte[] r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            r4.<init>()
            java.lang.String r1 = "PBEWITHSHAAND256BITAES-CBC-BC"
            javax.crypto.SecretKeyFactory r1 = javax.crypto.SecretKeyFactory.getInstance(r1)     // Catch: java.security.GeneralSecurityException -> L57
            javax.crypto.spec.PBEKeySpec r2 = new javax.crypto.spec.PBEKeySpec     // Catch: java.security.GeneralSecurityException -> L57
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.security.GeneralSecurityException -> L57
            r3.<init>()     // Catch: java.security.GeneralSecurityException -> L57
            r3.append(r6)     // Catch: java.security.GeneralSecurityException -> L57
            r3.append(r7)     // Catch: java.security.GeneralSecurityException -> L57
            java.lang.String r6 = r3.toString()     // Catch: java.security.GeneralSecurityException -> L57
            char[] r6 = r6.toCharArray()     // Catch: java.security.GeneralSecurityException -> L57
            r7 = 1024(0x400, float:1.435E-42)
            r3 = 256(0x100, float:3.59E-43)
            r2.<init>(r6, r5, r7, r3)     // Catch: java.security.GeneralSecurityException -> L57
            javax.crypto.SecretKey r5 = r1.generateSecret(r2)     // Catch: java.security.GeneralSecurityException -> L57
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.GeneralSecurityException -> L57
            byte[] r5 = r5.getEncoded()     // Catch: java.security.GeneralSecurityException -> L57
            java.lang.String r7 = "AES"
            r6.<init>(r5, r7)     // Catch: java.security.GeneralSecurityException -> L57
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.security.GeneralSecurityException -> L57
            r4.mEncryptor = r5     // Catch: java.security.GeneralSecurityException -> L57
            r7 = 1
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch: java.security.GeneralSecurityException -> L57
            byte[] r2 = com.google.android.vending.licensing.AESObfuscator.IV     // Catch: java.security.GeneralSecurityException -> L57
            r1.<init>(r2)     // Catch: java.security.GeneralSecurityException -> L57
            r5.init(r7, r6, r1)     // Catch: java.security.GeneralSecurityException -> L57
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.security.GeneralSecurityException -> L57
            r4.mDecryptor = r5     // Catch: java.security.GeneralSecurityException -> L57
            r7 = 2
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch: java.security.GeneralSecurityException -> L57
            r0.<init>(r2)     // Catch: java.security.GeneralSecurityException -> L57
            r5.init(r7, r6, r0)     // Catch: java.security.GeneralSecurityException -> L57
            return
        L57:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Invalid environment"
            r6.<init>(r7, r5)
            throw r6
    }

    @Override // com.google.android.vending.licensing.Obfuscator
    public java.lang.String obfuscate(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "Invalid environment"
            if (r5 != 0) goto L6
            r5 = 0
            return r5
        L6:
            javax.crypto.Cipher r1 = r4.mEncryptor     // Catch: java.security.GeneralSecurityException -> L2b java.io.UnsupportedEncodingException -> L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.security.GeneralSecurityException -> L2b java.io.UnsupportedEncodingException -> L32
            r2.<init>()     // Catch: java.security.GeneralSecurityException -> L2b java.io.UnsupportedEncodingException -> L32
            java.lang.String r3 = "com.android.vending.licensing.AESObfuscator-1|"
            r2.append(r3)     // Catch: java.security.GeneralSecurityException -> L2b java.io.UnsupportedEncodingException -> L32
            r2.append(r6)     // Catch: java.security.GeneralSecurityException -> L2b java.io.UnsupportedEncodingException -> L32
            r2.append(r5)     // Catch: java.security.GeneralSecurityException -> L2b java.io.UnsupportedEncodingException -> L32
            java.lang.String r5 = r2.toString()     // Catch: java.security.GeneralSecurityException -> L2b java.io.UnsupportedEncodingException -> L32
            java.lang.String r6 = "UTF-8"
            byte[] r5 = r5.getBytes(r6)     // Catch: java.security.GeneralSecurityException -> L2b java.io.UnsupportedEncodingException -> L32
            byte[] r5 = r1.doFinal(r5)     // Catch: java.security.GeneralSecurityException -> L2b java.io.UnsupportedEncodingException -> L32
            java.lang.String r5 = com.google.android.vending.licensing.util.Base64.encode(r5)     // Catch: java.security.GeneralSecurityException -> L2b java.io.UnsupportedEncodingException -> L32
            return r5
        L2b:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r0, r5)
            throw r6
        L32:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r0, r5)
            throw r6
    }

    @Override // com.google.android.vending.licensing.Obfuscator
    public java.lang.String unobfuscate(java.lang.String r5, java.lang.String r6) throws com.google.android.vending.licensing.ValidationException {
            r4 = this;
            java.lang.String r0 = ":"
            if (r5 != 0) goto L6
            r5 = 0
            return r5
        L6:
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            javax.crypto.Cipher r2 = r4.mDecryptor     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            byte[] r3 = com.google.android.vending.licensing.util.Base64.decode(r5)     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            byte[] r2 = r2.doFinal(r3)     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            java.lang.String r3 = "UTF-8"
            r1.<init>(r2, r3)     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            r2.<init>()     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            java.lang.String r3 = "com.android.vending.licensing.AESObfuscator-1|"
            r2.append(r3)     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            r2.append(r6)     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            java.lang.String r2 = r2.toString()     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            int r2 = r1.indexOf(r2)     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            if (r2 != 0) goto L3e
            r2 = 46
            int r6 = r6.length()     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            int r2 = r2 + r6
            int r6 = r1.length()     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            java.lang.String r5 = r1.substring(r2, r6)     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            return r5
        L3e:
            com.google.android.vending.licensing.ValidationException r6 = new com.google.android.vending.licensing.ValidationException     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            r1.<init>()     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            java.lang.String r2 = "Header not found (invalid data or key):"
            r1.append(r2)     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            r1.append(r5)     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            java.lang.String r1 = r1.toString()     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            r6.<init>(r1)     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
            throw r6     // Catch: java.io.UnsupportedEncodingException -> L55 javax.crypto.BadPaddingException -> L5e javax.crypto.IllegalBlockSizeException -> L7b com.google.android.vending.licensing.util.Base64DecoderException -> L98
        L55:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "Invalid environment"
            r6.<init>(r0, r5)
            throw r6
        L5e:
            r6 = move-exception
            com.google.android.vending.licensing.ValidationException r1 = new com.google.android.vending.licensing.ValidationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = r6.getMessage()
            r2.append(r6)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
        L7b:
            r6 = move-exception
            com.google.android.vending.licensing.ValidationException r1 = new com.google.android.vending.licensing.ValidationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = r6.getMessage()
            r2.append(r6)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
        L98:
            r6 = move-exception
            com.google.android.vending.licensing.ValidationException r1 = new com.google.android.vending.licensing.ValidationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = r6.getMessage()
            r2.append(r6)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }
}
