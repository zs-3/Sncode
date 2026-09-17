package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class TrackFragmentBaseMediaDecodeTimeBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private long baseMediaDecodeTime;

    public static java.lang.String fourcc() {
            java.lang.String r0 = "tfdt"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r3) {
            r2 = this;
            super.doWrite(r3)
            byte r0 = r2.version
            if (r0 != 0) goto Le
            long r0 = r2.baseMediaDecodeTime
            int r1 = (int) r0
            r3.putInt(r1)
            goto L16
        Le:
            r1 = 1
            if (r0 != r1) goto L17
            long r0 = r2.baseMediaDecodeTime
            r3.putLong(r0)
        L16:
            return
        L17:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "Unsupported tfdt version"
            r3.<init>(r0)
            throw r3
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r3) {
            r2 = this;
            super.parse(r3)
            byte r0 = r2.version
            if (r0 != 0) goto Lf
            int r3 = r3.getInt()
            long r0 = (long) r3
            r2.baseMediaDecodeTime = r0
            goto L18
        Lf:
            r1 = 1
            if (r0 != r1) goto L19
            long r0 = r3.getLong()
            r2.baseMediaDecodeTime = r0
        L18:
            return
        L19:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "Unsupported tfdt version"
            r3.<init>(r0)
            throw r3
    }
}
