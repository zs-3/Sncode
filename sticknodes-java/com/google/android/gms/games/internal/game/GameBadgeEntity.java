package com.google.android.gms.games.internal.game;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "GameBadgeEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class GameBadgeEntity extends com.google.android.gms.games.internal.GamesDowngradeableSafeParcel implements com.google.android.gms.games.internal.game.zza {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.internal.game.GameBadgeEntity> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getType", id = 1)
    private int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTitle", id = 2)
    private java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDescription", id = 3)
    private java.lang.String zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getIconImageUri", id = 4)
    private android.net.Uri zzd;

    static {
            com.google.android.gms.games.internal.game.zzb r0 = new com.google.android.gms.games.internal.game.zzb
            r0.<init>()
            com.google.android.gms.games.internal.game.GameBadgeEntity.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    GameBadgeEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) android.net.Uri r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    static /* synthetic */ java.lang.Integer zzc() {
            java.lang.Integer r0 = com.google.android.gms.common.internal.DowngradeableSafeParcel.getUnparcelClientVersion()
            return r0
    }

    static /* synthetic */ boolean zzd(java.lang.Integer r0) {
            boolean r0 = com.google.android.gms.games.internal.GamesDowngradeableSafeParcel.zzp(r0)
            return r0
    }

    static /* synthetic */ boolean zze(java.lang.String r0) {
            boolean r0 = com.google.android.gms.common.internal.DowngradeableSafeParcel.canUnparcelSafely(r0)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.games.internal.game.zza
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
        L6:
            r1 = 0
            goto L2a
        L8:
            if (r4 != r5) goto Lb
            goto L2a
        Lb:
            com.google.android.gms.games.internal.game.zza r5 = (com.google.android.gms.games.internal.game.zza) r5
            int r0 = r5.zza()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = r4.zzb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            if (r0 == 0) goto L6
            java.lang.String r5 = r5.zzb()
            android.net.Uri r0 = r4.zzd
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r5, r0)
            if (r5 != 0) goto L2a
            goto L6
        L2a:
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ java.lang.Object freeze() {
            r0 = this;
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.zza
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.zzc
            r2 = 2
            r0[r2] = r1
            android.net.Uri r1 = r3.zzd
            r2 = 3
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
            int r1 = r3.zza
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "Type"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.zzb
            java.lang.String r2 = "Title"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.zzc
            java.lang.String r2 = "Description"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            android.net.Uri r1 = r3.zzd
            java.lang.String r2 = "IconImageUri"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            boolean r0 = r4.shouldDowngrade()
            if (r0 != 0) goto L27
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r1 = 1
            int r2 = r4.zza
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r2)
            r1 = 2
            java.lang.String r2 = r4.zzb
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r2, r3)
            r1 = 3
            java.lang.String r2 = r4.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r2, r3)
            r1 = 4
            android.net.Uri r2 = r4.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r1, r2, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
        L27:
            int r6 = r4.zza
            r5.writeInt(r6)
            java.lang.String r6 = r4.zzb
            r5.writeString(r6)
            java.lang.String r6 = r4.zzc
            r5.writeString(r6)
            android.net.Uri r6 = r4.zzd
            if (r6 != 0) goto L3c
            r6 = 0
            goto L40
        L3c:
            java.lang.String r6 = r6.toString()
        L40:
            r5.writeString(r6)
            return
    }

    @Override // com.google.android.gms.games.internal.game.zza
    public final int zza() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.games.internal.game.zza
    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }
}
