package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class ChannelBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private int channelBitmap;
    private int channelLayout;
    private org.jcodec.containers.mp4.boxes.ChannelBox.ChannelDescription[] descriptions;

    public static class ChannelDescription {
        private int channelFlags;
        private int channelLabel;
        private float[] coordinates;

        public ChannelDescription(int r1, int r2, float[] r3) {
                r0 = this;
                r0.<init>()
                r0.channelLabel = r1
                r0.channelFlags = r2
                r0.coordinates = r3
                return
        }

        public int getChannelFlags() {
                r1 = this;
                int r0 = r1.channelFlags
                return r0
        }

        public int getChannelLabel() {
                r1 = this;
                int r0 = r1.channelLabel
                return r0
        }

        public float[] getCoordinates() {
                r1 = this;
                float[] r0 = r1.coordinates
                return r0
        }
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "chan"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r8) {
            r7 = this;
            super.doWrite(r8)
            int r0 = r7.channelLayout
            r8.putInt(r0)
            int r0 = r7.channelBitmap
            r8.putInt(r0)
            org.jcodec.containers.mp4.boxes.ChannelBox$ChannelDescription[] r0 = r7.descriptions
            int r0 = r0.length
            r8.putInt(r0)
            org.jcodec.containers.mp4.boxes.ChannelBox$ChannelDescription[] r0 = r7.descriptions
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L18:
            if (r3 >= r1) goto L4a
            r4 = r0[r3]
            int r5 = r4.getChannelLabel()
            r8.putInt(r5)
            int r5 = r4.getChannelFlags()
            r8.putInt(r5)
            float[] r5 = r4.getCoordinates()
            r5 = r5[r2]
            r8.putFloat(r5)
            float[] r5 = r4.getCoordinates()
            r6 = 1
            r5 = r5[r6]
            r8.putFloat(r5)
            float[] r4 = r4.getCoordinates()
            r5 = 2
            r4 = r4[r5]
            r8.putFloat(r4)
            int r3 = r3 + 1
            goto L18
        L4a:
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r11) {
            r10 = this;
            super.parse(r11)
            int r0 = r11.getInt()
            r10.channelLayout = r0
            int r0 = r11.getInt()
            r10.channelBitmap = r0
            int r0 = r11.getInt()
            org.jcodec.containers.mp4.boxes.ChannelBox$ChannelDescription[] r1 = new org.jcodec.containers.mp4.boxes.ChannelBox.ChannelDescription[r0]
            r10.descriptions = r1
            r1 = 0
            r2 = 0
        L19:
            if (r2 >= r0) goto L52
            org.jcodec.containers.mp4.boxes.ChannelBox$ChannelDescription[] r3 = r10.descriptions
            org.jcodec.containers.mp4.boxes.ChannelBox$ChannelDescription r4 = new org.jcodec.containers.mp4.boxes.ChannelBox$ChannelDescription
            int r5 = r11.getInt()
            int r6 = r11.getInt()
            r7 = 3
            float[] r7 = new float[r7]
            int r8 = r11.getInt()
            float r8 = java.lang.Float.intBitsToFloat(r8)
            r7[r1] = r8
            int r8 = r11.getInt()
            float r8 = java.lang.Float.intBitsToFloat(r8)
            r9 = 1
            r7[r9] = r8
            r8 = 2
            int r9 = r11.getInt()
            float r9 = java.lang.Float.intBitsToFloat(r9)
            r7[r8] = r9
            r4.<init>(r5, r6, r7)
            r3[r2] = r4
            int r2 = r2 + 1
            goto L19
        L52:
            return
    }
}
