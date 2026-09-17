package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzid {
    private final long zza;
    private final long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private long zzl;
    private long zzm;
    private long zzn;

    /* synthetic */ zzid(float r1, float r2, long r3, float r5, long r6, long r8, float r10, com.google.android.gms.internal.ads.zzic r11) {
            r0 = this;
            r0.<init>()
            r0.zza = r6
            r0.zzb = r8
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zzc = r1
            r0.zzd = r1
            r0.zzf = r1
            r0.zzg = r1
            r3 = 1064849900(0x3f7851ec, float:0.97)
            r0.zzj = r3
            r3 = 1065604874(0x3f83d70a, float:1.03)
            r0.zzi = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.zzk = r3
            r0.zzl = r1
            r0.zze = r1
            r0.zzh = r1
            r0.zzm = r1
            r0.zzn = r1
            return
    }

    private static long zzf(long r0, long r2, float r4) {
            float r0 = (float) r0
            float r1 = (float) r2
            r2 = 1065336439(0x3f7fbe77, float:0.999)
            float r0 = r0 * r2
            r2 = 981668352(0x3a831200, float:9.999871E-4)
            float r1 = r1 * r2
            float r0 = r0 + r1
            long r0 = (long) r0
            return r0
    }

    private final void zzg() {
            r7 = this;
            long r0 = r7.zzc
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L29
            long r4 = r7.zzd
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L2a
            long r4 = r7.zzf
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L1c
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L1c
            r0 = r4
        L1c:
            long r4 = r7.zzg
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L27
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L27
            goto L2a
        L27:
            r4 = r0
            goto L2a
        L29:
            r4 = r2
        L2a:
            long r0 = r7.zze
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L31
            return
        L31:
            r7.zze = r4
            r7.zzh = r4
            r7.zzm = r2
            r7.zzn = r2
            r7.zzl = r2
            return
    }

    public final float zza(long r16, long r18) {
            r15 = this;
            r0 = r15
            long r1 = r0.zzc
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto Le3
            long r1 = r16 - r18
            long r6 = r0.zzm
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 != 0) goto L1d
            r0.zzm = r1
            r1 = 0
            r0.zzn = r1
            goto L37
        L1d:
            r8 = 1065336439(0x3f7fbe77, float:0.999)
            long r6 = zzf(r6, r1, r8)
            long r6 = java.lang.Math.max(r1, r6)
            r0.zzm = r6
            long r1 = r1 - r6
            long r1 = java.lang.Math.abs(r1)
            long r6 = r0.zzn
            long r1 = zzf(r6, r1, r8)
            r0.zzn = r1
        L37:
            long r1 = r0.zzl
            r6 = 1000(0x3e8, double:4.94E-321)
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 == 0) goto L4e
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r8 = r0.zzl
            long r1 = r1 - r8
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 < 0) goto L4b
            goto L4e
        L4b:
            float r1 = r0.zzk
            return r1
        L4e:
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.zzl = r1
            long r1 = r0.zzm
            long r8 = r0.zzn
            r10 = 3
            long r8 = r8 * r10
            long r1 = r1 + r8
            long r8 = r0.zzh
            r10 = 869711765(0x33d6bf95, float:1.0E-7)
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r12 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r12 <= 0) goto L9d
            long r4 = com.google.android.gms.internal.ads.zzeu.zzr(r6)
            float r6 = r0.zzk
            float r6 = r6 + r11
            float r7 = r0.zzi
            float r7 = r7 + r11
            r8 = 3
            long[] r9 = new long[r8]
            r11 = 0
            r9[r11] = r1
            long r1 = r0.zze
            r12 = 1
            r9[r12] = r1
            r1 = 2
            long r13 = r0.zzh
            float r2 = (float) r4
            float r7 = r7 * r2
            float r6 = r6 * r2
            long r4 = (long) r6
            long r6 = (long) r7
            long r4 = r4 + r6
            long r13 = r13 - r4
            r9[r1] = r13
            r1 = r9[r11]
        L8d:
            if (r12 >= r8) goto L9a
            r4 = r9[r12]
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 > 0) goto L96
            goto L97
        L96:
            r1 = r4
        L97:
            int r12 = r12 + 1
            goto L8d
        L9a:
            r0.zzh = r1
            goto Lc2
        L9d:
            r6 = 0
            float r7 = r0.zzk
            float r7 = r7 + r11
            float r6 = java.lang.Math.max(r6, r7)
            float r6 = r6 / r10
            long r6 = (long) r6
            long r6 = r16 - r6
            long r8 = r0.zzh
            long r1 = java.lang.Math.min(r6, r1)
            long r1 = java.lang.Math.max(r8, r1)
            r0.zzh = r1
            long r6 = r0.zzg
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto Lc2
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 <= 0) goto Lc2
            r0.zzh = r6
            r1 = r6
        Lc2:
            long r1 = r16 - r1
            long r4 = r0.zza
            long r6 = java.lang.Math.abs(r1)
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto Ld1
            r0.zzk = r3
            goto Le3
        Ld1:
            float r1 = (float) r1
            float r1 = r1 * r10
            float r1 = r1 + r3
            float r2 = r0.zzj
            float r3 = r0.zzi
            float r1 = java.lang.Math.min(r1, r3)
            float r3 = java.lang.Math.max(r2, r1)
            r0.zzk = r3
        Le3:
            return r3
    }

    public final long zzb() {
            r2 = this;
            long r0 = r2.zzh
            return r0
    }

    public final void zzc() {
            r7 = this;
            long r0 = r7.zzh
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            return
        Lc:
            long r4 = r7.zzb
            long r0 = r0 + r4
            r7.zzh = r0
            long r4 = r7.zzg
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L1d
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1d
            r7.zzh = r4
        L1d:
            r7.zzl = r2
            return
    }

    public final void zzd(com.google.android.gms.internal.ads.zzav r5) {
            r4 = this;
            long r0 = r5.zza
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r2 = com.google.android.gms.internal.ads.zzeu.zzr(r0)
            r4.zzc = r2
            long r2 = com.google.android.gms.internal.ads.zzeu.zzr(r0)
            r4.zzf = r2
            long r0 = com.google.android.gms.internal.ads.zzeu.zzr(r0)
            r4.zzg = r0
            r5 = 1064849900(0x3f7851ec, float:0.97)
            r4.zzj = r5
            r5 = 1065604874(0x3f83d70a, float:1.03)
            r4.zzi = r5
            r4.zzg()
            return
    }

    public final void zze(long r1) {
            r0 = this;
            r0.zzd = r1
            r0.zzg()
            return
    }
}
