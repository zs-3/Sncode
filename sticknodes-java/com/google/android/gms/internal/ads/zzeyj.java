package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeyj implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;
    private final com.google.android.gms.internal.ads.zzhja zzc;
    private final com.google.android.gms.internal.ads.zzhja zzd;
    private final com.google.android.gms.internal.ads.zzhja zze;

    public zzeyj(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3, com.google.android.gms.internal.ads.zzhja r4, com.google.android.gms.internal.ads.zzhja r5, com.google.android.gms.internal.ads.zzhja r6, com.google.android.gms.internal.ads.zzhja r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r5
            r0.zzd = r6
            r0.zze = r7
            return
    }

    public static com.google.android.gms.internal.ads.zzeyh zza(com.google.android.gms.internal.ads.zzbzu r9, android.content.Context r10, java.util.concurrent.ScheduledExecutorService r11, java.util.concurrent.Executor r12, int r13, boolean r14, boolean r15) {
            com.google.android.gms.internal.ads.zzeyh r8 = new com.google.android.gms.internal.ads.zzeyh
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r9 = this;
            com.google.android.gms.internal.ads.zzbzu r1 = com.google.android.gms.internal.ads.zzcmy.zza()
            com.google.android.gms.internal.ads.zzhja r0 = r9.zza
            com.google.android.gms.internal.ads.zzchu r0 = (com.google.android.gms.internal.ads.zzchu) r0
            android.content.Context r2 = r0.zza()
            com.google.android.gms.internal.ads.zzhja r0 = r9.zzb
            java.lang.Object r0 = r0.zzb()
            r3 = r0
            java.util.concurrent.ScheduledExecutorService r3 = (java.util.concurrent.ScheduledExecutorService) r3
            com.google.android.gms.internal.ads.zzgfz r4 = com.google.android.gms.internal.ads.zzfkb.zzc()
            com.google.android.gms.internal.ads.zzhja r0 = r9.zzc
            com.google.android.gms.internal.ads.zzfal r0 = (com.google.android.gms.internal.ads.zzfal) r0
            java.lang.Integer r0 = r0.zza()
            int r5 = r0.intValue()
            com.google.android.gms.internal.ads.zzhja r0 = r9.zzd
            com.google.android.gms.internal.ads.zzfam r0 = (com.google.android.gms.internal.ads.zzfam) r0
            java.lang.Boolean r0 = r0.zza()
            boolean r6 = r0.booleanValue()
            com.google.android.gms.internal.ads.zzhja r0 = r9.zze
            com.google.android.gms.internal.ads.zzfao r0 = (com.google.android.gms.internal.ads.zzfao) r0
            java.lang.Boolean r0 = r0.zza()
            boolean r7 = r0.booleanValue()
            com.google.android.gms.internal.ads.zzeyh r8 = new com.google.android.gms.internal.ads.zzeyh
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }
}
