package com.badlogic.gdx.scenes.scene2d;

/* loaded from: classes.dex */
public class Event implements com.badlogic.gdx.utils.Pool.Poolable {
    private boolean bubbles;
    private boolean cancelled;
    private boolean capture;
    private boolean handled;
    private com.badlogic.gdx.scenes.scene2d.Actor listenerActor;
    private com.badlogic.gdx.scenes.scene2d.Stage stage;
    private boolean stopped;
    private com.badlogic.gdx.scenes.scene2d.Actor targetActor;

    public Event() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.bubbles = r0
            return
    }

    public void cancel() {
            r1 = this;
            r0 = 1
            r1.cancelled = r0
            r1.stopped = r0
            r1.handled = r0
            return
    }

    public boolean getBubbles() {
            r1 = this;
            boolean r0 = r1.bubbles
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.Actor getListenerActor() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.listenerActor
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.Stage getStage() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r1.stage
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.Actor getTarget() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.targetActor
            return r0
    }

    public void handle() {
            r1 = this;
            r0 = 1
            r1.handled = r0
            return
    }

    public boolean isCancelled() {
            r1 = this;
            boolean r0 = r1.cancelled
            return r0
    }

    public boolean isHandled() {
            r1 = this;
            boolean r0 = r1.handled
            return r0
    }

    public boolean isStopped() {
            r1 = this;
            boolean r0 = r1.stopped
            return r0
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r2 = this;
            r0 = 0
            r2.stage = r0
            r2.targetActor = r0
            r2.listenerActor = r0
            r0 = 0
            r2.capture = r0
            r1 = 1
            r2.bubbles = r1
            r2.handled = r0
            r2.stopped = r0
            r2.cancelled = r0
            return
    }

    public void setCapture(boolean r1) {
            r0 = this;
            r0.capture = r1
            return
    }

    public void setListenerActor(com.badlogic.gdx.scenes.scene2d.Actor r1) {
            r0 = this;
            r0.listenerActor = r1
            return
    }

    public void setStage(com.badlogic.gdx.scenes.scene2d.Stage r1) {
            r0 = this;
            r0.stage = r1
            return
    }

    public void setTarget(com.badlogic.gdx.scenes.scene2d.Actor r1) {
            r0 = this;
            r0.targetActor = r1
            return
    }

    public void stop() {
            r1 = this;
            r0 = 1
            r1.stopped = r0
            return
    }
}
