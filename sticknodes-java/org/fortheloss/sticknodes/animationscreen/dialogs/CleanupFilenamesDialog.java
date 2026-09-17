package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class CleanupFilenamesDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private java.util.ArrayList<java.lang.String> mExtraPermanentFilenames;
    private org.fortheloss.framework.ListCustomItemHeight<java.lang.String> mList;
    private com.badlogic.gdx.utils.Array<java.lang.String> mOriginalList;
    private int mState;
    private java.util.Map<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> mWidgets;








    private static class CheckboxToggleTouchableChangeListener extends com.badlogic.gdx.scenes.scene2d.utils.ChangeListener {
        private CheckboxToggleTouchableChangeListener() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ CheckboxToggleTouchableChangeListener(org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog.CheckboxToggleTouchableChangeListenerIA r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.ChangeListener
        public void changed(com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent r6, com.badlogic.gdx.scenes.scene2d.Actor r7) {
                r5 = this;
                boolean r6 = r7 instanceof com.badlogic.gdx.scenes.scene2d.ui.CheckBox
                if (r6 != 0) goto L5
                return
            L5:
                r6 = r7
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r6
                java.lang.Object r0 = r6.getUserObject()
                boolean r0 = r0 instanceof com.badlogic.gdx.scenes.scene2d.Actor
                r1 = 1056964608(0x3f000000, float:0.5)
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r0 == 0) goto L32
                java.lang.Object r7 = r7.getUserObject()
                com.badlogic.gdx.scenes.scene2d.Actor r7 = (com.badlogic.gdx.scenes.scene2d.Actor) r7
                boolean r6 = r6.isChecked()
                if (r6 == 0) goto L29
                com.badlogic.gdx.scenes.scene2d.Touchable r6 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
                r7.setTouchable(r6)
                r7.setColor(r2, r2, r2, r2)
                goto L61
            L29:
                com.badlogic.gdx.scenes.scene2d.Touchable r6 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
                r7.setTouchable(r6)
                r7.setColor(r2, r2, r2, r1)
                goto L61
            L32:
                java.lang.Object r7 = r6.getUserObject()
                boolean r7 = r7 instanceof com.badlogic.gdx.scenes.scene2d.Actor[]
                if (r7 == 0) goto L61
                java.lang.Object r7 = r6.getUserObject()
                com.badlogic.gdx.scenes.scene2d.Actor[] r7 = (com.badlogic.gdx.scenes.scene2d.Actor[]) r7
                int r0 = r7.length
                int r0 = r0 + (-1)
            L43:
                if (r0 < 0) goto L61
                r3 = r7[r0]
                boolean r4 = r6.isChecked()
                if (r4 == 0) goto L56
                com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
                r3.setTouchable(r4)
                r3.setColor(r2, r2, r2, r2)
                goto L5e
            L56:
                com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
                r3.setTouchable(r4)
                r3.setColor(r2, r2, r2, r1)
            L5e:
                int r0 = r0 + (-1)
                goto L43
            L61:
                return
        }
    }

    /* compiled from: R8$$SyntheticClass */
    /* renamed from: org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$CheckboxToggleTouchableChangeListener-IA, reason: invalid class name */
    public final /* synthetic */ class CheckboxToggleTouchableChangeListenerIA {
    }

    private class SetPreviewStateChangeListener extends com.badlogic.gdx.scenes.scene2d.utils.ChangeListener {
        final /* synthetic */ org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog this$0;

        private SetPreviewStateChangeListener(org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ SetPreviewStateChangeListener(org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog r1, org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog.SetPreviewStateChangeListenerIA r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.utils.ChangeListener
        public void changed(com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent r1, com.badlogic.gdx.scenes.scene2d.Actor r2) {
                r0 = this;
                org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog r1 = r0.this$0
                r2 = 0
                org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog.m370$$Nest$msetState(r1, r2)
                return
        }
    }

    /* compiled from: R8$$SyntheticClass */
    /* renamed from: org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener-IA, reason: invalid class name */
    public final /* synthetic */ class SetPreviewStateChangeListenerIA {
    }

    /* renamed from: -$$Nest$fgetmList, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ListCustomItemHeight m369$$Nest$fgetmList(org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog r0) {
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r0.mList
            return r0
    }

    /* renamed from: -$$Nest$msetState, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m370$$Nest$msetState(org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog r0, int r1) {
            r0.setState(r1)
            return
    }

    public CleanupFilenamesDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = -1
            r0.mState = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mExtraPermanentFilenames = r1
            return
    }

    private java.lang.String addPost(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private java.lang.String addPre(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private boolean applyChanges(com.badlogic.gdx.utils.Array<java.lang.String> r18, java.util.ArrayList<java.lang.Integer> r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.TextField> r3 = com.badlogic.gdx.scenes.scene2d.ui.TextField.class
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.CheckBox> r4 = com.badlogic.gdx.scenes.scene2d.ui.CheckBox.class
            int r5 = r19.size()
            r6 = 1
            int r5 = r5 - r6
            r7 = 0
            r8 = 0
        L12:
            if (r5 < 0) goto L102
            java.lang.Object r9 = r2.get(r5)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r10 = r1.get(r9)
            java.lang.String r10 = (java.lang.String) r10
            com.badlogic.gdx.scenes.scene2d.Actor r11 = r0.getWidget(r7, r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r11 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r11
            boolean r11 = r11.isChecked()
            if (r11 == 0) goto L3f
            com.badlogic.gdx.scenes.scene2d.Actor r11 = r0.getWidget(r6, r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r11 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r11
            boolean r11 = r11.isChecked()
            java.lang.String r11 = r0.removePrefixes(r10, r11)
            goto L40
        L3f:
            r11 = r10
        L40:
            r12 = 2
            com.badlogic.gdx.scenes.scene2d.Actor r12 = r0.getWidget(r12, r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r12
            boolean r12 = r12.isChecked()
            if (r12 == 0) goto L51
            java.lang.String r11 = r0.removeTrailingNumbers(r11)
        L51:
            r12 = 3
            com.badlogic.gdx.scenes.scene2d.Actor r12 = r0.getWidget(r12, r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r12
            boolean r12 = r12.isChecked()
            if (r12 == 0) goto L6e
            r12 = 4
            com.badlogic.gdx.scenes.scene2d.Actor r12 = r0.getWidget(r12, r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r12
            boolean r12 = r12.isChecked()
            r12 = r12 ^ r6
            java.lang.String r11 = r0.capitalize(r11, r12)
        L6e:
            r12 = 5
            com.badlogic.gdx.scenes.scene2d.Actor r12 = r0.getWidget(r12, r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r12
            boolean r12 = r12.isChecked()
            if (r12 == 0) goto L7f
            java.lang.String r11 = r0.trimExcessSpaces(r11)
        L7f:
            r12 = 6
            com.badlogic.gdx.scenes.scene2d.Actor r12 = r0.getWidget(r12, r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r12
            boolean r12 = r12.isChecked()
            if (r12 == 0) goto L9c
            r12 = 10
            com.badlogic.gdx.scenes.scene2d.Actor r12 = r0.getWidget(r12, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r12 = (com.badlogic.gdx.scenes.scene2d.ui.TextField) r12
            java.lang.String r12 = r12.getText()
            java.lang.String r11 = r0.addPre(r11, r12)
        L9c:
            r12 = 7
            com.badlogic.gdx.scenes.scene2d.Actor r12 = r0.getWidget(r12, r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r12
            boolean r12 = r12.isChecked()
            if (r12 == 0) goto Lb9
            r12 = 11
            com.badlogic.gdx.scenes.scene2d.Actor r12 = r0.getWidget(r12, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r12 = (com.badlogic.gdx.scenes.scene2d.ui.TextField) r12
            java.lang.String r12 = r12.getText()
            java.lang.String r11 = r0.addPost(r11, r12)
        Lb9:
            r12 = 8
            com.badlogic.gdx.scenes.scene2d.Actor r12 = r0.getWidget(r12, r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r12
            boolean r12 = r12.isChecked()
            if (r12 == 0) goto Lf4
            r12 = 9
            com.badlogic.gdx.scenes.scene2d.Actor r12 = r0.getWidget(r12, r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r12
            boolean r12 = r12.isChecked()
            if (r12 == 0) goto Le2
            r12 = 13
            com.badlogic.gdx.scenes.scene2d.Actor r12 = r0.getWidget(r12, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r12 = (com.badlogic.gdx.scenes.scene2d.ui.TextField) r12
            java.lang.String r12 = r12.getText()
            goto Le4
        Le2:
            java.lang.String r12 = ""
        Le4:
            r13 = 12
            com.badlogic.gdx.scenes.scene2d.Actor r13 = r0.getWidget(r13, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r13 = (com.badlogic.gdx.scenes.scene2d.ui.TextField) r13
            java.lang.String r13 = r13.getText()
            java.lang.String r11 = r0.replace(r11, r13, r12)
        Lf4:
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto Lfe
            r1.set(r9, r11)
            r8 = 1
        Lfe:
            int r5 = r5 + (-1)
            goto L12
        L102:
            if (r8 != 0) goto L105
            return r7
        L105:
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$7 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$7
            r3.<init>(r0)
            java.util.Collections.sort(r2, r3)
            int r3 = r19.size()
            r4 = 0
        L112:
            if (r4 >= r3) goto L1a3
            java.lang.Object r5 = r2.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r8 = r1.get(r5)
            java.lang.String r8 = (java.lang.String) r8
            java.util.ArrayList<java.lang.String> r9 = r0.mExtraPermanentFilenames
            int r9 = r9.size()
            r11 = r8
            r10 = 0
            r12 = 1
        L12d:
            java.lang.String r13 = ")"
            java.lang.String r14 = " ("
            if (r10 >= r9) goto L166
            java.util.ArrayList<java.lang.String> r15 = r0.mExtraPermanentFilenames
            java.lang.Object r15 = r15.get(r10)
            java.lang.String r15 = (java.lang.String) r15
            boolean r16 = r11.equalsIgnoreCase(r15)
            if (r16 == 0) goto L164
        L141:
            boolean r10 = r11.equalsIgnoreCase(r15)
            if (r10 == 0) goto L160
            int r10 = r12 + 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r8)
            r11.append(r14)
            r11.append(r12)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            r12 = r10
            goto L141
        L160:
            r1.set(r5, r11)
            r10 = 0
        L164:
            int r10 = r10 + r6
            goto L12d
        L166:
            int r9 = r1.size
            r10 = 0
        L169:
            if (r10 >= r9) goto L19f
            java.lang.Object r15 = r1.get(r10)
            java.lang.String r15 = (java.lang.String) r15
            if (r10 != r5) goto L174
            goto L19d
        L174:
            boolean r16 = r11.equalsIgnoreCase(r15)
            if (r16 == 0) goto L19d
        L17a:
            boolean r10 = r11.equalsIgnoreCase(r15)
            if (r10 == 0) goto L199
            int r10 = r12 + 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r8)
            r11.append(r14)
            r11.append(r12)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            r12 = r10
            goto L17a
        L199:
            r1.set(r5, r11)
            r10 = 0
        L19d:
            int r10 = r10 + r6
            goto L169
        L19f:
            int r4 = r4 + 1
            goto L112
        L1a3:
            return r6
    }

    private java.lang.String capitalize(java.lang.String r11, boolean r12) {
            r10 = this;
            r0 = 0
            if (r12 == 0) goto L3b
            int r12 = r11.length()     // Catch: java.lang.Exception -> La1
            r1 = 1
            if (r12 <= r1) goto L26
            char r12 = r11.charAt(r0)     // Catch: java.lang.Exception -> La1
            char r12 = java.lang.Character.toUpperCase(r12)     // Catch: java.lang.Exception -> La1
            java.lang.String r0 = r11.substring(r1)     // Catch: java.lang.Exception -> La1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La1
            r1.<init>()     // Catch: java.lang.Exception -> La1
            r1.append(r12)     // Catch: java.lang.Exception -> La1
            r1.append(r0)     // Catch: java.lang.Exception -> La1
            java.lang.String r11 = r1.toString()     // Catch: java.lang.Exception -> La1
            goto L3a
        L26:
            char r12 = r11.charAt(r0)     // Catch: java.lang.Exception -> La1
            char r12 = java.lang.Character.toUpperCase(r12)     // Catch: java.lang.Exception -> La1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La1
            r0.<init>()     // Catch: java.lang.Exception -> La1
            r0.append(r12)     // Catch: java.lang.Exception -> La1
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Exception -> La1
        L3a:
            return r11
        L3b:
            java.lang.String r12 = r11.trim()     // Catch: java.lang.Exception -> La1
            java.lang.String r1 = ""
            java.lang.String r2 = "\\s+"
            java.lang.String[] r12 = r12.split(r2)     // Catch: java.lang.Exception -> La1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La1
            r2.<init>()     // Catch: java.lang.Exception -> La1
            int r3 = r12.length     // Catch: java.lang.Exception -> La1
            r4 = 0
        L4e:
            if (r4 >= r3) goto L9c
            r5 = r12[r4]     // Catch: java.lang.Exception -> La1
            r2.append(r1)     // Catch: java.lang.Exception -> La1
            java.lang.String r1 = " "
            int r6 = r5.length()     // Catch: java.lang.Exception -> La1
            r7 = 0
        L5c:
            if (r7 >= r6) goto L99
            char r8 = r5.charAt(r7)     // Catch: java.lang.Exception -> La1
            boolean r9 = java.lang.Character.isDigit(r8)     // Catch: java.lang.Exception -> La1
            if (r9 != 0) goto L96
            r9 = 45
            if (r8 != r9) goto L6d
            goto L96
        L6d:
            boolean r9 = java.lang.Character.isLetter(r8)     // Catch: java.lang.Exception -> La1
            if (r9 == 0) goto L93
            if (r7 == 0) goto L7c
            java.lang.String r6 = r5.substring(r0, r7)     // Catch: java.lang.Exception -> La1
            r2.append(r6)     // Catch: java.lang.Exception -> La1
        L7c:
            char r6 = java.lang.Character.toUpperCase(r8)     // Catch: java.lang.Exception -> La1
            r2.append(r6)     // Catch: java.lang.Exception -> La1
            int r7 = r7 + 1
            int r6 = r5.length()     // Catch: java.lang.Exception -> La1
            if (r7 >= r6) goto L99
            java.lang.String r5 = r5.substring(r7)     // Catch: java.lang.Exception -> La1
            r2.append(r5)     // Catch: java.lang.Exception -> La1
            goto L99
        L93:
            int r7 = r7 + 1
            goto L5c
        L96:
            r2.append(r5)     // Catch: java.lang.Exception -> La1
        L99:
            int r4 = r4 + 1
            goto L4e
        L9c:
            java.lang.String r11 = r2.toString()     // Catch: java.lang.Exception -> La1
            return r11
        La1:
            r12 = move-exception
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            r0.logNonFatalException(r12)
            return r11
    }

    private <T extends com.badlogic.gdx.scenes.scene2d.Actor> T getWidget(int r3, java.lang.Class<T> r4) {
            r2 = this;
            java.util.Map<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r0 = r2.mWidgets
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            com.badlogic.gdx.scenes.scene2d.Actor r0 = (com.badlogic.gdx.scenes.scene2d.Actor) r0
            if (r0 == 0) goto L15
            java.lang.Object r3 = r4.cast(r0)
            com.badlogic.gdx.scenes.scene2d.Actor r3 = (com.badlogic.gdx.scenes.scene2d.Actor) r3
            return r3
        L15:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Widget ("
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ") is null"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    private void previewChanges() {
            r8 = this;
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.CheckBox> r0 = com.badlogic.gdx.scenes.scene2d.ui.CheckBox.class
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r2 = r8.mList
            com.badlogic.gdx.utils.Array r2 = r2.getItems()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r3 = r8.mList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r3 = r3.getSelection()
            com.badlogic.gdx.utils.OrderedSet r3 = r3.items()
            com.badlogic.gdx.utils.OrderedSet$OrderedSetIterator r3 = r3.iterator()
        L1b:
            boolean r4 = r3.hasNext
            r5 = 0
            if (r4 == 0) goto L38
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r2.indexOf(r4, r5)
            if (r4 < 0) goto L1b
            int r5 = r2.size
            if (r4 >= r5) goto L1b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
            goto L1b
        L38:
            boolean r3 = r8.applyChanges(r2, r1)
            if (r3 == 0) goto L77
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r3 = r8.mList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r3 = r3.getSelection()
            r3.clear()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r3 = r8.mList
            r3.setItems(r2)
            int r3 = r1.size()
            r4 = 0
        L51:
            if (r4 >= r3) goto L6f
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r6 = r8.mList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r6 = r6.getSelection()
            java.lang.Object r7 = r1.get(r4)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r7 = r2.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            r6.choose(r7)
            int r4 = r4 + 1
            goto L51
        L6f:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r8.getDialogScrollPane()
            r2 = 0
            r1.setScrollY(r2)
        L77:
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r8.getWidget(r5, r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r1
            r1.setChecked(r5)
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r8.getWidget(r1, r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r2
            r2.setChecked(r5)
            r2 = 2
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r8.getWidget(r2, r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r2
            r2.setChecked(r5)
            r2 = 3
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r8.getWidget(r2, r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r2
            r2.setChecked(r5)
            r2 = 4
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r8.getWidget(r2, r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r2
            r2.setChecked(r5)
            r2 = 5
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r8.getWidget(r2, r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r2
            r2.setChecked(r5)
            r2 = 6
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r8.getWidget(r2, r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r2
            r2.setChecked(r5)
            r2 = 7
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r8.getWidget(r2, r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r2
            r2.setChecked(r5)
            r2 = 8
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r8.getWidget(r2, r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r2
            r2.setChecked(r5)
            r2 = 9
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r8.getWidget(r2, r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r0
            r0.setChecked(r5)
            r8.setState(r1)
            return
    }

    private java.lang.String removePrefixes(java.lang.String r5, boolean r6) {
            r4 = this;
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Exception -> L49
            r0 = 32
            int r0 = r5.indexOf(r0)     // Catch: java.lang.Exception -> L49
            r1 = -1
            if (r0 != r1) goto L13
            int r0 = r5.length()     // Catch: java.lang.Exception -> L49
            int r0 = r0 + (-1)
        L13:
            r2 = 95
            int r0 = r5.lastIndexOf(r2, r0)     // Catch: java.lang.Exception -> L49
            if (r0 == r1) goto L48
            int r3 = r5.length()     // Catch: java.lang.Exception -> L49
            int r3 = r3 + (-1)
            if (r0 != r3) goto L24
            goto L48
        L24:
            if (r6 == 0) goto L32
            r6 = 0
            java.lang.String r6 = r5.substring(r6, r0)     // Catch: java.lang.Exception -> L49
            int r0 = r6.lastIndexOf(r2)     // Catch: java.lang.Exception -> L49
            if (r0 != r1) goto L32
            return r5
        L32:
            int r0 = r0 + 1
            java.lang.String r6 = r5.substring(r0)     // Catch: java.lang.Exception -> L49
            int r0 = r6.length()     // Catch: java.lang.Exception -> L49
            if (r0 <= 0) goto L48
            java.lang.String r0 = "^.*[a-zA-Z0-9]+.*$"
            boolean r0 = r6.matches(r0)     // Catch: java.lang.Exception -> L49
            if (r0 != 0) goto L47
            goto L48
        L47:
            return r6
        L48:
            return r5
        L49:
            r6 = move-exception
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            r0.logNonFatalException(r6)
            return r5
    }

    private java.lang.String removeTrailingNumbers(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "(?<=[a-zA-Z\\s()])(\\s*\\(*\\d[\\s\\d()_]*)$"
            java.lang.String r1 = ""
            java.lang.String r0 = r3.replaceAll(r0, r1)     // Catch: java.lang.Exception -> L19
            int r1 = r0.length()
            if (r1 <= 0) goto L18
            java.lang.String r1 = "^.*[a-zA-Z0-9]+.*$"
            boolean r1 = r0.matches(r1)
            if (r1 != 0) goto L17
            goto L18
        L17:
            return r0
        L18:
            return r3
        L19:
            r0 = move-exception
            r0.printStackTrace()
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            r1.logNonFatalException(r0)
            return r3
    }

    private java.lang.String replace(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            if (r3 == 0) goto L1d
            int r0 = r3.length()
            if (r0 != 0) goto L9
            goto L1d
        L9:
            java.lang.String r3 = r2.replace(r3, r4)
            int r4 = r3.length()
            if (r4 <= 0) goto L1d
            java.lang.String r4 = "^.*[a-zA-Z0-9]+.*$"
            boolean r4 = r3.matches(r4)
            if (r4 != 0) goto L1c
            goto L1d
        L1c:
            return r3
        L1d:
            return r2
    }

    private void setState(int r4) {
            r3 = this;
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.TextButton> r0 = com.badlogic.gdx.scenes.scene2d.ui.TextButton.class
            int r1 = r3.mState
            if (r1 != r4) goto L7
            return
        L7:
            r3.mState = r4
            r1 = 14
            if (r4 != 0) goto L1d
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r3.getWidget(r1, r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = (com.badlogic.gdx.scenes.scene2d.ui.TextButton) r4
            java.lang.String r0 = "previewChanges"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r4.setText(r0)
            goto L40
        L1d:
            r2 = 1
            if (r4 != r2) goto L40
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r3.getWidget(r1, r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = (com.badlogic.gdx.scenes.scene2d.ui.TextButton) r4
            java.lang.String r0 = "apply"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "< "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.setText(r0)
        L40:
            return
    }

    private java.lang.String trimExcessSpaces(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = r4.trim()     // Catch: java.lang.Exception -> L1d
            java.lang.String r1 = "\\s+"
            java.lang.String r2 = " "
            java.lang.String r0 = r0.replaceAll(r1, r2)     // Catch: java.lang.Exception -> L1d
            int r1 = r0.length()
            if (r1 <= 0) goto L1c
            java.lang.String r1 = "^.*[a-zA-Z0-9]+.*$"
            boolean r1 = r0.matches(r1)
            if (r1 != 0) goto L1b
            goto L1c
        L1b:
            return r0
        L1c:
            return r4
        L1d:
            r0 = move-exception
            r0.printStackTrace()
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            r1.logNonFatalException(r0)
            return r4
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r3) {
            r2 = this;
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L9
            goto L27
        L9:
            r0 = 1
            if (r3 != r0) goto L27
            int r3 = r2.mState
            if (r3 != 0) goto L17
            r2.previewChanges()
            r2.doNotHideDialog()
            goto L27
        L17:
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r3 = r2.mList
            com.badlogic.gdx.utils.Array r3 = r3.getItems()
            com.badlogic.gdx.utils.Array<java.lang.String> r1 = r2.mOriginalList
            boolean r1 = r1.equals(r3)
            r0 = r0 ^ r1
            r2.onComplete(r0, r3)
        L27:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mWidgets = r0
            r1.mOriginalList = r0
            r1.mExtraPermanentFilenames = r0
            r1.mList = r0
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.utils.Array<java.lang.String> r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.CheckBox> r2 = com.badlogic.gdx.scenes.scene2d.ui.CheckBox.class
            java.lang.String r3 = "cleanupNamesTitle"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            super.initialize(r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r0._animationScreenRef
            org.fortheloss.framework.Assets r3 = r3.getAssets()
            java.lang.String r4 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r5 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r6 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Object r3 = r3.get(r4, r5, r6)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r3 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r3
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r0.mWidgets = r4
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "cleanupNamesInfo"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r5, r8)
            r4.setWrap(r6)
            r4.setAlignment(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.addContent(r4)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            r4.width(r5)
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r5 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r3.findRegion(r5)
            r4.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.addContent(r4)
            r8 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r8)
            int r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r9 = (float) r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.padTop(r9)
            r4.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = "cleanupNames1"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "1) "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = ":"
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r11.<init>(r12)
            r4.<init>(r10, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r10 = r4.getStyle()
            com.badlogic.gdx.graphics.Color r10 = r10.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r11 = r11.fontColor
            r10.set(r11)
            r4.setWrap(r6)
            r4.setAlignment(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.addContent(r4)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            r4.width(r10)
            r17.addContentRow()
            com.badlogic.gdx.utils.Array r4 = new com.badlogic.gdx.utils.Array
            r4.<init>(r1)
            r0.mOriginalList = r4
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallPreviewImageButtonStyle()
            r4.<init>(r10)
            org.fortheloss.framework.ListCustomItemHeight r10 = new org.fortheloss.framework.ListCustomItemHeight
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogListStyle()
            float r12 = r4.getHeight()
            int r13 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r13 = (float) r13
            float r4 = r4.getWidth()
            r14 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r14
            float r13 = r13 - r4
            r4 = 1063675494(0x3f666666, float:0.9)
            float r13 = r13 * r4
            r10.<init>(r11, r12, r13)
            r0.mList = r10
            r10.setItems(r1)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r4 = r0.mList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r4 = r4.getSelection()
            r4.setMultiple(r6)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r4 = r0.mList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r4 = r4.getSelection()
            r4.setToggle(r6)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r4 = r0.mList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r4 = r4.getSelection()
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r4.setRangeSelect(r10)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r4 = r0.mList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r4 = r4.getSelection()
            r4.setRequired(r10)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r4 = r0.mList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r4 = r4.getSelection()
            r4.clear()
            int r4 = r1.size
            int r4 = r4 - r6
        L12a:
            if (r4 < 0) goto L13e
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r12 = r0.mList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r12 = r12.getSelection()
            java.lang.Object r13 = r1.get(r4)
            java.lang.String r13 = (java.lang.String) r13
            r12.choose(r13)
            int r4 = r4 + (-1)
            goto L12a
        L13e:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r4 = r0.mList
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneStyle()
            r1.<init>(r4, r12)
            r1.setFadeScrollBars(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.addContent(r1)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.width(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
            float r4 = (float) r4
            r12 = 1061158912(0x3f400000, float:0.75)
            float r4 = r4 * r12
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.height(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.uniform(r10, r10)
            r4 = 8
            r1.align(r4)
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.uniform(r10, r10)
            r12.expand(r10, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r0.addContent(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.expandX()
            r12.fillX()
            r17.addContentRow()
            java.lang.String r12 = "selectAll"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r12 = r0.createTextButton(r12, r13)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$1 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$1
            r13.<init>(r0)
            r12.addListener(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r1.add(r12)
            r13 = 16
            r12.align(r13)
            java.lang.String r12 = "clear"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r12 = r0.createTextButton(r12, r13)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$2 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$2
            r13.<init>(r0)
            r12.addListener(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r12)
            r1.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r3.findRegion(r5)
            r1.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.addContent(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r8)
            int r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r12 = (float) r12
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r12)
            r1.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r12 = "cleanupNames2"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "2) "
            r13.append(r14)
            r13.append(r12)
            r13.append(r9)
            java.lang.String r9 = r13.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r12 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r12.<init>(r13)
            r1.<init>(r9, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = r1.getStyle()
            com.badlogic.gdx.graphics.Color r9 = r9.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r12 = r12.fontColor
            r9.set(r12)
            r1.setWrap(r6)
            r1.setAlignment(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.addContent(r1)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r9 = (float) r9
            r1.width(r9)
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.uniform(r10, r10)
            r9.expand(r10, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r0.addContent(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.expandX()
            r9.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r3.findRegion(r5)
            r9.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r0.addContent(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.colspan(r8)
            int r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r12 = (float) r12
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.padTop(r12)
            r9.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r9)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$CheckboxToggleTouchableChangeListener r12 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$CheckboxToggleTouchableChangeListener
            r13 = 0
            r12.<init>(r13)
            r9.addListener(r12)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener r12 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener
            r12.<init>(r0, r13)
            r9.addListener(r12)
            java.util.Map<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r12 = r0.mWidgets
            r12.put(r11, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r1.add(r9)
            r14 = 10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.align(r14)
            float r15 = r9.getWidth()
            r12.width(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r12.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.uniform(r10, r10)
            r15.expand(r10, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandX()
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "cleanupNames3"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r15)
            java.lang.String r15 = "\n(pre_pre_name) -> (name)"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r14, r15)
            r1.setWrap(r6)
            r1.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r12.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r8)
            float r14 = r9.getHeight()
            r1.minHeight(r14)
            r12.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.uniform(r10, r10)
            r14.expand(r10, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.expandX()
            r12.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r12)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener r14 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener
            r14.<init>(r0, r13)
            r12.addListener(r14)
            java.util.Map<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r14 = r0.mWidgets
            r14.put(r7, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r1.add(r12)
            r14 = 10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.align(r14)
            float r9 = r9.getWidth()
            r12.width(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r12 = "cleanupNames4"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            java.lang.String r12 = "\n(pre_pre_name) -> (pre_name)"
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r14 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r12, r14)
            r9.setWrap(r6)
            r9.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r1.add(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.expandX()
            r9.fillX()
            com.badlogic.gdx.scenes.scene2d.Touchable r9 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r1.setTouchable(r9)
            r12 = 1065353216(0x3f800000, float:1.0)
            r14 = 1056964608(0x3f000000, float:0.5)
            r1.setColor(r12, r12, r12, r14)
            com.badlogic.gdx.scenes.scene2d.Actor r15 = r0.getWidget(r10, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r15 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r15
            r15.setUserObject(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.uniform(r10, r10)
            r15.expand(r10, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r0.addContent(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.expandX()
            r15.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r15 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r3.findRegion(r5)
            r15.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r0.addContent(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.colspan(r8)
            int r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r15 = (float) r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.padTop(r15)
            r12.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r12)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener r15 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener
            r15.<init>(r0, r13)
            r12.addListener(r15)
            java.util.Map<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r15 = r0.mWidgets
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            r15.put(r14, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r1.add(r12)
            r15 = 10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.align(r15)
            float r12 = r12.getWidth()
            r14.width(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label r12 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r14 = "cleanupNames5"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r14)
            java.lang.String r14 = "\n(name (1), name 1) -> (name)"
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r12.<init>(r14, r15)
            r12.setWrap(r6)
            r12.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandX()
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.uniform(r10, r10)
            r12.expand(r10, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r0.addContent(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.expandX()
            r12.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r12 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r3.findRegion(r5)
            r12.<init>(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r0.addContent(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.colspan(r8)
            int r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r14 = (float) r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.padTop(r14)
            r12.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r12)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener r14 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener
            r14.<init>(r0, r13)
            r12.addListener(r14)
            java.util.Map<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r14 = r0.mWidgets
            r15 = 5
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14.put(r15, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r1.add(r12)
            r15 = 10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.align(r15)
            float r12 = r12.getWidth()
            r14.width(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label r12 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r14 = "cleanupNames6"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r12.<init>(r14, r15)
            r12.setWrap(r6)
            r12.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandX()
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.uniform(r10, r10)
            r12.expand(r10, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r0.addContent(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.expandX()
            r12.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r12 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r3.findRegion(r5)
            r12.<init>(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r0.addContent(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.colspan(r8)
            int r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r14 = (float) r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.padTop(r14)
            r12.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r12)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$CheckboxToggleTouchableChangeListener r14 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$CheckboxToggleTouchableChangeListener
            r14.<init>(r13)
            r12.addListener(r14)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener r14 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener
            r14.<init>(r0, r13)
            r12.addListener(r14)
            java.util.Map<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r14 = r0.mWidgets
            r15 = 3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            r14.put(r8, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r1.add(r12)
            r14 = 10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.align(r14)
            float r14 = r12.getWidth()
            r8.width(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r8.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.uniform(r10, r10)
            r14.expand(r10, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandX()
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r14 = "cleanupNames7"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r14, r15)
            r1.setWrap(r6)
            r1.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r8.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            float r14 = r12.getHeight()
            r1.minHeight(r14)
            r8.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.uniform(r10, r10)
            r14.expand(r10, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.expandX()
            r8.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r8)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener r14 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener
            r14.<init>(r0, r13)
            r8.addListener(r14)
            java.util.Map<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r14 = r0.mWidgets
            r15 = 4
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14.put(r15, r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r1.add(r8)
            r14 = 10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.align(r14)
            float r12 = r12.getWidth()
            r8.width(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r12 = "cleanupNames8"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r14 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r8.<init>(r12, r14)
            r8.setWrap(r6)
            r8.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r1.add(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.expandX()
            r8.fillX()
            r1.setTouchable(r9)
            r8 = 1056964608(0x3f000000, float:0.5)
            r12 = 1065353216(0x3f800000, float:1.0)
            r1.setColor(r12, r12, r12, r8)
            r8 = 3
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r0.getWidget(r8, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox) r2
            r2.setUserObject(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.uniform(r10, r10)
            r2.expand(r10, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.expandX()
            r2.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r3.findRegion(r5)
            r2.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            r8 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r8)
            int r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r8 = (float) r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.padTop(r8)
            r2.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$CheckboxToggleTouchableChangeListener r8 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$CheckboxToggleTouchableChangeListener
            r8.<init>(r13)
            r2.addListener(r8)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener r8 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener
            r8.<init>(r0, r13)
            r2.addListener(r8)
            java.util.Map<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r8 = r0.mWidgets
            r12 = 6
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r8.put(r12, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r1.add(r2)
            r12 = 10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.align(r12)
            float r12 = r2.getWidth()
            r8.width(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r8.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r8.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.uniform(r10, r10)
            r12.expand(r10, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.expandX()
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r12 = "cleanupNames9"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            java.lang.String r12 = ": "
            r14.append(r12)
            java.lang.String r14 = r14.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r14, r15)
            r1.setWrap(r10)
            r1.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r8.add(r1)
            r1.fillX()
            java.lang.String r1 = ""
            com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r0.createTextField(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener r15 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener
            r15.<init>(r0, r13)
            r14.addListener(r15)
            java.util.Map<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r15 = r0.mWidgets
            r16 = 10
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)
            r15.put(r6, r14)
            r6 = 1056964608(0x3f000000, float:0.5)
            r14.setBlinkTime(r6)
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r6 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r6.<init>()
            r14.setTextFieldFilter(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$3 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$3
            r6.<init>(r0)
            r14.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r8.add(r14)
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r8 = (float) r8
            r15 = 1053609165(0x3ecccccd, float:0.4)
            float r8 = r8 * r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.width(r8)
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r8 = (float) r8
            r6.height(r8)
            r14.setTouchable(r9)
            r6 = 1056964608(0x3f000000, float:0.5)
            r8 = 1065353216(0x3f800000, float:1.0)
            r14.setColor(r8, r8, r8, r6)
            r2.setUserObject(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r2.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.uniform(r10, r10)
            r6.expand(r10, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r0.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expandX()
            r6.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r3.findRegion(r5)
            r6.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r0.addContent(r6)
            r8 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.colspan(r8)
            int r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r8 = (float) r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.padTop(r8)
            r6.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$CheckboxToggleTouchableChangeListener r8 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$CheckboxToggleTouchableChangeListener
            r8.<init>(r13)
            r6.addListener(r8)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener r8 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener
            r8.<init>(r0, r13)
            r6.addListener(r8)
            java.util.Map<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r8 = r0.mWidgets
            r14 = 7
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r8.put(r14, r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r2.add(r6)
            r14 = 10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.align(r14)
            float r14 = r6.getWidth()
            r8.width(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r8.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r8.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.uniform(r10, r10)
            r14.expand(r10, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.expandX()
            r2.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r14 = "cleanupNames10"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r14)
            r15.append(r12)
            java.lang.String r14 = r15.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r14, r15)
            r2.setWrap(r10)
            r2.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r8.add(r2)
            r2.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0.createTextField(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener r14 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener
            r14.<init>(r0, r13)
            r2.addListener(r14)
            java.util.Map<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r14 = r0.mWidgets
            r15 = 11
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14.put(r15, r2)
            r14 = 1056964608(0x3f000000, float:0.5)
            r2.setBlinkTime(r14)
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r14 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r14.<init>()
            r2.setTextFieldFilter(r14)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$4 r14 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$4
            r14.<init>(r0)
            r2.addListener(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.add(r2)
            int r14 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r14 = (float) r14
            r15 = 1053609165(0x3ecccccd, float:0.4)
            float r14 = r14 * r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.width(r14)
            int r14 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r14 = (float) r14
            r8.height(r14)
            r2.setTouchable(r9)
            r8 = 1056964608(0x3f000000, float:0.5)
            r14 = 1065353216(0x3f800000, float:1.0)
            r2.setColor(r14, r14, r14, r8)
            r6.setUserObject(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r2.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.uniform(r10, r10)
            r6.expand(r10, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r0.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expandX()
            r6.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r3.findRegion(r5)
            r6.<init>(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r0.addContent(r6)
            r5 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.padTop(r5)
            r3.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$CheckboxToggleTouchableChangeListener r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$CheckboxToggleTouchableChangeListener
            r5.<init>(r13)
            r3.addListener(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener
            r5.<init>(r0, r13)
            r3.addListener(r5)
            java.util.Map<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r5 = r0.mWidgets
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r5.put(r6, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r2.add(r3)
            r6 = 10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.align(r6)
            float r6 = r3.getWidth()
            r5.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.uniform(r10, r10)
            r6.expand(r10, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.expandX()
            r2.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r2.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r2.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.uniform(r10, r10)
            r6.expand(r10, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expandX()
            r6.fillX()
            r5.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r8 = "cleanupNames11"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r8)
            r14.append(r12)
            java.lang.String r8 = r14.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r14 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r6.<init>(r8, r14)
            r6.setWrap(r10)
            r6.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r2.add(r6)
            r6.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r0.createTextField(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener r8 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener
            r8.<init>(r0, r13)
            r6.addListener(r8)
            java.util.Map<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r8 = r0.mWidgets
            r14 = 12
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r8.put(r14, r6)
            r8 = 1056964608(0x3f000000, float:0.5)
            r6.setBlinkTime(r8)
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r8 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r8.<init>()
            r6.setTextFieldFilter(r8)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$5 r8 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$5
            r8.<init>(r0)
            r6.addListener(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r6)
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r8 = (float) r8
            r14 = 1053609165(0x3ecccccd, float:0.4)
            float r8 = r8 * r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r8)
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r8 = (float) r8
            r2.height(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r2.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.uniform(r10, r10)
            r8.expand(r10, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.expandX()
            r5.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$CheckboxToggleTouchableChangeListener r8 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$CheckboxToggleTouchableChangeListener
            r8.<init>(r13)
            r5.addListener(r8)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener r8 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener
            r8.<init>(r0, r13)
            r5.addListener(r8)
            java.util.Map<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r8 = r0.mWidgets
            r14 = 9
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r8.put(r14, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r2.add(r5)
            r14 = 10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.align(r14)
            float r14 = r3.getWidth()
            r8.width(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Table r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r8.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r8.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.uniform(r10, r10)
            r14.expand(r10, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r2.add(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.expandX()
            r14.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "cleanupNames12"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r15)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r14.<init>(r12, r13)
            r14.setWrap(r10)
            r14.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r8.add(r14)
            r4.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r0.createTextField(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener r12 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$SetPreviewStateChangeListener
            r13 = 0
            r12.<init>(r0, r13)
            r4.addListener(r12)
            java.util.Map<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r12 = r0.mWidgets
            r13 = 13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.put(r13, r4)
            r12 = 1056964608(0x3f000000, float:0.5)
            r4.setBlinkTime(r12)
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r12 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r12.<init>()
            r4.setTextFieldFilter(r12)
            org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$6 r12 = new org.fortheloss.sticknodes.animationscreen.dialogs.CleanupFilenamesDialog$6
            r12.<init>(r0)
            r4.addListener(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.add(r4)
            int r12 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r12 = (float) r12
            r13 = 1053609165(0x3ecccccd, float:0.4)
            float r12 = r12 * r13
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.width(r12)
            int r12 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r12 = (float) r12
            r8.height(r12)
            r2.setTouchable(r9)
            r8 = 1056964608(0x3f000000, float:0.5)
            r12 = 1065353216(0x3f800000, float:1.0)
            r2.setColor(r12, r12, r12, r8)
            r6.setTouchable(r9)
            r6.setColor(r12, r12, r12, r8)
            r13 = 2
            com.badlogic.gdx.scenes.scene2d.Actor[] r13 = new com.badlogic.gdx.scenes.scene2d.Actor[r13]
            r13[r10] = r2
            r2 = 1
            r13[r2] = r6
            r3.setUserObject(r13)
            r4.setTouchable(r9)
            r4.setColor(r12, r12, r12, r8)
            r5.setUserObject(r4)
            org.fortheloss.framework.SizeWidget r2 = new org.fortheloss.framework.SizeWidget
            r3 = 1092616192(0x41200000, float:10.0)
            r4 = 1142292480(0x44160000, float:600.0)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r4
            r2.<init>(r3, r5)
            r0.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0.createTextButton(r1)
            java.util.Map<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r2 = r0.mWidgets
            r3 = 14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.put(r3, r1)
            r0.addButton(r1, r7)
            java.lang.String r1 = "cancel"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "< "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0.createTextButton(r1)
            java.util.Map<java.lang.Integer, com.badlogic.gdx.scenes.scene2d.Actor> r2 = r0.mWidgets
            r3 = 15
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.put(r3, r1)
            r0.addButton(r1, r11)
            r1 = -1
            r0.mState = r1
            r0.setState(r10)
            return
    }

    protected void onComplete(boolean r1, com.badlogic.gdx.utils.Array<java.lang.String> r2) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public void setExtraPermanentFilenames(java.lang.String... r2) {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.mExtraPermanentFilenames
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.addAll(r2)
            return
    }
}
