package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbt {
    private android.os.HandlerThread zza;
    private android.os.Handler zzb;
    private int zzc;
    private final java.lang.Object zzd;

    public zzbt() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            r1.zzb = r0
            r0 = 0
            r1.zzc = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzd = r0
            return
    }

    public final android.os.Handler zza() {
            r1 = this;
            android.os.Handler r0 = r1.zzb
            return r0
    }

    public final android.os.Looper zzb() {
            r3 = this;
            java.lang.Object r0 = r3.zzd
            monitor-enter(r0)
            int r1 = r3.zzc     // Catch: java.lang.Throwable -> L4f
            if (r1 != 0) goto L3a
            android.os.HandlerThread r1 = r3.zza     // Catch: java.lang.Throwable -> L4f
            if (r1 != 0) goto L2f
            java.lang.String r1 = "Starting the looper thread."
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> L4f
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "LooperProvider"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4f
            r3.zza = r1     // Catch: java.lang.Throwable -> L4f
            r1.start()     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.internal.ads.zzfun r1 = new com.google.android.gms.internal.ads.zzfun     // Catch: java.lang.Throwable -> L4f
            android.os.HandlerThread r2 = r3.zza     // Catch: java.lang.Throwable -> L4f
            android.os.Looper r2 = r2.getLooper()     // Catch: java.lang.Throwable -> L4f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4f
            r3.zzb = r1     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "Looper thread started."
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> L4f
            goto L41
        L2f:
            java.lang.String r1 = "Resuming the looper thread"
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r1 = r3.zzd     // Catch: java.lang.Throwable -> L4f
            r1.notifyAll()     // Catch: java.lang.Throwable -> L4f
            goto L41
        L3a:
            android.os.HandlerThread r1 = r3.zza     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "Invalid state: handlerThread should already been initialized."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L4f
        L41:
            int r1 = r3.zzc     // Catch: java.lang.Throwable -> L4f
            int r1 = r1 + 1
            r3.zzc = r1     // Catch: java.lang.Throwable -> L4f
            android.os.HandlerThread r1 = r3.zza     // Catch: java.lang.Throwable -> L4f
            android.os.Looper r1 = r1.getLooper()     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            return r1
        L4f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r1
    }
}
