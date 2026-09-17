package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class VideoSampleEntry extends org.jcodec.containers.mp4.boxes.SampleEntry {
    private static final org.jcodec.containers.mp4.boxes.VideoSampleEntry.MyFactory FACTORY = null;
    private short clrTbl;
    private java.lang.String compressorName;
    private short depth;
    private short frameCount;
    private float hRes;
    private short height;
    private short revision;
    private int spacialQual;
    private int temporalQual;
    private float vRes;
    private java.lang.String vendor;
    private short version;
    private short width;

    public static class MyFactory extends org.jcodec.containers.mp4.boxes.BoxFactory {
        private java.util.Map<java.lang.String, java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box>> mappings;

        public MyFactory() {
                r3 = this;
                r3.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r3.mappings = r0
                java.lang.String r1 = org.jcodec.containers.mp4.boxes.PixelAspectExt.fourcc()
                java.lang.Class<org.jcodec.containers.mp4.boxes.PixelAspectExt> r2 = org.jcodec.containers.mp4.boxes.PixelAspectExt.class
                r0.put(r1, r2)
                java.util.Map<java.lang.String, java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box>> r0 = r3.mappings
                java.lang.String r1 = org.jcodec.codecs.h264.mp4.AvcCBox.fourcc()
                java.lang.Class<org.jcodec.codecs.h264.mp4.AvcCBox> r2 = org.jcodec.codecs.h264.mp4.AvcCBox.class
                r0.put(r1, r2)
                java.util.Map<java.lang.String, java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box>> r0 = r3.mappings
                java.lang.String r1 = org.jcodec.containers.mp4.boxes.ColorExtension.fourcc()
                java.lang.Class<org.jcodec.containers.mp4.boxes.ColorExtension> r2 = org.jcodec.containers.mp4.boxes.ColorExtension.class
                r0.put(r1, r2)
                java.util.Map<java.lang.String, java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box>> r0 = r3.mappings
                java.lang.String r1 = org.jcodec.containers.mp4.boxes.GamaExtension.fourcc()
                java.lang.Class<org.jcodec.containers.mp4.boxes.GamaExtension> r2 = org.jcodec.containers.mp4.boxes.GamaExtension.class
                r0.put(r1, r2)
                java.util.Map<java.lang.String, java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box>> r0 = r3.mappings
                java.lang.String r1 = org.jcodec.containers.mp4.boxes.CleanApertureExtension.fourcc()
                java.lang.Class<org.jcodec.containers.mp4.boxes.CleanApertureExtension> r2 = org.jcodec.containers.mp4.boxes.CleanApertureExtension.class
                r0.put(r1, r2)
                java.util.Map<java.lang.String, java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box>> r0 = r3.mappings
                java.lang.String r1 = org.jcodec.containers.mp4.boxes.FielExtension.fourcc()
                java.lang.Class<org.jcodec.containers.mp4.boxes.FielExtension> r2 = org.jcodec.containers.mp4.boxes.FielExtension.class
                r0.put(r1, r2)
                return
        }

        @Override // org.jcodec.containers.mp4.boxes.BoxFactory
        public java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box> toClass(java.lang.String r2) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box>> r0 = r1.mappings
                java.lang.Object r2 = r0.get(r2)
                java.lang.Class r2 = (java.lang.Class) r2
                return r2
        }
    }

    static {
            org.jcodec.containers.mp4.boxes.VideoSampleEntry$MyFactory r0 = new org.jcodec.containers.mp4.boxes.VideoSampleEntry$MyFactory
            r0.<init>()
            org.jcodec.containers.mp4.boxes.VideoSampleEntry.FACTORY = r0
            return
    }

    public VideoSampleEntry(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            org.jcodec.containers.mp4.boxes.VideoSampleEntry$MyFactory r1 = org.jcodec.containers.mp4.boxes.VideoSampleEntry.FACTORY
            r0.factory = r1
            return
    }

    public static org.jcodec.containers.mp4.boxes.VideoSampleEntry createVideoSampleEntry(org.jcodec.containers.mp4.boxes.Header r3, short r4, short r5, java.lang.String r6, int r7, int r8, short r9, short r10, long r11, long r13, short r15, java.lang.String r16, short r17, short r18, short r19) {
            org.jcodec.containers.mp4.boxes.VideoSampleEntry r0 = new org.jcodec.containers.mp4.boxes.VideoSampleEntry
            r1 = r3
            r0.<init>(r3)
            r1 = r18
            r0.drefInd = r1
            r1 = r4
            r0.version = r1
            r1 = r5
            r0.revision = r1
            r1 = r6
            r0.vendor = r1
            r1 = r7
            r0.temporalQual = r1
            r1 = r8
            r0.spacialQual = r1
            r1 = r9
            r0.width = r1
            r1 = r10
            r0.height = r1
            r1 = r11
            float r1 = (float) r1
            r0.hRes = r1
            r1 = r13
            float r1 = (float) r1
            r0.vRes = r1
            r1 = r15
            r0.frameCount = r1
            r1 = r16
            r0.compressorName = r1
            r1 = r17
            r0.depth = r1
            r1 = r19
            r0.clrTbl = r1
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.SampleEntry, org.jcodec.containers.mp4.boxes.NodeBox, org.jcodec.containers.mp4.boxes.Box
    public void doWrite(java.nio.ByteBuffer r4) {
            r3 = this;
            super.doWrite(r4)
            short r0 = r3.version
            r4.putShort(r0)
            short r0 = r3.revision
            r4.putShort(r0)
            java.lang.String r0 = r3.vendor
            byte[] r0 = org.jcodec.common.JCodecUtil.asciiString(r0)
            r1 = 0
            r2 = 4
            r4.put(r0, r1, r2)
            int r0 = r3.temporalQual
            r4.putInt(r0)
            int r0 = r3.spacialQual
            r4.putInt(r0)
            short r0 = r3.width
            r4.putShort(r0)
            short r0 = r3.height
            r4.putShort(r0)
            float r0 = r3.hRes
            r2 = 1199570944(0x47800000, float:65536.0)
            float r0 = r0 * r2
            int r0 = (int) r0
            r4.putInt(r0)
            float r0 = r3.vRes
            float r0 = r0 * r2
            int r0 = (int) r0
            r4.putInt(r0)
            r4.putInt(r1)
            short r0 = r3.frameCount
            r4.putShort(r0)
            java.lang.String r0 = r3.compressorName
            r1 = 31
            org.jcodec.common.io.NIOUtils.writePascalStringL(r4, r0, r1)
            short r0 = r3.depth
            r4.putShort(r0)
            short r0 = r3.clrTbl
            r4.putShort(r0)
            r3.writeExtensions(r4)
            return
    }

    public int getHeight() {
            r1 = this;
            short r0 = r1.height
            return r0
    }

    public int getWidth() {
            r1 = this;
            short r0 = r1.width
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.SampleEntry, org.jcodec.containers.mp4.boxes.NodeBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r3) {
            r2 = this;
            super.parse(r3)
            short r0 = r3.getShort()
            r2.version = r0
            short r0 = r3.getShort()
            r2.revision = r0
            r0 = 4
            java.lang.String r0 = org.jcodec.common.io.NIOUtils.readString(r3, r0)
            r2.vendor = r0
            int r0 = r3.getInt()
            r2.temporalQual = r0
            int r0 = r3.getInt()
            r2.spacialQual = r0
            short r0 = r3.getShort()
            r2.width = r0
            short r0 = r3.getShort()
            r2.height = r0
            int r0 = r3.getInt()
            float r0 = (float) r0
            r1 = 1199570944(0x47800000, float:65536.0)
            float r0 = r0 / r1
            r2.hRes = r0
            int r0 = r3.getInt()
            float r0 = (float) r0
            float r0 = r0 / r1
            r2.vRes = r0
            r3.getInt()
            short r0 = r3.getShort()
            r2.frameCount = r0
            r0 = 31
            java.lang.String r0 = org.jcodec.common.io.NIOUtils.readPascalStringL(r3, r0)
            r2.compressorName = r0
            short r0 = r3.getShort()
            r2.depth = r0
            short r0 = r3.getShort()
            r2.clrTbl = r0
            r2.parseExtensions(r3)
            return
    }
}
