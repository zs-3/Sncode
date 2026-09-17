package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzajf {
    public final com.google.android.gms.internal.ads.zzaeh zza;
    public final com.google.android.gms.internal.ads.zzajt zzb;
    public final com.google.android.gms.internal.ads.zzek zzc;
    public com.google.android.gms.internal.ads.zzaju zzd;
    public com.google.android.gms.internal.ads.zzajb zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final com.google.android.gms.internal.ads.zzek zzj;
    private final com.google.android.gms.internal.ads.zzek zzk;
    private boolean zzl;

    public zzajf(com.google.android.gms.internal.ads.zzaeh r2, com.google.android.gms.internal.ads.zzaju r3, com.google.android.gms.internal.ads.zzajb r4) {
            r1 = this;
            r1.<init>()
            r1.zza = r2
            r1.zzd = r3
            r1.zze = r4
            com.google.android.gms.internal.ads.zzajt r2 = new com.google.android.gms.internal.ads.zzajt
            r2.<init>()
            r1.zzb = r2
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            r2.<init>()
            r1.zzc = r2
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            r0 = 1
            r2.<init>(r0)
            r1.zzj = r2
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            r2.<init>()
            r1.zzk = r2
            r1.zzh(r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzajf r0, boolean r1) {
            r1 = 1
            r0.zzl = r1
            return
    }

    static /* bridge */ /* synthetic */ boolean zzj(com.google.android.gms.internal.ads.zzajf r0) {
            boolean r0 = r0.zzl
            return r0
    }

    public final int zza() {
            r2 = this;
            boolean r0 = r2.zzl
            if (r0 != 0) goto Ld
            com.google.android.gms.internal.ads.zzaju r0 = r2.zzd
            int[] r0 = r0.zzg
            int r1 = r2.zzf
            r0 = r0[r1]
            goto L1a
        Ld:
            com.google.android.gms.internal.ads.zzajt r0 = r2.zzb
            boolean[] r0 = r0.zzj
            int r1 = r2.zzf
            boolean r0 = r0[r1]
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            com.google.android.gms.internal.ads.zzajs r1 = r2.zzf()
            if (r1 == 0) goto L23
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = r0 | r1
        L23:
            return r0
    }

    public final int zzb() {
            r2 = this;
            boolean r0 = r2.zzl
            if (r0 != 0) goto Ld
            com.google.android.gms.internal.ads.zzaju r0 = r2.zzd
            int[] r0 = r0.zzd
            int r1 = r2.zzf
            r0 = r0[r1]
            goto L15
        Ld:
            com.google.android.gms.internal.ads.zzajt r0 = r2.zzb
            int[] r0 = r0.zzh
            int r1 = r2.zzf
            r0 = r0[r1]
        L15:
            return r0
    }

    public final int zzc(int r10, int r11) {
            r9 = this;
            com.google.android.gms.internal.ads.zzajs r0 = r9.zzf()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r0.zzd
            if (r2 == 0) goto L11
            com.google.android.gms.internal.ads.zzajt r0 = r9.zzb
            com.google.android.gms.internal.ads.zzek r0 = r0.zzn
            goto L1e
        L11:
            byte[] r0 = r0.zze
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzek r2 = r9.zzk
            int r3 = r0.length
            r2.zzJ(r0, r3)
            com.google.android.gms.internal.ads.zzek r0 = r9.zzk
            r2 = r3
        L1e:
            com.google.android.gms.internal.ads.zzajt r3 = r9.zzb
            int r4 = r9.zzf
            boolean r3 = r3.zzb(r4)
            r4 = 1
            if (r3 != 0) goto L2e
            if (r11 == 0) goto L2c
            goto L2e
        L2c:
            r5 = 0
            goto L2f
        L2e:
            r5 = 1
        L2f:
            com.google.android.gms.internal.ads.zzek r6 = r9.zzj
            if (r4 == r5) goto L35
            r7 = 0
            goto L37
        L35:
            r7 = 128(0x80, float:1.794E-43)
        L37:
            r7 = r7 | r2
            byte[] r8 = r6.zzN()
            byte r7 = (byte) r7
            r8[r1] = r7
            r6.zzL(r1)
            com.google.android.gms.internal.ads.zzaeh r6 = r9.zza
            com.google.android.gms.internal.ads.zzek r7 = r9.zzj
            r6.zzr(r7, r4, r4)
            com.google.android.gms.internal.ads.zzaeh r6 = r9.zza
            r6.zzr(r0, r2, r4)
            if (r5 != 0) goto L52
            int r2 = r2 + r4
            return r2
        L52:
            r0 = 6
            r5 = 3
            r6 = 2
            r7 = 8
            if (r3 != 0) goto L92
            byte r11 = (byte) r11
            com.google.android.gms.internal.ads.zzek r3 = r9.zzc
            r3.zzI(r7)
            com.google.android.gms.internal.ads.zzek r3 = r9.zzc
            byte[] r8 = r3.zzN()
            r8[r1] = r1
            r8[r4] = r4
            r8[r6] = r1
            r8[r5] = r11
            r11 = 4
            int r1 = r10 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r8[r11] = r1
            r11 = 5
            int r1 = r10 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r8[r11] = r1
            int r11 = r10 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            r8[r0] = r11
            r11 = 7
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r8[r11] = r10
            com.google.android.gms.internal.ads.zzaeh r10 = r9.zza
            r10.zzr(r3, r7, r4)
            int r2 = r2 + 9
            return r2
        L92:
            int r2 = r2 + r4
            com.google.android.gms.internal.ads.zzajt r10 = r9.zzb
            com.google.android.gms.internal.ads.zzek r10 = r10.zzn
            int r3 = r10.zzq()
            r8 = -2
            r10.zzM(r8)
            int r3 = r3 * 6
            int r3 = r3 + r6
            if (r11 == 0) goto Lcb
            com.google.android.gms.internal.ads.zzek r0 = r9.zzc
            r0.zzI(r3)
            com.google.android.gms.internal.ads.zzek r0 = r9.zzc
            byte[] r0 = r0.zzN()
            r10.zzH(r0, r1, r3)
            r10 = r0[r6]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << r7
            r1 = r0[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r10 = r10 | r1
            int r10 = r10 + r11
            int r11 = r10 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            r0[r6] = r11
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r0[r5] = r10
            com.google.android.gms.internal.ads.zzek r10 = r9.zzc
        Lcb:
            com.google.android.gms.internal.ads.zzaeh r11 = r9.zza
            r11.zzr(r10, r3, r4)
            int r2 = r2 + r3
            return r2
    }

    public final long zzd() {
            r3 = this;
            boolean r0 = r3.zzl
            if (r0 != 0) goto Ld
            com.google.android.gms.internal.ads.zzaju r0 = r3.zzd
            long[] r0 = r0.zzc
            int r1 = r3.zzf
            r1 = r0[r1]
            goto L15
        Ld:
            com.google.android.gms.internal.ads.zzajt r0 = r3.zzb
            long[] r0 = r0.zzf
            int r1 = r3.zzh
            r1 = r0[r1]
        L15:
            return r1
    }

    public final long zze() {
            r3 = this;
            boolean r0 = r3.zzl
            if (r0 != 0) goto Ld
            com.google.android.gms.internal.ads.zzaju r0 = r3.zzd
            long[] r0 = r0.zzf
            int r1 = r3.zzf
            r1 = r0[r1]
            goto L15
        Ld:
            com.google.android.gms.internal.ads.zzajt r0 = r3.zzb
            int r1 = r3.zzf
            long[] r0 = r0.zzi
            r1 = r0[r1]
        L15:
            return r1
    }

    public final com.google.android.gms.internal.ads.zzajs zzf() {
            r4 = this;
            boolean r0 = r4.zzl
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.ads.zzajt r0 = r4.zzb
            com.google.android.gms.internal.ads.zzajb r2 = r0.zza
            int r3 = com.google.android.gms.internal.ads.zzeu.zza
            int r2 = r2.zza
            com.google.android.gms.internal.ads.zzajs r0 = r0.zzm
            if (r0 == 0) goto L13
            goto L1b
        L13:
            com.google.android.gms.internal.ads.zzaju r0 = r4.zzd
            com.google.android.gms.internal.ads.zzajr r0 = r0.zza
            com.google.android.gms.internal.ads.zzajs r0 = r0.zza(r2)
        L1b:
            if (r0 == 0) goto L22
            boolean r2 = r0.zza
            if (r2 == 0) goto L22
            return r0
        L22:
            return r1
    }

    public final void zzh(com.google.android.gms.internal.ads.zzaju r1, com.google.android.gms.internal.ads.zzajb r2) {
            r0 = this;
            r0.zzd = r1
            r0.zze = r2
            com.google.android.gms.internal.ads.zzajr r1 = r1.zza
            com.google.android.gms.internal.ads.zzaf r1 = r1.zzf
            com.google.android.gms.internal.ads.zzaeh r2 = r0.zza
            r2.zzl(r1)
            r0.zzi()
            return
    }

    public final void zzi() {
            r4 = this;
            com.google.android.gms.internal.ads.zzajt r0 = r4.zzb
            r1 = 0
            r0.zzd = r1
            r2 = 0
            r0.zzp = r2
            r0.zzq = r1
            r0.zzk = r1
            r0.zzo = r1
            r2 = 0
            r0.zzm = r2
            r4.zzf = r1
            r4.zzh = r1
            r4.zzg = r1
            r4.zzi = r1
            r4.zzl = r1
            return
    }

    public final boolean zzk() {
            r5 = this;
            int r0 = r5.zzf
            r1 = 1
            int r0 = r0 + r1
            r5.zzf = r0
            boolean r0 = r5.zzl
            r2 = 0
            if (r0 != 0) goto Lc
            return r2
        Lc:
            int r0 = r5.zzg
            int r0 = r0 + r1
            r5.zzg = r0
            com.google.android.gms.internal.ads.zzajt r3 = r5.zzb
            int[] r3 = r3.zzg
            int r4 = r5.zzh
            r3 = r3[r4]
            if (r0 != r3) goto L21
            int r4 = r4 + r1
            r5.zzh = r4
            r5.zzg = r2
            return r2
        L21:
            return r1
    }
}
