package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzfk implements com.google.android.gms.games.video.Videos {
    public zzfk() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.games.video.Videos
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.video.Videos.CaptureCapabilitiesResult> getCaptureCapabilities(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            com.google.android.gms.internal.games.zzey r0 = new com.google.android.gms.internal.games.zzey
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }

    @Override // com.google.android.gms.games.video.Videos
    public final android.content.Intent getCaptureOverlayIntent(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            r0 = 1
            com.google.android.gms.games.internal.zzbz r2 = com.google.android.gms.games.Games.zzd(r2, r0)
            android.content.Intent r2 = r2.zzw()
            return r2
    }

    @Override // com.google.android.gms.games.video.Videos
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.video.Videos.CaptureStateResult> getCaptureState(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            com.google.android.gms.internal.games.zzez r0 = new com.google.android.gms.internal.games.zzez
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }

    @Override // com.google.android.gms.games.video.Videos
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.video.Videos.CaptureAvailableResult> isCaptureAvailable(com.google.android.gms.common.api.GoogleApiClient r2, int r3) {
            r1 = this;
            com.google.android.gms.internal.games.zzfa r0 = new com.google.android.gms.internal.games.zzfa
            r0.<init>(r1, r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }

    @Override // com.google.android.gms.games.video.Videos
    public final boolean isCaptureSupported(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            r0 = 1
            com.google.android.gms.games.internal.zzbz r2 = com.google.android.gms.games.Games.zzd(r2, r0)
            boolean r2 = r2.zzbe()
            return r2
    }

    @Override // com.google.android.gms.games.video.Videos
    public final void registerCaptureOverlayStateChangedListener(com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.games.video.Videos.CaptureOverlayStateListener r3) {
            r1 = this;
            r0 = 0
            com.google.android.gms.games.internal.zzbz r0 = com.google.android.gms.games.Games.zzd(r2, r0)
            if (r0 == 0) goto Le
            com.google.android.gms.common.api.internal.ListenerHolder r2 = r2.registerListener(r3)
            r0.zzaK(r2)
        Le:
            return
    }

    @Override // com.google.android.gms.games.video.Videos
    public final void unregisterCaptureOverlayStateChangedListener(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            r0 = 0
            com.google.android.gms.games.internal.zzbz r2 = com.google.android.gms.games.Games.zzd(r2, r0)
            if (r2 == 0) goto La
            r2.zzbc()
        La:
            return
    }
}
