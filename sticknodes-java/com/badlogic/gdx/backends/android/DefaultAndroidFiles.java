package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class DefaultAndroidFiles implements com.badlogic.gdx.backends.android.AndroidFiles {
    protected final android.content.res.AssetManager assets;
    private com.badlogic.gdx.backends.android.ZipResourceFile expansionFile;
    protected final java.lang.String externalFilesPath;
    protected final java.lang.String localpath;

    public DefaultAndroidFiles(android.content.res.AssetManager r4, android.content.ContextWrapper r5, boolean r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.expansionFile = r0
            r3.assets = r4
            java.io.File r4 = r5.getFilesDir()
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.String r1 = "/"
            boolean r2 = r4.endsWith(r1)
            if (r2 == 0) goto L19
            goto L28
        L19:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
        L28:
            r3.localpath = r4
            if (r6 == 0) goto L33
            java.lang.String r4 = r3.initExternalFilesPath(r5)
            r3.externalFilesPath = r4
            goto L35
        L33:
            r3.externalFilesPath = r0
        L35:
            return
    }

    private com.badlogic.gdx.files.FileHandle getZipFileHandleIfExists(com.badlogic.gdx.files.FileHandle r2, java.lang.String r3) {
            r1 = this;
            android.content.res.AssetManager r0 = r1.assets     // Catch: java.lang.Exception -> La
            java.io.InputStream r0 = r0.open(r3)     // Catch: java.lang.Exception -> La
            r0.close()     // Catch: java.lang.Exception -> La
            return r2
        La:
            com.badlogic.gdx.backends.android.AndroidZipFileHandle r0 = new com.badlogic.gdx.backends.android.AndroidZipFileHandle
            r0.<init>(r3)
            boolean r3 = r0.isDirectory()
            if (r3 != 0) goto L17
            return r0
        L17:
            boolean r3 = r0.exists()
            if (r3 == 0) goto L1e
            return r0
        L1e:
            return r2
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFiles, com.badlogic.gdx.Files
    public com.badlogic.gdx.files.FileHandle absolute(java.lang.String r4) {
            r3 = this;
            com.badlogic.gdx.backends.android.AndroidFileHandle r0 = new com.badlogic.gdx.backends.android.AndroidFileHandle
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Absolute
            r2 = 0
            r0.<init>(r2, r4, r1)
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFiles, com.badlogic.gdx.Files
    public com.badlogic.gdx.files.FileHandle classpath(java.lang.String r4) {
            r3 = this;
            com.badlogic.gdx.backends.android.AndroidFileHandle r0 = new com.badlogic.gdx.backends.android.AndroidFileHandle
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Classpath
            r2 = 0
            r0.<init>(r2, r4, r1)
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFiles, com.badlogic.gdx.Files
    public com.badlogic.gdx.files.FileHandle external(java.lang.String r4) {
            r3 = this;
            com.badlogic.gdx.backends.android.AndroidFileHandle r0 = new com.badlogic.gdx.backends.android.AndroidFileHandle
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.External
            r2 = 0
            r0.<init>(r2, r4, r1)
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFiles
    public com.badlogic.gdx.backends.android.ZipResourceFile getExpansionFile() {
            r1 = this;
            com.badlogic.gdx.backends.android.ZipResourceFile r0 = r1.expansionFile
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFiles, com.badlogic.gdx.Files
    public java.lang.String getExternalStoragePath() {
            r1 = this;
            java.lang.String r0 = r1.externalFilesPath
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFiles, com.badlogic.gdx.Files
    public com.badlogic.gdx.files.FileHandle getFileHandle(java.lang.String r4, com.badlogic.gdx.Files.FileType r5) {
            r3 = this;
            com.badlogic.gdx.backends.android.AndroidFileHandle r0 = new com.badlogic.gdx.backends.android.AndroidFileHandle
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal
            if (r5 != r1) goto L9
            android.content.res.AssetManager r2 = r3.assets
            goto La
        L9:
            r2 = 0
        La:
            r0.<init>(r2, r4, r5)
            com.badlogic.gdx.backends.android.ZipResourceFile r2 = r3.expansionFile
            if (r2 == 0) goto L17
            if (r5 != r1) goto L17
            com.badlogic.gdx.files.FileHandle r0 = r3.getZipFileHandleIfExists(r0, r4)
        L17:
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFiles, com.badlogic.gdx.Files
    public java.lang.String getLocalStoragePath() {
            r1 = this;
            java.lang.String r0 = r1.localpath
            return r0
    }

    protected java.lang.String initExternalFilesPath(android.content.ContextWrapper r3) {
            r2 = this;
            r0 = 0
            java.io.File r3 = r3.getExternalFilesDir(r0)
            if (r3 == 0) goto L24
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.String r0 = "/"
            boolean r1 = r3.endsWith(r0)
            if (r1 == 0) goto L14
            goto L23
        L14:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
        L23:
            return r3
        L24:
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFiles, com.badlogic.gdx.Files
    public com.badlogic.gdx.files.FileHandle internal(java.lang.String r4) {
            r3 = this;
            com.badlogic.gdx.backends.android.AndroidFileHandle r0 = new com.badlogic.gdx.backends.android.AndroidFileHandle
            android.content.res.AssetManager r1 = r3.assets
            com.badlogic.gdx.Files$FileType r2 = com.badlogic.gdx.Files.FileType.Internal
            r0.<init>(r1, r4, r2)
            com.badlogic.gdx.backends.android.ZipResourceFile r1 = r3.expansionFile
            if (r1 == 0) goto L11
            com.badlogic.gdx.files.FileHandle r0 = r3.getZipFileHandleIfExists(r0, r4)
        L11:
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFiles, com.badlogic.gdx.Files
    public boolean isExternalStorageAvailable() {
            r1 = this;
            java.lang.String r0 = r1.externalFilesPath
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFiles
    public boolean isLocalStorageAvailable() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFiles
    public com.badlogic.gdx.files.FileHandle local(java.lang.String r4) {
            r3 = this;
            com.badlogic.gdx.backends.android.AndroidFileHandle r0 = new com.badlogic.gdx.backends.android.AndroidFileHandle
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Local
            r2 = 0
            r0.<init>(r2, r4, r1)
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFiles
    public boolean setAPKExpansion(int r4, int r5) {
            r3 = this;
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app     // Catch: java.io.IOException -> L2f
            boolean r1 = r0 instanceof android.app.Activity     // Catch: java.io.IOException -> L2f
            if (r1 == 0) goto Ld
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.io.IOException -> L2f
            android.content.Context r0 = r0.getBaseContext()     // Catch: java.io.IOException -> L2f
            goto L1b
        Ld:
            boolean r1 = r0 instanceof android.app.Fragment     // Catch: java.io.IOException -> L2f
            if (r1 == 0) goto L27
            android.app.Fragment r0 = (android.app.Fragment) r0     // Catch: java.io.IOException -> L2f
            android.app.Activity r0 = r0.getActivity()     // Catch: java.io.IOException -> L2f
            android.content.Context r0 = r0.getBaseContext()     // Catch: java.io.IOException -> L2f
        L1b:
            com.badlogic.gdx.backends.android.ZipResourceFile r0 = com.badlogic.gdx.backends.android.APKExpansionSupport.getAPKExpansionZipFile(r0, r4, r5)     // Catch: java.io.IOException -> L2f
            r3.expansionFile = r0     // Catch: java.io.IOException -> L2f
            if (r0 == 0) goto L25
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            return r4
        L27:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.io.IOException -> L2f
            java.lang.String r1 = "APK expansion not supported for application type"
            r0.<init>(r1)     // Catch: java.io.IOException -> L2f
            throw r0     // Catch: java.io.IOException -> L2f
        L2f:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "APK expansion main version "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " or patch version "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = " couldn't be opened!"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
