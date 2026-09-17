package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzcg implements com.google.android.gms.internal.auth.zzcl {
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
            com.google.android.gms.internal.auth.zzcg.zzb = r0
            java.lang.String r0 = "key"
            java.lang.String r1 = "value"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.google.android.gms.internal.auth.zzcg.zza = r0
            return
    }

    private zzcg(android.content.ContentResolver r3, android.net.Uri r4, java.lang.Runnable r5) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.auth.zzcf r0 = new com.google.android.gms.internal.auth.zzcf
            r1 = 0
            r0.<init>(r2, r1)
            r2.zzf = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.zzg = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.zzi = r1
            java.util.Objects.requireNonNull(r3)
            java.util.Objects.requireNonNull(r4)
            r2.zzc = r3
            r2.zzd = r4
            r2.zze = r5
            r5 = 0
            r3.registerContentObserver(r4, r5, r0)
            return
    }

    public static com.google.android.gms.internal.auth.zzcg zza(android.content.ContentResolver r4, android.net.Uri r5, java.lang.Runnable r6) {
            java.lang.Class<com.google.android.gms.internal.auth.zzcg> r0 = com.google.android.gms.internal.auth.zzcg.class
            monitor-enter(r0)
            java.util.Map r1 = com.google.android.gms.internal.auth.zzcg.zzb     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.internal.auth.zzcg r2 = (com.google.android.gms.internal.auth.zzcg) r2     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L16
            com.google.android.gms.internal.auth.zzcg r3 = new com.google.android.gms.internal.auth.zzcg     // Catch: java.lang.SecurityException -> L16 java.lang.Throwable -> L18
            r3.<init>(r4, r5, r6)     // Catch: java.lang.SecurityException -> L16 java.lang.Throwable -> L18
            r1.put(r5, r3)     // Catch: java.lang.SecurityException -> L15 java.lang.Throwable -> L18
        L15:
            r2 = r3
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r2
        L18:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r4
    }

    static synchronized void zzd() {
            java.lang.Class<com.google.android.gms.internal.auth.zzcg> r0 = com.google.android.gms.internal.auth.zzcg.class
            monitor-enter(r0)
            java.util.Map r1 = com.google.android.gms.internal.auth.zzcg.zzb     // Catch: java.lang.Throwable -> L28
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L28
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.internal.auth.zzcg r2 = (com.google.android.gms.internal.auth.zzcg) r2     // Catch: java.lang.Throwable -> L28
            android.content.ContentResolver r3 = r2.zzc     // Catch: java.lang.Throwable -> L28
            android.database.ContentObserver r2 = r2.zzf     // Catch: java.lang.Throwable -> L28
            r3.unregisterContentObserver(r2)     // Catch: java.lang.Throwable -> L28
            goto Ld
        L21:
            java.util.Map r1 = com.google.android.gms.internal.auth.zzcg.zzb     // Catch: java.lang.Throwable -> L28
            r1.clear()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)
            return
        L28:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(java.lang.String r5) {
            r4 = this;
            java.util.Map r0 = r4.zzh
            if (r0 != 0) goto L38
            java.lang.Object r1 = r4.zzg
            monitor-enter(r1)
            java.util.Map r0 = r4.zzh     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto Lc
            goto L2f
        Lc:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.auth.zzce r2 = new com.google.android.gms.internal.auth.zzce     // Catch: java.lang.Throwable -> L1f java.lang.Throwable -> L21
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L1f java.lang.Throwable -> L21
            java.lang.Object r2 = com.google.android.gms.internal.auth.zzcj.zza(r2)     // Catch: java.lang.Throwable -> L1f java.lang.Throwable -> L21
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L1f java.lang.Throwable -> L21
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L35
            goto L2c
        L1f:
            r5 = move-exception
            goto L31
        L21:
            java.lang.String r2 = "ConfigurationContentLdr"
            java.lang.String r3 = "PhenotypeFlag unable to load ContentProvider, using default values"
            android.util.Log.e(r2, r3)     // Catch: java.lang.Throwable -> L1f
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L35
            r2 = 0
        L2c:
            r4.zzh = r2     // Catch: java.lang.Throwable -> L35
            r0 = r2
        L2f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            goto L38
        L31:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L35
            throw r5     // Catch: java.lang.Throwable -> L35
        L35:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            throw r5
        L38:
            if (r0 != 0) goto L3e
            java.util.Map r0 = java.util.Collections.emptyMap()
        L3e:
            java.lang.Object r5 = r0.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            return r5
    }

    final /* synthetic */ java.util.Map zzc() {
            r6 = this;
            android.content.ContentResolver r0 = r6.zzc
            android.net.Uri r1 = r6.zzd
            java.lang.String[] r2 = com.google.android.gms.internal.auth.zzcg.zza
            r3 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L14
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
        L14:
            int r1 = r0.getCount()     // Catch: java.lang.Throwable -> L4b
            if (r1 != 0) goto L22
            java.util.Map r1 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L4b
            r0.close()
            return r1
        L22:
            r2 = 256(0x100, float:3.59E-43)
            if (r1 > r2) goto L2c
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap     // Catch: java.lang.Throwable -> L4b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L4b
            goto L33
        L2c:
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L4b
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L4b
        L33:
            boolean r1 = r0.moveToNext()     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L47
            r1 = 0
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L4b
            r3 = 1
            java.lang.String r3 = r0.getString(r3)     // Catch: java.lang.Throwable -> L4b
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L4b
            goto L33
        L47:
            r0.close()
            return r2
        L4b:
            r1 = move-exception
            r0.close()
            throw r1
    }

    public final void zze() {
            r2 = this;
            java.lang.Object r0 = r2.zzg
            monitor-enter(r0)
            r1 = 0
            r2.zzh = r1     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.auth.zzdc.zzc()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            monitor-enter(r2)
            java.util.List r0 = r2.zzi     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L23
        L11:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.auth.zzch r1 = (com.google.android.gms.internal.auth.zzch) r1     // Catch: java.lang.Throwable -> L23
            r1.zza()     // Catch: java.lang.Throwable -> L23
            goto L11
        L21:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            throw r0
        L26:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r1
    }
}
