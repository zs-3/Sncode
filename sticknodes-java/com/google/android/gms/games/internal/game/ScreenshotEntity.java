package com.google.android.gms.games.internal.game;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ScreenshotEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class ScreenshotEntity extends com.google.android.gms.games.internal.zzc implements com.google.android.gms.common.data.Freezable, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.internal.game.ScreenshotEntity> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getUri", id = 1)
    private final android.net.Uri zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getWidth", id = 2)
    private final int zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getHeight", id = 3)
    private final int zzc;

    static {
            com.google.android.gms.games.internal.game.zzd r0 = new com.google.android.gms.games.internal.game.zzd
            r0.<init>()
            com.google.android.gms.games.internal.game.ScreenshotEntity.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public ScreenshotEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) android.net.Uri r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.games.internal.game.ScreenshotEntity
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
        L6:
            r1 = 0
            goto L3c
        L8:
            if (r4 != r5) goto Lb
            goto L3c
        Lb:
            com.google.android.gms.games.internal.game.ScreenshotEntity r5 = (com.google.android.gms.games.internal.game.ScreenshotEntity) r5
            android.net.Uri r0 = r5.zza
            android.net.Uri r3 = r4.zza
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            if (r0 == 0) goto L6
            int r0 = r5.zzb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r3 = r4.zzb
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            if (r0 == 0) goto L6
            int r5 = r5.zzc
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r0 = r4.zzc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r5, r0)
            if (r5 != 0) goto L3c
            goto L6
        L3c:
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ java.lang.Object freeze() {
            r0 = this;
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            android.net.Uri r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            int r1 = r3.zzb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.zzc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
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
            android.net.Uri r1 = r3.zza
            java.lang.String r2 = "Uri"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.zzb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "Width"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.zzc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "Height"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            android.net.Uri r1 = r4.zza
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            int r6 = r4.zzb
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            int r6 = r4.zzc
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
