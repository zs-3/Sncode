package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzjm implements com.google.android.gms.internal.measurement.zzjr {
    public static final java.lang.String[] zza = null;
    private static final java.util.Map zzb = null;
    private final android.content.ContentResolver zzc;
    private final android.net.Uri zzd;
    private final java.lang.Runnable zze;
    private final android.database.ContentObserver zzf;
    private final java.lang.Object zzg;
    private volatile java.util.Map zzh;
    private final java.util.List zzi;

    static {
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            com.google.android.gms.internal.measurement.zzjm.zzb = r0
            java.lang.String r0 = "key"
            java.lang.String r1 = "value"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.google.android.gms.internal.measurement.zzjm.zza = r0
            return
    }

    private zzjm(android.content.ContentResolver r2, android.net.Uri r3, java.lang.Runnable r4) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzg = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzi = r0
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r3)
            r1.zzc = r2
            r1.zzd = r3
            r1.zze = r4
            com.google.android.gms.internal.measurement.zzjl r2 = new com.google.android.gms.internal.measurement.zzjl
            r3 = 0
            r2.<init>(r1, r3)
            r1.zzf = r2
            return
    }

    public static com.google.android.gms.internal.measurement.zzjm zza(android.content.ContentResolver r4, android.net.Uri r5, java.lang.Runnable r6) {
            java.lang.Class<com.google.android.gms.internal.measurement.zzjm> r0 = com.google.android.gms.internal.measurement.zzjm.class
            monitor-enter(r0)
            java.util.Map r1 = com.google.android.gms.internal.measurement.zzjm.zzb     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.measurement.zzjm r2 = (com.google.android.gms.internal.measurement.zzjm) r2     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L1c
            com.google.android.gms.internal.measurement.zzjm r3 = new com.google.android.gms.internal.measurement.zzjm     // Catch: java.lang.SecurityException -> L1c java.lang.Throwable -> L1e
            r3.<init>(r4, r5, r6)     // Catch: java.lang.SecurityException -> L1c java.lang.Throwable -> L1e
            r6 = 0
            android.database.ContentObserver r2 = r3.zzf     // Catch: java.lang.SecurityException -> L1b java.lang.Throwable -> L1e
            r4.registerContentObserver(r5, r6, r2)     // Catch: java.lang.SecurityException -> L1b java.lang.Throwable -> L1e
            r1.put(r5, r3)     // Catch: java.lang.SecurityException -> L1b java.lang.Throwable -> L1e
        L1b:
            r2 = r3
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r2
        L1e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r4
    }

    public static /* synthetic */ java.util.Map zzc(com.google.android.gms.internal.measurement.zzjm r7) {
            android.content.ContentResolver r0 = r7.zzc
            android.net.Uri r2 = r7.zzd
            android.content.ContentProviderClient r7 = r0.acquireUnstableContentProviderClient(r2)
            java.lang.String r0 = "ConfigurationContentLdr"
            if (r7 != 0) goto L17
            java.lang.String r7 = "Unable to acquire ContentProviderClient, using default values"
            android.util.Log.w(r0, r7)
            java.util.Map r7 = java.util.Collections.emptyMap()
            goto L99
        L17:
            java.lang.String[] r3 = com.google.android.gms.internal.measurement.zzjm.zza     // Catch: java.lang.Throwable -> L89 android.os.RemoteException -> L8b
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r7
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L89 android.os.RemoteException -> L8b
            if (r1 != 0) goto L2e
            java.lang.String r2 = "ContentProvider query returned null cursor, using default values"
            android.util.Log.w(r0, r2)     // Catch: java.lang.Throwable -> L7d
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L7d
            goto L95
        L2e:
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L7d
            if (r2 != 0) goto L40
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L7d
        L38:
            r1.close()     // Catch: java.lang.Throwable -> L89 android.os.RemoteException -> L8b
            r7.release()
            r7 = r2
            goto L99
        L40:
            r3 = 256(0x100, float:3.59E-43)
            if (r2 > r3) goto L4a
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap     // Catch: java.lang.Throwable -> L7d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L7d
            goto L51
        L4a:
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L7d
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L7d
        L51:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto L65
            r2 = 0
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L7d
            r4 = 1
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L7d
            r3.put(r2, r4)     // Catch: java.lang.Throwable -> L7d
            goto L51
        L65:
            boolean r2 = r1.isAfterLast()     // Catch: java.lang.Throwable -> L7d
            if (r2 != 0) goto L75
            java.lang.String r2 = "Cursor read incomplete (ContentProvider dead?), using default values"
            android.util.Log.w(r0, r2)     // Catch: java.lang.Throwable -> L7d
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L7d
            goto L38
        L75:
            r1.close()     // Catch: java.lang.Throwable -> L89 android.os.RemoteException -> L8b
            r7.release()
            r7 = r3
            goto L99
        L7d:
            r2 = move-exception
            if (r1 == 0) goto L88
            r1.close()     // Catch: java.lang.Throwable -> L84
            goto L88
        L84:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch: java.lang.Throwable -> L89 android.os.RemoteException -> L8b
        L88:
            throw r2     // Catch: java.lang.Throwable -> L89 android.os.RemoteException -> L8b
        L89:
            r0 = move-exception
            goto L9a
        L8b:
            r1 = move-exception
            java.lang.String r2 = "ContentProvider query failed, using default values"
            android.util.Log.w(r0, r2, r1)     // Catch: java.lang.Throwable -> L89
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L89
        L95:
            r7.release()
            r7 = r0
        L99:
            return r7
        L9a:
            r7.release()
            throw r0
    }

    static synchronized void zze() {
            java.lang.Class<com.google.android.gms.internal.measurement.zzjm> r0 = com.google.android.gms.internal.measurement.zzjm.class
            monitor-enter(r0)
            java.util.Map r1 = com.google.android.gms.internal.measurement.zzjm.zzb     // Catch: java.lang.Throwable -> L26
            java.util.Collection r2 = r1.values()     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L26
        Ld:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L21
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.measurement.zzjm r3 = (com.google.android.gms.internal.measurement.zzjm) r3     // Catch: java.lang.Throwable -> L26
            android.content.ContentResolver r4 = r3.zzc     // Catch: java.lang.Throwable -> L26
            android.database.ContentObserver r3 = r3.zzf     // Catch: java.lang.Throwable -> L26
            r4.unregisterContentObserver(r3)     // Catch: java.lang.Throwable -> L26
            goto Ld
        L21:
            r1.clear()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            return
        L26:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzjr
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(java.lang.String r2) {
            r1 = this;
            java.util.Map r0 = r1.zzd()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public final java.util.Map zzd() {
            r5 = this;
            java.util.Map r0 = r5.zzh
            if (r0 != 0) goto L3e
            java.lang.Object r1 = r5.zzg
            monitor-enter(r1)
            java.util.Map r0 = r5.zzh     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L39
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.measurement.zzjk r2 = new com.google.android.gms.internal.measurement.zzjk     // Catch: java.lang.Throwable -> L1e java.lang.IllegalStateException -> L20 android.database.sqlite.SQLiteException -> L22 java.lang.SecurityException -> L24
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L1e java.lang.IllegalStateException -> L20 android.database.sqlite.SQLiteException -> L22 java.lang.SecurityException -> L24
            java.lang.Object r2 = com.google.android.gms.internal.measurement.zzjp.zza(r2)     // Catch: java.lang.Throwable -> L1e java.lang.IllegalStateException -> L20 android.database.sqlite.SQLiteException -> L22 java.lang.SecurityException -> L24
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L1e java.lang.IllegalStateException -> L20 android.database.sqlite.SQLiteException -> L22 java.lang.SecurityException -> L24
        L1a:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L3b
            goto L31
        L1e:
            r2 = move-exception
            goto L35
        L20:
            r2 = move-exception
            goto L25
        L22:
            r2 = move-exception
            goto L25
        L24:
            r2 = move-exception
        L25:
            java.lang.String r3 = "ConfigurationContentLdr"
            java.lang.String r4 = "Unable to query ContentProvider, using default values"
            android.util.Log.w(r3, r4, r2)     // Catch: java.lang.Throwable -> L1e
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L1e
            goto L1a
        L31:
            r5.zzh = r2     // Catch: java.lang.Throwable -> L3b
            r0 = r2
            goto L39
        L35:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L3b
            throw r2     // Catch: java.lang.Throwable -> L3b
        L39:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3b
            goto L3e
        L3b:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3b
            throw r0
        L3e:
            if (r0 == 0) goto L41
            return r0
        L41:
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
    }

    public final void zzf() {
            r2 = this;
            java.lang.Object r0 = r2.zzg
            monitor-enter(r0)
            r1 = 0
            r2.zzh = r1     // Catch: java.lang.Throwable -> L28
            java.lang.Runnable r1 = r2.zze     // Catch: java.lang.Throwable -> L28
            r1.run()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            monitor-enter(r2)
            java.util.List r0 = r2.zzi     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L25
        L13:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.measurement.zzjn r1 = (com.google.android.gms.internal.measurement.zzjn) r1     // Catch: java.lang.Throwable -> L25
            r1.zza()     // Catch: java.lang.Throwable -> L25
            goto L13
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            throw r0
        L28:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r1
    }
}
