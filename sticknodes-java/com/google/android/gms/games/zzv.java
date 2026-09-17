package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PlayerRelationshipInfoEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class zzv extends com.google.android.gms.games.internal.zzc implements com.google.android.gms.games.PlayerRelationshipInfo {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.zzv> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getFriendStatus", id = 1)
    private final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getNickname", id = 2)
    private final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getInvitationNickname", id = 3)
    private final java.lang.String zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getNicknameAbuseReportToken", id = 4)
    private final java.lang.String zzd;

    static {
            com.google.android.gms.games.zzw r0 = new com.google.android.gms.games.zzw
            r0.<init>()
            com.google.android.gms.games.zzv.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzv(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public zzv(com.google.android.gms.games.PlayerRelationshipInfo r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.getFriendStatus()
            r1.zza = r0
            java.lang.String r0 = r2.zzb()
            r1.zzb = r0
            java.lang.String r0 = r2.zza()
            r1.zzc = r0
            java.lang.String r2 = r2.zzc()
            r1.zzd = r2
            return
    }

    static int zzd(com.google.android.gms.games.PlayerRelationshipInfo r3) {
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.getFriendStatus()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.zzb()
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.zza()
            r2 = 2
            r0[r2] = r1
            java.lang.String r3 = r3.zzc()
            r1 = 3
            r0[r1] = r3
            int r3 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r3
    }

    static java.lang.String zze(com.google.android.gms.games.PlayerRelationshipInfo r3) {
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            int r1 = r3.getFriendStatus()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "FriendStatus"
            r0.add(r2, r1)
            java.lang.String r1 = r3.zzb()
            if (r1 == 0) goto L20
            java.lang.String r1 = r3.zzb()
            java.lang.String r2 = "Nickname"
            r0.add(r2, r1)
        L20:
            java.lang.String r1 = r3.zza()
            if (r1 == 0) goto L2f
            java.lang.String r1 = r3.zza()
            java.lang.String r2 = "InvitationNickname"
            r0.add(r2, r1)
        L2f:
            java.lang.String r1 = r3.zzc()
            if (r1 == 0) goto L3e
            java.lang.String r3 = r3.zza()
            java.lang.String r1 = "NicknameAbuseReportToken"
            r0.add(r1, r3)
        L3e:
            java.lang.String r3 = r0.toString()
            return r3
    }

    static boolean zzf(com.google.android.gms.games.PlayerRelationshipInfo r4, java.lang.Object r5) {
            boolean r0 = r5 instanceof com.google.android.gms.games.PlayerRelationshipInfo
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r4) goto La
            return r0
        La:
            com.google.android.gms.games.PlayerRelationshipInfo r5 = (com.google.android.gms.games.PlayerRelationshipInfo) r5
            int r2 = r5.getFriendStatus()
            int r3 = r4.getFriendStatus()
            if (r2 != r3) goto L41
            java.lang.String r2 = r5.zzb()
            java.lang.String r3 = r4.zzb()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L41
            java.lang.String r2 = r5.zza()
            java.lang.String r3 = r4.zza()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L41
            java.lang.String r5 = r5.zzc()
            java.lang.String r4 = r4.zzc()
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r5, r4)
            if (r4 == 0) goto L41
            return r0
        L41:
            return r1
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = zzf(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.PlayerRelationshipInfo freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final int getFriendStatus() {
            r1 = this;
            int r0 = r1.zza
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

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            com.google.android.gms.games.zzw.zza(r0, r1, r2)
            return
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }
}
