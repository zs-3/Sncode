package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@android.annotation.SuppressLint({"ParcelCreator"})
/* loaded from: classes.dex */
public final class PlayerRef extends com.google.android.gms.games.zzq implements com.google.android.gms.games.Player {
    private final com.google.android.gms.games.internal.player.zzd zza;
    private final com.google.android.gms.games.PlayerLevelInfo zzb;
    private final com.google.android.gms.games.internal.player.zzc zzc;
    private final com.google.android.gms.games.zzx zzd;
    private final com.google.android.gms.games.zzc zze;

    public PlayerRef(com.google.android.gms.common.data.DataHolder r8, int r9, java.lang.String r10) {
            r7 = this;
            r7.<init>(r8, r9)
            com.google.android.gms.games.internal.player.zzd r10 = new com.google.android.gms.games.internal.player.zzd
            r0 = 0
            r10.<init>(r0)
            r7.zza = r10
            com.google.android.gms.games.internal.player.zzc r1 = new com.google.android.gms.games.internal.player.zzc
            r1.<init>(r8, r9, r10)
            r7.zzc = r1
            com.google.android.gms.games.zzx r1 = new com.google.android.gms.games.zzx
            r1.<init>(r8, r9, r10)
            r7.zzd = r1
            com.google.android.gms.games.zzc r1 = new com.google.android.gms.games.zzc
            r1.<init>(r8, r9, r10)
            r7.zze = r1
            java.lang.String r8 = r10.zzk
            boolean r8 = r7.hasNull(r8)
            if (r8 == 0) goto L29
            goto L82
        L29:
            java.lang.String r8 = r10.zzk
            long r8 = r7.getLong(r8)
            r1 = -1
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 == 0) goto L82
            java.lang.String r8 = r10.zzl
            int r8 = r7.getInteger(r8)
            java.lang.String r9 = r10.zzo
            int r9 = r7.getInteger(r9)
            com.google.android.gms.games.PlayerLevel r6 = new com.google.android.gms.games.PlayerLevel
            java.lang.String r0 = r10.zzm
            long r2 = r7.getLong(r0)
            java.lang.String r0 = r10.zzn
            long r4 = r7.getLong(r0)
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r4)
            if (r8 == r9) goto L6a
            com.google.android.gms.games.PlayerLevel r8 = new com.google.android.gms.games.PlayerLevel
            java.lang.String r0 = r10.zzn
            long r2 = r7.getLong(r0)
            java.lang.String r0 = r10.zzp
            long r4 = r7.getLong(r0)
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r4)
            goto L6b
        L6a:
            r8 = r6
        L6b:
            com.google.android.gms.games.PlayerLevelInfo r9 = new com.google.android.gms.games.PlayerLevelInfo
            java.lang.String r0 = r10.zzk
            long r1 = r7.getLong(r0)
            java.lang.String r10 = r10.zzq
            long r3 = r7.getLong(r10)
            r0 = r9
            r5 = r6
            r6 = r8
            r0.<init>(r1, r3, r5, r6)
            r7.zzb = r9
            return
        L82:
            r7.zzb = r0
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.android.gms.games.PlayerEntity.zzo(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.Player freeze() {
            r1 = this;
            com.google.android.gms.games.PlayerEntity r0 = new com.google.android.gms.games.PlayerEntity
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final android.net.Uri getBannerImageLandscapeUri() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzC
            android.net.Uri r0 = r1.parseUri(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getBannerImageLandscapeUrl() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzD
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final android.net.Uri getBannerImagePortraitUri() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzE
            android.net.Uri r0 = r1.parseUri(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getBannerImagePortraitUrl() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzF
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.CurrentPlayerInfo getCurrentPlayerInfo() {
            r1 = this;
            com.google.android.gms.games.zzc r0 = r1.zze
            boolean r0 = r0.zza()
            if (r0 == 0) goto Lb
            com.google.android.gms.games.zzc r0 = r1.zze
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final java.lang.String getDisplayName() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzc
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final void getDisplayName(android.database.CharArrayBuffer r2) {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzc
            r1.copyToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.Player
    public final android.net.Uri getHiResImageUri() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzf
            android.net.Uri r0 = r1.parseUri(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getHiResImageUrl() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzg
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final android.net.Uri getIconImageUri() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzd
            android.net.Uri r0 = r1.parseUri(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public java.lang.String getIconImageUrl() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zze
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final long getLastPlayedWithTimestamp() {
            r2 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r2.zza
            java.lang.String r0 = r0.zzj
            boolean r0 = r2.hasColumn(r0)
            if (r0 == 0) goto L1e
            com.google.android.gms.games.internal.player.zzd r0 = r2.zza
            java.lang.String r0 = r0.zzj
            boolean r0 = r2.hasNull(r0)
            if (r0 == 0) goto L15
            goto L1e
        L15:
            com.google.android.gms.games.internal.player.zzd r0 = r2.zza
            java.lang.String r0 = r0.zzj
            long r0 = r2.getLong(r0)
            return r0
        L1e:
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.PlayerLevelInfo getLevelInfo() {
            r1 = this;
            com.google.android.gms.games.PlayerLevelInfo r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final java.lang.String getPlayerId() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zza
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.PlayerRelationshipInfo getRelationshipInfo() {
            r3 = this;
            com.google.android.gms.games.zzx r0 = r3.zzd
            int r1 = r0.getFriendStatus()
            r2 = -1
            if (r1 != r2) goto L18
            java.lang.String r1 = r0.zzb()
            if (r1 != 0) goto L18
            java.lang.String r0 = r0.zza()
            if (r0 == 0) goto L16
            goto L18
        L16:
            r0 = 0
            return r0
        L18:
            com.google.android.gms.games.zzx r0 = r3.zzd
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final long getRetrievedTimestamp() {
            r2 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r2.zza
            java.lang.String r0 = r0.zzh
            long r0 = r2.getLong(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final java.lang.String getTitle() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzr
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final void getTitle(android.database.CharArrayBuffer r2) {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzr
            r1.copyToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.Player
    public final boolean hasHiResImage() {
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
    public final boolean hasIconImage() {
            r1 = this;
            android.net.Uri r0 = r1.getIconImageUri()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
            r1 = this;
            int r0 = com.google.android.gms.games.PlayerEntity.zzj(r1)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = com.google.android.gms.games.PlayerEntity.zzl(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            com.google.android.gms.games.PlayerEntity r0 = new com.google.android.gms.games.PlayerEntity
            r0.<init>(r1)
            r0.writeToParcel(r2, r3)
            return
    }

    @Override // com.google.android.gms.games.Player
    public final int zza() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzi
            int r0 = r1.getInteger(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final long zzb() {
            r2 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r2.zza
            java.lang.String r0 = r0.zzG
            boolean r1 = r2.hasColumn(r0)
            if (r1 == 0) goto L16
            boolean r1 = r2.hasNull(r0)
            if (r1 == 0) goto L11
            goto L16
        L11:
            long r0 = r2.getLong(r0)
            return r0
        L16:
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.internal.player.zza zzc() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzt
            boolean r0 = r1.hasNull(r0)
            if (r0 == 0) goto Lc
            r0 = 0
            return r0
        Lc:
            com.google.android.gms.games.internal.player.zzc r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final java.lang.String zzd() {
            r2 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r2.zza
            java.lang.String r0 = r0.zzb
            r1 = 0
            java.lang.String r0 = r2.zzr(r0, r1)
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final java.lang.String zze() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzA
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final java.lang.String zzf() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzB
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzg() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzz
            boolean r0 = r1.getBoolean(r0)
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzh() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzM
            boolean r0 = r1.hasColumn(r0)
            if (r0 == 0) goto L16
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzM
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzi() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzs
            boolean r0 = r1.getBoolean(r0)
            return r0
    }
}
