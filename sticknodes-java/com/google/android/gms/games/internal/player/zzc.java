package com.google.android.gms.games.internal.player;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzc extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.games.internal.player.zza {
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
            boolean r1 = com.google.android.gms.games.internal.player.MostRecentGameInfoEntity.zzi(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ java.lang.Object freeze() {
            r1 = this;
            com.google.android.gms.games.internal.player.MostRecentGameInfoEntity r0 = new com.google.android.gms.games.internal.player.MostRecentGameInfoEntity
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
            r1 = this;
            int r0 = com.google.android.gms.games.internal.player.MostRecentGameInfoEntity.zzg(r1)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = com.google.android.gms.games.internal.player.MostRecentGameInfoEntity.zzh(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            com.google.android.gms.games.internal.player.MostRecentGameInfoEntity r0 = new com.google.android.gms.games.internal.player.MostRecentGameInfoEntity
            r0.<init>(r1)
            com.google.android.gms.games.internal.player.zzb.zza(r0, r2, r3)
            return
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final long zza() {
            r2 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r2.zza
            java.lang.String r0 = r0.zzv
            long r0 = r2.getLong(r0)
            return r0
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final android.net.Uri zzb() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzy
            android.net.Uri r0 = r1.parseUri(r0)
            return r0
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final android.net.Uri zzc() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzx
            android.net.Uri r0 = r1.parseUri(r0)
            return r0
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final android.net.Uri zzd() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzw
            android.net.Uri r0 = r1.parseUri(r0)
            return r0
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final java.lang.String zze() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzt
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final java.lang.String zzf() {
            r1 = this;
            com.google.android.gms.games.internal.player.zzd r0 = r1.zza
            java.lang.String r0 = r0.zzu
            java.lang.String r0 = r1.getString(r0)
            return r0
    }
}
