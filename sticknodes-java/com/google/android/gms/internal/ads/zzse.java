package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzse {
    public static /* synthetic */ boolean zza(java.util.concurrent.atomic.AtomicReference r0, java.lang.Object r1, java.lang.Object r2) {
        L0:
            r1 = 0
            boolean r1 = r0.compareAndSet(r1, r2)
            if (r1 == 0) goto L9
            r0 = 1
            return r0
        L9:
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L0
            r0 = 0
            return r0
    }
}
