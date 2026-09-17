package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzad implements com.google.android.gms.games.video.Videos.CaptureAvailableResult {
    private final com.google.android.gms.common.api.Status zza;
    private final boolean zzb;

    zzad(com.google.android.gms.common.api.Status r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.games.video.Videos.CaptureAvailableResult
    public final boolean isAvailable() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }
}
