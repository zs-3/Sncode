package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzcl {
    private static java.lang.String zza;

    public static synchronized java.lang.String zza(android.content.Context r2) {
            java.lang.Class<com.google.android.gms.internal.consent_sdk.zzcl> r0 = com.google.android.gms.internal.consent_sdk.zzcl.class
            monitor-enter(r0)
            java.lang.String r1 = com.google.android.gms.internal.consent_sdk.zzcl.zza     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L26
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L2a
            if (r2 != 0) goto Lf
            r2 = 0
            goto L15
        Lf:
            java.lang.String r1 = "android_id"
            java.lang.String r2 = android.provider.Settings.Secure.getString(r2, r1)     // Catch: java.lang.Throwable -> L2a
        L15:
            if (r2 == 0) goto L1e
            r1 = 1
            boolean r1 = com.google.android.gms.internal.consent_sdk.zzct.zza(r1)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L20
        L1e:
            java.lang.String r2 = "emulator"
        L20:
            java.lang.String r2 = zzb(r2)     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.internal.consent_sdk.zzcl.zza = r2     // Catch: java.lang.Throwable -> L2a
        L26:
            java.lang.String r2 = com.google.android.gms.internal.consent_sdk.zzcl.zza     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r0)
            return r2
        L2a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    private static java.lang.String zzb(java.lang.String r7) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 3
            if (r1 >= r2) goto L2a
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.security.NoSuchAlgorithmException -> L27 java.lang.ArithmeticException -> L2a
            byte[] r3 = r7.getBytes()     // Catch: java.security.NoSuchAlgorithmException -> L27 java.lang.ArithmeticException -> L2a
            r2.update(r3)     // Catch: java.security.NoSuchAlgorithmException -> L27 java.lang.ArithmeticException -> L2a
            java.lang.String r3 = "%032X"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.security.NoSuchAlgorithmException -> L27 java.lang.ArithmeticException -> L2a
            java.math.BigInteger r6 = new java.math.BigInteger     // Catch: java.security.NoSuchAlgorithmException -> L27 java.lang.ArithmeticException -> L2a
            byte[] r2 = r2.digest()     // Catch: java.security.NoSuchAlgorithmException -> L27 java.lang.ArithmeticException -> L2a
            r6.<init>(r4, r2)     // Catch: java.security.NoSuchAlgorithmException -> L27 java.lang.ArithmeticException -> L2a
            r5[r0] = r6     // Catch: java.security.NoSuchAlgorithmException -> L27 java.lang.ArithmeticException -> L2a
            java.lang.String r7 = java.lang.String.format(r3, r5)     // Catch: java.security.NoSuchAlgorithmException -> L27 java.lang.ArithmeticException -> L2a
            return r7
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            java.lang.String r7 = ""
            return r7
    }
}
