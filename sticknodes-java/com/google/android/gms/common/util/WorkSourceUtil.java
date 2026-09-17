package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class WorkSourceUtil {
    private static final int zza = 0;
    private static final java.lang.reflect.Method zzb = null;
    private static final java.lang.reflect.Method zzc = null;
    private static final java.lang.reflect.Method zzd = null;
    private static final java.lang.reflect.Method zze = null;
    private static final java.lang.reflect.Method zzf = null;
    private static final java.lang.reflect.Method zzg = null;
    private static final java.lang.reflect.Method zzh = null;
    private static final java.lang.reflect.Method zzi = null;
    private static java.lang.Boolean zzj;

    static {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "add"
            int r2 = android.os.Process.myUid()
            com.google.android.gms.common.util.WorkSourceUtil.zza = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1a
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L1a
            r6[r3] = r7     // Catch: java.lang.Exception -> L1a
            java.lang.reflect.Method r5 = r5.getMethod(r1, r6)     // Catch: java.lang.Exception -> L1a
            goto L1b
        L1a:
            r5 = r4
        L1b:
            com.google.android.gms.common.util.WorkSourceUtil.zzb = r5
            r5 = 2
            java.lang.Class<android.os.WorkSource> r6 = android.os.WorkSource.class
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L2d
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L2d
            r7[r3] = r8     // Catch: java.lang.Exception -> L2d
            r7[r2] = r0     // Catch: java.lang.Exception -> L2d
            java.lang.reflect.Method r1 = r6.getMethod(r1, r7)     // Catch: java.lang.Exception -> L2d
            goto L2e
        L2d:
            r1 = r4
        L2e:
            com.google.android.gms.common.util.WorkSourceUtil.zzc = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r6 = "size"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L3b
            java.lang.reflect.Method r1 = r1.getMethod(r6, r7)     // Catch: java.lang.Exception -> L3b
            goto L3c
        L3b:
            r1 = r4
        L3c:
            com.google.android.gms.common.util.WorkSourceUtil.zzd = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r6 = "get"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L4d
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4d
            r7[r3] = r8     // Catch: java.lang.Exception -> L4d
            java.lang.reflect.Method r1 = r1.getMethod(r6, r7)     // Catch: java.lang.Exception -> L4d
            goto L4e
        L4d:
            r1 = r4
        L4e:
            com.google.android.gms.common.util.WorkSourceUtil.zze = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r6 = "getName"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L5f
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L5f
            r7[r3] = r8     // Catch: java.lang.Exception -> L5f
            java.lang.reflect.Method r1 = r1.getMethod(r6, r7)     // Catch: java.lang.Exception -> L5f
            goto L60
        L5f:
            r1 = r4
        L60:
            com.google.android.gms.common.util.WorkSourceUtil.zzf = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            java.lang.String r6 = "WorkSourceUtil"
            if (r1 == 0) goto L7b
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r7 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L75
            java.lang.reflect.Method r1 = r1.getMethod(r7, r8)     // Catch: java.lang.Exception -> L75
            goto L7c
        L75:
            r1 = move-exception
            java.lang.String r7 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r6, r7, r1)
        L7b:
            r1 = r4
        L7c:
            com.google.android.gms.common.util.WorkSourceUtil.zzg = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r1 == 0) goto L9f
            java.lang.String r1 = "android.os.WorkSource$WorkChain"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L99
            java.lang.String r7 = "addNode"
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L99
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L99
            r5[r3] = r8     // Catch: java.lang.Exception -> L99
            r5[r2] = r0     // Catch: java.lang.Exception -> L99
            java.lang.reflect.Method r0 = r1.getMethod(r7, r5)     // Catch: java.lang.Exception -> L99
            goto La0
        L99:
            r0 = move-exception
            java.lang.String r1 = "Missing WorkChain class"
            android.util.Log.w(r6, r1, r0)
        L9f:
            r0 = r4
        La0:
            com.google.android.gms.common.util.WorkSourceUtil.zzh = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto Lb6
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r1 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> Lb6
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> Lb6
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> Lb7
            goto Lb7
        Lb6:
            r0 = r4
        Lb7:
            com.google.android.gms.common.util.WorkSourceUtil.zzi = r0
            com.google.android.gms.common.util.WorkSourceUtil.zzj = r4
            return
    }

    private WorkSourceUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void add(android.os.WorkSource r6, int r7, java.lang.String r8) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzc
            java.lang.String r1 = "Unable to assign blame through WorkSource"
            java.lang.String r2 = "WorkSourceUtil"
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L22
            if (r8 != 0) goto Le
            java.lang.String r8 = ""
        Le:
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L1d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L1d
            r5[r3] = r7     // Catch: java.lang.Exception -> L1d
            r5[r4] = r8     // Catch: java.lang.Exception -> L1d
            r0.invoke(r6, r5)     // Catch: java.lang.Exception -> L1d
            return
        L1d:
            r6 = move-exception
            android.util.Log.wtf(r2, r1, r6)
            return
        L22:
            java.lang.reflect.Method r8 = com.google.android.gms.common.util.WorkSourceUtil.zzb
            if (r8 == 0) goto L36
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L32
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L32
            r0[r3] = r7     // Catch: java.lang.Exception -> L32
            r8.invoke(r6, r0)     // Catch: java.lang.Exception -> L32
            return
        L32:
            r6 = move-exception
            android.util.Log.wtf(r2, r1, r6)
        L36:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.os.WorkSource fromPackage(android.content.Context r3, java.lang.String r4) {
            java.lang.String r0 = "WorkSourceUtil"
            r1 = 0
            if (r3 == 0) goto L36
            android.content.pm.PackageManager r2 = r3.getPackageManager()
            if (r2 == 0) goto L36
            if (r4 == 0) goto L36
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            r2 = 0
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            if (r3 != 0) goto L22
            java.lang.String r3 = "Could not get applicationInfo from package: "
            java.lang.String r3 = r3.concat(r4)
            android.util.Log.e(r0, r3)
            return r1
        L22:
            int r3 = r3.uid
            android.os.WorkSource r0 = new android.os.WorkSource
            r0.<init>()
            add(r0, r3, r4)
            return r0
        L2d:
            java.lang.String r3 = "Could not find package: "
            java.lang.String r3 = r3.concat(r4)
            android.util.Log.e(r0, r3)
        L36:
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.os.WorkSource fromPackageAndModuleExperimentalPi(android.content.Context r9, java.lang.String r10, java.lang.String r11) {
            r0 = 0
            java.lang.String r1 = "WorkSourceUtil"
            if (r9 == 0) goto L75
            android.content.pm.PackageManager r2 = r9.getPackageManager()
            if (r2 == 0) goto L75
            if (r11 == 0) goto L75
            if (r10 != 0) goto L10
            goto L75
        L10:
            r2 = -1
            r3 = 0
            com.google.android.gms.common.wrappers.PackageManagerWrapper r9 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo(r10, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            if (r9 != 0) goto L26
            java.lang.String r9 = "Could not get applicationInfo from package: "
            java.lang.String r9 = r9.concat(r10)
            android.util.Log.e(r1, r9)
            goto L32
        L26:
            int r2 = r9.uid
            goto L32
        L29:
            java.lang.String r9 = "Could not find package: "
            java.lang.String r9 = r9.concat(r10)
            android.util.Log.e(r1, r9)
        L32:
            if (r2 >= 0) goto L35
            return r0
        L35:
            android.os.WorkSource r9 = new android.os.WorkSource
            r9.<init>()
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzg
            if (r0 == 0) goto L71
            java.lang.reflect.Method r4 = com.google.android.gms.common.util.WorkSourceUtil.zzh
            if (r4 != 0) goto L43
            goto L71
        L43:
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L6a
            java.lang.Object r0 = r0.invoke(r9, r5)     // Catch: java.lang.Exception -> L6a
            int r5 = com.google.android.gms.common.util.WorkSourceUtil.zza     // Catch: java.lang.Exception -> L6a
            r6 = 1
            r7 = 2
            if (r2 == r5) goto L5c
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L6a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L6a
            r8[r3] = r2     // Catch: java.lang.Exception -> L6a
            r8[r6] = r10     // Catch: java.lang.Exception -> L6a
            r4.invoke(r0, r8)     // Catch: java.lang.Exception -> L6a
        L5c:
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L6a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L6a
            r10[r3] = r2     // Catch: java.lang.Exception -> L6a
            r10[r6] = r11     // Catch: java.lang.Exception -> L6a
            r4.invoke(r0, r10)     // Catch: java.lang.Exception -> L6a
            goto L74
        L6a:
            r10 = move-exception
            java.lang.String r11 = "Unable to assign chained blame through WorkSource"
            android.util.Log.w(r1, r11, r10)
            goto L74
        L71:
            add(r9, r2, r10)
        L74:
            return r9
        L75:
            java.lang.String r9 = "Unexpected null arguments"
            android.util.Log.w(r1, r9)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int get(android.os.WorkSource r3, int r4) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zze
            r1 = 0
            if (r0 == 0) goto L24
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L1c
            r2[r1] = r4     // Catch: java.lang.Exception -> L1c
            java.lang.Object r3 = r0.invoke(r3, r2)     // Catch: java.lang.Exception -> L1c
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Exception -> L1c
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L1c
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L1c
            return r3
        L1c:
            r3 = move-exception
            java.lang.String r4 = "WorkSourceUtil"
            java.lang.String r0 = "Unable to assign blame through WorkSource"
            android.util.Log.wtf(r4, r0, r3)
        L24:
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String getName(android.os.WorkSource r3, int r4) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzf
            if (r0 == 0) goto L1d
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L15
            r2 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L15
            r1[r2] = r4     // Catch: java.lang.Exception -> L15
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L15
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L15
            return r3
        L15:
            r3 = move-exception
            java.lang.String r4 = "WorkSourceUtil"
            java.lang.String r0 = "Unable to assign blame through WorkSource"
            android.util.Log.wtf(r4, r0, r3)
        L1d:
            r3 = 0
            return r3
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.util.List<java.lang.String> getNames(android.os.WorkSource r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            if (r5 != 0) goto La
            r2 = 0
            goto Le
        La:
            int r2 = size(r5)
        Le:
            if (r2 == 0) goto L25
        L10:
            if (r1 >= r2) goto L25
            java.lang.String r3 = getName(r5, r1)
            boolean r4 = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(r3)
            if (r4 != 0) goto L22
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            r0.add(r3)
        L22:
            int r1 = r1 + 1
            goto L10
        L25:
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static synchronized boolean hasWorkSourcePermission(android.content.Context r3) {
            java.lang.Class<com.google.android.gms.common.util.WorkSourceUtil> r0 = com.google.android.gms.common.util.WorkSourceUtil.class
            monitor-enter(r0)
            java.lang.Boolean r1 = com.google.android.gms.common.util.WorkSourceUtil.zzj     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto Ld
            boolean r3 = r1.booleanValue()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)
            return r3
        Ld:
            r1 = 0
            if (r3 != 0) goto L12
            monitor-exit(r0)
            return r1
        L12:
            java.lang.String r2 = "android.permission.UPDATE_DEVICE_STATS"
            int r3 = androidx.core.content.ContextCompat.checkSelfPermission(r3, r2)     // Catch: java.lang.Throwable -> L27
            if (r3 != 0) goto L1b
            r1 = 1
        L1b:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.common.util.WorkSourceUtil.zzj = r3     // Catch: java.lang.Throwable -> L27
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)
            return r3
        L27:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isEmpty(android.os.WorkSource r4) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzi
            r1 = 0
            if (r0 == 0) goto L1d
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L15
            java.lang.Object r0 = r0.invoke(r4, r2)     // Catch: java.lang.Exception -> L15
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Exception -> L15
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L15
            boolean r4 = r0.booleanValue()     // Catch: java.lang.Exception -> L15
            return r4
        L15:
            r0 = move-exception
            java.lang.String r2 = "WorkSourceUtil"
            java.lang.String r3 = "Unable to check WorkSource emptiness"
            android.util.Log.e(r2, r3, r0)
        L1d:
            int r4 = size(r4)
            if (r4 != 0) goto L25
            r4 = 1
            return r4
        L25:
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int size(android.os.WorkSource r3) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzd
            r1 = 0
            if (r0 == 0) goto L1d
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L15
            java.lang.Object r3 = r0.invoke(r3, r2)     // Catch: java.lang.Exception -> L15
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Exception -> L15
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L15
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L15
            return r3
        L15:
            r3 = move-exception
            java.lang.String r0 = "WorkSourceUtil"
            java.lang.String r2 = "Unable to assign blame through WorkSource"
            android.util.Log.wtf(r0, r2, r3)
        L1d:
            return r1
    }
}
