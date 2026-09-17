package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzadm {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final com.google.android.gms.internal.ads.zzadl zzk;
    private final com.google.android.gms.internal.ads.zzbk zzl;

    private zzadm(int r1, int r2, int r3, int r4, int r5, int r6, int r7, long r8, com.google.android.gms.internal.ads.zzadl r10, com.google.android.gms.internal.ads.zzbk r11) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            int r1 = zzi(r5)
            r0.zzf = r1
            r0.zzg = r6
            r0.zzh = r7
            int r1 = zzh(r7)
            r0.zzi = r1
            r0.zzj = r8
            r0.zzk = r10
            r0.zzl = r11
            return
    }

    public zzadm(byte[] r3, int r4) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzej r0 = new com.google.android.gms.internal.ads.zzej
            int r1 = r3.length
            r0.<init>(r3, r1)
            int r4 = r4 * 8
            r0.zzl(r4)
            r3 = 16
            int r4 = r0.zzd(r3)
            r2.zza = r4
            int r3 = r0.zzd(r3)
            r2.zzb = r3
            r3 = 24
            int r4 = r0.zzd(r3)
            r2.zzc = r4
            int r3 = r0.zzd(r3)
            r2.zzd = r3
            r3 = 20
            int r3 = r0.zzd(r3)
            r2.zze = r3
            int r3 = zzi(r3)
            r2.zzf = r3
            r3 = 3
            int r3 = r0.zzd(r3)
            int r3 = r3 + 1
            r2.zzg = r3
            r3 = 5
            int r3 = r0.zzd(r3)
            int r3 = r3 + 1
            r2.zzh = r3
            int r3 = zzh(r3)
            r2.zzi = r3
            r3 = 36
            long r3 = r0.zze(r3)
            r2.zzj = r3
            r3 = 0
            r2.zzk = r3
            r2.zzl = r3
            return
    }

    private static int zzh(int r1) {
            r0 = 8
            if (r1 == r0) goto L1e
            r0 = 12
            if (r1 == r0) goto L1c
            r0 = 16
            if (r1 == r0) goto L1a
            r0 = 20
            if (r1 == r0) goto L18
            r0 = 24
            if (r1 == r0) goto L16
            r1 = -1
            return r1
        L16:
            r1 = 6
            return r1
        L18:
            r1 = 5
            return r1
        L1a:
            r1 = 4
            return r1
        L1c:
            r1 = 2
            return r1
        L1e:
            r1 = 1
            return r1
    }

    private static int zzi(int r0) {
            switch(r0) {
                case 8000: goto L1d;
                case 16000: goto L1b;
                case 22050: goto L19;
                case 24000: goto L17;
                case 32000: goto L14;
                case 44100: goto L11;
                case 48000: goto Le;
                case 88200: goto Lc;
                case 96000: goto L9;
                case 176400: goto L7;
                case 192000: goto L5;
                default: goto L3;
            }
        L3:
            r0 = -1
            return r0
        L5:
            r0 = 3
            return r0
        L7:
            r0 = 2
            return r0
        L9:
            r0 = 11
            return r0
        Lc:
            r0 = 1
            return r0
        Le:
            r0 = 10
            return r0
        L11:
            r0 = 9
            return r0
        L14:
            r0 = 8
            return r0
        L17:
            r0 = 7
            return r0
        L19:
            r0 = 6
            return r0
        L1b:
            r0 = 5
            return r0
        L1d:
            r0 = 4
            return r0
    }

    public final long zza() {
            r5 = this;
            long r0 = r5.zzj
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r0
        Le:
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r2
            int r2 = r5.zze
            long r2 = (long) r2
            long r0 = r0 / r2
            return r0
    }

    public final long zzb(long r5) {
            r4 = this;
            int r0 = r4.zze
            long r0 = (long) r0
            long r5 = r5 * r0
            long r0 = r4.zzj
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 / r2
            r2 = -1
            long r0 = r0 + r2
            long r5 = java.lang.Math.min(r5, r0)
            r0 = 0
            long r5 = java.lang.Math.max(r0, r5)
            return r5
    }

    public final com.google.android.gms.internal.ads.zzaf zzc(byte[] r3, com.google.android.gms.internal.ads.zzbk r4) {
            r2 = this;
            r0 = 4
            r1 = -128(0xffffffffffffff80, float:NaN)
            r3[r0] = r1
            com.google.android.gms.internal.ads.zzbk r4 = r2.zzd(r4)
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            java.lang.String r1 = "audio/flac"
            r0.zzZ(r1)
            int r1 = r2.zzd
            if (r1 > 0) goto L18
            r1 = -1
        L18:
            r0.zzQ(r1)
            int r1 = r2.zzg
            r0.zzz(r1)
            int r1 = r2.zze
            r0.zzaa(r1)
            int r1 = r2.zzh
            int r1 = com.google.android.gms.internal.ads.zzeu.zzm(r1)
            r0.zzT(r1)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r0.zzM(r3)
            r0.zzS(r4)
            com.google.android.gms.internal.ads.zzaf r3 = r0.zzaf()
            return r3
    }

    public final com.google.android.gms.internal.ads.zzbk zzd(com.google.android.gms.internal.ads.zzbk r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbk r0 = r1.zzl
            if (r0 != 0) goto L5
            return r2
        L5:
            com.google.android.gms.internal.ads.zzbk r2 = r0.zzd(r2)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzadm zze(java.util.List r14) {
            r13 = this;
            com.google.android.gms.internal.ads.zzbk r0 = new com.google.android.gms.internal.ads.zzbk
            r0.<init>(r14)
            com.google.android.gms.internal.ads.zzbk r12 = r13.zzd(r0)
            com.google.android.gms.internal.ads.zzadm r14 = new com.google.android.gms.internal.ads.zzadm
            int r2 = r13.zza
            int r3 = r13.zzb
            int r4 = r13.zzc
            int r5 = r13.zzd
            int r6 = r13.zze
            int r7 = r13.zzg
            int r8 = r13.zzh
            long r9 = r13.zzj
            com.google.android.gms.internal.ads.zzadl r11 = r13.zzk
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r11, r12)
            return r14
    }

    public final com.google.android.gms.internal.ads.zzadm zzf(com.google.android.gms.internal.ads.zzadl r14) {
            r13 = this;
            com.google.android.gms.internal.ads.zzbk r11 = r13.zzl
            com.google.android.gms.internal.ads.zzadm r12 = new com.google.android.gms.internal.ads.zzadm
            int r1 = r13.zza
            int r2 = r13.zzb
            int r3 = r13.zzc
            int r4 = r13.zzd
            int r5 = r13.zze
            int r6 = r13.zzg
            int r7 = r13.zzh
            long r8 = r13.zzj
            r0 = r12
            r10 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11)
            return r12
    }

    public final com.google.android.gms.internal.ads.zzadm zzg(java.util.List r13) {
            r12 = this;
            com.google.android.gms.internal.ads.zzbk r13 = com.google.android.gms.internal.ads.zzaen.zzb(r13)
            com.google.android.gms.internal.ads.zzbk r11 = r12.zzd(r13)
            com.google.android.gms.internal.ads.zzadm r13 = new com.google.android.gms.internal.ads.zzadm
            int r1 = r12.zza
            int r2 = r12.zzb
            int r3 = r12.zzc
            int r4 = r12.zzd
            int r5 = r12.zze
            int r6 = r12.zzg
            int r7 = r12.zzh
            long r8 = r12.zzj
            com.google.android.gms.internal.ads.zzadl r10 = r12.zzk
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11)
            return r13
    }
}
