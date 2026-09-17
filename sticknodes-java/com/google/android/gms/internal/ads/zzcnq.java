package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcnq implements com.google.android.gms.internal.ads.zzcng {
    private final com.google.android.gms.internal.ads.zzdxb zza;

    zzcnq(com.google.android.gms.internal.ads.zzdxb r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcng
    public final void zza(org.json.JSONObject r3) {
            r2 = this;
            if (r3 == 0) goto L1a
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziN
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L15
            goto L1a
        L15:
            com.google.android.gms.internal.ads.zzdxb r0 = r2.zza
            r0.zzn(r3)
        L1a:
            return
    }
}
