package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzac implements com.google.android.gms.games.achievement.Achievements {
    public zzac() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.games.achievement.Achievements
    public final android.content.Intent getAchievementsIntent(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            r0 = 1
            com.google.android.gms.games.internal.zzbz r2 = com.google.android.gms.games.Games.zzd(r2, r0)
            android.content.Intent r2 = r2.zzt()
            return r2
    }

    @Override // com.google.android.gms.games.achievement.Achievements
    public final void increment(com.google.android.gms.common.api.GoogleApiClient r8, java.lang.String r9, int r10) {
            r7 = this;
            com.google.android.gms.internal.games.zzu r6 = new com.google.android.gms.internal.games.zzu
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r8.execute(r6)
            return
    }

    @Override // com.google.android.gms.games.achievement.Achievements
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult> incrementImmediate(com.google.android.gms.common.api.GoogleApiClient r8, java.lang.String r9, int r10) {
            r7 = this;
            com.google.android.gms.internal.games.zzv r6 = new com.google.android.gms.internal.games.zzv
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r8 = r8.execute(r6)
            return r8
    }

    @Override // com.google.android.gms.games.achievement.Achievements
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult> load(com.google.android.gms.common.api.GoogleApiClient r2, boolean r3) {
            r1 = this;
            com.google.android.gms.internal.games.zzp r0 = new com.google.android.gms.internal.games.zzp
            r0.<init>(r1, r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }

    @Override // com.google.android.gms.games.achievement.Achievements
    public final void reveal(com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.internal.games.zzq r0 = new com.google.android.gms.internal.games.zzq
            r0.<init>(r1, r3, r2, r3)
            r2.execute(r0)
            return
    }

    @Override // com.google.android.gms.games.achievement.Achievements
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult> revealImmediate(com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.internal.games.zzr r0 = new com.google.android.gms.internal.games.zzr
            r0.<init>(r1, r3, r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.execute(r0)
            return r2
    }

    @Override // com.google.android.gms.games.achievement.Achievements
    public final void setSteps(com.google.android.gms.common.api.GoogleApiClient r8, java.lang.String r9, int r10) {
            r7 = this;
            com.google.android.gms.internal.games.zzw r6 = new com.google.android.gms.internal.games.zzw
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r8.execute(r6)
            return
    }

    @Override // com.google.android.gms.games.achievement.Achievements
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult> setStepsImmediate(com.google.android.gms.common.api.GoogleApiClient r8, java.lang.String r9, int r10) {
            r7 = this;
            com.google.android.gms.internal.games.zzo r6 = new com.google.android.gms.internal.games.zzo
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r8 = r8.execute(r6)
            return r8
    }

    @Override // com.google.android.gms.games.achievement.Achievements
    public final void unlock(com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.internal.games.zzs r0 = new com.google.android.gms.internal.games.zzs
            r0.<init>(r1, r3, r2, r3)
            r2.execute(r0)
            return
    }

    @Override // com.google.android.gms.games.achievement.Achievements
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult> unlockImmediate(com.google.android.gms.common.api.GoogleApiClient r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.internal.games.zzt r0 = new com.google.android.gms.internal.games.zzt
            r0.<init>(r1, r3, r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.execute(r0)
            return r2
    }
}
