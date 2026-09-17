package org.apache.commons.lang3;

/* loaded from: classes2.dex */
public class SystemUtils {
    public static final java.lang.String AWT_TOOLKIT = null;
    public static final java.lang.String FILE_ENCODING = null;

    @java.lang.Deprecated
    public static final java.lang.String FILE_SEPARATOR = null;
    public static final boolean IS_JAVA_10 = false;
    public static final boolean IS_JAVA_11 = false;
    public static final boolean IS_JAVA_12 = false;
    public static final boolean IS_JAVA_13 = false;
    public static final boolean IS_JAVA_1_1 = false;
    public static final boolean IS_JAVA_1_2 = false;
    public static final boolean IS_JAVA_1_3 = false;
    public static final boolean IS_JAVA_1_4 = false;
    public static final boolean IS_JAVA_1_5 = false;
    public static final boolean IS_JAVA_1_6 = false;
    public static final boolean IS_JAVA_1_7 = false;
    public static final boolean IS_JAVA_1_8 = false;

    @java.lang.Deprecated
    public static final boolean IS_JAVA_1_9 = false;
    public static final boolean IS_JAVA_9 = false;
    public static final boolean IS_OS_400 = false;
    public static final boolean IS_OS_AIX = false;
    public static final boolean IS_OS_FREE_BSD = false;
    public static final boolean IS_OS_HP_UX = false;
    public static final boolean IS_OS_IRIX = false;
    public static final boolean IS_OS_LINUX = false;
    public static final boolean IS_OS_MAC = false;
    public static final boolean IS_OS_MAC_OSX = false;
    public static final boolean IS_OS_MAC_OSX_CHEETAH = false;
    public static final boolean IS_OS_MAC_OSX_EL_CAPITAN = false;
    public static final boolean IS_OS_MAC_OSX_JAGUAR = false;
    public static final boolean IS_OS_MAC_OSX_LEOPARD = false;
    public static final boolean IS_OS_MAC_OSX_LION = false;
    public static final boolean IS_OS_MAC_OSX_MAVERICKS = false;
    public static final boolean IS_OS_MAC_OSX_MOUNTAIN_LION = false;
    public static final boolean IS_OS_MAC_OSX_PANTHER = false;
    public static final boolean IS_OS_MAC_OSX_PUMA = false;
    public static final boolean IS_OS_MAC_OSX_SNOW_LEOPARD = false;
    public static final boolean IS_OS_MAC_OSX_TIGER = false;
    public static final boolean IS_OS_MAC_OSX_YOSEMITE = false;
    public static final boolean IS_OS_NET_BSD = false;
    public static final boolean IS_OS_OPEN_BSD = false;
    public static final boolean IS_OS_OS2 = false;
    public static final boolean IS_OS_SOLARIS = false;
    public static final boolean IS_OS_SUN_OS = false;
    public static final boolean IS_OS_UNIX = false;
    public static final boolean IS_OS_WINDOWS = false;
    public static final boolean IS_OS_WINDOWS_10 = false;
    public static final boolean IS_OS_WINDOWS_2000 = false;
    public static final boolean IS_OS_WINDOWS_2003 = false;
    public static final boolean IS_OS_WINDOWS_2008 = false;
    public static final boolean IS_OS_WINDOWS_2012 = false;
    public static final boolean IS_OS_WINDOWS_7 = false;
    public static final boolean IS_OS_WINDOWS_8 = false;
    public static final boolean IS_OS_WINDOWS_95 = false;
    public static final boolean IS_OS_WINDOWS_98 = false;
    public static final boolean IS_OS_WINDOWS_ME = false;
    public static final boolean IS_OS_WINDOWS_NT = false;
    public static final boolean IS_OS_WINDOWS_VISTA = false;
    public static final boolean IS_OS_WINDOWS_XP = false;
    public static final boolean IS_OS_ZOS = false;
    public static final java.lang.String JAVA_AWT_FONTS = null;
    public static final java.lang.String JAVA_AWT_GRAPHICSENV = null;
    public static final java.lang.String JAVA_AWT_HEADLESS = null;
    public static final java.lang.String JAVA_AWT_PRINTERJOB = null;
    public static final java.lang.String JAVA_CLASS_PATH = null;
    public static final java.lang.String JAVA_CLASS_VERSION = null;
    public static final java.lang.String JAVA_COMPILER = null;
    public static final java.lang.String JAVA_ENDORSED_DIRS = null;
    public static final java.lang.String JAVA_EXT_DIRS = null;
    public static final java.lang.String JAVA_HOME = null;
    private static final java.lang.String JAVA_HOME_KEY = "java.home";
    public static final java.lang.String JAVA_IO_TMPDIR = null;
    private static final java.lang.String JAVA_IO_TMPDIR_KEY = "java.io.tmpdir";
    public static final java.lang.String JAVA_LIBRARY_PATH = null;
    public static final java.lang.String JAVA_RUNTIME_NAME = null;
    public static final java.lang.String JAVA_RUNTIME_VERSION = null;
    public static final java.lang.String JAVA_SPECIFICATION_NAME = null;
    public static final java.lang.String JAVA_SPECIFICATION_VENDOR = null;
    public static final java.lang.String JAVA_SPECIFICATION_VERSION = null;
    private static final org.apache.commons.lang3.JavaVersion JAVA_SPECIFICATION_VERSION_AS_ENUM = null;
    public static final java.lang.String JAVA_UTIL_PREFS_PREFERENCES_FACTORY = null;
    public static final java.lang.String JAVA_VENDOR = null;
    public static final java.lang.String JAVA_VENDOR_URL = null;
    public static final java.lang.String JAVA_VERSION = null;
    public static final java.lang.String JAVA_VM_INFO = null;
    public static final java.lang.String JAVA_VM_NAME = null;
    public static final java.lang.String JAVA_VM_SPECIFICATION_NAME = null;
    public static final java.lang.String JAVA_VM_SPECIFICATION_VENDOR = null;
    public static final java.lang.String JAVA_VM_SPECIFICATION_VERSION = null;
    public static final java.lang.String JAVA_VM_VENDOR = null;
    public static final java.lang.String JAVA_VM_VERSION = null;

