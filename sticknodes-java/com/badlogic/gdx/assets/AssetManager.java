package com.badlogic.gdx.assets;

/* loaded from: classes.dex */
public class AssetManager implements com.badlogic.gdx.utils.Disposable {
    final com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.utils.Array<java.lang.String>> assetDependencies;
    final com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> assetTypes;
    final com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.AssetManager.RefCountedContainer>> assets;
    final com.badlogic.gdx.utils.async.AsyncExecutor executor;
    final com.badlogic.gdx.utils.ObjectSet<java.lang.String> injected;
    com.badlogic.gdx.assets.AssetErrorListener listener;
    final com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> loadQueue;
    int loaded;
    final com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.loaders.AssetLoader>> loaders;
    com.badlogic.gdx.utils.Logger log;
    int peakTasks;
    final com.badlogic.gdx.assets.loaders.FileHandleResolver resolver;
    final com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetLoadingTask> tasks;
    int toLoad;

    static class RefCountedContainer {
        java.lang.Object object;
        int refCount;

        RefCountedContainer() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.refCount = r0
                return
        }
    }

    public AssetManager() {
            r1 = this;
            com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver r0 = new com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public AssetManager(com.badlogic.gdx.assets.loaders.FileHandleResolver r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public AssetManager(com.badlogic.gdx.assets.loaders.FileHandleResolver r5, boolean r6) {
            r4 = this;
            java.lang.Class<com.badlogic.gdx.graphics.g3d.Model> r0 = com.badlogic.gdx.graphics.g3d.Model.class
            r4.<init>()
            com.badlogic.gdx.utils.ObjectMap r1 = new com.badlogic.gdx.utils.ObjectMap
            r1.<init>()
            r4.assets = r1
            com.badlogic.gdx.utils.ObjectMap r1 = new com.badlogic.gdx.utils.ObjectMap
            r1.<init>()
            r4.assetTypes = r1
            com.badlogic.gdx.utils.ObjectMap r1 = new com.badlogic.gdx.utils.ObjectMap
            r1.<init>()
            r4.assetDependencies = r1
            com.badlogic.gdx.utils.ObjectSet r1 = new com.badlogic.gdx.utils.ObjectSet
            r1.<init>()
            r4.injected = r1
            com.badlogic.gdx.utils.ObjectMap r1 = new com.badlogic.gdx.utils.ObjectMap
            r1.<init>()
            r4.loaders = r1
            com.badlogic.gdx.utils.Array r1 = new com.badlogic.gdx.utils.Array
            r1.<init>()
            r4.loadQueue = r1
            com.badlogic.gdx.utils.Array r1 = new com.badlogic.gdx.utils.Array
            r1.<init>()
            r4.tasks = r1
            com.badlogic.gdx.utils.Logger r1 = new com.badlogic.gdx.utils.Logger
            java.lang.String r2 = "AssetManager"
            r3 = 0
            r1.<init>(r2, r3)
            r4.log = r1
            r4.resolver = r5
            if (r6 == 0) goto Lee
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r6 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            com.badlogic.gdx.assets.loaders.BitmapFontLoader r1 = new com.badlogic.gdx.assets.loaders.BitmapFontLoader
            r1.<init>(r5)
            r4.setLoader(r6, r1)
            java.lang.Class<com.badlogic.gdx.audio.Music> r6 = com.badlogic.gdx.audio.Music.class
            com.badlogic.gdx.assets.loaders.MusicLoader r1 = new com.badlogic.gdx.assets.loaders.MusicLoader
            r1.<init>(r5)
            r4.setLoader(r6, r1)
            java.lang.Class<com.badlogic.gdx.graphics.Pixmap> r6 = com.badlogic.gdx.graphics.Pixmap.class
            com.badlogic.gdx.assets.loaders.PixmapLoader r1 = new com.badlogic.gdx.assets.loaders.PixmapLoader
            r1.<init>(r5)
            r4.setLoader(r6, r1)
            java.lang.Class<com.badlogic.gdx.audio.Sound> r6 = com.badlogic.gdx.audio.Sound.class
            com.badlogic.gdx.assets.loaders.SoundLoader r1 = new com.badlogic.gdx.assets.loaders.SoundLoader
            r1.<init>(r5)
            r4.setLoader(r6, r1)
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r6 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            com.badlogic.gdx.assets.loaders.TextureAtlasLoader r1 = new com.badlogic.gdx.assets.loaders.TextureAtlasLoader
            r1.<init>(r5)
            r4.setLoader(r6, r1)
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r6 = com.badlogic.gdx.graphics.Texture.class
            com.badlogic.gdx.assets.loaders.TextureLoader r1 = new com.badlogic.gdx.assets.loaders.TextureLoader
            r1.<init>(r5)
            r4.setLoader(r6, r1)
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.Skin> r6 = com.badlogic.gdx.scenes.scene2d.ui.Skin.class
            com.badlogic.gdx.assets.loaders.SkinLoader r1 = new com.badlogic.gdx.assets.loaders.SkinLoader
            r1.<init>(r5)
            r4.setLoader(r6, r1)
            java.lang.Class<com.badlogic.gdx.graphics.g2d.ParticleEffect> r6 = com.badlogic.gdx.graphics.g2d.ParticleEffect.class
            com.badlogic.gdx.assets.loaders.ParticleEffectLoader r1 = new com.badlogic.gdx.assets.loaders.ParticleEffectLoader
            r1.<init>(r5)
            r4.setLoader(r6, r1)
            java.lang.Class<com.badlogic.gdx.graphics.g3d.particles.ParticleEffect> r6 = com.badlogic.gdx.graphics.g3d.particles.ParticleEffect.class
            com.badlogic.gdx.graphics.g3d.particles.ParticleEffectLoader r1 = new com.badlogic.gdx.graphics.g3d.particles.ParticleEffectLoader
            r1.<init>(r5)
            r4.setLoader(r6, r1)
            java.lang.Class<com.badlogic.gdx.graphics.g2d.PolygonRegion> r6 = com.badlogic.gdx.graphics.g2d.PolygonRegion.class
            com.badlogic.gdx.graphics.g2d.PolygonRegionLoader r1 = new com.badlogic.gdx.graphics.g2d.PolygonRegionLoader
            r1.<init>(r5)
            r4.setLoader(r6, r1)
            java.lang.Class<com.badlogic.gdx.utils.I18NBundle> r6 = com.badlogic.gdx.utils.I18NBundle.class
            com.badlogic.gdx.assets.loaders.I18NBundleLoader r1 = new com.badlogic.gdx.assets.loaders.I18NBundleLoader
            r1.<init>(r5)
            r4.setLoader(r6, r1)
            com.badlogic.gdx.graphics.g3d.loader.G3dModelLoader r6 = new com.badlogic.gdx.graphics.g3d.loader.G3dModelLoader
            com.badlogic.gdx.utils.JsonReader r1 = new com.badlogic.gdx.utils.JsonReader
            r1.<init>()
            r6.<init>(r1, r5)
            java.lang.String r1 = ".g3dj"
            r4.setLoader(r0, r1, r6)
            com.badlogic.gdx.graphics.g3d.loader.G3dModelLoader r6 = new com.badlogic.gdx.graphics.g3d.loader.G3dModelLoader
            com.badlogic.gdx.utils.UBJsonReader r1 = new com.badlogic.gdx.utils.UBJsonReader
            r1.<init>()
            r6.<init>(r1, r5)
            java.lang.String r1 = ".g3db"
            r4.setLoader(r0, r1, r6)
            com.badlogic.gdx.graphics.g3d.loader.ObjLoader r6 = new com.badlogic.gdx.graphics.g3d.loader.ObjLoader
            r6.<init>(r5)
            java.lang.String r1 = ".obj"
            r4.setLoader(r0, r1, r6)
            java.lang.Class<com.badlogic.gdx.graphics.glutils.ShaderProgram> r6 = com.badlogic.gdx.graphics.glutils.ShaderProgram.class
            com.badlogic.gdx.assets.loaders.ShaderProgramLoader r0 = new com.badlogic.gdx.assets.loaders.ShaderProgramLoader
            r0.<init>(r5)
            r4.setLoader(r6, r0)
            java.lang.Class<com.badlogic.gdx.graphics.Cubemap> r6 = com.badlogic.gdx.graphics.Cubemap.class
            com.badlogic.gdx.assets.loaders.CubemapLoader r0 = new com.badlogic.gdx.assets.loaders.CubemapLoader
            r0.<init>(r5)
            r4.setLoader(r6, r0)
        Lee:
            com.badlogic.gdx.utils.async.AsyncExecutor r5 = new com.badlogic.gdx.utils.async.AsyncExecutor
            r6 = 1
            r5.<init>(r6, r2)
            r4.executor = r5
            return
    }

    private void addTask(com.badlogic.gdx.assets.AssetDescriptor r5) {
            r4 = this;
            java.lang.Class<T> r0 = r5.type
            java.lang.String r1 = r5.fileName
            com.badlogic.gdx.assets.loaders.AssetLoader r0 = r4.getLoader(r0, r1)
            if (r0 == 0) goto L1d
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetLoadingTask> r1 = r4.tasks
            com.badlogic.gdx.assets.AssetLoadingTask r2 = new com.badlogic.gdx.assets.AssetLoadingTask
            com.badlogic.gdx.utils.async.AsyncExecutor r3 = r4.executor
            r2.<init>(r4, r5, r0, r3)
            r1.add(r2)
            int r5 = r4.peakTasks
            int r5 = r5 + 1
            r4.peakTasks = r5
            return
        L1d:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No loader for type: "
            r1.append(r2)
            java.lang.Class<T> r5 = r5.type
            java.lang.String r5 = com.badlogic.gdx.utils.reflect.ClassReflection.getSimpleName(r5)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    private void handleTaskError(java.lang.Throwable r4) {
            r3 = this;
            com.badlogic.gdx.utils.Logger r0 = r3.log
            java.lang.String r1 = "Error loading asset."
            r0.error(r1, r4)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetLoadingTask> r0 = r3.tasks
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4c
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetLoadingTask> r0 = r3.tasks
            java.lang.Object r0 = r0.pop()
            com.badlogic.gdx.assets.AssetLoadingTask r0 = (com.badlogic.gdx.assets.AssetLoadingTask) r0
            com.badlogic.gdx.assets.AssetDescriptor r1 = r0.assetDesc
            boolean r2 = r0.dependenciesLoaded
            if (r2 == 0) goto L39
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r2 = r0.dependencies
            if (r2 == 0) goto L39
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r0 = r0.dependencies
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
        L27:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()
            com.badlogic.gdx.assets.AssetDescriptor r2 = (com.badlogic.gdx.assets.AssetDescriptor) r2
            java.lang.String r2 = r2.fileName
            r3.unload(r2)
            goto L27
        L39:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetLoadingTask> r0 = r3.tasks
            r0.clear()
            com.badlogic.gdx.assets.AssetErrorListener r0 = r3.listener
            if (r0 == 0) goto L46
            r0.error(r1, r4)
            return
        L46:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            r0.<init>(r4)
            throw r0
        L4c:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            r0.<init>(r4)
            throw r0
    }

    private void incrementRefCountedDependencies(java.lang.String r4) {
            r3 = this;
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.utils.Array<java.lang.String>> r0 = r3.assetDependencies
            java.lang.Object r4 = r0.get(r4)
            com.badlogic.gdx.utils.Array r4 = (com.badlogic.gdx.utils.Array) r4
            if (r4 != 0) goto Lb
            return
        Lb:
            com.badlogic.gdx.utils.Array$ArrayIterator r4 = r4.iterator()
        Lf:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r1 = r3.assetTypes
            java.lang.Object r1 = r1.get(r0)
            java.lang.Class r1 = (java.lang.Class) r1
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.AssetManager$RefCountedContainer>> r2 = r3.assets
            java.lang.Object r1 = r2.get(r1)
            com.badlogic.gdx.utils.ObjectMap r1 = (com.badlogic.gdx.utils.ObjectMap) r1
            java.lang.Object r1 = r1.get(r0)
            com.badlogic.gdx.assets.AssetManager$RefCountedContainer r1 = (com.badlogic.gdx.assets.AssetManager.RefCountedContainer) r1
            int r2 = r1.refCount
            int r2 = r2 + 1
            r1.refCount = r2
            r3.incrementRefCountedDependencies(r0)
            goto Lf
        L3b:
            return
    }

    private synchronized void injectDependency(java.lang.String r3, com.badlogic.gdx.assets.AssetDescriptor r4) {
            r2 = this;
            monitor-enter(r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.utils.Array<java.lang.String>> r0 = r2.assetDependencies     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L79
            com.badlogic.gdx.utils.Array r0 = (com.badlogic.gdx.utils.Array) r0     // Catch: java.lang.Throwable -> L79
            if (r0 != 0) goto L15
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array     // Catch: java.lang.Throwable -> L79
            r0.<init>()     // Catch: java.lang.Throwable -> L79
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.utils.Array<java.lang.String>> r1 = r2.assetDependencies     // Catch: java.lang.Throwable -> L79
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L79
        L15:
            java.lang.String r3 = r4.fileName     // Catch: java.lang.Throwable -> L79
            r0.add(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r4.fileName     // Catch: java.lang.Throwable -> L79
            boolean r3 = r2.isLoaded(r3)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L5e
            com.badlogic.gdx.utils.Logger r3 = r2.log     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r0.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = "Dependency already loaded: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L79
            r0.append(r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L79
            r3.debug(r0)     // Catch: java.lang.Throwable -> L79
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r3 = r2.assetTypes     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r4.fileName     // Catch: java.lang.Throwable -> L79
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L79
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.AssetManager$RefCountedContainer>> r0 = r2.assets     // Catch: java.lang.Throwable -> L79
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L79
            com.badlogic.gdx.utils.ObjectMap r3 = (com.badlogic.gdx.utils.ObjectMap) r3     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r4.fileName     // Catch: java.lang.Throwable -> L79
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L79
            com.badlogic.gdx.assets.AssetManager$RefCountedContainer r3 = (com.badlogic.gdx.assets.AssetManager.RefCountedContainer) r3     // Catch: java.lang.Throwable -> L79
            int r0 = r3.refCount     // Catch: java.lang.Throwable -> L79
            int r0 = r0 + 1
            r3.refCount = r0     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r4.fileName     // Catch: java.lang.Throwable -> L79
            r2.incrementRefCountedDependencies(r3)     // Catch: java.lang.Throwable -> L79
            goto L77
        L5e:
            com.badlogic.gdx.utils.Logger r3 = r2.log     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r0.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = "Loading dependency: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L79
            r0.append(r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L79
            r3.info(r0)     // Catch: java.lang.Throwable -> L79
            r2.addTask(r4)     // Catch: java.lang.Throwable -> L79
        L77:
            monitor-exit(r2)
            return
        L79:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    private void nextTask() {
            r4 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r0 = r4.loadQueue
            r1 = 0
            java.lang.Object r0 = r0.removeIndex(r1)
            com.badlogic.gdx.assets.AssetDescriptor r0 = (com.badlogic.gdx.assets.AssetDescriptor) r0
            java.lang.String r1 = r0.fileName
            boolean r1 = r4.isLoaded(r1)
            if (r1 == 0) goto L62
            com.badlogic.gdx.utils.Logger r1 = r4.log
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Already loaded: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.debug(r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r1 = r4.assetTypes
            java.lang.String r2 = r0.fileName
            java.lang.Object r1 = r1.get(r2)
            java.lang.Class r1 = (java.lang.Class) r1
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.AssetManager$RefCountedContainer>> r2 = r4.assets
            java.lang.Object r1 = r2.get(r1)
            com.badlogic.gdx.utils.ObjectMap r1 = (com.badlogic.gdx.utils.ObjectMap) r1
            java.lang.String r2 = r0.fileName
            java.lang.Object r1 = r1.get(r2)
            com.badlogic.gdx.assets.AssetManager$RefCountedContainer r1 = (com.badlogic.gdx.assets.AssetManager.RefCountedContainer) r1
            int r2 = r1.refCount
            int r2 = r2 + 1
            r1.refCount = r2
            java.lang.String r1 = r0.fileName
            r4.incrementRefCountedDependencies(r1)
            com.badlogic.gdx.assets.AssetLoaderParameters r1 = r0.params
            if (r1 == 0) goto L5b
            com.badlogic.gdx.assets.AssetLoaderParameters$LoadedCallback r1 = r1.loadedCallback
            if (r1 == 0) goto L5b
            java.lang.String r2 = r0.fileName
            java.lang.Class<T> r0 = r0.type
            r1.finishedLoading(r4, r2, r0)
        L5b:
            int r0 = r4.loaded
            int r0 = r0 + 1
            r4.loaded = r0
            goto L7b
        L62:
            com.badlogic.gdx.utils.Logger r1 = r4.log
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Loading: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.info(r2)
            r4.addTask(r0)
        L7b:
            return
    }

    private boolean updateTask() {
            r8 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetLoadingTask> r0 = r8.tasks
            java.lang.Object r0 = r0.peek()
            com.badlogic.gdx.assets.AssetLoadingTask r0 = (com.badlogic.gdx.assets.AssetLoadingTask) r0
            r1 = 0
            r2 = 1
            boolean r3 = r0.cancel     // Catch: java.lang.RuntimeException -> L17
            if (r3 != 0) goto L1f
            boolean r3 = r0.update()     // Catch: java.lang.RuntimeException -> L17
            if (r3 == 0) goto L15
            goto L1f
        L15:
            r3 = 0
            goto L20
        L17:
            r3 = move-exception
            r0.cancel = r2
            com.badlogic.gdx.assets.AssetDescriptor r4 = r0.assetDesc
            r8.taskFailed(r4, r3)
        L1f:
            r3 = 1
        L20:
            if (r3 == 0) goto L80
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetLoadingTask> r3 = r8.tasks
            int r4 = r3.size
            if (r4 != r2) goto L2f
            int r4 = r8.loaded
            int r4 = r4 + r2
            r8.loaded = r4
            r8.peakTasks = r1
        L2f:
            r3.pop()
            boolean r1 = r0.cancel
            if (r1 == 0) goto L37
            return r2
        L37:
            com.badlogic.gdx.assets.AssetDescriptor r1 = r0.assetDesc
            java.lang.String r3 = r1.fileName
            java.lang.Class<T> r1 = r1.type
            java.lang.Object r4 = r0.asset
            r8.addAsset(r3, r1, r4)
            com.badlogic.gdx.assets.AssetDescriptor r1 = r0.assetDesc
            com.badlogic.gdx.assets.AssetLoaderParameters r3 = r1.params
            if (r3 == 0) goto L53
            com.badlogic.gdx.assets.AssetLoaderParameters$LoadedCallback r3 = r3.loadedCallback
            if (r3 == 0) goto L53
            java.lang.String r4 = r1.fileName
            java.lang.Class<T> r1 = r1.type
            r3.finishedLoading(r8, r4, r1)
        L53:
            long r3 = com.badlogic.gdx.utils.TimeUtils.nanoTime()
            com.badlogic.gdx.utils.Logger r1 = r8.log
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Loaded: "
            r5.append(r6)
            long r6 = r0.startTime
            long r3 = r3 - r6
            float r3 = (float) r3
            r4 = 1232348160(0x49742400, float:1000000.0)
            float r3 = r3 / r4
            r5.append(r3)
            java.lang.String r3 = "ms "
            r5.append(r3)
            com.badlogic.gdx.assets.AssetDescriptor r0 = r0.assetDesc
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r1.debug(r0)
            return r2
        L80:
            return r1
    }

    protected <T> void addAsset(java.lang.String r3, java.lang.Class<T> r4, T r5) {
            r2 = this;
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r0 = r2.assetTypes
            r0.put(r3, r4)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.AssetManager$RefCountedContainer>> r0 = r2.assets
            java.lang.Object r0 = r0.get(r4)
            com.badlogic.gdx.utils.ObjectMap r0 = (com.badlogic.gdx.utils.ObjectMap) r0
            if (r0 != 0) goto L19
            com.badlogic.gdx.utils.ObjectMap r0 = new com.badlogic.gdx.utils.ObjectMap
            r0.<init>()
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.AssetManager$RefCountedContainer>> r1 = r2.assets
            r1.put(r4, r0)
        L19:
            com.badlogic.gdx.assets.AssetManager$RefCountedContainer r4 = new com.badlogic.gdx.assets.AssetManager$RefCountedContainer
            r4.<init>()
            r4.object = r5
            r0.put(r3, r4)
            return
    }

    public void clear() {
            r7 = this;
            monitor-enter(r7)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r0 = r7.loadQueue     // Catch: java.lang.Throwable -> L94
            r0.clear()     // Catch: java.lang.Throwable -> L94
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L94
            r7.finishLoading()
            monitor-enter(r7)
            com.badlogic.gdx.utils.ObjectIntMap r0 = new com.badlogic.gdx.utils.ObjectIntMap     // Catch: java.lang.Throwable -> L91
            r0.<init>()     // Catch: java.lang.Throwable -> L91
        L10:
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r1 = r7.assetTypes     // Catch: java.lang.Throwable -> L91
            int r1 = r1.size     // Catch: java.lang.Throwable -> L91
            r2 = 51
            r3 = 0
            if (r1 <= 0) goto L70
            r0.clear(r2)     // Catch: java.lang.Throwable -> L91
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r1 = r7.assetTypes     // Catch: java.lang.Throwable -> L91
            com.badlogic.gdx.utils.ObjectMap$Keys r1 = r1.keys()     // Catch: java.lang.Throwable -> L91
            com.badlogic.gdx.utils.Array r1 = r1.toArray()     // Catch: java.lang.Throwable -> L91
            com.badlogic.gdx.utils.Array$ArrayIterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L91
        L2a:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L91
            if (r4 == 0) goto L56
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L91
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.utils.Array<java.lang.String>> r5 = r7.assetDependencies     // Catch: java.lang.Throwable -> L91
            java.lang.Object r4 = r5.get(r4)     // Catch: java.lang.Throwable -> L91
            com.badlogic.gdx.utils.Array r4 = (com.badlogic.gdx.utils.Array) r4     // Catch: java.lang.Throwable -> L91
            if (r4 != 0) goto L41
            goto L2a
        L41:
            com.badlogic.gdx.utils.Array$ArrayIterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L91
        L45:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L91
            if (r5 == 0) goto L2a
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L91
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L91
            r6 = 1
            r0.getAndIncrement(r5, r3, r6)     // Catch: java.lang.Throwable -> L91
            goto L45
        L56:
            com.badlogic.gdx.utils.Array$ArrayIterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L91
        L5a:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L91
            if (r2 == 0) goto L10
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L91
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L91
            int r4 = r0.get(r2, r3)     // Catch: java.lang.Throwable -> L91
            if (r4 != 0) goto L5a
            r7.unload(r2)     // Catch: java.lang.Throwable -> L91
            goto L5a
        L70:
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.AssetManager$RefCountedContainer>> r0 = r7.assets     // Catch: java.lang.Throwable -> L91
            r0.clear(r2)     // Catch: java.lang.Throwable -> L91
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r0 = r7.assetTypes     // Catch: java.lang.Throwable -> L91
            r0.clear(r2)     // Catch: java.lang.Throwable -> L91
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.utils.Array<java.lang.String>> r0 = r7.assetDependencies     // Catch: java.lang.Throwable -> L91
            r0.clear(r2)     // Catch: java.lang.Throwable -> L91
            r7.loaded = r3     // Catch: java.lang.Throwable -> L91
            r7.toLoad = r3     // Catch: java.lang.Throwable -> L91
            r7.peakTasks = r3     // Catch: java.lang.Throwable -> L91
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r0 = r7.loadQueue     // Catch: java.lang.Throwable -> L91
            r0.clear()     // Catch: java.lang.Throwable -> L91
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetLoadingTask> r0 = r7.tasks     // Catch: java.lang.Throwable -> L91
            r0.clear()     // Catch: java.lang.Throwable -> L91
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L91
            return
        L91:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L91
            throw r0
        L94:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L94
            throw r0
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            com.badlogic.gdx.utils.Logger r0 = r2.log
            java.lang.String r1 = "Disposing."
            r0.debug(r1)
            r2.clear()
            com.badlogic.gdx.utils.async.AsyncExecutor r0 = r2.executor
            r0.dispose()
            return
    }

    public void finishLoading() {
            r2 = this;
            com.badlogic.gdx.utils.Logger r0 = r2.log
            java.lang.String r1 = "Waiting for loading to complete..."
            r0.debug(r1)
        L7:
            boolean r0 = r2.update()
            if (r0 != 0) goto L11
            com.badlogic.gdx.utils.async.ThreadUtils.yield()
            goto L7
        L11:
            com.badlogic.gdx.utils.Logger r0 = r2.log
            java.lang.String r1 = "Loading complete."
            r0.debug(r1)
            return
    }

    public synchronized <T> T get(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            java.lang.Object r2 = r1.get(r2, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r2
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized <T> T get(java.lang.String r2, java.lang.Class<T> r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            java.lang.Object r2 = r1.get(r2, r3, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r2
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized <T> T get(java.lang.String r2, java.lang.Class<T> r3, boolean r4) {
            r1 = this;
            monitor-enter(r1)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.AssetManager$RefCountedContainer>> r0 = r1.assets     // Catch: java.lang.Throwable -> L33
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L33
            com.badlogic.gdx.utils.ObjectMap r3 = (com.badlogic.gdx.utils.ObjectMap) r3     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L17
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L33
            com.badlogic.gdx.assets.AssetManager$RefCountedContainer r3 = (com.badlogic.gdx.assets.AssetManager.RefCountedContainer) r3     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L17
            java.lang.Object r2 = r3.object     // Catch: java.lang.Throwable -> L33
            monitor-exit(r1)
            return r2
        L17:
            if (r4 != 0) goto L1c
            r2 = 0
            monitor-exit(r1)
            return r2
        L1c:
            com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r4.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = "Asset not loaded: "
            r4.append(r0)     // Catch: java.lang.Throwable -> L33
            r4.append(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L33
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L33
        L33:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized <T> T get(java.lang.String r3, boolean r4) {
            r2 = this;
            monitor-enter(r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r0 = r2.assetTypes     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L3d
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L21
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.AssetManager$RefCountedContainer>> r1 = r2.assets     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L3d
            com.badlogic.gdx.utils.ObjectMap r0 = (com.badlogic.gdx.utils.ObjectMap) r0     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L3d
            com.badlogic.gdx.assets.AssetManager$RefCountedContainer r0 = (com.badlogic.gdx.assets.AssetManager.RefCountedContainer) r0     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L21
            java.lang.Object r3 = r0.object     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r2)
            return r3
        L21:
            if (r4 != 0) goto L26
            r3 = 0
            monitor-exit(r2)
            return r3
        L26:
            com.badlogic.gdx.utils.GdxRuntimeException r4 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L3d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r0.<init>()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = "Asset not loaded: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L3d
            r0.append(r3)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L3d
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L3d
            throw r4     // Catch: java.lang.Throwable -> L3d
        L3d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public synchronized <T> java.lang.String getAssetFileName(T r5) {
            r4 = this;
            monitor-enter(r4)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.AssetManager$RefCountedContainer>> r0 = r4.assets     // Catch: java.lang.Throwable -> L46
            com.badlogic.gdx.utils.ObjectMap$Keys r0 = r0.keys()     // Catch: java.lang.Throwable -> L46
            com.badlogic.gdx.utils.ObjectMap$Keys r0 = r0.iterator()     // Catch: java.lang.Throwable -> L46
        Lb:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L46
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L46
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.AssetManager$RefCountedContainer>> r2 = r4.assets     // Catch: java.lang.Throwable -> L46
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L46
            com.badlogic.gdx.utils.ObjectMap r1 = (com.badlogic.gdx.utils.ObjectMap) r1     // Catch: java.lang.Throwable -> L46
            com.badlogic.gdx.utils.ObjectMap$Entries r1 = r1.iterator()     // Catch: java.lang.Throwable -> L46
        L23:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto Lb
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L46
            com.badlogic.gdx.utils.ObjectMap$Entry r2 = (com.badlogic.gdx.utils.ObjectMap.Entry) r2     // Catch: java.lang.Throwable -> L46
            V r3 = r2.value     // Catch: java.lang.Throwable -> L46
            com.badlogic.gdx.assets.AssetManager$RefCountedContainer r3 = (com.badlogic.gdx.assets.AssetManager.RefCountedContainer) r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r3 = r3.object     // Catch: java.lang.Throwable -> L46
            if (r3 == r5) goto L3d
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L23
        L3d:
            K r5 = r2.key     // Catch: java.lang.Throwable -> L46
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L46
            monitor-exit(r4)
            return r5
        L43:
            r5 = 0
            monitor-exit(r4)
            return r5
        L46:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public synchronized com.badlogic.gdx.utils.Array<java.lang.String> getDependencies(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.utils.Array<java.lang.String>> r0 = r1.assetDependencies     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lb
            com.badlogic.gdx.utils.Array r2 = (com.badlogic.gdx.utils.Array) r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r2
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public <T> com.badlogic.gdx.assets.loaders.AssetLoader getLoader(java.lang.Class<T> r5, java.lang.String r6) {
            r4 = this;
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.loaders.AssetLoader>> r0 = r4.loaders
            java.lang.Object r5 = r0.get(r5)
            com.badlogic.gdx.utils.ObjectMap r5 = (com.badlogic.gdx.utils.ObjectMap) r5
            r0 = 0
            if (r5 == 0) goto L52
            int r1 = r5.size
            r2 = 1
            if (r1 >= r2) goto L11
            goto L52
        L11:
            if (r6 != 0) goto L1c
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.get(r6)
            com.badlogic.gdx.assets.loaders.AssetLoader r5 = (com.badlogic.gdx.assets.loaders.AssetLoader) r5
            return r5
        L1c:
            r1 = -1
            com.badlogic.gdx.utils.ObjectMap$Entries r5 = r5.entries()
            com.badlogic.gdx.utils.ObjectMap$Entries r5 = r5.iterator()
        L25:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L52
            java.lang.Object r2 = r5.next()
            com.badlogic.gdx.utils.ObjectMap$Entry r2 = (com.badlogic.gdx.utils.ObjectMap.Entry) r2
            K r3 = r2.key
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 <= r1) goto L25
            K r3 = r2.key
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r6.endsWith(r3)
            if (r3 == 0) goto L25
            V r0 = r2.value
            com.badlogic.gdx.assets.loaders.AssetLoader r0 = (com.badlogic.gdx.assets.loaders.AssetLoader) r0
            K r1 = r2.key
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            goto L25
        L52:
            return r0
    }

    public com.badlogic.gdx.utils.Logger getLogger() {
            r1 = this;
            com.badlogic.gdx.utils.Logger r0 = r1.log
            return r0
    }

    public synchronized float getProgress() {
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.toLoad     // Catch: java.lang.Throwable -> L22
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L9
            monitor-exit(r5)
            return r1
        L9:
            int r2 = r5.loaded     // Catch: java.lang.Throwable -> L22
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L22
            int r3 = r5.peakTasks     // Catch: java.lang.Throwable -> L22
            if (r3 <= 0) goto L1a
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetLoadingTask> r4 = r5.tasks     // Catch: java.lang.Throwable -> L22
            int r4 = r4.size     // Catch: java.lang.Throwable -> L22
            int r4 = r3 - r4
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L22
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L22
            float r4 = r4 / r3
            float r2 = r2 + r4
        L1a:
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L22
            float r2 = r2 / r0
            float r0 = java.lang.Math.min(r1, r2)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r5)
            return r0
        L22:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    public synchronized int getReferenceCount(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r0 = r3.assetTypes     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L1d
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.AssetManager$RefCountedContainer>> r1 = r3.assets     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L34
            com.badlogic.gdx.utils.ObjectMap r0 = (com.badlogic.gdx.utils.ObjectMap) r0     // Catch: java.lang.Throwable -> L34
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L34
            com.badlogic.gdx.assets.AssetManager$RefCountedContainer r4 = (com.badlogic.gdx.assets.AssetManager.RefCountedContainer) r4     // Catch: java.lang.Throwable -> L34
            int r4 = r4.refCount     // Catch: java.lang.Throwable -> L34
            monitor-exit(r3)
            return r4
        L1d:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r1.<init>()     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "Asset not loaded: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L34
            r1.append(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L34
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L34
            throw r0     // Catch: java.lang.Throwable -> L34
        L34:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    synchronized void injectDependencies(java.lang.String r4, com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r5) {
            r3 = this;
            monitor-enter(r3)
            com.badlogic.gdx.utils.ObjectSet<java.lang.String> r0 = r3.injected     // Catch: java.lang.Throwable -> L2c
            com.badlogic.gdx.utils.Array$ArrayIterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L2c
        L7:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L25
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L2c
            com.badlogic.gdx.assets.AssetDescriptor r1 = (com.badlogic.gdx.assets.AssetDescriptor) r1     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = r1.fileName     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L1c
            goto L7
        L1c:
            java.lang.String r2 = r1.fileName     // Catch: java.lang.Throwable -> L2c
            r0.add(r2)     // Catch: java.lang.Throwable -> L2c
            r3.injectDependency(r4, r1)     // Catch: java.lang.Throwable -> L2c
            goto L7
        L25:
            r4 = 32
            r0.clear(r4)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)
            return
        L2c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public synchronized boolean isLoaded(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            if (r2 != 0) goto L6
            r2 = 0
            monitor-exit(r1)
            return r2
        L6:
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r0 = r1.assetTypes     // Catch: java.lang.Throwable -> Le
            boolean r2 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r2
        Le:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized boolean isLoaded(java.lang.String r2, java.lang.Class r3) {
            r1 = this;
            monitor-enter(r1)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.AssetManager$RefCountedContainer>> r0 = r1.assets     // Catch: java.lang.Throwable -> L17
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L17
            com.badlogic.gdx.utils.ObjectMap r3 = (com.badlogic.gdx.utils.ObjectMap) r3     // Catch: java.lang.Throwable -> L17
            r0 = 0
            if (r3 != 0) goto Le
            monitor-exit(r1)
            return r0
        Le:
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L15
            r0 = 1
        L15:
            monitor-exit(r1)
            return r0
        L17:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized <T> void load(java.lang.String r2, java.lang.Class<T> r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.load(r2, r3, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized <T> void load(java.lang.String r5, java.lang.Class<T> r6, com.badlogic.gdx.assets.AssetLoaderParameters<T> r7) {
            r4 = this;
            monitor-enter(r4)
            com.badlogic.gdx.assets.loaders.AssetLoader r0 = r4.getLoader(r6, r5)     // Catch: java.lang.Throwable -> L14b
            if (r0 == 0) goto L130
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r0 = r4.loadQueue     // Catch: java.lang.Throwable -> L14b
            int r0 = r0.size     // Catch: java.lang.Throwable -> L14b
            r1 = 0
            if (r0 != 0) goto L14
            r4.loaded = r1     // Catch: java.lang.Throwable -> L14b
            r4.toLoad = r1     // Catch: java.lang.Throwable -> L14b
            r4.peakTasks = r1     // Catch: java.lang.Throwable -> L14b
        L14:
            r0 = 0
        L15:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r2 = r4.loadQueue     // Catch: java.lang.Throwable -> L14b
            int r3 = r2.size     // Catch: java.lang.Throwable -> L14b
            if (r0 >= r3) goto L6b
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L14b
            com.badlogic.gdx.assets.AssetDescriptor r2 = (com.badlogic.gdx.assets.AssetDescriptor) r2     // Catch: java.lang.Throwable -> L14b
            java.lang.String r3 = r2.fileName     // Catch: java.lang.Throwable -> L14b
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L14b
            if (r3 == 0) goto L68
            java.lang.Class<T> r3 = r2.type     // Catch: java.lang.Throwable -> L14b
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Throwable -> L14b
            if (r3 == 0) goto L32
            goto L68
        L32:
            com.badlogic.gdx.utils.GdxRuntimeException r7 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L14b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14b
            r0.<init>()     // Catch: java.lang.Throwable -> L14b
            java.lang.String r1 = "Asset with name '"
            r0.append(r1)     // Catch: java.lang.Throwable -> L14b
            r0.append(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = "' already in preload queue, but has different type (expected: "
            r0.append(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = com.badlogic.gdx.utils.reflect.ClassReflection.getSimpleName(r6)     // Catch: java.lang.Throwable -> L14b
            r0.append(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = ", found: "
            r0.append(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.Class<T> r5 = r2.type     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = com.badlogic.gdx.utils.reflect.ClassReflection.getSimpleName(r5)     // Catch: java.lang.Throwable -> L14b
            r0.append(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = ")"
            r0.append(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L14b
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L14b
            throw r7     // Catch: java.lang.Throwable -> L14b
        L68:
            int r0 = r0 + 1
            goto L15
        L6b:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetLoadingTask> r0 = r4.tasks     // Catch: java.lang.Throwable -> L14b
            int r2 = r0.size     // Catch: java.lang.Throwable -> L14b
            if (r1 >= r2) goto Lc3
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L14b
            com.badlogic.gdx.assets.AssetLoadingTask r0 = (com.badlogic.gdx.assets.AssetLoadingTask) r0     // Catch: java.lang.Throwable -> L14b
            com.badlogic.gdx.assets.AssetDescriptor r0 = r0.assetDesc     // Catch: java.lang.Throwable -> L14b
            java.lang.String r2 = r0.fileName     // Catch: java.lang.Throwable -> L14b
            boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L14b
            if (r2 == 0) goto Lc0
            java.lang.Class<T> r2 = r0.type     // Catch: java.lang.Throwable -> L14b
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Throwable -> L14b
            if (r2 == 0) goto L8a
            goto Lc0
        L8a:
            com.badlogic.gdx.utils.GdxRuntimeException r7 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L14b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14b
            r1.<init>()     // Catch: java.lang.Throwable -> L14b
            java.lang.String r2 = "Asset with name '"
            r1.append(r2)     // Catch: java.lang.Throwable -> L14b
            r1.append(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = "' already in task list, but has different type (expected: "
            r1.append(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = com.badlogic.gdx.utils.reflect.ClassReflection.getSimpleName(r6)     // Catch: java.lang.Throwable -> L14b
            r1.append(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = ", found: "
            r1.append(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.Class<T> r5 = r0.type     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = com.badlogic.gdx.utils.reflect.ClassReflection.getSimpleName(r5)     // Catch: java.lang.Throwable -> L14b
            r1.append(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = ")"
            r1.append(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L14b
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L14b
            throw r7     // Catch: java.lang.Throwable -> L14b
        Lc0:
            int r1 = r1 + 1
            goto L6b
        Lc3:
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r0 = r4.assetTypes     // Catch: java.lang.Throwable -> L14b
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L14b
            if (r0 == 0) goto L108
            boolean r1 = r0.equals(r6)     // Catch: java.lang.Throwable -> L14b
            if (r1 == 0) goto Ld4
            goto L108
        Ld4:
            com.badlogic.gdx.utils.GdxRuntimeException r7 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L14b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14b
            r1.<init>()     // Catch: java.lang.Throwable -> L14b
            java.lang.String r2 = "Asset with name '"
            r1.append(r2)     // Catch: java.lang.Throwable -> L14b
            r1.append(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = "' already loaded, but has different type (expected: "
            r1.append(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = com.badlogic.gdx.utils.reflect.ClassReflection.getSimpleName(r6)     // Catch: java.lang.Throwable -> L14b
            r1.append(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = ", found: "
            r1.append(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = com.badlogic.gdx.utils.reflect.ClassReflection.getSimpleName(r0)     // Catch: java.lang.Throwable -> L14b
            r1.append(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = ")"
            r1.append(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L14b
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L14b
            throw r7     // Catch: java.lang.Throwable -> L14b
        L108:
            int r0 = r4.toLoad     // Catch: java.lang.Throwable -> L14b
            int r0 = r0 + 1
            r4.toLoad = r0     // Catch: java.lang.Throwable -> L14b
            com.badlogic.gdx.assets.AssetDescriptor r0 = new com.badlogic.gdx.assets.AssetDescriptor     // Catch: java.lang.Throwable -> L14b
            r0.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L14b
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r5 = r4.loadQueue     // Catch: java.lang.Throwable -> L14b
            r5.add(r0)     // Catch: java.lang.Throwable -> L14b
            com.badlogic.gdx.utils.Logger r5 = r4.log     // Catch: java.lang.Throwable -> L14b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14b
            r6.<init>()     // Catch: java.lang.Throwable -> L14b
            java.lang.String r7 = "Queued: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L14b
            r6.append(r0)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L14b
            r5.debug(r6)     // Catch: java.lang.Throwable -> L14b
            monitor-exit(r4)
            return
        L130:
            com.badlogic.gdx.utils.GdxRuntimeException r5 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L14b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14b
            r7.<init>()     // Catch: java.lang.Throwable -> L14b
            java.lang.String r0 = "No loader for type: "
            r7.append(r0)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r6 = com.badlogic.gdx.utils.reflect.ClassReflection.getSimpleName(r6)     // Catch: java.lang.Throwable -> L14b
            r7.append(r6)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L14b
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L14b
            throw r5     // Catch: java.lang.Throwable -> L14b
        L14b:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public synchronized void setErrorListener(com.badlogic.gdx.assets.AssetErrorListener r1) {
            r0 = this;
            monitor-enter(r0)
            r0.listener = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public synchronized <T, P extends com.badlogic.gdx.assets.AssetLoaderParameters<T>> void setLoader(java.lang.Class<T> r2, com.badlogic.gdx.assets.loaders.AssetLoader<T, P> r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.setLoader(r2, r0, r3)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized <T, P extends com.badlogic.gdx.assets.AssetLoaderParameters<T>> void setLoader(java.lang.Class<T> r4, java.lang.String r5, com.badlogic.gdx.assets.loaders.AssetLoader<T, P> r6) {
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L55
            if (r6 == 0) goto L4d
            com.badlogic.gdx.utils.Logger r0 = r3.log     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r1.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "Loader set: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = com.badlogic.gdx.utils.reflect.ClassReflection.getSimpleName(r4)     // Catch: java.lang.Throwable -> L5d
            r1.append(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = " -> "
            r1.append(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = com.badlogic.gdx.utils.reflect.ClassReflection.getSimpleName(r2)     // Catch: java.lang.Throwable -> L5d
            r1.append(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5d
            r0.debug(r1)     // Catch: java.lang.Throwable -> L5d
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.loaders.AssetLoader>> r0 = r3.loaders     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L5d
            com.badlogic.gdx.utils.ObjectMap r0 = (com.badlogic.gdx.utils.ObjectMap) r0     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L44
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.loaders.AssetLoader>> r0 = r3.loaders     // Catch: java.lang.Throwable -> L5d
            com.badlogic.gdx.utils.ObjectMap r1 = new com.badlogic.gdx.utils.ObjectMap     // Catch: java.lang.Throwable -> L5d
            r1.<init>()     // Catch: java.lang.Throwable -> L5d
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L5d
            r0 = r1
        L44:
            if (r5 != 0) goto L48
            java.lang.String r5 = ""
        L48:
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r3)
            return
        L4d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = "loader cannot be null."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L5d
            throw r4     // Catch: java.lang.Throwable -> L5d
        L55:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = "type cannot be null."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L5d
            throw r4     // Catch: java.lang.Throwable -> L5d
        L5d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public synchronized void setReferenceCount(java.lang.String r3, int r4) {
            r2 = this;
            monitor-enter(r2)
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r0 = r2.assetTypes     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L34
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L1d
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.AssetManager$RefCountedContainer>> r1 = r2.assets     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L34
            com.badlogic.gdx.utils.ObjectMap r0 = (com.badlogic.gdx.utils.ObjectMap) r0     // Catch: java.lang.Throwable -> L34
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L34
            com.badlogic.gdx.assets.AssetManager$RefCountedContainer r3 = (com.badlogic.gdx.assets.AssetManager.RefCountedContainer) r3     // Catch: java.lang.Throwable -> L34
            r3.refCount = r4     // Catch: java.lang.Throwable -> L34
            monitor-exit(r2)
            return
        L1d:
            com.badlogic.gdx.utils.GdxRuntimeException r4 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r0.<init>()     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "Asset not loaded: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L34
            r0.append(r3)     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L34
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L34:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    protected void taskFailed(com.badlogic.gdx.assets.AssetDescriptor r1, java.lang.RuntimeException r2) {
            r0 = this;
            throw r2
    }

    public synchronized void unload(java.lang.String r7) {
            r6 = this;
            monitor-enter(r6)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetLoadingTask> r0 = r6.tasks     // Catch: java.lang.Throwable -> L135
            int r1 = r0.size     // Catch: java.lang.Throwable -> L135
            r2 = 1
            if (r1 <= 0) goto L35
            java.lang.Object r0 = r0.first()     // Catch: java.lang.Throwable -> L135
            com.badlogic.gdx.assets.AssetLoadingTask r0 = (com.badlogic.gdx.assets.AssetLoadingTask) r0     // Catch: java.lang.Throwable -> L135
            com.badlogic.gdx.assets.AssetDescriptor r1 = r0.assetDesc     // Catch: java.lang.Throwable -> L135
            java.lang.String r1 = r1.fileName     // Catch: java.lang.Throwable -> L135
            boolean r1 = r1.equals(r7)     // Catch: java.lang.Throwable -> L135
            if (r1 == 0) goto L35
            com.badlogic.gdx.utils.Logger r1 = r6.log     // Catch: java.lang.Throwable -> L135
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L135
            r3.<init>()     // Catch: java.lang.Throwable -> L135
            java.lang.String r4 = "Unload (from tasks): "
            r3.append(r4)     // Catch: java.lang.Throwable -> L135
            r3.append(r7)     // Catch: java.lang.Throwable -> L135
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L135
            r1.info(r7)     // Catch: java.lang.Throwable -> L135
            r0.cancel = r2     // Catch: java.lang.Throwable -> L135
            r0.unload()     // Catch: java.lang.Throwable -> L135
            monitor-exit(r6)
            return
        L35:
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r0 = r6.assetTypes     // Catch: java.lang.Throwable -> L135
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L135
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L135
            r1 = 0
        L3e:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r3 = r6.loadQueue     // Catch: java.lang.Throwable -> L135
            int r4 = r3.size     // Catch: java.lang.Throwable -> L135
            r5 = -1
            if (r1 >= r4) goto L57
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L135
            com.badlogic.gdx.assets.AssetDescriptor r3 = (com.badlogic.gdx.assets.AssetDescriptor) r3     // Catch: java.lang.Throwable -> L135
            java.lang.String r3 = r3.fileName     // Catch: java.lang.Throwable -> L135
            boolean r3 = r3.equals(r7)     // Catch: java.lang.Throwable -> L135
            if (r3 == 0) goto L54
            goto L58
        L54:
            int r1 = r1 + 1
            goto L3e
        L57:
            r1 = -1
        L58:
            if (r1 == r5) goto L90
            int r3 = r6.toLoad     // Catch: java.lang.Throwable -> L135
            int r3 = r3 - r2
            r6.toLoad = r3     // Catch: java.lang.Throwable -> L135
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r2 = r6.loadQueue     // Catch: java.lang.Throwable -> L135
            java.lang.Object r1 = r2.removeIndex(r1)     // Catch: java.lang.Throwable -> L135
            com.badlogic.gdx.assets.AssetDescriptor r1 = (com.badlogic.gdx.assets.AssetDescriptor) r1     // Catch: java.lang.Throwable -> L135
            com.badlogic.gdx.utils.Logger r2 = r6.log     // Catch: java.lang.Throwable -> L135
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L135
            r3.<init>()     // Catch: java.lang.Throwable -> L135
            java.lang.String r4 = "Unload (from queue): "
            r3.append(r4)     // Catch: java.lang.Throwable -> L135
            r3.append(r7)     // Catch: java.lang.Throwable -> L135
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L135
            r2.info(r7)     // Catch: java.lang.Throwable -> L135
            if (r0 == 0) goto L8e
            com.badlogic.gdx.assets.AssetLoaderParameters r7 = r1.params     // Catch: java.lang.Throwable -> L135
            if (r7 == 0) goto L8e
            com.badlogic.gdx.assets.AssetLoaderParameters$LoadedCallback r7 = r7.loadedCallback     // Catch: java.lang.Throwable -> L135
            if (r7 == 0) goto L8e
            java.lang.String r0 = r1.fileName     // Catch: java.lang.Throwable -> L135
            java.lang.Class<T> r1 = r1.type     // Catch: java.lang.Throwable -> L135
            r7.finishedLoading(r6, r0, r1)     // Catch: java.lang.Throwable -> L135
        L8e:
            monitor-exit(r6)
            return
        L90:
            if (r0 == 0) goto L11e
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.AssetManager$RefCountedContainer>> r1 = r6.assets     // Catch: java.lang.Throwable -> L135
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L135
            com.badlogic.gdx.utils.ObjectMap r1 = (com.badlogic.gdx.utils.ObjectMap) r1     // Catch: java.lang.Throwable -> L135
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L135
            com.badlogic.gdx.assets.AssetManager$RefCountedContainer r1 = (com.badlogic.gdx.assets.AssetManager.RefCountedContainer) r1     // Catch: java.lang.Throwable -> L135
            int r3 = r1.refCount     // Catch: java.lang.Throwable -> L135
            int r3 = r3 - r2
            r1.refCount = r3     // Catch: java.lang.Throwable -> L135
            if (r3 > 0) goto Ld9
            com.badlogic.gdx.utils.Logger r2 = r6.log     // Catch: java.lang.Throwable -> L135
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L135
            r3.<init>()     // Catch: java.lang.Throwable -> L135
            java.lang.String r4 = "Unload (dispose): "
            r3.append(r4)     // Catch: java.lang.Throwable -> L135
            r3.append(r7)     // Catch: java.lang.Throwable -> L135
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L135
            r2.info(r3)     // Catch: java.lang.Throwable -> L135
            java.lang.Object r2 = r1.object     // Catch: java.lang.Throwable -> L135
            boolean r3 = r2 instanceof com.badlogic.gdx.utils.Disposable     // Catch: java.lang.Throwable -> L135
            if (r3 == 0) goto Lc8
            com.badlogic.gdx.utils.Disposable r2 = (com.badlogic.gdx.utils.Disposable) r2     // Catch: java.lang.Throwable -> L135
            r2.dispose()     // Catch: java.lang.Throwable -> L135
        Lc8:
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r2 = r6.assetTypes     // Catch: java.lang.Throwable -> L135
            r2.remove(r7)     // Catch: java.lang.Throwable -> L135
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.assets.AssetManager$RefCountedContainer>> r2 = r6.assets     // Catch: java.lang.Throwable -> L135
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L135
            com.badlogic.gdx.utils.ObjectMap r0 = (com.badlogic.gdx.utils.ObjectMap) r0     // Catch: java.lang.Throwable -> L135
            r0.remove(r7)     // Catch: java.lang.Throwable -> L135
            goto Lef
        Ld9:
            com.badlogic.gdx.utils.Logger r0 = r6.log     // Catch: java.lang.Throwable -> L135
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L135
            r2.<init>()     // Catch: java.lang.Throwable -> L135
            java.lang.String r3 = "Unload (decrement): "
            r2.append(r3)     // Catch: java.lang.Throwable -> L135
            r2.append(r7)     // Catch: java.lang.Throwable -> L135
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L135
            r0.info(r2)     // Catch: java.lang.Throwable -> L135
        Lef:
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.utils.Array<java.lang.String>> r0 = r6.assetDependencies     // Catch: java.lang.Throwable -> L135
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L135
            com.badlogic.gdx.utils.Array r0 = (com.badlogic.gdx.utils.Array) r0     // Catch: java.lang.Throwable -> L135
            if (r0 == 0) goto L113
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L135
        Lfd:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L135
            if (r2 == 0) goto L113
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L135
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L135
            boolean r3 = r6.isLoaded(r2)     // Catch: java.lang.Throwable -> L135
            if (r3 == 0) goto Lfd
            r6.unload(r2)     // Catch: java.lang.Throwable -> L135
            goto Lfd
        L113:
            int r0 = r1.refCount     // Catch: java.lang.Throwable -> L135
            if (r0 > 0) goto L11c
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.utils.Array<java.lang.String>> r0 = r6.assetDependencies     // Catch: java.lang.Throwable -> L135
            r0.remove(r7)     // Catch: java.lang.Throwable -> L135
        L11c:
            monitor-exit(r6)
            return
        L11e:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L135
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L135
            r1.<init>()     // Catch: java.lang.Throwable -> L135
            java.lang.String r2 = "Asset not loaded: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L135
            r1.append(r7)     // Catch: java.lang.Throwable -> L135
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L135
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L135
            throw r0     // Catch: java.lang.Throwable -> L135
        L135:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public synchronized boolean update() {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            r1 = 1
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetLoadingTask> r2 = r3.tasks     // Catch: java.lang.Throwable -> L36
            int r2 = r2.size     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L21
        L9:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r2 = r3.loadQueue     // Catch: java.lang.Throwable -> L36
            int r2 = r2.size     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L19
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetLoadingTask> r2 = r3.tasks     // Catch: java.lang.Throwable -> L36
            int r2 = r2.size     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L19
            r3.nextTask()     // Catch: java.lang.Throwable -> L36
            goto L9
        L19:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetLoadingTask> r2 = r3.tasks     // Catch: java.lang.Throwable -> L36
            int r2 = r2.size     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L21
            monitor-exit(r3)
            return r1
        L21:
            boolean r2 = r3.updateTask()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L34
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r2 = r3.loadQueue     // Catch: java.lang.Throwable -> L36
            int r2 = r2.size     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L34
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetLoadingTask> r2 = r3.tasks     // Catch: java.lang.Throwable -> L36
            int r2 = r2.size     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L34
            r0 = 1
        L34:
            monitor-exit(r3)
            return r0
        L36:
            r2 = move-exception
            r3.handleTaskError(r2)     // Catch: java.lang.Throwable -> L43
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r2 = r3.loadQueue     // Catch: java.lang.Throwable -> L43
            int r2 = r2.size     // Catch: java.lang.Throwable -> L43
            if (r2 != 0) goto L41
            r0 = 1
        L41:
            monitor-exit(r3)
            return r0
        L43:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }
}
