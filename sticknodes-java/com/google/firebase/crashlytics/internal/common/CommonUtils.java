package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public class CommonUtils {
    private static final char[] HEX_VALUES = null;

    enum Architecture extends java.lang.Enum<com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture> {
        private static final /* synthetic */ com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture[] $VALUES = null;
        public static final com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture ARM64 = null;
        public static final com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture ARMV6 = null;
        public static final com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture ARMV7 = null;
        public static final com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture ARMV7S = null;
        public static final com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture ARM_UNKNOWN = null;
        public static final com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture PPC = null;
        public static final com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture PPC64 = null;
        public static final com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture UNKNOWN = null;
        public static final com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture X86_32 = null;
        public static final com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture X86_64 = null;
        private static final java.util.Map<java.lang.String, com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture> matcher = null;

        private static /* synthetic */ com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture[] $values() {
                r0 = 10
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture[] r0 = new com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture[r0]
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.X86_32
                r2 = 0
                r0[r2] = r1
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.X86_64
                r2 = 1
                r0[r2] = r1
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.ARM_UNKNOWN
                r2 = 2
                r0[r2] = r1
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.PPC
                r2 = 3
                r0[r2] = r1
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.PPC64
                r2 = 4
                r0[r2] = r1
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.ARMV6
                r2 = 5
                r0[r2] = r1
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.ARMV7
                r2 = 6
                r0[r2] = r1
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.UNKNOWN
                r2 = 7
                r0[r2] = r1
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.ARMV7S
                r2 = 8
                r0[r2] = r1
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.ARM64
                r2 = 9
                r0[r2] = r1
                return r0
        }

        static {
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r0 = new com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture
                java.lang.String r1 = "X86_32"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.X86_32 = r0
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r1 = new com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture
                java.lang.String r2 = "X86_64"
                r3 = 1
                r1.<init>(r2, r3)
                com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.X86_64 = r1
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r1 = new com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture
                java.lang.String r2 = "ARM_UNKNOWN"
                r3 = 2
                r1.<init>(r2, r3)
                com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.ARM_UNKNOWN = r1
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r1 = new com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture
                java.lang.String r2 = "PPC"
                r3 = 3
                r1.<init>(r2, r3)
                com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.PPC = r1
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r1 = new com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture
                java.lang.String r2 = "PPC64"
                r3 = 4
                r1.<init>(r2, r3)
                com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.PPC64 = r1
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r1 = new com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture
                java.lang.String r2 = "ARMV6"
                r4 = 5
                r1.<init>(r2, r4)
                com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.ARMV6 = r1
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r2 = new com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture
                java.lang.String r4 = "ARMV7"
                r5 = 6
                r2.<init>(r4, r5)
                com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.ARMV7 = r2
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r4 = new com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture
                java.lang.String r5 = "UNKNOWN"
                r6 = 7
                r4.<init>(r5, r6)
                com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.UNKNOWN = r4
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r4 = new com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture
                java.lang.String r5 = "ARMV7S"
                r6 = 8
                r4.<init>(r5, r6)
                com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.ARMV7S = r4
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r4 = new com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture
                java.lang.String r5 = "ARM64"
                r6 = 9
                r4.<init>(r5, r6)
                com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.ARM64 = r4
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture[] r5 = $values()
                com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.$VALUES = r5
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>(r3)
                com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.matcher = r5
                java.lang.String r3 = "armeabi-v7a"
                r5.put(r3, r2)
                java.lang.String r2 = "armeabi"
                r5.put(r2, r1)
                java.lang.String r1 = "arm64-v8a"
                r5.put(r1, r4)
                java.lang.String r1 = "x86"
                r5.put(r1, r0)
                return
        }

        Architecture(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture getValue() {
                java.lang.String r0 = android.os.Build.CPU_ABI
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto L14
                com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
                java.lang.String r1 = "Architecture#getValue()::Build.CPU_ABI returned null or empty"
                r0.v(r1)
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r0 = com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.UNKNOWN
                return r0
            L14:
                java.util.Locale r1 = java.util.Locale.US
                java.lang.String r0 = r0.toLowerCase(r1)
                java.util.Map<java.lang.String, com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture> r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.matcher
                java.lang.Object r0 = r1.get(r0)
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r0 = (com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture) r0
                if (r0 != 0) goto L26
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r0 = com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.UNKNOWN
            L26:
                return r0
        }

        public static com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture valueOf(java.lang.String r1) {
                java.lang.Class<com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture> r0 = com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r1 = (com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture) r1
                return r1
        }

        public static com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture[] values() {
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture[] r0 = com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture[] r0 = (com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture[]) r0
                return r0
        }
    }

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            com.google.firebase.crashlytics.internal.common.CommonUtils.HEX_VALUES = r0
            return
    }

    public static long calculateFreeRamInBytes(android.content.Context r2) {
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            java.lang.String r1 = "activity"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2
            r2.getMemoryInfo(r0)
            long r0 = r0.availMem
            return r0
    }

    public static synchronized long calculateTotalRamInBytes(android.content.Context r3) {
            java.lang.Class<com.google.firebase.crashlytics.internal.common.CommonUtils> r0 = com.google.firebase.crashlytics.internal.common.CommonUtils.class
            monitor-enter(r0)
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "activity"
            java.lang.Object r3 = r3.getSystemService(r2)     // Catch: java.lang.Throwable -> L17
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3     // Catch: java.lang.Throwable -> L17
            r3.getMemoryInfo(r1)     // Catch: java.lang.Throwable -> L17
            long r1 = r1.totalMem     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r1
        L17:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public static long calculateUsedDiskSpaceInBytes(java.lang.String r7) {
            android.os.StatFs r0 = new android.os.StatFs
            r0.<init>(r7)
            int r7 = r0.getBlockSize()
            long r1 = (long) r7
            int r7 = r0.getBlockCount()
            long r3 = (long) r7
            long r3 = r3 * r1
            int r7 = r0.getAvailableBlocks()
            long r5 = (long) r7
            long r1 = r1 * r5
            long r3 = r3 - r1
            return r3
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static boolean canTryConnection(android.content.Context r2) {
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = checkPermission(r2, r0)
            r1 = 1
            if (r0 == 0) goto L1f
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()
            if (r2 == 0) goto L1e
            boolean r2 = r2.isConnectedOrConnecting()
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            return r1
    }

    public static boolean checkPermission(android.content.Context r0, java.lang.String r1) {
            int r0 = r0.checkCallingOrSelfPermission(r1)
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static void closeOrLog(java.io.Closeable r1, java.lang.String r2) {
            if (r1 == 0) goto Le
            r1.close()     // Catch: java.io.IOException -> L6
            goto Le
        L6:
            r1 = move-exception
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r0.e(r2, r1)
        Le:
            return
    }

    public static void closeQuietly(java.io.Closeable r0) {
            if (r0 == 0) goto L8
            r0.close()     // Catch: java.lang.RuntimeException -> L6 java.lang.Exception -> L8
            goto L8
        L6:
            r0 = move-exception
            throw r0
        L8:
            return
    }

    public static java.lang.String createInstanceIdFrom(java.lang.String... r7) {
            r0 = 0
            if (r7 == 0) goto L52
            int r1 = r7.length
            if (r1 != 0) goto L7
            goto L52
        L7:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r7.length
            r3 = 0
        Le:
            if (r3 >= r2) goto L28
            r4 = r7[r3]
            if (r4 == 0) goto L25
            java.lang.String r5 = "-"
            java.lang.String r6 = ""
            java.lang.String r4 = r4.replace(r5, r6)
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r5)
            r1.add(r4)
        L25:
            int r3 = r3 + 1
            goto Le
        L28:
            java.util.Collections.sort(r1)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L34:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r7.append(r2)
            goto L34
        L44:
            java.lang.String r7 = r7.toString()
            int r1 = r7.length()
            if (r1 <= 0) goto L52
            java.lang.String r0 = sha1(r7)
        L52:
            return r0
    }

    public static boolean getBooleanResourceValue(android.content.Context r2, java.lang.String r3, boolean r4) {
            if (r2 == 0) goto L26
            android.content.res.Resources r0 = r2.getResources()
            if (r0 == 0) goto L26
            java.lang.String r1 = "bool"
            int r1 = getResourcesIdentifier(r2, r3, r1)
            if (r1 <= 0) goto L15
            boolean r2 = r0.getBoolean(r1)
            return r2
        L15:
            java.lang.String r0 = "string"
            int r3 = getResourcesIdentifier(r2, r3, r0)
            if (r3 <= 0) goto L26
            java.lang.String r2 = r2.getString(r3)
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            return r2
        L26:
            return r4
    }

    public static java.util.List<com.google.firebase.crashlytics.internal.common.BuildIdInfo> getBuildIdInfo(android.content.Context r9) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "com.google.firebase.crashlytics.build_ids_lib"
            java.lang.String r2 = "array"
            int r1 = getResourcesIdentifier(r9, r1, r2)
            java.lang.String r3 = "com.google.firebase.crashlytics.build_ids_arch"
            int r3 = getResourcesIdentifier(r9, r3, r2)
            java.lang.String r4 = "com.google.firebase.crashlytics.build_ids_build_id"
            int r2 = getResourcesIdentifier(r9, r4, r2)
            r4 = 2
            r5 = 3
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L7f
            if (r3 == 0) goto L7f
            if (r2 != 0) goto L24
            goto L7f
        L24:
            android.content.res.Resources r8 = r9.getResources()
            java.lang.String[] r1 = r8.getStringArray(r1)
            android.content.res.Resources r8 = r9.getResources()
            java.lang.String[] r3 = r8.getStringArray(r3)
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String[] r9 = r9.getStringArray(r2)
            int r2 = r1.length
            int r8 = r9.length
            if (r2 != r8) goto L5a
            int r2 = r3.length
            int r8 = r9.length
            if (r2 == r8) goto L45
            goto L5a
        L45:
            int r2 = r9.length
            if (r7 >= r2) goto L59
            com.google.firebase.crashlytics.internal.common.BuildIdInfo r2 = new com.google.firebase.crashlytics.internal.common.BuildIdInfo
            r4 = r1[r7]
            r5 = r3[r7]
            r6 = r9[r7]
            r2.<init>(r4, r5, r6)
            r0.add(r2)
            int r7 = r7 + 1
            goto L45
        L59:
            return r0
        L5a:
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r1 = r1.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5[r7] = r1
            int r1 = r3.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5[r6] = r1
            int r9 = r9.length
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5[r4] = r9
            java.lang.String r9 = "Lengths did not match: %d %d %d"
            java.lang.String r9 = java.lang.String.format(r9, r5)
            r2.d(r9)
            return r0
        L7f:
            com.google.firebase.crashlytics.internal.Logger r9 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5[r7] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r5[r6] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r5[r4] = r1
            java.lang.String r1 = "Could not find resources: %d %d %d"
            java.lang.String r1 = java.lang.String.format(r1, r5)
            r9.d(r1)
            return r0
    }

    public static int getCpuArchitectureInt() {
            com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r0 = com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.getValue()
            int r0 = r0.ordinal()
            return r0
    }

    public static int getDeviceState() {
            boolean r0 = isEmulator()
            boolean r1 = isRooted()
            if (r1 == 0) goto Lc
            r0 = r0 | 2
        Lc:
            boolean r1 = isDebuggerAttached()
            if (r1 == 0) goto L14
            r0 = r0 | 4
        L14:
            return r0
    }

    public static java.lang.String getMappingFileId(android.content.Context r2) {
            java.lang.String r0 = "com.google.firebase.crashlytics.mapping_file_id"
            java.lang.String r1 = "string"
            int r0 = getResourcesIdentifier(r2, r0, r1)
            if (r0 != 0) goto L10
            java.lang.String r0 = "com.crashlytics.android.build_id"
            int r0 = getResourcesIdentifier(r2, r0, r1)
        L10:
            if (r0 == 0) goto L1b
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r2 = r2.getString(r0)
            goto L1c
        L1b:
            r2 = 0
        L1c:
            return r2
    }

    public static boolean getProximitySensorEnabled(android.content.Context r2) {
            boolean r0 = isEmulator()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "sensor"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.hardware.SensorManager r2 = (android.hardware.SensorManager) r2
            r0 = 8
            android.hardware.Sensor r2 = r2.getDefaultSensor(r0)
            if (r2 == 0) goto L19
            r1 = 1
        L19:
            return r1
    }

    public static java.lang.String getResourcePackageName(android.content.Context r2) {
            android.content.Context r0 = r2.getApplicationContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.icon
            if (r0 <= 0) goto L26
            android.content.res.Resources r1 = r2.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L21
            java.lang.String r0 = r1.getResourcePackageName(r0)     // Catch: android.content.res.Resources.NotFoundException -> L21
            java.lang.String r1 = "android"
            boolean r1 = r1.equals(r0)     // Catch: android.content.res.Resources.NotFoundException -> L21
            if (r1 == 0) goto L2a
            java.lang.String r0 = r2.getPackageName()     // Catch: android.content.res.Resources.NotFoundException -> L21
            goto L2a
        L21:
            java.lang.String r0 = r2.getPackageName()
            goto L2a
        L26:
            java.lang.String r0 = r2.getPackageName()
        L2a:
            return r0
    }

    public static int getResourcesIdentifier(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r1 = getResourcePackageName(r1)
            int r1 = r0.getIdentifier(r2, r3, r1)
            return r1
    }

    public static android.content.SharedPreferences getSharedPrefs(android.content.Context r2) {
            java.lang.String r0 = "com.google.firebase.crashlytics"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    private static java.lang.String hash(java.lang.String r0, java.lang.String r1) {
            byte[] r0 = r0.getBytes()
            java.lang.String r0 = hash(r0, r1)
            return r0
    }

    private static java.lang.String hash(byte[] r3, java.lang.String r4) {
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch: java.security.NoSuchAlgorithmException -> L10
            r4.update(r3)
            byte[] r3 = r4.digest()
            java.lang.String r3 = hexify(r3)
            return r3
        L10:
            r3 = move-exception
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not create hashing algorithm: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", returning empty string."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.e(r4, r3)
            java.lang.String r3 = ""
            return r3
    }

    public static java.lang.String hexify(byte[] r6) {
            int r0 = r6.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            r1 = 0
        L6:
            int r2 = r6.length
            if (r1 >= r2) goto L22
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 * 2
            char[] r4 = com.google.firebase.crashlytics.internal.common.CommonUtils.HEX_VALUES
            int r5 = r2 >>> 4
            char r5 = r4[r5]
            r0[r3] = r5
            int r3 = r3 + 1
            r2 = r2 & 15
            char r2 = r4[r2]
            r0[r3] = r2
            int r1 = r1 + 1
            goto L6
        L22:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            return r6
    }

    public static boolean isAppDebuggable(android.content.Context r0) {
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r0 = r0 & 2
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isDebuggerAttached() {
            boolean r0 = android.os.Debug.isDebuggerConnected()
            if (r0 != 0) goto Lf
            boolean r0 = android.os.Debug.waitingForDebugger()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    public static boolean isEmulator() {
            java.lang.String r0 = android.os.Build.PRODUCT
            java.lang.String r1 = "sdk"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L1f
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "goldfish"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L1f
            java.lang.String r1 = "ranchu"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = 0
            goto L20
        L1f:
            r0 = 1
        L20:
            return r0
    }

    public static boolean isRooted() {
            boolean r0 = isEmulator()
            java.lang.String r1 = android.os.Build.TAGS
            r2 = 1
            if (r0 != 0) goto L14
            if (r1 == 0) goto L14
            java.lang.String r3 = "test-keys"
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L14
            return r2
        L14:
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "/system/app/Superuser.apk"
            r1.<init>(r3)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L22
            return r2
        L22:
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "/system/xbin/su"
            r1.<init>(r3)
            if (r0 != 0) goto L32
            boolean r0 = r1.exists()
            if (r0 == 0) goto L32
            return r2
        L32:
            r0 = 0
            return r0
    }

    public static boolean nullSafeEquals(java.lang.String r0, java.lang.String r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
        L8:
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static java.lang.String sha1(java.lang.String r1) {
            java.lang.String r0 = "SHA-1"
            java.lang.String r1 = hash(r1, r0)
            return r1
    }

    public static java.lang.String streamToString(java.io.InputStream r1) {
            java.util.Scanner r0 = new java.util.Scanner
            r0.<init>(r1)
            java.lang.String r1 = "\\A"
            java.util.Scanner r1 = r0.useDelimiter(r1)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.String r1 = r1.next()
            goto L18
        L16:
            java.lang.String r1 = ""
        L18:
            return r1
    }
}
