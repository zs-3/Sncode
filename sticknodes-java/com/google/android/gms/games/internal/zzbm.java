package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbm extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzbm(com.google.android.gms.tasks.TaskCompletionSource r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzl(com.google.android.gms.common.data.DataHolder r7) {
            r6 = this;
            int r0 = r7.getStatusCode()
            r1 = 3
            if (r0 == 0) goto L13
            if (r0 != r1) goto La
            goto L13
        La:
            com.google.android.gms.tasks.TaskCompletionSource r1 = r6.zza
            com.google.android.gms.games.GamesStatusUtils.zza(r1, r0)
            r7.close()
            return
        L13:
            com.google.android.gms.games.stats.PlayerStatsBuffer r2 = new com.google.android.gms.games.stats.PlayerStatsBuffer
            r2.<init>(r7)
            r7 = 1
            r3 = 0
            int r4 = r2.getCount()     // Catch: java.lang.Throwable -> L3d
            if (r4 <= 0) goto L2a
            com.google.android.gms.games.stats.PlayerStats r4 = r2.zza(r3)     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.games.stats.PlayerStatsEntity r5 = new com.google.android.gms.games.stats.PlayerStatsEntity     // Catch: java.lang.Throwable -> L3d
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L3d
            goto L2b
        L2a:
            r5 = 0
        L2b:
            r2.close()
            if (r0 != r1) goto L31
            goto L32
        L31:
            r7 = 0
        L32:
            com.google.android.gms.tasks.TaskCompletionSource r0 = r6.zza
            com.google.android.gms.games.AnnotatedData r1 = new com.google.android.gms.games.AnnotatedData
            r1.<init>(r5, r7)
            r0.setResult(r1)
            return
        L3d:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L42
            goto L58
        L42:
            r1 = move-exception
            java.lang.Class[] r2 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L58
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r2[r3] = r4     // Catch: java.lang.Exception -> L58
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r2 = r4.getDeclaredMethod(r5, r2)     // Catch: java.lang.Exception -> L58
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L58
            r7[r3] = r1     // Catch: java.lang.Exception -> L58
            r2.invoke(r0, r7)     // Catch: java.lang.Exception -> L58
        L58:
            throw r0
    }
}
