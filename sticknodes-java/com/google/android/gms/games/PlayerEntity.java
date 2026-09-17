package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
@com.google.android.gms.common.util.RetainForClient
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PlayerEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class PlayerEntity extends com.google.android.gms.games.internal.GamesDowngradeableSafeParcel implements com.google.android.gms.games.Player {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.PlayerEntity> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPlayerId", id = 1)
    private java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDisplayName", id = 2)
    private java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getIconImageUri", id = 3)
    private final android.net.Uri zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getHiResImageUri", id = 4)
    private final android.net.Uri zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRetrievedTimestamp", id = 5)
    private final long zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isInCircles", id = 6)
    private final int zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getLastPlayedWithTimestamp", id = 7)
    private final long zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getIconImageUrl", id = 8)
    private final java.lang.String zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getHiResImageUrl", id = 9)
    private final java.lang.String zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTitle", id = 14)
    private final java.lang.String zzj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMostRecentGameInfo", id = 15)
    private final com.google.android.gms.games.internal.player.MostRecentGameInfoEntity zzk;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getLevelInfo", id = 16)
    private final com.google.android.gms.games.PlayerLevelInfo zzl;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isProfileVisible", id = 18)
    private final boolean zzm;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "hasDebugAccess", id = 19)
    private final boolean zzn;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGamerTag", id = 20)
    private final java.lang.String zzo;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getName", id = 21)
    private final java.lang.String zzp;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getBannerImageLandscapeUri", id = 22)
    private final android.net.Uri zzq;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getBannerImageLandscapeUrl", id = 23)
    private final java.lang.String zzr;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getBannerImagePortraitUri", id = 24)
    private final android.net.Uri zzs;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getBannerImagePortraitUrl", id = 25)
    private final java.lang.String zzt;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "-1", getter = "getTotalUnlockedAchievement", id = 29)
    private long zzu;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRelationshipInfo", id = 33)
    private final com.google.android.gms.games.zzv zzv;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCurrentPlayerInfo", id = 35)
    private final com.google.android.gms.games.zza zzw;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isAlwaysAutoSignIn", id = 36)
    private boolean zzx;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGamePlayerId", id = 37)
    private final java.lang.String zzy;

    static {
            com.google.android.gms.games.zzr r0 = new com.google.android.gms.games.zzr
            r0.<init>()
            com.google.android.gms.games.PlayerEntity.CREATOR = r0
            return
    }

    public PlayerEntity(com.google.android.gms.games.Player r7) {
            r6 = this;
            r6.<init>()
            java.lang.String r0 = r7.getPlayerId()
            r6.zza = r0
            java.lang.String r0 = r7.getDisplayName()
            r6.zzb = r0
            android.net.Uri r0 = r7.getIconImageUri()
            r6.zzc = r0
            java.lang.String r0 = r7.getIconImageUrl()
            r6.zzh = r0
            android.net.Uri r0 = r7.getHiResImageUri()
            r6.zzd = r0
            java.lang.String r0 = r7.getHiResImageUrl()
            r6.zzi = r0
            long r0 = r7.getRetrievedTimestamp()
            r6.zze = r0
            int r2 = r7.zza()
            r6.zzf = r2
            long r2 = r7.getLastPlayedWithTimestamp()
            r6.zzg = r2
            java.lang.String r2 = r7.getTitle()
            r6.zzj = r2
            boolean r2 = r7.zzi()
            r6.zzm = r2
            com.google.android.gms.games.internal.player.zza r2 = r7.zzc()
            r3 = 0
            if (r2 != 0) goto L4e
            r4 = r3
            goto L53
        L4e:
            com.google.android.gms.games.internal.player.MostRecentGameInfoEntity r4 = new com.google.android.gms.games.internal.player.MostRecentGameInfoEntity
            r4.<init>(r2)
        L53:
            r6.zzk = r4
            com.google.android.gms.games.PlayerLevelInfo r2 = r7.getLevelInfo()
            r6.zzl = r2
            boolean r2 = r7.zzg()
            r6.zzn = r2
            java.lang.String r2 = r7.zze()
            r6.zzo = r2
            java.lang.String r2 = r7.zzf()
            r6.zzp = r2
            android.net.Uri r2 = r7.getBannerImageLandscapeUri()
            r6.zzq = r2
            java.lang.String r2 = r7.getBannerImageLandscapeUrl()
            r6.zzr = r2
            android.net.Uri r2 = r7.getBannerImagePortraitUri()
            r6.zzs = r2
            java.lang.String r2 = r7.getBannerImagePortraitUrl()
            r6.zzt = r2
            long r4 = r7.zzb()
            r6.zzu = r4
            com.google.android.gms.games.PlayerRelationshipInfo r2 = r7.getRelationshipInfo()
            if (r2 != 0) goto L93
            r4 = r3
            goto L9c
        L93:
            com.google.android.gms.games.zzv r4 = new com.google.android.gms.games.zzv
            java.lang.Object r2 = r2.freeze()
            r4.<init>(r2)
        L9c:
            r6.zzv = r4
            com.google.android.gms.games.CurrentPlayerInfo r2 = r7.getCurrentPlayerInfo()
            if (r2 != 0) goto La5
            goto La9
        La5:
            java.lang.Object r3 = r2.freeze()
        La9:
            com.google.android.gms.games.zza r3 = (com.google.android.gms.games.zza) r3
            r6.zzw = r3
            boolean r2 = r7.zzh()
            r6.zzx = r2
            java.lang.String r7 = r7.zzd()
            r6.zzy = r7
            java.lang.String r7 = r6.zza
            com.google.android.gms.common.internal.Asserts.checkNotNull(r7)
            java.lang.String r7 = r6.zzb
            com.google.android.gms.common.internal.Asserts.checkNotNull(r7)
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto Lcb
            r7 = 1
            goto Lcc
        Lcb:
            r7 = 0
        Lcc:
            com.google.android.gms.common.internal.Asserts.checkState(r7)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    PlayerEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) android.net.Uri r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) android.net.Uri r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) long r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) int r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) long r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) java.lang.String r13, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) java.lang.String r14, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 14) java.lang.String r15, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 15) com.google.android.gms.games.internal.player.MostRecentGameInfoEntity r16, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 16) com.google.android.gms.games.PlayerLevelInfo r17, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 18) boolean r18, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 19) boolean r19, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 20) java.lang.String r20, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 21) java.lang.String r21, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 22) android.net.Uri r22, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 23) java.lang.String r23, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 24) android.net.Uri r24, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 25) java.lang.String r25, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 29) long r26, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 33) com.google.android.gms.games.zzv r28, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 35) com.google.android.gms.games.zza r29, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 36) boolean r30, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 37) java.lang.String r31) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.zza = r1
            r1 = r5
            r0.zzb = r1
            r1 = r6
            r0.zzc = r1
            r1 = r13
            r0.zzh = r1
            r1 = r7
            r0.zzd = r1
            r1 = r14
            r0.zzi = r1
            r1 = r8
            r0.zze = r1
            r1 = r10
            r0.zzf = r1
            r1 = r11
            r0.zzg = r1
            r1 = r15
            r0.zzj = r1
            r1 = r18
            r0.zzm = r1
            r1 = r16
            r0.zzk = r1
            r1 = r17
            r0.zzl = r1
            r1 = r19
            r0.zzn = r1
            r1 = r20
            r0.zzo = r1
            r1 = r21
            r0.zzp = r1
            r1 = r22
            r0.zzq = r1
            r1 = r23
            r0.zzr = r1
            r1 = r24
            r0.zzs = r1
            r1 = r25
            r0.zzt = r1
            r1 = r26
            r0.zzu = r1
            r1 = r28
            r0.zzv = r1
            r1 = r29
            r0.zzw = r1
            r1 = r30
            r0.zzx = r1
            r1 = r31
            r0.zzy = r1
            return
    }

    static int zzj(com.google.android.gms.games.Player r3) {
            r0 = 17
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.getPlayerId()
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.getDisplayName()
            r2 = 1
            r0[r2] = r1
            boolean r1 = r3.zzg()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            android.net.Uri r1 = r3.getIconImageUri()
            r2 = 3
            r0[r2] = r1
            android.net.Uri r1 = r3.getHiResImageUri()
            r2 = 4
            r0[r2] = r1
            long r1 = r3.getRetrievedTimestamp()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 5
            r0[r2] = r1
            java.lang.String r1 = r3.getTitle()
            r2 = 6
            r0[r2] = r1
            com.google.android.gms.games.PlayerLevelInfo r1 = r3.getLevelInfo()
            r2 = 7
            r0[r2] = r1
            java.lang.String r1 = r3.zze()
            r2 = 8
            r0[r2] = r1
            java.lang.String r1 = r3.zzf()
            r2 = 9
            r0[r2] = r1
            android.net.Uri r1 = r3.getBannerImageLandscapeUri()
            r2 = 10
            r0[r2] = r1
            android.net.Uri r1 = r3.getBannerImagePortraitUri()
            r2 = 11
            r0[r2] = r1
            long r1 = r3.zzb()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 12
            r0[r2] = r1
            com.google.android.gms.games.PlayerRelationshipInfo r1 = r3.getRelationshipInfo()
            r2 = 13
            r0[r2] = r1
            com.google.android.gms.games.CurrentPlayerInfo r1 = r3.getCurrentPlayerInfo()
            r2 = 14
            r0[r2] = r1
            boolean r1 = r3.zzh()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 15
            r0[r2] = r1
            java.lang.String r3 = r3.zzd()
            r1 = 16
            r0[r1] = r3
            int r3 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r3
    }

    static /* synthetic */ java.lang.Integer zzk() {
            java.lang.Integer r0 = com.google.android.gms.common.internal.DowngradeableSafeParcel.getUnparcelClientVersion()
            return r0
    }

    static java.lang.String zzl(com.google.android.gms.games.Player r3) {
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            java.lang.String r1 = r3.getPlayerId()
            java.lang.String r2 = "PlayerId"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getDisplayName()
            java.lang.String r2 = "DisplayName"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.zzg()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "HasDebugAccess"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            android.net.Uri r1 = r3.getIconImageUri()
            java.lang.String r2 = "IconImageUri"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getIconImageUrl()
            java.lang.String r2 = "IconImageUrl"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            android.net.Uri r1 = r3.getHiResImageUri()
            java.lang.String r2 = "HiResImageUri"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getHiResImageUrl()
            java.lang.String r2 = "HiResImageUrl"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            long r1 = r3.getRetrievedTimestamp()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "RetrievedTimestamp"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getTitle()
            java.lang.String r2 = "Title"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            com.google.android.gms.games.PlayerLevelInfo r1 = r3.getLevelInfo()
            java.lang.String r2 = "LevelInfo"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.zze()
            java.lang.String r2 = "GamerTag"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.zzf()
            java.lang.String r2 = "Name"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            android.net.Uri r1 = r3.getBannerImageLandscapeUri()
            java.lang.String r2 = "BannerImageLandscapeUri"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getBannerImageLandscapeUrl()
            java.lang.String r2 = "BannerImageLandscapeUrl"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            android.net.Uri r1 = r3.getBannerImagePortraitUri()
            java.lang.String r2 = "BannerImagePortraitUri"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getBannerImagePortraitUrl()
            java.lang.String r2 = "BannerImagePortraitUrl"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            com.google.android.gms.games.CurrentPlayerInfo r1 = r3.getCurrentPlayerInfo()
            java.lang.String r2 = "CurrentPlayerInfo"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            long r1 = r3.zzb()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "TotalUnlockedAchievement"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.zzh()
            if (r1 == 0) goto Ld7
            boolean r1 = r3.zzh()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "AlwaysAutoSignIn"
            r0.add(r2, r1)
        Ld7:
            com.google.android.gms.games.PlayerRelationshipInfo r1 = r3.getRelationshipInfo()
            if (r1 == 0) goto Le6
            com.google.android.gms.games.PlayerRelationshipInfo r1 = r3.getRelationshipInfo()
            java.lang.String r2 = "RelationshipInfo"
            r0.add(r2, r1)
        Le6:
            java.lang.String r1 = r3.zzd()
            if (r1 == 0) goto Lf5
            java.lang.String r3 = r3.zzd()
            java.lang.String r1 = "GamePlayerId"
            r0.add(r1, r3)
        Lf5:
            java.lang.String r3 = r0.toString()
            return r3
    }

    static /* synthetic */ boolean zzm(java.lang.Integer r0) {
            boolean r0 = com.google.android.gms.games.internal.GamesDowngradeableSafeParcel.zzp(r0)
            return r0
    }

    static /* synthetic */ boolean zzn(java.lang.String r0) {
            boolean r0 = com.google.android.gms.common.internal.DowngradeableSafeParcel.canUnparcelSafely(r0)
            return r0
    }

    static boolean zzo(com.google.android.gms.games.Player r5, java.lang.Object r6) {
            boolean r0 = r6 instanceof com.google.android.gms.games.Player
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r6) goto La
            return r0
        La:
            com.google.android.gms.games.Player r6 = (com.google.android.gms.games.Player) r6
            java.lang.String r2 = r6.getPlayerId()
            java.lang.String r3 = r5.getPlayerId()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L11b
            java.lang.String r2 = r6.getDisplayName()
            java.lang.String r3 = r5.getDisplayName()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L11b
            boolean r2 = r6.zzg()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r5.zzg()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L11b
            android.net.Uri r2 = r6.getIconImageUri()
            android.net.Uri r3 = r5.getIconImageUri()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L11b
            android.net.Uri r2 = r6.getHiResImageUri()
            android.net.Uri r3 = r5.getHiResImageUri()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L11b
            long r2 = r6.getRetrievedTimestamp()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r5.getRetrievedTimestamp()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L11b
            java.lang.String r2 = r6.getTitle()
            java.lang.String r3 = r5.getTitle()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L11b
            com.google.android.gms.games.PlayerLevelInfo r2 = r6.getLevelInfo()
            com.google.android.gms.games.PlayerLevelInfo r3 = r5.getLevelInfo()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L11b
            java.lang.String r2 = r6.zze()
            java.lang.String r3 = r5.zze()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L11b
            java.lang.String r2 = r6.zzf()
            java.lang.String r3 = r5.zzf()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L11b
            android.net.Uri r2 = r6.getBannerImageLandscapeUri()
            android.net.Uri r3 = r5.getBannerImageLandscapeUri()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L11b
            android.net.Uri r2 = r6.getBannerImagePortraitUri()
            android.net.Uri r3 = r5.getBannerImagePortraitUri()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L11b
            long r2 = r6.zzb()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r5.zzb()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L11b
            com.google.android.gms.games.CurrentPlayerInfo r2 = r6.getCurrentPlayerInfo()
            com.google.android.gms.games.CurrentPlayerInfo r3 = r5.getCurrentPlayerInfo()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L11b
            com.google.android.gms.games.PlayerRelationshipInfo r2 = r6.getRelationshipInfo()
            com.google.android.gms.games.PlayerRelationshipInfo r3 = r5.getRelationshipInfo()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L11b
            boolean r2 = r6.zzh()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r5.zzh()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L11b
            java.lang.String r6 = r6.zzd()
            java.lang.String r5 = r5.zzd()
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r6, r5)
            if (r5 == 0) goto L11b
            return r0
        L11b:
            return r1
    }

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = zzo(r0, r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    public com.google.android.gms.games.Player freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.Player freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public android.net.Uri getBannerImageLandscapeUri() {
            r1 = this;
            android.net.Uri r0 = r1.zzq
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getBannerImageLandscapeUrl() {
            r1 = this;
            java.lang.String r0 = r1.zzr
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public android.net.Uri getBannerImagePortraitUri() {
            r1 = this;
            android.net.Uri r0 = r1.zzs
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getBannerImagePortraitUrl() {
            r1 = this;
            java.lang.String r0 = r1.zzt
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public com.google.android.gms.games.CurrentPlayerInfo getCurrentPlayerInfo() {
            r1 = this;
            com.google.android.gms.games.zza r0 = r1.zzw
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getDisplayName() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public void getDisplayName(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.zzb
            com.google.android.gms.common.util.DataUtils.copyStringToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.Player
    public android.net.Uri getHiResImageUri() {
            r1 = this;
            android.net.Uri r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getHiResImageUrl() {
            r1 = this;
            java.lang.String r0 = r1.zzi
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public android.net.Uri getIconImageUri() {
            r1 = this;
            android.net.Uri r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getIconImageUrl() {
            r1 = this;
            java.lang.String r0 = r1.zzh
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public long getLastPlayedWithTimestamp() {
            r2 = this;
            long r0 = r2.zzg
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public com.google.android.gms.games.PlayerLevelInfo getLevelInfo() {
            r1 = this;
            com.google.android.gms.games.PlayerLevelInfo r0 = r1.zzl
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getPlayerId() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public com.google.android.gms.games.PlayerRelationshipInfo getRelationshipInfo() {
            r1 = this;
            com.google.android.gms.games.zzv r0 = r1.zzv
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public long getRetrievedTimestamp() {
            r2 = this;
            long r0 = r2.zze
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.zzj
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public void getTitle(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.zzj
            com.google.android.gms.common.util.DataUtils.copyStringToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.Player
    public boolean hasHiResImage() {
            r1 = this;
            android.net.Uri r0 = r1.getHiResImageUri()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public boolean hasIconImage() {
            r1 = this;
            android.net.Uri r0 = r1.getIconImageUri()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = zzj(r1)
            return r0
    }

    @Override // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
            r1 = this;
            r0 = 1
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = zzl(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r7, int r8) {
            r6 = this;
            boolean r0 = r6.shouldDowngrade()
            if (r0 == 0) goto L30
            java.lang.String r8 = r6.zza
            r7.writeString(r8)
            java.lang.String r8 = r6.zzb
            r7.writeString(r8)
            android.net.Uri r8 = r6.zzc
            r0 = 0
            if (r8 != 0) goto L17
            r8 = r0
            goto L1b
        L17:
            java.lang.String r8 = r8.toString()
        L1b:
            r7.writeString(r8)
            android.net.Uri r8 = r6.zzd
            if (r8 != 0) goto L23
            goto L27
        L23:
            java.lang.String r0 = r8.toString()
        L27:
            r7.writeString(r0)
            long r0 = r6.zze
            r7.writeLong(r0)
            return
        L30:
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r7)
            r1 = 1
            java.lang.String r2 = r6.getPlayerId()
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r7, r1, r2, r3)
            r1 = 2
            java.lang.String r2 = r6.getDisplayName()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r7, r1, r2, r3)
            r1 = 3
            android.net.Uri r2 = r6.getIconImageUri()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r7, r1, r2, r8, r3)
            r1 = 4
            android.net.Uri r2 = r6.getHiResImageUri()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r7, r1, r2, r8, r3)
            r1 = 5
            long r4 = r6.getRetrievedTimestamp()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r7, r1, r4)
            r1 = 6
            int r2 = r6.zzf
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r7, r1, r2)
            r1 = 7
            long r4 = r6.getLastPlayedWithTimestamp()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r7, r1, r4)
            r1 = 8
            java.lang.String r2 = r6.getIconImageUrl()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r7, r1, r2, r3)
            r1 = 9
            java.lang.String r2 = r6.getHiResImageUrl()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r7, r1, r2, r3)
            r1 = 14
            java.lang.String r2 = r6.getTitle()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r7, r1, r2, r3)
            r1 = 15
            com.google.android.gms.games.internal.player.MostRecentGameInfoEntity r2 = r6.zzk
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r7, r1, r2, r8, r3)
            r1 = 16
            com.google.android.gms.games.PlayerLevelInfo r2 = r6.getLevelInfo()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r7, r1, r2, r8, r3)
            r1 = 18
            boolean r2 = r6.zzm
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r7, r1, r2)
            r1 = 19
            boolean r2 = r6.zzn
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r7, r1, r2)
            r1 = 20
            java.lang.String r2 = r6.zzo
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r7, r1, r2, r3)
            r1 = 21
            java.lang.String r2 = r6.zzp
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r7, r1, r2, r3)
            r1 = 22
            android.net.Uri r2 = r6.getBannerImageLandscapeUri()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r7, r1, r2, r8, r3)
            r1 = 23
            java.lang.String r2 = r6.getBannerImageLandscapeUrl()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r7, r1, r2, r3)
            r1 = 24
            android.net.Uri r2 = r6.getBannerImagePortraitUri()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r7, r1, r2, r8, r3)
            r1 = 25
            java.lang.String r2 = r6.getBannerImagePortraitUrl()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r7, r1, r2, r3)
            r1 = 29
            long r4 = r6.zzu
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r7, r1, r4)
            r1 = 33
            com.google.android.gms.games.PlayerRelationshipInfo r2 = r6.getRelationshipInfo()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r7, r1, r2, r8, r3)
            r1 = 35
            com.google.android.gms.games.CurrentPlayerInfo r2 = r6.getCurrentPlayerInfo()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r7, r1, r2, r8, r3)
            r8 = 36
            boolean r1 = r6.zzx
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r7, r8, r1)
            r8 = 37
            java.lang.String r1 = r6.zzy
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r7, r8, r1, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r7, r0)
            return
    }

    @Override // com.google.android.gms.games.Player
    public final int zza() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final long zzb() {
            r2 = this;
            long r0 = r2.zzu
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.internal.player.zza zzc() {
            r1 = this;
            com.google.android.gms.games.internal.player.MostRecentGameInfoEntity r0 = r1.zzk
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final java.lang.String zzd() {
            r1 = this;
            java.lang.String r0 = r1.zzy
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final java.lang.String zze() {
            r1 = this;
            java.lang.String r0 = r1.zzo
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final java.lang.String zzf() {
            r1 = this;
            java.lang.String r0 = r1.zzp
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzg() {
            r1 = this;
            boolean r0 = r1.zzn
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzh() {
            r1 = this;
            boolean r0 = r1.zzx
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzi() {
            r1 = this;
            boolean r0 = r1.zzm
            return r0
    }
}
