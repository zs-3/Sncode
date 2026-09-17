package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class LabelInputIncrementSmallField extends org.fortheloss.framework.LabelInputIncrementField {





    public LabelInputIncrementSmallField(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, java.lang.String r2, java.lang.String r3, int r4, float r5, float r6, boolean r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // org.fortheloss.framework.LabelInputIncrementField
    protected void buildField(com.badlogic.gdx.scenes.scene2d.Actor r2, com.badlogic.gdx.scenes.scene2d.ui.TextField r3, com.badlogic.gdx.scenes.scene2d.ui.Table r4) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.add(r2)
            r2.fill()
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.add(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r3 = (float) r3
            int r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r0 = (float) r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.size(r3, r0)
            r3 = 1
            r2.align(r3)
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.align(r3)
            r1.mButtonsCell = r2
            r3 = 0
            r2.setActor(r3)
            return
    }

    @Override // org.fortheloss.framework.LabelInputIncrementField
    protected com.badlogic.gdx.scenes.scene2d.ui.Table createButtonsTable() {
            r5 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r5.mButtonsTable = r0
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.pad(r1)
            r2 = 10
            r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r5.mButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceBottom(r1)
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r1)
            r2 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.uniform(r1, r2)
            r0.expandX()
            org.fortheloss.framework.LabelInputIncrementSmallField$1 r0 = new org.fortheloss.framework.LabelInputIncrementSmallField$1
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r2 = "-"
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            r0.<init>(r5, r2, r1, r3)
            r5.mMinusButton = r0
            org.fortheloss.framework.LabelInputIncrementSmallField$2 r1 = new org.fortheloss.framework.LabelInputIncrementSmallField$2
            r1.<init>(r5)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r5.mButtonsTable
            org.fortheloss.framework.RepeatingTextButton r1 = r5.mMinusButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r1 = 16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r1)
            org.fortheloss.framework.RepeatingTextButton r1 = r5.mMinusButton
            float r1 = r1.getWidth()
            r2 = 1055286886(0x3ee66666, float:0.45)
            float r1 = r1 * r2
            r0.width(r1)
            org.fortheloss.framework.LabelInputIncrementSmallField$3 r0 = new org.fortheloss.framework.LabelInputIncrementSmallField$3
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r4 = "+"
            r0.<init>(r5, r4, r1, r3)
            r5.mPlusButton = r0
            org.fortheloss.framework.LabelInputIncrementSmallField$4 r1 = new org.fortheloss.framework.LabelInputIncrementSmallField$4
            r1.<init>(r5)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r5.mButtonsTable
            org.fortheloss.framework.RepeatingTextButton r1 = r5.mPlusButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r1 = 8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r1)
            org.fortheloss.framework.RepeatingTextButton r1 = r5.mPlusButton
            float r1 = r1.getWidth()
            float r1 = r1 * r2
            r0.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r5.mButtonsTable
            return r0
    }
}
