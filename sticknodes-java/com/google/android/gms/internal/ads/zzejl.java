package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzejl implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;
    private final com.google.android.gms.internal.ads.zzhja zzc;

    public zzejl(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r4 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r4.zza
            java.lang.Object r0 = r0.zzb()
            android.content.Context r0 = (android.content.Context) r0
            com.google.android.gms.internal.ads.zzhja r1 = r4.zzb
            java.lang.Object r1 = r1.zzb()
            com.google.android.gms.internal.ads.zzdiy r1 = (com.google.android.gms.internal.ads.zzdiy) r1
            com.google.android.gms.internal.ads.zzhja r2 = r4.zzc
            com.google.android.gms.internal.ads.zzcih r2 = (com.google.android.gms.internal.ads.zzcih) r2
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r2.zza()
            com.google.android.gms.internal.ads.zzejk r3 = new com.google.android.gms.internal.ads.zzejk
            r3.<init>(r0, r1, r2)
            return r3
    }
}
