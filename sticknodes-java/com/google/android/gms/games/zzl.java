package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
class zzl extends com.google.android.gms.common.api.Api.AbstractClientBuilder {
    /* synthetic */ zzl(com.google.android.gms.games.zzk r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context r9, android.os.Looper r10, com.google.android.gms.common.internal.ClientSettings r11, java.lang.Object r12, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r13, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r14) {
            r8 = this;
            com.google.android.gms.games.Games$GamesOptions r12 = (com.google.android.gms.games.Games.GamesOptions) r12
            if (r12 != 0) goto Le
            com.google.android.gms.games.Games$GamesOptions$Builder r12 = new com.google.android.gms.games.Games$GamesOptions$Builder
            r0 = 0
            r12.<init>(r0)
            com.google.android.gms.games.Games$GamesOptions r12 = r12.build()
        Le:
            r4 = r12
            com.google.android.gms.games.internal.zzbz r12 = new com.google.android.gms.games.internal.zzbz
            com.google.android.gms.games.internal.zzcg r7 = com.google.android.gms.games.internal.zzcg.zza()
            r0 = r12
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r12
    }

    @Override // com.google.android.gms.common.api.Api.BaseClientBuilder
    public final int getPriority() {
            r1 = this;
            r0 = 1
            return r0
    }
}
