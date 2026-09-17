package com.badlogic.gdx.graphics.g2d;

/* loaded from: classes.dex */
public class TextureAtlas implements com.badlogic.gdx.utils.Disposable {
    private final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion> regions;
    private final com.badlogic.gdx.utils.ObjectSet<com.badlogic.gdx.graphics.Texture> textures;

    public static class AtlasRegion extends com.badlogic.gdx.graphics.g2d.TextureRegion {
        public int degrees;
        public int index;
        public java.lang.String name;
        public java.lang.String[] names;
        public float offsetX;
        public float offsetY;
        public int originalHeight;
        public int originalWidth;
        public int packedHeight;
        public int packedWidth;
        public boolean rotate;
        public int[][] values;

        public AtlasRegion(com.badlogic.gdx.graphics.Texture r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                r1 = -1
                r0.index = r1
                r0.originalWidth = r4
                r0.originalHeight = r5
                r0.packedWidth = r4
                r0.packedHeight = r5
                return
        }

        public AtlasRegion(com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion r2) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.index = r0
                r1.setRegion(r2)
                int r0 = r2.index
                r1.index = r0
                java.lang.String r0 = r2.name
                r1.name = r0
                float r0 = r2.offsetX
                r1.offsetX = r0
                float r0 = r2.offsetY
                r1.offsetY = r0
                int r0 = r2.packedWidth
                r1.packedWidth = r0
                int r0 = r2.packedHeight
                r1.packedHeight = r0
                int r0 = r2.originalWidth
                r1.originalWidth = r0
                int r0 = r2.originalHeight
                r1.originalHeight = r0
                boolean r0 = r2.rotate
                r1.rotate = r0
                int r0 = r2.degrees
                r1.degrees = r0
                java.lang.String[] r0 = r2.names
                r1.names = r0
                int[][] r2 = r2.values
                r1.values = r2
                return
        }

        public int[] findValue(java.lang.String r4) {
                r3 = this;
                java.lang.String[] r0 = r3.names
                if (r0 == 0) goto L1a
                r1 = 0
                int r0 = r0.length
            L6:
                if (r1 >= r0) goto L1a
                java.lang.String[] r2 = r3.names
                r2 = r2[r1]
                boolean r2 = r4.equals(r2)
                if (r2 == 0) goto L17
                int[][] r4 = r3.values
                r4 = r4[r1]
                return r4
            L17:
                int r1 = r1 + 1
                goto L6
            L1a:
                r4 = 0
                return r4
        }

        @Override // com.badlogic.gdx.graphics.g2d.TextureRegion
        public void flip(boolean r2, boolean r3) {
                r1 = this;
                super.flip(r2, r3)
                if (r2 == 0) goto L12
                int r2 = r1.originalWidth
                float r2 = (float) r2
                float r0 = r1.offsetX
                float r2 = r2 - r0
                float r0 = r1.getRotatedPackedWidth()
                float r2 = r2 - r0
                r1.offsetX = r2
            L12:
                if (r3 == 0) goto L21
                int r2 = r1.originalHeight
                float r2 = (float) r2
                float r3 = r1.offsetY
                float r2 = r2 - r3
                float r3 = r1.getRotatedPackedHeight()
                float r2 = r2 - r3
                r1.offsetY = r2
            L21:
                return
        }

        public float getRotatedPackedHeight() {
                r1 = this;
                boolean r0 = r1.rotate
                if (r0 == 0) goto L7
                int r0 = r1.packedWidth
                goto L9
            L7:
                int r0 = r1.packedHeight
            L9:
                float r0 = (float) r0
                return r0
        }

