package com.google.android.gms.dynamite;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public final class DynamiteModule {

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int LOCAL = -1;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int NONE = 0;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int NO_SELECTION = 0;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = null;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = null;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = null;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_LOCAL = null;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE = null;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = null;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int REMOTE = 1;
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy zza = null;
    private static java.lang.Boolean zzb = null;
    private static java.lang.String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static java.lang.Boolean zzf;
    private static final java.lang.ThreadLocal zzg = null;
    private static final java.lang.ThreadLocal zzh = null;
    private static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions zzi = null;
    private static com.google.android.gms.dynamite.zzp zzk;
    private static com.google.android.gms.dynamite.zzq zzl;
    private final android.content.Context zzj;

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    @com.google.android.gms.common.util.DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static java.lang.ClassLoader sClassLoader;

        public DynamiteLoaderClassLoader() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class LoadingException extends java.lang.Exception {
        /* synthetic */ LoadingException(java.lang.String r1, com.google.android.gms.dynamite.zzo r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* synthetic */ LoadingException(java.lang.String r1, java.lang.Throwable r2, com.google.android.gms.dynamite.zzo r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    public interface VersionPolicy {

        /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
        @com.google.android.gms.common.annotation.KeepForSdk
        public interface IVersions {
            int zza(android.content.Context r1, java.lang.String r2);

            int zzb(android.content.Context r1, java.lang.String r2, boolean r3) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException;
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
        @com.google.android.gms.common.annotation.KeepForSdk
        public static class SelectionResult {

            @com.google.android.gms.common.annotation.KeepForSdk
            public int localVersion;

            @com.google.android.gms.common.annotation.KeepForSdk
            public int remoteVersion;

            @com.google.android.gms.common.annotation.KeepForSdk
            public int selection;

            public SelectionResult() {
                    r1 = this;
                    r1.<init>()
                    r0 = 0
                    r1.localVersion = r0
                    r1.remoteVersion = r0
                    r1.selection = r0
                    return
            }
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context r1, java.lang.String r2, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions r3) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException;
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zzg = r0
            com.google.android.gms.dynamite.zzd r0 = new com.google.android.gms.dynamite.zzd
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zzh = r0
            com.google.android.gms.dynamite.zze r0 = new com.google.android.gms.dynamite.zze
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zzi = r0
            com.google.android.gms.dynamite.zzf r0 = new com.google.android.gms.dynamite.zzf
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE = r0
            com.google.android.gms.dynamite.zzg r0 = new com.google.android.gms.dynamite.zzg
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_LOCAL = r0
            com.google.android.gms.dynamite.zzh r0 = new com.google.android.gms.dynamite.zzh
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE_VERSION_NO_FORCE_STAGING = r0
            com.google.android.gms.dynamite.zzi r0 = new com.google.android.gms.dynamite.zzi
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION = r0
            com.google.android.gms.dynamite.zzj r0 = new com.google.android.gms.dynamite.zzj
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = r0
            com.google.android.gms.dynamite.zzk r0 = new com.google.android.gms.dynamite.zzk
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION = r0
            com.google.android.gms.dynamite.zzl r0 = new com.google.android.gms.dynamite.zzl
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zza = r0
            return
    }

    private DynamiteModule(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zzj = r1
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int getLocalVersion(android.content.Context r5, java.lang.String r6) {
            java.lang.String r0 = "DynamiteModule"
            r1 = 0
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            r2.<init>()     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            java.lang.String r3 = "com.google.android.gms.dynamite.descriptors."
            r2.append(r3)     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            r2.append(r6)     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            java.lang.String r3 = ".ModuleDescriptor"
            r2.append(r3)     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            java.lang.Class r5 = r5.loadClass(r2)     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            java.lang.String r2 = "MODULE_ID"
            java.lang.reflect.Field r2 = r5.getDeclaredField(r2)     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            java.lang.String r3 = "MODULE_VERSION"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r3)     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r4, r6)     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            if (r4 != 0) goto L66
            java.lang.Object r5 = r2.get(r3)     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            r2.<init>()     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            java.lang.String r3 = "Module descriptor id '"
            r2.append(r3)     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            r2.append(r5)     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            java.lang.String r5 = "' didn't match expected id '"
            r2.append(r5)     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            r2.append(r6)     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            java.lang.String r5 = "'"
            r2.append(r5)     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            android.util.Log.e(r0, r5)     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            return r1
        L66:
            int r5 = r5.getInt(r3)     // Catch: java.lang.Exception -> L6b java.lang.ClassNotFoundException -> L7e
            return r5
        L6b:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "Failed to load module descriptor class: "
            java.lang.String r5 = r6.concat(r5)
            android.util.Log.e(r0, r5)
            goto L97
        L7e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "Local module descriptor class for "
            r5.append(r2)
            r5.append(r6)
            java.lang.String r6 = " not found."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r0, r5)
        L97:
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int getRemoteVersion(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            int r1 = zza(r1, r2, r0)
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context r16, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy r17, java.lang.String r18) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r1 = r16
            r2 = r17
            r3 = r18
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            android.content.Context r5 = r16.getApplicationContext()
            r6 = 0
            if (r5 == 0) goto L2cb
            java.lang.ThreadLocal r0 = com.google.android.gms.dynamite.DynamiteModule.zzg
            java.lang.Object r7 = r0.get()
            com.google.android.gms.dynamite.zzm r7 = (com.google.android.gms.dynamite.zzm) r7
            com.google.android.gms.dynamite.zzm r8 = new com.google.android.gms.dynamite.zzm
            r8.<init>(r6)
            r0.set(r8)
            java.lang.ThreadLocal r9 = com.google.android.gms.dynamite.DynamiteModule.zzh
            java.lang.Object r10 = r9.get()
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L2a8
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> L2a8
            r9.set(r14)     // Catch: java.lang.Throwable -> L2a8
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions r9 = com.google.android.gms.dynamite.DynamiteModule.zzi     // Catch: java.lang.Throwable -> L2a8
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r9 = r2.selectModule(r1, r3, r9)     // Catch: java.lang.Throwable -> L2a8
            java.lang.String r14 = "DynamiteModule"
            int r15 = r9.localVersion     // Catch: java.lang.Throwable -> L2a8
            int r12 = r9.remoteVersion     // Catch: java.lang.Throwable -> L2a8
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a8
            r13.<init>()     // Catch: java.lang.Throwable -> L2a8
            java.lang.String r6 = "Considering local module "
            r13.append(r6)     // Catch: java.lang.Throwable -> L2a8
            r13.append(r3)     // Catch: java.lang.Throwable -> L2a8
            java.lang.String r6 = ":"
            r13.append(r6)     // Catch: java.lang.Throwable -> L2a8
            r13.append(r15)     // Catch: java.lang.Throwable -> L2a8
            java.lang.String r6 = " and remote module "
            r13.append(r6)     // Catch: java.lang.Throwable -> L2a8
            r13.append(r3)     // Catch: java.lang.Throwable -> L2a8
            java.lang.String r6 = ":"
            r13.append(r6)     // Catch: java.lang.Throwable -> L2a8
            r13.append(r12)     // Catch: java.lang.Throwable -> L2a8
            java.lang.String r6 = r13.toString()     // Catch: java.lang.Throwable -> L2a8
            android.util.Log.i(r14, r6)     // Catch: java.lang.Throwable -> L2a8
            int r6 = r9.selection     // Catch: java.lang.Throwable -> L2a8
            if (r6 == 0) goto L277
            r12 = -1
            if (r6 != r12) goto L7a
            int r6 = r9.localVersion     // Catch: java.lang.Throwable -> L2a8
            if (r6 == 0) goto L277
            r6 = -1
        L7a:
            r13 = 1
            if (r6 != r13) goto L81
            int r14 = r9.remoteVersion     // Catch: java.lang.Throwable -> L2a8
            if (r14 == 0) goto L277
        L81:
            if (r6 != r12) goto L8b
            com.google.android.gms.dynamite.DynamiteModule r0 = zzc(r5, r3)     // Catch: java.lang.Throwable -> L2a8
        L87:
            r1 = 0
            goto L236
        L8b:
            if (r6 != r13) goto L25f
            int r14 = r9.remoteVersion     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L202 java.lang.Throwable -> L2a8
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            boolean r15 = zzf(r16)     // Catch: java.lang.Throwable -> L1e6
            if (r15 == 0) goto L1dd
            java.lang.Boolean r15 = com.google.android.gms.dynamite.DynamiteModule.zzb     // Catch: java.lang.Throwable -> L1e6
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e6
            if (r15 == 0) goto L1d4
            boolean r15 = r15.booleanValue()     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            r13 = 2
            if (r15 == 0) goto L146
            java.lang.String r15 = "DynamiteModule"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            r12.<init>()     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            java.lang.String r6 = "Selected remote version of "
            r12.append(r6)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            r12.append(r3)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            java.lang.String r6 = ", version >= "
            r12.append(r6)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            r12.append(r14)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            java.lang.String r6 = r12.toString()     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            android.util.Log.i(r15, r6)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            com.google.android.gms.dynamite.zzq r6 = com.google.android.gms.dynamite.DynamiteModule.zzl     // Catch: java.lang.Throwable -> L143
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L143
            if (r6 == 0) goto L13a
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            com.google.android.gms.dynamite.zzm r0 = (com.google.android.gms.dynamite.zzm) r0     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            if (r0 == 0) goto L131
            android.database.Cursor r12 = r0.zza     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            if (r12 == 0) goto L131
            android.content.Context r12 = r16.getApplicationContext()     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            android.database.Cursor r0 = r0.zza     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            r15 = 0
            com.google.android.gms.dynamic.ObjectWrapper.wrap(r15)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            int r15 = com.google.android.gms.dynamite.DynamiteModule.zze     // Catch: java.lang.Throwable -> L12e
            if (r15 < r13) goto Le3
            r13 = 1
            goto Le4
        Le3:
            r13 = 0
        Le4:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch: java.lang.Throwable -> L12e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12e
            boolean r4 = r13.booleanValue()     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            if (r4 == 0) goto L103
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r13 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r4, r13)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r12)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            com.google.android.gms.dynamic.IObjectWrapper r0 = r6.zzf(r4, r3, r14, r0)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            goto L116
        L103:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r13 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r4, r13)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r12)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            com.google.android.gms.dynamic.IObjectWrapper r0 = r6.zze(r4, r3, r14, r0)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
        L116:
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            if (r0 == 0) goto L125
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            goto L1bf
        L125:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            java.lang.String r4 = "Failed to get module context"
            r6 = 0
            r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            throw r0     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
        L12e:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12e
            throw r0     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
        L131:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            java.lang.String r4 = "No result cursor"
            r6 = 0
            r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            throw r0     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
        L13a:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            java.lang.String r4 = "DynamiteLoaderV2 was not cached."
            r6 = 0
            r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            throw r0     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
        L143:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L143
            throw r0     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
        L146:
            java.lang.String r4 = "DynamiteModule"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            r6.<init>()     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            java.lang.String r12 = "Selected remote version of "
            r6.append(r12)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            r6.append(r3)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            java.lang.String r12 = ", version >= "
            r6.append(r12)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            r6.append(r14)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            android.util.Log.i(r4, r6)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            com.google.android.gms.dynamite.zzp r4 = zzg(r16)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            if (r4 == 0) goto L1cb
            int r6 = r4.zze()     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            r12 = 3
            if (r6 < r12) goto L191
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            com.google.android.gms.dynamite.zzm r0 = (com.google.android.gms.dynamite.zzm) r0     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            if (r0 == 0) goto L188
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r16)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            android.database.Cursor r0 = r0.zza     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            com.google.android.gms.dynamic.IObjectWrapper r0 = r4.zzi(r6, r3, r14, r0)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            goto L1b2
        L188:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            java.lang.String r4 = "No cached result cursor holder"
            r6 = 0
            r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            throw r0     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
        L191:
            if (r6 != r13) goto L1a3
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r6 = "IDynamite loader version = 2"
            android.util.Log.w(r0, r6)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r16)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            com.google.android.gms.dynamic.IObjectWrapper r0 = r4.zzj(r0, r3, r14)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            goto L1b2
        L1a3:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r6 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r0, r6)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r16)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            com.google.android.gms.dynamic.IObjectWrapper r0 = r4.zzh(r0, r3, r14)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
        L1b2:
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            if (r0 == 0) goto L1c2
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
        L1bf:
            r0 = r4
            goto L87
        L1c2:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            java.lang.String r4 = "Failed to load remote module."
            r6 = 0
            r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            throw r0     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
        L1cb:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            java.lang.String r4 = "Failed to create IDynamiteLoader."
            r6 = 0
            r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            throw r0     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
        L1d4:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            java.lang.String r4 = "Failed to determine which loading route to use."
            r6 = 0
            r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
            throw r0     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
        L1dd:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L1e6
            java.lang.String r6 = "Remote loading disabled"
            r12 = 0
            r0.<init>(r6, r12)     // Catch: java.lang.Throwable -> L1e6
            throw r0     // Catch: java.lang.Throwable -> L1e6
        L1e6:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e6
            throw r0     // Catch: java.lang.Throwable -> L1e9 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L1f6 android.os.RemoteException -> L1f8
        L1e9:
            r0 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r1, r0)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L202 java.lang.Throwable -> L2a8
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r4 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L202 java.lang.Throwable -> L2a8
            java.lang.String r6 = "Failed to load remote module."
            r12 = 0
            r4.<init>(r6, r0, r12)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L202 java.lang.Throwable -> L2a8
            throw r4     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L202 java.lang.Throwable -> L2a8
        L1f6:
            r0 = move-exception
            throw r0     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L202 java.lang.Throwable -> L2a8
        L1f8:
            r0 = move-exception
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r4 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L202 java.lang.Throwable -> L2a8
            java.lang.String r6 = "Failed to load remote module."
            r12 = 0
            r4.<init>(r6, r0, r12)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L202 java.lang.Throwable -> L2a8
            throw r4     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L202 java.lang.Throwable -> L2a8
        L202:
            r0 = move-exception
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r6 = r0.getMessage()     // Catch: java.lang.Throwable -> L2a8
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a8
            r12.<init>()     // Catch: java.lang.Throwable -> L2a8
            java.lang.String r13 = "Failed to load remote module: "
            r12.append(r13)     // Catch: java.lang.Throwable -> L2a8
            r12.append(r6)     // Catch: java.lang.Throwable -> L2a8
            java.lang.String r6 = r12.toString()     // Catch: java.lang.Throwable -> L2a8
            android.util.Log.w(r4, r6)     // Catch: java.lang.Throwable -> L2a8
            int r4 = r9.localVersion     // Catch: java.lang.Throwable -> L2a8
            if (r4 == 0) goto L256
            com.google.android.gms.dynamite.zzn r6 = new com.google.android.gms.dynamite.zzn     // Catch: java.lang.Throwable -> L2a8
            r9 = 0
            r6.<init>(r4, r9)     // Catch: java.lang.Throwable -> L2a8
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r1 = r2.selectModule(r1, r3, r6)     // Catch: java.lang.Throwable -> L2a8
            int r1 = r1.selection     // Catch: java.lang.Throwable -> L2a8
            r2 = -1
            if (r1 != r2) goto L256
            com.google.android.gms.dynamite.DynamiteModule r0 = zzc(r5, r3)     // Catch: java.lang.Throwable -> L2a8
            goto L87
        L236:
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 != 0) goto L240
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzh
            r1.remove()
            goto L249
        L240:
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzh
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r1.set(r2)
        L249:
            android.database.Cursor r1 = r8.zza
            if (r1 == 0) goto L250
            r1.close()
        L250:
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzg
            r1.set(r7)
            return r0
        L256:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L2a8
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r3 = 0
            r1.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L2a8
            throw r1     // Catch: java.lang.Throwable -> L2a8
        L25f:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L2a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a8
            r1.<init>()     // Catch: java.lang.Throwable -> L2a8
            java.lang.String r2 = "VersionPolicy returned invalid code:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L2a8
            r1.append(r6)     // Catch: java.lang.Throwable -> L2a8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2a8
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L2a8
            throw r0     // Catch: java.lang.Throwable -> L2a8
        L277:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L2a8
            int r1 = r9.localVersion     // Catch: java.lang.Throwable -> L2a8
            int r2 = r9.remoteVersion     // Catch: java.lang.Throwable -> L2a8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a8
            r4.<init>()     // Catch: java.lang.Throwable -> L2a8
            java.lang.String r5 = "No acceptable module "
            r4.append(r5)     // Catch: java.lang.Throwable -> L2a8
            r4.append(r3)     // Catch: java.lang.Throwable -> L2a8
            java.lang.String r3 = " found. Local version is "
            r4.append(r3)     // Catch: java.lang.Throwable -> L2a8
            r4.append(r1)     // Catch: java.lang.Throwable -> L2a8
            java.lang.String r1 = " and remote version is "
            r4.append(r1)     // Catch: java.lang.Throwable -> L2a8
            r4.append(r2)     // Catch: java.lang.Throwable -> L2a8
            java.lang.String r1 = "."
            r4.append(r1)     // Catch: java.lang.Throwable -> L2a8
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L2a8
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L2a8
            throw r0     // Catch: java.lang.Throwable -> L2a8
        L2a8:
            r0 = move-exception
            r1 = 0
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 != 0) goto L2b5
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzh
            r1.remove()
            goto L2be
        L2b5:
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzh
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r1.set(r2)
        L2be:
            android.database.Cursor r1 = r8.zza
            if (r1 == 0) goto L2c5
            r1.close()
        L2c5:
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzg
            r1.set(r7)
            throw r0
        L2cb:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r1 = "null application Context"
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
    }

    public static int zza(android.content.Context r10, java.lang.String r11, boolean r12) {
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L1c2
            java.lang.Boolean r1 = com.google.android.gms.dynamite.DynamiteModule.zzb     // Catch: java.lang.Throwable -> L1bf
            r2 = 0
            r3 = 0
            if (r1 != 0) goto Ld8
            android.content.Context r1 = r10.getApplicationContext()     // Catch: java.lang.NoSuchFieldException -> Lb5 java.lang.IllegalAccessException -> Lb7 java.lang.ClassNotFoundException -> Lb9 java.lang.Throwable -> L1bf
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.NoSuchFieldException -> Lb5 java.lang.IllegalAccessException -> Lb7 java.lang.ClassNotFoundException -> Lb9 java.lang.Throwable -> L1bf
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch: java.lang.NoSuchFieldException -> Lb5 java.lang.IllegalAccessException -> Lb7 java.lang.ClassNotFoundException -> Lb9 java.lang.Throwable -> L1bf
            java.lang.Class r1 = r1.loadClass(r4)     // Catch: java.lang.NoSuchFieldException -> Lb5 java.lang.IllegalAccessException -> Lb7 java.lang.ClassNotFoundException -> Lb9 java.lang.Throwable -> L1bf
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> Lb5 java.lang.IllegalAccessException -> Lb7 java.lang.ClassNotFoundException -> Lb9 java.lang.Throwable -> L1bf
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch: java.lang.NoSuchFieldException -> Lb5 java.lang.IllegalAccessException -> Lb7 java.lang.ClassNotFoundException -> Lb9 java.lang.Throwable -> L1bf
            monitor-enter(r4)     // Catch: java.lang.NoSuchFieldException -> Lb5 java.lang.IllegalAccessException -> Lb7 java.lang.ClassNotFoundException -> Lb9 java.lang.Throwable -> L1bf
            java.lang.Object r5 = r1.get(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch: java.lang.Throwable -> Lb2
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> Lb2
            if (r5 != r6) goto L36
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lb2
            goto Lb0
        L36:
            if (r5 == 0) goto L3f
            zzd(r5)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L3b java.lang.Throwable -> Lb2
        L3b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lb2
            goto Lb0
        L3f:
            boolean r5 = zzf(r10)     // Catch: java.lang.Throwable -> Lb2
            if (r5 != 0) goto L48
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1bf
            return r3
        L48:
            boolean r5 = com.google.android.gms.dynamite.DynamiteModule.zzd     // Catch: java.lang.Throwable -> Lb2
            if (r5 != 0) goto La7
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lb2
            boolean r6 = r5.equals(r2)     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto L55
            goto La7
        L55:
            r6 = 1
            int r6 = zzb(r10, r11, r12, r6)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L9d java.lang.Throwable -> Lb2
            java.lang.String r7 = com.google.android.gms.dynamite.DynamiteModule.zzc     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L9d java.lang.Throwable -> Lb2
            if (r7 == 0) goto L9a
            boolean r7 = r7.isEmpty()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L9d java.lang.Throwable -> Lb2
            if (r7 == 0) goto L65
            goto L9a
        L65:
            java.lang.ClassLoader r7 = com.google.android.gms.dynamite.zzb.zza()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L9d java.lang.Throwable -> Lb2
            if (r7 == 0) goto L6c
            goto L8f
        L6c:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L9d java.lang.Throwable -> Lb2
            r8 = 29
            if (r7 < r8) goto L81
            dalvik.system.DelegateLastClassLoader r7 = new dalvik.system.DelegateLastClassLoader     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L9d java.lang.Throwable -> Lb2
            java.lang.String r8 = com.google.android.gms.dynamite.DynamiteModule.zzc     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L9d java.lang.Throwable -> Lb2
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L9d java.lang.Throwable -> Lb2
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L9d java.lang.Throwable -> Lb2
            r7.<init>(r8, r9)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L9d java.lang.Throwable -> Lb2
            goto L8f
        L81:
            com.google.android.gms.dynamite.zzc r7 = new com.google.android.gms.dynamite.zzc     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L9d java.lang.Throwable -> Lb2
            java.lang.String r8 = com.google.android.gms.dynamite.DynamiteModule.zzc     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L9d java.lang.Throwable -> Lb2
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L9d java.lang.Throwable -> Lb2
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L9d java.lang.Throwable -> Lb2
            r7.<init>(r8, r9)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L9d java.lang.Throwable -> Lb2
        L8f:
            zzd(r7)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L9d java.lang.Throwable -> Lb2
            r1.set(r2, r7)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L9d java.lang.Throwable -> Lb2
            com.google.android.gms.dynamite.DynamiteModule.zzb = r5     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L9d java.lang.Throwable -> Lb2
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1bf
            return r6
        L9a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1bf
            return r6
        L9d:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> Lb2
            r1.set(r2, r5)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lb2
            goto Lb0
        La7:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> Lb2
            r1.set(r2, r5)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lb2
        Lb0:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb2
            goto Ld6
        Lb2:
            r1 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb2
            throw r1     // Catch: java.lang.NoSuchFieldException -> Lb5 java.lang.IllegalAccessException -> Lb7 java.lang.ClassNotFoundException -> Lb9 java.lang.Throwable -> L1bf
        Lb5:
            r1 = move-exception
            goto Lba
        Lb7:
            r1 = move-exception
            goto Lba
        Lb9:
            r1 = move-exception
        Lba:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1bf
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1bf
            r5.<init>()     // Catch: java.lang.Throwable -> L1bf
            java.lang.String r6 = "Failed to load module via V2: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L1bf
            r5.append(r1)     // Catch: java.lang.Throwable -> L1bf
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L1bf
            android.util.Log.w(r4, r1)     // Catch: java.lang.Throwable -> L1bf
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1bf
        Ld6:
            com.google.android.gms.dynamite.DynamiteModule.zzb = r1     // Catch: java.lang.Throwable -> L1bf
        Ld8:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1bf
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> L1c2
            if (r0 == 0) goto L100
            int r10 = zzb(r10, r11, r12, r3)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Le4 java.lang.Throwable -> L1c2
            return r10
        Le4:
            r11 = move-exception
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> L1c2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c2
            r0.<init>()     // Catch: java.lang.Throwable -> L1c2
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1c2
            r0.append(r11)     // Catch: java.lang.Throwable -> L1c2
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Throwable -> L1c2
            android.util.Log.w(r12, r11)     // Catch: java.lang.Throwable -> L1c2
            return r3
        L100:
            com.google.android.gms.dynamite.zzp r4 = zzg(r10)     // Catch: java.lang.Throwable -> L1c2
            if (r4 != 0) goto L108
            goto L1b6
        L108:
            int r0 = r4.zze()     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            r1 = 3
            if (r0 < r1) goto L170
            java.lang.ThreadLocal r0 = com.google.android.gms.dynamite.DynamiteModule.zzg     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            java.lang.Object r0 = r0.get()     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            com.google.android.gms.dynamite.zzm r0 = (com.google.android.gms.dynamite.zzm) r0     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            if (r0 == 0) goto L123
            android.database.Cursor r0 = r0.zza     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            if (r0 == 0) goto L123
            int r3 = r0.getInt(r3)     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            goto L1b6
        L123:
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            java.lang.ThreadLocal r0 = com.google.android.gms.dynamite.DynamiteModule.zzh     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            java.lang.Object r0 = r0.get()     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            long r8 = r0.longValue()     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            r6 = r11
            r7 = r12
            com.google.android.gms.dynamic.IObjectWrapper r11 = r4.zzk(r5, r6, r7, r8)     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            java.lang.Object r11 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r11)     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            if (r11 == 0) goto L15d
            boolean r12 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L16a android.os.RemoteException -> L16d
            if (r12 != 0) goto L148
            goto L15d
        L148:
            int r12 = r11.getInt(r3)     // Catch: java.lang.Throwable -> L16a android.os.RemoteException -> L16d
            if (r12 <= 0) goto L155
            boolean r0 = zze(r11)     // Catch: java.lang.Throwable -> L16a android.os.RemoteException -> L16d
            if (r0 == 0) goto L155
            goto L156
        L155:
            r2 = r11
        L156:
            if (r2 == 0) goto L15b
            r2.close()     // Catch: java.lang.Throwable -> L1c2
        L15b:
            r3 = r12
            goto L1b6
        L15d:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r12, r0)     // Catch: java.lang.Throwable -> L16a android.os.RemoteException -> L16d
            if (r11 == 0) goto L1b6
            r11.close()     // Catch: java.lang.Throwable -> L1c2
            goto L1b6
        L16a:
            r12 = move-exception
            r2 = r11
            goto L1b9
        L16d:
            r12 = move-exception
            r2 = r11
            goto L197
        L170:
            r1 = 2
            if (r0 != r1) goto L183
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r1)     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            int r3 = r4.zzg(r0, r11, r12)     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            goto L1b6
        L183:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r1)     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            int r3 = r4.zzf(r0, r11, r12)     // Catch: android.os.RemoteException -> L195 java.lang.Throwable -> L1b7
            goto L1b6
        L193:
            r12 = r11
            goto L1b9
        L195:
            r11 = move-exception
            r12 = r11
        L197:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> L1b7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b7
            r0.<init>()     // Catch: java.lang.Throwable -> L1b7
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1b7
            r0.append(r12)     // Catch: java.lang.Throwable -> L1b7
            java.lang.String r12 = r0.toString()     // Catch: java.lang.Throwable -> L1b7
            android.util.Log.w(r11, r12)     // Catch: java.lang.Throwable -> L1b7
            if (r2 == 0) goto L1b6
            r2.close()     // Catch: java.lang.Throwable -> L1c2
        L1b6:
            return r3
        L1b7:
            r11 = move-exception
            goto L193
        L1b9:
            if (r2 == 0) goto L1be
            r2.close()     // Catch: java.lang.Throwable -> L1c2
        L1be:
            throw r12     // Catch: java.lang.Throwable -> L1c2
        L1bf:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1bf
            throw r11     // Catch: java.lang.Throwable -> L1c2
        L1c2:
            r11 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r10, r11)
            throw r11
    }

    private static int zzb(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r0 = 0
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzh     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
            java.lang.String r3 = "api_force_staging"
            java.lang.String r4 = "api"
            r5 = 1
            if (r5 == r14) goto L15
            r3 = r4
        L15:
            android.net.Uri$Builder r14 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
            r14.<init>()     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
            java.lang.String r4 = "content"
            android.net.Uri$Builder r14 = r14.scheme(r4)     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r14 = r14.authority(r4)     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
            android.net.Uri$Builder r14 = r14.path(r3)     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
            android.net.Uri$Builder r13 = r14.appendPath(r13)     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
            java.lang.String r14 = "requestStartUptime"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
            android.net.Uri$Builder r13 = r13.appendQueryParameter(r14, r1)     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
            android.net.Uri r7 = r13.build()     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
            android.content.ContentResolver r12 = r12.getContentResolver()     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
            android.content.ContentProviderClient r12 = r12.acquireUnstableContentProviderClient(r7)     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
            r13 = 2
            r14 = 0
            if (r12 != 0) goto L4b
        L48:
            r4 = r0
            goto Lde
        L4b:
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r6 = r12
            android.database.Cursor r1 = r6.query(r7, r8, r9, r10, r11)     // Catch: android.os.RemoteException -> L56 java.lang.Throwable -> Ld9
            if (r1 != 0) goto L5a
        L56:
            r12.release()     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
            goto L48
        L5a:
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> Lcf
            int r3 = r1.getColumnCount()     // Catch: java.lang.Throwable -> Lcf
            android.database.MatrixCursor r4 = new android.database.MatrixCursor     // Catch: java.lang.Throwable -> Lcf
            java.lang.String[] r6 = r1.getColumnNames()     // Catch: java.lang.Throwable -> Lcf
            r4.<init>(r6, r2)     // Catch: java.lang.Throwable -> Lcf
            r6 = 0
        L6c:
            if (r6 >= r2) goto Lc8
            boolean r7 = r1.moveToPosition(r6)     // Catch: java.lang.Throwable -> Lcf
            if (r7 == 0) goto Lc0
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lcf
            r8 = 0
        L77:
            if (r8 >= r3) goto Lba
            int r9 = r1.getType(r8)     // Catch: java.lang.Throwable -> Lcf
            if (r9 == 0) goto Lb5
            if (r9 == r5) goto Laa
            if (r9 == r13) goto L9f
            r10 = 3
            if (r9 == r10) goto L98
            r10 = 4
            if (r9 != r10) goto L90
            byte[] r9 = r1.getBlob(r8)     // Catch: java.lang.Throwable -> Lcf
            r7[r8] = r9     // Catch: java.lang.Throwable -> Lcf
            goto Lb7
        L90:
            android.os.RemoteException r2 = new android.os.RemoteException     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r3 = "Unknown column type"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lcf
            throw r2     // Catch: java.lang.Throwable -> Lcf
        L98:
            java.lang.String r9 = r1.getString(r8)     // Catch: java.lang.Throwable -> Lcf
            r7[r8] = r9     // Catch: java.lang.Throwable -> Lcf
            goto Lb7
        L9f:
            double r9 = r1.getDouble(r8)     // Catch: java.lang.Throwable -> Lcf
            java.lang.Double r9 = java.lang.Double.valueOf(r9)     // Catch: java.lang.Throwable -> Lcf
            r7[r8] = r9     // Catch: java.lang.Throwable -> Lcf
            goto Lb7
        Laa:
            long r9 = r1.getLong(r8)     // Catch: java.lang.Throwable -> Lcf
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> Lcf
            r7[r8] = r9     // Catch: java.lang.Throwable -> Lcf
            goto Lb7
        Lb5:
            r7[r8] = r0     // Catch: java.lang.Throwable -> Lcf
        Lb7:
            int r8 = r8 + 1
            goto L77
        Lba:
            r4.addRow(r7)     // Catch: java.lang.Throwable -> Lcf
            int r6 = r6 + 1
            goto L6c
        Lc0:
            android.os.RemoteException r2 = new android.os.RemoteException     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r3 = "Cursor read incomplete (ContentProvider dead?)"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lcf
            throw r2     // Catch: java.lang.Throwable -> Lcf
        Lc8:
            r1.close()     // Catch: android.os.RemoteException -> L56 java.lang.Throwable -> Ld9
            r12.release()     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
            goto Lde
        Lcf:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> Ld4
            goto Ld8
        Ld4:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch: android.os.RemoteException -> L56 java.lang.Throwable -> Ld9
        Ld8:
            throw r2     // Catch: android.os.RemoteException -> L56 java.lang.Throwable -> Ld9
        Ld9:
            r13 = move-exception
            r12.release()     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
            throw r13     // Catch: java.lang.Throwable -> L146 java.lang.Exception -> L148
        Lde:
            if (r4 == 0) goto L137
            boolean r12 = r4.moveToFirst()     // Catch: java.lang.Exception -> L12f java.lang.Throwable -> L16a
            if (r12 == 0) goto L137
            int r12 = r4.getInt(r14)     // Catch: java.lang.Exception -> L12f java.lang.Throwable -> L16a
            if (r12 <= 0) goto L122
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch: java.lang.Exception -> L12f java.lang.Throwable -> L16a
            java.lang.String r13 = r4.getString(r13)     // Catch: java.lang.Throwable -> L11f
            com.google.android.gms.dynamite.DynamiteModule.zzc = r13     // Catch: java.lang.Throwable -> L11f
            java.lang.String r13 = "loaderVersion"
            int r13 = r4.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L11f
            if (r13 < 0) goto L103
            int r13 = r4.getInt(r13)     // Catch: java.lang.Throwable -> L11f
            com.google.android.gms.dynamite.DynamiteModule.zze = r13     // Catch: java.lang.Throwable -> L11f
        L103:
            java.lang.String r13 = "disableStandaloneDynamiteLoader2"
            int r13 = r4.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L11f
            if (r13 < 0) goto L116
            int r13 = r4.getInt(r13)     // Catch: java.lang.Throwable -> L11f
            if (r13 == 0) goto L112
            goto L113
        L112:
            r5 = 0
        L113:
            com.google.android.gms.dynamite.DynamiteModule.zzd = r5     // Catch: java.lang.Throwable -> L11f
            r14 = r5
        L116:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11f
            boolean r13 = zze(r4)     // Catch: java.lang.Exception -> L12f java.lang.Throwable -> L16a
            if (r13 == 0) goto L122
            r4 = r0
            goto L122
        L11f:
            r12 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11f
            throw r12     // Catch: java.lang.Exception -> L12f java.lang.Throwable -> L16a
        L122:
            if (r15 == 0) goto L131
            if (r14 != 0) goto L127
            goto L131
        L127:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L12f java.lang.Throwable -> L16a
            java.lang.String r13 = "forcing fallback to container DynamiteLoader impl"
            r12.<init>(r13, r0)     // Catch: java.lang.Exception -> L12f java.lang.Throwable -> L16a
            throw r12     // Catch: java.lang.Exception -> L12f java.lang.Throwable -> L16a
        L12f:
            r12 = move-exception
            goto L14a
        L131:
            if (r4 == 0) goto L136
            r4.close()
        L136:
            return r12
        L137:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r13 = "Failed to retrieve remote module version."
            android.util.Log.w(r12, r13)     // Catch: java.lang.Exception -> L12f java.lang.Throwable -> L16a
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L12f java.lang.Throwable -> L16a
            java.lang.String r13 = "Failed to connect to dynamite module ContentResolver."
            r12.<init>(r13, r0)     // Catch: java.lang.Exception -> L12f java.lang.Throwable -> L16a
            throw r12     // Catch: java.lang.Exception -> L12f java.lang.Throwable -> L16a
        L146:
            r12 = move-exception
            goto L16c
        L148:
            r12 = move-exception
            r4 = r0
        L14a:
            boolean r13 = r12 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch: java.lang.Throwable -> L16a
            if (r13 == 0) goto L14f
            throw r12     // Catch: java.lang.Throwable -> L16a
        L14f:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r13 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L16a
            java.lang.String r14 = r12.getMessage()     // Catch: java.lang.Throwable -> L16a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16a
            r15.<init>()     // Catch: java.lang.Throwable -> L16a
            java.lang.String r1 = "V2 version check failed: "
            r15.append(r1)     // Catch: java.lang.Throwable -> L16a
            r15.append(r14)     // Catch: java.lang.Throwable -> L16a
            java.lang.String r14 = r15.toString()     // Catch: java.lang.Throwable -> L16a
            r13.<init>(r14, r12, r0)     // Catch: java.lang.Throwable -> L16a
            throw r13     // Catch: java.lang.Throwable -> L16a
        L16a:
            r12 = move-exception
            r0 = r4
        L16c:
            if (r0 == 0) goto L171
            r0.close()
        L171:
            throw r12
    }

    private static com.google.android.gms.dynamite.DynamiteModule zzc(android.content.Context r1, java.lang.String r2) {
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Selected local version of "
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r0 = "DynamiteModule"
            android.util.Log.i(r0, r2)
            com.google.android.gms.dynamite.DynamiteModule r2 = new com.google.android.gms.dynamite.DynamiteModule
            r2.<init>(r1)
            return r2
    }

    private static void zzd(java.lang.ClassLoader r3) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r0 = 0
            java.lang.String r1 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r3 = r3.loadClass(r1)     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            java.lang.reflect.Constructor r3 = r3.getConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            java.lang.Object r3 = r3.newInstance(r1)     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            if (r3 != 0) goto L1a
            r1 = r0
            goto L2c
        L1a:
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r1 = r3.queryLocalInterface(r1)     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            boolean r2 = r1 instanceof com.google.android.gms.dynamite.zzq     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            if (r2 == 0) goto L27
            com.google.android.gms.dynamite.zzq r1 = (com.google.android.gms.dynamite.zzq) r1     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            goto L2c
        L27:
            com.google.android.gms.dynamite.zzq r1 = new com.google.android.gms.dynamite.zzq     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            r1.<init>(r3)     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
        L2c:
            com.google.android.gms.dynamite.DynamiteModule.zzl = r1     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            return
        L2f:
            r3 = move-exception
            goto L38
        L31:
            r3 = move-exception
            goto L38
        L33:
            r3 = move-exception
            goto L38
        L35:
            r3 = move-exception
            goto L38
        L37:
            r3 = move-exception
        L38:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r2 = "Failed to instantiate dynamite loader"
            r1.<init>(r2, r3, r0)
            throw r1
    }

    private static boolean zze(android.database.Cursor r2) {
            java.lang.ThreadLocal r0 = com.google.android.gms.dynamite.DynamiteModule.zzg
            java.lang.Object r0 = r0.get()
            com.google.android.gms.dynamite.zzm r0 = (com.google.android.gms.dynamite.zzm) r0
            if (r0 == 0) goto L12
            android.database.Cursor r1 = r0.zza
            if (r1 != 0) goto L12
            r0.zza = r2
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    private static boolean zzf(android.content.Context r6) {
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = 0
            boolean r1 = r0.equals(r1)
            r2 = 1
            if (r1 == 0) goto Lb
            return r2
        Lb:
            java.lang.Boolean r1 = com.google.android.gms.dynamite.DynamiteModule.zzf
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L14
            return r2
        L14:
            java.lang.Boolean r0 = com.google.android.gms.dynamite.DynamiteModule.zzf
            java.lang.String r1 = "DynamiteModule"
            r3 = 0
            if (r0 != 0) goto L66
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            boolean r4 = com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()
            if (r2 == r4) goto L27
            r4 = 0
            goto L29
        L27:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
        L29:
            java.lang.String r5 = "com.google.android.gms.chimera"
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r5, r4)
            com.google.android.gms.common.GoogleApiAvailabilityLight r4 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            r5 = 10000000(0x989680, float:1.4012985E-38)
            int r6 = r4.isGooglePlayServicesAvailable(r6, r5)
            if (r6 != 0) goto L49
            if (r0 == 0) goto L49
            java.lang.String r6 = r0.packageName
            java.lang.String r4 = "com.google.android.gms"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L49
            r3 = 1
        L49:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.dynamite.DynamiteModule.zzf = r6
            boolean r3 = r6.booleanValue()
            if (r3 == 0) goto L66
            android.content.pm.ApplicationInfo r6 = r0.applicationInfo
            if (r6 == 0) goto L66
            int r6 = r6.flags
            r6 = r6 & 129(0x81, float:1.81E-43)
            if (r6 != 0) goto L66
            java.lang.String r6 = "Non-system-image GmsCore APK, forcing V1"
            android.util.Log.i(r1, r6)
            com.google.android.gms.dynamite.DynamiteModule.zzd = r2
        L66:
            if (r3 != 0) goto L6d
            java.lang.String r6 = "Invalid GmsCore APK, remote loading disabled."
            android.util.Log.e(r1, r6)
        L6d:
            return r3
    }

    private static com.google.android.gms.dynamite.zzp zzg(android.content.Context r5) {
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)
            com.google.android.gms.dynamite.zzp r1 = com.google.android.gms.dynamite.DynamiteModule.zzk     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            return r1
        L9:
            r1 = 0
            java.lang.String r2 = "com.google.android.gms"
            r3 = 3
            android.content.Context r5 = r5.createPackageContext(r2, r3)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5a
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5a
            java.lang.String r2 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r5 = r5.loadClass(r2)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5a
            java.lang.Object r5 = r5.newInstance()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5a
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5a
            if (r5 != 0) goto L25
            r2 = r1
            goto L37
        L25:
            java.lang.String r2 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r2 = r5.queryLocalInterface(r2)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5a
            boolean r3 = r2 instanceof com.google.android.gms.dynamite.zzp     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5a
            if (r3 == 0) goto L32
            com.google.android.gms.dynamite.zzp r2 = (com.google.android.gms.dynamite.zzp) r2     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5a
            goto L37
        L32:
            com.google.android.gms.dynamite.zzp r2 = new com.google.android.gms.dynamite.zzp     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5a
            r2.<init>(r5)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5a
        L37:
            if (r2 == 0) goto L58
            com.google.android.gms.dynamite.DynamiteModule.zzk = r2     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L5a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            return r2
        L3d:
            r5 = move-exception
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r3.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = "Failed to load IDynamiteLoader from GmsCore: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L5a
            r3.append(r5)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L5a
            android.util.Log.e(r2, r5)     // Catch: java.lang.Throwable -> L5a
        L58:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            return r1
        L5a:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            throw r5
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public android.content.Context getModuleContext() {
            r1 = this;
            android.content.Context r0 = r1.zzj
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.IBinder instantiate(java.lang.String r4) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r3 = this;
            android.content.Context r0 = r3.zzj     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.Class r0 = r0.loadClass(r4)     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            return r0
        L11:
            r0 = move-exception
            goto L16
        L13:
            r0 = move-exception
            goto L16
        L15:
            r0 = move-exception
        L16:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r2 = "Failed to instantiate module class: "
            java.lang.String r4 = r2.concat(r4)
            r2 = 0
            r1.<init>(r4, r0, r2)
            throw r1
    }
}
