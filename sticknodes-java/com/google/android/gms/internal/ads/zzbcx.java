package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbcx {
    public static java.lang.Object zza(com.google.android.gms.internal.ads.zzfyp r2) {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()
            android.os.StrictMode$ThreadPolicy$Builder r1 = new android.os.StrictMode$ThreadPolicy$Builder     // Catch: java.lang.Throwable -> L20
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L20
            android.os.StrictMode$ThreadPolicy$Builder r1 = r1.permitDiskReads()     // Catch: java.lang.Throwable -> L20
            android.os.StrictMode$ThreadPolicy$Builder r1 = r1.permitDiskWrites()     // Catch: java.lang.Throwable -> L20
            android.os.StrictMode$ThreadPolicy r1 = r1.build()     // Catch: java.lang.Throwable -> L20
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r2 = r2.zza()     // Catch: java.lang.Throwable -> L20
            android.os.StrictMode.setThreadPolicy(r0)
            return r2
        L20:
            r2 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r2
    }
}
