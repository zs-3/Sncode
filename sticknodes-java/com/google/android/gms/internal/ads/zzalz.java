package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzalz implements com.google.android.gms.internal.ads.zzakq {
    private final com.google.android.gms.internal.ads.zzals zza;
    private final long[] zzb;
    private final java.util.Map zzc;
    private final java.util.Map zzd;
    private final java.util.Map zze;

    public zzalz(com.google.android.gms.internal.ads.zzals r1, java.util.Map r2, java.util.Map r3, java.util.Map r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzd = r3
            r0.zze = r4
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            r0.zzc = r2
            long[] r1 = r1.zzh()
            r0.zzb = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final int zza() {
            r1 = this;
            long[] r0 = r1.zzb
            int r0 = r0.length
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final long zzb(int r4) {
            r3 = this;
            long[] r0 = r3.zzb
            r1 = r0[r4]
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final java.util.List zzc(long r7) {
            r6 = this;
            java.util.Map r3 = r6.zzc
            java.util.Map r4 = r6.zzd
            java.util.Map r5 = r6.zze
            com.google.android.gms.internal.ads.zzals r0 = r6.zza
            r1 = r7
            java.util.List r7 = r0.zze(r1, r3, r4, r5)
            return r7
    }
}
