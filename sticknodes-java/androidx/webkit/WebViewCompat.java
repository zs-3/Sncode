package androidx.webkit;

/* loaded from: classes.dex */
public class WebViewCompat {
    private static final android.net.Uri EMPTY_URI = null;
    private static final android.net.Uri WILDCARD_URI = null;

    public interface WebMessageListener {
        void onPostMessage(android.webkit.WebView r1, androidx.webkit.WebMessageCompat r2, android.net.Uri r3, boolean r4, androidx.webkit.JavaScriptReplyProxy r5);
    }

    static {
            java.lang.String r0 = "*"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            androidx.webkit.WebViewCompat.WILDCARD_URI = r0
            java.lang.String r0 = ""
            android.net.Uri r0 = android.net.Uri.parse(r0)
            androidx.webkit.WebViewCompat.EMPTY_URI = r0
            return
    }

    public static void addWebMessageListener(android.webkit.WebView r1, java.lang.String r2, java.util.Set<java.lang.String> r3, androidx.webkit.WebViewCompat.WebMessageListener r4) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_LISTENER
            boolean r0 = r0.isSupportedByWebView()
            if (r0 == 0) goto L19
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r1)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r1.addWebMessageListener(r2, r3, r4)
            return
        L19:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    private static org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface createProvider(android.webkit.WebView r1) {
            androidx.webkit.internal.WebViewProviderFactory r0 = getFactory()
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r1 = r0.createWebView(r1)
            return r1
    }

    public static android.content.pm.PackageInfo getCurrentLoadedWebViewPackage() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.content.pm.PackageInfo r0 = androidx.webkit.internal.ApiHelperForO.getCurrentWebViewPackage()
            return r0
        Lb:
            android.content.pm.PackageInfo r0 = getLoadedWebViewPackageInfo()     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r0 = 0
            return r0
    }

    private static androidx.webkit.internal.WebViewProviderFactory getFactory() {
            androidx.webkit.internal.WebViewProviderFactory r0 = androidx.webkit.internal.WebViewGlueCommunicator.getFactory()
            return r0
    }

    @android.annotation.SuppressLint({"PrivateApi"})
    private static android.content.pm.PackageInfo getLoadedWebViewPackageInfo() throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
            java.lang.String r0 = "android.webkit.WebViewFactory"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.String r3 = "getLoadedPackageInfo"
            java.lang.reflect.Method r0 = r0.getMethod(r3, r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Object r0 = r0.invoke(r2, r1)
            android.content.pm.PackageInfo r0 = (android.content.pm.PackageInfo) r0
            return r0
    }

    private static androidx.webkit.internal.WebViewProviderAdapter getProvider(android.webkit.WebView r1) {
            androidx.webkit.internal.WebViewProviderAdapter r0 = new androidx.webkit.internal.WebViewProviderAdapter
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r1 = createProvider(r1)
            r0.<init>(r1)
            return r0
    }

    public static android.webkit.WebViewClient getWebViewClient(android.webkit.WebView r2) {
            androidx.webkit.internal.ApiFeature$O r0 = androidx.webkit.internal.WebViewFeatureInternal.GET_WEB_VIEW_CLIENT
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto Ld
            android.webkit.WebViewClient r2 = androidx.webkit.internal.ApiHelperForO.getWebViewClient(r2)
            return r2
        Ld:
            boolean r0 = r0.isSupportedByWebView()
            if (r0 == 0) goto L1c
            androidx.webkit.internal.WebViewProviderAdapter r2 = getProvider(r2)
            android.webkit.WebViewClient r2 = r2.getWebViewClient()
            return r2
        L1c:
            java.lang.UnsupportedOperationException r2 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r2
    }

    public static boolean isMultiProcessEnabled() {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROCESS
            boolean r0 = r0.isSupportedByWebView()
            if (r0 == 0) goto L15
            androidx.webkit.internal.WebViewProviderFactory r0 = getFactory()
            org.chromium.support_lib_boundary.StaticsBoundaryInterface r0 = r0.getStatics()
            boolean r0 = r0.isMultiProcessEnabled()
            return r0
        L15:
            java.lang.UnsupportedOperationException r0 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r0
    }

    public static void removeWebMessageListener(android.webkit.WebView r1, java.lang.String r2) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_LISTENER
            boolean r0 = r0.isSupportedByWebView()
            if (r0 == 0) goto L10
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r1)
            r1.removeWebMessageListener(r2)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setAudioMuted(android.webkit.WebView r1, boolean r2) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.MUTE_AUDIO
            boolean r0 = r0.isSupportedByWebView()
            if (r0 == 0) goto L10
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r1)
            r1.setAudioMuted(r2)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }
}
