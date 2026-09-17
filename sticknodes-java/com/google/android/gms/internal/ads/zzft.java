package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzft {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzft(byte[] r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzc = r2
            r0.zzb = r3
            r1 = 0
            r0.zzd = r1
            r0.zzj()
            return
    }

    private final int zzi() {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            boolean r2 = r3.zzh()
            if (r2 != 0) goto Lb
            int r1 = r1 + 1
            goto L2
        Lb:
            r2 = 1
            int r2 = r2 << r1
            if (r1 <= 0) goto L13
            int r0 = r3.zza(r1)
        L13:
            int r2 = r2 + (-1)
            int r2 = r2 + r0
            return r2
    }

    private final void zzj() {
            r4 = this;
            int r0 = r4.zzc
            r1 = 1
            r2 = 0
            if (r0 < 0) goto L11
            int r3 = r4.zzb
            if (r0 < r3) goto L12
            if (r0 != r3) goto L11
            int r0 = r4.zzd
            if (r0 != 0) goto L11
            goto L12
        L11:
            r1 = 0
        L12:
            com.google.android.gms.internal.ads.zzdi.zzf(r1)
            return
    }

    private final boolean zzk(int r4) {
            r3 = this;
            r0 = 2
            if (r4 < r0) goto L1c
            int r0 = r3.zzb
            if (r4 >= r0) goto L1c
            byte[] r0 = r3.zza
            r1 = r0[r4]
            r2 = 3
            if (r1 != r2) goto L1c
            int r1 = r4 + (-2)
            r1 = r0[r1]
            if (r1 != 0) goto L1c
            int r4 = r4 + (-1)
            r4 = r0[r4]
            if (r4 != 0) goto L1c
            r4 = 1
            return r4
        L1c:
            r4 = 0
            return r4
    }

    public final int zza(int r10) {
            r9 = this;
            int r0 = r9.zzd
            int r0 = r0 + r10
            r9.zzd = r0
            r0 = 0
            r1 = 0
        L7:
            int r2 = r9.zzd
            r3 = 2
            r4 = 8
            r5 = 1
            if (r2 <= r4) goto L2b
            int r2 = r2 + (-8)
            r9.zzd = r2
            byte[] r4 = r9.zza
            int r6 = r9.zzc
            r4 = r4[r6]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r2 = r4 << r2
            r1 = r1 | r2
            int r2 = r6 + 1
            boolean r2 = r9.zzk(r2)
            if (r5 == r2) goto L27
            r3 = 1
        L27:
            int r6 = r6 + r3
            r9.zzc = r6
            goto L7
        L2b:
            byte[] r6 = r9.zza
            int r7 = r9.zzc
            r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r8 = 8 - r2
            int r6 = r6 >> r8
            r1 = r1 | r6
            int r10 = 32 - r10
            if (r2 != r4) goto L49
            r9.zzd = r0
            int r0 = r7 + 1
            boolean r0 = r9.zzk(r0)
            if (r5 == r0) goto L46
            r3 = 1
        L46:
            int r7 = r7 + r3
            r9.zzc = r7
        L49:
            r0 = -1
            int r10 = r0 >>> r10
            r10 = r10 & r1
            r9.zzj()
            return r10
    }

    public final int zzb() {
            r3 = this;
            int r0 = r3.zzi()
            int r1 = r0 % 2
            r2 = 1
            int r0 = r0 + r2
            if (r1 != 0) goto Lb
            r2 = -1
        Lb:
            int r0 = r0 / 2
            int r2 = r2 * r0
            return r2
    }

    public final int zzc() {
            r1 = this;
            int r0 = r1.zzi()
            return r0
    }

    public final void zzd() {
            r1 = this;
            int r0 = r1.zzd
            if (r0 <= 0) goto L9
            int r0 = 8 - r0
            r1.zzf(r0)
        L9:
            return
    }

    public final void zze() {
            r3 = this;
            int r0 = r3.zzd
            r1 = 1
            int r0 = r0 + r1
            r3.zzd = r0
            r2 = 8
            if (r0 != r2) goto L1c
            r0 = 0
            r3.zzd = r0
            int r0 = r3.zzc
            int r2 = r0 + 1
            boolean r2 = r3.zzk(r2)
            if (r1 == r2) goto L18
            goto L19
        L18:
            r1 = 2
        L19:
            int r0 = r0 + r1
            r3.zzc = r0
        L1c:
            r3.zzj()
            return
    }

    public final void zzf(int r5) {
            r4 = this;
            int r0 = r4.zzc
            int r1 = r5 / 8
            int r2 = r0 + r1
            r4.zzc = r2
            int r1 = r1 * 8
            int r3 = r4.zzd
            int r5 = r5 - r1
            int r3 = r3 + r5
            r4.zzd = r3
            r5 = 7
            if (r3 <= r5) goto L1b
            int r2 = r2 + 1
            r4.zzc = r2
            int r3 = r3 + (-8)
            r4.zzd = r3
        L1b:
            int r0 = r0 + 1
            int r5 = r4.zzc
            if (r0 > r5) goto L30
            boolean r5 = r4.zzk(r0)
            if (r5 == 0) goto L1b
            int r5 = r4.zzc
            int r5 = r5 + 1
            r4.zzc = r5
            int r0 = r0 + 2
            goto L1b
        L30:
            r4.zzj()
            return
    }

    public final boolean zzg(int r5) {
            r4 = this;
            int r0 = r4.zzc
            int r1 = r5 / 8
            int r2 = r0 + r1
            int r3 = r4.zzd
            int r3 = r3 + r5
            int r1 = r1 * 8
            int r3 = r3 - r1
            r5 = 7
            if (r3 <= r5) goto L13
            int r2 = r2 + 1
            int r3 = r3 + (-8)
        L13:
            r5 = 1
        L14:
            int r0 = r0 + r5
            if (r0 > r2) goto L26
            int r1 = r4.zzb
            if (r2 >= r1) goto L26
            boolean r1 = r4.zzk(r0)
            if (r1 == 0) goto L14
            int r2 = r2 + 1
            int r0 = r0 + 2
            goto L14
        L26:
            int r0 = r4.zzb
            r1 = 0
            if (r2 < r0) goto L32
            if (r2 != r0) goto L31
            if (r3 != 0) goto L30
            goto L32
        L30:
            return r1
        L31:
            r5 = 0
        L32:
            return r5
    }

    public final boolean zzh() {
            r3 = this;
            byte[] r0 = r3.zza
            int r1 = r3.zzc
            r0 = r0[r1]
            int r1 = r3.zzd
            r2 = 128(0x80, float:1.794E-43)
            int r1 = r2 >> r1
            r0 = r0 & r1
            r3.zze()
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }
}
