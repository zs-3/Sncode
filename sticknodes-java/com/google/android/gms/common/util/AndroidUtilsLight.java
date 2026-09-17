package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class AndroidUtilsLight {
    private static volatile int zza = -1;

    static {
            return
    }

    public AndroidUtilsLight() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static byte[] getPackageCertificateHashBytes(android.content.Context r1, java.lang.String r2) throws android.content.pm.PackageManager.NameNotFoundException {
            com.google.android.gms.common.wrappers.PackageManagerWrapper r1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r1)
            r0 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)
            android.content.pm.Signature[] r2 = r1.signatures
            if (r2 == 0) goto L29
            int r2 = r2.length
            r0 = 1
            if (r2 != r0) goto L29
            java.lang.String r2 = "SHA1"
            java.security.MessageDigest r2 = zza(r2)
            if (r2 != 0) goto L1b
            goto L29
        L1b:
            android.content.pm.Signature[] r1 = r1.signatures
            r0 = 0
            r1 = r1[r0]
            byte[] r1 = r1.toByteArray()
            byte[] r1 = r2.digest(r1)
            return r1
        L29:
            r1 = 0
            return r1
    }

    public static java.security.MessageDigest zza(java.lang.String r2) {
            r0 = 0
        L1:
            r1 = 2
            if (r0 >= r1) goto Lf
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r2)     // Catch: java.security.NoSuchAlgorithmException -> Lc
            if (r1 != 0) goto Lb
            goto Lc
        Lb:
            return r1
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            r2 = 0
            return r2
    }
}
