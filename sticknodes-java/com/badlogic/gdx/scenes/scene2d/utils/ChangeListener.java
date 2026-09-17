package com.badlogic.gdx.scenes.scene2d.utils;

/* loaded from: classes.dex */
public abstract class ChangeListener implements com.badlogic.gdx.scenes.scene2d.EventListener {

    public static class ChangeEvent extends com.badlogic.gdx.scenes.scene2d.Event {
        public ChangeEvent() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ChangeListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void changed(com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent r1, com.badlogic.gdx.scenes.scene2d.Actor r2);

    @Override // com.badlogic.gdx.scenes.scene2d.EventListener
    public boolean handle(com.badlogic.gdx.scenes.scene2d.Event r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r3
            com.badlogic.gdx.scenes.scene2d.utils.ChangeListener$ChangeEvent r0 = (com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent) r0
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getTarget()
            r2.changed(r0, r3)
            return r1
    }
}
