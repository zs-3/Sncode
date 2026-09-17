package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class LogZoomer implements com.badlogic.gdx.utils.Disposable {
    private int mDefaultNotch;
    private com.badlogic.gdx.input.GestureDetector mGestureDetector;
    private int mInitialNotchTouchDown;
    private com.badlogic.gdx.scenes.scene2d.InputListener mInputListener;
    private com.badlogic.gdx.InputMultiplexer mInputMultiplexerRef;
    private int mMaxNotch;
    private float mMaxZoom;
    private int mMinNotch;
    private float mMinZoom;
    private int mNotch;
    private float mPPI;
    private com.badlogic.gdx.scenes.scene2d.Actor mTargetRef;
    private float mZoom;
    private float mZoomGoal;



    /* renamed from: -$$Nest$fgetmInitialNotchTouchDown, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m174$$Nest$fgetmInitialNotchTouchDown(org.fortheloss.framework.LogZoomer r0) {
            int r0 = r0.mInitialNotchTouchDown
            return r0
    }

    /* renamed from: -$$Nest$fgetmNotch, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m175$$Nest$fgetmNotch(org.fortheloss.framework.LogZoomer r0) {
            int r0 = r0.mNotch
            return r0
    }

    /* renamed from: -$$Nest$fgetmPPI, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m176$$Nest$fgetmPPI(org.fortheloss.framework.LogZoomer r0) {
            float r0 = r0.mPPI
            return r0
    }

    /* renamed from: -$$Nest$fgetmTargetRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.Actor m177$$Nest$fgetmTargetRef(org.fortheloss.framework.LogZoomer r0) {
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.mTargetRef
            return r0
    }

    /* renamed from: -$$Nest$fputmInitialNotchTouchDown, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m178$$Nest$fputmInitialNotchTouchDown(org.fortheloss.framework.LogZoomer r0, int r1) {
            r0.mInitialNotchTouchDown = r1
            return
    }

    /* renamed from: -$$Nest$fputmNotch, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m179$$Nest$fputmNotch(org.fortheloss.framework.LogZoomer r0, int r1) {
            r0.mNotch = r1
            return
    }

    /* renamed from: -$$Nest$mcalculateZoomFromZoomNotch, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m180$$Nest$mcalculateZoomFromZoomNotch(org.fortheloss.framework.LogZoomer r0) {
            r0.calculateZoomFromZoomNotch()
            return
    }

    public LogZoomer(com.badlogic.gdx.scenes.scene2d.Actor r3, com.badlogic.gdx.InputMultiplexer r4, float r5, float r6, int r7) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mPPI = r0
            r2.mZoom = r0
            r2.mZoomGoal = r0
            r1 = 0
            r2.mNotch = r1
            r2.mDefaultNotch = r1
            r2.mInitialNotchTouchDown = r1
            r2.mTargetRef = r3
            r2.mInputMultiplexerRef = r4
            r2.mMinZoom = r5
            r2.mMaxZoom = r6
            r2.mMinNotch = r1
            int r7 = r7 + (-1)
            r2.mMaxNotch = r7
            com.badlogic.gdx.Graphics r3 = com.badlogic.gdx.Gdx.graphics
            float r3 = r3.getPpiY()
            r2.mPPI = r3
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L39
            com.badlogic.gdx.Graphics r3 = com.badlogic.gdx.Gdx.graphics
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r4 = 1051931443(0x3eb33333, float:0.35)
            float r3 = r3 * r4
            r2.mPPI = r3
        L39:
            int r3 = r2.mMinNotch
            float r3 = (float) r3
            int r4 = r2.mMaxNotch
            float r4 = (float) r4
            float r5 = r2.mMinZoom
            double r5 = (double) r5
            double r5 = java.lang.Math.log(r5)
            float r5 = (float) r5
            float r6 = r2.mMaxZoom
            double r6 = (double) r6
            double r6 = java.lang.Math.log(r6)
            float r6 = (float) r6
            float r6 = r6 - r5
            float r4 = r4 - r3
            float r6 = r6 / r4
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = java.lang.Math.log(r0)
            double r4 = (double) r5
            double r0 = r0 - r4
            double r4 = (double) r6
            double r0 = r0 / r4
            double r3 = (double) r3
            double r0 = r0 + r3
            long r3 = java.lang.Math.round(r0)
            int r4 = (int) r3
            r2.mDefaultNotch = r4
            int r3 = r2.mMinNotch
            if (r4 >= r3) goto L6c
            r2.mDefaultNotch = r3
            goto L72
        L6c:
            int r3 = r2.mMaxNotch
            if (r4 <= r3) goto L72
            r2.mDefaultNotch = r3
        L72:
            int r3 = r2.mDefaultNotch
            r2.mNotch = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.mZoom = r3
            r2.mZoomGoal = r3
            r2.initListener()
            return
    }

    private void calculateZoomFromZoomNotch() {
            r5 = this;
            int r0 = r5.mNotch
            int r1 = r5.mDefaultNotch
            if (r0 != r1) goto Lb
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.mZoomGoal = r0
            return
        Lb:
            int r1 = r5.mMinNotch
            if (r0 >= r1) goto L12
            r5.mNotch = r1
            goto L18
        L12:
            int r2 = r5.mMaxNotch
            if (r0 <= r2) goto L18
            r5.mNotch = r2
        L18:
            float r0 = (float) r1
            int r1 = r5.mMaxNotch
            float r1 = (float) r1
            float r2 = r5.mMinZoom
            double r2 = (double) r2
            double r2 = java.lang.Math.log(r2)
            float r2 = (float) r2
            float r3 = r5.mMaxZoom
            double r3 = (double) r3
            double r3 = java.lang.Math.log(r3)
            float r3 = (float) r3
            float r3 = r3 - r2
            float r1 = r1 - r0
            float r3 = r3 / r1
            int r1 = r5.mNotch
            float r1 = (float) r1
            float r1 = r1 - r0
            float r3 = r3 * r1
            float r2 = r2 + r3
            double r0 = (double) r2
            double r0 = java.lang.Math.exp(r0)
            float r0 = (float) r0
            r5.mZoomGoal = r0
            float r1 = r5.mMinZoom
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L47
            r5.mZoomGoal = r1
            goto L4f
        L47:
            float r1 = r5.mMaxZoom
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4f
            r5.mZoomGoal = r1
        L4f:
            float r0 = r5.mZoomGoal
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            float r0 = r0 / r1
            r5.mZoomGoal = r0
            return
    }

    private void initListener() {
            r8 = this;
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.Desktop
            if (r0 != r1) goto L17
            org.fortheloss.framework.LogZoomer$1 r0 = new org.fortheloss.framework.LogZoomer$1
            r0.<init>(r8)
            r8.mInputListener = r0
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r8.mTargetRef
            r1.addListener(r0)
            goto L3f
        L17:
            com.badlogic.gdx.input.GestureDetector r0 = new com.badlogic.gdx.input.GestureDetector
            r3 = 0
            r4 = 1053609165(0x3ecccccd, float:0.4)
            r5 = 1066192077(0x3f8ccccd, float:1.1)
            r6 = 1041865114(0x3e19999a, float:0.15)
            org.fortheloss.framework.LogZoomer$2 r7 = new org.fortheloss.framework.LogZoomer$2
            r7.<init>(r8)
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            r8.mGestureDetector = r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r1
            r0.setTapSquareSize(r2)
            com.badlogic.gdx.InputMultiplexer r0 = r8.mInputMultiplexerRef
            r1 = 0
            com.badlogic.gdx.input.GestureDetector r2 = r8.mGestureDetector
            r0.addProcessor(r1, r2)
        L3f:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            com.badlogic.gdx.input.GestureDetector r0 = r3.mGestureDetector
            r1 = 0
            if (r0 == 0) goto L11
            r0.cancel()
            com.badlogic.gdx.InputMultiplexer r0 = r3.mInputMultiplexerRef
            com.badlogic.gdx.input.GestureDetector r2 = r3.mGestureDetector
            r0.removeProcessor(r2)
            r3.mGestureDetector = r1
        L11:
            com.badlogic.gdx.scenes.scene2d.InputListener r0 = r3.mInputListener
            if (r0 == 0) goto L1c
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r3.mTargetRef
            r2.removeListener(r0)
            r3.mInputListener = r1
        L1c:
            r3.mTargetRef = r1
            return
    }

    public void incrementZoom(int r2) {
            r1 = this;
            int r0 = r1.mNotch
            int r0 = r0 + r2
            r1.mNotch = r0
            int r2 = r1.mMinNotch
            if (r0 >= r2) goto Lc
            r1.mNotch = r2
            goto L12
        Lc:
            int r2 = r1.mMaxNotch
            if (r0 <= r2) goto L12
            r1.mNotch = r2
        L12:
            r1.calculateZoomFromZoomNotch()
            return
    }

    protected void onZoomChanged(float r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public void update(float r5) {
            r4 = this;
            float r0 = r4.mZoom
            float r1 = r4.mZoomGoal
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L47
            float r2 = r4.mMinZoom
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L11
            r4.mZoomGoal = r2
            goto L19
        L11:
            float r2 = r4.mMaxZoom
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L19
            r4.mZoomGoal = r2
        L19:
            float r1 = r4.mZoomGoal
            float r2 = r1 - r0
            float r2 = r2 * r5
            r5 = 1094713344(0x41400000, float:12.0)
            float r2 = r2 * r5
            float r0 = r0 + r2
            r4.mZoom = r0
            float r0 = r0 - r1
            float r5 = java.lang.Math.abs(r0)
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 > 0) goto L42
            float r5 = r4.mZoomGoal
            r0 = 1092616192(0x41200000, float:10.0)
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            float r5 = (float) r5
            float r5 = r5 / r0
            r4.mZoom = r5
            r4.mZoomGoal = r5
        L42:
            float r5 = r4.mZoom
            r4.onZoomChanged(r5)
        L47:
            return
    }
}
