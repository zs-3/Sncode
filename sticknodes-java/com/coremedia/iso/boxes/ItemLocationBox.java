package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class ItemLocationBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "iloc";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_11 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9 = null;
    public int baseOffsetSize;
    public int indexSize;
    public java.util.List<com.coremedia.iso.boxes.ItemLocationBox.Item> items;
    public int lengthSize;
    public int offsetSize;

    public class Extent {
        public long extentIndex;
        public long extentLength;
        public long extentOffset;
        final /* synthetic */ com.coremedia.iso.boxes.ItemLocationBox this$0;

        public Extent(com.coremedia.iso.boxes.ItemLocationBox r1, long r2, long r4, long r6) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.extentOffset = r2
                r0.extentLength = r4
                r0.extentIndex = r6
                return
        }

        public Extent(com.coremedia.iso.boxes.ItemLocationBox r3, java.nio.ByteBuffer r4) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                int r0 = r3.getVersion()
                r1 = 1
                if (r0 != r1) goto L16
                int r0 = r3.indexSize
                if (r0 <= 0) goto L16
                long r0 = com.coremedia.iso.IsoTypeReaderVariable.read(r4, r0)
                r2.extentIndex = r0
            L16:
                int r0 = r3.offsetSize
                long r0 = com.coremedia.iso.IsoTypeReaderVariable.read(r4, r0)
                r2.extentOffset = r0
                int r3 = r3.lengthSize
                long r3 = com.coremedia.iso.IsoTypeReaderVariable.read(r4, r3)
                r2.extentLength = r3
                return
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L30
                java.lang.Class r2 = r7.getClass()
                java.lang.Class r3 = r8.getClass()
                if (r2 == r3) goto L12
                goto L30
            L12:
                com.coremedia.iso.boxes.ItemLocationBox$Extent r8 = (com.coremedia.iso.boxes.ItemLocationBox.Extent) r8
                long r2 = r7.extentIndex
                long r4 = r8.extentIndex
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L1d
                return r1
            L1d:
                long r2 = r7.extentLength
                long r4 = r8.extentLength
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L26
                return r1
            L26:
                long r2 = r7.extentOffset
                long r4 = r8.extentOffset
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 == 0) goto L2f
                return r1
            L2f:
                return r0
            L30:
                return r1
        }

        public void getContent(java.nio.ByteBuffer r4) {
                r3 = this;
                com.coremedia.iso.boxes.ItemLocationBox r0 = r3.this$0
                int r0 = r0.getVersion()
                r1 = 1
                if (r0 != r1) goto L14
                com.coremedia.iso.boxes.ItemLocationBox r0 = r3.this$0
                int r0 = r0.indexSize
                if (r0 <= 0) goto L14
                long r1 = r3.extentIndex
                com.coremedia.iso.IsoTypeWriterVariable.write(r1, r4, r0)
            L14:
                long r0 = r3.extentOffset
                com.coremedia.iso.boxes.ItemLocationBox r2 = r3.this$0
                int r2 = r2.offsetSize
                com.coremedia.iso.IsoTypeWriterVariable.write(r0, r4, r2)
                long r0 = r3.extentLength
                com.coremedia.iso.boxes.ItemLocationBox r2 = r3.this$0
                int r2 = r2.lengthSize
                com.coremedia.iso.IsoTypeWriterVariable.write(r0, r4, r2)
                return
        }

        public int getSize() {
                r3 = this;
                com.coremedia.iso.boxes.ItemLocationBox r0 = r3.this$0
                int r1 = r0.indexSize
                if (r1 <= 0) goto L7
                goto L8
            L7:
                r1 = 0
            L8:
                int r2 = r0.offsetSize
                int r1 = r1 + r2
                int r0 = r0.lengthSize
                int r1 = r1 + r0
                return r1
        }

        public int hashCode() {
                r7 = this;
                long r0 = r7.extentOffset
                r2 = 32
                long r3 = r0 >>> r2
                long r0 = r0 ^ r3
                int r1 = (int) r0
                int r1 = r1 * 31
                long r3 = r7.extentLength
                long r5 = r3 >>> r2
                long r3 = r3 ^ r5
                int r0 = (int) r3
                int r1 = r1 + r0
                int r1 = r1 * 31
                long r3 = r7.extentIndex
                long r5 = r3 >>> r2
                long r2 = r3 ^ r5
                int r0 = (int) r2
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Extent"
                r0.append(r1)
                java.lang.String r1 = "{extentOffset="
                r0.append(r1)
                long r1 = r3.extentOffset
                r0.append(r1)
                java.lang.String r1 = ", extentLength="
                r0.append(r1)
                long r1 = r3.extentLength
                r0.append(r1)
                java.lang.String r1 = ", extentIndex="
                r0.append(r1)
                long r1 = r3.extentIndex
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public class Item {
        public long baseOffset;
        public int constructionMethod;
        public int dataReferenceIndex;
        public java.util.List<com.coremedia.iso.boxes.ItemLocationBox.Extent> extents;
        public int itemId;
        final /* synthetic */ com.coremedia.iso.boxes.ItemLocationBox this$0;

        public Item(com.coremedia.iso.boxes.ItemLocationBox r1, int r2, int r3, int r4, long r5, java.util.List<com.coremedia.iso.boxes.ItemLocationBox.Extent> r7) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.LinkedList r1 = new java.util.LinkedList
                r1.<init>()
                r0.itemId = r2
                r0.constructionMethod = r3
                r0.dataReferenceIndex = r4
                r0.baseOffset = r5
                r0.extents = r7
                return
        }

        public Item(com.coremedia.iso.boxes.ItemLocationBox r5, java.nio.ByteBuffer r6) {
                r4 = this;
                r4.this$0 = r5
                r4.<init>()
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                r4.extents = r0
                int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r6)
                r4.itemId = r0
                int r0 = r5.getVersion()
                r1 = 1
                if (r0 != r1) goto L21
                int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r6)
                r0 = r0 & 15
                r4.constructionMethod = r0
            L21:
                int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r6)
                r4.dataReferenceIndex = r0
                int r0 = r5.baseOffsetSize
                if (r0 <= 0) goto L32
                long r0 = com.coremedia.iso.IsoTypeReaderVariable.read(r6, r0)
                r4.baseOffset = r0
                goto L36
            L32:
                r0 = 0
                r4.baseOffset = r0
            L36:
                int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r6)
                r1 = 0
            L3b:
                if (r1 < r0) goto L3e
                return
            L3e:
                java.util.List<com.coremedia.iso.boxes.ItemLocationBox$Extent> r2 = r4.extents
                com.coremedia.iso.boxes.ItemLocationBox$Extent r3 = new com.coremedia.iso.boxes.ItemLocationBox$Extent
                r3.<init>(r5, r6)
                r2.add(r3)
                int r1 = r1 + 1
                goto L3b
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L43
                java.lang.Class r2 = r7.getClass()
                java.lang.Class r3 = r8.getClass()
                if (r2 == r3) goto L12
                goto L43
            L12:
                com.coremedia.iso.boxes.ItemLocationBox$Item r8 = (com.coremedia.iso.boxes.ItemLocationBox.Item) r8
                long r2 = r7.baseOffset
                long r4 = r8.baseOffset
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L1d
                return r1
            L1d:
                int r2 = r7.constructionMethod
                int r3 = r8.constructionMethod
                if (r2 == r3) goto L24
                return r1
            L24:
                int r2 = r7.dataReferenceIndex
                int r3 = r8.dataReferenceIndex
                if (r2 == r3) goto L2b
                return r1
            L2b:
                int r2 = r7.itemId
                int r3 = r8.itemId
                if (r2 == r3) goto L32
                return r1
            L32:
                java.util.List<com.coremedia.iso.boxes.ItemLocationBox$Extent> r2 = r7.extents
                java.util.List<com.coremedia.iso.boxes.ItemLocationBox$Extent> r8 = r8.extents
                if (r2 == 0) goto L3f
                boolean r8 = r2.equals(r8)
                if (r8 != 0) goto L42
                goto L41
            L3f:
                if (r8 == 0) goto L42
            L41:
                return r1
            L42:
                return r0
            L43:
                return r1
        }

        public void getContent(java.nio.ByteBuffer r4) {
                r3 = this;
                int r0 = r3.itemId
                com.coremedia.iso.IsoTypeWriter.writeUInt16(r4, r0)
                com.coremedia.iso.boxes.ItemLocationBox r0 = r3.this$0
                int r0 = r0.getVersion()
                r1 = 1
                if (r0 != r1) goto L13
                int r0 = r3.constructionMethod
                com.coremedia.iso.IsoTypeWriter.writeUInt16(r4, r0)
            L13:
                int r0 = r3.dataReferenceIndex
                com.coremedia.iso.IsoTypeWriter.writeUInt16(r4, r0)
                com.coremedia.iso.boxes.ItemLocationBox r0 = r3.this$0
                int r0 = r0.baseOffsetSize
                if (r0 <= 0) goto L23
                long r1 = r3.baseOffset
                com.coremedia.iso.IsoTypeWriterVariable.write(r1, r4, r0)
            L23:
                java.util.List<com.coremedia.iso.boxes.ItemLocationBox$Extent> r0 = r3.extents
                int r0 = r0.size()
                com.coremedia.iso.IsoTypeWriter.writeUInt16(r4, r0)
                java.util.List<com.coremedia.iso.boxes.ItemLocationBox$Extent> r0 = r3.extents
                java.util.Iterator r0 = r0.iterator()
            L32:
                boolean r1 = r0.hasNext()
                if (r1 != 0) goto L39
                return
            L39:
                java.lang.Object r1 = r0.next()
                com.coremedia.iso.boxes.ItemLocationBox$Extent r1 = (com.coremedia.iso.boxes.ItemLocationBox.Extent) r1
                r1.getContent(r4)
                goto L32
        }

        public int getSize() {
                r3 = this;
                com.coremedia.iso.boxes.ItemLocationBox r0 = r3.this$0
                int r0 = r0.getVersion()
                r1 = 2
                r2 = 1
                if (r0 != r2) goto Lc
                r0 = 4
                goto Ld
            Lc:
                r0 = 2
            Ld:
                int r0 = r0 + r1
                com.coremedia.iso.boxes.ItemLocationBox r2 = r3.this$0
                int r2 = r2.baseOffsetSize
                int r0 = r0 + r2
                int r0 = r0 + r1
                java.util.List<com.coremedia.iso.boxes.ItemLocationBox$Extent> r1 = r3.extents
                java.util.Iterator r1 = r1.iterator()
            L1a:
                boolean r2 = r1.hasNext()
                if (r2 != 0) goto L21
                return r0
            L21:
                java.lang.Object r2 = r1.next()
                com.coremedia.iso.boxes.ItemLocationBox$Extent r2 = (com.coremedia.iso.boxes.ItemLocationBox.Extent) r2
                int r2 = r2.getSize()
                int r0 = r0 + r2
                goto L1a
        }

        public int hashCode() {
                r5 = this;
                int r0 = r5.itemId
                int r0 = r0 * 31
                int r1 = r5.constructionMethod
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r5.dataReferenceIndex
                int r0 = r0 + r1
                int r0 = r0 * 31
                long r1 = r5.baseOffset
                r3 = 32
                long r3 = r1 >>> r3
                long r1 = r1 ^ r3
                int r2 = (int) r1
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.util.List<com.coremedia.iso.boxes.ItemLocationBox$Extent> r1 = r5.extents
                if (r1 == 0) goto L22
                int r1 = r1.hashCode()
                goto L23
            L22:
                r1 = 0
            L23:
                int r0 = r0 + r1
                return r0
        }

        public void setBaseOffset(long r1) {
                r0 = this;
                r0.baseOffset = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Item{baseOffset="
                r0.<init>(r1)
                long r1 = r3.baseOffset
                r0.append(r1)
                java.lang.String r1 = ", itemId="
                r0.append(r1)
                int r1 = r3.itemId
                r0.append(r1)
                java.lang.String r1 = ", constructionMethod="
                r0.append(r1)
                int r1 = r3.constructionMethod
                r0.append(r1)
                java.lang.String r1 = ", dataReferenceIndex="
                r0.append(r1)
                int r1 = r3.dataReferenceIndex
                r0.append(r1)
                java.lang.String r1 = ", extents="
                r0.append(r1)
                java.util.List<com.coremedia.iso.boxes.ItemLocationBox$Extent> r1 = r3.extents
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            ajc$preClinit()
            return
    }

    public ItemLocationBox() {
            r1 = this;
            java.lang.String r0 = "iloc"
            r1.<init>(r0)
            r0 = 8
            r1.offsetSize = r0
            r1.lengthSize = r0
            r1.baseOffsetSize = r0
            r0 = 0
            r1.indexSize = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.items = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.ItemLocationBox> r0 = com.coremedia.iso.boxes.ItemLocationBox.class
            java.lang.String r1 = "ItemLocationBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getOffsetSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.ItemLocationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 119(0x77, float:1.67E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setOffsetSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.ItemLocationBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "offsetSize"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 123(0x7b, float:1.72E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "createItem"
            java.lang.String r3 = "com.coremedia.iso.boxes.ItemLocationBox"
            java.lang.String r4 = "int:int:int:long:java.util.List"
            java.lang.String r5 = "itemId:constructionMethod:dataReferenceIndex:baseOffset:extents"
            java.lang.String r6 = ""
            java.lang.String r7 = "com.coremedia.iso.boxes.ItemLocationBox$Item"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 160(0xa0, float:2.24E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_10 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "createExtent"
            java.lang.String r3 = "com.coremedia.iso.boxes.ItemLocationBox"
            java.lang.String r4 = "long:long:long"
            java.lang.String r5 = "extentOffset:extentLength:extentIndex"
            java.lang.String r6 = ""
            java.lang.String r7 = "com.coremedia.iso.boxes.ItemLocationBox$Extent"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 285(0x11d, float:4.0E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_11 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getLengthSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.ItemLocationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 127(0x7f, float:1.78E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setLengthSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.ItemLocationBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "lengthSize"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 131(0x83, float:1.84E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getBaseOffsetSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.ItemLocationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 135(0x87, float:1.89E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setBaseOffsetSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.ItemLocationBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "baseOffsetSize"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 139(0x8b, float:1.95E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getIndexSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.ItemLocationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 143(0x8f, float:2.0E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setIndexSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.ItemLocationBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "indexSize"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 147(0x93, float:2.06E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_7 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getItems"
            java.lang.String r3 = "com.coremedia.iso.boxes.ItemLocationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 151(0x97, float:2.12E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_8 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setItems"
            java.lang.String r3 = "com.coremedia.iso.boxes.ItemLocationBox"
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "items"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 155(0x9b, float:2.17E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_9 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r5) {
            r4 = this;
            r4.parseVersionAndFlags(r5)
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r5)
            int r1 = r0 >>> 4
            r4.offsetSize = r1
            r0 = r0 & 15
            r4.lengthSize = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r5)
            int r1 = r0 >>> 4
            r4.baseOffsetSize = r1
            int r1 = r4.getVersion()
            r2 = 1
            if (r1 != r2) goto L22
            r0 = r0 & 15
            r4.indexSize = r0
        L22:
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r5)
            r1 = 0
        L27:
            if (r1 < r0) goto L2a
            return
        L2a:
            java.util.List<com.coremedia.iso.boxes.ItemLocationBox$Item> r2 = r4.items
            com.coremedia.iso.boxes.ItemLocationBox$Item r3 = new com.coremedia.iso.boxes.ItemLocationBox$Item
            r3.<init>(r4, r5)
            r2.add(r3)
            int r1 = r1 + 1
            goto L27
    }

    public com.coremedia.iso.boxes.ItemLocationBox.Extent createExtent(long r13, long r15, long r17) {
            r12 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_11
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r2 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r13)
            r3 = 0
            r1[r3] = r2
            java.lang.Object r2 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r15)
            r3 = 1
            r1[r3] = r2
            java.lang.Object r2 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r17)
            r3 = 2
            r1[r3] = r2
            r2 = r12
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r12, r12, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.coremedia.iso.boxes.ItemLocationBox$Extent r0 = new com.coremedia.iso.boxes.ItemLocationBox$Extent
            r4 = r0
            r5 = r12
            r6 = r13
            r8 = r15
            r10 = r17
            r4.<init>(r5, r6, r8, r10)
            return r0
    }

    com.coremedia.iso.boxes.ItemLocationBox.Extent createExtent(java.nio.ByteBuffer r2) {
            r1 = this;
            com.coremedia.iso.boxes.ItemLocationBox$Extent r0 = new com.coremedia.iso.boxes.ItemLocationBox$Extent
            r0.<init>(r1, r2)
            return r0
    }

    public com.coremedia.iso.boxes.ItemLocationBox.Item createItem(int r12, int r13, int r14, long r15, java.util.List<com.coremedia.iso.boxes.ItemLocationBox.Extent> r17) {
            r11 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_10
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r2 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r12)
            r3 = 0
            r1[r3] = r2
            java.lang.Object r2 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r13)
            r3 = 1
            r1[r3] = r2
            java.lang.Object r2 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r14)
            r3 = 2
            r1[r3] = r2
            java.lang.Object r2 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r15)
            r3 = 3
            r1[r3] = r2
            r2 = 4
            r1[r2] = r17
            r2 = r11
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r11, r11, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.coremedia.iso.boxes.ItemLocationBox$Item r0 = new com.coremedia.iso.boxes.ItemLocationBox$Item
            r3 = r0
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r10 = r17
            r3.<init>(r4, r5, r6, r7, r8, r10)
            return r0
    }

    com.coremedia.iso.boxes.ItemLocationBox.Item createItem(java.nio.ByteBuffer r2) {
            r1 = this;
            com.coremedia.iso.boxes.ItemLocationBox$Item r0 = new com.coremedia.iso.boxes.ItemLocationBox$Item
            r0.<init>(r1, r2)
            return r0
    }

    public int getBaseOffsetSize() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.baseOffsetSize
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.writeVersionAndFlags(r3)
            int r0 = r2.offsetSize
            int r0 = r0 << 4
            int r1 = r2.lengthSize
            r0 = r0 | r1
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r3, r0)
            int r0 = r2.getVersion()
            r1 = 1
            if (r0 != r1) goto L1f
            int r0 = r2.baseOffsetSize
            int r0 = r0 << 4
            int r1 = r2.indexSize
            r0 = r0 | r1
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r3, r0)
            goto L26
        L1f:
            int r0 = r2.baseOffsetSize
            int r0 = r0 << 4
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r3, r0)
        L26:
            java.util.List<com.coremedia.iso.boxes.ItemLocationBox$Item> r0 = r2.items
            int r0 = r0.size()
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r3, r0)
            java.util.List<com.coremedia.iso.boxes.ItemLocationBox$Item> r0 = r2.items
            java.util.Iterator r0 = r0.iterator()
        L35:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L3c
            return
        L3c:
            java.lang.Object r1 = r0.next()
            com.coremedia.iso.boxes.ItemLocationBox$Item r1 = (com.coremedia.iso.boxes.ItemLocationBox.Item) r1
            r1.getContent(r3)
            goto L35
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r5 = this;
            java.util.List<com.coremedia.iso.boxes.ItemLocationBox$Item> r0 = r5.items
            java.util.Iterator r0 = r0.iterator()
            r1 = 8
        L8:
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto Lf
            return r1
        Lf:
            java.lang.Object r3 = r0.next()
            com.coremedia.iso.boxes.ItemLocationBox$Item r3 = (com.coremedia.iso.boxes.ItemLocationBox.Item) r3
            int r3 = r3.getSize()
            long r3 = (long) r3
            long r1 = r1 + r3
            goto L8
    }

    public int getIndexSize() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_6
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.indexSize
            return r0
    }

    public java.util.List<com.coremedia.iso.boxes.ItemLocationBox.Item> getItems() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_8
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.coremedia.iso.boxes.ItemLocationBox$Item> r0 = r2.items
            return r0
    }

    public int getLengthSize() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.lengthSize
            return r0
    }

    public int getOffsetSize() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.offsetSize
            return r0
    }

    public void setBaseOffsetSize(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_5
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.baseOffsetSize = r3
            return
    }

    public void setIndexSize(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_7
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.indexSize = r3
            return
    }

    public void setItems(java.util.List<com.coremedia.iso.boxes.ItemLocationBox.Item> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_9
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.items = r3
            return
    }

    public void setLengthSize(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_3
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.lengthSize = r3
            return
    }

    public void setOffsetSize(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ItemLocationBox.ajc$tjp_1
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.offsetSize = r3
            return
    }
}
