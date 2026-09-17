package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhb {
    private final java.util.Map zza;
    private java.util.Map zzb;

    public zzhb() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            return
    }

    public final synchronized java.util.Map zza() {
            r2 = this;
            monitor-enter(r2)
            java.util.Map r0 = r2.zzb     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L12
            java.util.Map r0 = r2.zza     // Catch: java.lang.Throwable -> L16
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L16
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L16
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r1)     // Catch: java.lang.Throwable -> L16
            r2.zzb = r0     // Catch: java.lang.Throwable -> L16
        L12:
            java.util.Map r0 = r2.zzb     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            return r0
        L16:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
