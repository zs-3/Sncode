package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PlayerLevelCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class PlayerLevel extends com.google.android.gms.games.internal.zzc {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.PlayerLevel> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getLevelNumber", id = 1)
    private final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMinXp", id = 2)
    private final long zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMaxXp", id = 3)
    private final long zzc;

    static {
            com.google.android.gms.games.zzt r0 = new com.google.android.gms.games.zzt
            r0.<init>()
            com.google.android.gms.games.PlayerLevel.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public PlayerLevel(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) long r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) long r9) {
            r5 = this;
            r5.<init>()
            r0 = 1
            r1 = 0
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 < 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            java.lang.String r3 = "Min XP must be positive!"
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r3)
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 <= 0) goto L18
            goto L19
        L18:
            r0 = 0
        L19:
            java.lang.String r1 = "Max XP must be more than min XP!"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            r5.zza = r6
            r5.zzb = r7
            r5.zzc = r9
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.gms.games.PlayerLevel
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r6) goto La
            return r0
        La:
            com.google.android.gms.games.PlayerLevel r6 = (com.google.android.gms.games.PlayerLevel) r6
            int r2 = r6.getLevelNumber()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r5.getLevelNumber()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L4f
            long r2 = r6.getMinXp()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r5.getMinXp()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L4f
            long r2 = r6.getMaxXp()
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            long r2 = r5.getMaxXp()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            boolean r6 = com.google.android.gms.common.internal.Objects.equal(r6, r2)
            if (r6 == 0) goto L4f
            return r0
        L4f:
            return r1
    }

    public int getLevelNumber() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public long getMaxXp() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }

    public long getMinXp() {
            r2 = this;
            long r0 = r2.zzb
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.zza
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            long r1 = r3.zzb
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            long r1 = r3.zzc
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            int r1 = r3.getLevelNumber()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "LevelNumber"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            long r1 = r3.getMinXp()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "MinXp"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            long r1 = r3.getMaxXp()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "MaxXp"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            int r0 = r3.getLevelNumber()
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            long r0 = r3.getMinXp()
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            long r0 = r3.getMaxXp()
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
