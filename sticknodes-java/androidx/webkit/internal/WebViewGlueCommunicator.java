package androidx.webkit.internal;

/* loaded from: classes.dex */
public class WebViewGlueCommunicator {

    private static class LAZY_FACTORY_HOLDER {
        static final androidx.webkit.internal.WebViewProviderFactory INSTANCE = null;

        static {
                androidx.webkit.internal.WebViewProviderFactory r0 = androidx.webkit.internal.WebViewGlueCommunicator.createGlueProviderFactory()
                androidx.webkit.internal.WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.INSTANCE = r0
                return
        }
    }

    static androidx.webkit.internal.WebViewProviderFactory createGlueProviderFactory() {
            java.lang.reflect.InvocationHandler r0 = fetchGlueProviderFactoryImpl()     // Catch: java.lang.NoSuchMethodException -> L12 java.lang.ClassNotFoundException -> L19 java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            androidx.webkit.internal.WebViewProviderFactoryAdapter r1 = new androidx.webkit.internal.WebViewProviderFactoryAdapter
            java.lang.Class<org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface> r2 = org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface.class
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r2, r0)
            org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface) r0
            r1.<init>(r0)
            return r1
        L12:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L19:
            androidx.webkit.internal.IncompatibleApkWebViewProviderFactory r0 = new androidx.webkit.internal.IncompatibleApkWebViewProviderFactory
            r0.<init>()
            return r0
        L1f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L26:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    private static java.lang.reflect.InvocationHandler fetchGlueProviderFactoryImpl() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException {
            java.lang.ClassLoader r0 = getWebViewClassLoader()
            java.lang.String r1 = "org.chromium.support_lib_glue.SupportLibReflectionUtil"
            r2 = 0
            java.lang.Class r0 = java.lang.Class.forName(r1, r2, r0)
            java.lang.Class[] r1 = new java.lang.Class[r2]
            java.lang.String r3 = "createWebViewProviderFactory"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            java.lang.Object r0 = r0.invoke(r2, r1)
            java.lang.reflect.InvocationHandler r0 = (java.lang.reflect.InvocationHandler) r0
            return r0
    }

    public static androidx.webkit.internal.WebViewProviderFactory getFactory() {
            androidx.webkit.internal.WebViewProviderFactory r0 = androidx.webkit.internal.WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.INSTANCE
            return r0
    }

    public static java.lang.ClassLoader getWebViewClassLoader() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.ClassLoader r0 = androidx.webkit.internal.ApiHelperForP.getWebViewClassLoader()
            return r0
        Lb:
            java.lang.Object r0 = getWebViewProviderFactory()
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            return r0
    }

    private static java.lang.Object getWebViewProviderFactory() {
            java.lang.Class<android.webkit.WebView> r0 = android.webkit.WebView.class
            java.lang.String r1 = "getFactory"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L25
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L25
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L25
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L25
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L25
            return r0
        L17:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L1e:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L25:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }
}
