package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class LabelColorInputIncrementField extends org.fortheloss.framework.LabelInputIncrementField {
    private org.fortheloss.framework.ColorPicker mColorPicker;




    public static class ColorFieldListener extends org.fortheloss.framework.LabelInputIncrementField.FieldListener {
        public ColorFieldListener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onColorChange(com.badlogic.gdx.graphics.Color r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: -$$Nest$fgetmColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m166$$Nest$fgetmColorPicker(org.fortheloss.framework.LabelColorInputIncrementField r0) {
            org.fortheloss.framework.ColorPicker r0 = r0.mColorPicker
            return r0
    }

    public LabelColorInputIncrementField(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, java.lang.String r2, java.lang.String r3, int r4, float r5, float r6, boolean r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // org.fortheloss.framework.LabelInputIncrementField
    protected com.badlogic.gdx.scenes.scene2d.Actor createLabel(java.lang.String r13) {
            r12 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0.pad(r1)
            r3 = 1
            r2.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.space(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r2.pad(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandX()
            r2 = 0
            r1.uniform(r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r1.<init>(r13, r4)
            r12.mLabel = r1
            r1.setWrap(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = r12.mLabel
            r13.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = r12.mLabel
            org.fortheloss.framework.LabelColorInputIncrementField$1 r1 = new org.fortheloss.framework.LabelColorInputIncrementField$1
            r1.<init>(r12)
            r13.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = r12.mLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r0.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.fill()
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1101004800(0x41a00000, float:20.0)
            float r1 = r1 * r2
            r13.padLeft(r1)
            r0.row()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r13 = r12.mContextRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r6 = r13.getScreenFBO()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r13 = r12.mContextRef
            org.fortheloss.framework.Assets r13 = r13.getAssets()
            java.lang.String r1 = org.fortheloss.sticknodes.App.colorPickerAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r2 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.Object r13 = r13.get(r1, r2, r3)
            r8 = r13
            com.badlogic.gdx.graphics.g2d.TextureAtlas r8 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r8
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r13 = r12.mContextRef
            org.fortheloss.sticknodes.data.SessionData r11 = r13.getSessionData()
            boolean r10 = r11.getIsLeftHandMode()
            org.fortheloss.framework.LabelColorInputIncrementField$2 r13 = new org.fortheloss.framework.LabelColorInputIncrementField$2
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1092616192(0x41200000, float:10.0)
            float r9 = r1 * r2
            r4 = r13
            r5 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r12.mColorPicker = r13
            org.fortheloss.framework.LabelColorInputIncrementField$3 r1 = new org.fortheloss.framework.LabelColorInputIncrementField$3
            r1.<init>(r12)
            r13.addListener(r1)
            org.fortheloss.framework.ColorPicker r13 = r12.mColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r0.add(r13)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1090519040(0x41000000, float:8.0)
            float r2 = r2 * r3
            float r1 = r1 - r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.expandY()
            r1 = 16
            r13.align(r1)
            return r0
    }

    @Override // org.fortheloss.framework.LabelInputIncrementField, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            org.fortheloss.framework.ColorPicker r0 = r1.mColorPicker
            if (r0 == 0) goto La
            r0.dispose()
            r0 = 0
            r1.mColorPicker = r0
        La:
            super.dispose()
            return
    }

    @Override // org.fortheloss.framework.LabelInputIncrementField
    public void setFieldListener(org.fortheloss.framework.LabelInputIncrementField.FieldListener r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.fortheloss.framework.LabelColorInputIncrementField.ColorFieldListener
            if (r0 == 0) goto L8
            super.setFieldListener(r2)
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Listener must be an instance of ColorFieldListener"
            r2.<init>(r0)
            throw r2
    }

    public void setValue(float r2, com.badlogic.gdx.graphics.Color r3) {
            r1 = this;
            super.setValue(r2)
            org.fortheloss.framework.ColorPicker r2 = r1.mColorPicker
            r0 = 0
            r2.setColor(r3, r0)
            return
    }

    public void setValue(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.framework.ColorPicker r0 = r2.mColorPicker
            r1 = 0
            r0.setColor(r3, r1)
            return
    }
}
