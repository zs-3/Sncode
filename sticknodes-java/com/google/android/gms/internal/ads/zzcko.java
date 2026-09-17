package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcko implements com.google.android.gms.internal.ads.zzdvf {
    private final java.lang.Long zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.ads.zzcjk zzc;
    private final com.google.android.gms.internal.ads.zzcks zzd;

    /* synthetic */ zzcko(com.google.android.gms.internal.ads.zzcjk r1, com.google.android.gms.internal.ads.zzcks r2, java.lang.Long r3, java.lang.String r4, com.google.android.gms.internal.ads.zzckn r5) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzd = r2
            r0.zza = r3
            r0.zzb = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdvf
    public final com.google.android.gms.internal.ads.zzdvp zza() {
            r8 = this;
            com.google.android.gms.internal.ads.zzcks r0 = r8.zzd
            java.lang.Long r1 = r8.zza
            long r2 = r1.longValue()
            android.content.Context r4 = com.google.android.gms.internal.ads.zzcks.zza(r0)
            com.google.android.gms.internal.ads.zzdvi r5 = com.google.android.gms.internal.ads.zzcks.zzc(r0)
            com.google.android.gms.internal.ads.zzcjk r6 = r8.zzc
            java.lang.String r7 = r8.zzb
            com.google.android.gms.internal.ads.zzdvp r0 = com.google.android.gms.internal.ads.zzdvq.zza(r2, r4, r5, r6, r7)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdvf
    public final com.google.android.gms.internal.ads.zzdvt zzb() {
            r8 = this;
            com.google.android.gms.internal.ads.zzcks r0 = r8.zzd
            java.lang.Long r1 = r8.zza
            long r2 = r1.longValue()
            android.content.Context r4 = com.google.android.gms.internal.ads.zzcks.zza(r0)
            com.google.android.gms.internal.ads.zzdvi r5 = com.google.android.gms.internal.ads.zzcks.zzc(r0)
            com.google.android.gms.internal.ads.zzcjk r6 = r8.zzc
            java.lang.String r7 = r8.zzb
            com.google.android.gms.internal.ads.zzdvt r0 = com.google.android.gms.internal.ads.zzdvu.zza(r2, r4, r5, r6, r7)
            return r0
    }
}
