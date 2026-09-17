package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeti implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;

    public zzeti(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r5 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r5.zza
            com.google.android.gms.internal.ads.zzewu r0 = (com.google.android.gms.internal.ads.zzewu) r0
            com.google.android.gms.internal.ads.zzews r0 = r0.zza()
            com.google.android.gms.internal.ads.zzhja r1 = r5.zzb
            java.lang.Object r1 = r1.zzb()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            com.google.android.gms.internal.ads.zzevp r2 = new com.google.android.gms.internal.ads.zzevp
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzlI
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r3 = (long) r3
            r2.<init>(r0, r3, r1)
            return r2
    }
}
