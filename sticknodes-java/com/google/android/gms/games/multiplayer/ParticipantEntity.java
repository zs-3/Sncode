package com.google.android.gms.games.multiplayer;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
@com.google.android.gms.common.util.RetainForClient
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ParticipantEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class ParticipantEntity extends com.google.android.gms.games.internal.GamesDowngradeableSafeParcel {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.multiplayer.ParticipantEntity> CREATOR = null;

    static {
            com.google.android.gms.games.multiplayer.zza r0 = new com.google.android.gms.games.multiplayer.zza
            r0.<init>()
            com.google.android.gms.games.multiplayer.ParticipantEntity.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    ParticipantEntity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.Integer zza() {
            java.lang.Integer r0 = com.google.android.gms.common.internal.DowngradeableSafeParcel.getUnparcelClientVersion()
            return r0
    }

    static /* synthetic */ boolean zzb(java.lang.Integer r0) {
            boolean r0 = com.google.android.gms.games.internal.GamesDowngradeableSafeParcel.zzp(r0)
            return r0
    }

    static /* synthetic */ boolean zzc(java.lang.String r0) {
            boolean r0 = com.google.android.gms.common.internal.DowngradeableSafeParcel.canUnparcelSafely(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            boolean r3 = r1.shouldDowngrade()
            if (r3 != 0) goto Le
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r2, r3)
            return
        Le:
            java.lang.String r3 = "unsupported"
            r2.writeString(r3)
            r2.writeString(r3)
            r0 = 0
            r2.writeString(r0)
            r2.writeString(r0)
            r0 = 0
            r2.writeInt(r0)
            r2.writeString(r3)
            r2.writeInt(r0)
            r2.writeInt(r0)
            return
    }
}
