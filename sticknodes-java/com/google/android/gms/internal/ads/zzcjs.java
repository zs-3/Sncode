package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcjs implements com.google.android.gms.internal.ads.zzfbh {
    private final com.google.android.gms.internal.ads.zzcjk zza;
    private android.content.Context zzb;
    private java.lang.String zzc;

    /* synthetic */ zzcjs(com.google.android.gms.internal.ads.zzcjk r1, com.google.android.gms.internal.ads.zzcjr r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfbh
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfbh zza(java.lang.String r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zzc = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfbh
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfbh zzb(android.content.Context r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zzb = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfbh
    public final com.google.android.gms.internal.ads.zzfbi zzc() {
            r5 = this;
            android.content.Context r0 = r5.zzb
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            com.google.android.gms.internal.ads.zzhiq.zzc(r0, r1)
            java.lang.String r0 = r5.zzc
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.google.android.gms.internal.ads.zzhiq.zzc(r0, r1)
            com.google.android.gms.internal.ads.zzcju r0 = new com.google.android.gms.internal.ads.zzcju
            com.google.android.gms.internal.ads.zzcjk r1 = r5.zza
            android.content.Context r2 = r5.zzb
            java.lang.String r3 = r5.zzc
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            return r0
    }
}
