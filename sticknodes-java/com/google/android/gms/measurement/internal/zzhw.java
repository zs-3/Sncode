package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzhw {
    final com.google.android.gms.measurement.internal.zzio zza;

    zzhw(com.google.android.gms.measurement.internal.zzpv r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzt()
            r0.zza = r1
            return
    }

    final boolean zza() {
            r4 = this;
            r0 = 0
            com.google.android.gms.measurement.internal.zzio r1 = r4.zza     // Catch: java.lang.Exception -> L2c
            android.content.Context r2 = r1.zzaT()     // Catch: java.lang.Exception -> L2c
            com.google.android.gms.common.wrappers.PackageManagerWrapper r2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r2)     // Catch: java.lang.Exception -> L2c
            if (r2 != 0) goto L1b
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: java.lang.Exception -> L2c
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()     // Catch: java.lang.Exception -> L2c
            java.lang.String r2 = "Failed to get PackageManager for Install Referrer Play Store compatibility check"
            r1.zza(r2)     // Catch: java.lang.Exception -> L2c
            return r0
        L1b:
            java.lang.String r1 = "com.android.vending"
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r3)     // Catch: java.lang.Exception -> L2c
            int r1 = r1.versionCode     // Catch: java.lang.Exception -> L2c
            r2 = 80837300(0x4d17ab4, float:4.924835E-36)
            if (r1 < r2) goto L2b
            r0 = 1
        L2b:
            return r0
        L2c:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r4.zza
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()
            java.lang.String r3 = "Failed to retrieve Play Store version for Install Referrer"
            r2.zzb(r3, r1)
            return r0
    }
}
