package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzct {
    public static boolean zza(boolean r2) {
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r0 = "generic"
            r1 = 31
            if (r2 < r1) goto L27
            java.lang.String r2 = android.os.Build.FINGERPRINT
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L25
            java.lang.String r0 = "emulator"
            boolean r2 = r2.contains(r0)
            if (r2 != 0) goto L25
            java.lang.String r2 = android.os.Build.HARDWARE
            java.lang.String r0 = "ranchu"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L23
            goto L25
        L23:
            r2 = 0
            return r2
        L25:
            r2 = 1
            return r2
        L27:
            java.lang.String r2 = android.os.Build.DEVICE
            boolean r2 = r2.startsWith(r0)
            return r2
    }
}
