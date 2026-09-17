package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzggq {
    public static java.lang.Object zza(java.util.concurrent.Future r1) throws java.util.concurrent.ExecutionException {
            r0 = 0
        L1:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1b
            if (r0 == 0) goto Le
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Le:
            return r1
        Lf:
            r1 = move-exception
            if (r0 != 0) goto L13
            goto L1a
        L13:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1a:
            throw r1
        L1b:
            r0 = 1
            goto L1
    }
}
