package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzfb implements com.google.android.gms.games.video.Videos.CaptureAvailableResult {
    final /* synthetic */ com.google.android.gms.common.api.Status zza;

    zzfb(com.google.android.gms.internal.games.zzfd r1, com.google.android.gms.common.api.Status r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
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
            r0 = 0
            return r0
    }
}
