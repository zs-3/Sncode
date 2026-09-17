package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzea {
    private static final java.lang.Object zza = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzea.zza = r0
            return
    }

    public static java.lang.String zza(java.lang.String r3, java.lang.Throwable r4) {
            if (r4 != 0) goto L4
            r4 = 0
            goto L28
        L4:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzea.zza
            monitor-enter(r0)
            r1 = r4
        L8:
            if (r1 == 0) goto L17
            boolean r2 = r1 instanceof java.net.UnknownHostException     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L12
            java.lang.String r4 = "UnknownHostException (no network)"
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            goto L28
        L12:
            java.lang.Throwable r1 = r1.getCause()     // Catch: java.lang.Throwable -> L50
            goto L8
        L17:
            java.lang.String r4 = android.util.Log.getStackTraceString(r4)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "\t"
            java.lang.String r2 = "    "
            java.lang.String r4 = r4.replace(r1, r2)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L4f
            java.lang.String r0 = "\n"
            java.lang.String r1 = "\n  "
            java.lang.String r4 = r4.replace(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = "\n  "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = "\n"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L4f:
            return r3
        L50:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r3
    }

    public static void zzb(java.lang.String r2, java.lang.String r3) {
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzea.zza
            monitor-enter(r0)
            r1 = 0
            java.lang.String r3 = zza(r3, r1)     // Catch: java.lang.Throwable -> Ld
            android.util.Log.d(r2, r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public static void zzc(java.lang.String r2, java.lang.String r3) {
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzea.zza
            monitor-enter(r0)
            r1 = 0
            java.lang.String r3 = zza(r3, r1)     // Catch: java.lang.Throwable -> Ld
            android.util.Log.e(r2, r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public static void zzd(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzea.zza
            monitor-enter(r0)
            java.lang.String r2 = zza(r2, r3)     // Catch: java.lang.Throwable -> Lc
            android.util.Log.e(r1, r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    public static void zze(java.lang.String r2, java.lang.String r3) {
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzea.zza
            monitor-enter(r0)
            r1 = 0
            java.lang.String r3 = zza(r3, r1)     // Catch: java.lang.Throwable -> Ld
            android.util.Log.i(r2, r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public static void zzf(java.lang.String r2, java.lang.String r3) {
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzea.zza
            monitor-enter(r0)
            r1 = 0
            java.lang.String r3 = zza(r3, r1)     // Catch: java.lang.Throwable -> Ld
            android.util.Log.w(r2, r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public static void zzg(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzea.zza
            monitor-enter(r0)
            java.lang.String r2 = zza(r2, r3)     // Catch: java.lang.Throwable -> Lc
            android.util.Log.w(r1, r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }
}
