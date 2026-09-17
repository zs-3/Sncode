package com.badlogic.gdx.scenes.scene2d.utils;

/* loaded from: classes.dex */
public class TextureRegionDrawable extends com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable implements com.badlogic.gdx.scenes.scene2d.utils.TransformDrawable {
    private com.badlogic.gdx.graphics.g2d.TextureRegion region;

    public TextureRegionDrawable() {
            r0 = this;
            r0.<init>()
            return
    }

    public TextureRegionDrawable(com.badlogic.gdx.graphics.g2d.TextureRegion r1) {
            r0 = this;
            r0.<init>()
            r0.setRegion(r1)
            return
    }

    public TextureRegionDrawable(com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r1) {
            r0 = this;
            r0.<init>(r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r1.region
            r0.setRegion(r1)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable, com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r7, float r8, float r9, float r10, float r11) {
            r6 = this;
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r6.region
            r0 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.draw(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.TransformDrawable
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r13, float r14, float r15, float r16, float r17, float r18, float r19, float r20, float r21, float r22) {
            r12 = this;
            r0 = r12
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0.region
            r1 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public com.badlogic.gdx.graphics.g2d.TextureRegion getRegion() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r1.region
            return r0
    }

    public void setRegion(com.badlogic.gdx.graphics.g2d.TextureRegion r2) {
            r1 = this;
            r1.region = r2
            if (r2 == 0) goto L14
            int r0 = r2.getRegionWidth()
            float r0 = (float) r0
            r1.setMinWidth(r0)
            int r2 = r2.getRegionHeight()
            float r2 = (float) r2
            r1.setMinHeight(r2)
        L14:
            return
    }

    public com.badlogic.gdx.scenes.scene2d.utils.Drawable tint(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r2.region
            boolean r1 = r0 instanceof com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion
            if (r1 == 0) goto Le
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasSprite r1 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasSprite
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion) r0
            r1.<init>(r0)
            goto L13
        Le:
            com.badlogic.gdx.graphics.g2d.Sprite r1 = new com.badlogic.gdx.graphics.g2d.Sprite
            r1.<init>(r0)
        L13:
            r1.setColor(r3)
            float r3 = r2.getMinWidth()
            float r0 = r2.getMinHeight()
            r1.setSize(r3, r0)
            com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable r3 = new com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable
            r3.<init>(r1)
            float r0 = r2.getLeftWidth()
            r3.setLeftWidth(r0)
            float r0 = r2.getRightWidth()
            r3.setRightWidth(r0)
            float r0 = r2.getTopHeight()
            r3.setTopHeight(r0)
            float r0 = r2.getBottomHeight()
            r3.setBottomHeight(r0)
            return r3
    }
}
