package com.badlogic.gdx.scenes.scene2d.utils;

/* loaded from: classes.dex */
public class ArraySelection<T> extends com.badlogic.gdx.scenes.scene2d.utils.Selection<T> {
    private com.badlogic.gdx.utils.Array<T> array;
    private boolean rangeSelect;
    private T rangeStart;

    public ArraySelection(com.badlogic.gdx.utils.Array<T> r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.rangeSelect = r0
            r1.array = r2
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Selection
    protected void changed() {
            r1 = this;
            r0 = 0
            r1.rangeStart = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Selection
    public void choose(T r6) {
            r5 = this;
            if (r6 == 0) goto L76
            boolean r0 = r5.isDisabled
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r5.rangeSelect
            if (r0 == 0) goto L72
            boolean r0 = r5.multiple
            if (r0 != 0) goto L10
            goto L72
        L10:
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r5.selected
            int r0 = r0.size
            if (r0 <= 0) goto L6c
            boolean r0 = com.badlogic.gdx.scenes.scene2d.utils.UIUtils.shift()
            if (r0 == 0) goto L6c
            T r0 = r5.rangeStart
            r1 = -1
            r2 = 0
            if (r0 != 0) goto L24
            r0 = -1
            goto L2a
        L24:
            com.badlogic.gdx.utils.Array<T> r3 = r5.array
            int r0 = r3.indexOf(r0, r2)
        L2a:
            if (r0 == r1) goto L6c
            T r1 = r5.rangeStart
            r5.snapshot()
            com.badlogic.gdx.utils.Array<T> r3 = r5.array
            int r6 = r3.indexOf(r6, r2)
            if (r0 <= r6) goto L3c
            r4 = r0
            r0 = r6
            r6 = r4
        L3c:
            boolean r2 = com.badlogic.gdx.scenes.scene2d.utils.UIUtils.ctrl()
            if (r2 != 0) goto L49
            com.badlogic.gdx.utils.OrderedSet<T> r2 = r5.selected
            r3 = 8
            r2.clear(r3)
        L49:
            if (r0 > r6) goto L59
            com.badlogic.gdx.utils.OrderedSet<T> r2 = r5.selected
            com.badlogic.gdx.utils.Array<T> r3 = r5.array
            java.lang.Object r3 = r3.get(r0)
            r2.add(r3)
            int r0 = r0 + 1
            goto L49
        L59:
            boolean r6 = r5.fireChangeEvent()
            if (r6 == 0) goto L63
            r5.revert()
            goto L66
        L63:
            r5.changed()
        L66:
            r5.rangeStart = r1
            r5.cleanup()
            return
        L6c:
            super.choose(r6)
            r5.rangeStart = r6
            return
        L72:
            super.choose(r6)
            return
        L76:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "item cannot be null."
            r6.<init>(r0)
            throw r6
    }

    public void setRangeSelect(boolean r1) {
            r0 = this;
            r0.rangeSelect = r1
            return
    }

    public void validate() {
            r5 = this;
            com.badlogic.gdx.utils.Array<T> r0 = r5.array
            int r1 = r0.size
            if (r1 != 0) goto La
            r5.clear()
            return
        La:
            com.badlogic.gdx.utils.OrderedSet r1 = r5.items()
            com.badlogic.gdx.utils.OrderedSet$OrderedSetIterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
        L14:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L29
            java.lang.Object r4 = r1.next()
            boolean r4 = r0.contains(r4, r2)
            if (r4 != 0) goto L14
            r1.remove()
            r3 = 1
            goto L14
        L29:
            boolean r1 = r5.required
            if (r1 == 0) goto L3b
            com.badlogic.gdx.utils.OrderedSet<T> r1 = r5.selected
            int r1 = r1.size
            if (r1 != 0) goto L3b
            java.lang.Object r0 = r0.first()
            r5.set(r0)
            goto L40
        L3b:
            if (r3 == 0) goto L40
            r5.changed()
        L40:
            return
    }
}
