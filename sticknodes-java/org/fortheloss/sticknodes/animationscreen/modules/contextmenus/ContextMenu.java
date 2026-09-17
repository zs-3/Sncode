package org.fortheloss.sticknodes.animationscreen.modules.contextmenus;

/* loaded from: classes2.dex */
public class ContextMenu extends com.badlogic.gdx.scenes.scene2d.ui.Table implements com.badlogic.gdx.utils.Disposable {
    private static com.badlogic.gdx.math.Vector2 point;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener _hideListener;


    static {
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu.point = r0
            return
    }

    public ContextMenu(com.badlogic.gdx.scenes.scene2d.utils.Drawable r4) {
            r3 = this;
            r3.<init>()
            r3.setBackground(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r0 = 1101004800(0x41a00000, float:20.0)
            float r4 = r4 * r0
            r3.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.defaults()
            r0 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.space(r0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.spaceRight(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.spaceBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.pad(r0)
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.expandX()
            r4.uniformX()
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.setColor(r4, r4, r4, r0)
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r4)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu$1 r4 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu$1
            r4.<init>(r3)
            r3._hideListener = r4
            return
    }

    public void dispose() {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r0 = r3._hideListener
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            r3._hideListener = r0
        La:
            com.badlogic.gdx.utils.Array r0 = r3.getCells()
            int r1 = r0.size
            int r1 = r1 + (-1)
        L12:
            if (r1 < 0) goto L26
            java.lang.Object r2 = r0.get(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r2
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getActor()
            if (r2 == 0) goto L23
            r2.clear()
        L23:
            int r1 = r1 + (-1)
            goto L12
        L26:
            r3.clear()
            return
    }

    public void hide() {
            r1 = this;
            r0 = 0
            r1.hide(r0)
            return
    }

    public void hide(boolean r3) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2.getStage()
            if (r0 != 0) goto L7
            return
        L7:
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r2.setTouchable(r0)
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2.getStage()
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r1 = r2._hideListener
            r0.removeListener(r1)
            r0 = 0
            if (r3 == 0) goto L24
            r2.clearActions()
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setColor(r3, r3, r3, r0)
            r2.remove()
            goto L37
        L24:
            r3 = 1048576000(0x3e800000, float:0.25)
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.sineOut
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r0, r3, r1)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r3, r0)
            r2.addAction(r3)
        L37:
            return
    }

    public void show(com.badlogic.gdx.scenes.scene2d.Actor r4, com.badlogic.gdx.scenes.scene2d.Stage r5, int r6) {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r3.getStage()
            if (r0 == 0) goto L7
            return
        L7:
            com.badlogic.gdx.math.Vector2 r0 = org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu.point
            r1 = 0
            r0.set(r1, r1)
            com.badlogic.gdx.math.Vector2 r0 = org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu.point
            com.badlogic.gdx.math.Vector2 r2 = r4.localToStageCoordinates(r0)
            r0.set(r2)
            r0 = 8
            if (r6 == r0) goto L63
            r2 = 16
            if (r6 != r2) goto L1f
            goto L63
        L1f:
            r0 = 2
            if (r6 != r0) goto L2e
            com.badlogic.gdx.math.Vector2 r6 = org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu.point
            float r0 = r6.y
            float r4 = r4.getHeight()
            float r0 = r0 + r4
            r6.y = r0
            goto L39
        L2e:
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu.point
            float r6 = r4.y
            float r0 = r3.getHeight()
            float r6 = r6 - r0
            r4.y = r6
        L39:
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu.point
            float r6 = r4.x
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L44
            r4.x = r1
            goto Lb5
        L44:
            float r4 = r3.getWidth()
            float r6 = r6 + r4
            float r4 = r5.getWidth()
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lb5
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu.point
            float r6 = r4.x
            float r0 = r3.getWidth()
            float r0 = r0 + r6
            float r2 = r5.getWidth()
            float r0 = r0 - r2
            float r6 = r6 - r0
            r4.x = r6
            goto Lb5
        L63:
            if (r6 != r0) goto L71
            com.badlogic.gdx.math.Vector2 r6 = org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu.point
            float r0 = r6.x
            float r2 = r3.getWidth()
            float r0 = r0 - r2
            r6.x = r0
            goto L7c
        L71:
            com.badlogic.gdx.math.Vector2 r6 = org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu.point
            float r0 = r6.x
            float r2 = r4.getWidth()
            float r0 = r0 + r2
            r6.x = r0
        L7c:
            com.badlogic.gdx.math.Vector2 r6 = org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu.point
            float r0 = r6.y
            float r4 = r4.getHeight()
            float r0 = r0 + r4
            float r4 = r3.getHeight()
            float r0 = r0 - r4
            r6.y = r0
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu.point
            float r6 = r4.y
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L97
            r4.y = r1
            goto Lb5
        L97:
            float r4 = r3.getHeight()
            float r6 = r6 + r4
            float r4 = r5.getHeight()
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lb5
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu.point
            float r6 = r4.y
            float r0 = r3.getHeight()
            float r0 = r0 + r6
            float r2 = r5.getHeight()
            float r0 = r0 - r2
            float r6 = r6 - r0
            r4.y = r6
        Lb5:
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.setColor(r4, r4, r4, r1)
            r5.addActor(r3)
            com.badlogic.gdx.scenes.scene2d.Touchable r6 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r3.setTouchable(r6)
            r6 = 1048576000(0x3e800000, float:0.25)
            com.badlogic.gdx.math.Interpolation r0 = com.badlogic.gdx.math.Interpolation.sineOut
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r4, r6, r0)
            r3.addAction(r4)
            com.badlogic.gdx.math.Vector2 r4 = org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu.point
            float r6 = r4.x
            float r4 = r4.y
            r3.setPosition(r6, r4)
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r4 = r3._hideListener
            r5.addListener(r4)
            return
    }
}
