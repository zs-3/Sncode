package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class UserActionPools implements com.badlogic.gdx.utils.Disposable {
    private com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> _pools;













































































    public UserActionPools(org.fortheloss.sticknodes.animationscreen.AnimationScreen r4, int r5) {
            r3 = this;
            r3.<init>()
            com.badlogic.gdx.utils.ObjectMap r0 = new com.badlogic.gdx.utils.ObjectMap
            r0.<init>()
            r3._pools = r0
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ConnectorAddAction> r1 = org.fortheloss.sticknodes.data.useractions.ConnectorAddAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$1 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$1
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ConnectorChangeEndpointAction> r1 = org.fortheloss.sticknodes.data.useractions.ConnectorChangeEndpointAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$2 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$2
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.ConnectorChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$3 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$3
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.RotateAllCamerasAction> r1 = org.fortheloss.sticknodes.data.useractions.RotateAllCamerasAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$4 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$4
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ModifyBranchColorSwapAction> r1 = org.fortheloss.sticknodes.data.useractions.ModifyBranchColorSwapAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$5 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$5
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameAddAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameAddAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$6 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$6
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$7 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$7
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameDelayChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameDelayChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$8 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$8
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameDelaySecondsChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameDelaySecondsChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$9 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$9
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameDeleteAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameDeleteAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$10 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$10
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameSelectionAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameSelectionAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$11 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$11
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PanningAction> r1 = org.fortheloss.sticknodes.data.useractions.PanningAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$12 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$12
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureAddAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureAddAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$13 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$13
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$14 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$14
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$15 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$15
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FigureOrderChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FigureOrderChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$16 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$16
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureRotateAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureRotateAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$17 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$17
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeAddAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeAddAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$18 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$18
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$19 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$19
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeDeleteAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeDeleteAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$20 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$20
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeDeleteOneAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeDeleteOneAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$21 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$21
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeFlipAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$22 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$22
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeOrderChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeOrderChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$23 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$23
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickNodeSplitAction> r1 = org.fortheloss.sticknodes.data.useractions.StickNodeSplitAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$24 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$24
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.TextfieldBoxAddAction> r1 = org.fortheloss.sticknodes.data.useractions.TextfieldBoxAddAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$25 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$25
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.TextfieldBoxDeleteAction> r1 = org.fortheloss.sticknodes.data.useractions.TextfieldBoxDeleteAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$26 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$26
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.TextfieldBoxChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$27 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$27
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameCameraChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$28 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$28
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FigureJoinAction> r1 = org.fortheloss.sticknodes.data.useractions.FigureJoinAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$29 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$29
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FigureUnjoinAction> r1 = org.fortheloss.sticknodes.data.useractions.FigureUnjoinAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$30 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$30
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction> r1 = org.fortheloss.sticknodes.data.useractions.ObjectArrowPixelMoveAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$31 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$31
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillConvertAnchorAction> r1 = org.fortheloss.sticknodes.data.useractions.PolyfillConvertAnchorAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$32 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$32
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillAddPolynodeAction> r1 = org.fortheloss.sticknodes.data.useractions.PolyfillAddPolynodeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$33 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$33
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillRemovePolynodeAction> r1 = org.fortheloss.sticknodes.data.useractions.PolyfillRemovePolynodeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$34 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$34
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillFinishAction> r1 = org.fortheloss.sticknodes.data.useractions.PolyfillFinishAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$35 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$35
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction> r1 = org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$36 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$36
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillEditAction> r1 = org.fortheloss.sticknodes.data.useractions.PolyfillEditAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$37 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$37
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ModifyBranchDialogShownAction> r1 = org.fortheloss.sticknodes.data.useractions.ModifyBranchDialogShownAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$38 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$38
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ModifyBranchDialogHiddenAction> r1 = org.fortheloss.sticknodes.data.useractions.ModifyBranchDialogHiddenAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$39 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$39
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.BranchChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.BranchChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$40 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$40
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.BranchOrderChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.BranchOrderChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$41 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$41
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.AutoCameraAddAction> r1 = org.fortheloss.sticknodes.data.useractions.AutoCameraAddAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$42 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$42
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.AutoCameraDeleteAction> r1 = org.fortheloss.sticknodes.data.useractions.AutoCameraDeleteAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$43 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$43
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.AddCameraFigureLockAction> r1 = org.fortheloss.sticknodes.data.useractions.AddCameraFigureLockAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$44 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$44
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.RemoveCameraFigureLockAction> r1 = org.fortheloss.sticknodes.data.useractions.RemoveCameraFigureLockAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$45 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$45
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ModifyCameraStickfigureLockAction> r1 = org.fortheloss.sticknodes.data.useractions.ModifyCameraStickfigureLockAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$46 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$46
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction> r1 = org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$47 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$47
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameStickfigureOrderSetAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameStickfigureOrderSetAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$48 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$48
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$49 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$49
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCNodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCNodeChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$50 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$50
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceFlipAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceFlipAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$51 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$51
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferencePlaymodeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferencePlaymodeChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$52 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$52
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferencePlayDuringDelayChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferencePlayDuringDelayChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$53 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$53
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceStartFrameChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceStartFrameChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$54 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$54
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceAddAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceAddAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$55 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$55
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferencePasteAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferencePasteAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$56 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$56
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceDeleteAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceDeleteAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$57 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$57
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCReferenceBreakApartAction> r1 = org.fortheloss.sticknodes.data.useractions.MCReferenceBreakApartAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$58 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$58
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MovieclipScreenEnterAction> r1 = org.fortheloss.sticknodes.data.useractions.MovieclipScreenEnterAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$59 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$59
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MovieclipScreenExitAction> r1 = org.fortheloss.sticknodes.data.useractions.MovieclipScreenExitAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$60 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$60
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MCSetRotationAction> r1 = org.fortheloss.sticknodes.data.useractions.MCSetRotationAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$61 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$61
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.AddTweenedFrameAction> r1 = org.fortheloss.sticknodes.data.useractions.AddTweenedFrameAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$62 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$62
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureAndJoinsDeleteAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureAndJoinsDeleteAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$63 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$63
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureAndJoinsPasteAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureAndJoinsPasteAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$64 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$64
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PasteAffectingNextFrameMCsAction> r1 = org.fortheloss.sticknodes.data.useractions.PasteAffectingNextFrameMCsAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$65 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$65
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.AddCameraTextfieldLockAction> r1 = org.fortheloss.sticknodes.data.useractions.AddCameraTextfieldLockAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$66 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$66
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.RemoveCameraTextfieldLockAction> r1 = org.fortheloss.sticknodes.data.useractions.RemoveCameraTextfieldLockAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$67 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$67
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ReplaceCameraFigureLocksAction> r1 = org.fortheloss.sticknodes.data.useractions.ReplaceCameraFigureLocksAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$68 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$68
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillRecreationAction> r1 = org.fortheloss.sticknodes.data.useractions.PolyfillRecreationAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$69 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$69
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$70 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$70
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteAddAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteAddAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$71 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$71
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.SpriteDeleteAction> r1 = org.fortheloss.sticknodes.data.useractions.SpriteDeleteAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$72 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$72
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$73 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$73
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureJoinsStateChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.StickfigureJoinsStateChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$74 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$74
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.FrameCameraModeChangeAction> r1 = org.fortheloss.sticknodes.data.useractions.FrameCameraModeChangeAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$75 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$75
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillReorderPolynodesAction> r1 = org.fortheloss.sticknodes.data.useractions.PolyfillReorderPolynodesAction.class
            org.fortheloss.sticknodes.data.useractions.UserActionPools$76 r2 = new org.fortheloss.sticknodes.data.useractions.UserActionPools$76
            r2.<init>(r3, r5, r5, r4)
            r0.put(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r4._pools
            if (r0 == 0) goto L29
            com.badlogic.gdx.utils.ObjectMap$Entries r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext
            if (r1 == 0) goto L26
            com.badlogic.gdx.utils.ObjectMap$Entry r1 = r0.next()
            V r1 = r1.value
            com.badlogic.gdx.utils.Pool r1 = (com.badlogic.gdx.utils.Pool) r1
            int r2 = r1.getFree()
        L18:
            if (r2 <= 0) goto L8
            java.lang.Object r3 = r1.obtain()
            com.badlogic.gdx.utils.Disposable r3 = (com.badlogic.gdx.utils.Disposable) r3
            r3.dispose()
            int r2 = r2 + (-1)
            goto L18
        L26:
            r0 = 0
            r4._pools = r0
        L29:
            return
    }

    public <T> com.badlogic.gdx.utils.Pool<T> getPool(java.lang.Class<T> r2) {
            r1 = this;
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r1._pools
            java.lang.Object r2 = r0.get(r2)
            com.badlogic.gdx.utils.Pool r2 = (com.badlogic.gdx.utils.Pool) r2
            return r2
    }

    public void repool(org.fortheloss.sticknodes.data.useractions.UserAction r4) {
            r3 = this;
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Pool> r0 = r3._pools
            java.lang.Class r1 = r4.getClass()
            java.lang.Object r0 = r0.get(r1)
            com.badlogic.gdx.utils.Pool r0 = (com.badlogic.gdx.utils.Pool) r0
            int r1 = r0.getFree()
            int r2 = r0.max
            if (r1 < r2) goto L18
            r4.dispose()
            goto L1b
        L18:
            r0.free(r4)
        L1b:
            return
    }
}
