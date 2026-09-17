package com.google.android.gms.internal.base;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public final class zao extends androidx.core.content.ContextCompat {
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    public static android.content.Intent zaa(android.content.Context r2, android.content.BroadcastReceiver r3, android.content.IntentFilter r4) {
            boolean r0 = com.google.android.gms.internal.base.zan.zaa()
            if (r0 == 0) goto L15
            r0 = 1
            boolean r1 = com.google.android.gms.internal.base.zan.zaa()
            if (r0 == r1) goto Lf
            r0 = 0
            goto L10
        Lf:
            r0 = 2
        L10:
            android.content.Intent r2 = r2.registerReceiver(r3, r4, r0)
            return r2
        L15:
            android.content.Intent r2 = r2.registerReceiver(r3, r4)
            return r2
    }
}
