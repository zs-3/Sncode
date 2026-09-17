package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
final class zzbi {
    static void zza(boolean r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "mode was UNNECESSARY, but rounding was necessary"
            r1.<init>(r0)
            throw r1
    }
}
