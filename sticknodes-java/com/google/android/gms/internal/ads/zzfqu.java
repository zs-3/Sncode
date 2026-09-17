package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfqu {
    protected static final byte[] zza = null;
    protected static final byte[] zzb = null;
    private final byte[] zzc;
    private final byte[] zzd;

    static {
            r0 = 32
            byte[] r1 = new byte[r0]
            r1 = {x0012: FILL_ARRAY_DATA , data: [61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74} // fill-array
            com.google.android.gms.internal.ads.zzfqu.zza = r1
            byte[] r0 = new byte[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83} // fill-array
            com.google.android.gms.internal.ads.zzfqu.zzb = r0
            return
    }

    public zzfqu() {
            r1 = this;
            r1.<init>()
            byte[] r0 = com.google.android.gms.internal.ads.zzfqu.zzb
            r1.zzc = r0
            byte[] r0 = com.google.android.gms.internal.ads.zzfqu.zza
            r1.zzd = r0
            return
    }

    public final boolean zza(java.io.File r5) throws java.security.GeneralSecurityException {
            r4 = this;
            java.lang.String r5 = r5.getAbsolutePath()
            java.security.cert.X509Certificate[][] r5 = com.google.android.gms.internal.ads.zzapi.zza(r5)     // Catch: java.lang.RuntimeException -> L45 java.io.IOException -> L47 com.google.android.gms.internal.ads.zzapf -> L50
            int r0 = r5.length
            r1 = 1
            if (r0 != r1) goto L3d
            r0 = 0
            r5 = r5[r0]
            r5 = r5[r0]
            java.lang.String r2 = "SHA-256"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)
            byte[] r5 = r5.getEncoded()
            byte[] r5 = r2.digest(r5)
            byte[] r2 = r4.zzd
            boolean r2 = java.util.Arrays.equals(r2, r5)
            if (r2 != 0) goto L3c
            java.lang.String r2 = android.os.Build.TYPE
            java.lang.String r3 = "user"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L3b
            byte[] r2 = r4.zzc
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L3a
            goto L3c
        L3a:
            return r0
        L3b:
            r1 = 0
        L3c:
            return r1
        L3d:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r0 = "APK has more than one signature."
            r5.<init>(r0)
            throw r5
        L45:
            r5 = move-exception
            goto L48
        L47:
            r5 = move-exception
        L48:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Failed to verify signatures"
            r0.<init>(r1, r5)
            throw r0
        L50:
            r5 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Package is not signed"
            r0.<init>(r1, r5)
            throw r0
    }
}
