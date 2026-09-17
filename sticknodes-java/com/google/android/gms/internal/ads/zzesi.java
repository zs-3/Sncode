package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzesi implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;

    public zzesi(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r5 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r5.zza
            com.google.android.gms.internal.ads.zzext r0 = (com.google.android.gms.internal.ads.zzext) r0
            com.google.android.gms.internal.ads.zzexs r0 = r0.zza()
            com.google.android.gms.internal.ads.zzhja r1 = r5.zzb
            java.lang.Object r1 = r1.zzb()
            com.google.android.gms.common.util.Clock r1 = (com.google.android.gms.common.util.Clock) r1
            com.google.android.gms.internal.ads.zzerx r2 = new com.google.android.gms.internal.ads.zzerx
            com.google.android.gms.internal.ads.zzbeb r3 = com.google.android.gms.internal.ads.zzbeg.zza
            java.lang.Object r3 = r3.zze()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r2.<init>(r0, r3, r1)
            return r2
    }
}
