package com.google.android.gms.games.internal.player;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "MostRecentGameInfoEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class MostRecentGameInfoEntity extends com.google.android.gms.games.internal.zzc implements com.google.android.gms.games.internal.player.zza {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.internal.player.MostRecentGameInfoEntity> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGameId", id = 1)
    private final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGameName", id = 2)
    private final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getActivityTimestampMillis", id = 3)
    private final long zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGameIconImageUri", id = 4)
    private final android.net.Uri zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGameHiResImageUri", id = 5)
    private final android.net.Uri zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGameFeaturedImageUri", id = 6)
    private final android.net.Uri zzf;

    static {
            com.google.android.gms.games.internal.player.zzb r0 = new com.google.android.gms.games.internal.player.zzb
            r0.<init>()
            com.google.android.gms.games.internal.player.MostRecentGameInfoEntity.CREATOR = r0
            return
    }

    public MostRecentGameInfoEntity(com.google.android.gms.games.internal.player.zza r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.zze()
            r2.zza = r0
            java.lang.String r0 = r3.zzf()
            r2.zzb = r0
            long r0 = r3.zza()
            r2.zzc = r0
            android.net.Uri r0 = r3.zzd()
            r2.zzd = r0
            android.net.Uri r0 = r3.zzc()
            r2.zze = r0
            android.net.Uri r3 = r3.zzb()
            r2.zzf = r3
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    MostRecentGameInfoEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) long r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) android.net.Uri r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) android.net.Uri r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) android.net.Uri r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r5
            r0.zze = r6
            r0.zzf = r7
            return
    }

    static int zzg(com.google.android.gms.games.internal.player.zza r3) {
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.zze()
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.zzf()
            r2 = 1
            r0[r2] = r1
            long r1 = r3.zza()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            android.net.Uri r1 = r3.zzd()
            r2 = 3
            r0[r2] = r1
            android.net.Uri r1 = r3.zzc()
            r2 = 4
            r0[r2] = r1
            android.net.Uri r3 = r3.zzb()
            r1 = 5
            r0[r1] = r3
            int r3 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r3
    }

    static java.lang.String zzh(com.google.android.gms.games.internal.player.zza r3) {
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            java.lang.String r1 = r3.zze()
            java.lang.String r2 = "GameId"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.zzf()
            java.lang.String r2 = "GameName"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            long r1 = r3.zza()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "ActivityTimestampMillis"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            android.net.Uri r1 = r3.zzd()
            java.lang.String r2 = "GameIconUri"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            android.net.Uri r1 = r3.zzc()
            java.lang.String r2 = "GameHiResUri"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            android.net.Uri r3 = r3.zzb()
            java.lang.String r1 = "GameFeaturedUri"
            com.google.android.gms.common.internal.Objects$ToStringHelper r3 = r0.add(r1, r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    static boolean zzi(com.google.android.gms.games.internal.player.zza r5, java.lang.Object r6) {
            boolean r0 = r6 instanceof com.google.android.gms.games.internal.player.zza
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r6) goto La
            return r0
        La:
            com.google.android.gms.games.internal.player.zza r6 = (com.google.android.gms.games.internal.player.zza) r6
            java.lang.String r2 = r6.zze()
            java.lang.String r3 = r5.zze()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L69
            java.lang.String r2 = r6.zzf()
            java.lang.String r3 = r5.zzf()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L69
            long r2 = r6.zza()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r5.zza()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L69
            android.net.Uri r2 = r6.zzd()
            android.net.Uri r3 = r5.zzd()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L69
            android.net.Uri r2 = r6.zzc()
            android.net.Uri r3 = r5.zzc()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L69
            android.net.Uri r6 = r6.zzb()
            android.net.Uri r5 = r5.zzb()
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r6, r5)
            if (r5 == 0) goto L69
            return r0
        L69:
            return r1
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = zzi(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ java.lang.Object freeze() {
            r0 = this;
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = zzg(r1)
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
            java.lang.String r0 = zzh(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            com.google.android.gms.games.internal.player.zzb.zza(r0, r1, r2)
            return
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final long zza() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final android.net.Uri zzb() {
            r1 = this;
            android.net.Uri r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final android.net.Uri zzc() {
            r1 = this;
            android.net.Uri r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final android.net.Uri zzd() {
            r1 = this;
            android.net.Uri r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final java.lang.String zze() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final java.lang.String zzf() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
