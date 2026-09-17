package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzbun implements java.lang.Thread.UncaughtExceptionHandler {
    final /* synthetic */ java.lang.Thread.UncaughtExceptionHandler zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbup zzb;

    zzbun(com.google.android.gms.internal.ads.zzbup r1, java.lang.Thread.UncaughtExceptionHandler r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread r3, java.lang.Throwable r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbup r0 = r2.zzb     // Catch: java.lang.Throwable -> L6
            r0.zzg(r3, r4)     // Catch: java.lang.Throwable -> L6
            goto Lb
        L6:
            java.lang.String r0 = "AdMob exception reporter failed reporting the exception."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r0)     // Catch: java.lang.Throwable -> L13
        Lb:
            java.lang.Thread$UncaughtExceptionHandler r0 = r2.zza
            if (r0 == 0) goto L12
            r0.uncaughtException(r3, r4)
        L12:
            return
        L13:
            r0 = move-exception
            java.lang.Thread$UncaughtExceptionHandler r1 = r2.zza
            if (r1 != 0) goto L19
            goto L1c
        L19:
            r1.uncaughtException(r3, r4)
        L1c:
            throw r0
    }
}
