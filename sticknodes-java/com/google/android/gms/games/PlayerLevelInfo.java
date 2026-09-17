package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PlayerLevelInfoCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class PlayerLevelInfo extends com.google.android.gms.games.internal.zzc {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.PlayerLevelInfo> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCurrentXpTotal", id = 1)
    private final long zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getLastLevelUpTimestamp", id = 2)
    private final long zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCurrentLevel", id = 3)
    private final com.google.android.gms.games.PlayerLevel zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getNextLevel", id = 4)
    private final com.google.android.gms.games.PlayerLevel zzd;

    static {
            com.google.android.gms.games.zzu r0 = new com.google.android.gms.games.zzu
            r0.<init>()
            com.google.android.gms.games.PlayerLevelInfo.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public PlayerLevelInfo(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) long r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) long r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.games.PlayerLevel r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.games.PlayerLevel r9) {
            r3 = this;
            r3.<init>()
            r0 = -1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            r3.zza = r4
            r3.zzb = r6
            r3.zzc = r8
            r3.zzd = r9
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.gms.games.PlayerLevelInfo
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r6 != r5) goto La
            return r0
        La:
            com.google.android.gms.games.PlayerLevelInfo r6 = (com.google.android.gms.games.PlayerLevelInfo) r6
            long r2 = r5.zza
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r6.zza
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L45
            long r2 = r5.zzb
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r6.zzb
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L45
            com.google.android.gms.games.PlayerLevel r2 = r5.zzc
            com.google.android.gms.games.PlayerLevel r3 = r6.zzc
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L45
            com.google.android.gms.games.PlayerLevel r2 = r5.zzd
            com.google.android.gms.games.PlayerLevel r6 = r6.zzd
            boolean r6 = com.google.android.gms.common.internal.Objects.equal(r2, r6)
            if (r6 == 0) goto L45
            return r0
        L45:
            return r1
    }

    public com.google.android.gms.games.PlayerLevel getCurrentLevel() {
            r1 = this;
            com.google.android.gms.games.PlayerLevel r0 = r1.zzc
            return r0
    }

    public long getCurrentXpTotal() {
            r2 = this;
            long r0 = r2.zza
            return r0
    }

    public long getLastLevelUpTimestamp() {
            r2 = this;
            long r0 = r2.zzb
            return r0
    }

    public com.google.android.gms.games.PlayerLevel getNextLevel() {
            r1 = this;
            com.google.android.gms.games.PlayerLevel r0 = r1.zzd
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r1 = r3.zza
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            long r1 = r3.zzb
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            com.google.android.gms.games.PlayerLevel r1 = r3.zzc
            r2 = 2
            r0[r2] = r1
            com.google.android.gms.games.PlayerLevel r1 = r3.zzd
            r2 = 3
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public boolean isMaxLevel() {
            r2 = this;
            com.google.android.gms.games.PlayerLevel r0 = r2.zzc
            com.google.android.gms.games.PlayerLevel r1 = r2.zzd
            boolean r0 = r0.equals(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            long r1 = r4.getCurrentXpTotal()
            r3 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r3, r1)
            long r1 = r4.getLastLevelUpTimestamp()
            r3 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r3, r1)
            com.google.android.gms.games.PlayerLevel r1 = r4.getCurrentLevel()
            r2 = 3
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.games.PlayerLevel r1 = r4.getNextLevel()
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
