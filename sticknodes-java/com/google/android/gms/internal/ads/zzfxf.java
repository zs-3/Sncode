package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfxf {
    private static final com.google.android.gms.internal.ads.zzfxd zza = null;

    static {
            com.google.android.gms.internal.ads.zzfxd r0 = new com.google.android.gms.internal.ads.zzfxd
            java.lang.String r1 = "PhoneskyVerificationUtils"
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzfxf.zza = r0
            return
    }

    public static boolean zza(android.content.Context r8) {
            java.lang.String r0 = "Play Store package is not found."
            java.lang.String r1 = "com.android.vending"
            r2 = 0
            android.content.pm.PackageManager r3 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9
            boolean r3 = r3.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9
            if (r3 != 0) goto L1c
            com.google.android.gms.internal.ads.zzfxd r8 = com.google.android.gms.internal.ads.zzfxf.zza
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "Play Store package is disabled."
            r8.zzd(r1, r0)
            goto Lc0
        L1c:
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            r3 = 64
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            android.content.pm.Signature[] r8 = r8.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            if (r8 == 0) goto La7
            int r0 = r8.length
            if (r0 != 0) goto L2f
            goto La7
        L2f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
        L35:
            r4 = 1
            if (r3 >= r0) goto L6d
            r5 = r8[r3]
            byte[] r5 = r5.toByteArray()
            java.lang.String r5 = com.google.android.gms.internal.ads.zzfxe.zza(r5)
            r1.add(r5)
            java.lang.String r6 = "8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L6c
            java.lang.String r6 = android.os.Build.TAGS
            java.lang.String r7 = "dev-keys"
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L61
            java.lang.String r6 = android.os.Build.TAGS
            java.lang.String r7 = "test-keys"
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L69
        L61:
            java.lang.String r6 = "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L6c
        L69:
            int r3 = r3 + 1
            goto L35
        L6c:
            return r4
        L6d:
            com.google.android.gms.internal.ads.zzfxd r8 = com.google.android.gms.internal.ads.zzfxf.zza
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L95
        L80:
            java.lang.Object r4 = r1.next()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.append(r4)
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L95
            java.lang.String r4 = ", "
            r3.append(r4)
            goto L80
        L95:
            java.lang.String r1 = r3.toString()
            r0[r2] = r1
            java.lang.String r1 = "Play Store package certs are not valid. Found these sha256 certs: [%s]."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r8.zzd(r0, r1)
            goto Lc0
        La7:
            com.google.android.gms.internal.ads.zzfxd r8 = com.google.android.gms.internal.ads.zzfxf.zza
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "Play Store package is not signed -- possibly self-built package. Could not verify."
            r8.zzd(r1, r0)
            goto Lc0
        Lb1:
            com.google.android.gms.internal.ads.zzfxd r8 = com.google.android.gms.internal.ads.zzfxf.zza
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r8.zzd(r0, r1)
            goto Lc0
        Lb9:
            com.google.android.gms.internal.ads.zzfxd r8 = com.google.android.gms.internal.ads.zzfxf.zza
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r8.zzd(r0, r1)
        Lc0:
            return r2
    }
}
