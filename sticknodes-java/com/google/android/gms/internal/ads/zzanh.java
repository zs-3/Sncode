package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzanh {
    private final com.google.android.gms.internal.ads.zzaeh zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzanh(com.google.android.gms.internal.ads.zzaeh r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    private final void zzf(int r9) {
            r8 = this;
            long r1 = r8.zzl
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto Lc
            return
        Lc:
            boolean r3 = r8.zzm
            long r4 = r8.zzb
            long r6 = r8.zzk
            long r4 = r4 - r6
            com.google.android.gms.internal.ads.zzaeh r0 = r8.zza
            int r4 = (int) r4
            r6 = 0
            r5 = r9
            r0.zzs(r1, r3, r4, r5, r6)
            return
    }

    public final void zza(long r3) {
            r2 = this;
            boolean r0 = r2.zzc
            r2.zzm = r0
            long r0 = r2.zzb
            long r0 = r3 - r0
            int r1 = (int) r0
            r2.zzf(r1)
            long r0 = r2.zzb
            r2.zzk = r0
            r2.zzb = r3
            r3 = 0
            r2.zzf(r3)
            r2.zzi = r3
            return
    }

    public final void zzb(long r3, int r5, boolean r6) {
            r2 = this;
            boolean r0 = r2.zzj
            if (r0 == 0) goto L11
            boolean r0 = r2.zzg
            if (r0 != 0) goto L9
            goto L11
        L9:
            boolean r3 = r2.zzc
            r2.zzm = r3
            r3 = 0
            r2.zzj = r3
            return
        L11:
            boolean r0 = r2.zzh
            if (r0 != 0) goto L1b
            boolean r0 = r2.zzg
            if (r0 == 0) goto L1a
            goto L1b
        L1a:
            return
        L1b:
            if (r6 == 0) goto L29
            boolean r6 = r2.zzi
            if (r6 == 0) goto L29
            long r0 = r2.zzb
            long r3 = r3 - r0
            int r4 = (int) r3
            int r5 = r5 + r4
            r2.zzf(r5)
        L29:
            long r3 = r2.zzb
            r2.zzk = r3
            long r3 = r2.zze
            r2.zzl = r3
            boolean r3 = r2.zzc
            r2.zzm = r3
            r3 = 1
            r2.zzi = r3
            return
    }

    public final void zzc(byte[] r3, int r4, int r5) {
            r2 = this;
            boolean r0 = r2.zzf
            if (r0 == 0) goto L1e
            int r0 = r4 + 2
            int r1 = r2.zzd
            int r0 = r0 - r1
            if (r0 >= r5) goto L1a
            r3 = r3[r0]
            r3 = r3 & 128(0x80, float:1.794E-43)
            r4 = 0
            if (r3 == 0) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            r2.zzg = r3
            r2.zzf = r4
            return
        L1a:
            int r5 = r5 - r4
            int r1 = r1 + r5
            r2.zzd = r1
        L1e:
            return
    }

    public final void zzd() {
            r1 = this;
            r0 = 0
            r1.zzf = r0
            r1.zzg = r0
            r1.zzh = r0
            r1.zzi = r0
            r1.zzj = r0
            return
    }

    public final void zze(long r2, int r4, int r5, long r6, boolean r8) {
            r1 = this;
            r0 = 0
            r1.zzg = r0
            r1.zzh = r0
            r1.zze = r6
            r1.zzd = r0
            r1.zzb = r2
            r2 = 1
            r3 = 32
            if (r5 < r3) goto L33
            r3 = 40
            if (r5 != r3) goto L15
            goto L33
        L15:
            boolean r3 = r1.zzi
            if (r3 == 0) goto L24
            boolean r3 = r1.zzj
            if (r3 != 0) goto L24
            if (r8 == 0) goto L22
            r1.zzf(r4)
        L22:
            r1.zzi = r0
        L24:
            r3 = 35
            if (r5 <= r3) goto L2c
            r3 = 39
            if (r5 != r3) goto L33
        L2c:
            boolean r3 = r1.zzj
            r3 = r3 ^ r2
            r1.zzh = r3
            r1.zzj = r2
        L33:
            r3 = 16
            if (r5 < r3) goto L3d
            r3 = 21
            if (r5 > r3) goto L3d
            r3 = 1
            goto L3e
        L3d:
            r3 = 0
        L3e:
            r1.zzc = r3
            if (r3 != 0) goto L46
            r3 = 9
            if (r5 > r3) goto L47
        L46:
            r0 = 1
        L47:
            r1.zzf = r0
            return
    }
}
