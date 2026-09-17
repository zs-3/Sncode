package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@org.jspecify.annotations.NullMarked
/* loaded from: classes.dex */
public final class zzal {
    static java.lang.Object[] zza(java.lang.Object[] r2, int r3) {
            r0 = 0
        L1:
            if (r0 >= r3) goto L21
            r1 = r2[r0]
            if (r1 == 0) goto La
            int r0 = r0 + 1
            goto L1
        La:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "at index "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L21:
            return r2
    }
}
