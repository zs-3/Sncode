package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaaq {
    public static boolean zza(android.content.Context r5) {
            java.lang.String r0 = "display"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.hardware.display.DisplayManager r5 = (android.hardware.display.DisplayManager) r5
            r0 = 0
            if (r5 == 0) goto L10
            android.view.Display r5 = r5.getDisplay(r0)
            goto L11
        L10:
            r5 = 0
        L11:
            r1 = 1
            if (r5 == 0) goto L2f
            boolean r2 = r5.isHdr()
            if (r2 == 0) goto L2f
            android.view.Display$HdrCapabilities r5 = r5.getHdrCapabilities()
            int[] r5 = r5.getSupportedHdrTypes()
            int r2 = r5.length
            r3 = 0
        L24:
            if (r3 >= r2) goto L2f
            r4 = r5[r3]
            if (r4 != r1) goto L2c
            r0 = 1
            goto L2f
        L2c:
            int r3 = r3 + 1
            goto L24
        L2f:
            return r0
    }
}
