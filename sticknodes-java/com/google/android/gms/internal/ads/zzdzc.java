package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdzc implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;
    private final com.google.android.gms.internal.ads.zzhja zzc;

    public zzdzc(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3, com.google.android.gms.internal.ads.zzhja r4, com.google.android.gms.internal.ads.zzhja r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r4
            r0.zzc = r5
            return
    }

    public final com.google.android.gms.internal.ads.zzdzb zza() {
            r7 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r7.zza
            java.lang.Object r0 = r0.zzb()
            r2 = r0
            java.util.concurrent.ScheduledExecutorService r2 = (java.util.concurrent.ScheduledExecutorService) r2
            com.google.android.gms.internal.ads.zzgfz r3 = com.google.android.gms.internal.ads.zzfkb.zzc()
            com.google.android.gms.internal.ads.zzgfz r4 = com.google.android.gms.internal.ads.zzfkf.zzc()
            com.google.android.gms.internal.ads.zzhja r0 = r7.zzb
            com.google.android.gms.internal.ads.zzdzu r0 = (com.google.android.gms.internal.ads.zzdzu) r0
            com.google.android.gms.internal.ads.zzdzt r5 = r0.zza()
            com.google.android.gms.internal.ads.zzhja r0 = r7.zzc
            com.google.android.gms.internal.ads.zzhir r0 = com.google.android.gms.internal.ads.zzhit.zza(r0)
            com.google.android.gms.internal.ads.zzhic r6 = com.google.android.gms.internal.ads.zzhih.zza(r0)
            com.google.android.gms.internal.ads.zzdzb r0 = new com.google.android.gms.internal.ads.zzdzb
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdzb r0 = r1.zza()
            return r0
    }
}
