package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class PackageSignatureVerifier {
    static volatile com.google.android.gms.common.zzab zza;
    private static com.google.android.gms.common.zzac zzb;

    public PackageSignatureVerifier() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.android.gms.common.zzac zza(android.content.Context r2) {
            java.lang.Class<com.google.android.gms.common.PackageSignatureVerifier> r0 = com.google.android.gms.common.PackageSignatureVerifier.class
            monitor-enter(r0)
            com.google.android.gms.common.zzac r1 = com.google.android.gms.common.PackageSignatureVerifier.zzb     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            com.google.android.gms.common.zzac r1 = new com.google.android.gms.common.zzac     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.common.PackageSignatureVerifier.zzb = r1     // Catch: java.lang.Throwable -> L12
        Le:
            com.google.android.gms.common.zzac r2 = com.google.android.gms.common.PackageSignatureVerifier.zzb     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerified(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r4)
            zza(r4)
            boolean r1 = com.google.android.gms.common.zzn.zzf()
            if (r1 == 0) goto L62
            r1 = 1
            if (r1 == r0) goto L13
            java.lang.String r1 = "-0"
            goto L15
        L13:
            java.lang.String r1 = "-1"
        L15:
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.common.zzab r2 = com.google.android.gms.common.PackageSignatureVerifier.zza
            if (r2 == 0) goto L34
            com.google.android.gms.common.zzab r2 = com.google.android.gms.common.PackageSignatureVerifier.zza
            java.lang.String r2 = com.google.android.gms.common.zzab.zzb(r2)
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L34
            com.google.android.gms.common.zzab r4 = com.google.android.gms.common.PackageSignatureVerifier.zza
            com.google.android.gms.common.PackageVerificationResult r4 = com.google.android.gms.common.zzab.zza(r4)
            goto L61
        L34:
            zza(r4)
            r4 = 0
            com.google.android.gms.common.zzw r4 = com.google.android.gms.common.zzn.zzc(r5, r0, r4, r4)
            boolean r0 = r4.zza
            if (r0 == 0) goto L54
            int r4 = r4.zzd
            com.google.android.gms.common.zzab r0 = new com.google.android.gms.common.zzab
            com.google.android.gms.common.PackageVerificationResult r4 = com.google.android.gms.common.PackageVerificationResult.zzd(r5, r4)
            r0.<init>(r1, r4)
            com.google.android.gms.common.PackageSignatureVerifier.zza = r0
            com.google.android.gms.common.zzab r4 = com.google.android.gms.common.PackageSignatureVerifier.zza
            com.google.android.gms.common.PackageVerificationResult r4 = com.google.android.gms.common.zzab.zza(r4)
            goto L61
        L54:
            java.lang.String r0 = r4.zzb
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = r4.zzb
            java.lang.Throwable r4 = r4.zzc
            com.google.android.gms.common.PackageVerificationResult r4 = com.google.android.gms.common.PackageVerificationResult.zza(r5, r0, r4)
        L61:
            return r4
        L62:
            com.google.android.gms.common.zzad r4 = new com.google.android.gms.common.zzad
            r4.<init>()
            throw r4
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerifiedWithRetry(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.common.PackageVerificationResult r0 = r2.queryPackageSignatureVerified(r3, r4)     // Catch: java.lang.SecurityException -> L8
            r0.zzb()     // Catch: java.lang.SecurityException -> L8
            goto L1c
        L8:
            r0 = move-exception
            com.google.android.gms.common.PackageVerificationResult r3 = r2.queryPackageSignatureVerified(r3, r4)
            boolean r4 = r3.zzc()
            if (r4 == 0) goto L1b
            java.lang.String r4 = "PkgSignatureVerifier"
            java.lang.String r1 = "Got flaky result during package signature verification"
            android.util.Log.e(r4, r1, r0)
            return r3
        L1b:
            r0 = r3
        L1c:
            return r0
    }
}
