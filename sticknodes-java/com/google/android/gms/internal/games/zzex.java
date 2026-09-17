package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzex extends com.google.android.gms.internal.games.zzad implements com.google.android.gms.games.VideosClient {
    public static final /* synthetic */ int zza = 0;

    public zzex(android.app.Activity r1, com.google.android.gms.games.Games.GamesOptions r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public zzex(android.content.Context r1, com.google.android.gms.games.Games.GamesOptions r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.games.VideosClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.video.VideoCapabilities> getCaptureCapabilities() {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzeu r1 = com.google.android.gms.internal.games.zzeu.zza
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 6677(0x1a15, float:9.356E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r2.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.games.VideosClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getCaptureOverlayIntent() {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzer r1 = com.google.android.gms.internal.games.zzer.zza
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 6678(0x1a16, float:9.358E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r2.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.games.VideosClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.video.CaptureState> getCaptureState() {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzew r1 = com.google.android.gms.internal.games.zzew.zza
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 6679(0x1a17, float:9.359E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r2.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.games.VideosClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> isCaptureAvailable(int r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzev r1 = new com.google.android.gms.internal.games.zzev
            r1.<init>(r3)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r0.run(r1)
            r0 = 6680(0x1a18, float:9.36E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r3 = r3.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r3.build()
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    @Override // com.google.android.gms.games.VideosClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> isCaptureSupported() {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.games.zzeq r1 = com.google.android.gms.internal.games.zzeq.zza
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 6681(0x1a19, float:9.362E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r2.doRead(r0)
            return r0
    }

    @Override // com.google.android.gms.games.VideosClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> registerOnCaptureOverlayStateChangedListener(com.google.android.gms.games.VideosClient.OnCaptureOverlayStateListener r4) {
            r3 = this;
            java.lang.Class<com.google.android.gms.games.VideosClient$OnCaptureOverlayStateListener> r0 = com.google.android.gms.games.VideosClient.OnCaptureOverlayStateListener.class
            java.lang.String r0 = r0.getSimpleName()
            com.google.android.gms.common.api.internal.ListenerHolder r4 = r3.registerListener(r4, r0)
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r4.getListenerKey()
            java.lang.String r1 = "Key must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.internal.games.zzes r0 = new com.google.android.gms.internal.games.zzes
            r0.<init>(r4)
            com.google.android.gms.internal.games.zzet r1 = com.google.android.gms.internal.games.zzet.zza
            com.google.android.gms.common.api.internal.RegistrationMethods$Builder r2 = com.google.android.gms.common.api.internal.RegistrationMethods.builder()
            com.google.android.gms.common.api.internal.RegistrationMethods$Builder r0 = r2.register(r0)
            com.google.android.gms.common.api.internal.RegistrationMethods$Builder r0 = r0.unregister(r1)
            com.google.android.gms.common.api.internal.RegistrationMethods$Builder r4 = r0.withHolder(r4)
            r0 = 6682(0x1a1a, float:9.363E-42)
            com.google.android.gms.common.api.internal.RegistrationMethods$Builder r4 = r4.setMethodKey(r0)
            com.google.android.gms.common.api.internal.RegistrationMethods r4 = r4.build()
            com.google.android.gms.tasks.Task r4 = r3.doRegisterEventListener(r4)
            return r4
    }

    @Override // com.google.android.gms.games.VideosClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> unregisterOnCaptureOverlayStateChangedListener(com.google.android.gms.games.VideosClient.OnCaptureOverlayStateListener r2) {
            r1 = this;
            java.lang.Class<com.google.android.gms.games.VideosClient$OnCaptureOverlayStateListener> r0 = com.google.android.gms.games.VideosClient.OnCaptureOverlayStateListener.class
            java.lang.String r0 = r0.getSimpleName()
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r2 = com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(r2, r0)
            r0 = 6683(0x1a1b, float:9.365E-42)
            com.google.android.gms.tasks.Task r2 = r1.doUnregisterEventListener(r2, r0)
            return r2
    }
}
