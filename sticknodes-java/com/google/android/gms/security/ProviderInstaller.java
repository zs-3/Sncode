package com.google.android.gms.security;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public class ProviderInstaller {
    public static final java.lang.String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zza = null;
    private static final java.lang.Object zzb = null;
    private static java.lang.reflect.Method zzc;
    private static boolean zzd;

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    public interface ProviderInstallListener {
        void onProviderInstallFailed(int r1, android.content.Intent r2);

        void onProviderInstalled();
    }

    static {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            com.google.android.gms.security.ProviderInstaller.zza = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.security.ProviderInstaller.zzb = r0
            r0 = 0
            com.google.android.gms.security.ProviderInstaller.zzc = r0
            r0 = 0
            com.google.android.gms.security.ProviderInstaller.zzd = r0
            return
    }

    public ProviderInstaller() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void installIfNeeded(android.content.Context r13) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
            java.lang.String r0 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13, r0)
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.security.ProviderInstaller.zza
            r1 = 11925000(0xb5f608, float:1.6710484E-38)
            r0.verifyGooglePlayServicesIsAvailable(r13, r1)
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r2 = com.google.android.gms.security.ProviderInstaller.zzb
            monitor-enter(r2)
            boolean r3 = com.google.android.gms.security.ProviderInstaller.zzd     // Catch: java.lang.Throwable -> La5
            r4 = 0
            if (r3 != 0) goto L44
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r3 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L26 java.lang.Throwable -> La5
            java.lang.String r5 = "com.google.android.gms.providerinstaller.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r3 = com.google.android.gms.dynamite.DynamiteModule.load(r13, r3, r5)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L26 java.lang.Throwable -> La5
            android.content.Context r3 = r3.getModuleContext()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L26 java.lang.Throwable -> La5
            goto L3b
        L26:
            r3 = move-exception
            java.lang.String r5 = "ProviderInstaller"
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> La5
            java.lang.String r6 = "Failed to load providerinstaller module: "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = r6.concat(r3)     // Catch: java.lang.Throwable -> La5
            android.util.Log.w(r5, r3)     // Catch: java.lang.Throwable -> La5
            r3 = r4
        L3b:
            if (r3 == 0) goto L44
            java.lang.String r0 = "com.google.android.gms.providerinstaller.ProviderInstallerImpl"
            zzb(r3, r13, r0)     // Catch: java.lang.Throwable -> La5
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            return
        L44:
            boolean r3 = com.google.android.gms.security.ProviderInstaller.zzd     // Catch: java.lang.Throwable -> La5
            r5 = 1
            r3 = r3 ^ r5
            android.content.Context r6 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r13)     // Catch: java.lang.Throwable -> La5
            if (r6 != 0) goto L4f
            goto L8d
        L4f:
            com.google.android.gms.security.ProviderInstaller.zzd = r5     // Catch: java.lang.Throwable -> La5
            if (r3 == 0) goto L8c
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            java.lang.String r7 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            java.lang.String r8 = "reportRequestStats2"
            java.lang.ClassLoader r9 = r6.getClassLoader()     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            r10 = 3
            com.google.android.gms.internal.common.zzj[] r10 = new com.google.android.gms.internal.common.zzj[r10]     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            r12 = 0
            com.google.android.gms.internal.common.zzj r11 = com.google.android.gms.internal.common.zzj.zzb(r11, r13)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            r10[r12] = r11     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            com.google.android.gms.internal.common.zzi r0 = com.google.android.gms.internal.common.zzi.zza(r0)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            r10[r5] = r0     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            r0 = 2
            com.google.android.gms.internal.common.zzi r1 = com.google.android.gms.internal.common.zzi.zza(r3)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            r10[r0] = r1     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            com.google.android.gms.internal.common.zzl.zzb(r7, r8, r9, r10)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            goto L8c
        L7c:
            r0 = move-exception
            java.lang.String r1 = "ProviderInstaller"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = "Failed to report request stats: "
            java.lang.String r0 = r3.concat(r0)     // Catch: java.lang.Throwable -> La5
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> La5
        L8c:
            r4 = r6
        L8d:
            if (r4 == 0) goto L96
            java.lang.String r0 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            zzb(r4, r13, r0)     // Catch: java.lang.Throwable -> La5
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            return
        L96:
            java.lang.String r13 = "ProviderInstaller"
            java.lang.String r0 = "Failed to get remote context"
            android.util.Log.e(r13, r0)     // Catch: java.lang.Throwable -> La5
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r13 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException     // Catch: java.lang.Throwable -> La5
            r0 = 8
            r13.<init>(r0)     // Catch: java.lang.Throwable -> La5
            throw r13     // Catch: java.lang.Throwable -> La5
        La5:
            r13 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            throw r13
    }

    public static void installIfNeededAsync(android.content.Context r1, com.google.android.gms.security.ProviderInstaller.ProviderInstallListener r2) {
            java.lang.String r0 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "Listener must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Must be called on the UI thread"
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.security.zza r0 = new com.google.android.gms.security.zza
            r0.<init>(r1, r2)
            r1 = 0
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r0.execute(r1)
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.GoogleApiAvailabilityLight zza() {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.security.ProviderInstaller.zza
            return r0
    }

    private static void zzb(android.content.Context r4, android.content.Context r5, java.lang.String r6) throws com.google.android.gms.common.GooglePlayServicesNotAvailableException {
            java.lang.reflect.Method r5 = com.google.android.gms.security.ProviderInstaller.zzc     // Catch: java.lang.Exception -> L27
            r0 = 0
            r1 = 1
            if (r5 != 0) goto L1c
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L27
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r5[r0] = r2     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = "insertProvider"
            java.lang.ClassLoader r3 = r4.getClassLoader()     // Catch: java.lang.Exception -> L27
            java.lang.Class r6 = r3.loadClass(r6)     // Catch: java.lang.Exception -> L27
            java.lang.reflect.Method r5 = r6.getMethod(r2, r5)     // Catch: java.lang.Exception -> L27
            com.google.android.gms.security.ProviderInstaller.zzc = r5     // Catch: java.lang.Exception -> L27
        L1c:
            java.lang.reflect.Method r5 = com.google.android.gms.security.ProviderInstaller.zzc     // Catch: java.lang.Exception -> L27
            r6 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L27
            r1[r0] = r4     // Catch: java.lang.Exception -> L27
            r5.invoke(r6, r1)     // Catch: java.lang.Exception -> L27
            return
        L27:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            r6 = 6
            java.lang.String r0 = "ProviderInstaller"
            boolean r6 = android.util.Log.isLoggable(r0, r6)
            if (r6 == 0) goto L4d
            if (r5 != 0) goto L3c
            java.lang.String r4 = r4.toString()
            goto L40
        L3c:
            java.lang.String r4 = r5.toString()
        L40:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "Failed to install provider: "
            java.lang.String r4 = r5.concat(r4)
            android.util.Log.e(r0, r4)
        L4d:
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r4 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException
            r5 = 8
            r4.<init>(r5)
            throw r4
    }
}
