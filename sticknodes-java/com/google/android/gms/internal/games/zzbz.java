package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbz extends com.google.android.gms.internal.games.zzcj {
    final /* synthetic */ com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;

    zzbz(com.google.android.gms.internal.games.zzcm r1, com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer r3, int r4, int r5) {
            r0 = this;
            r0.zza = r3
            r0.zzb = r4
            r0.zzc = r5
            r1 = 0
            r0.<init>(r2, r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.games.internal.zzbz r4 = (com.google.android.gms.games.internal.zzbz) r4
            com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer r0 = r3.zza
            int r1 = r3.zzb
            int r2 = r3.zzc
            r4.zzat(r3, r0, r1, r2)
            return
    }
}
