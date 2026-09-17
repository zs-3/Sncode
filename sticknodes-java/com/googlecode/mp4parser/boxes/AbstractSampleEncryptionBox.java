package com.googlecode.mp4parser.boxes;

/* loaded from: classes2.dex */
public abstract class AbstractSampleEncryptionBox extends com.googlecode.mp4parser.AbstractFullBox {
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    protected int algorithmId;
    java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> entries;
    protected int ivSize;
    protected byte[] kid;

    static {
            ajc$preClinit()
            return
    }

    protected AbstractSampleEncryptionBox(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = -1
            r0.algorithmId = r1
            r0.ivSize = r1
            r1 = 16
            byte[] r1 = new byte[r1]
            r1 = {x0018: FILL_ARRAY_DATA , data: [-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1} // fill-array
            r0.kid = r1
            java.util.List r1 = java.util.Collections.emptyList()
            r0.entries = r1
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox> r0 = com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox.class
            java.lang.String r1 = "AbstractSampleEncryptionBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getOffsetToFirstIV"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 29
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEntries"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 89
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setEntries"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox"
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "entries"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 93
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "equals"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox"
            java.lang.String r4 = "java.lang.Object"
            java.lang.String r5 = "o"
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 173(0xad, float:2.42E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "hashCode"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 200(0xc8, float:2.8E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEntrySizes"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 208(0xd0, float:2.91E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox.ajc$tjp_5 = r0
            return
    }

    private int getNonEmptyEntriesNum() {
            r3 = this;
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r0 = r3.entries
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto Le
            return r1
        Le:
            java.lang.Object r2 = r0.next()
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r2 = (com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat) r2
            int r2 = r2.getSize()
            if (r2 <= 0) goto L7
            int r1 = r1 + 1
            goto L7
    }

    private java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> parseEntries(java.nio.ByteBuffer r8, long r9, int r11) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            r1 = 1
            long r1 = r9 - r1
            r3 = 0
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 > 0) goto L10
            return r0
        L10:
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r9 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat     // Catch: java.nio.BufferUnderflowException -> L49
            r9.<init>()     // Catch: java.nio.BufferUnderflowException -> L49
            byte[] r10 = new byte[r11]     // Catch: java.nio.BufferUnderflowException -> L49
            r9.iv = r10     // Catch: java.nio.BufferUnderflowException -> L49
            r8.get(r10)     // Catch: java.nio.BufferUnderflowException -> L49
            int r10 = r7.getFlags()     // Catch: java.nio.BufferUnderflowException -> L49
            r10 = r10 & 2
            if (r10 <= 0) goto L44
            int r10 = com.coremedia.iso.IsoTypeReader.readUInt16(r8)     // Catch: java.nio.BufferUnderflowException -> L49
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r10 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair[r10]     // Catch: java.nio.BufferUnderflowException -> L49
            r9.pairs = r10     // Catch: java.nio.BufferUnderflowException -> L49
            r10 = 0
        L2d:
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r3 = r9.pairs     // Catch: java.nio.BufferUnderflowException -> L49
            int r4 = r3.length     // Catch: java.nio.BufferUnderflowException -> L49
            if (r10 < r4) goto L33
            goto L44
        L33:
            int r4 = com.coremedia.iso.IsoTypeReader.readUInt16(r8)     // Catch: java.nio.BufferUnderflowException -> L49
            long r5 = com.coremedia.iso.IsoTypeReader.readUInt32(r8)     // Catch: java.nio.BufferUnderflowException -> L49
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair r4 = r9.createPair(r4, r5)     // Catch: java.nio.BufferUnderflowException -> L49
            r3[r10] = r4     // Catch: java.nio.BufferUnderflowException -> L49
            int r10 = r10 + 1
            goto L2d
        L44:
            r0.add(r9)     // Catch: java.nio.BufferUnderflowException -> L49
            r9 = r1
            goto L5
        L49:
            r8 = 0
            return r8
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r7) {
            r6 = this;
            r6.parseVersionAndFlags(r7)
            int r0 = r6.getFlags()
            r0 = r0 & 1
            r1 = 16
            if (r0 <= 0) goto L20
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt24(r7)
            r6.algorithmId = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r7)
            r6.ivSize = r0
            byte[] r0 = new byte[r1]
            r6.kid = r0
            r7.get(r0)
        L20:
            long r2 = com.coremedia.iso.IsoTypeReader.readUInt32(r7)
            java.nio.ByteBuffer r0 = r7.duplicate()
            java.nio.ByteBuffer r4 = r7.duplicate()
            r5 = 8
            java.util.List r5 = r6.parseEntries(r0, r2, r5)
            r6.entries = r5
            if (r5 != 0) goto L4e
            java.util.List r0 = r6.parseEntries(r4, r2, r1)
            r6.entries = r0
            int r0 = r7.position()
            int r1 = r7.remaining()
            int r0 = r0 + r1
            int r1 = r4.remaining()
            int r0 = r0 - r1
            r7.position(r0)
            goto L5f
        L4e:
            int r1 = r7.position()
            int r2 = r7.remaining()
            int r1 = r1 + r2
            int r0 = r0.remaining()
            int r1 = r1 - r0
            r7.position(r1)
        L5f:
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r7 = r6.entries
            if (r7 == 0) goto L64
            return
        L64:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Cannot parse SampleEncryptionBox"
            r7.<init>(r0)
            throw r7
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r4, r4, r5)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r0 = 1
            if (r4 != r5) goto L11
            return r0
        L11:
            r1 = 0
            if (r5 == 0) goto L4d
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L1f
            goto L4d
        L1f:
            com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox r5 = (com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox) r5
            int r2 = r4.algorithmId
            int r3 = r5.algorithmId
            if (r2 == r3) goto L28
            return r1
        L28:
            int r2 = r4.ivSize
            int r3 = r5.ivSize
            if (r2 == r3) goto L2f
            return r1
        L2f:
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r2 = r4.entries
            if (r2 == 0) goto L3c
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r3 = r5.entries
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L41
            goto L40
        L3c:
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r2 = r5.entries
            if (r2 == 0) goto L41
        L40:
            return r1
        L41:
            byte[] r2 = r4.kid
            byte[] r5 = r5.kid
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 != 0) goto L4c
            return r1
        L4c:
            return r0
        L4d:
            return r1
    }

    @Override // com.googlecode.mp4parser.AbstractBox, com.coremedia.iso.boxes.Box
    public void getBox(java.nio.channels.WritableByteChannel r1) throws java.io.IOException {
            r0 = this;
            super.getBox(r1)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r7) {
            r6 = this;
            r6.writeVersionAndFlags(r7)
            boolean r0 = r6.isOverrideTrackEncryptionBoxParameters()
            if (r0 == 0) goto L18
            int r0 = r6.algorithmId
            com.coremedia.iso.IsoTypeWriter.writeUInt24(r7, r0)
            int r0 = r6.ivSize
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r7, r0)
            byte[] r0 = r6.kid
            r7.put(r0)
        L18:
            int r0 = r6.getNonEmptyEntriesNum()
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r7, r0)
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r0 = r6.entries
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L2d
            return
        L2d:
            java.lang.Object r1 = r0.next()
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r1 = (com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat) r1
            int r2 = r1.getSize()
            if (r2 <= 0) goto L26
            byte[] r2 = r1.iv
            int r3 = r2.length
            r4 = 8
            if (r3 == r4) goto L4e
            int r3 = r2.length
            r4 = 16
            if (r3 != r4) goto L46
            goto L4e
        L46:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "IV must be either 8 or 16 bytes"
            r7.<init>(r0)
            throw r7
        L4e:
            r7.put(r2)
            boolean r2 = r6.isSubSampleEncryption()
            if (r2 == 0) goto L26
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r2 = r1.pairs
            int r2 = r2.length
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r7, r2)
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r1 = r1.pairs
            int r2 = r1.length
            r3 = 0
        L61:
            if (r3 < r2) goto L64
            goto L26
        L64:
            r4 = r1[r3]
            int r5 = r4.clear()
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r7, r5)
            long r4 = r4.encrypted()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r7, r4)
            int r3 = r3 + 1
            goto L61
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r7 = this;
            boolean r0 = r7.isOverrideTrackEncryptionBoxParameters()
            r1 = 4
            if (r0 == 0) goto L10
            r3 = 8
            byte[] r0 = r7.kid
            int r0 = r0.length
            long r5 = (long) r0
            long r3 = r3 + r5
            goto L11
        L10:
            r3 = r1
        L11:
            long r3 = r3 + r1
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r0 = r7.entries
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L1f
            return r3
        L1f:
            java.lang.Object r1 = r0.next()
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r1 = (com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat) r1
            int r1 = r1.getSize()
            long r1 = (long) r1
            long r3 = r3 + r1
            goto L18
    }

    public java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> getEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r0 = r2.entries
            return r0
    }

    public java.util.List<java.lang.Short> getEntrySizes() {
            r5 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r5, r5)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r1 = r5.entries
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r1 = r5.entries
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L25
            return r0
        L25:
            java.lang.Object r2 = r1.next()
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r2 = (com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat) r2
            byte[] r3 = r2.iv
            int r3 = r3.length
            short r3 = (short) r3
            boolean r4 = r5.isSubSampleEncryption()
            if (r4 == 0) goto L3f
            int r3 = r3 + 2
            short r3 = (short) r3
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r2 = r2.pairs
            int r2 = r2.length
            int r2 = r2 * 6
            int r3 = r3 + r2
            short r3 = (short) r3
        L3f:
            java.lang.Short r2 = java.lang.Short.valueOf(r3)
            r0.add(r2)
            goto L1e
    }

    public int getOffsetToFirstIV() {
            r5 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r5, r5)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r5.getSize()
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1d
            r0 = 16
            goto L1f
        L1d:
            r0 = 8
        L1f:
            boolean r1 = r5.isOverrideTrackEncryptionBoxParameters()
            if (r1 == 0) goto L2b
            byte[] r1 = r5.kid
            int r1 = r1.length
            int r1 = r1 + 4
            goto L2c
        L2b:
            r1 = 0
        L2c:
            int r0 = r0 + r1
            int r0 = r0 + 4
            return r0
    }

    public int hashCode() {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r3.algorithmId
            int r0 = r0 * 31
            int r1 = r3.ivSize
            int r0 = r0 + r1
            int r0 = r0 * 31
            byte[] r1 = r3.kid
            r2 = 0
            if (r1 == 0) goto L20
            int r1 = java.util.Arrays.hashCode(r1)
            goto L21
        L20:
            r1 = 0
        L21:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r1 = r3.entries
            if (r1 == 0) goto L2c
            int r2 = r1.hashCode()
        L2c:
            int r0 = r0 + r2
            return r0
    }

    @com.googlecode.mp4parser.annotations.DoNotParseDetail
    protected boolean isOverrideTrackEncryptionBoxParameters() {
            r2 = this;
            int r0 = r2.getFlags()
            r1 = 1
            r0 = r0 & r1
            if (r0 <= 0) goto L9
            return r1
        L9:
            r0 = 0
            return r0
    }

    @com.googlecode.mp4parser.annotations.DoNotParseDetail
    public boolean isSubSampleEncryption() {
            r1 = this;
            int r0 = r1.getFlags()
            r0 = r0 & 2
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public void setEntries(java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.entries = r3
            return
    }

    @com.googlecode.mp4parser.annotations.DoNotParseDetail
    public void setSubSampleEncryption(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            int r2 = r1.getFlags()
            r2 = r2 | 2
            r1.setFlags(r2)
            goto L17
        Lc:
            int r2 = r1.getFlags()
            r0 = 16777213(0xfffffd, float:2.3509883E-38)
            r2 = r2 & r0
            r1.setFlags(r2)
        L17:
            return
    }
}
