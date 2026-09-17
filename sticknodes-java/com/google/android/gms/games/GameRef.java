package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class GameRef extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.games.Game {
    public GameRef(com.google.android.gms.common.data.DataHolder r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.games.Game
    public final boolean areSnapshotsEnabled() {
            r1 = this;
            java.lang.String r0 = "snapshots_enabled"
            int r0 = r1.getInteger(r0)
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.android.gms.games.GameEntity.zzm(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.Game freeze() {
            r1 = this;
            com.google.android.gms.games.GameEntity r0 = new com.google.android.gms.games.GameEntity
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final int getAchievementTotalCount() {
            r1 = this;
            java.lang.String r0 = "achievement_total_count"
            int r0 = r1.getInteger(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final java.lang.String getApplicationId() {
            r1 = this;
            java.lang.String r0 = "external_game_id"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = "game_description"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final void getDescription(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = "game_description"
            r1.copyToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.Game
    public final java.lang.String getDeveloperName() {
            r1 = this;
            java.lang.String r0 = "developer_name"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final void getDeveloperName(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = "developer_name"
            r1.copyToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.Game
    public final java.lang.String getDisplayName() {
            r1 = this;
            java.lang.String r0 = "display_name"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final void getDisplayName(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = "display_name"
            r1.copyToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.Game
    public final android.net.Uri getFeaturedImageUri() {
            r1 = this;
            java.lang.String r0 = "featured_image_uri"
            android.net.Uri r0 = r1.parseUri(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getFeaturedImageUrl() {
            r1 = this;
            java.lang.String r0 = "featured_image_url"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final android.net.Uri getHiResImageUri() {
            r1 = this;
            java.lang.String r0 = "game_hi_res_image_uri"
            android.net.Uri r0 = r1.parseUri(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getHiResImageUrl() {
            r1 = this;
            java.lang.String r0 = "game_hi_res_image_url"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final android.net.Uri getIconImageUri() {
            r1 = this;
            java.lang.String r0 = "game_icon_image_uri"
            android.net.Uri r0 = r1.parseUri(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getIconImageUrl() {
            r1 = this;
            java.lang.String r0 = "game_icon_image_url"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final int getLeaderboardCount() {
            r1 = this;
            java.lang.String r0 = "leaderboard_count"
            int r0 = r1.getInteger(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final java.lang.String getPrimaryCategory() {
            r1 = this;
            java.lang.String r0 = "primary_category"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final java.lang.String getSecondaryCategory() {
            r1 = this;
            java.lang.String r0 = "secondary_category"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final java.lang.String getThemeColor() {
            r1 = this;
            java.lang.String r0 = "theme_color"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final boolean hasGamepadSupport() {
            r1 = this;
            java.lang.String r0 = "gamepad_support"
            int r0 = r1.getInteger(r0)
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
            r1 = this;
            int r0 = com.google.android.gms.games.GameEntity.zzh(r1)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = com.google.android.gms.games.GameEntity.zzj(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            com.google.android.gms.games.GameEntity r0 = new com.google.android.gms.games.GameEntity
            r0.<init>(r1)
            r0.writeToParcel(r2, r3)
            return
    }

    @Override // com.google.android.gms.games.Game
    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = "package_name"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzb() {
            r1 = this;
            java.lang.String r0 = "identity_sharing_confirmed"
            boolean r0 = r1.getBoolean(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzc() {
            r1 = this;
            java.lang.String r0 = "installed"
            int r0 = r1.getInteger(r0)
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzd() {
            r1 = this;
            java.lang.String r0 = "muted"
            boolean r0 = r1.getBoolean(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zze() {
            r1 = this;
            java.lang.String r0 = "play_enabled_game"
            boolean r0 = r1.getBoolean(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzf() {
            r1 = this;
            java.lang.String r0 = "real_time_support"
            int r0 = r1.getInteger(r0)
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzg() {
            r1 = this;
            java.lang.String r0 = "turn_based_support"
            int r0 = r1.getInteger(r0)
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
