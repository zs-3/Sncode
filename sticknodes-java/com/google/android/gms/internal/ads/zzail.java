package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzail implements com.google.android.gms.internal.ads.zzaii {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzail(long r1, int r3, long r4, int r6, long r7, long[] r9) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r6
            r0.zze = r7
            r0.zzg = r9
            r3 = -1
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 != 0) goto L16
            goto L18
        L16:
            long r3 = r1 + r7
        L18:
            r0.zzf = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzail zzb(com.google.android.gms.internal.ads.zzaik r11, long r12) {
            long r4 = r11.zza()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto Lf
            r11 = 0
            return r11
        Lf:
            long r7 = r11.zzc
            r0 = -1
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L2a
            long[] r9 = r11.zzf
            if (r9 != 0) goto L1c
            goto L2a
        L1c:
            com.google.android.gms.internal.ads.zzadt r11 = r11.zza
            com.google.android.gms.internal.ads.zzail r10 = new com.google.android.gms.internal.ads.zzail
            int r3 = r11.zzc
            int r6 = r11.zzf
            r0 = r10
            r1 = r12
            r0.<init>(r1, r3, r4, r6, r7, r9)
            return r10
        L2a:
            com.google.android.gms.internal.ads.zzadt r11 = r11.zza
            com.google.android.gms.internal.ads.zzail r10 = new com.google.android.gms.internal.ads.zzail
            int r3 = r11.zzc
            int r6 = r11.zzf
            r7 = -1
            r9 = 0
            r0 = r10
            r1 = r12
            r0.<init>(r1, r3, r4, r6, r7, r9)
            return r10
    }

    private final long zzf(int r5) {
            r4 = this;
            long r0 = r4.zzc
            long r2 = (long) r5
            long r0 = r0 * r2
            r2 = 100
            long r0 = r0 / r2
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final int zzc() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zzd() {
            r2 = this;
            long r0 = r2.zzf
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zze(long r12) {
            r11 = this;
            boolean r0 = r11.zzh()
            if (r0 == 0) goto L51
            long r0 = r11.zza
            long r12 = r12 - r0
            int r0 = r11.zzb
            long r0 = (long) r0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 > 0) goto L11
            goto L51
        L11:
            long[] r0 = r11.zzg
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            double r12 = (double) r12
            long r1 = r11.zze
            r3 = 4643211215818981376(0x4070000000000000, double:256.0)
            double r12 = r12 * r3
            double r1 = (double) r1
            double r12 = r12 / r1
            long r1 = (long) r12
            r3 = 1
            int r1 = com.google.android.gms.internal.ads.zzeu.zzc(r0, r1, r3, r3)
            long r2 = r11.zzf(r1)
            r4 = r0[r1]
            int r6 = r1 + 1
            long r7 = r11.zzf(r6)
            r9 = 99
            if (r1 != r9) goto L38
            r0 = 256(0x100, double:1.265E-321)
            goto L3b
        L38:
            r9 = r0[r6]
            r0 = r9
        L3b:
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L42
            r12 = 0
            goto L47
        L42:
            double r9 = (double) r4
            double r12 = r12 - r9
            long r0 = r0 - r4
            double r0 = (double) r0
            double r12 = r12 / r0
        L47:
            long r7 = r7 - r2
            double r0 = (double) r7
            double r12 = r12 * r0
            long r12 = java.lang.Math.round(r12)
            long r2 = r2 + r12
            return r2
        L51:
            r12 = 0
            return r12
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final com.google.android.gms.internal.ads.zzady zzg(long r11) {
            r10 = this;
            boolean r0 = r10.zzh()
            r1 = 0
            if (r0 != 0) goto L19
            long r11 = r10.zza
            int r0 = r10.zzb
            com.google.android.gms.internal.ads.zzady r3 = new com.google.android.gms.internal.ads.zzady
            com.google.android.gms.internal.ads.zzaeb r4 = new com.google.android.gms.internal.ads.zzaeb
            long r5 = (long) r0
            long r11 = r11 + r5
            r4.<init>(r1, r11)
            r3.<init>(r4, r4)
            return r3
        L19:
            long r3 = r10.zzc
            long r11 = java.lang.Math.min(r11, r3)
            long r11 = java.lang.Math.max(r1, r11)
            double r0 = (double) r11
            long r2 = r10.zzc
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r4
            double r2 = (double) r2
            double r0 = r0 / r2
            r2 = 0
            r6 = 4643211215818981376(0x4070000000000000, double:256.0)
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 > 0) goto L35
            goto L56
        L35:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L3b
            r2 = r6
            goto L56
        L3b:
            int r2 = (int) r0
            long[] r3 = r10.zzg
            com.google.android.gms.internal.ads.zzdi.zzb(r3)
            r4 = r3[r2]
            double r4 = (double) r4
            r8 = 99
            if (r2 != r8) goto L4a
            r8 = r6
            goto L4f
        L4a:
            int r8 = r2 + 1
            r8 = r3[r8]
            double r8 = (double) r8
        L4f:
            double r2 = (double) r2
            double r0 = r0 - r2
            double r8 = r8 - r4
            double r0 = r0 * r8
            double r2 = r4 + r0
        L56:
            double r2 = r2 / r6
            long r0 = r10.zze
            int r4 = r10.zzb
            double r5 = (double) r0
            double r2 = r2 * r5
            long r2 = java.lang.Math.round(r2)
            r5 = -1
            long r0 = r0 + r5
            long r0 = java.lang.Math.min(r2, r0)
            long r2 = (long) r4
            long r0 = java.lang.Math.max(r2, r0)
            long r2 = r10.zza
            long r2 = r2 + r0
            com.google.android.gms.internal.ads.zzady r0 = new com.google.android.gms.internal.ads.zzady
            com.google.android.gms.internal.ads.zzaeb r1 = new com.google.android.gms.internal.ads.zzaeb
            r1.<init>(r11, r2)
            r0.<init>(r1, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
            r1 = this;
            long[] r0 = r1.zzg
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
