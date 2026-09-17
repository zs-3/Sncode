package com.badlogic.gdx.assets;

/* loaded from: classes.dex */
class AssetLoadingTask implements com.badlogic.gdx.utils.async.AsyncTask<java.lang.Void> {
    volatile java.lang.Object asset;
    final com.badlogic.gdx.assets.AssetDescriptor assetDesc;
    volatile boolean asyncDone;
    volatile boolean cancel;
    volatile com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> dependencies;
    volatile boolean dependenciesLoaded;
    volatile com.badlogic.gdx.utils.async.AsyncResult<java.lang.Void> depsFuture;
    final com.badlogic.gdx.utils.async.AsyncExecutor executor;
    volatile com.badlogic.gdx.utils.async.AsyncResult<java.lang.Void> loadFuture;
    final com.badlogic.gdx.assets.loaders.AssetLoader loader;
    com.badlogic.gdx.assets.AssetManager manager;
    final long startTime;

    public AssetLoadingTask(com.badlogic.gdx.assets.AssetManager r1, com.badlogic.gdx.assets.AssetDescriptor r2, com.badlogic.gdx.assets.loaders.AssetLoader r3, com.badlogic.gdx.utils.async.AsyncExecutor r4) {
            r0 = this;
            r0.<init>()
            r0.manager = r1
            r0.assetDesc = r2
            r0.loader = r3
            r0.executor = r4
            com.badlogic.gdx.utils.Logger r1 = r1.log
            int r1 = r1.getLevel()
            r2 = 3
            if (r1 != r2) goto L19
            long r1 = com.badlogic.gdx.utils.TimeUtils.nanoTime()
            goto L1b
        L19:
            r1 = 0
        L1b:
            r0.startTime = r1
            return
    }

