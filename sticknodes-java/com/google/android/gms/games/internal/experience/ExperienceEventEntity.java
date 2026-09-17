package com.google.android.gms.games.internal.experience;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ExperienceEventEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class ExperienceEventEntity extends com.google.android.gms.games.internal.zzc implements com.google.android.gms.games.internal.experience.ExperienceEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.internal.experience.ExperienceEventEntity> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getExperienceId", id = 1)
    private final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGame", id = 2)
    private final com.google.android.gms.games.GameEntity zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDisplayTitle", id = 3)
    private final java.lang.String zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDisplayDescription", id = 4)
    private final java.lang.String zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getIconImageUrl", id = 5)
    private final java.lang.String zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getIconImageUri", id = 6)
    private final android.net.Uri zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCreatedTimestamp", id = 7)
    private final long zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getXpEarned", id = 8)
    private final long zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCurrentXp", id = 9)
    private final long zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getType", id = 10)
    private final int zzj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getNewLevel", id = 11)
    private final int zzk;

    static {
            com.google.android.gms.games.internal.experience.zza r0 = new com.google.android.gms.games.internal.experience.zza
            r0.<init>()
            com.google.android.gms.games.internal.experience.ExperienceEventEntity.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    ExperienceEventEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.games.GameEntity r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.String r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) android.net.Uri r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) long r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) long r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) long r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) int r13, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 11) int r14) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r9
            r0.zzi = r11
            r0.zzj = r13
            r0.zzk = r14
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.gms.games.internal.experience.ExperienceEvent
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L9
        L6:
            r1 = 0
            goto Lbf
        L9:
            if (r5 != r6) goto Ld
            goto Lbf
        Ld:
            com.google.android.gms.games.internal.experience.ExperienceEvent r6 = (com.google.android.gms.games.internal.experience.ExperienceEvent) r6
            java.lang.String r0 = r6.zzj()
            java.lang.String r3 = r5.zza
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            if (r0 == 0) goto L6
            com.google.android.gms.games.Game r0 = r6.zzg()
            com.google.android.gms.games.GameEntity r3 = r5.zzb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            if (r0 == 0) goto L6
            java.lang.String r0 = r6.zzi()
            java.lang.String r3 = r5.zzc
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            if (r0 == 0) goto L6
            java.lang.String r0 = r6.zzh()
            java.lang.String r3 = r5.zzd
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            if (r0 == 0) goto L6
            java.lang.String r0 = r6.getIconImageUrl()
            java.lang.String r3 = r5.getIconImageUrl()
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            if (r0 == 0) goto L6
            android.net.Uri r0 = r6.zzf()
            android.net.Uri r3 = r5.zzf
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            if (r0 == 0) goto L6
            long r3 = r6.zzc()
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            long r3 = r5.zzg
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            if (r0 == 0) goto L6
            long r3 = r6.zze()
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            long r3 = r5.zzh
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            if (r0 == 0) goto L6
            long r3 = r6.zzd()
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            long r3 = r5.zzi
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            if (r0 == 0) goto L6
            int r0 = r6.zzb()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r3 = r5.zzj
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            if (r0 == 0) goto L6
            int r6 = r6.zza()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r0 = r5.zzk
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r6 = com.google.android.gms.common.internal.Objects.equal(r6, r0)
            if (r6 != 0) goto Lbf
            goto L6
        Lbf:
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.internal.experience.ExperienceEvent freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public java.lang.String getIconImageUrl() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 11
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            com.google.android.gms.games.GameEntity r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.zzc
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = r3.zzd
            r2 = 3
            r0[r2] = r1
            java.lang.String r1 = r3.getIconImageUrl()
            r2 = 4
            r0[r2] = r1
            android.net.Uri r1 = r3.zzf
            r2 = 5
            r0[r2] = r1
            long r1 = r3.zzg
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 6
            r0[r2] = r1
            long r1 = r3.zzh
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 7
            r0[r2] = r1
            long r1 = r3.zzi
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 8
            r0[r2] = r1
            int r1 = r3.zzj
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 9
            r0[r2] = r1
            int r1 = r3.zzk
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 10
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            java.lang.String r1 = r3.zza
            java.lang.String r2 = "ExperienceId"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            com.google.android.gms.games.GameEntity r1 = r3.zzb
            java.lang.String r2 = "Game"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.zzc
            java.lang.String r2 = "DisplayTitle"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.zzd
            java.lang.String r2 = "DisplayDescription"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getIconImageUrl()
            java.lang.String r2 = "IconImageUrl"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            android.net.Uri r1 = r3.zzf
            java.lang.String r2 = "IconImageUri"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            long r1 = r3.zzg
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "CreatedTimestamp"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            long r1 = r3.zzh
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "XpEarned"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            long r1 = r3.zzi
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "CurrentXp"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.zzj
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "Type"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.zzk
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NewLevel"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            java.lang.String r1 = r4.zza
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            com.google.android.gms.games.GameEntity r1 = r4.zzb
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r1 = r4.zzc
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.lang.String r1 = r4.zzd
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.lang.String r1 = r4.getIconImageUrl()
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            android.net.Uri r1 = r4.zzf
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            long r1 = r4.zzg
            r6 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r6, r1)
            long r1 = r4.zzh
            r6 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r6, r1)
            long r1 = r4.zzi
            r6 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r6, r1)
            int r6 = r4.zzj
            r1 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            int r6 = r4.zzk
            r1 = 11
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int zza() {
            r1 = this;
            int r0 = r1.zzk
            return r0
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int zzb() {
            r1 = this;
            int r0 = r1.zzj
            return r0
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzc() {
            r2 = this;
            long r0 = r2.zzg
            return r0
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzd() {
            r2 = this;
            long r0 = r2.zzi
            return r0
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zze() {
            r2 = this;
            long r0 = r2.zzh
            return r0
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final android.net.Uri zzf() {
            r1 = this;
            android.net.Uri r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final com.google.android.gms.games.Game zzg() {
            r1 = this;
            com.google.android.gms.games.GameEntity r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final java.lang.String zzh() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final java.lang.String zzi() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final java.lang.String zzj() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }
}
