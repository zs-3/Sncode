package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdsd implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;
    private final com.google.android.gms.internal.ads.zzhja zzc;
    private final com.google.android.gms.internal.ads.zzhja zzd;
    private final com.google.android.gms.internal.ads.zzhja zze;

    public zzdsd(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3, com.google.android.gms.internal.ads.zzhja r4, com.google.android.gms.internal.ads.zzhja r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r7 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r7.zza
            com.google.android.gms.internal.ads.zzchu r0 = (com.google.android.gms.internal.ads.zzchu) r0
            android.content.Context r0 = r0.zza()
            com.google.android.gms.internal.ads.zzhja r1 = r7.zzb
            com.google.android.gms.internal.ads.zzdyu r1 = (com.google.android.gms.internal.ads.zzdyu) r1
            java.lang.String r1 = r1.zza()
            com.google.android.gms.internal.ads.zzhja r2 = r7.zzc
            com.google.android.gms.internal.ads.zzcih r2 = (com.google.android.gms.internal.ads.zzcih) r2
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r2.zza()
            com.google.android.gms.internal.ads.zzhja r3 = r7.zzd
            java.lang.Object r3 = r3.zzb()
            com.google.android.gms.internal.ads.zzbcb$zza$zza r3 = (com.google.android.gms.internal.ads.zzbcb.zza.EnumC0006zza) r3
            com.google.android.gms.internal.ads.zzhja r4 = r7.zze
            java.lang.Object r4 = r4.zzb()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.internal.ads.zzbbu r5 = new com.google.android.gms.internal.ads.zzbbu
            com.google.android.gms.internal.ads.zzbca r6 = new com.google.android.gms.internal.ads.zzbca
            r6.<init>(r0)
            r5.<init>(r6)
            com.google.android.gms.internal.ads.zzbcb$zzar$zza r0 = com.google.android.gms.internal.ads.zzbcb.zzar.zzd()
            int r6 = r2.buddyApkVersion
            r0.zzg(r6)
            int r6 = r2.clientJarVersion
            r0.zzi(r6)
            boolean r2 = r2.isClientJar
            r6 = 1
            if (r6 == r2) goto L47
            r2 = 2
            goto L48
        L47:
            r2 = 0
        L48:
            r0.zzh(r2)
            com.google.android.gms.internal.ads.zzhbe r0 = r0.zzbn()
            com.google.android.gms.internal.ads.zzbcb$zzar r0 = (com.google.android.gms.internal.ads.zzbcb.zzar) r0
            com.google.android.gms.internal.ads.zzdsc r2 = new com.google.android.gms.internal.ads.zzdsc
            r2.<init>(r3, r1, r0, r4)
            r5.zzb(r2)
            return r5
    }
}
