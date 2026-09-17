package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbd {
    private static final java.util.HashSet zza = null;
    private static java.lang.String zzb;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.google.android.gms.internal.ads.zzbd.zza = r0
            java.lang.String r0 = "media3.common"
            com.google.android.gms.internal.ads.zzbd.zzb = r0
            return
    }

    public static synchronized java.lang.String zza() {
            java.lang.Class<com.google.android.gms.internal.ads.zzbd> r0 = com.google.android.gms.internal.ads.zzbd.class
            monitor-enter(r0)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzbd.zzb     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public static synchronized void zzb(java.lang.String r3) {
            java.lang.Class<com.google.android.gms.internal.ads.zzbd> r0 = com.google.android.gms.internal.ads.zzbd.class
            monitor-enter(r0)
            java.util.HashSet r1 = com.google.android.gms.internal.ads.zzbd.zza     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.add(r3)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L25
            java.lang.String r1 = com.google.android.gms.internal.ads.zzbd.zzb     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r2.<init>()     // Catch: java.lang.Throwable -> L27
            r2.append(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = ", "
            r2.append(r1)     // Catch: java.lang.Throwable -> L27
            r2.append(r3)     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.zzbd.zzb = r3     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)
            return
        L25:
            monitor-exit(r0)
            return
        L27:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }
}
