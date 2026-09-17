package com.google.firebase.components;

/* loaded from: classes2.dex */
public final class Preconditions {
    public static void checkArgument(boolean r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    public static <T> T checkNotNull(T r0) {
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    public static <T> T checkNotNull(T r0, java.lang.String r1) {
            java.util.Objects.requireNonNull(r0, r1)
            return r0
    }

    public static void checkState(boolean r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }
}
