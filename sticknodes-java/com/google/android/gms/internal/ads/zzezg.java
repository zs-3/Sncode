package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzezg implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;
    private final com.google.android.gms.internal.ads.zzhja zzc;

    public zzezg(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3, com.google.android.gms.internal.ads.zzhja r4, com.google.android.gms.internal.ads.zzhja r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            r0.zzc = r4
            return
    }

    public static com.google.android.gms.internal.ads.zzeze zza(java.lang.String r7, com.google.android.gms.internal.ads.zzbax r8, com.google.android.gms.internal.ads.zzcad r9, java.util.concurrent.ScheduledExecutorService r10, com.google.android.gms.internal.ads.zzgfz r11) {
            com.google.android.gms.internal.ads.zzeze r6 = new com.google.android.gms.internal.ads.zzeze
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r7 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r7.zza
            com.google.android.gms.internal.ads.zzfak r0 = (com.google.android.gms.internal.ads.zzfak) r0
            java.lang.String r2 = r0.zza()
            com.google.android.gms.internal.ads.zzbax r3 = com.google.android.gms.internal.ads.zzcmq.zza()
            com.google.android.gms.internal.ads.zzhja r0 = r7.zzb
            java.lang.Object r0 = r0.zzb()
            r4 = r0
            com.google.android.gms.internal.ads.zzcad r4 = (com.google.android.gms.internal.ads.zzcad) r4
            com.google.android.gms.internal.ads.zzhja r0 = r7.zzc
            java.lang.Object r0 = r0.zzb()
            r5 = r0
            java.util.concurrent.ScheduledExecutorService r5 = (java.util.concurrent.ScheduledExecutorService) r5
            com.google.android.gms.internal.ads.zzgfz r6 = com.google.android.gms.internal.ads.zzfkb.zzc()
            com.google.android.gms.internal.ads.zzeze r0 = new com.google.android.gms.internal.ads.zzeze
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }
}
