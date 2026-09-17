package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzbue extends com.google.android.gms.internal.ads.zzbua {
    final /* synthetic */ com.google.android.gms.ads.query.UpdateImpressionUrlsCallback zza;

    zzbue(com.google.android.gms.internal.ads.zzbuj r1, com.google.android.gms.ads.query.UpdateImpressionUrlsCallback r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbub
    public final void zze(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.ads.query.UpdateImpressionUrlsCallback r0 = r1.zza
            r0.onFailure(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbub
    public final void zzf(java.util.List r2) {
            r1 = this;
            com.google.android.gms.ads.query.UpdateImpressionUrlsCallback r0 = r1.zza
            r0.onSuccess(r2)
            return
    }
}
