package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaoy implements com.google.android.gms.internal.ads.zzaea {
    private final com.google.android.gms.internal.ads.zzaov zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaoy(com.google.android.gms.internal.ads.zzaov r1, int r2, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            int r1 = r1.zzd
            long r1 = (long) r1
            long r5 = r5 - r3
            long r5 = r5 / r1
            r0.zzd = r5
            long r1 = r0.zzb(r5)
            r0.zze = r1
            return
    }

    private final long zzb(long r9) {
            r8 = this;
            com.google.android.gms.internal.ads.zzaov r0 = r8.zza
            int r0 = r0.zzc
            long r5 = (long) r0
            java.math.RoundingMode r7 = java.math.RoundingMode.FLOOR
            int r0 = r8.zzb
            long r0 = (long) r0
            long r1 = r9 * r0
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = com.google.android.gms.internal.ads.zzeu.zzt(r1, r3, r5, r7)
            return r9
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
            r2 = this;
            long r0 = r2.zze
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final com.google.android.gms.internal.ads.zzady zzg(long r11) {
            r10 = this;
            int r0 = r10.zzb
            long r0 = (long) r0
            long r2 = r10.zzd
            com.google.android.gms.internal.ads.zzaov r4 = r10.zza
            int r4 = r4.zzc
            long r4 = (long) r4
            long r4 = r4 * r11
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r6
            long r4 = r4 / r0
            r0 = -1
            long r2 = r2 + r0
            long r2 = java.lang.Math.min(r4, r2)
            r4 = 0
            long r2 = java.lang.Math.max(r4, r2)
            com.google.android.gms.internal.ads.zzaov r4 = r10.zza
            int r4 = r4.zzd
            long r4 = (long) r4
            long r4 = r4 * r2
            long r6 = r10.zzb(r2)
            long r8 = r10.zzc
            long r8 = r8 + r4
            com.google.android.gms.internal.ads.zzaeb r4 = new com.google.android.gms.internal.ads.zzaeb
            r4.<init>(r6, r8)
            int r5 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r5 >= 0) goto L5a
            long r11 = r10.zzd
            long r11 = r11 + r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 != 0) goto L3e
            goto L5a
        L3e:
            r11 = 1
            long r2 = r2 + r11
            long r11 = r10.zzc
            com.google.android.gms.internal.ads.zzaov r0 = r10.zza
            long r5 = r10.zzb(r2)
            int r0 = r0.zzd
            long r0 = (long) r0
            long r2 = r2 * r0
            long r11 = r11 + r2
            com.google.android.gms.internal.ads.zzaeb r0 = new com.google.android.gms.internal.ads.zzaeb
            r0.<init>(r5, r11)
            com.google.android.gms.internal.ads.zzady r11 = new com.google.android.gms.internal.ads.zzady
            r11.<init>(r4, r0)
            return r11
        L5a:
            com.google.android.gms.internal.ads.zzady r11 = new com.google.android.gms.internal.ads.zzady
            r11.<init>(r4, r4)
            return r11
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
            r1 = this;
            r0 = 1
            return r0
    }
}
