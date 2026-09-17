package com.google.android.gms.games.achievement;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.common.util.VisibleForTesting
@com.google.android.gms.internal.games.zzfp
@java.lang.Deprecated
/* loaded from: classes.dex */
public interface Achievements {

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public interface LoadAchievementsResult extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Releasable {
        @com.google.android.gms.internal.games.zzfp
        com.google.android.gms.games.achievement.AchievementBuffer getAchievements();
    }

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public interface UpdateAchievementResult extends com.google.android.gms.common.api.Result {
        @com.google.android.gms.internal.games.zzfp
        java.lang.String getAchievementId();
    }

    @com.google.android.gms.internal.games.zzfp
    android.content.Intent getAchievementsIntent(com.google.android.gms.common.api.GoogleApiClient r1);

    @com.google.android.gms.internal.games.zzfp
    void increment(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, int r3);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult> incrementImmediate(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, int r3);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult> load(com.google.android.gms.common.api.GoogleApiClient r1, boolean r2);

    @com.google.android.gms.internal.games.zzfp
    void reveal(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult> revealImmediate(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2);

    @com.google.android.gms.internal.games.zzfp
    void setSteps(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, int r3);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult> setStepsImmediate(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2, int r3);

    @com.google.android.gms.internal.games.zzfp
    void unlock(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult> unlockImmediate(com.google.android.gms.common.api.GoogleApiClient r1, java.lang.String r2);
}
