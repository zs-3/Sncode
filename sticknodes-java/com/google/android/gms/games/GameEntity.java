package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
@com.google.android.gms.common.util.RetainForClient
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "GameEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class GameEntity extends com.google.android.gms.games.internal.GamesDowngradeableSafeParcel implements com.google.android.gms.games.Game {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.GameEntity> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getApplicationId", id = 1)
    private final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDisplayName", id = 2)
    private final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPrimaryCategory", id = 3)
    private final java.lang.String zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSecondaryCategory", id = 4)
    private final java.lang.String zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDescription", id = 5)
    private final java.lang.String zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDeveloperName", id = 6)
    private final java.lang.String zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getIconImageUri", id = 7)
    private final android.net.Uri zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getHiResImageUri", id = 8)
    private final android.net.Uri zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getFeaturedImageUri", id = 9)
    private final android.net.Uri zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isPlayEnabledGame", id = 10)
    private final boolean zzj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isInstanceInstalled", id = 11)
    private final boolean zzk;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getInstancePackageName", id = 12)
    private final java.lang.String zzl;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGameplayAclStatus", id = 13)
    private final int zzm;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAchievementTotalCount", id = 14)
    private final int zzn;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getLeaderboardCount", id = 15)
    private final int zzo;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isRealTimeMultiplayerEnabled", id = 16)
    private final boolean zzp;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isTurnBasedMultiplayerEnabled", id = 17)
    private final boolean zzq;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getIconImageUrl", id = 18)
    private final java.lang.String zzr;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getHiResImageUrl", id = 19)
    private final java.lang.String zzs;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getFeaturedImageUrl", id = 20)
    private final java.lang.String zzt;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isMuted", id = 21)
    private final boolean zzu;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isIdentitySharingConfirmed", id = 22)
    private final boolean zzv;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "areSnapshotsEnabled", id = 23)
    private final boolean zzw;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getThemeColor", id = 24)
    private final java.lang.String zzx;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "hasGamepadSupport", id = 25)
    private final boolean zzy;

    static {
            com.google.android.gms.games.zze r0 = new com.google.android.gms.games.zze
            r0.<init>()
            com.google.android.gms.games.GameEntity.CREATOR = r0
            return
    }

    public GameEntity(com.google.android.gms.games.Game r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.getApplicationId()
            r1.zza = r0
            java.lang.String r0 = r2.getPrimaryCategory()
            r1.zzc = r0
            java.lang.String r0 = r2.getSecondaryCategory()
            r1.zzd = r0
            java.lang.String r0 = r2.getDescription()
            r1.zze = r0
            java.lang.String r0 = r2.getDeveloperName()
            r1.zzf = r0
            java.lang.String r0 = r2.getDisplayName()
            r1.zzb = r0
            android.net.Uri r0 = r2.getIconImageUri()
            r1.zzg = r0
            java.lang.String r0 = r2.getIconImageUrl()
            r1.zzr = r0
            android.net.Uri r0 = r2.getHiResImageUri()
            r1.zzh = r0
            java.lang.String r0 = r2.getHiResImageUrl()
            r1.zzs = r0
            android.net.Uri r0 = r2.getFeaturedImageUri()
            r1.zzi = r0
            java.lang.String r0 = r2.getFeaturedImageUrl()
            r1.zzt = r0
            boolean r0 = r2.zze()
            r1.zzj = r0
            boolean r0 = r2.zzc()
            r1.zzk = r0
            java.lang.String r0 = r2.zza()
            r1.zzl = r0
            r0 = 1
            r1.zzm = r0
            int r0 = r2.getAchievementTotalCount()
            r1.zzn = r0
            int r0 = r2.getLeaderboardCount()
            r1.zzo = r0
            boolean r0 = r2.zzf()
            r1.zzp = r0
            boolean r0 = r2.zzg()
            r1.zzq = r0
            boolean r0 = r2.zzd()
            r1.zzu = r0
            boolean r0 = r2.zzb()
            r1.zzv = r0
            boolean r0 = r2.areSnapshotsEnabled()
            r1.zzw = r0
            java.lang.String r0 = r2.getThemeColor()
            r1.zzx = r0
            boolean r2 = r2.hasGamepadSupport()
            r1.zzy = r2
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    GameEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.String r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) android.net.Uri r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) android.net.Uri r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) android.net.Uri r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) boolean r12, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 11) boolean r13, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 12) java.lang.String r14, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 13) int r15, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 14) int r16, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 15) int r17, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 16) boolean r18, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 17) boolean r19, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 18) java.lang.String r20, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 19) java.lang.String r21, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 20) java.lang.String r22, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 21) boolean r23, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 22) boolean r24, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 23) boolean r25, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 24) java.lang.String r26, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 25) boolean r27) {
            r2 = this;
            r0 = r2
            r2.<init>()
            r1 = r3
            r0.zza = r1
            r1 = r4
            r0.zzb = r1
            r1 = r5
            r0.zzc = r1
            r1 = r6
            r0.zzd = r1
            r1 = r7
            r0.zze = r1
            r1 = r8
            r0.zzf = r1
            r1 = r9
            r0.zzg = r1
            r1 = r20
            r0.zzr = r1
            r1 = r10
            r0.zzh = r1
            r1 = r21
            r0.zzs = r1
            r1 = r11
            r0.zzi = r1
            r1 = r22
            r0.zzt = r1
            r1 = r12
            r0.zzj = r1
            r1 = r13
            r0.zzk = r1
            r1 = r14
            r0.zzl = r1
            r1 = r15
            r0.zzm = r1
            r1 = r16
            r0.zzn = r1
            r1 = r17
            r0.zzo = r1
            r1 = r18
            r0.zzp = r1
            r1 = r19
            r0.zzq = r1
            r1 = r23
            r0.zzu = r1
            r1 = r24
            r0.zzv = r1
            r1 = r25
            r0.zzw = r1
            r1 = r26
            r0.zzx = r1
            r1 = r27
            r0.zzy = r1
            return
    }

    static int zzh(com.google.android.gms.games.Game r3) {
            r0 = 21
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.getApplicationId()
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.getDisplayName()
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.getPrimaryCategory()
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = r3.getSecondaryCategory()
            r2 = 3
            r0[r2] = r1
            java.lang.String r1 = r3.getDescription()
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = r3.getDeveloperName()
            r2 = 5
            r0[r2] = r1
            android.net.Uri r1 = r3.getIconImageUri()
            r2 = 6
            r0[r2] = r1
            android.net.Uri r1 = r3.getHiResImageUri()
            r2 = 7
            r0[r2] = r1
            android.net.Uri r1 = r3.getFeaturedImageUri()
            r2 = 8
            r0[r2] = r1
            boolean r1 = r3.zze()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 9
            r0[r2] = r1
            boolean r1 = r3.zzc()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 10
            r0[r2] = r1
            java.lang.String r1 = r3.zza()
            r2 = 11
            r0[r2] = r1
            int r1 = r3.getAchievementTotalCount()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 12
            r0[r2] = r1
            int r1 = r3.getLeaderboardCount()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 13
            r0[r2] = r1
            boolean r1 = r3.zzf()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 14
            r0[r2] = r1
            boolean r1 = r3.zzg()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 15
            r0[r2] = r1
            boolean r1 = r3.zzd()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 16
            r0[r2] = r1
            boolean r1 = r3.zzb()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 17
            r0[r2] = r1
            boolean r1 = r3.areSnapshotsEnabled()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 18
            r0[r2] = r1
            java.lang.String r1 = r3.getThemeColor()
            r2 = 19
            r0[r2] = r1
            boolean r3 = r3.hasGamepadSupport()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1 = 20
            r0[r1] = r3
            int r3 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r3
    }

    static /* synthetic */ java.lang.Integer zzi() {
            java.lang.Integer r0 = com.google.android.gms.common.internal.DowngradeableSafeParcel.getUnparcelClientVersion()
            return r0
    }

    static java.lang.String zzj(com.google.android.gms.games.Game r3) {
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            java.lang.String r1 = r3.getApplicationId()
            java.lang.String r2 = "ApplicationId"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getDisplayName()
            java.lang.String r2 = "DisplayName"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getPrimaryCategory()
            java.lang.String r2 = "PrimaryCategory"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getSecondaryCategory()
            java.lang.String r2 = "SecondaryCategory"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getDescription()
            java.lang.String r2 = "Description"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getDeveloperName()
            java.lang.String r2 = "DeveloperName"
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
            android.net.Uri r1 = r3.getFeaturedImageUri()
            java.lang.String r2 = "FeaturedImageUri"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getFeaturedImageUrl()
            java.lang.String r2 = "FeaturedImageUrl"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.zze()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "PlayEnabledGame"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.zzc()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "InstanceInstalled"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.zza()
            java.lang.String r2 = "InstancePackageName"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.getAchievementTotalCount()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "AchievementTotalCount"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.getLeaderboardCount()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "LeaderboardCount"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.areSnapshotsEnabled()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "AreSnapshotsEnabled"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getThemeColor()
            java.lang.String r2 = "ThemeColor"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r3 = r3.hasGamepadSupport()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r1 = "HasGamepadSupport"
            com.google.android.gms.common.internal.Objects$ToStringHelper r3 = r0.add(r1, r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    static /* synthetic */ boolean zzk(java.lang.Integer r0) {
            boolean r0 = com.google.android.gms.games.internal.GamesDowngradeableSafeParcel.zzp(r0)
            return r0
    }

    static /* synthetic */ boolean zzl(java.lang.String r0) {
            boolean r0 = com.google.android.gms.common.internal.DowngradeableSafeParcel.canUnparcelSafely(r0)
            return r0
    }

    static boolean zzm(com.google.android.gms.games.Game r4, java.lang.Object r5) {
            boolean r0 = r5 instanceof com.google.android.gms.games.Game
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r4 != r5) goto La
            return r0
        La:
            com.google.android.gms.games.Game r5 = (com.google.android.gms.games.Game) r5
            java.lang.String r2 = r5.getApplicationId()
            java.lang.String r3 = r4.getApplicationId()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            java.lang.String r2 = r5.getDisplayName()
            java.lang.String r3 = r4.getDisplayName()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            java.lang.String r2 = r5.getPrimaryCategory()
            java.lang.String r3 = r4.getPrimaryCategory()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            java.lang.String r2 = r5.getSecondaryCategory()
            java.lang.String r3 = r4.getSecondaryCategory()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            java.lang.String r2 = r5.getDescription()
            java.lang.String r3 = r4.getDescription()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            java.lang.String r2 = r5.getDeveloperName()
            java.lang.String r3 = r4.getDeveloperName()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            android.net.Uri r2 = r5.getIconImageUri()
            android.net.Uri r3 = r4.getIconImageUri()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            android.net.Uri r2 = r5.getHiResImageUri()
            android.net.Uri r3 = r4.getHiResImageUri()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            android.net.Uri r2 = r5.getFeaturedImageUri()
            android.net.Uri r3 = r4.getFeaturedImageUri()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            boolean r2 = r5.zze()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r4.zze()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            boolean r2 = r5.zzc()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r4.zzc()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            java.lang.String r2 = r5.zza()
            java.lang.String r3 = r4.zza()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            int r2 = r5.getAchievementTotalCount()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r4.getAchievementTotalCount()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            int r2 = r5.getLeaderboardCount()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r4.getLeaderboardCount()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            boolean r2 = r5.zzf()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r4.zzf()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            boolean r2 = r5.zzg()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r4.zzg()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            boolean r2 = r5.zzd()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r4.zzd()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            boolean r2 = r5.zzb()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r4.zzb()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            boolean r2 = r5.areSnapshotsEnabled()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r4.areSnapshotsEnabled()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            java.lang.String r2 = r5.getThemeColor()
            java.lang.String r3 = r4.getThemeColor()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L183
            boolean r5 = r5.hasGamepadSupport()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r4 = r4.hasGamepadSupport()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r5, r4)
            if (r4 == 0) goto L183
            return r0
        L183:
            return r1
    }

    @Override // com.google.android.gms.games.Game
    public boolean areSnapshotsEnabled() {
            r1 = this;
            boolean r0 = r1.zzw
            return r0
    }

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = zzm(r0, r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    public com.google.android.gms.games.Game freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.Game freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public int getAchievementTotalCount() {
            r1 = this;
            int r0 = r1.zzn
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getApplicationId() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public void getDescription(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.zze
            com.google.android.gms.common.util.DataUtils.copyStringToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getDeveloperName() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public void getDeveloperName(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.zzf
            com.google.android.gms.common.util.DataUtils.copyStringToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getDisplayName() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public void getDisplayName(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.zzb
            com.google.android.gms.common.util.DataUtils.copyStringToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.Game
    public android.net.Uri getFeaturedImageUri() {
            r1 = this;
            android.net.Uri r0 = r1.zzi
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getFeaturedImageUrl() {
            r1 = this;
            java.lang.String r0 = r1.zzt
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public android.net.Uri getHiResImageUri() {
            r1 = this;
            android.net.Uri r0 = r1.zzh
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getHiResImageUrl() {
            r1 = this;
            java.lang.String r0 = r1.zzs
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public android.net.Uri getIconImageUri() {
            r1 = this;
            android.net.Uri r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getIconImageUrl() {
            r1 = this;
            java.lang.String r0 = r1.zzr
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public int getLeaderboardCount() {
            r1 = this;
            int r0 = r1.zzo
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getPrimaryCategory() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getSecondaryCategory() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public java.lang.String getThemeColor() {
            r1 = this;
            java.lang.String r0 = r1.zzx
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public boolean hasGamepadSupport() {
            r1 = this;
            boolean r0 = r1.zzy
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = zzh(r1)
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
            java.lang.String r0 = zzj(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            boolean r0 = r4.shouldDowngrade()
            if (r0 == 0) goto L6a
            java.lang.String r6 = r4.zza
            r5.writeString(r6)
            java.lang.String r6 = r4.zzb
            r5.writeString(r6)
            java.lang.String r6 = r4.zzc
            r5.writeString(r6)
            java.lang.String r6 = r4.zzd
            r5.writeString(r6)
            java.lang.String r6 = r4.zze
            r5.writeString(r6)
            java.lang.String r6 = r4.zzf
            r5.writeString(r6)
            android.net.Uri r6 = r4.zzg
            r0 = 0
            if (r6 != 0) goto L2b
            r6 = r0
            goto L2f
        L2b:
            java.lang.String r6 = r6.toString()
        L2f:
            r5.writeString(r6)
            android.net.Uri r6 = r4.zzh
            if (r6 != 0) goto L38
            r6 = r0
            goto L3c
        L38:
            java.lang.String r6 = r6.toString()
        L3c:
            r5.writeString(r6)
            android.net.Uri r6 = r4.zzi
            if (r6 != 0) goto L44
            goto L48
        L44:
            java.lang.String r0 = r6.toString()
        L48:
            r5.writeString(r0)
            boolean r6 = r4.zzj
            r5.writeInt(r6)
            boolean r6 = r4.zzk
            r5.writeInt(r6)
            java.lang.String r6 = r4.zzl
            r5.writeString(r6)
            int r6 = r4.zzm
            r5.writeInt(r6)
            int r6 = r4.zzn
            r5.writeInt(r6)
            int r6 = r4.zzo
            r5.writeInt(r6)
            return
        L6a:
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r1 = 1
            java.lang.String r2 = r4.getApplicationId()
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r2, r3)
            r1 = 2
            java.lang.String r2 = r4.getDisplayName()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r2, r3)
            r1 = 3
            java.lang.String r2 = r4.getPrimaryCategory()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r2, r3)
            r1 = 4
            java.lang.String r2 = r4.getSecondaryCategory()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r2, r3)
            r1 = 5
            java.lang.String r2 = r4.getDescription()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r2, r3)
            r1 = 6
            java.lang.String r2 = r4.getDeveloperName()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r2, r3)
            r1 = 7
            android.net.Uri r2 = r4.getIconImageUri()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r1, r2, r6, r3)
            r1 = 8
            android.net.Uri r2 = r4.getHiResImageUri()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r1, r2, r6, r3)
            r1 = 9
            android.net.Uri r2 = r4.getFeaturedImageUri()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r1, r2, r6, r3)
            r6 = 10
            boolean r1 = r4.zzj
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r1)
            r6 = 11
            boolean r1 = r4.zzk
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r1)
            r6 = 12
            java.lang.String r1 = r4.zzl
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r1, r3)
            r6 = 13
            int r1 = r4.zzm
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r6, r1)
            r6 = 14
            int r1 = r4.getAchievementTotalCount()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r6, r1)
            r6 = 15
            int r1 = r4.getLeaderboardCount()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r6, r1)
            r6 = 16
            boolean r1 = r4.zzp
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r1)
            r6 = 17
            boolean r1 = r4.zzq
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r1)
            r6 = 18
            java.lang.String r1 = r4.getIconImageUrl()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r1, r3)
            r6 = 19
            java.lang.String r1 = r4.getHiResImageUrl()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r1, r3)
            r6 = 20
            java.lang.String r1 = r4.getFeaturedImageUrl()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r1, r3)
            r6 = 21
            boolean r1 = r4.zzu
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r1)
            r6 = 22
            boolean r1 = r4.zzv
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r1)
            r6 = 23
            boolean r1 = r4.areSnapshotsEnabled()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r1)
            r6 = 24
            java.lang.String r1 = r4.getThemeColor()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r1, r3)
            r6 = 25
            boolean r1 = r4.hasGamepadSupport()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    @Override // com.google.android.gms.games.Game
    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzl
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzb() {
            r1 = this;
            boolean r0 = r1.zzv
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzc() {
            r1 = this;
            boolean r0 = r1.zzk
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzd() {
            r1 = this;
            boolean r0 = r1.zzu
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zze() {
            r1 = this;
            boolean r0 = r1.zzj
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzf() {
            r1 = this;
            boolean r0 = r1.zzp
            return r0
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzg() {
            r1 = this;
            boolean r0 = r1.zzq
            return r0
    }
}
