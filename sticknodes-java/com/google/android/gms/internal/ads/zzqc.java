package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzqc {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private com.google.android.gms.internal.ads.zzdj zzI;
    private final com.google.android.gms.internal.ads.zzqb zza;
    private final long[] zzb;
    private android.media.AudioTrack zzc;
    private int zzd;
    private com.google.android.gms.internal.ads.zzqa zze;
    private int zzf;
    private boolean zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private java.lang.reflect.Method zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzqc(com.google.android.gms.internal.ads.zzqb r3) {
            r2 = this;
            r2.<init>()
            r2.zza = r3
            java.lang.Class<android.media.AudioTrack> r3 = android.media.AudioTrack.class
            java.lang.String r0 = "getLatency"
            r1 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L10
            r2.zzm = r3     // Catch: java.lang.NoSuchMethodException -> L10
        L10:
            r3 = 10
            long[] r3 = new long[r3]
            r2.zzb = r3
            com.google.android.gms.internal.ads.zzdj r3 = com.google.android.gms.internal.ads.zzdj.zza
            r2.zzI = r3
            return
    }

    private final long zzl() {
            r11 = this;
            com.google.android.gms.internal.ads.zzdj r0 = r11.zzI
            long r0 = r0.zzb()
            long r2 = r11.zzx
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 2
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L3d
            android.media.AudioTrack r2 = r11.zzc
            java.util.Objects.requireNonNull(r2)
            int r2 = r2.getPlayState()
            if (r2 != r6) goto L20
            long r0 = r11.zzz
            return r0
        L20:
            long r0 = com.google.android.gms.internal.ads.zzeu.zzr(r0)
            long r2 = r11.zzx
            long r0 = r0 - r2
            float r2 = r11.zzi
            long r0 = com.google.android.gms.internal.ads.zzeu.zzp(r0, r2)
            int r2 = r11.zzf
            long r0 = com.google.android.gms.internal.ads.zzeu.zzo(r0, r2)
            long r2 = r11.zzA
            long r4 = r11.zzz
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L3d:
            long r2 = r11.zzr
            long r2 = r0 - r2
            r7 = 5
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 < 0) goto La6
            android.media.AudioTrack r2 = r11.zzc
            java.util.Objects.requireNonNull(r2)
            int r3 = r2.getPlayState()
            r7 = 1
            if (r3 != r7) goto L54
            goto La4
        L54:
            int r2 = r2.getPlaybackHeadPosition()
            long r7 = (long) r2
            boolean r2 = r11.zzg
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            r9 = 0
            if (r2 == 0) goto L75
            if (r3 != r6) goto L70
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L71
            long r2 = r11.zzs
            r11.zzu = r2
            goto L71
        L70:
            r6 = r3
        L71:
            long r2 = r11.zzu
            long r7 = r7 + r2
            r3 = r6
        L75:
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            r6 = 29
            if (r2 > r6) goto L95
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L91
            long r6 = r11.zzs
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 <= 0) goto L92
            r2 = 3
            if (r3 != r2) goto L92
            long r2 = r11.zzy
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto La4
            r11.zzy = r0
            goto La4
        L91:
            r9 = r7
        L92:
            r11.zzy = r4
            r7 = r9
        L95:
            long r2 = r11.zzs
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 <= 0) goto La2
            long r2 = r11.zzt
            r4 = 1
            long r2 = r2 + r4
            r11.zzt = r2
        La2:
            r11.zzs = r7
        La4:
            r11.zzr = r0
        La6:
            long r0 = r11.zzs
            long r2 = r11.zzH
            long r0 = r0 + r2
            long r2 = r11.zzt
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
    }

    private final long zzm() {
            r3 = this;
            long r0 = r3.zzl()
            int r2 = r3.zzf
            long r0 = com.google.android.gms.internal.ads.zzeu.zzs(r0, r2)
            return r0
    }

    private final void zzn() {
            r3 = this;
            r0 = 0
            r3.zzk = r0
            r2 = 0
            r3.zzw = r2
            r3.zzv = r2
            r3.zzl = r0
            r3.zzC = r0
            r3.zzF = r0
            r3.zzj = r2
            return
    }

    public final long zza(boolean r24) {
            r23 = this;
            r0 = r23
            android.media.AudioTrack r1 = r0.zzc
            java.util.Objects.requireNonNull(r1)
            int r1 = r1.getPlayState()
            r2 = 3
            r3 = 1
            r4 = 0
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r1 != r2) goto L104
            com.google.android.gms.internal.ads.zzdj r1 = r0.zzI
            long r1 = r1.zzc()
            long r1 = r1 / r6
            long r8 = r0.zzl
            long r8 = r1 - r8
            r10 = 30000(0x7530, double:1.4822E-319)
            r15 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 < 0) goto L64
            long r8 = r23.zzm()
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 != 0) goto L2f
            goto L104
        L2f:
            long[] r10 = r0.zzb
            int r11 = r0.zzv
            float r12 = r0.zzi
            long r8 = com.google.android.gms.internal.ads.zzeu.zzq(r8, r12)
            long r8 = r8 - r1
            r10[r11] = r8
            int r8 = r0.zzv
            int r8 = r8 + r3
            r9 = 10
            int r8 = r8 % r9
            r0.zzv = r8
            int r8 = r0.zzw
            if (r8 >= r9) goto L4b
            int r8 = r8 + r3
            r0.zzw = r8
        L4b:
            r0.zzl = r1
            r0.zzk = r4
            r8 = 0
        L50:
            int r9 = r0.zzw
            if (r8 >= r9) goto L64
            long r10 = r0.zzk
            long[] r12 = r0.zzb
            long r13 = (long) r9
            r16 = r12[r8]
            long r16 = r16 / r13
            long r10 = r10 + r16
            r0.zzk = r10
            int r8 = r8 + 1
            goto L50
        L64:
            boolean r8 = r0.zzg
            if (r8 != 0) goto L104
            com.google.android.gms.internal.ads.zzqa r13 = r0.zze
            java.util.Objects.requireNonNull(r13)
            boolean r8 = r13.zzg(r1)
            r17 = 5000000(0x4c4b40, double:2.470328E-317)
            if (r8 != 0) goto L78
            r3 = 0
            goto Lbf
        L78:
            long r11 = r13.zzb()
            long r9 = r13.zza()
            long r19 = r23.zzm()
            long r21 = r11 - r1
            long r21 = java.lang.Math.abs(r21)
            int r8 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r8 <= 0) goto L9d
            com.google.android.gms.internal.ads.zzqb r8 = r0.zza
            r21 = r13
            r13 = r1
            r3 = 0
            r15 = r19
            r8.zzd(r9, r11, r13, r15)
            r21.zzd()
            goto Lbf
        L9d:
            r21 = r13
            r3 = 0
            int r8 = r0.zzf
            long r13 = com.google.android.gms.internal.ads.zzeu.zzs(r9, r8)
            long r13 = r13 - r19
            long r13 = java.lang.Math.abs(r13)
            int r8 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r8 <= 0) goto Lbc
            com.google.android.gms.internal.ads.zzqb r8 = r0.zza
            r13 = r1
            r15 = r19
            r8.zzc(r9, r11, r13, r15)
            r21.zzd()
            goto Lbf
        Lbc:
            r21.zzc()
        Lbf:
            boolean r8 = r0.zzp
            if (r8 == 0) goto L104
            java.lang.reflect.Method r8 = r0.zzm
            if (r8 == 0) goto L104
            long r9 = r0.zzq
            long r9 = r1 - r9
            r11 = 500000(0x7a120, double:2.47033E-318)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L104
            android.media.AudioTrack r9 = r0.zzc     // Catch: java.lang.Exception -> Lff
            java.util.Objects.requireNonNull(r9)
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> Lff
            java.lang.Object r3 = r8.invoke(r9, r3)     // Catch: java.lang.Exception -> Lff
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> Lff
            int r8 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Exception -> Lff
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> Lff
            long r8 = (long) r3     // Catch: java.lang.Exception -> Lff
            long r8 = r8 * r6
            long r10 = r0.zzh     // Catch: java.lang.Exception -> Lff
            long r8 = r8 - r10
            r0.zzn = r8     // Catch: java.lang.Exception -> Lff
            long r8 = java.lang.Math.max(r8, r4)     // Catch: java.lang.Exception -> Lff
            r0.zzn = r8     // Catch: java.lang.Exception -> Lff
            int r3 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r3 <= 0) goto L102
            com.google.android.gms.internal.ads.zzqb r3 = r0.zza     // Catch: java.lang.Exception -> Lff
            r3.zza(r8)     // Catch: java.lang.Exception -> Lff
            r0.zzn = r4     // Catch: java.lang.Exception -> Lff
            goto L102
        Lff:
            r3 = 0
            r0.zzm = r3
        L102:
            r0.zzq = r1
        L104:
            com.google.android.gms.internal.ads.zzdj r1 = r0.zzI
            long r1 = r1.zzc()
            long r1 = r1 / r6
            com.google.android.gms.internal.ads.zzqa r3 = r0.zze
            java.util.Objects.requireNonNull(r3)
            boolean r8 = r3.zzf()
            if (r8 == 0) goto L12e
            long r4 = r3.zza()
            int r9 = r0.zzf
            long r4 = com.google.android.gms.internal.ads.zzeu.zzs(r4, r9)
            long r9 = r3.zzb()
            long r9 = r1 - r9
            float r3 = r0.zzi
            long r9 = com.google.android.gms.internal.ads.zzeu.zzp(r9, r3)
            long r4 = r4 + r9
            goto L14b
        L12e:
            int r3 = r0.zzw
            if (r3 != 0) goto L137
            long r9 = r23.zzm()
            goto L140
        L137:
            long r9 = r0.zzk
            long r9 = r9 + r1
            float r3 = r0.zzi
            long r9 = com.google.android.gms.internal.ads.zzeu.zzp(r9, r3)
        L140:
            if (r24 != 0) goto L14a
            long r11 = r0.zzn
            long r9 = r9 - r11
            long r4 = java.lang.Math.max(r4, r9)
            goto L14b
        L14a:
            r4 = r9
        L14b:
            boolean r3 = r0.zzD
            if (r3 == r8) goto L157
            long r9 = r0.zzC
            r0.zzF = r9
            long r9 = r0.zzB
            r0.zzE = r9
        L157:
            long r9 = r0.zzF
            long r9 = r1 - r9
            r11 = 1000000(0xf4240, double:4.940656E-318)
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 >= 0) goto L176
            long r13 = r0.zzE
            float r3 = r0.zzi
            long r15 = com.google.android.gms.internal.ads.zzeu.zzp(r9, r3)
            long r13 = r13 + r15
            long r9 = r9 * r6
            long r9 = r9 / r11
            long r4 = r4 * r9
            long r9 = r6 - r9
            long r9 = r9 * r13
            long r4 = r4 + r9
            long r4 = r4 / r6
        L176:
            boolean r3 = r0.zzj
            if (r3 != 0) goto L1a1
            long r6 = r0.zzB
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L1a1
            r3 = 1
            r0.zzj = r3
            long r6 = r4 - r6
            int r3 = com.google.android.gms.internal.ads.zzeu.zza
            float r3 = r0.zzi
            long r6 = com.google.android.gms.internal.ads.zzeu.zzu(r6)
            long r6 = com.google.android.gms.internal.ads.zzeu.zzq(r6, r3)
            com.google.android.gms.internal.ads.zzdj r3 = r0.zzI
            long r9 = r3.zza()
            long r6 = com.google.android.gms.internal.ads.zzeu.zzu(r6)
            long r9 = r9 - r6
            com.google.android.gms.internal.ads.zzqb r3 = r0.zza
            r3.zzb(r9)
        L1a1:
            r0.zzC = r1
            r0.zzB = r4
            r0.zzD = r8
            return r4
    }

    public final void zzb(long r3) {
            r2 = this;
            long r0 = r2.zzl()
            r2.zzz = r0
            com.google.android.gms.internal.ads.zzdj r0 = r2.zzI
            long r0 = r0.zzb()
            long r0 = com.google.android.gms.internal.ads.zzeu.zzr(r0)
            r2.zzx = r0
            r2.zzA = r3
            return
    }

    public final void zzc() {
            r1 = this;
            r1.zzn()
            r0 = 0
            r1.zzc = r0
            r1.zze = r0
            return
    }

    public final void zzd(android.media.AudioTrack r4, boolean r5, int r6, int r7, int r8) {
            r3 = this;
            r3.zzc = r4
            r3.zzd = r8
            com.google.android.gms.internal.ads.zzqa r0 = new com.google.android.gms.internal.ads.zzqa
            r0.<init>(r4)
            r3.zze = r0
            int r4 = r4.getSampleRate()
            r3.zzf = r4
            r4 = 6
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L23
            int r5 = com.google.android.gms.internal.ads.zzeu.zza
            r2 = 23
            if (r5 >= r2) goto L23
            r5 = 5
            if (r6 == r5) goto L24
            if (r6 != r4) goto L23
            r6 = 6
            goto L24
        L23:
            r0 = 0
        L24:
            r3.zzg = r0
            boolean r4 = com.google.android.gms.internal.ads.zzeu.zzI(r6)
            r3.zzp = r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r8 = r8 / r7
            long r7 = (long) r8
            int r4 = r3.zzf
            long r7 = com.google.android.gms.internal.ads.zzeu.zzs(r7, r4)
            goto L3d
        L3c:
            r7 = r5
        L3d:
            r3.zzh = r7
            r7 = 0
            r3.zzs = r7
            r3.zzt = r7
            r3.zzG = r1
            r3.zzH = r7
            r3.zzu = r7
            r3.zzo = r1
            r3.zzx = r5
            r3.zzy = r5
            r3.zzq = r7
            r3.zzn = r7
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.zzi = r4
            return
    }

    public final void zze(com.google.android.gms.internal.ads.zzdj r1) {
            r0 = this;
            r0.zzI = r1
            return
    }

    public final void zzf() {
            r5 = this;
            long r0 = r5.zzx
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L17
            com.google.android.gms.internal.ads.zzdj r0 = r5.zzI
            long r0 = r0.zzb()
            long r0 = com.google.android.gms.internal.ads.zzeu.zzr(r0)
            r5.zzx = r0
        L17:
            com.google.android.gms.internal.ads.zzqa r0 = r5.zze
            java.util.Objects.requireNonNull(r0)
            r0.zze()
            return
    }

    public final boolean zzg(long r5) {
            r4 = this;
            r0 = 0
            long r1 = r4.zza(r0)
            int r3 = r4.zzf
            long r1 = com.google.android.gms.internal.ads.zzeu.zzo(r1, r3)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 > 0) goto L2b
            boolean r5 = r4.zzg
            if (r5 == 0) goto L2a
            android.media.AudioTrack r5 = r4.zzc
            java.util.Objects.requireNonNull(r5)
            int r5 = r5.getPlayState()
            r6 = 2
            if (r5 != r6) goto L2a
            long r5 = r4.zzl()
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto L2a
            goto L2b
        L2a:
            return r0
        L2b:
            r5 = 1
            return r5
    }

    public final boolean zzh() {
            r2 = this;
            android.media.AudioTrack r0 = r2.zzc
            java.util.Objects.requireNonNull(r0)
            int r0 = r0.getPlayState()
            r1 = 3
            if (r0 != r1) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public final boolean zzi(long r6) {
            r5 = this;
            long r0 = r5.zzy
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L22
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L22
            com.google.android.gms.internal.ads.zzdj r6 = r5.zzI
            long r6 = r6.zzb()
            long r0 = r5.zzy
            long r6 = r6 - r0
            r0 = 200(0xc8, double:9.9E-322)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L22
            r6 = 1
            return r6
        L22:
            r6 = 0
            return r6
    }

    public final boolean zzj(long r8) {
            r7 = this;
            android.media.AudioTrack r0 = r7.zzc
            java.util.Objects.requireNonNull(r0)
            int r0 = r0.getPlayState()
            boolean r1 = r7.zzg
            r2 = 1
            if (r1 == 0) goto L24
            r1 = 2
            r3 = 0
            if (r0 != r1) goto L15
            r7.zzo = r3
            return r3
        L15:
            if (r0 != r2) goto L24
            long r0 = r7.zzl()
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            return r3
        L24:
            boolean r1 = r7.zzo
            boolean r8 = r7.zzg(r8)
            r7.zzo = r8
            if (r1 == 0) goto L3f
            if (r8 != 0) goto L3f
            if (r0 == r2) goto L3f
            com.google.android.gms.internal.ads.zzqb r8 = r7.zza
            int r9 = r7.zzd
            long r0 = r7.zzh
            long r0 = com.google.android.gms.internal.ads.zzeu.zzu(r0)
            r8.zze(r9, r0)
        L3f:
            return r2
    }

    public final boolean zzk() {
            r5 = this;
            r5.zzn()
            long r0 = r5.zzx
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L18
            com.google.android.gms.internal.ads.zzqa r0 = r5.zze
            java.util.Objects.requireNonNull(r0)
            r0.zze()
            r0 = 1
            return r0
        L18:
            long r0 = r5.zzl()
            r5.zzz = r0
            r0 = 0
            return r0
    }
}
