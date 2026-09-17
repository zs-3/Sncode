package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcib implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;

    public zzcib(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r4 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r4.zza
            java.lang.Object r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzdwi r0 = (com.google.android.gms.internal.ads.zzdwi) r0
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzfkb.zzc()
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzbG
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L28
            com.google.android.gms.internal.ads.zzdfs r2 = new com.google.android.gms.internal.ads.zzdfs
            r2.<init>(r0, r1)
            java.util.Set r0 = java.util.Collections.singleton(r2)
            goto L2c
        L28:
            java.util.Set r0 = java.util.Collections.emptySet()
        L2c:
            com.google.android.gms.internal.ads.zzhiq.zzb(r0)
            return r0
    }
}
