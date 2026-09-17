package org.chromium.support_lib_boundary.util;

/* loaded from: classes2.dex */
public class BoundaryInterfaceReflectionUtil {

    private static class InvocationHandlerWithDelegateGetter implements java.lang.reflect.InvocationHandler {
        private final java.lang.Object mDelegate;

        public InvocationHandlerWithDelegateGetter(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.mDelegate = r1
                return
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object r3, java.lang.reflect.Method r4, java.lang.Object[] r5) throws java.lang.Throwable {
                r2 = this;
                java.lang.Object r3 = r2.mDelegate
                java.lang.Class r3 = r3.getClass()
                java.lang.ClassLoader r3 = r3.getClassLoader()
                java.lang.reflect.Method r3 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.dupeMethod(r4, r3)     // Catch: java.lang.ReflectiveOperationException -> L15 java.lang.reflect.InvocationTargetException -> L2d
                java.lang.Object r0 = r2.mDelegate     // Catch: java.lang.ReflectiveOperationException -> L15 java.lang.reflect.InvocationTargetException -> L2d
                java.lang.Object r3 = r3.invoke(r0, r5)     // Catch: java.lang.ReflectiveOperationException -> L15 java.lang.reflect.InvocationTargetException -> L2d
                return r3
            L15:
                r3 = move-exception
                java.lang.RuntimeException r5 = new java.lang.RuntimeException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Reflection failed for method "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4, r3)
                throw r5
            L2d:
                r3 = move-exception
                java.lang.Throwable r3 = r3.getTargetException()
                throw r3
        }
    }

    static {
            return
    }

    public BoundaryInterfaceReflectionUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> T castToSuppLibClass(java.lang.Class<T> r3, java.lang.reflect.InvocationHandler r4) {
            if (r4 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.Class<org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil> r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.Object r4 = java.lang.reflect.Proxy.newProxyInstance(r0, r1, r4)
            java.lang.Object r3 = r3.cast(r4)
            return r3
    }

    public static boolean containsFeature(java.util.Collection<java.lang.String> r1, java.lang.String r2) {
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L26
            boolean r0 = isDebuggable()
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ":dev"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L24
            goto L26
        L24:
            r1 = 0
            goto L27
        L26:
            r1 = 1
        L27:
            return r1
    }

    public static java.lang.reflect.InvocationHandler createInvocationHandlerFor(java.lang.Object r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil$InvocationHandlerWithDelegateGetter r0 = new org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil$InvocationHandlerWithDelegateGetter
            r0.<init>(r1)
            return r0
    }

    public static java.lang.reflect.Method dupeMethod(java.lang.reflect.Method r2, java.lang.ClassLoader r3) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException {
            java.lang.Class r0 = r2.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            r1 = 1
            java.lang.Class r3 = java.lang.Class.forName(r0, r1, r3)
            java.lang.Class[] r0 = r2.getParameterTypes()
            java.lang.String r2 = r2.getName()
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r2, r0)
            return r2
    }

    private static boolean isDebuggable() {
            java.lang.String r0 = android.os.Build.TYPE
            java.lang.String r1 = "eng"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L15
            java.lang.String r1 = "userdebug"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            return r0
    }
}
