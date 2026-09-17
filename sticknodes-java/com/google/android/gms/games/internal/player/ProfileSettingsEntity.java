package com.google.android.gms.games.internal.player;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ProfileSettingsEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public class ProfileSettingsEntity extends com.google.android.gms.games.internal.zzc implements com.google.android.gms.games.zzy {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.internal.player.ProfileSettingsEntity> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getStatus", id = 1)
    private final com.google.android.gms.common.api.Status zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGamerTag", id = 2)
    private final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isGamerTagExplicitlySet", id = 3)
    private final boolean zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isProfileVisible", id = 4)
    private final boolean zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isVisibilityExplicitlySet", id = 5)
    private final boolean zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getStockProfileImage", id = 6)
    private final com.google.android.gms.games.internal.player.StockProfileImageEntity zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isProfileDiscoverable", id = 7)
    private final boolean zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isAutoSignInEnabled", id = 8)
    private final boolean zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getHttpErrorCode", id = 9)
    private final int zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isSettingsChangesProhibited", id = 10)
    private final boolean zzj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "allowFriendInvites", id = 11)
    private final boolean zzk;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getProfileVisibility", id = 12)
    private final int zzl;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGlobalFriendsListVisibility", id = 13)
    private final int zzm;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isAlwaysAutoSignIn", id = 14)
    private final boolean zzn;

    static {
            com.google.android.gms.games.internal.player.zzg r0 = new com.google.android.gms.games.internal.player.zzg
            r0.<init>()
            com.google.android.gms.games.internal.player.ProfileSettingsEntity.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public ProfileSettingsEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) com.google.android.gms.common.api.Status r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) boolean r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) boolean r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) com.google.android.gms.games.internal.player.StockProfileImageEntity r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) boolean r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) boolean r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) int r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) boolean r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 11) boolean r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 12) int r12, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 13) int r13, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 14) boolean r14) {
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
            r0.zzl = r12
            r0.zzm = r13
            r0.zzn = r14
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.games.zzy
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r4 != r5) goto La
            return r0
        La:
            com.google.android.gms.games.zzy r5 = (com.google.android.gms.games.zzy) r5
            java.lang.String r2 = r4.zzb
            java.lang.String r3 = r5.zze()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Lc5
            boolean r2 = r4.zzc
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r5.zzi()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Lc5
            boolean r2 = r4.zzd
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r5.zzk()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Lc5
            boolean r2 = r4.zze
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r5.zzm()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Lc5
            com.google.android.gms.common.api.Status r2 = r4.zza
            com.google.android.gms.common.api.Status r3 = r5.getStatus()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Lc5
            com.google.android.gms.games.internal.player.StockProfileImageEntity r2 = r4.zzf
            com.google.android.gms.games.internal.player.StockProfileImage r3 = r5.zzd()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Lc5
            boolean r2 = r4.zzg
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r5.zzj()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Lc5
            boolean r2 = r4.zzh
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r5.zzh()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto Lc5
            int r2 = r4.zzi
            int r3 = r5.zzb()
            if (r2 != r3) goto Lc5
            boolean r2 = r4.zzj
            boolean r3 = r5.zzl()
            if (r2 != r3) goto Lc5
            boolean r2 = r4.zzk
            boolean r3 = r5.zzf()
            if (r2 != r3) goto Lc5
            int r2 = r4.zzl
            int r3 = r5.zzc()
            if (r2 != r3) goto Lc5
            int r2 = r4.zzm
            int r3 = r5.zza()
            if (r2 != r3) goto Lc5
            boolean r2 = r4.zzn
            boolean r5 = r5.zzg()
            if (r2 != r5) goto Lc5
            return r0
        Lc5:
            return r1
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zza
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 14
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.zzb
            r2 = 0
            r0[r2] = r1
            boolean r1 = r3.zzc
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            boolean r1 = r3.zzd
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            boolean r1 = r3.zze
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            com.google.android.gms.common.api.Status r1 = r3.zza
            r2 = 4
            r0[r2] = r1
            com.google.android.gms.games.internal.player.StockProfileImageEntity r1 = r3.zzf
            r2 = 5
            r0[r2] = r1
            boolean r1 = r3.zzg
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 6
            r0[r2] = r1
            boolean r1 = r3.zzh
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 7
            r0[r2] = r1
            int r1 = r3.zzi
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 8
            r0[r2] = r1
            boolean r1 = r3.zzj
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 9
            r0[r2] = r1
            boolean r1 = r3.zzk
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 10
            r0[r2] = r1
            int r1 = r3.zzl
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 11
            r0[r2] = r1
            int r1 = r3.zzm
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 12
            r0[r2] = r1
            boolean r1 = r3.zzn
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 13
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            java.lang.String r1 = r3.zzb
            java.lang.String r2 = "GamerTag"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.zzc
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "IsGamerTagExplicitlySet"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.zzd
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "IsProfileVisible"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.zze
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "IsVisibilityExplicitlySet"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            com.google.android.gms.common.api.Status r1 = r3.zza
            java.lang.String r2 = "Status"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            com.google.android.gms.games.internal.player.StockProfileImageEntity r1 = r3.zzf
            java.lang.String r2 = "StockProfileImage"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.zzg
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "IsProfileDiscoverable"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.zzh
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "AutoSignIn"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.zzi
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "httpErrorCode"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.zzj
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "IsSettingsChangesProhibited"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.zzk
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "AllowFriendInvites"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.zzl
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ProfileVisibility"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.zzm
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "global_friends_list_visibility"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.zzn
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "always_auto_sign_in"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.common.api.Status r1 = r4.zza
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r1 = r4.zzb
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            boolean r1 = r4.zzc
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r2, r1)
            boolean r1 = r4.zzd
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r2, r1)
            boolean r1 = r4.zze
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r2, r1)
            com.google.android.gms.games.internal.player.StockProfileImageEntity r1 = r4.zzf
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            boolean r6 = r4.zzg
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            boolean r6 = r4.zzh
            r1 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            int r6 = r4.zzi
            r1 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            boolean r6 = r4.zzj
            r1 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            boolean r6 = r4.zzk
            r1 = 11
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            int r6 = r4.zzl
            r1 = 12
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            int r6 = r4.zzm
            r1 = 13
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            boolean r6 = r4.zzn
            r1 = 14
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    @Override // com.google.android.gms.games.zzy
    public final int zza() {
            r1 = this;
            int r0 = r1.zzm
            return r0
    }

    @Override // com.google.android.gms.games.zzy
    public final int zzb() {
            r1 = this;
            int r0 = r1.zzi
            return r0
    }

    @Override // com.google.android.gms.games.zzy
    public final int zzc() {
            r1 = this;
            int r0 = r1.zzl
            return r0
    }

    @Override // com.google.android.gms.games.zzy
    public final com.google.android.gms.games.internal.player.StockProfileImage zzd() {
            r1 = this;
            com.google.android.gms.games.internal.player.StockProfileImageEntity r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.gms.games.zzy
    public final java.lang.String zze() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.games.zzy
    public final boolean zzf() {
            r1 = this;
            boolean r0 = r1.zzk
            return r0
    }

    @Override // com.google.android.gms.games.zzy
    public final boolean zzg() {
            r1 = this;
            boolean r0 = r1.zzn
            return r0
    }

    @Override // com.google.android.gms.games.zzy
    public final boolean zzh() {
            r1 = this;
            boolean r0 = r1.zzh
            return r0
    }

    @Override // com.google.android.gms.games.zzy
    public final boolean zzi() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.games.zzy
    public final boolean zzj() {
            r1 = this;
            boolean r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.games.zzy
    public final boolean zzk() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.games.zzy
    public final boolean zzl() {
            r1 = this;
            boolean r0 = r1.zzj
            return r0
    }

    @Override // com.google.android.gms.games.zzy
    public final boolean zzm() {
            r1 = this;
            boolean r0 = r1.zze
            return r0
    }
}
