package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzlf implements com.google.android.gms.internal.ads.zzvi, com.google.android.gms.internal.ads.zzrr {
    final /* synthetic */ com.google.android.gms.internal.ads.zzlj zza;
    private final com.google.android.gms.internal.ads.zzlh zzb;

    public zzlf(com.google.android.gms.internal.ads.zzlj r1, com.google.android.gms.internal.ads.zzlh r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    private final android.util.Pair zzf(int r8, com.google.android.gms.internal.ads.zzuy r9) {
            r7 = this;
            r8 = 0
            if (r9 == 0) goto L33
            com.google.android.gms.internal.ads.zzlh r0 = r7.zzb
            r1 = 0
        L6:
            java.util.List r2 = r0.zzc
            int r2 = r2.size()
            if (r1 >= r2) goto L2e
            java.util.List r2 = r0.zzc
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.zzuy r2 = (com.google.android.gms.internal.ads.zzuy) r2
            long r2 = r2.zzd
            long r4 = r9.zzd
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L2b
            java.lang.Object r1 = r9.zza
            java.lang.Object r0 = r0.zzb
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            com.google.android.gms.internal.ads.zzuy r9 = r9.zza(r0)
            goto L2f
        L2b:
            int r1 = r1 + 1
            goto L6
        L2e:
            r9 = r8
        L2f:
            if (r9 != 0) goto L32
            return r8
        L32:
            r8 = r9
        L33:
            com.google.android.gms.internal.ads.zzlh r9 = r7.zzb
            int r9 = r9.zzd
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzae(int r2, com.google.android.gms.internal.ads.zzuy r3, com.google.android.gms.internal.ads.zzuu r4) {
            r1 = this;
            r2 = 0
            android.util.Pair r2 = r1.zzf(r2, r3)
            if (r2 == 0) goto L15
            com.google.android.gms.internal.ads.zzlj r3 = r1.zza
            com.google.android.gms.internal.ads.zzdt r3 = com.google.android.gms.internal.ads.zzlj.zzd(r3)
            com.google.android.gms.internal.ads.zzld r0 = new com.google.android.gms.internal.ads.zzld
            r0.<init>(r1, r2, r4)
            r3.zzh(r0)
        L15:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzaf(int r2, com.google.android.gms.internal.ads.zzuy r3, com.google.android.gms.internal.ads.zzup r4, com.google.android.gms.internal.ads.zzuu r5) {
            r1 = this;
            r2 = 0
            android.util.Pair r2 = r1.zzf(r2, r3)
            if (r2 == 0) goto L15
            com.google.android.gms.internal.ads.zzlj r3 = r1.zza
            com.google.android.gms.internal.ads.zzdt r3 = com.google.android.gms.internal.ads.zzlj.zzd(r3)
            com.google.android.gms.internal.ads.zzlb r0 = new com.google.android.gms.internal.ads.zzlb
            r0.<init>(r1, r2, r4, r5)
            r3.zzh(r0)
        L15:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzag(int r2, com.google.android.gms.internal.ads.zzuy r3, com.google.android.gms.internal.ads.zzup r4, com.google.android.gms.internal.ads.zzuu r5) {
            r1 = this;
            r2 = 0
            android.util.Pair r2 = r1.zzf(r2, r3)
            if (r2 == 0) goto L15
            com.google.android.gms.internal.ads.zzlj r3 = r1.zza
            com.google.android.gms.internal.ads.zzdt r3 = com.google.android.gms.internal.ads.zzlj.zzd(r3)
            com.google.android.gms.internal.ads.zzle r0 = new com.google.android.gms.internal.ads.zzle
            r0.<init>(r1, r2, r4, r5)
            r3.zzh(r0)
        L15:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzah(int r8, com.google.android.gms.internal.ads.zzuy r9, com.google.android.gms.internal.ads.zzup r10, com.google.android.gms.internal.ads.zzuu r11, java.io.IOException r12, boolean r13) {
            r7 = this;
            r8 = 0
            android.util.Pair r2 = r7.zzf(r8, r9)
            if (r2 == 0) goto L1b
            com.google.android.gms.internal.ads.zzlj r8 = r7.zza
            com.google.android.gms.internal.ads.zzdt r8 = com.google.android.gms.internal.ads.zzlj.zzd(r8)
            com.google.android.gms.internal.ads.zzla r9 = new com.google.android.gms.internal.ads.zzla
            r0 = r9
            r1 = r7
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.zzh(r9)
        L1b:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzai(int r2, com.google.android.gms.internal.ads.zzuy r3, com.google.android.gms.internal.ads.zzup r4, com.google.android.gms.internal.ads.zzuu r5) {
            r1 = this;
            r2 = 0
            android.util.Pair r2 = r1.zzf(r2, r3)
            if (r2 == 0) goto L15
            com.google.android.gms.internal.ads.zzlj r3 = r1.zza
            com.google.android.gms.internal.ads.zzdt r3 = com.google.android.gms.internal.ads.zzlj.zzd(r3)
            com.google.android.gms.internal.ads.zzlc r0 = new com.google.android.gms.internal.ads.zzlc
            r0.<init>(r1, r2, r4, r5)
            r3.zzh(r0)
        L15:
            return
    }
}
