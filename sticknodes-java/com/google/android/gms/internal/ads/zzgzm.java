package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzgzm extends com.google.android.gms.internal.ads.zzgzq {
    private final int zzc;
    private final int zzd;

    zzgzm(byte[] r2, int r3, int r4) {
            r1 = this;
            r1.<init>(r2)
            int r0 = r3 + r4
            int r2 = r2.length
            com.google.android.gms.internal.ads.zzgzs.zzq(r3, r0, r2)
            r1.zzc = r3
            r1.zzd = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgzq, com.google.android.gms.internal.ads.zzgzs
    public final byte zza(int r3) {
            r2 = this;
            int r0 = r2.zzd
            com.google.android.gms.internal.ads.zzgzs.zzy(r3, r0)
            byte[] r0 = r2.zza
            int r1 = r2.zzc
            int r1 = r1 + r3
            r3 = r0[r1]
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzgzq, com.google.android.gms.internal.ads.zzgzs
    final byte zzb(int r3) {
            r2 = this;
            int r0 = r2.zzc
            byte[] r1 = r2.zza
            int r0 = r0 + r3
            r3 = r1[r0]
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzgzq
    protected final int zzc() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzq, com.google.android.gms.internal.ads.zzgzs
    public final int zzd() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzq, com.google.android.gms.internal.ads.zzgzs
    protected final void zze(byte[] r3, int r4, int r5, int r6) {
            r2 = this;
            int r0 = r2.zzc
            byte[] r1 = r2.zza
            int r0 = r0 + r4
            java.lang.System.arraycopy(r1, r0, r3, r5, r6)
            return
    }
}
