package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzakw implements com.google.android.gms.internal.ads.zzade {
    private final com.google.android.gms.internal.ads.zzade zzb;
    private final com.google.android.gms.internal.ads.zzakt zzc;
    private final android.util.SparseArray zzd;

    public zzakw(com.google.android.gms.internal.ads.zzade r1, com.google.android.gms.internal.ads.zzakt r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.zzd = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final void zzD() {
            r1 = this;
            com.google.android.gms.internal.ads.zzade r0 = r1.zzb
            r0.zzD()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final void zzO(com.google.android.gms.internal.ads.zzaea r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzade r0 = r1.zzb
            r0.zzO(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final com.google.android.gms.internal.ads.zzaeh zzw(int r3, int r4) {
            r2 = this;
            r0 = 3
            if (r4 == r0) goto La
            com.google.android.gms.internal.ads.zzade r0 = r2.zzb
            com.google.android.gms.internal.ads.zzaeh r3 = r0.zzw(r3, r4)
            return r3
        La:
            android.util.SparseArray r4 = r2.zzd
            java.lang.Object r4 = r4.get(r3)
            com.google.android.gms.internal.ads.zzaky r4 = (com.google.android.gms.internal.ads.zzaky) r4
            if (r4 == 0) goto L15
            return r4
        L15:
            com.google.android.gms.internal.ads.zzade r4 = r2.zzb
            com.google.android.gms.internal.ads.zzaky r1 = new com.google.android.gms.internal.ads.zzaky
            com.google.android.gms.internal.ads.zzaeh r4 = r4.zzw(r3, r0)
            com.google.android.gms.internal.ads.zzakt r0 = r2.zzc
            r1.<init>(r4, r0)
            android.util.SparseArray r4 = r2.zzd
            r4.put(r3, r1)
            return r1
    }
}
