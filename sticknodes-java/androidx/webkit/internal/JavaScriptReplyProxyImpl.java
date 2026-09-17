package androidx.webkit.internal;

/* loaded from: classes.dex */
public class JavaScriptReplyProxyImpl extends androidx.webkit.JavaScriptReplyProxy {
    private org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface mBoundaryInterface;


    public JavaScriptReplyProxyImpl(org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mBoundaryInterface = r1
            return
    }

    public static androidx.webkit.internal.JavaScriptReplyProxyImpl forInvocationHandler(java.lang.reflect.InvocationHandler r1) {
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r0 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r1 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r1)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r1 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r1
            androidx.webkit.internal.JavaScriptReplyProxyImpl$1 r0 = new androidx.webkit.internal.JavaScriptReplyProxyImpl$1
            r0.<init>(r1)
            java.lang.Object r1 = r1.getOrCreatePeer(r0)
            androidx.webkit.internal.JavaScriptReplyProxyImpl r1 = (androidx.webkit.internal.JavaScriptReplyProxyImpl) r1
            return r1
    }
}
