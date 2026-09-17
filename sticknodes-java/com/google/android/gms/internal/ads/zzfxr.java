package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfxr {
    static final java.lang.CharSequence zza(java.lang.Object r1) {
            java.util.Objects.requireNonNull(r1)
            boolean r0 = r1 instanceof java.lang.CharSequence
            if (r0 == 0) goto La
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto Le
        La:
            java.lang.String r1 = r1.toString()
        Le:
            return r1
    }

    public static final java.lang.StringBuilder zzb(java.lang.StringBuilder r0, java.lang.Iterable r1, java.lang.String r2) {
            java.util.Iterator r1 = r1.iterator()
            zzc(r0, r1, r2)
            return r0
    }

    public static final java.lang.StringBuilder zzc(java.lang.StringBuilder r1, java.util.Iterator r2, java.lang.String r3) {
            boolean r0 = r2.hasNext()     // Catch: java.io.IOException -> L27
            if (r0 == 0) goto L26
            java.lang.Object r0 = r2.next()     // Catch: java.io.IOException -> L27
            java.lang.CharSequence r0 = zza(r0)     // Catch: java.io.IOException -> L27
            r1.append(r0)     // Catch: java.io.IOException -> L27
        L11:
            boolean r0 = r2.hasNext()     // Catch: java.io.IOException -> L27
            if (r0 == 0) goto L26
            r1.append(r3)     // Catch: java.io.IOException -> L27
            java.lang.Object r0 = r2.next()     // Catch: java.io.IOException -> L27
            java.lang.CharSequence r0 = zza(r0)     // Catch: java.io.IOException -> L27
            r1.append(r0)     // Catch: java.io.IOException -> L27
            goto L11
        L26:
            return r1
        L27:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            throw r2
    }
}
