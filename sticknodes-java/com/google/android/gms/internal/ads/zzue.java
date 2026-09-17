package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzue implements com.google.android.gms.internal.ads.zzvi, com.google.android.gms.internal.ads.zzrr {
    final /* synthetic */ com.google.android.gms.internal.ads.zzug zza;
    private final java.lang.Object zzb;
    private com.google.android.gms.internal.ads.zzvh zzc;
    private com.google.android.gms.internal.ads.zzrq zzd;

    public zzue(com.google.android.gms.internal.ads.zzug r3, java.lang.Object r4) {
            r2 = this;
            r2.zza = r3
            r2.<init>()
            r0 = 0
            com.google.android.gms.internal.ads.zzvh r1 = r3.zze(r0)
            r2.zzc = r1
            com.google.android.gms.internal.ads.zzrq r3 = r3.zzc(r0)
            r2.zzd = r3
            r2.zzb = r4
            return
    }

    private final com.google.android.gms.internal.ads.zzuu zzf(com.google.android.gms.internal.ads.zzuu r13, com.google.android.gms.internal.ads.zzuy r14) {
            r12 = this;
            com.google.android.gms.internal.ads.zzug r0 = r12.zza
            java.lang.Object r1 = r12.zzb
            long r8 = r13.zzc
            r0.zzx(r1, r8, r14)
            com.google.android.gms.internal.ads.zzug r0 = r12.zza
            java.lang.Object r1 = r12.zzb
            long r10 = r13.zzd
            r0.zzx(r1, r10, r14)
            long r0 = r13.zzc
            int r14 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r14 != 0) goto L1f
            long r0 = r13.zzd
            int r14 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r14 != 0) goto L1f
            return r13
        L1f:
            int r4 = r13.zza
            com.google.android.gms.internal.ads.zzaf r5 = r13.zzb
            com.google.android.gms.internal.ads.zzuu r13 = new com.google.android.gms.internal.ads.zzuu
            r3 = 1
            r6 = 0
            r7 = 0
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r10)
            return r13
    }

    private final boolean zzg(int r3, com.google.android.gms.internal.ads.zzuy r4) {
            r2 = this;
            r3 = 0
            if (r4 == 0) goto Lf
            com.google.android.gms.internal.ads.zzug r0 = r2.zza
            java.lang.Object r1 = r2.zzb
            com.google.android.gms.internal.ads.zzuy r4 = r0.zzy(r1, r4)
            if (r4 == 0) goto Le
            goto L10
        Le:
            return r3
        Lf:
            r4 = 0
        L10:
            com.google.android.gms.internal.ads.zzug r0 = r2.zza
            java.lang.Object r1 = r2.zzb
            r0.zzw(r1, r3)
            com.google.android.gms.internal.ads.zzvh r0 = r2.zzc
            int r1 = r0.zza
            com.google.android.gms.internal.ads.zzuy r0 = r0.zzb
            boolean r0 = java.util.Objects.equals(r0, r4)
            if (r0 != 0) goto L2b
            com.google.android.gms.internal.ads.zzug r0 = r2.zza
            com.google.android.gms.internal.ads.zzvh r0 = r0.zzf(r3, r4)
            r2.zzc = r0
        L2b:
            com.google.android.gms.internal.ads.zzrq r0 = r2.zzd
            int r1 = r0.zza
            com.google.android.gms.internal.ads.zzuy r0 = r0.zzb
            boolean r0 = java.util.Objects.equals(r0, r4)
            if (r0 != 0) goto L3f
            com.google.android.gms.internal.ads.zzug r0 = r2.zza
            com.google.android.gms.internal.ads.zzrq r3 = r0.zzd(r3, r4)
            r2.zzd = r3
        L3f:
            r3 = 1
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzae(int r1, com.google.android.gms.internal.ads.zzuy r2, com.google.android.gms.internal.ads.zzuu r3) {
            r0 = this;
            r1 = 0
            boolean r1 = r0.zzg(r1, r2)
            if (r1 == 0) goto L10
            com.google.android.gms.internal.ads.zzvh r1 = r0.zzc
            com.google.android.gms.internal.ads.zzuu r2 = r0.zzf(r3, r2)
            r1.zzc(r2)
        L10:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzaf(int r1, com.google.android.gms.internal.ads.zzuy r2, com.google.android.gms.internal.ads.zzup r3, com.google.android.gms.internal.ads.zzuu r4) {
            r0 = this;
            r1 = 0
            boolean r1 = r0.zzg(r1, r2)
            if (r1 == 0) goto L10
            com.google.android.gms.internal.ads.zzvh r1 = r0.zzc
            com.google.android.gms.internal.ads.zzuu r2 = r0.zzf(r4, r2)
            r1.zzd(r3, r2)
        L10:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzag(int r1, com.google.android.gms.internal.ads.zzuy r2, com.google.android.gms.internal.ads.zzup r3, com.google.android.gms.internal.ads.zzuu r4) {
            r0 = this;
            r1 = 0
            boolean r1 = r0.zzg(r1, r2)
            if (r1 == 0) goto L10
            com.google.android.gms.internal.ads.zzvh r1 = r0.zzc
            com.google.android.gms.internal.ads.zzuu r2 = r0.zzf(r4, r2)
            r1.zze(r3, r2)
        L10:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzah(int r1, com.google.android.gms.internal.ads.zzuy r2, com.google.android.gms.internal.ads.zzup r3, com.google.android.gms.internal.ads.zzuu r4, java.io.IOException r5, boolean r6) {
            r0 = this;
            r1 = 0
            boolean r1 = r0.zzg(r1, r2)
            if (r1 == 0) goto L10
            com.google.android.gms.internal.ads.zzvh r1 = r0.zzc
            com.google.android.gms.internal.ads.zzuu r2 = r0.zzf(r4, r2)
            r1.zzf(r3, r2, r5, r6)
        L10:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzai(int r1, com.google.android.gms.internal.ads.zzuy r2, com.google.android.gms.internal.ads.zzup r3, com.google.android.gms.internal.ads.zzuu r4) {
            r0 = this;
            r1 = 0
            boolean r1 = r0.zzg(r1, r2)
            if (r1 == 0) goto L10
            com.google.android.gms.internal.ads.zzvh r1 = r0.zzc
            com.google.android.gms.internal.ads.zzuu r2 = r0.zzf(r4, r2)
            r1.zzg(r3, r2)
        L10:
            return
    }
}
