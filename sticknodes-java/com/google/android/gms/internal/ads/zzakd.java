package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzakd {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf;
    private final com.google.android.gms.internal.ads.zzek zzg;

    zzakd() {
            r2 = this;
            r2.<init>()
            r0 = 255(0xff, float:3.57E-43)
            int[] r1 = new int[r0]
            r2.zzf = r1
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            r1.<init>(r0)
            r2.zzg = r1
            return
    }

    public final void zza() {
            r3 = this;
            r0 = 0
            r3.zza = r0
            r1 = 0
            r3.zzb = r1
            r3.zzc = r0
            r3.zzd = r0
            r3.zze = r0
            return
    }

    public final boolean zzb(com.google.android.gms.internal.ads.zzadc r7, boolean r8) throws java.io.IOException {
            r6 = this;
            r6.zza()
            com.google.android.gms.internal.ads.zzek r0 = r6.zzg
            r1 = 27
            r0.zzI(r1)
            com.google.android.gms.internal.ads.zzek r0 = r6.zzg
            byte[] r0 = r0.zzN()
            r2 = 0
            boolean r0 = com.google.android.gms.internal.ads.zzadf.zzc(r7, r0, r2, r1, r8)
            if (r0 == 0) goto L91
            com.google.android.gms.internal.ads.zzek r0 = r6.zzg
            long r0 = r0.zzu()
            r3 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L25
            goto L91
        L25:
            com.google.android.gms.internal.ads.zzek r0 = r6.zzg
            int r0 = r0.zzm()
            if (r0 == 0) goto L37
            if (r8 == 0) goto L30
            return r2
        L30:
            java.lang.String r7 = "unsupported bit stream revision"
            com.google.android.gms.internal.ads.zzbo r7 = com.google.android.gms.internal.ads.zzbo.zzc(r7)
            throw r7
        L37:
            com.google.android.gms.internal.ads.zzek r0 = r6.zzg
            int r0 = r0.zzm()
            r6.zza = r0
            com.google.android.gms.internal.ads.zzek r0 = r6.zzg
            long r0 = r0.zzr()
            r6.zzb = r0
            com.google.android.gms.internal.ads.zzek r0 = r6.zzg
            r0.zzs()
            com.google.android.gms.internal.ads.zzek r0 = r6.zzg
            r0.zzs()
            com.google.android.gms.internal.ads.zzek r0 = r6.zzg
            r0.zzs()
            com.google.android.gms.internal.ads.zzek r0 = r6.zzg
            int r0 = r0.zzm()
            r6.zzc = r0
            int r1 = r0 + 27
            r6.zzd = r1
            com.google.android.gms.internal.ads.zzek r1 = r6.zzg
            r1.zzI(r0)
            com.google.android.gms.internal.ads.zzek r0 = r6.zzg
            byte[] r0 = r0.zzN()
            int r1 = r6.zzc
            boolean r7 = com.google.android.gms.internal.ads.zzadf.zzc(r7, r0, r2, r1, r8)
            if (r7 == 0) goto L91
        L75:
            int r7 = r6.zzc
            if (r2 >= r7) goto L8f
            int[] r7 = r6.zzf
            com.google.android.gms.internal.ads.zzek r8 = r6.zzg
            int r8 = r8.zzm()
            r7[r2] = r8
            int r7 = r6.zze
            int[] r8 = r6.zzf
            r8 = r8[r2]
            int r7 = r7 + r8
            r6.zze = r7
            int r2 = r2 + 1
            goto L75
        L8f:
            r7 = 1
            return r7
        L91:
            return r2
    }

    public final boolean zzc(com.google.android.gms.internal.ads.zzadc r9, long r10) throws java.io.IOException {
            r8 = this;
            long r0 = r9.zzf()
            long r2 = r9.zze()
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            com.google.android.gms.internal.ads.zzek r0 = r8.zzg
            r1 = 4
            r0.zzI(r1)
        L1a:
            r2 = -1
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto L2c
            long r2 = r9.zzf()
            r6 = 4
            long r2 = r2 + r6
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 < 0) goto L2c
            goto L52
        L2c:
            com.google.android.gms.internal.ads.zzek r2 = r8.zzg
            byte[] r2 = r2.zzN()
            boolean r2 = com.google.android.gms.internal.ads.zzadf.zzc(r9, r2, r4, r1, r5)
            if (r2 == 0) goto L52
            com.google.android.gms.internal.ads.zzek r0 = r8.zzg
            r0.zzL(r4)
            com.google.android.gms.internal.ads.zzek r0 = r8.zzg
            long r2 = r0.zzu()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L4e
            r9.zzj()
            return r5
        L4e:
            r9.zzk(r5)
            goto L1a
        L52:
            if (r0 == 0) goto L5c
            long r1 = r9.zzf()
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 >= 0) goto L63
        L5c:
            int r1 = r9.zzc(r5)
            r2 = -1
            if (r1 != r2) goto L52
        L63:
            return r4
    }
}
