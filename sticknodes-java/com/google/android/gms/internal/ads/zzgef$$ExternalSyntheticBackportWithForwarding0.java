package com.google.android.gms.internal.ads;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class zzgef$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ boolean m(sun.misc.Unsafe r1, java.lang.Object r2, long r3, java.lang.Object r5, java.lang.Object r6) {
        L0:
            boolean r0 = r1.compareAndSwapObject(r2, r3, r5, r6)
            if (r0 == 0) goto L8
            r1 = 1
            return r1
        L8:
            java.lang.Object r0 = r1.getObject(r2, r3)
            if (r0 == r5) goto L0
            r1 = 0
            return r1
    }
}
