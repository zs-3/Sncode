package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzh extends com.google.android.gms.games.zzl {
    zzh() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.common.api.Api.BaseClientBuilder
    public final /* synthetic */ java.util.List getImpliedScopes(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.games.Games$GamesOptions r1 = (com.google.android.gms.games.Games.GamesOptions) r1
            com.google.android.gms.common.api.Scope r1 = com.google.android.gms.games.Games.zzb
            java.util.List r1 = java.util.Collections.singletonList(r1)
            return r1
    }
}
