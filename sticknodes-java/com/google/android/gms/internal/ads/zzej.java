package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzej {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzej() {
            r1 = this;
            r1.<init>()
            byte[] r0 = com.google.android.gms.internal.ads.zzeu.zzf
            r1.zza = r0
            return
    }

    public zzej(byte[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzd = r2
            return
    }

    private final void zzq() {
            r4 = this;
            int r0 = r4.zzb
            r1 = 1
            r2 = 0
            if (r0 < 0) goto L11
            int r3 = r4.zzd
            if (r0 < r3) goto L12
            if (r0 != r3) goto L11
            int r0 = r4.zzc
            if (r0 != 0) goto L11
            goto L12
        L11:
            r1 = 0
        L12:
            com.google.android.gms.internal.ads.zzdi.zzf(r1)
            return
    }

    public final int zza() {
            r2 = this;
            int r0 = r2.zzd
            int r1 = r2.zzb
            int r0 = r0 - r1
            int r0 = r0 * 8
            int r1 = r2.zzc
            int r0 = r0 - r1
            return r0
    }

    public final int zzb() {
            r1 = this;
            int r0 = r1.zzc
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            int r0 = r1.zzb
            return r0
    }

    public final int zzc() {
            r2 = this;
            int r0 = r2.zzb
            int r0 = r0 * 8
            int r1 = r2.zzc
            int r0 = r0 + r1
            return r0
    }

    public final int zzd(int r8) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            int r1 = r7.zzc
            int r1 = r1 + r8
            r7.zzc = r1
            r1 = 0
        La:
            int r2 = r7.zzc
            r3 = 8
            if (r2 <= r3) goto L24
            int r2 = r2 + (-8)
            r7.zzc = r2
            byte[] r3 = r7.zza
            int r4 = r7.zzb
            int r5 = r4 + 1
            r7.zzb = r5
            r3 = r3[r4]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r3 << r2
            r1 = r1 | r2
            goto La
        L24:
            byte[] r4 = r7.zza
            int r5 = r7.zzb
            r4 = r4[r5]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r6 = 8 - r2
            int r4 = r4 >> r6
            r1 = r1 | r4
            int r8 = 32 - r8
            if (r2 != r3) goto L3a
            r7.zzc = r0
            int r5 = r5 + 1
            r7.zzb = r5
        L3a:
            r0 = -1
            int r8 = r0 >>> r8
            r8 = r8 & r1
            r7.zzq()
            return r8
    }

    public final long zze(int r8) {
            r7 = this;
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r2 = 32
            if (r8 > r2) goto L12
            int r8 = r7.zzd(r8)
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            long r2 = (long) r8
            long r0 = r0 & r2
            return r0
        L12:
            int r8 = r8 + (-32)
            int r8 = r7.zzd(r8)
            int r3 = r7.zzd(r2)
            int r4 = com.google.android.gms.internal.ads.zzeu.zza
            long r3 = (long) r3
            long r5 = (long) r8
            long r5 = r5 & r0
            long r5 = r5 << r2
            long r0 = r0 & r3
            long r0 = r0 | r5
            return r0
    }

    public final void zzf() {
            r1 = this;
            int r0 = r1.zzc
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r1.zzc = r0
            int r0 = r1.zzb
            int r0 = r0 + 1
            r1.zzb = r0
            r1.zzq()
            return
    }

    public final void zzg(int r10, int r11) {
            r9 = this;
            int r11 = r9.zzc
            r0 = 8
            int r11 = 8 - r11
            r1 = 14
            int r11 = java.lang.Math.min(r11, r1)
            int r2 = r9.zzc
            int r3 = 8 - r2
            int r3 = r3 - r11
            r4 = 65280(0xff00, float:9.1477E-41)
            int r2 = r4 >> r2
            byte[] r4 = r9.zza
            int r5 = r9.zzb
            r6 = r4[r5]
            r7 = 1
            int r8 = r7 << r3
            int r8 = r8 + (-1)
            r2 = r2 | r8
            r2 = r2 & r6
            byte r2 = (byte) r2
            r4[r5] = r2
            int r11 = 14 - r11
            r10 = r10 & 16383(0x3fff, float:2.2957E-41)
            int r6 = r10 >>> r11
            int r3 = r6 << r3
            r2 = r2 | r3
            byte r2 = (byte) r2
            r4[r5] = r2
            int r5 = r5 + r7
        L33:
            if (r11 <= r0) goto L42
            byte[] r2 = r9.zza
            int r3 = r5 + 1
            int r11 = r11 + (-8)
            int r4 = r10 >>> r11
            byte r4 = (byte) r4
            r2[r5] = r4
            r5 = r3
            goto L33
        L42:
            int r0 = 8 - r11
            byte[] r2 = r9.zza
            r3 = r2[r5]
            int r4 = r7 << r0
            int r4 = r4 + (-1)
            r3 = r3 & r4
            byte r3 = (byte) r3
            r2[r5] = r3
            int r11 = r7 << r11
            int r11 = r11 + (-1)
            r10 = r10 & r11
            int r10 = r10 << r0
            r10 = r10 | r3
            byte r10 = (byte) r10
            r2[r5] = r10
            r9.zzn(r1)
            r9.zzq()
            return
    }

    public final void zzh(byte[] r9, int r10, int r11) {
            r8 = this;
            r10 = 0
            r0 = 0
        L2:
            int r1 = r11 >> 3
            r2 = 255(0xff, float:3.57E-43)
            r3 = 8
            if (r0 >= r1) goto L26
            byte[] r1 = r8.zza
            int r4 = r8.zzb
            int r5 = r4 + 1
            r8.zzb = r5
            r4 = r1[r4]
            int r6 = r8.zzc
            int r4 = r4 << r6
            byte r4 = (byte) r4
            r9[r0] = r4
            r1 = r1[r5]
            r1 = r1 & r2
            int r3 = r3 - r6
            int r1 = r1 >> r3
            r1 = r1 | r4
            byte r1 = (byte) r1
            r9[r0] = r1
            int r0 = r0 + 1
            goto L2
        L26:
            r11 = r11 & 7
            if (r11 != 0) goto L2b
            return
        L2b:
            r0 = r9[r1]
            int r4 = r2 >> r11
            r0 = r0 & r4
            byte r0 = (byte) r0
            r9[r1] = r0
            int r4 = r8.zzc
            int r5 = r4 + r11
            if (r5 <= r3) goto L4b
            byte[] r5 = r8.zza
            int r6 = r8.zzb
            int r7 = r6 + 1
            r8.zzb = r7
            r5 = r5[r6]
            r5 = r5 & r2
            int r5 = r5 << r4
            r0 = r0 | r5
            byte r0 = (byte) r0
            r9[r1] = r0
            int r4 = r4 + (-8)
        L4b:
            int r4 = r4 + r11
            r8.zzc = r4
            byte[] r5 = r8.zza
            int r6 = r8.zzb
            r5 = r5[r6]
            r2 = r2 & r5
            int r5 = 8 - r4
            int r11 = 8 - r11
            int r2 = r2 >> r5
            int r11 = r2 << r11
            byte r11 = (byte) r11
            r11 = r11 | r0
            byte r11 = (byte) r11
            r9[r1] = r11
            if (r4 != r3) goto L69
            r8.zzc = r10
            int r6 = r6 + 1
            r8.zzb = r6
        L69:
            r8.zzq()
            return
    }

    public final void zzi(byte[] r3, int r4, int r5) {
            r2 = this;
            int r4 = r2.zzc
            r0 = 0
            if (r4 != 0) goto L7
            r4 = 1
            goto L8
        L7:
            r4 = 0
        L8:
            com.google.android.gms.internal.ads.zzdi.zzf(r4)
            byte[] r4 = r2.zza
            int r1 = r2.zzb
            java.lang.System.arraycopy(r4, r1, r3, r0, r5)
            int r3 = r2.zzb
            int r3 = r3 + r5
            r2.zzb = r3
            r2.zzq()
            return
    }

    public final void zzj(com.google.android.gms.internal.ads.zzek r3) {
            r2 = this;
            byte[] r0 = r3.zzN()
            int r1 = r3.zze()
            r2.zzk(r0, r1)
            int r3 = r3.zzd()
            int r3 = r3 * 8
            r2.zzl(r3)
            return
    }

    public final void zzk(byte[] r1, int r2) {
            r0 = this;
            r0.zza = r1
            r1 = 0
            r0.zzb = r1
            r0.zzc = r1
            r0.zzd = r2
            return
    }

    public final void zzl(int r2) {
            r1 = this;
            int r0 = r2 / 8
            r1.zzb = r0
            int r0 = r0 * 8
            int r2 = r2 - r0
            r1.zzc = r2
            r1.zzq()
            return
    }

    public final void zzm() {
            r2 = this;
            int r0 = r2.zzc
            int r0 = r0 + 1
            r2.zzc = r0
            r1 = 8
            if (r0 != r1) goto L13
            r0 = 0
            r2.zzc = r0
            int r0 = r2.zzb
            int r0 = r0 + 1
            r2.zzb = r0
        L13:
            r2.zzq()
            return
    }

    public final void zzn(int r4) {
            r3 = this;
            int r0 = r3.zzb
            int r1 = r4 / 8
            int r0 = r0 + r1
            r3.zzb = r0
            int r1 = r1 * 8
            int r2 = r3.zzc
            int r4 = r4 - r1
            int r2 = r2 + r4
            r3.zzc = r2
            r4 = 7
            if (r2 <= r4) goto L1a
            int r0 = r0 + 1
            r3.zzb = r0
            int r2 = r2 + (-8)
            r3.zzc = r2
        L1a:
            r3.zzq()
            return
    }

    public final void zzo(int r2) {
            r1 = this;
            int r0 = r1.zzc
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            int r0 = r1.zzb
            int r0 = r0 + r2
            r1.zzb = r0
            r1.zzq()
            return
    }

    public final boolean zzp() {
            r3 = this;
            byte[] r0 = r3.zza
            int r1 = r3.zzb
            r0 = r0[r1]
            int r1 = r3.zzc
            r2 = 128(0x80, float:1.794E-43)
            int r1 = r2 >> r1
            r0 = r0 & r1
            r3.zzm()
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }
}
