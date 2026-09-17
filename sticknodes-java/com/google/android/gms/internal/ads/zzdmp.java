package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdmp implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;
    private final com.google.android.gms.internal.ads.zzhja zzc;

    public zzdmp(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3, com.google.android.gms.internal.ads.zzhja r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r5 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r5.zza
            com.google.android.gms.internal.ads.zzdli r0 = (com.google.android.gms.internal.ads.zzdli) r0
            com.google.android.gms.internal.ads.zzdkp r0 = r0.zza()
            com.google.android.gms.internal.ads.zzhja r1 = r5.zzb
            com.google.android.gms.internal.ads.zzdjq r1 = (com.google.android.gms.internal.ads.zzdjq) r1
            com.google.android.gms.internal.ads.zzdku r1 = r1.zza()
            com.google.android.gms.internal.ads.zzhja r2 = r5.zzc
            java.lang.Object r2 = r2.zzb()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            com.google.android.gms.internal.ads.zzgfz r3 = com.google.android.gms.internal.ads.zzfkb.zzc()
            com.google.android.gms.internal.ads.zzdmo r4 = new com.google.android.gms.internal.ads.zzdmo
            r4.<init>(r0, r1, r2, r3)
            return r4
    }
}
