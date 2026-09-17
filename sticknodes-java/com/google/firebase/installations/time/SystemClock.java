package com.google.firebase.installations.time;

/* loaded from: classes2.dex */
public class SystemClock implements com.google.firebase.installations.time.Clock {
    private static com.google.firebase.installations.time.SystemClock singleton;

    private SystemClock() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.firebase.installations.time.SystemClock getInstance() {
            com.google.firebase.installations.time.SystemClock r0 = com.google.firebase.installations.time.SystemClock.singleton
            if (r0 != 0) goto Lb
            com.google.firebase.installations.time.SystemClock r0 = new com.google.firebase.installations.time.SystemClock
            r0.<init>()
            com.google.firebase.installations.time.SystemClock.singleton = r0
        Lb:
            com.google.firebase.installations.time.SystemClock r0 = com.google.firebase.installations.time.SystemClock.singleton
            return r0
    }

    @Override // com.google.firebase.installations.time.Clock
    public long currentTimeMillis() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            return r0
    }
}
