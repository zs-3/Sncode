package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaal {
    private long zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private final boolean[] zzg;
    private int zzh;

    public zzaal() {
            r1 = this;
            r1.<init>()
            r0 = 15
            boolean[] r0 = new boolean[r0]
            r1.zzg = r0
            return
    }

    public final long zza() {
            r5 = this;
            long r0 = r5.zze
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return r2
        L9:
            long r2 = r5.zzf
            long r2 = r2 / r0
            return r2
    }

    public final long zzb() {
            r2 = this;
            long r0 = r2.zzf
            return r0
    }

    public final void zzc(long r12) {
            r11 = this;
            long r0 = r11.zzd
            r2 = 1
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto Ld
            r11.zza = r12
            goto L5b
        Ld:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1c
            long r0 = r11.zza
            long r0 = r12 - r0
            r11.zzb = r0
            r11.zzf = r0
            r11.zze = r2
            goto L5b
        L1c:
            long r4 = r11.zzc
            long r4 = r12 - r4
            long r6 = r11.zzb
            long r6 = r4 - r6
            r8 = 15
            long r0 = r0 % r8
            long r6 = java.lang.Math.abs(r6)
            r8 = 1000000(0xf4240, double:4.940656E-318)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            int r1 = (int) r0
            if (r10 > 0) goto L4d
            long r6 = r11.zze
            long r6 = r6 + r2
            r11.zze = r6
            long r6 = r11.zzf
            long r6 = r6 + r4
            r11.zzf = r6
            boolean[] r0 = r11.zzg
            boolean r4 = r0[r1]
            if (r4 == 0) goto L5b
            r4 = 0
            r0[r1] = r4
            int r0 = r11.zzh
            int r0 = r0 + (-1)
            r11.zzh = r0
            goto L5b
        L4d:
            boolean[] r0 = r11.zzg
            boolean r4 = r0[r1]
            if (r4 != 0) goto L5b
            r4 = 1
            r0[r1] = r4
            int r0 = r11.zzh
            int r0 = r0 + r4
            r11.zzh = r0
        L5b:
            long r0 = r11.zzd
            long r0 = r0 + r2
            r11.zzd = r0
            r11.zzc = r12
            return
    }

    public final void zzd() {
            r2 = this;
            r0 = 0
            r2.zzd = r0
            r2.zze = r0
            r2.zzf = r0
            r0 = 0
            r2.zzh = r0
            boolean[] r1 = r2.zzg
            java.util.Arrays.fill(r1, r0)
            return
    }

    public final boolean zze() {
            r5 = this;
            long r0 = r5.zzd
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 0
            return r0
        La:
            boolean[] r2 = r5.zzg
            r3 = -1
            long r0 = r0 + r3
            r3 = 15
            long r0 = r0 % r3
            int r1 = (int) r0
            boolean r0 = r2[r1]
            return r0
    }

    public final boolean zzf() {
            r5 = this;
            long r0 = r5.zzd
            r2 = 15
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Le
            int r0 = r5.zzh
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }
}
