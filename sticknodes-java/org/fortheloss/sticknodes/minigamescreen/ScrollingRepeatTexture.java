package org.fortheloss.sticknodes.minigamescreen;

/* loaded from: classes2.dex */
public class ScrollingRepeatTexture extends com.badlogic.gdx.scenes.scene2d.Actor implements com.badlogic.gdx.utils.Disposable {
    private int _numCols;
    private int _numRows;
    private float _offsetX;
    private float _offsetY;
    private int _regionHeight;
    private int _regionWidth;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _tr;

    public ScrollingRepeatTexture(com.badlogic.gdx.graphics.g2d.TextureRegion r2, float r3, float r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._regionWidth = r0
            r1._regionHeight = r0
            r1._numRows = r0
            r1._numCols = r0
            r0 = 0
            r1._offsetX = r0
            r1._offsetY = r0
            r1._tr = r2
            r1.setSize(r3, r4)
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r1._tr
            int r2 = r2.getRegionWidth()
            r1._regionWidth = r2
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r1._tr
            int r2 = r2.getRegionHeight()
            r1._regionHeight = r2
            float r2 = r1.getWidth()
            int r3 = r1._regionWidth
            float r3 = (float) r3
            float r2 = r2 / r3
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            int r2 = r2 + 1
            r1._numCols = r2
            float r2 = r1.getHeight()
            int r3 = r1._regionHeight
            float r3 = (float) r3
            float r2 = r2 / r3
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            int r2 = r2 + 1
            r1._numRows = r2
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r1) {
            r0 = this;
            super.act(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r1.remove()
            r1.clear()
            r0 = 0
            r1._tr = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r18, float r19) {
            r17 = this;
            r0 = r17
            super.draw(r18, r19)
            com.badlogic.gdx.graphics.Color r1 = r17.getColor()
            r8 = r18
            r8.setColor(r1)
            float r1 = r17.getX()
            int r1 = (int) r1
            float r2 = r17.getY()
            int r9 = (int) r2
            float r2 = r0._offsetX
            int r10 = (int) r2
            float r2 = r0._offsetY
            int r11 = (int) r2
            r12 = 0
            r13 = 0
        L20:
            int r2 = r0._numCols
            if (r13 >= r2) goto L53
            int r2 = r0._regionWidth
            int r2 = r2 * r13
            int r2 = r2 + r1
            int r14 = r2 + r10
            r15 = 0
        L2c:
            int r2 = r0._numRows
            if (r15 >= r2) goto L50
            int r2 = r0._regionHeight
            int r3 = r9 - r2
            int r4 = r15 * r2
            int r3 = r3 - r4
            int r3 = r3 + r11
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = r0._tr
            float r5 = (float) r14
            float r6 = (float) r3
            int r3 = r0._regionWidth
            float r7 = (float) r3
            float r3 = (float) r2
            r2 = r18
            r16 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r16
            r2.draw(r3, r4, r5, r6, r7)
            int r15 = r15 + 1
            goto L2c
        L50:
            int r13 = r13 + 1
            goto L20
        L53:
            return
    }

    public void incrementOffsetX(float r3) {
            r2 = this;
            float r0 = r2._offsetX
            float r0 = r0 + r3
            r2._offsetX = r0
        L5:
            float r3 = r2._offsetX
            int r0 = r2._regionWidth
            int r1 = -r0
            float r1 = (float) r1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L14
            float r0 = (float) r0
            float r3 = r3 + r0
            r2._offsetX = r3
            goto L5
        L14:
            float r3 = r2._offsetX
            int r0 = r2._regionWidth
            float r1 = (float) r0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L22
            float r0 = (float) r0
            float r3 = r3 - r0
            r2._offsetX = r3
            goto L14
        L22:
            return
    }
}
