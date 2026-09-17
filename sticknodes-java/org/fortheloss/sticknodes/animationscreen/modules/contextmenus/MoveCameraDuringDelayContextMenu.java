package org.fortheloss.sticknodes.animationscreen.modules.contextmenus;

/* loaded from: classes2.dex */
public class MoveCameraDuringDelayContextMenu extends org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu {
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _easeInButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _easeOutButton;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable _frameToolTableRef;
    private boolean _ignoreNextInterpolationChangeEvent;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _infoLabel;
    private org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> _interpolationSelectBox;




    /* renamed from: -$$Nest$fget_ignoreNextInterpolationChangeEvent, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m843$$Nest$fget_ignoreNextInterpolationChangeEvent(org.fortheloss.sticknodes.animationscreen.modules.contextmenus.MoveCameraDuringDelayContextMenu r0) {
            boolean r0 = r0._ignoreNextInterpolationChangeEvent
            return r0
    }

    /* renamed from: -$$Nest$monPropertiesChange, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m844$$Nest$monPropertiesChange(org.fortheloss.sticknodes.animationscreen.modules.contextmenus.MoveCameraDuringDelayContextMenu r0) {
            r0.onPropertiesChange()
            return
    }

    public MoveCameraDuringDelayContextMenu(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r8, com.badlogic.gdx.scenes.scene2d.utils.Drawable r9) {
            r7 = this;
            r7.<init>(r9)
            r9 = 0
            r7._ignoreNextInterpolationChangeEvent = r9
            r7._frameToolTableRef = r8
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = "moveCameraDuringDelayInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r2)
            r8.<init>(r0, r1)
            r7._infoLabel = r8
            r0 = 1
            r8.setWrap(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = r7._infoLabel
            r8.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = r7._infoLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.add(r8)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.width(r1)
            r1 = 2
            r8.colspan(r1)
            r7.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "easeIn"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r8.<init>(r3, r4)
            r7.add(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "easeOut"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r8.<init>(r3, r4)
            r7.add(r8)
            r7.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r8)
            r7._easeInButton = r8
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.MoveCameraDuringDelayContextMenu$1 r3 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.MoveCameraDuringDelayContextMenu$1
            r3.<init>(r7)
            r8.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r7._easeInButton
            r7.add(r8)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r8)
            r7._easeOutButton = r8
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.MoveCameraDuringDelayContextMenu$2 r3 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.MoveCameraDuringDelayContextMenu$2
            r3.<init>(r7)
            r8.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r7._easeOutButton
            r7.add(r8)
            r7.row()
            org.fortheloss.framework.SelectBoxCustomItemHeight r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createSelectBox()
            r7._interpolationSelectBox = r8
            r3 = 5
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r4 = "interpolationEase"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = " v1"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r3[r9] = r5
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            java.lang.String r9 = " v2"
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            r3[r0] = r9
            java.lang.String r9 = "interpolationBounce"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            r3[r1] = r9
            java.lang.String r9 = "interpolationElastic"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            r0 = 3
            r3[r0] = r9
            java.lang.String r9 = "interpolationSwing"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            r0 = 4
            r3[r0] = r9
            r8.setItems(r3)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r8 = r7._interpolationSelectBox
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.MoveCameraDuringDelayContextMenu$3 r9 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.MoveCameraDuringDelayContextMenu$3
            r9.<init>(r7)
            r8.addListener(r9)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r8 = r7._interpolationSelectBox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.add(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.colspan(r1)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r9 = (float) r9
            float r9 = r9 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.width(r9)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r9 = (float) r9
            r8.height(r9)
            r7.row()
            r7.pack()
            return
    }

    private int getIndexFromInterpolationID(int r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 1
            if (r2 != r0) goto L8
            return r0
        L8:
            r0 = 2
            if (r2 != r0) goto Lc
            return r0
        Lc:
            r0 = 3
            if (r2 != r0) goto L10
            return r0
        L10:
            r0 = 4
            if (r2 != r0) goto L14
            return r0
        L14:
            r2 = -1
            return r2
    }

    private short getInterpolationIDFromIndex(int r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 1
            if (r2 != r0) goto L8
            return r0
        L8:
            r0 = 2
            if (r2 != r0) goto Lc
            return r0
        Lc:
            r0 = 3
            if (r2 != r0) goto L10
            return r0
        L10:
            r0 = 4
            if (r2 != r0) goto L14
            return r0
        L14:
            r2 = -1
            return r2
    }

    private void onPropertiesChange() {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0 = r4._frameToolTableRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r4._easeInButton
            boolean r1 = r1.isChecked()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r4._easeOutButton
            boolean r2 = r2.isChecked()
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r3 = r4._interpolationSelectBox
            int r3 = r3.getSelectedIndex()
            short r3 = r4.getInterpolationIDFromIndex(r3)
            r0.setCameraMoveDuringDelayProperties(r1, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._easeInButton
            boolean r0 = r0.isChecked()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L42
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4._easeOutButton
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L42
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r4._interpolationSelectBox
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r2)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r4._interpolationSelectBox
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r4._interpolationSelectBox
            r1 = 1
            r0.setDisabled(r1)
            goto L54
        L42:
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r4._interpolationSelectBox
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r2)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r4._interpolationSelectBox
            r0.setColor(r1, r1, r1, r1)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r4._interpolationSelectBox
            r1 = 0
            r0.setDisabled(r1)
        L54:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._frameToolTableRef = r0
            r1._infoLabel = r0
            r1._easeInButton = r0
            r1._easeOutButton = r0
            r1._interpolationSelectBox = r0
            super.dispose()
            return
    }

    public void update(org.fortheloss.sticknodes.data.FrameData r4) {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._easeInButton
            boolean r1 = r4.getCameraMoveDuringDelayEaseIn()
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._easeOutButton
            boolean r1 = r4.getCameraMoveDuringDelayEaseOut()
            r0.setChecked(r1)
            short r4 = r4.getCameraMoveDuringDelayInterpolationID()
            int r4 = r3.getIndexFromInterpolationID(r4)
            r0 = 1
            r3._ignoreNextInterpolationChangeEvent = r0
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L27
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r4 = r3._interpolationSelectBox
            r4.setSelectedIndex(r1)
            goto L2c
        L27:
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r2 = r3._interpolationSelectBox
            r2.setSelectedIndex(r4)
        L2c:
            r3._ignoreNextInterpolationChangeEvent = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r3._easeInButton
            boolean r4 = r4.isChecked()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L54
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r3._easeOutButton
            boolean r4 = r4.isChecked()
            if (r4 != 0) goto L54
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r4 = r3._interpolationSelectBox
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r4.setTouchable(r1)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r4 = r3._interpolationSelectBox
            r4.setDisabled(r0)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r4 = r3._interpolationSelectBox
            r0 = 1056964608(0x3f000000, float:0.5)
            r4.setColor(r2, r2, r2, r0)
            goto L65
        L54:
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r4 = r3._interpolationSelectBox
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r4.setTouchable(r0)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r4 = r3._interpolationSelectBox
            r4.setColor(r2, r2, r2, r2)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r4 = r3._interpolationSelectBox
            r4.setDisabled(r1)
        L65:
            return
    }
}
