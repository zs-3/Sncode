package org.fortheloss.sticknodes.animationscreen.qrt;

/* loaded from: classes2.dex */
public class QrtTable extends com.badlogic.gdx.scenes.scene2d.ui.Table implements com.badlogic.gdx.utils.Disposable {
    protected com.badlogic.gdx.scenes.scene2d.ui.Table mBottomTable;
    protected org.fortheloss.sticknodes.animationscreen.AnimationScreen mContextRef;
    protected org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked mDockRef;
    protected com.badlogic.gdx.scenes.scene2d.ui.Table mTopTable;

    protected static class ColorButtonListener extends com.badlogic.gdx.scenes.scene2d.utils.ClickListener {
        private final org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton mColorButton;
        private boolean mDeadzoneComplete;

        public ColorButtonListener(org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mDeadzoneComplete = r0
                r1.mColorButton = r2
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener
        public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3) {
                r0 = this;
                super.clicked(r1, r2, r3)
                org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r1 = r0.mColorButton
                r1.onClick(r2, r3)
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
        public boolean touchDown(com.badlogic.gdx.scenes.scene2d.InputEvent r2, float r3, float r4, int r5, int r6) {
                r1 = this;
                r0 = 0
                if (r5 == 0) goto L4
                return r0
            L4:
                boolean r2 = super.touchDown(r2, r3, r4, r5, r6)
                if (r2 == 0) goto L11
                r1.mDeadzoneComplete = r0
                org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r5 = r1.mColorButton
                r5.onTouchDown(r3, r4)
            L11:
                return r2
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
        public void touchDragged(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4) {
                r0 = this;
                super.touchDragged(r1, r2, r3, r4)
                boolean r1 = r0.mDeadzoneComplete
                if (r1 == 0) goto Ld
                org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r1 = r0.mColorButton
                r1.onTouchDragged(r2, r3)
                goto L2b
            Ld:
                float r1 = r0.getTouchDownX()
                float r2 = r2 - r1
                float r1 = r0.getTouchDownY()
                float r3 = r3 - r1
                float r2 = r2 * r2
                float r3 = r3 * r3
                float r2 = r2 + r3
                r1 = 1137180672(0x43c80000, float:400.0)
                float r3 = org.fortheloss.sticknodes.App.assetScaling
                float r1 = r1 * r3
                float r1 = r1 * r3
                int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r1 <= 0) goto L2b
                r1 = 1
                r0.mDeadzoneComplete = r1
            L2b:
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
        public void touchUp(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4, int r5) {
                r0 = this;
                super.touchUp(r1, r2, r3, r4, r5)
                org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r1 = r0.mColorButton
                r1.onTouchUp(r2, r3)
                r1 = 0
                r0.mDeadzoneComplete = r1
                return
        }
    }

    protected static class DragButtonListener extends com.badlogic.gdx.scenes.scene2d.utils.ClickListener {
        private float angleStart;
        private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButton;
        private float touchDownX;
        private float touchDownY;

        public DragButtonListener(org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2) {
                r1 = this;
                r1.<init>()
                r0 = 2143289344(0x7fc00000, float:NaN)
                r1.angleStart = r0
                r1.mButton = r2
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
        public boolean touchDown(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4, int r5) {
                r0 = this;
                if (r4 == 0) goto L4
                r1 = 0
                return r1
            L4:
                boolean r2 = super.touchDown(r1, r2, r3, r4, r5)
                if (r2 == 0) goto L1a
                float r3 = r1.getStageX()
                r0.touchDownX = r3
                float r1 = r1.getStageY()
                r0.touchDownY = r1
                r1 = 2143289344(0x7fc00000, float:NaN)
                r0.angleStart = r1
            L1a:
                return r2
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
        public void touchDragged(com.badlogic.gdx.scenes.scene2d.InputEvent r6, float r7, float r8, int r9) {
                r5 = this;
                float r0 = r6.getStageX()
                float r1 = r5.touchDownX
                float r0 = r0 - r1
                float r1 = r6.getStageY()
                float r2 = r5.touchDownY
                float r1 = r1 - r2
                float r2 = r0 * r0
                float r3 = r1 * r1
                float r2 = r2 + r3
                float r3 = org.fortheloss.sticknodes.App.assetScaling
                r4 = 1103626240(0x41c80000, float:25.0)
                float r4 = r4 * r3
                float r4 = r4 * r3
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L49
                org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2 = r5.mButton
                float r2 = r2.getOriginY()
                float r2 = r8 - r2
                org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r3 = r5.mButton
                float r3 = r3.getOriginX()
                float r3 = r7 - r3
                float r2 = com.badlogic.gdx.math.MathUtils.atan2(r2, r3)
                r3 = 1113927392(0x42652ee0, float:57.295776)
                float r2 = r2 * r3
                float r3 = r5.angleStart
                boolean r3 = java.lang.Float.isNaN(r3)
                if (r3 == 0) goto L42
                r5.angleStart = r2
            L42:
                org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r3 = r5.mButton
                float r4 = r5.angleStart
                r3.drag(r0, r1, r4, r2)
            L49:
                super.touchDragged(r6, r7, r8, r9)
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
        public void touchUp(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4, int r5) {
                r0 = this;
                super.touchUp(r1, r2, r3, r4, r5)
                int r1 = r0.getTapCount()
                r4 = 2
                if (r1 != r4) goto L10
                org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r0.mButton
                r1.onDoubleTap(r2, r3)
                goto L15
            L10:
                org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r0.mButton
                r1.onTouchUp(r2, r3)
            L15:
                org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r0.mButton
                r1.reset()
                return
        }
    }

    protected static class LongPressListener extends com.badlogic.gdx.scenes.scene2d.utils.ClickListener {
        private final com.badlogic.gdx.utils.Timer.Task longPressTask;
        private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButton;
        private boolean mLongPressIsActive;


        public LongPressListener(org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mLongPressIsActive = r0
                r1.mButton = r2
                org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$LongPressListener$1 r2 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTable$LongPressListener$1
                r2.<init>(r1)
                r1.longPressTask = r2
                return
        }

        public void onLongPress() {
                r1 = this;
                boolean r0 = r1.isPressed()
                if (r0 != 0) goto L7
                return
            L7:
                r0 = 1
                r1.mLongPressIsActive = r0
                org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r0 = r1.mButton
                r0.onLongPress()
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
        public boolean touchDown(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4, int r5) {
                r0 = this;
                if (r4 == 0) goto L4
                r1 = 0
                return r1
            L4:
                boolean r1 = super.touchDown(r1, r2, r3, r4, r5)
                if (r1 == 0) goto L1f
                com.badlogic.gdx.utils.Timer$Task r2 = r0.longPressTask
                boolean r2 = r2.isScheduled()
                if (r2 == 0) goto L17
                com.badlogic.gdx.utils.Timer$Task r2 = r0.longPressTask
                r2.cancel()
            L17:
                com.badlogic.gdx.utils.Timer$Task r2 = r0.longPressTask
                r3 = 1028443341(0x3d4ccccd, float:0.05)
                com.badlogic.gdx.utils.Timer.schedule(r2, r3)
            L1f:
                return r1
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
        public void touchDragged(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4) {
                r0 = this;
                super.touchDragged(r1, r2, r3, r4)
                boolean r1 = r0.mLongPressIsActive
                if (r1 == 0) goto Lc
                org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r0.mButton
                r1.onLongPressDrag(r2, r3)
            Lc:
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
        public void touchUp(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4, int r5) {
                r0 = this;
                super.touchUp(r1, r2, r3, r4, r5)
                com.badlogic.gdx.utils.Timer$Task r1 = r0.longPressTask
                boolean r1 = r1.isScheduled()
                if (r1 == 0) goto L10
                com.badlogic.gdx.utils.Timer$Task r1 = r0.longPressTask
                r1.cancel()
            L10:
                org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r0.mButton
                r1.onTouchUp(r2, r3)
                boolean r1 = r0.mLongPressIsActive
                if (r1 == 0) goto L1e
                org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r0.mButton
                r1.onCancelLongPress()
            L1e:
                r1 = 0
                r0.mLongPressIsActive = r1
                return
        }
    }

    protected static class ToggleListener extends com.badlogic.gdx.scenes.scene2d.utils.ClickListener {
        private final org.fortheloss.sticknodes.animationscreen.qrt.QrtButton mButton;

        public ToggleListener(org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1) {
                r0 = this;
                r0.<init>()
                r0.mButton = r1
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
        public boolean touchDown(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4, int r5) {
                r0 = this;
                if (r4 == 0) goto L4
                r1 = 0
                return r1
            L4:
                boolean r1 = super.touchDown(r1, r2, r3, r4, r5)
                return r1
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
        public void touchUp(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4, int r5) {
                r0 = this;
                super.touchUp(r1, r2, r3, r4, r5)
                org.fortheloss.sticknodes.animationscreen.qrt.QrtButton r1 = r0.mButton
                r1.onTouchUp(r2, r3)
                return
        }
    }

    public QrtTable(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.mContextRef = r1
            r0.mDockRef = r2
            r0.setSize(r3, r4)
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r0.setTouchable(r1)
            r1 = 0
            r0.setTransform(r1)
            r1 = 18
            r0.align(r1)
            return
    }

    private void clearTable(com.badlogic.gdx.scenes.scene2d.ui.Table r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            com.badlogic.gdx.utils.SnapshotArray r0 = r5.getChildren()
            int r1 = r0.size
            int r1 = r1 + (-1)
        Lb:
            if (r1 < 0) goto L2e
            java.lang.Object r2 = r0.get(r1)
            com.badlogic.gdx.scenes.scene2d.Actor r2 = (com.badlogic.gdx.scenes.scene2d.Actor) r2
            boolean r3 = r2 instanceof com.badlogic.gdx.utils.Disposable
            if (r3 == 0) goto L1e
            r3 = r2
            com.badlogic.gdx.utils.Disposable r3 = (com.badlogic.gdx.utils.Disposable) r3
            r3.dispose()
            goto L28
        L1e:
            boolean r3 = r2 instanceof com.badlogic.gdx.scenes.scene2d.ui.Table
            if (r3 == 0) goto L28
            r3 = r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = (com.badlogic.gdx.scenes.scene2d.ui.Table) r3
            r4.clearTable(r3)
        L28:
            r2.clear()
            int r1 = r1 + (-1)
            goto Lb
        L2e:
            r5.clear()
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2.mContextRef = r0
            r2.mDockRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mTopTable
            r2.clearTable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.mBottomTable
            r2.clearTable(r1)
            r2.mTopTable = r0
            r2.mBottomTable = r0
            return
    }

    public void update(java.lang.Object r1) {
            r0 = this;
            return
    }

    public void updateZoomButtonsPadding() {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4.mContextRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r1 = r0.getIsLeftHandMode()
            r2 = 1128792064(0x43480000, float:200.0)
            r3 = 1109393408(0x42200000, float:40.0)
            if (r1 == 0) goto L2d
            boolean r0 = r0.getIsShowingZoomButtons()
            if (r0 == 0) goto L23
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4.mBottomTable
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r1
            float r1 = r1 * r3
            float r2 = r2 + r1
            r0.padLeft(r2)
            goto L49
        L23:
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4.mBottomTable
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r3
            r0.padLeft(r1)
            goto L49
        L2d:
            boolean r0 = r0.getIsShowingZoomButtons()
            if (r0 == 0) goto L40
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4.mBottomTable
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r1
            float r1 = r1 * r3
            float r2 = r2 + r1
            r0.padRight(r2)
            goto L49
        L40:
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4.mBottomTable
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r3
            r0.padRight(r1)
        L49:
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4.mBottomTable
            r0.invalidateHierarchy()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4.mBottomTable
            r0.invalidate()
            r4.validate()
            return
    }
}
