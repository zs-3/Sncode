package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class SyncSamplesBox extends org.jcodec.containers.mp4.boxes.FullBox {
    protected int[] syncSamples;

    public SyncSamplesBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.SyncSamplesBox createSyncSamplesBox(int[] r3) {
            org.jcodec.containers.mp4.boxes.SyncSamplesBox r0 = new org.jcodec.containers.mp4.boxes.SyncSamplesBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = "stss"
            r1.<init>(r2)
            r0.<init>(r1)
            r0.syncSamples = r3
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r4) {
            r3 = this;
            super.doWrite(r4)
            int[] r0 = r3.syncSamples
            int r0 = r0.length
            r4.putInt(r0)
            r0 = 0
        La:
            int[] r1 = r3.syncSamples
            int r2 = r1.length
            if (r0 >= r2) goto L17
            r1 = r1[r0]
            r4.putInt(r1)
            int r0 = r0 + 1
            goto La
        L17:
            return
    }

    public int[] getSyncSamples() {
            r1 = this;
            int[] r0 = r1.syncSamples
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r5) {
            r4 = this;
            super.parse(r5)
            int r0 = r5.getInt()
            int[] r1 = new int[r0]
            r4.syncSamples = r1
            r1 = 0
        Lc:
            if (r1 >= r0) goto L19
            int[] r2 = r4.syncSamples
            int r3 = r5.getInt()
            r2[r1] = r3
            int r1 = r1 + 1
            goto Lc
        L19:
            return
    }
}
