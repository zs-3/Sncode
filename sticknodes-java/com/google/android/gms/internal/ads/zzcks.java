package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcks implements com.google.android.gms.internal.ads.zzdvn {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzbkv zzb;
    private final com.google.android.gms.internal.ads.zzcjk zzc;
    private final com.google.android.gms.internal.ads.zzcks zzd;
    private final com.google.android.gms.internal.ads.zzhir zze;
    private final com.google.android.gms.internal.ads.zzhir zzf;
    private final com.google.android.gms.internal.ads.zzhir zzg;
    private final com.google.android.gms.internal.ads.zzhir zzh;

    /* synthetic */ zzcks(com.google.android.gms.internal.ads.zzcjk r1, android.content.Context r2, com.google.android.gms.internal.ads.zzbkv r3, com.google.android.gms.internal.ads.zzckr r4) {
            r0 = this;
            r0.<init>()
            r0.zzd = r0
            r0.zzc = r1
            r0.zza = r2
            r0.zzb = r3
            com.google.android.gms.internal.ads.zzhii r1 = com.google.android.gms.internal.ads.zzhij.zza(r0)
            r0.zze = r1
            com.google.android.gms.internal.ads.zzhii r2 = com.google.android.gms.internal.ads.zzhij.zza(r3)
            r0.zzf = r2
            com.google.android.gms.internal.ads.zzdvj r3 = new com.google.android.gms.internal.ads.zzdvj
            r3.<init>(r2)
            r0.zzg = r3
            com.google.android.gms.internal.ads.zzdvl r2 = new com.google.android.gms.internal.ads.zzdvl
            r2.<init>(r1, r3)
            com.google.android.gms.internal.ads.zzhir r1 = com.google.android.gms.internal.ads.zzhih.zzc(r2)
            r0.zzh = r1
            return
    }

    static /* bridge */ /* synthetic */ android.content.Context zza(com.google.android.gms.internal.ads.zzcks r0) {
            android.content.Context r0 = r0.zza
            return r0
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzdvi zzc(com.google.android.gms.internal.ads.zzcks r0) {
            com.google.android.gms.internal.ads.zzbkv r0 = r0.zzb
            com.google.android.gms.internal.ads.zzdvi r0 = com.google.android.gms.internal.ads.zzdvj.zzc(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdvn
    public final com.google.android.gms.internal.ads.zzdve zzb() {
            r4 = this;
            com.google.android.gms.internal.ads.zzckm r0 = new com.google.android.gms.internal.ads.zzckm
            com.google.android.gms.internal.ads.zzcjk r1 = r4.zzc
            com.google.android.gms.internal.ads.zzcks r2 = r4.zzd
            r3 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdvn
    public final com.google.android.gms.internal.ads.zzdvk zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhir r0 = r1.zzh
            java.lang.Object r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzdvk r0 = (com.google.android.gms.internal.ads.zzdvk) r0
            return r0
    }
}
