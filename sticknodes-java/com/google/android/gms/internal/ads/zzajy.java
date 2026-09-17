package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzajy implements com.google.android.gms.internal.ads.zzake {
    private final com.google.android.gms.internal.ads.zzakd zza;
    private final long zzb;
    private final long zzc;
    private final com.google.android.gms.internal.ads.zzakj zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzajy(com.google.android.gms.internal.ads.zzakj r5, long r6, long r8, long r10, long r12, boolean r14) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 < 0) goto L10
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 <= 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            com.google.android.gms.internal.ads.zzdi.zzd(r1)
            r4.zzd = r5
            r4.zzb = r6
            r4.zzc = r8
            long r8 = r8 - r6
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 == 0) goto L25
            if (r14 == 0) goto L22
            goto L25
        L22:
            r4.zze = r0
            goto L2a
        L25:
            r4.zzf = r12
            r5 = 4
            r4.zze = r5
        L2a:
            com.google.android.gms.internal.ads.zzakd r5 = new com.google.android.gms.internal.ads.zzakd
            r5.<init>()
            r4.zza = r5
            return
    }

    static /* bridge */ /* synthetic */ long zza(com.google.android.gms.internal.ads.zzajy r2) {
            long r0 = r2.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ long zzb(com.google.android.gms.internal.ads.zzajy r2) {
            long r0 = r2.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ long zzc(com.google.android.gms.internal.ads.zzajy r2) {
            long r0 = r2.zzf
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzakj zzf(com.google.android.gms.internal.ads.zzajy r0) {
            com.google.android.gms.internal.ads.zzakj r0 = r0.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzake
    public final long zzd(com.google.android.gms.internal.ads.zzadc r23) throws java.io.IOException {
            r22 = this;
            r0 = r22
            r1 = r23
            int r2 = r0.zze
            r3 = 0
            r4 = 1
            r5 = 4
            r6 = -1
            if (r2 == 0) goto Le6
            if (r2 == r4) goto Lf9
            r4 = 2
            r10 = 3
            if (r2 == r4) goto L16
            if (r2 == r10) goto Lae
            return r6
        L16:
            long r11 = r0.zzi
            long r13 = r0.zzj
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 != 0) goto L21
        L1e:
            r13 = r6
            goto La6
        L21:
            long r11 = r23.zzf()
            com.google.android.gms.internal.ads.zzakd r2 = r0.zza
            boolean r2 = r2.zzc(r1, r13)
            if (r2 != 0) goto L3d
            long r13 = r0.zzi
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 == 0) goto L35
            goto La6
        L35:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L3d:
            com.google.android.gms.internal.ads.zzakd r2 = r0.zza
            r2.zzb(r1, r3)
            r23.zzj()
            long r13 = r0.zzh
            com.google.android.gms.internal.ads.zzakd r2 = r0.zza
            long r8 = r2.zzb
            long r13 = r13 - r8
            int r4 = r2.zzd
            int r2 = r2.zze
            int r4 = r4 + r2
            r15 = 0
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 < 0) goto L5f
            r15 = 72000(0x11940, double:3.55727E-319)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L5f
            goto L1e
        L5f:
            if (r2 >= 0) goto L66
            r0.zzj = r11
            r0.zzl = r8
            goto L70
        L66:
            long r11 = (long) r4
            long r15 = r23.zzf()
            long r11 = r11 + r15
            r0.zzi = r11
            r0.zzk = r8
        L70:
            long r8 = r0.zzj
            long r11 = r0.zzi
            long r15 = r8 - r11
            r17 = 100000(0x186a0, double:4.94066E-319)
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 >= 0) goto L81
            r0.zzj = r11
            r13 = r11
            goto La6
        L81:
            long r3 = (long) r4
            if (r2 > 0) goto L87
            r18 = 2
            goto L89
        L87:
            r18 = 1
        L89:
            long r20 = r23.zzf()
            long r3 = r3 * r18
            long r20 = r20 - r3
            long r13 = r13 * r15
            long r2 = r0.zzl
            r15 = r11
            long r10 = r0.zzk
            long r2 = r2 - r10
            long r13 = r13 / r2
            long r2 = r20 + r13
            long r8 = r8 + r6
            long r2 = java.lang.Math.min(r2, r8)
            r8 = r15
            long r13 = java.lang.Math.max(r8, r2)
        La6:
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 == 0) goto Lab
            return r13
        Lab:
            r2 = 3
            r0.zze = r2
        Lae:
            com.google.android.gms.internal.ads.zzakd r2 = r0.zza
            r2.zzc(r1, r6)
            com.google.android.gms.internal.ads.zzakd r2 = r0.zza
            r3 = 0
            r2.zzb(r1, r3)
            com.google.android.gms.internal.ads.zzakd r2 = r0.zza
            long r3 = r2.zzb
            long r8 = r0.zzh
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 <= 0) goto Lcf
            r23.zzj()
            r0.zze = r5
            long r1 = r0.zzk
            r8 = 2
            long r1 = r1 + r8
            long r1 = -r1
            return r1
        Lcf:
            r8 = 2
            int r3 = r2.zzd
            int r2 = r2.zze
            int r3 = r3 + r2
            r1.zzk(r3)
            long r2 = r23.zzf()
            r0.zzi = r2
            com.google.android.gms.internal.ads.zzakd r2 = r0.zza
            long r2 = r2.zzb
            r0.zzk = r2
            goto Lae
        Le6:
            long r2 = r23.zzf()
            r0.zzg = r2
            r0.zze = r4
            long r8 = r0.zzc
            r10 = -65307(0xffffffffffff00e5, double:NaN)
            long r8 = r8 + r10
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 <= 0) goto Lf9
            return r8
        Lf9:
            com.google.android.gms.internal.ads.zzakd r2 = r0.zza
            r2.zza()
            com.google.android.gms.internal.ads.zzakd r2 = r0.zza
            boolean r2 = r2.zzc(r1, r6)
            if (r2 == 0) goto L153
            com.google.android.gms.internal.ads.zzakd r2 = r0.zza
            r3 = 0
            r2.zzb(r1, r3)
            com.google.android.gms.internal.ads.zzakd r2 = r0.zza
            int r3 = r2.zzd
            int r2 = r2.zze
            int r3 = r3 + r2
            r1.zzk(r3)
            com.google.android.gms.internal.ads.zzakd r2 = r0.zza
            long r2 = r2.zzb
        L11a:
            com.google.android.gms.internal.ads.zzakd r8 = r0.zza
            int r9 = r8.zza
            r9 = r9 & r5
            if (r9 == r5) goto L14c
            boolean r8 = r8.zzc(r1, r6)
            if (r8 == 0) goto L14c
            long r8 = r23.zzf()
            long r10 = r0.zzc
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L14c
            com.google.android.gms.internal.ads.zzakd r8 = r0.zza
            boolean r8 = r8.zzb(r1, r4)
            if (r8 == 0) goto L14c
            com.google.android.gms.internal.ads.zzakd r8 = r0.zza
            int r9 = r8.zzd
            int r8 = r8.zze
            int r9 = r9 + r8
            boolean r8 = com.google.android.gms.internal.ads.zzadf.zze(r1, r9)
            if (r8 != 0) goto L147
            goto L14c
        L147:
            com.google.android.gms.internal.ads.zzakd r2 = r0.zza
            long r2 = r2.zzb
            goto L11a
        L14c:
            r0.zzf = r2
            r0.zze = r5
            long r1 = r0.zzg
            return r1
        L153:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzake
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzaea zze() {
            r6 = this;
            long r0 = r6.zzf
            r2 = 0
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto Lf
            com.google.android.gms.internal.ads.zzajx r0 = new com.google.android.gms.internal.ads.zzajx
            r0.<init>(r6, r2)
            return r0
        Lf:
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzake
    public final void zzg(long r5) {
            r4 = this;
            long r0 = r4.zzf
            r2 = -1
            long r0 = r0 + r2
            long r5 = java.lang.Math.min(r5, r0)
            r0 = 0
            long r5 = java.lang.Math.max(r0, r5)
            r4.zzh = r5
            r5 = 2
            r4.zze = r5
            long r5 = r4.zzb
            r4.zzi = r5
            long r5 = r4.zzc
            r4.zzj = r5
            r4.zzk = r0
            long r5 = r4.zzf
            r4.zzl = r5
            return
    }
}
