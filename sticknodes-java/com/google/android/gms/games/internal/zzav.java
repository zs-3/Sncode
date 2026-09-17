package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzav extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzav(com.google.android.gms.tasks.TaskCompletionSource r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzj(com.google.android.gms.common.data.DataHolder r5) {
            r4 = this;
            int r0 = r5.getStatusCode()
            r1 = 3
            if (r0 != r1) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            if (r0 == 0) goto L17
            if (r1 != 0) goto L17
            com.google.android.gms.tasks.TaskCompletionSource r1 = r4.zza
            com.google.android.gms.games.GamesStatusUtils.zza(r1, r0)
            r5.close()
            return
        L17:
            com.google.android.gms.tasks.TaskCompletionSource r0 = r4.zza
            com.google.android.gms.games.AnnotatedData r2 = new com.google.android.gms.games.AnnotatedData
            com.google.android.gms.games.leaderboard.LeaderboardBuffer r3 = new com.google.android.gms.games.leaderboard.LeaderboardBuffer
            r3.<init>(r5)
            r2.<init>(r3, r1)
            r0.setResult(r2)
            return
    }
}
