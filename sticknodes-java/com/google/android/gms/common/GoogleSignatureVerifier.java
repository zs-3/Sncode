package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class GoogleSignatureVerifier {
    private static com.google.android.gms.common.GoogleSignatureVerifier zza;
    private static volatile java.util.Set zzb;
    private static volatile java.util.Set zzc;
    private final android.content.Context zzd;
    private volatile java.lang.String zze;

    public GoogleSignatureVerifier(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.zzd = r1
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.GoogleSignatureVerifier getInstance(android.content.Context r2) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.Class<com.google.android.gms.common.GoogleSignatureVerifier> r0 = com.google.android.gms.common.GoogleSignatureVerifier.class
            monitor-enter(r0)
            com.google.android.gms.common.GoogleSignatureVerifier r1 = com.google.android.gms.common.GoogleSignatureVerifier.zza     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L14
            com.google.android.gms.common.zzn.zze(r2)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.GoogleSignatureVerifier r1 = new com.google.android.gms.common.GoogleSignatureVerifier     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.GoogleSignatureVerifier.zza = r1     // Catch: java.lang.Throwable -> L18
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.GoogleSignatureVerifier r2 = com.google.android.gms.common.GoogleSignatureVerifier.zza
            return r2
        L18:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r2
    }

    static final com.google.android.gms.common.zzj zza(android.content.pm.PackageInfo r3, com.google.android.gms.common.zzj... r4) {
            android.content.pm.Signature[] r0 = r3.signatures
            r1 = 0
            if (r0 != 0) goto L6
            goto L31
        L6:
            int r0 = r0.length
            r2 = 1
            if (r0 == r2) goto L12
            java.lang.String r3 = "GoogleSignatureVerifier"
            java.lang.String r4 = "Package has more than one signature."
            android.util.Log.w(r3, r4)
            return r1
        L12:
            com.google.android.gms.common.zzk r0 = new com.google.android.gms.common.zzk
            android.content.pm.Signature[] r3 = r3.signatures
            r2 = 0
            r3 = r3[r2]
            byte[] r3 = r3.toByteArray()
            r0.<init>(r3)
        L20:
            int r3 = r4.length
            if (r2 >= r3) goto L31
            r3 = r4[r2]
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2e
            r3 = r4[r2]
            return r3
        L2e:
            int r2 = r2 + 1
            goto L20
        L31:
            return r1
    }

    public static final boolean zzb(android.content.pm.PackageInfo r4, boolean r5) {
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L2a
            if (r4 == 0) goto L28
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.android.vending"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2a
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = 0
            goto L2a
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = 1
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = r4
        L2b:
            if (r4 == 0) goto L49
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L49
            if (r5 == 0) goto L3a
            com.google.android.gms.common.zzj[] r4 = com.google.android.gms.common.zzm.zza
            com.google.android.gms.common.zzj r4 = zza(r2, r4)
            goto L46
        L3a:
            com.google.android.gms.common.zzj[] r4 = new com.google.android.gms.common.zzj[r0]
            com.google.android.gms.common.zzj[] r5 = com.google.android.gms.common.zzm.zza
            r5 = r5[r1]
            r4[r1] = r5
            com.google.android.gms.common.zzj r4 = zza(r2, r4)
        L46:
            if (r4 == 0) goto L49
            return r0
        L49:
            return r1
    }

    @android.annotation.SuppressLint({"PackageManagerGetSignatures"})
    private final com.google.android.gms.common.zzw zzc(java.lang.String r6, boolean r7, boolean r8) {
            r5 = this;
            java.lang.String r7 = "null pkg"
            if (r6 != 0) goto L9
            com.google.android.gms.common.zzw r6 = com.google.android.gms.common.zzw.zzc(r7)
            return r6
        L9:
            java.lang.String r8 = r5.zze
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L90
            boolean r8 = com.google.android.gms.common.zzn.zzg()
            r0 = 0
            if (r8 == 0) goto L23
            android.content.Context r7 = r5.zzd
            boolean r7 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r7)
            com.google.android.gms.common.zzw r7 = com.google.android.gms.common.zzn.zzb(r6, r7, r0, r0)
            goto L7d
        L23:
            android.content.Context r8 = r5.zzd     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L84
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L84
            r1 = 64
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r6, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L84
            android.content.Context r1 = r5.zzd
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r1)
            if (r8 != 0) goto L3c
            com.google.android.gms.common.zzw r7 = com.google.android.gms.common.zzw.zzc(r7)
            goto L7d
        L3c:
            android.content.pm.Signature[] r7 = r8.signatures
            if (r7 == 0) goto L77
            int r7 = r7.length
            r2 = 1
            if (r7 == r2) goto L45
            goto L77
        L45:
            com.google.android.gms.common.zzk r7 = new com.google.android.gms.common.zzk
            android.content.pm.Signature[] r3 = r8.signatures
            r3 = r3[r0]
            byte[] r3 = r3.toByteArray()
            r7.<init>(r3)
            java.lang.String r3 = r8.packageName
            com.google.android.gms.common.zzw r1 = com.google.android.gms.common.zzn.zza(r3, r7, r1, r0)
            boolean r4 = r1.zza
            if (r4 == 0) goto L75
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo
            if (r8 == 0) goto L75
            int r8 = r8.flags
            r8 = r8 & 2
            if (r8 == 0) goto L75
            com.google.android.gms.common.zzw r7 = com.google.android.gms.common.zzn.zza(r3, r7, r0, r2)
            boolean r7 = r7.zza
            if (r7 == 0) goto L75
            java.lang.String r7 = "debuggable release cert app rejected"
            com.google.android.gms.common.zzw r7 = com.google.android.gms.common.zzw.zzc(r7)
            goto L7d
        L75:
            r7 = r1
            goto L7d
        L77:
            java.lang.String r7 = "single cert required"
            com.google.android.gms.common.zzw r7 = com.google.android.gms.common.zzw.zzc(r7)
        L7d:
            boolean r8 = r7.zza
            if (r8 == 0) goto L83
            r5.zze = r6
        L83:
            return r7
        L84:
            r7 = move-exception
            java.lang.String r8 = "no pkg "
            java.lang.String r6 = r8.concat(r6)
            com.google.android.gms.common.zzw r6 = com.google.android.gms.common.zzw.zzd(r6, r7)
            return r6
        L90:
            com.google.android.gms.common.zzw r6 = com.google.android.gms.common.zzw.zzb()
            return r6
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isGooglePublicSignedPackage(android.content.pm.PackageInfo r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = zzb(r4, r0)
            r2 = 1
            if (r1 == 0) goto Lc
            return r2
        Lc:
            boolean r4 = zzb(r4, r2)
            if (r4 == 0) goto L22
            android.content.Context r4 = r3.zzd
            boolean r4 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r4)
            if (r4 == 0) goto L1b
            return r2
        L1b:
            java.lang.String r4 = "GoogleSignatureVerifier"
            java.lang.String r1 = "Test-keys aren't accepted on this build."
            android.util.Log.w(r4, r1)
        L22:
            return r0
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isPackageGoogleSigned(java.lang.String r2) {
            r1 = this;
            r0 = 0
            com.google.android.gms.common.zzw r2 = r1.zzc(r2, r0, r0)
            r2.zze()
            boolean r2 = r2.zza
            return r2
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isUidGoogleSigned(int r6) {
            r5 = this;
            android.content.Context r0 = r5.zzd
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String[] r6 = r0.getPackagesForUid(r6)
            if (r6 == 0) goto L27
            int r0 = r6.length
            if (r0 != 0) goto L10
            goto L27
        L10:
            r1 = 0
            r2 = 0
            r3 = 0
        L13:
            if (r3 >= r0) goto L23
            r1 = r6[r3]
            com.google.android.gms.common.zzw r1 = r5.zzc(r1, r2, r2)
            boolean r4 = r1.zza
            if (r4 == 0) goto L20
            goto L2d
        L20:
            int r3 = r3 + 1
            goto L13
        L23:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            goto L2d
        L27:
            java.lang.String r6 = "no pkgs"
            com.google.android.gms.common.zzw r1 = com.google.android.gms.common.zzw.zzc(r6)
        L2d:
            r1.zze()
            boolean r6 = r1.zza
            return r6
    }
}
