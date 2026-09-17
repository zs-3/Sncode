package com.badlogic.gdx.assets.loaders;

import com.badlogic.gdx.assets.loaders.ModelLoader.ModelParameters;

/* loaded from: classes.dex */
public abstract class ModelLoader<P extends com.badlogic.gdx.assets.loaders.ModelLoader.ModelParameters> extends com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader<com.badlogic.gdx.graphics.g3d.Model, P> {
    protected com.badlogic.gdx.assets.loaders.ModelLoader.ModelParameters defaultParameters;
    protected com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.ObjectMap.Entry<java.lang.String, com.badlogic.gdx.graphics.g3d.model.data.ModelData>> items;

    public static class ModelParameters extends com.badlogic.gdx.assets.AssetLoaderParameters<com.badlogic.gdx.graphics.g3d.Model> {
        public com.badlogic.gdx.assets.loaders.TextureLoader.TextureParameter textureParameter;

        public ModelParameters() {
                r2 = this;
                r2.<init>()
                com.badlogic.gdx.assets.loaders.TextureLoader$TextureParameter r0 = new com.badlogic.gdx.assets.loaders.TextureLoader$TextureParameter
                r0.<init>()
                r2.textureParameter = r0
                com.badlogic.gdx.graphics.Texture$TextureFilter r1 = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
                r0.magFilter = r1
                r0.minFilter = r1
                com.badlogic.gdx.graphics.Texture$TextureWrap r1 = com.badlogic.gdx.graphics.Texture.TextureWrap.Repeat
                r0.wrapV = r1
                r0.wrapU = r1
                return
        }
    }

    public ModelLoader(com.badlogic.gdx.assets.loaders.FileHandleResolver r1) {
            r0 = this;
            r0.<init>(r1)
            com.badlogic.gdx.utils.Array r1 = new com.badlogic.gdx.utils.Array
            r1.<init>()
            r0.items = r1
            com.badlogic.gdx.assets.loaders.ModelLoader$ModelParameters r1 = new com.badlogic.gdx.assets.loaders.ModelLoader$ModelParameters
            r1.<init>()
            r0.defaultParameters = r1
            return
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.utils.Array getDependencies(java.lang.String r1, com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.assets.AssetLoaderParameters r3) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.ModelLoader$ModelParameters r3 = (com.badlogic.gdx.assets.loaders.ModelLoader.ModelParameters) r3
            com.badlogic.gdx.utils.Array r1 = r0.getDependencies(r1, r2, r3)
            return r1
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> getDependencies(java.lang.String r5, com.badlogic.gdx.files.FileHandle r6, P r7) {
            r4 = this;
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            com.badlogic.gdx.graphics.g3d.model.data.ModelData r6 = r4.loadModelData(r6, r7)
            if (r6 != 0) goto Lc
            return r0
        Lc:
            com.badlogic.gdx.utils.ObjectMap$Entry r1 = new com.badlogic.gdx.utils.ObjectMap$Entry
            r1.<init>()
            r1.key = r5
            r1.value = r6
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.ObjectMap$Entry<java.lang.String, com.badlogic.gdx.graphics.g3d.model.data.ModelData>> r5 = r4.items
            monitor-enter(r5)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.ObjectMap$Entry<java.lang.String, com.badlogic.gdx.graphics.g3d.model.data.ModelData>> r2 = r4.items     // Catch: java.lang.Throwable -> L5b
            r2.add(r1)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L23
            com.badlogic.gdx.assets.loaders.TextureLoader$TextureParameter r5 = r7.textureParameter
            goto L27
        L23:
            com.badlogic.gdx.assets.loaders.ModelLoader$ModelParameters r5 = r4.defaultParameters
            com.badlogic.gdx.assets.loaders.TextureLoader$TextureParameter r5 = r5.textureParameter
        L27:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial> r6 = r6.materials
            com.badlogic.gdx.utils.Array$ArrayIterator r6 = r6.iterator()
        L2d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5a
            java.lang.Object r7 = r6.next()
            com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial r7 = (com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial) r7
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.model.data.ModelTexture> r7 = r7.textures
            if (r7 == 0) goto L2d
            com.badlogic.gdx.utils.Array$ArrayIterator r7 = r7.iterator()
        L41:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r7.next()
            com.badlogic.gdx.graphics.g3d.model.data.ModelTexture r1 = (com.badlogic.gdx.graphics.g3d.model.data.ModelTexture) r1
            com.badlogic.gdx.assets.AssetDescriptor r2 = new com.badlogic.gdx.assets.AssetDescriptor
            java.lang.String r1 = r1.fileName
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r3 = com.badlogic.gdx.graphics.Texture.class
            r2.<init>(r1, r3, r5)
            r0.add(r2)
            goto L41
        L5a:
            return r0
        L5b:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5b
            throw r6
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public /* bridge */ /* synthetic */ void loadAsync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.ModelLoader$ModelParameters r4 = (com.badlogic.gdx.assets.loaders.ModelLoader.ModelParameters) r4
            r0.loadAsync(r1, r2, r3, r4)
            return
    }

    public void loadAsync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, P r4) {
            r0 = this;
            return
    }

