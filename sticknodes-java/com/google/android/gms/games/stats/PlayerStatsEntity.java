package com.google.android.gms.games.stats;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PlayerStatsEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public class PlayerStatsEntity extends com.google.android.gms.games.internal.zzc implements com.google.android.gms.games.stats.PlayerStats {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.stats.PlayerStatsEntity> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAverageSessionLength", id = 1)
    private final float zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getChurnProbability", id = 2)
    private final float zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDaysSinceLastPlayed", id = 3)
    private final int zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getNumberOfPurchases", id = 4)
    private final int zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getNumberOfSessions", id = 5)
    private final int zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSessionPercentile", id = 6)
    private final float zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSpendPercentile", id = 7)
    private final float zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRawValues", id = 8)
    private final android.os.Bundle zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSpendProbability", id = 9)
    private final float zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getHighSpenderProbability", id = 10)
    private final float zzj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTotalSpendNext28Days", id = 11)
    private final float zzk;

    static {
            com.google.android.gms.games.stats.zza r0 = new com.google.android.gms.games.stats.zza
            r0.<init>()
            com.google.android.gms.games.stats.PlayerStatsEntity.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    PlayerStatsEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) float r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) float r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) int r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) int r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) float r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) float r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) android.os.Bundle r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) float r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) float r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 11) float r11) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            r0.zzi = r9
            r0.zzj = r10
            r0.zzk = r11
            return
    }

    public PlayerStatsEntity(com.google.android.gms.games.stats.PlayerStats r2) {
            r1 = this;
            r1.<init>()
            float r0 = r2.getAverageSessionLength()
            r1.zza = r0
            float r0 = r2.getChurnProbability()
            r1.zzb = r0
            int r0 = r2.getDaysSinceLastPlayed()
            r1.zzc = r0
            int r0 = r2.getNumberOfPurchases()
            r1.zzd = r0
            int r0 = r2.getNumberOfSessions()
            r1.zze = r0
            float r0 = r2.getSessionPercentile()
            r1.zzf = r0
            float r0 = r2.getSpendPercentile()
            r1.zzg = r0
            float r0 = r2.getSpendProbability()
            r1.zzi = r0
            float r0 = r2.getHighSpenderProbability()
            r1.zzj = r0
            float r0 = r2.getTotalSpendNext28Days()
            r1.zzk = r0
            android.os.Bundle r2 = r2.zza()
            r1.zzh = r2
            return
    }

    static int zzb(com.google.android.gms.games.stats.PlayerStats r3) {
            r0 = 10
            java.lang.Object[] r0 = new java.lang.Object[r0]
            float r1 = r3.getAverageSessionLength()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            float r1 = r3.getChurnProbability()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.getDaysSinceLastPlayed()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r1 = r3.getNumberOfPurchases()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            int r1 = r3.getNumberOfSessions()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            float r1 = r3.getSessionPercentile()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 5
            r0[r2] = r1
            float r1 = r3.getSpendPercentile()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 6
            r0[r2] = r1
            float r1 = r3.getSpendProbability()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 7
            r0[r2] = r1
            float r1 = r3.getHighSpenderProbability()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 8
            r0[r2] = r1
            float r3 = r3.getTotalSpendNext28Days()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r1 = 9
            r0[r1] = r3
            int r3 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r3
    }

    static java.lang.String zzc(com.google.android.gms.games.stats.PlayerStats r3) {
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            float r1 = r3.getAverageSessionLength()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "AverageSessionLength"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            float r1 = r3.getChurnProbability()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "ChurnProbability"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.getDaysSinceLastPlayed()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "DaysSinceLastPlayed"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.getNumberOfPurchases()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NumberOfPurchases"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.getNumberOfSessions()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NumberOfSessions"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            float r1 = r3.getSessionPercentile()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "SessionPercentile"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            float r1 = r3.getSpendPercentile()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "SpendPercentile"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            float r1 = r3.getSpendProbability()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "SpendProbability"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            float r1 = r3.getHighSpenderProbability()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "HighSpenderProbability"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            float r3 = r3.getTotalSpendNext28Days()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.String r1 = "TotalSpendNext28Days"
            com.google.android.gms.common.internal.Objects$ToStringHelper r3 = r0.add(r1, r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    static boolean zzd(com.google.android.gms.games.stats.PlayerStats r4, java.lang.Object r5) {
            boolean r0 = r5 instanceof com.google.android.gms.games.stats.PlayerStats
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r4 != r5) goto La
            return r0
        La:
            com.google.android.gms.games.stats.PlayerStats r5 = (com.google.android.gms.games.stats.PlayerStats) r5
            float r2 = r5.getAverageSessionLength()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r3 = r4.getAverageSessionLength()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Le9
            float r2 = r5.getChurnProbability()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r3 = r4.getChurnProbability()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Le9
            int r2 = r5.getDaysSinceLastPlayed()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r4.getDaysSinceLastPlayed()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Le9
            int r2 = r5.getNumberOfPurchases()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r4.getNumberOfPurchases()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Le9
            int r2 = r5.getNumberOfSessions()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r4.getNumberOfSessions()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Le9
            float r2 = r5.getSessionPercentile()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r3 = r4.getSessionPercentile()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Le9
            float r2 = r5.getSpendPercentile()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r3 = r4.getSpendPercentile()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Le9
            float r2 = r5.getSpendProbability()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r3 = r4.getSpendProbability()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Le9
            float r2 = r5.getHighSpenderProbability()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r3 = r4.getHighSpenderProbability()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Le9
            float r5 = r5.getTotalSpendNext28Days()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            float r4 = r4.getTotalSpendNext28Days()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r5, r4)
            if (r4 == 0) goto Le9
            return r0
        Le9:
            return r1
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = zzd(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.stats.PlayerStats freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getAverageSessionLength() {
            r1 = this;
            float r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getChurnProbability() {
            r1 = this;
            float r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int getDaysSinceLastPlayed() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getHighSpenderProbability() {
            r1 = this;
            float r0 = r1.zzj
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int getNumberOfPurchases() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int getNumberOfSessions() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getSessionPercentile() {
            r1 = this;
            float r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getSpendPercentile() {
            r1 = this;
            float r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getSpendProbability() {
            r1 = this;
            float r0 = r1.zzi
            return r0
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getTotalSpendNext28Days() {
            r1 = this;
            float r0 = r1.zzk
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

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            com.google.android.gms.games.stats.zza.zza(r0, r1, r2)
            return
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final android.os.Bundle zza() {
            r1 = this;
            android.os.Bundle r0 = r1.zzh
            return r0
    }
}
