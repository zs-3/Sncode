package com.badlogic.gdx.scenes.scene2d.utils;

/* loaded from: classes.dex */
public class Selection<T> implements java.lang.Iterable<T> {
    private com.badlogic.gdx.scenes.scene2d.Actor actor;
    boolean isDisabled;
    T lastSelected;
    boolean multiple;
    private final com.badlogic.gdx.utils.OrderedSet<T> old;
    private boolean programmaticChangeEvents;
    boolean required;
    final com.badlogic.gdx.utils.OrderedSet<T> selected;
    private boolean toggle;

    public Selection() {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.utils.OrderedSet r0 = new com.badlogic.gdx.utils.OrderedSet
            r0.<init>()
            r1.selected = r0
            com.badlogic.gdx.utils.OrderedSet r0 = new com.badlogic.gdx.utils.OrderedSet
            r0.<init>()
            r1.old = r0
            r0 = 1
            r1.programmaticChangeEvents = r0
            return
    }

    public void addAll(com.badlogic.gdx.utils.Array<T> r6) {
            r5 = this;
            r5.snapshot()
            int r0 = r6.size
            r1 = 0
            r2 = 0
        L7:
            if (r1 >= r0) goto L23
            java.lang.Object r3 = r6.get(r1)
            if (r3 == 0) goto L1b
            com.badlogic.gdx.utils.OrderedSet<T> r4 = r5.selected
            boolean r3 = r4.add(r3)
            if (r3 == 0) goto L18
            r2 = 1
        L18:
            int r1 = r1 + 1
            goto L7
        L1b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "item cannot be null."
            r6.<init>(r0)
            throw r6
        L23:
            if (r2 == 0) goto L3c
            boolean r0 = r5.programmaticChangeEvents
            if (r0 == 0) goto L33
            boolean r0 = r5.fireChangeEvent()
            if (r0 == 0) goto L33
            r5.revert()
            goto L3c
        L33:
            java.lang.Object r6 = r6.peek()
            r5.lastSelected = r6
            r5.changed()
        L3c:
            r5.cleanup()
            return
    }

    protected void changed() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public void choose(T r5) {
            r4 = this;
            if (r5 == 0) goto L87
            boolean r0 = r4.isDisabled
            if (r0 == 0) goto L7
            return
        L7:
            r4.snapshot()
            boolean r0 = r4.toggle     // Catch: java.lang.Throwable -> L82
            r1 = 1
            if (r0 != 0) goto L15
            boolean r0 = com.badlogic.gdx.scenes.scene2d.utils.UIUtils.ctrl()     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L34
        L15:
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r4.selected     // Catch: java.lang.Throwable -> L82
            boolean r0 = r0.contains(r5)     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L34
            boolean r0 = r4.required     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L2b
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r4.selected     // Catch: java.lang.Throwable -> L82
            int r0 = r0.size     // Catch: java.lang.Throwable -> L82
            if (r0 != r1) goto L2b
            r4.cleanup()
            return
        L2b:
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r4.selected     // Catch: java.lang.Throwable -> L82
            r0.remove(r5)     // Catch: java.lang.Throwable -> L82
            r5 = 0
            r4.lastSelected = r5     // Catch: java.lang.Throwable -> L82
            goto L71
        L34:
            boolean r0 = r4.multiple     // Catch: java.lang.Throwable -> L82
            r2 = 0
            if (r0 == 0) goto L43
            boolean r0 = r4.toggle     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L61
            boolean r0 = com.badlogic.gdx.scenes.scene2d.utils.UIUtils.ctrl()     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L61
        L43:
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r4.selected     // Catch: java.lang.Throwable -> L82
            int r3 = r0.size     // Catch: java.lang.Throwable -> L82
            if (r3 != r1) goto L53
            boolean r0 = r0.contains(r5)     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L53
            r4.cleanup()
            return
        L53:
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r4.selected     // Catch: java.lang.Throwable -> L82
            int r3 = r0.size     // Catch: java.lang.Throwable -> L82
            if (r3 <= 0) goto L5a
            goto L5b
        L5a:
            r1 = 0
        L5b:
            r2 = 8
            r0.clear(r2)     // Catch: java.lang.Throwable -> L82
            r2 = r1
        L61:
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r4.selected     // Catch: java.lang.Throwable -> L82
            boolean r0 = r0.add(r5)     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L6f
            if (r2 != 0) goto L6f
            r4.cleanup()
            return
        L6f:
            r4.lastSelected = r5     // Catch: java.lang.Throwable -> L82
        L71:
            boolean r5 = r4.fireChangeEvent()     // Catch: java.lang.Throwable -> L82
            if (r5 == 0) goto L7b
            r4.revert()     // Catch: java.lang.Throwable -> L82
            goto L7e
        L7b:
            r4.changed()     // Catch: java.lang.Throwable -> L82
        L7e:
            r4.cleanup()
            return
        L82:
            r5 = move-exception
            r4.cleanup()
            throw r5
        L87:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "item cannot be null."
            r5.<init>(r0)
            throw r5
    }

