package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class AndroidStorageTransferDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private java.lang.String _exportText;
    private org.fortheloss.sticknodes.animationscreen.ExportingAnimationWidget _exportingAnimationWidget;
    private java.lang.String _labelText;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _transferLabel;


    /* renamed from: -$$Nest$fget_exportText, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m338$$Nest$fget_exportText(org.fortheloss.sticknodes.animationscreen.dialogs.AndroidStorageTransferDialog r0) {
            java.lang.String r0 = r0._exportText
            return r0
    }

    /* renamed from: -$$Nest$fget_exportingAnimationWidget, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.ExportingAnimationWidget m339$$Nest$fget_exportingAnimationWidget(org.fortheloss.sticknodes.animationscreen.dialogs.AndroidStorageTransferDialog r0) {
            org.fortheloss.sticknodes.animationscreen.ExportingAnimationWidget r0 = r0._exportingAnimationWidget
            return r0
    }

    /* renamed from: -$$Nest$fget_labelText, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m340$$Nest$fget_labelText(org.fortheloss.sticknodes.animationscreen.dialogs.AndroidStorageTransferDialog r0) {
            java.lang.String r0 = r0._labelText
            return r0
    }

    /* renamed from: -$$Nest$fget_transferLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Label m341$$Nest$fget_transferLabel(org.fortheloss.sticknodes.animationscreen.dialogs.AndroidStorageTransferDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0._transferLabel
            return r0
    }

    public AndroidStorageTransferDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._transferLabel = r0
            org.fortheloss.sticknodes.animationscreen.ExportingAnimationWidget r1 = r2._exportingAnimationWidget
            if (r1 == 0) goto Lc
            r1.dispose()
            r2._exportingAnimationWidget = r0
        Lc:
            r2._labelText = r0
            r2._exportText = r0
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r4) {
            r3 = this;
            java.lang.String r0 = "storageTransferTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "storageTransferMessage1"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r3.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r0.width(r2)
            r3.addContentRow()
            org.fortheloss.sticknodes.animationscreen.dialogs.AndroidStorageTransferDialog$1 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.AndroidStorageTransferDialog$1
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r3, r4, r2)
            r3._exportingAnimationWidget = r0
            r3.addContent(r0)
            r3.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            java.lang.String r2 = " \n "
            r4.<init>(r2, r0)
            r3._transferLabel = r4
            r0 = 0
            r4.setWrap(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3._transferLabel
            r4.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3._transferLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.addContent(r4)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            r4.width(r0)
            r3._labelText = r2
            java.lang.String r4 = ""
            r3._exportText = r4
            return
    }

    public synchronized void setIsSorting() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "sorting"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)     // Catch: java.lang.Throwable -> Lf
            r1._labelText = r0     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = ""
            r1._exportText = r0     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        Lf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized void setMessage(int r5) {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "storageTransferMessage2"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)     // Catch: java.lang.Throwable -> L1f
            r4._labelText = r0     // Catch: java.lang.Throwable -> L1f
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "%,d"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L1f
            r2[r3] = r5     // Catch: java.lang.Throwable -> L1f
            java.lang.String r5 = java.lang.String.format(r0, r1, r2)     // Catch: java.lang.Throwable -> L1f
            r4._exportText = r5     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r4)
            return
        L1f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public synchronized void setMessage(java.lang.String r9, int r10, int r11) {
            r8 = this;
            monitor-enter(r8)
            int r0 = r9.length()     // Catch: java.lang.Throwable -> L8c
            r1 = 40
            r2 = 0
            if (r0 <= r1) goto L2d
            r0 = 23
            java.lang.String r1 = r9.substring(r2, r0)     // Catch: java.lang.Throwable -> L8c
            int r3 = r9.length()     // Catch: java.lang.Throwable -> L8c
            int r3 = r3 - r0
            java.lang.String r9 = r9.substring(r3)     // Catch: java.lang.Throwable -> L8c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r0.<init>()     // Catch: java.lang.Throwable -> L8c
            r0.append(r1)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = "..."
            r0.append(r1)     // Catch: java.lang.Throwable -> L8c
            r0.append(r9)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L8c
        L2d:
            java.lang.String r0 = "storageTransferMessage3"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L8c
            java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.Throwable -> L8c
            java.lang.String r4 = "%,d"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L8c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L8c
            r6[r2] = r7     // Catch: java.lang.Throwable -> L8c
            java.lang.String r4 = java.lang.String.format(r3, r4, r6)     // Catch: java.lang.Throwable -> L8c
            r1[r2] = r4     // Catch: java.lang.Throwable -> L8c
            java.lang.String r4 = "%,d"
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L8c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L8c
            r6[r2] = r7     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = java.lang.String.format(r3, r4, r6)     // Catch: java.lang.Throwable -> L8c
            r1[r5] = r2     // Catch: java.lang.Throwable -> L8c
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0, r1)     // Catch: java.lang.Throwable -> L8c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r1.<init>()     // Catch: java.lang.Throwable -> L8c
            r1.append(r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r0 = "\n"
            r1.append(r0)     // Catch: java.lang.Throwable -> L8c
            r1.append(r9)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> L8c
            r8._labelText = r9     // Catch: java.lang.Throwable -> L8c
            float r9 = (float) r10     // Catch: java.lang.Throwable -> L8c
            float r10 = (float) r11     // Catch: java.lang.Throwable -> L8c
            float r9 = r9 / r10
            r10 = 1120403456(0x42c80000, float:100.0)
            float r9 = r9 * r10
            int r9 = (int) r9     // Catch: java.lang.Throwable -> L8c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r10.<init>()     // Catch: java.lang.Throwable -> L8c
            r10.append(r9)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r9 = "%"
            r10.append(r9)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L8c
            r8._exportText = r9     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r8)
            return
        L8c:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }
}
