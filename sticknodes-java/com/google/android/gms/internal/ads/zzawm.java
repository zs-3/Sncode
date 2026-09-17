package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzawm implements java.lang.Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzawo zzb;

    zzawm(com.google.android.gms.internal.ads.zzawo r1, int r2, boolean r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.zza
            com.google.android.gms.internal.ads.zzawo r1 = r5.zzb
            if (r0 <= 0) goto Lc
            int r0 = r0 * 1000
            long r2 = (long) r0
            java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> Lc
        Lc:
            android.content.Context r0 = r1.zza     // Catch: java.lang.Throwable -> L2e
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L2e
            android.content.Context r2 = r1.zza     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r3)     // Catch: java.lang.Throwable -> L2e
            android.content.Context r1 = r1.zza     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = r1.getPackageName()     // Catch: java.lang.Throwable -> L2e
            int r0 = r0.versionCode     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzath r0 = com.google.android.gms.internal.ads.zzfrh.zza(r1, r2, r0)     // Catch: java.lang.Throwable -> L2e
            goto L2f
        L2e:
            r0 = 0
        L2f:
            com.google.android.gms.internal.ads.zzawo r1 = r5.zzb
            com.google.android.gms.internal.ads.zzawo.zzm(r1, r0)
            int r1 = r5.zza
            r2 = 4
            if (r1 >= r2) goto L76
            if (r0 != 0) goto L3c
            goto L6d
        L3c:
            boolean r1 = r0.zzaj()
            if (r1 == 0) goto L6d
            java.lang.String r1 = r0.zzh()
            java.lang.String r2 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L6d
            boolean r1 = r0.zzak()
            if (r1 == 0) goto L6d
            com.google.android.gms.internal.ads.zzatq r1 = r0.zzf()
            boolean r1 = r1.zze()
            if (r1 == 0) goto L6d
            com.google.android.gms.internal.ads.zzatq r0 = r0.zzf()
            long r0 = r0.zza()
            r2 = -2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L6d
            goto L76
        L6d:
            com.google.android.gms.internal.ads.zzawo r0 = r5.zzb
            int r1 = r5.zza
            r2 = 1
            int r1 = r1 + r2
            r0.zzo(r1, r2)
        L76:
            return
    }
}
