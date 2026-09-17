package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgbu {
    static java.lang.Object zza(java.util.Map r0, java.lang.Object r1) {
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L8
            return r0
        L8:
            r0 = 0
            return r0
    }

    static boolean zzb(java.util.Map r1, java.lang.Object r2) {
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L17
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r1 = r1.entrySet()
            java.util.Set r2 = r2.entrySet()
            boolean r1 = r1.equals(r2)
            return r1
        L17:
            r1 = 0
            return r1
    }
}
