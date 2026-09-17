package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
final class zzoh implements java.security.PrivilegedExceptionAction {
    zzoh() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ java.lang.Object run() throws java.lang.Exception {
            r7 = this;
            java.lang.Class<sun.misc.Unsafe> r0 = sun.misc.Unsafe.class
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()
            int r2 = r1.length
            r3 = 0
        L8:
            r4 = 0
            if (r3 >= r2) goto L26
            r5 = r1[r3]
            r6 = 1
            r5.setAccessible(r6)
            java.lang.Object r4 = r5.get(r4)
            boolean r5 = r0.isInstance(r4)
            if (r5 == 0) goto L23
            java.lang.Object r0 = r0.cast(r4)
            r4 = r0
            sun.misc.Unsafe r4 = (sun.misc.Unsafe) r4
            goto L26
        L23:
            int r3 = r3 + 1
            goto L8
        L26:
            return r4
    }
}
