package com.badlogic.gdx.files;

/* loaded from: classes.dex */
public class FileHandle {
    protected java.io.File file;
    protected com.badlogic.gdx.Files.FileType type;

    /* renamed from: com.badlogic.gdx.files.FileHandle$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$Files$FileType = null;

        static {
                com.badlogic.gdx.Files$FileType[] r0 = com.badlogic.gdx.Files.FileType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.badlogic.gdx.files.FileHandle.AnonymousClass1.$SwitchMap$com$badlogic$gdx$Files$FileType = r0
                com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.badlogic.gdx.files.FileHandle.AnonymousClass1.$SwitchMap$com$badlogic$gdx$Files$FileType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Classpath     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.badlogic.gdx.files.FileHandle.AnonymousClass1.$SwitchMap$com$badlogic$gdx$Files$FileType     // Catch: java.lang.NoSuchFieldError -> L28
                com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Absolute     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.badlogic.gdx.files.FileHandle.AnonymousClass1.$SwitchMap$com$badlogic$gdx$Files$FileType     // Catch: java.lang.NoSuchFieldError -> L33
                com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.External     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    protected FileHandle() {
            r0 = this;
            r0.<init>()
            return
    }

    public FileHandle(java.io.File r1) {
            r0 = this;
            r0.<init>()
            r0.file = r1
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Absolute
            r0.type = r1
            return
    }

    protected FileHandle(java.io.File r1, com.badlogic.gdx.Files.FileType r2) {
            r0 = this;
            r0.<init>()
            r0.file = r1
            r0.type = r2
            return
    }

    public FileHandle(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r1.file = r0
            com.badlogic.gdx.Files$FileType r2 = com.badlogic.gdx.Files.FileType.Absolute
            r1.type = r2
            return
    }

    protected FileHandle(java.lang.String r1, com.badlogic.gdx.Files.FileType r2) {
            r0 = this;
            r0.<init>()
            r0.type = r2
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            r0.file = r2
            return
    }

    private static void copyDirectory(com.badlogic.gdx.files.FileHandle r5, com.badlogic.gdx.files.FileHandle r6) {
            r6.mkdirs()
            com.badlogic.gdx.files.FileHandle[] r5 = r5.list()
            int r0 = r5.length
            r1 = 0
        L9:
            if (r1 >= r0) goto L25
            r2 = r5[r1]
            java.lang.String r3 = r2.name()
            com.badlogic.gdx.files.FileHandle r3 = r6.child(r3)
            boolean r4 = r2.isDirectory()
            if (r4 == 0) goto L1f
            copyDirectory(r2, r3)
            goto L22
        L1f:
            copyFile(r2, r3)
        L22:
            int r1 = r1 + 1
            goto L9
        L25:
            return
    }

    private static void copyFile(com.badlogic.gdx.files.FileHandle r4, com.badlogic.gdx.files.FileHandle r5) {
            java.io.InputStream r0 = r4.read()     // Catch: java.lang.Exception -> L9
            r1 = 0
            r5.write(r0, r1)     // Catch: java.lang.Exception -> L9
            return
        L9:
            r0 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error copying source file: "
            r2.append(r3)
            java.io.File r3 = r4.file
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            com.badlogic.gdx.Files$FileType r4 = r4.type
            r2.append(r4)
            java.lang.String r4 = ")\nTo destination: "
            r2.append(r4)
            java.io.File r4 = r5.file
            r2.append(r4)
            r2.append(r3)
            com.badlogic.gdx.Files$FileType r4 = r5.type
            r2.append(r4)
            java.lang.String r4 = ")"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
    }

    private static boolean deleteDirectory(java.io.File r1) {
            r0 = 0
            emptyDirectory(r1, r0)
            boolean r1 = r1.delete()
            return r1
    }

    private static void emptyDirectory(java.io.File r4, boolean r5) {
            boolean r0 = r4.exists()
            if (r0 == 0) goto L2f
            java.io.File[] r4 = r4.listFiles()
            if (r4 == 0) goto L2f
            r0 = 0
            int r1 = r4.length
        Le:
            if (r0 >= r1) goto L2f
            r2 = r4[r0]
            boolean r2 = r2.isDirectory()
            if (r2 != 0) goto L1e
            r2 = r4[r0]
            r2.delete()
            goto L2c
        L1e:
            if (r5 == 0) goto L27
            r2 = r4[r0]
            r3 = 1
            emptyDirectory(r2, r3)
            goto L2c
        L27:
            r2 = r4[r0]
            deleteDirectory(r2)
        L2c:
            int r0 = r0 + 1
            goto Le
        L2f:
            return
    }

    private int estimateLength() {
            r2 = this;
            long r0 = r2.length()
            int r1 = (int) r0
            if (r1 == 0) goto L8
            goto La
        L8:
            r1 = 512(0x200, float:7.175E-43)
        La:
            return r1
    }

    public static com.badlogic.gdx.files.FileHandle tempDirectory(java.lang.String r3) {
            r0 = 0
            java.io.File r3 = java.io.File.createTempFile(r3, r0)     // Catch: java.io.IOException -> L45
            boolean r0 = r3.delete()     // Catch: java.io.IOException -> L45
            if (r0 == 0) goto L2e
            boolean r0 = r3.mkdir()     // Catch: java.io.IOException -> L45
            if (r0 == 0) goto L17
            com.badlogic.gdx.files.FileHandle r0 = new com.badlogic.gdx.files.FileHandle     // Catch: java.io.IOException -> L45
            r0.<init>(r3)     // Catch: java.io.IOException -> L45
            return r0
        L17:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.IOException -> L45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L45
            r1.<init>()     // Catch: java.io.IOException -> L45
            java.lang.String r2 = "Unable to create temp directory: "
            r1.append(r2)     // Catch: java.io.IOException -> L45
            r1.append(r3)     // Catch: java.io.IOException -> L45
            java.lang.String r3 = r1.toString()     // Catch: java.io.IOException -> L45
            r0.<init>(r3)     // Catch: java.io.IOException -> L45
            throw r0     // Catch: java.io.IOException -> L45
        L2e:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.IOException -> L45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L45
            r1.<init>()     // Catch: java.io.IOException -> L45
            java.lang.String r2 = "Unable to delete temp file: "
            r1.append(r2)     // Catch: java.io.IOException -> L45
            r1.append(r3)     // Catch: java.io.IOException -> L45
            java.lang.String r3 = r1.toString()     // Catch: java.io.IOException -> L45
            r0.<init>(r3)     // Catch: java.io.IOException -> L45
            throw r0     // Catch: java.io.IOException -> L45
        L45:
            r3 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Unable to create temp file."
            r0.<init>(r1, r3)
            throw r0
    }

    public static com.badlogic.gdx.files.FileHandle tempFile(java.lang.String r2) {
            com.badlogic.gdx.files.FileHandle r0 = new com.badlogic.gdx.files.FileHandle     // Catch: java.io.IOException -> Lb
            r1 = 0
            java.io.File r2 = java.io.File.createTempFile(r2, r1)     // Catch: java.io.IOException -> Lb
            r0.<init>(r2)     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r2 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Unable to create temp file."
            r0.<init>(r1, r2)
            throw r0
    }

    public com.badlogic.gdx.files.FileHandle child(java.lang.String r4) {
            r3 = this;
            java.io.File r0 = r3.file
            java.lang.String r0 = r0.getPath()
            int r0 = r0.length()
            if (r0 != 0) goto L19
            com.badlogic.gdx.files.FileHandle r0 = new com.badlogic.gdx.files.FileHandle
            java.io.File r1 = new java.io.File
            r1.<init>(r4)
            com.badlogic.gdx.Files$FileType r4 = r3.type
            r0.<init>(r1, r4)
            return r0
        L19:
            com.badlogic.gdx.files.FileHandle r0 = new com.badlogic.gdx.files.FileHandle
            java.io.File r1 = new java.io.File
            java.io.File r2 = r3.file
            r1.<init>(r2, r4)
            com.badlogic.gdx.Files$FileType r4 = r3.type
            r0.<init>(r1, r4)
            return r0
    }

    public void copyTo(com.badlogic.gdx.files.FileHandle r4) {
            r3 = this;
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto L18
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L14
            java.lang.String r0 = r3.name()
            com.badlogic.gdx.files.FileHandle r4 = r4.child(r0)
        L14:
            copyFile(r3, r4)
            return
        L18:
            boolean r0 = r4.exists()
            if (r0 == 0) goto L3c
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L25
            goto L45
        L25:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Destination exists but is not a directory: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L3c:
            r4.mkdirs()
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L51
        L45:
            java.lang.String r0 = r3.name()
            com.badlogic.gdx.files.FileHandle r4 = r4.child(r0)
            copyDirectory(r3, r4)
            return
        L51:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Destination directory cannot be created: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public boolean delete() {
            r3 = this;
            com.badlogic.gdx.Files$FileType r0 = r3.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Classpath
            if (r0 == r1) goto L2c
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal
            if (r0 == r1) goto L13
            java.io.File r0 = r3.file()
            boolean r0 = r0.delete()
            return r0
        L13:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot delete an internal file: "
            r1.append(r2)
            java.io.File r2 = r3.file
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2c:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot delete a classpath file: "
            r1.append(r2)
            java.io.File r2 = r3.file
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public boolean deleteDirectory() {
            r3 = this;
            com.badlogic.gdx.Files$FileType r0 = r3.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Classpath
            if (r0 == r1) goto L2c
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal
            if (r0 == r1) goto L13
            java.io.File r0 = r3.file()
            boolean r0 = deleteDirectory(r0)
            return r0
        L13:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot delete an internal file: "
            r1.append(r2)
            java.io.File r2 = r3.file
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2c:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot delete a classpath file: "
            r1.append(r2)
            java.io.File r2 = r3.file
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void emptyDirectory() {
            r1 = this;
            r0 = 0
            r1.emptyDirectory(r0)
            return
    }

    public void emptyDirectory(boolean r3) {
            r2 = this;
            com.badlogic.gdx.Files$FileType r0 = r2.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Classpath
            if (r0 == r1) goto L2b
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal
            if (r0 == r1) goto L12
            java.io.File r0 = r2.file()
            emptyDirectory(r0, r3)
            return
        L12:
            com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot delete an internal file: "
            r0.append(r1)
            java.io.File r1 = r2.file
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L2b:
            com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot delete a classpath file: "
            r0.append(r1)
            java.io.File r1 = r2.file
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.badlogic.gdx.files.FileHandle
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.badlogic.gdx.files.FileHandle r4 = (com.badlogic.gdx.files.FileHandle) r4
            com.badlogic.gdx.Files$FileType r0 = r3.type
            com.badlogic.gdx.Files$FileType r2 = r4.type
            if (r0 != r2) goto L1d
            java.lang.String r0 = r3.path()
            java.lang.String r4 = r4.path()
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L1d
            r1 = 1
        L1d:
            return r1
    }

    public boolean exists() {
            r6 = this;
            int[] r0 = com.badlogic.gdx.files.FileHandle.AnonymousClass1.$SwitchMap$com$badlogic$gdx$Files$FileType
            com.badlogic.gdx.Files$FileType r1 = r6.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L19
            r2 = 2
            if (r0 == r2) goto L24
            java.io.File r0 = r6.file()
            boolean r0 = r0.exists()
            return r0
        L19:
            java.io.File r0 = r6.file()
            boolean r0 = r0.exists()
            if (r0 == 0) goto L24
            return r1
        L24:
            java.lang.Class<com.badlogic.gdx.files.FileHandle> r0 = com.badlogic.gdx.files.FileHandle.class
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "/"
            r2.append(r3)
            java.io.File r3 = r6.file
            java.lang.String r3 = r3.getPath()
            r4 = 92
            r5 = 47
            java.lang.String r3 = r3.replace(r4, r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.net.URL r0 = r0.getResource(r2)
            if (r0 == 0) goto L4c
            goto L4d
        L4c:
            r1 = 0
        L4d:
            return r1
    }

    public java.lang.String extension() {
            r3 = this;
            java.io.File r0 = r3.file
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            r2 = -1
            if (r1 != r2) goto L12
            java.lang.String r0 = ""
            return r0
        L12:
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
            return r0
    }

    public java.io.File file() {
            r3 = this;
            com.badlogic.gdx.Files$FileType r0 = r3.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.External
            if (r0 != r1) goto L18
            java.io.File r0 = new java.io.File
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = r1.getExternalStoragePath()
            java.io.File r2 = r3.file
            java.lang.String r2 = r2.getPath()
            r0.<init>(r1, r2)
            return r0
        L18:
            java.io.File r0 = r3.file
            return r0
    }

    public int hashCode() {
            r2 = this;
            com.badlogic.gdx.Files$FileType r0 = r2.type
            int r0 = r0.hashCode()
            r1 = 37
            int r1 = r1 + r0
            int r1 = r1 * 67
            java.lang.String r0 = r2.path()
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public boolean isDirectory() {
            r2 = this;
            com.badlogic.gdx.Files$FileType r0 = r2.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Classpath
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            java.io.File r0 = r2.file()
            boolean r0 = r0.isDirectory()
            return r0
    }

    public long lastModified() {
            r2 = this;
            java.io.File r0 = r2.file()
            long r0 = r0.lastModified()
            return r0
    }

    public long length() {
            r3 = this;
            com.badlogic.gdx.Files$FileType r0 = r3.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Classpath
            if (r0 == r1) goto L1c
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal
            if (r0 != r1) goto L13
            java.io.File r0 = r3.file
            boolean r0 = r0.exists()
            if (r0 != 0) goto L13
            goto L1c
        L13:
            java.io.File r0 = r3.file()
            long r0 = r0.length()
            return r0
        L1c:
            java.io.InputStream r0 = r3.read()
            int r1 = r0.available()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            long r1 = (long) r1
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            return r1
        L29:
            r1 = move-exception
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            throw r1
        L2e:
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            r0 = 0
            return r0
    }

    public com.badlogic.gdx.files.FileHandle[] list() {
            r5 = this;
            com.badlogic.gdx.Files$FileType r0 = r5.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Classpath
            if (r0 == r1) goto L26
            java.io.File r0 = r5.file()
            java.lang.String[] r0 = r0.list()
            r1 = 0
            if (r0 != 0) goto L14
            com.badlogic.gdx.files.FileHandle[] r0 = new com.badlogic.gdx.files.FileHandle[r1]
            return r0
        L14:
            int r2 = r0.length
            com.badlogic.gdx.files.FileHandle[] r2 = new com.badlogic.gdx.files.FileHandle[r2]
            int r3 = r0.length
        L18:
            if (r1 >= r3) goto L25
            r4 = r0[r1]
            com.badlogic.gdx.files.FileHandle r4 = r5.child(r4)
            r2[r1] = r4
            int r1 = r1 + 1
            goto L18
        L25:
            return r2
        L26:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot list a classpath directory: "
            r1.append(r2)
            java.io.File r2 = r5.file
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public com.badlogic.gdx.files.FileHandle[] list(java.io.FileFilter r9) {
            r8 = this;
            com.badlogic.gdx.Files$FileType r0 = r8.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Classpath
            if (r0 == r1) goto L3e
            java.io.File r0 = r8.file()
            java.lang.String[] r0 = r0.list()
            r1 = 0
            if (r0 != 0) goto L14
            com.badlogic.gdx.files.FileHandle[] r9 = new com.badlogic.gdx.files.FileHandle[r1]
            return r9
        L14:
            int r2 = r0.length
            com.badlogic.gdx.files.FileHandle[] r2 = new com.badlogic.gdx.files.FileHandle[r2]
            int r3 = r0.length
            r4 = 0
            r5 = 0
        L1a:
            if (r4 >= r3) goto L34
            r6 = r0[r4]
            com.badlogic.gdx.files.FileHandle r6 = r8.child(r6)
            java.io.File r7 = r6.file()
            boolean r7 = r9.accept(r7)
            if (r7 != 0) goto L2d
            goto L31
        L2d:
            r2[r5] = r6
            int r5 = r5 + 1
        L31:
            int r4 = r4 + 1
            goto L1a
        L34:
            int r9 = r0.length
            if (r5 >= r9) goto L3d
            com.badlogic.gdx.files.FileHandle[] r9 = new com.badlogic.gdx.files.FileHandle[r5]
            java.lang.System.arraycopy(r2, r1, r9, r1, r5)
            r2 = r9
        L3d:
            return r2
        L3e:
            com.badlogic.gdx.utils.GdxRuntimeException r9 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot list a classpath directory: "
            r0.append(r1)
            java.io.File r1 = r8.file
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
    }

    public com.badlogic.gdx.files.FileHandle[] list(java.io.FilenameFilter r10) {
            r9 = this;
            com.badlogic.gdx.Files$FileType r0 = r9.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Classpath
            if (r0 == r1) goto L3a
            java.io.File r0 = r9.file()
            java.lang.String[] r1 = r0.list()
            r2 = 0
            if (r1 != 0) goto L14
            com.badlogic.gdx.files.FileHandle[] r10 = new com.badlogic.gdx.files.FileHandle[r2]
            return r10
        L14:
            int r3 = r1.length
            com.badlogic.gdx.files.FileHandle[] r3 = new com.badlogic.gdx.files.FileHandle[r3]
            int r4 = r1.length
            r5 = 0
            r6 = 0
        L1a:
            if (r5 >= r4) goto L30
            r7 = r1[r5]
            boolean r8 = r10.accept(r0, r7)
            if (r8 != 0) goto L25
            goto L2d
        L25:
            com.badlogic.gdx.files.FileHandle r7 = r9.child(r7)
            r3[r6] = r7
            int r6 = r6 + 1
        L2d:
            int r5 = r5 + 1
            goto L1a
        L30:
            int r10 = r1.length
            if (r6 >= r10) goto L39
            com.badlogic.gdx.files.FileHandle[] r10 = new com.badlogic.gdx.files.FileHandle[r6]
            java.lang.System.arraycopy(r3, r2, r10, r2, r6)
            r3 = r10
        L39:
            return r3
        L3a:
            com.badlogic.gdx.utils.GdxRuntimeException r10 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot list a classpath directory: "
            r0.append(r1)
            java.io.File r1 = r9.file
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
    }

    public com.badlogic.gdx.files.FileHandle[] list(java.lang.String r9) {
            r8 = this;
            com.badlogic.gdx.Files$FileType r0 = r8.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Classpath
            if (r0 == r1) goto L3a
            java.io.File r0 = r8.file()
            java.lang.String[] r0 = r0.list()
            r1 = 0
            if (r0 != 0) goto L14
            com.badlogic.gdx.files.FileHandle[] r9 = new com.badlogic.gdx.files.FileHandle[r1]
            return r9
        L14:
            int r2 = r0.length
            com.badlogic.gdx.files.FileHandle[] r2 = new com.badlogic.gdx.files.FileHandle[r2]
            int r3 = r0.length
            r4 = 0
            r5 = 0
        L1a:
            if (r4 >= r3) goto L30
            r6 = r0[r4]
            boolean r7 = r6.endsWith(r9)
            if (r7 != 0) goto L25
            goto L2d
        L25:
            com.badlogic.gdx.files.FileHandle r6 = r8.child(r6)
            r2[r5] = r6
            int r5 = r5 + 1
        L2d:
            int r4 = r4 + 1
            goto L1a
        L30:
            int r9 = r0.length
            if (r5 >= r9) goto L39
            com.badlogic.gdx.files.FileHandle[] r9 = new com.badlogic.gdx.files.FileHandle[r5]
            java.lang.System.arraycopy(r2, r1, r9, r1, r5)
            r2 = r9
        L39:
            return r2
        L3a:
            com.badlogic.gdx.utils.GdxRuntimeException r9 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot list a classpath directory: "
            r0.append(r1)
            java.io.File r1 = r8.file
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
    }

    public java.nio.ByteBuffer map() {
            r1 = this;
            java.nio.channels.FileChannel$MapMode r0 = java.nio.channels.FileChannel.MapMode.READ_ONLY
            java.nio.ByteBuffer r0 = r1.map(r0)
            return r0
    }

    public java.nio.ByteBuffer map(java.nio.channels.FileChannel.MapMode r11) {
            r10 = this;
            com.badlogic.gdx.Files$FileType r0 = r10.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Classpath
            if (r0 == r1) goto L66
            r0 = 0
            java.io.File r1 = r10.file()     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            if (r11 != r3) goto L14
            java.lang.String r3 = "r"
            goto L16
        L14:
            java.lang.String r3 = "rw"
        L16:
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.nio.channels.FileChannel r4 = r2.getChannel()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            r6 = 0
            long r8 = r1.length()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            r5 = r11
            java.nio.MappedByteBuffer r11 = r4.map(r5, r6, r8)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            r11.order(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r2)
            return r11
        L33:
            r11 = move-exception
            r0 = r2
            goto L62
        L36:
            r11 = move-exception
            r0 = r2
            goto L3c
        L39:
            r11 = move-exception
            goto L62
        L3b:
            r11 = move-exception
        L3c:
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r2.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "Error memory mapping file: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L39
            r2.append(r10)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = " ("
            r2.append(r3)     // Catch: java.lang.Throwable -> L39
            com.badlogic.gdx.Files$FileType r3 = r10.type     // Catch: java.lang.Throwable -> L39
            r2.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L39
            r1.<init>(r2, r11)     // Catch: java.lang.Throwable -> L39
            throw r1     // Catch: java.lang.Throwable -> L39
        L62:
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            throw r11
        L66:
            com.badlogic.gdx.utils.GdxRuntimeException r11 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot map a classpath file: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
    }

    public void mkdirs() {
            r3 = this;
            com.badlogic.gdx.Files$FileType r0 = r3.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Classpath
            if (r0 == r1) goto L2b
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal
            if (r0 == r1) goto L12
            java.io.File r0 = r3.file()
            r0.mkdirs()
            return
        L12:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot mkdirs with an internal file: "
            r1.append(r2)
            java.io.File r2 = r3.file
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2b:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot mkdirs with a classpath file: "
            r1.append(r2)
            java.io.File r2 = r3.file
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void moveTo(com.badlogic.gdx.files.FileHandle r3) {
            r2 = this;
            int[] r0 = com.badlogic.gdx.files.FileHandle.AnonymousClass1.$SwitchMap$com$badlogic$gdx$Files$FileType
            com.badlogic.gdx.Files$FileType r1 = r2.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L55
            r1 = 2
            if (r0 == r1) goto L3c
            r1 = 3
            if (r0 == r1) goto L17
            r1 = 4
            if (r0 == r1) goto L17
            goto L26
        L17:
            java.io.File r0 = r2.file()
            java.io.File r1 = r3.file()
            boolean r0 = r0.renameTo(r1)
            if (r0 == 0) goto L26
            return
        L26:
            r2.copyTo(r3)
            r2.delete()
            boolean r3 = r2.exists()
            if (r3 == 0) goto L3b
            boolean r3 = r2.isDirectory()
            if (r3 == 0) goto L3b
            r2.deleteDirectory()
        L3b:
            return
        L3c:
            com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot move a classpath file: "
            r0.append(r1)
            java.io.File r1 = r2.file
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L55:
            com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot move an internal file: "
            r0.append(r1)
            java.io.File r1 = r2.file
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public java.lang.String name() {
            r1 = this;
            java.io.File r0 = r1.file
            java.lang.String r0 = r0.getName()
            return r0
    }

    public java.lang.String nameWithoutExtension() {
            r3 = this;
            java.io.File r0 = r3.file
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            r2 = -1
            if (r1 != r2) goto L10
            return r0
        L10:
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            return r0
    }

    public com.badlogic.gdx.files.FileHandle parent() {
            r3 = this;
            java.io.File r0 = r3.file
            java.io.File r0 = r0.getParentFile()
            if (r0 != 0) goto L1d
            com.badlogic.gdx.Files$FileType r0 = r3.type
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
            com.badlogic.gdx.files.FileHandle r1 = new com.badlogic.gdx.files.FileHandle
            com.badlogic.gdx.Files$FileType r2 = r3.type
            r1.<init>(r0, r2)
            return r1
    }

    public java.lang.String path() {
            r3 = this;
            java.io.File r0 = r3.file
            java.lang.String r0 = r0.getPath()
            r1 = 92
            r2 = 47
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    public java.lang.String pathWithoutExtension() {
            r3 = this;
            java.io.File r0 = r3.file
            java.lang.String r0 = r0.getPath()
            r1 = 92
            r2 = 47
            java.lang.String r0 = r0.replace(r1, r2)
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            r2 = -1
            if (r1 != r2) goto L18
            return r0
        L18:
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            return r0
    }

    public java.io.BufferedInputStream read(int r3) {
            r2 = this;
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.io.InputStream r1 = r2.read()
            r0.<init>(r1, r3)
            return r0
    }

    public java.io.InputStream read() {
            r7 = this;
            com.badlogic.gdx.Files$FileType r0 = r7.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Classpath
            java.lang.String r2 = ")"
            java.lang.String r3 = " ("
            if (r0 == r1) goto L86
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal
            if (r0 != r1) goto L18
            java.io.File r0 = r7.file()
            boolean r0 = r0.exists()
            if (r0 == 0) goto L86
        L18:
            com.badlogic.gdx.Files$FileType r0 = r7.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Local
            if (r0 != r1) goto L29
            java.io.File r0 = r7.file()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L29
            goto L86
        L29:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L33
            java.io.File r1 = r7.file()     // Catch: java.lang.Exception -> L33
            r0.<init>(r1)     // Catch: java.lang.Exception -> L33
            return r0
        L33:
            r0 = move-exception
            java.io.File r1 = r7.file()
            boolean r1 = r1.isDirectory()
            if (r1 == 0) goto L62
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Cannot open a stream to a directory: "
            r4.append(r5)
            java.io.File r5 = r7.file
            r4.append(r5)
            r4.append(r3)
            com.badlogic.gdx.Files$FileType r3 = r7.type
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2, r0)
            throw r1
        L62:
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Error reading file: "
            r4.append(r5)
            java.io.File r5 = r7.file
            r4.append(r5)
            r4.append(r3)
            com.badlogic.gdx.Files$FileType r3 = r7.type
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2, r0)
            throw r1
        L86:
            java.lang.Class<com.badlogic.gdx.files.FileHandle> r0 = com.badlogic.gdx.files.FileHandle.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "/"
            r1.append(r4)
            java.io.File r4 = r7.file
            java.lang.String r4 = r4.getPath()
            r5 = 92
            r6 = 47
            java.lang.String r4 = r4.replace(r5, r6)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto Lae
            return r0
        Lae:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "File not found: "
            r1.append(r4)
            java.io.File r4 = r7.file
            r1.append(r4)
            r1.append(r3)
            com.badlogic.gdx.Files$FileType r3 = r7.type
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public int readBytes(byte[] r5, int r6, int r7) {
            r4 = this;
            java.io.InputStream r0 = r4.read()
            r1 = 0
        L5:
            int r2 = r6 + r1
            int r3 = r7 - r1
            int r2 = r0.read(r5, r2, r3)     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            if (r2 > 0) goto L14
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            int r1 = r1 - r6
            return r1
        L14:
            int r1 = r1 + r2
            goto L5
        L16:
            r5 = move-exception
            goto L30
        L18:
            r5 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r6 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r7.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "Error reading file: "
            r7.append(r1)     // Catch: java.lang.Throwable -> L16
            r7.append(r4)     // Catch: java.lang.Throwable -> L16
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L16
            r6.<init>(r7, r5)     // Catch: java.lang.Throwable -> L16
            throw r6     // Catch: java.lang.Throwable -> L16
        L30:
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            throw r5
    }

    public byte[] readBytes() {
            r5 = this;
            java.io.InputStream r0 = r5.read()
            int r1 = r5.estimateLength()     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L12
            byte[] r1 = com.badlogic.gdx.utils.StreamUtils.copyStreamToByteArray(r0, r1)     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L12
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            return r1
        L10:
            r1 = move-exception
            goto L2a
        L12:
            r1 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r3.<init>()     // Catch: java.lang.Throwable -> L10
            java.lang.String r4 = "Error reading file: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L10
            r3.append(r5)     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L10
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L10
            throw r2     // Catch: java.lang.Throwable -> L10
        L2a:
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            throw r1
    }

    public java.lang.String readString() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.readString(r0)
            return r0
    }

    public java.lang.String readString(java.lang.String r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.estimateLength()
            r0.<init>(r1)
            r1 = 0
            if (r5 != 0) goto L17
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.io.InputStream r2 = r4.read()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r1 = r5
            goto L21
        L17:
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.io.InputStream r3 = r4.read()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r1 = r2
        L21:
            r5 = 256(0x100, float:3.59E-43)
            char[] r5 = new char[r5]     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
        L25:
            int r2 = r1.read(r5)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r3 = -1
            if (r2 != r3) goto L34
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r1)
            java.lang.String r5 = r0.toString()
            return r5
        L34:
            r3 = 0
            r0.append(r5, r3, r2)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            goto L25
        L39:
            r5 = move-exception
            goto L53
        L3b:
            r5 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r2.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "Error reading layout file: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L39
            r2.append(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L39
            r0.<init>(r2, r5)     // Catch: java.lang.Throwable -> L39
            throw r0     // Catch: java.lang.Throwable -> L39
        L53:
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r1)
            throw r5
    }

    public java.io.BufferedReader reader(int r4) {
            r3 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r2 = r3.read()
            r1.<init>(r2)
            r0.<init>(r1, r4)
            return r0
    }

    public java.io.BufferedReader reader(int r4, java.lang.String r5) {
            r3 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.io.UnsupportedEncodingException -> Lf
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.io.UnsupportedEncodingException -> Lf
            java.io.InputStream r2 = r3.read()     // Catch: java.io.UnsupportedEncodingException -> Lf
            r1.<init>(r2, r5)     // Catch: java.io.UnsupportedEncodingException -> Lf
            r0.<init>(r1, r4)     // Catch: java.io.UnsupportedEncodingException -> Lf
            return r0
        Lf:
            r4 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r5 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error reading file: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0, r4)
            throw r5
    }

    public java.io.Reader reader() {
            r2 = this;
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.InputStream r1 = r2.read()
            r0.<init>(r1)
            return r0
    }

    public java.io.Reader reader(java.lang.String r4) {
            r3 = this;
            java.io.InputStream r0 = r3.read()
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.io.UnsupportedEncodingException -> La
            r1.<init>(r0, r4)     // Catch: java.io.UnsupportedEncodingException -> La
            return r1
        La:
            r4 = move-exception
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error reading file: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
    }

    public com.badlogic.gdx.files.FileHandle sibling(java.lang.String r4) {
            r3 = this;
            java.io.File r0 = r3.file
            java.lang.String r0 = r0.getPath()
            int r0 = r0.length()
            if (r0 == 0) goto L1f
            com.badlogic.gdx.files.FileHandle r0 = new com.badlogic.gdx.files.FileHandle
            java.io.File r1 = new java.io.File
            java.io.File r2 = r3.file
            java.lang.String r2 = r2.getParent()
            r1.<init>(r2, r4)
            com.badlogic.gdx.Files$FileType r4 = r3.type
            r0.<init>(r1, r4)
            return r0
        L1f:
            com.badlogic.gdx.utils.GdxRuntimeException r4 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r0 = "Cannot get the sibling of the root."
            r4.<init>(r0)
            throw r4
    }

    public java.lang.String toString() {
            r3 = this;
            java.io.File r0 = r3.file
            java.lang.String r0 = r0.getPath()
            r1 = 92
            r2 = 47
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    public com.badlogic.gdx.Files.FileType type() {
            r1 = this;
            com.badlogic.gdx.Files$FileType r0 = r1.type
            return r0
    }

    public java.io.OutputStream write(boolean r6) {
            r5 = this;
            com.badlogic.gdx.Files$FileType r0 = r5.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Classpath
            if (r0 == r1) goto L8b
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal
            if (r0 == r1) goto L72
            com.badlogic.gdx.files.FileHandle r0 = r5.parent()
            r0.mkdirs()
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L1b
            java.io.File r1 = r5.file()     // Catch: java.lang.Exception -> L1b
            r0.<init>(r1, r6)     // Catch: java.lang.Exception -> L1b
            return r0
        L1b:
            r6 = move-exception
            java.io.File r0 = r5.file()
            boolean r0 = r0.isDirectory()
            java.lang.String r1 = ")"
            java.lang.String r2 = " ("
            if (r0 == 0) goto L4e
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot open a stream to a directory: "
            r3.append(r4)
            java.io.File r4 = r5.file
            r3.append(r4)
            r3.append(r2)
            com.badlogic.gdx.Files$FileType r2 = r5.type
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1, r6)
            throw r0
        L4e:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Error writing file: "
            r3.append(r4)
            java.io.File r4 = r5.file
            r3.append(r4)
            r3.append(r2)
            com.badlogic.gdx.Files$FileType r2 = r5.type
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1, r6)
            throw r0
        L72:
            com.badlogic.gdx.utils.GdxRuntimeException r6 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot write to an internal file: "
            r0.append(r1)
            java.io.File r1 = r5.file
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L8b:
            com.badlogic.gdx.utils.GdxRuntimeException r6 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot write to a classpath file: "
            r0.append(r1)
            java.io.File r1 = r5.file
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    public java.io.OutputStream write(boolean r2, int r3) {
            r1 = this;
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            java.io.OutputStream r2 = r1.write(r2)
            r0.<init>(r2, r3)
            return r0
    }

    public void write(java.io.InputStream r5, boolean r6) {
            r4 = this;
            r0 = 0
            java.io.OutputStream r0 = r4.write(r6)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            com.badlogic.gdx.utils.StreamUtils.copyStream(r5, r0)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r5)
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            return
        Lf:
            r6 = move-exception
            goto L3a
        L11:
            r6 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = "Error stream writing to file: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            java.io.File r3 = r4.file     // Catch: java.lang.Throwable -> Lf
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = " ("
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            com.badlogic.gdx.Files$FileType r3 = r4.type     // Catch: java.lang.Throwable -> Lf
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2, r6)     // Catch: java.lang.Throwable -> Lf
            throw r1     // Catch: java.lang.Throwable -> Lf
        L3a:
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r5)
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            throw r6
    }

    public void writeBytes(byte[] r2, int r3, int r4, boolean r5) {
            r1 = this;
            java.io.OutputStream r5 = r1.write(r5)
            r5.write(r2, r3, r4)     // Catch: java.lang.Throwable -> Lb java.io.IOException -> Ld
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r5)
            return
        Lb:
            r2 = move-exception
            goto L36
        Ld:
            r2 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> Lb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            r4.<init>()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = "Error writing file: "
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb
            java.io.File r0 = r1.file     // Catch: java.lang.Throwable -> Lb
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = " ("
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb
            com.badlogic.gdx.Files$FileType r0 = r1.type     // Catch: java.lang.Throwable -> Lb
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = ")"
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lb
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> Lb
            throw r3     // Catch: java.lang.Throwable -> Lb
        L36:
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r5)
            throw r2
    }

    public void writeBytes(byte[] r4, boolean r5) {
            r3 = this;
            java.io.OutputStream r5 = r3.write(r5)
            r5.write(r4)     // Catch: java.lang.Throwable -> Lb java.io.IOException -> Ld
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r5)
            return
        Lb:
            r4 = move-exception
            goto L36
        Ld:
            r4 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> Lb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            r1.<init>()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = "Error writing file: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lb
            java.io.File r2 = r3.file     // Catch: java.lang.Throwable -> Lb
            r1.append(r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = " ("
            r1.append(r2)     // Catch: java.lang.Throwable -> Lb
            com.badlogic.gdx.Files$FileType r2 = r3.type     // Catch: java.lang.Throwable -> Lb
            r1.append(r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb
            r0.<init>(r1, r4)     // Catch: java.lang.Throwable -> Lb
            throw r0     // Catch: java.lang.Throwable -> Lb
        L36:
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r5)
            throw r4
    }

    public void writeString(java.lang.String r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.writeString(r2, r3, r0)
            return
    }

    public void writeString(java.lang.String r3, boolean r4, java.lang.String r5) {
            r2 = this;
            r0 = 0
            java.io.Writer r0 = r2.writer(r4, r5)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            r0.write(r3)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            return
        Lc:
            r3 = move-exception
            goto L37
        Le:
            r3 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r4 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> Lc
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc
            r5.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "Error writing file: "
            r5.append(r1)     // Catch: java.lang.Throwable -> Lc
            java.io.File r1 = r2.file     // Catch: java.lang.Throwable -> Lc
            r5.append(r1)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = " ("
            r5.append(r1)     // Catch: java.lang.Throwable -> Lc
            com.badlogic.gdx.Files$FileType r1 = r2.type     // Catch: java.lang.Throwable -> Lc
            r5.append(r1)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = ")"
            r5.append(r1)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lc
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> Lc
            throw r4     // Catch: java.lang.Throwable -> Lc
        L37:
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            throw r3
    }

    public java.io.Writer writer(boolean r2) {
            r1 = this;
            r0 = 0
            java.io.Writer r2 = r1.writer(r2, r0)
            return r2
    }

    public java.io.Writer writer(boolean r5, java.lang.String r6) {
            r4 = this;
            com.badlogic.gdx.Files$FileType r0 = r4.type
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Classpath
            if (r0 == r1) goto L98
            com.badlogic.gdx.Files$FileType r1 = com.badlogic.gdx.Files.FileType.Internal
            if (r0 == r1) goto L7f
            com.badlogic.gdx.files.FileHandle r0 = r4.parent()
            r0.mkdirs()
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L28
            java.io.File r1 = r4.file()     // Catch: java.io.IOException -> L28
            r0.<init>(r1, r5)     // Catch: java.io.IOException -> L28
            if (r6 != 0) goto L22
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch: java.io.IOException -> L28
            r5.<init>(r0)     // Catch: java.io.IOException -> L28
            return r5
        L22:
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch: java.io.IOException -> L28
            r5.<init>(r0, r6)     // Catch: java.io.IOException -> L28
            return r5
        L28:
            r5 = move-exception
            java.io.File r6 = r4.file()
            boolean r6 = r6.isDirectory()
            java.lang.String r0 = ")"
            java.lang.String r1 = " ("
            if (r6 == 0) goto L5b
            com.badlogic.gdx.utils.GdxRuntimeException r6 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot open a stream to a directory: "
            r2.append(r3)
            java.io.File r3 = r4.file
            r2.append(r3)
            r2.append(r1)
            com.badlogic.gdx.Files$FileType r1 = r4.type
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6.<init>(r0, r5)
            throw r6
        L5b:
            com.badlogic.gdx.utils.GdxRuntimeException r6 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error writing file: "
            r2.append(r3)
            java.io.File r3 = r4.file
            r2.append(r3)
            r2.append(r1)
            com.badlogic.gdx.Files$FileType r1 = r4.type
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6.<init>(r0, r5)
            throw r6
        L7f:
            com.badlogic.gdx.utils.GdxRuntimeException r5 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Cannot write to an internal file: "
            r6.append(r0)
            java.io.File r0 = r4.file
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L98:
            com.badlogic.gdx.utils.GdxRuntimeException r5 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Cannot write to a classpath file: "
            r6.append(r0)
            java.io.File r0 = r4.file
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }
}
