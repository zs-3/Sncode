package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzub implements com.google.android.gms.internal.ads.zzwn {
    public final com.google.android.gms.internal.ads.zzwn zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzuc zzb;
    private boolean zzc;

    public zzub(com.google.android.gms.internal.ads.zzuc r1, com.google.android.gms.internal.ads.zzwn r2) {
            r0 = this;
            r0.zzb = r1
            r0.<init>()
            r0.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final int zza(com.google.android.gms.internal.ads.zzkm r13, com.google.android.gms.internal.ads.zzhq r14, int r15) {
            r12 = this;
            com.google.android.gms.internal.ads.zzuc r0 = r12.zzb
            boolean r1 = r0.zzq()
            r2 = -3
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = r12.zzc
            r3 = 4
            r4 = -4
            if (r1 == 0) goto L14
            r14.zzc(r3)
            return r4
        L14:
            long r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzwn r5 = r12.zza
            int r15 = r5.zza(r13, r14, r15)
            r5 = -5
            r6 = -9223372036854775808
            if (r15 != r5) goto L4e
            com.google.android.gms.internal.ads.zzaf r14 = r13.zza
            java.util.Objects.requireNonNull(r14)
            int r15 = r14.zzE
            r0 = 0
            if (r15 != 0) goto L32
            int r15 = r14.zzF
            if (r15 == 0) goto L4d
            r15 = 0
        L32:
            com.google.android.gms.internal.ads.zzuc r1 = r12.zzb
            long r1 = r1.zzb
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L3b
            goto L3d
        L3b:
            int r0 = r14.zzF
        L3d:
            com.google.android.gms.internal.ads.zzad r14 = r14.zzb()
            r14.zzG(r15)
            r14.zzH(r0)
            com.google.android.gms.internal.ads.zzaf r14 = r14.zzaf()
            r13.zza = r14
        L4d:
            return r5
        L4e:
            com.google.android.gms.internal.ads.zzuc r13 = r12.zzb
            long r8 = r13.zzb
            int r13 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r13 == 0) goto L72
            if (r15 != r4) goto L5e
            long r10 = r14.zze
            int r13 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r13 >= 0) goto L68
        L5e:
            if (r15 != r2) goto L72
            int r13 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r13 != 0) goto L72
            boolean r13 = r14.zzd
            if (r13 != 0) goto L72
        L68:
            r14.zzb()
            r14.zzc(r3)
            r13 = 1
            r12.zzc = r13
            return r4
        L72:
            return r15
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final int zzb(long r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzuc r0 = r1.zzb
            boolean r0 = r0.zzq()
            if (r0 == 0) goto La
            r2 = -3
            return r2
        La:
            com.google.android.gms.internal.ads.zzwn r0 = r1.zza
            int r2 = r0.zzb(r2)
            return r2
    }

    public final void zzc() {
            r1 = this;
            r0 = 0
            r1.zzc = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final void zzd() throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzwn r0 = r1.zza
            r0.zzd()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final boolean zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzuc r0 = r1.zzb
            boolean r0 = r0.zzq()
            if (r0 != 0) goto L12
            com.google.android.gms.internal.ads.zzwn r0 = r1.zza
            boolean r0 = r0.zze()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }
}
