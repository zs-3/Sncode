package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcrg implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzcqy zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;
    private final com.google.android.gms.internal.ads.zzhja zzc;
    private final com.google.android.gms.internal.ads.zzhja zzd;
    private final com.google.android.gms.internal.ads.zzhja zze;

    public zzcrg(com.google.android.gms.internal.ads.zzcqy r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3, com.google.android.gms.internal.ads.zzhja r4, com.google.android.gms.internal.ads.zzhja r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            return
    }

    public static com.google.android.gms.internal.ads.zzdfs zza(com.google.android.gms.internal.ads.zzcqy r1, android.content.Context r2, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3, com.google.android.gms.internal.ads.zzfgh r4, com.google.android.gms.internal.ads.zzfhc r5) {
            com.google.android.gms.internal.ads.zzdfs r1 = new com.google.android.gms.internal.ads.zzdfs
            com.google.android.gms.internal.ads.zzcqw r0 = new com.google.android.gms.internal.ads.zzcqw
            r0.<init>(r2, r3, r4, r5)
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf
            r1.<init>(r0, r2)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r5 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r5.zzb
            java.lang.Object r0 = r0.zzb()
            android.content.Context r0 = (android.content.Context) r0
            com.google.android.gms.internal.ads.zzhja r1 = r5.zzc
            com.google.android.gms.internal.ads.zzcih r1 = (com.google.android.gms.internal.ads.zzcih) r1
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r1.zza()
            com.google.android.gms.internal.ads.zzhja r2 = r5.zzd
            com.google.android.gms.internal.ads.zzctv r2 = (com.google.android.gms.internal.ads.zzctv) r2
            com.google.android.gms.internal.ads.zzfgh r2 = r2.zza()
            com.google.android.gms.internal.ads.zzhja r3 = r5.zze
            com.google.android.gms.internal.ads.zzcxr r3 = (com.google.android.gms.internal.ads.zzcxr) r3
            com.google.android.gms.internal.ads.zzfhc r3 = r3.zza()
            com.google.android.gms.internal.ads.zzcqy r4 = r5.zza
            com.google.android.gms.internal.ads.zzdfs r0 = zza(r4, r0, r1, r2, r3)
            return r0
    }
}
