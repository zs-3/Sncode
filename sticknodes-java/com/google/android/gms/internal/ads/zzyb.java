package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzyb implements android.media.Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzyj zza;

    zzyb(com.google.android.gms.internal.ads.zzyc r1, com.google.android.gms.internal.ads.zzyj r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(android.media.Spatializer r1, boolean r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzyj r1 = r0.zza
            com.google.android.gms.internal.ads.zzyj.zzi(r1)
            return
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(android.media.Spatializer r1, boolean r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzyj r1 = r0.zza
            com.google.android.gms.internal.ads.zzyj.zzi(r1)
            return
    }
}
