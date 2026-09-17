package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public abstract class FramesContainer {
    private org.fortheloss.sticknodes.PlaybackRepeatManager _playbackRepeatManager;
    protected int _uid;
    protected int _uniqueFigureID;
    public int fps;
    public java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> frames;
    public boolean isLoop;
    public int numTweenedFrames;
    public boolean tweeningEnabled;

    public FramesContainer() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.tweeningEnabled = r0
            r1.isLoop = r0
            r1.numTweenedFrames = r0
            r1.fps = r0
            r1._uniqueFigureID = r0
            r0 = -1
            r1._uid = r0
            org.fortheloss.sticknodes.PlaybackRepeatManager r0 = new org.fortheloss.sticknodes.PlaybackRepeatManager
            r0.<init>()
            r1._playbackRepeatManager = r0
            return
    }

    public abstract boolean canAddFigure(org.fortheloss.sticknodes.data.IFrameData r1, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2);

    public abstract boolean canAddFigures(org.fortheloss.sticknodes.data.IFrameData r1, java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2);

    public abstract boolean canAddFrame(org.fortheloss.sticknodes.data.IFrameData r1);

    public abstract boolean canAddFrames(org.fortheloss.sticknodes.data.IFrameData r1, int r2);

    public void convertID(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4, java.util.HashMap<java.lang.Integer, java.lang.Integer> r5) {
            r3 = this;
            int r0 = r4.getID()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r1 = r5.containsKey(r1)
            if (r1 == 0) goto L1d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r5 = r5.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L2f
        L1d:
            int r1 = r3._uniqueFigureID
            int r2 = r1 + 1
            r3._uniqueFigureID = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r5.put(r0, r2)
            r5 = r1
        L2f:
            r4.setID(r5)
            return
    }

    public void convertIDs(org.fortheloss.sticknodes.data.IFrameData r5, java.util.HashMap<java.lang.Integer, java.lang.Integer> r6) {
            r4 = this;
            java.util.ArrayList r0 = r5.getDrawableFigures()
            java.util.ArrayList r5 = r5.getTweenedDrawableFigures()
            int r1 = r0.size()
            int r1 = r1 + (-1)
        Le:
            if (r1 < 0) goto L29
            java.lang.Object r2 = r0.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r4.convertID(r2, r6)
            java.lang.Object r3 = r5.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            int r2 = r2.getID()
            r3.setID(r2)
            int r1 = r1 + (-1)
            goto Le
        L29:
            return
    }

    public int getActualFPS() {
            r4 = this;
            int r0 = r4.fps
            int r1 = r4.numTweenedFrames
            boolean r2 = r4.tweeningEnabled
            if (r2 == 0) goto L17
            int r2 = r1 + 1
            int r2 = r2 * r0
            r3 = 60
            if (r2 <= r3) goto L13
            int r3 = r3 / r0
            int r1 = r3 + (-1)
        L13:
            int r1 = r1 + 1
            int r0 = r0 * r1
        L17:
            return r0
    }

    public int getActualNumTweenedFrames() {
            r4 = this;
            int r0 = r4.numTweenedFrames
            boolean r1 = r4.tweeningEnabled
            if (r1 == 0) goto L13
            int r1 = r4.fps
            int r2 = r0 + 1
            int r2 = r2 * r1
            r3 = 60
            if (r2 <= r3) goto L13
            int r3 = r3 / r1
            int r0 = r3 + (-1)
        L13:
            return r0
    }

    public int getNumFramesForFrameDelay(float r3) {
            r2 = this;
            int r0 = r2.getActualFPS()
            float r0 = (float) r0
            float r0 = r0 * r3
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r3 = (int) r0
            return r3
    }

    public float getPlayTimeSeconds(int r1, int r2) {
            r0 = this;
            int r1 = r0.getTotalFrameCount(r1, r2)
            float r1 = (float) r1
            int r2 = r0.getActualFPS()
            float r2 = (float) r2
            float r1 = r1 / r2
            return r1
    }

    public int getTotalFrameCount(int r13, int r14) {
            r12 = this;
            int r0 = r13 + (-1)
            int r1 = r14 + (-1)
            int r14 = r14 - r13
            r13 = 1
            int r14 = r14 + r13
            boolean r14 = r12.getTweeningActuallyEnabled(r14)
            int r2 = r12.getActualFPS()
            int r3 = r12.getActualNumTweenedFrames()
            boolean r4 = r12.isLoop
            r5 = 0
            if (r4 == 0) goto L25
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r12.frames
            int r4 = r4.size()
            int r4 = r4 - r13
            if (r1 != r4) goto L25
            if (r0 != 0) goto L25
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            org.fortheloss.sticknodes.PlaybackRepeatManager r6 = r12._playbackRepeatManager
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r12.frames
            java.lang.Object r7 = r7.get(r0)
            org.fortheloss.sticknodes.data.IFrameData r7 = (org.fortheloss.sticknodes.data.IFrameData) r7
            r6.prepare(r7, r0)
            r6 = 0
        L34:
            if (r0 > r1) goto Lc9
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r12.frames
            java.lang.Object r7 = r7.get(r0)
            org.fortheloss.sticknodes.data.IFrameData r7 = (org.fortheloss.sticknodes.data.IFrameData) r7
            org.fortheloss.sticknodes.PlaybackRepeatManager r8 = r12._playbackRepeatManager
            r8.calculateNextFrame(r7, r0)
            int r6 = r6 + 1
            org.fortheloss.sticknodes.PlaybackRepeatManager r8 = r12._playbackRepeatManager
            int r8 = r8.getGoBackFrames()
            if (r8 <= 0) goto L5d
            org.fortheloss.sticknodes.PlaybackRepeatManager r8 = r12._playbackRepeatManager
            org.fortheloss.sticknodes.data.FrameData r8 = r8.getLoopingOriginFrame()
            if (r7 != r8) goto L5d
            r8 = r7
            org.fortheloss.sticknodes.data.FrameData r8 = (org.fortheloss.sticknodes.data.FrameData) r8
            boolean r8 = r8.getUseTweenPropertiesDuringRepeating()
            goto L5e
        L5d:
            r8 = 1
        L5e:
            boolean r9 = r7 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r9 == 0) goto L6d
            r10 = r7
            org.fortheloss.sticknodes.data.FrameData r10 = (org.fortheloss.sticknodes.data.FrameData) r10
            boolean r10 = r10.getCameraIsMovingDuringDelay()
            if (r10 == 0) goto L6d
            r10 = 1
            goto L6e
        L6d:
            r10 = 0
        L6e:
            if (r14 == 0) goto L7b
            if (r3 <= 0) goto L73
            goto L79
        L73:
            boolean r11 = r7.getIsUsingSlowMotionTweenedFrames()
            if (r11 == 0) goto L7b
        L79:
            r11 = 1
            goto L7c
        L7b:
            r11 = 0
        L7c:
            if (r10 != 0) goto L9c
            if (r11 == 0) goto L9c
            if (r8 == 0) goto L88
            boolean r10 = r7.isTweened()
            if (r10 == 0) goto L9c
        L88:
            if (r0 != r1) goto L8c
            if (r4 == 0) goto L9c
        L8c:
            if (r8 == 0) goto L9b
            boolean r8 = r7.getIsUsingSlowMotionTweenedFrames()
            if (r8 != 0) goto L95
            goto L9b
        L95:
            int r8 = r7.getSlowMotionTweenedFrames()
            int r6 = r6 + r8
            goto L9c
        L9b:
            int r6 = r6 + r3
        L9c:
            if (r9 == 0) goto Lb8
            org.fortheloss.sticknodes.data.FrameData r7 = (org.fortheloss.sticknodes.data.FrameData) r7
            boolean r8 = r7.isDelayed()
            if (r8 == 0) goto Lb8
            float r7 = r7.getDelaySeconds()
            r8 = 1065353216(0x3f800000, float:1.0)
            float r9 = (float) r2
            float r8 = r8 / r9
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 <= 0) goto Lb8
            int r7 = r12.getNumFramesForFrameDelay(r7)
            int r7 = r7 - r13
            int r6 = r6 + r7
        Lb8:
            org.fortheloss.sticknodes.PlaybackRepeatManager r7 = r12._playbackRepeatManager
            int r7 = r7.getGoBackFrames()
            if (r7 <= 0) goto Lc6
            int r0 = r0 - r7
            int r0 = java.lang.Math.max(r5, r0)
            int r0 = r0 - r13
        Lc6:
            int r0 = r0 + r13
            goto L34
        Lc9:
            return r6
    }

    public boolean getTweeningActuallyEnabled(int r3) {
            r2 = this;
            boolean r0 = r2.tweeningEnabled
            r1 = 1
            if (r0 == 0) goto Le
            if (r3 <= r1) goto Le
            int r3 = r2.fps
            r0 = 30
            if (r3 > r0) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public int getUID() {
            r1 = this;
            int r0 = r1._uid
            return r0
    }

    public int getUniqueFigureID() {
            r1 = this;
            int r0 = r1._uniqueFigureID
            return r0
    }

    public void incrementUniqueFigureID() {
            r1 = this;
            int r0 = r1._uniqueFigureID
            int r0 = r0 + 1
            r1._uniqueFigureID = r0
            return
    }

    public void setUID(int r1) {
            r0 = this;
            r0._uid = r1
            return
    }
}
