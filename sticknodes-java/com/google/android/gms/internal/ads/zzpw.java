package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzpw extends java.lang.Exception {
    public zzpw(long r3, long r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected audio track timestamp discontinuity: expected "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = ", got "
            r0.append(r5)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
    }
}
