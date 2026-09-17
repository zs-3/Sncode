package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class DegreesLabelInputIncrementField extends org.fortheloss.framework.LabelInputIncrementField {
    protected com.badlogic.gdx.scenes.scene2d.ui.ImageButton mSnapButton;


    public static class DegreesFieldListener extends org.fortheloss.framework.LabelInputIncrementField.FieldListener {
        public DegreesFieldListener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onSnapButtonTouchEvent(int r1) {
                r0 = this;
                return
        }
    }

    public DegreesLabelInputIncrementField(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, java.lang.String r2, java.lang.String r3, int r4, float r5, float r6, boolean r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r1 = 1
            r0.setIsDegreesField(r1)
            return
    }

    @Override // org.fortheloss.framework.LabelInputIncrementField
    protected void buildField(com.badlogic.gdx.scenes.scene2d.Actor r5, com.badlogic.gdx.scenes.scene2d.ui.TextField r6, com.badlogic.gdx.scenes.scene2d.ui.Table r7) {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r4.defaults()
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expand(r1, r1)
            r0.uniform(r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageAngleSnapStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r0)
            r4.mSnapButton = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.getImageCell()
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1092616192(0x41200000, float:10.0)
            float r3 = r1 * r2
            float r1 = r1 * r2
            r2 = 0
            r0.pad(r2, r3, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4.mSnapButton
            org.fortheloss.framework.DegreesLabelInputIncrementField$1 r1 = new org.fortheloss.framework.DegreesLabelInputIncrementField$1
            r1.<init>(r4)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.add(r5)
            int r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r0 = (float) r0
            r1 = 1063675494(0x3f666666, float:0.9)
            float r0 = r0 * r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r0)
            r0 = 16
            r5.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.add(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r6 = (float) r6
            r1 = 1059313418(0x3f23d70a, float:0.64)
            float r6 = r6 * r1
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.size(r6, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.align(r0)
            r5.spaceRight(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = r4.mSnapButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.add(r5)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r6 = (float) r6
            r0 = 1051931443(0x3eb33333, float:0.35)
            float r6 = r6 * r0
            int r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r0 = (float) r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.size(r6, r0)
            r6 = 8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.align(r6)
            r5.spaceLeft(r2)
            r4.row()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.fillX()
            r6 = 3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.colspan(r6)
            r4.mButtonsCell = r5
            r6 = 0
            r5.setActor(r6)
            return
    }

    @Override // org.fortheloss.framework.LabelInputIncrementField, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mSnapButton = r0
            super.dispose()
            return
    }

    @Override // org.fortheloss.framework.LabelInputIncrementField
    public void setFieldListener(org.fortheloss.framework.LabelInputIncrementField.FieldListener r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.fortheloss.framework.DegreesLabelInputIncrementField.DegreesFieldListener
            if (r0 == 0) goto L8
            super.setFieldListener(r2)
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Listener must be an instance of DegreesFieldListener"
            r2.<init>(r0)
            throw r2
    }
}