    private void handleAsyncLoader() {
            r5 = this;
            com.badlogic.gdx.assets.loaders.AssetLoader r0 = r5.loader
            com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader r0 = (com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader) r0
            boolean r1 = r5.dependenciesLoaded
            if (r1 != 0) goto L5e
            com.badlogic.gdx.utils.async.AsyncResult<java.lang.Void> r1 = r5.depsFuture
            if (r1 != 0) goto L16
            com.badlogic.gdx.utils.async.AsyncExecutor r0 = r5.executor
            com.badlogic.gdx.utils.async.AsyncResult r0 = r0.submit(r5)
            r5.depsFuture = r0
            goto Lca
        L16:
            com.badlogic.gdx.utils.async.AsyncResult<java.lang.Void> r1 = r5.depsFuture
            boolean r1 = r1.isDone()
            if (r1 == 0) goto Lca
            com.badlogic.gdx.utils.async.AsyncResult<java.lang.Void> r1 = r5.depsFuture     // Catch: java.lang.Exception -> L42
            r1.get()     // Catch: java.lang.Exception -> L42
            r1 = 1
            r5.dependenciesLoaded = r1
            boolean r1 = r5.asyncDone
            if (r1 == 0) goto Lca
            com.badlogic.gdx.assets.AssetManager r1 = r5.manager
            com.badlogic.gdx.assets.AssetDescriptor r2 = r5.assetDesc
            java.lang.String r3 = r2.fileName
            com.badlogic.gdx.assets.loaders.AssetLoader r4 = r5.loader
            com.badlogic.gdx.files.FileHandle r2 = r5.resolve(r4, r2)
            com.badlogic.gdx.assets.AssetDescriptor r4 = r5.assetDesc
            com.badlogic.gdx.assets.AssetLoaderParameters r4 = r4.params
            java.lang.Object r0 = r0.loadSync(r1, r3, r2, r4)
            r5.asset = r0
            goto Lca
        L42:
            r0 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Couldn't load dependencies of asset: "
            r2.append(r3)
            com.badlogic.gdx.assets.AssetDescriptor r3 = r5.assetDesc
            java.lang.String r3 = r3.fileName
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L5e:
            com.badlogic.gdx.utils.async.AsyncResult<java.lang.Void> r1 = r5.loadFuture
            if (r1 != 0) goto L6f
            boolean r1 = r5.asyncDone
            if (r1 != 0) goto L6f
            com.badlogic.gdx.utils.async.AsyncExecutor r0 = r5.executor
            com.badlogic.gdx.utils.async.AsyncResult r0 = r0.submit(r5)
            r5.loadFuture = r0
            goto Lca
        L6f:
            boolean r1 = r5.asyncDone
            if (r1 == 0) goto L8a
            com.badlogic.gdx.assets.AssetManager r1 = r5.manager
            com.badlogic.gdx.assets.AssetDescriptor r2 = r5.assetDesc
            java.lang.String r3 = r2.fileName
            com.badlogic.gdx.assets.loaders.AssetLoader r4 = r5.loader
            com.badlogic.gdx.files.FileHandle r2 = r5.resolve(r4, r2)
            com.badlogic.gdx.assets.AssetDescriptor r4 = r5.assetDesc
            com.badlogic.gdx.assets.AssetLoaderParameters r4 = r4.params
            java.lang.Object r0 = r0.loadSync(r1, r3, r2, r4)
            r5.asset = r0
            goto Lca
        L8a:
            com.badlogic.gdx.utils.async.AsyncResult<java.lang.Void> r1 = r5.loadFuture
            boolean r1 = r1.isDone()
            if (r1 == 0) goto Lca
            com.badlogic.gdx.utils.async.AsyncResult<java.lang.Void> r1 = r5.loadFuture     // Catch: java.lang.Exception -> Lae
            r1.get()     // Catch: java.lang.Exception -> Lae
            com.badlogic.gdx.assets.AssetManager r1 = r5.manager
            com.badlogic.gdx.assets.AssetDescriptor r2 = r5.assetDesc
            java.lang.String r3 = r2.fileName
            com.badlogic.gdx.assets.loaders.AssetLoader r4 = r5.loader
            com.badlogic.gdx.files.FileHandle r2 = r5.resolve(r4, r2)
            com.badlogic.gdx.assets.AssetDescriptor r4 = r5.assetDesc
            com.badlogic.gdx.assets.AssetLoaderParameters r4 = r4.params
            java.lang.Object r0 = r0.loadSync(r1, r3, r2, r4)
            r5.asset = r0
            goto Lca
        Lae:
            r0 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Couldn't load asset: "
            r2.append(r3)
            com.badlogic.gdx.assets.AssetDescriptor r3 = r5.assetDesc
            java.lang.String r3 = r3.fileName
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        Lca:
            return
    }

    private void handleSyncLoader() {
            r5 = this;
            com.badlogic.gdx.assets.loaders.AssetLoader r0 = r5.loader
            com.badlogic.gdx.assets.loaders.SynchronousAssetLoader r0 = (com.badlogic.gdx.assets.loaders.SynchronousAssetLoader) r0
            boolean r1 = r5.dependenciesLoaded
            if (r1 != 0) goto L4b
            r1 = 1
            r5.dependenciesLoaded = r1
            com.badlogic.gdx.assets.AssetDescriptor r1 = r5.assetDesc
            java.lang.String r2 = r1.fileName
            com.badlogic.gdx.assets.loaders.AssetLoader r3 = r5.loader
            com.badlogic.gdx.files.FileHandle r1 = r5.resolve(r3, r1)
            com.badlogic.gdx.assets.AssetDescriptor r3 = r5.assetDesc
            com.badlogic.gdx.assets.AssetLoaderParameters r3 = r3.params
            com.badlogic.gdx.utils.Array r1 = r0.getDependencies(r2, r1, r3)
            r5.dependencies = r1
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r1 = r5.dependencies
            if (r1 != 0) goto L3a
            com.badlogic.gdx.assets.AssetManager r1 = r5.manager
            com.badlogic.gdx.assets.AssetDescriptor r2 = r5.assetDesc
            java.lang.String r3 = r2.fileName
            com.badlogic.gdx.assets.loaders.AssetLoader r4 = r5.loader
            com.badlogic.gdx.files.FileHandle r2 = r5.resolve(r4, r2)
            com.badlogic.gdx.assets.AssetDescriptor r4 = r5.assetDesc
            com.badlogic.gdx.assets.AssetLoaderParameters r4 = r4.params
            java.lang.Object r0 = r0.load(r1, r3, r2, r4)
            r5.asset = r0
            return
        L3a:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r0 = r5.dependencies
            r5.removeDuplicates(r0)
            com.badlogic.gdx.assets.AssetManager r0 = r5.manager
            com.badlogic.gdx.assets.AssetDescriptor r1 = r5.assetDesc
            java.lang.String r1 = r1.fileName
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r2 = r5.dependencies
            r0.injectDependencies(r1, r2)
            goto L61
        L4b:
            com.badlogic.gdx.assets.AssetManager r1 = r5.manager
            com.badlogic.gdx.assets.AssetDescriptor r2 = r5.assetDesc
            java.lang.String r3 = r2.fileName
            com.badlogic.gdx.assets.loaders.AssetLoader r4 = r5.loader
            com.badlogic.gdx.files.FileHandle r2 = r5.resolve(r4, r2)
            com.badlogic.gdx.assets.AssetDescriptor r4 = r5.assetDesc
            com.badlogic.gdx.assets.AssetLoaderParameters r4 = r4.params
            java.lang.Object r0 = r0.load(r1, r3, r2, r4)
            r5.asset = r0
        L61:
            return
    }

