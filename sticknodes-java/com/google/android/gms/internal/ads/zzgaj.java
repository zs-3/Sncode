package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgaj extends com.google.android.gms.internal.ads.zzgam {
    zzgaj() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    static final com.google.android.gms.internal.ads.zzgam zzf(int r0) {
            if (r0 >= 0) goto L7
            com.google.android.gms.internal.ads.zzgam r0 = com.google.android.gms.internal.ads.zzgam.zzi()
            goto L12
        L7:
            if (r0 <= 0) goto Le
            com.google.android.gms.internal.ads.zzgam r0 = com.google.android.gms.internal.ads.zzgam.zzh()
            goto L12
        Le:
            com.google.android.gms.internal.ads.zzgam r0 = com.google.android.gms.internal.ads.zzgam.zzg()
        L12:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgam
    public final int zza() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgam
    public final com.google.android.gms.internal.ads.zzgam zzb(int r1, int r2) {
            r0 = this;
            int r1 = java.lang.Integer.compare(r1, r2)
            com.google.android.gms.internal.ads.zzgam r1 = zzf(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgam
    public final com.google.android.gms.internal.ads.zzgam zzc(java.lang.Object r1, java.lang.Object r2, java.util.Comparator r3) {
            r0 = this;
            int r1 = r3.compare(r1, r2)
            com.google.android.gms.internal.ads.zzgam r1 = zzf(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgam
    public final com.google.android.gms.internal.ads.zzgam zzd(boolean r1, boolean r2) {
            r0 = this;
            int r1 = java.lang.Boolean.compare(r1, r2)
            com.google.android.gms.internal.ads.zzgam r1 = zzf(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgam
    public final com.google.android.gms.internal.ads.zzgam zze(boolean r1, boolean r2) {
            r0 = this;
            int r1 = java.lang.Boolean.compare(r2, r1)
            com.google.android.gms.internal.ads.zzgam r1 = zzf(r1)
            return r1
    }
}
