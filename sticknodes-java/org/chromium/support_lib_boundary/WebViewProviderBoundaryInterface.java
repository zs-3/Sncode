package org.chromium.support_lib_boundary;

/* loaded from: classes2.dex */
public interface WebViewProviderBoundaryInterface {
    java.lang.reflect.InvocationHandler addDocumentStartJavaScript(java.lang.String r1, java.lang.String[] r2);

    void addWebMessageListener(java.lang.String r1, java.lang.String[] r2, java.lang.reflect.InvocationHandler r3);

    java.lang.reflect.InvocationHandler[] createWebMessageChannel();

    java.lang.reflect.InvocationHandler getProfile();

    android.webkit.WebChromeClient getWebChromeClient();

    android.webkit.WebViewClient getWebViewClient();

    java.lang.reflect.InvocationHandler getWebViewRenderer();

    java.lang.reflect.InvocationHandler getWebViewRendererClient();

    void insertVisualStateCallback(long r1, java.lang.reflect.InvocationHandler r3);

    boolean isAudioMuted();

    void postMessageToMainFrame(java.lang.reflect.InvocationHandler r1, android.net.Uri r2);

    void removeWebMessageListener(java.lang.String r1);

    void setAudioMuted(boolean r1);

    void setProfile(java.lang.String r1);

    void setWebViewRendererClient(java.lang.reflect.InvocationHandler r1);
}
