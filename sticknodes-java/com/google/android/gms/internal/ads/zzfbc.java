package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfbc implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;
    private final com.google.android.gms.internal.ads.zzhja zzc;
    private final com.google.android.gms.internal.ads.zzhja zzd;
    private final com.google.android.gms.internal.ads.zzhja zze;

    public zzfbc(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3, com.google.android.gms.internal.ads.zzhja r4, com.google.android.gms.internal.ads.zzhja r5, com.google.android.gms.internal.ads.zzhja r6, com.google.android.gms.internal.ads.zzhja r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r6
            r0.zze = r7
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r9 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r9.zza
            java.lang.Object r0 = r0.zzb()
            r2 = r0
            com.google.android.gms.internal.ads.zzcad r2 = (com.google.android.gms.internal.ads.zzcad) r2
            com.google.android.gms.internal.ads.zzhja r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfan r0 = (com.google.android.gms.internal.ads.zzfan) r0
            java.lang.Boolean r0 = r0.zza()
            boolean r3 = r0.booleanValue()
            com.google.android.gms.internal.ads.zzhja r0 = r9.zzc
            com.google.android.gms.internal.ads.zzfao r0 = (com.google.android.gms.internal.ads.zzfao) r0
            java.lang.Boolean r0 = r0.zza()
            boolean r4 = r0.booleanValue()
            com.google.android.gms.internal.ads.zzbzs r5 = com.google.android.gms.internal.ads.zzcna.zza()
            com.google.android.gms.internal.ads.zzgfz r6 = com.google.android.gms.internal.ads.zzfkb.zzc()
            com.google.android.gms.internal.ads.zzhja r0 = r9.zzd
            com.google.android.gms.internal.ads.zzfak r0 = (com.google.android.gms.internal.ads.zzfak) r0
            java.lang.String r7 = r0.zza()
            com.google.android.gms.internal.ads.zzhja r0 = r9.zze
            java.lang.Object r0 = r0.zzb()
            r8 = r0
            java.util.concurrent.ScheduledExecutorService r8 = (java.util.concurrent.ScheduledExecutorService) r8
            com.google.android.gms.internal.ads.zzfba r0 = new com.google.android.gms.internal.ads.zzfba
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r0
    }
}
