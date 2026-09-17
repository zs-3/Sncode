package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzckm implements com.google.android.gms.internal.ads.zzdve {
    private final com.google.android.gms.internal.ads.zzcjk zza;
    private final com.google.android.gms.internal.ads.zzcks zzb;
    private java.lang.Long zzc;
    private java.lang.String zzd;

    /* synthetic */ zzckm(com.google.android.gms.internal.ads.zzcjk r1, com.google.android.gms.internal.ads.zzcks r2, com.google.android.gms.internal.ads.zzckl r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdve
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdve zza(java.lang.String r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zzd = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdve
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdve zzb(long r1) {
            r0 = this;
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.zzc = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdve
    public final com.google.android.gms.internal.ads.zzdvf zzc() {
            r8 = this;
            java.lang.Long r0 = r8.zzc
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            com.google.android.gms.internal.ads.zzhiq.zzc(r0, r1)
            java.lang.String r0 = r8.zzd
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.google.android.gms.internal.ads.zzhiq.zzc(r0, r1)
            com.google.android.gms.internal.ads.zzcko r0 = new com.google.android.gms.internal.ads.zzcko
            com.google.android.gms.internal.ads.zzcjk r3 = r8.zza
            com.google.android.gms.internal.ads.zzcks r4 = r8.zzb
            java.lang.Long r5 = r8.zzc
            java.lang.String r6 = r8.zzd
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
    }
}
