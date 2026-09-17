package com.google.android.gms.games.achievement;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.common.util.VisibleForTesting
/* loaded from: classes.dex */
public interface Achievement extends com.google.android.gms.common.data.Freezable<com.google.android.gms.games.achievement.Achievement>, android.os.Parcelable {
    public static final int STATE_HIDDEN = 2;
    public static final int STATE_REVEALED = 1;
    public static final int STATE_UNLOCKED = 0;
    public static final int TYPE_INCREMENTAL = 1;
    public static final int TYPE_STANDARD = 0;

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AchievementState {
    }

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AchievementType {
    }

    java.lang.String getAchievementId();

    int getCurrentSteps();

    java.lang.String getDescription();

    void getDescription(android.database.CharArrayBuffer r1);

    java.lang.String getFormattedCurrentSteps();

    void getFormattedCurrentSteps(android.database.CharArrayBuffer r1);

    java.lang.String getFormattedTotalSteps();

    void getFormattedTotalSteps(android.database.CharArrayBuffer r1);

    long getLastUpdatedTimestamp();

    java.lang.String getName();

    void getName(android.database.CharArrayBuffer r1);

    com.google.android.gms.games.Player getPlayer();

    android.net.Uri getRevealedImageUri();

    @com.google.android.gms.common.annotation.KeepName
    @java.lang.Deprecated
    java.lang.String getRevealedImageUrl();

    int getState();

    int getTotalSteps();

    int getType();

    android.net.Uri getUnlockedImageUri();

    @com.google.android.gms.common.annotation.KeepName
    @java.lang.Deprecated
    java.lang.String getUnlockedImageUrl();

    long getXpValue();

    float zza();

    com.google.android.gms.games.Player zzb();

    java.lang.String zzc();
}
