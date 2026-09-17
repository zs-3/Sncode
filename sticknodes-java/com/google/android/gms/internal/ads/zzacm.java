package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzacm {
    protected final com.google.android.gms.internal.ads.zzacg zza;
    protected final com.google.android.gms.internal.ads.zzacl zzb;
    protected com.google.android.gms.internal.ads.zzaci zzc;
    private final int zzd;

    protected zzacm(com.google.android.gms.internal.ads.zzacj r17, com.google.android.gms.internal.ads.zzacl r18, long r19, long r21, long r23, long r25, long r27, long r29, int r31) {
            r16 = this;
            r0 = r16
            r16.<init>()
            r1 = r18
            r0.zzb = r1
            r1 = r31
            r0.zzd = r1
            com.google.android.gms.internal.ads.zzacg r15 = new com.google.android.gms.internal.ads.zzacg
            r5 = 0
            r1 = r15
            r2 = r17
            r3 = r19
            r7 = r23
            r9 = r25
            r11 = r27
            r13 = r29
            r1.<init>(r2, r3, r5, r7, r9, r11, r13)
            r0.zza = r15
            return
    }

    protected static final int zzf(com.google.android.gms.internal.ads.zzadc r2, long r3, com.google.android.gms.internal.ads.zzadx r5) {
            long r0 = r2.zzf()
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            r2 = 0
            return r2
        La:
            r5.zza = r3
            r2 = 1
            return r2
    }

    protected static final boolean zzg(com.google.android.gms.internal.ads.zzadc r3, long r4) throws java.io.IOException {
            long r0 = r3.zzf()
            long r4 = r4 - r0
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L18
            r0 = 262144(0x40000, double:1.295163E-318)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L18
            int r5 = (int) r4
            r3.zzk(r5)
            r3 = 1
            return r3
        L18:
            r3 = 0
            return r3
    }

    public final int zza(com.google.android.gms.internal.ads.zzadc r12, com.google.android.gms.internal.ads.zzadx r13) throws java.io.IOException {
            r11 = this;
        L0:
            com.google.android.gms.internal.ads.zzaci r0 = r11.zzc
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            long r1 = com.google.android.gms.internal.ads.zzaci.zzb(r0)
            long r3 = com.google.android.gms.internal.ads.zzaci.zza(r0)
            long r5 = com.google.android.gms.internal.ads.zzaci.zzc(r0)
            long r3 = r3 - r1
            int r7 = r11.zzd
            long r7 = (long) r7
            r9 = 0
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 > 0) goto L22
            r11.zzc(r9, r1)
            int r12 = zzf(r12, r1, r13)
            return r12
        L22:
            boolean r1 = zzg(r12, r5)
            if (r1 != 0) goto L2d
            int r12 = zzf(r12, r5, r13)
            return r12
        L2d:
            r12.zzj()
            com.google.android.gms.internal.ads.zzacl r1 = r11.zzb
            long r2 = com.google.android.gms.internal.ads.zzaci.zze(r0)
            com.google.android.gms.internal.ads.zzack r1 = r1.zza(r12, r2)
            int r2 = com.google.android.gms.internal.ads.zzack.zza(r1)
            r3 = -3
            if (r2 == r3) goto L77
            r3 = -2
            if (r2 == r3) goto L6b
            r3 = -1
            if (r2 == r3) goto L5f
            long r2 = com.google.android.gms.internal.ads.zzack.zzb(r1)
            zzg(r12, r2)
            r0 = 1
            long r2 = com.google.android.gms.internal.ads.zzack.zzb(r1)
            r11.zzc(r0, r2)
            long r0 = com.google.android.gms.internal.ads.zzack.zzb(r1)
            int r12 = zzf(r12, r0, r13)
            return r12
        L5f:
            long r2 = com.google.android.gms.internal.ads.zzack.zzc(r1)
            long r4 = com.google.android.gms.internal.ads.zzack.zzb(r1)
            com.google.android.gms.internal.ads.zzaci.zzg(r0, r2, r4)
            goto L0
        L6b:
            long r2 = com.google.android.gms.internal.ads.zzack.zzc(r1)
            long r4 = com.google.android.gms.internal.ads.zzack.zzb(r1)
            com.google.android.gms.internal.ads.zzaci.zzh(r0, r2, r4)
            goto L0
        L77:
            r11.zzc(r9, r5)
            int r12 = zzf(r12, r5, r13)
            return r12
    }

    public final com.google.android.gms.internal.ads.zzaea zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzacg r0 = r1.zza
            return r0
    }

    protected final void zzc(boolean r1, long r2) {
            r0 = this;
            r1 = 0
            r0.zzc = r1
            com.google.android.gms.internal.ads.zzacl r1 = r0.zzb
            r1.zzb()
            return
    }

    public final void zzd(long r19) {
            r18 = this;
            r0 = r18
            r2 = r19
            com.google.android.gms.internal.ads.zzaci r1 = r0.zzc
            if (r1 == 0) goto L11
            long r4 = com.google.android.gms.internal.ads.zzaci.zzd(r1)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L11
            return
        L11:
            com.google.android.gms.internal.ads.zzacg r1 = r0.zza
            com.google.android.gms.internal.ads.zzaci r14 = new com.google.android.gms.internal.ads.zzaci
            long r4 = r1.zzf(r2)
            r6 = 0
            long r8 = com.google.android.gms.internal.ads.zzacg.zzd(r1)
            long r10 = com.google.android.gms.internal.ads.zzacg.zze(r1)
            long r12 = com.google.android.gms.internal.ads.zzacg.zzc(r1)
            long r15 = com.google.android.gms.internal.ads.zzacg.zzb(r1)
            r1 = r14
            r2 = r19
            r17 = r14
            r14 = r15
            r1.<init>(r2, r4, r6, r8, r10, r12, r14)
            r1 = r17
            r0.zzc = r1
            return
    }

    public final boolean zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzaci r0 = r1.zzc
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
