package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzk extends com.google.android.gms.games.internal.zzbr {
    zzk(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zze(int r3, android.os.Bundle r4) {
            r2 = this;
            com.google.android.gms.games.internal.zzaf r0 = new com.google.android.gms.games.internal.zzaf
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r1.<init>(r3)
            com.google.android.gms.games.video.CaptureState r3 = com.google.android.gms.games.video.CaptureState.zza(r4)
            r0.<init>(r1, r3)
            r2.zzw(r0)
            return
    }
}