    void cleanup() {
            r2 = this;
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r2.old
            r1 = 32
            r0.clear(r1)
            return
    }

    public void clear() {
            r3 = this;
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r3.selected
            int r0 = r0.size
            r1 = 0
            if (r0 != 0) goto La
            r3.lastSelected = r1
            return
        La:
            r3.snapshot()
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r3.selected
            r2 = 8
            r0.clear(r2)
            boolean r0 = r3.programmaticChangeEvents
            if (r0 == 0) goto L22
            boolean r0 = r3.fireChangeEvent()
            if (r0 == 0) goto L22
            r3.revert()
            goto L27
        L22:
            r3.lastSelected = r1
            r3.changed()
        L27:
            r3.cleanup()
            return
    }

    public boolean contains(T r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r1.selected
            boolean r2 = r0.contains(r2)
            return r2
    }

    public boolean fireChangeEvent() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r2.actor
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.utils.ChangeListener$ChangeEvent> r0 = com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            com.badlogic.gdx.scenes.scene2d.utils.ChangeListener$ChangeEvent r0 = (com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent) r0
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r2.actor     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.fire(r0)     // Catch: java.lang.Throwable -> L18
            com.badlogic.gdx.utils.Pools.free(r0)
            return r1
        L18:
            r1 = move-exception
            com.badlogic.gdx.utils.Pools.free(r0)
            throw r1
    }

    public T first() {
            r2 = this;
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r2.selected
            int r1 = r0.size
            if (r1 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            java.lang.Object r0 = r0.first()
        Lc:
            return r0
    }

    public T getLastSelected() {
            r2 = this;
            T r0 = r2.lastSelected
            if (r0 == 0) goto L5
            return r0
        L5:
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r2.selected
            int r1 = r0.size
            if (r1 <= 0) goto L10
            java.lang.Object r0 = r0.first()
            return r0
        L10:
            r0 = 0
            return r0
    }

    public boolean getMultiple() {
            r1 = this;
            boolean r0 = r1.multiple
            return r0
    }

    public boolean getRequired() {
            r1 = this;
            boolean r0 = r1.required
            return r0
    }

    public boolean isDisabled() {
            r1 = this;
            boolean r0 = r1.isDisabled
            return r0
    }

    public com.badlogic.gdx.utils.OrderedSet<T> items() {
            r1 = this;
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r1.selected
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r1 = this;
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r1.selected
            com.badlogic.gdx.utils.OrderedSet$OrderedSetIterator r0 = r0.iterator()
            return r0
    }

    public void remove(T r2) {
            r1 = this;
            if (r2 == 0) goto L22
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r1.selected
            boolean r0 = r0.remove(r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            boolean r0 = r1.programmaticChangeEvents
            if (r0 == 0) goto L1b
            boolean r0 = r1.fireChangeEvent()
            if (r0 == 0) goto L1b
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r1.selected
            r0.add(r2)
            goto L21
        L1b:
            r2 = 0
            r1.lastSelected = r2
            r1.changed()
        L21:
            return
        L22:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "item cannot be null."
            r2.<init>(r0)
            throw r2
    }

    void revert() {
            r2 = this;
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r2.selected
            com.badlogic.gdx.utils.OrderedSet<T> r1 = r2.old
            int r1 = r1.size
            r0.clear(r1)
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r2.selected
            com.badlogic.gdx.utils.OrderedSet<T> r1 = r2.old
            r0.addAll(r1)
            return
    }

    public void set(T r4) {
            r3 = this;
            if (r4 == 0) goto L36
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r3.selected
            int r1 = r0.size
            r2 = 1
            if (r1 != r2) goto L10
            java.lang.Object r0 = r0.first()
            if (r0 != r4) goto L10
            return
        L10:
            r3.snapshot()
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r3.selected
            r1 = 8
            r0.clear(r1)
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r3.selected
            r0.add(r4)
            boolean r0 = r3.programmaticChangeEvents
            if (r0 == 0) goto L2d
            boolean r0 = r3.fireChangeEvent()
            if (r0 == 0) goto L2d
            r3.revert()
            goto L32
        L2d:
            r3.lastSelected = r4
            r3.changed()
        L32:
            r3.cleanup()
            return
        L36:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "item cannot be null."
            r4.<init>(r0)
            throw r4
    }

    public void setActor(com.badlogic.gdx.scenes.scene2d.Actor r1) {
            r0 = this;
            r0.actor = r1
            return
    }

    public void setAll(com.badlogic.gdx.utils.Array<T> r6) {
            r5 = this;
            r5.snapshot()
            r0 = 0
            r5.lastSelected = r0
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r5.selected
            int r1 = r6.size
            r0.clear(r1)
            int r0 = r6.size
            r1 = 0
            r2 = 0
        L11:
            if (r1 >= r0) goto L2d
            java.lang.Object r3 = r6.get(r1)
            if (r3 == 0) goto L25
            com.badlogic.gdx.utils.OrderedSet<T> r4 = r5.selected
            boolean r3 = r4.add(r3)
            if (r3 == 0) goto L22
            r2 = 1
        L22:
            int r1 = r1 + 1
            goto L11
        L25:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "item cannot be null."
            r6.<init>(r0)
            throw r6
        L2d:
            if (r2 == 0) goto L4a
            boolean r0 = r5.programmaticChangeEvents
            if (r0 == 0) goto L3d
            boolean r0 = r5.fireChangeEvent()
            if (r0 == 0) goto L3d
            r5.revert()
            goto L4a
        L3d:
            int r0 = r6.size
            if (r0 <= 0) goto L4a
            java.lang.Object r6 = r6.peek()
            r5.lastSelected = r6
            r5.changed()
        L4a:
            r5.cleanup()
            return
    }

    public void setMultiple(boolean r1) {
            r0 = this;
            r0.multiple = r1
            return
    }

    public void setRequired(boolean r1) {
            r0 = this;
            r0.required = r1
            return
    }

    public void setToggle(boolean r1) {
            r0 = this;
            r0.toggle = r1
            return
    }

    public int size() {
            r1 = this;
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r1.selected
            int r0 = r0.size
            return r0
    }

    void snapshot() {
            r2 = this;
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r2.old
            com.badlogic.gdx.utils.OrderedSet<T> r1 = r2.selected
            int r1 = r1.size
            r0.clear(r1)
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r2.old
            com.badlogic.gdx.utils.OrderedSet<T> r1 = r2.selected
            r0.addAll(r1)
            return
    }

    public java.lang.String toString() {
            r1 = this;
            com.badlogic.gdx.utils.OrderedSet<T> r0 = r1.selected
            java.lang.String r0 = r0.toString()
            return r0
    }
}
