package com.badlogic.gdx;

/* loaded from: classes.dex */
public abstract class AbstractInput implements com.badlogic.gdx.Input {
    protected final boolean[] justPressedKeys;
    protected boolean keyJustPressed;
    private final com.badlogic.gdx.utils.IntSet keysToCatch;
    protected int pressedKeyCount;
    protected final boolean[] pressedKeys;

    public AbstractInput() {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.utils.IntSet r0 = new com.badlogic.gdx.utils.IntSet
            r0.<init>()
            r2.keysToCatch = r0
            r0 = 256(0x100, float:3.59E-43)
            boolean[] r1 = new boolean[r0]
            r2.pressedKeys = r1
            boolean[] r0 = new boolean[r0]
            r2.justPressedKeys = r0
            return
    }

    public boolean isCatchBackKey() {
            r2 = this;
            com.badlogic.gdx.utils.IntSet r0 = r2.keysToCatch
            r1 = 4
            boolean r0 = r0.contains(r1)
            return r0
    }

    public boolean isCatchKey(int r2) {
            r1 = this;
            com.badlogic.gdx.utils.IntSet r0 = r1.keysToCatch
            boolean r2 = r0.contains(r2)
            return r2
    }

    public boolean isCatchMenuKey() {
            r2 = this;
            com.badlogic.gdx.utils.IntSet r0 = r2.keysToCatch
            r1 = 82
            boolean r0 = r0.contains(r1)
            return r0
    }

    @Override // com.badlogic.gdx.Input
    public boolean isKeyJustPressed(int r2) {
            r1 = this;
            r0 = -1
            if (r2 != r0) goto L6
            boolean r2 = r1.keyJustPressed
            return r2
        L6:
            if (r2 < 0) goto L12
            r0 = 255(0xff, float:3.57E-43)
            if (r2 <= r0) goto Ld
            goto L12
        Ld:
            boolean[] r0 = r1.justPressedKeys
            boolean r2 = r0[r2]
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // com.badlogic.gdx.Input
    public boolean isKeyPressed(int r3) {
            r2 = this;
            r0 = 0
            r1 = -1
            if (r3 != r1) goto La
            int r3 = r2.pressedKeyCount
            if (r3 <= 0) goto L9
            r0 = 1
        L9:
            return r0
        La:
            if (r3 < 0) goto L16
            r1 = 255(0xff, float:3.57E-43)
            if (r3 <= r1) goto L11
            goto L16
        L11:
            boolean[] r0 = r2.pressedKeys
            boolean r3 = r0[r3]
            return r3
        L16:
            return r0
    }

    public void setCatchBackKey(boolean r2) {
            r1 = this;
            r0 = 4
            r1.setCatchKey(r0, r2)
            return
    }

    @Override // com.badlogic.gdx.Input
    public void setCatchKey(int r1, boolean r2) {
            r0 = this;
            if (r2 != 0) goto L8
            com.badlogic.gdx.utils.IntSet r2 = r0.keysToCatch
            r2.remove(r1)
            goto Ld
        L8:
            com.badlogic.gdx.utils.IntSet r2 = r0.keysToCatch
            r2.add(r1)
        Ld:
            return
    }

    public void setCatchMenuKey(boolean r2) {
            r1 = this;
            r0 = 82
            r1.setCatchKey(r0, r2)
            return
    }
}
