package org.fortheloss.sticknodes.animationscreen.modules;

/* loaded from: classes2.dex */
public class AutoCameraBundle implements com.badlogic.gdx.utils.Disposable {
    private org.fortheloss.sticknodes.data.FrameData _frame1;
    private org.fortheloss.sticknodes.data.FrameData _frame2;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule _framesModuleRef;
    private short _interpolationID;
    private com.badlogic.gdx.math.Interpolation _interpolationRef;
    private boolean _isEaseIn;
    private boolean _isEaseOut;

    public AutoCameraBundle(org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1, org.fortheloss.sticknodes.data.FrameData r2, org.fortheloss.sticknodes.data.FrameData r3, boolean r4, boolean r5, short r6) {
            r0 = this;
            r0.<init>()
            r0._framesModuleRef = r1
            r0._frame1 = r2
            r0._frame2 = r3
            r0._isEaseIn = r4
            r0._isEaseOut = r5
            r0._interpolationID = r6
            com.badlogic.gdx.math.Interpolation r1 = determineInterpolationFromID(r6, r4, r5)
            r0._interpolationRef = r1
            return
    }

    public static com.badlogic.gdx.math.Interpolation determineInterpolationFromID(short r1, boolean r2, boolean r3) {
            if (r2 != 0) goto L7
            if (r3 != 0) goto L7
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.linear
            return r1
        L7:
            if (r1 != 0) goto L18
            if (r2 == 0) goto L10
            if (r3 == 0) goto L10
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.sine
            return r1
        L10:
            if (r2 == 0) goto L15
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.sineIn
            return r1
        L15:
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.sineOut
            return r1
        L18:
            r0 = 1
            if (r1 != r0) goto L2a
            if (r2 == 0) goto L22
            if (r3 == 0) goto L22
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.circle
            return r1
        L22:
            if (r2 == 0) goto L27
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.circleIn
            return r1
        L27:
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.circleOut
            return r1
        L2a:
            r0 = 2
            if (r1 != r0) goto L3c
            if (r2 == 0) goto L34
            if (r3 == 0) goto L34
            com.badlogic.gdx.math.Interpolation$Bounce r1 = com.badlogic.gdx.math.Interpolation.bounce
            return r1
        L34:
            if (r2 == 0) goto L39
            com.badlogic.gdx.math.Interpolation$BounceIn r1 = com.badlogic.gdx.math.Interpolation.bounceIn
            return r1
        L39:
            com.badlogic.gdx.math.Interpolation$BounceOut r1 = com.badlogic.gdx.math.Interpolation.bounceOut
            return r1
        L3c:
            r0 = 3
            if (r1 != r0) goto L4e
            if (r2 == 0) goto L46
            if (r3 == 0) goto L46
            com.badlogic.gdx.math.Interpolation$Elastic r1 = com.badlogic.gdx.math.Interpolation.elastic
            return r1
        L46:
            if (r2 == 0) goto L4b
            com.badlogic.gdx.math.Interpolation$ElasticIn r1 = com.badlogic.gdx.math.Interpolation.elasticIn
            return r1
        L4b:
            com.badlogic.gdx.math.Interpolation$ElasticOut r1 = com.badlogic.gdx.math.Interpolation.elasticOut
            return r1
        L4e:
            if (r2 == 0) goto L55
            if (r3 == 0) goto L55
            com.badlogic.gdx.math.Interpolation$Swing r1 = com.badlogic.gdx.math.Interpolation.swing
            return r1
        L55:
            if (r2 == 0) goto L5a
            com.badlogic.gdx.math.Interpolation$SwingIn r1 = com.badlogic.gdx.math.Interpolation.swingIn
            return r1
        L5a:
            com.badlogic.gdx.math.Interpolation$SwingOut r1 = com.badlogic.gdx.math.Interpolation.swingOut
            return r1
    }

    public void apply() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r1._framesModuleRef
            r0.applyAutoCamera(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._framesModuleRef = r0
            r1._frame1 = r0
            r1._frame2 = r0
            r1._interpolationRef = r0
            return
    }

    public void getData(java.util.zip.GZIPOutputStream r3) throws java.io.IOException {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.FrameData r1 = r2._frame1
            int r0 = r0.getFrameIndex(r1)
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.FrameData r1 = r2._frame2
            int r0 = r0.getFrameIndex(r1)
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            boolean r0 = r2._isEaseIn
            r3.write(r0)
            boolean r0 = r2._isEaseOut
            r3.write(r0)
            short r0 = r2._interpolationID
            org.fortheloss.sticknodes.App.writeShortToOutputStream(r0, r3)
            return
    }

    public org.fortheloss.sticknodes.data.FrameData getFrame1() {
            r1 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r1._frame1
            return r0
    }

    public org.fortheloss.sticknodes.data.FrameData getFrame2() {
            r1 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r1._frame2
            return r0
    }

    public com.badlogic.gdx.math.Interpolation getInterpolation() {
            r1 = this;
            com.badlogic.gdx.math.Interpolation r0 = r1._interpolationRef
            return r0
    }

    public short getInterpolationID() {
            r1 = this;
            short r0 = r1._interpolationID
            return r0
    }

    public boolean isEaseIn() {
            r1 = this;
            boolean r0 = r1._isEaseIn
            return r0
    }

    public boolean isEaseOut() {
            r1 = this;
            boolean r0 = r1._isEaseOut
            return r0
    }

    public void setFramesModuleReference(org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1) {
            r0 = this;
            r0._framesModuleRef = r1
            return
    }
}
