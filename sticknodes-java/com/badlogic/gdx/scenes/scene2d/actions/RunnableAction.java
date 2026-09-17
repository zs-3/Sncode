package com.badlogic.gdx.scenes.scene2d.actions;

/* loaded from: classes.dex */
public class RunnableAction extends com.badlogic.gdx.scenes.scene2d.Action {
    private boolean ran;
    private java.lang.Runnable runnable;

    public RunnableAction() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public boolean act(float r2) {
            r1 = this;
            boolean r2 = r1.ran
            r0 = 1
            if (r2 != 0) goto La
            r1.ran = r0
            r1.run()
        La:
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action, com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            super.reset()
            r0 = 0
            r1.runnable = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public void restart() {
            r1 = this;
            r0 = 0
            r1.ran = r0
            return
    }

    public void run() {
            r2 = this;
            com.badlogic.gdx.utils.Pool r0 = r2.getPool()
            r1 = 0
            r2.setPool(r1)
            java.lang.Runnable r1 = r2.runnable     // Catch: java.lang.Throwable -> L11
            r1.run()     // Catch: java.lang.Throwable -> L11
            r2.setPool(r0)
            return
        L11:
            r1 = move-exception
            r2.setPool(r0)
            throw r1
    }

    public void setRunnable(java.lang.Runnable r1) {
            r0 = this;
            r0.runnable = r1
            return
    }
}
