package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class EndianBox extends org.jcodec.containers.mp4.boxes.Box {
    private org.jcodec.containers.mp4.boxes.EndianBox.Endian endian;

    public enum Endian extends java.lang.Enum<org.jcodec.containers.mp4.boxes.EndianBox.Endian> {
        private static final /* synthetic */ org.jcodec.containers.mp4.boxes.EndianBox.Endian[] $VALUES = null;
        public static final org.jcodec.containers.mp4.boxes.EndianBox.Endian BIG_ENDIAN = null;
        public static final org.jcodec.containers.mp4.boxes.EndianBox.Endian LITTLE_ENDIAN = null;

        static {
                org.jcodec.containers.mp4.boxes.EndianBox$Endian r0 = new org.jcodec.containers.mp4.boxes.EndianBox$Endian
                java.lang.String r1 = "LITTLE_ENDIAN"
                r2 = 0
                r0.<init>(r1, r2)
                org.jcodec.containers.mp4.boxes.EndianBox.Endian.LITTLE_ENDIAN = r0
                org.jcodec.containers.mp4.boxes.EndianBox$Endian r1 = new org.jcodec.containers.mp4.boxes.EndianBox$Endian
                java.lang.String r3 = "BIG_ENDIAN"
                r4 = 1
                r1.<init>(r3, r4)
                org.jcodec.containers.mp4.boxes.EndianBox.Endian.BIG_ENDIAN = r1
                r3 = 2
                org.jcodec.containers.mp4.boxes.EndianBox$Endian[] r3 = new org.jcodec.containers.mp4.boxes.EndianBox.Endian[r3]
                r3[r2] = r0
                r3[r4] = r1
                org.jcodec.containers.mp4.boxes.EndianBox.Endian.$VALUES = r3
                return
        }

        Endian(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.jcodec.containers.mp4.boxes.EndianBox.Endian valueOf(java.lang.String r1) {
                java.lang.Class<org.jcodec.containers.mp4.boxes.EndianBox$Endian> r0 = org.jcodec.containers.mp4.boxes.EndianBox.Endian.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.jcodec.containers.mp4.boxes.EndianBox$Endian r1 = (org.jcodec.containers.mp4.boxes.EndianBox.Endian) r1
                return r1
        }

        public static org.jcodec.containers.mp4.boxes.EndianBox.Endian[] values() {
                org.jcodec.containers.mp4.boxes.EndianBox$Endian[] r0 = org.jcodec.containers.mp4.boxes.EndianBox.Endian.$VALUES
                java.lang.Object r0 = r0.clone()
                org.jcodec.containers.mp4.boxes.EndianBox$Endian[] r0 = (org.jcodec.containers.mp4.boxes.EndianBox.Endian[]) r0
                return r0
        }
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "enda"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r3) {
            r2 = this;
            org.jcodec.containers.mp4.boxes.EndianBox$Endian r0 = r2.endian
            org.jcodec.containers.mp4.boxes.EndianBox$Endian r1 = org.jcodec.containers.mp4.boxes.EndianBox.Endian.LITTLE_ENDIAN
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            short r0 = (short) r0
            r3.putShort(r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r5) {
            r4 = this;
            short r5 = r5.getShort()
            long r0 = (long) r5
            r2 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L10
            org.jcodec.containers.mp4.boxes.EndianBox$Endian r5 = org.jcodec.containers.mp4.boxes.EndianBox.Endian.LITTLE_ENDIAN
            r4.endian = r5
            goto L14
        L10:
            org.jcodec.containers.mp4.boxes.EndianBox$Endian r5 = org.jcodec.containers.mp4.boxes.EndianBox.Endian.BIG_ENDIAN
            r4.endian = r5
        L14:
            return
    }
}
