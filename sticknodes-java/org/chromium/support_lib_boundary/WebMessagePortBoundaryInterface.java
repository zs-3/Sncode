package org.chromium.support_lib_boundary;

/* loaded from: classes2.dex */
public interface WebMessagePortBoundaryInterface {
    void close();

    void postMessage(java.lang.reflect.InvocationHandler r1);

    void setWebMessageCallback(java.lang.reflect.InvocationHandler r1);

    void setWebMessageCallback(java.lang.reflect.InvocationHandler r1, android.os.Handler r2);
}
