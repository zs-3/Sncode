package com.badlogic.gdx.graphics;

/* loaded from: classes.dex */
public interface TextureData {

    public static class Factory {
        public static com.badlogic.gdx.graphics.TextureData loadFromFile(com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.graphics.Pixmap.Format r3, boolean r4) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = r2.name()
                java.lang.String r1 = ".cim"
                boolean r0 = r0.endsWith(r1)
                if (r0 == 0) goto L1a
                com.badlogic.gdx.graphics.glutils.FileTextureData r0 = new com.badlogic.gdx.graphics.glutils.FileTextureData
                com.badlogic.gdx.graphics.Pixmap r1 = com.badlogic.gdx.graphics.PixmapIO.readCIM(r2)
                r0.<init>(r2, r1, r3, r4)
                return r0
            L1a:
                java.lang.String r0 = r2.name()
                java.lang.String r1 = ".etc1"
                boolean r0 = r0.endsWith(r1)
                if (r0 == 0) goto L2c
                com.badlogic.gdx.graphics.glutils.ETC1TextureData r3 = new com.badlogic.gdx.graphics.glutils.ETC1TextureData
                r3.<init>(r2, r4)
                return r3
            L2c:
                java.lang.String r0 = r2.name()
                java.lang.String r1 = ".ktx"
                boolean r0 = r0.endsWith(r1)
                if (r0 != 0) goto L50
                java.lang.String r0 = r2.name()
                java.lang.String r1 = ".zktx"
                boolean r0 = r0.endsWith(r1)
                if (r0 == 0) goto L45
                goto L50
            L45:
                com.badlogic.gdx.graphics.glutils.FileTextureData r0 = new com.badlogic.gdx.graphics.glutils.FileTextureData
                com.badlogic.gdx.graphics.Pixmap r1 = new com.badlogic.gdx.graphics.Pixmap
                r1.<init>(r2)
                r0.<init>(r2, r1, r3, r4)
                return r0
            L50:
                com.badlogic.gdx.graphics.glutils.KTXTextureData r3 = new com.badlogic.gdx.graphics.glutils.KTXTextureData
                r3.<init>(r2, r4)
                return r3
        }
    }

    public enum TextureDataType extends java.lang.Enum<com.badlogic.gdx.graphics.TextureData.TextureDataType> {
        private static final /* synthetic */ com.badlogic.gdx.graphics.TextureData.TextureDataType[] $VALUES = null;
        public static final com.badlogic.gdx.graphics.TextureData.TextureDataType Custom = null;
        public static final com.badlogic.gdx.graphics.TextureData.TextureDataType Pixmap = null;

        static {
                com.badlogic.gdx.graphics.TextureData$TextureDataType r0 = new com.badlogic.gdx.graphics.TextureData$TextureDataType
                java.lang.String r1 = "Pixmap"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.graphics.TextureData.TextureDataType.Pixmap = r0
                com.badlogic.gdx.graphics.TextureData$TextureDataType r1 = new com.badlogic.gdx.graphics.TextureData$TextureDataType
                java.lang.String r3 = "Custom"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.graphics.TextureData.TextureDataType.Custom = r1
                r3 = 2
                com.badlogic.gdx.graphics.TextureData$TextureDataType[] r3 = new com.badlogic.gdx.graphics.TextureData.TextureDataType[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.badlogic.gdx.graphics.TextureData.TextureDataType.$VALUES = r3
                return
        }

        TextureDataType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.graphics.TextureData.TextureDataType valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.graphics.TextureData$TextureDataType> r0 = com.badlogic.gdx.graphics.TextureData.TextureDataType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.graphics.TextureData$TextureDataType r1 = (com.badlogic.gdx.graphics.TextureData.TextureDataType) r1
                return r1
        }

        public static com.badlogic.gdx.graphics.TextureData.TextureDataType[] values() {
                com.badlogic.gdx.graphics.TextureData$TextureDataType[] r0 = com.badlogic.gdx.graphics.TextureData.TextureDataType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.graphics.TextureData$TextureDataType[] r0 = (com.badlogic.gdx.graphics.TextureData.TextureDataType[]) r0
                return r0
        }
    }

    void consumeCustomData(int r1);

    com.badlogic.gdx.graphics.Pixmap consumePixmap();

    boolean disposePixmap();

    com.badlogic.gdx.graphics.Pixmap.Format getFormat();

    int getHeight();

    com.badlogic.gdx.graphics.TextureData.TextureDataType getType();

    int getWidth();

    boolean isManaged();

    boolean isPrepared();

    void prepare();

    boolean useMipMaps();
}
