package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaej {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd;

    public zzaej(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            int r1 = r1.length
            r0.zzb = r1
            return
    }

    public final int zza() {
            r2 = this;
            int r0 = r2.zzc
            int r0 = r0 * 8
            int r1 = r2.zzd
            int r0 = r0 + r1
            return r0
    }

    public final int zzb(int r7) {
            r6 = this;
            int r0 = r6.zzc
            int r1 = r6.zzd
            int r1 = 8 - r1
            int r2 = r0 + 1
            byte[] r3 = r6.zza
            int r1 = java.lang.Math.min(r7, r1)
            r0 = r3[r0]
            r3 = 255(0xff, float:3.57E-43)
            r0 = r0 & r3
            int r4 = r6.zzd
            int r0 = r0 >> r4
            int r4 = 8 - r1
            int r4 = r3 >> r4
            r0 = r0 & r4
        L1b:
            if (r1 >= r7) goto L2a
            byte[] r4 = r6.zza
            int r5 = r2 + 1
            r2 = r4[r2]
            r2 = r2 & r3
            int r2 = r2 << r1
            r0 = r0 | r2
            int r1 = r1 + 8
            r2 = r5
            goto L1b
        L2a:
            r1 = -1
            int r2 = 32 - r7
            int r1 = r1 >>> r2
            r0 = r0 & r1
            r6.zzc(r7)
            return r0
    }

    public final void zzc(int r5) {
            r4 = this;
            int r0 = r4.zzc
            int r1 = r5 / 8
            int r0 = r0 + r1
            r4.zzc = r0
            int r1 = r1 * 8
            int r2 = r4.zzd
            int r5 = r5 - r1
            int r2 = r2 + r5
            r4.zzd = r2
            r5 = 7
            if (r2 <= r5) goto L1a
            int r0 = r0 + 1
            r4.zzc = r0
            int r2 = r2 + (-8)
            r4.zzd = r2
        L1a:
            r5 = 0
            r1 = 1
            if (r0 < 0) goto L27
            int r3 = r4.zzb
            if (r0 < r3) goto L26
            if (r0 != r3) goto L27
            if (r2 != 0) goto L27
        L26:
            r5 = 1
        L27:
            com.google.android.gms.internal.ads.zzdi.zzf(r5)
            return
    }

    public final boolean zzd() {
            r2 = this;
            byte[] r0 = r2.zza
            int r1 = r2.zzc
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r2.zzd
            int r0 = r0 >> r1
            r1 = 1
            r2.zzc(r1)
            r0 = r0 & r1
            if (r1 == r0) goto L14
            r0 = 0
            return r0
        L14:
            return r1
    }
}
