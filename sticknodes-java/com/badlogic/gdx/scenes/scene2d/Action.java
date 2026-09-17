package com.badlogic.gdx.scenes.scene2d;

/* loaded from: classes.dex */
public abstract class Action implements com.badlogic.gdx.utils.Pool.Poolable {
    protected com.badlogic.gdx.scenes.scene2d.Actor actor;
    private com.badlogic.gdx.utils.Pool pool;
    protected com.badlogic.gdx.scenes.scene2d.Actor target;

    public Action() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract boolean act(float r1);

    public com.badlogic.gdx.scenes.scene2d.Actor getActor() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.actor
            return r0
    }

    public com.badlogic.gdx.utils.Pool getPool() {
            r1 = this;
            com.badlogic.gdx.utils.Pool r0 = r1.pool
            return r0
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1.actor = r0
            r1.target = r0
            r1.pool = r0
            r1.restart()
            return
    }

    public void restart() {
            r0 = this;
            return
    }

    public void setActor(com.badlogic.gdx.scenes.scene2d.Actor r2) {
            r1 = this;
            r1.actor = r2
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.target
            if (r0 != 0) goto L9
            r1.setTarget(r2)
        L9:
            if (r2 != 0) goto L15
            com.badlogic.gdx.utils.Pool r2 = r1.pool
            if (r2 == 0) goto L15
            r2.free(r1)
            r2 = 0
            r1.pool = r2
        L15:
            return
    }

    public void setPool(com.badlogic.gdx.utils.Pool r1) {
            r0 = this;
            r0.pool = r1
            return
    }

    public void setTarget(com.badlogic.gdx.scenes.scene2d.Actor r1) {
            r0 = this;
            r0.target = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            r2 = -1
            if (r1 == r2) goto L17
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L17:
            java.lang.String r1 = "Action"
            boolean r1 = r0.endsWith(r1)
            if (r1 == 0) goto L2a
            r1 = 0
            int r2 = r0.length()
            int r2 = r2 + (-6)
            java.lang.String r0 = r0.substring(r1, r2)
        L2a:
            return r0
    }
}
