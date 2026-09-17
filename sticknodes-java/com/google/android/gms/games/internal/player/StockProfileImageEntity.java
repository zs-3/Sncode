package com.google.android.gms.games.internal.player;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "StockProfileImageEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class StockProfileImageEntity extends com.google.android.gms.games.internal.zzc implements com.google.android.gms.games.internal.player.StockProfileImage {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.internal.player.StockProfileImageEntity> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getImageUrl", id = 1)
    private final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getImageUri", id = 2)
    private final android.net.Uri zzb;

    static {
            com.google.android.gms.games.internal.player.zzh r0 = new com.google.android.gms.games.internal.player.zzh
            r0.<init>()
            com.google.android.gms.games.internal.player.StockProfileImageEntity.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public StockProfileImageEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.net.Uri r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.games.internal.player.StockProfileImage
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r4) goto La
            return r0
        La:
            com.google.android.gms.games.internal.player.StockProfileImage r5 = (com.google.android.gms.games.internal.player.StockProfileImage) r5
            java.lang.String r2 = r4.zza
            java.lang.String r3 = r5.getImageUrl()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L25
            android.net.Uri r2 = r4.zzb
            android.net.Uri r5 = r5.zza()
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r2, r5)
            if (r5 == 0) goto L25
            return r0
        L25:
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.internal.player.StockProfileImage freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    public java.lang.String getImageUrl() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            android.net.Uri r1 = r3.zzb
            r2 = 1
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
            java.lang.String r2 = "ImageId"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            android.net.Uri r1 = r3.zzb
            java.lang.String r2 = "ImageUri"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            java.lang.String r1 = r4.getImageUrl()
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            android.net.Uri r1 = r4.zzb
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    public final android.net.Uri zza() {
            r1 = this;
            android.net.Uri r0 = r1.zzb
            return r0
    }
}