    private void removeDuplicates(com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r8) {
            r7 = this;
            boolean r0 = r8.ordered
            r1 = 1
            r8.ordered = r1
            r2 = 0
        L6:
            int r3 = r8.size
            if (r2 >= r3) goto L40
            java.lang.Object r3 = r8.get(r2)
            com.badlogic.gdx.assets.AssetDescriptor r3 = (com.badlogic.gdx.assets.AssetDescriptor) r3
            java.lang.String r3 = r3.fileName
            java.lang.Object r4 = r8.get(r2)
            com.badlogic.gdx.assets.AssetDescriptor r4 = (com.badlogic.gdx.assets.AssetDescriptor) r4
            java.lang.Class<T> r4 = r4.type
            int r5 = r8.size
            int r5 = r5 - r1
        L1d:
            if (r5 <= r2) goto L3d
            java.lang.Object r6 = r8.get(r5)
            com.badlogic.gdx.assets.AssetDescriptor r6 = (com.badlogic.gdx.assets.AssetDescriptor) r6
            java.lang.Class<T> r6 = r6.type
            if (r4 != r6) goto L3a
            java.lang.Object r6 = r8.get(r5)
            com.badlogic.gdx.assets.AssetDescriptor r6 = (com.badlogic.gdx.assets.AssetDescriptor) r6
            java.lang.String r6 = r6.fileName
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L3a
            r8.removeIndex(r5)
        L3a:
            int r5 = r5 + (-1)
            goto L1d
        L3d:
            int r2 = r2 + 1
            goto L6
        L40:
            r8.ordered = r0
            return
    }

    private com.badlogic.gdx.files.FileHandle resolve(com.badlogic.gdx.assets.loaders.AssetLoader r2, com.badlogic.gdx.assets.AssetDescriptor r3) {
            r1 = this;
            com.badlogic.gdx.files.FileHandle r0 = r3.file
            if (r0 != 0) goto Lc
            java.lang.String r0 = r3.fileName
            com.badlogic.gdx.files.FileHandle r2 = r2.resolve(r0)
            r3.file = r2
        Lc:
            com.badlogic.gdx.files.FileHandle r2 = r3.file
            return r2
    }

    @Override // com.badlogic.gdx.utils.async.AsyncTask
    public /* bridge */ /* synthetic */ java.lang.Void call() throws java.lang.Exception {
            r1 = this;
            java.lang.Void r0 = r1.call2()
            return r0
    }

