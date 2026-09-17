package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcvl {
    private final java.lang.Object zza;
    private final java.util.concurrent.ConcurrentHashMap zzb;
    private final java.util.concurrent.ConcurrentHashMap zzc;
    private final java.util.concurrent.ConcurrentHashMap zzd;

    public zzcvl() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zzb = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zzc = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zzd = r0
            return
    }

    public final int zza(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r1.zzb
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            int r2 = r2.intValue()
            return r2
    }

    public final long zzb(java.lang.String r3) {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r2.zzd
            java.lang.Object r3 = r0.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 != 0) goto Ld
            r0 = -1
            return r0
        Ld:
            long r0 = r3.longValue()
            return r0
    }

    public final void zzc(java.lang.String r4) {
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            java.util.concurrent.ConcurrentHashMap r1 = r3.zzb     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L23
            r2 = 1
            if (r1 != 0) goto L13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L23
            goto L1c
        L13:
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L23
            int r1 = r1 + r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L23
        L1c:
            java.util.concurrent.ConcurrentHashMap r2 = r3.zzb     // Catch: java.lang.Throwable -> L23
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r4
    }

    public final void zzd(java.lang.String r3, java.lang.String r4, long r5) {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r2.zzc
            java.lang.Object r0 = r0.get(r4)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            java.util.concurrent.ConcurrentHashMap r1 = r2.zzc
            r1.remove(r4)
            java.util.concurrent.ConcurrentHashMap r4 = r2.zzd
            long r0 = r0.longValue()
            long r5 = r5 - r0
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.put(r3, r5)
            return
    }

    public final void zze(java.lang.String r1, long r2) {
            r0 = this;
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.util.concurrent.ConcurrentHashMap r3 = r0.zzc
            r3.put(r1, r2)
            return
    }
}
