package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzap extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzap(com.google.android.gms.tasks.TaskCompletionSource r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzj(com.google.android.gms.common.data.DataHolder r7) {
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
            if (r0 == 0) goto L1a
            if (r3 == 0) goto L11
            goto L1a
        L11:
            com.google.android.gms.tasks.TaskCompletionSource r1 = r6.zza
            com.google.android.gms.games.GamesStatusUtils.zza(r1, r0)
            r7.close()
            return
        L1a:
            com.google.android.gms.games.leaderboard.LeaderboardBuffer r0 = new com.google.android.gms.games.leaderboard.LeaderboardBuffer
            r0.<init>(r7)
            int r7 = r0.getCount()     // Catch: java.lang.Throwable -> L3f
            if (r7 <= 0) goto L30
            java.lang.Object r7 = r0.get(r2)     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.games.leaderboard.Leaderboard r7 = (com.google.android.gms.games.leaderboard.Leaderboard) r7     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r7 = r7.freeze()     // Catch: java.lang.Throwable -> L3f
            goto L31
        L30:
            r7 = 0
        L31:
            r0.close()
            com.google.android.gms.tasks.TaskCompletionSource r0 = r6.zza
            com.google.android.gms.games.AnnotatedData r1 = new com.google.android.gms.games.AnnotatedData
            r1.<init>(r7, r3)
            r0.setResult(r1)
            return
        L3f:
            r7 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L44
            goto L5a
        L44:
            r0 = move-exception
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L5a
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r3[r2] = r4     // Catch: java.lang.Exception -> L5a
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r5, r3)     // Catch: java.lang.Exception -> L5a
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L5a
            r1[r2] = r0     // Catch: java.lang.Exception -> L5a
            r3.invoke(r7, r1)     // Catch: java.lang.Exception -> L5a
        L5a:
            throw r7
    }
}
