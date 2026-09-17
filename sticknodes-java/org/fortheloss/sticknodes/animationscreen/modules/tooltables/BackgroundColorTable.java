package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class BackgroundColorTable extends com.badlogic.gdx.scenes.scene2d.ui.Table {
    private static com.badlogic.gdx.graphics.Color _tempColor;
    public static com.badlogic.gdx.graphics.Color tableColor;

    static {
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable._tempColor = r0
            return
    }

    public BackgroundColorTable(com.badlogic.gdx.scenes.scene2d.utils.Drawable r4) {
            r3 = this;
            r3.<init>()
            r3.setBackground(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r0 = 1101004800(0x41a00000, float:20.0)
            float r1 = r4 * r0
            float r4 = r4 * r0
            r0 = 0
            r3.pad(r1, r0, r4, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.space(r0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.spaceRight(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.spaceBottom(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.pad(r0)
            r0 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.align(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.expandX()
            r4.uniformX()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table
    protected void drawBackground(com.badlogic.gdx.graphics.g2d.Batch r3, float r4, float r5, float r6) {
            r2 = this;
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable.tableColor
            if (r0 != 0) goto L5
            return
        L5:
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable._tempColor
            com.badlogic.gdx.graphics.Color r1 = r2.getColor()
            r0.set(r1)
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable.tableColor
            r2.setColor(r0)
            super.drawBackground(r3, r4, r5, r6)
            com.badlogic.gdx.graphics.Color r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable._tempColor
            r2.setColor(r3)
            return
    }
}
