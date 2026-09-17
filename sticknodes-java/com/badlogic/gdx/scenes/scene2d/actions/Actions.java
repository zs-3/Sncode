package com.badlogic.gdx.scenes.scene2d.actions;

/* loaded from: classes.dex */
public class Actions {
    public static <T extends com.badlogic.gdx.scenes.scene2d.Action> T action(java.lang.Class<T> r1) {
            com.badlogic.gdx.utils.Pool r1 = com.badlogic.gdx.utils.Pools.get(r1)
            java.lang.Object r0 = r1.obtain()
            com.badlogic.gdx.scenes.scene2d.Action r0 = (com.badlogic.gdx.scenes.scene2d.Action) r0
            r0.setPool(r1)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.AlphaAction alpha(float r2) {
            r0 = 0
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r2 = alpha(r2, r0, r1)
            return r2
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.AlphaAction alpha(float r1, float r2) {
            r0 = 0
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r1 = alpha(r1, r2, r0)
            return r1
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.AlphaAction alpha(float r1, float r2, com.badlogic.gdx.math.Interpolation r3) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.AlphaAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.AlphaAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.AlphaAction) r0
            r0.setAlpha(r1)
            r0.setDuration(r2)
            r0.setInterpolation(r3)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.ColorAction color(com.badlogic.gdx.graphics.Color r2) {
            r0 = 0
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.actions.ColorAction r2 = color(r2, r0, r1)
            return r2
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.ColorAction color(com.badlogic.gdx.graphics.Color r1, float r2, com.badlogic.gdx.math.Interpolation r3) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.ColorAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.ColorAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.ColorAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.ColorAction) r0
            r0.setEndColor(r1)
            r0.setDuration(r2)
            r0.setInterpolation(r3)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.DelayAction delay(float r1) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.DelayAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.DelayAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.DelayAction) r0
            r0.setDuration(r1)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.DelayAction delay(float r1, com.badlogic.gdx.scenes.scene2d.Action r2) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.DelayAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.DelayAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.DelayAction) r0
            r0.setDuration(r1)
            r0.setAction(r2)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.AlphaAction fadeIn(float r2) {
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r2 = alpha(r0, r2, r1)
            return r2
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.AlphaAction fadeIn(float r2, com.badlogic.gdx.math.Interpolation r3) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.AlphaAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.AlphaAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.AlphaAction) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            r0.setDuration(r2)
            r0.setInterpolation(r3)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.AlphaAction fadeOut(float r2, com.badlogic.gdx.math.Interpolation r3) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.AlphaAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.AlphaAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.AlphaAction) r0
            r1 = 0
            r0.setAlpha(r1)
            r0.setDuration(r2)
            r0.setInterpolation(r3)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.RepeatAction forever(com.badlogic.gdx.scenes.scene2d.Action r2) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.RepeatAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.RepeatAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.RepeatAction) r0
            r1 = -1
            r0.setCount(r1)
            r0.setAction(r2)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.MoveByAction moveBy(float r2, float r3) {
            r0 = 0
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r2 = moveBy(r2, r3, r0, r1)
            return r2
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.MoveByAction moveBy(float r1, float r2, float r3, com.badlogic.gdx.math.Interpolation r4) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.MoveByAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.MoveByAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.MoveByAction) r0
            r0.setAmount(r1, r2)
            r0.setDuration(r3)
            r0.setInterpolation(r4)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.MoveToAction moveTo(float r2, float r3) {
            r0 = 0
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.actions.MoveToAction r2 = moveTo(r2, r3, r0, r1)
            return r2
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.MoveToAction moveTo(float r1, float r2, float r3, com.badlogic.gdx.math.Interpolation r4) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.MoveToAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.MoveToAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.MoveToAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.MoveToAction) r0
            r0.setPosition(r1, r2)
            r0.setDuration(r3)
            r0.setInterpolation(r4)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.ParallelAction parallel(com.badlogic.gdx.scenes.scene2d.Action r1, com.badlogic.gdx.scenes.scene2d.Action r2) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.ParallelAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.ParallelAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.ParallelAction) r0
            r0.addAction(r1)
            r0.addAction(r2)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.ParallelAction parallel(com.badlogic.gdx.scenes.scene2d.Action r1, com.badlogic.gdx.scenes.scene2d.Action r2, com.badlogic.gdx.scenes.scene2d.Action r3) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.ParallelAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.ParallelAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.ParallelAction) r0
            r0.addAction(r1)
            r0.addAction(r2)
            r0.addAction(r3)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.ParallelAction parallel(com.badlogic.gdx.scenes.scene2d.Action r1, com.badlogic.gdx.scenes.scene2d.Action r2, com.badlogic.gdx.scenes.scene2d.Action r3, com.badlogic.gdx.scenes.scene2d.Action r4) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.ParallelAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.ParallelAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.ParallelAction) r0
            r0.addAction(r1)
            r0.addAction(r2)
            r0.addAction(r3)
            r0.addAction(r4)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.ParallelAction parallel(com.badlogic.gdx.scenes.scene2d.Action r1, com.badlogic.gdx.scenes.scene2d.Action r2, com.badlogic.gdx.scenes.scene2d.Action r3, com.badlogic.gdx.scenes.scene2d.Action r4, com.badlogic.gdx.scenes.scene2d.Action r5) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.ParallelAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.ParallelAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.ParallelAction) r0
            r0.addAction(r1)
            r0.addAction(r2)
            r0.addAction(r3)
            r0.addAction(r4)
            r0.addAction(r5)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.ParallelAction parallel(com.badlogic.gdx.scenes.scene2d.Action... r4) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.ParallelAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.ParallelAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.ParallelAction) r0
            int r1 = r4.length
            r2 = 0
        La:
            if (r2 >= r1) goto L14
            r3 = r4[r2]
            r0.addAction(r3)
            int r2 = r2 + 1
            goto La
        L14:
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction removeActor() {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction) r0
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.RemoveListenerAction removeListener(com.badlogic.gdx.scenes.scene2d.EventListener r1, boolean r2) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.RemoveListenerAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.RemoveListenerAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveListenerAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.RemoveListenerAction) r0
            r0.setListener(r1)
            r0.setCapture(r2)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.RepeatAction repeat(int r1, com.badlogic.gdx.scenes.scene2d.Action r2) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.RepeatAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.RepeatAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.RepeatAction) r0
            r0.setCount(r1)
            r0.setAction(r2)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.RotateByAction rotateBy(float r2) {
            r0 = 0
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r2 = rotateBy(r2, r0, r1)
            return r2
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.RotateByAction rotateBy(float r1, float r2, com.badlogic.gdx.math.Interpolation r3) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.RotateByAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.RotateByAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.RotateByAction) r0
            r0.setAmount(r1)
            r0.setDuration(r2)
            r0.setInterpolation(r3)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.RotateToAction rotateTo(float r2) {
            r0 = 0
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r2 = rotateTo(r2, r0, r1)
            return r2
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.RotateToAction rotateTo(float r1, float r2) {
            r0 = 0
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r1 = rotateTo(r1, r2, r0)
            return r1
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.RotateToAction rotateTo(float r1, float r2, com.badlogic.gdx.math.Interpolation r3) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.RotateToAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.RotateToAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.RotateToAction) r0
            r0.setRotation(r1)
            r0.setDuration(r2)
            r0.setInterpolation(r3)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.RunnableAction run(java.lang.Runnable r1) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.RunnableAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.RunnableAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.RunnableAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.RunnableAction) r0
            r0.setRunnable(r1)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.ScaleByAction scaleBy(float r1, float r2, float r3, com.badlogic.gdx.math.Interpolation r4) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.ScaleByAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.ScaleByAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleByAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.ScaleByAction) r0
            r0.setAmount(r1, r2)
            r0.setDuration(r3)
            r0.setInterpolation(r4)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction scaleTo(float r2, float r3) {
            r0 = 0
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r2 = scaleTo(r2, r3, r0, r1)
            return r2
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction scaleTo(float r1, float r2, float r3, com.badlogic.gdx.math.Interpolation r4) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction) r0
            r0.setScale(r1, r2)
            r0.setDuration(r3)
            r0.setInterpolation(r4)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.SequenceAction sequence(com.badlogic.gdx.scenes.scene2d.Action r1) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.SequenceAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.SequenceAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.SequenceAction) r0
            r0.addAction(r1)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.SequenceAction sequence(com.badlogic.gdx.scenes.scene2d.Action r1, com.badlogic.gdx.scenes.scene2d.Action r2) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.SequenceAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.SequenceAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.SequenceAction) r0
            r0.addAction(r1)
            r0.addAction(r2)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.SequenceAction sequence(com.badlogic.gdx.scenes.scene2d.Action r1, com.badlogic.gdx.scenes.scene2d.Action r2, com.badlogic.gdx.scenes.scene2d.Action r3) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.SequenceAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.SequenceAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.SequenceAction) r0
            r0.addAction(r1)
            r0.addAction(r2)
            r0.addAction(r3)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.SequenceAction sequence(com.badlogic.gdx.scenes.scene2d.Action r1, com.badlogic.gdx.scenes.scene2d.Action r2, com.badlogic.gdx.scenes.scene2d.Action r3, com.badlogic.gdx.scenes.scene2d.Action r4) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.SequenceAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.SequenceAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.SequenceAction) r0
            r0.addAction(r1)
            r0.addAction(r2)
            r0.addAction(r3)
            r0.addAction(r4)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.SequenceAction sequence(com.badlogic.gdx.scenes.scene2d.Action r1, com.badlogic.gdx.scenes.scene2d.Action r2, com.badlogic.gdx.scenes.scene2d.Action r3, com.badlogic.gdx.scenes.scene2d.Action r4, com.badlogic.gdx.scenes.scene2d.Action r5) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.SequenceAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.SequenceAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.SequenceAction) r0
            r0.addAction(r1)
            r0.addAction(r2)
            r0.addAction(r3)
            r0.addAction(r4)
            r0.addAction(r5)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.SequenceAction sequence(com.badlogic.gdx.scenes.scene2d.Action... r4) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.SequenceAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.SequenceAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.SequenceAction) r0
            int r1 = r4.length
            r2 = 0
        La:
            if (r2 >= r1) goto L14
            r3 = r4[r2]
            r0.addAction(r3)
            int r2 = r2 + 1
            goto La
        L14:
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.actions.VisibleAction visible(boolean r1) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.actions.VisibleAction> r0 = com.badlogic.gdx.scenes.scene2d.actions.VisibleAction.class
            com.badlogic.gdx.scenes.scene2d.Action r0 = action(r0)
            com.badlogic.gdx.scenes.scene2d.actions.VisibleAction r0 = (com.badlogic.gdx.scenes.scene2d.actions.VisibleAction) r0
            r0.setVisible(r1)
            return r0
    }
}
