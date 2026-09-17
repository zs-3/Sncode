package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public interface Game extends com.google.android.gms.common.data.Freezable<com.google.android.gms.games.Game>, android.os.Parcelable {
    boolean areSnapshotsEnabled();

    int getAchievementTotalCount();

    java.lang.String getApplicationId();

    java.lang.String getDescription();

    void getDescription(android.database.CharArrayBuffer r1);

    java.lang.String getDeveloperName();

    void getDeveloperName(android.database.CharArrayBuffer r1);

    java.lang.String getDisplayName();

    void getDisplayName(android.database.CharArrayBuffer r1);

    android.net.Uri getFeaturedImageUri();

    @com.google.android.gms.common.annotation.KeepName
    @java.lang.Deprecated
    java.lang.String getFeaturedImageUrl();

    android.net.Uri getHiResImageUri();

    @com.google.android.gms.common.annotation.KeepName
    @java.lang.Deprecated
    java.lang.String getHiResImageUrl();

    android.net.Uri getIconImageUri();

    @com.google.android.gms.common.annotation.KeepName
    @java.lang.Deprecated
    java.lang.String getIconImageUrl();

    int getLeaderboardCount();

    java.lang.String getPrimaryCategory();

    java.lang.String getSecondaryCategory();

    java.lang.String getThemeColor();

    boolean hasGamepadSupport();

    java.lang.String zza();

    boolean zzb();

    boolean zzc();

    boolean zzd();

    boolean zze();

    @java.lang.Deprecated
    boolean zzf();

    @java.lang.Deprecated
    boolean zzg();
}
