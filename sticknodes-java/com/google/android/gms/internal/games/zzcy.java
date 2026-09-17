package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzcy extends com.google.android.gms.internal.games.zzad implements com.google.android.gms.games.PlayersClient {
    public static final /* synthetic */ int zza = 0;

    public zzcy(android.app.Activity r1, com.google.android.gms.games.Games.GamesOptions r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public zzcy(android.content.Context r1, com.google.android.gms.games.Games.GamesOptions r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private final com.google.android.gms.tasks.Task zza(java.lang.String r3, int r4) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzcw r1 = new com.google.android.gms.internal.games.zzcw
            r1.<init>(r3, r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6647(0x19f7, float:9.314E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    private final com.google.android.gms.tasks.Task zzb(java.lang.String r3, int r4, boolean r5) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzcp r1 = new com.google.android.gms.internal.games.zzcp
            r1.<init>(r3, r4, r5)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6646(0x19f6, float:9.313E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getCompareProfileIntent(com.google.android.gms.games.Player r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzcr r1 = new com.google.android.gms.internal.games.zzcr
            r1.<init>(r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 6643(0x19f3, float:9.309E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getCompareProfileIntent(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzcv r1 = new com.google.android.gms.internal.games.zzcv
            r2 = 0
            r1.<init>(r4, r2, r2)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r4 = r0.run(r1)
            r0 = 6644(0x19f4, float:9.31E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r4 = r4.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r4 = r4.build()
            com.google.android.gms.tasks.Task r4 = r3.doRead(r4)
            return r4
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getCompareProfileIntentWithAlternativeNameHints(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzcv r1 = new com.google.android.gms.internal.games.zzcv
            r1.<init>(r3, r4, r5)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6644(0x19f4, float:9.31E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.Player> getCurrentPlayer() {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzct r1 = com.google.android.gms.internal.games.zzct.zza
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 6641(0x19f1, float:9.306E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r2.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.Player>> getCurrentPlayer(boolean r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzcx r1 = new com.google.android.gms.internal.games.zzcx
            r1.<init>(r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 6641(0x19f1, float:9.306E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<java.lang.String> getCurrentPlayerId() {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzcq r1 = com.google.android.gms.internal.games.zzcq.zza
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 6640(0x19f0, float:9.305E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r2.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getPlayerSearchIntent() {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzcs r1 = com.google.android.gms.internal.games.zzcs.zza
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 6645(0x19f5, float:9.312E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r2.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.PlayerBuffer>> loadFriends(int r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "friends_all"
            com.google.android.gms.tasks.Task r2 = r1.zzb(r0, r2, r3)
            return r2
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.PlayerBuffer>> loadMoreFriends(int r2) {
            r1 = this;
            java.lang.String r0 = "friends_all"
            com.google.android.gms.tasks.Task r2 = r1.zza(r0, r2)
            return r2
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.PlayerBuffer>> loadMoreRecentlyPlayedWithPlayers(int r2) {
            r1 = this;
            java.lang.String r0 = "played_with"
            com.google.android.gms.tasks.Task r2 = r1.zza(r0, r2)
            return r2
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.Player>> loadPlayer(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzcu r1 = new com.google.android.gms.internal.games.zzcu
            r2 = 0
            r1.<init>(r4, r2)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r4 = r0.run(r1)
            r0 = 6642(0x19f2, float:9.307E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r4 = r4.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r4 = r4.build()
            com.google.android.gms.tasks.Task r4 = r3.doRead(r4)
            return r4
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.Player>> loadPlayer(java.lang.String r3, boolean r4) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzcu r1 = new com.google.android.gms.internal.games.zzcu
            r1.<init>(r3, r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r4 = 6642(0x19f2, float:9.307E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r4)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.PlayerBuffer>> loadRecentlyPlayedWithPlayers(int r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "played_with"
            com.google.android.gms.tasks.Task r2 = r1.zzb(r0, r2, r3)
            return r2
    }
}
