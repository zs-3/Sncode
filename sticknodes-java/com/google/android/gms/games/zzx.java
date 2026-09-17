package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@android.annotation.SuppressLint({"ParcelCreator"})
/* loaded from: classes.dex */
public final class zzx extends com.google.android.gms.games.zzq implements com.google.android.gms.games.PlayerRelationshipInfo {
    private final com.google.android.gms.games.internal.player.zzd zza;

    public zzx(com.google.android.gms.common.data.DataHolder r1, int r2, com.google.android.gms.games.internal.player.zzd r3) {
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
            boolean r1 = com.google.android.gms.games.zzv.zzf(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.PlayerRelationshipInfo freeze() {
            r1 = this;
            com.google.android.gms.games.zzv r0 = new com.google.android.gms.games.zzv
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final int getFriendStatus() {
            r2 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r2.zza
            java.lang.String r0 = r0.zzH
            r1 = -1
            int r0 = r2.zzq(r0, r1)
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
            r1 = this;
            int r0 = com.google.android.gms.games.zzv.zzd(r1)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = com.google.android.gms.games.zzv.zze(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            com.google.android.gms.games.zzv r0 = new com.google.android.gms.games.zzv
            r0.<init>(r1)
            com.google.android.gms.games.zzw.zza(r0, r2, r3)
            return
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final java.lang.String zza() {
            r2 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r2.zza
            java.lang.String r0 = r0.zzJ
            r1 = 0
            java.lang.String r0 = r2.zzr(r0, r1)
            return r0
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final java.lang.String zzb() {
            r2 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r2.zza
            java.lang.String r0 = r0.zzI
            r1 = 0
            java.lang.String r0 = r2.zzr(r0, r1)
            return r0
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final java.lang.String zzc() {
            r2 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r2.zza
            java.lang.String r0 = r0.zzK
            r1 = 0
            java.lang.String r0 = r2.zzr(r0, r1)
            return r0
    }
}
