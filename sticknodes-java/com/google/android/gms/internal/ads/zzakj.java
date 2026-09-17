package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzakj {
    private final com.google.android.gms.internal.ads.zzakc zza;
    private com.google.android.gms.internal.ads.zzaeh zzb;
    private com.google.android.gms.internal.ads.zzade zzc;
    private com.google.android.gms.internal.ads.zzake zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private com.google.android.gms.internal.ads.zzakg zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;

    public zzakj() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzakc r0 = new com.google.android.gms.internal.ads.zzakc
            r0.<init>()
            r1.zza = r0
            com.google.android.gms.internal.ads.zzakg r0 = new com.google.android.gms.internal.ads.zzakg
            r0.<init>()
            r1.zzj = r0
            return
    }

    protected abstract long zza(com.google.android.gms.internal.ads.zzek r1);

    protected void zzb(boolean r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto Lf
            com.google.android.gms.internal.ads.zzakg r5 = new com.google.android.gms.internal.ads.zzakg
            r5.<init>()
            r4.zzj = r5
            r4.zzf = r0
            r5 = 0
            goto L10
        Lf:
            r5 = 1
        L10:
            r4.zzh = r5
            r2 = -1
            r4.zze = r2
            r4.zzg = r0
            return
    }

    protected abstract boolean zzc(com.google.android.gms.internal.ads.zzek r1, long r2, com.google.android.gms.internal.ads.zzakg r4) throws java.io.IOException;

    final int zze(com.google.android.gms.internal.ads.zzadc r22, com.google.android.gms.internal.ads.zzadx r23) throws java.io.IOException {
            r21 = this;
            r11 = r21
            r0 = r22
            com.google.android.gms.internal.ads.zzaeh r1 = r11.zzb
            com.google.android.gms.internal.ads.zzdi.zzb(r1)
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            int r1 = r11.zzh
            r2 = 3
            r3 = -1
            r5 = -1
            r12 = 2
            r13 = 0
            r6 = 1
            if (r1 == 0) goto La9
            if (r1 == r6) goto La0
            if (r1 == r12) goto L1c
            goto L12f
        L1c:
            com.google.android.gms.internal.ads.zzake r1 = r11.zzd
            long r7 = r1.zzd(r0)
            r9 = 0
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 < 0) goto L2f
            r1 = r23
            r1.zza = r7
            r5 = 1
            goto L12f
        L2f:
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 >= 0) goto L3a
            r14 = 2
            long r7 = r7 + r14
            long r7 = -r7
            r11.zzi(r7)
        L3a:
            boolean r1 = r11.zzl
            if (r1 != 0) goto L4e
            com.google.android.gms.internal.ads.zzake r1 = r11.zzd
            com.google.android.gms.internal.ads.zzaea r1 = r1.zze()
            com.google.android.gms.internal.ads.zzdi.zzb(r1)
            com.google.android.gms.internal.ads.zzade r7 = r11.zzc
            r7.zzO(r1)
            r11.zzl = r6
        L4e:
            long r6 = r11.zzk
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 > 0) goto L61
            com.google.android.gms.internal.ads.zzakc r1 = r11.zza
            boolean r0 = r1.zze(r0)
            if (r0 == 0) goto L5d
            goto L61
        L5d:
            r11.zzh = r2
            goto L12f
        L61:
            r11.zzk = r9
            com.google.android.gms.internal.ads.zzakc r0 = r11.zza
            com.google.android.gms.internal.ads.zzek r0 = r0.zza()
            long r1 = r11.zza(r0)
            int r5 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r5 < 0) goto L99
            long r5 = r11.zzg
            long r7 = r5 + r1
            long r9 = r11.zze
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 < 0) goto L99
            long r15 = r11.zzf(r5)
            com.google.android.gms.internal.ads.zzaeh r5 = r11.zzb
            int r6 = r0.zze()
            r5.zzq(r0, r6)
            com.google.android.gms.internal.ads.zzaeh r14 = r11.zzb
            r17 = 1
            int r18 = r0.zze()
            r19 = 0
            r20 = 0
            r14.zzs(r15, r17, r18, r19, r20)
            r11.zze = r3
        L99:
            long r3 = r11.zzg
            long r3 = r3 + r1
            r11.zzg = r3
            goto L12e
        La0:
            long r1 = r11.zzf
            int r2 = (int) r1
            r0.zzk(r2)
            r11.zzh = r12
            return r13
        La9:
            com.google.android.gms.internal.ads.zzakc r1 = r11.zza
            boolean r1 = r1.zze(r0)
            if (r1 != 0) goto Lb5
            r11.zzh = r2
            goto L12f
        Lb5:
            long r7 = r22.zzf()
            long r9 = r11.zzf
            long r7 = r7 - r9
            r11.zzk = r7
            com.google.android.gms.internal.ads.zzakc r1 = r11.zza
            com.google.android.gms.internal.ads.zzek r1 = r1.zza()
            com.google.android.gms.internal.ads.zzakg r7 = r11.zzj
            boolean r1 = r11.zzc(r1, r9, r7)
            if (r1 == 0) goto Ld3
            long r7 = r22.zzf()
            r11.zzf = r7
            goto La9
        Ld3:
            com.google.android.gms.internal.ads.zzakg r1 = r11.zzj
            com.google.android.gms.internal.ads.zzaf r1 = r1.zza
            int r2 = r1.zzC
            r11.zzi = r2
            boolean r2 = r11.zzm
            if (r2 != 0) goto Le6
            com.google.android.gms.internal.ads.zzaeh r2 = r11.zzb
            r2.zzl(r1)
            r11.zzm = r6
        Le6:
            com.google.android.gms.internal.ads.zzakg r1 = r11.zzj
            com.google.android.gms.internal.ads.zzake r1 = r1.zzb
            if (r1 == 0) goto Lef
            r11.zzd = r1
            goto L127
        Lef:
            long r1 = r22.zzd()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L100
            com.google.android.gms.internal.ads.zzaki r0 = new com.google.android.gms.internal.ads.zzaki
            r1 = 0
            r0.<init>(r1)
            r11.zzd = r0
            goto L127
        L100:
            com.google.android.gms.internal.ads.zzakc r1 = r11.zza
            com.google.android.gms.internal.ads.zzakd r1 = r1.zzb()
            int r2 = r1.zza
            r2 = r2 & 4
            if (r2 == 0) goto L10e
            r10 = 1
            goto L10f
        L10e:
            r10 = 0
        L10f:
            com.google.android.gms.internal.ads.zzajy r14 = new com.google.android.gms.internal.ads.zzajy
            long r2 = r11.zzf
            long r4 = r22.zzd()
            int r0 = r1.zzd
            int r6 = r1.zze
            int r0 = r0 + r6
            long r8 = r1.zzb
            long r6 = (long) r0
            r0 = r14
            r1 = r21
            r0.<init>(r1, r2, r4, r6, r8, r10)
            r11.zzd = r14
        L127:
            r11.zzh = r12
            com.google.android.gms.internal.ads.zzakc r0 = r11.zza
            r0.zzd()
        L12e:
            r5 = 0
        L12f:
            return r5
    }

    protected final long zzf(long r5) {
            r4 = this;
            int r0 = r4.zzi
            long r0 = (long) r0
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 * r2
            long r5 = r5 / r0
            return r5
    }

    protected final long zzg(long r3) {
            r2 = this;
            int r0 = r2.zzi
            long r0 = (long) r0
            long r0 = r0 * r3
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r3
            return r0
    }

    final void zzh(com.google.android.gms.internal.ads.zzade r1, com.google.android.gms.internal.ads.zzaeh r2) {
            r0 = this;
            r0.zzc = r1
            r0.zzb = r2
            r1 = 1
            r0.zzb(r1)
            return
    }

    protected void zzi(long r1) {
            r0 = this;
            r0.zzg = r1
            return
    }

    final void zzj(long r4, long r6) {
            r3 = this;
            com.google.android.gms.internal.ads.zzakc r0 = r3.zza
            r0.zzc()
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            boolean r4 = r3.zzl
            r4 = r4 ^ 1
            r3.zzb(r4)
            return
        L13:
            int r4 = r3.zzh
            if (r4 == 0) goto L27
            long r4 = r3.zzg(r6)
            r3.zze = r4
            com.google.android.gms.internal.ads.zzake r6 = r3.zzd
            int r7 = com.google.android.gms.internal.ads.zzeu.zza
            r6.zzg(r4)
            r4 = 2
            r3.zzh = r4
        L27:
            return
    }
}
