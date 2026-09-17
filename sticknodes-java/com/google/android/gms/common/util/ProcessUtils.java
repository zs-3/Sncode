package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class ProcessUtils {
    private static java.lang.String zza;
    private static int zzb;
    private static java.lang.Boolean zzc;

    static {
            return
    }

    private ProcessUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String getMyProcessName() {
            java.lang.String r0 = com.google.android.gms.common.util.ProcessUtils.zza
            if (r0 != 0) goto L65
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            java.lang.String r0 = android.app.Application.getProcessName()
            com.google.android.gms.common.util.ProcessUtils.zza = r0
            goto L65
        L11:
            int r0 = com.google.android.gms.common.util.ProcessUtils.zzb
            if (r0 != 0) goto L1b
            int r0 = android.os.Process.myPid()
            com.google.android.gms.common.util.ProcessUtils.zzb = r0
        L1b:
            r1 = 0
            if (r0 > 0) goto L1f
            goto L63
        L1f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5f
            r2.<init>()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5f
            java.lang.String r3 = "/proc/"
            r2.append(r3)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5f
            r2.append(r0)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5f
            java.lang.String r0 = "/cmdline"
            r2.append(r0)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5f
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5f
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L55
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L55
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L55
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L55
            android.os.StrictMode.setThreadPolicy(r2)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5f
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L60
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L60
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L60
            goto L60
        L52:
            r0 = move-exception
            r1 = r3
            goto L5b
        L55:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5f
            throw r0     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5f
        L5a:
            r0 = move-exception
        L5b:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r1)
            throw r0
        L5f:
            r3 = r1
        L60:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r3)
        L63:
            com.google.android.gms.common.util.ProcessUtils.zza = r1
        L65:
            java.lang.String r0 = com.google.android.gms.common.util.ProcessUtils.zza
            return r0
    }

    public static boolean zza() {
            java.lang.Boolean r0 = com.google.android.gms.common.util.ProcessUtils.zzc
            if (r0 != 0) goto L35
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto L13
            boolean r0 = android.os.Process.isIsolated()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L33
        L13:
            java.lang.Class<android.os.Process> r0 = android.os.Process.class
            java.lang.String r1 = "isIsolated"
            r2 = 0
            com.google.android.gms.internal.common.zzj[] r3 = new com.google.android.gms.internal.common.zzj[r2]     // Catch: java.lang.ReflectiveOperationException -> L31
            java.lang.Object r0 = com.google.android.gms.internal.common.zzl.zza(r0, r1, r3)     // Catch: java.lang.ReflectiveOperationException -> L31
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.ReflectiveOperationException -> L31
            java.lang.String r2 = "expected a non-null reference"
            if (r0 == 0) goto L27
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.ReflectiveOperationException -> L31
            goto L33
        L27:
            com.google.android.gms.internal.common.zzac r0 = new com.google.android.gms.internal.common.zzac     // Catch: java.lang.ReflectiveOperationException -> L31
            java.lang.String r1 = com.google.android.gms.internal.common.zzab.zza(r2, r1)     // Catch: java.lang.ReflectiveOperationException -> L31
            r0.<init>(r1)     // Catch: java.lang.ReflectiveOperationException -> L31
            throw r0     // Catch: java.lang.ReflectiveOperationException -> L31
        L31:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L33:
            com.google.android.gms.common.util.ProcessUtils.zzc = r0
        L35:
            boolean r0 = r0.booleanValue()
            return r0
    }
}
