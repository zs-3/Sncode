package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbqn extends com.google.android.gms.internal.ads.zzbpt {
    private final com.google.android.gms.ads.mediation.MediationInterscrollerAd zza;

    public zzbqn(com.google.android.gms.ads.mediation.MediationInterscrollerAd r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final com.google.android.gms.dynamic.IObjectWrapper zze() {
            r1 = this;
            com.google.android.gms.ads.mediation.MediationInterscrollerAd r0 = r1.zza
            android.view.View r0 = r0.getView()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final boolean zzf() {
            r1 = this;
            com.google.android.gms.ads.mediation.MediationInterscrollerAd r0 = r1.zza
            boolean r0 = r0.shouldDelegateInterscrollerEffect()
            return r0
    }
}
