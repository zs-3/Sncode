package com.badlogic.gdx.graphics;

/* loaded from: classes.dex */
public class Texture extends com.badlogic.gdx.graphics.GLTexture {
    private static com.badlogic.gdx.assets.AssetManager assetManager;
    static final java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture>> managedTextures = null;
    com.badlogic.gdx.graphics.TextureData data;


    public enum TextureFilter extends java.lang.Enum<com.badlogic.gdx.graphics.Texture.TextureFilter> {
        private static final /* synthetic */ com.badlogic.gdx.graphics.Texture.TextureFilter[] $VALUES = null;
        public static final com.badlogic.gdx.graphics.Texture.TextureFilter Linear = null;
        public static final com.badlogic.gdx.graphics.Texture.TextureFilter MipMap = null;
        public static final com.badlogic.gdx.graphics.Texture.TextureFilter MipMapLinearLinear = null;
        public static final com.badlogic.gdx.graphics.Texture.TextureFilter MipMapLinearNearest = null;
        public static final com.badlogic.gdx.graphics.Texture.TextureFilter MipMapNearestLinear = null;
        public static final com.badlogic.gdx.graphics.Texture.TextureFilter MipMapNearestNearest = null;
        public static final com.badlogic.gdx.graphics.Texture.TextureFilter Nearest = null;
        final int glEnum;

        static {
                com.badlogic.gdx.graphics.Texture$TextureFilter r0 = new com.badlogic.gdx.graphics.Texture$TextureFilter
                java.lang.String r1 = "Nearest"
                r2 = 0
                r3 = 9728(0x2600, float:1.3632E-41)
                r0.<init>(r1, r2, r3)
                com.badlogic.gdx.graphics.Texture.TextureFilter.Nearest = r0
                com.badlogic.gdx.graphics.Texture$TextureFilter r1 = new com.badlogic.gdx.graphics.Texture$TextureFilter
                java.lang.String r3 = "Linear"
                r4 = 1
                r5 = 9729(0x2601, float:1.3633E-41)
                r1.<init>(r3, r4, r5)
                com.badlogic.gdx.graphics.Texture.TextureFilter.Linear = r1
                com.badlogic.gdx.graphics.Texture$TextureFilter r3 = new com.badlogic.gdx.graphics.Texture$TextureFilter
                java.lang.String r5 = "MipMap"
                r6 = 2
                r7 = 9987(0x2703, float:1.3995E-41)
                r3.<init>(r5, r6, r7)
                com.badlogic.gdx.graphics.Texture.TextureFilter.MipMap = r3
                com.badlogic.gdx.graphics.Texture$TextureFilter r5 = new com.badlogic.gdx.graphics.Texture$TextureFilter
                java.lang.String r8 = "MipMapNearestNearest"
                r9 = 3
                r10 = 9984(0x2700, float:1.399E-41)
                r5.<init>(r8, r9, r10)
                com.badlogic.gdx.graphics.Texture.TextureFilter.MipMapNearestNearest = r5
                com.badlogic.gdx.graphics.Texture$TextureFilter r8 = new com.badlogic.gdx.graphics.Texture$TextureFilter
                java.lang.String r10 = "MipMapLinearNearest"
                r11 = 4
                r12 = 9985(0x2701, float:1.3992E-41)
                r8.<init>(r10, r11, r12)
                com.badlogic.gdx.graphics.Texture.TextureFilter.MipMapLinearNearest = r8
                com.badlogic.gdx.graphics.Texture$TextureFilter r10 = new com.badlogic.gdx.graphics.Texture$TextureFilter
                java.lang.String r12 = "MipMapNearestLinear"
                r13 = 5
                r14 = 9986(0x2702, float:1.3993E-41)
                r10.<init>(r12, r13, r14)
                com.badlogic.gdx.graphics.Texture.TextureFilter.MipMapNearestLinear = r10
                com.badlogic.gdx.graphics.Texture$TextureFilter r12 = new com.badlogic.gdx.graphics.Texture$TextureFilter
                java.lang.String r14 = "MipMapLinearLinear"
                r15 = 6
                r12.<init>(r14, r15, r7)
                com.badlogic.gdx.graphics.Texture.TextureFilter.MipMapLinearLinear = r12
                r7 = 7
                com.badlogic.gdx.graphics.Texture$TextureFilter[] r7 = new com.badlogic.gdx.graphics.Texture.TextureFilter[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r9] = r5
                r7[r11] = r8
                r7[r13] = r10
                r7[r15] = r12
                com.badlogic.gdx.graphics.Texture.TextureFilter.$VALUES = r7
                return
        }

