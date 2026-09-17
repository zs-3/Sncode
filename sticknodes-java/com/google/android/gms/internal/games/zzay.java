package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzay extends com.google.android.gms.internal.games.zzad implements com.google.android.gms.games.GamesClient {
    public static final /* synthetic */ int zza = 0;

    public zzay(android.app.Activity r1, com.google.android.gms.games.Games.GamesOptions r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public zzay(android.content.Context r1, com.google.android.gms.games.Games.GamesOptions r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.games.GamesClient
    public final com.google.android.gms.tasks.Task<android.os.Bundle> getActivationHint() {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzav r1 = com.google.android.gms.internal.games.zzav.zza
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 6622(0x19de, float:9.28E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r2.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.games.GamesClient
    public final com.google.android.gms.tasks.Task<java.lang.String> getAppId() {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzaw r1 = com.google.android.gms.internal.games.zzaw.zza
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 6620(0x19dc, float:9.277E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r2.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.games.GamesClient
    public final com.google.android.gms.tasks.Task<java.lang.String> getCurrentAccountName() {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzax r1 = com.google.android.gms.internal.games.zzax.zza
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 6618(0x19da, float:9.274E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r2.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.games.GamesClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getSettingsIntent() {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzat r1 = com.google.android.gms.internal.games.zzat.zza
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 6621(0x19dd, float:9.278E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r2.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.games.GamesClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> setGravityForPopups(int r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzas r1 = new com.google.android.gms.internal.games.zzas
            r1.<init>(r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 6616(0x19d8, float:9.271E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doWrite(r3)
            return r3
    }

    @Override // com.google.android.gms.games.GamesClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> setViewForPopups(android.view.View r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzau r1 = new com.google.android.gms.internal.games.zzau
            r1.<init>(r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 6617(0x19d9, float:9.272E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doWrite(r3)
            return r3
    }
}
