package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzar extends com.google.android.gms.games.internal.zza {
    final /* synthetic */ com.google.android.gms.games.internal.zzbz zza;
    private final com.google.android.gms.tasks.TaskCompletionSource zzb;

    zzar(com.google.android.gms.games.internal.zzbz r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzk(com.google.android.gms.common.data.DataHolder r7) {
            r6 = this;
            int r0 = r7.getStatusCode()
            r1 = 1
            r2 = 0
            r3 = 3
            if (r0 != r3) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r4 = 10003(0x2713, float:1.4017E-41)
            if (r0 != r4) goto L1b
            com.google.android.gms.games.internal.zzbz r0 = r6.zza
            com.google.android.gms.tasks.TaskCompletionSource r1 = r6.zzb
            com.google.android.gms.games.internal.zzbz.zzL(r0, r1)
            r7.close()
            return
        L1b:
            if (r0 == 0) goto L29
            if (r3 == 0) goto L20
            goto L29
        L20:
            com.google.android.gms.tasks.TaskCompletionSource r1 = r6.zzb
            com.google.android.gms.games.GamesStatusUtils.zza(r1, r0)
            r7.close()
            return
        L29:
            com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer r0 = new com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer
            r0.<init>(r7)
            int r7 = r0.getCount()     // Catch: java.lang.Throwable -> L4d
            if (r7 <= 0) goto L3e
            com.google.android.gms.games.leaderboard.LeaderboardScore r7 = r0.get(r2)     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.games.leaderboard.LeaderboardScoreEntity r4 = new com.google.android.gms.games.leaderboard.LeaderboardScoreEntity     // Catch: java.lang.Throwable -> L4d
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L4d
            goto L3f
        L3e:
            r4 = 0
        L3f:
            r0.close()
            com.google.android.gms.tasks.TaskCompletionSource r7 = r6.zzb
            com.google.android.gms.games.AnnotatedData r0 = new com.google.android.gms.games.AnnotatedData
            r0.<init>(r4, r3)
            r7.setResult(r0)
            return
        L4d:
            r7 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L52
            goto L68
        L52:
            r0 = move-exception
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L68
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r3[r2] = r4     // Catch: java.lang.Exception -> L68
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r5, r3)     // Catch: java.lang.Exception -> L68
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L68
            r1[r2] = r0     // Catch: java.lang.Exception -> L68
            r3.invoke(r7, r1)     // Catch: java.lang.Exception -> L68
        L68:
            throw r7
    }
}