    public abstract com.badlogic.gdx.graphics.g3d.model.data.ModelData loadModelData(com.badlogic.gdx.files.FileHandle r1, P r2);

    public com.badlogic.gdx.graphics.g3d.Model loadSync(com.badlogic.gdx.assets.AssetManager r5, java.lang.String r6, com.badlogic.gdx.files.FileHandle r7, P r8) {
            r4 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.ObjectMap$Entry<java.lang.String, com.badlogic.gdx.graphics.g3d.model.data.ModelData>> r7 = r4.items
            monitor-enter(r7)
            r8 = 0
            r0 = 0
            r1 = r0
        L6:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.ObjectMap$Entry<java.lang.String, com.badlogic.gdx.graphics.g3d.model.data.ModelData>> r2 = r4.items     // Catch: java.lang.Throwable -> L5b
            int r3 = r2.size     // Catch: java.lang.Throwable -> L5b
            if (r8 >= r3) goto L30
            java.lang.Object r2 = r2.get(r8)     // Catch: java.lang.Throwable -> L5b
            com.badlogic.gdx.utils.ObjectMap$Entry r2 = (com.badlogic.gdx.utils.ObjectMap.Entry) r2     // Catch: java.lang.Throwable -> L5b
            K r2 = r2.key     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L5b
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L2d
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.ObjectMap$Entry<java.lang.String, com.badlogic.gdx.graphics.g3d.model.data.ModelData>> r1 = r4.items     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L5b
            com.badlogic.gdx.utils.ObjectMap$Entry r1 = (com.badlogic.gdx.utils.ObjectMap.Entry) r1     // Catch: java.lang.Throwable -> L5b
            V r1 = r1.value     // Catch: java.lang.Throwable -> L5b
            com.badlogic.gdx.graphics.g3d.model.data.ModelData r1 = (com.badlogic.gdx.graphics.g3d.model.data.ModelData) r1     // Catch: java.lang.Throwable -> L5b
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.ObjectMap$Entry<java.lang.String, com.badlogic.gdx.graphics.g3d.model.data.ModelData>> r2 = r4.items     // Catch: java.lang.Throwable -> L5b
            r2.removeIndex(r8)     // Catch: java.lang.Throwable -> L5b
        L2d:
            int r8 = r8 + 1
            goto L6
        L30:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L34
            return r0
        L34:
            com.badlogic.gdx.graphics.g3d.Model r6 = new com.badlogic.gdx.graphics.g3d.Model
            com.badlogic.gdx.graphics.g3d.utils.TextureProvider$AssetTextureProvider r7 = new com.badlogic.gdx.graphics.g3d.utils.TextureProvider$AssetTextureProvider
            r7.<init>(r5)
            r6.<init>(r1, r7)
            java.lang.Iterable r5 = r6.getManagedDisposables()
            java.util.Iterator r5 = r5.iterator()
        L46:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L5a
            java.lang.Object r7 = r5.next()
            com.badlogic.gdx.utils.Disposable r7 = (com.badlogic.gdx.utils.Disposable) r7
            boolean r7 = r7 instanceof com.badlogic.gdx.graphics.Texture
            if (r7 == 0) goto L46
            r5.remove()
            goto L46
        L5a:
            return r6
        L5b:
            r5 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5b
            throw r5
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.g3d.Model loadSync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.assets.loaders.ModelLoader$ModelParameters r4 = (com.badlogic.gdx.assets.loaders.ModelLoader.ModelParameters) r4
            com.badlogic.gdx.graphics.g3d.Model r1 = r0.loadSync(r1, r2, r3, r4)
            return r1
    }
}
