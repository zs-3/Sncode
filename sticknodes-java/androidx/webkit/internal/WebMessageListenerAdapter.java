package androidx.webkit.internal;

/* loaded from: classes.dex */
public class WebMessageListenerAdapter implements org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface {
    private androidx.webkit.WebViewCompat.WebMessageListener mWebMessageListener;

    public WebMessageListenerAdapter(androidx.webkit.WebViewCompat.WebMessageListener r1) {
            r0 = this;
            r0.<init>()
            r0.mWebMessageListener = r1
            return
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
            r2 = this;
            java.lang.String r0 = "WEB_MESSAGE_LISTENER"
            java.lang.String r1 = "WEB_MESSAGE_ARRAY_BUFFER"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            return r0
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(android.webkit.WebView r7, java.lang.reflect.InvocationHandler r8, android.net.Uri r9, boolean r10, java.lang.reflect.InvocationHandler r11) {
            r6 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r8 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r8)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r8 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r8
            androidx.webkit.WebMessageCompat r2 = androidx.webkit.internal.WebMessageAdapter.webMessageCompatFromBoundaryInterface(r8)
            if (r2 == 0) goto L1a
            androidx.webkit.internal.JavaScriptReplyProxyImpl r5 = androidx.webkit.internal.JavaScriptReplyProxyImpl.forInvocationHandler(r11)
            androidx.webkit.WebViewCompat$WebMessageListener r0 = r6.mWebMessageListener
            r1 = r7
            r3 = r9
            r4 = r10
            r0.onPostMessage(r1, r2, r3, r4, r5)
        L1a:
            return
    }
}
