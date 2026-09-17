package com.badlogic.gdx.scenes.scene2d.actions;

/* loaded from: classes.dex */
public class ParallelAction extends com.badlogic.gdx.scenes.scene2d.Action {
    com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Action> actions;
    private boolean complete;

    public ParallelAction() {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r1 = 4
            r0.<init>(r1)
            r2.actions = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public boolean act(float r9) {
            r8 = this;
            boolean r0 = r8.complete
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            r8.complete = r1
            com.badlogic.gdx.utils.Pool r0 = r8.getPool()
            r2 = 0
            r8.setPool(r2)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Action> r2 = r8.actions     // Catch: java.lang.Throwable -> L41
            int r3 = r2.size     // Catch: java.lang.Throwable -> L41
            r4 = 0
            r5 = 0
        L16:
            if (r5 >= r3) goto L3b
            com.badlogic.gdx.scenes.scene2d.Actor r6 = r8.actor     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L3b
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L41
            com.badlogic.gdx.scenes.scene2d.Action r6 = (com.badlogic.gdx.scenes.scene2d.Action) r6     // Catch: java.lang.Throwable -> L41
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r6.getActor()     // Catch: java.lang.Throwable -> L41
            if (r7 == 0) goto L30
            boolean r6 = r6.act(r9)     // Catch: java.lang.Throwable -> L41
            if (r6 != 0) goto L30
            r8.complete = r4     // Catch: java.lang.Throwable -> L41
        L30:
            com.badlogic.gdx.scenes.scene2d.Actor r6 = r8.actor     // Catch: java.lang.Throwable -> L41
            if (r6 != 0) goto L38
            r8.setPool(r0)
            return r1
        L38:
            int r5 = r5 + 1
            goto L16
        L3b:
            boolean r9 = r8.complete     // Catch: java.lang.Throwable -> L41
            r8.setPool(r0)
            return r9
        L41:
            r9 = move-exception
            r8.setPool(r0)
            throw r9
    }

    public void addAction(com.badlogic.gdx.scenes.scene2d.Action r2) {
            r1 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Action> r0 = r1.actions
            r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.actor
            if (r0 == 0) goto Lc
            r2.setActor(r0)
        Lc:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action, com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            super.reset()
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Action> r0 = r1.actions
            r0.clear()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public void restart() {
            r4 = this;
            r0 = 0
            r4.complete = r0
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Action> r1 = r4.actions
            int r2 = r1.size
        L7:
            if (r0 >= r2) goto L15
            java.lang.Object r3 = r1.get(r0)
            com.badlogic.gdx.scenes.scene2d.Action r3 = (com.badlogic.gdx.scenes.scene2d.Action) r3
            r3.restart()
            int r0 = r0 + 1
            goto L7
        L15:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public void setActor(com.badlogic.gdx.scenes.scene2d.Actor r5) {
            r4 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Action> r0 = r4.actions
            int r1 = r0.size
            r2 = 0
        L5:
            if (r2 >= r1) goto L13
            java.lang.Object r3 = r0.get(r2)
            com.badlogic.gdx.scenes.scene2d.Action r3 = (com.badlogic.gdx.scenes.scene2d.Action) r3
            r3.setActor(r5)
            int r2 = r2 + 1
            goto L5
        L13:
            super.setActor(r5)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 64
            r0.<init>(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.Action> r1 = r5.actions
            int r2 = r1.size
            r3 = 0
        L18:
            if (r3 >= r2) goto L2b
            if (r3 <= 0) goto L21
            java.lang.String r4 = ", "
            r0.append(r4)
        L21:
            java.lang.Object r4 = r1.get(r3)
            r0.append(r4)
            int r3 = r3 + 1
            goto L18
        L2b:
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
