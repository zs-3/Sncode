package androidx.webkit.internal;

/* loaded from: classes.dex */
public class WebMessagePortImpl extends androidx.webkit.WebMessagePortCompat {
    private org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface mBoundaryInterface;

    public WebMessagePortImpl(java.lang.reflect.InvocationHandler r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class
            java.lang.Object r2 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r2)
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r2 = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) r2
            r1.mBoundaryInterface = r2
            return
    }
}