        TextureFilter(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.glEnum = r3
                return
        }

        public static com.badlogic.gdx.graphics.Texture.TextureFilter valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.graphics.Texture$TextureFilter> r0 = com.badlogic.gdx.graphics.Texture.TextureFilter.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.graphics.Texture$TextureFilter r1 = (com.badlogic.gdx.graphics.Texture.TextureFilter) r1
                return r1
        }

        public static com.badlogic.gdx.graphics.Texture.TextureFilter[] values() {
                com.badlogic.gdx.graphics.Texture$TextureFilter[] r0 = com.badlogic.gdx.graphics.Texture.TextureFilter.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.graphics.Texture$TextureFilter[] r0 = (com.badlogic.gdx.graphics.Texture.TextureFilter[]) r0
                return r0
        }

        public int getGLEnum() {
                r1 = this;
                int r0 = r1.glEnum
                return r0
        }

        public boolean isMipMap() {
                r2 = this;
                int r0 = r2.glEnum
                r1 = 9728(0x2600, float:1.3632E-41)
                if (r0 == r1) goto Lc
                r1 = 9729(0x2601, float:1.3633E-41)
                if (r0 == r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }
    }

    public enum TextureWrap extends java.lang.Enum<com.badlogic.gdx.graphics.Texture.TextureWrap> {
        private static final /* synthetic */ com.badlogic.gdx.graphics.Texture.TextureWrap[] $VALUES = null;
        public static final com.badlogic.gdx.graphics.Texture.TextureWrap ClampToEdge = null;
        public static final com.badlogic.gdx.graphics.Texture.TextureWrap MirroredRepeat = null;
        public static final com.badlogic.gdx.graphics.Texture.TextureWrap Repeat = null;
        final int glEnum;

        static {
                com.badlogic.gdx.graphics.Texture$TextureWrap r0 = new com.badlogic.gdx.graphics.Texture$TextureWrap
                java.lang.String r1 = "MirroredRepeat"
                r2 = 0
                r3 = 33648(0x8370, float:4.7151E-41)
                r0.<init>(r1, r2, r3)
                com.badlogic.gdx.graphics.Texture.TextureWrap.MirroredRepeat = r0
                com.badlogic.gdx.graphics.Texture$TextureWrap r1 = new com.badlogic.gdx.graphics.Texture$TextureWrap
                java.lang.String r3 = "ClampToEdge"
                r4 = 1
                r5 = 33071(0x812f, float:4.6342E-41)
                r1.<init>(r3, r4, r5)
                com.badlogic.gdx.graphics.Texture.TextureWrap.ClampToEdge = r1
                com.badlogic.gdx.graphics.Texture$TextureWrap r3 = new com.badlogic.gdx.graphics.Texture$TextureWrap
                java.lang.String r5 = "Repeat"
                r6 = 2
                r7 = 10497(0x2901, float:1.471E-41)
                r3.<init>(r5, r6, r7)
                com.badlogic.gdx.graphics.Texture.TextureWrap.Repeat = r3
                r5 = 3
                com.badlogic.gdx.graphics.Texture$TextureWrap[] r5 = new com.badlogic.gdx.graphics.Texture.TextureWrap[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.badlogic.gdx.graphics.Texture.TextureWrap.$VALUES = r5
                return
        }

        TextureWrap(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.glEnum = r3
                return
        }

        public static com.badlogic.gdx.graphics.Texture.TextureWrap valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.graphics.Texture$TextureWrap> r0 = com.badlogic.gdx.graphics.Texture.TextureWrap.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.graphics.Texture$TextureWrap r1 = (com.badlogic.gdx.graphics.Texture.TextureWrap) r1
                return r1
        }