    @Override // com.badlogic.gdx.utils.async.AsyncTask
    /* renamed from: call, reason: avoid collision after fix types in other method */
    public java.lang.Void call2() throws java.lang.Exception {
            r7 = this;
            boolean r0 = r7.cancel
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            com.badlogic.gdx.assets.loaders.AssetLoader r0 = r7.loader
            com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader r0 = (com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader) r0
            boolean r2 = r7.dependenciesLoaded
            r3 = 1
            if (r2 != 0) goto L4e
            com.badlogic.gdx.assets.AssetDescriptor r2 = r7.assetDesc
            java.lang.String r4 = r2.fileName
            com.badlogic.gdx.assets.loaders.AssetLoader r5 = r7.loader
            com.badlogic.gdx.files.FileHandle r2 = r7.resolve(r5, r2)
            com.badlogic.gdx.assets.AssetDescriptor r5 = r7.assetDesc
            com.badlogic.gdx.assets.AssetLoaderParameters r5 = r5.params
            com.badlogic.gdx.utils.Array r2 = r0.getDependencies(r4, r2, r5)
            r7.dependencies = r2
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r2 = r7.dependencies
            if (r2 == 0) goto L38
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r0 = r7.dependencies
            r7.removeDuplicates(r0)
            com.badlogic.gdx.assets.AssetManager r0 = r7.manager
            com.badlogic.gdx.assets.AssetDescriptor r2 = r7.assetDesc
            java.lang.String r2 = r2.fileName
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.assets.AssetDescriptor> r3 = r7.dependencies
            r0.injectDependencies(r2, r3)
            goto L63
        L38:
            com.badlogic.gdx.assets.AssetManager r2 = r7.manager
            com.badlogic.gdx.assets.AssetDescriptor r4 = r7.assetDesc
            java.lang.String r5 = r4.fileName
            com.badlogic.gdx.assets.loaders.AssetLoader r6 = r7.loader
            com.badlogic.gdx.files.FileHandle r4 = r7.resolve(r6, r4)
            com.badlogic.gdx.assets.AssetDescriptor r6 = r7.assetDesc
            com.badlogic.gdx.assets.AssetLoaderParameters r6 = r6.params
            r0.loadAsync(r2, r5, r4, r6)
            r7.asyncDone = r3
            goto L63
        L4e:
            com.badlogic.gdx.assets.AssetManager r2 = r7.manager
            com.badlogic.gdx.assets.AssetDescriptor r4 = r7.assetDesc
            java.lang.String r5 = r4.fileName
            com.badlogic.gdx.assets.loaders.AssetLoader r6 = r7.loader
            com.badlogic.gdx.files.FileHandle r4 = r7.resolve(r6, r4)
            com.badlogic.gdx.assets.AssetDescriptor r6 = r7.assetDesc
            com.badlogic.gdx.assets.AssetLoaderParameters r6 = r6.params
            r0.loadAsync(r2, r5, r4, r6)
            r7.asyncDone = r3
        L63:
            return r1
    }

    public void unload() {
            r5 = this;
            com.badlogic.gdx.assets.loaders.AssetLoader r0 = r5.loader
            boolean r1 = r0 instanceof com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
            if (r1 == 0) goto L1a
            r1 = r0
            com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader r1 = (com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader) r1
            com.badlogic.gdx.assets.AssetManager r2 = r5.manager
            com.badlogic.gdx.assets.AssetDescriptor r3 = r5.assetDesc
            java.lang.String r4 = r3.fileName
            com.badlogic.gdx.files.FileHandle r0 = r5.resolve(r0, r3)
            com.badlogic.gdx.assets.AssetDescriptor r3 = r5.assetDesc
            com.badlogic.gdx.assets.AssetLoaderParameters r3 = r3.params
            r1.unloadAsync(r2, r4, r0, r3)
        L1a:
            return
    }

    public boolean update() {
            r1 = this;
            com.badlogic.gdx.assets.loaders.AssetLoader r0 = r1.loader
            boolean r0 = r0 instanceof com.badlogic.gdx.assets.loaders.SynchronousAssetLoader
            if (r0 == 0) goto La
            r1.handleSyncLoader()
            goto Ld
        La:
            r1.handleAsyncLoader()
        Ld:
            java.lang.Object r0 = r1.asset
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }
}
