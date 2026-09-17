package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzix {
    private static final java.lang.Class<?> zzni = null;
    private static final boolean zznj = false;

    static {
            java.lang.String r0 = "libcore.io.Memory"
            java.lang.Class r0 = zzj(r0)
            com.google.android.gms.internal.drive.zzix.zzni = r0
            java.lang.String r0 = "org.robolectric.Robolectric"
            java.lang.Class r0 = zzj(r0)
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            com.google.android.gms.internal.drive.zzix.zznj = r0
            return
    }

    static boolean zzbr() {
            java.lang.Class<?> r0 = com.google.android.gms.internal.drive.zzix.zzni
            if (r0 == 0) goto La
            boolean r0 = com.google.android.gms.internal.drive.zzix.zznj
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    static java.lang.Class<?> zzbs() {
            java.lang.Class<?> r0 = com.google.android.gms.internal.drive.zzix.zzni
            return r0
    }

    private static <T> java.lang.Class<T> zzj(java.lang.String r0) {
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }
}
