package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzacq implements com.google.android.gms.internal.ads.zzadc {
    private final byte[] zza;
    private final com.google.android.gms.internal.ads.zzp zzb;
    private final long zzc;
    private long zzd;
    private byte[] zze;
    private int zzf;
    private int zzg;

    static {
            java.lang.String r0 = "media3.extractor"
            com.google.android.gms.internal.ads.zzbd.zzb(r0)
            return
    }

    public zzacq(com.google.android.gms.internal.ads.zzp r1, long r2, long r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzd = r2
            r0.zzc = r4
            r1 = 65536(0x10000, float:9.18355E-41)
            byte[] r1 = new byte[r1]
            r0.zze = r1
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]
            r0.zza = r1
            return
    }

    private final int zzp(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.zzg
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r5 = java.lang.Math.min(r0, r5)
            byte[] r0 = r2.zze
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            r2.zzu(r5)
            return r5
    }

    private final int zzq(byte[] r2, int r3, int r4, int r5, boolean r6) throws java.io.IOException {
            r1 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L1e
            com.google.android.gms.internal.ads.zzp r0 = r1.zzb
            int r3 = r3 + r5
            int r4 = r4 - r5
            int r2 = r0.zza(r2, r3, r4)
            r3 = -1
            if (r2 != r3) goto L1c
            if (r5 != 0) goto L16
            if (r6 == 0) goto L16
            return r3
        L16:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
        L1c:
            int r5 = r5 + r2
            return r5
        L1e:
            java.io.InterruptedIOException r2 = new java.io.InterruptedIOException
            r2.<init>()
            throw r2
    }

    private final int zzr(int r2) {
            r1 = this;
            int r0 = r1.zzg
            int r2 = java.lang.Math.min(r0, r2)
            r1.zzu(r2)
            return r2
    }

    private final void zzs(int r5) {
            r4 = this;
            r0 = -1
            if (r5 == r0) goto L9
            long r0 = r4.zzd
            long r2 = (long) r5
            long r0 = r0 + r2
            r4.zzd = r0
        L9:
            return
    }

    private final void zzt(int r4) {
            r3 = this;
            int r0 = r3.zzf
            int r0 = r0 + r4
            byte[] r4 = r3.zze
            int r4 = r4.length
            if (r0 <= r4) goto L1f
            r1 = 65536(0x10000, float:9.18355E-41)
            int r1 = r1 + r0
            r2 = 524288(0x80000, float:7.34684E-40)
            int r0 = r0 + r2
            int r4 = r4 + r4
            int r4 = java.lang.Math.min(r4, r0)
            int r4 = java.lang.Math.max(r1, r4)
            byte[] r0 = r3.zze
            byte[] r4 = java.util.Arrays.copyOf(r0, r4)
            r3.zze = r4
        L1f:
            return
    }

    private final void zzu(int r6) {
            r5 = this;
            int r0 = r5.zzg
            int r0 = r0 - r6
            r5.zzg = r0
            r1 = 0
            r5.zzf = r1
            byte[] r2 = r5.zze
            int r3 = r2.length
            r4 = -524288(0xfffffffffff80000, float:NaN)
            int r3 = r3 + r4
            if (r0 >= r3) goto L16
            r3 = 65536(0x10000, float:9.18355E-41)
            int r3 = r3 + r0
            byte[] r3 = new byte[r3]
            goto L17
        L16:
            r3 = r2
        L17:
            java.lang.System.arraycopy(r2, r6, r3, r1, r0)
            r5.zze = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadc, com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] r8, int r9, int r10) throws java.io.IOException {
            r7 = this;
            int r0 = r7.zzp(r8, r9, r10)
            if (r0 != 0) goto L10
            r5 = 0
            r6 = 1
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            int r0 = r1.zzq(r2, r3, r4, r5, r6)
        L10:
            r7.zzs(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final int zzb(byte[] r8, int r9, int r10) throws java.io.IOException {
            r7 = this;
            r7.zzt(r10)
            int r0 = r7.zzg
            int r3 = r7.zzf
            int r0 = r0 - r3
            if (r0 != 0) goto L1e
            byte[] r2 = r7.zze
            r5 = 0
            r6 = 1
            r1 = r7
            r4 = r10
            int r10 = r1.zzq(r2, r3, r4, r5, r6)
            r0 = -1
            if (r10 != r0) goto L18
            return r0
        L18:
            int r0 = r7.zzg
            int r0 = r0 + r10
            r7.zzg = r0
            goto L22
        L1e:
            int r10 = java.lang.Math.min(r10, r0)
        L22:
            byte[] r0 = r7.zze
            int r1 = r7.zzf
            java.lang.System.arraycopy(r0, r1, r8, r9, r10)
            int r8 = r7.zzf
            int r8 = r8 + r10
            r7.zzf = r8
            return r10
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final int zzc(int r8) throws java.io.IOException {
            r7 = this;
            r8 = 1
            int r0 = r7.zzr(r8)
            if (r0 != 0) goto L17
            byte[] r2 = r7.zza
            r3 = 0
            r0 = 4096(0x1000, float:5.74E-42)
            int r4 = java.lang.Math.min(r8, r0)
            r5 = 0
            r6 = 1
            r1 = r7
            int r0 = r1.zzq(r2, r3, r4, r5, r6)
        L17:
            r7.zzs(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final long zzd() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final long zze() {
            r4 = this;
            long r0 = r4.zzd
            int r2 = r4.zzf
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final long zzf() {
            r2 = this;
            long r0 = r2.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final void zzg(int r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.zzl(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final void zzh(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.zzm(r2, r3, r4, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final void zzi(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.zzn(r2, r3, r4, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final void zzj() {
            r1 = this;
            r0 = 0
            r1.zzf = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final void zzk(int r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.zzo(r2, r0)
            return
    }

    public final boolean zzl(int r8, boolean r9) throws java.io.IOException {
            r7 = this;
            r7.zzt(r8)
            int r0 = r7.zzg
            int r1 = r7.zzf
            int r0 = r0 - r1
            r5 = r0
        L9:
            if (r5 >= r8) goto L21
            byte[] r2 = r7.zze
            int r3 = r7.zzf
            r1 = r7
            r4 = r8
            r6 = r9
            int r5 = r1.zzq(r2, r3, r4, r5, r6)
            r0 = -1
            if (r5 != r0) goto L1b
            r8 = 0
            return r8
        L1b:
            int r0 = r7.zzf
            int r0 = r0 + r5
            r7.zzg = r0
            goto L9
        L21:
            int r9 = r7.zzf
            int r9 = r9 + r8
            r7.zzf = r9
            r8 = 1
            return r8
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final boolean zzm(byte[] r2, int r3, int r4, boolean r5) throws java.io.IOException {
            r1 = this;
            boolean r5 = r1.zzl(r4, r5)
            if (r5 != 0) goto L8
            r2 = 0
            return r2
        L8:
            byte[] r5 = r1.zze
            int r0 = r1.zzf
            int r0 = r0 - r4
            java.lang.System.arraycopy(r5, r0, r2, r3, r4)
            r2 = 1
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final boolean zzn(byte[] r8, int r9, int r10, boolean r11) throws java.io.IOException {
            r7 = this;
            int r0 = r7.zzp(r8, r9, r10)
            r5 = r0
        L5:
            r0 = -1
            if (r5 >= r10) goto L14
            if (r5 == r0) goto L14
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            int r5 = r1.zzq(r2, r3, r4, r5, r6)
            goto L5
        L14:
            r7.zzs(r5)
            if (r5 == r0) goto L1b
            r8 = 1
            return r8
        L1b:
            r8 = 0
            return r8
    }

    public final boolean zzo(int r7, boolean r8) throws java.io.IOException {
            r6 = this;
            int r8 = r6.zzr(r7)
            r4 = r8
        L5:
            r8 = -1
            if (r4 >= r7) goto L1a
            if (r4 == r8) goto L1a
            int r8 = r4 + 4096
            byte[] r1 = r6.zza
            int r2 = -r4
            int r3 = java.lang.Math.min(r7, r8)
            r5 = 0
            r0 = r6
            int r4 = r0.zzq(r1, r2, r3, r4, r5)
            goto L5
        L1a:
            r6.zzs(r4)
            if (r4 == r8) goto L21
            r7 = 1
            return r7
        L21:
            r7 = 0
            return r7
    }
}
