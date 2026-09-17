package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzzn extends java.io.IOException {
    public zzzn(java.lang.Throwable r5) {
            r4 = this;
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = r5.getMessage()
            if (r1 == 0) goto L1d
            java.lang.String r1 = r5.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = ": "
            java.lang.String r1 = r2.concat(r1)
            goto L1f
        L1d:
            java.lang.String r1 = ""
        L1f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected "
            r2.append(r3)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r4.<init>(r0, r5)
            return
    }
}
