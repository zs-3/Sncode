package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzemd implements com.google.android.gms.internal.ads.zzegk {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcrv zzb;
    private final com.google.android.gms.internal.ads.zzbdq zzc;
    private final com.google.android.gms.internal.ads.zzgfz zzd;
    private final com.google.android.gms.internal.ads.zzflg zze;

    public zzemd(android.content.Context r1, com.google.android.gms.internal.ads.zzcrv r2, com.google.android.gms.internal.ads.zzflg r3, com.google.android.gms.internal.ads.zzgfz r4, com.google.android.gms.internal.ads.zzbdq r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zze = r3
            r0.zzd = r4
            r0.zzc = r5
            return
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfgt r8, com.google.android.gms.internal.ads.zzfgh r9) {
            r7 = this;
            com.google.android.gms.internal.ads.zzemb r6 = new com.google.android.gms.internal.ads.zzemb
            android.view.View r2 = new android.view.View
            android.content.Context r0 = r7.zza
            r2.<init>(r0)
            com.google.android.gms.internal.ads.zzelz r4 = new com.google.android.gms.internal.ads.zzelz
            r4.<init>()
            java.util.List r0 = r9.zzu
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r5 = r0
            com.google.android.gms.internal.ads.zzfgi r5 = (com.google.android.gms.internal.ads.zzfgi) r5
            r3 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.internal.ads.zzctu r0 = new com.google.android.gms.internal.ads.zzctu
            r1 = 0
            r0.<init>(r8, r9, r1)
            com.google.android.gms.internal.ads.zzcrv r8 = r7.zzb
            com.google.android.gms.internal.ads.zzcqs r8 = r8.zza(r0, r6)
            com.google.android.gms.internal.ads.zzbdl r0 = new com.google.android.gms.internal.ads.zzbdl
            com.google.android.gms.internal.ads.zzemc r1 = r8.zzl()
            com.google.android.gms.internal.ads.zzfgm r9 = r9.zzs
            java.lang.String r2 = r9.zzb
            java.lang.String r9 = r9.zza
            r0.<init>(r1, r2, r9)
            com.google.android.gms.internal.ads.zzfla r9 = com.google.android.gms.internal.ads.zzfla.zzt
            com.google.android.gms.internal.ads.zzema r1 = new com.google.android.gms.internal.ads.zzema
            r1.<init>(r7, r0)
            com.google.android.gms.internal.ads.zzflg r0 = r7.zze
            com.google.android.gms.internal.ads.zzgfz r2 = r7.zzd
            com.google.android.gms.internal.ads.zzfkx r9 = com.google.android.gms.internal.ads.zzfkq.zzd(r1, r2, r9, r0)
            com.google.android.gms.internal.ads.zzfla r0 = com.google.android.gms.internal.ads.zzfla.zzu
            com.google.android.gms.internal.ads.zzfkx r9 = r9.zzb(r0)
            com.google.android.gms.internal.ads.zzcqr r8 = r8.zza()
            com.google.common.util.concurrent.ListenableFuture r8 = com.google.android.gms.internal.ads.zzgfo.zzh(r8)
            com.google.android.gms.internal.ads.zzfkx r8 = r9.zzd(r8)
            com.google.android.gms.internal.ads.zzfkl r8 = r8.zza()
            return r8
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(com.google.android.gms.internal.ads.zzfgt r1, com.google.android.gms.internal.ads.zzfgh r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbdq r1 = r0.zzc
            if (r1 == 0) goto Le
            com.google.android.gms.internal.ads.zzfgm r1 = r2.zzs
            if (r1 == 0) goto Le
            java.lang.String r1 = r1.zza
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzbdl r2) throws java.lang.Exception {
            r1 = this;
            com.google.android.gms.internal.ads.zzbdq r0 = r1.zzc
            r0.zze(r2)
            return
    }
}
