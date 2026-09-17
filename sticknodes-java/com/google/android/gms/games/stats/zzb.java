package com.google.android.gms.games.stats;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzb extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.games.stats.PlayerStats {
    private android.os.Bundle zza;

    zzb(com.google.android.gms.common.data.DataHolder r1, int r2) {
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
            boolean r1 = com.google.android.gms.games.stats.PlayerStatsEntity.zzd(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.stats.PlayerStats freeze() {
            r1 = this;
            com.google.android.gms.games.stats.PlayerStatsEntity r0 = new com.google.android.gms.games.stats.PlayerStatsEntity
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getAverageSessionLength() {
            r1 = this;
            java.lang.String r0 = "ave_session_length_minutes"
            float r0 = r1.getFloat(r0)
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getChurnProbability() {
            r1 = this;
            java.lang.String r0 = "churn_probability"
            float r0 = r1.getFloat(r0)
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int getDaysSinceLastPlayed() {
            r1 = this;
            java.lang.String r0 = "days_since_last_played"
            int r0 = r1.getInteger(r0)
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getHighSpenderProbability() {
            r2 = this;
            java.lang.String r0 = "high_spender_probability"
            boolean r1 = r2.hasColumn(r0)
            if (r1 != 0) goto Lb
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r0
        Lb:
            float r0 = r2.getFloat(r0)
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int getNumberOfPurchases() {
            r1 = this;
            java.lang.String r0 = "num_purchases"
            int r0 = r1.getInteger(r0)
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int getNumberOfSessions() {
            r1 = this;
            java.lang.String r0 = "num_sessions"
            int r0 = r1.getInteger(r0)
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getSessionPercentile() {
            r1 = this;
            java.lang.String r0 = "num_sessions_percentile"
            float r0 = r1.getFloat(r0)
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getSpendPercentile() {
            r1 = this;
            java.lang.String r0 = "spend_percentile"
            float r0 = r1.getFloat(r0)
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getSpendProbability() {
            r2 = this;
            java.lang.String r0 = "spend_probability"
            boolean r1 = r2.hasColumn(r0)
            if (r1 != 0) goto Lb
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r0
        Lb:
            float r0 = r2.getFloat(r0)
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getTotalSpendNext28Days() {
            r2 = this;
            java.lang.String r0 = "total_spend_next_28_days"
            boolean r1 = r2.hasColumn(r0)
            if (r1 != 0) goto Lb
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r0
        Lb:
            float r0 = r2.getFloat(r0)
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
            r1 = this;
            int r0 = com.google.android.gms.games.stats.PlayerStatsEntity.zzb(r1)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = com.google.android.gms.games.stats.PlayerStatsEntity.zzc(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            com.google.android.gms.games.stats.PlayerStatsEntity r0 = new com.google.android.gms.games.stats.PlayerStatsEntity
            r0.<init>(r1)
            com.google.android.gms.games.stats.zza.zza(r0, r2, r3)
            return
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final android.os.Bundle zza() {
            r6 = this;
            android.os.Bundle r0 = r6.zza
            if (r0 == 0) goto L5
            return r0
        L5:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r6.zza = r0
            java.lang.String r0 = "unknown_raw_keys"
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r1 = "unknown_raw_values"
            java.lang.String r1 = r6.getString(r1)
            if (r0 == 0) goto L42
            if (r1 == 0) goto L42
            java.lang.String r2 = ","
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String[] r1 = r1.split(r2)
            int r2 = r0.length
            int r3 = r1.length
            r4 = 0
            if (r2 > r3) goto L2d
            r2 = 1
            goto L2e
        L2d:
            r2 = 0
        L2e:
            java.lang.String r3 = "Invalid raw arguments!"
            com.google.android.gms.common.internal.Asserts.checkState(r2, r3)
        L33:
            int r2 = r0.length
            if (r4 >= r2) goto L42
            android.os.Bundle r2 = r6.zza
            r3 = r0[r4]
            r5 = r1[r4]
            r2.putString(r3, r5)
            int r4 = r4 + 1
            goto L33
        L42:
            android.os.Bundle r0 = r6.zza
            return r0
    }
}
