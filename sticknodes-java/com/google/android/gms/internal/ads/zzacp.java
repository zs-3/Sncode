package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzacp implements com.google.android.gms.internal.ads.zzaea {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzacp(long r2, long r4, int r6, int r7, boolean r8) {
            r1 = this;
            r1.<init>()
            r1.zza = r2
            r1.zzb = r4
            r8 = -1
            if (r7 != r8) goto Lb
            r7 = 1
        Lb:
            r1.zzc = r7
            r1.zze = r6
            r7 = -1
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L1f
            r1.zzd = r7
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L1c:
            r1.zzf = r2
            return
        L1f:
            long r7 = r2 - r4
            r1.zzd = r7
            long r2 = zzc(r2, r4, r6)
            goto L1c
    }

    private static long zzc(long r0, long r2, int r4) {
            long r0 = r0 - r2
            r2 = 0
            long r0 = java.lang.Math.max(r2, r0)
            r2 = 8000000(0x7a1200, double:3.952525E-317)
            long r0 = r0 * r2
            long r2 = (long) r4
            long r0 = r0 / r2
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
            r2 = this;
            long r0 = r2.zzf
            return r0
    }

    public final long zzb(long r4) {
            r3 = this;
            long r0 = r3.zzb
            int r2 = r3.zze
            long r4 = zzc(r4, r0, r2)
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final com.google.android.gms.internal.ads.zzady zzg(long r13) {
            r12 = this;
            long r0 = r12.zzd
            r2 = 0
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L5a
            int r7 = r12.zze
            long r7 = (long) r7
            long r7 = r7 * r13
            int r9 = r12.zzc
            r10 = 8000000(0x7a1200, double:3.952525E-317)
            long r7 = r7 / r10
            long r9 = (long) r9
            long r7 = r7 / r9
            long r7 = r7 * r9
            if (r6 == 0) goto L20
            long r0 = r0 - r9
            long r7 = java.lang.Math.min(r7, r0)
        L20:
            long r0 = java.lang.Math.max(r7, r2)
            long r2 = r12.zzb
            long r2 = r2 + r0
            long r0 = r12.zzb(r2)
            com.google.android.gms.internal.ads.zzaeb r6 = new com.google.android.gms.internal.ads.zzaeb
            r6.<init>(r0, r2)
            long r7 = r12.zzd
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 == 0) goto L54
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 >= 0) goto L54
            int r13 = r12.zzc
            long r13 = (long) r13
            long r2 = r2 + r13
            long r13 = r12.zza
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 < 0) goto L45
            goto L54
        L45:
            long r13 = r12.zzb(r2)
            com.google.android.gms.internal.ads.zzaeb r0 = new com.google.android.gms.internal.ads.zzaeb
            r0.<init>(r13, r2)
            com.google.android.gms.internal.ads.zzady r13 = new com.google.android.gms.internal.ads.zzady
            r13.<init>(r6, r0)
            return r13
        L54:
            com.google.android.gms.internal.ads.zzady r13 = new com.google.android.gms.internal.ads.zzady
            r13.<init>(r6, r6)
            return r13
        L5a:
            long r13 = r12.zzb
            com.google.android.gms.internal.ads.zzady r0 = new com.google.android.gms.internal.ads.zzady
            com.google.android.gms.internal.ads.zzaeb r1 = new com.google.android.gms.internal.ads.zzaeb
            r1.<init>(r2, r13)
            r0.<init>(r1, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
            r5 = this;
            long r0 = r5.zzd
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 0
            return r0
        La:
            r0 = 1
            return r0
    }
}
