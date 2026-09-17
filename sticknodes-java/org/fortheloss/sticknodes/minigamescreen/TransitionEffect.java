package org.fortheloss.sticknodes.minigamescreen;

/* loaded from: classes2.dex */
public class TransitionEffect extends com.badlogic.gdx.scenes.scene2d.Actor implements com.badlogic.gdx.utils.Disposable {
    private float SECONDS_TO_FINISH_FADE;
    private float _fadeSecondsForEachTile;
    private int _numCols;
    private int _numOpaqueTiles;
    private int _numRows;
    private int _numTiles;
    private float _seconds;
    private int _state;
    private int _tileSize;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _tr;
    private float _transparencyForCurrentTile;

    public TransitionEffect(com.badlogic.gdx.graphics.g2d.TextureRegion r2, float r3, float r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public TransitionEffect(com.badlogic.gdx.graphics.g2d.TextureRegion r4, float r5, float r6, boolean r7) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3._tileSize = r0
            r3._numRows = r0
            r3._numCols = r0
            r3._numTiles = r0
            r1 = 0
            r3._seconds = r1
            r3._fadeSecondsForEachTile = r1
            r3._state = r0
            r3._numOpaqueTiles = r0
            r3._transparencyForCurrentTile = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.SECONDS_TO_FINISH_FADE = r2
            r3._tr = r4
            r3.setSize(r5, r6)
            float r4 = java.lang.Math.min(r5, r6)
            r5 = 1048576000(0x3e800000, float:0.25)
            float r4 = r4 * r5
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            r3._tileSize = r4
            float r4 = r3.getWidth()
            int r5 = r3._tileSize
            float r5 = (float) r5
            float r4 = r4 / r5
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            r3._numCols = r4
            float r4 = r3.getHeight()
            int r5 = r3._tileSize
            float r5 = (float) r5
            float r4 = r4 / r5
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            r3._numRows = r4
            int r5 = r3._numCols
            int r4 = r4 * r5
            r3._numTiles = r4
            float r5 = r3.SECONDS_TO_FINISH_FADE
            float r6 = (float) r4
            float r6 = r5 / r6
            r3._fadeSecondsForEachTile = r6
            if (r7 == 0) goto L69
            r6 = 1
            r3._state = r6
            r3._seconds = r5
            r3._numOpaqueTiles = r4
            r3._transparencyForCurrentTile = r2
            goto L71
        L69:
            r3._state = r0
            r3._seconds = r1
            r3._numOpaqueTiles = r0
            r3._transparencyForCurrentTile = r1
        L71:
            r3.setColor(r1, r1, r1, r2)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r4) {
            r3 = this;
            super.act(r4)
            int r0 = r3._state
            r1 = 2
            if (r0 != r1) goto Lc
            r3.dispose()
            return
        Lc:
            r2 = 1
            if (r0 != 0) goto L15
            float r0 = r3._seconds
            float r0 = r0 + r4
            r3._seconds = r0
            goto L1c
        L15:
            if (r0 != r2) goto L1c
            float r0 = r3._seconds
            float r0 = r0 - r4
            r3._seconds = r0
        L1c:
            float r4 = r3._seconds
            float r0 = r3.SECONDS_TO_FINISH_FADE
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L36
            r3.onTransition()
            int r4 = r3._numTiles
            r3._numOpaqueTiles = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3._transparencyForCurrentTile = r4
            float r4 = r3.SECONDS_TO_FINISH_FADE
            r3._seconds = r4
            r3._state = r2
            goto L50
        L36:
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L45
            r4 = 0
            r3._numOpaqueTiles = r4
            r3._transparencyForCurrentTile = r0
            r3._seconds = r0
            r3._state = r1
            goto L50
        L45:
            float r0 = r3._fadeSecondsForEachTile
            float r1 = r4 / r0
            int r1 = (int) r1
            r3._numOpaqueTiles = r1
            float r4 = r4 % r0
            float r4 = r4 / r0
            r3._transparencyForCurrentTile = r4
        L50:
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
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r19, float r20) {
            r18 = this;
            r0 = r18
            r7 = r19
            super.draw(r19, r20)
            com.badlogic.gdx.graphics.Color r1 = r18.getColor()
            r7.setColor(r1)
            float r1 = r18.getX()
            int r8 = (int) r1
            float r1 = r18.getY()
            int r9 = (int) r1
            int r1 = r0._state
            r10 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            if (r1 != 0) goto L9c
            r1 = 0
            r13 = 0
        L22:
            int r2 = r0._numRows
            if (r13 >= r2) goto L116
            int r2 = r0._tileSize
            int r2 = r2 * r13
            int r14 = r9 + r2
            r15 = r1
            r6 = 0
        L2e:
            int r1 = r0._numCols
            if (r6 >= r1) goto L98
            int r1 = r0._tileSize
            int r1 = r1 * r6
            int r1 = r1 + r8
            int r2 = r0._numOpaqueTiles
            if (r15 >= r2) goto L51
            com.badlogic.gdx.graphics.Color r2 = r18.getColor()
            float r2 = r2.r
            com.badlogic.gdx.graphics.Color r3 = r18.getColor()
            float r3 = r3.g
            com.badlogic.gdx.graphics.Color r4 = r18.getColor()
            float r4 = r4.b
            r7.setColor(r2, r3, r4, r11)
            goto L80
        L51:
            if (r15 <= r2) goto L69
            com.badlogic.gdx.graphics.Color r2 = r18.getColor()
            float r2 = r2.r
            com.badlogic.gdx.graphics.Color r3 = r18.getColor()
            float r3 = r3.g
            com.badlogic.gdx.graphics.Color r4 = r18.getColor()
            float r4 = r4.b
            r7.setColor(r2, r3, r4, r10)
            goto L80
        L69:
            com.badlogic.gdx.graphics.Color r2 = r18.getColor()
            float r2 = r2.r
            com.badlogic.gdx.graphics.Color r3 = r18.getColor()
            float r3 = r3.g
            com.badlogic.gdx.graphics.Color r4 = r18.getColor()
            float r4 = r4.b
            float r5 = r0._transparencyForCurrentTile
            r7.setColor(r2, r3, r4, r5)
        L80:
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._tr
            float r3 = (float) r1
            float r4 = (float) r14
            int r1 = r0._tileSize
            float r5 = (float) r1
            float r1 = (float) r1
            r16 = r1
            r1 = r19
            r17 = r6
            r6 = r16
            r1.draw(r2, r3, r4, r5, r6)
            int r15 = r15 + 1
            int r6 = r17 + 1
            goto L2e
        L98:
            int r13 = r13 + 1
            r1 = r15
            goto L22
        L9c:
            int r1 = r0._numRows
            int r1 = r1 + (-1)
            r12 = r1
            r1 = 0
        La2:
            if (r12 < 0) goto L116
            int r2 = r0._tileSize
            int r2 = r2 * r12
            int r13 = r9 + r2
            int r2 = r0._numCols
            int r2 = r2 + (-1)
            r14 = r1
            r15 = r2
        Lb0:
            if (r15 < 0) goto L112
            int r1 = r0._tileSize
            int r1 = r1 * r15
            int r1 = r1 + r8
            int r2 = r0._numOpaqueTiles
            if (r14 >= r2) goto Ld1
            com.badlogic.gdx.graphics.Color r2 = r18.getColor()
            float r2 = r2.r
            com.badlogic.gdx.graphics.Color r3 = r18.getColor()
            float r3 = r3.g
            com.badlogic.gdx.graphics.Color r4 = r18.getColor()
            float r4 = r4.b
            r7.setColor(r2, r3, r4, r11)
            goto L100
        Ld1:
            if (r14 <= r2) goto Le9
            com.badlogic.gdx.graphics.Color r2 = r18.getColor()
            float r2 = r2.r
            com.badlogic.gdx.graphics.Color r3 = r18.getColor()
            float r3 = r3.g
            com.badlogic.gdx.graphics.Color r4 = r18.getColor()
            float r4 = r4.b
            r7.setColor(r2, r3, r4, r10)
            goto L100
        Le9:
            com.badlogic.gdx.graphics.Color r2 = r18.getColor()
            float r2 = r2.r
            com.badlogic.gdx.graphics.Color r3 = r18.getColor()
            float r3 = r3.g
            com.badlogic.gdx.graphics.Color r4 = r18.getColor()
            float r4 = r4.b
            float r5 = r0._transparencyForCurrentTile
            r7.setColor(r2, r3, r4, r5)
        L100:
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._tr
            float r3 = (float) r1
            float r4 = (float) r13
            int r1 = r0._tileSize
            float r5 = (float) r1
            float r6 = (float) r1
            r1 = r19
            r1.draw(r2, r3, r4, r5, r6)
            int r14 = r14 + 1
            int r15 = r15 + (-1)
            goto Lb0
        L112:
            int r12 = r12 + (-1)
            r1 = r14
            goto La2
        L116:
            return
    }

    public void onTransition() {
            r2 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "onTransition()"
            r0.println(r1)
            return
    }
}
