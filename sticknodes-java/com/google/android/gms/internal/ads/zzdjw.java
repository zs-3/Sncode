package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdjw implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;
    private final com.google.android.gms.internal.ads.zzhja zzc;
    private final com.google.android.gms.internal.ads.zzhja zzd;

    public zzdjw(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3, com.google.android.gms.internal.ads.zzhja r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r6 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r6.zza
            java.lang.Object r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzayr r0 = (com.google.android.gms.internal.ads.zzayr) r0
            com.google.android.gms.internal.ads.zzhja r1 = r6.zzb
            java.lang.Object r1 = r1.zzb()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            com.google.android.gms.internal.ads.zzhja r2 = r6.zzc
            java.lang.Object r2 = r2.zzb()
            android.content.Context r2 = (android.content.Context) r2
            com.google.android.gms.internal.ads.zzhja r3 = r6.zzd
            java.lang.Object r3 = r3.zzb()
            com.google.android.gms.common.util.Clock r3 = (com.google.android.gms.common.util.Clock) r3
            com.google.android.gms.internal.ads.zzcpw r4 = new com.google.android.gms.internal.ads.zzcpw
            com.google.android.gms.internal.ads.zzcpi r5 = new com.google.android.gms.internal.ads.zzcpi
            r5.<init>(r2, r0)
            r4.<init>(r1, r5, r3)
            return r4
    }
}
