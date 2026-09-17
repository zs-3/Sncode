package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzat extends com.google.android.gms.games.internal.zza {
    final /* synthetic */ com.google.android.gms.games.internal.zzbz zza;
    private final com.google.android.gms.tasks.TaskCompletionSource zzb;

    zzat(com.google.android.gms.games.internal.zzbz r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzi(com.google.android.gms.common.data.DataHolder r6, com.google.android.gms.common.data.DataHolder r7) {
            r5 = this;
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
            if (r0 != r4) goto L1e
            com.google.android.gms.games.internal.zzbz r0 = r5.zza
            com.google.android.gms.tasks.TaskCompletionSource r1 = r5.zzb
            com.google.android.gms.games.internal.zzbz.zzL(r0, r1)
            r6.close()
            r7.close()
            return
        L1e:
            if (r0 == 0) goto L2f
            if (r3 == 0) goto L23
            goto L2f
        L23:
            com.google.android.gms.tasks.TaskCompletionSource r1 = r5.zzb
            com.google.android.gms.games.GamesStatusUtils.zza(r1, r0)
            r6.close()
            r7.close()
            return
        L2f:
            com.google.android.gms.games.leaderboard.LeaderboardBuffer r0 = new com.google.android.gms.games.leaderboard.LeaderboardBuffer
            r0.<init>(r6)
            int r6 = r0.getCount()     // Catch: java.lang.Throwable -> L5e
            if (r6 <= 0) goto L45
            java.lang.Object r6 = r0.get(r2)     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.games.leaderboard.Leaderboard r6 = (com.google.android.gms.games.leaderboard.Leaderboard) r6     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = r6.freeze()     // Catch: java.lang.Throwable -> L5e
            goto L46
        L45:
            r6 = 0
        L46:
            r0.close()
            com.google.android.gms.tasks.TaskCompletionSource r0 = r5.zzb
            com.google.android.gms.games.AnnotatedData r1 = new com.google.android.gms.games.AnnotatedData
            com.google.android.gms.games.LeaderboardsClient$LeaderboardScores r2 = new com.google.android.gms.games.LeaderboardsClient$LeaderboardScores
            com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer r4 = new com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer
            r4.<init>(r7)
            r2.<init>(r6, r4)
            r1.<init>(r2, r3)
            r0.setResult(r1)
            return
        L5e:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L63
            goto L79
        L63:
            r7 = move-exception
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L79
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r0[r2] = r3     // Catch: java.lang.Exception -> L79
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r4 = "addSuppressed"
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r4, r0)     // Catch: java.lang.Exception -> L79
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L79
            r1[r2] = r7     // Catch: java.lang.Exception -> L79
            r0.invoke(r6, r1)     // Catch: java.lang.Exception -> L79
        L79:
            throw r6
    }
}
