package org.fortheloss.sticknodes.animationscreen.modules.contextmenus;

/* loaded from: classes2.dex */
public class SplitSegmentContextMenu extends org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu {
    private org.fortheloss.framework.RepeatingTextButton _decrementButton;
    private org.fortheloss.framework.RepeatingTextButton _incrementButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mInfoLabel;
    private int mMaxSplits;
    private int mSplitCount;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mWarningLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> mWarningLabelCell;





    /* renamed from: -$$Nest$monIncrementSplitCount, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m849$$Nest$monIncrementSplitCount(org.fortheloss.sticknodes.animationscreen.modules.contextmenus.SplitSegmentContextMenu r0, int r1) {
            r0.onIncrementSplitCount(r1)
            return
    }

    public SplitSegmentContextMenu(org.fortheloss.sticknodes.animationscreen.AnimationScreen r7, com.badlogic.gdx.scenes.scene2d.utils.Drawable r8, int r9) {
            r6 = this;
            r6.<init>(r8)
            r8 = 1
            r6.mSplitCount = r8
            r6.mMaxSplits = r9
            java.lang.String r9 = "howManyNewNodes"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r9, r8, r0)
            r6.mInfoLabel = r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r6.add(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.fillX()
            r0 = 2
            r9.colspan(r0)
            r6.row()
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.SplitSegmentContextMenu$1 r9 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.SplitSegmentContextMenu$1
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r2 = "-"
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            r9.<init>(r6, r2, r1, r3)
            r6._decrementButton = r9
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = r9.getLabel()
            r9.setWrap(r8)
            org.fortheloss.framework.RepeatingTextButton r9 = r6._decrementButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r9.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.getCell(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1082130432(0x40800000, float:4.0)
            float r4 = r1 * r2
            float r1 = r1 * r2
            r5 = 0
            r9.pad(r5, r4, r5, r1)
            org.fortheloss.framework.RepeatingTextButton r9 = r6._decrementButton
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.SplitSegmentContextMenu$2 r1 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.SplitSegmentContextMenu$2
            r1.<init>(r6)
            r9.addListener(r1)
            org.fortheloss.framework.RepeatingTextButton r9 = r6._decrementButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r6.add(r9)
            r1 = 8
            r9.align(r1)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.SplitSegmentContextMenu$3 r9 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.SplitSegmentContextMenu$3
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r4 = "+"
            r9.<init>(r6, r4, r1, r3)
            r6._incrementButton = r9
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = r9.getLabel()
            r9.setWrap(r8)
            org.fortheloss.framework.RepeatingTextButton r9 = r6._incrementButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r9.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.getCell(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r1 * r2
            float r1 = r1 * r2
            r9.pad(r5, r3, r5, r1)
            org.fortheloss.framework.RepeatingTextButton r9 = r6._incrementButton
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.SplitSegmentContextMenu$4 r1 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.SplitSegmentContextMenu$4
            r1.<init>(r6)
            r9.addListener(r1)
            org.fortheloss.framework.RepeatingTextButton r9 = r6._incrementButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r6.add(r9)
            r1 = 16
            r9.align(r1)
            r6.row()
            org.fortheloss.sticknodes.data.SessionData r7 = r7.getSessionData()
            boolean r7 = r7.getNerdModeEnabled()
            if (r7 != 0) goto Ld0
            java.lang.String r7 = "splitWarning"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r7, r8, r9)
            r6.mWarningLabel = r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.colspan(r0)
            r6.mWarningLabelCell = r7
        Ld0:
            r6.pack()
            return
    }

    private void onIncrementSplitCount(int r2) {
            r1 = this;
            int r0 = r1.mSplitCount
            int r0 = r0 + r2
            r1.mSplitCount = r0
            r2 = 1
            if (r0 >= r2) goto Lb
            r1.mSplitCount = r2
            goto L11
        Lb:
            int r2 = r1.mMaxSplits
            if (r0 <= r2) goto L11
            r1.mSplitCount = r2
        L11:
            int r2 = r1.mSplitCount
            r1.onSplitCountChanged(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mInfoLabel = r0
            r1.mWarningLabel = r0
            r1.mWarningLabelCell = r0
            r1._decrementButton = r0
            r1._incrementButton = r0
            super.dispose()
            return
    }

    public int getSplitCount() {
            r1 = this;
            int r0 = r1.mSplitCount
            return r0
    }

    protected void onSplitCountChanged(int r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public void update(org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r3.mWarningLabelCell
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            r0.setActor(r1)
            int r0 = r4.getLimbType()
            if (r0 == 0) goto L16
            int r0 = r4.getLimbType()
            r1 = 1
            if (r0 != r1) goto L34
        L16:
            int r0 = r4.getSegmentCurve()
            float r0 = (float) r0
            float r1 = r4.getLength()
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L34
            boolean r4 = r4.getSegmentCurveCirculization()
            if (r4 != 0) goto L34
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r4 = r3.mWarningLabelCell
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r3.mWarningLabel
            r4.setActor(r0)
        L34:
            r3.pack()
            return
    }
}
