package org.chromium.support_lib_boundary;

/* loaded from: classes2.dex */
public interface WebViewProviderFactoryBoundaryInterface {
    java.lang.reflect.InvocationHandler createWebView(android.webkit.WebView r1);

    java.lang.reflect.InvocationHandler getDropDataProvider();

    java.lang.reflect.InvocationHandler getProfileStore();

    java.lang.reflect.InvocationHandler getProxyController();

    java.lang.reflect.InvocationHandler getServiceWorkerController();

    java.lang.reflect.InvocationHandler getStatics();

    java.lang.String[] getSupportedFeatures();

    java.lang.reflect.InvocationHandler getTracingController();

    java.lang.reflect.InvocationHandler getWebkitToCompatConverter();
}
