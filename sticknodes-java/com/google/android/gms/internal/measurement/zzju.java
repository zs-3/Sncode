package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzju implements com.google.android.gms.internal.measurement.zzjr {
    private static com.google.android.gms.internal.measurement.zzju zza;
    private final android.content.Context zzb;
    private final android.database.ContentObserver zzc;
    private boolean zzd;

    private zzju() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzd = r0
            r0 = 0
            r1.zzb = r0
            r1.zzc = r0
            return
    }

    private zzju(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzd = r0
            r1.zzb = r2
            com.google.android.gms.internal.measurement.zzjt r2 = new com.google.android.gms.internal.measurement.zzjt
            r0 = 0
            r2.<init>(r1, r0)
            r1.zzc = r2
            return
    }

    static com.google.android.gms.internal.measurement.zzju zza(android.content.Context r4) {
            java.lang.Class<com.google.android.gms.internal.measurement.zzju> r0 = com.google.android.gms.internal.measurement.zzju.class
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzju r1 = com.google.android.gms.internal.measurement.zzju.zza     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L1c
            java.lang.String r1 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            int r1 = androidx.core.content.PermissionChecker.checkSelfPermission(r4, r1)     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L15
            com.google.android.gms.internal.measurement.zzju r1 = new com.google.android.gms.internal.measurement.zzju     // Catch: java.lang.Throwable -> L53
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L53
            goto L1a
        L15:
            com.google.android.gms.internal.measurement.zzju r1 = new com.google.android.gms.internal.measurement.zzju     // Catch: java.lang.Throwable -> L53
            r1.<init>()     // Catch: java.lang.Throwable -> L53
        L1a:
            com.google.android.gms.internal.measurement.zzju.zza = r1     // Catch: java.lang.Throwable -> L53
        L1c:
            com.google.android.gms.internal.measurement.zzju r1 = com.google.android.gms.internal.measurement.zzju.zza     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L49
            android.database.ContentObserver r2 = r1.zzc     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L49
            boolean r1 = r1.zzd     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L49
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.SecurityException -> L41 java.lang.Throwable -> L53
            android.net.Uri r1 = com.google.android.gms.internal.measurement.zzjc.zza     // Catch: java.lang.SecurityException -> L41 java.lang.Throwable -> L53
            com.google.android.gms.internal.measurement.zzju r2 = com.google.android.gms.internal.measurement.zzju.zza     // Catch: java.lang.SecurityException -> L41 java.lang.Throwable -> L53
            android.database.ContentObserver r2 = r2.zzc     // Catch: java.lang.SecurityException -> L41 java.lang.Throwable -> L53
            r3 = 1
            r4.registerContentObserver(r1, r3, r2)     // Catch: java.lang.SecurityException -> L41 java.lang.Throwable -> L53
            com.google.android.gms.internal.measurement.zzju r4 = com.google.android.gms.internal.measurement.zzju.zza     // Catch: java.lang.SecurityException -> L41 java.lang.Throwable -> L53
            java.lang.Object r4 = com.google.common.base.Preconditions.checkNotNull(r4)     // Catch: java.lang.SecurityException -> L41 java.lang.Throwable -> L53
            com.google.android.gms.internal.measurement.zzju r4 = (com.google.android.gms.internal.measurement.zzju) r4     // Catch: java.lang.SecurityException -> L41 java.lang.Throwable -> L53
            r4.zzd = r3     // Catch: java.lang.SecurityException -> L41 java.lang.Throwable -> L53
            goto L49
        L41:
            r4 = move-exception
            java.lang.String r1 = "GservicesLoader"
            java.lang.String r2 = "Unable to register Gservices content observer"
            android.util.Log.e(r1, r2, r4)     // Catch: java.lang.Throwable -> L53
        L49:
            com.google.android.gms.internal.measurement.zzju r4 = com.google.android.gms.internal.measurement.zzju.zza     // Catch: java.lang.Throwable -> L53
            java.lang.Object r4 = com.google.common.base.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.internal.measurement.zzju r4 = (com.google.android.gms.internal.measurement.zzju) r4     // Catch: java.lang.Throwable -> L53
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            return r4
        L53:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            throw r4
    }

    public static /* synthetic */ java.lang.String zzc(com.google.android.gms.internal.measurement.zzju r1, java.lang.String r2) {
            android.content.Context r1 = r1.zzb
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            android.content.Context r1 = (android.content.Context) r1
            android.content.ContentResolver r1 = r1.getContentResolver()
            r0 = 0
            java.lang.String r1 = com.google.android.gms.internal.measurement.zzjb.zza(r1, r2, r0)
            return r1
    }

    static synchronized void zze() {
            java.lang.Class<com.google.android.gms.internal.measurement.zzju> r0 = com.google.android.gms.internal.measurement.zzju.class
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzju r1 = com.google.android.gms.internal.measurement.zzju.zza     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L1e
            android.content.Context r2 = r1.zzb     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L1e
            android.database.ContentObserver r3 = r1.zzc     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L1e
            boolean r1 = r1.zzd     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L1e
            android.content.ContentResolver r1 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.measurement.zzju r2 = com.google.android.gms.internal.measurement.zzju.zza     // Catch: java.lang.Throwable -> L23
            android.database.ContentObserver r2 = r2.zzc     // Catch: java.lang.Throwable -> L23
            r1.unregisterContentObserver(r2)     // Catch: java.lang.Throwable -> L23
        L1e:
            r1 = 0
            com.google.android.gms.internal.measurement.zzju.zza = r1     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)
            return
        L23:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzjr
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.zzd(r1)
            return r1
    }

    public final java.lang.String zzd(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.zzb
            r1 = 0
            if (r0 == 0) goto L28
            boolean r0 = com.google.android.gms.internal.measurement.zzji.zza(r0)
            if (r0 == 0) goto Lc
            goto L28
        Lc:
            com.google.android.gms.internal.measurement.zzjs r0 = new com.google.android.gms.internal.measurement.zzjs     // Catch: java.lang.NullPointerException -> L18 java.lang.SecurityException -> L1a java.lang.IllegalStateException -> L1c
            r0.<init>(r3, r4)     // Catch: java.lang.NullPointerException -> L18 java.lang.SecurityException -> L1a java.lang.IllegalStateException -> L1c
            java.lang.Object r0 = com.google.android.gms.internal.measurement.zzjp.zza(r0)     // Catch: java.lang.NullPointerException -> L18 java.lang.SecurityException -> L1a java.lang.IllegalStateException -> L1c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NullPointerException -> L18 java.lang.SecurityException -> L1a java.lang.IllegalStateException -> L1c
            return r0
        L18:
            r0 = move-exception
            goto L1d
        L1a:
            r0 = move-exception
            goto L1d
        L1c:
            r0 = move-exception
        L1d:
            java.lang.String r2 = "Unable to read GServices for: "
            java.lang.String r4 = r2.concat(r4)
            java.lang.String r2 = "GservicesLoader"
            android.util.Log.e(r2, r4, r0)
        L28:
            return r1
    }
}
