package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgfb extends com.google.android.gms.internal.ads.zzgen {
    private com.google.android.gms.internal.ads.zzgfa zza;

    zzgfb(com.google.android.gms.internal.ads.zzgas r2, boolean r3, java.util.concurrent.Executor r4, java.util.concurrent.Callable r5) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            com.google.android.gms.internal.ads.zzgez r2 = new com.google.android.gms.internal.ads.zzgez
            r2.<init>(r1, r5, r4)
            r1.zza = r2
            r1.zzv()
            return
    }

    static /* bridge */ /* synthetic */ void zzG(com.google.android.gms.internal.ads.zzgfb r0, com.google.android.gms.internal.ads.zzgfa r1) {
            r1 = 0
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    final void zzf(int r1, java.lang.Object r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    protected final void zzq() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgfa r0 = r1.zza
            if (r0 == 0) goto L7
            r0.zzh()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    final void zzu() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgfa r0 = r1.zza
            if (r0 == 0) goto L7
            r0.zzf()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    final void zzy(int r2) {
            r1 = this;
            super.zzy(r2)
            r0 = 1
            if (r2 != r0) goto L9
            r2 = 0
            r1.zza = r2
        L9:
            return
    }
}
