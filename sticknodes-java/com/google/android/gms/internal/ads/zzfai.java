package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfai implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;

    public zzfai(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            r0.zzb = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r4 = this;
            com.google.android.gms.internal.ads.zzbtq r0 = com.google.android.gms.internal.ads.zzcmw.zza()
            com.google.android.gms.internal.ads.zzhja r1 = r4.zza
            java.lang.Object r1 = r1.zzb()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            com.google.android.gms.internal.ads.zzhja r2 = r4.zzb
            com.google.android.gms.internal.ads.zzchu r2 = (com.google.android.gms.internal.ads.zzchu) r2
            android.content.Context r2 = r2.zza()
            com.google.android.gms.internal.ads.zzfag r3 = new com.google.android.gms.internal.ads.zzfag
            r3.<init>(r0, r1, r2)
            return r3
    }
}
