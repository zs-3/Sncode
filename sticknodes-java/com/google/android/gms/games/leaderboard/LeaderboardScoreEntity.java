package com.google.android.gms.games.leaderboard;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: classes.dex */
public final class LeaderboardScoreEntity implements com.google.android.gms.games.leaderboard.LeaderboardScore {
    private final long zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final long zzd;
    private final long zze;
    private final java.lang.String zzf;
    private final android.net.Uri zzg;
    private final android.net.Uri zzh;
    private final com.google.android.gms.games.PlayerEntity zzi;
    private final java.lang.String zzj;
    private final java.lang.String zzk;
    private final java.lang.String zzl;

    public LeaderboardScoreEntity(com.google.android.gms.games.leaderboard.LeaderboardScore r3) {
            r2 = this;
            r2.<init>()
            long r0 = r3.getRank()
            r2.zza = r0
            java.lang.String r0 = r3.getDisplayRank()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.zzb = r0
            java.lang.String r0 = r3.getDisplayScore()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.zzc = r0
            long r0 = r3.getRawScore()
            r2.zzd = r0
            long r0 = r3.getTimestampMillis()
            r2.zze = r0
            java.lang.String r0 = r3.getScoreHolderDisplayName()
            r2.zzf = r0
            android.net.Uri r0 = r3.getScoreHolderIconImageUri()
            r2.zzg = r0
            android.net.Uri r0 = r3.getScoreHolderHiResImageUri()
            r2.zzh = r0
            com.google.android.gms.games.Player r0 = r3.getScoreHolder()
            if (r0 != 0) goto L47
            r0 = 0
            goto L4d
        L47:
            com.google.android.gms.games.PlayerEntity r1 = new com.google.android.gms.games.PlayerEntity
            r1.<init>(r0)
            r0 = r1
        L4d:
            r2.zzi = r0
            java.lang.String r0 = r3.getScoreTag()
            r2.zzj = r0
            java.lang.String r0 = r3.getScoreHolderIconImageUrl()
            r2.zzk = r0
            java.lang.String r3 = r3.getScoreHolderHiResImageUrl()
            r2.zzl = r3
            return
    }

    static int zza(com.google.android.gms.games.leaderboard.LeaderboardScore r3) {
            r0 = 9
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r1 = r3.getRank()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.getDisplayRank()
            r2 = 1
            r0[r2] = r1
            long r1 = r3.getRawScore()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = r3.getDisplayScore()
            r2 = 3
            r0[r2] = r1
            long r1 = r3.getTimestampMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = r3.getScoreHolderDisplayName()
            r2 = 5
            r0[r2] = r1
            android.net.Uri r1 = r3.getScoreHolderIconImageUri()
            r2 = 6
            r0[r2] = r1
            android.net.Uri r1 = r3.getScoreHolderHiResImageUri()
            r2 = 7
            r0[r2] = r1
            com.google.android.gms.games.Player r3 = r3.getScoreHolder()
            r1 = 8
            r0[r1] = r3
            int r3 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r3
    }

