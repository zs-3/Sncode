package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzajx implements com.google.android.gms.internal.ads.zzaea {
    final /* synthetic */ com.google.android.gms.internal.ads.zzajy zza;

    /* synthetic */ zzajx(com.google.android.gms.internal.ads.zzajy r1, com.google.android.gms.internal.ads.zzajw r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
            r4 = this;
            com.google.android.gms.internal.ads.zzajy r0 = r4.zza
            com.google.android.gms.internal.ads.zzakj r1 = com.google.android.gms.internal.ads.zzajy.zzf(r0)
            long r2 = com.google.android.gms.internal.ads.zzajy.zzc(r0)
            long r0 = r1.zzf(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final com.google.android.gms.internal.ads.zzady zzg(long r10) {
            r9 = this;
            com.google.android.gms.internal.ads.zzajy r0 = r9.zza
            com.google.android.gms.internal.ads.zzakj r1 = com.google.android.gms.internal.ads.zzajy.zzf(r0)
            long r1 = r1.zzg(r10)
            long r3 = com.google.android.gms.internal.ads.zzajy.zzb(r0)
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r1)
            com.google.android.gms.internal.ads.zzajy r1 = r9.zza
            long r5 = com.google.android.gms.internal.ads.zzajy.zza(r1)
            long r1 = com.google.android.gms.internal.ads.zzajy.zzb(r1)
            long r5 = r5 - r1
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r5)
            java.math.BigInteger r0 = r0.multiply(r1)
            com.google.android.gms.internal.ads.zzajy r1 = r9.zza
            long r1 = com.google.android.gms.internal.ads.zzajy.zzc(r1)
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            java.math.BigInteger r0 = r0.divide(r1)
            long r0 = r0.longValue()
            long r3 = r3 + r0
            com.google.android.gms.internal.ads.zzajy r0 = r9.zza
            long r1 = com.google.android.gms.internal.ads.zzajy.zzb(r0)
            long r5 = com.google.android.gms.internal.ads.zzajy.zza(r0)
            r7 = -1
            long r5 = r5 + r7
            r7 = -30000(0xffffffffffff8ad0, double:NaN)
            long r3 = r3 + r7
            long r3 = java.lang.Math.min(r3, r5)
            long r0 = java.lang.Math.max(r1, r3)
            com.google.android.gms.internal.ads.zzady r2 = new com.google.android.gms.internal.ads.zzady
            com.google.android.gms.internal.ads.zzaeb r3 = new com.google.android.gms.internal.ads.zzaeb
            r3.<init>(r10, r0)
            r2.<init>(r3, r3)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
            r1 = this;
            r0 = 1
            return r0
    }
}
