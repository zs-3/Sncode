package com.google.android.datatransport.runtime.logging;

/* loaded from: classes.dex */
public final class Logging {
    private static final java.lang.String LOG_PREFIX = "TRuntime.";
    private static final int MAX_LOG_TAG_SIZE_IN_SDK_N = 23;

    private Logging() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String concatTag(java.lang.String r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            int r2 = r1.length()
            r0 = 23
            if (r2 <= r0) goto L1c
            r2 = 0
            java.lang.String r1 = r1.substring(r2, r0)
        L1c:
            return r1
    }

    public static void d(java.lang.String r1, java.lang.String r2) {
            java.lang.String r1 = getTag(r1)
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto Le
            android.util.Log.d(r1, r2)
        Le:
            return
    }

    public static void d(java.lang.String r2, java.lang.String r3, java.lang.Object r4) {
            java.lang.String r2 = getTag(r2)
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto L18
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r3 = java.lang.String.format(r3, r0)
            android.util.Log.d(r2, r3)
        L18:
            return
    }

    public static void d(java.lang.String r2, java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            java.lang.String r2 = getTag(r2)
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto L1b
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            java.lang.String r3 = java.lang.String.format(r3, r0)
            android.util.Log.d(r2, r3)
        L1b:
            return
    }

    public static void d(java.lang.String r1, java.lang.String r2, java.lang.Object... r3) {
            java.lang.String r1 = getTag(r1)
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L12
            java.lang.String r2 = java.lang.String.format(r2, r3)
            android.util.Log.d(r1, r2)
        L12:
            return
    }

    public static void e(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            java.lang.String r1 = getTag(r1)
            r0 = 6
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto Le
            android.util.Log.e(r1, r2, r3)
        Le:
            return
    }

    private static java.lang.String getTag(java.lang.String r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "TRuntime."
            r2 = 26
            if (r0 >= r2) goto Ld
            java.lang.String r3 = concatTag(r1, r3)
            return r3
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static void i(java.lang.String r2, java.lang.String r3, java.lang.Object r4) {
            java.lang.String r2 = getTag(r2)
            r0 = 4
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto L18
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r3 = java.lang.String.format(r3, r0)
            android.util.Log.i(r2, r3)
        L18:
            return
    }

    public static void w(java.lang.String r2, java.lang.String r3, java.lang.Object r4) {
            java.lang.String r2 = getTag(r2)
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto L18
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r3 = java.lang.String.format(r3, r0)
            android.util.Log.w(r2, r3)
        L18:
            return
    }
}
