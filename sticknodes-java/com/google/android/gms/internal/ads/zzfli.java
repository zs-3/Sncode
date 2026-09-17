package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfli implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;

    public zzfli(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            r0.zzb = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r4 = this;
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzfkb.zzc()
            com.google.android.gms.internal.ads.zzhja r1 = r4.zza
            java.lang.Object r1 = r1.zzb()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            com.google.android.gms.internal.ads.zzhja r2 = r4.zzb
            com.google.android.gms.internal.ads.zzflj r2 = (com.google.android.gms.internal.ads.zzflj) r2
            com.google.android.gms.internal.ads.zzflf r2 = r2.zza()
            com.google.android.gms.internal.ads.zzflg r3 = new com.google.android.gms.internal.ads.zzflg
            r3.<init>(r0, r1, r2)
            return r3
    }
}
