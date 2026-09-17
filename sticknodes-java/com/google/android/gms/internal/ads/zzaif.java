package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaif implements com.google.android.gms.internal.ads.zzaii {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzaif(long[] r3, long[] r4, long r5) {
            r2 = this;
            r2.<init>()
            r2.zza = r3
            r2.zzb = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 == 0) goto L11
            goto L1a
        L11:
            int r3 = r4.length
            int r3 = r3 + (-1)
            r3 = r4[r3]
            long r5 = com.google.android.gms.internal.ads.zzeu.zzr(r3)
        L1a:
            r2.zzc = r5
            return
    }

    public static com.google.android.gms.internal.ads.zzaif zzb(long r9, com.google.android.gms.internal.ads.zzaha r11, long r12) {
            int[] r0 = r11.zzd
            int r0 = r0.length
            int r1 = r0 + 1
            long[] r2 = new long[r1]
            long[] r1 = new long[r1]
            r3 = 0
            r2[r3] = r9
            r4 = 0
            r1[r3] = r4
            r3 = 1
        L11:
            if (r3 > r0) goto L2e
            int r6 = r11.zzb
            int[] r7 = r11.zzd
            int r8 = r3 + (-1)
            r7 = r7[r8]
            int r6 = r6 + r7
            long r6 = (long) r6
            long r9 = r9 + r6
            int r6 = r11.zzc
            int[] r7 = r11.zze
            r7 = r7[r8]
            int r6 = r6 + r7
            long r6 = (long) r6
            long r4 = r4 + r6
            r2[r3] = r9
            r1[r3] = r4
            int r3 = r3 + 1
            goto L11
        L2e:
            com.google.android.gms.internal.ads.zzaif r9 = new com.google.android.gms.internal.ads.zzaif
            r9.<init>(r2, r1, r12)
            return r9
    }

    private static android.util.Pair zzf(long r10, long[] r12, long[] r13) {
            r0 = 1
            int r1 = com.google.android.gms.internal.ads.zzeu.zzc(r12, r10, r0, r0)
            r2 = r12[r1]
            r4 = r13[r1]
            int r1 = r1 + r0
            int r0 = r12.length
            if (r1 != r0) goto L1a
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            java.lang.Long r11 = java.lang.Long.valueOf(r4)
            android.util.Pair r10 = android.util.Pair.create(r10, r11)
            return r10
        L1a:
            r6 = r12[r1]
            r12 = r13[r1]
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L25
            r0 = 0
            goto L2b
        L25:
            double r0 = (double) r10
            double r8 = (double) r2
            long r6 = r6 - r2
            double r0 = r0 - r8
            double r2 = (double) r6
            double r0 = r0 / r2
        L2b:
            long r12 = r12 - r4
            double r12 = (double) r12
            double r0 = r0 * r12
            long r12 = (long) r0
            long r12 = r12 + r4
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Long r11 = java.lang.Long.valueOf(r12)
            android.util.Pair r10 = android.util.Pair.create(r10, r11)
            return r10
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
            r0 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zzd() {
            r2 = this;
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zze(long r3) {
            r2 = this;
            long[] r0 = r2.zza
            long[] r1 = r2.zzb
            android.util.Pair r3 = zzf(r3, r0, r1)
            java.lang.Object r3 = r3.second
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            long r3 = com.google.android.gms.internal.ads.zzeu.zzr(r3)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final com.google.android.gms.internal.ads.zzady zzg(long r5) {
            r4 = this;
            long r0 = r4.zzc
            long r5 = java.lang.Math.min(r5, r0)
            r0 = 0
            long r5 = java.lang.Math.max(r0, r5)
            long r5 = com.google.android.gms.internal.ads.zzeu.zzu(r5)
            long[] r0 = r4.zzb
            long[] r1 = r4.zza
            android.util.Pair r5 = zzf(r5, r0, r1)
            java.lang.Object r6 = r5.first
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            long r0 = com.google.android.gms.internal.ads.zzeu.zzr(r0)
            java.lang.Object r5 = r5.second
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            com.google.android.gms.internal.ads.zzady r2 = new com.google.android.gms.internal.ads.zzady
            com.google.android.gms.internal.ads.zzaeb r3 = new com.google.android.gms.internal.ads.zzaeb
            r3.<init>(r0, r5)
            r2.<init>(r3, r3)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
            r1 = this;
            r0 = 1
            return r0
    }
}
