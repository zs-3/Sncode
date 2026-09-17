package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaaz {
    private final com.google.android.gms.internal.ads.zzaay zza;
    private final com.google.android.gms.internal.ads.zzabd zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private float zzj;
    private com.google.android.gms.internal.ads.zzdj zzk;

    public zzaaz(android.content.Context r1, com.google.android.gms.internal.ads.zzaay r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            com.google.android.gms.internal.ads.zzabd r2 = new com.google.android.gms.internal.ads.zzabd
            r2.<init>(r1)
            r0.zzb = r2
            r1 = 0
            r0.zzd = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zze = r1
            r0.zzg = r1
            r0.zzh = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.zzj = r1
            com.google.android.gms.internal.ads.zzdj r1 = com.google.android.gms.internal.ads.zzdj.zza
            r0.zzk = r1
            return
    }

    private final void zzq(int r2) {
            r1 = this;
            int r0 = r1.zzd
            int r2 = java.lang.Math.min(r0, r2)
            r1.zzd = r2
            return
    }

    public final int zza(long r19, long r21, long r23, long r25, boolean r27, com.google.android.gms.internal.ads.zzaax r28) throws com.google.android.gms.internal.ads.zzij {
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r21
            r5 = r28
            com.google.android.gms.internal.ads.zzaax.zzg(r28)
            long r6 = r0.zze
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L18
            r0.zze = r3
        L18:
            long r6 = r0.zzg
            int r10 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r10 == 0) goto L25
            com.google.android.gms.internal.ads.zzabd r6 = r0.zzb
            r6.zzd(r1)
            r0.zzg = r1
        L25:
            long r1 = r1 - r3
            float r6 = r0.zzj
            double r6 = (double) r6
            boolean r10 = r0.zzc
            double r1 = (double) r1
            double r1 = r1 / r6
            long r1 = (long) r1
            if (r10 == 0) goto L3d
            com.google.android.gms.internal.ads.zzdj r6 = r0.zzk
            long r6 = r6.zzb()
            long r6 = com.google.android.gms.internal.ads.zzeu.zzr(r6)
            long r6 = r6 - r23
            long r1 = r1 - r6
        L3d:
            com.google.android.gms.internal.ads.zzaax.zze(r5, r1)
            long r1 = com.google.android.gms.internal.ads.zzaax.zza(r28)
            long r6 = r0.zzh
            r10 = -30000(0xffffffffffff8ad0, double:NaN)
            r12 = 3
            r13 = 2
            r14 = 0
            r15 = 1
            int r16 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r16 == 0) goto L55
            boolean r6 = r0.zzi
            if (r6 != 0) goto L55
            goto L8c
        L55:
            int r6 = r0.zzd
            if (r6 == 0) goto L87
            if (r6 == r15) goto L8b
            if (r6 == r13) goto L82
            if (r6 != r12) goto L7c
            com.google.android.gms.internal.ads.zzdj r6 = r0.zzk
            long r6 = r6.zzb()
            long r6 = com.google.android.gms.internal.ads.zzeu.zzr(r6)
            long r12 = r0.zzf
            long r6 = r6 - r12
            boolean r12 = r0.zzc
            if (r12 == 0) goto L8c
            int r12 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r12 >= 0) goto L8c
            r1 = 100000(0x186a0, double:4.94066E-319)
            int r12 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r12 <= 0) goto L8c
            goto L8b
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L82:
            int r1 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r1 < 0) goto L8c
            goto L8b
        L87:
            boolean r1 = r0.zzc
            if (r1 == 0) goto L8c
        L8b:
            return r14
        L8c:
            boolean r1 = r0.zzc
            r2 = 5
            if (r1 == 0) goto Lfc
            long r6 = r0.zze
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 != 0) goto L98
            goto Lfc
        L98:
            com.google.android.gms.internal.ads.zzdj r1 = r0.zzk
            long r6 = r1.zzc()
            com.google.android.gms.internal.ads.zzabd r1 = r0.zzb
            long r12 = com.google.android.gms.internal.ads.zzaax.zza(r28)
            r16 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r16
            long r12 = r12 + r6
            long r12 = r1.zza(r12)
            com.google.android.gms.internal.ads.zzaax.zzf(r5, r12)
            long r12 = com.google.android.gms.internal.ads.zzaax.zzb(r28)
            long r12 = r12 - r6
            long r12 = r12 / r16
            com.google.android.gms.internal.ads.zzaax.zze(r5, r12)
            long r6 = r0.zzh
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto Lc5
            boolean r1 = r0.zzi
            if (r1 != 0) goto Lc5
            r14 = 1
        Lc5:
            com.google.android.gms.internal.ads.zzaay r1 = r0.zza
            long r6 = com.google.android.gms.internal.ads.zzaax.zza(r28)
            r8 = -500000(0xfffffffffff85ee0, double:NaN)
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 >= 0) goto Ldf
            if (r27 != 0) goto Ldf
            com.google.android.gms.internal.ads.zzaas r1 = (com.google.android.gms.internal.ads.zzaas) r1
            boolean r1 = r1.zzaT(r3, r14)
            if (r1 != 0) goto Ldd
            goto Ldf
        Ldd:
            r1 = 4
            return r1
        Ldf:
            long r3 = com.google.android.gms.internal.ads.zzaax.zza(r28)
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 >= 0) goto Lef
            if (r27 != 0) goto Lef
            if (r14 == 0) goto Led
            r1 = 3
            return r1
        Led:
            r1 = 2
            return r1
        Lef:
            long r3 = com.google.android.gms.internal.ads.zzaax.zza(r28)
            r5 = 50000(0xc350, double:2.47033E-319)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lfb
            return r2
        Lfb:
            return r15
        Lfc:
            return r2
    }

    public final void zzb() {
            r1 = this;
            int r0 = r1.zzd
            if (r0 != 0) goto L7
            r0 = 1
            r1.zzd = r0
        L7:
            return
    }

    public final void zzc(boolean r3) {
            r2 = this;
            r2.zzi = r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzh = r0
            return
    }

    public final void zzd() {
            r1 = this;
            r0 = 0
            r1.zzq(r0)
            return
    }

    public final void zze(boolean r1) {
            r0 = this;
            r0.zzd = r1
            return
    }

    public final void zzf() {
            r1 = this;
            r0 = 2
            r1.zzq(r0)
            return
    }

    public final void zzg() {
            r2 = this;
            r0 = 1
            r2.zzc = r0
            com.google.android.gms.internal.ads.zzdj r0 = r2.zzk
            long r0 = r0.zzb()
            long r0 = com.google.android.gms.internal.ads.zzeu.zzr(r0)
            r2.zzf = r0
            com.google.android.gms.internal.ads.zzabd r0 = r2.zzb
            r0.zzg()
            return
    }

    public final void zzh() {
            r2 = this;
            r0 = 0
            r2.zzc = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzh = r0
            com.google.android.gms.internal.ads.zzabd r0 = r2.zzb
            r0.zzh()
            return
    }

    public final void zzi() {
            r3 = this;
            com.google.android.gms.internal.ads.zzabd r0 = r3.zzb
            r0.zzf()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.zzg = r0
            r3.zze = r0
            r2 = 1
            r3.zzq(r2)
            r3.zzh = r0
            return
    }

    public final void zzj(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzabd r0 = r1.zzb
            r0.zzj(r2)
            return
    }

    public final void zzk(com.google.android.gms.internal.ads.zzdj r1) {
            r0 = this;
            r0.zzk = r1
            return
    }

    public final void zzl(float r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzabd r0 = r1.zzb
            r0.zzc(r2)
            return
    }

    public final void zzm(android.view.Surface r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzabd r0 = r1.zzb
            r0.zzi(r2)
            r2 = 1
            r1.zzq(r2)
            return
    }

    public final void zzn(float r2) {
            r1 = this;
            float r0 = r1.zzj
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            r1.zzj = r2
            com.google.android.gms.internal.ads.zzabd r0 = r1.zzb
            r0.zze(r2)
            return
    }

    public final boolean zzo(boolean r9) {
            r8 = this;
            r0 = 1
            r1 = 0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 == 0) goto Lf
            int r9 = r8.zzd
            r4 = 3
            if (r9 != r4) goto Lf
            goto L23
        Lf:
            long r4 = r8.zzh
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 != 0) goto L16
            return r1
        L16:
            com.google.android.gms.internal.ads.zzdj r9 = r8.zzk
            long r4 = r9.zzb()
            long r6 = r8.zzh
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 < 0) goto L25
            r0 = 0
        L23:
            r8.zzh = r2
        L25:
            return r0
    }

    public final boolean zzp() {
            r4 = this;
            int r0 = r4.zzd
            r1 = 3
            r4.zzd = r1
            com.google.android.gms.internal.ads.zzdj r2 = r4.zzk
            long r2 = r2.zzb()
            long r2 = com.google.android.gms.internal.ads.zzeu.zzr(r2)
            r4.zzf = r2
            if (r0 == r1) goto L15
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }
}
