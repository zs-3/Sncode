package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdqr implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;

    public zzdqr(com.google.android.gms.internal.ads.zzhja r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r2.zza
            com.google.android.gms.internal.ads.zzcxr r0 = (com.google.android.gms.internal.ads.zzcxr) r0
            com.google.android.gms.internal.ads.zzfhc r0 = r0.zza()
            com.google.android.gms.internal.ads.zzfgp r0 = r0.zzo
            int r0 = r0.zza
            r1 = 3
            if (r0 != r1) goto L12
            java.lang.String r0 = "rewarded_interstitial"
            goto L14
        L12:
            java.lang.String r0 = "rewarded"
        L14:
            return r0
    }
}
