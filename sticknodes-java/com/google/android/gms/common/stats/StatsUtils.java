package com.google.android.gms.common.stats;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
@java.lang.Deprecated
/* loaded from: classes.dex */
public class StatsUtils {
    public StatsUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String getEventKey(android.os.PowerManager.WakeLock r4, java.lang.String r5) {
            int r0 = android.os.Process.myPid()
            long r0 = (long) r0
            int r4 = java.lang.System.identityHashCode(r4)
            long r2 = (long) r4
            r4 = 32
            long r0 = r0 << r4
            long r0 = r0 | r2
            java.lang.String r4 = java.lang.String.valueOf(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 1
            if (r1 != r0) goto L1b
            java.lang.String r5 = ""
        L1b:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r4 = r4.concat(r5)
            return r4
    }
}
