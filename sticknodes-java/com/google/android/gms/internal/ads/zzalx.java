package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzalx {
    public static com.google.android.gms.internal.ads.zzaly zza(com.google.android.gms.internal.ads.zzaly r3, java.lang.String[] r4, java.util.Map r5) {
            r0 = 0
            r1 = 1
            if (r3 != 0) goto L2c
            if (r4 != 0) goto L8
            r3 = 0
            return r3
        L8:
            int r2 = r4.length
            if (r2 != r1) goto L14
            r3 = r4[r0]
            java.lang.Object r3 = r5.get(r3)
            com.google.android.gms.internal.ads.zzaly r3 = (com.google.android.gms.internal.ads.zzaly) r3
            return r3
        L14:
            if (r2 <= r1) goto L53
            com.google.android.gms.internal.ads.zzaly r3 = new com.google.android.gms.internal.ads.zzaly
            r3.<init>()
        L1b:
            if (r0 >= r2) goto L2b
            r1 = r4[r0]
            java.lang.Object r1 = r5.get(r1)
            com.google.android.gms.internal.ads.zzaly r1 = (com.google.android.gms.internal.ads.zzaly) r1
            r3.zzl(r1)
            int r0 = r0 + 1
            goto L1b
        L2b:
            return r3
        L2c:
            if (r4 == 0) goto L3e
            int r2 = r4.length
            if (r2 == r1) goto L32
            goto L3e
        L32:
            r4 = r4[r0]
            java.lang.Object r4 = r5.get(r4)
            com.google.android.gms.internal.ads.zzaly r4 = (com.google.android.gms.internal.ads.zzaly) r4
            r3.zzl(r4)
            return r3
        L3e:
            if (r4 == 0) goto L53
            int r2 = r4.length
            if (r2 <= r1) goto L53
        L43:
            if (r0 >= r2) goto L53
            r1 = r4[r0]
            java.lang.Object r1 = r5.get(r1)
            com.google.android.gms.internal.ads.zzaly r1 = (com.google.android.gms.internal.ads.zzaly) r1
            r3.zzl(r1)
            int r0 = r0 + 1
            goto L43
        L53:
            return r3
    }
}
