package com.google.android.gms.internal.appset;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public final class zzl implements com.google.android.gms.appset.AppSetIdClient {
    private static com.google.android.gms.appset.AppSetIdClient zza;
    private final android.content.Context zzb;
    private boolean zzc;
    private final java.util.concurrent.ScheduledExecutorService zzd;
    private final java.util.concurrent.ExecutorService zze;

    static {
            return
    }

    zzl(android.content.Context r9) {
            r8 = this;
            r8.<init>()
            r0 = 0
            r8.zzc = r0
            java.util.concurrent.ScheduledExecutorService r1 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            r8.zzd = r1
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r8.zze = r0
            r8.zzb = r9
            boolean r9 = r8.zzc
            if (r9 != 0) goto L2b
            com.google.android.gms.internal.appset.zzj r2 = new com.google.android.gms.internal.appset.zzj
            r9 = 0
            r2.<init>(r8, r9)
            r3 = 0
            r5 = 86400(0x15180, double:4.26873E-319)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r1.scheduleAtFixedRate(r2, r3, r5, r7)
            r9 = 1
            r8.zzc = r9
        L2b:
            return
    }

    static /* bridge */ /* synthetic */ android.content.Context zzb(com.google.android.gms.internal.appset.zzl r0) {
            android.content.Context r0 = r0.zzb
            return r0
    }

    static synchronized com.google.android.gms.appset.AppSetIdClient zzc(android.content.Context r2) {
            java.lang.Class<com.google.android.gms.internal.appset.zzl> r0 = com.google.android.gms.internal.appset.zzl.class
            monitor-enter(r0)
            java.lang.String r1 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r1)     // Catch: java.lang.Throwable -> L1b
            com.google.android.gms.appset.AppSetIdClient r1 = com.google.android.gms.internal.appset.zzl.zza     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L17
            com.google.android.gms.internal.appset.zzl r1 = new com.google.android.gms.internal.appset.zzl     // Catch: java.lang.Throwable -> L1b
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            com.google.android.gms.internal.appset.zzl.zza = r1     // Catch: java.lang.Throwable -> L1b
        L17:
            com.google.android.gms.appset.AppSetIdClient r2 = com.google.android.gms.internal.appset.zzl.zza     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return r2
        L1b:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    protected static final void zze(android.content.Context r4) {
            android.content.SharedPreferences r0 = zzf(r4)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "app_set_id"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            boolean r0 = r0.commit()
            java.lang.String r1 = "AppSet"
            if (r0 != 0) goto L33
            java.lang.String r0 = r4.getPackageName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Failed to clear app set ID generated for App "
            int r3 = r0.length()
            if (r3 == 0) goto L2b
            java.lang.String r0 = r2.concat(r0)
            goto L30
        L2b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L30:
            android.util.Log.e(r1, r0)
        L33:
            android.content.SharedPreferences r0 = zzf(r4)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "app_set_id_last_used_time"
            android.content.SharedPreferences$Editor r0 = r0.remove(r2)
            boolean r0 = r0.commit()
            if (r0 != 0) goto L64
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Failed to clear app set ID last used time for App "
            int r2 = r4.length()
            if (r2 == 0) goto L5c
            java.lang.String r4 = r0.concat(r4)
            goto L61
        L5c:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L61:
            android.util.Log.e(r1, r4)
        L64:
            return
    }

    private static final android.content.SharedPreferences zzf(android.content.Context r2) {
            java.lang.String r0 = "app_set_id_storage"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    private static final void zzg(android.content.Context r4) throws com.google.android.gms.internal.appset.zzk {
            android.content.SharedPreferences r0 = zzf(r4)
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.common.util.DefaultClock.getInstance()
            long r1 = r1.currentTimeMillis()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = "app_set_id_last_used_time"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r3, r1)
            boolean r0 = r0.commit()
            if (r0 != 0) goto L43
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Failed to store app set ID last used time for App "
            int r1 = r4.length()
            if (r1 == 0) goto L31
            java.lang.String r4 = r0.concat(r4)
            goto L36
        L31:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L36:
            java.lang.String r0 = "AppSet"
            android.util.Log.e(r0, r4)
            com.google.android.gms.internal.appset.zzk r4 = new com.google.android.gms.internal.appset.zzk
            java.lang.String r0 = "Failed to store the app set ID last used time."
            r4.<init>(r0)
            throw r4
        L43:
            return
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.appset.AppSetIdInfo> getAppSetIdInfo() {
            r3 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            java.util.concurrent.ExecutorService r1 = r3.zze
            com.google.android.gms.internal.appset.zzh r2 = new com.google.android.gms.internal.appset.zzh
            r2.<init>(r3, r0)
            r1.execute(r2)
            com.google.android.gms.tasks.Task r0 = r0.getTask()
            return r0
    }

    protected final long zza() {
            r5 = this;
            android.content.Context r0 = r5.zzb
            android.content.SharedPreferences r0 = zzf(r0)
            java.lang.String r1 = "app_set_id_last_used_time"
            r2 = -1
            long r0 = r0.getLong(r1, r2)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L19
            r2 = 33696000000(0x7d8702800, double:1.66480360023E-313)
            long r0 = r0 + r2
            return r0
        L19:
            return r2
    }

    final /* synthetic */ void zzd(com.google.android.gms.tasks.TaskCompletionSource r8) {
            r7 = this;
            android.content.Context r0 = r7.zzb
            android.content.SharedPreferences r0 = zzf(r0)
            java.lang.String r1 = "app_set_id"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            long r2 = r7.zza()
            if (r0 == 0) goto L2c
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.common.util.DefaultClock.getInstance()
            long r4 = r4.currentTimeMillis()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L20
            goto L2c
        L20:
            android.content.Context r1 = r7.zzb     // Catch: com.google.android.gms.internal.appset.zzk -> L27
            zzg(r1)     // Catch: com.google.android.gms.internal.appset.zzk -> L27
            goto Lb7
        L27:
            r0 = move-exception
            r8.setException(r0)
            return
        L2c:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            android.content.Context r2 = r7.zzb     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            android.content.SharedPreferences r3 = zzf(r2)     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            android.content.SharedPreferences$Editor r1 = r3.putString(r1, r0)     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            boolean r1 = r1.commit()     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            java.lang.String r3 = "AppSet"
            if (r1 != 0) goto L70
            java.lang.String r0 = "Failed to store app set ID generated for App "
            java.lang.String r1 = r2.getPackageName()     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            int r2 = r1.length()     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            if (r2 == 0) goto L5f
            java.lang.String r0 = r0.concat(r1)     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            goto L65
        L5f:
            java.lang.String r1 = new java.lang.String     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            r1.<init>(r0)     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            r0 = r1
        L65:
            android.util.Log.e(r3, r0)     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            com.google.android.gms.internal.appset.zzk r0 = new com.google.android.gms.internal.appset.zzk     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            java.lang.String r1 = "Failed to store the app set ID."
            r0.<init>(r1)     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            throw r0     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
        L70:
            zzg(r2)     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            android.content.Context r1 = r7.zzb     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            android.content.SharedPreferences r2 = zzf(r1)     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.common.util.DefaultClock.getInstance()     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            long r4 = r4.currentTimeMillis()     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            java.lang.String r6 = "app_set_id_creation_time"
            android.content.SharedPreferences$Editor r2 = r2.putLong(r6, r4)     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            boolean r2 = r2.commit()     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            if (r2 != 0) goto Lb7
            java.lang.String r0 = "Failed to store app set ID creation time for App "
            java.lang.String r1 = r1.getPackageName()     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            int r2 = r1.length()     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            if (r2 == 0) goto La6
            java.lang.String r0 = r0.concat(r1)     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            goto Lac
        La6:
            java.lang.String r1 = new java.lang.String     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            r1.<init>(r0)     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            r0 = r1
        Lac:
            android.util.Log.e(r3, r0)     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            com.google.android.gms.internal.appset.zzk r0 = new com.google.android.gms.internal.appset.zzk     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            java.lang.String r1 = "Failed to store the app set ID creation time."
            r0.<init>(r1)     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
            throw r0     // Catch: com.google.android.gms.internal.appset.zzk -> Lc1
        Lb7:
            com.google.android.gms.appset.AppSetIdInfo r1 = new com.google.android.gms.appset.AppSetIdInfo
            r2 = 1
            r1.<init>(r0, r2)
            r8.setResult(r1)
            return
        Lc1:
            r0 = move-exception
            r8.setException(r0)
            return
    }
}
