package androidx.core.util;

/* loaded from: classes.dex */
public final class Preconditions {
    public static <T> T checkNotNull(T r0) {
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    public static <T> T checkNotNull(T r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }
}
