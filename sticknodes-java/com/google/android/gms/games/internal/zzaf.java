package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzaf implements com.google.android.gms.games.video.Videos.CaptureStateResult {
    private final com.google.android.gms.common.api.Status zza;
    private final com.google.android.gms.games.video.CaptureState zzb;

    zzaf(com.google.android.gms.common.api.Status r1, com.google.android.gms.games.video.CaptureState r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.games.video.Videos.CaptureStateResult
    public final com.google.android.gms.games.video.CaptureState getCaptureState() {
            r1 = this;
            com.google.android.gms.games.video.CaptureState r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zza
            return r0
    }
}
