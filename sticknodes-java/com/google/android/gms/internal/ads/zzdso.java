package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdso implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;

    public zzdso(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r4 = this;
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzfkb.zzc()
            com.google.android.gms.internal.ads.zzhja r1 = r4.zza
            com.google.android.gms.internal.ads.zzdth r1 = (com.google.android.gms.internal.ads.zzdth) r1
            com.google.android.gms.internal.ads.zzdtg r1 = r1.zza()
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzeO
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L28
            com.google.android.gms.internal.ads.zzdfs r2 = new com.google.android.gms.internal.ads.zzdfs
            r2.<init>(r1, r0)
            java.util.Set r0 = java.util.Collections.singleton(r2)
            goto L2c
        L28:
            java.util.Set r0 = java.util.Collections.emptySet()
        L2c:
            com.google.android.gms.internal.ads.zzhiq.zzb(r0)
            return r0
    }
}
