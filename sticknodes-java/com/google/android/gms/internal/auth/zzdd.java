package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzdd implements com.google.android.gms.internal.auth.zzcl {
    private static final java.util.Map zza = null;
    private final android.content.SharedPreferences zzb;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener zzc;

    static {
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            com.google.android.gms.internal.auth.zzdd.zza = r0
            return
    }

    static com.google.android.gms.internal.auth.zzdd zza(android.content.Context r0, java.lang.String r1, java.lang.Runnable r2) {
            boolean r0 = com.google.android.gms.internal.auth.zzcc.zzb()
            r1 = 0
            if (r0 != 0) goto L23
            java.lang.Class<com.google.android.gms.internal.auth.zzdd> r0 = com.google.android.gms.internal.auth.zzdd.class
            monitor-enter(r0)
            java.util.Map r2 = com.google.android.gms.internal.auth.zzdd.zza     // Catch: java.lang.Throwable -> L20
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.auth.zzdd r2 = (com.google.android.gms.internal.auth.zzdd) r2     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r2
        L16:
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L20
            throw r1     // Catch: java.lang.Throwable -> L1b
        L1b:
            r1 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch: java.lang.Throwable -> L20
            throw r1     // Catch: java.lang.Throwable -> L20
        L20:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1
        L23:
            throw r1
    }

    static synchronized void zzc() {
            java.lang.Class<com.google.android.gms.internal.auth.zzdd> r0 = com.google.android.gms.internal.auth.zzdd.class
            monitor-enter(r0)
            java.util.Map r1 = com.google.android.gms.internal.auth.zzdd.zza     // Catch: java.lang.Throwable -> L22
            java.util.Collection r2 = r1.values()     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L22
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r3 != 0) goto L18
            r1.clear()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            return
        L18:
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.auth.zzdd r1 = (com.google.android.gms.internal.auth.zzdd) r1     // Catch: java.lang.Throwable -> L22
            android.content.SharedPreferences r1 = r1.zzb     // Catch: java.lang.Throwable -> L22
            r1 = 0
            throw r1     // Catch: java.lang.Throwable -> L22
        L22:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    public final java.lang.Object zzb(java.lang.String r1) {
            r0 = this;
            r1 = 0
            throw r1
    }
}
