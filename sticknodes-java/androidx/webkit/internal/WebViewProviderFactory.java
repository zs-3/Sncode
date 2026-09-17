package androidx.webkit.internal;

/* loaded from: classes.dex */
public interface WebViewProviderFactory {
    org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface createWebView(android.webkit.WebView r1);

    org.chromium.support_lib_boundary.StaticsBoundaryInterface getStatics();

    java.lang.String[] getWebViewFeatures();
}
