package com.google.android.gms.games.leaderboard;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class LeaderboardRef extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.games.leaderboard.Leaderboard {
    private final int zza;
    private final com.google.android.gms.games.Game zzb;

    LeaderboardRef(com.google.android.gms.common.data.DataHolder r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zza = r3
            com.google.android.gms.games.GameRef r3 = new com.google.android.gms.games.GameRef
            r3.<init>(r1, r2)
            r0.zzb = r3
            return
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.android.gms.games.leaderboard.LeaderboardEntity.zzd(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.leaderboard.Leaderboard freeze() {
            r1 = this;
            com.google.android.gms.games.leaderboard.LeaderboardEntity r0 = new com.google.android.gms.games.leaderboard.LeaderboardEntity
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final java.lang.String getDisplayName() {
            r1 = this;
            java.lang.String r0 = "name"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final void getDisplayName(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = "name"
            r1.copyToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final android.net.Uri getIconImageUri() {
            r1 = this;
            java.lang.String r0 = "board_icon_image_uri"
            android.net.Uri r0 = r1.parseUri(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public java.lang.String getIconImageUrl() {
            r1 = this;
            java.lang.String r0 = "board_icon_image_url"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final java.lang.String getLeaderboardId() {
            r1 = this;
            java.lang.String r0 = "external_leaderboard_id"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final int getScoreOrder() {
            r1 = this;
            java.lang.String r0 = "score_order"
            int r0 = r1.getInteger(r0)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final java.util.ArrayList<com.google.android.gms.games.leaderboard.LeaderboardVariant> getVariants() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.zza
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r5.zza
            if (r1 >= r2) goto L1c
            com.google.android.gms.games.leaderboard.zzb r2 = new com.google.android.gms.games.leaderboard.zzb
            com.google.android.gms.common.data.DataHolder r3 = r5.mDataHolder
            int r4 = r5.mDataRow
            int r4 = r4 + r1
            r2.<init>(r3, r4)
            r0.add(r2)
            int r1 = r1 + 1
            goto L8
        L1c:
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
            r1 = this;
            int r0 = com.google.android.gms.games.leaderboard.LeaderboardEntity.zzb(r1)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = com.google.android.gms.games.leaderboard.LeaderboardEntity.zzc(r1)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final com.google.android.gms.games.Game zza() {
            r1 = this;
            com.google.android.gms.games.Game r0 = r1.zzb
            return r0
    }
}
