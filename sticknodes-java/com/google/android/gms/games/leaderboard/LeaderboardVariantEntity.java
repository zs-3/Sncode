package com.google.android.gms.games.leaderboard;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: classes.dex */
public final class LeaderboardVariantEntity implements com.google.android.gms.games.leaderboard.LeaderboardVariant {
    private final int zza;
    private final int zzb;
    private final boolean zzc;
    private final long zzd;
    private final java.lang.String zze;
    private final long zzf;
    private final java.lang.String zzg;
    private final java.lang.String zzh;
    private final long zzi;
    private final java.lang.String zzj;
    private final java.lang.String zzk;
    private final java.lang.String zzl;

    public LeaderboardVariantEntity(com.google.android.gms.games.leaderboard.LeaderboardVariant r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.getTimeSpan()
            r2.zza = r0
            int r0 = r3.getCollection()
            r2.zzb = r0
            boolean r0 = r3.hasPlayerInfo()
            r2.zzc = r0
            long r0 = r3.getRawPlayerScore()
            r2.zzd = r0
            java.lang.String r0 = r3.getDisplayPlayerScore()
            r2.zze = r0
            long r0 = r3.getPlayerRank()
            r2.zzf = r0
            java.lang.String r0 = r3.getDisplayPlayerRank()
            r2.zzg = r0
            java.lang.String r0 = r3.getPlayerScoreTag()
            r2.zzh = r0
            long r0 = r3.getNumScores()
            r2.zzi = r0
            java.lang.String r0 = r3.zza()
            r2.zzj = r0
            java.lang.String r0 = r3.zzc()
            r2.zzk = r0
            java.lang.String r3 = r3.zzb()
            r2.zzl = r3
            return
    }

    static int zzd(com.google.android.gms.games.leaderboard.LeaderboardVariant r3) {
            r0 = 11
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.getTimeSpan()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.getCollection()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            boolean r1 = r3.hasPlayerInfo()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            long r1 = r3.getRawPlayerScore()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            java.lang.String r1 = r3.getDisplayPlayerScore()
            r2 = 4
            r0[r2] = r1
            long r1 = r3.getPlayerRank()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 5
            r0[r2] = r1
            java.lang.String r1 = r3.getDisplayPlayerRank()
            r2 = 6
            r0[r2] = r1
            long r1 = r3.getNumScores()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 7
            r0[r2] = r1
            java.lang.String r1 = r3.zza()
            r2 = 8
            r0[r2] = r1
            java.lang.String r1 = r3.zzb()
            r2 = 9
            r0[r2] = r1
            java.lang.String r3 = r3.zzc()
            r1 = 10
            r0[r1] = r3
            int r3 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r3
    }

