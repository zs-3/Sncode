package androidx.webkit.internal;

/* loaded from: classes.dex */
public class WebViewProviderAdapter {
    org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface mImpl;

    public WebViewProviderAdapter(org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    public void addWebMessageListener(java.lang.String r3, java.lang.String[] r4, androidx.webkit.WebViewCompat.WebMessageListener r5) {
            r2 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r2.mImpl
            androidx.webkit.internal.WebMessageListenerAdapter r1 = new androidx.webkit.internal.WebMessageListenerAdapter
            r1.<init>(r5)
            java.lang.reflect.InvocationHandler r5 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r1)
            r0.addWebMessageListener(r3, r4, r5)
            return
    }

    public android.webkit.WebViewClient getWebViewClient() {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r1.mImpl
            android.webkit.WebViewClient r0 = r0.getWebViewClient()
            return r0
    }

    public void removeWebMessageListener(java.lang.String r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r1.mImpl
            r0.removeWebMessageListener(r2)
            return
    }

    public void setAudioMuted(boolean r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r1.mImpl
            r0.setAudioMuted(r2)
            return
    }
}
