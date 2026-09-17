package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbbq {
    private com.google.android.gms.internal.ads.zzbbf zza;
    private boolean zzb;
    private final android.content.Context zzc;
    private final java.lang.Object zzd;

    zzbbq(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzd = r0
            r1.zzc = r2
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzbbf zza(com.google.android.gms.internal.ads.zzbbq r0) {
            com.google.android.gms.internal.ads.zzbbf r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.internal.ads.zzbbq r0) {
            java.lang.Object r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzbbq r0, boolean r1) {
            r1 = 1
            r0.zzb = r1
            return
    }

    static /* bridge */ /* synthetic */ void zze(com.google.android.gms.internal.ads.zzbbq r2) {
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbbf r1 = r2.zza     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L9:
            r1.disconnect()     // Catch: java.lang.Throwable -> L14
            r1 = 0
            r2.zza = r1     // Catch: java.lang.Throwable -> L14
            android.os.Binder.flushPendingCommands()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    static /* bridge */ /* synthetic */ boolean zzf(com.google.android.gms.internal.ads.zzbbq r0) {
            boolean r0 = r0.zzb
            return r0
    }

    final java.util.concurrent.Future zzc(com.google.android.gms.internal.ads.zzbbg r7) {
            r6 = this;
            com.google.android.gms.internal.ads.zzbbk r0 = new com.google.android.gms.internal.ads.zzbbk
            r0.<init>(r6)
            com.google.android.gms.internal.ads.zzbbo r1 = new com.google.android.gms.internal.ads.zzbbo
            r1.<init>(r6, r7, r0)
            com.google.android.gms.internal.ads.zzbbp r7 = new com.google.android.gms.internal.ads.zzbbp
            r7.<init>(r6, r0)
            java.lang.Object r2 = r6.zzd
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzbbf r3 = new com.google.android.gms.internal.ads.zzbbf     // Catch: java.lang.Throwable -> L28
            android.content.Context r4 = r6.zzc     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.ads.internal.util.zzbt r5 = com.google.android.gms.ads.internal.zzu.zzt()     // Catch: java.lang.Throwable -> L28
            android.os.Looper r5 = r5.zzb()     // Catch: java.lang.Throwable -> L28
            r3.<init>(r4, r5, r1, r7)     // Catch: java.lang.Throwable -> L28
            r6.zza = r3     // Catch: java.lang.Throwable -> L28
            r3.checkAvailabilityAndConnect()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
            return r0
        L28:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
            throw r7
    }
}
