package org.fortheloss.sticknodes;

/* loaded from: classes2.dex */
public class FontBundle implements com.badlogic.gdx.utils.Disposable {
    private com.badlogic.gdx.graphics.g2d.BitmapFont mBitmapFont;
    private java.lang.String mFontPath;
    private int mId;
    private com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle mLabelStyle;
    private java.lang.String mName;

    public FontBundle(java.lang.String r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.mName = r1
            r0.mFontPath = r2
            r0.mId = r3
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            r1.<init>()
            r0.mLabelStyle = r1
            r2 = 0
            r1.font = r2
            r1.fontColor = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r1.unload()
            r0 = 0
            r1.mBitmapFont = r0
            r1.mLabelStyle = r0
            r1.mName = r0
            r1.mFontPath = r0
            return
    }

    public int getId() {
            r1 = this;
            int r0 = r1.mId
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle getLabelStyle() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = r1.mLabelStyle
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    public boolean isLoaded() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r1.mBitmapFont
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void load() {
            r7 = this;
            boolean r0 = r7.isLoaded()
            if (r0 == 0) goto L7
            return
        L7:
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = new com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            java.lang.String r2 = r7.mFontPath
            com.badlogic.gdx.files.FileHandle r1 = r1.internal(r2)
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.String[] r1 = r0.getImagePaths()
            int r1 = r1.length
            com.badlogic.gdx.utils.Array r3 = new com.badlogic.gdx.utils.Array
            r3.<init>(r1)
            r4 = 0
        L20:
            if (r4 >= r1) goto L3b
            com.badlogic.gdx.graphics.Texture r5 = new com.badlogic.gdx.graphics.Texture
            java.lang.String r6 = r0.getImagePath(r4)
            r5.<init>(r6)
            com.badlogic.gdx.graphics.Texture$TextureFilter r6 = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            r5.setFilter(r6, r6)
            com.badlogic.gdx.graphics.g2d.TextureRegion r6 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            r6.<init>(r5)
            r3.add(r6)
            int r4 = r4 + 1
            goto L20
        L3b:
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = new com.badlogic.gdx.graphics.g2d.BitmapFont
            r1.<init>(r0, r3, r2)
            r7.mBitmapFont = r1
            r0 = 1
            r1.setOwnsTexture(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = r7.mLabelStyle
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r7.mBitmapFont
            r0.font = r1
            return
    }

    public void unload() {
            r2 = this;
            boolean r0 = r2.isLoaded()
            if (r0 != 0) goto L7
            return
        L7:
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = r2.mLabelStyle
            r1 = 0
            r0.font = r1
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r2.mBitmapFont
            if (r0 == 0) goto L15
            r0.dispose()
            r2.mBitmapFont = r1
        L15:
            return
    }
}
