package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzezt implements com.google.android.gms.internal.ads.zzexh {
    private final org.json.JSONObject zza;

    zzezt(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            org.json.JSONObject r2 = com.google.android.gms.internal.ads.zzbvw.zzc(r2, r0)
            r1.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 46
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzlz
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.ads.zzezr r0 = new com.google.android.gms.internal.ads.zzezr
            r0.<init>()
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
        L1c:
            com.google.android.gms.internal.ads.zzezs r0 = new com.google.android.gms.internal.ads.zzezs
            r0.<init>(r2)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
    }

    final /* synthetic */ void zzc(org.json.JSONObject r3) {
            r2 = this;
            java.lang.String r0 = "gms_sdk_env"
            org.json.JSONObject r1 = r2.zza     // Catch: org.json.JSONException -> L8
            r3.put(r0, r1)     // Catch: org.json.JSONException -> L8
            return
        L8:
            java.lang.String r3 = "Failed putting version constants."
            com.google.android.gms.ads.internal.util.zze.zza(r3)
            return
    }
}
