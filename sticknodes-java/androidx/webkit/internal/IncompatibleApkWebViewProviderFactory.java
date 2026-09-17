package androidx.webkit.internal;

/* loaded from: classes.dex */
public class IncompatibleApkWebViewProviderFactory implements androidx.webkit.internal.WebViewProviderFactory {
    private static final java.lang.String[] EMPTY_STRING_ARRAY = null;

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            androidx.webkit.internal.IncompatibleApkWebViewProviderFactory.EMPTY_STRING_ARRAY = r0
            return
    }

    public IncompatibleApkWebViewProviderFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface createWebView(android.webkit.WebView r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.StaticsBoundaryInterface getStatics() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public java.lang.String[] getWebViewFeatures() {
            r1 = this;
            java.lang.String[] r0 = androidx.webkit.internal.IncompatibleApkWebViewProviderFactory.EMPTY_STRING_ARRAY
            return r0
    }
}
