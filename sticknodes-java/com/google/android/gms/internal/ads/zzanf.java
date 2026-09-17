package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzanf {
    private final com.google.android.gms.internal.ads.zzaeh zza;
    private final android.util.SparseArray zzb;
    private final android.util.SparseArray zzc;
    private final byte[] zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;

    public zzanf(com.google.android.gms.internal.ads.zzaeh r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.zzb = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.zzc = r1
            r1 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r1]
            r0.zzd = r1
            com.google.android.gms.internal.ads.zzft r2 = new com.google.android.gms.internal.ads.zzft
            r3 = 0
            r2.<init>(r1, r3, r3)
            r0.zzh = r3
            return
    }

    private final void zzg(int r9) {
            r8 = this;
            long r1 = r8.zzj
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto Lc
            return
        Lc:
            boolean r3 = r8.zzk
            long r4 = r8.zzf
            long r6 = r8.zzi
            long r4 = r4 - r6
            com.google.android.gms.internal.ads.zzaeh r0 = r8.zza
            int r4 = (int) r4
            r6 = 0
            r5 = r9
            r0.zzs(r1, r3, r4, r5, r6)
            return
    }

    private final void zzh() {
            r6 = this;
            boolean r0 = r6.zzl
            boolean r1 = r6.zzk
            int r2 = r6.zze
            r3 = 0
            r4 = 1
            r5 = 5
            if (r2 == r5) goto Lf
            if (r0 == 0) goto L10
            if (r2 != r4) goto L10
        Lf:
            r3 = 1
        L10:
            r0 = r1 | r3
            r6.zzk = r0
            return
    }

    public final void zza(long r1) {
            r0 = this;
            r0.zzh()
            r0.zzf = r1
            r1 = 0
            r0.zzg(r1)
            r0.zzh = r1
            return
    }

    public final void zzb(com.google.android.gms.internal.ads.zzfq r3) {
            r2 = this;
            android.util.SparseArray r0 = r2.zzc
            int r1 = r3.zza
            r0.append(r1, r3)
            return
    }

    public final void zzc(com.google.android.gms.internal.ads.zzfr r3) {
            r2 = this;
            android.util.SparseArray r0 = r2.zzb
            int r1 = r3.zzd
            r0.append(r1, r3)
            return
    }

    public final void zzd() {
            r1 = this;
            r0 = 0
            r1.zzh = r0
            return
    }

    public final void zze(long r1, int r3, long r4, boolean r6) {
            r0 = this;
            r0.zze = r3
            r0.zzg = r4
            r0.zzf = r1
            r0.zzl = r6
            return
    }

    public final boolean zzf(long r3, int r5, boolean r6) {
            r2 = this;
            int r0 = r2.zze
            r1 = 9
            if (r0 == r1) goto L7
            goto L23
        L7:
            if (r6 == 0) goto L15
            boolean r6 = r2.zzh
            if (r6 == 0) goto L15
            long r0 = r2.zzf
            long r3 = r3 - r0
            int r4 = (int) r3
            int r5 = r5 + r4
            r2.zzg(r5)
        L15:
            long r3 = r2.zzf
            r2.zzi = r3
            long r3 = r2.zzg
            r2.zzj = r3
            r3 = 0
            r2.zzk = r3
            r3 = 1
            r2.zzh = r3
        L23:
            r2.zzh()
            boolean r3 = r2.zzk
            return r3
    }
}
