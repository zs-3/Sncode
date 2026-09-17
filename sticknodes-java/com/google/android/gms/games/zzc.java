package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@android.annotation.SuppressLint({"ParcelCreator"})
/* loaded from: classes.dex */
public final class zzc extends com.google.android.gms.games.zzq implements com.google.android.gms.games.CurrentPlayerInfo {
    private final com.google.android.gms.games.internal.player.zzd zza;

    public zzc(com.google.android.gms.common.data.DataHolder r1, int r2, com.google.android.gms.games.internal.player.zzd r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zza = r3
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
            boolean r1 = com.google.android.gms.games.zza.zzc(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.CurrentPlayerInfo freeze() {
            r1 = this;
            com.google.android.gms.games.zza r0 = new com.google.android.gms.games.zza
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.games.CurrentPlayerInfo
    public final int getFriendsListVisibilityStatus() {
            r2 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r2.zza
            java.lang.String r0 = r0.zzL
            r1 = 0
            int r0 = r2.zzq(r0, r1)
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
            r1 = this;
            int r0 = com.google.android.gms.games.zza.zza(r1)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = com.google.android.gms.games.zza.zzb(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            com.google.android.gms.games.zza r0 = new com.google.android.gms.games.zza
            r0.<init>(r1)
            com.google.android.gms.games.zzb.zza(r0, r2, r3)
            return
    }

    public final boolean zza() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzL
            boolean r0 = r1.hasColumn(r0)
            if (r0 == 0) goto L16
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzL
            boolean r0 = r1.hasNull(r0)
            if (r0 != 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }
}
