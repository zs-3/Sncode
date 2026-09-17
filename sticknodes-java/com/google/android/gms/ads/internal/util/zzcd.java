package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcd {
    @java.lang.Deprecated
    public static java.lang.Object zza(android.content.Context r2, java.util.concurrent.Callable r3) {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()     // Catch: java.lang.Throwable -> L25
            android.os.StrictMode$ThreadPolicy$Builder r1 = new android.os.StrictMode$ThreadPolicy$Builder     // Catch: java.lang.Throwable -> L20
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L20
            android.os.StrictMode$ThreadPolicy$Builder r1 = r1.permitDiskReads()     // Catch: java.lang.Throwable -> L20
            android.os.StrictMode$ThreadPolicy$Builder r1 = r1.permitDiskWrites()     // Catch: java.lang.Throwable -> L20
            android.os.StrictMode$ThreadPolicy r1 = r1.build()     // Catch: java.lang.Throwable -> L20
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r3.call()     // Catch: java.lang.Throwable -> L20
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L25
            return r3
        L20:
            r3 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L25
            throw r3     // Catch: java.lang.Throwable -> L25
        L25:
            r3 = move-exception
            java.lang.String r0 = "Unexpected exception."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r3)
            com.google.android.gms.internal.ads.zzbur r2 = com.google.android.gms.internal.ads.zzbup.zza(r2)
            java.lang.String r0 = "StrictModeUtil.runWithLaxStrictMode"
            r2.zzh(r3, r0)
            r2 = 0
            return r2
    }
}
