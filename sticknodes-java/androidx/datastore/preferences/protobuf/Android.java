package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class Android {
    private static final boolean IS_ROBOLECTRIC = false;
    private static final java.lang.Class<?> MEMORY_CLASS = null;

    static {
            java.lang.String r0 = "libcore.io.Memory"
            java.lang.Class r0 = getClassForName(r0)
            androidx.datastore.preferences.protobuf.Android.MEMORY_CLASS = r0
            java.lang.String r0 = "org.robolectric.Robolectric"
            java.lang.Class r0 = getClassForName(r0)
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            androidx.datastore.preferences.protobuf.Android.IS_ROBOLECTRIC = r0
            return
    }

    private static <T> java.lang.Class<T> getClassForName(java.lang.String r0) {
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    static java.lang.Class<?> getMemoryClass() {
            java.lang.Class<?> r0 = androidx.datastore.preferences.protobuf.Android.MEMORY_CLASS
            return r0
    }

    static boolean isOnAndroidDevice() {
            java.lang.Class<?> r0 = androidx.datastore.preferences.protobuf.Android.MEMORY_CLASS
            if (r0 == 0) goto La
            boolean r0 = androidx.datastore.preferences.protobuf.Android.IS_ROBOLECTRIC
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }
}
