package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfqc {
    public static java.lang.String zza(android.view.View r2) {
            boolean r0 = r2.isAttachedToWindow()
            if (r0 == 0) goto L2a
            int r0 = r2.getVisibility()
            r1 = 8
            if (r0 != r1) goto L11
            java.lang.String r2 = "viewGone"
            return r2
        L11:
            r1 = 4
            if (r0 != r1) goto L17
            java.lang.String r2 = "viewInvisible"
            return r2
        L17:
            if (r0 == 0) goto L1c
            java.lang.String r2 = "viewNotVisible"
            return r2
        L1c:
            float r2 = r2.getAlpha()
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L28
            java.lang.String r2 = "viewAlphaZero"
            return r2
        L28:
            r2 = 0
            return r2
        L2a:
            java.lang.String r2 = "notAttached"
            return r2
    }
}
