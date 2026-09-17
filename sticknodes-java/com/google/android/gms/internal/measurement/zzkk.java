package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzkk implements com.google.android.gms.internal.measurement.zzjr {
    private static final java.util.Map zza = null;
    private final android.content.SharedPreferences zzb;
    private final java.lang.Runnable zzc;
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener zzd;
    private final java.lang.Object zze;
    private volatile java.util.Map zzf;
    private final java.util.List zzg;

    static {
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            com.google.android.gms.internal.measurement.zzkk.zza = r0
            return
    }

    private zzkk(android.content.SharedPreferences r2, java.lang.Runnable r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zze = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzg = r0
            r1.zzb = r2
            r1.zzc = r3
            return
    }

    static com.google.android.gms.internal.measurement.zzkk zza(android.content.Context r7, java.lang.String r8, java.lang.Runnable r9) {
            boolean r0 = com.google.android.gms.internal.measurement.zzji.zzc()
            if (r0 == 0) goto L17
            java.lang.String r0 = "direct_boot:"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto Lf
            goto L17
        Lf:
            boolean r0 = com.google.android.gms.internal.measurement.zzji.zzb(r7)
            if (r0 != 0) goto L17
            r7 = 0
            return r7
        L17:
            java.lang.Class<com.google.android.gms.internal.measurement.zzkk> r0 = com.google.android.gms.internal.measurement.zzkk.class
            monitor-enter(r0)
            java.util.Map r1 = com.google.android.gms.internal.measurement.zzkk.zza     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = r1.get(r8)     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.measurement.zzkk r2 = (com.google.android.gms.internal.measurement.zzkk) r2     // Catch: java.lang.Throwable -> L6e
            if (r2 != 0) goto L6c
            com.google.android.gms.internal.measurement.zzkk r2 = new com.google.android.gms.internal.measurement.zzkk     // Catch: java.lang.Throwable -> L6e
            android.os.StrictMode$ThreadPolicy r3 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "direct_boot:"
            boolean r4 = r8.startsWith(r4)     // Catch: java.lang.Throwable -> L67
            r5 = 0
            if (r4 == 0) goto L4d
            boolean r4 = com.google.android.gms.internal.measurement.zzji.zzc()     // Catch: java.lang.Throwable -> L67
            if (r4 == 0) goto L3d
            android.content.Context r7 = r7.createDeviceProtectedStorageContext()     // Catch: java.lang.Throwable -> L67
        L3d:
            r4 = 12
            java.lang.String r4 = r8.substring(r4)     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.internal.measurement.zzcc r6 = com.google.android.gms.internal.measurement.zzcd.zza     // Catch: java.lang.Throwable -> L67
            android.content.SharedPreferences r7 = com.google.android.gms.internal.measurement.zzci.zza(r7, r4, r5, r6)     // Catch: java.lang.Throwable -> L67
        L49:
            android.os.StrictMode.setThreadPolicy(r3)     // Catch: java.lang.Throwable -> L6e
            goto L54
        L4d:
            com.google.android.gms.internal.measurement.zzcc r4 = com.google.android.gms.internal.measurement.zzcd.zza     // Catch: java.lang.Throwable -> L67
            android.content.SharedPreferences r7 = com.google.android.gms.internal.measurement.zzci.zza(r7, r8, r5, r4)     // Catch: java.lang.Throwable -> L67
            goto L49
        L54:
            r2.<init>(r7, r9)     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.measurement.zzkj r7 = new com.google.android.gms.internal.measurement.zzkj     // Catch: java.lang.Throwable -> L6e
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L6e
            r2.zzd = r7     // Catch: java.lang.Throwable -> L6e
            android.content.SharedPreferences r9 = r2.zzb     // Catch: java.lang.Throwable -> L6e
            r9.registerOnSharedPreferenceChangeListener(r7)     // Catch: java.lang.Throwable -> L6e
            r1.put(r8, r2)     // Catch: java.lang.Throwable -> L6e
            goto L6c
        L67:
            r7 = move-exception
            android.os.StrictMode.setThreadPolicy(r3)     // Catch: java.lang.Throwable -> L6e
            throw r7     // Catch: java.lang.Throwable -> L6e
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            return r2
        L6e:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r7
    }

    public static /* synthetic */ void zzc(com.google.android.gms.internal.measurement.zzkk r0, android.content.SharedPreferences r1, java.lang.String r2) {
            java.lang.Object r1 = r0.zze
            monitor-enter(r1)
            r2 = 0
            r0.zzf = r2     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.measurement.zzki.zzc()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            monitor-enter(r0)
            java.util.List r1 = r0.zzg     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L23
        L11:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.measurement.zzjn r2 = (com.google.android.gms.internal.measurement.zzjn) r2     // Catch: java.lang.Throwable -> L23
            r2.zza()     // Catch: java.lang.Throwable -> L23
            goto L11
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r1
        L26:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            throw r0
    }

    static synchronized void zzd() {
            java.lang.Class<com.google.android.gms.internal.measurement.zzkk> r0 = com.google.android.gms.internal.measurement.zzkk.class
            monitor-enter(r0)
            java.util.Map r1 = com.google.android.gms.internal.measurement.zzkk.zza     // Catch: java.lang.Throwable -> L2c
            java.util.Collection r2 = r1.values()     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2c
        Ld:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L27
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.measurement.zzkk r3 = (com.google.android.gms.internal.measurement.zzkk) r3     // Catch: java.lang.Throwable -> L2c
            android.content.SharedPreferences r4 = r3.zzb     // Catch: java.lang.Throwable -> L2c
            android.content.SharedPreferences$OnSharedPreferenceChangeListener r3 = r3.zzd     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L2c
            android.content.SharedPreferences$OnSharedPreferenceChangeListener r3 = (android.content.SharedPreferences.OnSharedPreferenceChangeListener) r3     // Catch: java.lang.Throwable -> L2c
            r4.unregisterOnSharedPreferenceChangeListener(r3)     // Catch: java.lang.Throwable -> L2c
            goto Ld
        L27:
            r1.clear()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)
            return
        L2c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzjr
    public final java.lang.Object zzb(java.lang.String r4) {
            r3 = this;
            java.util.Map r0 = r3.zzf
            if (r0 != 0) goto L26
            java.lang.Object r1 = r3.zze
            monitor-enter(r1)
            java.util.Map r0 = r3.zzf     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L21
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L23
            android.content.SharedPreferences r2 = r3.zzb     // Catch: java.lang.Throwable -> L1c
            java.util.Map r2 = r2.getAll()     // Catch: java.lang.Throwable -> L1c
            r3.zzf = r2     // Catch: java.lang.Throwable -> L1c
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L23
            r0 = r2
            goto L21
        L1c:
            r4 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L23
            throw r4     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            throw r4
        L26:
            if (r0 == 0) goto L2d
            java.lang.Object r4 = r0.get(r4)
            return r4
        L2d:
            r4 = 0
            return r4
    }
}
