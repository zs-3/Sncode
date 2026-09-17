package androidx.webkit.internal;

/* loaded from: classes.dex */
public class WebViewProviderFactoryAdapter implements androidx.webkit.internal.WebViewProviderFactory {
    final org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface mImpl;

    public WebViewProviderFactoryAdapter(org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface createWebView(android.webkit.WebView r3) {
            r2 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface.class
            org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r1 = r2.mImpl
            java.lang.reflect.InvocationHandler r3 = r1.createWebView(r3)
            java.lang.Object r3 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r3)
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r3 = (org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface) r3
            return r3
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.StaticsBoundaryInterface getStatics() {
            r2 = this;
            java.lang.Class<org.chromium.support_lib_boundary.StaticsBoundaryInterface> r0 = org.chromium.support_lib_boundary.StaticsBoundaryInterface.class
            org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r1 = r2.mImpl
            java.lang.reflect.InvocationHandler r1 = r1.getStatics()
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r1)
            org.chromium.support_lib_boundary.StaticsBoundaryInterface r0 = (org.chromium.support_lib_boundary.StaticsBoundaryInterface) r0
            return r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public java.lang.String[] getWebViewFeatures() {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r0 = r1.mImpl
            java.lang.String[] r0 = r0.getSupportedFeatures()
            return r0
    }
}