        public static com.badlogic.gdx.graphics.Texture.TextureWrap[] values() {
                com.badlogic.gdx.graphics.Texture$TextureWrap[] r0 = com.badlogic.gdx.graphics.Texture.TextureWrap.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.graphics.Texture$TextureWrap[] r0 = (com.badlogic.gdx.graphics.Texture.TextureWrap[]) r0
                return r0
        }

        public int getGLEnum() {
                r1 = this;
                int r0 = r1.glEnum
                return r0
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.badlogic.gdx.graphics.Texture.managedTextures = r0
            return
    }

    protected Texture(int r1, int r2, com.badlogic.gdx.graphics.TextureData r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.load(r3)
            boolean r1 = r3.isManaged()
            if (r1 == 0) goto L11
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            addManagedTexture(r1, r0)
        L11:
            return
    }

    public Texture(com.badlogic.gdx.files.FileHandle r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public Texture(com.badlogic.gdx.files.FileHandle r1, com.badlogic.gdx.graphics.Pixmap.Format r2, boolean r3) {
            r0 = this;
            com.badlogic.gdx.graphics.TextureData r1 = com.badlogic.gdx.graphics.TextureData.Factory.loadFromFile(r1, r2, r3)
            r0.<init>(r1)
            return
    }

    public Texture(com.badlogic.gdx.files.FileHandle r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public Texture(com.badlogic.gdx.graphics.Pixmap r4) {
            r3 = this;
            com.badlogic.gdx.graphics.glutils.PixmapTextureData r0 = new com.badlogic.gdx.graphics.glutils.PixmapTextureData
            r1 = 0
            r2 = 0
            r0.<init>(r4, r1, r2, r2)
            r3.<init>(r0)
            return
    }

    public Texture(com.badlogic.gdx.graphics.Pixmap r4, boolean r5) {
            r3 = this;
            com.badlogic.gdx.graphics.glutils.PixmapTextureData r0 = new com.badlogic.gdx.graphics.glutils.PixmapTextureData
            r1 = 0
            r2 = 0
            r0.<init>(r4, r1, r5, r2)
            r3.<init>(r0)
            return
    }

    public Texture(com.badlogic.gdx.graphics.TextureData r3) {
            r2 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            int r0 = r0.glGenTexture()
            r1 = 3553(0xde1, float:4.979E-42)
            r2.<init>(r1, r0, r3)
            return
    }

    public Texture(java.lang.String r2) {
            r1 = this;
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r2 = r0.internal(r2)
            r1.<init>(r2)
            return
    }

    private static void addManagedTexture(com.badlogic.gdx.Application r2, com.badlogic.gdx.graphics.Texture r3) {
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture>> r0 = com.badlogic.gdx.graphics.Texture.managedTextures
            java.lang.Object r1 = r0.get(r2)
            com.badlogic.gdx.utils.Array r1 = (com.badlogic.gdx.utils.Array) r1
            if (r1 != 0) goto Lf
            com.badlogic.gdx.utils.Array r1 = new com.badlogic.gdx.utils.Array
            r1.<init>()
        Lf:
            r1.add(r3)
            r0.put(r2, r1)
            return
    }

    public static void clearAllTextures(com.badlogic.gdx.Application r1) {
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture>> r0 = com.badlogic.gdx.graphics.Texture.managedTextures
            r0.remove(r1)
            return
    }

    public static java.lang.String getManagedStatus() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Managed textures/app: { "
            r0.append(r1)
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture>> r1 = com.badlogic.gdx.graphics.Texture.managedTextures
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            com.badlogic.gdx.Application r2 = (com.badlogic.gdx.Application) r2
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture>> r3 = com.badlogic.gdx.graphics.Texture.managedTextures
            java.lang.Object r2 = r3.get(r2)
            com.badlogic.gdx.utils.Array r2 = (com.badlogic.gdx.utils.Array) r2
            int r2 = r2.size
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            goto L14
        L33:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static void invalidateAllTextures(com.badlogic.gdx.Application r8) {
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture>> r0 = com.badlogic.gdx.graphics.Texture.managedTextures
            java.lang.Object r8 = r0.get(r8)
            com.badlogic.gdx.utils.Array r8 = (com.badlogic.gdx.utils.Array) r8
            if (r8 != 0) goto Lb
            return
        Lb:
            com.badlogic.gdx.assets.AssetManager r0 = com.badlogic.gdx.graphics.Texture.assetManager
            r1 = 0
            if (r0 != 0) goto L20
        L10:
            int r0 = r8.size
            if (r1 >= r0) goto La0
            java.lang.Object r0 = r8.get(r1)
            com.badlogic.gdx.graphics.Texture r0 = (com.badlogic.gdx.graphics.Texture) r0
            r0.reload()
            int r1 = r1 + 1
            goto L10
        L20:
            r0.finishLoading()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>(r8)
            com.badlogic.gdx.utils.Array$ArrayIterator r2 = r0.iterator()
        L2c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9a
            java.lang.Object r3 = r2.next()
            com.badlogic.gdx.graphics.Texture r3 = (com.badlogic.gdx.graphics.Texture) r3
            com.badlogic.gdx.assets.AssetManager r4 = com.badlogic.gdx.graphics.Texture.assetManager
            java.lang.String r4 = r4.getAssetFileName(r3)
            if (r4 != 0) goto L44
            r3.reload()
            goto L2c
        L44:
            com.badlogic.gdx.assets.AssetManager r5 = com.badlogic.gdx.graphics.Texture.assetManager
            int r5 = r5.getReferenceCount(r4)
            com.badlogic.gdx.assets.AssetManager r6 = com.badlogic.gdx.graphics.Texture.assetManager
            r6.setReferenceCount(r4, r1)
            r3.glHandle = r1
            com.badlogic.gdx.assets.loaders.TextureLoader$TextureParameter r6 = new com.badlogic.gdx.assets.loaders.TextureLoader$TextureParameter
            r6.<init>()
            com.badlogic.gdx.graphics.TextureData r7 = r3.getTextureData()
            r6.textureData = r7
            com.badlogic.gdx.graphics.Texture$TextureFilter r7 = r3.getMinFilter()
            r6.minFilter = r7
            com.badlogic.gdx.graphics.Texture$TextureFilter r7 = r3.getMagFilter()
            r6.magFilter = r7
            com.badlogic.gdx.graphics.Texture$TextureWrap r7 = r3.getUWrap()
            r6.wrapU = r7
            com.badlogic.gdx.graphics.Texture$TextureWrap r7 = r3.getVWrap()
            r6.wrapV = r7
            com.badlogic.gdx.graphics.TextureData r7 = r3.data
            boolean r7 = r7.useMipMaps()
            r6.genMipMaps = r7
            r6.texture = r3
            com.badlogic.gdx.graphics.Texture$1 r7 = new com.badlogic.gdx.graphics.Texture$1
            r7.<init>(r5)
            r6.loadedCallback = r7
            com.badlogic.gdx.assets.AssetManager r5 = com.badlogic.gdx.graphics.Texture.assetManager
            r5.unload(r4)
            com.badlogic.gdx.graphics.GL20 r5 = com.badlogic.gdx.Gdx.gl
            int r5 = r5.glGenTexture()
            r3.glHandle = r5
            com.badlogic.gdx.assets.AssetManager r3 = com.badlogic.gdx.graphics.Texture.assetManager
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r5 = com.badlogic.gdx.graphics.Texture.class
            r3.load(r4, r5, r6)
            goto L2c
        L9a:
            r8.clear()
            r8.addAll(r0)
        La0:
            return
    }

    @Override // com.badlogic.gdx.graphics.GLTexture, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            int r0 = r2.glHandle
            if (r0 != 0) goto L5
            return
        L5:
            r2.delete()
            com.badlogic.gdx.graphics.TextureData r0 = r2.data
            boolean r0 = r0.isManaged()
            if (r0 == 0) goto L26
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture>> r0 = com.badlogic.gdx.graphics.Texture.managedTextures
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L26
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.Object r0 = r0.get(r1)
            com.badlogic.gdx.utils.Array r0 = (com.badlogic.gdx.utils.Array) r0
            r1 = 1
            r0.removeValue(r2, r1)
        L26:
            return
    }

    public int getHeight() {
            r1 = this;
            com.badlogic.gdx.graphics.TextureData r0 = r1.data
            int r0 = r0.getHeight()
            return r0
    }

    public com.badlogic.gdx.graphics.TextureData getTextureData() {
            r1 = this;
            com.badlogic.gdx.graphics.TextureData r0 = r1.data
            return r0
    }

    public int getWidth() {
            r1 = this;
            com.badlogic.gdx.graphics.TextureData r0 = r1.data
            int r0 = r0.getWidth()
            return r0
    }

    public boolean isManaged() {
            r1 = this;
            com.badlogic.gdx.graphics.TextureData r0 = r1.data
            boolean r0 = r0.isManaged()
            return r0
    }

    public void load(com.badlogic.gdx.graphics.TextureData r3) {
            r2 = this;
            com.badlogic.gdx.graphics.TextureData r0 = r2.data
            if (r0 == 0) goto L19
            boolean r0 = r3.isManaged()
            com.badlogic.gdx.graphics.TextureData r1 = r2.data
            boolean r1 = r1.isManaged()
            if (r0 != r1) goto L11
            goto L19
        L11:
            com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r0 = "New data must have the same managed status as the old data"
            r3.<init>(r0)
            throw r3
        L19:
            r2.data = r3
            boolean r0 = r3.isPrepared()
            if (r0 != 0) goto L24
            r3.prepare()
        L24:
            r2.bind()
            r0 = 3553(0xde1, float:4.979E-42)
            com.badlogic.gdx.graphics.GLTexture.uploadImageData(r0, r3)
            com.badlogic.gdx.graphics.Texture$TextureFilter r3 = r2.minFilter
            com.badlogic.gdx.graphics.Texture$TextureFilter r0 = r2.magFilter
            r1 = 1
            r2.unsafeSetFilter(r3, r0, r1)
            com.badlogic.gdx.graphics.Texture$TextureWrap r3 = r2.uWrap
            com.badlogic.gdx.graphics.Texture$TextureWrap r0 = r2.vWrap
            r2.unsafeSetWrap(r3, r0, r1)
            float r3 = r2.anisotropicFilterLevel
            r2.unsafeSetAnisotropicFilter(r3, r1)
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            int r0 = r2.glTarget
            r1 = 0
            r3.glBindTexture(r0, r1)
            return
    }

    protected void reload() {
            r2 = this;
            boolean r0 = r2.isManaged()
            if (r0 == 0) goto L14
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            int r0 = r0.glGenTexture()
            r2.glHandle = r0
            com.badlogic.gdx.graphics.TextureData r0 = r2.data
            r2.load(r0)
            return
        L14:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Tried to reload unmanaged Texture"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String toString() {
            r2 = this;
            com.badlogic.gdx.graphics.TextureData r0 = r2.data
            boolean r1 = r0 instanceof com.badlogic.gdx.graphics.glutils.FileTextureData
            if (r1 == 0) goto Lb
            java.lang.String r0 = r0.toString()
            return r0
        Lb:
            java.lang.String r0 = super.toString()
            return r0
    }
}
