package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public class SystemCurrentTimeProvider implements com.google.firebase.crashlytics.internal.common.CurrentTimeProvider {
    public SystemCurrentTimeProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.firebase.crashlytics.internal.common.CurrentTimeProvider
    public long getCurrentTimeMillis() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            return r0
    }
}
