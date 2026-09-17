package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class MediaHeaderBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private long created;
    private long duration;
    private int language;
    private long modified;
    private int quality;
    private int timescale;

    public MediaHeaderBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.MediaHeaderBox createMediaHeaderBox(int r3, long r4, int r6, long r7, long r9, int r11) {
            org.jcodec.containers.mp4.boxes.MediaHeaderBox r0 = new org.jcodec.containers.mp4.boxes.MediaHeaderBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            r0.timescale = r3
            r0.duration = r4
            r0.language = r6
            r0.created = r7
            r0.modified = r9
            r0.quality = r11
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "mdhd"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void doWrite(java.nio.ByteBuffer r3) {
            r2 = this;
            super.doWrite(r3)
            long r0 = r2.created
            int r0 = org.jcodec.containers.mp4.TimeUtil.toMovTime(r0)
            r3.putInt(r0)
            long r0 = r2.modified
            int r0 = org.jcodec.containers.mp4.TimeUtil.toMovTime(r0)
            r3.putInt(r0)
            int r0 = r2.timescale
            r3.putInt(r0)
            long r0 = r2.duration
            int r1 = (int) r0
            r3.putInt(r1)
            int r0 = r2.language
            short r0 = (short) r0
            r3.putShort(r0)
            int r0 = r2.quality
            short r0 = (short) r0
            r3.putShort(r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r3) {
            r2 = this;
            super.parse(r3)
            byte r0 = r2.version
            if (r0 != 0) goto L29
            int r0 = r3.getInt()
            long r0 = org.jcodec.containers.mp4.TimeUtil.fromMovTime(r0)
            r2.created = r0
            int r0 = r3.getInt()
            long r0 = org.jcodec.containers.mp4.TimeUtil.fromMovTime(r0)
            r2.modified = r0
            int r0 = r3.getInt()
            r2.timescale = r0
            int r3 = r3.getInt()
            long r0 = (long) r3
            r2.duration = r0
            goto L4e
        L29:
            r1 = 1
            if (r0 != r1) goto L4f
            long r0 = r3.getLong()
            int r1 = (int) r0
            long r0 = org.jcodec.containers.mp4.TimeUtil.fromMovTime(r1)
            r2.created = r0
            long r0 = r3.getLong()
            int r1 = (int) r0
            long r0 = org.jcodec.containers.mp4.TimeUtil.fromMovTime(r1)
            r2.modified = r0
            int r0 = r3.getInt()
            r2.timescale = r0
            long r0 = r3.getLong()
            r2.duration = r0
        L4e:
            return
        L4f:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "Unsupported version"
            r3.<init>(r0)
            throw r3
    }
}
