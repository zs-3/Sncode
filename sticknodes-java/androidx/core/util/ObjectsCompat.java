package androidx.core.util;

/* loaded from: classes.dex */
public class ObjectsCompat {

    static class Api19Impl {
        static boolean equals(java.lang.Object r0, java.lang.Object r1) {
                boolean r0 = java.util.Objects.equals(r0, r1)
                return r0
        }

        static int hash(java.lang.Object... r0) {
                int r0 = java.util.Objects.hash(r0)
                return r0
        }
    }

    public static boolean equals(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = androidx.core.util.ObjectsCompat.Api19Impl.equals(r0, r1)
            return r0
    }

    public static int hash(java.lang.Object... r0) {
            int r0 = androidx.core.util.ObjectsCompat.Api19Impl.hash(r0)
            return r0
    }

    public static <T> T requireNonNull(T r0) {
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    public static <T> T requireNonNull(T r0, java.lang.String r1) {
            java.util.Objects.requireNonNull(r0, r1)
            return r0
    }
}
