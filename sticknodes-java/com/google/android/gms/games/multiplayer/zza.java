package com.google.android.gms.games.multiplayer;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zza extends com.google.android.gms.games.multiplayer.zzb {
    zza() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.games.multiplayer.zzb, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.google.android.gms.games.multiplayer.ParticipantEntity r1 = r0.zza(r1)
            return r1
    }

    @Override // com.google.android.gms.games.multiplayer.zzb
    public final com.google.android.gms.games.multiplayer.ParticipantEntity zza(android.os.Parcel r2) {
            r1 = this;
            java.lang.Integer r0 = com.google.android.gms.games.multiplayer.ParticipantEntity.zza()
            boolean r0 = com.google.android.gms.games.multiplayer.ParticipantEntity.zzb(r0)
            if (r0 != 0) goto L1d
            java.lang.Class<com.google.android.gms.games.multiplayer.ParticipantEntity> r0 = com.google.android.gms.games.multiplayer.ParticipantEntity.class
            java.lang.String r0 = r0.getCanonicalName()
            boolean r0 = com.google.android.gms.games.multiplayer.ParticipantEntity.zzc(r0)
            if (r0 == 0) goto L17
            goto L1d
        L17:
            com.google.android.gms.games.multiplayer.ParticipantEntity r2 = new com.google.android.gms.games.multiplayer.ParticipantEntity
            r2.<init>()
            return r2
        L1d:
            com.google.android.gms.games.multiplayer.ParticipantEntity r2 = super.zza(r2)
            return r2
    }
}
