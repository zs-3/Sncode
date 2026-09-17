package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AndroidZipFileHandle extends com.badlogic.gdx.backends.android.AndroidFileHandle {
    private com.badlogic.gdx.backends.android.ZipResourceFile expansionFile;
    private long fdLength;
    private boolean hasAssetFd;
    private java.lang.String path;

    public AndroidZipFileHandle(java.io.File r2, com.badlogic.gdx.Files.FileType r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3)
            r1.initialize()
            return
    }

    public AndroidZipFileHandle(java.lang.String r3) {
            r2 = this;
            com.badlogic.gdx.Files$FileType r0 = com.badlogic.gdx.Files.FileType.Internal
            r1 = 0
            r2.<init>(r1, r3, r0)
            r2.initialize()
            return
    }

    private java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    private void initialize() {
            r3 = this;
            java.io.File r0 = r3.file
            java.lang.String r0 = r0.getPath()
            r1 = 92
            r2 = 47
            java.lang.String r0 = r0.replace(r1, r2)
            r3.path = r0
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.backends.android.AndroidFiles r0 = (com.badlogic.gdx.backends.android.AndroidFiles) r0
            com.badlogic.gdx.backends.android.ZipResourceFile r0 = r0.getExpansionFile()
            r3.expansionFile = r0
            java.lang.String r1 = r3.getPath()
            android.content.res.AssetFileDescriptor r0 = r0.getAssetFileDescriptor(r1)
            if (r0 == 0) goto L33
            r1 = 1
            r3.hasAssetFd = r1
            long r1 = r0.getLength()
            r3.fdLength = r1
            r0.close()     // Catch: java.io.IOException -> L31
            goto L36
        L31:
            goto L36
        L33:
            r0 = 0
            r3.hasAssetFd = r0
        L36:
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L51
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.path
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.path = r0
        L51:
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public com.badlogic.gdx.files.FileHandle child(java.lang.String r4) {
            r3 = this;
            java.io.File r0 = r3.file
            java.lang.String r0 = r0.getPath()
            int r0 = r0.length()
            if (r0 != 0) goto L19
            com.badlogic.gdx.backends.android.AndroidZipFileHandle r0 = new com.badlogic.gdx.backends.android.AndroidZipFileHandle
            java.io.File r1 = new java.io.File
            r1.<init>(r4)
            com.badlogic.gdx.Files$FileType r4 = r3.type
            r0.<init>(r1, r4)
            return r0
        L19:
            com.badlogic.gdx.backends.android.AndroidZipFileHandle r0 = new com.badlogic.gdx.backends.android.AndroidZipFileHandle
            java.io.File r1 = new java.io.File
            java.io.File r2 = r3.file
            r1.<init>(r2, r4)
            com.badlogic.gdx.Files$FileType r4 = r3.type
            r0.<init>(r1, r4)
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public boolean exists() {
            r2 = this;
            boolean r0 = r2.hasAssetFd
            if (r0 != 0) goto L14
            com.badlogic.gdx.backends.android.ZipResourceFile r0 = r2.expansionFile
            java.lang.String r1 = r2.getPath()
            com.badlogic.gdx.backends.android.ZipResourceFile$ZipEntryRO[] r0 = r0.getEntriesAt(r1)
            int r0 = r0.length
            if (r0 == 0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle
    public android.content.res.AssetFileDescriptor getAssetFileDescriptor() throws java.io.IOException {
            r2 = this;
            com.badlogic.gdx.backends.android.ZipResourceFile r0 = r2.expansionFile
            java.lang.String r1 = r2.getPath()
            android.content.res.AssetFileDescriptor r0 = r0.getAssetFileDescriptor(r1)
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public boolean isDirectory() {
            r1 = this;
            boolean r0 = r1.hasAssetFd
            r0 = r0 ^ 1
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public long length() {
            r2 = this;
            boolean r0 = r2.hasAssetFd
            if (r0 == 0) goto L7
            long r0 = r2.fdLength
            goto L9
        L7:
            r0 = 0
        L9:
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public com.badlogic.gdx.files.FileHandle[] list() {
            r8 = this;
            com.badlogic.gdx.backends.android.ZipResourceFile r0 = r8.expansionFile
            java.lang.String r1 = r8.getPath()
            com.badlogic.gdx.backends.android.ZipResourceFile$ZipEntryRO[] r0 = r0.getEntriesAt(r1)
            int r1 = r0.length
            int r1 = r1 + (-1)
            com.badlogic.gdx.files.FileHandle[] r1 = new com.badlogic.gdx.files.FileHandle[r1]
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L12:
            if (r3 >= r2) goto L38
            r5 = r0[r3]
            java.lang.String r5 = r5.mFileName
            int r5 = r5.length()
            java.lang.String r6 = r8.getPath()
            int r6 = r6.length()
            if (r5 != r6) goto L27
            goto L35
        L27:
            int r5 = r4 + 1
            com.badlogic.gdx.backends.android.AndroidZipFileHandle r6 = new com.badlogic.gdx.backends.android.AndroidZipFileHandle
            r7 = r0[r3]
            java.lang.String r7 = r7.mFileName
            r6.<init>(r7)
            r1[r4] = r6
            r4 = r5
        L35:
            int r3 = r3 + 1
            goto L12
        L38:
            return r1
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public com.badlogic.gdx.files.FileHandle[] list(java.io.FileFilter r10) {
            r9 = this;
            com.badlogic.gdx.backends.android.ZipResourceFile r0 = r9.expansionFile
            java.lang.String r1 = r9.getPath()
            com.badlogic.gdx.backends.android.ZipResourceFile$ZipEntryRO[] r0 = r0.getEntriesAt(r1)
            int r1 = r0.length
            int r1 = r1 + (-1)
            com.badlogic.gdx.files.FileHandle[] r2 = new com.badlogic.gdx.files.FileHandle[r1]
            int r3 = r0.length
            r4 = 0
            r5 = 0
            r6 = 0
        L13:
            if (r5 >= r3) goto L43
            r7 = r0[r5]
            java.lang.String r7 = r7.mFileName
            int r7 = r7.length()
            java.lang.String r8 = r9.getPath()
            int r8 = r8.length()
            if (r7 != r8) goto L28
            goto L40
        L28:
            com.badlogic.gdx.backends.android.AndroidZipFileHandle r7 = new com.badlogic.gdx.backends.android.AndroidZipFileHandle
            r8 = r0[r5]
            java.lang.String r8 = r8.mFileName
            r7.<init>(r8)
            java.io.File r8 = r7.file()
            boolean r8 = r10.accept(r8)
            if (r8 != 0) goto L3c
            goto L40
        L3c:
            r2[r6] = r7
            int r6 = r6 + 1
        L40:
            int r5 = r5 + 1
            goto L13
        L43:
            if (r6 >= r1) goto L4b
            com.badlogic.gdx.files.FileHandle[] r10 = new com.badlogic.gdx.files.FileHandle[r6]
            java.lang.System.arraycopy(r2, r4, r10, r4, r6)
            r2 = r10
        L4b:
            return r2
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public com.badlogic.gdx.files.FileHandle[] list(java.io.FilenameFilter r10) {
            r9 = this;
            com.badlogic.gdx.backends.android.ZipResourceFile r0 = r9.expansionFile
            java.lang.String r1 = r9.getPath()
            com.badlogic.gdx.backends.android.ZipResourceFile$ZipEntryRO[] r0 = r0.getEntriesAt(r1)
            int r1 = r0.length
            int r1 = r1 + (-1)
            com.badlogic.gdx.files.FileHandle[] r2 = new com.badlogic.gdx.files.FileHandle[r1]
            int r3 = r0.length
            r4 = 0
            r5 = 0
            r6 = 0
        L13:
            if (r5 >= r3) goto L41
            r7 = r0[r5]
            java.lang.String r7 = r7.mFileName
            int r7 = r7.length()
            java.lang.String r8 = r9.getPath()
            int r8 = r8.length()
            if (r7 != r8) goto L28
            goto L3e
        L28:
            r7 = r0[r5]
            java.lang.String r7 = r7.mFileName
            java.io.File r8 = r9.file
            boolean r8 = r10.accept(r8, r7)
            if (r8 != 0) goto L35
            goto L3e
        L35:
            com.badlogic.gdx.backends.android.AndroidZipFileHandle r8 = new com.badlogic.gdx.backends.android.AndroidZipFileHandle
            r8.<init>(r7)
            r2[r6] = r8
            int r6 = r6 + 1
        L3e:
            int r5 = r5 + 1
            goto L13
        L41:
            if (r6 >= r1) goto L49
            com.badlogic.gdx.files.FileHandle[] r10 = new com.badlogic.gdx.files.FileHandle[r6]
            java.lang.System.arraycopy(r2, r4, r10, r4, r6)
            r2 = r10
        L49:
            return r2
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public com.badlogic.gdx.files.FileHandle[] list(java.lang.String r10) {
            r9 = this;
            com.badlogic.gdx.backends.android.ZipResourceFile r0 = r9.expansionFile
            java.lang.String r1 = r9.getPath()
            com.badlogic.gdx.backends.android.ZipResourceFile$ZipEntryRO[] r0 = r0.getEntriesAt(r1)
            int r1 = r0.length
            int r1 = r1 + (-1)
            com.badlogic.gdx.files.FileHandle[] r2 = new com.badlogic.gdx.files.FileHandle[r1]
            int r3 = r0.length
            r4 = 0
            r5 = 0
            r6 = 0
        L13:
            if (r5 >= r3) goto L3f
            r7 = r0[r5]
            java.lang.String r7 = r7.mFileName
            int r7 = r7.length()
            java.lang.String r8 = r9.getPath()
            int r8 = r8.length()
            if (r7 != r8) goto L28
            goto L3c
        L28:
            r7 = r0[r5]
            java.lang.String r7 = r7.mFileName
            boolean r8 = r7.endsWith(r10)
            if (r8 != 0) goto L33
            goto L3c
        L33:
            com.badlogic.gdx.backends.android.AndroidZipFileHandle r8 = new com.badlogic.gdx.backends.android.AndroidZipFileHandle
            r8.<init>(r7)
            r2[r6] = r8
            int r6 = r6 + 1
        L3c:
            int r5 = r5 + 1
            goto L13
        L3f:
            if (r6 >= r1) goto L47
            com.badlogic.gdx.files.FileHandle[] r10 = new com.badlogic.gdx.files.FileHandle[r6]
            java.lang.System.arraycopy(r2, r4, r10, r4, r6)
            r2 = r10
        L47:
            return r2
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public com.badlogic.gdx.files.FileHandle parent() {
            r2 = this;
            java.io.File r0 = r2.file
            java.io.File r0 = r0.getParentFile()
            if (r0 != 0) goto Lf
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ""
            r0.<init>(r1)
        Lf:
            com.badlogic.gdx.backends.android.AndroidZipFileHandle r1 = new com.badlogic.gdx.backends.android.AndroidZipFileHandle
            java.lang.String r0 = r0.getPath()
            r1.<init>(r0)
            return r1
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public java.io.InputStream read() {
            r4 = this;
            com.badlogic.gdx.backends.android.ZipResourceFile r0 = r4.expansionFile     // Catch: java.io.IOException -> Lb
            java.lang.String r1 = r4.getPath()     // Catch: java.io.IOException -> Lb
            java.io.InputStream r0 = r0.getInputStream(r1)     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error reading file: "
            r2.append(r3)
            java.io.File r3 = r4.file
            r2.append(r3)
            java.lang.String r3 = " (ZipResourceFile)"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public com.badlogic.gdx.files.FileHandle sibling(java.lang.String r4) {
            r3 = this;
            java.io.File r0 = r3.file
            java.lang.String r0 = r0.getPath()
            int r0 = r0.length()
            if (r0 == 0) goto L24
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.io.File r1 = new java.io.File
            java.io.File r2 = r3.file
            java.lang.String r2 = r2.getParent()
            r1.<init>(r2, r4)
            java.lang.String r4 = r1.getPath()
            com.badlogic.gdx.Files$FileType r1 = r3.type
            com.badlogic.gdx.files.FileHandle r4 = r0.getFileHandle(r4, r1)
            return r4
        L24:
            com.badlogic.gdx.utils.GdxRuntimeException r4 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r0 = "Cannot get the sibling of the root."
            r4.<init>(r0)
            throw r4
    }
}