    @java.lang.Deprecated
    public static final java.lang.String LINE_SEPARATOR = null;
    public static final java.lang.String OS_ARCH = null;
    public static final java.lang.String OS_NAME = null;
    private static final java.lang.String OS_NAME_WINDOWS_PREFIX = "Windows";
    public static final java.lang.String OS_VERSION = null;

    @java.lang.Deprecated
    public static final java.lang.String PATH_SEPARATOR = null;
    public static final java.lang.String USER_COUNTRY = null;
    public static final java.lang.String USER_DIR = null;
    private static final java.lang.String USER_DIR_KEY = "user.dir";
    public static final java.lang.String USER_HOME = null;
    private static final java.lang.String USER_HOME_KEY = "user.home";
    public static final java.lang.String USER_LANGUAGE = null;
    public static final java.lang.String USER_NAME = null;
    public static final java.lang.String USER_TIMEZONE = null;

    static {
            java.lang.String r0 = "awt.toolkit"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.AWT_TOOLKIT = r0
            java.lang.String r0 = "file.encoding"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.FILE_ENCODING = r0
            java.lang.String r0 = "file.separator"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.FILE_SEPARATOR = r0
            java.lang.String r0 = "java.awt.fonts"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_AWT_FONTS = r0
            java.lang.String r0 = "java.awt.graphicsenv"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_AWT_GRAPHICSENV = r0
            java.lang.String r0 = "java.awt.headless"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_AWT_HEADLESS = r0
            java.lang.String r0 = "java.awt.printerjob"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_AWT_PRINTERJOB = r0
            java.lang.String r0 = "java.class.path"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_CLASS_PATH = r0
            java.lang.String r0 = "java.class.version"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_CLASS_VERSION = r0
            java.lang.String r0 = "java.compiler"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_COMPILER = r0
            java.lang.String r0 = "java.endorsed.dirs"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_ENDORSED_DIRS = r0
            java.lang.String r0 = "java.ext.dirs"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_EXT_DIRS = r0
            java.lang.String r0 = "java.home"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_HOME = r0
            java.lang.String r0 = "java.io.tmpdir"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_IO_TMPDIR = r0
            java.lang.String r0 = "java.library.path"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_LIBRARY_PATH = r0
            java.lang.String r0 = "java.runtime.name"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_RUNTIME_NAME = r0
            java.lang.String r0 = "java.runtime.version"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_RUNTIME_VERSION = r0
            java.lang.String r0 = "java.specification.name"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_NAME = r0
            java.lang.String r0 = "java.specification.vendor"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_VENDOR = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_VERSION = r0
            org.apache.commons.lang3.JavaVersion r0 = org.apache.commons.lang3.JavaVersion.get(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_VERSION_AS_ENUM = r0
            java.lang.String r0 = "java.util.prefs.PreferencesFactory"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_UTIL_PREFS_PREFERENCES_FACTORY = r0
            java.lang.String r0 = "java.vendor"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_VENDOR = r0
            java.lang.String r0 = "java.vendor.url"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_VENDOR_URL = r0
            java.lang.String r0 = "java.version"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_VERSION = r0
            java.lang.String r0 = "java.vm.info"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_VM_INFO = r0
            java.lang.String r0 = "java.vm.name"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_VM_NAME = r0
            java.lang.String r0 = "java.vm.specification.name"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_VM_SPECIFICATION_NAME = r0
            java.lang.String r0 = "java.vm.specification.vendor"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_VM_SPECIFICATION_VENDOR = r0
            java.lang.String r0 = "java.vm.specification.version"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_VM_SPECIFICATION_VERSION = r0
            java.lang.String r0 = "java.vm.vendor"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_VM_VENDOR = r0
            java.lang.String r0 = "java.vm.version"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.JAVA_VM_VERSION = r0
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR = r0
            java.lang.String r0 = "os.arch"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.OS_ARCH = r0
            java.lang.String r0 = "os.name"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.OS_NAME = r0
            java.lang.String r0 = "os.version"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.OS_VERSION = r0
            java.lang.String r0 = "path.separator"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.PATH_SEPARATOR = r0
            java.lang.String r0 = "user.country"
            java.lang.String r1 = getSystemProperty(r0)
            if (r1 != 0) goto L130
            java.lang.String r0 = "user.region"
        L130:
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.USER_COUNTRY = r0
            java.lang.String r0 = "user.dir"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.USER_DIR = r0
            java.lang.String r0 = "user.home"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.USER_HOME = r0
            java.lang.String r0 = "user.language"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.USER_LANGUAGE = r0
            java.lang.String r0 = "user.name"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.USER_NAME = r0
            java.lang.String r0 = "user.timezone"
            java.lang.String r0 = getSystemProperty(r0)
            org.apache.commons.lang3.SystemUtils.USER_TIMEZONE = r0
            java.lang.String r0 = "1.1"
            boolean r0 = getJavaVersionMatches(r0)
            org.apache.commons.lang3.SystemUtils.IS_JAVA_1_1 = r0
            java.lang.String r0 = "1.2"
            boolean r0 = getJavaVersionMatches(r0)
            org.apache.commons.lang3.SystemUtils.IS_JAVA_1_2 = r0
            java.lang.String r0 = "1.3"
            boolean r0 = getJavaVersionMatches(r0)
            org.apache.commons.lang3.SystemUtils.IS_JAVA_1_3 = r0
            java.lang.String r0 = "1.4"
            boolean r0 = getJavaVersionMatches(r0)
            org.apache.commons.lang3.SystemUtils.IS_JAVA_1_4 = r0
            java.lang.String r0 = "1.5"
            boolean r0 = getJavaVersionMatches(r0)
            org.apache.commons.lang3.SystemUtils.IS_JAVA_1_5 = r0
            java.lang.String r0 = "1.6"
            boolean r0 = getJavaVersionMatches(r0)
            org.apache.commons.lang3.SystemUtils.IS_JAVA_1_6 = r0
            java.lang.String r0 = "1.7"
            boolean r0 = getJavaVersionMatches(r0)
            org.apache.commons.lang3.SystemUtils.IS_JAVA_1_7 = r0
            java.lang.String r0 = "1.8"
            boolean r0 = getJavaVersionMatches(r0)
            org.apache.commons.lang3.SystemUtils.IS_JAVA_1_8 = r0
            java.lang.String r0 = "9"
            boolean r1 = getJavaVersionMatches(r0)
            org.apache.commons.lang3.SystemUtils.IS_JAVA_1_9 = r1
            boolean r0 = getJavaVersionMatches(r0)
            org.apache.commons.lang3.SystemUtils.IS_JAVA_9 = r0
            java.lang.String r0 = "10"
            boolean r0 = getJavaVersionMatches(r0)
            org.apache.commons.lang3.SystemUtils.IS_JAVA_10 = r0
            java.lang.String r0 = "11"
            boolean r0 = getJavaVersionMatches(r0)
            org.apache.commons.lang3.SystemUtils.IS_JAVA_11 = r0
            java.lang.String r0 = "12"
            boolean r0 = getJavaVersionMatches(r0)
            org.apache.commons.lang3.SystemUtils.IS_JAVA_12 = r0
            java.lang.String r0 = "13"
            boolean r0 = getJavaVersionMatches(r0)
            org.apache.commons.lang3.SystemUtils.IS_JAVA_13 = r0
            java.lang.String r0 = "AIX"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.lang3.SystemUtils.IS_OS_AIX = r0
            java.lang.String r1 = "HP-UX"
            boolean r1 = getOsMatchesName(r1)
            org.apache.commons.lang3.SystemUtils.IS_OS_HP_UX = r1
            java.lang.String r2 = "OS/400"
            boolean r2 = getOsMatchesName(r2)
            org.apache.commons.lang3.SystemUtils.IS_OS_400 = r2
            java.lang.String r2 = "Irix"
            boolean r2 = getOsMatchesName(r2)
            org.apache.commons.lang3.SystemUtils.IS_OS_IRIX = r2
            java.lang.String r3 = "Linux"
            boolean r3 = getOsMatchesName(r3)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L201
            java.lang.String r3 = "LINUX"
            boolean r3 = getOsMatchesName(r3)
            if (r3 == 0) goto L1ff
            goto L201
        L1ff:
            r3 = 0
            goto L202
        L201:
            r3 = 1
        L202:
            org.apache.commons.lang3.SystemUtils.IS_OS_LINUX = r3
            java.lang.String r6 = "Mac"
            boolean r6 = getOsMatchesName(r6)
            org.apache.commons.lang3.SystemUtils.IS_OS_MAC = r6
            java.lang.String r6 = "Mac OS X"
            boolean r7 = getOsMatchesName(r6)
            org.apache.commons.lang3.SystemUtils.IS_OS_MAC_OSX = r7
            java.lang.String r8 = "10.0"
            boolean r8 = getOsMatches(r6, r8)
            org.apache.commons.lang3.SystemUtils.IS_OS_MAC_OSX_CHEETAH = r8
            java.lang.String r8 = "10.1"
            boolean r8 = getOsMatches(r6, r8)
            org.apache.commons.lang3.SystemUtils.IS_OS_MAC_OSX_PUMA = r8
            java.lang.String r8 = "10.2"
            boolean r8 = getOsMatches(r6, r8)
            org.apache.commons.lang3.SystemUtils.IS_OS_MAC_OSX_JAGUAR = r8
            java.lang.String r8 = "10.3"
            boolean r8 = getOsMatches(r6, r8)
            org.apache.commons.lang3.SystemUtils.IS_OS_MAC_OSX_PANTHER = r8
            java.lang.String r8 = "10.4"
            boolean r8 = getOsMatches(r6, r8)
            org.apache.commons.lang3.SystemUtils.IS_OS_MAC_OSX_TIGER = r8
            java.lang.String r8 = "10.5"
            boolean r8 = getOsMatches(r6, r8)
            org.apache.commons.lang3.SystemUtils.IS_OS_MAC_OSX_LEOPARD = r8
            java.lang.String r8 = "10.6"
            boolean r8 = getOsMatches(r6, r8)
            org.apache.commons.lang3.SystemUtils.IS_OS_MAC_OSX_SNOW_LEOPARD = r8
            java.lang.String r8 = "10.7"
            boolean r8 = getOsMatches(r6, r8)
            org.apache.commons.lang3.SystemUtils.IS_OS_MAC_OSX_LION = r8
            java.lang.String r8 = "10.8"
            boolean r8 = getOsMatches(r6, r8)
            org.apache.commons.lang3.SystemUtils.IS_OS_MAC_OSX_MOUNTAIN_LION = r8
            java.lang.String r8 = "10.9"
            boolean r8 = getOsMatches(r6, r8)
            org.apache.commons.lang3.SystemUtils.IS_OS_MAC_OSX_MAVERICKS = r8
            java.lang.String r8 = "10.10"
            boolean r8 = getOsMatches(r6, r8)
            org.apache.commons.lang3.SystemUtils.IS_OS_MAC_OSX_YOSEMITE = r8
            java.lang.String r8 = "10.11"
            boolean r6 = getOsMatches(r6, r8)
            org.apache.commons.lang3.SystemUtils.IS_OS_MAC_OSX_EL_CAPITAN = r6
            java.lang.String r6 = "FreeBSD"
            boolean r6 = getOsMatchesName(r6)
            org.apache.commons.lang3.SystemUtils.IS_OS_FREE_BSD = r6
            java.lang.String r8 = "OpenBSD"
            boolean r8 = getOsMatchesName(r8)
            org.apache.commons.lang3.SystemUtils.IS_OS_OPEN_BSD = r8
            java.lang.String r9 = "NetBSD"
            boolean r9 = getOsMatchesName(r9)
            org.apache.commons.lang3.SystemUtils.IS_OS_NET_BSD = r9
            java.lang.String r10 = "OS/2"
            boolean r10 = getOsMatchesName(r10)
            org.apache.commons.lang3.SystemUtils.IS_OS_OS2 = r10
            java.lang.String r10 = "Solaris"
            boolean r10 = getOsMatchesName(r10)
            org.apache.commons.lang3.SystemUtils.IS_OS_SOLARIS = r10
            java.lang.String r11 = "SunOS"
            boolean r11 = getOsMatchesName(r11)
            org.apache.commons.lang3.SystemUtils.IS_OS_SUN_OS = r11
            if (r0 != 0) goto L2b8
            if (r1 != 0) goto L2b8
            if (r2 != 0) goto L2b8
            if (r3 != 0) goto L2b8
            if (r7 != 0) goto L2b8
            if (r10 != 0) goto L2b8
            if (r11 != 0) goto L2b8
            if (r6 != 0) goto L2b8
            if (r8 != 0) goto L2b8
            if (r9 == 0) goto L2b9
        L2b8:
            r4 = 1
        L2b9:
            org.apache.commons.lang3.SystemUtils.IS_OS_UNIX = r4
            java.lang.String r0 = "Windows"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS = r0
            java.lang.String r0 = "Windows 2000"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_2000 = r0
            java.lang.String r0 = "Windows 2003"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_2003 = r0
            java.lang.String r0 = "Windows Server 2008"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_2008 = r0
            java.lang.String r0 = "Windows Server 2012"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_2012 = r0
            java.lang.String r0 = "Windows 95"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_95 = r0
            java.lang.String r0 = "Windows 98"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_98 = r0
            java.lang.String r0 = "Windows Me"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_ME = r0
            java.lang.String r0 = "Windows NT"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_NT = r0
            java.lang.String r0 = "Windows XP"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_XP = r0
            java.lang.String r0 = "Windows Vista"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_VISTA = r0
            java.lang.String r0 = "Windows 7"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_7 = r0
            java.lang.String r0 = "Windows 8"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_8 = r0
            java.lang.String r0 = "Windows 10"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_10 = r0
            java.lang.String r0 = "z/OS"
            boolean r0 = getOsMatchesName(r0)
            org.apache.commons.lang3.SystemUtils.IS_OS_ZOS = r0
            return
    }

    public SystemUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getEnvironmentVariable(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = java.lang.System.getenv(r0)     // Catch: java.lang.SecurityException -> L8
            if (r0 != 0) goto L7
            goto L8
        L7:
            r1 = r0
        L8:
            return r1
    }

    public static java.lang.String getHostName() {
            boolean r0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS
            if (r0 == 0) goto L7
            java.lang.String r0 = "COMPUTERNAME"
            goto L9
        L7:
            java.lang.String r0 = "HOSTNAME"
        L9:
            java.lang.String r0 = java.lang.System.getenv(r0)
            return r0
    }

    public static java.io.File getJavaHome() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "java.home"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r0.<init>(r1)
            return r0
    }

