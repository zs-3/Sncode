package com.google.android.gms.games.leaderboard;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzb extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.games.leaderboard.LeaderboardVariant {
    zzb(com.google.android.gms.common.data.DataHolder r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.android.gms.games.leaderboard.LeaderboardVariantEntity.zzf(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.leaderboard.LeaderboardVariant freeze() {
            r1 = this;
            com.google.android.gms.games.leaderboard.LeaderboardVariantEntity r0 = new com.google.android.gms.games.leaderboard.LeaderboardVariantEntity
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final int getCollection() {
            r1 = this;
            java.lang.String r0 = "collection"
            int r0 = r1.getInteger(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String getDisplayPlayerRank() {
            r1 = this;
            java.lang.String r0 = "player_display_rank"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String getDisplayPlayerScore() {
            r1 = this;
            java.lang.String r0 = "player_display_score"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getNumScores() {
            r2 = this;
            java.lang.String r0 = "total_scores"
            boolean r1 = r2.hasNull(r0)
            if (r1 == 0) goto Lb
            r0 = -1
            return r0
        Lb:
            long r0 = r2.getLong(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getPlayerRank() {
            r2 = this;
            java.lang.String r0 = "player_rank"
            boolean r1 = r2.hasNull(r0)
            if (r1 == 0) goto Lb
            r0 = -1
            return r0
        Lb:
            long r0 = r2.getLong(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String getPlayerScoreTag() {
            r1 = this;
            java.lang.String r0 = "player_score_tag"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getRawPlayerScore() {
            r2 = this;
            java.lang.String r0 = "player_raw_score"
            boolean r1 = r2.hasNull(r0)
            if (r1 == 0) goto Lb
            r0 = -1
            return r0
        Lb:
            long r0 = r2.getLong(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final int getTimeSpan() {
            r1 = this;
            java.lang.String r0 = "timespan"
            int r0 = r1.getInteger(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final boolean hasPlayerInfo() {
            r1 = this;
            java.lang.String r0 = "player_raw_score"
            boolean r0 = r1.hasNull(r0)
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
            r1 = this;
            int r0 = com.google.android.gms.games.leaderboard.LeaderboardVariantEntity.zzd(r1)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = com.google.android.gms.games.leaderboard.LeaderboardVariantEntity.zze(r1)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = "top_page_token_next"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = "window_page_token_next"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = "window_page_token_prev"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }
}
