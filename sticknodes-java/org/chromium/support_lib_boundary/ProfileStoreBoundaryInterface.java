package org.chromium.support_lib_boundary;

/* loaded from: classes2.dex */
public interface ProfileStoreBoundaryInterface {
    boolean deleteProfile(java.lang.String r1);

    java.util.List<java.lang.String> getAllProfileNames();

    java.lang.reflect.InvocationHandler getOrCreateProfile(java.lang.String r1);

    java.lang.reflect.InvocationHandler getProfile(java.lang.String r1);
}
