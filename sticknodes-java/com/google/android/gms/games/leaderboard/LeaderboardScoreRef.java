package com.google.android.gms.games.leaderboard;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class LeaderboardScoreRef extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.games.leaderboard.LeaderboardScore {
    private final com.google.android.gms.games.PlayerRef zza;

    public LeaderboardScoreRef(com.google.android.gms.common.data.DataHolder r3, int r4) {
            r2 = this;
            r2.<init>(r3, r4)
            com.google.android.gms.games.PlayerRef r0 = new com.google.android.gms.games.PlayerRef
            r1 = 0
            r0.<init>(r3, r4, r1)
            r2.zza = r0
            return
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.android.gms.games.leaderboard.LeaderboardScoreEntity.zzc(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.leaderboard.LeaderboardScore freeze() {
            r1 = this;
            com.google.android.gms.games.leaderboard.LeaderboardScoreEntity r0 = new com.google.android.gms.games.leaderboard.LeaderboardScoreEntity
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final java.lang.String getDisplayRank() {
            r1 = this;
            java.lang.String r0 = "display_rank"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final void getDisplayRank(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = "display_rank"
            r1.copyToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final java.lang.String getDisplayScore() {
            r1 = this;
            java.lang.String r0 = "display_score"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final void getDisplayScore(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = "display_score"
            r1.copyToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final long getRank() {
            r2 = this;
            java.lang.String r0 = "rank"
            long r0 = r2.getLong(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final long getRawScore() {
            r2 = this;
            java.lang.String r0 = "raw_score"
            long r0 = r2.getLong(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final com.google.android.gms.games.Player getScoreHolder() {
            r1 = this;
            java.lang.String r0 = "external_player_id"
            boolean r0 = r1.hasNull(r0)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            com.google.android.gms.games.PlayerRef r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final java.lang.String getScoreHolderDisplayName() {
            r1 = this;
            java.lang.String r0 = "external_player_id"
            boolean r0 = r1.hasNull(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = "default_display_name"
            java.lang.String r0 = r1.getString(r0)
            return r0
        Lf:
            com.google.android.gms.games.PlayerRef r0 = r1.zza
            java.lang.String r0 = r0.getDisplayName()
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final void getScoreHolderDisplayName(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = "external_player_id"
            boolean r0 = r1.hasNull(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = "default_display_name"
            r1.copyToBuffer(r0, r2)
            return
        Le:
            com.google.android.gms.games.PlayerRef r0 = r1.zza
            r0.getDisplayName(r2)
            return
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final android.net.Uri getScoreHolderHiResImageUri() {
            r1 = this;
            java.lang.String r0 = "external_player_id"
            boolean r0 = r1.hasNull(r0)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            com.google.android.gms.games.PlayerRef r0 = r1.zza
            android.net.Uri r0 = r0.getHiResImageUri()
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public java.lang.String getScoreHolderHiResImageUrl() {
            r1 = this;
            java.lang.String r0 = "external_player_id"
            boolean r0 = r1.hasNull(r0)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            com.google.android.gms.games.PlayerRef r0 = r1.zza
            java.lang.String r0 = r0.getHiResImageUrl()
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final android.net.Uri getScoreHolderIconImageUri() {
            r1 = this;
            java.lang.String r0 = "external_player_id"
            boolean r0 = r1.hasNull(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = "default_display_image_uri"
            android.net.Uri r0 = r1.parseUri(r0)
            return r0
        Lf:
            com.google.android.gms.games.PlayerRef r0 = r1.zza
            android.net.Uri r0 = r0.getIconImageUri()
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public java.lang.String getScoreHolderIconImageUrl() {
            r1 = this;
            java.lang.String r0 = "external_player_id"
            boolean r0 = r1.hasNull(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = "default_display_image_url"
            java.lang.String r0 = r1.getString(r0)
            return r0
        Lf:
            com.google.android.gms.games.PlayerRef r0 = r1.zza
            java.lang.String r0 = r0.getIconImageUrl()
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final java.lang.String getScoreTag() {
            r1 = this;
            java.lang.String r0 = "score_tag"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final long getTimestampMillis() {
            r2 = this;
            java.lang.String r0 = "achieved_timestamp"
            long r0 = r2.getLong(r0)
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
            r1 = this;
            int r0 = com.google.android.gms.games.leaderboard.LeaderboardScoreEntity.zza(r1)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = com.google.android.gms.games.leaderboard.LeaderboardScoreEntity.zzb(r1)
            return r0
    }
}
