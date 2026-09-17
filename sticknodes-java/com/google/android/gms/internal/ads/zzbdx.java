package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbdx implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;
    private final com.google.android.gms.internal.ads.zzhja zzc;
    private final com.google.android.gms.internal.ads.zzhja zzd;

    public zzbdx(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3, com.google.android.gms.internal.ads.zzhja r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public final com.google.android.gms.internal.ads.zzbdw zza() {
            r5 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r5.zza
            java.lang.Object r0 = r0.zzb()
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            com.google.android.gms.internal.ads.zzhja r1 = r5.zzb
            java.lang.Object r1 = r1.zzb()
            com.google.android.gms.ads.nonagon.signalgeneration.zzj r1 = (com.google.android.gms.ads.nonagon.signalgeneration.zzj) r1
            com.google.android.gms.internal.ads.zzhja r2 = r5.zzc
            java.lang.Object r2 = r2.zzb()
            com.google.android.gms.ads.nonagon.signalgeneration.zza r2 = (com.google.android.gms.ads.nonagon.signalgeneration.zza) r2
            com.google.android.gms.internal.ads.zzhja r3 = r5.zzd
            java.lang.Object r3 = r3.zzb()
            com.google.android.gms.internal.ads.zzdui r3 = (com.google.android.gms.internal.ads.zzdui) r3
            com.google.android.gms.internal.ads.zzbdw r4 = new com.google.android.gms.internal.ads.zzbdw
            r4.<init>(r0, r1, r2, r3)
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbdw r0 = r1.zza()
            return r0
    }
}