    public static java.io.File getJavaIoTmpDir() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "java.io.tmpdir"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r0.<init>(r1)
            return r0
    }

    private static boolean getJavaVersionMatches(java.lang.String r1) {
            java.lang.String r0 = org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_VERSION
            boolean r1 = isJavaVersionMatch(r0, r1)
            return r1
    }

    private static boolean getOsMatches(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = org.apache.commons.lang3.SystemUtils.OS_NAME
            java.lang.String r1 = org.apache.commons.lang3.SystemUtils.OS_VERSION
            boolean r2 = isOSMatch(r0, r1, r2, r3)
            return r2
    }

    private static boolean getOsMatchesName(java.lang.String r1) {
            java.lang.String r0 = org.apache.commons.lang3.SystemUtils.OS_NAME
            boolean r1 = isOSNameMatch(r0, r1)
            return r1
    }

    private static java.lang.String getSystemProperty(java.lang.String r0) {
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static java.io.File getUserDir() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "user.dir"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r0.<init>(r1)
            return r0
    }

    public static java.io.File getUserHome() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "user.home"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r0.<init>(r1)
            return r0
    }

    public static boolean isJavaAwtHeadless() {
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = org.apache.commons.lang3.SystemUtils.JAVA_AWT_HEADLESS
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static boolean isJavaVersionAtLeast(org.apache.commons.lang3.JavaVersion r1) {
            org.apache.commons.lang3.JavaVersion r0 = org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_VERSION_AS_ENUM
            boolean r1 = r0.atLeast(r1)
            return r1
    }

    public static boolean isJavaVersionAtMost(org.apache.commons.lang3.JavaVersion r1) {
            org.apache.commons.lang3.JavaVersion r0 = org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_VERSION_AS_ENUM
            boolean r1 = r0.atMost(r1)
            return r1
    }

    static boolean isJavaVersionMatch(java.lang.String r0, java.lang.String r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            boolean r0 = r0.startsWith(r1)
            return r0
    }

    static boolean isOSMatch(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            if (r1 == 0) goto L13
            if (r2 != 0) goto L6
            goto L13
        L6:
            boolean r1 = isOSNameMatch(r1, r3)
            if (r1 == 0) goto L13
            boolean r1 = isOSVersionMatch(r2, r4)
            if (r1 == 0) goto L13
            r0 = 1
        L13:
            return r0
    }

    static boolean isOSNameMatch(java.lang.String r0, java.lang.String r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            boolean r0 = r0.startsWith(r1)
            return r0
    }

    static boolean isOSVersionMatch(java.lang.String r4, java.lang.String r5) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "\\."
            java.lang.String[] r5 = r5.split(r0)
            java.lang.String[] r4 = r4.split(r0)
            r0 = 0
        L13:
            int r2 = r5.length
            int r3 = r4.length
            int r2 = java.lang.Math.min(r2, r3)
            if (r0 >= r2) goto L29
            r2 = r5[r0]
            r3 = r4[r0]
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L26
            return r1
        L26:
            int r0 = r0 + 1
            goto L13
        L29:
            r4 = 1
            return r4
    }
}
