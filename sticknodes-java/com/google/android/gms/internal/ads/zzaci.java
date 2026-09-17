package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaci {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    protected zzaci(long r14, long r16, long r18, long r20, long r22, long r24, long r26) {
            r13 = this;
            r0 = r13
            r13.<init>()
            r1 = r14
            r0.zza = r1
            r1 = r16
            r0.zzb = r1
            r3 = 0
            r0.zzd = r3
            r5 = r20
            r0.zze = r5
            r7 = r22
            r0.zzf = r7
            r9 = r24
            r0.zzg = r9
            r11 = r26
            r0.zzc = r11
            long r1 = zzf(r1, r3, r5, r7, r9, r11)
            r0.zzh = r1
            return
    }

    static /* synthetic */ long zza(com.google.android.gms.internal.ads.zzaci r2) {
            long r0 = r2.zzg
            return r0
    }

    static /* synthetic */ long zzb(com.google.android.gms.internal.ads.zzaci r2) {
            long r0 = r2.zzf
            return r0
    }

    static /* synthetic */ long zzc(com.google.android.gms.internal.ads.zzaci r2) {
            long r0 = r2.zzh
            return r0
    }

    static /* synthetic */ long zzd(com.google.android.gms.internal.ads.zzaci r2) {
            long r0 = r2.zza
            return r0
    }

    static /* synthetic */ long zze(com.google.android.gms.internal.ads.zzaci r2) {
            long r0 = r2.zzb
            return r0
    }

    protected static long zzf(long r10, long r12, long r14, long r16, long r18, long r20) {
            r0 = r16
            r2 = 1
            long r4 = r0 + r2
            int r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r6 >= 0) goto L31
            long r2 = r2 + r12
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 < 0) goto L10
            goto L31
        L10:
            long r2 = r10 - r12
            long r4 = r18 - r0
            long r6 = r14 - r12
            float r2 = (float) r2
            float r3 = (float) r4
            float r4 = (float) r6
            float r3 = r3 / r4
            float r2 = r2 * r3
            long r2 = (long) r2
            long r4 = r0 + r2
            long r4 = r4 - r20
            r6 = -1
            long r6 = r18 + r6
            r8 = 20
            long r2 = r2 / r8
            long r4 = r4 - r2
            long r2 = java.lang.Math.min(r4, r6)
            long r0 = java.lang.Math.max(r0, r2)
        L31:
            return r0
    }

    static /* bridge */ /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzaci r0, long r1, long r3) {
            r0.zze = r1
            r0.zzg = r3
            r0.zzi()
            return
    }

    static /* bridge */ /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzaci r0, long r1, long r3) {
            r0.zzd = r1
            r0.zzf = r3
            r0.zzi()
            return
    }

    private final void zzi() {
            r12 = this;
            long r0 = r12.zzb
            long r2 = r12.zzd
            long r4 = r12.zze
            long r6 = r12.zzf
            long r8 = r12.zzg
            long r10 = r12.zzc
            long r0 = zzf(r0, r2, r4, r6, r8, r10)
            r12.zzh = r0
            return
    }
}
