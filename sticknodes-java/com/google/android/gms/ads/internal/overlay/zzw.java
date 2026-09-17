package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzw extends com.google.android.gms.ads.internal.overlay.zzm {
    public zzw(android.app.Activity r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzm, com.google.android.gms.internal.ads.zzbtm
    public final void zzl(android.os.Bundle r1) {
            r0 = this;
            java.lang.String r1 = "AdOverlayParcel is null or does not contain valid overlay type."
            com.google.android.gms.ads.internal.util.zze.zza(r1)
            r1 = 4
            r0.zzn = r1
            android.app.Activity r1 = r0.zzb
            r1.finish()
            return
    }
}
