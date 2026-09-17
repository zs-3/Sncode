package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "CurrentPlayerInfoEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class zza extends com.google.android.gms.games.internal.zzc implements com.google.android.gms.games.CurrentPlayerInfo {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.zza> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getFriendsListVisibilityStatus", id = 1)
    private final int zza;

    static {
            com.google.android.gms.games.zzb r0 = new com.google.android.gms.games.zzb
            r0.<init>()
            com.google.android.gms.games.zza.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zza(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public zza(com.google.android.gms.games.CurrentPlayerInfo r1) {
            r0 = this;
            r0.<init>()
            int r1 = r1.getFriendsListVisibilityStatus()
            r0.zza = r1
            return
    }

    static int zza(com.google.android.gms.games.CurrentPlayerInfo r2) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r2 = r2.getFriendsListVisibilityStatus()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1 = 0
            r0[r1] = r2
            int r2 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r2
    }

    static java.lang.String zzb(com.google.android.gms.games.CurrentPlayerInfo r2) {
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r2)
            int r2 = r2.getFriendsListVisibilityStatus()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r1 = "FriendsListVisibilityStatus"
            r0.add(r1, r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    static boolean zzc(com.google.android.gms.games.CurrentPlayerInfo r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof com.google.android.gms.games.CurrentPlayerInfo
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r3 != r2) goto La
            return r0
        La:
            com.google.android.gms.games.CurrentPlayerInfo r3 = (com.google.android.gms.games.CurrentPlayerInfo) r3
            int r3 = r3.getFriendsListVisibilityStatus()
            int r2 = r2.getFriendsListVisibilityStatus()
            if (r3 != r2) goto L17
            return r0
        L17:
            return r1
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = zzc(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.CurrentPlayerInfo freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.games.CurrentPlayerInfo
    public final int getFriendsListVisibilityStatus() {
            r1 = this;
            int r0 = r1.zza
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

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            com.google.android.gms.games.zzb.zza(r0, r1, r2)
            return
    }
}
