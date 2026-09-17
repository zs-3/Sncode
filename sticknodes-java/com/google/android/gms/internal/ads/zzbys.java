package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbys {
    private android.content.Context zza;
    private com.google.android.gms.common.util.Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private com.google.android.gms.internal.ads.zzbyz zzd;

    private zzbys() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* synthetic */ zzbys(com.google.android.gms.internal.ads.zzbyr r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public final com.google.android.gms.internal.ads.zzbys zza(com.google.android.gms.ads.internal.util.zzg r1) {
            r0 = this;
            r0.zzc = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbys zzb(android.content.Context r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbys zzc(com.google.android.gms.common.util.Clock r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zzb = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbys zzd(com.google.android.gms.internal.ads.zzbyz r1) {
            r0 = this;
            r0.zzd = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbza zze() {
            r8 = this;
            android.content.Context r0 = r8.zza
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            com.google.android.gms.internal.ads.zzhiq.zzc(r0, r1)
            com.google.android.gms.common.util.Clock r0 = r8.zzb
            java.lang.Class<com.google.android.gms.common.util.Clock> r1 = com.google.android.gms.common.util.Clock.class
            com.google.android.gms.internal.ads.zzhiq.zzc(r0, r1)
            com.google.android.gms.ads.internal.util.zzg r0 = r8.zzc
            java.lang.Class<com.google.android.gms.ads.internal.util.zzg> r1 = com.google.android.gms.ads.internal.util.zzg.class
            com.google.android.gms.internal.ads.zzhiq.zzc(r0, r1)
            com.google.android.gms.internal.ads.zzbyz r0 = r8.zzd
            java.lang.Class<com.google.android.gms.internal.ads.zzbyz> r1 = com.google.android.gms.internal.ads.zzbyz.class
            com.google.android.gms.internal.ads.zzhiq.zzc(r0, r1)
            com.google.android.gms.internal.ads.zzbyu r0 = new com.google.android.gms.internal.ads.zzbyu
            android.content.Context r3 = r8.zza
            com.google.android.gms.common.util.Clock r4 = r8.zzb
            com.google.android.gms.ads.internal.util.zzg r5 = r8.zzc
            com.google.android.gms.internal.ads.zzbyz r6 = r8.zzd
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
    }
}
