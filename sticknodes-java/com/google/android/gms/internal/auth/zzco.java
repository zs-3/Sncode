package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzco implements com.google.android.gms.internal.auth.zzcl {
    private static com.google.android.gms.internal.auth.zzco zza;
    private final android.content.Context zzb;
    private final android.database.ContentObserver zzc;

    private zzco() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzb = r0
            r1.zzc = r0
            return
    }

    private zzco(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r3.zzb = r4
            com.google.android.gms.internal.auth.zzcn r0 = new com.google.android.gms.internal.auth.zzcn
            r1 = 0
            r0.<init>(r3, r1)
            r3.zzc = r0
            android.content.ContentResolver r4 = r4.getContentResolver()
            android.net.Uri r1 = com.google.android.gms.internal.auth.zzcb.zza
            r2 = 1
            r4.registerContentObserver(r1, r2, r0)
            return
    }

    static com.google.android.gms.internal.auth.zzco zza(android.content.Context r2) {
            java.lang.Class<com.google.android.gms.internal.auth.zzco> r0 = com.google.android.gms.internal.auth.zzco.class
            monitor-enter(r0)
            com.google.android.gms.internal.auth.zzco r1 = com.google.android.gms.internal.auth.zzco.zza     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L1c
            java.lang.String r1 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            int r1 = androidx.core.content.PermissionChecker.checkSelfPermission(r2, r1)     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L15
            com.google.android.gms.internal.auth.zzco r1 = new com.google.android.gms.internal.auth.zzco     // Catch: java.lang.Throwable -> L20
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L20
            goto L1a
        L15:
            com.google.android.gms.internal.auth.zzco r1 = new com.google.android.gms.internal.auth.zzco     // Catch: java.lang.Throwable -> L20
            r1.<init>()     // Catch: java.lang.Throwable -> L20
        L1a:
            com.google.android.gms.internal.auth.zzco.zza = r1     // Catch: java.lang.Throwable -> L20
        L1c:
            com.google.android.gms.internal.auth.zzco r2 = com.google.android.gms.internal.auth.zzco.zza     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r2
        L20:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r2
    }

    static synchronized void zze() {
            java.lang.Class<com.google.android.gms.internal.auth.zzco> r0 = com.google.android.gms.internal.auth.zzco.class
            monitor-enter(r0)
            com.google.android.gms.internal.auth.zzco r1 = com.google.android.gms.internal.auth.zzco.zza     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L1a
            android.content.Context r2 = r1.zzb     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L1a
            android.database.ContentObserver r1 = r1.zzc     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L1a
            android.content.ContentResolver r1 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.internal.auth.zzco r2 = com.google.android.gms.internal.auth.zzco.zza     // Catch: java.lang.Throwable -> L1f
            android.database.ContentObserver r2 = r2.zzc     // Catch: java.lang.Throwable -> L1f
            r1.unregisterContentObserver(r2)     // Catch: java.lang.Throwable -> L1f
        L1a:
            r1 = 0
            com.google.android.gms.internal.auth.zzco.zza = r1     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)
            return
        L1f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.zzc(r1)
            return r1
    }

    public final java.lang.String zzc(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.zzb
            r1 = 0
            if (r0 == 0) goto L2c
            boolean r0 = com.google.android.gms.internal.auth.zzcc.zza(r0)
            if (r0 == 0) goto Lc
            goto L2c
        Lc:
            com.google.android.gms.internal.auth.zzcm r0 = new com.google.android.gms.internal.auth.zzcm     // Catch: java.lang.NullPointerException -> L18 java.lang.SecurityException -> L1a java.lang.IllegalStateException -> L1c
            r0.<init>(r3, r4)     // Catch: java.lang.NullPointerException -> L18 java.lang.SecurityException -> L1a java.lang.IllegalStateException -> L1c
            java.lang.Object r0 = com.google.android.gms.internal.auth.zzcj.zza(r0)     // Catch: java.lang.NullPointerException -> L18 java.lang.SecurityException -> L1a java.lang.IllegalStateException -> L1c
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
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "Unable to read GServices for: "
            java.lang.String r4 = r2.concat(r4)
            java.lang.String r2 = "GservicesLoader"
            android.util.Log.e(r2, r4, r0)
        L2c:
            return r1
    }

    final /* synthetic */ java.lang.String zzd(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.zzb
            android.content.ContentResolver r0 = r0.getContentResolver()
            r1 = 0
            java.lang.String r3 = com.google.android.gms.internal.auth.zzcb.zza(r0, r3, r1)
            return r3
    }
}
