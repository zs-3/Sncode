package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzggg {
    static void zza(java.lang.Throwable r0) {
            boolean r0 = r0 instanceof java.lang.InterruptedException
            if (r0 == 0) goto Lb
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Lb:
            return
    }
}
