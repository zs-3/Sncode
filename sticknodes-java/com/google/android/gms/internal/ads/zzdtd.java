package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdtd implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;
    private final com.google.android.gms.internal.ads.zzhja zzc;

    public zzdtd(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3, com.google.android.gms.internal.ads.zzhja r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r6 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r6.zza
            java.lang.Object r0 = r0.zzb()
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.internal.ads.zzhja r1 = r6.zzb
            com.google.android.gms.internal.ads.zzchu r1 = (com.google.android.gms.internal.ads.zzchu) r1
            android.content.Context r1 = r1.zza()
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzfkb.zzc()
            com.google.android.gms.internal.ads.zzhja r3 = r6.zzc
            com.google.android.gms.internal.ads.zzhim r3 = (com.google.android.gms.internal.ads.zzhim) r3
            java.util.Map r3 = r3.zzd()
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzeO
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L4f
            com.google.android.gms.internal.ads.zzbbu r4 = new com.google.android.gms.internal.ads.zzbbu
            com.google.android.gms.internal.ads.zzbca r5 = new com.google.android.gms.internal.ads.zzbca
            r5.<init>(r1)
            r4.<init>(r5)
            com.google.android.gms.internal.ads.zzdte r1 = new com.google.android.gms.internal.ads.zzdte
            r1.<init>(r0)
            r4.zzb(r1)
            com.google.android.gms.internal.ads.zzdtg r0 = new com.google.android.gms.internal.ads.zzdtg
            r0.<init>(r4, r3)
            com.google.android.gms.internal.ads.zzdfs r1 = new com.google.android.gms.internal.ads.zzdfs
            r1.<init>(r0, r2)
            java.util.Set r0 = java.util.Collections.singleton(r1)
            goto L53
        L4f:
            java.util.Set r0 = java.util.Collections.emptySet()
        L53:
            com.google.android.gms.internal.ads.zzhiq.zzb(r0)
            return r0
    }
}
