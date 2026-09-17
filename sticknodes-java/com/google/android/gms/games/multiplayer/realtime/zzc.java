package com.google.android.gms.games.multiplayer.realtime;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzc extends com.google.android.gms.games.multiplayer.realtime.zzd {
    zzc() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.zzd, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.google.android.gms.games.multiplayer.realtime.RoomEntity r1 = r0.zza(r1)
            return r1
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.zzd
    public final com.google.android.gms.games.multiplayer.realtime.RoomEntity zza(android.os.Parcel r2) {
            r1 = this;
            java.lang.Integer r0 = com.google.android.gms.games.multiplayer.realtime.RoomEntity.zza()
            boolean r0 = com.google.android.gms.games.multiplayer.realtime.RoomEntity.zzb(r0)
            if (r0 != 0) goto L1d
            java.lang.Class<com.google.android.gms.games.multiplayer.realtime.RoomEntity> r0 = com.google.android.gms.games.multiplayer.realtime.RoomEntity.class
            java.lang.String r0 = r0.getCanonicalName()
            boolean r0 = com.google.android.gms.games.multiplayer.realtime.RoomEntity.zzc(r0)
            if (r0 == 0) goto L17
            goto L1d
        L17:
            com.google.android.gms.games.multiplayer.realtime.RoomEntity r2 = new com.google.android.gms.games.multiplayer.realtime.RoomEntity
            r2.<init>()
            return r2
        L1d:
            com.google.android.gms.games.multiplayer.realtime.RoomEntity r2 = super.zza(r2)
            return r2
    }
}
