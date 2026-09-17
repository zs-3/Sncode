package com.google.android.gms.games.achievement;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AchievementEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class AchievementEntity extends com.google.android.gms.games.internal.zzc implements com.google.android.gms.games.achievement.Achievement {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.achievement.AchievementEntity> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAchievementId", id = 1)
    private final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getName", id = 3)
    private final java.lang.String zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDescription", id = 4)
    private final java.lang.String zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getUnlockedImageUri", id = 5)
    private final android.net.Uri zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getUnlockedImageUrl", id = 6)
    private final java.lang.String zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRevealedImageUri", id = 7)
    private final android.net.Uri zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRevealedImageUrl", id = 8)
    private final java.lang.String zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTotalStepsRaw", id = 9)
    private final int zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getFormattedTotalStepsRaw", id = 10)
    private final java.lang.String zzj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPlayerInternal", id = 11)
    private final com.google.android.gms.games.PlayerEntity zzk;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getState", id = 12)
    private final int zzl;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCurrentStepsRaw", id = 13)
    private final int zzm;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getFormattedCurrentStepsRaw", id = 14)
    private final java.lang.String zzn;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getLastUpdatedTimestamp", id = 15)
    private final long zzo;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getXpValue", id = 16)
    private final long zzp;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "-1.0f", getter = "getRarityPercent", id = 17)
    private final float zzq;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getApplicationId", id = 18)
    private final java.lang.String zzr;

    static {
            com.google.android.gms.games.achievement.zza r0 = new com.google.android.gms.games.achievement.zza
            r0.<init>()
            com.google.android.gms.games.achievement.AchievementEntity.CREATOR = r0
            return
    }

    public AchievementEntity(com.google.android.gms.games.achievement.Achievement r7) {
            r6 = this;
            r6.<init>()
            java.lang.String r0 = r7.getAchievementId()
            r6.zza = r0
            int r1 = r7.getType()
            r6.zzb = r1
            java.lang.String r1 = r7.getName()
            r6.zzc = r1
            java.lang.String r1 = r7.getDescription()
            r6.zzd = r1
            android.net.Uri r2 = r7.getUnlockedImageUri()
            r6.zze = r2
            java.lang.String r2 = r7.getUnlockedImageUrl()
            r6.zzf = r2
            android.net.Uri r2 = r7.getRevealedImageUri()
            r6.zzg = r2
            java.lang.String r2 = r7.getRevealedImageUrl()
            r6.zzh = r2
            com.google.android.gms.games.Player r2 = r7.zzb()
            r3 = 0
            if (r2 == 0) goto L42
            com.google.android.gms.games.PlayerEntity r4 = new com.google.android.gms.games.PlayerEntity
            r4.<init>(r2)
            r6.zzk = r4
            goto L44
        L42:
            r6.zzk = r3
        L44:
            int r2 = r7.getState()
            r6.zzl = r2
            long r4 = r7.getLastUpdatedTimestamp()
            r6.zzo = r4
            long r4 = r7.getXpValue()
            r6.zzp = r4
            float r2 = r7.zza()
            r6.zzq = r2
            java.lang.String r2 = r7.zzc()
            r6.zzr = r2
            int r2 = r7.getType()
            r4 = 1
            if (r2 != r4) goto L82
            int r2 = r7.getTotalSteps()
            r6.zzi = r2
            java.lang.String r2 = r7.getFormattedTotalSteps()
            r6.zzj = r2
            int r2 = r7.getCurrentSteps()
            r6.zzm = r2
            java.lang.String r7 = r7.getFormattedCurrentSteps()
            r6.zzn = r7
            goto L8b
        L82:
            r7 = 0
            r6.zzi = r7
            r6.zzj = r3
            r6.zzm = r7
            r6.zzn = r3
        L8b:
            com.google.android.gms.common.internal.Asserts.checkNotNull(r0)
            com.google.android.gms.common.internal.Asserts.checkNotNull(r1)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    AchievementEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) android.net.Uri r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) android.net.Uri r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) java.lang.String r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) int r12, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) java.lang.String r13, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 11) com.google.android.gms.games.PlayerEntity r14, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 12) int r15, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 13) int r16, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 14) java.lang.String r17, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 15) long r18, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 16) long r20, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 17) float r22, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 18) java.lang.String r23) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.zza = r1
            r1 = r5
            r0.zzb = r1
            r1 = r6
            r0.zzc = r1
            r1 = r7
            r0.zzd = r1
            r1 = r8
            r0.zze = r1
            r1 = r9
            r0.zzf = r1
            r1 = r10
            r0.zzg = r1
            r1 = r11
            r0.zzh = r1
            r1 = r12
            r0.zzi = r1
            r1 = r13
            r0.zzj = r1
            r1 = r14
            r0.zzk = r1
            r1 = r15
            r0.zzl = r1
            r1 = r16
            r0.zzm = r1
            r1 = r17
            r0.zzn = r1
            r1 = r18
            r0.zzo = r1
            r1 = r20
            r0.zzp = r1
            r1 = r22
            r0.zzq = r1
            r1 = r23
            r0.zzr = r1
            return
    }

    static int zzd(com.google.android.gms.games.achievement.Achievement r7) {
            int r0 = r7.getType()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L11
            int r0 = r7.getCurrentSteps()
            int r3 = r7.getTotalSteps()
            goto L13
        L11:
            r0 = 0
            r3 = 0
        L13:
            r4 = 11
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = r7.getAchievementId()
            r4[r2] = r5
            java.lang.String r2 = r7.zzc()
            r4[r1] = r2
            r1 = 2
            java.lang.String r2 = r7.getName()
            r4[r1] = r2
            r1 = 3
            int r2 = r7.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r1] = r2
            r1 = 4
            java.lang.String r2 = r7.getDescription()
            r4[r1] = r2
            r1 = 5
            long r5 = r7.getXpValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r4[r1] = r2
            r1 = 6
            int r2 = r7.getState()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r1] = r2
            r1 = 7
            long r5 = r7.getLastUpdatedTimestamp()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r4[r1] = r2
            r1 = 8
            com.google.android.gms.games.Player r7 = r7.zzb()
            r4[r1] = r7
            r7 = 9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r7] = r0
            r7 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r4[r7] = r0
            int r7 = com.google.android.gms.common.internal.Objects.hashCode(r4)
            return r7
    }

    static java.lang.String zze(com.google.android.gms.games.achievement.Achievement r3) {
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            java.lang.String r1 = r3.getAchievementId()
            java.lang.String r2 = "Id"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.zzc()
            java.lang.String r2 = "Game Id"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.getType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "Type"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getName()
            java.lang.String r2 = "Name"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getDescription()
            java.lang.String r2 = "Description"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            com.google.android.gms.games.Player r1 = r3.zzb()
            java.lang.String r2 = "Player"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.getState()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "State"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            float r1 = r3.zza()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "Rarity Percent"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.getType()
            r2 = 1
            if (r1 != r2) goto L81
            int r1 = r3.getCurrentSteps()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CurrentSteps"
            r0.add(r2, r1)
            int r3 = r3.getTotalSteps()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = "TotalSteps"
            r0.add(r1, r3)
        L81:
            java.lang.String r3 = r0.toString()
            return r3
    }

    static boolean zzf(com.google.android.gms.games.achievement.Achievement r7, java.lang.Object r8) {
            boolean r0 = r8 instanceof com.google.android.gms.games.achievement.Achievement
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r7 != r8) goto La
            return r0
        La:
            com.google.android.gms.games.achievement.Achievement r8 = (com.google.android.gms.games.achievement.Achievement) r8
            int r2 = r8.getType()
            int r3 = r7.getType()
            if (r2 == r3) goto L17
            return r1
        L17:
            int r2 = r7.getType()
            if (r2 != r0) goto L34
            int r2 = r8.getCurrentSteps()
            int r3 = r7.getCurrentSteps()
            if (r2 == r3) goto L28
            return r1
        L28:
            int r2 = r8.getTotalSteps()
            int r3 = r7.getTotalSteps()
            if (r2 != r3) goto L33
            goto L34
        L33:
            return r1
        L34:
            long r2 = r8.getXpValue()
            long r4 = r7.getXpValue()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto La9
            int r2 = r8.getState()
            int r3 = r7.getState()
            if (r2 != r3) goto La9
            long r2 = r8.getLastUpdatedTimestamp()
            long r4 = r7.getLastUpdatedTimestamp()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto La9
            java.lang.String r2 = r8.getAchievementId()
            java.lang.String r3 = r7.getAchievementId()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto La9
            java.lang.String r2 = r8.zzc()
            java.lang.String r3 = r7.zzc()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto La9
            java.lang.String r2 = r8.getName()
            java.lang.String r3 = r7.getName()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto La9
            java.lang.String r2 = r8.getDescription()
            java.lang.String r3 = r7.getDescription()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto La9
            com.google.android.gms.games.Player r2 = r8.zzb()
            com.google.android.gms.games.Player r3 = r7.zzb()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto La9
            float r8 = r8.zza()
            float r7 = r7.zza()
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 != 0) goto La9
            return r0
        La9:
            return r1
    }

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = zzf(r0, r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    public com.google.android.gms.games.achievement.Achievement freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.achievement.Achievement freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public java.lang.String getAchievementId() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getCurrentSteps() {
            r2 = this;
            int r0 = r2.getType()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            com.google.android.gms.common.internal.Asserts.checkState(r1)
            int r0 = r2.zzm
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public void getDescription(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.zzd
            com.google.android.gms.common.util.DataUtils.copyStringToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public java.lang.String getFormattedCurrentSteps() {
            r2 = this;
            int r0 = r2.getType()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            com.google.android.gms.common.internal.Asserts.checkState(r1)
            java.lang.String r0 = r2.zzn
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public void getFormattedCurrentSteps(android.database.CharArrayBuffer r3) {
            r2 = this;
            int r0 = r2.getType()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            com.google.android.gms.common.internal.Asserts.checkState(r1)
            java.lang.String r0 = r2.zzn
            com.google.android.gms.common.util.DataUtils.copyStringToBuffer(r0, r3)
            return
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public java.lang.String getFormattedTotalSteps() {
            r2 = this;
            int r0 = r2.getType()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            com.google.android.gms.common.internal.Asserts.checkState(r1)
            java.lang.String r0 = r2.zzj
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public void getFormattedTotalSteps(android.database.CharArrayBuffer r3) {
            r2 = this;
            int r0 = r2.getType()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            com.google.android.gms.common.internal.Asserts.checkState(r1)
            java.lang.String r0 = r2.zzj
            com.google.android.gms.common.util.DataUtils.copyStringToBuffer(r0, r3)
            return
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public long getLastUpdatedTimestamp() {
            r2 = this;
            long r0 = r2.zzo
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public void getName(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.zzc
            com.google.android.gms.common.util.DataUtils.copyStringToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public com.google.android.gms.games.Player getPlayer() {
            r1 = this;
            com.google.android.gms.games.PlayerEntity r0 = r1.zzk
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.games.Player r0 = (com.google.android.gms.games.Player) r0
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public android.net.Uri getRevealedImageUri() {
            r1 = this;
            android.net.Uri r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public java.lang.String getRevealedImageUrl() {
            r1 = this;
            java.lang.String r0 = r1.zzh
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getState() {
            r1 = this;
            int r0 = r1.zzl
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getTotalSteps() {
            r2 = this;
            int r0 = r2.getType()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            com.google.android.gms.common.internal.Asserts.checkState(r1)
            int r0 = r2.zzi
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getType() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public android.net.Uri getUnlockedImageUri() {
            r1 = this;
            android.net.Uri r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public java.lang.String getUnlockedImageUrl() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public long getXpValue() {
            r2 = this;
            long r0 = r2.zzp
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = zzd(r1)
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
            java.lang.String r0 = zze(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            java.lang.String r1 = r4.getAchievementId()
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            int r1 = r4.getType()
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            java.lang.String r1 = r4.getName()
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.lang.String r1 = r4.getDescription()
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            android.net.Uri r1 = r4.getUnlockedImageUri()
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r1 = r4.getUnlockedImageUrl()
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            android.net.Uri r1 = r4.getRevealedImageUri()
            r2 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r1 = r4.getRevealedImageUrl()
            r2 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            int r1 = r4.zzi
            r2 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            java.lang.String r1 = r4.zzj
            r2 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            com.google.android.gms.games.PlayerEntity r1 = r4.zzk
            r2 = 11
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            int r6 = r4.getState()
            r1 = 12
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            int r6 = r4.zzm
            r1 = 13
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            java.lang.String r6 = r4.zzn
            r1 = 14
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            long r1 = r4.getLastUpdatedTimestamp()
            r6 = 15
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r6, r1)
            long r1 = r4.getXpValue()
            r6 = 16
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r6, r1)
            float r6 = r4.zzq
            r1 = 17
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r5, r1, r6)
            java.lang.String r6 = r4.zzr
            r1 = 18
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final float zza() {
            r1 = this;
            float r0 = r1.zzq
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final com.google.android.gms.games.Player zzb() {
            r1 = this;
            com.google.android.gms.games.PlayerEntity r0 = r1.zzk
            return r0
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zzr
            return r0
    }
}
