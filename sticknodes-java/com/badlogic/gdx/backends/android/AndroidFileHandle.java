package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AndroidFileHandle extends com.badlogic.gdx.files.FileHandle {
    private final android.content.res.AssetManager assets;

    AndroidFileHandle(android.content.res.AssetManager r1, java.io.File r2, com.badlogic.gdx.Files.FileType r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.assets = r1
            return
    }

    AndroidFileHandle(android.content.res.AssetManager r3, java.lang.String r4, com.badlogic.gdx.Files.FileType r5) {
            r2 = this;
            r0 = 92
            r1 = 47
            java.lang.String r4 = r4.replace(r0, r1)
            r2.<init>(r4, r5)
            r2.assets = r3
            return
    }

    @Override // com.badlogic.gdx.files.FileHandle
    public com.badlogic.gdx.files.FileHandle child(java.lang.String r5) {
            r4 = this;
            r0 = 92
            r1 = 47
            java.lang.String r5 = r5.replace(r0, r1)
            java.io.File r0 = r4.file
            java.lang.String r0 = r0.getPath()
            int r0 = r0.length()
            if (r0 != 0) goto L23
            com.badlogic.gdx.backends.android.AndroidFileHandle r0 = new com.badlogic.gdx.backends.android.AndroidFileHandle
            android.content.res.AssetManager r1 = r4.assets
            java.io.File r2 = new java.io.File
            r2.<init>(r5)
            com.badlogic.gdx.Files$FileType r5 = r4.type
            r0.<init>(r1, r2, r5)
            return r0
        L23:
            com.badlogic.gdx.backends.android.AndroidFileHandle r0 = new com.badlogic.gdx.backends.android.AndroidFileHandle
            android.content.res.AssetManager r1 = r4.assets
            java.io.File r2 = new java.io.File
            java.io.File r3 = r4.file
            r2.<init>(r3, r5)
            com.badlogic.gdx.Files$FileType r5 = r4.type
            r0.<init>(r1, r2, r5)
            return r0
    }

    @Override // com.badlogic.gdx.files.FileHandle
    public boolean exists() {
            r4 = this;
            com.badlogic.gdx.Files$FileType r0 = r4.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal
            if (r0 != r1) goto L25
            java.io.File r0 = r4.file
            java.lang.String r0 = r0.getPath()
            r1 = 1
            android.content.res.AssetManager r2 = r4.assets     // Catch: java.lang.Exception -> L17
            java.io.InputStream r2 = r2.open(r0)     // Catch: java.lang.Exception -> L17
            r2.close()     // Catch: java.lang.Exception -> L17
            return r1
        L17:
            r2 = 0
            android.content.res.AssetManager r3 = r4.assets     // Catch: java.lang.Exception -> L24
            java.lang.String[] r0 = r3.list(r0)     // Catch: java.lang.Exception -> L24
            int r0 = r0.length     // Catch: java.lang.Exception -> L24
            if (r0 <= 0) goto L22
            goto L23
        L22:
            r1 = 0
        L23:
            return r1
        L24:
            return r2
        L25:
            boolean r0 = super.exists()
            return r0
    }

    @Override // com.badlogic.gdx.files.FileHandle
    public java.io.File file() {
            r3 = this;
            com.badlogic.gdx.Files$FileType r0 = r3.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Local
            if (r0 != r1) goto L18
            java.io.File r0 = new java.io.File
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = r1.getLocalStoragePath()
            java.io.File r2 = r3.file
            java.lang.String r2 = r2.getPath()
            r0.<init>(r1, r2)
            return r0
        L18:
            java.io.File r0 = super.file()
            return r0
    }

    public android.content.res.AssetFileDescriptor getAssetFileDescriptor() throws java.io.IOException {
            r2 = this;
            android.content.res.AssetManager r0 = r2.assets
            if (r0 == 0) goto Ld
            java.lang.String r1 = r2.path()
            android.content.res.AssetFileDescriptor r0 = r0.openFd(r1)
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Override // com.badlogic.gdx.files.FileHandle
    public boolean isDirectory() {
            r3 = this;
            com.badlogic.gdx.Files$FileType r0 = r3.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal
            if (r0 != r1) goto L18
            r0 = 0
            android.content.res.AssetManager r1 = r3.assets     // Catch: java.io.IOException -> L17
            java.io.File r2 = r3.file     // Catch: java.io.IOException -> L17
            java.lang.String r2 = r2.getPath()     // Catch: java.io.IOException -> L17
            java.lang.String[] r1 = r1.list(r2)     // Catch: java.io.IOException -> L17
            int r1 = r1.length     // Catch: java.io.IOException -> L17
            if (r1 <= 0) goto L17
            r0 = 1
        L17:
            return r0
        L18:
            boolean r0 = super.isDirectory()
            return r0
    }

    @Override // com.badlogic.gdx.files.FileHandle
    public long lastModified() {
            r2 = this;
            long r0 = super.lastModified()
            return r0
    }

    @Override // com.badlogic.gdx.files.FileHandle
    public long length() {
            r3 = this;
            com.badlogic.gdx.Files$FileType r0 = r3.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal
            if (r0 != r1) goto L28
            r0 = 0
            android.content.res.AssetManager r1 = r3.assets     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L22
            java.io.File r2 = r3.file     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L22
            java.lang.String r2 = r2.getPath()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L22
            android.content.res.AssetFileDescriptor r0 = r1.openFd(r2)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L22
            long r1 = r0.getLength()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L22
            r0.close()     // Catch: java.io.IOException -> L1a
        L1a:
            return r1
        L1b:
            r1 = move-exception
            if (r0 == 0) goto L21
            r0.close()     // Catch: java.io.IOException -> L21
        L21:
            throw r1
        L22:
            if (r0 == 0) goto L28
            r0.close()     // Catch: java.io.IOException -> L28
        L28:
            long r0 = super.length()
            return r0
    }

    @Override // com.badlogic.gdx.files.FileHandle
    public com.badlogic.gdx.files.FileHandle[] list() {
            r9 = this;
            com.badlogic.gdx.Files$FileType r0 = r9.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal
            if (r0 != r1) goto L59
            android.content.res.AssetManager r0 = r9.assets     // Catch: java.lang.Exception -> L30
            java.io.File r1 = r9.file     // Catch: java.lang.Exception -> L30
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Exception -> L30
            java.lang.String[] r0 = r0.list(r1)     // Catch: java.lang.Exception -> L30
            int r1 = r0.length     // Catch: java.lang.Exception -> L30
            com.badlogic.gdx.files.FileHandle[] r2 = new com.badlogic.gdx.files.FileHandle[r1]     // Catch: java.lang.Exception -> L30
            r3 = 0
        L16:
            if (r3 >= r1) goto L2f
            com.badlogic.gdx.backends.android.AndroidFileHandle r4 = new com.badlogic.gdx.backends.android.AndroidFileHandle     // Catch: java.lang.Exception -> L30
            android.content.res.AssetManager r5 = r9.assets     // Catch: java.lang.Exception -> L30
            java.io.File r6 = new java.io.File     // Catch: java.lang.Exception -> L30
            java.io.File r7 = r9.file     // Catch: java.lang.Exception -> L30
            r8 = r0[r3]     // Catch: java.lang.Exception -> L30
            r6.<init>(r7, r8)     // Catch: java.lang.Exception -> L30
            com.badlogic.gdx.Files$FileType r7 = r9.type     // Catch: java.lang.Exception -> L30
            r4.<init>(r5, r6, r7)     // Catch: java.lang.Exception -> L30
            r2[r3] = r4     // Catch: java.lang.Exception -> L30
            int r3 = r3 + 1
            goto L16
        L2f:
            return r2
        L30:
            r0 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error listing children: "
            r2.append(r3)
            java.io.File r3 = r9.file
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            com.badlogic.gdx.Files$FileType r3 = r9.type
            r2.append(r3)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L59:
            com.badlogic.gdx.files.FileHandle[] r0 = super.list()
            return r0
    }

    @Override // com.badlogic.gdx.files.FileHandle
    public com.badlogic.gdx.files.FileHandle[] list(java.io.FileFilter r12) {
            r11 = this;
            com.badlogic.gdx.Files$FileType r0 = r11.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal
            if (r0 != r1) goto L71
            android.content.res.AssetManager r0 = r11.assets     // Catch: java.lang.Exception -> L48
            java.io.File r1 = r11.file     // Catch: java.lang.Exception -> L48
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Exception -> L48
            java.lang.String[] r0 = r0.list(r1)     // Catch: java.lang.Exception -> L48
            int r1 = r0.length     // Catch: java.lang.Exception -> L48
            com.badlogic.gdx.files.FileHandle[] r2 = new com.badlogic.gdx.files.FileHandle[r1]     // Catch: java.lang.Exception -> L48
            r3 = 0
            r4 = 0
            r5 = 0
        L18:
            if (r4 >= r1) goto L3e
            r6 = r0[r4]     // Catch: java.lang.Exception -> L48
            com.badlogic.gdx.backends.android.AndroidFileHandle r7 = new com.badlogic.gdx.backends.android.AndroidFileHandle     // Catch: java.lang.Exception -> L48
            android.content.res.AssetManager r8 = r11.assets     // Catch: java.lang.Exception -> L48
            java.io.File r9 = new java.io.File     // Catch: java.lang.Exception -> L48
            java.io.File r10 = r11.file     // Catch: java.lang.Exception -> L48
            r9.<init>(r10, r6)     // Catch: java.lang.Exception -> L48
            com.badlogic.gdx.Files$FileType r6 = r11.type     // Catch: java.lang.Exception -> L48
            r7.<init>(r8, r9, r6)     // Catch: java.lang.Exception -> L48
            java.io.File r6 = r7.file()     // Catch: java.lang.Exception -> L48
            boolean r6 = r12.accept(r6)     // Catch: java.lang.Exception -> L48
            if (r6 != 0) goto L37
            goto L3b
        L37:
            r2[r5] = r7     // Catch: java.lang.Exception -> L48
            int r5 = r5 + 1
        L3b:
            int r4 = r4 + 1
            goto L18
        L3e:
            int r12 = r0.length     // Catch: java.lang.Exception -> L48
            if (r5 >= r12) goto L47
            com.badlogic.gdx.files.FileHandle[] r12 = new com.badlogic.gdx.files.FileHandle[r5]     // Catch: java.lang.Exception -> L48
            java.lang.System.arraycopy(r2, r3, r12, r3, r5)     // Catch: java.lang.Exception -> L48
            r2 = r12
        L47:
            return r2
        L48:
            r12 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error listing children: "
            r1.append(r2)
            java.io.File r2 = r11.file
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            com.badlogic.gdx.Files$FileType r2 = r11.type
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r12)
            throw r0
        L71:
            com.badlogic.gdx.files.FileHandle[] r12 = super.list(r12)
            return r12
    }

    @Override // com.badlogic.gdx.files.FileHandle
    public com.badlogic.gdx.files.FileHandle[] list(java.io.FilenameFilter r12) {
            r11 = this;
            com.badlogic.gdx.Files$FileType r0 = r11.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal
            if (r0 != r1) goto L6f
            android.content.res.AssetManager r0 = r11.assets     // Catch: java.lang.Exception -> L46
            java.io.File r1 = r11.file     // Catch: java.lang.Exception -> L46
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Exception -> L46
            java.lang.String[] r0 = r0.list(r1)     // Catch: java.lang.Exception -> L46
            int r1 = r0.length     // Catch: java.lang.Exception -> L46
            com.badlogic.gdx.files.FileHandle[] r2 = new com.badlogic.gdx.files.FileHandle[r1]     // Catch: java.lang.Exception -> L46
            r3 = 0
            r4 = 0
            r5 = 0
        L18:
            if (r4 >= r1) goto L3c
            r6 = r0[r4]     // Catch: java.lang.Exception -> L46
            java.io.File r7 = r11.file     // Catch: java.lang.Exception -> L46
            boolean r7 = r12.accept(r7, r6)     // Catch: java.lang.Exception -> L46
            if (r7 != 0) goto L25
            goto L39
        L25:
            com.badlogic.gdx.backends.android.AndroidFileHandle r7 = new com.badlogic.gdx.backends.android.AndroidFileHandle     // Catch: java.lang.Exception -> L46
            android.content.res.AssetManager r8 = r11.assets     // Catch: java.lang.Exception -> L46
            java.io.File r9 = new java.io.File     // Catch: java.lang.Exception -> L46
            java.io.File r10 = r11.file     // Catch: java.lang.Exception -> L46
            r9.<init>(r10, r6)     // Catch: java.lang.Exception -> L46
            com.badlogic.gdx.Files$FileType r6 = r11.type     // Catch: java.lang.Exception -> L46
            r7.<init>(r8, r9, r6)     // Catch: java.lang.Exception -> L46
            r2[r5] = r7     // Catch: java.lang.Exception -> L46
            int r5 = r5 + 1
        L39:
            int r4 = r4 + 1
            goto L18
        L3c:
            int r12 = r0.length     // Catch: java.lang.Exception -> L46
            if (r5 >= r12) goto L45
            com.badlogic.gdx.files.FileHandle[] r12 = new com.badlogic.gdx.files.FileHandle[r5]     // Catch: java.lang.Exception -> L46
            java.lang.System.arraycopy(r2, r3, r12, r3, r5)     // Catch: java.lang.Exception -> L46
            r2 = r12
        L45:
            return r2
        L46:
            r12 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error listing children: "
            r1.append(r2)
            java.io.File r2 = r11.file
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            com.badlogic.gdx.Files$FileType r2 = r11.type
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r12)
            throw r0
        L6f:
            com.badlogic.gdx.files.FileHandle[] r12 = super.list(r12)
            return r12
    }

    @Override // com.badlogic.gdx.files.FileHandle
    public com.badlogic.gdx.files.FileHandle[] list(java.lang.String r12) {
            r11 = this;
            com.badlogic.gdx.Files$FileType r0 = r11.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal
            if (r0 != r1) goto L6d
            android.content.res.AssetManager r0 = r11.assets     // Catch: java.lang.Exception -> L44
            java.io.File r1 = r11.file     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Exception -> L44
            java.lang.String[] r0 = r0.list(r1)     // Catch: java.lang.Exception -> L44
            int r1 = r0.length     // Catch: java.lang.Exception -> L44
            com.badlogic.gdx.files.FileHandle[] r2 = new com.badlogic.gdx.files.FileHandle[r1]     // Catch: java.lang.Exception -> L44
            r3 = 0
            r4 = 0
            r5 = 0
        L18:
            if (r4 >= r1) goto L3a
            r6 = r0[r4]     // Catch: java.lang.Exception -> L44
            boolean r7 = r6.endsWith(r12)     // Catch: java.lang.Exception -> L44
            if (r7 != 0) goto L23
            goto L37
        L23:
            com.badlogic.gdx.backends.android.AndroidFileHandle r7 = new com.badlogic.gdx.backends.android.AndroidFileHandle     // Catch: java.lang.Exception -> L44
            android.content.res.AssetManager r8 = r11.assets     // Catch: java.lang.Exception -> L44
            java.io.File r9 = new java.io.File     // Catch: java.lang.Exception -> L44
            java.io.File r10 = r11.file     // Catch: java.lang.Exception -> L44
            r9.<init>(r10, r6)     // Catch: java.lang.Exception -> L44
            com.badlogic.gdx.Files$FileType r6 = r11.type     // Catch: java.lang.Exception -> L44
            r7.<init>(r8, r9, r6)     // Catch: java.lang.Exception -> L44
            r2[r5] = r7     // Catch: java.lang.Exception -> L44
            int r5 = r5 + 1
        L37:
            int r4 = r4 + 1
            goto L18
        L3a:
            int r12 = r0.length     // Catch: java.lang.Exception -> L44
            if (r5 >= r12) goto L43
            com.badlogic.gdx.files.FileHandle[] r12 = new com.badlogic.gdx.files.FileHandle[r5]     // Catch: java.lang.Exception -> L44
            java.lang.System.arraycopy(r2, r3, r12, r3, r5)     // Catch: java.lang.Exception -> L44
            r2 = r12
        L43:
            return r2
        L44:
            r12 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error listing children: "
            r1.append(r2)
            java.io.File r2 = r11.file
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            com.badlogic.gdx.Files$FileType r2 = r11.type
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r12)
            throw r0
        L6d:
            com.badlogic.gdx.files.FileHandle[] r12 = super.list(r12)
            return r12
    }

    @Override // com.badlogic.gdx.files.FileHandle
    public java.nio.ByteBuffer map(java.nio.channels.FileChannel.MapMode r10) {
            r9 = this;
            com.badlogic.gdx.Files$FileType r0 = r9.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal
            if (r0 != r1) goto L63
            r0 = 0
            android.content.res.AssetFileDescriptor r1 = r9.getAssetFileDescriptor()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            long r4 = r1.getStartOffset()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            long r6 = r1.getDeclaredLength()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            java.io.FileDescriptor r1 = r1.getFileDescriptor()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            java.nio.channels.FileChannel r2 = r8.getChannel()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            r3 = r10
            java.nio.MappedByteBuffer r10 = r2.map(r3, r4, r6)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            r10.order(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r8)
            return r10
        L30:
            r10 = move-exception
            r0 = r8
            goto L5f
        L33:
            r10 = move-exception
            r0 = r8
            goto L39
        L36:
            r10 = move-exception
            goto L5f
        L38:
            r10 = move-exception
        L39:
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r2.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "Error memory mapping file: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L36
            r2.append(r9)     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = " ("
            r2.append(r3)     // Catch: java.lang.Throwable -> L36
            com.badlogic.gdx.Files$FileType r3 = r9.type     // Catch: java.lang.Throwable -> L36
            r2.append(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L36
            r1.<init>(r2, r10)     // Catch: java.lang.Throwable -> L36
            throw r1     // Catch: java.lang.Throwable -> L36
        L5f:
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            throw r10
        L63:
            java.nio.ByteBuffer r10 = super.map(r10)
            return r10
    }

    @Override // com.badlogic.gdx.files.FileHandle
    public com.badlogic.gdx.files.FileHandle parent() {
            r4 = this;
            java.io.File r0 = r4.file
            java.io.File r0 = r0.getParentFile()
            if (r0 != 0) goto L1d
            com.badlogic.gdx.Files$FileType r0 = r4.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Absolute
            if (r0 != r1) goto L16
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/"
            r0.<init>(r1)
            goto L1d
        L16:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ""
            r0.<init>(r1)
        L1d:
            com.badlogic.gdx.backends.android.AndroidFileHandle r1 = new com.badlogic.gdx.backends.android.AndroidFileHandle
            android.content.res.AssetManager r2 = r4.assets
            com.badlogic.gdx.Files$FileType r3 = r4.type
            r1.<init>(r2, r0, r3)
            return r1
    }

    @Override // com.badlogic.gdx.files.FileHandle
    public java.io.InputStream read() {
            r4 = this;
            com.badlogic.gdx.Files$FileType r0 = r4.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal
            if (r0 != r1) goto L3c
            android.content.res.AssetManager r0 = r4.assets     // Catch: java.io.IOException -> L13
            java.io.File r1 = r4.file     // Catch: java.io.IOException -> L13
            java.lang.String r1 = r1.getPath()     // Catch: java.io.IOException -> L13
            java.io.InputStream r0 = r0.open(r1)     // Catch: java.io.IOException -> L13
            return r0
        L13:
            r0 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error reading file: "
            r2.append(r3)
            java.io.File r3 = r4.file
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            com.badlogic.gdx.Files$FileType r3 = r4.type
            r2.append(r3)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L3c:
            java.io.InputStream r0 = super.read()
            return r0
    }

    @Override // com.badlogic.gdx.files.FileHandle
    public com.badlogic.gdx.files.FileHandle sibling(java.lang.String r4) {
            r3 = this;
            r0 = 92
            r1 = 47
            java.lang.String r4 = r4.replace(r0, r1)
            java.io.File r0 = r3.file
            java.lang.String r0 = r0.getPath()
            int r0 = r0.length()
            if (r0 == 0) goto L2c
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.io.File r1 = new java.io.File
            java.io.File r2 = r3.file
            java.lang.String r2 = r2.getParent()
            r1.<init>(r2, r4)
            java.lang.String r4 = r1.getPath()
            com.badlogic.gdx.Files$FileType r1 = r3.type
            com.badlogic.gdx.files.FileHandle r4 = r0.getFileHandle(r4, r1)
            return r4
        L2c:
            com.badlogic.gdx.utils.GdxRuntimeException r4 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r0 = "Cannot get the sibling of the root."
            r4.<init>(r0)
            throw r4
    }
}
