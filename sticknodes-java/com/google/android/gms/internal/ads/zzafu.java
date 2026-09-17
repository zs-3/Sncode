package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzafu implements com.google.android.gms.internal.ads.zzade {
    private final long zzb;
    private final com.google.android.gms.internal.ads.zzade zzc;

    public zzafu(long r1, com.google.android.gms.internal.ads.zzade r3) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r3
            return
    }

    static /* bridge */ /* synthetic */ long zza(com.google.android.gms.internal.ads.zzafu r2) {
            long r0 = r2.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final void zzD() {
            r1 = this;
            com.google.android.gms.internal.ads.zzade r0 = r1.zzc
            r0.zzD()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final void zzO(com.google.android.gms.internal.ads.zzaea r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaft r0 = new com.google.android.gms.internal.ads.zzaft
            r0.<init>(r1, r2, r2)
            com.google.android.gms.internal.ads.zzade r2 = r1.zzc
            r2.zzO(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final com.google.android.gms.internal.ads.zzaeh zzw(int r2, int r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzade r0 = r1.zzc
            com.google.android.gms.internal.ads.zzaeh r2 = r0.zzw(r2, r3)
            return r2
    }
}
