package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzac extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzac(com.google.android.gms.tasks.TaskCompletionSource r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzc(com.google.android.gms.common.data.DataHolder r4) {
            r3 = this;
            int r0 = r4.getStatusCode()
            r1 = 3
            if (r0 == 0) goto L13
            if (r0 != r1) goto La
            goto L13
        La:
            com.google.android.gms.tasks.TaskCompletionSource r1 = r3.zza
            com.google.android.gms.games.GamesStatusUtils.zza(r1, r0)
            r4.close()
            return
        L13:
            com.google.android.gms.games.achievement.AchievementBuffer r2 = new com.google.android.gms.games.achievement.AchievementBuffer
            r2.<init>(r4)
            if (r0 != r1) goto L1c
            r4 = 1
            goto L1d
        L1c:
            r4 = 0
        L1d:
            com.google.android.gms.tasks.TaskCompletionSource r0 = r3.zza
            com.google.android.gms.games.AnnotatedData r1 = new com.google.android.gms.games.AnnotatedData
            r1.<init>(r2, r4)
            r0.setResult(r1)
            return
    }
}
