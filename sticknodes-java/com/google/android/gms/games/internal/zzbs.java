package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbs extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzbs(com.google.android.gms.tasks.TaskCompletionSource r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzn(com.google.android.gms.common.data.DataHolder r3) {
            r2 = this;
            int r0 = r3.getStatusCode()
            if (r0 == 0) goto L13
            r1 = 5
            if (r0 != r1) goto La
            goto L13
        La:
            com.google.android.gms.tasks.TaskCompletionSource r1 = r2.zza
            com.google.android.gms.games.GamesStatusUtils.zza(r1, r0)
            r3.close()
            return
        L13:
            com.google.android.gms.tasks.TaskCompletionSource r0 = r2.zza     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.games.leaderboard.ScoreSubmissionData r1 = new com.google.android.gms.games.leaderboard.ScoreSubmissionData     // Catch: java.lang.Throwable -> L21
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L21
            r0.setResult(r1)     // Catch: java.lang.Throwable -> L21
            r3.close()
            return
        L21:
            r0 = move-exception
            r3.close()
            throw r0
    }
}
