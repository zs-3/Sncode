package com.badlogic.gdx.graphics;

/* loaded from: classes.dex */
public class Cubemap extends com.badlogic.gdx.graphics.GLTexture {
    private static com.badlogic.gdx.assets.AssetManager assetManager;
    static final java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Cubemap>> managedCubemaps = null;
    protected com.badlogic.gdx.graphics.CubemapData data;


    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.badlogic.gdx.graphics.Cubemap.managedCubemaps = r0
            return
    }

    public Cubemap(com.badlogic.gdx.graphics.CubemapData r2) {
            r1 = this;
            r0 = 34067(0x8513, float:4.7738E-41)
            r1.<init>(r0)
            r1.data = r2
            r1.load(r2)
            boolean r2 = r2.isManaged()
            if (r2 == 0) goto L16
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            addManagedCubemap(r2, r1)
        L16:
            return
    }

    private static void addManagedCubemap(com.badlogic.gdx.Application r2, com.badlogic.gdx.graphics.Cubemap r3) {
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Cubemap>> r0 = com.badlogic.gdx.graphics.Cubemap.managedCubemaps
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

    public static void clearAllCubemaps(com.badlogic.gdx.Application r1) {
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Cubemap>> r0 = com.badlogic.gdx.graphics.Cubemap.managedCubemaps
            r0.remove(r1)
            return
    }

    public static java.lang.String getManagedStatus() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Managed cubemap/app: { "
            r0.append(r1)
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Cubemap>> r1 = com.badlogic.gdx.graphics.Cubemap.managedCubemaps
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            com.badlogic.gdx.Application r2 = (com.badlogic.gdx.Application) r2
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Cubemap>> r3 = com.badlogic.gdx.graphics.Cubemap.managedCubemaps
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

    public static void invalidateAllCubemaps(com.badlogic.gdx.Application r8) {
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Cubemap>> r0 = com.badlogic.gdx.graphics.Cubemap.managedCubemaps
            java.lang.Object r8 = r0.get(r8)
            com.badlogic.gdx.utils.Array r8 = (com.badlogic.gdx.utils.Array) r8
            if (r8 != 0) goto Lb
            return
        Lb:
            com.badlogic.gdx.assets.AssetManager r0 = com.badlogic.gdx.graphics.Cubemap.assetManager
            r1 = 0
            if (r0 != 0) goto L20
        L10:
            int r0 = r8.size
            if (r1 >= r0) goto L98
            java.lang.Object r0 = r8.get(r1)
            com.badlogic.gdx.graphics.Cubemap r0 = (com.badlogic.gdx.graphics.Cubemap) r0
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
            if (r3 == 0) goto L92
            java.lang.Object r3 = r2.next()
            com.badlogic.gdx.graphics.Cubemap r3 = (com.badlogic.gdx.graphics.Cubemap) r3
            com.badlogic.gdx.assets.AssetManager r4 = com.badlogic.gdx.graphics.Cubemap.assetManager
            java.lang.String r4 = r4.getAssetFileName(r3)
            if (r4 != 0) goto L44
            r3.reload()
            goto L2c
        L44:
            com.badlogic.gdx.assets.AssetManager r5 = com.badlogic.gdx.graphics.Cubemap.assetManager
            int r5 = r5.getReferenceCount(r4)
            com.badlogic.gdx.assets.AssetManager r6 = com.badlogic.gdx.graphics.Cubemap.assetManager
            r6.setReferenceCount(r4, r1)
            r3.glHandle = r1
            com.badlogic.gdx.assets.loaders.CubemapLoader$CubemapParameter r6 = new com.badlogic.gdx.assets.loaders.CubemapLoader$CubemapParameter
            r6.<init>()
            com.badlogic.gdx.graphics.CubemapData r7 = r3.getCubemapData()
            r6.cubemapData = r7
            com.badlogic.gdx.graphics.Texture$TextureFilter r7 = r3.getMinFilter()
            r6.minFilter = r7
            com.badlogic.gdx.graphics.Texture$TextureFilter r7 = r3.getMagFilter()
            r6.magFilter = r7
            com.badlogic.gdx.graphics.Texture$TextureWrap r7 = r3.getUWrap()
            r6.wrapU = r7
            com.badlogic.gdx.graphics.Texture$TextureWrap r7 = r3.getVWrap()
            r6.wrapV = r7
            r6.cubemap = r3
            com.badlogic.gdx.graphics.Cubemap$1 r7 = new com.badlogic.gdx.graphics.Cubemap$1
            r7.<init>(r5)
            r6.loadedCallback = r7
            com.badlogic.gdx.assets.AssetManager r5 = com.badlogic.gdx.graphics.Cubemap.assetManager
            r5.unload(r4)
            com.badlogic.gdx.graphics.GL20 r5 = com.badlogic.gdx.Gdx.gl
            int r5 = r5.glGenTexture()
            r3.glHandle = r5
            com.badlogic.gdx.assets.AssetManager r3 = com.badlogic.gdx.graphics.Cubemap.assetManager
            java.lang.Class<com.badlogic.gdx.graphics.Cubemap> r5 = com.badlogic.gdx.graphics.Cubemap.class
            r3.load(r4, r5, r6)
            goto L2c
        L92:
            r8.clear()
            r8.addAll(r0)
        L98:
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
            com.badlogic.gdx.graphics.CubemapData r0 = r2.data
            boolean r0 = r0.isManaged()
            if (r0 == 0) goto L26
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Cubemap>> r0 = com.badlogic.gdx.graphics.Cubemap.managedCubemaps
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

    public com.badlogic.gdx.graphics.CubemapData getCubemapData() {
            r1 = this;
            com.badlogic.gdx.graphics.CubemapData r0 = r1.data
            return r0
    }

    public boolean isManaged() {
            r1 = this;
            com.badlogic.gdx.graphics.CubemapData r0 = r1.data
            boolean r0 = r0.isManaged()
            return r0
    }

    public void load(com.badlogic.gdx.graphics.CubemapData r4) {
            r3 = this;
            boolean r0 = r4.isPrepared()
            if (r0 != 0) goto L9
            r4.prepare()
        L9:
            r3.bind()
            com.badlogic.gdx.graphics.Texture$TextureFilter r0 = r3.minFilter
            com.badlogic.gdx.graphics.Texture$TextureFilter r1 = r3.magFilter
            r2 = 1
            r3.unsafeSetFilter(r0, r1, r2)
            com.badlogic.gdx.graphics.Texture$TextureWrap r0 = r3.uWrap
            com.badlogic.gdx.graphics.Texture$TextureWrap r1 = r3.vWrap
            r3.unsafeSetWrap(r0, r1, r2)
            float r0 = r3.anisotropicFilterLevel
            r3.unsafeSetAnisotropicFilter(r0, r2)
            r4.consumeCubemapData()
            com.badlogic.gdx.graphics.GL20 r4 = com.badlogic.gdx.Gdx.gl
            int r0 = r3.glTarget
            r1 = 0
            r4.glBindTexture(r0, r1)
            return
    }

    protected void reload() {
            r2 = this;
            boolean r0 = r2.isManaged()
            if (r0 == 0) goto L14
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            int r0 = r0.glGenTexture()
            r2.glHandle = r0
            com.badlogic.gdx.graphics.CubemapData r0 = r2.data
            r2.load(r0)
            return
        L14:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Tried to reload an unmanaged Cubemap"
            r0.<init>(r1)
            throw r0
    }
}
