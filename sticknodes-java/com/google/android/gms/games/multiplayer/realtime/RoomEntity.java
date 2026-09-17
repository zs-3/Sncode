package com.google.android.gms.games.multiplayer.realtime;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
@com.google.android.gms.common.util.RetainForClient
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "RoomEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class RoomEntity extends com.google.android.gms.games.internal.GamesDowngradeableSafeParcel {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.multiplayer.realtime.RoomEntity> CREATOR = null;

    static {
            com.google.android.gms.games.multiplayer.realtime.zzc r0 = new com.google.android.gms.games.multiplayer.realtime.zzc
            r0.<init>()
            com.google.android.gms.games.multiplayer.realtime.RoomEntity.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    RoomEntity() {
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
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            boolean r4 = r2.shouldDowngrade()
            if (r4 != 0) goto Le
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r4)
            return
        Le:
            java.lang.String r4 = "unsupported"
            r3.writeString(r4)
            r3.writeString(r4)
            r0 = 0
            r3.writeLong(r0)
            r0 = 0
            r3.writeInt(r0)
            r3.writeString(r4)
            r4 = -1
            r3.writeInt(r4)
            r4 = 0
            r3.writeBundle(r4)
            r3.writeInt(r0)
            return
    }
}
