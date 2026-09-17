package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdpa implements com.google.android.gms.internal.ads.zzbfq {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdpb zzb;

    zzdpa(com.google.android.gms.internal.ads.zzdpb r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r2 = "_videoMediaView"
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final org.json.JSONObject zza() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final org.json.JSONObject zzb() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzdpb r0 = r2.zzb
            com.google.android.gms.internal.ads.zzdkk r1 = com.google.android.gms.internal.ads.zzdpb.zzc(r0)
            if (r1 == 0) goto L11
            java.lang.String r1 = r2.zza
            com.google.android.gms.internal.ads.zzdkk r0 = com.google.android.gms.internal.ads.zzdpb.zzc(r0)
            r0.zzF(r1)
        L11:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzd(android.view.MotionEvent r1) {
            r0 = this;
            return
    }
}
