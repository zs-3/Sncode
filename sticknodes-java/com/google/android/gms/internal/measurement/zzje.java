package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzje {
    private static com.google.android.gms.internal.measurement.zzjd zza;

    static {
            return
    }

    public static synchronized com.google.android.gms.internal.measurement.zzjd zza() {
            java.lang.Class<com.google.android.gms.internal.measurement.zzje> r0 = com.google.android.gms.internal.measurement.zzje.class
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzjd r1 = com.google.android.gms.internal.measurement.zzje.zza     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto Lf
            com.google.android.gms.internal.measurement.zzjh r1 = new com.google.android.gms.internal.measurement.zzjh     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            zzb(r1)     // Catch: java.lang.Throwable -> L13
        Lf:
            com.google.android.gms.internal.measurement.zzjd r1 = com.google.android.gms.internal.measurement.zzje.zza     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r1
        L13:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public static synchronized void zzb(com.google.android.gms.internal.measurement.zzjd r2) {
            java.lang.Class<com.google.android.gms.internal.measurement.zzje> r0 = com.google.android.gms.internal.measurement.zzje.class
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzjd r1 = com.google.android.gms.internal.measurement.zzje.zza     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto Lb
            com.google.android.gms.internal.measurement.zzje.zza = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "init() already called"
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L13
            throw r2     // Catch: java.lang.Throwable -> L13
        L13:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }
}
