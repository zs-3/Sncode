package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzqa {
    private final com.google.android.gms.internal.ads.zzpz zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zzqa(android.media.AudioTrack r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzpz r0 = new com.google.android.gms.internal.ads.zzpz
            r0.<init>(r2)
            r1.zza = r0
            r2 = 0
            r1.zzh(r2)
            return
    }

    private final void zzh(int r7) {
            r6 = this;
            r6.zzb = r7
            r0 = 10000(0x2710, double:4.9407E-320)
            if (r7 == 0) goto L1c
            r2 = 1
            if (r7 == r2) goto L19
            r0 = 2
            if (r7 == r0) goto L15
            r0 = 3
            if (r7 == r0) goto L15
            r0 = 500000(0x7a120, double:2.47033E-318)
        L12:
            r6.zzd = r0
            return
        L15:
            r0 = 10000000(0x989680, double:4.9406565E-317)
            goto L12
        L19:
            r6.zzd = r0
            return
        L1c:
            r2 = 0
            r6.zze = r2
            r2 = -1
            r6.zzf = r2
            long r2 = java.lang.System.nanoTime()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r6.zzc = r2
            goto L12
    }

    public final long zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzpz r0 = r2.zza
            long r0 = r0.zza()
            return r0
    }

    public final long zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzpz r0 = r2.zza
            long r0 = r0.zzb()
            return r0
    }

    public final void zzc() {
            r2 = this;
            int r0 = r2.zzb
            r1 = 4
            if (r0 != r1) goto L9
            r0 = 0
            r2.zzh(r0)
        L9:
            return
    }

    public final void zzd() {
            r1 = this;
            r0 = 4
            r1.zzh(r0)
            return
    }

    public final void zze() {
            r1 = this;
            r0 = 0
            r1.zzh(r0)
            return
    }

    public final boolean zzf() {
            r2 = this;
            int r0 = r2.zzb
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final boolean zzg(long r7) {
            r6 = this;
            long r0 = r6.zze
            long r0 = r7 - r0
            long r2 = r6.zzd
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto Lc
            return r4
        Lc:
            r6.zze = r7
            com.google.android.gms.internal.ads.zzpz r0 = r6.zza
            boolean r0 = r0.zzc()
            int r1 = r6.zzb
            r2 = 3
            r3 = 1
            if (r1 == 0) goto L49
            r7 = 2
            if (r1 == r3) goto L32
            if (r1 == r7) goto L2a
            if (r1 == r2) goto L23
            r4 = r0
            goto L6e
        L23:
            if (r0 != 0) goto L26
            goto L6e
        L26:
            r6.zzh(r4)
            return r3
        L2a:
            if (r0 == 0) goto L2e
        L2c:
            r4 = 1
            goto L6e
        L2e:
            r6.zzh(r4)
            return r4
        L32:
            if (r0 == 0) goto L45
            com.google.android.gms.internal.ads.zzpz r8 = r6.zza
            long r0 = r8.zza()
            long r4 = r6.zzf
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 > 0) goto L41
            goto L2c
        L41:
            r6.zzh(r7)
            return r3
        L45:
            r6.zzh(r4)
            goto L6e
        L49:
            if (r0 == 0) goto L64
            com.google.android.gms.internal.ads.zzpz r7 = r6.zza
            long r7 = r7.zzb()
            long r0 = r6.zzc
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L58
            goto L6e
        L58:
            com.google.android.gms.internal.ads.zzpz r7 = r6.zza
            long r7 = r7.zza()
            r6.zzf = r7
            r6.zzh(r3)
            return r3
        L64:
            long r0 = r6.zzc
            long r7 = r7 - r0
            r0 = 500000(0x7a120, double:2.47033E-318)
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 > 0) goto L6f
        L6e:
            return r4
        L6f:
            r6.zzh(r2)
            return r4
    }
}
