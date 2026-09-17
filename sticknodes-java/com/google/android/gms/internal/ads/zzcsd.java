package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcsd implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;

    public zzcsd(com.google.android.gms.internal.ads.zzhja r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final java.lang.Boolean zza() {
            r3 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r3.zza
            com.google.android.gms.internal.ads.zzcxr r0 = (com.google.android.gms.internal.ads.zzcxr) r0
            com.google.android.gms.internal.ads.zzfhc r0 = r0.zza()
            com.google.android.gms.internal.ads.zzbht r0 = r0.zza()
            r1 = 1
            if (r0 != 0) goto L23
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfr
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L22
            goto L23
        L22:
            r1 = 0
        L23:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r1 = this;
            java.lang.Boolean r0 = r1.zza()
            return r0
    }
}
