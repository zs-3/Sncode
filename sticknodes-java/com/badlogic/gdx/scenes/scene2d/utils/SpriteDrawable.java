package com.badlogic.gdx.scenes.scene2d.utils;

/* loaded from: classes.dex */
public class SpriteDrawable extends com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable implements com.badlogic.gdx.scenes.scene2d.utils.TransformDrawable {
    private com.badlogic.gdx.graphics.g2d.Sprite sprite;

    public SpriteDrawable() {
            r0 = this;
            r0.<init>()
            return
    }

    public SpriteDrawable(com.badlogic.gdx.graphics.g2d.Sprite r1) {
            r0 = this;
            r0.<init>()
            r0.setSprite(r1)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable, com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r5, float r6, float r7, float r8, float r9) {
            r4 = this;
            com.badlogic.gdx.graphics.g2d.Sprite r0 = r4.sprite
            com.badlogic.gdx.graphics.Color r0 = r0.getColor()
            float r1 = r0.toFloatBits()
            com.badlogic.gdx.graphics.g2d.Sprite r2 = r4.sprite
            com.badlogic.gdx.graphics.Color r3 = r5.getColor()
            com.badlogic.gdx.graphics.Color r0 = r0.mul(r3)
            r2.setColor(r0)
            com.badlogic.gdx.graphics.g2d.Sprite r0 = r4.sprite
            r2 = 0
            r0.setRotation(r2)
            com.badlogic.gdx.graphics.g2d.Sprite r0 = r4.sprite
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setScale(r2, r2)
            com.badlogic.gdx.graphics.g2d.Sprite r0 = r4.sprite
            r0.setBounds(r6, r7, r8, r9)
            com.badlogic.gdx.graphics.g2d.Sprite r6 = r4.sprite
            r6.draw(r5)
            com.badlogic.gdx.graphics.g2d.Sprite r5 = r4.sprite
            r5.setPackedColor(r1)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.TransformDrawable
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r5, float r6, float r7, float r8, float r9, float r10, float r11, float r12, float r13, float r14) {
            r4 = this;
            com.badlogic.gdx.graphics.g2d.Sprite r0 = r4.sprite
            com.badlogic.gdx.graphics.Color r0 = r0.getColor()
            float r1 = r0.toFloatBits()
            com.badlogic.gdx.graphics.g2d.Sprite r2 = r4.sprite
            com.badlogic.gdx.graphics.Color r3 = r5.getColor()
            com.badlogic.gdx.graphics.Color r0 = r0.mul(r3)
            r2.setColor(r0)
            com.badlogic.gdx.graphics.g2d.Sprite r0 = r4.sprite
            r0.setOrigin(r8, r9)
            com.badlogic.gdx.graphics.g2d.Sprite r8 = r4.sprite
            r8.setRotation(r14)
            com.badlogic.gdx.graphics.g2d.Sprite r8 = r4.sprite
            r8.setScale(r12, r13)
            com.badlogic.gdx.graphics.g2d.Sprite r8 = r4.sprite
            r8.setBounds(r6, r7, r10, r11)
            com.badlogic.gdx.graphics.g2d.Sprite r6 = r4.sprite
            r6.draw(r5)
            com.badlogic.gdx.graphics.g2d.Sprite r5 = r4.sprite
            r5.setPackedColor(r1)
            return
    }

    public void setSprite(com.badlogic.gdx.graphics.g2d.Sprite r2) {
            r1 = this;
            r1.sprite = r2
            float r0 = r2.getWidth()
            r1.setMinWidth(r0)
            float r2 = r2.getHeight()
            r1.setMinHeight(r2)
            return
    }

    public com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable tint(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            com.badlogic.gdx.graphics.g2d.Sprite r0 = r2.sprite
            boolean r1 = r0 instanceof com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasSprite
            if (r1 == 0) goto Le
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasSprite r1 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasSprite
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasSprite r0 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasSprite) r0
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
