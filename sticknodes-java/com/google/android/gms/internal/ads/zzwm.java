package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzwm implements com.google.android.gms.internal.ads.zzaeh {
    private boolean zzA;
    private com.google.android.gms.internal.ads.zzrw zzB;
    private final com.google.android.gms.internal.ads.zzwg zza;
    private final com.google.android.gms.internal.ads.zzwi zzb;
    private final com.google.android.gms.internal.ads.zzwt zzc;
    private final com.google.android.gms.internal.ads.zzrv zzd;
    private final com.google.android.gms.internal.ads.zzrq zze;
    private com.google.android.gms.internal.ads.zzwl zzf;
    private com.google.android.gms.internal.ads.zzaf zzg;
    private int zzh;
    private long[] zzi;
    private long[] zzj;
    private int[] zzk;
    private int[] zzl;
    private long[] zzm;
    private com.google.android.gms.internal.ads.zzaeg[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private com.google.android.gms.internal.ads.zzaf zzy;
    private boolean zzz;

    protected zzwm(com.google.android.gms.internal.ads.zzza r1, com.google.android.gms.internal.ads.zzrv r2, com.google.android.gms.internal.ads.zzrq r3) {
            r0 = this;
            r0.<init>()
            r0.zzd = r2
            r0.zze = r3
            com.google.android.gms.internal.ads.zzwg r2 = new com.google.android.gms.internal.ads.zzwg
            r2.<init>(r1)
            r0.zza = r2
            com.google.android.gms.internal.ads.zzwi r1 = new com.google.android.gms.internal.ads.zzwi
            r1.<init>()
            r0.zzb = r1
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.zzh = r1
            long[] r2 = new long[r1]
            r0.zzi = r2
            long[] r2 = new long[r1]
            r0.zzj = r2
            long[] r2 = new long[r1]
            r0.zzm = r2
            int[] r2 = new int[r1]
            r0.zzl = r2
            int[] r2 = new int[r1]
            r0.zzk = r2
            com.google.android.gms.internal.ads.zzaeg[] r1 = new com.google.android.gms.internal.ads.zzaeg[r1]
            r0.zzn = r1
            com.google.android.gms.internal.ads.zzwt r1 = new com.google.android.gms.internal.ads.zzwt
            com.google.android.gms.internal.ads.zzwh r2 = new com.google.android.gms.internal.ads.zzwh
            r2.<init>()
            r1.<init>(r2)
            r0.zzc = r1
            r1 = -9223372036854775808
            r0.zzs = r1
            r0.zzt = r1
            r0.zzu = r1
            r1 = 1
            r0.zzx = r1
            r0.zzw = r1
            r0.zzz = r1
            return
    }

    private final int zzA(int r7, int r8, long r9, boolean r11) {
            r6 = this;
            r0 = 0
            r1 = -1
            r2 = 0
        L3:
            if (r2 >= r8) goto L25
            long[] r3 = r6.zzm
            r4 = r3[r7]
            int r3 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r3 > 0) goto L25
            if (r11 == 0) goto L17
            int[] r4 = r6.zzl
            r4 = r4[r7]
            r4 = r4 & 1
            if (r4 == 0) goto L1b
        L17:
            r1 = r2
            if (r3 != 0) goto L1b
            goto L25
        L1b:
            int r7 = r7 + 1
            int r3 = r6.zzh
            if (r7 != r3) goto L22
            r7 = 0
        L22:
            int r2 = r2 + 1
            goto L3
        L25:
            return r1
    }

    private final int zzB(int r2) {
            r1 = this;
            int r0 = r1.zzq
            int r0 = r0 + r2
            int r2 = r1.zzh
            if (r0 >= r2) goto L8
            return r0
        L8:
            int r0 = r0 - r2
            return r0
    }

    private final synchronized int zzC(com.google.android.gms.internal.ads.zzkm r7, com.google.android.gms.internal.ads.zzhq r8, boolean r9, boolean r10, com.google.android.gms.internal.ads.zzwi r11) {
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            r8.zzd = r0     // Catch: java.lang.Throwable -> L8f
            boolean r0 = r6.zzK()     // Catch: java.lang.Throwable -> L8f
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L2f
            if (r10 != 0) goto L25
            boolean r10 = r6.zzv     // Catch: java.lang.Throwable -> L8f
            if (r10 == 0) goto L14
            goto L25
        L14:
            com.google.android.gms.internal.ads.zzaf r8 = r6.zzy     // Catch: java.lang.Throwable -> L8f
            if (r8 == 0) goto L23
            if (r9 != 0) goto L1e
            com.google.android.gms.internal.ads.zzaf r9 = r6.zzg     // Catch: java.lang.Throwable -> L8f
            if (r8 == r9) goto L23
        L1e:
            r6.zzH(r8, r7)     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r6)
            return r1
        L23:
            monitor-exit(r6)
            return r2
        L25:
            r7 = 4
            r8.zzc(r7)     // Catch: java.lang.Throwable -> L8f
            r9 = -9223372036854775808
            r8.zze = r9     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r6)
            return r3
        L2f:
            com.google.android.gms.internal.ads.zzwt r0 = r6.zzc     // Catch: java.lang.Throwable -> L8f
            int r4 = r6.zzp     // Catch: java.lang.Throwable -> L8f
            int r5 = r6.zzr     // Catch: java.lang.Throwable -> L8f
            int r4 = r4 + r5
            java.lang.Object r0 = r0.zza(r4)     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.internal.ads.zzwk r0 = (com.google.android.gms.internal.ads.zzwk) r0     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.internal.ads.zzaf r0 = r0.zza     // Catch: java.lang.Throwable -> L8f
            if (r9 != 0) goto L8a
            com.google.android.gms.internal.ads.zzaf r9 = r6.zzg     // Catch: java.lang.Throwable -> L8f
            if (r0 == r9) goto L45
            goto L8a
        L45:
            int r7 = r6.zzr     // Catch: java.lang.Throwable -> L8f
            int r7 = r6.zzB(r7)     // Catch: java.lang.Throwable -> L8f
            boolean r9 = r6.zzL(r7)     // Catch: java.lang.Throwable -> L8f
            if (r9 != 0) goto L56
            r7 = 1
            r8.zzd = r7     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r6)
            return r2
        L56:
            int[] r9 = r6.zzl     // Catch: java.lang.Throwable -> L8f
            r9 = r9[r7]     // Catch: java.lang.Throwable -> L8f
            r8.zzc(r9)     // Catch: java.lang.Throwable -> L8f
            int r9 = r6.zzr     // Catch: java.lang.Throwable -> L8f
            int r0 = r6.zzo     // Catch: java.lang.Throwable -> L8f
            int r0 = r0 + (-1)
            if (r9 != r0) goto L70
            if (r10 != 0) goto L6b
            boolean r9 = r6.zzv     // Catch: java.lang.Throwable -> L8f
            if (r9 == 0) goto L70
        L6b:
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            r8.zza(r9)     // Catch: java.lang.Throwable -> L8f
        L70:
            long[] r9 = r6.zzm     // Catch: java.lang.Throwable -> L8f
            r0 = r9[r7]     // Catch: java.lang.Throwable -> L8f
            r8.zze = r0     // Catch: java.lang.Throwable -> L8f
            int[] r8 = r6.zzk     // Catch: java.lang.Throwable -> L8f
            r8 = r8[r7]     // Catch: java.lang.Throwable -> L8f
            r11.zza = r8     // Catch: java.lang.Throwable -> L8f
            long[] r8 = r6.zzj     // Catch: java.lang.Throwable -> L8f
            r9 = r8[r7]     // Catch: java.lang.Throwable -> L8f
            r11.zzb = r9     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.internal.ads.zzaeg[] r8 = r6.zzn     // Catch: java.lang.Throwable -> L8f
            r7 = r8[r7]     // Catch: java.lang.Throwable -> L8f
            r11.zzc = r7     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r6)
            return r3
        L8a:
            r6.zzH(r0, r7)     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r6)
            return r1
        L8f:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    private final synchronized long zzD(long r8, boolean r10, boolean r11) {
            r7 = this;
            monitor-enter(r7)
            int r10 = r7.zzo     // Catch: java.lang.Throwable -> L2d
            if (r10 == 0) goto L29
            long[] r0 = r7.zzm     // Catch: java.lang.Throwable -> L2d
            int r2 = r7.zzq     // Catch: java.lang.Throwable -> L2d
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L2d
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L10
            goto L29
        L10:
            if (r11 == 0) goto L18
            int r11 = r7.zzr     // Catch: java.lang.Throwable -> L2d
            if (r11 == r10) goto L18
            int r10 = r11 + 1
        L18:
            r3 = r10
            r6 = 0
            r1 = r7
            r4 = r8
            int r8 = r1.zzA(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L2d
            r9 = -1
            if (r8 == r9) goto L29
            long r8 = r7.zzF(r8)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r7)
            return r8
        L29:
            r8 = -1
            monitor-exit(r7)
            return r8
        L2d:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    private final synchronized long zzE() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.zzo     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L9
            r0 = -1
            monitor-exit(r2)
            return r0
        L9:
            long r0 = r2.zzF(r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    private final long zzF(int r12) {
            r11 = this;
            long r0 = r11.zzt
            r2 = -9223372036854775808
            r4 = 0
            r5 = -1
            if (r12 != 0) goto L9
            goto L2d
        L9:
            int r6 = r12 + (-1)
            int r6 = r11.zzB(r6)
            r7 = 0
        L10:
            if (r7 >= r12) goto L2d
            long[] r8 = r11.zzm
            r9 = r8[r6]
            long r2 = java.lang.Math.max(r2, r9)
            int[] r8 = r11.zzl
            r8 = r8[r6]
            r8 = r8 & 1
            if (r8 == 0) goto L23
            goto L2d
        L23:
            int r6 = r6 + (-1)
            if (r6 != r5) goto L2a
            int r6 = r11.zzh
            int r6 = r6 + r5
        L2a:
            int r7 = r7 + 1
            goto L10
        L2d:
            long r0 = java.lang.Math.max(r0, r2)
            r11.zzt = r0
            int r0 = r11.zzo
            int r0 = r0 - r12
            r11.zzo = r0
            int r0 = r11.zzp
            int r0 = r0 + r12
            r11.zzp = r0
            int r1 = r11.zzq
            int r1 = r1 + r12
            r11.zzq = r1
            int r2 = r11.zzh
            if (r1 < r2) goto L49
            int r1 = r1 - r2
            r11.zzq = r1
        L49:
            int r1 = r11.zzr
            int r1 = r1 - r12
            r11.zzr = r1
            if (r1 >= 0) goto L52
            r11.zzr = r4
        L52:
            com.google.android.gms.internal.ads.zzwt r12 = r11.zzc
            r12.zze(r0)
            int r12 = r11.zzo
            if (r12 != 0) goto L6d
            int r12 = r11.zzq
            if (r12 != 0) goto L61
            int r12 = r11.zzh
        L61:
            int r12 = r12 + r5
            long[] r0 = r11.zzj
            r1 = r0[r12]
            int[] r0 = r11.zzk
            r12 = r0[r12]
            long r3 = (long) r12
            long r1 = r1 + r3
            return r1
        L6d:
            long[] r12 = r11.zzj
            int r0 = r11.zzq
            r0 = r12[r0]
            return r0
    }

    private final synchronized void zzG(long r9, int r11, long r12, int r14, com.google.android.gms.internal.ads.zzaeg r15) {
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.zzo     // Catch: java.lang.Throwable -> L100
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L21
            int r0 = r0 + (-1)
            int r0 = r8.zzB(r0)     // Catch: java.lang.Throwable -> L100
            long[] r3 = r8.zzj     // Catch: java.lang.Throwable -> L100
            r4 = r3[r0]     // Catch: java.lang.Throwable -> L100
            int[] r3 = r8.zzk     // Catch: java.lang.Throwable -> L100
            r0 = r3[r0]     // Catch: java.lang.Throwable -> L100
            long r6 = (long) r0     // Catch: java.lang.Throwable -> L100
            long r4 = r4 + r6
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)     // Catch: java.lang.Throwable -> L100
        L21:
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r11
            if (r0 == 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            r8.zzv = r0     // Catch: java.lang.Throwable -> L100
            long r3 = r8.zzu     // Catch: java.lang.Throwable -> L100
            long r3 = java.lang.Math.max(r3, r9)     // Catch: java.lang.Throwable -> L100
            r8.zzu = r3     // Catch: java.lang.Throwable -> L100
            int r0 = r8.zzo     // Catch: java.lang.Throwable -> L100
            int r0 = r8.zzB(r0)     // Catch: java.lang.Throwable -> L100
            long[] r3 = r8.zzm     // Catch: java.lang.Throwable -> L100
            r3[r0] = r9     // Catch: java.lang.Throwable -> L100
            long[] r9 = r8.zzj     // Catch: java.lang.Throwable -> L100
            r9[r0] = r12     // Catch: java.lang.Throwable -> L100
            int[] r9 = r8.zzk     // Catch: java.lang.Throwable -> L100
            r9[r0] = r14     // Catch: java.lang.Throwable -> L100
            int[] r9 = r8.zzl     // Catch: java.lang.Throwable -> L100
            r9[r0] = r11     // Catch: java.lang.Throwable -> L100
            com.google.android.gms.internal.ads.zzaeg[] r9 = r8.zzn     // Catch: java.lang.Throwable -> L100
            r9[r0] = r15     // Catch: java.lang.Throwable -> L100
            long[] r9 = r8.zzi     // Catch: java.lang.Throwable -> L100
            r10 = 0
            r9[r0] = r10     // Catch: java.lang.Throwable -> L100
            com.google.android.gms.internal.ads.zzwt r9 = r8.zzc     // Catch: java.lang.Throwable -> L100
            boolean r9 = r9.zzf()     // Catch: java.lang.Throwable -> L100
            if (r9 != 0) goto L6d
            com.google.android.gms.internal.ads.zzwt r9 = r8.zzc     // Catch: java.lang.Throwable -> L100
            java.lang.Object r9 = r9.zzb()     // Catch: java.lang.Throwable -> L100
            com.google.android.gms.internal.ads.zzwk r9 = (com.google.android.gms.internal.ads.zzwk) r9     // Catch: java.lang.Throwable -> L100
            com.google.android.gms.internal.ads.zzaf r9 = r9.zza     // Catch: java.lang.Throwable -> L100
            com.google.android.gms.internal.ads.zzaf r10 = r8.zzy     // Catch: java.lang.Throwable -> L100
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L100
            if (r9 != 0) goto L8a
        L6d:
            com.google.android.gms.internal.ads.zzaf r9 = r8.zzy     // Catch: java.lang.Throwable -> L100
            java.util.Objects.requireNonNull(r9)
            com.google.android.gms.internal.ads.zzrv r10 = r8.zzd     // Catch: java.lang.Throwable -> L100
            com.google.android.gms.internal.ads.zzrq r11 = r8.zze     // Catch: java.lang.Throwable -> L100
            com.google.android.gms.internal.ads.zzru r10 = r10.zzb(r11, r9)     // Catch: java.lang.Throwable -> L100
            com.google.android.gms.internal.ads.zzwt r11 = r8.zzc     // Catch: java.lang.Throwable -> L100
            int r12 = r8.zzp     // Catch: java.lang.Throwable -> L100
            int r13 = r8.zzo     // Catch: java.lang.Throwable -> L100
            int r12 = r12 + r13
            com.google.android.gms.internal.ads.zzwk r13 = new com.google.android.gms.internal.ads.zzwk     // Catch: java.lang.Throwable -> L100
            r14 = 0
            r13.<init>(r9, r10, r14)     // Catch: java.lang.Throwable -> L100
            r11.zzc(r12, r13)     // Catch: java.lang.Throwable -> L100
        L8a:
            int r9 = r8.zzo     // Catch: java.lang.Throwable -> L100
            int r9 = r9 + r1
            r8.zzo = r9     // Catch: java.lang.Throwable -> L100
            int r10 = r8.zzh     // Catch: java.lang.Throwable -> L100
            if (r9 != r10) goto Lfe
            int r9 = r10 + 1000
            long[] r11 = new long[r9]     // Catch: java.lang.Throwable -> L100
            long[] r12 = new long[r9]     // Catch: java.lang.Throwable -> L100
            long[] r13 = new long[r9]     // Catch: java.lang.Throwable -> L100
            int[] r14 = new int[r9]     // Catch: java.lang.Throwable -> L100
            int[] r15 = new int[r9]     // Catch: java.lang.Throwable -> L100
            com.google.android.gms.internal.ads.zzaeg[] r0 = new com.google.android.gms.internal.ads.zzaeg[r9]     // Catch: java.lang.Throwable -> L100
            int r1 = r8.zzq     // Catch: java.lang.Throwable -> L100
            int r10 = r10 - r1
            long[] r3 = r8.zzj     // Catch: java.lang.Throwable -> L100
            java.lang.System.arraycopy(r3, r1, r12, r2, r10)     // Catch: java.lang.Throwable -> L100
            long[] r1 = r8.zzm     // Catch: java.lang.Throwable -> L100
            int r3 = r8.zzq     // Catch: java.lang.Throwable -> L100
            java.lang.System.arraycopy(r1, r3, r13, r2, r10)     // Catch: java.lang.Throwable -> L100
            int[] r1 = r8.zzl     // Catch: java.lang.Throwable -> L100
            int r3 = r8.zzq     // Catch: java.lang.Throwable -> L100
            java.lang.System.arraycopy(r1, r3, r14, r2, r10)     // Catch: java.lang.Throwable -> L100
            int[] r1 = r8.zzk     // Catch: java.lang.Throwable -> L100
            int r3 = r8.zzq     // Catch: java.lang.Throwable -> L100
            java.lang.System.arraycopy(r1, r3, r15, r2, r10)     // Catch: java.lang.Throwable -> L100
            com.google.android.gms.internal.ads.zzaeg[] r1 = r8.zzn     // Catch: java.lang.Throwable -> L100
            int r3 = r8.zzq     // Catch: java.lang.Throwable -> L100
            java.lang.System.arraycopy(r1, r3, r0, r2, r10)     // Catch: java.lang.Throwable -> L100
            long[] r1 = r8.zzi     // Catch: java.lang.Throwable -> L100
            int r3 = r8.zzq     // Catch: java.lang.Throwable -> L100
            java.lang.System.arraycopy(r1, r3, r11, r2, r10)     // Catch: java.lang.Throwable -> L100
            int r1 = r8.zzq     // Catch: java.lang.Throwable -> L100
            long[] r3 = r8.zzj     // Catch: java.lang.Throwable -> L100
            java.lang.System.arraycopy(r3, r2, r12, r10, r1)     // Catch: java.lang.Throwable -> L100
            long[] r3 = r8.zzm     // Catch: java.lang.Throwable -> L100
            java.lang.System.arraycopy(r3, r2, r13, r10, r1)     // Catch: java.lang.Throwable -> L100
            int[] r3 = r8.zzl     // Catch: java.lang.Throwable -> L100
            java.lang.System.arraycopy(r3, r2, r14, r10, r1)     // Catch: java.lang.Throwable -> L100
            int[] r3 = r8.zzk     // Catch: java.lang.Throwable -> L100
            java.lang.System.arraycopy(r3, r2, r15, r10, r1)     // Catch: java.lang.Throwable -> L100
            com.google.android.gms.internal.ads.zzaeg[] r3 = r8.zzn     // Catch: java.lang.Throwable -> L100
            java.lang.System.arraycopy(r3, r2, r0, r10, r1)     // Catch: java.lang.Throwable -> L100
            long[] r3 = r8.zzi     // Catch: java.lang.Throwable -> L100
            java.lang.System.arraycopy(r3, r2, r11, r10, r1)     // Catch: java.lang.Throwable -> L100
            r8.zzj = r12     // Catch: java.lang.Throwable -> L100
            r8.zzm = r13     // Catch: java.lang.Throwable -> L100
            r8.zzl = r14     // Catch: java.lang.Throwable -> L100
            r8.zzk = r15     // Catch: java.lang.Throwable -> L100
            r8.zzn = r0     // Catch: java.lang.Throwable -> L100
            r8.zzi = r11     // Catch: java.lang.Throwable -> L100
            r8.zzq = r2     // Catch: java.lang.Throwable -> L100
            r8.zzh = r9     // Catch: java.lang.Throwable -> L100
            monitor-exit(r8)
            return
        Lfe:
            monitor-exit(r8)
            return
        L100:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    private final void zzH(com.google.android.gms.internal.ads.zzaf r5, com.google.android.gms.internal.ads.zzkm r6) {
            r4 = this;
            com.google.android.gms.internal.ads.zzaf r0 = r4.zzg
            if (r0 != 0) goto L6
            r1 = 0
            goto L8
        L6:
            com.google.android.gms.internal.ads.zzy r1 = r0.zzr
        L8:
            r4.zzg = r5
            com.google.android.gms.internal.ads.zzy r2 = r5.zzr
            com.google.android.gms.internal.ads.zzrv r3 = r4.zzd
            int r3 = r3.zza(r5)
            com.google.android.gms.internal.ads.zzaf r3 = r5.zzc(r3)
            r6.zza = r3
            com.google.android.gms.internal.ads.zzrw r3 = r4.zzB
            r6.zzb = r3
            if (r0 == 0) goto L25
            boolean r0 = java.util.Objects.equals(r1, r2)
            if (r0 == 0) goto L25
            return
        L25:
            com.google.android.gms.internal.ads.zzrv r0 = r4.zzd
            com.google.android.gms.internal.ads.zzrq r1 = r4.zze
            com.google.android.gms.internal.ads.zzrw r5 = r0.zzc(r1, r5)
            r4.zzB = r5
            r6.zzb = r5
            return
    }

    private final void zzI() {
            r1 = this;
            com.google.android.gms.internal.ads.zzrw r0 = r1.zzB
            if (r0 == 0) goto L9
            r0 = 0
            r1.zzB = r0
            r1.zzg = r0
        L9:
            return
    }

    private final synchronized void zzJ() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.zzr = r0     // Catch: java.lang.Throwable -> Lb
            com.google.android.gms.internal.ads.zzwg r0 = r1.zza     // Catch: java.lang.Throwable -> Lb
            r0.zzg()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    private final boolean zzK() {
            r2 = this;
            int r0 = r2.zzr
            int r1 = r2.zzo
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    private final boolean zzL(int r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzrw r0 = r2.zzB
            r1 = 0
            if (r0 == 0) goto L10
            int[] r0 = r2.zzl
            r3 = r0[r3]
            r0 = 1073741824(0x40000000, float:2.0)
            r3 = r3 & r0
            if (r3 == 0) goto Lf
            goto L11
        Lf:
            return r1
        L10:
            r1 = 1
        L11:
            return r1
    }

    private final synchronized boolean zzM(com.google.android.gms.internal.ads.zzaf r4) {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            r3.zzx = r0     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.internal.ads.zzaf r1 = r3.zzy     // Catch: java.lang.Throwable -> L49
            boolean r1 = java.util.Objects.equals(r4, r1)     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto Le
            monitor-exit(r3)
            return r0
        Le:
            com.google.android.gms.internal.ads.zzwt r1 = r3.zzc     // Catch: java.lang.Throwable -> L49
            boolean r1 = r1.zzf()     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L33
            com.google.android.gms.internal.ads.zzwt r1 = r3.zzc     // Catch: java.lang.Throwable -> L49
            java.lang.Object r1 = r1.zzb()     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.internal.ads.zzwk r1 = (com.google.android.gms.internal.ads.zzwk) r1     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.internal.ads.zzaf r1 = r1.zza     // Catch: java.lang.Throwable -> L49
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L33
            com.google.android.gms.internal.ads.zzwt r4 = r3.zzc     // Catch: java.lang.Throwable -> L49
            java.lang.Object r4 = r4.zzb()     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.internal.ads.zzwk r4 = (com.google.android.gms.internal.ads.zzwk) r4     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.internal.ads.zzaf r4 = r4.zza     // Catch: java.lang.Throwable -> L49
            r3.zzy = r4     // Catch: java.lang.Throwable -> L49
            goto L35
        L33:
            r3.zzy = r4     // Catch: java.lang.Throwable -> L49
        L35:
            boolean r4 = r3.zzz     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.internal.ads.zzaf r1 = r3.zzy     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r1.zzn     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = r1.zzj     // Catch: java.lang.Throwable -> L49
            boolean r1 = com.google.android.gms.internal.ads.zzbn.zzf(r2, r1)     // Catch: java.lang.Throwable -> L49
            r4 = r4 & r1
            r3.zzz = r4     // Catch: java.lang.Throwable -> L49
            r3.zzA = r0     // Catch: java.lang.Throwable -> L49
            r4 = 1
            monitor-exit(r3)
            return r4
        L49:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzp
            return r0
    }

    public final int zzb() {
            r2 = this;
            int r0 = r2.zzp
            int r1 = r2.zzr
            int r0 = r0 + r1
            return r0
    }

    public final synchronized int zzc(long r9, boolean r11) {
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.zzr     // Catch: java.lang.Throwable -> L38
            int r2 = r8.zzB(r0)     // Catch: java.lang.Throwable -> L38
            boolean r1 = r8.zzK()     // Catch: java.lang.Throwable -> L38
            r7 = 0
            if (r1 == 0) goto L36
            long[] r1 = r8.zzm     // Catch: java.lang.Throwable -> L38
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L38
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 >= 0) goto L17
            goto L36
        L17:
            long r3 = r8.zzu     // Catch: java.lang.Throwable -> L38
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L25
            if (r11 != 0) goto L20
            goto L25
        L20:
            int r9 = r8.zzo     // Catch: java.lang.Throwable -> L38
            int r9 = r9 - r0
            monitor-exit(r8)
            return r9
        L25:
            int r11 = r8.zzo     // Catch: java.lang.Throwable -> L38
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.zzA(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L38
            r10 = -1
            monitor-exit(r8)
            if (r9 != r10) goto L35
            return r7
        L35:
            return r9
        L36:
            monitor-exit(r8)
            return r7
        L38:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    public final int zzd() {
            r2 = this;
            int r0 = r2.zzp
            int r1 = r2.zzo
            int r0 = r0 + r1
            return r0
    }

    public final int zze(com.google.android.gms.internal.ads.zzkm r9, com.google.android.gms.internal.ads.zzhq r10, int r11, boolean r12) {
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = 1
            goto L9
        L7:
            r0 = 0
            r5 = 0
        L9:
            com.google.android.gms.internal.ads.zzwi r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzC(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.zzf()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.zzwg r9 = r8.zza
            com.google.android.gms.internal.ads.zzwi r11 = r8.zzb
            r9.zzd(r10, r11)
            goto L3d
        L2c:
            com.google.android.gms.internal.ads.zzwg r9 = r8.zza
            com.google.android.gms.internal.ads.zzwi r11 = r8.zzb
            r9.zze(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.zzr
            int r9 = r9 + r1
            r8.zzr = r9
            return r12
        L3d:
            r9 = -4
        L3e:
            return r9
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final /* synthetic */ int zzf(com.google.android.gms.internal.ads.zzp r1, int r2, boolean r3) {
            r0 = this;
            int r1 = com.google.android.gms.internal.ads.zzaef.zza(r0, r1, r2, r3)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final int zzg(com.google.android.gms.internal.ads.zzp r1, int r2, boolean r3, int r4) throws java.io.IOException {
            r0 = this;
            com.google.android.gms.internal.ads.zzwg r4 = r0.zza
            int r1 = r4.zza(r1, r2, r3)
            return r1
    }

    public final synchronized long zzh() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.zzu     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized com.google.android.gms.internal.ads.zzaf zzi() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzx     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto L8
            r0 = 0
            monitor-exit(r1)
            return r0
        L8:
            com.google.android.gms.internal.ads.zzaf r0 = r1.zzy     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return r0
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final void zzj(long r2, boolean r4, boolean r5) {
            r1 = this;
            com.google.android.gms.internal.ads.zzwg r4 = r1.zza
            r0 = 0
            long r2 = r1.zzD(r2, r0, r5)
            r4.zzc(r2)
            return
    }

    public final void zzk() {
            r3 = this;
            com.google.android.gms.internal.ads.zzwg r0 = r3.zza
            long r1 = r3.zzE()
            r0.zzc(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzl(com.google.android.gms.internal.ads.zzaf r3) {
            r2 = this;
            boolean r0 = r2.zzM(r3)
            com.google.android.gms.internal.ads.zzwl r1 = r2.zzf
            if (r1 == 0) goto Ld
            if (r0 == 0) goto Ld
            r1.zzM(r3)
        Ld:
            return
    }

    public final void zzm() throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzrw r0 = r1.zzB
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzro r0 = r0.zza()
            throw r0
    }

    public final void zzn() {
            r0 = this;
            r0.zzk()
            r0.zzI()
            return
    }

    public final void zzo() {
            r1 = this;
            r0 = 1
            r1.zzp(r0)
            r1.zzI()
            return
    }

    public final void zzp(boolean r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzwg r0 = r4.zza
            r0.zzf()
            r0 = 0
            r4.zzo = r0
            r4.zzp = r0
            r4.zzq = r0
            r4.zzr = r0
            r1 = 1
            r4.zzw = r1
            r2 = -9223372036854775808
            r4.zzs = r2
            r4.zzt = r2
            r4.zzu = r2
            r4.zzv = r0
            com.google.android.gms.internal.ads.zzwt r0 = r4.zzc
            r0.zzd()
            if (r5 == 0) goto L29
            r5 = 0
            r4.zzy = r5
            r4.zzx = r1
            r4.zzz = r1
        L29:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final /* synthetic */ void zzq(com.google.android.gms.internal.ads.zzek r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzaef.zzb(r0, r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzr(com.google.android.gms.internal.ads.zzek r1, int r2, int r3) {
            r0 = this;
            com.google.android.gms.internal.ads.zzwg r3 = r0.zza
            r3.zzh(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzs(long r9, int r11, int r12, int r13, com.google.android.gms.internal.ads.zzaeg r14) {
            r8 = this;
            boolean r0 = r8.zzw
            if (r0 == 0) goto Lc
            r0 = r11 & 1
            if (r0 != 0) goto L9
            goto L35
        L9:
            r0 = 0
            r8.zzw = r0
        Lc:
            boolean r0 = r8.zzz
            if (r0 == 0) goto L36
            long r0 = r8.zzs
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L35
            r0 = r11 & 1
            if (r0 != 0) goto L36
            boolean r0 = r8.zzA
            if (r0 != 0) goto L32
            com.google.android.gms.internal.ads.zzaf r0 = r8.zzy
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Overriding unexpected non-sync sample for format: "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "SampleQueue"
            com.google.android.gms.internal.ads.zzea.zzf(r1, r0)
            r0 = 1
            r8.zzA = r0
        L32:
            r11 = r11 | 1
            goto L36
        L35:
            return
        L36:
            r3 = r11
            com.google.android.gms.internal.ads.zzwg r11 = r8.zza
            long r0 = (long) r12
            long r4 = r11.zzb()
            long r4 = r4 - r0
            long r0 = (long) r13
            long r4 = r4 - r0
            r0 = r8
            r1 = r9
            r6 = r12
            r7 = r14
            r0.zzG(r1, r3, r4, r6, r7)
            return
    }

    public final void zzt(long r1) {
            r0 = this;
            r0.zzs = r1
            return
    }

    public final void zzu(com.google.android.gms.internal.ads.zzwl r1) {
            r0 = this;
            r0.zzf = r1
            return
    }

    public final synchronized void zzv(int r4) {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 < 0) goto Lf
            int r1 = r3.zzr     // Catch: java.lang.Throwable -> Ld
            int r1 = r1 + r4
            int r2 = r3.zzo     // Catch: java.lang.Throwable -> Ld
            if (r1 > r2) goto Lf
            r0 = 1
            goto Lf
        Ld:
            r4 = move-exception
            goto L19
        Lf:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)     // Catch: java.lang.Throwable -> Ld
            int r0 = r3.zzr     // Catch: java.lang.Throwable -> Ld
            int r0 = r0 + r4
            r3.zzr = r0     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return
        L19:
            monitor-exit(r3)
            throw r4
    }

    public final synchronized boolean zzw() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzv     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized boolean zzx(boolean r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzK()     // Catch: java.lang.Throwable -> L3e
            r1 = 1
            if (r0 != 0) goto L1d
            r0 = 0
            if (r4 != 0) goto L1b
            boolean r4 = r3.zzv     // Catch: java.lang.Throwable -> L3e
            if (r4 != 0) goto L1b
            com.google.android.gms.internal.ads.zzaf r4 = r3.zzy     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L1a
            com.google.android.gms.internal.ads.zzaf r2 = r3.zzg     // Catch: java.lang.Throwable -> L3e
            if (r4 == r2) goto L18
            goto L1b
        L18:
            monitor-exit(r3)
            return r0
        L1a:
            r1 = 0
        L1b:
            monitor-exit(r3)
            return r1
        L1d:
            com.google.android.gms.internal.ads.zzwt r4 = r3.zzc     // Catch: java.lang.Throwable -> L3e
            int r0 = r3.zzp     // Catch: java.lang.Throwable -> L3e
            int r2 = r3.zzr     // Catch: java.lang.Throwable -> L3e
            int r0 = r0 + r2
            java.lang.Object r4 = r4.zza(r0)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzwk r4 = (com.google.android.gms.internal.ads.zzwk) r4     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzaf r4 = r4.zza     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzaf r0 = r3.zzg     // Catch: java.lang.Throwable -> L3e
            if (r4 == r0) goto L32
            monitor-exit(r3)
            return r1
        L32:
            int r4 = r3.zzr     // Catch: java.lang.Throwable -> L3e
            int r4 = r3.zzB(r4)     // Catch: java.lang.Throwable -> L3e
            boolean r4 = r3.zzL(r4)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r3)
            return r4
        L3e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized boolean zzy(int r4) {
            r3 = this;
            monitor-enter(r3)
            r3.zzJ()     // Catch: java.lang.Throwable -> L1a
            int r0 = r3.zzp     // Catch: java.lang.Throwable -> L1a
            if (r4 < r0) goto L18
            int r1 = r3.zzo     // Catch: java.lang.Throwable -> L1a
            int r1 = r1 + r0
            if (r4 <= r1) goto Le
            goto L18
        Le:
            r1 = -9223372036854775808
            r3.zzs = r1     // Catch: java.lang.Throwable -> L1a
            int r4 = r4 - r0
            r3.zzr = r4     // Catch: java.lang.Throwable -> L1a
            r4 = 1
        L16:
            monitor-exit(r3)
            return r4
        L18:
            r4 = 0
            goto L16
        L1a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized boolean zzz(long r11, boolean r13) {
            r10 = this;
            monitor-enter(r10)
            r10.zzJ()     // Catch: java.lang.Throwable -> L60
            int r0 = r10.zzr     // Catch: java.lang.Throwable -> L60
            int r2 = r10.zzB(r0)     // Catch: java.lang.Throwable -> L60
            boolean r1 = r10.zzK()     // Catch: java.lang.Throwable -> L60
            r7 = 0
            if (r1 == 0) goto L5e
            long[] r1 = r10.zzm     // Catch: java.lang.Throwable -> L60
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L60
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 < 0) goto L5e
            long r3 = r10.zzu     // Catch: java.lang.Throwable -> L60
            r8 = 1
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 <= 0) goto L23
            if (r13 == 0) goto L5e
            r13 = 1
        L23:
            boolean r1 = r10.zzz     // Catch: java.lang.Throwable -> L60
            r9 = -1
            if (r1 == 0) goto L47
            int r1 = r10.zzo     // Catch: java.lang.Throwable -> L60
            int r1 = r1 - r0
            r0 = 0
        L2c:
            if (r0 >= r1) goto L42
            long[] r3 = r10.zzm     // Catch: java.lang.Throwable -> L60
            r4 = r3[r2]     // Catch: java.lang.Throwable -> L60
            int r3 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r3 >= 0) goto L40
            int r2 = r2 + 1
            int r3 = r10.zzh     // Catch: java.lang.Throwable -> L60
            if (r2 != r3) goto L3d
            r2 = 0
        L3d:
            int r0 = r0 + 1
            goto L2c
        L40:
            r1 = r0
            goto L52
        L42:
            if (r13 == 0) goto L45
            goto L52
        L45:
            r1 = -1
            goto L52
        L47:
            int r13 = r10.zzo     // Catch: java.lang.Throwable -> L60
            int r3 = r13 - r0
            r6 = 1
            r1 = r10
            r4 = r11
            int r1 = r1.zzA(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L60
        L52:
            if (r1 != r9) goto L55
            goto L5e
        L55:
            r10.zzs = r11     // Catch: java.lang.Throwable -> L60
            int r11 = r10.zzr     // Catch: java.lang.Throwable -> L60
            int r11 = r11 + r1
            r10.zzr = r11     // Catch: java.lang.Throwable -> L60
            monitor-exit(r10)
            return r8
        L5e:
            monitor-exit(r10)
            return r7
        L60:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
    }
}
