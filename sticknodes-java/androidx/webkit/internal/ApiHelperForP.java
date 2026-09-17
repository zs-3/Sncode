package androidx.webkit.internal;

/* loaded from: classes.dex */
public class ApiHelperForP {
    public static android.webkit.TracingController getTracingControllerInstance() {
            android.webkit.TracingController r0 = android.webkit.TracingController.getInstance()
            return r0
    }

    public static java.lang.ClassLoader getWebViewClassLoader() {
            java.lang.ClassLoader r0 = android.webkit.WebView.getWebViewClassLoader()
            return r0
    }

    public static android.os.Looper getWebViewLooper(android.webkit.WebView r0) {
            android.os.Looper r0 = r0.getWebViewLooper()
            return r0
    }

    public static boolean isTracing(android.webkit.TracingController r0) {
            boolean r0 = r0.isTracing()
            return r0
    }

    public static void setDataDirectorySuffix(java.lang.String r0) {
            android.webkit.WebView.setDataDirectorySuffix(r0)
            return
    }

    public static void start(android.webkit.TracingController r0, androidx.webkit.TracingConfig r1) {
            android.webkit.TracingConfig$Builder r0 = new android.webkit.TracingConfig$Builder
            r0.<init>()
            r0 = 0
            throw r0
    }

    public static boolean stop(android.webkit.TracingController r0, java.io.OutputStream r1, java.util.concurrent.Executor r2) {
            boolean r0 = r0.stop(r1, r2)
            return r0
    }
}
