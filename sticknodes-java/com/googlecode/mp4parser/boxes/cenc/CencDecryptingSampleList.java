package com.googlecode.mp4parser.boxes.cenc;

/* loaded from: classes2.dex */
public class CencDecryptingSampleList extends java.util.AbstractList<com.googlecode.mp4parser.authoring.Sample> {
    java.lang.String encryptionAlgo;
    com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> keys;
    java.util.List<com.googlecode.mp4parser.authoring.Sample> parent;
    java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> sencInfo;

    public CencDecryptingSampleList(com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> r2, java.util.List<com.googlecode.mp4parser.authoring.Sample> r3, java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            com.googlecode.mp4parser.util.RangeStartMap r0 = new com.googlecode.mp4parser.util.RangeStartMap
            r0.<init>()
            r1.sencInfo = r4
            r1.keys = r2
            r1.parent = r3
            r1.encryptionAlgo = r5
            return
    }

    public CencDecryptingSampleList(javax.crypto.SecretKey r3, java.util.List<com.googlecode.mp4parser.authoring.Sample> r4, java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r5) {
            r2 = this;
            com.googlecode.mp4parser.util.RangeStartMap r0 = new com.googlecode.mp4parser.util.RangeStartMap
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r3)
            java.lang.String r3 = "cenc"
            r2.<init>(r0, r4, r5, r3)
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public com.googlecode.mp4parser.authoring.Sample get(int r11) {
            r10 = this;
            com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> r0 = r10.keys
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto Le2
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r10.parent
            java.lang.Object r0 = r0.get(r11)
            com.googlecode.mp4parser.authoring.Sample r0 = (com.googlecode.mp4parser.authoring.Sample) r0
            java.nio.ByteBuffer r1 = r0.asByteBuffer()
            r1.rewind()
            int r2 = r1.limit()
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r3 = r10.sencInfo
            java.lang.Object r3 = r3.get(r11)
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r3 = (com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat) r3
            com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> r4 = r10.keys
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r11 = r4.get(r11)
            javax.crypto.SecretKey r11 = (javax.crypto.SecretKey) r11
            byte[] r4 = r3.iv
            javax.crypto.Cipher r11 = r10.getCipher(r11, r4)
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r3 = r3.pairs     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            r4 = 0
            if (r3 == 0) goto L94
            int r5 = r3.length     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            if (r5 <= 0) goto L94
            int r5 = r3.length     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
        L46:
            if (r4 < r5) goto L6d
            int r3 = r1.remaining()     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            if (r3 <= 0) goto L65
            java.io.PrintStream r3 = java.lang.System.err     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            java.lang.String r5 = "Decrypted sample but still data remaining: "
            r4.<init>(r5)     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            long r5 = r0.getSize()     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            r4.append(r5)     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            java.lang.String r0 = r4.toString()     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            r3.println(r0)     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
        L65:
            byte[] r11 = r11.doFinal()     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            r2.put(r11)     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            goto Lc8
        L6d:
            r6 = r3[r4]     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            int r7 = r6.clear()     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            long r8 = r6.encrypted()     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            int r6 = com.googlecode.mp4parser.util.CastUtils.l2i(r8)     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            byte[] r7 = new byte[r7]     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            r1.get(r7)     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            r2.put(r7)     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            if (r6 <= 0) goto L91
            byte[] r6 = new byte[r6]     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            r1.get(r6)     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            byte[] r6 = r11.update(r6)     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            r2.put(r6)     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
        L91:
            int r4 = r4 + 1
            goto L46
        L94:
            int r0 = r1.limit()     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            byte[] r3 = new byte[r0]     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            r1.get(r3)     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            java.lang.String r5 = "cbc1"
            java.lang.String r6 = r10.encryptionAlgo     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            boolean r5 = r5.equals(r6)     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            if (r5 == 0) goto Lb7
            int r5 = r0 / 16
            int r5 = r5 * 16
            byte[] r11 = r11.doFinal(r3, r4, r5)     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            r2.put(r11)     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            int r0 = r0 - r5
            r2.put(r3, r5, r0)     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            goto Lc8
        Lb7:
            java.lang.String r0 = "cenc"
            java.lang.String r4 = r10.encryptionAlgo     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            boolean r0 = r0.equals(r4)     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            if (r0 == 0) goto Lc8
            byte[] r11 = r11.doFinal(r3)     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            r2.put(r11)     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
        Lc8:
            r1.rewind()     // Catch: javax.crypto.BadPaddingException -> Ld4 javax.crypto.IllegalBlockSizeException -> Ldb
            r2.rewind()
            com.googlecode.mp4parser.authoring.SampleImpl r11 = new com.googlecode.mp4parser.authoring.SampleImpl
            r11.<init>(r2)
            return r11
        Ld4:
            r11 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r11)
            throw r0
        Ldb:
            r11 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r11)
            throw r0
        Le2:
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r10.parent
            java.lang.Object r11 = r0.get(r11)
            com.googlecode.mp4parser.authoring.Sample r11 = (com.googlecode.mp4parser.authoring.Sample) r11
            return r11
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            com.googlecode.mp4parser.authoring.Sample r1 = r0.get(r1)
            return r1
    }

    javax.crypto.Cipher getCipher(javax.crypto.SecretKey r4, byte[] r5) {
            r3 = this;
            r0 = 16
            byte[] r0 = new byte[r0]
            int r1 = r5.length
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r1)
            java.lang.String r5 = "cenc"
            java.lang.String r1 = r3.encryptionAlgo     // Catch: java.security.InvalidKeyException -> L44 java.security.InvalidAlgorithmParameterException -> L4b javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L59
            boolean r5 = r5.equals(r1)     // Catch: java.security.InvalidKeyException -> L44 java.security.InvalidAlgorithmParameterException -> L4b javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L59
            r1 = 2
            if (r5 == 0) goto L23
            java.lang.String r5 = "AES/CTR/NoPadding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)     // Catch: java.security.InvalidKeyException -> L44 java.security.InvalidAlgorithmParameterException -> L4b javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L59
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec     // Catch: java.security.InvalidKeyException -> L44 java.security.InvalidAlgorithmParameterException -> L4b javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L59
            r2.<init>(r0)     // Catch: java.security.InvalidKeyException -> L44 java.security.InvalidAlgorithmParameterException -> L4b javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L59
            r5.init(r1, r4, r2)     // Catch: java.security.InvalidKeyException -> L44 java.security.InvalidAlgorithmParameterException -> L4b javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L59
            return r5
        L23:
            java.lang.String r5 = "cbc1"
            java.lang.String r2 = r3.encryptionAlgo     // Catch: java.security.InvalidKeyException -> L44 java.security.InvalidAlgorithmParameterException -> L4b javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L59
            boolean r5 = r5.equals(r2)     // Catch: java.security.InvalidKeyException -> L44 java.security.InvalidAlgorithmParameterException -> L4b javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L59
            if (r5 == 0) goto L3c
            java.lang.String r5 = "AES/CBC/NoPadding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)     // Catch: java.security.InvalidKeyException -> L44 java.security.InvalidAlgorithmParameterException -> L4b javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L59
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec     // Catch: java.security.InvalidKeyException -> L44 java.security.InvalidAlgorithmParameterException -> L4b javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L59
            r2.<init>(r0)     // Catch: java.security.InvalidKeyException -> L44 java.security.InvalidAlgorithmParameterException -> L4b javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L59
            r5.init(r1, r4, r2)     // Catch: java.security.InvalidKeyException -> L44 java.security.InvalidAlgorithmParameterException -> L4b javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L59
            return r5
        L3c:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.security.InvalidKeyException -> L44 java.security.InvalidAlgorithmParameterException -> L4b javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L59
            java.lang.String r5 = "Only cenc & cbc1 is supported as encryptionAlgo"
            r4.<init>(r5)     // Catch: java.security.InvalidKeyException -> L44 java.security.InvalidAlgorithmParameterException -> L4b javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L59
            throw r4     // Catch: java.security.InvalidKeyException -> L44 java.security.InvalidAlgorithmParameterException -> L4b javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L59
        L44:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
        L4b:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
        L52:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
        L59:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r1.parent
            int r0 = r0.size()
            return r0
    }
}
