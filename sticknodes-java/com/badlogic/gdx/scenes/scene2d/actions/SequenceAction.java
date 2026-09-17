package com.badlogic.gdx.scenes.scene2d.actions;

/* loaded from: classes.dex */
public class SequenceAction extends com.badlogic.gdx.scenes.scene2d.actions.ParallelAction {
    private int index;

    public SequenceAction() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.ParallelAction, com.badlogic.gdx.scenes.scene2d.Action
    public boolean act(float r5) {
            r4 = this;
            int r0 = r4.index
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Action> r1 = r4.actions
            int r1 = r1.size
            r2 = 1
            if (r0 < r1) goto La
            return r2
        La:
            com.badlogic.gdx.utils.Pool r0 = r4.getPool()
            r1 = 0
            r4.setPool(r1)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Action> r1 = r4.actions     // Catch: java.lang.Throwable -> L3e
            int r3 = r4.index     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L3e
            com.badlogic.gdx.scenes.scene2d.Action r1 = (com.badlogic.gdx.scenes.scene2d.Action) r1     // Catch: java.lang.Throwable -> L3e
            boolean r5 = r1.act(r5)     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L39
            com.badlogic.gdx.scenes.scene2d.Actor r5 = r4.actor     // Catch: java.lang.Throwable -> L3e
            if (r5 != 0) goto L2a
            r4.setPool(r0)
            return r2
        L2a:
            int r5 = r4.index     // Catch: java.lang.Throwable -> L3e
            int r5 = r5 + r2
            r4.index = r5     // Catch: java.lang.Throwable -> L3e
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Action> r1 = r4.actions     // Catch: java.lang.Throwable -> L3e
            int r1 = r1.size     // Catch: java.lang.Throwable -> L3e
            if (r5 < r1) goto L39
            r4.setPool(r0)
            return r2
        L39:
            r5 = 0
            r4.setPool(r0)
            return r5
        L3e:
            r5 = move-exception
            r4.setPool(r0)
            throw r5
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.ParallelAction, com.badlogic.gdx.scenes.scene2d.Action
    public void restart() {
            r1 = this;
            super.restart()
            r0 = 0
            r1.index = r0
            return
    }
}
