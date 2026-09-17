package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class JoinedFiguresSubToolTable extends com.badlogic.gdx.scenes.scene2d.ui.Table implements com.badlogic.gdx.utils.Disposable {
    private org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule _animationBasedModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Image _dividerImage;
    private int _joinBundleIter;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable.FigureJoinBundle[] _joinBundles;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;

    public class FigureJoinBundle extends com.badlogic.gdx.scenes.scene2d.ui.Table implements com.badlogic.gdx.utils.Disposable {
        private com.badlogic.gdx.scenes.scene2d.ui.Label _figureNameLabel;
        private org.fortheloss.sticknodes.animationscreen.IDrawableFigure _figureToUnjoinRef;
        private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _smallUnjoinButton;
        final /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable this$0;



        /* renamed from: -$$Nest$monFigureNameClick, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m985$$Nest$monFigureNameClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable.FigureJoinBundle r0) {
                r0.onFigureNameClick()
                return
        }

        /* renamed from: -$$Nest$monUnjoinClick, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m986$$Nest$monUnjoinClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable.FigureJoinBundle r0) {
                r0.onUnjoinClick()
                return
        }

        public FigureJoinBundle(org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable r6) {
                r5 = this;
                r5.this$0 = r6
                r5.<init>()
                r0 = 0
                com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r5.pad(r0)
                r2 = 1
                r1.align(r2)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r5.defaults()
                com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.space(r0)
                float r3 = org.fortheloss.sticknodes.App.assetScaling
                r4 = 1092616192(0x41200000, float:10.0)
                float r3 = r3 * r4
                com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.spaceRight(r3)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.pad(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r2)
                r0.expandX()
                java.lang.String r0 = ""
                com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable.m984$$Nest$mcreateToolLabel(r6, r0, r2)
                r5._figureNameLabel = r0
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable$FigureJoinBundle$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable$FigureJoinBundle$1
                r1.<init>(r5, r6)
                r0.addListener(r1)
                com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r5._figureNameLabel
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r5.add(r0)
                float r1 = org.fortheloss.sticknodes.App.assetScaling
                r2 = 1134559232(0x43a00000, float:320.0)
                float r1 = r1 * r2
                r0.width(r1)
                com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
                com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallUnjoinImageButtonStyle()
                r0.<init>(r1)
                r5._smallUnjoinButton = r0
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable$FigureJoinBundle$2 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable$FigureJoinBundle$2
                r1.<init>(r5, r6)
                r0.addListener(r1)
                com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = r5._smallUnjoinButton
                com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.add(r6)
                r0 = 16
                com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.align(r0)
                com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r5._smallUnjoinButton
                float r0 = r0.getWidth()
                r1 = 1055286886(0x3ee66666, float:0.45)
                float r0 = r0 * r1
                r6.width(r0)
                return
        }

        private void onFigureNameClick() {
                r2 = this;
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable r0 = r2.this$0
                org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable.m983$$Nest$fget_animationBasedModuleRef(r0)
                org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r2._figureToUnjoinRef
                r0.selectFigure(r1)
                return
        }

        private void onUnjoinClick() {
                r2 = this;
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable r0 = r2.this$0
                org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable.m983$$Nest$fget_animationBasedModuleRef(r0)
                org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r2._figureToUnjoinRef
                r0.unjoinFigure(r1)
                return
        }

        @Override // com.badlogic.gdx.utils.Disposable
        public void dispose() {
                r1 = this;
                r0 = 0
                r1._figureNameLabel = r0
                r1._smallUnjoinButton = r0
                r1._figureToUnjoinRef = r0
                return
        }

        public void setNewFigure(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5) {
                r4 = this;
                r4._figureToUnjoinRef = r5
                java.lang.String r0 = r5.getName()
                int r1 = r0.length()
                r2 = 50
                if (r1 <= r2) goto L36
                r1 = 0
                r2 = 23
                java.lang.String r1 = r0.substring(r1, r2)
                int r3 = r0.length()
                int r3 = r3 - r2
                int r2 = r0.length()
                java.lang.String r0 = r0.substring(r3, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                java.lang.String r1 = "..."
                r2.append(r1)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
            L36:
                com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r4._figureNameLabel
                int r5 = r5.getID()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                java.lang.String r0 = " (ID: "
                r2.append(r0)
                r2.append(r5)
                java.lang.String r5 = ")"
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.setText(r5)
                return
        }
    }

    /* renamed from: -$$Nest$fget_animationBasedModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule m983$$Nest$fget_animationBasedModuleRef(org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r0._animationBasedModuleRef
            return r0
    }

    /* renamed from: -$$Nest$mcreateToolLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Label m984$$Nest$mcreateToolLabel(org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable r0, java.lang.String r1, int r2) {
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.createToolLabel(r1, r2)
            return r0
    }

    public JoinedFiguresSubToolTable(org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r7) {
            r6 = this;
            r6.<init>()
            r0 = 0
            r6._joinBundleIter = r0
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r6.pad(r1)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r2.padTop(r3)
            r3 = 1
            r2.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r6.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.space(r1)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.spaceBottom(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r2.pad(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandX()
            r1.uniformX()
            r6.setRound(r0)
            r6._animationBasedModuleRef = r7
            return
    }

    private com.badlogic.gdx.scenes.scene2d.ui.Label createToolLabel(java.lang.String r2, int r3) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r1.createToolLabel(r2, r3, r0)
            return r2
    }

    private com.badlogic.gdx.scenes.scene2d.ui.Label createToolLabel(java.lang.String r2, int r3, com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle r4) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            r0.<init>(r2, r4)
            r2 = 1
            r0.setWrap(r2)
            r0.setAlignment(r3)
            return r0
    }

    public void addJoinBundle(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r3 = this;
            int r0 = r3._joinBundleIter
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable$FigureJoinBundle[] r1 = r3._joinBundles
            int r2 = r1.length
            if (r0 < r2) goto L8
            return
        L8:
            int r2 = r0 + 1
            r3._joinBundleIter = r2
            r0 = r1[r0]
            r0.setNewFigure(r4)
            r3.add(r0)
            r3.row()
            return
    }

    public void clearAll() {
            r2 = this;
            r2.clearChildren()
            r0 = 0
            r2._joinBundleIter = r0
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r2._dividerImage
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            r0.padBottom(r1)
            r2.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r2._titleLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.add(r0)
            r0.fillX()
            r2.row()
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 0
            r3._dividerImage = r0
            r3._titleLabel = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable$FigureJoinBundle[] r1 = r3._joinBundles
            int r1 = r1.length
            int r1 = r1 + (-1)
        La:
            if (r1 < 0) goto L16
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable$FigureJoinBundle[] r2 = r3._joinBundles
            r2 = r2[r1]
            r2.dispose()
            int r1 = r1 + (-1)
            goto La
        L16:
            r3._joinBundles = r0
            r3._animationBasedModuleRef = r0
            return
    }

    public void initialize(com.badlogic.gdx.scenes.scene2d.ui.Image r3) {
            r2 = this;
            r2._dividerImage = r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            int r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r0 = (float) r0
            r3.padBottom(r0)
            r2.row()
            java.lang.String r3 = "figuresJoinedToNode"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = ":"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2.createToolLabel(r3, r0)
            r2._titleLabel = r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r2.add(r3)
            r3.fillX()
            r2.row()
            r3 = 20
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable$FigureJoinBundle[] r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable.FigureJoinBundle[r3]
            r2._joinBundles = r3
            int r3 = r3.length
            int r3 = r3 - r0
        L45:
            if (r3 < 0) goto L53
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable$FigureJoinBundle[] r0 = r2._joinBundles
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable$FigureJoinBundle r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable$FigureJoinBundle
            r1.<init>(r2)
            r0[r3] = r1
            int r3 = r3 + (-1)
            goto L45
        L53:
            return
    }
}
