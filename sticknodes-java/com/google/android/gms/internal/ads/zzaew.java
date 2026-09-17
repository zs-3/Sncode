package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaew {
    protected final com.google.android.gms.internal.ads.zzaeh zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private long[] zzl;
    private int[] zzm;

    public zzaew(int r3, int r4, long r5, int r7, com.google.android.gms.internal.ads.zzaeh r8) {
            r2 = this;
            r2.<init>()
            r0 = 2
            r1 = 1
            if (r4 == r1) goto L8
            r4 = 2
        L8:
            r2.zzd = r5
            r2.zze = r7
            r2.zza = r8
            if (r4 != r0) goto L13
            r5 = 1667497984(0x63640000, float:4.2058576E21)
            goto L15
        L13:
            r5 = 1651965952(0x62770000, float:1.13908645E21)
        L15:
            int r5 = zzh(r3, r5)
            r2.zzb = r5
            if (r4 != r0) goto L24
            r4 = 1650720768(0x62640000, float:1.0514644E21)
            int r3 = zzh(r3, r4)
            goto L25
        L24:
            r3 = -1
        L25:
            r2.zzc = r3
            r3 = -1
            r2.zzk = r3
            r3 = 512(0x200, float:7.175E-43)
            long[] r4 = new long[r3]
            r2.zzl = r4
            int[] r3 = new int[r3]
            r2.zzm = r3
            return
    }

    private static int zzh(int r1, int r2) {
            int r0 = r1 / 10
            int r1 = r1 % 10
            int r1 = r1 + 48
            int r1 = r1 << 8
            int r0 = r0 + 48
            r1 = r1 | r0
            r1 = r1 | r2
            return r1
    }

    private final long zzi(int r6) {
            r5 = this;
            int r0 = r5.zze
            long r1 = r5.zzd
            long r3 = (long) r6
            long r1 = r1 * r3
            long r3 = (long) r0
            long r1 = r1 / r3
            return r1
    }

    private final com.google.android.gms.internal.ads.zzaeb zzj(int r7) {
            r6 = this;
            com.google.android.gms.internal.ads.zzaeb r0 = new com.google.android.gms.internal.ads.zzaeb
            int[] r1 = r6.zzm
            r1 = r1[r7]
            long r1 = (long) r1
            r3 = 1
            long r3 = r6.zzi(r3)
            long r1 = r1 * r3
            long[] r3 = r6.zzl
            r4 = r3[r7]
            r0.<init>(r1, r4)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzady zza(long r5) {
            r4 = this;
            int r0 = r4.zzj
            if (r0 == 0) goto L3b
            r0 = 1
            long r1 = r4.zzi(r0)
            long r5 = r5 / r1
            int r6 = (int) r5
            int[] r5 = r4.zzm
            int r5 = com.google.android.gms.internal.ads.zzeu.zzb(r5, r6, r0, r0)
            int[] r1 = r4.zzm
            r1 = r1[r5]
            if (r1 != r6) goto L21
            com.google.android.gms.internal.ads.zzady r6 = new com.google.android.gms.internal.ads.zzady
            com.google.android.gms.internal.ads.zzaeb r5 = r4.zzj(r5)
            r6.<init>(r5, r5)
            return r6
        L21:
            com.google.android.gms.internal.ads.zzaeb r6 = r4.zzj(r5)
            int r5 = r5 + r0
            long[] r0 = r4.zzl
            int r0 = r0.length
            if (r5 >= r0) goto L35
            com.google.android.gms.internal.ads.zzady r0 = new com.google.android.gms.internal.ads.zzady
            com.google.android.gms.internal.ads.zzaeb r5 = r4.zzj(r5)
            r0.<init>(r6, r5)
            return r0
        L35:
            com.google.android.gms.internal.ads.zzady r5 = new com.google.android.gms.internal.ads.zzady
            r5.<init>(r6, r6)
            return r5
        L3b:
            com.google.android.gms.internal.ads.zzady r5 = new com.google.android.gms.internal.ads.zzady
            com.google.android.gms.internal.ads.zzaeb r6 = new com.google.android.gms.internal.ads.zzaeb
            r0 = 0
            long r2 = r4.zzk
            r6.<init>(r0, r2)
            r5.<init>(r6, r6)
            return r5
    }

    public final void zzb(long r6, boolean r8) {
            r5 = this;
            long r0 = r5.zzk
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r5.zzk = r6
        La:
            if (r8 == 0) goto L3d
            int r8 = r5.zzj
            int[] r0 = r5.zzm
            int r0 = r0.length
            if (r8 != r0) goto L2d
            long[] r8 = r5.zzl
            int r0 = r8.length
            int r0 = r0 * 3
            int r0 = r0 / 2
            long[] r8 = java.util.Arrays.copyOf(r8, r0)
            r5.zzl = r8
            int[] r8 = r5.zzm
            int r0 = r8.length
            int r0 = r0 * 3
            int r0 = r0 / 2
            int[] r8 = java.util.Arrays.copyOf(r8, r0)
            r5.zzm = r8
        L2d:
            long[] r8 = r5.zzl
            int r0 = r5.zzj
            r8[r0] = r6
            int[] r6 = r5.zzm
            int r7 = r5.zzi
            r6[r0] = r7
            int r0 = r0 + 1
            r5.zzj = r0
        L3d:
            int r6 = r5.zzi
            int r6 = r6 + 1
            r5.zzi = r6
            return
    }

    public final void zzc() {
            r2 = this;
            long[] r0 = r2.zzl
            int r1 = r2.zzj
            long[] r0 = java.util.Arrays.copyOf(r0, r1)
            r2.zzl = r0
            int[] r0 = r2.zzm
            int r1 = r2.zzj
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r2.zzm = r0
            return
    }

    public final void zzd(int r1) {
            r0 = this;
            r0.zzf = r1
            r0.zzg = r1
            return
    }

    public final void zze(long r3) {
            r2 = this;
            int r0 = r2.zzj
            if (r0 != 0) goto L8
            r3 = 0
            r2.zzh = r3
            return
        L8:
            long[] r0 = r2.zzl
            r1 = 1
            int r3 = com.google.android.gms.internal.ads.zzeu.zzc(r0, r3, r1, r1)
            int[] r4 = r2.zzm
            r3 = r4[r3]
            r2.zzh = r3
            return
    }

    public final boolean zzf(int r2) {
            r1 = this;
            int r0 = r1.zzb
            if (r0 == r2) goto Lb
            int r0 = r1.zzc
            if (r0 != r2) goto L9
            goto Lb
        L9:
            r2 = 0
            return r2
        Lb:
            r2 = 1
            return r2
    }

    public final boolean zzg(com.google.android.gms.internal.ads.zzadc r11) throws java.io.IOException {
            r10 = this;
            int r0 = r10.zzg
            com.google.android.gms.internal.ads.zzaeh r1 = r10.zza
            r2 = 0
            int r11 = r1.zzf(r11, r0, r2)
            int r0 = r0 - r11
            r10.zzg = r0
            r11 = 1
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L39
            int r1 = r10.zzf
            if (r1 <= 0) goto L34
            com.google.android.gms.internal.ads.zzaeh r3 = r10.zza
            int r1 = r10.zzh
            long r4 = r10.zzi(r1)
            int[] r1 = r10.zzm
            int r6 = r10.zzh
            int r1 = java.util.Arrays.binarySearch(r1, r6)
            if (r1 < 0) goto L2c
            r6 = 1
            goto L2d
        L2c:
            r6 = 0
        L2d:
            int r7 = r10.zzf
            r8 = 0
            r9 = 0
            r3.zzs(r4, r6, r7, r8, r9)
        L34:
            int r1 = r10.zzh
            int r1 = r1 + r11
            r10.zzh = r1
        L39:
            return r0
    }
}
