package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class TimecodeSampleEntry extends org.jcodec.containers.mp4.boxes.SampleEntry {
    private static final org.jcodec.containers.mp4.boxes.TimecodeSampleEntry.MyFactory FACTORY = null;
    private int flags;
    private int frameDuration;
    private byte numFrames;
    private int timescale;

    public static class MyFactory extends org.jcodec.containers.mp4.boxes.BoxFactory {
        private java.util.Map<java.lang.String, java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box>> mappings;

        public MyFactory() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mappings = r0
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
            org.jcodec.containers.mp4.boxes.TimecodeSampleEntry$MyFactory r0 = new org.jcodec.containers.mp4.boxes.TimecodeSampleEntry$MyFactory
            r0.<init>()
            org.jcodec.containers.mp4.boxes.TimecodeSampleEntry.FACTORY = r0
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.SampleEntry, org.jcodec.containers.mp4.boxes.NodeBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r2) {
            r1 = this;
            super.doWrite(r2)
            r0 = 0
            r2.putInt(r0)
            int r0 = r1.flags
            r2.putInt(r0)
            int r0 = r1.timescale
            r2.putInt(r0)
            int r0 = r1.frameDuration
            r2.putInt(r0)
            byte r0 = r1.numFrames
            r2.put(r0)
            r0 = -49
            r2.put(r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.SampleEntry, org.jcodec.containers.mp4.boxes.NodeBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r2) {
            r1 = this;
            super.parse(r2)
            r0 = 4
            org.jcodec.common.io.NIOUtils.skip(r2, r0)
            int r0 = r2.getInt()
            r1.flags = r0
            int r0 = r2.getInt()
            r1.timescale = r0
            int r0 = r2.getInt()
            r1.frameDuration = r0
            byte r0 = r2.get()
            r1.numFrames = r0
            r0 = 1
            org.jcodec.common.io.NIOUtils.skip(r2, r0)
            return
    }
}
