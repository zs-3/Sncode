package androidx.core.os;

/* loaded from: classes.dex */
public final class HandlerCompat {

    private static class Api28Impl {
        public static android.os.Handler createAsync(android.os.Looper r0) {
                android.os.Handler r0 = android.os.Handler.createAsync(r0)
                return r0
        }
    }

    public static android.os.Handler createAsync(android.os.Looper r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r7 = androidx.core.os.HandlerCompat.Api28Impl.createAsync(r7)
            return r7
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L52
            java.lang.Class<android.os.Looper> r3 = android.os.Looper.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L52
            java.lang.Class<android.os.Handler$Callback> r3 = android.os.Handler.Callback.class
            r5 = 1
            r2[r5] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L52
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L52
            r6 = 2
            r2[r6] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L52
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L52
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L52
            r1[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L52
            r2 = 0
            r1[r5] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L52
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L52
            r1[r6] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L52
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L52
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L52
            return r0
        L35:
            r7 = move-exception
            java.lang.Throwable r7 = r7.getCause()
            boolean r0 = r7 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof java.lang.Error
            if (r0 == 0) goto L45
            java.lang.Error r7 = (java.lang.Error) r7
            throw r7
        L45:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r7)
            throw r0
        L4b:
            java.lang.RuntimeException r7 = (java.lang.RuntimeException) r7
            throw r7
        L4e:
            r0 = move-exception
            goto L53
        L50:
            r0 = move-exception
            goto L53
        L52:
            r0 = move-exception
        L53:
            java.lang.String r1 = "HandlerCompat"
            java.lang.String r2 = "Unable to invoke Handler(Looper, Callback, boolean) constructor"
            android.util.Log.w(r1, r2, r0)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r7)
            return r0
    }
}
