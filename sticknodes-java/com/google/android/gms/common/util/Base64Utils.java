package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public final class Base64Utils {
    public Base64Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static byte[] decode(java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 0
            byte[] r1 = android.util.Base64.decode(r1, r0)
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static byte[] decodeUrlSafe(java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 10
            byte[] r1 = android.util.Base64.decode(r1, r0)
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static byte[] decodeUrlSafeNoPadding(java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 11
            byte[] r1 = android.util.Base64.decode(r1, r0)
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String encode(byte[] r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String encodeUrlSafe(byte[] r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 10
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String encodeUrlSafeNoPadding(byte[] r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }
}
