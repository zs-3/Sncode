package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaic {
    private static final long[] zza = null;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    static {
            r0 = 8
            long[] r0 = new long[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [128, 64, 32, 16, 8, 4, 2, 1} // fill-array
            com.google.android.gms.internal.ads.zzaic.zza = r0
            return
    }

    public zzaic() {
            r1 = this;
            r1.<init>()
            r0 = 8
            byte[] r0 = new byte[r0]
            r1.zzb = r0
            return
    }

    public static int zzb(int r7) {
            r0 = 0
        L1:
            r1 = 8
            if (r0 >= r1) goto L17
            int r1 = r0 + 1
            long[] r2 = com.google.android.gms.internal.ads.zzaic.zza
            r3 = r2[r0]
            long r5 = (long) r7
            long r2 = r3 & r5
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L15
            goto L18
        L15:
            r0 = r1
            goto L1
        L17:
            r1 = -1
        L18:
            return r1
    }

    public static long zzc(byte[] r7, int r8, boolean r9) {
            r0 = 0
            r0 = r7[r0]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            if (r9 == 0) goto L11
            int r9 = r8 + (-1)
            long[] r4 = com.google.android.gms.internal.ads.zzaic.zza
            r5 = r4[r9]
            long r4 = ~r5
            long r0 = r0 & r4
        L11:
            r9 = 1
        L12:
            if (r9 >= r8) goto L1f
            r4 = 8
            long r0 = r0 << r4
            r4 = r7[r9]
            long r4 = (long) r4
            long r4 = r4 & r2
            long r0 = r0 | r4
            int r9 = r9 + 1
            goto L12
        L1f:
            return r0
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    public final long zzd(com.google.android.gms.internal.ads.zzadc r5, boolean r6, boolean r7, int r8) throws java.io.IOException {
            r4 = this;
            int r0 = r4.zzc
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L2b
            byte[] r0 = r4.zzb
            boolean r6 = r5.zzn(r0, r3, r2, r6)
            if (r6 != 0) goto L12
            r5 = -1
            return r5
        L12:
            byte[] r6 = r4.zzb
            r6 = r6[r3]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = zzb(r6)
            r4.zzd = r6
            if (r6 == r1) goto L23
            r4.zzc = r2
            goto L2b
        L23:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "No valid varint length mask found"
            r5.<init>(r6)
            throw r5
        L2b:
            int r6 = r4.zzd
            if (r6 <= r8) goto L34
            r4.zzc = r3
            r5 = -2
            return r5
        L34:
            if (r6 == r2) goto L3c
            byte[] r8 = r4.zzb
            int r6 = r6 + r1
            r5.zzi(r8, r2, r6)
        L3c:
            r4.zzc = r3
            byte[] r5 = r4.zzb
            int r6 = r4.zzd
            long r5 = zzc(r5, r6, r7)
            return r5
    }

    public final void zze() {
            r1 = this;
            r0 = 0
            r1.zzc = r0
            r1.zzd = r0
            return
    }
}
