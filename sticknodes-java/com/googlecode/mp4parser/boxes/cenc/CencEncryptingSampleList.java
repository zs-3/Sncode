package com.googlecode.mp4parser.boxes.cenc;

/* loaded from: classes2.dex */
public class CencEncryptingSampleList extends java.util.AbstractList<com.googlecode.mp4parser.authoring.Sample> {
    java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> auxiliaryDataFormats;
    com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> ceks;
    javax.crypto.Cipher cipher;
    private final java.lang.String encryptionAlgo;
    java.util.List<com.googlecode.mp4parser.authoring.Sample> parent;

    /* renamed from: com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private class EncryptedSampleImpl implements com.googlecode.mp4parser.authoring.Sample {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final javax.crypto.SecretKey cek;
        private final com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat cencSampleAuxiliaryDataFormat;
        private final javax.crypto.Cipher cipher;
        private final com.googlecode.mp4parser.authoring.Sample clearSample;
        final /* synthetic */ com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList this$0;

        static {
                java.lang.Class<com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList> r0 = com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList.class
                return
        }

        private EncryptedSampleImpl(com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList r1, com.googlecode.mp4parser.authoring.Sample r2, com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r3, javax.crypto.Cipher r4, javax.crypto.SecretKey r5) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.clearSample = r2
                r0.cencSampleAuxiliaryDataFormat = r3
                r0.cipher = r4
                r0.cek = r5
                return
        }

        /* synthetic */ EncryptedSampleImpl(com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList r1, com.googlecode.mp4parser.authoring.Sample r2, com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r3, javax.crypto.Cipher r4, javax.crypto.SecretKey r5, com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList.EncryptedSampleImpl r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // com.googlecode.mp4parser.authoring.Sample
        public java.nio.ByteBuffer asByteBuffer() {
                r11 = this;
                com.googlecode.mp4parser.authoring.Sample r0 = r11.clearSample
                java.nio.ByteBuffer r0 = r0.asByteBuffer()
                java.nio.Buffer r0 = r0.rewind()
                java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
                int r1 = r0.limit()
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
                com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r2 = r11.cencSampleAuxiliaryDataFormat
                com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList r3 = r11.this$0
                byte[] r4 = r2.iv
                javax.crypto.SecretKey r5 = r11.cek
                r3.initCipher(r4, r5)
                com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r2 = r2.pairs     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                r3 = 0
                if (r2 == 0) goto L59
                int r4 = r2.length     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
            L25:
                if (r3 < r4) goto L28
                goto L99
            L28:
                r5 = r2[r3]     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                int r6 = r5.clear()     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                byte[] r6 = new byte[r6]     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                r0.get(r6)     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                r1.put(r6)     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                long r6 = r5.encrypted()     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                r8 = 0
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 <= 0) goto L56
                long r5 = r5.encrypted()     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                int r5 = com.googlecode.mp4parser.util.CastUtils.l2i(r5)     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                byte[] r5 = new byte[r5]     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                r0.get(r5)     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                javax.crypto.Cipher r6 = r11.cipher     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                byte[] r5 = r6.update(r5)     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                r1.put(r5)     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
            L56:
                int r3 = r3 + 1
                goto L25
            L59:
                int r2 = r0.limit()     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                byte[] r4 = new byte[r2]     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                r0.get(r4)     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                java.lang.String r5 = "cbc1"
                com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList r6 = r11.this$0     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                java.lang.String r6 = com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList.access$1(r6)     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                boolean r5 = r5.equals(r6)     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                if (r5 == 0) goto L82
                int r5 = r2 / 16
                int r5 = r5 * 16
                javax.crypto.Cipher r6 = r11.cipher     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                byte[] r3 = r6.doFinal(r4, r3, r5)     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                r1.put(r3)     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                int r2 = r2 - r5
                r1.put(r4, r5, r2)     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                goto L99
            L82:
                java.lang.String r2 = "cenc"
                com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList r3 = r11.this$0     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                java.lang.String r3 = com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList.access$1(r3)     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                boolean r2 = r2.equals(r3)     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                if (r2 == 0) goto L99
                javax.crypto.Cipher r2 = r11.cipher     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                byte[] r2 = r2.doFinal(r4)     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                r1.put(r2)     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
            L99:
                r0.rewind()     // Catch: javax.crypto.BadPaddingException -> La0 javax.crypto.IllegalBlockSizeException -> La7
                r1.rewind()
                return r1
            La0:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            La7:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.googlecode.mp4parser.authoring.Sample
        public long getSize() {
                r2 = this;
                com.googlecode.mp4parser.authoring.Sample r0 = r2.clearSample
                long r0 = r0.getSize()
                return r0
        }

        @Override // com.googlecode.mp4parser.authoring.Sample
        public void writeTo(java.nio.channels.WritableByteChannel r14) throws java.io.IOException {
                r13 = this;
                com.googlecode.mp4parser.authoring.Sample r0 = r13.clearSample
                java.nio.ByteBuffer r0 = r0.asByteBuffer()
                java.nio.Buffer r0 = r0.rewind()
                java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
                com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList r1 = r13.this$0
                com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r2 = r13.cencSampleAuxiliaryDataFormat
                byte[] r2 = r2.iv
                javax.crypto.SecretKey r3 = r13.cek
                r1.initCipher(r2, r3)
                com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r1 = r13.cencSampleAuxiliaryDataFormat     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r1 = r1.pairs     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                r2 = 0
                if (r1 == 0) goto L6b
                int r1 = r1.length     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                if (r1 <= 0) goto L6b
                int r1 = r0.limit()     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                byte[] r1 = new byte[r1]     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                r0.get(r1)     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r3 = r13.cencSampleAuxiliaryDataFormat     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r9 = r3.pairs     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                int r10 = r9.length     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                r3 = 0
            L30:
                if (r2 < r10) goto L3b
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                r14.write(r1)     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                goto Lb7
            L3b:
                r11 = r9[r2]     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                int r4 = r11.clear()     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                int r12 = r3 + r4
                long r3 = r11.encrypted()     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 <= 0) goto L67
                javax.crypto.Cipher r3 = r13.cipher     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                long r4 = r11.encrypted()     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                int r6 = com.googlecode.mp4parser.util.CastUtils.l2i(r4)     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                r4 = r1
                r5 = r12
                r7 = r1
                r8 = r12
                r3.update(r4, r5, r6, r7, r8)     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                long r3 = (long) r12     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                long r5 = r11.encrypted()     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                long r3 = r3 + r5
                int r4 = (int) r3     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                r3 = r4
                goto L68
            L67:
                r3 = r12
            L68:
                int r2 = r2 + 1
                goto L30
            L6b:
                int r1 = r0.limit()     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                byte[] r3 = new byte[r1]     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                r0.get(r3)     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                java.lang.String r4 = "cbc1"
                com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList r5 = r13.this$0     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                java.lang.String r5 = com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList.access$1(r5)     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                boolean r4 = r4.equals(r5)     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                if (r4 == 0) goto L9c
                int r4 = r1 / 16
                int r4 = r4 * 16
                javax.crypto.Cipher r5 = r13.cipher     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                byte[] r2 = r5.doFinal(r3, r2, r4)     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                r14.write(r2)     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                int r1 = r1 - r4
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r3, r4, r1)     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                r14.write(r1)     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                goto Lb7
            L9c:
                java.lang.String r1 = "cenc"
                com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList r2 = r13.this$0     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                java.lang.String r2 = com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList.access$1(r2)     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                boolean r1 = r1.equals(r2)     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                if (r1 == 0) goto Lb7
                javax.crypto.Cipher r1 = r13.cipher     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                byte[] r1 = r1.doFinal(r3)     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                r14.write(r1)     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
            Lb7:
                r0.rewind()     // Catch: javax.crypto.ShortBufferException -> Lbb javax.crypto.BadPaddingException -> Lc2 javax.crypto.IllegalBlockSizeException -> Lc9
                return
            Lbb:
                r14 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r14)
                throw r0
            Lc2:
                r14 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r14)
                throw r0
            Lc9:
                r14 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r14)
                throw r0
        }
    }

    public CencEncryptingSampleList(com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> r2, java.util.List<com.googlecode.mp4parser.authoring.Sample> r3, java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            com.googlecode.mp4parser.util.RangeStartMap r0 = new com.googlecode.mp4parser.util.RangeStartMap
            r0.<init>()
            r1.auxiliaryDataFormats = r4
            r1.ceks = r2
            r1.encryptionAlgo = r5
            r1.parent = r3
            java.lang.String r2 = "cenc"
            boolean r2 = r2.equals(r5)     // Catch: javax.crypto.NoSuchPaddingException -> L3a java.security.NoSuchAlgorithmException -> L41
            if (r2 == 0) goto L21
            java.lang.String r2 = "AES/CTR/NoPadding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch: javax.crypto.NoSuchPaddingException -> L3a java.security.NoSuchAlgorithmException -> L41
            r1.cipher = r2     // Catch: javax.crypto.NoSuchPaddingException -> L3a java.security.NoSuchAlgorithmException -> L41
            goto L31
        L21:
            java.lang.String r2 = "cbc1"
            boolean r2 = r2.equals(r5)     // Catch: javax.crypto.NoSuchPaddingException -> L3a java.security.NoSuchAlgorithmException -> L41
            if (r2 == 0) goto L32
            java.lang.String r2 = "AES/CBC/NoPadding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch: javax.crypto.NoSuchPaddingException -> L3a java.security.NoSuchAlgorithmException -> L41
            r1.cipher = r2     // Catch: javax.crypto.NoSuchPaddingException -> L3a java.security.NoSuchAlgorithmException -> L41
        L31:
            return
        L32:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: javax.crypto.NoSuchPaddingException -> L3a java.security.NoSuchAlgorithmException -> L41
            java.lang.String r3 = "Only cenc & cbc1 is supported as encryptionAlgo"
            r2.<init>(r3)     // Catch: javax.crypto.NoSuchPaddingException -> L3a java.security.NoSuchAlgorithmException -> L41
            throw r2     // Catch: javax.crypto.NoSuchPaddingException -> L3a java.security.NoSuchAlgorithmException -> L41
        L3a:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
        L41:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    public CencEncryptingSampleList(javax.crypto.SecretKey r3, java.util.List<com.googlecode.mp4parser.authoring.Sample> r4, java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r5) {
            r2 = this;
            com.googlecode.mp4parser.util.RangeStartMap r0 = new com.googlecode.mp4parser.util.RangeStartMap
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r3)
            java.lang.String r3 = "cenc"
            r2.<init>(r0, r4, r5, r3)
            return
    }

    static /* synthetic */ java.lang.String access$1(com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList r0) {
            java.lang.String r0 = r0.encryptionAlgo
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public com.googlecode.mp4parser.authoring.Sample get(int r9) {
            r8 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r8.parent
            java.lang.Object r0 = r0.get(r9)
            r3 = r0
            com.googlecode.mp4parser.authoring.Sample r3 = (com.googlecode.mp4parser.authoring.Sample) r3
            com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> r0 = r8.ceks
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L36
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r0 = r8.auxiliaryDataFormats
            java.lang.Object r0 = r0.get(r9)
            r4 = r0
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r4 = (com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat) r4
            com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList$EncryptedSampleImpl r0 = new com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList$EncryptedSampleImpl
            javax.crypto.Cipher r5 = r8.cipher
            com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> r1 = r8.ceks
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r1.get(r9)
            r6 = r9
            javax.crypto.SecretKey r6 = (javax.crypto.SecretKey) r6
            r7 = 0
            r1 = r0
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        L36:
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            com.googlecode.mp4parser.authoring.Sample r1 = r0.get(r1)
            return r1
    }

    protected void initCipher(byte[] r4, javax.crypto.SecretKey r5) {
            r3 = this;
            r0 = 16
            byte[] r0 = new byte[r0]     // Catch: java.security.InvalidKeyException -> L15 java.security.InvalidAlgorithmParameterException -> L1c
            int r1 = r4.length     // Catch: java.security.InvalidKeyException -> L15 java.security.InvalidAlgorithmParameterException -> L1c
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r2, r1)     // Catch: java.security.InvalidKeyException -> L15 java.security.InvalidAlgorithmParameterException -> L1c
            javax.crypto.Cipher r4 = r3.cipher     // Catch: java.security.InvalidKeyException -> L15 java.security.InvalidAlgorithmParameterException -> L1c
            r1 = 1
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec     // Catch: java.security.InvalidKeyException -> L15 java.security.InvalidAlgorithmParameterException -> L1c
            r2.<init>(r0)     // Catch: java.security.InvalidKeyException -> L15 java.security.InvalidAlgorithmParameterException -> L1c
            r4.init(r1, r5, r2)     // Catch: java.security.InvalidKeyException -> L15 java.security.InvalidAlgorithmParameterException -> L1c
            return
        L15:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
        L1c:
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
