package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzre implements com.google.android.gms.internal.ads.zzqn {
    protected zzre(com.google.android.gms.internal.ads.zzrd r1) {
            r0 = this;
            r0.<init>()
            return
    }

    protected static int zza(int r2, int r3, int r4) {
            long r0 = (long) r2
            long r2 = (long) r3
            long r0 = r0 * r2
            long r2 = (long) r4
            long r0 = r0 * r2
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r2
            int r2 = com.google.android.gms.internal.ads.zzgdu.zzb(r0)
            return r2
    }

    protected static int zzb(int r1) {
            r0 = 20
            if (r1 == r0) goto L41
            r0 = 30
            if (r1 == r0) goto L3d
            switch(r1) {
                case 5: goto L39;
                case 6: goto L35;
                case 7: goto L31;
                case 8: goto L3d;
                case 9: goto L2d;
                case 10: goto L29;
                case 11: goto L26;
                case 12: goto L23;
                default: goto Lb;
            }
        Lb:
            switch(r1) {
                case 14: goto L1f;
                case 15: goto L1c;
                case 16: goto L18;
                case 17: goto L14;
                case 18: goto L35;
                default: goto Le;
            }
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L14:
            r1 = 336000(0x52080, float:4.70836E-40)
            return r1
        L18:
            r1 = 256000(0x3e800, float:3.58732E-40)
            return r1
        L1c:
            r1 = 8000(0x1f40, float:1.121E-41)
            return r1
        L1f:
            r1 = 3062500(0x2ebae4, float:4.291477E-39)
            return r1
        L23:
            r1 = 7000(0x1b58, float:9.809E-42)
            return r1
        L26:
            r1 = 16000(0x3e80, float:2.2421E-41)
            return r1
        L29:
            r1 = 100000(0x186a0, float:1.4013E-40)
            return r1
        L2d:
            r1 = 40000(0x9c40, float:5.6052E-41)
            return r1
        L31:
            r1 = 192000(0x2ee00, float:2.6905E-40)
            return r1
        L35:
            r1 = 768000(0xbb800, float:1.076197E-39)
            return r1
        L39:
            r1 = 80000(0x13880, float:1.12104E-40)
            return r1
        L3d:
            r1 = 2250000(0x225510, float:3.152922E-39)
            return r1
        L41:
            r1 = 63750(0xf906, float:8.9333E-41)
            return r1
    }
}
