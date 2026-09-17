package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

@com.googlecode.mp4parser.boxes.mp4.objectdescriptors.Descriptor(tags = {0})
/* loaded from: classes2.dex */
public abstract class BaseDescriptor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    int sizeBytes;
    int sizeOfInstance;
    int tag;

    static {
            return
    }

    public BaseDescriptor() {
            r0 = this;
            r0.<init>()
            return
    }

    abstract int getContentSize();

    public int getSize() {
            r2 = this;
            int r0 = r2.getContentSize()
            int r1 = r2.getSizeSize()
            int r0 = r0 + r1
            int r0 = r0 + 1
            return r0
    }

    public int getSizeSize() {
            r3 = this;
            int r0 = r3.getContentSize()
            r1 = 0
        L5:
            if (r0 > 0) goto Lc
            int r2 = r3.sizeBytes
            if (r1 < r2) goto Lc
            return r1
        Lc:
            int r0 = r0 >>> 7
            int r1 = r1 + 1
            goto L5
    }

    public int getTag() {
            r1 = this;
            int r0 = r1.tag
            return r0
    }

    public final void parse(int r5, java.nio.ByteBuffer r6) throws java.io.IOException {
            r4 = this;
            r4.tag = r5
            int r5 = com.coremedia.iso.IsoTypeReader.readUInt8(r6)
            r0 = r5 & 127(0x7f, float:1.78E-43)
            r4.sizeOfInstance = r0
            r0 = 1
            r1 = 1
        Lc:
            int r5 = r5 >>> 7
            if (r5 == r0) goto L29
            r4.sizeBytes = r1
            java.nio.ByteBuffer r5 = r6.slice()
            int r0 = r4.sizeOfInstance
            r5.limit(r0)
            r4.parseDetail(r5)
            int r5 = r6.position()
            int r0 = r4.sizeOfInstance
            int r5 = r5 + r0
            r6.position(r5)
            return
        L29:
            int r5 = com.coremedia.iso.IsoTypeReader.readUInt8(r6)
            int r1 = r1 + 1
            int r2 = r4.sizeOfInstance
            int r2 = r2 << 7
            r3 = r5 & 127(0x7f, float:1.78E-43)
            r2 = r2 | r3
            r4.sizeOfInstance = r2
            goto Lc
    }

    public abstract void parseDetail(java.nio.ByteBuffer r1) throws java.io.IOException;

    public abstract java.nio.ByteBuffer serialize();

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BaseDescriptor"
            r0.append(r1)
            java.lang.String r1 = "{tag="
            r0.append(r1)
            int r1 = r2.tag
            r0.append(r1)
            java.lang.String r1 = ", sizeOfInstance="
            r0.append(r1)
            int r1 = r2.sizeOfInstance
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void writeSize(java.nio.ByteBuffer r5, int r6) {
            r4 = this;
            int r0 = r5.position()
            r1 = 0
        L5:
            if (r6 > 0) goto L14
            int r2 = r4.sizeBytes
            if (r1 < r2) goto L14
            int r6 = r4.getSizeSize()
            int r0 = r0 + r6
            r5.position(r0)
            return
        L14:
            int r1 = r1 + 1
            if (r6 <= 0) goto L25
            int r2 = r4.getSizeSize()
            int r2 = r2 + r0
            int r2 = r2 - r1
            r3 = r6 & 127(0x7f, float:1.78E-43)
            byte r3 = (byte) r3
            r5.put(r2, r3)
            goto L30
        L25:
            int r2 = r4.getSizeSize()
            int r2 = r2 + r0
            int r2 = r2 - r1
            r3 = -128(0xffffffffffffff80, float:NaN)
            r5.put(r2, r3)
        L30:
            int r6 = r6 >>> 7
            goto L5
    }
}
