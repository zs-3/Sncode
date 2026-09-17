package org.jcodec.containers.mp4;

/* loaded from: classes2.dex */
public final class Brand {
    public static final org.jcodec.containers.mp4.Brand MOV = null;
    public static final org.jcodec.containers.mp4.Brand MP4 = null;
    private org.jcodec.containers.mp4.boxes.FileTypeBox ftyp;

    static {
            org.jcodec.containers.mp4.Brand r0 = new org.jcodec.containers.mp4.Brand
            java.lang.String r1 = "qt  "
            java.lang.String[] r2 = new java.lang.String[]{r1}
            r3 = 512(0x200, float:7.175E-43)
            r0.<init>(r1, r3, r2)
            org.jcodec.containers.mp4.Brand.MOV = r0
            org.jcodec.containers.mp4.Brand r0 = new org.jcodec.containers.mp4.Brand
            java.lang.String r1 = "isom"
            java.lang.String r2 = "iso2"
            java.lang.String r4 = "avc1"
            java.lang.String r5 = "mp41"
            java.lang.String[] r2 = new java.lang.String[]{r1, r2, r4, r5}
            r0.<init>(r1, r3, r2)
            org.jcodec.containers.mp4.Brand.MP4 = r0
            return
    }

    private Brand(java.lang.String r1, int r2, java.lang.String[] r3) {
            r0 = this;
            r0.<init>()
            java.util.List r3 = java.util.Arrays.asList(r3)
            org.jcodec.containers.mp4.boxes.FileTypeBox r1 = org.jcodec.containers.mp4.boxes.FileTypeBox.createFileTypeBox(r1, r2, r3)
            r0.ftyp = r1
            return
    }

    public org.jcodec.containers.mp4.boxes.FileTypeBox getFileTypeBox() {
            r1 = this;
            org.jcodec.containers.mp4.boxes.FileTypeBox r0 = r1.ftyp
            return r0
    }
}
