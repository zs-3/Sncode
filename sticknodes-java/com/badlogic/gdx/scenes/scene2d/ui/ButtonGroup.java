package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.scenes.scene2d.ui.Button;

/* loaded from: classes.dex */
public class ButtonGroup<T extends com.badlogic.gdx.scenes.scene2d.ui.Button> {
    private final com.badlogic.gdx.utils.Array<T> buttons;
    private com.badlogic.gdx.utils.Array<T> checkedButtons;
    private T lastChecked;
    private int maxCheckCount;
    private int minCheckCount;
    private boolean uncheckLast;

    public ButtonGroup() {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r2.buttons = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r1 = 1
            r0.<init>(r1)
            r2.checkedButtons = r0
            r2.maxCheckCount = r1
            r2.uncheckLast = r1
            r2.minCheckCount = r1
            return
    }

    public ButtonGroup(T... r3) {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r2.buttons = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r1 = 1
            r0.<init>(r1)
            r2.checkedButtons = r0
            r2.maxCheckCount = r1
            r2.uncheckLast = r1
            r0 = 0
            r2.minCheckCount = r0
            r2.add(r3)
            r2.minCheckCount = r1
            return
    }

    public void add(T r4) {
            r3 = this;
            if (r4 == 0) goto L26
            r0 = 0
            r4.buttonGroup = r0
            boolean r0 = r4.isChecked()
            r1 = 0
            if (r0 != 0) goto L17
            com.badlogic.gdx.utils.Array<T extends com.badlogic.gdx.scenes.scene2d.ui.Button> r0 = r3.buttons
            int r0 = r0.size
            int r2 = r3.minCheckCount
            if (r0 >= r2) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            r4.setChecked(r1)
            r4.buttonGroup = r3
            com.badlogic.gdx.utils.Array<T extends com.badlogic.gdx.scenes.scene2d.ui.Button> r1 = r3.buttons
            r1.add(r4)
            r4.setChecked(r0)
            return
        L26:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "button cannot be null."
            r4.<init>(r0)
            throw r4
    }

    public void add(T... r4) {
            r3 = this;
            if (r4 == 0) goto Lf
            r0 = 0
            int r1 = r4.length
        L4:
            if (r0 >= r1) goto Le
            r2 = r4[r0]
            r3.add(r2)
            int r0 = r0 + 1
            goto L4
        Le:
            return
        Lf:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "buttons cannot be null."
            r4.<init>(r0)
            throw r4
    }

    protected boolean canCheck(T r6, boolean r7) {
            r5 = this;
            boolean r0 = r6.isChecked
            r1 = 0
            if (r0 != r7) goto L6
            return r1
        L6:
            r0 = 1
            if (r7 != 0) goto L16
            com.badlogic.gdx.utils.Array<T extends com.badlogic.gdx.scenes.scene2d.ui.Button> r7 = r5.checkedButtons
            int r2 = r7.size
            int r3 = r5.minCheckCount
            if (r2 > r3) goto L12
            return r1
        L12:
            r7.removeValue(r6, r0)
            goto L50
        L16:
            int r2 = r5.maxCheckCount
            r3 = -1
            if (r2 == r3) goto L49
            com.badlogic.gdx.utils.Array<T extends com.badlogic.gdx.scenes.scene2d.ui.Button> r3 = r5.checkedButtons
            int r3 = r3.size
            if (r3 < r2) goto L49
            boolean r2 = r5.uncheckLast
            if (r2 != 0) goto L26
            return r1
        L26:
            r2 = 0
        L27:
            int r3 = r5.minCheckCount
            r5.minCheckCount = r1
            T extends com.badlogic.gdx.scenes.scene2d.ui.Button r4 = r5.lastChecked
            r4.setChecked(r1)
            r5.minCheckCount = r3
            boolean r3 = r6.isChecked
            if (r3 != r7) goto L37
            return r1
        L37:
            com.badlogic.gdx.utils.Array<T extends com.badlogic.gdx.scenes.scene2d.ui.Button> r3 = r5.checkedButtons
            int r3 = r3.size
            int r4 = r5.maxCheckCount
            if (r3 >= r4) goto L40
            goto L49
        L40:
            int r3 = r2 + 1
            r4 = 10
            if (r2 <= r4) goto L47
            return r1
        L47:
            r2 = r3
            goto L27
        L49:
            com.badlogic.gdx.utils.Array<T extends com.badlogic.gdx.scenes.scene2d.ui.Button> r7 = r5.checkedButtons
            r7.add(r6)
            r5.lastChecked = r6
        L50:
            return r0
    }

    public void setMaxCheckCount(int r1) {
            r0 = this;
            if (r1 != 0) goto L3
            r1 = -1
        L3:
            r0.maxCheckCount = r1
            return
    }

    public void setMinCheckCount(int r1) {
            r0 = this;
            r0.minCheckCount = r1
            return
    }
}
