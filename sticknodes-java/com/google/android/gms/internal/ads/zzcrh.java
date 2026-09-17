package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcrh implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzcqy zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;

    public zzcrh(com.google.android.gms.internal.ads.zzcqy r1, com.google.android.gms.internal.ads.zzhja r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public static java.util.Set zza(com.google.android.gms.internal.ads.zzcqy r1, com.google.android.gms.internal.ads.zzcst r2) {
            com.google.android.gms.internal.ads.zzdfs r1 = new com.google.android.gms.internal.ads.zzdfs
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zzf
            r1.<init>(r2, r0)
            java.util.Set r1 = java.util.Collections.singleton(r1)
            com.google.android.gms.internal.ads.zzhiq.zzb(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r2.zzb
            java.lang.Object r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzcst r0 = (com.google.android.gms.internal.ads.zzcst) r0
            com.google.android.gms.internal.ads.zzcqy r1 = r2.zza
            java.util.Set r0 = zza(r1, r0)
            return r0
    }
}
