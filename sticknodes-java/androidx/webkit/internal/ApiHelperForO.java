package androidx.webkit.internal;

/* loaded from: classes.dex */
public class ApiHelperForO {
    public static android.content.pm.PackageInfo getCurrentWebViewPackage() {
            android.content.pm.PackageInfo r0 = android.webkit.WebView.getCurrentWebViewPackage()
            return r0
    }

    public static boolean getSafeBrowsingEnabled(android.webkit.WebSettings r0) {
            boolean r0 = r0.getSafeBrowsingEnabled()
            return r0
    }

    public static android.webkit.WebChromeClient getWebChromeClient(android.webkit.WebView r0) {
            android.webkit.WebChromeClient r0 = r0.getWebChromeClient()
            return r0
    }

    public static android.webkit.WebViewClient getWebViewClient(android.webkit.WebView r0) {
            android.webkit.WebViewClient r0 = r0.getWebViewClient()
            return r0
    }

    public static void setSafeBrowsingEnabled(android.webkit.WebSettings r0, boolean r1) {
            r0.setSafeBrowsingEnabled(r1)
            return
    }
}
