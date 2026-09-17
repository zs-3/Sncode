package com.google.android.gms.games.leaderboard;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: classes.dex */
public final class LeaderboardEntity implements com.google.android.gms.games.leaderboard.Leaderboard {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final android.net.Uri zzc;
    private final int zzd;
    private final java.util.ArrayList zze;
    private final com.google.android.gms.games.Game zzf;
    private final java.lang.String zzg;

    public LeaderboardEntity(com.google.android.gms.games.leaderboard.Leaderboard r5) {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = r5.getLeaderboardId()
            r4.zza = r0
            java.lang.String r0 = r5.getDisplayName()
            r4.zzb = r0
            android.net.Uri r0 = r5.getIconImageUri()
            r4.zzc = r0
            java.lang.String r0 = r5.getIconImageUrl()
            r4.zzg = r0
            int r0 = r5.getScoreOrder()
            r4.zzd = r0
            com.google.android.gms.games.Game r0 = r5.zza()
            if (r0 != 0) goto L29
            r0 = 0
            goto L2f
        L29:
            com.google.android.gms.games.GameEntity r1 = new com.google.android.gms.games.GameEntity
            r1.<init>(r0)
            r0 = r1
        L2f:
            r4.zzf = r0
            java.util.ArrayList r5 = r5.getVariants()
            int r0 = r5.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r4.zze = r1
            r1 = 0
        L41:
            if (r1 >= r0) goto L55
            java.util.ArrayList r2 = r4.zze
            java.lang.Object r3 = r5.get(r1)
            com.google.android.gms.games.leaderboard.LeaderboardVariant r3 = (com.google.android.gms.games.leaderboard.LeaderboardVariant) r3
            java.lang.Object r3 = r3.freeze()
            r2.add(r3)
            int r1 = r1 + 1
            goto L41
        L55:
            return
    }

    static int zzb(com.google.android.gms.games.leaderboard.Leaderboard r3) {
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.getLeaderboardId()
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.getDisplayName()
            r2 = 1
            r0[r2] = r1
            android.net.Uri r1 = r3.getIconImageUri()
            r2 = 2
            r0[r2] = r1
            int r1 = r3.getScoreOrder()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            java.util.ArrayList r3 = r3.getVariants()
            r1 = 4
            r0[r1] = r3
            int r3 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r3
    }

    static java.lang.String zzc(com.google.android.gms.games.leaderboard.Leaderboard r3) {
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            java.lang.String r1 = r3.getLeaderboardId()
            java.lang.String r2 = "LeaderboardId"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getDisplayName()
            java.lang.String r2 = "DisplayName"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            android.net.Uri r1 = r3.getIconImageUri()
            java.lang.String r2 = "IconImageUri"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getIconImageUrl()
            java.lang.String r2 = "IconImageUrl"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.getScoreOrder()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ScoreOrder"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.util.ArrayList r3 = r3.getVariants()
            java.lang.String r1 = "Variants"
            com.google.android.gms.common.internal.Objects$ToStringHelper r3 = r0.add(r1, r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    static boolean zzd(com.google.android.gms.games.leaderboard.Leaderboard r4, java.lang.Object r5) {
            boolean r0 = r5 instanceof com.google.android.gms.games.leaderboard.Leaderboard
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r4 != r5) goto La
            return r0
        La:
            com.google.android.gms.games.leaderboard.Leaderboard r5 = (com.google.android.gms.games.leaderboard.Leaderboard) r5
            java.lang.String r2 = r5.getLeaderboardId()
            java.lang.String r3 = r4.getLeaderboardId()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L5b
            java.lang.String r2 = r5.getDisplayName()
            java.lang.String r3 = r4.getDisplayName()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L5b
            android.net.Uri r2 = r5.getIconImageUri()
            android.net.Uri r3 = r4.getIconImageUri()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L5b
            int r2 = r5.getScoreOrder()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r4.getScoreOrder()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L5b
            java.util.ArrayList r5 = r5.getVariants()
            java.util.ArrayList r4 = r4.getVariants()
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r5, r4)
            if (r4 == 0) goto L5b
            return r0
        L5b:
            return r1
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = zzd(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.leaderboard.Leaderboard freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final java.lang.String getDisplayName() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final void getDisplayName(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.zzb
            com.google.android.gms.common.util.DataUtils.copyStringToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final android.net.Uri getIconImageUri() {
            r1 = this;
            android.net.Uri r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public java.lang.String getIconImageUrl() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final java.lang.String getLeaderboardId() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final int getScoreOrder() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final java.util.ArrayList<com.google.android.gms.games.leaderboard.LeaderboardVariant> getVariants() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList r1 = r2.zze
            r0.<init>(r1)
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = zzb(r1)
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
            java.lang.String r0 = zzc(r1)
            return r0
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final com.google.android.gms.games.Game zza() {
            r1 = this;
            r0 = 0
            throw r0
    }
}
