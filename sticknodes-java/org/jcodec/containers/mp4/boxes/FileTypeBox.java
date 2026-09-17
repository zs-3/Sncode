package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class FileTypeBox extends org.jcodec.containers.mp4.boxes.Box {
    private java.util.Collection<java.lang.String> compBrands;
    private java.lang.String majorBrand;
    private int minorVersion;

    public FileTypeBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r0.compBrands = r1
            return
    }

    public static org.jcodec.containers.mp4.boxes.FileTypeBox createFileTypeBox(java.lang.String r3, int r4, java.util.Collection<java.lang.String> r5) {
            org.jcodec.containers.mp4.boxes.FileTypeBox r0 = new org.jcodec.containers.mp4.boxes.FileTypeBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            r0.majorBrand = r3
            r0.minorVersion = r4
            r0.compBrands = r5
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "ftyp"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void doWrite(java.nio.ByteBuffer r3) {
            r2 = this;
            java.lang.String r0 = r2.majorBrand
            byte[] r0 = org.jcodec.common.JCodecUtil.asciiString(r0)
            r3.put(r0)
            int r0 = r2.minorVersion
            r3.putInt(r0)
            java.util.Collection<java.lang.String> r0 = r2.compBrands
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            byte[] r1 = org.jcodec.common.JCodecUtil.asciiString(r1)
            r3.put(r1)
            goto L14
        L28:
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = 4
            java.lang.String r1 = org.jcodec.common.io.NIOUtils.readString(r4, r0)
            r3.majorBrand = r1
            int r1 = r4.getInt()
            r3.minorVersion = r1
        Ld:
            boolean r1 = r4.hasRemaining()
            if (r1 == 0) goto L1f
            java.lang.String r1 = org.jcodec.common.io.NIOUtils.readString(r4, r0)
            if (r1 == 0) goto L1f
            java.util.Collection<java.lang.String> r2 = r3.compBrands
            r2.add(r1)
            goto Ld
        L1f:
            return
    }
}
