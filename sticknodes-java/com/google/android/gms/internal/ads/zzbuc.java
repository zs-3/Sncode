package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzbuc extends com.google.android.gms.internal.ads.zzbzh {
    final /* synthetic */ com.google.android.gms.ads.query.QueryInfoGenerationCallback zza;

    zzbuc(com.google.android.gms.internal.ads.zzbud r1, com.google.android.gms.ads.query.QueryInfoGenerationCallback r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzb(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.ads.query.QueryInfoGenerationCallback r0 = r1.zza
            r0.onFailure(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzc(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
            r2 = this;
            com.google.android.gms.ads.query.QueryInfo r0 = new com.google.android.gms.ads.query.QueryInfo
            com.google.android.gms.ads.internal.client.zzfb r1 = new com.google.android.gms.ads.internal.client.zzfb
            r1.<init>(r3, r5, r4)
            r0.<init>(r1)
            com.google.android.gms.ads.query.QueryInfoGenerationCallback r3 = r2.zza
            r3.onSuccess(r0)
            return
    }
}
