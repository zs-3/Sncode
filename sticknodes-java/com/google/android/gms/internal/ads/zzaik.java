package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaik {
    public final com.google.android.gms.internal.ads.zzadt zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzaik(com.google.android.gms.internal.ads.zzadt r2, long r3, long r5, long[] r7, int r8, int r9) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzadt r0 = new com.google.android.gms.internal.ads.zzadt
            r0.<init>(r2)
            r1.zza = r0
            r1.zzb = r3
            r1.zzc = r5
            r1.zzf = r7
            r1.zzd = r8
            r1.zze = r9
            return
    }

    public static com.google.android.gms.internal.ads.zzaik zzb(com.google.android.gms.internal.ads.zzadt r14, com.google.android.gms.internal.ads.zzek r15) {
            int r0 = r15.zzg()
            r1 = r0 & 1
            r2 = -1
            if (r1 == 0) goto Le
            int r1 = r15.zzp()
            goto Lf
        Le:
            r1 = -1
        Lf:
            r3 = r0 & 2
            if (r3 == 0) goto L18
            long r3 = r15.zzu()
            goto L1a
        L18:
            r3 = -1
        L1a:
            r9 = r3
            r3 = r0 & 4
            r4 = 4
            if (r3 != r4) goto L33
            r3 = 100
            long[] r5 = new long[r3]
            r6 = 0
        L25:
            if (r6 >= r3) goto L31
            int r7 = r15.zzm()
            long r7 = (long) r7
            r5[r6] = r7
            int r6 = r6 + 1
            goto L25
        L31:
            r11 = r5
            goto L35
        L33:
            r3 = 0
            r11 = r3
        L35:
            r0 = r0 & 8
            if (r0 == 0) goto L3c
            r15.zzM(r4)
        L3c:
            int r0 = r15.zzb()
            r3 = 24
            if (r0 < r3) goto L54
            r0 = 21
            r15.zzM(r0)
            int r15 = r15.zzo()
            int r2 = r15 >> 12
            r15 = r15 & 4095(0xfff, float:5.738E-42)
            r13 = r15
            r12 = r2
            goto L56
        L54:
            r12 = -1
            r13 = -1
        L56:
            long r7 = (long) r1
            com.google.android.gms.internal.ads.zzaik r15 = new com.google.android.gms.internal.ads.zzaik
            r5 = r15
            r6 = r14
            r5.<init>(r6, r7, r9, r11, r12, r13)
            return r15
    }

    public final long zza() {
            r7 = this;
            long r0 = r7.zzb
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1e
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto Lf
            goto L1e
        Lf:
            com.google.android.gms.internal.ads.zzadt r4 = r7.zza
            int r5 = r4.zzg
            long r5 = (long) r5
            long r0 = r0 * r5
            long r0 = r0 + r2
            int r2 = r4.zzd
            long r0 = com.google.android.gms.internal.ads.zzeu.zzs(r0, r2)
            return r0
        L1e:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r0
    }
}
