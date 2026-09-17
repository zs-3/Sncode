package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfuu extends com.google.android.gms.internal.ads.zzfut {
    private static com.google.android.gms.internal.ads.zzfuu zzc;

    static {
            return
    }

    private zzfuu(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "paidv1_id"
            java.lang.String r1 = "paidv1_creation_time"
            java.lang.String r2 = "PaidV1LifecycleImpl"
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public static final com.google.android.gms.internal.ads.zzfuu zzj(android.content.Context r2) {
            java.lang.Class<com.google.android.gms.internal.ads.zzfuu> r0 = com.google.android.gms.internal.ads.zzfuu.class
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzfuu r1 = com.google.android.gms.internal.ads.zzfuu.zzc     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            com.google.android.gms.internal.ads.zzfuu r1 = new com.google.android.gms.internal.ads.zzfuu     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.internal.ads.zzfuu.zzc = r1     // Catch: java.lang.Throwable -> L12
        Le:
            com.google.android.gms.internal.ads.zzfuu r2 = com.google.android.gms.internal.ads.zzfuu.zzc     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    public final com.google.android.gms.internal.ads.zzfur zzh(long r8, boolean r10) throws java.io.IOException {
            r7 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzfuu> r0 = com.google.android.gms.internal.ads.zzfuu.class
            monitor-enter(r0)
            r2 = 0
            r3 = 0
            r1 = r7
            r4 = r8
            r6 = r10
            com.google.android.gms.internal.ads.zzfur r8 = r1.zzb(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r8
        Le:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r8
    }

    public final com.google.android.gms.internal.ads.zzfur zzi(java.lang.String r2, java.lang.String r3, long r4, boolean r6) throws java.io.IOException {
            r1 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzfuu> r0 = com.google.android.gms.internal.ads.zzfuu.class
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzfur r2 = r1.zzb(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public final void zzk() throws java.io.IOException {
            r2 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzfuu> r0 = com.google.android.gms.internal.ads.zzfuu.class
            monitor-enter(r0)
            r1 = 0
            r2.zzf(r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public final void zzl() throws java.io.IOException {
            r2 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzfuu> r0 = com.google.android.gms.internal.ads.zzfuu.class
            monitor-enter(r0)
            r1 = 1
            r2.zzf(r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }
}
