package androidx.webkit.internal;

/* loaded from: classes.dex */
public class WebMessageAdapter implements org.chromium.support_lib_boundary.WebMessageBoundaryInterface {
    private static final java.lang.String[] sFeatures = null;

    static {
            java.lang.String r0 = "WEB_MESSAGE_ARRAY_BUFFER"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            androidx.webkit.internal.WebMessageAdapter.sFeatures = r0
            return
    }

    private static androidx.webkit.WebMessagePortCompat[] toWebMessagePortCompats(java.lang.reflect.InvocationHandler[] r4) {
            int r0 = r4.length
            androidx.webkit.WebMessagePortCompat[] r0 = new androidx.webkit.WebMessagePortCompat[r0]
            r1 = 0
        L4:
            int r2 = r4.length
            if (r1 >= r2) goto L13
            androidx.webkit.internal.WebMessagePortImpl r2 = new androidx.webkit.internal.WebMessagePortImpl
            r3 = r4[r1]
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L13:
            return r0
    }

    public static androidx.webkit.WebMessageCompat webMessageCompatFromBoundaryInterface(org.chromium.support_lib_boundary.WebMessageBoundaryInterface r3) {
            java.lang.reflect.InvocationHandler[] r0 = r3.getPorts()
            androidx.webkit.WebMessagePortCompat[] r0 = toWebMessagePortCompats(r0)
            androidx.webkit.internal.ApiFeature$NoFramework r1 = androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER
            boolean r1 = r1.isSupportedByWebView()
            if (r1 == 0) goto L3b
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r1 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r3 = r3.getMessagePayload()
            java.lang.Object r3 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r1, r3)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r3 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r3
            int r1 = r3.getType()
            if (r1 == 0) goto L31
            r2 = 1
            if (r1 == r2) goto L27
            r3 = 0
            return r3
        L27:
            androidx.webkit.WebMessageCompat r1 = new androidx.webkit.WebMessageCompat
            byte[] r3 = r3.getAsArrayBuffer()
            r1.<init>(r3, r0)
            return r1
        L31:
            androidx.webkit.WebMessageCompat r1 = new androidx.webkit.WebMessageCompat
            java.lang.String r3 = r3.getAsString()
            r1.<init>(r3, r0)
            return r1
        L3b:
            androidx.webkit.WebMessageCompat r1 = new androidx.webkit.WebMessageCompat
            java.lang.String r3 = r3.getData()
            r1.<init>(r3, r0)
            return r1
    }
}
