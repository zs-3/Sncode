package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzand {
    private final com.google.android.gms.internal.ads.zzaeh zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzand(com.google.android.gms.internal.ads.zzaeh r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final void zza(byte[] r3, int r4, int r5) {
            r2 = this;
            boolean r0 = r2.zzc
            if (r0 == 0) goto L20
            int r0 = r4 + 1
            int r1 = r2.zzf
            int r0 = r0 - r1
            if (r0 >= r5) goto L1c
            r3 = r3[r0]
            r3 = r3 & 192(0xc0, float:2.69E-43)
            int r3 = r3 >> 6
            r4 = 0
            if (r3 != 0) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            r2.zzd = r3
            r2.zzc = r4
            return
        L1c:
            int r5 = r5 - r4
            int r1 = r1 + r5
            r2.zzf = r1
        L20:
            return
    }

    public final void zzb(long r10, int r12, boolean r13) {
            r9 = this;
            long r0 = r9.zzh
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            int r0 = r9.zze
            r1 = 182(0xb6, float:2.55E-43)
            if (r0 != r1) goto L2d
            if (r13 == 0) goto L2d
            boolean r13 = r9.zzb
            if (r13 == 0) goto L2d
            long r0 = r9.zzg
            long r0 = r10 - r0
            boolean r5 = r9.zzd
            com.google.android.gms.internal.ads.zzaeh r2 = r9.zza
            long r3 = r9.zzh
            int r6 = (int) r0
            r8 = 0
            r7 = r12
            r2.zzs(r3, r5, r6, r7, r8)
        L2d:
            int r12 = r9.zze
            r13 = 179(0xb3, float:2.51E-43)
            if (r12 == r13) goto L35
            r9.zzg = r10
        L35:
            return
    }

    public final void zzc(int r5, long r6) {
            r4 = this;
            r4.zze = r5
            r0 = 0
            r4.zzd = r0
            r1 = 179(0xb3, float:2.51E-43)
            r2 = 182(0xb6, float:2.55E-43)
            r3 = 1
            if (r5 == r2) goto L13
            if (r5 != r1) goto L11
            r5 = 179(0xb3, float:2.51E-43)
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            r4.zzb = r1
            if (r5 != r2) goto L19
            goto L1a
        L19:
            r3 = 0
        L1a:
            r4.zzc = r3
            r4.zzf = r0
            r4.zzh = r6
            return
    }

    public final void zzd() {
            r1 = this;
            r0 = 0
            r1.zzb = r0
            r1.zzc = r0
            r1.zzd = r0
            r0 = -1
            r1.zze = r0
            return
    }
}
