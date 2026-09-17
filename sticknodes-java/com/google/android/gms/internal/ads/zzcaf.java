package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcaf {
    private java.math.BigInteger zza;
    private java.lang.String zzb;

    public zzcaf() {
            r1 = this;
            r1.<init>()
            java.math.BigInteger r0 = java.math.BigInteger.ONE
            r1.zza = r0
            java.lang.String r0 = "0"
            r1.zzb = r0
            return
    }

    public final synchronized java.lang.String zza() {
            r3 = this;
            monitor-enter(r3)
            java.math.BigInteger r0 = r3.zza     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L15
            java.math.BigInteger r1 = r3.zza     // Catch: java.lang.Throwable -> L15
            java.math.BigInteger r2 = java.math.BigInteger.ONE     // Catch: java.lang.Throwable -> L15
            java.math.BigInteger r1 = r1.add(r2)     // Catch: java.lang.Throwable -> L15
            r3.zza = r1     // Catch: java.lang.Throwable -> L15
            r3.zzb = r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r3)
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final synchronized java.lang.String zzb() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.zzb     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
