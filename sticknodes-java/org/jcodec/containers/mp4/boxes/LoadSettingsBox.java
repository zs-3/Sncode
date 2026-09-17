package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class LoadSettingsBox extends org.jcodec.containers.mp4.boxes.Box {
    private int defaultHints;
    private int preloadDuration;
    private int preloadFlags;
    private int preloadStartTime;

    public static java.lang.String fourcc() {
            java.lang.String r0 = "load"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r2) {
            r1 = this;
            int r0 = r1.preloadStartTime
            r2.putInt(r0)
            int r0 = r1.preloadDuration
            r2.putInt(r0)
            int r0 = r1.preloadFlags
            r2.putInt(r0)
            int r0 = r1.defaultHints
            r2.putInt(r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r2) {
            r1 = this;
            int r0 = r2.getInt()
            r1.preloadStartTime = r0
            int r0 = r2.getInt()
            r1.preloadDuration = r0
            int r0 = r2.getInt()
            r1.preloadFlags = r0
            int r2 = r2.getInt()
            r1.defaultHints = r2
            return
    }
}
