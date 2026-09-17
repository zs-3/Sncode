package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
final class zzn {
    static final com.google.android.gms.common.zzl zza = null;
    static final com.google.android.gms.common.zzl zzb = null;
    static final com.google.android.gms.common.zzl zzc = null;
    static final com.google.android.gms.common.zzl zzd = null;
    private static volatile com.google.android.gms.common.internal.zzag zze;
    private static final java.lang.Object zzf = null;
    private static android.content.Context zzg;

    static {
            com.google.android.gms.common.zzf r0 = new com.google.android.gms.common.zzf
            java.lang.String r1 = "0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"
            byte[] r1 = com.google.android.gms.common.zzj.zze(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzn.zza = r0
            com.google.android.gms.common.zzg r0 = new com.google.android.gms.common.zzg
            java.lang.String r1 = "0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"
            byte[] r1 = com.google.android.gms.common.zzj.zze(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzn.zzb = r0
            com.google.android.gms.common.zzh r0 = new com.google.android.gms.common.zzh
            java.lang.String r1 = "0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"
            byte[] r1 = com.google.android.gms.common.zzj.zze(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzn.zzc = r0
            com.google.android.gms.common.zzi r0 = new com.google.android.gms.common.zzi
            java.lang.String r1 = "0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"
            byte[] r1 = com.google.android.gms.common.zzj.zze(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzn.zzd = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.zzn.zzf = r0
            return
    }

    static com.google.android.gms.common.zzw zza(java.lang.String r1, com.google.android.gms.common.zzj r2, boolean r3, boolean r4) {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            com.google.android.gms.common.zzw r1 = zzh(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lc
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        Lc:
            r1 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
    }

    static com.google.android.gms.common.zzw zzb(java.lang.String r0, boolean r1, boolean r2, boolean r3) {
            r2 = 0
            r3 = 1
            com.google.android.gms.common.zzw r0 = zzi(r0, r1, r2, r2, r3)
            return r0
    }

    static com.google.android.gms.common.zzw zzc(java.lang.String r0, boolean r1, boolean r2, boolean r3) {
            r2 = 0
            com.google.android.gms.common.zzw r0 = zzi(r0, r1, r2, r2, r2)
            return r0
    }

    static /* synthetic */ java.lang.String zzd(boolean r4, java.lang.String r5, com.google.android.gms.common.zzj r6) throws java.lang.Exception {
            r0 = 1
            r1 = 0
            if (r4 != 0) goto Le
            com.google.android.gms.common.zzw r2 = zzh(r5, r6, r0, r1)
            boolean r2 = r2.zza
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r0 == r2) goto L14
            java.lang.String r2 = "not allowed"
            goto L16
        L14:
            java.lang.String r2 = "debug cert rejected"
        L16:
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r2
            r3[r0] = r5
            r5 = 2
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = com.google.android.gms.common.util.AndroidUtilsLight.zza(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            byte[] r6 = r6.zzf()
            byte[] r6 = r0.digest(r6)
            java.lang.String r6 = com.google.android.gms.common.util.Hex.bytesToStringLowercase(r6)
            r3[r5] = r6
            r5 = 3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3[r5] = r4
            r4 = 4
            java.lang.String r5 = "12451000.false"
            r3[r4] = r5
            java.lang.String r4 = "%s: pkg=%s, sha256=%s, atk=%s, ver=%s"
            java.lang.String r4 = java.lang.String.format(r4, r3)
            return r4
    }

    static synchronized void zze(android.content.Context r2) {
            java.lang.Class<com.google.android.gms.common.zzn> r0 = com.google.android.gms.common.zzn.class
            monitor-enter(r0)
            android.content.Context r1 = com.google.android.gms.common.zzn.zzg     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L13
            if (r2 == 0) goto L11
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.common.zzn.zzg = r2     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L11:
            monitor-exit(r0)
            return
        L13:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L1c:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    static boolean zzf() {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            zzj()     // Catch: java.lang.Throwable -> Le android.os.RemoteException -> L10 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L12
            com.google.android.gms.common.internal.zzag r1 = com.google.android.gms.common.zzn.zze     // Catch: java.lang.Throwable -> Le android.os.RemoteException -> L10 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L12
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> Le android.os.RemoteException -> L10 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L12
            goto L1b
        Le:
            r1 = move-exception
            goto L1f
        L10:
            r1 = move-exception
            goto L13
        L12:
            r1 = move-exception
        L13:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r3 = "Failed to get Google certificates from remote"
            android.util.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> Le
            r1 = 0
        L1b:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L1f:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
    }

    static boolean zzg() {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            zzj()     // Catch: java.lang.Throwable -> Le android.os.RemoteException -> L10 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L12
            com.google.android.gms.common.internal.zzag r1 = com.google.android.gms.common.zzn.zze     // Catch: java.lang.Throwable -> Le android.os.RemoteException -> L10 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L12
            boolean r1 = r1.zzi()     // Catch: java.lang.Throwable -> Le android.os.RemoteException -> L10 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L12
            goto L1b
        Le:
            r1 = move-exception
            goto L1f
        L10:
            r1 = move-exception
            goto L13
        L12:
            r1 = move-exception
        L13:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r3 = "Failed to get Google certificates from remote"
            android.util.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> Le
            r1 = 0
        L1b:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L1f:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
    }

    private static com.google.android.gms.common.zzw zzh(java.lang.String r4, com.google.android.gms.common.zzj r5, boolean r6, boolean r7) {
            java.lang.String r0 = "Failed to get Google certificates from remote"
            java.lang.String r1 = "GoogleCertificates"
            zzj()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L3f
            android.content.Context r2 = com.google.android.gms.common.zzn.zzg
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.zzs r2 = new com.google.android.gms.common.zzs
            r2.<init>(r4, r5, r6, r7)
            com.google.android.gms.common.internal.zzag r7 = com.google.android.gms.common.zzn.zze     // Catch: android.os.RemoteException -> L34
            android.content.Context r3 = com.google.android.gms.common.zzn.zzg     // Catch: android.os.RemoteException -> L34
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.os.RemoteException -> L34
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: android.os.RemoteException -> L34
            boolean r7 = r7.zzh(r2, r3)     // Catch: android.os.RemoteException -> L34
            if (r7 == 0) goto L28
            com.google.android.gms.common.zzw r4 = com.google.android.gms.common.zzw.zzb()
            return r4
        L28:
            com.google.android.gms.common.zze r7 = new com.google.android.gms.common.zze
            r7.<init>(r6, r4, r5)
            com.google.android.gms.common.zzu r4 = new com.google.android.gms.common.zzu
            r5 = 0
            r4.<init>(r7, r5)
            return r4
        L34:
            r4 = move-exception
            android.util.Log.e(r1, r0, r4)
            java.lang.String r5 = "module call"
            com.google.android.gms.common.zzw r4 = com.google.android.gms.common.zzw.zzd(r5, r4)
            return r4
        L3f:
            r4 = move-exception
            android.util.Log.e(r1, r0, r4)
            java.lang.String r5 = r4.getMessage()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "module init: "
            java.lang.String r5 = r6.concat(r5)
            com.google.android.gms.common.zzw r4 = com.google.android.gms.common.zzw.zzd(r5, r4)
            return r4
    }

    private static com.google.android.gms.common.zzw zzi(java.lang.String r9, boolean r10, boolean r11, boolean r12, boolean r13) {
            java.lang.String r11 = "Failed to get Google certificates from remote"
            java.lang.String r12 = "GoogleCertificates"
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            android.content.Context r1 = com.google.android.gms.common.zzn.zzg     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L88
            zzj()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L6e java.lang.Throwable -> L88
            com.google.android.gms.common.zzo r1 = new com.google.android.gms.common.zzo     // Catch: java.lang.Throwable -> L88
            r5 = 0
            android.content.Context r2 = com.google.android.gms.common.zzn.zzg     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: java.lang.Throwable -> L88
            r7 = 0
            r8 = 1
            r2 = r1
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L88
            if (r13 == 0) goto L2a
            com.google.android.gms.common.internal.zzag r9 = com.google.android.gms.common.zzn.zze     // Catch: android.os.RemoteException -> L63 java.lang.Throwable -> L88
            com.google.android.gms.common.zzq r9 = r9.zze(r1)     // Catch: android.os.RemoteException -> L63 java.lang.Throwable -> L88
            goto L30
        L2a:
            com.google.android.gms.common.internal.zzag r9 = com.google.android.gms.common.zzn.zze     // Catch: android.os.RemoteException -> L63 java.lang.Throwable -> L88
            com.google.android.gms.common.zzq r9 = r9.zzf(r1)     // Catch: android.os.RemoteException -> L63 java.lang.Throwable -> L88
        L30:
            boolean r10 = r9.zzb()     // Catch: java.lang.Throwable -> L88
            if (r10 == 0) goto L3f
            int r9 = r9.zzc()     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.common.zzw r9 = com.google.android.gms.common.zzw.zzf(r9)     // Catch: java.lang.Throwable -> L88
            goto L84
        L3f:
            java.lang.String r10 = r9.zza()     // Catch: java.lang.Throwable -> L88
            int r11 = r9.zzd()     // Catch: java.lang.Throwable -> L88
            r12 = 4
            if (r11 != r12) goto L50
            android.content.pm.PackageManager$NameNotFoundException r11 = new android.content.pm.PackageManager$NameNotFoundException     // Catch: java.lang.Throwable -> L88
            r11.<init>()     // Catch: java.lang.Throwable -> L88
            goto L51
        L50:
            r11 = 0
        L51:
            java.lang.String r12 = "error checking package certificate"
            if (r10 != 0) goto L56
            r10 = r12
        L56:
            int r12 = r9.zzc()     // Catch: java.lang.Throwable -> L88
            int r9 = r9.zzd()     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.common.zzw r9 = com.google.android.gms.common.zzw.zzg(r12, r9, r10, r11)     // Catch: java.lang.Throwable -> L88
            goto L84
        L63:
            r9 = move-exception
            android.util.Log.e(r12, r11, r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = "module call"
            com.google.android.gms.common.zzw r9 = com.google.android.gms.common.zzw.zzd(r10, r9)     // Catch: java.lang.Throwable -> L88
            goto L84
        L6e:
            r9 = move-exception
            android.util.Log.e(r12, r11, r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = r9.getMessage()     // Catch: java.lang.Throwable -> L88
            java.lang.String r11 = "module init: "
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = r11.concat(r10)     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.common.zzw r9 = com.google.android.gms.common.zzw.zzd(r10, r9)     // Catch: java.lang.Throwable -> L88
        L84:
            android.os.StrictMode.setThreadPolicy(r0)
            return r9
        L88:
            r9 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r9
    }

    private static void zzj() throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            com.google.android.gms.common.internal.zzag r0 = com.google.android.gms.common.zzn.zze
            if (r0 == 0) goto L5
            return
        L5:
            android.content.Context r0 = com.google.android.gms.common.zzn.zzg
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.Object r0 = com.google.android.gms.common.zzn.zzf
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzag r1 = com.google.android.gms.common.zzn.zze     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L27
            android.content.Context r1 = com.google.android.gms.common.zzn.zzg     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r2 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "com.google.android.gms.googlecertificates"
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.load(r1, r2, r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "com.google.android.gms.common.GoogleCertificatesImpl"
            android.os.IBinder r1 = r1.instantiate(r2)     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.common.internal.zzag r1 = com.google.android.gms.common.internal.zzaf.zzb(r1)     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.common.zzn.zze = r1     // Catch: java.lang.Throwable -> L29
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r1
    }
}
