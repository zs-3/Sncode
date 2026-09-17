package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class ConnectorChangeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen mAnimationScreenRef;
    private org.fortheloss.sticknodes.stickfigure.Connector mConnectorRef;
    private int mCurveBefore;
    private int mLastChangedProperty;
    private boolean mNeedsAfterProperties;
    private org.fortheloss.sticknodes.data.useractions.ConnectorProperties mPropertiesAfter;
    private org.fortheloss.sticknodes.data.useractions.ConnectorProperties mPropertiesBefore;

    public ConnectorChangeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mNeedsAfterProperties = r0
            r0 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r1.mCurveBefore = r0
            r0 = 0
            r1.mLastChangedProperty = r0
            r1.mAnimationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2.mAnimationScreenRef = r0
            r2.mConnectorRef = r0
            org.fortheloss.sticknodes.data.useractions.ConnectorProperties r1 = r2.mPropertiesBefore
            if (r1 == 0) goto Le
            r1.dispose()
            r2.mPropertiesBefore = r0
        Le:
            org.fortheloss.sticknodes.data.useractions.ConnectorProperties r1 = r2.mPropertiesAfter
            if (r1 == 0) goto L17
            r1.dispose()
            r2.mPropertiesAfter = r0
        L17:
            return
    }

    public org.fortheloss.sticknodes.stickfigure.Connector getConnector() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.Connector r0 = r1.mConnectorRef
            return r0
    }

    public int getLastChangedProperty() {
            r1 = this;
            int r0 = r1.mLastChangedProperty
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.Connector r2) {
            r1 = this;
            r0 = 0
            r1.initialize(r2, r0)
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.Connector r1, int r2) {
            r0 = this;
            r0.mConnectorRef = r1
            r0.mLastChangedProperty = r2
            org.fortheloss.sticknodes.data.useractions.ConnectorProperties r2 = r0.mPropertiesBefore
            if (r2 != 0) goto L10
            org.fortheloss.sticknodes.data.useractions.ConnectorProperties r2 = new org.fortheloss.sticknodes.data.useractions.ConnectorProperties
            r2.<init>(r1)
            r0.mPropertiesBefore = r2
            goto L13
        L10:
            r2.getProperties(r1)
        L13:
            int r1 = r0.mCurveBefore
            r2 = -999999(0xfffffffffff0bdc1, float:NaN)
            if (r1 <= r2) goto L23
            org.fortheloss.sticknodes.data.useractions.ConnectorProperties r2 = r0.mPropertiesBefore
            r2.segmentCurveRadius = r1
            r1 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r0.mCurveBefore = r1
        L23:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r4 = this;
            org.fortheloss.sticknodes.stickfigure.Connector r0 = r4.mConnectorRef
            int r1 = r0.getLimbType()
            org.fortheloss.sticknodes.stickfigure.Connector r2 = r4.mConnectorRef
            org.fortheloss.sticknodes.data.useractions.ConnectorProperties r3 = r4.mPropertiesAfter
            r2.setProperties(r3)
            int r2 = r0.getLimbType()
            if (r1 == r2) goto L16
            r0.polynodeOnSegmentTypeChange()
        L16:
            r1 = 1
            r4.mNeedsAfterProperties = r1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r4.mAnimationScreenRef
            r2.onUndoRedoNodeAction(r0, r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1.mConnectorRef = r0
            r0 = 1
            r1.mNeedsAfterProperties = r0
            r0 = 0
            r1.mLastChangedProperty = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r4 = this;
            boolean r0 = r4.mNeedsAfterProperties
            if (r0 == 0) goto L1a
            org.fortheloss.sticknodes.data.useractions.ConnectorProperties r0 = r4.mPropertiesAfter
            if (r0 != 0) goto L12
            org.fortheloss.sticknodes.data.useractions.ConnectorProperties r0 = new org.fortheloss.sticknodes.data.useractions.ConnectorProperties
            org.fortheloss.sticknodes.stickfigure.Connector r1 = r4.mConnectorRef
            r0.<init>(r1)
            r4.mPropertiesAfter = r0
            goto L17
        L12:
            org.fortheloss.sticknodes.stickfigure.Connector r1 = r4.mConnectorRef
            r0.getProperties(r1)
        L17:
            r0 = 0
            r4.mNeedsAfterProperties = r0
        L1a:
            org.fortheloss.sticknodes.stickfigure.Connector r0 = r4.mConnectorRef
            int r1 = r0.getLimbType()
            org.fortheloss.sticknodes.stickfigure.Connector r2 = r4.mConnectorRef
            org.fortheloss.sticknodes.data.useractions.ConnectorProperties r3 = r4.mPropertiesBefore
            r2.setProperties(r3)
            int r2 = r0.getLimbType()
            if (r1 == r2) goto L30
            r0.polynodeOnSegmentTypeChange()
        L30:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r4.mAnimationScreenRef
            r2 = 1
            r1.onUndoRedoNodeAction(r0, r2)
            return
    }
}
