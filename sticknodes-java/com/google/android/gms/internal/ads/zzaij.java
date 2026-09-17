package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaij implements com.google.android.gms.internal.ads.zzaii {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzaij(long[] r1, long[] r2, long r3, long r5, int r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r5
            r0.zze = r7
            return
    }

    public static com.google.android.gms.internal.ads.zzaij zzb(long r19, long r21, com.google.android.gms.internal.ads.zzadt r23, com.google.android.gms.internal.ads.zzek r24) {
            r0 = r19
            r2 = r23
            r3 = r24
            r4 = 10
            r3.zzM(r4)
            int r4 = r24.zzg()
            if (r4 > 0) goto L12
            goto L65
        L12:
            int r5 = r2.zzd
            r6 = 32000(0x7d00, float:4.4842E-41)
            if (r5 < r6) goto L1b
            r6 = 1152(0x480, float:1.614E-42)
            goto L1d
        L1b:
            r6 = 576(0x240, float:8.07E-43)
        L1d:
            long r6 = (long) r6
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r6 * r8
            long r14 = (long) r5
            long r10 = (long) r4
            java.math.RoundingMode r16 = java.math.RoundingMode.FLOOR
            long r4 = com.google.android.gms.internal.ads.zzeu.zzt(r10, r12, r14, r16)
            int r6 = r24.zzq()
            int r7 = r24.zzq()
            int r8 = r24.zzq()
            r9 = 2
            r3.zzM(r9)
            int r10 = r2.zzc
            long r10 = (long) r10
            long r10 = r21 + r10
            long[] r12 = new long[r6]
            long[] r13 = new long[r6]
            r14 = 0
            r14 = r21
            r9 = 0
        L48:
            if (r9 >= r6) goto L89
            long r2 = (long) r9
            long r2 = r2 * r4
            r17 = r4
            long r4 = (long) r6
            long r2 = r2 / r4
            r12[r9] = r2
            long r2 = java.lang.Math.max(r14, r10)
            r13[r9] = r2
            r2 = 1
            if (r8 == r2) goto L76
            r2 = 2
            if (r8 == r2) goto L71
            r3 = 3
            if (r8 == r3) goto L6c
            r3 = 4
            if (r8 == r3) goto L67
        L65:
            r0 = 0
            return r0
        L67:
            int r3 = r24.zzp()
            goto L7b
        L6c:
            int r3 = r24.zzo()
            goto L7b
        L71:
            int r3 = r24.zzq()
            goto L7b
        L76:
            r2 = 2
            int r3 = r24.zzm()
        L7b:
            long r4 = (long) r7
            long r2 = (long) r3
            long r2 = r2 * r4
            long r14 = r14 + r2
            int r9 = r9 + 1
            r2 = r23
            r3 = r24
            r4 = r17
            goto L48
        L89:
            r17 = r4
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb3
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 == 0) goto Lb3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "VBRI data size mismatch: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", "
            r2.append(r0)
            r2.append(r14)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "VbriSeeker"
            com.google.android.gms.internal.ads.zzea.zzf(r1, r0)
        Lb3:
            com.google.android.gms.internal.ads.zzaij r8 = new com.google.android.gms.internal.ads.zzaij
            r0 = r23
            int r7 = r0.zzf
            r0 = r8
            r1 = r12
            r2 = r13
            r3 = r17
            r5 = r14
            r0.<init>(r1, r2, r3, r5, r7)
            return r8
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final int zzc() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zzd() {
            r2 = this;
            long r0 = r2.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zze(long r4) {
            r3 = this;
            long[] r0 = r3.zzb
            long[] r1 = r3.zza
            r2 = 1
            int r4 = com.google.android.gms.internal.ads.zzeu.zzc(r0, r4, r2, r2)
            r4 = r1[r4]
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final com.google.android.gms.internal.ads.zzady zzg(long r9) {
            r8 = this;
            long[] r0 = r8.zza
            r1 = 1
            int r2 = com.google.android.gms.internal.ads.zzeu.zzc(r0, r9, r1, r1)
            com.google.android.gms.internal.ads.zzaeb r3 = new com.google.android.gms.internal.ads.zzaeb
            r4 = r0[r2]
            long[] r0 = r8.zzb
            r6 = r0[r2]
            r3.<init>(r4, r6)
            long r4 = r3.zzb
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 >= 0) goto L32
            long[] r9 = r8.zza
            int r10 = r9.length
            int r10 = r10 + (-1)
            if (r2 != r10) goto L20
            goto L32
        L20:
            int r2 = r2 + r1
            com.google.android.gms.internal.ads.zzaeb r10 = new com.google.android.gms.internal.ads.zzaeb
            r0 = r9[r2]
            long[] r9 = r8.zzb
            r4 = r9[r2]
            r10.<init>(r0, r4)
            com.google.android.gms.internal.ads.zzady r9 = new com.google.android.gms.internal.ads.zzady
            r9.<init>(r3, r10)
            return r9
        L32:
            com.google.android.gms.internal.ads.zzady r9 = new com.google.android.gms.internal.ads.zzady
            r9.<init>(r3, r3)
            return r9
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
            r1 = this;
            r0 = 1
            return r0
    }
}
