package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public class zzad extends com.google.android.gms.common.api.GoogleApi {
    public zzad(android.app.Activity r3, com.google.android.gms.games.Games.GamesOptions r4) {
            r2 = this;
            com.google.android.gms.common.api.Api<com.google.android.gms.games.Games$GamesOptions> r0 = com.google.android.gms.games.Games.API
            com.google.android.gms.common.api.GoogleApi$Settings r1 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r2.<init>(r3, r0, r4, r1)
            return
    }

    public zzad(android.content.Context r3, com.google.android.gms.games.Games.GamesOptions r4) {
            r2 = this;
            com.google.android.gms.common.api.Api<com.google.android.gms.games.Games$GamesOptions> r0 = com.google.android.gms.games.Games.API
            com.google.android.gms.common.api.GoogleApi$Settings r1 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r2.<init>(r3, r0, r4, r1)
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    protected final com.google.android.gms.common.internal.ClientSettings.Builder createClientSettingsBuilder() {
            r2 = this;
            com.google.android.gms.common.internal.ClientSettings$Builder r0 = super.createClientSettingsBuilder()
            com.google.android.gms.common.api.Api$ApiOptions r1 = r2.getApiOptions()
            if (r1 == 0) goto L12
            com.google.android.gms.common.api.Api$ApiOptions r1 = r2.getApiOptions()
            com.google.android.gms.games.Games$GamesOptions r1 = (com.google.android.gms.games.Games.GamesOptions) r1
            java.lang.String r1 = r1.zzl
        L12:
            return r0
    }
}