        public float getRotatedPackedWidth() {
                r1 = this;
                boolean r0 = r1.rotate
                if (r0 == 0) goto L7
                int r0 = r1.packedHeight
                goto L9
            L7:
                int r0 = r1.packedWidth
            L9:
                float r0 = (float) r0
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }
    }

    public static class AtlasSprite extends com.badlogic.gdx.graphics.g2d.Sprite {
        float originalOffsetX;
        float originalOffsetY;
        final com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion region;

        public AtlasSprite(com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion r4) {
                r3 = this;
                r3.<init>()
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion
                r0.<init>(r4)
                r3.region = r0
                float r0 = r4.offsetX
                r3.originalOffsetX = r0
                float r0 = r4.offsetY
                r3.originalOffsetY = r0
                r3.setRegion(r4)
                int r0 = r4.originalWidth
                float r0 = (float) r0
                r1 = 1073741824(0x40000000, float:2.0)
                float r0 = r0 / r1
                int r2 = r4.originalHeight
                float r2 = (float) r2
                float r2 = r2 / r1
                r3.setOrigin(r0, r2)
                int r0 = r4.getRegionWidth()
                int r1 = r4.getRegionHeight()
                boolean r2 = r4.rotate
                if (r2 == 0) goto L3c
                r2 = 1
                super.rotate90(r2)
                float r2 = r4.offsetX
                float r4 = r4.offsetY
                float r1 = (float) r1
                float r0 = (float) r0
                super.setBounds(r2, r4, r1, r0)
                goto L45
            L3c:
                float r2 = r4.offsetX
                float r4 = r4.offsetY
                float r0 = (float) r0
                float r1 = (float) r1
                super.setBounds(r2, r4, r0, r1)
            L45:
                r4 = 1065353216(0x3f800000, float:1.0)
                r3.setColor(r4, r4, r4, r4)
                return
        }

        public AtlasSprite(com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasSprite r2) {
                r1 = this;
                r1.<init>()
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r2.region
                r1.region = r0
                float r0 = r2.originalOffsetX
                r1.originalOffsetX = r0
                float r0 = r2.originalOffsetY
                r1.originalOffsetY = r0
                r1.set(r2)
                return
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite, com.badlogic.gdx.graphics.g2d.TextureRegion
        public void flip(boolean r9, boolean r10) {
                r8 = this;
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r8.region
                boolean r0 = r0.rotate
                if (r0 == 0) goto La
                super.flip(r10, r9)
                goto Ld
            La:
                super.flip(r9, r10)
            Ld:
                float r0 = r8.getOriginX()
                float r1 = r8.getOriginY()
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r8.region
                float r3 = r2.offsetX
                float r2 = r2.offsetY
                float r4 = r8.getWidthRatio()
                float r5 = r8.getHeightRatio()
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r6 = r8.region
                float r7 = r8.originalOffsetX
                r6.offsetX = r7
                float r7 = r8.originalOffsetY
                r6.offsetY = r7
                r6.flip(r9, r10)
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r9 = r8.region
                float r10 = r9.offsetX
                r8.originalOffsetX = r10
                float r6 = r9.offsetY
                r8.originalOffsetY = r6
                float r10 = r10 * r4
                r9.offsetX = r10
                float r6 = r6 * r5
                r9.offsetY = r6
                float r10 = r10 - r3
                float r6 = r6 - r2
                r8.translate(r10, r6)
                r8.setOrigin(r0, r1)
                return
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public float getHeight() {
                r2 = this;
                float r0 = super.getHeight()
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r2.region
                float r1 = r1.getRotatedPackedHeight()
                float r0 = r0 / r1
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r2.region
                int r1 = r1.originalHeight
                float r1 = (float) r1
                float r0 = r0 * r1
                return r0
        }

        public float getHeightRatio() {
                r2 = this;
                float r0 = super.getHeight()
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r2.region
                float r1 = r1.getRotatedPackedHeight()
                float r0 = r0 / r1
                return r0
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public float getOriginX() {
                r2 = this;
                float r0 = super.getOriginX()
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r2.region
                float r1 = r1.offsetX
                float r0 = r0 + r1
                return r0
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public float getOriginY() {
                r2 = this;
                float r0 = super.getOriginY()
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r2.region
                float r1 = r1.offsetY
                float r0 = r0 + r1
                return r0
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public float getWidth() {
                r2 = this;
                float r0 = super.getWidth()
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r2.region
                float r1 = r1.getRotatedPackedWidth()
                float r0 = r0 / r1
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r2.region
                int r1 = r1.originalWidth
                float r1 = (float) r1
                float r0 = r0 * r1
                return r0
        }

        public float getWidthRatio() {
                r2 = this;
                float r0 = super.getWidth()
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r2.region
                float r1 = r1.getRotatedPackedWidth()
                float r0 = r0 / r1
                return r0
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public float getX() {
                r2 = this;
                float r0 = super.getX()
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r2.region
                float r1 = r1.offsetX
                float r0 = r0 - r1
                return r0
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public float getY() {
                r2 = this;
                float r0 = super.getY()
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r2.region
                float r1 = r1.offsetY
                float r0 = r0 - r1
                return r0
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public void rotate90(boolean r8) {
                r7 = this;
                super.rotate90(r8)
                float r0 = r7.getOriginX()
                float r1 = r7.getOriginY()
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r7.region
                float r3 = r2.offsetX
                float r2 = r2.offsetY
                float r4 = r7.getWidthRatio()
                float r5 = r7.getHeightRatio()
                if (r8 == 0) goto L2e
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r7.region
                r8.offsetX = r2
                int r6 = r8.originalHeight
                float r6 = (float) r6
                float r6 = r6 * r5
                float r6 = r6 - r3
                int r5 = r8.packedWidth
                float r5 = (float) r5
                float r5 = r5 * r4
                float r6 = r6 - r5
                r8.offsetY = r6
                goto L40
            L2e:
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r7.region
                int r6 = r8.originalWidth
                float r6 = (float) r6
                float r6 = r6 * r4
                float r6 = r6 - r2
                int r4 = r8.packedHeight
                float r4 = (float) r4
                float r4 = r4 * r5
                float r6 = r6 - r4
                r8.offsetX = r6
                r8.offsetY = r3
            L40:
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r7.region
                float r4 = r8.offsetX
                float r4 = r4 - r3
                float r8 = r8.offsetY
                float r8 = r8 - r2
                r7.translate(r4, r8)
                r7.setOrigin(r0, r1)
                return
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public void setBounds(float r6, float r7, float r8, float r9) {
                r5 = this;
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r5.region
                int r1 = r0.originalWidth
                float r1 = (float) r1
                float r8 = r8 / r1
                int r1 = r0.originalHeight
                float r1 = (float) r1
                float r9 = r9 / r1
                float r1 = r5.originalOffsetX
                float r1 = r1 * r8
                r0.offsetX = r1
                float r2 = r5.originalOffsetY
                float r2 = r2 * r9
                r0.offsetY = r2
                boolean r3 = r0.rotate
                if (r3 == 0) goto L1d
                int r4 = r0.packedHeight
                goto L1f
            L1d:
                int r4 = r0.packedWidth
            L1f:
                if (r3 == 0) goto L24
                int r0 = r0.packedWidth
                goto L26
            L24:
                int r0 = r0.packedHeight
            L26:
                float r6 = r6 + r1
                float r7 = r7 + r2
                float r1 = (float) r4
                float r1 = r1 * r8
                float r8 = (float) r0
                float r8 = r8 * r9
                super.setBounds(r6, r7, r1, r8)
                return
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public void setOrigin(float r3, float r4) {
                r2 = this;
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r2.region
                float r1 = r0.offsetX
                float r3 = r3 - r1
                float r0 = r0.offsetY
                float r4 = r4 - r0
                super.setOrigin(r3, r4)
                return
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public void setPosition(float r3, float r4) {
                r2 = this;
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r2.region
                float r1 = r0.offsetX
                float r3 = r3 + r1
                float r0 = r0.offsetY
                float r4 = r4 + r0
                super.setPosition(r3, r4)
                return
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public void setSize(float r3, float r4) {
                r2 = this;
                float r0 = r2.getX()
                float r1 = r2.getY()
                r2.setBounds(r0, r1, r3, r4)
                return
        }

        public java.lang.String toString() {
                r1 = this;
                com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r1.region
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class TextureAtlasData {
        final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Page> pages;
        final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Region> regions;















        private interface Field<T> {
            void parse(T r1);
        }

        public static class Page {
            public com.badlogic.gdx.graphics.Pixmap.Format format;
            public float height;
            public com.badlogic.gdx.graphics.Texture.TextureFilter magFilter;
            public com.badlogic.gdx.graphics.Texture.TextureFilter minFilter;
            public boolean pma;
            public com.badlogic.gdx.graphics.Texture texture;
            public com.badlogic.gdx.files.FileHandle textureFile;
            public com.badlogic.gdx.graphics.Texture.TextureWrap uWrap;
            public boolean useMipMaps;
            public com.badlogic.gdx.graphics.Texture.TextureWrap vWrap;
            public float width;

            public Page() {
                    r1 = this;
                    r1.<init>()
                    com.badlogic.gdx.graphics.Pixmap$Format r0 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888
                    r1.format = r0
                    com.badlogic.gdx.graphics.Texture$TextureFilter r0 = com.badlogic.gdx.graphics.Texture.TextureFilter.Nearest
                    r1.minFilter = r0
                    r1.magFilter = r0
                    com.badlogic.gdx.graphics.Texture$TextureWrap r0 = com.badlogic.gdx.graphics.Texture.TextureWrap.ClampToEdge
                    r1.uWrap = r0
                    r1.vWrap = r0
                    return
            }
        }

        public static class Region {
            public int degrees;
            public boolean flip;
            public int height;
            public int index;
            public int left;
            public java.lang.String name;
            public java.lang.String[] names;
            public float offsetX;
            public float offsetY;
            public int originalHeight;
            public int originalWidth;
            public com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Page page;
            public boolean rotate;
            public int top;
            public int[][] values;
            public int width;

            public Region() {
                    r1 = this;
                    r1.<init>()
                    r0 = -1
                    r1.index = r0
                    return
            }
        }

        public TextureAtlasData(com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.files.FileHandle r3, boolean r4) {
                r1 = this;
                r1.<init>()
                com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
                r0.<init>()
                r1.pages = r0
                com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
                r0.<init>()
                r1.regions = r0
                r1.load(r2, r3, r4)
                return
        }

        private static int readEntry(java.lang.String[] r4, java.lang.String r5) throws java.io.IOException {
                r0 = 0
                if (r5 != 0) goto L4
                return r0
            L4:
                java.lang.String r5 = r5.trim()
                int r1 = r5.length()
                if (r1 != 0) goto Lf
                return r0
            Lf:
                r1 = 58
                int r1 = r5.indexOf(r1)
                r2 = -1
                if (r1 != r2) goto L19
                return r0
            L19:
                java.lang.String r3 = r5.substring(r0, r1)
                java.lang.String r3 = r3.trim()
                r4[r0] = r3
                r0 = 1
                int r1 = r1 + r0
            L25:
                r3 = 44
                int r3 = r5.indexOf(r3, r1)
                if (r3 != r2) goto L38
                java.lang.String r5 = r5.substring(r1)
                java.lang.String r5 = r5.trim()
                r4[r0] = r5
                return r0
            L38:
                java.lang.String r1 = r5.substring(r1, r3)
                java.lang.String r1 = r1.trim()
                r4[r0] = r1
                int r1 = r3 + 1
                r3 = 4
                if (r0 != r3) goto L48
                return r3
            L48:
                int r0 = r0 + 1
                goto L25
        }

        public com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Page> getPages() {
                r1 = this;
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Page> r0 = r1.pages
                return r0
        }

        public void load(com.badlogic.gdx.files.FileHandle r19, com.badlogic.gdx.files.FileHandle r20, boolean r21) {
                r18 = this;
                r1 = r18
                r2 = r19
                r0 = 5
                java.lang.String[] r0 = new java.lang.String[r0]
                com.badlogic.gdx.utils.ObjectMap r3 = new com.badlogic.gdx.utils.ObjectMap
                r4 = 15
                r5 = 1065185444(0x3f7d70a4, float:0.99)
                r3.<init>(r4, r5)
                com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$1 r4 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$1
                r4.<init>(r1, r0)
                java.lang.String r6 = "size"
                r3.put(r6, r4)
                com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$2 r4 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$2
                r4.<init>(r1, r0)
                java.lang.String r7 = "format"
                r3.put(r7, r4)
                com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$3 r4 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$3
                r4.<init>(r1, r0)
                java.lang.String r7 = "filter"
                r3.put(r7, r4)
                com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$4 r4 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$4
                r4.<init>(r1, r0)
                java.lang.String r7 = "repeat"
                r3.put(r7, r4)
                com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$5 r4 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$5
                r4.<init>(r1, r0)
                java.lang.String r7 = "pma"
                r3.put(r7, r4)
                r4 = 1
                boolean[] r7 = new boolean[r4]
                r8 = 0
                r7[r8] = r8
                com.badlogic.gdx.utils.ObjectMap r9 = new com.badlogic.gdx.utils.ObjectMap
                r10 = 127(0x7f, float:1.78E-43)
                r9.<init>(r10, r5)
                com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$6 r5 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$6
                r5.<init>(r1, r0)
                java.lang.String r10 = "xy"
                r9.put(r10, r5)
                com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$7 r5 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$7
                r5.<init>(r1, r0)
                r9.put(r6, r5)
                com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$8 r5 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$8
                r5.<init>(r1, r0)
                java.lang.String r6 = "bounds"
                r9.put(r6, r5)
                com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$9 r5 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$9
                r5.<init>(r1, r0)
                java.lang.String r6 = "offset"
                r9.put(r6, r5)
                com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$10 r5 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$10
                r5.<init>(r1, r0)
                java.lang.String r6 = "orig"
                r9.put(r6, r5)
                com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$11 r5 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$11
                r5.<init>(r1, r0)
                java.lang.String r6 = "offsets"
                r9.put(r6, r5)
                com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$12 r5 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$12
                r5.<init>(r1, r0)
                java.lang.String r6 = "rotate"
                r9.put(r6, r5)
                com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$13 r5 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$13
                r5.<init>(r1, r0, r7)
                java.lang.String r6 = "index"
                r9.put(r6, r5)
                r5 = 1024(0x400, float:1.435E-42)
                java.io.BufferedReader r5 = r2.reader(r5)
                java.lang.String r6 = r5.readLine()     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
            La8:
                if (r6 == 0) goto Lb9
                java.lang.String r10 = r6.trim()     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                int r10 = r10.length()     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                if (r10 != 0) goto Lb9
                java.lang.String r6 = r5.readLine()     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                goto La8
            Lb9:
                if (r6 == 0) goto Ld2
                java.lang.String r10 = r6.trim()     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                int r10 = r10.length()     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                if (r10 != 0) goto Lc6
                goto Ld2
            Lc6:
                int r10 = readEntry(r0, r6)     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                if (r10 != 0) goto Lcd
                goto Ld2
            Lcd:
                java.lang.String r6 = r5.readLine()     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                goto Lb9
            Ld2:
                r10 = 0
                r11 = r10
                r12 = r11
                r13 = r12
            Ld6:
                if (r6 != 0) goto Lea
                com.badlogic.gdx.utils.StreamUtils.closeQuietly(r5)
                boolean r0 = r7[r8]
                if (r0 == 0) goto Le9
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Region> r0 = r1.regions
                com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$14 r2 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$14
                r2.<init>(r1)
                r0.sort(r2)
            Le9:
                return
            Lea:
                java.lang.String r14 = r6.trim()     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                int r14 = r14.length()     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                if (r14 != 0) goto Lfa
                java.lang.String r6 = r5.readLine()     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r11 = r10
                goto Ld6
            Lfa:
                if (r11 != 0) goto L127
                com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Page r11 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Page     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r11.<init>()     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r14 = r20
                com.badlogic.gdx.files.FileHandle r6 = r14.child(r6)     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r11.textureFile = r6     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
            L109:
                java.lang.String r6 = r5.readLine()     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                int r15 = readEntry(r0, r6)     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                if (r15 != 0) goto L119
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Page> r15 = r1.pages     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r15.add(r11)     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                goto Ld6
            L119:
                r6 = r0[r8]     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                java.lang.Object r6 = r3.get(r6)     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Field r6 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Field) r6     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                if (r6 == 0) goto L109
                r6.parse(r11)     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                goto L109
            L127:
                r14 = r20
                com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Region r15 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Region     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r15.<init>()     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r15.page = r11     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r15.name = r6     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                if (r21 == 0) goto L13a
                r15.flip = r4     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
            L13a:
                java.lang.String r6 = r5.readLine()     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                int r4 = readEntry(r0, r6)     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                if (r4 != 0) goto L17c
                int r4 = r15.originalWidth     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                if (r4 != 0) goto L154
                int r4 = r15.originalHeight     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                if (r4 != 0) goto L154
                int r4 = r15.width     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r15.originalWidth = r4     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                int r4 = r15.height     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r15.originalHeight = r4     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
            L154:
                if (r12 == 0) goto L174
                int r4 = r12.size     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                if (r4 <= 0) goto L174
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                java.lang.Object[] r4 = r12.toArray(r4)     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r15.names = r4     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                java.lang.Class<int[]> r4 = int[].class
                java.lang.Object[] r4 = r13.toArray(r4)     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                int[][] r4 = (int[][]) r4     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r15.values = r4     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r12.clear()     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r13.clear()     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
            L174:
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Region> r4 = r1.regions     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r4.add(r15)     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r4 = 1
                goto Ld6
            L17c:
                r6 = r0[r8]     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                java.lang.Object r6 = r9.get(r6)     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Field r6 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Field) r6     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                if (r6 == 0) goto L18a
                r6.parse(r15)     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                goto L1b1
            L18a:
                if (r12 != 0) goto L198
                com.badlogic.gdx.utils.Array r12 = new com.badlogic.gdx.utils.Array     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r6 = 8
                r12.<init>(r6)     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                com.badlogic.gdx.utils.Array r13 = new com.badlogic.gdx.utils.Array     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r13.<init>(r6)     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
            L198:
                r6 = r0[r8]     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r12.add(r6)     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                int[] r6 = new int[r4]     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
            L19f:
                if (r8 >= r4) goto L1ae
                int r16 = r8 + 1
                r17 = r0[r16]     // Catch: java.lang.NumberFormatException -> L1ab java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                int r17 = java.lang.Integer.parseInt(r17)     // Catch: java.lang.NumberFormatException -> L1ab java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
                r6[r8] = r17     // Catch: java.lang.NumberFormatException -> L1ab java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
            L1ab:
                r8 = r16
                goto L19f
            L1ae:
                r13.add(r6)     // Catch: java.lang.Throwable -> L1b4 java.lang.Exception -> L1b6
            L1b1:
                r4 = 1
                r8 = 0
                goto L13a
            L1b4:
                r0 = move-exception
                goto L1ce
            L1b6:
                r0 = move-exception
                com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L1b4
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b4
                r4.<init>()     // Catch: java.lang.Throwable -> L1b4
                java.lang.String r6 = "Error reading texture atlas file: "
                r4.append(r6)     // Catch: java.lang.Throwable -> L1b4
                r4.append(r2)     // Catch: java.lang.Throwable -> L1b4
                java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L1b4
                r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L1b4
                throw r3     // Catch: java.lang.Throwable -> L1b4
            L1ce:
                com.badlogic.gdx.utils.StreamUtils.closeQuietly(r5)
                throw r0
        }
    }

    public TextureAtlas() {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.utils.ObjectSet r0 = new com.badlogic.gdx.utils.ObjectSet
            r1 = 4
            r0.<init>(r1)
            r2.textures = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r2.regions = r0
            return
    }

    public TextureAtlas(com.badlogic.gdx.files.FileHandle r2) {
            r1 = this;
            com.badlogic.gdx.files.FileHandle r0 = r2.parent()
            r1.<init>(r2, r0)
            return
    }

    public TextureAtlas(com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.files.FileHandle r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public TextureAtlas(com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.files.FileHandle r3, boolean r4) {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData r0 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData
            r0.<init>(r2, r3, r4)
            r1.<init>(r0)
            return
    }

    public TextureAtlas(com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData r3) {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.utils.ObjectSet r0 = new com.badlogic.gdx.utils.ObjectSet
            r1 = 4
            r0.<init>(r1)
            r2.textures = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r2.regions = r0
            r2.load(r3)
            return
    }

    public TextureAtlas(java.lang.String r2) {
            r1 = this;
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r2 = r0.internal(r2)
            r1.<init>(r2)
            return
    }

    private com.badlogic.gdx.graphics.g2d.Sprite newSprite(com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion r4) {
            r3 = this;
            int r0 = r4.packedWidth
            int r1 = r4.originalWidth
            if (r0 != r1) goto L2e
            int r0 = r4.packedHeight
            int r1 = r4.originalHeight
            if (r0 != r1) goto L2e
            boolean r0 = r4.rotate
            if (r0 == 0) goto L28
            com.badlogic.gdx.graphics.g2d.Sprite r0 = new com.badlogic.gdx.graphics.g2d.Sprite
            r0.<init>(r4)
            int r1 = r4.getRegionHeight()
            float r1 = (float) r1
            int r4 = r4.getRegionWidth()
            float r4 = (float) r4
            r2 = 0
            r0.setBounds(r2, r2, r1, r4)
            r4 = 1
            r0.rotate90(r4)
            return r0
        L28:
            com.badlogic.gdx.graphics.g2d.Sprite r0 = new com.badlogic.gdx.graphics.g2d.Sprite
            r0.<init>(r4)
            return r0
        L2e:
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasSprite r0 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasSprite
            r0.<init>(r4)
            return r0
    }

    public com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion addRegion(java.lang.String r8, com.badlogic.gdx.graphics.Texture r9, int r10, int r11, int r12, int r13) {
            r7 = this;
            com.badlogic.gdx.utils.ObjectSet<com.badlogic.gdx.graphics.Texture> r0 = r7.textures
            r0.add(r9)
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            r0.name = r8
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion> r8 = r7.regions
            r8.add(r0)
            return r0
    }

    public com.badlogic.gdx.graphics.g2d.Sprite createSprite(java.lang.String r4) {
            r3 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion> r0 = r3.regions
            int r0 = r0.size
            r1 = 0
        L5:
            if (r1 >= r0) goto L27
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion> r2 = r3.regions
            java.lang.Object r2 = r2.get(r1)
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion) r2
            java.lang.String r2 = r2.name
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L24
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion> r4 = r3.regions
            java.lang.Object r4 = r4.get(r1)
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion) r4
            com.badlogic.gdx.graphics.g2d.Sprite r4 = r3.newSprite(r4)
            return r4
        L24:
            int r1 = r1 + 1
            goto L5
        L27:
            r4 = 0
            return r4
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            com.badlogic.gdx.utils.ObjectSet<com.badlogic.gdx.graphics.Texture> r0 = r2.textures
            com.badlogic.gdx.utils.ObjectSet$ObjectSetIterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.graphics.Texture r1 = (com.badlogic.gdx.graphics.Texture) r1
            r1.dispose()
            goto L6
        L16:
            com.badlogic.gdx.utils.ObjectSet<com.badlogic.gdx.graphics.Texture> r0 = r2.textures
            r1 = 0
            r0.clear(r1)
            return
    }

    public com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion findRegion(java.lang.String r4) {
            r3 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion> r0 = r3.regions
            int r0 = r0.size
            r1 = 0
        L5:
            if (r1 >= r0) goto L23
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion> r2 = r3.regions
            java.lang.Object r2 = r2.get(r1)
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion) r2
            java.lang.String r2 = r2.name
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L20
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion> r4 = r3.regions
            java.lang.Object r4 = r4.get(r1)
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion) r4
            return r4
        L20:
            int r1 = r1 + 1
            goto L5
        L23:
            r4 = 0
            return r4
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion> findRegions(java.lang.String r6) {
            r5 = this;
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion> r1 = com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion.class
            r0.<init>(r1)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion> r1 = r5.regions
            int r1 = r1.size
            r2 = 0
        Lc:
            if (r2 >= r1) goto L29
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion> r3 = r5.regions
            java.lang.Object r3 = r3.get(r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion) r3
            java.lang.String r4 = r3.name
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L26
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion
            r4.<init>(r3)
            r0.add(r4)
        L26:
            int r2 = r2 + 1
            goto Lc
        L29:
            return r0
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion> getRegions() {
            r1 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion> r0 = r1.regions
            return r0
    }

    public void load(com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData r9) {
            r8 = this;
            com.badlogic.gdx.utils.ObjectSet<com.badlogic.gdx.graphics.Texture> r0 = r8.textures
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Page> r1 = r9.pages
            int r1 = r1.size
            r0.ensureCapacity(r1)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Page> r0 = r9.pages
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Page r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Page) r1
            com.badlogic.gdx.graphics.Texture r2 = r1.texture
            if (r2 != 0) goto L2c
            com.badlogic.gdx.graphics.Texture r2 = new com.badlogic.gdx.graphics.Texture
            com.badlogic.gdx.files.FileHandle r3 = r1.textureFile
            com.badlogic.gdx.graphics.Pixmap$Format r4 = r1.format
            boolean r5 = r1.useMipMaps
            r2.<init>(r3, r4, r5)
            r1.texture = r2
        L2c:
            com.badlogic.gdx.graphics.Texture r2 = r1.texture
            com.badlogic.gdx.graphics.Texture$TextureFilter r3 = r1.minFilter
            com.badlogic.gdx.graphics.Texture$TextureFilter r4 = r1.magFilter
            r2.setFilter(r3, r4)
            com.badlogic.gdx.graphics.Texture r2 = r1.texture
            com.badlogic.gdx.graphics.Texture$TextureWrap r3 = r1.uWrap
            com.badlogic.gdx.graphics.Texture$TextureWrap r4 = r1.vWrap
            r2.setWrap(r3, r4)
            com.badlogic.gdx.utils.ObjectSet<com.badlogic.gdx.graphics.Texture> r2 = r8.textures
            com.badlogic.gdx.graphics.Texture r1 = r1.texture
            r2.add(r1)
            goto Lf
        L46:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion> r0 = r8.regions
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Region> r1 = r9.regions
            int r1 = r1.size
            r0.ensureCapacity(r1)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Region> r9 = r9.regions
            com.badlogic.gdx.utils.Array$ArrayIterator r9 = r9.iterator()
        L55:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lb7
            java.lang.Object r0 = r9.next()
            com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Region r0 = (com.badlogic.gdx.graphics.g2d.TextureAtlas.TextureAtlasData.Region) r0
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = new com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion
            com.badlogic.gdx.graphics.g2d.TextureAtlas$TextureAtlasData$Page r1 = r0.page
            com.badlogic.gdx.graphics.Texture r2 = r1.texture
            int r3 = r0.left
            int r4 = r0.top
            boolean r1 = r0.rotate
            if (r1 == 0) goto L72
            int r5 = r0.height
            goto L74
        L72:
            int r5 = r0.width
        L74:
            if (r1 == 0) goto L79
            int r1 = r0.width
            goto L7b
        L79:
            int r1 = r0.height
        L7b:
            r6 = r1
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            int r1 = r0.index
            r7.index = r1
            java.lang.String r1 = r0.name
            r7.name = r1
            float r1 = r0.offsetX
            r7.offsetX = r1
            float r1 = r0.offsetY
            r7.offsetY = r1
            int r1 = r0.originalHeight
            r7.originalHeight = r1
            int r1 = r0.originalWidth
            r7.originalWidth = r1
            boolean r1 = r0.rotate
            r7.rotate = r1
            int r1 = r0.degrees
            r7.degrees = r1
            java.lang.String[] r1 = r0.names
            r7.names = r1
            int[][] r1 = r0.values
            r7.values = r1
            boolean r0 = r0.flip
            if (r0 == 0) goto Lb1
            r0 = 0
            r1 = 1
            r7.flip(r0, r1)
        Lb1:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion> r0 = r8.regions
            r0.add(r7)
            goto L55
        Lb7:
            return
    }
}
