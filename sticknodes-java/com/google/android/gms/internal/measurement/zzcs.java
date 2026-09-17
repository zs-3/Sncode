package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzcs extends com.google.android.gms.internal.measurement.zzcx {
    private final java.util.concurrent.atomic.AtomicReference zza;
    private boolean zzb;

    public zzcs() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.zza = r0
            return
    }

    public static final java.lang.Object zzf(android.os.Bundle r4, java.lang.Class r5) {
            r0 = 0
            if (r4 == 0) goto L32
            java.lang.String r1 = "r"
            java.lang.Object r4 = r4.get(r1)
            if (r4 == 0) goto L32
            java.lang.Object r0 = r5.cast(r4)     // Catch: java.lang.ClassCastException -> L10
            goto L32
        L10:
            r0 = move-exception
            java.lang.String r5 = r5.getCanonicalName()
            r1 = 1
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r2[r1] = r4
            java.lang.String r4 = "Unexpected object type. Expected, Received: %s, %s"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            java.lang.String r5 = "AM"
            android.util.Log.w(r5, r4, r0)
            throw r0
        L32:
            return r0
    }

    public final android.os.Bundle zzb(long r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.zza
            monitor-enter(r0)
            boolean r1 = r2.zzb     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto Le
            r0.wait(r3)     // Catch: java.lang.InterruptedException -> Lb java.lang.Throwable -> L18
            goto Le
        Lb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            r3 = 0
            return r3
        Le:
            java.util.concurrent.atomic.AtomicReference r3 = r2.zza     // Catch: java.lang.Throwable -> L18
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L18
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r3
        L18:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r3
    }

    public final java.lang.Long zzc(long r1) {
            r0 = this;
            android.os.Bundle r1 = r0.zzb(r1)
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            java.lang.Object r1 = zzf(r1, r2)
            java.lang.Long r1 = (java.lang.Long) r1
            return r1
    }

    public final java.lang.String zzd(long r1) {
            r0 = this;
            android.os.Bundle r1 = r0.zzb(r1)
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Object r1 = zzf(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final void zze(android.os.Bundle r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.zza
            monitor-enter(r0)
            r0.set(r3)     // Catch: java.lang.Throwable -> L12
            r3 = 1
            r2.zzb = r3     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.atomic.AtomicReference r3 = r2.zza     // Catch: java.lang.Throwable -> L10
            r3.notify()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r3 = move-exception
            goto L19
        L12:
            r3 = move-exception
            java.util.concurrent.atomic.AtomicReference r1 = r2.zza     // Catch: java.lang.Throwable -> L10
            r1.notify()     // Catch: java.lang.Throwable -> L10
            throw r3     // Catch: java.lang.Throwable -> L10
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }
}
