package com.google.android.gms.games.achievement;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class AchievementRef extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.games.achievement.Achievement {
    AchievementRef(com.google.android.gms.common.data.DataHolder r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
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
            boolean r1 = com.google.android.gms.games.achievement.AchievementEntity.zzf(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.achievement.Achievement freeze() {
            r1 = this;
            com.google.android.gms.games.achievement.AchievementEntity r0 = new com.google.android.gms.games.achievement.AchievementEntity
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final java.lang.String getAchievementId() {
            r1 = this;
            java.lang.String r0 = "external_achievement_id"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int getCurrentSteps() {
            r2 = this;
            java.lang.String r0 = "type"
            int r0 = r2.getInteger(r0)
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            com.google.android.gms.common.internal.Asserts.checkState(r1)
            java.lang.String r0 = "current_steps"
            int r0 = r2.getInteger(r0)
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = "description"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final void getDescription(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = "description"
            r1.copyToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final java.lang.String getFormattedCurrentSteps() {
            r2 = this;
            java.lang.String r0 = "type"
            int r0 = r2.getInteger(r0)
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            com.google.android.gms.common.internal.Asserts.checkState(r1)
            java.lang.String r0 = "formatted_current_steps"
            java.lang.String r0 = r2.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final void getFormattedCurrentSteps(android.database.CharArrayBuffer r3) {
            r2 = this;
            java.lang.String r0 = "type"
            int r0 = r2.getInteger(r0)
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            com.google.android.gms.common.internal.Asserts.checkState(r1)
            java.lang.String r0 = "formatted_current_steps"
            r2.copyToBuffer(r0, r3)
            return
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final java.lang.String getFormattedTotalSteps() {
            r2 = this;
            java.lang.String r0 = "type"
            int r0 = r2.getInteger(r0)
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            com.google.android.gms.common.internal.Asserts.checkState(r1)
            java.lang.String r0 = "formatted_total_steps"
            java.lang.String r0 = r2.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final void getFormattedTotalSteps(android.database.CharArrayBuffer r3) {
            r2 = this;
            java.lang.String r0 = "type"
            int r0 = r2.getInteger(r0)
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            com.google.android.gms.common.internal.Asserts.checkState(r1)
            java.lang.String r0 = "formatted_total_steps"
            r2.copyToBuffer(r0, r3)
            return
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final long getLastUpdatedTimestamp() {
            r2 = this;
            java.lang.String r0 = "last_updated_timestamp"
            long r0 = r2.getLong(r0)
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "name"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final void getName(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = "name"
            r1.copyToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final com.google.android.gms.games.Player getPlayer() {
            r1 = this;
            com.google.android.gms.games.Player r0 = r1.zzb()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.games.Player r0 = (com.google.android.gms.games.Player) r0
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final android.net.Uri getRevealedImageUri() {
            r1 = this;
            java.lang.String r0 = "revealed_icon_image_uri"
            android.net.Uri r0 = r1.parseUri(r0)
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public java.lang.String getRevealedImageUrl() {
            r1 = this;
            java.lang.String r0 = "revealed_icon_image_url"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int getState() {
            r1 = this;
            java.lang.String r0 = "state"
            int r0 = r1.getInteger(r0)
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int getTotalSteps() {
            r2 = this;
            java.lang.String r0 = "type"
            int r0 = r2.getInteger(r0)
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            com.google.android.gms.common.internal.Asserts.checkState(r1)
            java.lang.String r0 = "total_steps"
            int r0 = r2.getInteger(r0)
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int getType() {
            r1 = this;
            java.lang.String r0 = "type"
            int r0 = r1.getInteger(r0)
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final android.net.Uri getUnlockedImageUri() {
            r1 = this;
            java.lang.String r0 = "unlocked_icon_image_uri"
            android.net.Uri r0 = r1.parseUri(r0)
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public java.lang.String getUnlockedImageUrl() {
            r1 = this;
            java.lang.String r0 = "unlocked_icon_image_url"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final long getXpValue() {
            r2 = this;
            java.lang.String r0 = "instance_xp_value"
            boolean r1 = r2.hasColumn(r0)
            if (r1 == 0) goto L14
            boolean r1 = r2.hasNull(r0)
            if (r1 == 0) goto Lf
            goto L14
        Lf:
            long r0 = r2.getLong(r0)
            return r0
        L14:
            java.lang.String r0 = "definition_xp_value"
            long r0 = r2.getLong(r0)
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
            r1 = this;
            int r0 = com.google.android.gms.games.achievement.AchievementEntity.zzd(r1)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = com.google.android.gms.games.achievement.AchievementEntity.zze(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            com.google.android.gms.games.achievement.AchievementEntity r0 = new com.google.android.gms.games.achievement.AchievementEntity
            r0.<init>(r1)
            r0.writeToParcel(r2, r3)
            return
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final float zza() {
            r2 = this;
            java.lang.String r0 = "rarity_percent"
            boolean r1 = r2.hasColumn(r0)
            if (r1 == 0) goto L14
            boolean r1 = r2.hasNull(r0)
            if (r1 == 0) goto Lf
            goto L14
        Lf:
            float r0 = r2.getFloat(r0)
            return r0
        L14:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final com.google.android.gms.games.Player zzb() {
            r4 = this;
            java.lang.String r0 = "external_player_id"
            boolean r0 = r4.hasNull(r0)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            com.google.android.gms.games.PlayerRef r0 = new com.google.android.gms.games.PlayerRef
            com.google.android.gms.common.data.DataHolder r2 = r4.mDataHolder
            int r3 = r4.mDataRow
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = "external_game_id"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }
}
