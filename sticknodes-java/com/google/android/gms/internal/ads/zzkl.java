package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzkl extends java.lang.RuntimeException {
    public zzkl(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto Lc
            r0 = 2
            if (r2 == r0) goto L9
            java.lang.String r2 = "Detaching surface timed out."
            goto Le
        L9:
            java.lang.String r2 = "Setting foreground mode timed out."
            goto Le
        Lc:
            java.lang.String r2 = "Player release timed out."
        Le:
            r1.<init>(r2)
            return
    }
}