    static java.lang.String zze(com.google.android.gms.games.leaderboard.LeaderboardVariant r5) {
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r5)
            int r1 = r5.getTimeSpan()
            java.lang.String r1 = com.google.android.gms.internal.games.zzfl.zza(r1)
            java.lang.String r2 = "TimeSpan"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r5.getCollection()
            r2 = -1
            java.lang.String r3 = "SOCIAL_1P"
            if (r1 == r2) goto L4a
            if (r1 == 0) goto L47
            r2 = 1
            if (r1 == r2) goto L44
            r2 = 2
            if (r1 == r2) goto L4c
            r2 = 3
            if (r1 == r2) goto L41
            r2 = 4
            if (r1 != r2) goto L2a
            goto L4c
        L2a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unknown leaderboard collection: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L41:
            java.lang.String r3 = "FRIENDS"
            goto L4c
        L44:
            java.lang.String r3 = "SOCIAL"
            goto L4c
        L47:
            java.lang.String r3 = "PUBLIC"
            goto L4c
        L4a:
            java.lang.String r3 = "UNKNOWN"
        L4c:
            java.lang.String r1 = "Collection"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r1, r3)
            boolean r1 = r5.hasPlayerInfo()
            java.lang.String r2 = "none"
            if (r1 == 0) goto L63
            long r3 = r5.getRawPlayerScore()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L64
        L63:
            r1 = r2
        L64:
            java.lang.String r3 = "RawPlayerScore"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r3, r1)
            boolean r1 = r5.hasPlayerInfo()
            if (r1 == 0) goto L75
            java.lang.String r1 = r5.getDisplayPlayerScore()
            goto L76
        L75:
            r1 = r2
        L76:
            java.lang.String r3 = "DisplayPlayerScore"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r3, r1)
            boolean r1 = r5.hasPlayerInfo()
            if (r1 == 0) goto L8b
            long r3 = r5.getPlayerRank()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L8c
        L8b:
            r1 = r2
        L8c:
            java.lang.String r3 = "PlayerRank"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r3, r1)
            boolean r1 = r5.hasPlayerInfo()
            if (r1 == 0) goto L9c
            java.lang.String r2 = r5.getDisplayPlayerRank()
        L9c:
            java.lang.String r1 = "DisplayPlayerRank"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r1, r2)
            long r1 = r5.getNumScores()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "NumScores"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r5.zza()
            java.lang.String r2 = "TopPageNextToken"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r5.zzb()
            java.lang.String r2 = "WindowPageNextToken"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r5 = r5.zzc()
            java.lang.String r1 = "WindowPagePrevToken"
            com.google.android.gms.common.internal.Objects$ToStringHelper r5 = r0.add(r1, r5)
            java.lang.String r5 = r5.toString()
            return r5
    }

    static boolean zzf(com.google.android.gms.games.leaderboard.LeaderboardVariant r5, java.lang.Object r6) {
            boolean r0 = r6 instanceof com.google.android.gms.games.leaderboard.LeaderboardVariant
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r6) goto La
            return r0
        La:
            com.google.android.gms.games.leaderboard.LeaderboardVariant r6 = (com.google.android.gms.games.leaderboard.LeaderboardVariant) r6
            int r2 = r6.getTimeSpan()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r5.getTimeSpan()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Ld7
            int r2 = r6.getCollection()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r5.getCollection()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Ld7
            boolean r2 = r6.hasPlayerInfo()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r5.hasPlayerInfo()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Ld7
            long r2 = r6.getRawPlayerScore()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r5.getRawPlayerScore()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Ld7
            java.lang.String r2 = r6.getDisplayPlayerScore()
            java.lang.String r3 = r5.getDisplayPlayerScore()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Ld7
            long r2 = r6.getPlayerRank()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r5.getPlayerRank()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Ld7
            java.lang.String r2 = r6.getDisplayPlayerRank()
            java.lang.String r3 = r5.getDisplayPlayerRank()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Ld7
            long r2 = r6.getNumScores()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r5.getNumScores()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Ld7
            java.lang.String r2 = r6.zza()
            java.lang.String r3 = r5.zza()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Ld7
            java.lang.String r2 = r6.zzb()
            java.lang.String r3 = r5.zzb()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Ld7
            java.lang.String r6 = r6.zzc()
            java.lang.String r5 = r5.zzc()
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r6, r5)
            if (r5 == 0) goto Ld7
            return r0
        Ld7:
            return r1
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = zzf(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.leaderboard.LeaderboardVariant freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final int getCollection() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String getDisplayPlayerRank() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String getDisplayPlayerScore() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getNumScores() {
            r2 = this;
            long r0 = r2.zzi
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getPlayerRank() {
            r2 = this;
            long r0 = r2.zzf
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String getPlayerScoreTag() {
            r1 = this;
            java.lang.String r0 = r1.zzh
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getRawPlayerScore() {
            r2 = this;
            long r0 = r2.zzd
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final int getTimeSpan() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final boolean hasPlayerInfo() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = zzd(r1)
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
            java.lang.String r0 = zze(r1)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzj
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zzl
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zzk
            return r0
    }
}
