package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzxt extends com.google.android.gms.internal.ads.zzyf implements java.lang.Comparable {
    private final int zze;
    private final int zzf;

    public zzxt(int r1, com.google.android.gms.internal.ads.zzcd r2, int r3, com.google.android.gms.internal.ads.zzxy r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            boolean r1 = r4.zzN
            boolean r1 = com.google.android.gms.internal.ads.zzls.zza(r5, r1)
            r0.zze = r1
            com.google.android.gms.internal.ads.zzaf r1 = r0.zzd
            int r1 = r1.zza()
            r0.zzf = r1
            return
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzxt r1 = (com.google.android.gms.internal.ads.zzxt) r1
            int r1 = r0.zza(r1)
            return r1
    }

    public final int zza(com.google.android.gms.internal.ads.zzxt r2) {
            r1 = this;
            int r0 = r1.zzf
            int r2 = r2.zzf
            int r2 = java.lang.Integer.compare(r0, r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final int zzb() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final /* bridge */ /* synthetic */ boolean zzc(com.google.android.gms.internal.ads.zzyf r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzxt r1 = (com.google.android.gms.internal.ads.zzxt) r1
            r1 = 0
            return r1
    }
}
