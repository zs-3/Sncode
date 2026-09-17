package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcip implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;

    public zzcip(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final com.google.android.gms.internal.ads.zzbvu zza() {
            r5 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r5.zza
            com.google.android.gms.internal.ads.zzchu r0 = (com.google.android.gms.internal.ads.zzchu) r0
            android.content.Context r0 = r0.zza()
            com.google.android.gms.internal.ads.zzhja r1 = r5.zzb
            java.lang.Object r1 = r1.zzb()
            com.google.android.gms.internal.ads.zzfmd r1 = (com.google.android.gms.internal.ads.zzfmd) r1
            com.google.android.gms.internal.ads.zzboe r2 = com.google.android.gms.ads.internal.zzu.zzf()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            com.google.android.gms.internal.ads.zzbon r2 = r2.zzb(r0, r3, r1)
            com.google.android.gms.internal.ads.zzboh r3 = com.google.android.gms.internal.ads.zzbok.zza
            java.lang.String r4 = "google.afma.request.getAdDictionary"
            r2.zza(r4, r3, r3)
            com.google.android.gms.internal.ads.zzboe r2 = com.google.android.gms.ads.internal.zzu.zzf()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            com.google.android.gms.internal.ads.zzbon r1 = r2.zzb(r0, r4, r1)
            java.lang.String r2 = "google.afma.sdkConstants.getSdkConstants"
            com.google.android.gms.internal.ads.zzbod r1 = r1.zza(r2, r3, r3)
            com.google.android.gms.internal.ads.zzbvw r2 = new com.google.android.gms.internal.ads.zzbvw
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            r2.<init>(r0, r1, r3)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbvu r0 = r1.zza()
            return r0
    }
}
