package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public interface AchievementsClient {
    com.google.android.gms.tasks.Task<android.content.Intent> getAchievementsIntent();

    void increment(java.lang.String r1, int r2);

    com.google.android.gms.tasks.Task<java.lang.Boolean> incrementImmediate(java.lang.String r1, int r2);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.achievement.AchievementBuffer>> load(boolean r1);

    void reveal(java.lang.String r1);

    com.google.android.gms.tasks.Task<java.lang.Void> revealImmediate(java.lang.String r1);

    void setSteps(java.lang.String r1, int r2);

    com.google.android.gms.tasks.Task<java.lang.Boolean> setStepsImmediate(java.lang.String r1, int r2);

    void unlock(java.lang.String r1);

    com.google.android.gms.tasks.Task<java.lang.Void> unlockImmediate(java.lang.String r1);
}
