package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdhj implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;
    private final com.google.android.gms.internal.ads.zzhja zzc;
    private final com.google.android.gms.internal.ads.zzhja zzd;

    public zzdhj(com.google.android.gms.internal.ads.zzdhc r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3, com.google.android.gms.internal.ads.zzhja r4, com.google.android.gms.internal.ads.zzhja r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r6 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r6.zza
            java.lang.Object r0 = r0.zzb()
            android.content.Context r0 = (android.content.Context) r0
            com.google.android.gms.internal.ads.zzhja r1 = r6.zzb
            com.google.android.gms.internal.ads.zzcih r1 = (com.google.android.gms.internal.ads.zzcih) r1
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r1.zza()
            com.google.android.gms.internal.ads.zzhja r2 = r6.zzc
            com.google.android.gms.internal.ads.zzctv r2 = (com.google.android.gms.internal.ads.zzctv) r2
            com.google.android.gms.internal.ads.zzfgh r2 = r2.zza()
            com.google.android.gms.internal.ads.zzhja r3 = r6.zzd
            com.google.android.gms.internal.ads.zzcxr r3 = (com.google.android.gms.internal.ads.zzcxr) r3
            com.google.android.gms.internal.ads.zzfhc r3 = r3.zza()
            com.google.android.gms.internal.ads.zzdfs r4 = new com.google.android.gms.internal.ads.zzdfs
            com.google.android.gms.internal.ads.zzdha r5 = new com.google.android.gms.internal.ads.zzdha
            r5.<init>(r0, r1, r2, r3)
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zzf
            r4.<init>(r5, r0)
            return r4
    }
}
