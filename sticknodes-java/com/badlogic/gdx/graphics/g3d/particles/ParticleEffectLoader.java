package com.badlogic.gdx.graphics.g3d.particles;

/* loaded from: classes.dex */
public class ParticleEffectLoader extends com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader<com.badlogic.gdx.graphics.g3d.particles.ParticleEffect, com.badlogic.gdx.graphics.g3d.particles.ParticleEffectLoader.ParticleEffectLoadParameter> {
    protected com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.ObjectMap.Entry<java.lang.String, com.badlogic.gdx.graphics.g3d.particles.ResourceData<com.badlogic.gdx.graphics.g3d.particles.ParticleEffect>>> items;

    public static class ParticleEffectLoadParameter extends com.badlogic.gdx.assets.AssetLoaderParameters<com.badlogic.gdx.graphics.g3d.particles.ParticleEffect> {
        com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch<?>> batches;
    }

    public ParticleEffectLoader(com.badlogic.gdx.assets.loaders.FileHandleResolver r1) {
            r0 = this;
            r0.<init>(r1)
            com.badlogic.gdx.utils.Array r1 = new com.badlogic.gdx.utils.Array
            r1.<init>()
            r0.items = r1
            return
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.utils.Array getDependencies(java.lang.String r1, com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.assets.AssetLoaderParameters r3) {
            r0 = this;
            com.badlogic.gdx.graphics.g3d.particles.ParticleEffectLoader$ParticleEffectLoadParameter r3 = (com.badlogic.gdx.graphics.g3d.particles.ParticleEffectLoader.ParticleEffectLoadParameter) r3
            com.badlogic.gdx.utils.Array r1 = r0.getDependencies(r1, r2, r3)
            return r1
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> getDependencies(java.lang.String r6, com.badlogic.gdx.files.FileHandle r7, com.badlogic.gdx.graphics.g3d.particles.ParticleEffectLoader.ParticleEffectLoadParameter r8) {
            r5 = this;
            com.badlogic.gdx.utils.Json r0 = new com.badlogic.gdx.utils.Json
            r0.<init>()
            java.lang.Class<com.badlogic.gdx.graphics.g3d.particles.ResourceData> r1 = com.badlogic.gdx.graphics.g3d.particles.ResourceData.class
            java.lang.Object r0 = r0.fromJson(r1, r7)
            com.badlogic.gdx.graphics.g3d.particles.ResourceData r0 = (com.badlogic.gdx.graphics.g3d.particles.ResourceData) r0
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.ObjectMap$Entry<java.lang.String, com.badlogic.gdx.graphics.g3d.particles.ResourceData<com.badlogic.gdx.graphics.g3d.particles.ParticleEffect>>> r1 = r5.items
            monitor-enter(r1)
            com.badlogic.gdx.utils.ObjectMap$Entry r2 = new com.badlogic.gdx.utils.ObjectMap$Entry     // Catch: java.lang.Throwable -> L7b
            r2.<init>()     // Catch: java.lang.Throwable -> L7b
            r2.key = r6     // Catch: java.lang.Throwable -> L7b
            r2.value = r0     // Catch: java.lang.Throwable -> L7b
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.ObjectMap$Entry<java.lang.String, com.badlogic.gdx.graphics.g3d.particles.ResourceData<com.badlogic.gdx.graphics.g3d.particles.ParticleEffect>>> r6 = r5.items     // Catch: java.lang.Throwable -> L7b
            r6.add(r2)     // Catch: java.lang.Throwable -> L7b
            com.badlogic.gdx.utils.Array r6 = r0.getAssets()     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7b
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            com.badlogic.gdx.utils.Array$ArrayIterator r6 = r6.iterator()
        L2c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r6.next()
            com.badlogic.gdx.graphics.g3d.particles.ResourceData$AssetData r1 = (com.badlogic.gdx.graphics.g3d.particles.ResourceData.AssetData) r1
            java.lang.String r2 = r1.filename
            com.badlogic.gdx.files.FileHandle r2 = r5.resolve(r2)
            boolean r2 = r2.exists()
            if (r2 != 0) goto L5e
            com.badlogic.gdx.files.FileHandle r2 = r7.parent()
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            java.lang.String r4 = r1.filename
            com.badlogic.gdx.files.FileHandle r3 = r3.internal(r4)
            java.lang.String r3 = r3.name()
            com.badlogic.gdx.files.FileHandle r2 = r2.child(r3)
            java.lang.String r2 = r2.path()
            r1.filename = r2
        L5e:
            java.lang.Class<T> r2 = r1.type
            java.lang.Class<com.badlogic.gdx.graphics.g3d.particles.ParticleEffect> r3 = com.badlogic.gdx.graphics.g3d.particles.ParticleEffect.class
            if (r2 != r3) goto L6f
            com.badlogic.gdx.assets.AssetDescriptor r3 = new com.badlogic.gdx.assets.AssetDescriptor
            java.lang.String r1 = r1.filename
            r3.<init>(r1, r2, r8)
            r0.add(r3)
            goto L2c
        L6f:
            com.badlogic.gdx.assets.AssetDescriptor r3 = new com.badlogic.gdx.assets.AssetDescriptor
            java.lang.String r1 = r1.filename
            r3.<init>(r1, r2)
            r0.add(r3)
            goto L2c
        L7a:
            return r0
        L7b:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7b
            throw r6
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public /* bridge */ /* synthetic */ void loadAsync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.graphics.g3d.particles.ParticleEffectLoader$ParticleEffectLoadParameter r4 = (com.badlogic.gdx.graphics.g3d.particles.ParticleEffectLoader.ParticleEffectLoadParameter) r4
            r0.loadAsync(r1, r2, r3, r4)
            return
    }

    public void loadAsync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.graphics.g3d.particles.ParticleEffectLoader.ParticleEffectLoadParameter r4) {
            r0 = this;
            return
    }

    public com.badlogic.gdx.graphics.g3d.particles.ParticleEffect loadSync(com.badlogic.gdx.assets.AssetManager r4, java.lang.String r5, com.badlogic.gdx.files.FileHandle r6, com.badlogic.gdx.graphics.g3d.particles.ParticleEffectLoader.ParticleEffectLoadParameter r7) {
            r3 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.ObjectMap$Entry<java.lang.String, com.badlogic.gdx.graphics.g3d.particles.ResourceData<com.badlogic.gdx.graphics.g3d.particles.ParticleEffect>>> r6 = r3.items
            monitor-enter(r6)
            r0 = 0
        L4:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.ObjectMap$Entry<java.lang.String, com.badlogic.gdx.graphics.g3d.particles.ResourceData<com.badlogic.gdx.graphics.g3d.particles.ParticleEffect>>> r1 = r3.items     // Catch: java.lang.Throwable -> L58
            int r2 = r1.size     // Catch: java.lang.Throwable -> L58
            if (r0 >= r2) goto L27
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L58
            com.badlogic.gdx.utils.ObjectMap$Entry r1 = (com.badlogic.gdx.utils.ObjectMap.Entry) r1     // Catch: java.lang.Throwable -> L58
            K r2 = r1.key     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L58
            boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L24
            V r5 = r1.value     // Catch: java.lang.Throwable -> L58
            com.badlogic.gdx.graphics.g3d.particles.ResourceData r5 = (com.badlogic.gdx.graphics.g3d.particles.ResourceData) r5     // Catch: java.lang.Throwable -> L58
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.ObjectMap$Entry<java.lang.String, com.badlogic.gdx.graphics.g3d.particles.ResourceData<com.badlogic.gdx.graphics.g3d.particles.ParticleEffect>>> r1 = r3.items     // Catch: java.lang.Throwable -> L58
            r1.removeIndex(r0)     // Catch: java.lang.Throwable -> L58
            goto L28
        L24:
            int r0 = r0 + 1
            goto L4
        L27:
            r5 = 0
        L28:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L58
            T r6 = r5.resource
            com.badlogic.gdx.graphics.g3d.particles.ParticleEffect r6 = (com.badlogic.gdx.graphics.g3d.particles.ParticleEffect) r6
            r6.load(r4, r5)
            if (r7 == 0) goto L53
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch<?>> r6 = r7.batches
            if (r6 == 0) goto L4a
            com.badlogic.gdx.utils.Array$ArrayIterator r6 = r6.iterator()
        L3a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r6.next()
            com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch r0 = (com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch) r0
            r0.load(r4, r5)
            goto L3a
        L4a:
            T r4 = r5.resource
            com.badlogic.gdx.graphics.g3d.particles.ParticleEffect r4 = (com.badlogic.gdx.graphics.g3d.particles.ParticleEffect) r4
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch<?>> r6 = r7.batches
            r4.setBatch(r6)
        L53:
            T r4 = r5.resource
            com.badlogic.gdx.graphics.g3d.particles.ParticleEffect r4 = (com.badlogic.gdx.graphics.g3d.particles.ParticleEffect) r4
            return r4
        L58:
            r4 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L58
            throw r4
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.g3d.particles.ParticleEffect loadSync(com.badlogic.gdx.assets.AssetManager r1, java.lang.String r2, com.badlogic.gdx.files.FileHandle r3, com.badlogic.gdx.assets.AssetLoaderParameters r4) {
            r0 = this;
            com.badlogic.gdx.graphics.g3d.particles.ParticleEffectLoader$ParticleEffectLoadParameter r4 = (com.badlogic.gdx.graphics.g3d.particles.ParticleEffectLoader.ParticleEffectLoadParameter) r4
            com.badlogic.gdx.graphics.g3d.particles.ParticleEffect r1 = r0.loadSync(r1, r2, r3, r4)
            return r1
    }
}
