package com.badlogic.gdx.scenes.scene2d.actions;

/* loaded from: classes.dex */
public abstract class TemporalAction extends com.badlogic.gdx.scenes.scene2d.Action {
    private boolean began;
    private boolean complete;
    private float duration;
    private com.badlogic.gdx.math.Interpolation interpolation;
    private boolean reverse;
    private float time;

    public TemporalAction() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public boolean act(float r5) {
            r4 = this;
            boolean r0 = r4.complete
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            com.badlogic.gdx.utils.Pool r0 = r4.getPool()
            r2 = 0
            r4.setPool(r2)
            boolean r2 = r4.began     // Catch: java.lang.Throwable -> L4c
            if (r2 != 0) goto L17
            r4.begin()     // Catch: java.lang.Throwable -> L4c
            r4.began = r1     // Catch: java.lang.Throwable -> L4c
        L17:
            float r2 = r4.time     // Catch: java.lang.Throwable -> L4c
            float r2 = r2 + r5
            r4.time = r2     // Catch: java.lang.Throwable -> L4c
            float r5 = r4.duration     // Catch: java.lang.Throwable -> L4c
            int r3 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r3 < 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            r4.complete = r1     // Catch: java.lang.Throwable -> L4c
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L2d
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L2e
        L2d:
            float r2 = r2 / r5
        L2e:
            com.badlogic.gdx.math.Interpolation r5 = r4.interpolation     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L36
            float r2 = r5.apply(r2)     // Catch: java.lang.Throwable -> L4c
        L36:
            boolean r5 = r4.reverse     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L3c
            float r2 = r3 - r2
        L3c:
            r4.update(r2)     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r4.complete     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L46
            r4.end()     // Catch: java.lang.Throwable -> L4c
        L46:
            boolean r5 = r4.complete     // Catch: java.lang.Throwable -> L4c
            r4.setPool(r0)
            return r5
        L4c:
            r5 = move-exception
            r4.setPool(r0)
            throw r5
    }

    protected abstract void begin();

    protected void end() {
            r0 = this;
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action, com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            super.reset()
            r0 = 0
            r1.reverse = r0
            r0 = 0
            r1.interpolation = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public void restart() {
            r1 = this;
            r0 = 0
            r1.time = r0
            r0 = 0
            r1.began = r0
            r1.complete = r0
            return
    }

    public void setDuration(float r1) {
            r0 = this;
            r0.duration = r1
            return
    }

    public void setInterpolation(com.badlogic.gdx.math.Interpolation r1) {
            r0 = this;
            r0.interpolation = r1
            return
    }

    protected abstract void update(float r1);
}
