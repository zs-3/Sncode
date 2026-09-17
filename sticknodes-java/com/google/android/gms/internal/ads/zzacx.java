package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzacx {
    public final java.lang.String zza;

    private zzacx(int r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzacx zza(com.google.android.gms.internal.ads.zzek r4) {
            r0 = 2
            r4.zzM(r0)
            int r0 = r4.zzm()
            int r1 = r0 >> 1
            r0 = r0 & 1
            int r4 = r4.zzm()
            int r4 = r4 >> 3
            r2 = 5
            r3 = 4
            if (r1 == r3) goto L2c
            if (r1 == r2) goto L2c
            r3 = 7
            if (r1 != r3) goto L1c
            goto L2c
        L1c:
            r3 = 8
            if (r1 != r3) goto L23
            java.lang.String r3 = "hev1"
            goto L2e
        L23:
            r3 = 9
            if (r1 != r3) goto L2a
            java.lang.String r3 = "avc3"
            goto L2e
        L2a:
            r4 = 0
            return r4
        L2c:
            java.lang.String r3 = "dvhe"
        L2e:
            int r0 = r0 << r2
            r4 = r4 | r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r2 = ".0"
            r0.append(r2)
            r0.append(r1)
            r3 = 10
            if (r4 >= r3) goto L45
            goto L47
        L45:
            java.lang.String r2 = "."
        L47:
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzacx r2 = new com.google.android.gms.internal.ads.zzacx
            r2.<init>(r1, r4, r0)
            return r2
    }
}
