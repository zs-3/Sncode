package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzi {
    public final int zza;

    public zzi(int r1, float r2) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zza = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1a
            java.lang.Class<com.google.android.gms.internal.ads.zzi> r2 = com.google.android.gms.internal.ads.zzi.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L1a
        L10:
            com.google.android.gms.internal.ads.zzi r5 = (com.google.android.gms.internal.ads.zzi) r5
            r5 = 0
            int r5 = java.lang.Float.compare(r5, r5)
            if (r5 != 0) goto L1a
            return r0
        L1a:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            r0 = 0
            int r0 = java.lang.Float.floatToIntBits(r0)
            int r0 = r0 + 16337
            return r0
    }
}