    static java.lang.String zzb(com.google.android.gms.games.leaderboard.LeaderboardScore r3) {
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            long r1 = r3.getRank()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Rank"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getDisplayRank()
            java.lang.String r2 = "DisplayRank"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            long r1 = r3.getRawScore()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Score"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getDisplayScore()
            java.lang.String r2 = "DisplayScore"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            long r1 = r3.getTimestampMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Timestamp"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getScoreHolderDisplayName()
            java.lang.String r2 = "DisplayName"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            android.net.Uri r1 = r3.getScoreHolderIconImageUri()
            java.lang.String r2 = "IconImageUri"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getScoreHolderIconImageUrl()
            java.lang.String r2 = "IconImageUrl"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            android.net.Uri r1 = r3.getScoreHolderHiResImageUri()
            java.lang.String r2 = "HiResImageUri"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getScoreHolderHiResImageUrl()
            java.lang.String r2 = "HiResImageUrl"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            com.google.android.gms.games.Player r1 = r3.getScoreHolder()
            if (r1 != 0) goto L7c
            r1 = 0
            goto L80
        L7c:
            com.google.android.gms.games.Player r1 = r3.getScoreHolder()
        L80:
            java.lang.String r2 = "Player"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r3 = r3.getScoreTag()
            java.lang.String r1 = "ScoreTag"
            com.google.android.gms.common.internal.Objects$ToStringHelper r3 = r0.add(r1, r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    static boolean zzc(com.google.android.gms.games.leaderboard.LeaderboardScore r5, java.lang.Object r6) {
            boolean r0 = r6 instanceof com.google.android.gms.games.leaderboard.LeaderboardScore
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r6) goto La
            return r0
        La:
            com.google.android.gms.games.leaderboard.LeaderboardScore r6 = (com.google.android.gms.games.leaderboard.LeaderboardScore) r6
            long r2 = r6.getRank()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r5.getRank()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Lb1
            java.lang.String r2 = r6.getDisplayRank()
            java.lang.String r3 = r5.getDisplayRank()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Lb1
            long r2 = r6.getRawScore()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r5.getRawScore()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Lb1
            java.lang.String r2 = r6.getDisplayScore()
            java.lang.String r3 = r5.getDisplayScore()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Lb1
            long r2 = r6.getTimestampMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r5.getTimestampMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Lb1
            java.lang.String r2 = r6.getScoreHolderDisplayName()
            java.lang.String r3 = r5.getScoreHolderDisplayName()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Lb1
            android.net.Uri r2 = r6.getScoreHolderIconImageUri()
            android.net.Uri r3 = r5.getScoreHolderIconImageUri()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Lb1
            android.net.Uri r2 = r6.getScoreHolderHiResImageUri()
            android.net.Uri r3 = r5.getScoreHolderHiResImageUri()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Lb1
            com.google.android.gms.games.Player r2 = r6.getScoreHolder()
            com.google.android.gms.games.Player r3 = r5.getScoreHolder()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Lb1
            java.lang.String r6 = r6.getScoreTag()
            java.lang.String r5 = r5.getScoreTag()
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r6, r5)
            if (r5 == 0) goto Lb1
            return r0
        Lb1:
            return r1
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = zzc(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.leaderboard.LeaderboardScore freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final java.lang.String getDisplayRank() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final void getDisplayRank(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.zzb
            com.google.android.gms.common.util.DataUtils.copyStringToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final java.lang.String getDisplayScore() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final void getDisplayScore(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.zzc
            com.google.android.gms.common.util.DataUtils.copyStringToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final long getRank() {
            r2 = this;
            long r0 = r2.zza
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final long getRawScore() {
            r2 = this;
            long r0 = r2.zzd
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final com.google.android.gms.games.Player getScoreHolder() {
            r1 = this;
            com.google.android.gms.games.PlayerEntity r0 = r1.zzi
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final java.lang.String getScoreHolderDisplayName() {
            r1 = this;
            com.google.android.gms.games.PlayerEntity r0 = r1.zzi
            if (r0 != 0) goto L7
            java.lang.String r0 = r1.zzf
            return r0
        L7:
            java.lang.String r0 = r0.getDisplayName()
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final void getScoreHolderDisplayName(android.database.CharArrayBuffer r2) {
            r1 = this;
            com.google.android.gms.games.PlayerEntity r0 = r1.zzi
            if (r0 != 0) goto La
            java.lang.String r0 = r1.zzf
            com.google.android.gms.common.util.DataUtils.copyStringToBuffer(r0, r2)
            return
        La:
            r0.getDisplayName(r2)
            return
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final android.net.Uri getScoreHolderHiResImageUri() {
            r1 = this;
            com.google.android.gms.games.PlayerEntity r0 = r1.zzi
            if (r0 != 0) goto L7
            android.net.Uri r0 = r1.zzh
            return r0
        L7:
            android.net.Uri r0 = r0.getHiResImageUri()
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public java.lang.String getScoreHolderHiResImageUrl() {
            r1 = this;
            com.google.android.gms.games.PlayerEntity r0 = r1.zzi
            if (r0 != 0) goto L7
            java.lang.String r0 = r1.zzl
            return r0
        L7:
            java.lang.String r0 = r0.getHiResImageUrl()
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final android.net.Uri getScoreHolderIconImageUri() {
            r1 = this;
            com.google.android.gms.games.PlayerEntity r0 = r1.zzi
            if (r0 != 0) goto L7
            android.net.Uri r0 = r1.zzg
            return r0
        L7:
            android.net.Uri r0 = r0.getIconImageUri()
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public java.lang.String getScoreHolderIconImageUrl() {
            r1 = this;
            com.google.android.gms.games.PlayerEntity r0 = r1.zzi
            if (r0 != 0) goto L7
            java.lang.String r0 = r1.zzk
            return r0
        L7:
            java.lang.String r0 = r0.getIconImageUrl()
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final java.lang.String getScoreTag() {
            r1 = this;
            java.lang.String r0 = r1.zzj
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final long getTimestampMillis() {
            r2 = this;
            long r0 = r2.zze
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = zza(r1)
            return r0
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = zzb(r1)
            return r0
    }
}
