package com.google.android.datatransport.runtime.dagger.internal;

/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> void checkBuilderRequirement(T r1, java.lang.Class<T> r2) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r2.getCanonicalName()
            r0.append(r2)
            java.lang.String r2 = " must be set"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            throw r1
    }

    public static <T> T checkNotNull(T r0) {
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    public static <T> T checkNotNull(T r0, java.lang.String r1) {
            java.util.Objects.requireNonNull(r0, r1)
            return r0
    }

    public static <T> T checkNotNull(T r2, java.lang.String r3, java.lang.Object r4) {
            if (r2 != 0) goto L3d
            java.lang.String r2 = "%s"
            boolean r0 = r3.contains(r2)
            if (r0 == 0) goto L35
            int r0 = r3.indexOf(r2)
            int r1 = r3.lastIndexOf(r2)
            if (r0 != r1) goto L2d
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L1f
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r4 = r4.getCanonicalName()
            goto L23
        L1f:
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L23:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = r3.replace(r2, r4)
            r0.<init>(r2)
            throw r0
        L2d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "errorMessageTemplate has more than one format specifier"
            r2.<init>(r3)
            throw r2
        L35:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "errorMessageTemplate has no format specifiers"
            r2.<init>(r3)
            throw r2
        L3d:
            return r2
    }

    public static <T> T checkNotNullFromComponent(T r1) {
            java.lang.String r0 = "Cannot return null from a non-@Nullable component method"
            java.util.Objects.requireNonNull(r1, r0)
            return r1
    }

    public static <T> T checkNotNullFromProvides(T r1) {
            java.lang.String r0 = "Cannot return null from a non-@Nullable @Provides method"
            java.util.Objects.requireNonNull(r1, r0)
            return r1
    }
}
