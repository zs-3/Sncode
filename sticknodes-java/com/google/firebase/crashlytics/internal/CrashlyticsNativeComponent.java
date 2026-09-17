package com.google.firebase.crashlytics.internal;

/* loaded from: classes2.dex */
public interface CrashlyticsNativeComponent {
    com.google.firebase.crashlytics.internal.NativeSessionFileProvider getSessionFileProvider(java.lang.String r1);

    boolean hasCrashDataForCurrentSession();

    boolean hasCrashDataForSession(java.lang.String r1);

    void prepareNativeSession(java.lang.String r1, java.lang.String r2, long r3, com.google.firebase.crashlytics.internal.model.StaticSessionData r5);
}
