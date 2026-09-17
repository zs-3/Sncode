package org.fortheloss.sticknodes;

/* loaded from: classes2.dex */
public class PlaybackRepeatManager {
    private int _goBackFrames;
    private int _loopCounter;
    private org.fortheloss.sticknodes.data.FrameData _loopingOriginFrame;

    public PlaybackRepeatManager() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1._goBackFrames = r0
            return
    }

    private boolean isLooping() {
            r1 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r1._loopingOriginFrame
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private void startLoop(org.fortheloss.sticknodes.data.FrameData r1) {
            r0 = this;
            r0._loopingOriginFrame = r1
            r1 = -1
            r0._goBackFrames = r1
            r1 = 0
            r0._loopCounter = r1
            return
    }

    private void stopLoop() {
            r1 = this;
            r0 = 0
            r1._loopingOriginFrame = r0
            r0 = -1
            r1._goBackFrames = r0
            r0 = 0
            r1._loopCounter = r0
            return
    }

    public void calculateNextFrame(org.fortheloss.sticknodes.data.IFrameData r2, int r3) {
            r1 = this;
            r0 = -1
            r1._goBackFrames = r0
            if (r3 > 0) goto L6
            return
        L6:
            boolean r3 = r2 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r3 == 0) goto L44
            org.fortheloss.sticknodes.data.FrameData r2 = (org.fortheloss.sticknodes.data.FrameData) r2
            boolean r3 = r1.isLooping()
            if (r3 == 0) goto L2f
            org.fortheloss.sticknodes.data.FrameData r3 = r1._loopingOriginFrame
            if (r2 != r3) goto L44
            int r3 = r1._loopCounter
            int r0 = r2.getRepeatLoops()
            if (r3 >= r0) goto L2b
            int r2 = r2.getRepeatGoBackFrames()
            r1._goBackFrames = r2
            int r2 = r1._loopCounter
            int r2 = r2 + 1
            r1._loopCounter = r2
            goto L44
        L2b:
            r1.stopLoop()
            goto L44
        L2f:
            boolean r3 = r2.getIsRepeating()
            if (r3 == 0) goto L44
            r1.startLoop(r2)
            int r2 = r2.getRepeatGoBackFrames()
            r1._goBackFrames = r2
            int r2 = r1._loopCounter
            int r2 = r2 + 1
            r1._loopCounter = r2
        L44:
            return
    }

    public int getGoBackFrames() {
            r1 = this;
            int r0 = r1._goBackFrames
            return r0
    }

    public org.fortheloss.sticknodes.data.FrameData getLoopingOriginFrame() {
            r1 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r1._loopingOriginFrame
            return r0
    }

    public void prepare(org.fortheloss.sticknodes.data.IFrameData r1, int r2) {
            r0 = this;
            r0.stopLoop()
            r0.calculateNextFrame(r1, r2)
            return
    }
}
