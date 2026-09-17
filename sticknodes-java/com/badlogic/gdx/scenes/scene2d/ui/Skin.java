package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class Skin implements com.badlogic.gdx.utils.Disposable {
    private static final java.lang.Class[] defaultTagClasses = null;
    com.badlogic.gdx.graphics.g2d.TextureAtlas atlas;
    private final com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> jsonClassTags;
    com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Object>> resources;
    float scale;






    public static class TintedDrawable {
        public TintedDrawable() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            r0 = 24
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r2 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<com.badlogic.gdx.graphics.Color> r2 = com.badlogic.gdx.graphics.Color.class
            r0[r1] = r2
            r1 = 2
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.Skin$TintedDrawable> r2 = com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedDrawable.class
            r0[r1] = r2
            r1 = 3
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable> r2 = com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable.class
            r0[r1] = r2
            r1 = 4
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable> r2 = com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable.class
            r0[r1] = r2
            r1 = 5
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable> r2 = com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable.class
            r0[r1] = r2
            r1 = 6
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.utils.TiledDrawable> r2 = com.badlogic.gdx.scenes.scene2d.utils.TiledDrawable.class
            r0[r1] = r2
            r1 = 7
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle> r2 = com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class
            r0[r1] = r2
            r1 = 8
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle> r2 = com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle.class
            r0[r1] = r2
            r1 = 9
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle> r2 = com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle.class
            r0[r1] = r2
            r1 = 10
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle> r2 = com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle.class
            r0[r1] = r2
            r1 = 11
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle> r2 = com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle.class
            r0[r1] = r2
            r1 = 12
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle> r2 = com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle.class
            r0[r1] = r2
            r1 = 13
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.ProgressBar$ProgressBarStyle> r2 = com.badlogic.gdx.scenes.scene2d.ui.ProgressBar.ProgressBarStyle.class
            r0[r1] = r2
            r1 = 14
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle> r2 = com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle.class
            r0[r1] = r2
            r1 = 15
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle> r2 = com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle.class
            r0[r1] = r2
            r1 = 16
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle> r2 = com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle.class
            r0[r1] = r2
            r1 = 17
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.SplitPane$SplitPaneStyle> r2 = com.badlogic.gdx.scenes.scene2d.ui.SplitPane$SplitPaneStyle.class
            r0[r1] = r2
            r1 = 18
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle> r2 = com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle.class
            r0[r1] = r2
            r1 = 19
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle> r2 = com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle.class
            r0[r1] = r2
            r1 = 20
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.TextTooltip$TextTooltipStyle> r2 = com.badlogic.gdx.scenes.scene2d.ui.TextTooltip$TextTooltipStyle.class
            r0[r1] = r2
            r1 = 21
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.Touchpad$TouchpadStyle> r2 = com.badlogic.gdx.scenes.scene2d.ui.Touchpad$TouchpadStyle.class
            r0[r1] = r2
            r1 = 22
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.Tree$TreeStyle> r2 = com.badlogic.gdx.scenes.scene2d.ui.Tree$TreeStyle.class
            r0[r1] = r2
            r1 = 23
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.Window$WindowStyle> r2 = com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle.class
            r0[r1] = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin.defaultTagClasses = r0
            return
    }

    public Skin() {
            r6 = this;
            r6.<init>()
            com.badlogic.gdx.utils.ObjectMap r0 = new com.badlogic.gdx.utils.ObjectMap
            r0.<init>()
            r6.resources = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.scale = r0
            com.badlogic.gdx.utils.ObjectMap r0 = new com.badlogic.gdx.utils.ObjectMap
            java.lang.Class[] r1 = com.badlogic.gdx.scenes.scene2d.ui.Skin.defaultTagClasses
            int r2 = r1.length
            r0.<init>(r2)
            r6.jsonClassTags = r0
            int r0 = r1.length
            r2 = 0
        L1a:
            if (r2 >= r0) goto L2a
            r3 = r1[r2]
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r4 = r6.jsonClassTags
            java.lang.String r5 = r3.getSimpleName()
            r4.put(r5, r3)
            int r2 = r2 + 1
            goto L1a
        L2a:
            return
    }

    public Skin(com.badlogic.gdx.graphics.g2d.TextureAtlas r7) {
            r6 = this;
            r6.<init>()
            com.badlogic.gdx.utils.ObjectMap r0 = new com.badlogic.gdx.utils.ObjectMap
            r0.<init>()
            r6.resources = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.scale = r0
            com.badlogic.gdx.utils.ObjectMap r0 = new com.badlogic.gdx.utils.ObjectMap
            java.lang.Class[] r1 = com.badlogic.gdx.scenes.scene2d.ui.Skin.defaultTagClasses
            int r2 = r1.length
            r0.<init>(r2)
            r6.jsonClassTags = r0
            int r0 = r1.length
            r2 = 0
        L1a:
            if (r2 >= r0) goto L2a
            r3 = r1[r2]
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r4 = r6.jsonClassTags
            java.lang.String r5 = r3.getSimpleName()
            r4.put(r5, r3)
            int r2 = r2 + 1
            goto L1a
        L2a:
            r6.atlas = r7
            r6.addRegions(r7)
            return
    }

    public void add(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Class r0 = r3.getClass()
            r1.add(r2, r3, r0)
            return
    }

    public void add(java.lang.String r3, java.lang.Object r4, java.lang.Class r5) {
            r2 = this;
            if (r3 == 0) goto L36
            if (r4 == 0) goto L2e
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Object>> r0 = r2.resources
            java.lang.Object r0 = r0.get(r5)
            com.badlogic.gdx.utils.ObjectMap r0 = (com.badlogic.gdx.utils.ObjectMap) r0
            if (r0 != 0) goto L2a
            com.badlogic.gdx.utils.ObjectMap r0 = new com.badlogic.gdx.utils.ObjectMap
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureRegion> r1 = com.badlogic.gdx.graphics.g2d.TextureRegion.class
            if (r5 == r1) goto L20
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.utils.Drawable> r1 = com.badlogic.gdx.scenes.scene2d.utils.Drawable.class
            if (r5 == r1) goto L20
            java.lang.Class<com.badlogic.gdx.graphics.g2d.Sprite> r1 = com.badlogic.gdx.graphics.g2d.Sprite.class
            if (r5 != r1) goto L1d
            goto L20
        L1d:
            r1 = 64
            goto L22
        L20:
            r1 = 256(0x100, float:3.59E-43)
        L22:
            r0.<init>(r1)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Object>> r1 = r2.resources
            r1.put(r5, r0)
        L2a:
            r0.put(r3, r4)
            return
        L2e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "resource cannot be null."
            r3.<init>(r4)
            throw r3
        L36:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "name cannot be null."
            r3.<init>(r4)
            throw r3
    }

    public void addRegions(com.badlogic.gdx.graphics.g2d.TextureAtlas r7) {
            r6 = this;
            com.badlogic.gdx.utils.Array r7 = r7.getRegions()
            int r0 = r7.size
            r1 = 0
        L7:
            if (r1 >= r0) goto L34
            java.lang.Object r2 = r7.get(r1)
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion) r2
            java.lang.String r3 = r2.name
            int r4 = r2.index
            r5 = -1
            if (r4 == r5) goto L2c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "_"
            r4.append(r3)
            int r3 = r2.index
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L2c:
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureRegion> r4 = com.badlogic.gdx.graphics.g2d.TextureRegion.class
            r6.add(r3, r2, r4)
            int r1 = r1 + 1
            goto L7
        L34:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            com.badlogic.gdx.graphics.g2d.TextureAtlas r0 = r4.atlas
            if (r0 == 0) goto L7
            r0.dispose()
        L7:
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Object>> r0 = r4.resources
            com.badlogic.gdx.utils.ObjectMap$Values r0 = r0.values()
            com.badlogic.gdx.utils.ObjectMap$Values r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.utils.ObjectMap r1 = (com.badlogic.gdx.utils.ObjectMap) r1
            com.badlogic.gdx.utils.ObjectMap$Values r1 = r1.values()
            com.badlogic.gdx.utils.ObjectMap$Values r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L11
            java.lang.Object r2 = r1.next()
            boolean r3 = r2 instanceof com.badlogic.gdx.utils.Disposable
            if (r3 == 0) goto L25
            com.badlogic.gdx.utils.Disposable r2 = (com.badlogic.gdx.utils.Disposable) r2
            r2.dispose()
            goto L25
        L39:
            return
    }

    public <T> T get(java.lang.String r5, java.lang.Class<T> r6) {
            r4 = this;
            if (r5 == 0) goto L83
            if (r6 == 0) goto L7b
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.utils.Drawable> r0 = com.badlogic.gdx.scenes.scene2d.utils.Drawable.class
            if (r6 != r0) goto Ld
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r4.getDrawable(r5)
            return r5
        Ld:
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureRegion> r0 = com.badlogic.gdx.graphics.g2d.TextureRegion.class
            if (r6 != r0) goto L16
            com.badlogic.gdx.graphics.g2d.TextureRegion r5 = r4.getRegion(r5)
            return r5
        L16:
            java.lang.Class<com.badlogic.gdx.graphics.g2d.NinePatch> r0 = com.badlogic.gdx.graphics.g2d.NinePatch.class
            if (r6 != r0) goto L1f
            com.badlogic.gdx.graphics.g2d.NinePatch r5 = r4.getPatch(r5)
            return r5
        L1f:
            java.lang.Class<com.badlogic.gdx.graphics.g2d.Sprite> r0 = com.badlogic.gdx.graphics.g2d.Sprite.class
            if (r6 != r0) goto L28
            com.badlogic.gdx.graphics.g2d.Sprite r5 = r4.getSprite(r5)
            return r5
        L28:
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Object>> r0 = r4.resources
            java.lang.Object r0 = r0.get(r6)
            com.badlogic.gdx.utils.ObjectMap r0 = (com.badlogic.gdx.utils.ObjectMap) r0
            java.lang.String r1 = " registered with name: "
            java.lang.String r2 = "No "
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r0.get(r5)
            if (r0 == 0) goto L3d
            return r0
        L3d:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r6 = r6.getName()
            r3.append(r6)
            r3.append(r1)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r0.<init>(r5)
            throw r0
        L5c:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r6 = r6.getName()
            r3.append(r6)
            r3.append(r1)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r0.<init>(r5)
            throw r0
        L7b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "type cannot be null."
            r5.<init>(r6)
            throw r5
        L83:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "name cannot be null."
            r5.<init>(r6)
            throw r5
    }

    public com.badlogic.gdx.scenes.scene2d.utils.Drawable getDrawable(java.lang.String r7) {
            r6 = this;
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.utils.Drawable> r0 = com.badlogic.gdx.scenes.scene2d.utils.Drawable.class
            java.lang.Object r1 = r6.optional(r7, r0)
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = (com.badlogic.gdx.scenes.scene2d.utils.Drawable) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r6.getRegion(r7)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L57
            boolean r3 = r2 instanceof com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L57
            if (r3 == 0) goto L43
            r3 = r2
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion) r3     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L57
            java.lang.String r4 = "split"
            int[] r4 = r3.findValue(r4)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L57
            if (r4 == 0) goto L29
            com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable r3 = new com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L57
            com.badlogic.gdx.graphics.g2d.NinePatch r4 = r6.getPatch(r7)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L57
            r3.<init>(r4)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L57
        L27:
            r1 = r3
            goto L43
        L29:
            boolean r4 = r3.rotate     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L57
            if (r4 != 0) goto L39
            int r4 = r3.packedWidth     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L57
            int r5 = r3.originalWidth     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L57
            if (r4 != r5) goto L39
            int r4 = r3.packedHeight     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L57
            int r3 = r3.originalHeight     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L57
            if (r4 == r3) goto L43
        L39:
            com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable r3 = new com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L57
            com.badlogic.gdx.graphics.g2d.Sprite r4 = r6.getSprite(r7)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L57
            r3.<init>(r4)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L57
            goto L27
        L43:
            if (r1 != 0) goto L58
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r3 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L57
            r3.<init>(r2)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L57
            float r1 = r6.scale     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L55
            r2 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L55
            r6.scale(r3)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L55
        L55:
            r1 = r3
            goto L58
        L57:
        L58:
            if (r1 != 0) goto L92
            java.lang.Class<com.badlogic.gdx.graphics.g2d.NinePatch> r1 = com.badlogic.gdx.graphics.g2d.NinePatch.class
            java.lang.Object r1 = r6.optional(r7, r1)
            com.badlogic.gdx.graphics.g2d.NinePatch r1 = (com.badlogic.gdx.graphics.g2d.NinePatch) r1
            if (r1 == 0) goto L6b
            com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable r2 = new com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable
            r2.<init>(r1)
        L69:
            r1 = r2
            goto L92
        L6b:
            java.lang.Class<com.badlogic.gdx.graphics.g2d.Sprite> r1 = com.badlogic.gdx.graphics.g2d.Sprite.class
            java.lang.Object r1 = r6.optional(r7, r1)
            com.badlogic.gdx.graphics.g2d.Sprite r1 = (com.badlogic.gdx.graphics.g2d.Sprite) r1
            if (r1 == 0) goto L7b
            com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable r2 = new com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable
            r2.<init>(r1)
            goto L69
        L7b:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No Drawable, NinePatch, TextureRegion, Texture, or Sprite registered with name: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L92:
            boolean r2 = r1 instanceof com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable
            if (r2 == 0) goto L9c
            r2 = r1
            com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable r2 = (com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable) r2
            r2.setName(r7)
        L9c:
            r6.add(r7, r1, r0)
            return r1
    }

    protected com.badlogic.gdx.utils.Json getJsonLoader(com.badlogic.gdx.files.FileHandle r4) {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Skin$1 r0 = new com.badlogic.gdx.scenes.scene2d.ui.Skin$1
            r0.<init>(r3)
            r1 = 0
            r0.setTypeName(r1)
            r1 = 0
            r0.setUsePrototypes(r1)
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.Skin> r1 = com.badlogic.gdx.scenes.scene2d.ui.Skin.class
            com.badlogic.gdx.scenes.scene2d.ui.Skin$2 r2 = new com.badlogic.gdx.scenes.scene2d.ui.Skin$2
            r2.<init>(r3, r3)
            r0.setSerializer(r1, r2)
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r1 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            com.badlogic.gdx.scenes.scene2d.ui.Skin$3 r2 = new com.badlogic.gdx.scenes.scene2d.ui.Skin$3
            r2.<init>(r3, r4, r3)
            r0.setSerializer(r1, r2)
            java.lang.Class<com.badlogic.gdx.graphics.Color> r4 = com.badlogic.gdx.graphics.Color.class
            com.badlogic.gdx.scenes.scene2d.ui.Skin$4 r1 = new com.badlogic.gdx.scenes.scene2d.ui.Skin$4
            r1.<init>(r3)
            r0.setSerializer(r4, r1)
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.Skin$TintedDrawable> r4 = com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedDrawable.class
            com.badlogic.gdx.scenes.scene2d.ui.Skin$5 r1 = new com.badlogic.gdx.scenes.scene2d.ui.Skin$5
            r1.<init>(r3)
            r0.setSerializer(r4, r1)
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r4 = r3.jsonClassTags
            com.badlogic.gdx.utils.ObjectMap$Entries r4 = r4.iterator()
        L3b:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r4.next()
            com.badlogic.gdx.utils.ObjectMap$Entry r1 = (com.badlogic.gdx.utils.ObjectMap.Entry) r1
            K r2 = r1.key
            java.lang.String r2 = (java.lang.String) r2
            V r1 = r1.value
            java.lang.Class r1 = (java.lang.Class) r1
            r0.addClassTag(r2, r1)
            goto L3b
        L53:
            return r0
    }

    public com.badlogic.gdx.graphics.g2d.NinePatch getPatch(java.lang.String r14) {
            r13 = this;
            java.lang.Class<com.badlogic.gdx.graphics.g2d.NinePatch> r0 = com.badlogic.gdx.graphics.g2d.NinePatch.class
            java.lang.Object r1 = r13.optional(r14, r0)
            com.badlogic.gdx.graphics.g2d.NinePatch r1 = (com.badlogic.gdx.graphics.g2d.NinePatch) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            com.badlogic.gdx.graphics.g2d.TextureRegion r8 = r13.getRegion(r14)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            boolean r2 = r8 instanceof com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            if (r2 == 0) goto L4b
            r2 = r8
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion) r2     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            java.lang.String r3 = "split"
            int[] r2 = r2.findValue(r3)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            if (r2 == 0) goto L4b
            com.badlogic.gdx.graphics.g2d.NinePatch r1 = new com.badlogic.gdx.graphics.g2d.NinePatch     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            r9 = 0
            r4 = r2[r9]     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            r10 = 1
            r5 = r2[r10]     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            r11 = 2
            r6 = r2[r11]     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            r12 = 3
            r7 = r2[r12]     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            r2 = r1
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            r2 = r8
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion) r2     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            java.lang.String r3 = "pad"
            int[] r2 = r2.findValue(r3)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            if (r2 == 0) goto L4b
            r3 = r2[r9]     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            float r3 = (float) r3     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            r4 = r2[r10]     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            float r4 = (float) r4     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            r5 = r2[r11]     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            float r5 = (float) r5     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            r2 = r2[r12]     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            float r2 = (float) r2     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            r1.setPadding(r3, r4, r5, r2)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
        L4b:
            if (r1 != 0) goto L52
            com.badlogic.gdx.graphics.g2d.NinePatch r1 = new com.badlogic.gdx.graphics.g2d.NinePatch     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            r1.<init>(r8)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
        L52:
            float r2 = r13.scale     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L5d
            r1.scale(r2, r2)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
        L5d:
            r13.add(r14, r1, r0)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L61
            return r1
        L61:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No NinePatch, TextureRegion, or Texture registered with name: "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
    }

    public com.badlogic.gdx.graphics.g2d.TextureRegion getRegion(java.lang.String r4) {
            r3 = this;
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureRegion> r0 = com.badlogic.gdx.graphics.g2d.TextureRegion.class
            java.lang.Object r1 = r3.optional(r4, r0)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r1 = com.badlogic.gdx.graphics.Texture.class
            java.lang.Object r1 = r3.optional(r4, r1)
            com.badlogic.gdx.graphics.Texture r1 = (com.badlogic.gdx.graphics.Texture) r1
            if (r1 == 0) goto L1e
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            r2.<init>(r1)
            r3.add(r4, r2, r0)
            return r2
        L1e:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No TextureRegion or Texture registered with name: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureRegion> getRegions(java.lang.String r7) {
            r6 = this;
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureRegion> r0 = com.badlogic.gdx.graphics.g2d.TextureRegion.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r2 = "_"
            r1.append(r2)
            r3 = 0
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r6.optional(r1, r0)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r1
            if (r1 == 0) goto L46
            com.badlogic.gdx.utils.Array r3 = new com.badlogic.gdx.utils.Array
            r3.<init>()
            r4 = 1
        L25:
            if (r1 == 0) goto L47
            r3.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r2)
            int r5 = r4 + 1
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r6.optional(r1, r0)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r1
            r4 = r5
            goto L25
        L46:
            r3 = 0
        L47:
            return r3
    }

    public com.badlogic.gdx.graphics.g2d.Sprite getSprite(java.lang.String r7) {
            r6 = this;
            java.lang.Class<com.badlogic.gdx.graphics.g2d.Sprite> r0 = com.badlogic.gdx.graphics.g2d.Sprite.class
            java.lang.Object r1 = r6.optional(r7, r0)
            com.badlogic.gdx.graphics.g2d.Sprite r1 = (com.badlogic.gdx.graphics.g2d.Sprite) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r6.getRegion(r7)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
            boolean r3 = r2 instanceof com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
            if (r3 == 0) goto L2b
            r3 = r2
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion) r3     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
            boolean r4 = r3.rotate     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
            if (r4 != 0) goto L26
            int r4 = r3.packedWidth     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
            int r5 = r3.originalWidth     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
            if (r4 != r5) goto L26
            int r4 = r3.packedHeight     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
            int r5 = r3.originalHeight     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
            if (r4 == r5) goto L2b
        L26:
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasSprite r1 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasSprite     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
            r1.<init>(r3)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
        L2b:
            if (r1 != 0) goto L32
            com.badlogic.gdx.graphics.g2d.Sprite r1 = new com.badlogic.gdx.graphics.g2d.Sprite     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
            r1.<init>(r2)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
        L32:
            float r2 = r6.scale     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
            r3 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L4d
            float r2 = r1.getWidth()     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
            float r3 = r6.scale     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
            float r2 = r2 * r3
            float r3 = r1.getHeight()     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
            float r4 = r6.scale     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
            float r3 = r3 * r4
            r1.setSize(r2, r3)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
        L4d:
            r6.add(r7, r1, r0)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L51
            return r1
        L51:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No NinePatch, TextureRegion, or Texture registered with name: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    public void load(com.badlogic.gdx.files.FileHandle r5) {
            r4 = this;
            com.badlogic.gdx.utils.Json r0 = r4.getJsonLoader(r5)     // Catch: com.badlogic.gdx.utils.SerializationException -> La
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.Skin> r1 = com.badlogic.gdx.scenes.scene2d.ui.Skin.class
            r0.fromJson(r1, r5)     // Catch: com.badlogic.gdx.utils.SerializationException -> La
            return
        La:
            r0 = move-exception
            com.badlogic.gdx.utils.SerializationException r1 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error reading file: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
    }

    public com.badlogic.gdx.scenes.scene2d.utils.Drawable newDrawable(com.badlogic.gdx.scenes.scene2d.utils.Drawable r6, com.badlogic.gdx.graphics.Color r7) {
            r5 = this;
            boolean r0 = r6 instanceof com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            if (r0 == 0) goto Lc
            r0 = r6
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r0 = (com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable) r0
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.tint(r7)
            goto L23
        Lc:
            boolean r0 = r6 instanceof com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable
            if (r0 == 0) goto L18
            r0 = r6
            com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable r0 = (com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable) r0
            com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable r0 = r0.tint(r7)
            goto L23
        L18:
            boolean r0 = r6 instanceof com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable
            if (r0 == 0) goto L67
            r0 = r6
            com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable r0 = (com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable) r0
            com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable r0 = r0.tint(r7)
        L23:
            boolean r1 = r0 instanceof com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable
            if (r1 == 0) goto L66
            r1 = r0
            com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable r1 = (com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable) r1
            boolean r2 = r6 instanceof com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable
            java.lang.String r3 = ")"
            java.lang.String r4 = " ("
            if (r2 == 0) goto L51
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable r6 = (com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable) r6
            java.lang.String r6 = r6.getName()
            r2.append(r6)
            r2.append(r4)
            r2.append(r7)
            r2.append(r3)
            java.lang.String r6 = r2.toString()
            r1.setName(r6)
            goto L66
        L51:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            r1.setName(r6)
        L66:
            return r0
        L67:
            com.badlogic.gdx.utils.GdxRuntimeException r7 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to copy, unknown drawable type: "
            r0.append(r1)
            java.lang.Class r6 = r6.getClass()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
    }

    public com.badlogic.gdx.scenes.scene2d.utils.Drawable newDrawable(java.lang.String r1, com.badlogic.gdx.graphics.Color r2) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r0.getDrawable(r1)
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r0.newDrawable(r1, r2)
            return r1
    }

    public <T> T optional(java.lang.String r2, java.lang.Class<T> r3) {
            r1 = this;
            if (r2 == 0) goto L1d
            if (r3 == 0) goto L15
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Object>> r0 = r1.resources
            java.lang.Object r3 = r0.get(r3)
            com.badlogic.gdx.utils.ObjectMap r3 = (com.badlogic.gdx.utils.ObjectMap) r3
            if (r3 != 0) goto L10
            r2 = 0
            return r2
        L10:
            java.lang.Object r2 = r3.get(r2)
            return r2
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "type cannot be null."
            r2.<init>(r3)
            throw r2
        L1d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "name cannot be null."
            r2.<init>(r3)
            throw r2
    }

    public void scale(com.badlogic.gdx.scenes.scene2d.utils.Drawable r3) {
            r2 = this;
            float r0 = r3.getLeftWidth()
            float r1 = r2.scale
            float r0 = r0 * r1
            r3.setLeftWidth(r0)
            float r0 = r3.getRightWidth()
            float r1 = r2.scale
            float r0 = r0 * r1
            r3.setRightWidth(r0)
            float r0 = r3.getBottomHeight()
            float r1 = r2.scale
            float r0 = r0 * r1
            r3.setBottomHeight(r0)
            float r0 = r3.getTopHeight()
            float r1 = r2.scale
            float r0 = r0 * r1
            r3.setTopHeight(r0)
            float r0 = r3.getMinWidth()
            float r1 = r2.scale
            float r0 = r0 * r1
            r3.setMinWidth(r0)
            float r0 = r3.getMinHeight()
            float r1 = r2.scale
            float r0 = r0 * r1
            r3.setMinHeight(r0)
            return
    }
}
