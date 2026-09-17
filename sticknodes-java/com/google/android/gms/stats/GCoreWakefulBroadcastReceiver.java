package com.google.android.gms.stats;

/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes2.dex */
public abstract class GCoreWakefulBroadcastReceiver extends androidx.legacy.content.WakefulBroadcastReceiver {
    public GCoreWakefulBroadcastReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean completeWakefulIntent(android.content.Context r0, android.content.Intent r1) {
            if (r1 != 0) goto L4
            r0 = 0
            return r0
        L4:
            boolean r0 = androidx.legacy.content.WakefulBroadcastReceiver.completeWakefulIntent(r1)
            return r0
    }
}
