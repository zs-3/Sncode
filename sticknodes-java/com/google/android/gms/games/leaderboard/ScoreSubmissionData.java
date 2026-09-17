package com.google.android.gms.games.leaderboard;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class ScoreSubmissionData {
    private static final java.lang.String[] zza = null;
    private java.lang.String zzb;
    private java.lang.String zzc;
    private int zzd;
    private android.util.SparseArray zze;

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    public static final class Result {
        public final java.lang.String formattedScore;
        public final boolean newBest;
        public final long rawScore;
        public final java.lang.String scoreTag;

        @com.google.android.gms.internal.games.zzfp
        public Result(long r1, java.lang.String r3, java.lang.String r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.rawScore = r1
                r0.formattedScore = r3
                r0.scoreTag = r4
                r0.newBest = r5
                return
        }

        public java.lang.String toString() {
                r3 = this;
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
                long r1 = r3.rawScore
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                java.lang.String r2 = "RawScore"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                java.lang.String r1 = r3.formattedScore
                java.lang.String r2 = "FormattedScore"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                java.lang.String r1 = r3.scoreTag
                java.lang.String r2 = "ScoreTag"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                boolean r1 = r3.newBest
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                java.lang.String r2 = "NewBest"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.String r0 = "leaderboardId"
            java.lang.String r1 = "playerId"
            java.lang.String r2 = "timeSpan"
            java.lang.String r3 = "hasResult"
            java.lang.String r4 = "rawScore"
            java.lang.String r5 = "formattedScore"
            java.lang.String r6 = "newBest"
            java.lang.String r7 = "scoreTag"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7}
            com.google.android.gms.games.leaderboard.ScoreSubmissionData.zza = r0
            return
    }

    public ScoreSubmissionData(com.google.android.gms.common.data.DataHolder r12) {
            r11 = this;
            r11.<init>()
            int r0 = r12.getStatusCode()
            r11.zzd = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r11.zze = r0
            int r0 = r12.getCount()
            r1 = 0
            r2 = 3
            if (r0 != r2) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2)
            r2 = 0
        L1f:
            if (r2 >= r0) goto L6c
            int r3 = r12.getWindowIndex(r2)
            if (r2 != 0) goto L38
            java.lang.String r2 = "leaderboardId"
            java.lang.String r2 = r12.getString(r2, r1, r3)
            r11.zzb = r2
            java.lang.String r2 = "playerId"
            java.lang.String r2 = r12.getString(r2, r1, r3)
            r11.zzc = r2
            r2 = 0
        L38:
            java.lang.String r4 = "hasResult"
            boolean r4 = r12.getBoolean(r4, r2, r3)
            if (r4 == 0) goto L69
            com.google.android.gms.games.leaderboard.ScoreSubmissionData$Result r4 = new com.google.android.gms.games.leaderboard.ScoreSubmissionData$Result
            java.lang.String r5 = "rawScore"
            long r6 = r12.getLong(r5, r2, r3)
            java.lang.String r5 = "formattedScore"
            java.lang.String r8 = r12.getString(r5, r2, r3)
            java.lang.String r5 = "scoreTag"
            java.lang.String r9 = r12.getString(r5, r2, r3)
            java.lang.String r5 = "newBest"
            boolean r10 = r12.getBoolean(r5, r2, r3)
            r5 = r4
            r5.<init>(r6, r8, r9, r10)
            android.util.SparseArray r5 = r11.zze
            java.lang.String r6 = "timeSpan"
            int r3 = r12.getInteger(r6, r2, r3)
            r5.put(r3, r4)
        L69:
            int r2 = r2 + 1
            goto L1f
        L6c:
            return
    }

    public java.lang.String getLeaderboardId() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public java.lang.String getPlayerId() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public com.google.android.gms.games.leaderboard.ScoreSubmissionData.Result getScoreResult(int r2) {
            r1 = this;
            android.util.SparseArray r0 = r1.zze
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.games.leaderboard.ScoreSubmissionData$Result r2 = (com.google.android.gms.games.leaderboard.ScoreSubmissionData.Result) r2
            return r2
    }

    public java.lang.String toString() {
            r5 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r5)
            java.lang.String r1 = r5.zzc
            java.lang.String r2 = "PlayerId"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r5.zzd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "StatusCode"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            r1 = 0
        L19:
            r2 = 3
            if (r1 >= r2) goto L3e
            android.util.SparseArray r2 = r5.zze
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.games.leaderboard.ScoreSubmissionData$Result r2 = (com.google.android.gms.games.leaderboard.ScoreSubmissionData.Result) r2
            java.lang.String r3 = com.google.android.gms.internal.games.zzfl.zza(r1)
            java.lang.String r4 = "TimesSpan"
            r0.add(r4, r3)
            if (r2 != 0) goto L32
            java.lang.String r2 = "null"
            goto L36
        L32:
            java.lang.String r2 = r2.toString()
        L36:
            java.lang.String r3 = "Result"
            r0.add(r3, r2)
            int r1 = r1 + 1
            goto L19
        L3e:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
