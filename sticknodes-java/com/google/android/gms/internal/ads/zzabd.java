package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzabd {
    private final com.google.android.gms.internal.ads.zzaam zza;
    private final com.google.android.gms.internal.ads.zzabb zzb;
    private final com.google.android.gms.internal.ads.zzabc zzc;
    private boolean zzd;
    private android.view.Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzabd(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzaam r0 = new com.google.android.gms.internal.ads.zzaam
            r0.<init>()
            r2.zza = r0
            r0 = 0
            if (r3 != 0) goto Lf
        Ld:
            r1 = r0
            goto L1e
        Lf:
            java.lang.String r1 = "display"
            java.lang.Object r3 = r3.getSystemService(r1)
            android.hardware.display.DisplayManager r3 = (android.hardware.display.DisplayManager) r3
            if (r3 == 0) goto Ld
            com.google.android.gms.internal.ads.zzabb r1 = new com.google.android.gms.internal.ads.zzabb
            r1.<init>(r2, r3)
        L1e:
            r2.zzb = r1
            if (r1 == 0) goto L26
            com.google.android.gms.internal.ads.zzabc r0 = com.google.android.gms.internal.ads.zzabc.zza()
        L26:
            r2.zzc = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzk = r0
            r2.zzl = r0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.zzf = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.zzi = r3
            r3 = 0
            r2.zzj = r3
            return
    }

    static /* bridge */ /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzabd r4, android.view.Display r5) {
            if (r5 == 0) goto L1a
            r0 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            float r5 = r5.getRefreshRate()
            double r2 = (double) r5
            double r0 = r0 / r2
            long r0 = (long) r0
            r4.zzk = r0
            r2 = 80
            long r0 = r0 * r2
            r2 = 100
            long r0 = r0 / r2
            r4.zzl = r0
            return
        L1a:
            java.lang.String r5 = "VideoFrameReleaseHelper"
            java.lang.String r0 = "Unable to query display refresh rate"
            com.google.android.gms.internal.ads.zzea.zzf(r5, r0)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.zzk = r0
            r4.zzl = r0
            return
    }

    private final void zzk() {
            r3 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 30
            if (r0 < r1) goto L1d
            android.view.Surface r0 = r3.zze
            if (r0 == 0) goto L1d
            int r1 = r3.zzj
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L1d
            float r1 = r3.zzh
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L18
            goto L1d
        L18:
            r3.zzh = r2
            com.google.android.gms.internal.ads.zzaba.zza(r0, r2)
        L1d:
            return
    }

    private final void zzl() {
            r2 = this;
            r0 = 0
            r2.zzm = r0
            r0 = -1
            r2.zzp = r0
            r2.zzn = r0
            return
    }

    private final void zzm() {
            r10 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 30
            if (r0 < r1) goto L6a
            android.view.Surface r0 = r10.zze
            if (r0 != 0) goto Lb
            goto L6a
        Lb:
            com.google.android.gms.internal.ads.zzaam r0 = r10.zza
            boolean r0 = r0.zzg()
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzaam r0 = r10.zza
            float r0 = r0.zza()
            goto L1c
        L1a:
            float r0 = r10.zzf
        L1c:
            float r2 = r10.zzg
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 == 0) goto L6a
            r3 = 1
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L57
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L57
            com.google.android.gms.internal.ads.zzaam r1 = r10.zza
            boolean r1 = r1.zzg()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L4a
            com.google.android.gms.internal.ads.zzaam r1 = r10.zza
            long r6 = r1.zzd()
            r8 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L4a
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L4a:
            float r1 = r10.zzg
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L62
            goto L63
        L57:
            if (r6 != 0) goto L65
            com.google.android.gms.internal.ads.zzaam r2 = r10.zza
            int r2 = r2.zzb()
            if (r2 < r1) goto L62
            goto L63
        L62:
            r3 = 0
        L63:
            if (r3 == 0) goto L6a
        L65:
            r10.zzg = r0
            r10.zzn(r5)
        L6a:
            return
    }

    private final void zzn(boolean r5) {
            r4 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 30
            if (r0 < r1) goto L2f
            android.view.Surface r0 = r4.zze
            if (r0 == 0) goto L2f
            int r1 = r4.zzj
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L2f
        L11:
            boolean r1 = r4.zzd
            r2 = 0
            if (r1 == 0) goto L22
            float r1 = r4.zzg
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L22
            float r2 = r4.zzi
            float r2 = r2 * r1
        L22:
            if (r5 != 0) goto L2a
            float r5 = r4.zzh
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L2f
        L2a:
            r4.zzh = r2
            com.google.android.gms.internal.ads.zzaba.zza(r0, r2)
        L2f:
            return
    }

    public final long zza(long r12) {
            r11 = this;
            long r0 = r11.zzp
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L37
            com.google.android.gms.internal.ads.zzaam r0 = r11.zza
            boolean r0 = r0.zzg()
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzaam r0 = r11.zza
            long r0 = r0.zzc()
            long r2 = r11.zzq
            long r4 = r11.zzm
            long r6 = r11.zzp
            long r4 = r4 - r6
            long r0 = r0 * r4
            float r4 = r11.zzi
            float r0 = (float) r0
            float r0 = r0 / r4
            long r0 = (long) r0
            long r2 = r2 + r0
            long r0 = r12 - r2
            long r0 = java.lang.Math.abs(r0)
            r4 = 20000000(0x1312d00, double:9.881313E-317)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L36
            r11.zzl()
            goto L37
        L36:
            r12 = r2
        L37:
            long r0 = r11.zzm
            r11.zzn = r0
            r11.zzo = r12
            com.google.android.gms.internal.ads.zzabc r0 = r11.zzc
            if (r0 == 0) goto L73
            long r1 = r11.zzk
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L4d
            goto L73
        L4d:
            long r0 = r0.zza
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L73
            long r2 = r11.zzk
            long r4 = r12 - r0
            long r4 = r4 / r2
            long r4 = r4 * r2
            long r0 = r0 + r4
            int r4 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r4 > 0) goto L62
            long r2 = r0 - r2
            goto L66
        L62:
            long r2 = r2 + r0
            r9 = r0
            r0 = r2
            r2 = r9
        L66:
            long r4 = r11.zzl
            long r6 = r0 - r12
            long r12 = r12 - r2
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 >= 0) goto L70
            goto L71
        L70:
            r0 = r2
        L71:
            long r0 = r0 - r4
            return r0
        L73:
            return r12
    }

    public final void zzc(float r1) {
            r0 = this;
            r0.zzf = r1
            com.google.android.gms.internal.ads.zzaam r1 = r0.zza
            r1.zzf()
            r0.zzm()
            return
    }

    public final void zzd(long r6) {
            r5 = this;
            long r0 = r5.zzn
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Le
            r5.zzp = r0
            long r0 = r5.zzo
            r5.zzq = r0
        Le:
            long r0 = r5.zzm
            r2 = 1
            long r0 = r0 + r2
            r5.zzm = r0
            com.google.android.gms.internal.ads.zzaam r0 = r5.zza
            r1 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r1
            r0.zze(r6)
            r5.zzm()
            return
    }

    public final void zze(float r1) {
            r0 = this;
            r0.zzi = r1
            r0.zzl()
            r1 = 0
            r0.zzn(r1)
            return
    }

    public final void zzf() {
            r0 = this;
            r0.zzl()
            return
    }

    public final void zzg() {
            r1 = this;
            r0 = 1
            r1.zzd = r0
            r1.zzl()
            com.google.android.gms.internal.ads.zzabb r0 = r1.zzb
            if (r0 == 0) goto L17
            com.google.android.gms.internal.ads.zzabc r0 = r1.zzc
            java.util.Objects.requireNonNull(r0)
            r0.zzb()
            com.google.android.gms.internal.ads.zzabb r0 = r1.zzb
            r0.zza()
        L17:
            r0 = 0
            r1.zzn(r0)
            return
    }

    public final void zzh() {
            r1 = this;
            r0 = 0
            r1.zzd = r0
            com.google.android.gms.internal.ads.zzabb r0 = r1.zzb
            if (r0 == 0) goto L12
            r0.zzb()
            com.google.android.gms.internal.ads.zzabc r0 = r1.zzc
            java.util.Objects.requireNonNull(r0)
            r0.zzc()
        L12:
            r1.zzk()
            return
    }

    public final void zzi(android.view.Surface r2) {
            r1 = this;
            android.view.Surface r0 = r1.zze
            if (r0 != r2) goto L5
            return
        L5:
            r1.zzk()
            r1.zze = r2
            r2 = 1
            r1.zzn(r2)
            return
    }

    public final void zzj(int r2) {
            r1 = this;
            int r0 = r1.zzj
            if (r0 != r2) goto L5
            return
        L5:
            r1.zzj = r2
            r2 = 1
            r1.zzn(r2)
            return
    }
}
