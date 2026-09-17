package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class SharedLibraryLoader {
    public static boolean is64Bit;
    public static boolean isARM;
    public static boolean isAndroid;
    public static boolean isIos;
    public static boolean isLinux;
    public static boolean isMac;
    public static boolean isWindows;
    private static final java.util.HashSet<java.lang.String> loadedLibraries = null;
    private static final java.util.Random random = null;
    private java.lang.String nativesJar;

    static {
            java.lang.String r0 = "os.name"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "Windows"
            boolean r1 = r1.contains(r2)
            com.badlogic.gdx.utils.SharedLibraryLoader.isWindows = r1
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "Linux"
            boolean r1 = r1.contains(r2)
            com.badlogic.gdx.utils.SharedLibraryLoader.isLinux = r1
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "Mac"
            boolean r0 = r0.contains(r1)
            com.badlogic.gdx.utils.SharedLibraryLoader.isMac = r0
            r0 = 0
            com.badlogic.gdx.utils.SharedLibraryLoader.isIos = r0
            com.badlogic.gdx.utils.SharedLibraryLoader.isAndroid = r0
            java.lang.String r1 = "os.arch"
            java.lang.String r2 = java.lang.System.getProperty(r1)
            java.lang.String r3 = "arm"
            boolean r2 = r2.startsWith(r3)
            r3 = 1
            if (r2 != 0) goto L49
            java.lang.String r2 = java.lang.System.getProperty(r1)
            java.lang.String r4 = "aarch64"
            boolean r2 = r2.startsWith(r4)
            if (r2 == 0) goto L47
            goto L49
        L47:
            r2 = 0
            goto L4a
        L49:
            r2 = 1
        L4a:
            com.badlogic.gdx.utils.SharedLibraryLoader.isARM = r2
            java.lang.String r2 = java.lang.System.getProperty(r1)
            java.lang.String r4 = "64"
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L67
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.String r2 = "armv8"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L65
            goto L67
        L65:
            r1 = 0
            goto L68
        L67:
            r1 = 1
        L68:
            com.badlogic.gdx.utils.SharedLibraryLoader.is64Bit = r1
            java.lang.String r1 = "moe.platform.name"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            if (r1 == 0) goto L74
            r1 = 1
            goto L75
        L74:
            r1 = 0
        L75:
            java.lang.String r2 = "java.runtime.name"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            if (r2 == 0) goto L8f
            java.lang.String r4 = "Android Runtime"
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L8f
            com.badlogic.gdx.utils.SharedLibraryLoader.isAndroid = r3
            com.badlogic.gdx.utils.SharedLibraryLoader.isWindows = r0
            com.badlogic.gdx.utils.SharedLibraryLoader.isLinux = r0
            com.badlogic.gdx.utils.SharedLibraryLoader.isMac = r0
            com.badlogic.gdx.utils.SharedLibraryLoader.is64Bit = r0
        L8f:
            if (r1 != 0) goto La1
            boolean r1 = com.badlogic.gdx.utils.SharedLibraryLoader.isAndroid
            if (r1 != 0) goto Lad
            boolean r1 = com.badlogic.gdx.utils.SharedLibraryLoader.isWindows
            if (r1 != 0) goto Lad
            boolean r1 = com.badlogic.gdx.utils.SharedLibraryLoader.isLinux
            if (r1 != 0) goto Lad
            boolean r1 = com.badlogic.gdx.utils.SharedLibraryLoader.isMac
            if (r1 != 0) goto Lad
        La1:
            com.badlogic.gdx.utils.SharedLibraryLoader.isIos = r3
            com.badlogic.gdx.utils.SharedLibraryLoader.isAndroid = r0
            com.badlogic.gdx.utils.SharedLibraryLoader.isWindows = r0
            com.badlogic.gdx.utils.SharedLibraryLoader.isLinux = r0
            com.badlogic.gdx.utils.SharedLibraryLoader.isMac = r0
            com.badlogic.gdx.utils.SharedLibraryLoader.is64Bit = r0
        Lad:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.badlogic.gdx.utils.SharedLibraryLoader.loadedLibraries = r0
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            com.badlogic.gdx.utils.SharedLibraryLoader.random = r0
            return
    }

    public SharedLibraryLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void closeQuietly(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    private java.io.File extractFile(java.lang.String r7, java.lang.String r8, java.io.File r9) throws java.io.IOException {
            r6 = this;
            boolean r0 = r9.exists()
            r1 = 0
            if (r0 == 0) goto L11
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L11
            r0.<init>(r9)     // Catch: java.io.FileNotFoundException -> L11
            java.lang.String r0 = r6.crc(r0)     // Catch: java.io.FileNotFoundException -> L11
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L1a
            boolean r8 = r0.equals(r8)
            if (r8 != 0) goto L3b
        L1a:
            java.io.InputStream r8 = r6.readFile(r7)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f
            java.io.File r0 = r9.getParentFile()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L47
            r0.mkdirs()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L47
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L47
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L47
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L76
        L2e:
            int r2 = r8.read(r1)     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L76
            r3 = -1
            if (r2 != r3) goto L3c
            closeQuietly(r8)
            closeQuietly(r0)
        L3b:
            return r9
        L3c:
            r3 = 0
            r0.write(r1, r3, r2)     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L76
            goto L2e
        L41:
            r1 = move-exception
            goto L53
        L43:
            r7 = move-exception
            r0 = r1
        L45:
            r1 = r8
            goto L78
        L47:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L53
        L4c:
            r7 = move-exception
            r0 = r1
            goto L78
        L4f:
            r8 = move-exception
            r0 = r1
            r1 = r8
            r8 = r0
        L53:
            com.badlogic.gdx.utils.SharedLibraryLoadRuntimeException r2 = new com.badlogic.gdx.utils.SharedLibraryLoadRuntimeException     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r3.<init>()     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = "Error extracting file: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L76
            r3.append(r7)     // Catch: java.lang.Throwable -> L76
            java.lang.String r7 = "\nTo: "
            r3.append(r7)     // Catch: java.lang.Throwable -> L76
            java.lang.String r7 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L76
            r3.append(r7)     // Catch: java.lang.Throwable -> L76
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L76
            r2.<init>(r7, r1)     // Catch: java.lang.Throwable -> L76
            throw r2     // Catch: java.lang.Throwable -> L76
        L76:
            r7 = move-exception
            goto L45
        L78:
            closeQuietly(r1)
            closeQuietly(r0)
            throw r7
    }

    public static synchronized boolean isLoaded(java.lang.String r2) {
            java.lang.Class<com.badlogic.gdx.utils.SharedLibraryLoader> r0 = com.badlogic.gdx.utils.SharedLibraryLoader.class
            monitor-enter(r0)
            java.util.HashSet<java.lang.String> r1 = com.badlogic.gdx.utils.SharedLibraryLoader.loadedLibraries     // Catch: java.lang.Throwable -> Lb
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r2
        Lb:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    private java.lang.Throwable loadFile(java.lang.String r1, java.lang.String r2, java.io.File r3) {
            r0 = this;
            java.io.File r1 = r0.extractFile(r1, r2, r3)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld
            java.lang.System.load(r1)     // Catch: java.lang.Throwable -> Ld
            r1 = 0
            return r1
        Ld:
            r1 = move-exception
            return r1
    }

    private void loadFile(java.lang.String r7) {
            r6 = this;
            java.io.InputStream r0 = r6.readFile(r7)
            java.lang.String r0 = r6.crc(r0)
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            java.lang.String r1 = r1.getName()
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "java.io.tmpdir"
            java.lang.String r4 = java.lang.System.getProperty(r4)
            r3.append(r4)
            java.lang.String r4 = "/libgdx"
            r3.append(r4)
            java.lang.String r4 = "user.name"
            java.lang.String r4 = java.lang.System.getProperty(r4)
            r3.append(r4)
            java.lang.String r4 = "/"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r1)
            java.lang.Throwable r2 = r6.loadFile(r7, r0, r2)
            if (r2 != 0) goto L45
            return
        L45:
            r3 = 0
            java.io.File r3 = java.io.File.createTempFile(r0, r3)     // Catch: java.lang.Throwable -> L57
            boolean r4 = r3.delete()     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L58
            java.lang.Throwable r3 = r6.loadFile(r7, r0, r3)     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L58
            return
        L57:
        L58:
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "user.home"
            java.lang.String r5 = java.lang.System.getProperty(r5)
            r4.append(r5)
            java.lang.String r5 = "/.libgdx/"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4, r1)
            java.lang.Throwable r3 = r6.loadFile(r7, r0, r3)
            if (r3 != 0) goto L7e
            return
        L7e:
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = ".temp/"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4, r1)
            java.lang.Throwable r0 = r6.loadFile(r7, r0, r3)
            if (r0 != 0) goto L9b
            return
        L9b:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "java.library.path"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r0.<init>(r1, r7)
            boolean r7 = r0.exists()
            if (r7 == 0) goto Lb4
            java.lang.String r7 = r0.getAbsolutePath()
            java.lang.System.load(r7)
            return
        Lb4:
            com.badlogic.gdx.utils.SharedLibraryLoadRuntimeException r7 = new com.badlogic.gdx.utils.SharedLibraryLoadRuntimeException
            r7.<init>(r2)
            throw r7
    }

    private java.io.InputStream readFile(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "' in JAR: "
            java.lang.String r1 = r5.nativesJar
            if (r1 != 0) goto L37
            java.lang.Class<com.badlogic.gdx.utils.SharedLibraryLoader> r0 = com.badlogic.gdx.utils.SharedLibraryLoader.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "/"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L20
            return r0
        L20:
            com.badlogic.gdx.utils.SharedLibraryLoadRuntimeException r0 = new com.badlogic.gdx.utils.SharedLibraryLoadRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to read file for extraction: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L37:
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> L68
            java.lang.String r2 = r5.nativesJar     // Catch: java.io.IOException -> L68
            r1.<init>(r2)     // Catch: java.io.IOException -> L68
            java.util.zip.ZipEntry r2 = r1.getEntry(r6)     // Catch: java.io.IOException -> L68
            if (r2 == 0) goto L49
            java.io.InputStream r6 = r1.getInputStream(r2)     // Catch: java.io.IOException -> L68
            return r6
        L49:
            com.badlogic.gdx.utils.SharedLibraryLoadRuntimeException r1 = new com.badlogic.gdx.utils.SharedLibraryLoadRuntimeException     // Catch: java.io.IOException -> L68
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L68
            r2.<init>()     // Catch: java.io.IOException -> L68
            java.lang.String r3 = "Couldn't find '"
            r2.append(r3)     // Catch: java.io.IOException -> L68
            r2.append(r6)     // Catch: java.io.IOException -> L68
            r2.append(r0)     // Catch: java.io.IOException -> L68
            java.lang.String r3 = r5.nativesJar     // Catch: java.io.IOException -> L68
            r2.append(r3)     // Catch: java.io.IOException -> L68
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L68
            r1.<init>(r2)     // Catch: java.io.IOException -> L68
            throw r1     // Catch: java.io.IOException -> L68
        L68:
            r1 = move-exception
            com.badlogic.gdx.utils.SharedLibraryLoadRuntimeException r2 = new com.badlogic.gdx.utils.SharedLibraryLoadRuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Error reading '"
            r3.append(r4)
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = r5.nativesJar
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6, r1)
            throw r2
    }

    public static synchronized void setLoaded(java.lang.String r2) {
            java.lang.Class<com.badlogic.gdx.utils.SharedLibraryLoader> r0 = com.badlogic.gdx.utils.SharedLibraryLoader.class
            monitor-enter(r0)
            java.util.HashSet<java.lang.String> r1 = com.badlogic.gdx.utils.SharedLibraryLoader.loadedLibraries     // Catch: java.lang.Throwable -> La
            r1.add(r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return
        La:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public java.lang.String crc(java.io.InputStream r5) {
            r4 = this;
            if (r5 == 0) goto L2b
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]
        Lb:
            int r2 = r5.read(r1)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1d
            r3 = -1
            if (r2 != r3) goto L13
            goto L1d
        L13:
            r3 = 0
            r0.update(r1, r3, r2)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1d
            goto Lb
        L18:
            r0 = move-exception
            closeQuietly(r5)
            throw r0
        L1d:
            closeQuietly(r5)
            long r0 = r0.getValue()
            r5 = 16
            java.lang.String r5 = java.lang.Long.toString(r0, r5)
            return r5
        L2b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "input cannot be null."
            r5.<init>(r0)
            throw r5
    }

    public void load(java.lang.String r6) {
            r5 = this;
            boolean r0 = com.badlogic.gdx.utils.SharedLibraryLoader.isIos
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.Class<com.badlogic.gdx.utils.SharedLibraryLoader> r0 = com.badlogic.gdx.utils.SharedLibraryLoader.class
            monitor-enter(r0)
            boolean r1 = isLoaded(r6)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            return
        L10:
            java.lang.String r1 = r5.mapLibraryName(r6)     // Catch: java.lang.Throwable -> L75
            boolean r2 = com.badlogic.gdx.utils.SharedLibraryLoader.isAndroid     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L1c
            java.lang.System.loadLibrary(r1)     // Catch: java.lang.Throwable -> L24
            goto L1f
        L1c:
            r5.loadFile(r1)     // Catch: java.lang.Throwable -> L24
        L1f:
            setLoaded(r6)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            return
        L24:
            r6 = move-exception
            com.badlogic.gdx.utils.SharedLibraryLoadRuntimeException r2 = new com.badlogic.gdx.utils.SharedLibraryLoadRuntimeException     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r3.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "Couldn't load shared library '"
            r3.append(r4)     // Catch: java.lang.Throwable -> L75
            r3.append(r1)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "' for target: "
            r3.append(r1)     // Catch: java.lang.Throwable -> L75
            boolean r1 = com.badlogic.gdx.utils.SharedLibraryLoader.isAndroid     // Catch: java.lang.Throwable -> L75
            if (r1 != 0) goto L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r1.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "os.name"
            java.lang.String r4 = java.lang.System.getProperty(r4)     // Catch: java.lang.Throwable -> L75
            r1.append(r4)     // Catch: java.lang.Throwable -> L75
            boolean r4 = com.badlogic.gdx.utils.SharedLibraryLoader.isARM     // Catch: java.lang.Throwable -> L75
            if (r4 == 0) goto L52
            java.lang.String r4 = ", ARM"
            goto L54
        L52:
            java.lang.String r4 = ""
        L54:
            r1.append(r4)     // Catch: java.lang.Throwable -> L75
            boolean r4 = com.badlogic.gdx.utils.SharedLibraryLoader.is64Bit     // Catch: java.lang.Throwable -> L75
            if (r4 == 0) goto L5e
            java.lang.String r4 = ", 64-bit"
            goto L60
        L5e:
            java.lang.String r4 = ", 32-bit"
        L60:
            r1.append(r4)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L75
            goto L6a
        L68:
            java.lang.String r1 = "Android"
        L6a:
            r3.append(r1)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L75
            r2.<init>(r1, r6)     // Catch: java.lang.Throwable -> L75
            throw r2     // Catch: java.lang.Throwable -> L75
        L75:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            throw r6
    }

    public java.lang.String mapLibraryName(java.lang.String r5) {
            r4 = this;
            boolean r0 = com.badlogic.gdx.utils.SharedLibraryLoader.isWindows
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            boolean r5 = com.badlogic.gdx.utils.SharedLibraryLoader.is64Bit
            if (r5 == 0) goto L13
            java.lang.String r5 = "64.dll"
            goto L15
        L13:
            java.lang.String r5 = ".dll"
        L15:
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
        L1d:
            boolean r0 = com.badlogic.gdx.utils.SharedLibraryLoader.isLinux
            java.lang.String r1 = "arm"
            java.lang.String r2 = ""
            java.lang.String r3 = "lib"
            if (r0 == 0) goto L4c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r5)
            boolean r5 = com.badlogic.gdx.utils.SharedLibraryLoader.isARM
            if (r5 == 0) goto L37
            goto L38
        L37:
            r1 = r2
        L38:
            r0.append(r1)
            boolean r5 = com.badlogic.gdx.utils.SharedLibraryLoader.is64Bit
            if (r5 == 0) goto L42
            java.lang.String r5 = "64.so"
            goto L44
        L42:
            java.lang.String r5 = ".so"
        L44:
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
        L4c:
            boolean r0 = com.badlogic.gdx.utils.SharedLibraryLoader.isMac
            if (r0 == 0) goto L74
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r5)
            boolean r5 = com.badlogic.gdx.utils.SharedLibraryLoader.isARM
            if (r5 == 0) goto L60
            goto L61
        L60:
            r1 = r2
        L61:
            r0.append(r1)
            boolean r5 = com.badlogic.gdx.utils.SharedLibraryLoader.is64Bit
            if (r5 == 0) goto L6b
            java.lang.String r5 = "64.dylib"
            goto L6d
        L6b:
            java.lang.String r5 = ".dylib"
        L6d:
            r0.append(r5)
            java.lang.String r5 = r0.toString()
        L74:
            return r5
    }
}
