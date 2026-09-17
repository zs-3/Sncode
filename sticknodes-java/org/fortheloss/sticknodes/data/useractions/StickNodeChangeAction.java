package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class StickNodeChangeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.data.useractions.StickNodeProperties _afterProperties;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private int _beforeCurve;
    private org.fortheloss.sticknodes.data.useractions.StickNodeProperties _beforeProperties;
    private float _beforeRotation;
    private int _lastChangedProperty;
    private boolean _needsAfterProperties;
    private org.fortheloss.sticknodes.stickfigure.StickNode _stickNodeRef;
    private org.fortheloss.sticknodes.animationscreen.EventActionDragWithLockedNode mEventActionDragWithLockedNode;

    public StickNodeChangeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1._needsAfterProperties = r0
            r0 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r1._beforeCurve = r0
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r1._beforeRotation = r0
            r0 = 0
            r1._lastChangedProperty = r0
            r1._animationScreenRef = r2
            return
    }

    public void addDragEventAction(org.fortheloss.sticknodes.animationscreen.EventActionDragWithLockedNode r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.EventActionDragWithLockedNode r0 = new org.fortheloss.sticknodes.animationscreen.EventActionDragWithLockedNode
            r0.<init>(r2)
            r1.mEventActionDragWithLockedNode = r0
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._animationScreenRef = r0
            r2._stickNodeRef = r0
            org.fortheloss.sticknodes.animationscreen.EventActionDragWithLockedNode r1 = r2.mEventActionDragWithLockedNode
            if (r1 == 0) goto Le
            r1.dispose()
            r2.mEventActionDragWithLockedNode = r0
        Le:
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties r1 = r2._beforeProperties
            if (r1 == 0) goto L17
            r1.dispose()
            r2._beforeProperties = r0
        L17:
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties r1 = r2._afterProperties
            if (r1 == 0) goto L20
            r1.dispose()
            r2._afterProperties = r0
        L20:
            return
    }

    public int getLastChangedProperty() {
            r1 = this;
            int r0 = r1._lastChangedProperty
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.StickNode getStickNode() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._stickNodeRef
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            r0 = 0
            r1.initialize(r2, r0)
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.StickNode r1, float r2, int r3) {
            r0 = this;
            r0._beforeRotation = r2
            r0.initialize(r1, r3)
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.StickNode r3, int r4) {
            r2 = this;
            r2._stickNodeRef = r3
            r2._lastChangedProperty = r4
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties r4 = r2._beforeProperties
            if (r4 != 0) goto L10
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties r4 = new org.fortheloss.sticknodes.data.useractions.StickNodeProperties
            r4.<init>(r3)
            r2._beforeProperties = r4
            goto L13
        L10:
            r4.getProperties(r3)
        L13:
            int r4 = r2._beforeCurve
            r0 = -999999(0xfffffffffff0bdc1, float:NaN)
            if (r4 <= r0) goto L23
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties r0 = r2._beforeProperties
            r0.segmentCurveRadius = r4
            r4 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r2._beforeCurve = r4
        L23:
            float r4 = r2._beforeRotation
            r0 = -915135504(0xffffffffc97423f0, float:-999999.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3f
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties r0 = r2._beforeProperties
            float r1 = r3.getLocalAngle()
            float r3 = r3.getAngle()
            float r1 = r1 - r3
            float r4 = r4 + r1
            r0.localAngle = r4
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2._beforeRotation = r3
        L3f:
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.StickNode r1, int r2, int r3) {
            r0 = this;
            r0._beforeCurve = r2
            r0.initialize(r1, r3)
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.EventActionDragWithLockedNode r0 = r3.mEventActionDragWithLockedNode
            if (r0 == 0) goto L7
            r0.lockAngles()
        L7:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._stickNodeRef
            int r0 = r0.getLimbType()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._stickNodeRef
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties r2 = r3._afterProperties
            r1.setProperties(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._stickNodeRef
            int r1 = r1.getLimbType()
            if (r0 == r1) goto L21
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._stickNodeRef
            r0.polynodeOnSegmentTypeChange()
        L21:
            r0 = 1
            r3._needsAfterProperties = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r3._stickNodeRef
            r1.onUndoRedoNodeAction(r2, r0)
            org.fortheloss.sticknodes.animationscreen.EventActionDragWithLockedNode r0 = r3.mEventActionDragWithLockedNode
            if (r0 == 0) goto L32
            r0.unlockAngles()
        L32:
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.EventActionDragWithLockedNode r0 = r2.mEventActionDragWithLockedNode
            r1 = 0
            if (r0 == 0) goto La
            r0.dispose()
            r2.mEventActionDragWithLockedNode = r1
        La:
            r2._stickNodeRef = r1
            r0 = 0
            r2._lastChangedProperty = r0
            r0 = 1
            r2._needsAfterProperties = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r3 = this;
            boolean r0 = r3._needsAfterProperties
            if (r0 == 0) goto L1a
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties r0 = r3._afterProperties
            if (r0 != 0) goto L12
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties r0 = new org.fortheloss.sticknodes.data.useractions.StickNodeProperties
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._stickNodeRef
            r0.<init>(r1)
            r3._afterProperties = r0
            goto L17
        L12:
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._stickNodeRef
            r0.getProperties(r1)
        L17:
            r0 = 0
            r3._needsAfterProperties = r0
        L1a:
            org.fortheloss.sticknodes.animationscreen.EventActionDragWithLockedNode r0 = r3.mEventActionDragWithLockedNode
            if (r0 == 0) goto L21
            r0.lockAngles()
        L21:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._stickNodeRef
            int r0 = r0.getLimbType()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._stickNodeRef
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties r2 = r3._beforeProperties
            r1.setProperties(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._stickNodeRef
            int r1 = r1.getLimbType()
            if (r0 == r1) goto L3b
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._stickNodeRef
            r0.polynodeOnSegmentTypeChange()
        L3b:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._stickNodeRef
            r2 = 1
            r0.onUndoRedoNodeAction(r1, r2)
            org.fortheloss.sticknodes.animationscreen.EventActionDragWithLockedNode r0 = r3.mEventActionDragWithLockedNode
            if (r0 == 0) goto L4a
            r0.unlockAngles()
        L4a:
            return
    }
}
