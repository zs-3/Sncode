package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzrk extends com.google.android.gms.internal.ads.zzcu {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private byte[] zzi;
    private int zzj;
    private int zzk;
    private byte[] zzl;

    public zzrk() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzh = r0
            r1.zzj = r0
            r1.zzk = r0
            byte[] r0 = com.google.android.gms.internal.ads.zzeu.zzf
            r1.zzi = r0
            r1.zzl = r0
            return
    }

    private final int zzq(int r4) {
            r3 = this;
            r0 = 2000000(0x1e8480, double:9.881313E-318)
            int r0 = r3.zzr(r0)
            int r1 = r3.zzh
            int r0 = r0 - r1
            int r1 = r3.zzd
            int r0 = r0 * r1
            byte[] r1 = r3.zzi
            int r1 = r1.length
            r2 = 1
            int r1 = r1 >> r2
            int r0 = r0 - r1
            if (r0 < 0) goto L17
            goto L18
        L17:
            r2 = 0
        L18:
            com.google.android.gms.internal.ads.zzdi.zzf(r2)
            float r4 = (float) r4
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            float r4 = r4 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r1
            float r0 = (float) r0
            float r4 = java.lang.Math.min(r4, r0)
            int r4 = (int) r4
            int r0 = r3.zzd
            int r4 = r4 / r0
            int r4 = r4 * r0
            return r4
    }

    private final int zzr(long r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcr r0 = r2.zzb
            int r0 = r0.zzb
            long r0 = (long) r0
            long r3 = r3 * r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r0
            int r4 = (int) r3
            return r4
    }

    private static int zzs(byte r0, byte r1) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r0 = r0 | r1
            return r0
    }

    private final void zzt(boolean r9) {
            r8 = this;
            int r0 = r8.zzk
            byte[] r1 = r8.zzi
            int r1 = r1.length
            r2 = 1
            if (r0 == r1) goto Ld
            if (r9 == 0) goto Lc
            r9 = 1
            goto Ld
        Lc:
            return
        Ld:
            int r3 = r8.zzh
            r4 = 0
            if (r3 != 0) goto L2d
            if (r9 == 0) goto L1b
            r9 = 3
            r8.zzu(r0, r9)
            r9 = r0
        L19:
            r1 = r9
            goto L4d
        L1b:
            int r9 = r1 >> 1
            if (r0 < r9) goto L21
            r9 = 1
            goto L22
        L21:
            r9 = 0
        L22:
            com.google.android.gms.internal.ads.zzdi.zzf(r9)
            byte[] r9 = r8.zzi
            int r9 = r9.length
            int r9 = r9 >> r2
            r8.zzu(r9, r4)
            goto L19
        L2d:
            int r1 = r1 >> r2
            int r3 = r0 - r1
            if (r9 == 0) goto L44
            int r9 = r8.zzq(r3)
            byte[] r5 = r8.zzi
            int r5 = r5.length
            int r5 = r5 >> r2
            int r9 = r9 + r5
            r5 = 2
            r8.zzu(r9, r5)
            int r1 = r1 + r3
            r7 = r1
            r1 = r9
            r9 = r7
            goto L4d
        L44:
            int r9 = r8.zzq(r3)
            r8.zzu(r9, r2)
            r1 = r9
            r9 = r3
        L4d:
            int r3 = r8.zzd
            int r3 = r9 % r3
            if (r3 != 0) goto L55
            r3 = 1
            goto L56
        L55:
            r3 = 0
        L56:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "bytesConsumed is not aligned to frame size: %s"
            r5.append(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            com.google.android.gms.internal.ads.zzdi.zzg(r3, r5)
            if (r0 < r1) goto L6d
            goto L6e
        L6d:
            r2 = 0
        L6e:
            com.google.android.gms.internal.ads.zzdi.zzf(r2)
            int r0 = r8.zzk
            int r0 = r0 - r9
            r8.zzk = r0
            int r0 = r8.zzj
            int r0 = r0 + r9
            r8.zzj = r0
            byte[] r2 = r8.zzi
            int r2 = r2.length
            int r0 = r0 % r2
            r8.zzj = r0
            int r0 = r8.zzh
            int r2 = r8.zzd
            int r3 = r1 / r2
            int r0 = r0 + r3
            r8.zzh = r0
            long r3 = r8.zzg
            int r9 = r9 - r1
            int r9 = r9 / r2
            long r0 = (long) r9
            long r3 = r3 + r0
            r8.zzg = r3
            return
    }

    private final void zzu(int r10, int r11) {
            r9 = this;
            if (r10 != 0) goto L3
            return
        L3:
            int r0 = r9.zzk
            r1 = 1
            r2 = 0
            if (r0 < r10) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            r0 = 2
            if (r11 != r0) goto L40
            int r3 = r9.zzj
            int r4 = r9.zzk
            int r5 = r3 + r4
            byte[] r6 = r9.zzi
            int r7 = r6.length
            if (r5 > r7) goto L24
            int r5 = r5 - r10
            byte[] r3 = r9.zzl
            java.lang.System.arraycopy(r6, r5, r3, r2, r10)
            goto L5e
        L24:
            int r3 = r7 - r3
            int r4 = r4 - r3
            if (r4 < r10) goto L30
            byte[] r3 = r9.zzl
            int r4 = r4 - r10
            java.lang.System.arraycopy(r6, r4, r3, r2, r10)
            goto L5e
        L30:
            int r3 = r10 - r4
            int r7 = r7 - r3
            byte[] r5 = r9.zzl
            java.lang.System.arraycopy(r6, r7, r5, r2, r3)
            byte[] r5 = r9.zzi
            byte[] r6 = r9.zzl
            java.lang.System.arraycopy(r5, r2, r6, r3, r4)
            goto L5e
        L40:
            int r3 = r9.zzj
            int r4 = r3 + r10
            byte[] r5 = r9.zzi
            int r6 = r5.length
            if (r4 > r6) goto L4f
            byte[] r4 = r9.zzl
            java.lang.System.arraycopy(r5, r3, r4, r2, r10)
            goto L5e
        L4f:
            int r6 = r6 - r3
            byte[] r4 = r9.zzl
            java.lang.System.arraycopy(r5, r3, r4, r2, r6)
            int r3 = r10 - r6
            byte[] r4 = r9.zzi
            byte[] r5 = r9.zzl
            java.lang.System.arraycopy(r4, r2, r5, r6, r3)
        L5e:
            int r3 = r9.zzd
            int r3 = r10 % r3
            if (r3 != 0) goto L66
            r3 = 1
            goto L67
        L66:
            r3 = 0
        L67:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "sizeToOutput is not aligned to frame size: "
            r4.append(r5)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.internal.ads.zzdi.zze(r3, r4)
            int r3 = r9.zzj
            byte[] r4 = r9.zzi
            int r4 = r4.length
            if (r3 >= r4) goto L84
            r3 = 1
            goto L85
        L84:
            r3 = 0
        L85:
            com.google.android.gms.internal.ads.zzdi.zzf(r3)
            byte[] r3 = r9.zzl
            int r4 = r9.zzd
            int r4 = r10 % r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "byteOutput size is not aligned to frame size "
            r5.append(r6)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            if (r4 != 0) goto La2
            goto La3
        La2:
            r1 = 0
        La3:
            com.google.android.gms.internal.ads.zzdi.zze(r1, r5)
            r1 = 3
            if (r11 == r1) goto Lfb
            r1 = 0
        Laa:
            if (r1 >= r10) goto Lfb
            int r4 = r1 + 1
            r5 = r3[r4]
            r6 = r3[r1]
            int r5 = zzs(r5, r6)
            r6 = 10
            if (r11 != 0) goto Lc6
            int r6 = r10 + (-1)
            int r7 = r1 * 1000
            int r7 = r7 / r6
            int r7 = r7 * (-90)
            int r7 = r7 / 1000
            int r6 = r7 + 100
            goto Ld3
        Lc6:
            if (r11 != r0) goto Ld3
            int r7 = r10 + (-1)
            r8 = 90000(0x15f90, float:1.26117E-40)
            int r8 = r8 * r1
            int r8 = r8 / r7
            int r8 = r8 / 1000
            int r6 = r6 + r8
        Ld3:
            int r5 = r5 * r6
            int r5 = r5 / 100
            r6 = 32767(0x7fff, float:4.5916E-41)
            if (r5 < r6) goto Le3
            r5 = -1
            r3[r1] = r5
            r5 = 127(0x7f, float:1.78E-43)
            r3[r4] = r5
            goto Lf8
        Le3:
            r6 = -32768(0xffffffffffff8000, float:NaN)
            if (r5 > r6) goto Lee
            r3[r1] = r2
            r5 = -128(0xffffffffffffff80, float:NaN)
            r3[r4] = r5
            goto Lf8
        Lee:
            r6 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r3[r1] = r6
            int r5 = r5 >> 8
            byte r5 = (byte) r5
            r3[r4] = r5
        Lf8:
            int r1 = r1 + 2
            goto Laa
        Lfb:
            java.nio.ByteBuffer r11 = r9.zzj(r10)
            java.nio.ByteBuffer r10 = r11.put(r3, r2, r10)
            r10.flip()
            return
    }

    private static final boolean zzv(byte r0, byte r1) {
            int r0 = zzs(r0, r1)
            int r0 = java.lang.Math.abs(r0)
            r1 = 1024(0x400, float:1.435E-42)
            if (r0 <= r1) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zze(java.nio.ByteBuffer r10) {
            r9 = this;
        L0:
            boolean r0 = r10.hasRemaining()
            if (r0 == 0) goto Lfd
            boolean r0 = r9.zzn()
            if (r0 != 0) goto Lfd
            int r0 = r9.zzf
            r1 = 1
            if (r0 == 0) goto L98
            int r0 = r9.zzj
            byte[] r2 = r9.zzi
            int r2 = r2.length
            r3 = 0
            if (r0 >= r2) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            int r0 = r10.limit()
            int r2 = r10.position()
            int r2 = r2 + r1
        L28:
            int r4 = r10.limit()
            if (r2 >= r4) goto L47
            byte r4 = r10.get(r2)
            int r5 = r2 + (-1)
            byte r5 = r10.get(r5)
            boolean r4 = zzv(r4, r5)
            if (r4 == 0) goto L44
            int r4 = r9.zzd
            int r2 = r2 / r4
            int r4 = r4 * r2
            goto L4b
        L44:
            int r2 = r2 + 2
            goto L28
        L47:
            int r4 = r10.limit()
        L4b:
            int r2 = r10.position()
            int r2 = r4 - r2
            int r5 = r9.zzj
            int r6 = r9.zzk
            int r7 = r5 + r6
            byte[] r8 = r9.zzi
            int r8 = r8.length
            if (r7 >= r8) goto L5e
            int r8 = r8 - r7
            goto L63
        L5e:
            int r8 = r8 - r5
            int r7 = r6 - r8
            int r8 = r5 - r7
        L63:
            int r5 = java.lang.Math.min(r2, r8)
            int r6 = r10.position()
            int r6 = r6 + r5
            r10.limit(r6)
            byte[] r6 = r9.zzi
            r10.get(r6, r7, r5)
            int r6 = r9.zzk
            int r6 = r6 + r5
            r9.zzk = r6
            byte[] r5 = r9.zzi
            int r5 = r5.length
            if (r6 > r5) goto L80
            r5 = 1
            goto L81
        L80:
            r5 = 0
        L81:
            com.google.android.gms.internal.ads.zzdi.zzf(r5)
            if (r4 >= r0) goto L89
            if (r2 >= r8) goto L89
            goto L8a
        L89:
            r1 = 0
        L8a:
            r9.zzt(r1)
            if (r1 == 0) goto L93
            r9.zzf = r3
            r9.zzh = r3
        L93:
            r10.limit(r0)
            goto L0
        L98:
            int r0 = r10.limit()
            int r2 = r10.position()
            byte[] r3 = r9.zzi
            int r3 = r3.length
            int r2 = r2 + r3
            int r2 = java.lang.Math.min(r0, r2)
            r10.limit(r2)
            int r2 = r10.limit()
            int r2 = r2 + (-1)
        Lb1:
            int r3 = r10.position()
            if (r2 < r3) goto Ld1
            byte r3 = r10.get(r2)
            int r4 = r2 + (-1)
            byte r4 = r10.get(r4)
            boolean r3 = zzv(r3, r4)
            if (r3 == 0) goto Lce
            int r3 = r9.zzd
            int r2 = r2 / r3
            int r2 = r2 * r3
            int r2 = r2 + r3
            goto Ld5
        Lce:
            int r2 = r2 + (-2)
            goto Lb1
        Ld1:
            int r2 = r10.position()
        Ld5:
            int r3 = r10.position()
            if (r2 != r3) goto Lde
            r9.zzf = r1
            goto Lf8
        Lde:
            int r1 = r10.capacity()
            int r1 = java.lang.Math.min(r2, r1)
            r10.limit(r1)
            int r1 = r10.remaining()
            java.nio.ByteBuffer r1 = r9.zzj(r1)
            java.nio.ByteBuffer r1 = r1.put(r10)
            r1.flip()
        Lf8:
            r10.limit(r0)
            goto L0
        Lfd:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcu, com.google.android.gms.internal.ads.zzct
    public final boolean zzg() {
            r1 = this;
            boolean r0 = super.zzg()
            if (r0 == 0) goto Lc
            boolean r0 = r1.zze
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    protected final com.google.android.gms.internal.ads.zzcr zzi(com.google.android.gms.internal.ads.zzcr r3) throws com.google.android.gms.internal.ads.zzcs {
            r2 = this;
            int r0 = r3.zzd
            r1 = 2
            if (r0 != r1) goto Ld
            int r0 = r3.zzb
            r1 = -1
            if (r0 != r1) goto Lc
            com.google.android.gms.internal.ads.zzcr r3 = com.google.android.gms.internal.ads.zzcr.zza
        Lc:
            return r3
        Ld:
            com.google.android.gms.internal.ads.zzcs r0 = new com.google.android.gms.internal.ads.zzcs
            java.lang.String r1 = "Unhandled input format:"
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzk() {
            r3 = this;
            boolean r0 = r3.zzg()
            if (r0 == 0) goto L29
            com.google.android.gms.internal.ads.zzcr r0 = r3.zzb
            int r0 = r0.zzc
            int r0 = r0 + r0
            r3.zzd = r0
            r0 = 100000(0x186a0, double:4.94066E-319)
            int r0 = r3.zzr(r0)
            int r0 = r0 / 2
            int r1 = r3.zzd
            int r0 = r0 / r1
            int r0 = r0 * r1
            byte[] r1 = r3.zzi
            int r1 = r1.length
            int r0 = r0 + r0
            if (r1 == r0) goto L29
            byte[] r1 = new byte[r0]
            r3.zzi = r1
            byte[] r0 = new byte[r0]
            r3.zzl = r0
        L29:
            r0 = 0
            r3.zzf = r0
            r1 = 0
            r3.zzg = r1
            r3.zzh = r0
            r3.zzj = r0
            r3.zzk = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzl() {
            r1 = this;
            int r0 = r1.zzk
            if (r0 <= 0) goto Lb
            r0 = 1
            r1.zzt(r0)
            r0 = 0
            r1.zzh = r0
        Lb:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzm() {
            r1 = this;
            r0 = 0
            r1.zze = r0
            byte[] r0 = com.google.android.gms.internal.ads.zzeu.zzf
            r1.zzi = r0
            r1.zzl = r0
            return
    }

    public final long zzo() {
            r2 = this;
            long r0 = r2.zzg
            return r0
    }

    public final void zzp(boolean r1) {
            r0 = this;
            r0.zze = r1
            return
    }
}
