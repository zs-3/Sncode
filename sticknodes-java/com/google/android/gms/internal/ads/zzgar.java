package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzgar {
    zzgar() {
            r0 = this;
            r0.<init>()
            return
    }

    static int zze(int r1, int r2) {
            int r0 = r1 >> 1
            int r1 = r1 + r0
            int r1 = r1 + 1
            if (r1 >= r2) goto Le
            int r2 = r2 + (-1)
            int r1 = java.lang.Integer.highestOneBit(r2)
            int r1 = r1 + r1
        Le:
            if (r1 >= 0) goto L13
            r1 = 2147483647(0x7fffffff, float:NaN)
        L13:
            return r1
    }

    public abstract com.google.android.gms.internal.ads.zzgar zzb(java.lang.Object r1);
}
