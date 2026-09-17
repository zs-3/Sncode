package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public abstract class ToolTable extends com.badlogic.gdx.scenes.scene2d.ui.Table implements com.badlogic.gdx.utils.Disposable {
    protected org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animationToolsModuleRef;
    protected org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule _creationToolsModuleRef;
    protected org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule _movieclipToolsModuleRef;
    protected org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    protected org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule mAnimationBasedModuleRef;
    protected org.fortheloss.sticknodes.animationscreen.modules.Module mModuleRef;
    private java.util.HashMap<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> mRegisteredWidgets;
    protected org.fortheloss.sticknodes.data.SessionData mSessionDataRef;
    protected boolean mShowTitle;



    public static class FloatFilter implements com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter {
        public FloatFilter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter
        public boolean acceptChar(com.badlogic.gdx.scenes.scene2d.ui.TextField r1, char r2) {
                r0 = this;
                boolean r1 = java.lang.Character.isDigit(r2)
                if (r1 != 0) goto Ld
                r1 = 46
                if (r2 != r1) goto Lb
                goto Ld
            Lb:
                r1 = 0
                goto Le
            Ld:
                r1 = 1
            Le:
                return r1
        }
    }

    public static class NegativeDigitsOnlyFilter implements com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter {
        public NegativeDigitsOnlyFilter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter
        public boolean acceptChar(com.badlogic.gdx.scenes.scene2d.ui.TextField r1, char r2) {
                r0 = this;
                boolean r1 = java.lang.Character.isDigit(r2)
                if (r1 != 0) goto Ld
                r1 = 45
                if (r2 != r1) goto Lb
                goto Ld
            Lb:
                r1 = 0
                goto Le
            Ld:
                r1 = 1
            Le:
                return r1
        }
    }

    public static class NegativeFloatOnlyFilter implements com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter {
        public NegativeFloatOnlyFilter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter
        public boolean acceptChar(com.badlogic.gdx.scenes.scene2d.ui.TextField r1, char r2) {
                r0 = this;
                boolean r1 = java.lang.Character.isDigit(r2)
                if (r1 != 0) goto L11
                r1 = 45
                if (r2 == r1) goto L11
                r1 = 46
                if (r2 != r1) goto Lf
                goto L11
            Lf:
                r1 = 0
                goto L12
            L11:
                r1 = 1
            L12:
                return r1
        }
    }

    public ToolTable(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2, org.fortheloss.sticknodes.data.ProjectData r3, org.fortheloss.sticknodes.data.SessionData r4) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mShowTitle = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mRegisteredWidgets = r0
            r1._animationToolsModuleRef = r2
            r1._projectDataRef = r3
            r1.mSessionDataRef = r4
            return
    }

    public ToolTable(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2, org.fortheloss.sticknodes.data.ProjectData r3, org.fortheloss.sticknodes.data.SessionData r4) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mShowTitle = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mRegisteredWidgets = r0
            r1._creationToolsModuleRef = r2
            r1._projectDataRef = r3
            r1.mSessionDataRef = r4
            return
    }

    public ToolTable(org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r2, org.fortheloss.sticknodes.data.ProjectData r3, org.fortheloss.sticknodes.data.SessionData r4) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mShowTitle = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mRegisteredWidgets = r0
            r1.mAnimationBasedModuleRef = r2
            r1._projectDataRef = r3
            r1.mSessionDataRef = r4
            return
    }

    public ToolTable(org.fortheloss.sticknodes.animationscreen.modules.Module r2, org.fortheloss.sticknodes.data.ProjectData r3, org.fortheloss.sticknodes.data.SessionData r4) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mShowTitle = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mRegisteredWidgets = r0
            r1.mModuleRef = r2
            r1._projectDataRef = r3
            r1.mSessionDataRef = r4
            return
    }

    public ToolTable(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2, org.fortheloss.sticknodes.data.ProjectData r3, org.fortheloss.sticknodes.data.SessionData r4) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mShowTitle = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mRegisteredWidgets = r0
            r1._movieclipToolsModuleRef = r2
            r1._projectDataRef = r3
            r1.mSessionDataRef = r4
            return
    }

    public static void addVibration(com.badlogic.gdx.scenes.scene2d.Actor r1, int r2) {
            boolean r0 = org.fortheloss.sticknodes.App.vibrationEnabledFor(r2)
            if (r0 == 0) goto Le
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$1 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$1
            r0.<init>(r2)
            r1.addListener(r0)
        Le:
            return
    }

    public static void clearTableCells(com.badlogic.gdx.scenes.scene2d.ui.Table r2) {
            if (r2 != 0) goto L3
            return
        L3:
            com.badlogic.gdx.utils.Array r2 = r2.getCells()
            int r0 = r2.size
            int r0 = r0 + (-1)
        Lb:
            if (r0 < 0) goto L1f
            java.lang.Object r1 = r2.get(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r1
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            if (r1 == 0) goto L1c
            r1.clear()
        L1c:
            int r0 = r0 + (-1)
            goto Lb
        L1f:
            return
    }

    public static org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> createSelectBox() {
            org.fortheloss.framework.SelectBoxCustomItemHeight r0 = new org.fortheloss.framework.SelectBoxCustomItemHeight
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSelectBoxStyle()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1120927744(0x42d00000, float:104.0)
            float r2 = r2 * r3
            r0.<init>(r1, r2)
            org.fortheloss.framework.CustomStopListener r1 = new org.fortheloss.framework.CustomStopListener
            r1.<init>()
            r0.addListener(r1)
            r1 = 7
            r0.setMaxListCount(r1)
            r1 = 0
            addVibration(r0, r1)
            return r0
    }

    public static org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> createSelectBoxWithFilter(com.badlogic.gdx.scenes.scene2d.ui.TextField r8, com.badlogic.gdx.scenes.scene2d.ui.ImageButton r9, org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex r10) {
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r9.getImage()
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter r0 = new org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSelectBoxStyle()
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1120927744(0x42d00000, float:104.0)
            float r4 = r1 * r2
            r2 = r0
            r5 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            org.fortheloss.framework.CustomStopListener r8 = new org.fortheloss.framework.CustomStopListener
            r8.<init>()
            r0.addListener(r8)
            r8 = 7
            r0.setMaxListCount(r8)
            r8 = 0
            addVibration(r0, r8)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.Table createTable() {
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r1 = 0
            r0.pad(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.space(r1)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.spaceRight(r3)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.spaceBottom(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r2.pad(r1)
            r2 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandX()
            r1.uniformX()
            r1 = 0
            r0.setRound(r1)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.CheckBox createToolCheckbox(com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle r2) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox
            java.lang.String r1 = ""
            r0.<init>(r1, r2)
            r2 = 0
            addVibration(r0, r2)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton createToolImageButton(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle r1) {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            r0.<init>(r1)
            r1 = 0
            addVibration(r0, r1)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton createToolImageTextButton(java.lang.String r1, com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle r2) {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton
            r0.<init>(r1, r2)
            r1 = 0
            addVibration(r0, r1)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton createToolImageTextButton2(java.lang.String r4, com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle r5) {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton
            r0.<init>(r4, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r0.getLabel()
            r5 = 8
            r1 = 1
            r4.setAlignment(r5, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.getImageCell()
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1111490560(0x42400000, float:48.0)
            float r2 = r2 * r5
            r3 = 1098907648(0x41800000, float:16.0)
            float r5 = r5 * r3
            r3 = 0
            r4.pad(r3, r2, r3, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.getLabelCell()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.expandX()
            r4.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r0.getLabel()
            r4.setWrap(r1)
            r0.invalidate()
            r0.pack()
            r4 = 0
            addVibration(r0, r4)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.Label createToolLabel(java.lang.String r1, int r2) {
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = createToolLabel(r1, r2, r0)
            return r1
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.Label createToolLabel(java.lang.String r1, int r2, com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle r3) {
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            r0.<init>(r1, r3)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r2)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.TextButton createToolTextButton(java.lang.String r3, com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle r4) {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            r0.<init>(r3, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r0.getLabel()
            r4 = 1
            r3.setWrap(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r0.getCell(r3)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1082130432(0x40800000, float:4.0)
            float r2 = r4 * r1
            float r4 = r4 * r1
            r1 = 0
            r3.pad(r1, r2, r1, r4)
            r0.invalidate()
            r0.pack()
            r3 = 0
            addVibration(r0, r3)
            return r0
    }

    public static int getInputHeight() {
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1123024896(0x42f00000, float:120.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    public static int getInputWidth() {
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1128529920(0x43440000, float:196.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    public static int getLongInputWidth() {
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1137180672(0x43c80000, float:400.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    public static int getSeparatorPadding() {
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1101004800(0x41a00000, float:20.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    public static boolean tapDelta(float r2, float r3, float r4, float r5) {
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1109393408(0x42200000, float:40.0)
            float r0 = r0 * r1
            float r4 = r4 - r2
            float r5 = r5 - r3
            float r4 = r4 * r4
            float r5 = r5 * r5
            float r4 = r4 + r5
            float r0 = r0 * r0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            return r2
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.TextField createTextField(java.lang.String r3) {
            r2 = this;
            r0 = -1
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r2.createTextField(r3, r0, r1)
            return r3
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.TextField createTextField(java.lang.String r2, int r3) {
            r1 = this;
            r0 = 0
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1.createTextField(r2, r3, r0)
            return r2
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.TextField createTextField(java.lang.String r3, int r4, com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter r5) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextField
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getTextFieldStyle()
            r0.<init>(r3, r1)
            if (r4 < 0) goto Le
            r0.setMaxLength(r4)
        Le:
            org.fortheloss.framework.CustomStopListener r3 = new org.fortheloss.framework.CustomStopListener
            r3.<init>()
            r0.addListener(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$2 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$2
            r3.<init>(r2)
            r0.addListener(r3)
            if (r5 == 0) goto L23
            r0.setTextFieldFilter(r5)
        L23:
            r3 = 0
            addVibration(r0, r3)
            return r0
    }

    public void dispose() {
            r4 = this;
            r0 = 0
            r4._animationToolsModuleRef = r0
            r4._creationToolsModuleRef = r0
            r4._movieclipToolsModuleRef = r0
            r4.mAnimationBasedModuleRef = r0
            r4._projectDataRef = r0
            r4.mSessionDataRef = r0
            com.badlogic.gdx.utils.Array r1 = r4.getCells()
            int r2 = r1.size
            int r2 = r2 + (-1)
        L15:
            if (r2 < 0) goto L29
            java.lang.Object r3 = r1.get(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r3
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 == 0) goto L26
            r3.clear()
        L26:
            int r2 = r2 + (-1)
            goto L15
        L29:
            java.util.HashMap<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r1 = r4.mRegisteredWidgets
            if (r1 == 0) goto L32
            r1.clear()
            r4.mRegisteredWidgets = r0
        L32:
            return
    }

    public org.fortheloss.sticknodes.animationscreen.modules.Module getModule() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.Module r0 = r2.mModuleRef
            if (r0 == 0) goto L5
            return r0
        L5:
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            if (r0 == 0) goto La
            return r0
        La:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._creationToolsModuleRef
            if (r0 == 0) goto Lf
            return r0
        Lf:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModuleRef
            if (r0 == 0) goto L14
            return r0
        L14:
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule
            if (r1 == 0) goto L1d
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = (org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule) r0
            return r0
        L1d:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = (org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule) r0
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.Actor getWidgetWithId(int r2) {
            r1 = this;
            java.util.HashMap<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r0 = r1.mRegisteredWidgets
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.badlogic.gdx.scenes.scene2d.Actor r2 = (com.badlogic.gdx.scenes.scene2d.Actor) r2
            return r2
    }

    public void initialize(com.badlogic.gdx.scenes.scene2d.utils.Drawable r4) {
            r3 = this;
            r0 = 0
            r3.setRound(r0)
            if (r4 == 0) goto L9
            r3.setBackground(r4)
        L9:
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r0 = 1101004800(0x41a00000, float:20.0)
            float r1 = r4 * r0
            float r4 = r4 * r0
            r0 = 0
            r3.pad(r1, r0, r4, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.space(r0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.spaceRight(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.spaceBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.pad(r0)
            r0 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.expandX()
            r4.uniformX()
            return
    }

    protected void redrawModule() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            if (r0 == 0) goto L8
            r0.setNeedsToBeDrawn()
            goto L1f
        L8:
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r1._movieclipToolsModuleRef
            if (r0 == 0) goto L10
            r0.setNeedsToBeDrawn()
            goto L1f
        L10:
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            if (r0 == 0) goto L18
            r0.setNeedsToBeDrawn()
            goto L1f
        L18:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            if (r0 == 0) goto L1f
            r0.setNeedsToBeDrawn()
        L1f:
            return
    }

    protected void registerWidget(com.badlogic.gdx.scenes.scene2d.Actor r3, int r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r0 = r2.mRegisteredWidgets
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto Ld
            return
        Ld:
            java.util.HashMap<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r0 = r2.mRegisteredWidgets
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0.put(r1, r3)
            org.fortheloss.sticknodes.animationscreen.modules.Module$WidgetIdentifier r0 = new org.fortheloss.sticknodes.animationscreen.modules.Module$WidgetIdentifier
            r0.<init>(r4)
            r3.setUserObject(r0)
            return
    }

    public void setShowTitle(boolean r1) {
            r0 = this;
            r0.mShowTitle = r1
            return
    }

    public abstract void update();
}
