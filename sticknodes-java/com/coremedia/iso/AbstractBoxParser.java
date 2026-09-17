package com.coremedia.iso;

/* loaded from: classes.dex */
public abstract class AbstractBoxParser implements com.coremedia.iso.BoxParser {
    private static java.util.logging.Logger LOG;
    java.lang.ThreadLocal<java.nio.ByteBuffer> header;


    static {
            java.lang.Class<com.coremedia.iso.AbstractBoxParser> r0 = com.coremedia.iso.AbstractBoxParser.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.coremedia.iso.AbstractBoxParser.LOG = r0
            return
    }

    public AbstractBoxParser() {
            r1 = this;
            r1.<init>()
            com.coremedia.iso.AbstractBoxParser$1 r0 = new com.coremedia.iso.AbstractBoxParser$1
            r0.<init>(r1)
            r1.header = r0
            return
    }

    public abstract com.coremedia.iso.boxes.Box createBox(java.lang.String r1, byte[] r2, java.lang.String r3);

    @Override // com.coremedia.iso.BoxParser
    public com.coremedia.iso.boxes.Box parseBox(com.googlecode.mp4parser.DataSource r17, com.coremedia.iso.boxes.Container r18) throws java.io.IOException {
            r16 = this;
            r6 = r16
            r1 = r17
            r0 = r18
            long r2 = r17.position()
            java.lang.ThreadLocal<java.nio.ByteBuffer> r4 = r6.header
            java.lang.Object r4 = r4.get()
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            java.nio.Buffer r4 = r4.rewind()
            r5 = 8
            r4.limit(r5)
        L1b:
            java.lang.ThreadLocal<java.nio.ByteBuffer> r4 = r6.header
            java.lang.Object r4 = r4.get()
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r4 = r1.read(r4)
            if (r4 != r5) goto L158
            java.lang.ThreadLocal<java.nio.ByteBuffer> r2 = r6.header
            java.lang.Object r2 = r2.get()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r2.rewind()
            java.lang.ThreadLocal<java.nio.ByteBuffer> r2 = r6.header
            java.lang.Object r2 = r2.get()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            long r2 = com.coremedia.iso.IsoTypeReader.readUInt32(r2)
            r7 = 1
            r4 = 0
            r9 = 8
            int r11 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r11 >= 0) goto L66
            int r11 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r11 <= 0) goto L66
            java.util.logging.Logger r0 = com.coremedia.iso.AbstractBoxParser.LOG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "Plausibility check failed: size < 8 (size = "
            r1.<init>(r5)
            r1.append(r2)
            java.lang.String r2 = "). Stop parsing!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.severe(r1)
            return r4
        L66:
            java.lang.ThreadLocal<java.nio.ByteBuffer> r11 = r6.header
            java.lang.Object r11 = r11.get()
            java.nio.ByteBuffer r11 = (java.nio.ByteBuffer) r11
            java.lang.String r11 = com.coremedia.iso.IsoTypeReader.read4cc(r11)
            r12 = 16
            r14 = 16
            int r15 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r15 != 0) goto La9
            java.lang.ThreadLocal<java.nio.ByteBuffer> r2 = r6.header
            java.lang.Object r2 = r2.get()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r2.limit(r14)
            java.lang.ThreadLocal<java.nio.ByteBuffer> r2 = r6.header
            java.lang.Object r2 = r2.get()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r1.read(r2)
            java.lang.ThreadLocal<java.nio.ByteBuffer> r2 = r6.header
            java.lang.Object r2 = r2.get()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r2.position(r5)
            java.lang.ThreadLocal<java.nio.ByteBuffer> r2 = r6.header
            java.lang.Object r2 = r2.get()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            long r2 = com.coremedia.iso.IsoTypeReader.readUInt64(r2)
            long r2 = r2 - r12
            goto Lba
        La9:
            r7 = 0
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 != 0) goto Lb9
            long r2 = r17.size()
            long r7 = r17.position()
            long r2 = r2 - r7
            goto Lba
        Lb9:
            long r2 = r2 - r9
        Lba:
            java.lang.String r5 = "uuid"
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L124
            java.lang.ThreadLocal<java.nio.ByteBuffer> r4 = r6.header
            java.lang.Object r4 = r4.get()
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            java.lang.ThreadLocal<java.nio.ByteBuffer> r5 = r6.header
            java.lang.Object r5 = r5.get()
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r5 = r5.limit()
            int r5 = r5 + r14
            r4.limit(r5)
            java.lang.ThreadLocal<java.nio.ByteBuffer> r4 = r6.header
            java.lang.Object r4 = r4.get()
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            r1.read(r4)
            byte[] r5 = new byte[r14]
            java.lang.ThreadLocal<java.nio.ByteBuffer> r4 = r6.header
            java.lang.Object r4 = r4.get()
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r4 = r4.position()
            int r4 = r4 - r14
        Lf4:
            java.lang.ThreadLocal<java.nio.ByteBuffer> r7 = r6.header
            java.lang.Object r7 = r7.get()
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            int r7 = r7.position()
            if (r4 < r7) goto L104
            long r2 = r2 - r12
            goto L125
        L104:
            java.lang.ThreadLocal<java.nio.ByteBuffer> r7 = r6.header
            java.lang.Object r7 = r7.get()
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            int r7 = r7.position()
            int r7 = r7 - r14
            int r7 = r4 - r7
            java.lang.ThreadLocal<java.nio.ByteBuffer> r8 = r6.header
            java.lang.Object r8 = r8.get()
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            byte r8 = r8.get(r4)
            r5[r7] = r8
            int r4 = r4 + 1
            goto Lf4
        L124:
            r5 = r4
        L125:
            r3 = r2
            boolean r2 = r0 instanceof com.coremedia.iso.boxes.Box
            if (r2 == 0) goto L132
            r2 = r0
            com.coremedia.iso.boxes.Box r2 = (com.coremedia.iso.boxes.Box) r2
            java.lang.String r2 = r2.getType()
            goto L134
        L132:
            java.lang.String r2 = ""
        L134:
            com.coremedia.iso.boxes.Box r7 = r6.createBox(r11, r5, r2)
            r7.setParent(r0)
            java.lang.ThreadLocal<java.nio.ByteBuffer> r0 = r6.header
            java.lang.Object r0 = r0.get()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r0.rewind()
            java.lang.ThreadLocal<java.nio.ByteBuffer> r0 = r6.header
            java.lang.Object r0 = r0.get()
            r2 = r0
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r0 = r7
            r1 = r17
            r5 = r16
            r0.parse(r1, r2, r3, r5)
            return r7
        L158:
            if (r4 < 0) goto L15c
            goto L1b
        L15c:
            r1.position(r2)
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }
}
