package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class ModifyBranchDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private static com.badlogic.gdx.graphics.Color colorGradient;
    private static com.badlogic.gdx.graphics.Color colorReplaceFrom;
    private static com.badlogic.gdx.graphics.Color colorReplaceTo;
    private static com.badlogic.gdx.graphics.Color colorSegment;
    private static float dialogLastScrollY;
    private org.fortheloss.sticknodes.stickfigure.StickNode _branchRef;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModuleRef;
    private org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule _createToolsModuleRef;
    private org.fortheloss.framework.ColorPicker _gradientColorPicker;
    private org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog.TwoColors _replaceColors;
    private org.fortheloss.framework.ColorPicker _replaceFromColorPicker;
    private org.fortheloss.framework.ColorPicker _replaceToColorPicker;
    private org.fortheloss.framework.ColorPicker _segmentColorPicker;
    private org.fortheloss.framework.ColorPicker _stickfigureColorPicker;














































    public class TwoColors implements com.badlogic.gdx.utils.Disposable {
        private com.badlogic.gdx.graphics.Color _colorOne;
        private com.badlogic.gdx.graphics.Color _colorTwo;
        final /* synthetic */ org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog this$0;

        public TwoColors(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r1, com.badlogic.gdx.graphics.Color r2, com.badlogic.gdx.graphics.Color r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
                r1.<init>(r2)
                r0._colorOne = r1
                com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
                r1.<init>(r3)
                r0._colorTwo = r1
                return
        }

        @Override // com.badlogic.gdx.utils.Disposable
        public void dispose() {
                r1 = this;
                r0 = 0
                r1._colorOne = r0
                r1._colorTwo = r0
                return
        }

        public com.badlogic.gdx.graphics.Color getColorOne() {
                r1 = this;
                com.badlogic.gdx.graphics.Color r0 = r1._colorOne
                return r0
        }

        public com.badlogic.gdx.graphics.Color getColorTwo() {
                r1 = this;
                com.badlogic.gdx.graphics.Color r0 = r1._colorTwo
                return r0
        }

        public void set(com.badlogic.gdx.graphics.Color r5, com.badlogic.gdx.graphics.Color r6) {
                r4 = this;
                com.badlogic.gdx.graphics.Color r0 = r4._colorOne
                float r1 = r5.r
                float r2 = r5.g
                float r5 = r5.b
                r3 = 1065353216(0x3f800000, float:1.0)
                r0.set(r1, r2, r5, r3)
                com.badlogic.gdx.graphics.Color r5 = r4._colorTwo
                float r0 = r6.r
                float r1 = r6.g
                float r6 = r6.b
                r5.set(r0, r1, r6, r3)
                return
        }
    }

    /* renamed from: -$$Nest$fget_createToolsModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule m552$$Nest$fget_createToolsModuleRef(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0) {
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r0._createToolsModuleRef
            return r0
    }

    /* renamed from: -$$Nest$fget_gradientColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m553$$Nest$fget_gradientColorPicker(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._gradientColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fget_replaceFromColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m554$$Nest$fget_replaceFromColorPicker(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._replaceFromColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fget_replaceToColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m555$$Nest$fget_replaceToColorPicker(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._replaceToColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fget_segmentColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m556$$Nest$fget_segmentColorPicker(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._segmentColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fget_stickfigureColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m557$$Nest$fget_stickfigureColorPicker(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._stickfigureColorPicker
            return r0
    }

    /* renamed from: -$$Nest$monLengthIncrementClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m558$$Nest$monLengthIncrementClick(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, int r1) {
            r0.onLengthIncrementClick(r1)
            return
    }

    /* renamed from: -$$Nest$monLimbTypeSelection, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m559$$Nest$monLimbTypeSelection(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, int r1) {
            r0.onLimbTypeSelection(r1)
            return
    }

    /* renamed from: -$$Nest$monReplaceColorClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m560$$Nest$monReplaceColorClick(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, com.badlogic.gdx.graphics.Color r1, com.badlogic.gdx.graphics.Color r2) {
            r0.onReplaceColorClick(r1, r2)
            return
    }

    /* renamed from: -$$Nest$monScaleIncrementClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m561$$Nest$monScaleIncrementClick(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, int r1) {
            r0.onScaleIncrementClick(r1)
            return
    }

    /* renamed from: -$$Nest$monSetDoNotApplySmartStretch, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m562$$Nest$monSetDoNotApplySmartStretch(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, boolean r1) {
            r0.onSetDoNotApplySmartStretch(r1)
            return
    }

    /* renamed from: -$$Nest$monSetGradientColorClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m563$$Nest$monSetGradientColorClick(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, com.badlogic.gdx.graphics.Color r1) {
            r0.onSetGradientColorClick(r1)
            return
    }

    /* renamed from: -$$Nest$monSetLengthClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m564$$Nest$monSetLengthClick(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, java.lang.String r1) {
            r0.onSetLengthClick(r1)
            return
    }

    /* renamed from: -$$Nest$monSetReverseGradient, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m565$$Nest$monSetReverseGradient(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, boolean r1) {
            r0.onSetReverseGradient(r1)
            return
    }

    /* renamed from: -$$Nest$monSetScaleClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m566$$Nest$monSetScaleClick(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, java.lang.String r1) {
            r0.onSetScaleClick(r1)
            return
    }

    /* renamed from: -$$Nest$monSetSegmentColorClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m567$$Nest$monSetSegmentColorClick(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, com.badlogic.gdx.graphics.Color r1) {
            r0.onSetSegmentColorClick(r1)
            return
    }

    /* renamed from: -$$Nest$monSetSidewaysGradient, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m568$$Nest$monSetSidewaysGradient(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, boolean r1) {
            r0.onSetSidewaysGradient(r1)
            return
    }

    /* renamed from: -$$Nest$monSetStatic, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m569$$Nest$monSetStatic(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, boolean r1) {
            r0.onSetStatic(r1)
            return
    }

    /* renamed from: -$$Nest$monSetStickfigureColorClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m570$$Nest$monSetStickfigureColorClick(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, com.badlogic.gdx.graphics.Color r1) {
            r0.onSetStickfigureColorClick(r1)
            return
    }

    /* renamed from: -$$Nest$monSetStretchy, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m571$$Nest$monSetStretchy(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, boolean r1) {
            r0.onSetStretchy(r1)
            return
    }

    /* renamed from: -$$Nest$monSetThicknessClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m572$$Nest$monSetThicknessClick(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, java.lang.String r1) {
            r0.onSetThicknessClick(r1)
            return
    }

    /* renamed from: -$$Nest$monSetTrapezoidRounded1, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m573$$Nest$monSetTrapezoidRounded1(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, boolean r1) {
            r0.onSetTrapezoidRounded1(r1)
            return
    }

    /* renamed from: -$$Nest$monSetTrapezoidRounded2, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m574$$Nest$monSetTrapezoidRounded2(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, boolean r1) {
            r0.onSetTrapezoidRounded2(r1)
            return
    }

    /* renamed from: -$$Nest$monSetTrapezoidThickness1, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m575$$Nest$monSetTrapezoidThickness1(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, java.lang.String r1) {
            r0.onSetTrapezoidThickness1(r1)
            return
    }

    /* renamed from: -$$Nest$monSetTrapezoidThickness2, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m576$$Nest$monSetTrapezoidThickness2(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, java.lang.String r1) {
            r0.onSetTrapezoidThickness2(r1)
            return
    }

    /* renamed from: -$$Nest$monSetUseGradient, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m577$$Nest$monSetUseGradient(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, boolean r1) {
            r0.onSetUseGradient(r1)
            return
    }

    /* renamed from: -$$Nest$monSetUseSegmentColor, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m578$$Nest$monSetUseSegmentColor(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, boolean r1) {
            r0.onSetUseSegmentColor(r1)
            return
    }

    /* renamed from: -$$Nest$monSetUseSegmentScale, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m579$$Nest$monSetUseSegmentScale(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, boolean r1) {
            r0.onSetUseSegmentScale(r1)
            return
    }

    /* renamed from: -$$Nest$monThicknessIncrementClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m580$$Nest$monThicknessIncrementClick(org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0, int r1, boolean r2) {
            r0.onThicknessIncrementClick(r1, r2)
            return
    }

    static {
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.sticknodes.App.COLOR_NODE_ACTIVE
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog.colorReplaceFrom = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.sticknodes.App.COLOR_RED
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog.colorReplaceTo = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.sticknodes.App.COLOR_DARK_GRAY
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog.colorSegment = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog.colorGradient = r0
            return
    }

    public ModifyBranchDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2, org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3) {
            r0 = this;
            r0.<init>(r1)
            r0._createToolsModuleRef = r2
            r0._canvasModuleRef = r3
            r1 = 8
            r0._dialogAlign = r1
            return
    }

    private com.badlogic.gdx.scenes.scene2d.ui.Table createInnerTable() {
            r4 = this;
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1101004800(0x41a00000, float:20.0)
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r2.<init>()
            r3 = 0
            r2.pad(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r2.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r3.space(r1, r0, r1, r0)
            r0.uniformX()
            return r2
    }

    private void onLengthIncrementClick(int r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2 = 12
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    private void onLimbTypeSelection(int r4) {
            r3 = this;
            r0 = 17
            switch(r4) {
                case 0: goto L54;
                case 1: goto L47;
                case 2: goto L3a;
                case 3: goto L2d;
                case 4: goto L20;
                case 5: goto L13;
                case 6: goto L6;
                default: goto L5;
            }
        L5:
            goto L60
        L6:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.applyBranchModification(r1, r0, r2)
            goto L60
        L13:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.applyBranchModification(r1, r0, r2)
            goto L60
        L20:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.applyBranchModification(r1, r0, r2)
            goto L60
        L2d:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.applyBranchModification(r1, r0, r2)
            goto L60
        L3a:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.applyBranchModification(r1, r0, r2)
            goto L60
        L47:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.applyBranchModification(r1, r0, r2)
            goto L60
        L54:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.applyBranchModification(r1, r0, r2)
        L60:
            return
    }

    private void onRedoClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._createToolsModuleRef
            r0.redo()
            return
    }

    private void onReplaceColorClick(com.badlogic.gdx.graphics.Color r3, com.badlogic.gdx.graphics.Color r4) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$TwoColors r0 = r2._replaceColors
            r0.set(r3, r4)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r3 = r2._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r2._branchRef
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$TwoColors r0 = r2._replaceColors
            r1 = 0
            r3.applyBranchModification(r4, r1, r0)
            return
    }

    private void onScaleIncrementClick(int r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2 = 10
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    private void onSetDoNotApplySmartStretch(boolean r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2 = 5
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    private void onSetGradientColorClick(com.badlogic.gdx.graphics.Color r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            r2 = 2
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    private void onSetLengthClick(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = ""
            boolean r0 = r4.equals(r0)
            r1 = 0
            if (r0 == 0) goto Lb
        L9:
            r4 = 0
            goto L13
        Lb:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L9
            int r4 = r4.intValue()     // Catch: java.lang.NumberFormatException -> L9
        L13:
            r0 = 999999(0xf423f, float:1.401297E-39)
            if (r4 >= 0) goto L19
            goto L20
        L19:
            if (r4 <= r0) goto L1f
            r1 = 999999(0xf423f, float:1.401297E-39)
            goto L20
        L1f:
            r1 = r4
        L20:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._branchRef
            r2 = 24
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.applyBranchModification(r0, r2, r1)
            return
    }

    private void onSetReverseGradient(boolean r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2 = 9
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    private void onSetScaleClick(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = ""
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lc
            r4 = 953267991(0x38d1b717, float:1.0E-4)
            goto L17
        Lc:
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L15
            float r4 = r4.floatValue()     // Catch: java.lang.NumberFormatException -> L15
            goto L17
        L15:
            r4 = 1065353216(0x3f800000, float:1.0)
        L17:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            r2 = 13
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    private void onSetSegmentColorClick(com.badlogic.gdx.graphics.Color r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            r2 = 1
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    private void onSetSidewaysGradient(boolean r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2 = 26
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    private void onSetStatic(boolean r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2 = 3
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    private void onSetStickfigureColorClick(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._createToolsModuleRef
            r0.setStickfigureColor(r2)
            return
    }

    private void onSetStretchy(boolean r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2 = 4
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    private void onSetThicknessClick(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = ""
            boolean r0 = r4.equals(r0)
            r1 = 0
            if (r0 == 0) goto Lb
            r4 = 0
            goto L16
        Lb:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L14
            int r4 = r4.intValue()     // Catch: java.lang.NumberFormatException -> L14
            goto L16
        L14:
            r4 = 32
        L16:
            r0 = 9999(0x270f, float:1.4012E-41)
            if (r4 >= 0) goto L1b
            goto L21
        L1b:
            if (r4 <= r0) goto L20
            r1 = 9999(0x270f, float:1.4012E-41)
            goto L21
        L20:
            r1 = r4
        L21:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._branchRef
            r2 = 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.applyBranchModification(r0, r2, r1)
            return
    }

    private void onSetTrapezoidRounded1(boolean r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2 = 30
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    private void onSetTrapezoidRounded2(boolean r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2 = 31
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    private void onSetTrapezoidThickness1(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = ""
            boolean r0 = r4.equals(r0)
            r1 = 0
            if (r0 == 0) goto La
            goto L12
        La:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L12
            int r1 = r4.intValue()     // Catch: java.lang.NumberFormatException -> L12
        L12:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._branchRef
            r2 = 28
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.applyBranchModification(r0, r2, r1)
            return
    }

    private void onSetTrapezoidThickness2(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = ""
            boolean r0 = r4.equals(r0)
            r1 = 0
            if (r0 == 0) goto La
            goto L12
        La:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L12
            int r1 = r4.intValue()     // Catch: java.lang.NumberFormatException -> L12
        L12:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._branchRef
            r2 = 29
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.applyBranchModification(r0, r2, r1)
            return
    }

    private void onSetUseGradient(boolean r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2 = 8
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    private void onSetUseSegmentColor(boolean r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2 = 7
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    private void onSetUseSegmentScale(boolean r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2 = 6
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    private void onThicknessIncrementClick(int r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto L4
            int r3 = r3 * 2
        L4:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r2._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2._branchRef
            r1 = 11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.applyBranchModification(r0, r1, r3)
            return
    }

    private void onUndoClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._createToolsModuleRef
            r0.undo()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r3) {
            r2 = this;
            super.dialogResult(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r0 = r3.intValue()
            r1 = 1
            if (r0 != r1) goto L13
            r2.onUndoClick()
            r2.doNotHideDialog()
            return
        L13:
            int r3 = r3.intValue()
            r0 = 2
            if (r3 != r0) goto L21
            r2.onRedoClick()
            r2.doNotHideDialog()
            return
        L21:
            com.badlogic.gdx.graphics.Color r3 = org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog.colorReplaceFrom
            org.fortheloss.framework.ColorPicker r0 = r2._replaceFromColorPicker
            com.badlogic.gdx.graphics.Color r0 = r0.getColor()
            r3.set(r0)
            com.badlogic.gdx.graphics.Color r3 = org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog.colorReplaceTo
            org.fortheloss.framework.ColorPicker r0 = r2._replaceToColorPicker
            com.badlogic.gdx.graphics.Color r0 = r0.getColor()
            r3.set(r0)
            com.badlogic.gdx.graphics.Color r3 = org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog.colorSegment
            org.fortheloss.framework.ColorPicker r0 = r2._segmentColorPicker
            com.badlogic.gdx.graphics.Color r0 = r0.getColor()
            r3.set(r0)
            com.badlogic.gdx.graphics.Color r3 = org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog.colorGradient
            org.fortheloss.framework.ColorPicker r0 = r2._gradientColorPicker
            com.badlogic.gdx.graphics.Color r0 = r0.getColor()
            r3.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r3 = r2.getDialogScrollPane()
            float r3 = r3.getScrollY()
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog.dialogLastScrollY = r3
            r2.doNotHideDialog()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r3 = r2._createToolsModuleRef
            r3.hideModifyBranchDialog(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r6 = this;
            r0 = 0
            r6._branchRef = r0
            r6._createToolsModuleRef = r0
            r6._canvasModuleRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r6.getTable()
            com.badlogic.gdx.utils.SnapshotArray r1 = r1.getChildren()
            int r2 = r1.size
            int r2 = r2 + (-1)
        L13:
            if (r2 < 0) goto L3d
            java.lang.Object r3 = r1.get(r2)
            com.badlogic.gdx.scenes.scene2d.Actor r3 = (com.badlogic.gdx.scenes.scene2d.Actor) r3
            r3.clear()
            boolean r4 = r3 instanceof com.badlogic.gdx.scenes.scene2d.ui.Table
            if (r4 == 0) goto L3a
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = (com.badlogic.gdx.scenes.scene2d.ui.Table) r3
            com.badlogic.gdx.utils.SnapshotArray r3 = r3.getChildren()
            int r4 = r3.size
            int r4 = r4 + (-1)
        L2c:
            if (r4 < 0) goto L3a
            java.lang.Object r5 = r3.get(r4)
            com.badlogic.gdx.scenes.scene2d.Actor r5 = (com.badlogic.gdx.scenes.scene2d.Actor) r5
            r5.clear()
            int r4 = r4 + (-1)
            goto L2c
        L3a:
            int r2 = r2 + (-1)
            goto L13
        L3d:
            org.fortheloss.framework.ColorPicker r1 = r6._replaceFromColorPicker
            if (r1 == 0) goto L46
            r1.dispose()
            r6._replaceFromColorPicker = r0
        L46:
            org.fortheloss.framework.ColorPicker r1 = r6._replaceToColorPicker
            if (r1 == 0) goto L4f
            r1.dispose()
            r6._replaceToColorPicker = r0
        L4f:
            org.fortheloss.framework.ColorPicker r1 = r6._segmentColorPicker
            if (r1 == 0) goto L58
            r1.dispose()
            r6._segmentColorPicker = r0
        L58:
            org.fortheloss.framework.ColorPicker r1 = r6._gradientColorPicker
            if (r1 == 0) goto L61
            r1.dispose()
            r6._gradientColorPicker = r0
        L61:
            org.fortheloss.framework.ColorPicker r1 = r6._stickfigureColorPicker
            if (r1 == 0) goto L6a
            r1.dispose()
            r6._stickfigureColorPicker = r0
        L6a:
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$TwoColors r1 = r6._replaceColors
            if (r1 == 0) goto L73
            r1.dispose()
            r6._replaceColors = r0
        L73:
            super.dispose()
            return
    }

    public org.fortheloss.sticknodes.stickfigure.StickNode getBranch() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._branchRef
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.StickNode r19, org.fortheloss.sticknodes.data.SessionData r20, com.badlogic.gdx.graphics.g2d.TextureAtlas r21, com.badlogic.gdx.graphics.g2d.TextureAtlas r22) {
            r18 = this;
            r8 = r18
            r9 = r21
            boolean r0 = r20.getIsLeftHandMode()
            r10 = 16
            r11 = 8
            if (r0 == 0) goto L11
            r8._dialogAlign = r10
            goto L13
        L11:
            r8._dialogAlign = r11
        L13:
            java.lang.String r0 = "modifyNodeBranchTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r12 = r19
            r8._branchRef = r12
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$TwoColors r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$TwoColors
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.WHITE
            r0.<init>(r8, r1, r1)
            r8._replaceColors = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r18.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            r1 = 0
            r0.uniform(r1, r1)
            r0 = 1109393408(0x42200000, float:40.0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r1 * r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "modifyBranchInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r1 = 3
            r0.colspan(r1)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "replaceColor"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            r0.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "from"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r14.<init>(r0, r1)
            r0 = 1
            r14.setWrap(r0)
            r14.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = "to"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r7.<init>(r0, r1)
            r0 = 1
            r7.setWrap(r0)
            r7.setAlignment(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$1 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$1
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r8._createToolsModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1092616192(0x41200000, float:10.0)
            float r5 = r0 * r1
            boolean r16 = r20.getIsLeftHandMode()
            r0 = r6
            r1 = r18
            r4 = r22
            r10 = r6
            r6 = r16
            r17 = r7
            r7 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8._replaceFromColorPicker = r10
            r10.alignPopup(r11)
            org.fortheloss.framework.ColorPicker r0 = r8._replaceFromColorPicker
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog.colorReplaceFrom
            float r2 = r1.r
            float r3 = r1.g
            float r1 = r1.b
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r2, r3, r1, r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$2 r10 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$2
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r8._createToolsModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1092616192(0x41200000, float:10.0)
            float r5 = r0 * r1
            boolean r6 = r20.getIsLeftHandMode()
            r0 = r10
            r1 = r18
            r4 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8._replaceToColorPicker = r10
            r10.alignPopup(r11)
            org.fortheloss.framework.ColorPicker r0 = r8._replaceToColorPicker
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog.colorReplaceTo
            float r2 = r1.r
            float r3 = r1.g
            float r1 = r1.b
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r2, r3, r1, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r18.createInnerTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r14)
            r2 = 16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.align(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            r1.width(r2)
            r1 = r17
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.align(r11)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            r1.width(r2)
            r0.row()
            org.fortheloss.framework.ColorPicker r1 = r8._replaceFromColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.width(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.height(r2)
            r2 = 16
            r1.align(r2)
            org.fortheloss.framework.ColorPicker r1 = r8._replaceToColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.width(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.height(r2)
            r1.align(r11)
            r8.addContent(r0)
            java.lang.String r0 = "replace"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r8.createTextButton(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$3 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$3
            r1.<init>(r8)
            r0.addListener(r1)
            r8.addContent(r0)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r15)
            java.lang.String r2 = "to"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " <<< "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            r0.<init>(r1, r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$4 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$4
            r1.<init>(r8)
            r0.addListener(r1)
            org.fortheloss.framework.SizeWidget r1 = new org.fortheloss.framework.SizeWidget
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2, r2)
            r8.addContent(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r8.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandX()
            float r0 = r0.getHeight()
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r2
            r1.height(r0)
            org.fortheloss.framework.SizeWidget r0 = new org.fortheloss.framework.SizeWidget
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1)
            r8.addContent(r0)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "segmentColor"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r8.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            r1.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r10 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r14 = "setTo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r10.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$5 r15 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$5
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r8._createToolsModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1092616192(0x41200000, float:10.0)
            float r5 = r0 * r1
            boolean r6 = r20.getIsLeftHandMode()
            r0 = r15
            r1 = r18
            r4 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8._segmentColorPicker = r15
            r15.alignPopup(r11)
            org.fortheloss.framework.ColorPicker r0 = r8._segmentColorPicker
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog.colorSegment
            float r2 = r1.r
            float r3 = r1.g
            float r1 = r1.b
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r2, r3, r1, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r18.createInnerTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r10)
            r2 = 1
            r1.align(r2)
            r0.row()
            org.fortheloss.framework.ColorPicker r1 = r8._segmentColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.width(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r2 = (float) r2
            r1.height(r2)
            r8.addContent(r0)
            java.lang.String r10 = "set"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r8.createTextButton(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$6 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$6
            r1.<init>(r8)
            r0.addListener(r1)
            r8.addContent(r0)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "gradientColor"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r8.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            r1.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r15.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$7 r7 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$7
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r8._createToolsModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1092616192(0x41200000, float:10.0)
            float r5 = r0 * r1
            boolean r6 = r20.getIsLeftHandMode()
            r0 = r7
            r1 = r18
            r4 = r22
            r11 = r7
            r7 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8._gradientColorPicker = r11
            r0 = 8
            r11.alignPopup(r0)
            org.fortheloss.framework.ColorPicker r0 = r8._gradientColorPicker
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog.colorGradient
            float r2 = r1.r
            float r3 = r1.g
            float r1 = r1.b
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r2, r3, r1, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r18.createInnerTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r15)
            r2 = 1
            r1.align(r2)
            r0.row()
            org.fortheloss.framework.ColorPicker r1 = r8._gradientColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.width(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r2 = (float) r2
            r1.height(r2)
            r8.addContent(r0)
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r8.createTextButton(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$8 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$8
            r1.<init>(r8)
            r0.addListener(r1)
            r8.addContent(r0)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "stickfigureColor"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r8.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            r1.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r11 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r11.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$9 r14 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$9
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r8._createToolsModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1092616192(0x41200000, float:10.0)
            float r5 = r0 * r1
            boolean r6 = r20.getIsLeftHandMode()
            r0 = r14
            r1 = r18
            r4 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8._stickfigureColorPicker = r14
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r19.getStickfigure()
            com.badlogic.gdx.graphics.Color r0 = r0.getColor()
            org.fortheloss.framework.ColorPicker r1 = r8._stickfigureColorPicker
            r2 = 8
            r1.alignPopup(r2)
            org.fortheloss.framework.ColorPicker r1 = r8._stickfigureColorPicker
            float r2 = r0.r
            float r3 = r0.g
            float r0 = r0.b
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.setColor(r2, r3, r0, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r18.createInnerTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r11)
            r2 = 1
            r1.align(r2)
            r0.row()
            org.fortheloss.framework.ColorPicker r1 = r8._stickfigureColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.width(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r2 = (float) r2
            r1.height(r2)
            r8.addContent(r0)
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r8.createTextButton(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$10 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$10
            r1.<init>(r8)
            r0.addListener(r1)
            r8.addContent(r0)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r6 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r9.findRegion(r6)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            r1 = 3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r13)
            r0.fillX()
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "static"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            r0.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r8.addContent(r0)
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r8.createTextButton(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$11 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$11
            r2.<init>(r8, r0)
            r1.addListener(r2)
            r8.addContent(r1)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "isStretchy"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            r0.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r8.addContent(r0)
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r8.createTextButton(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$12 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$12
            r2.<init>(r8, r0)
            r1.addListener(r2)
            r8.addContent(r1)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "doNotSmartStretch"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            r0.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r8.addContent(r0)
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r8.createTextButton(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$13 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$13
            r2.<init>(r8, r0)
            r1.addListener(r2)
            r8.addContent(r1)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "useSegmentScale"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            r0.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r8.addContent(r0)
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r8.createTextButton(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$14 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$14
            r2.<init>(r8, r0)
            r1.addListener(r2)
            r8.addContent(r1)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "useSegmentColor"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            r0.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r8.addContent(r0)
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r8.createTextButton(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$15 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$15
            r2.<init>(r8, r0)
            r1.addListener(r2)
            r8.addContent(r1)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "useGradientColor"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            r0.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r8.addContent(r0)
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r8.createTextButton(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$16 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$16
            r2.<init>(r8, r0)
            r1.addListener(r2)
            r8.addContent(r1)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "reverseGradient"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            r0.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r8.addContent(r0)
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r8.createTextButton(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$17 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$17
            r2.<init>(r8, r0)
            r1.addListener(r2)
            r8.addContent(r1)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "sidewaysGradient"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            r0.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r8.addContent(r0)
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r8.createTextButton(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$18 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$18
            r2.<init>(r8, r0)
            r1.addListener(r2)
            r8.addContent(r1)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r9.findRegion(r6)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            r1 = 3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r13)
            r0.fillX()
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "incrementScale"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            r0.width(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$19 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$19
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            java.lang.String r3 = "-"
            r0.<init>(r8, r3, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0.getLabel()
            r2 = 1
            r1.setWrap(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.getCell(r1)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 * r2
            r4 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 * r4
            r4 = 0
            r1.pad(r4, r3, r4, r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$20 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$20
            r1.<init>(r8)
            r0.addListener(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$21 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$21
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            java.lang.String r4 = "+"
            r1.<init>(r8, r4, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r1.getLabel()
            r3 = 1
            r2.setWrap(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r1.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.getCell(r2)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1082130432(0x40800000, float:4.0)
            float r4 = r4 * r3
            r5 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 * r5
            r5 = 0
            r2.pad(r5, r4, r5, r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$22 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$22
            r2.<init>(r8)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r18.createInnerTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.add(r0)
            r3 = 16
            r0.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.add(r1)
            r1 = 8
            r0.align(r1)
            r8.addContent(r2)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "incrementThickness"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            r0.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r0 = 1
            r7.setChecked(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$23 r11 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$23
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            java.lang.String r2 = "-"
            r0 = r11
            r1 = r18
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r11.getLabel()
            r1 = 1
            r0.setWrap(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r11.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r11.getCell(r0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 * r1
            r3 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 * r3
            r3 = 0
            r0.pad(r3, r2, r3, r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$24 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$24
            r0.<init>(r8, r7)
            r11.addListener(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$25 r12 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$25
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r2 = "+"
            r0 = r12
            r1 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r12.getLabel()
            r1 = 1
            r0.setWrap(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r12.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r12.getCell(r0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 * r1
            r3 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 * r3
            r3 = 0
            r0.pad(r3, r2, r3, r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$26 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$26
            r0.<init>(r8, r7)
            r12.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r18.createInnerTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r11)
            r2 = 16
            r1.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r12)
            r2 = 8
            r1.align(r2)
            r8.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "ignoreZeroes"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r18.createInnerTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r2 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r2)
            r0.fillX()
            r1.row()
            r1.add(r7)
            r8.addContent(r1)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "incrementLength"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            r0.width(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$27 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$27
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            java.lang.String r3 = "-"
            r0.<init>(r8, r3, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0.getLabel()
            r2 = 1
            r1.setWrap(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.getCell(r1)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 * r2
            r4 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 * r4
            r4 = 0
            r1.pad(r4, r3, r4, r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$28 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$28
            r1.<init>(r8)
            r0.addListener(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$29 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$29
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            java.lang.String r4 = "+"
            r1.<init>(r8, r4, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r1.getLabel()
            r3 = 1
            r2.setWrap(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r1.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.getCell(r2)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1082130432(0x40800000, float:4.0)
            float r4 = r4 * r3
            r5 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 * r5
            r5 = 0
            r2.pad(r5, r4, r5, r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$30 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$30
            r2.<init>(r8)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r18.createInnerTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.add(r0)
            r3 = 16
            r0.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.add(r1)
            r1 = 8
            r0.align(r1)
            r8.addContent(r2)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r9.findRegion(r6)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            r1 = 3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r13)
            r0.fillX()
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "setSegmentScale"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            r0.width(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$FloatFilter r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$FloatFilter
            r0.<init>()
            r1 = 4
            java.lang.String r2 = "1.00"
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r8.createTextField(r2, r1, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r8.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r3 = (float) r3
            r1.size(r2, r3)
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r8.createTextButton(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$31 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$31
            r2.<init>(r8, r0)
            r1.addListener(r2)
            r8.addContent(r1)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "setSegmentThickness"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            r0.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
            r0.<init>()
            r1 = 4
            java.lang.String r2 = "32"
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r8.createTextField(r2, r1, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r8.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r3 = (float) r3
            r1.size(r2, r3)
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r8.createTextButton(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$32 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$32
            r2.<init>(r8, r0)
            r1.addListener(r2)
            r8.addContent(r1)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "segmentLength"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            r0.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
            r0.<init>()
            java.lang.String r1 = "100"
            r2 = 8
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r8.createTextField(r1, r2, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r8.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r3 = (float) r3
            r1.size(r2, r3)
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r8.createTextButton(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$33 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$33
            r2.<init>(r8, r0)
            r1.addListener(r2)
            r8.addContent(r1)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r9.findRegion(r6)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            r1 = 3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r13)
            r0.fillX()
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "txtLimbType"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            r0.width(r1)
            org.fortheloss.framework.SelectBoxCustomItemHeight r0 = r18.createSelectBox()
            r1 = 7
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "segment"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r2)
            r4 = 0
            r1[r4] = r3
            java.lang.String r3 = "roundedSegment"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "circle"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r4 = 2
            r1[r4] = r3
            java.lang.String r3 = "ellipse"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r4 = 3
            r1[r4] = r3
            java.lang.String r3 = "triangle"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r3)
            r5 = 4
            r1[r5] = r4
            r4 = 5
            java.lang.String r5 = "trapezoid"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r5)
            r1[r4] = r6
            r4 = 6
            java.lang.String r6 = "polygon"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            r1[r4] = r6
            r0.setItems(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r8.addContent(r0)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.width(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r4 = (float) r4
            r1.height(r4)
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r8.createTextButton(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$34 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$34
            r4.<init>(r8, r0)
            r1.addListener(r4)
            r8.addContent(r1)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r4 = "curveRadius"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "("
            r6.append(r7)
            r6.append(r1)
            java.lang.String r1 = ")\n"
            r6.append(r1)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r4, r6)
            r4 = 1
            r0.setWrap(r4)
            r0.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r4 = (float) r4
            r0.width(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeDigitsOnlyFilter r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeDigitsOnlyFilter
            r0.<init>()
            r4 = 3
            java.lang.String r6 = "0"
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r8.createTextField(r6, r4, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r8.addContent(r0)
            int r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r9 = (float) r9
            int r11 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r11 = (float) r11
            r4.size(r9, r11)
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r8.createTextButton(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$35 r9 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$35
            r9.<init>(r8, r0)
            r4.addListener(r9)
            r8.addContent(r4)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r4 = "isCirculized"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r2)
            r9.append(r1)
            r9.append(r4)
            java.lang.String r2 = r9.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r2, r4)
            r2 = 1
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            r0.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r8.addContent(r0)
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r8.createTextButton(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$36 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$36
            r4.<init>(r8, r0)
            r2.addListener(r4)
            r8.addContent(r2)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r4 = "thickness"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r2)
            r9.append(r1)
            r9.append(r4)
            java.lang.String r2 = " 1"
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r2, r4)
            r2 = 1
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            r0.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
            r0.<init>()
            r2 = 4
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r8.createTextField(r6, r2, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r8.addContent(r0)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r4 = (float) r4
            int r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r9 = (float) r9
            r2.size(r4, r9)
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r8.createTextButton(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$37 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$37
            r4.<init>(r8, r0)
            r2.addListener(r4)
            r8.addContent(r2)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r4 = "rounded"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r2)
            r9.append(r1)
            r9.append(r4)
            java.lang.String r2 = " 1"
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r2, r4)
            r2 = 1
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            r0.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r8.addContent(r0)
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r8.createTextButton(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$38 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$38
            r4.<init>(r8, r0)
            r2.addListener(r4)
            r8.addContent(r2)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r4 = "thickness"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r2)
            r9.append(r1)
            r9.append(r4)
            java.lang.String r2 = " 2"
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r2, r4)
            r2 = 1
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            r0.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
            r0.<init>()
            r2 = 4
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r8.createTextField(r6, r2, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r8.addContent(r0)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r4 = (float) r4
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r6 = (float) r6
            r2.size(r4, r6)
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r8.createTextButton(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$39 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$39
            r4.<init>(r8, r0)
            r2.addListener(r4)
            r8.addContent(r2)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r4 = "rounded"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r2)
            r5.append(r1)
            r5.append(r4)
            java.lang.String r2 = " 2"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r2, r4)
            r2 = 1
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            r0.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r8.addContent(r0)
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r8.createTextButton(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$40 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$40
            r4.<init>(r8, r0)
            r2.addListener(r4)
            r8.addContent(r2)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "circle"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r4 = "isHalfArc"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r2)
            r5.append(r1)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r2, r4)
            r2 = 1
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            r0.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r8.addContent(r0)
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r8.createTextButton(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$41 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$41
            r4.<init>(r8, r0)
            r2.addListener(r4)
            r8.addContent(r2)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r4 = "isRightTriangle"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r2)
            r5.append(r1)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r2, r4)
            r2 = 1
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            r0.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r8.addContent(r0)
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r8.createTextButton(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$42 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$42
            r4.<init>(r8, r0)
            r2.addListener(r4)
            r8.addContent(r2)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r4 = "flipped"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r2)
            r5.append(r1)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r2, r4)
            r2 = 1
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            r0.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r8.addContent(r0)
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r8.createTextButton(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$43 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$43
            r4.<init>(r8, r0)
            r2.addListener(r4)
            r8.addContent(r2)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r3 = "upsideDown"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r2)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r2, r3)
            r2 = 1
            r0.setWrap(r2)
            r0.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            r0.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r8.addContent(r0)
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r8.createTextButton(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$44 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$44
            r3.<init>(r8, r0)
            r2.addListener(r3)
            r8.addContent(r2)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "polygon"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r3 = "vertices"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r2)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            r0.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
            r0.<init>()
            r1 = 2
            java.lang.String r2 = "5"
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r8.createTextField(r2, r1, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r8.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r3 = (float) r3
            r1.size(r2, r3)
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r8.createTextButton(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$45 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$45
            r2.<init>(r8, r0)
            r1.addListener(r2)
            r8.addContent(r1)
            r18.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Widget r0 = new com.badlogic.gdx.scenes.scene2d.ui.Widget
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.addContent(r0)
            r1 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            r1 = 1142292480(0x44160000, float:600.0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r1
            r0.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonNormalUndoStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r0)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.addButton(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonNormalRedoStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r0)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.addButton(r0, r1)
            java.lang.String r0 = "finished"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r8.createTextButton(r0, r1)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.addButton(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r18.getDialog()
            r0.validate()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r18.getDialogScrollPane()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r18.getDialogScrollPane()
            float r1 = r1.getMaxY()
            float r2 = org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog.dialogLastScrollY
            float r1 = r1 - r2
            r2 = 0
            r0.scrollTo(r2, r1, r2, r2)
            return
    }

    public void onSetIsCirculized(boolean r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2 = 27
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    public void onSetIsHalfArc(boolean r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2 = 18
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    public void onSetIsRightTriangle(boolean r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2 = 19
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    public void onSetPolygonVertices(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = ""
            boolean r0 = r4.equals(r0)
            r1 = 4
            if (r0 == 0) goto La
            goto L12
        La:
            java.lang.Short r4 = java.lang.Short.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L12
            short r1 = r4.shortValue()     // Catch: java.lang.NumberFormatException -> L12
        L12:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._branchRef
            r2 = 22
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            r4.applyBranchModification(r0, r2, r1)
            return
    }

    public void onSetRightTriangleFlipped(boolean r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2 = 20
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    public void onSetSegmentCurve(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = ""
            boolean r0 = r4.equals(r0)
            r1 = 0
            if (r0 == 0) goto La
            goto L12
        La:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L12
            int r1 = r4.intValue()     // Catch: java.lang.NumberFormatException -> L12
        L12:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._branchRef
            r2 = 25
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.applyBranchModification(r0, r2, r1)
            return
    }

    public void onSetUpsideDownTriangle(boolean r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3._createToolsModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._branchRef
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2 = 23
            r0.applyBranchModification(r1, r2, r4)
            return
    }

    public void setSwapColors(com.badlogic.gdx.graphics.Color r2, com.badlogic.gdx.graphics.Color r3) {
            r1 = this;
            org.fortheloss.framework.ColorPicker r0 = r1._replaceFromColorPicker
            r0.setColor(r2)
            org.fortheloss.framework.ColorPicker r2 = r1._replaceToColorPicker
            r2.setColor(r3)
            return
    }
}
