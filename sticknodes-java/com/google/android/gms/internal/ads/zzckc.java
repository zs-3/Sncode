package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzckc implements com.google.android.gms.internal.ads.zzfcv {
    private final com.google.android.gms.internal.ads.zzcjk zza;
    private android.content.Context zzb;
    private java.lang.String zzc;
    private com.google.android.gms.ads.internal.client.zzs zzd;

    /* synthetic */ zzckc(com.google.android.gms.internal.ads.zzcjk r1, com.google.android.gms.internal.ads.zzckb r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfcv
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfcv zza(com.google.android.gms.ads.internal.client.zzs r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zzd = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfcv
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfcv zzb(java.lang.String r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zzc = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfcv
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfcv zzc(android.content.Context r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zzb = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfcv
    public final com.google.android.gms.internal.ads.zzfcw zzd() {
            r8 = this;
            android.content.Context r0 = r8.zzb
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            com.google.android.gms.internal.ads.zzhiq.zzc(r0, r1)
            java.lang.String r0 = r8.zzc
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.google.android.gms.internal.ads.zzhiq.zzc(r0, r1)
            com.google.android.gms.ads.internal.client.zzs r0 = r8.zzd
            java.lang.Class<com.google.android.gms.ads.internal.client.zzs> r1 = com.google.android.gms.ads.internal.client.zzs.class
            com.google.android.gms.internal.ads.zzhiq.zzc(r0, r1)
            com.google.android.gms.internal.ads.zzcke r0 = new com.google.android.gms.internal.ads.zzcke
            com.google.android.gms.internal.ads.zzcjk r3 = r8.zza
            android.content.Context r4 = r8.zzb
            java.lang.String r5 = r8.zzc
            com.google.android.gms.ads.internal.client.zzs r6 = r8.zzd
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
    }
}
