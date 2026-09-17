package com.google.android.gms.games.internal.game;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzb extends com.google.android.gms.games.internal.game.zzc {
    zzb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.games.internal.game.zzc, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.google.android.gms.games.internal.game.GameBadgeEntity r1 = r0.zza(r1)
            return r1
    }

    @Override // com.google.android.gms.games.internal.game.zzc
    public final com.google.android.gms.games.internal.game.GameBadgeEntity zza(android.os.Parcel r5) {
            r4 = this;
            java.lang.Integer r0 = com.google.android.gms.games.internal.game.GameBadgeEntity.zzc()
            boolean r0 = com.google.android.gms.games.internal.game.GameBadgeEntity.zzd(r0)
            if (r0 != 0) goto L35
            java.lang.Class<com.google.android.gms.games.internal.game.GameBadgeEntity> r0 = com.google.android.gms.games.internal.game.GameBadgeEntity.class
            java.lang.String r0 = r0.getCanonicalName()
            boolean r0 = com.google.android.gms.games.internal.game.GameBadgeEntity.zze(r0)
            if (r0 == 0) goto L17
            goto L35
        L17:
            int r0 = r5.readInt()
            java.lang.String r1 = r5.readString()
            java.lang.String r2 = r5.readString()
            java.lang.String r5 = r5.readString()
            if (r5 != 0) goto L2b
            r5 = 0
            goto L2f
        L2b:
            android.net.Uri r5 = android.net.Uri.parse(r5)
        L2f:
            com.google.android.gms.games.internal.game.GameBadgeEntity r3 = new com.google.android.gms.games.internal.game.GameBadgeEntity
            r3.<init>(r0, r1, r2, r5)
            return r3
        L35:
            com.google.android.gms.games.internal.game.GameBadgeEntity r5 = super.zza(r5)
            return r5
    }
}
