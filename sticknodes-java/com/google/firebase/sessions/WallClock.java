package com.google.firebase.sessions;

/* compiled from: TimeProvider.kt */
/* loaded from: classes2.dex */
public final class WallClock implements com.google.firebase.sessions.TimeProvider {
    public static final com.google.firebase.sessions.WallClock INSTANCE = null;

    static {
            com.google.firebase.sessions.WallClock r0 = new com.google.firebase.sessions.WallClock
            r0.<init>()
            com.google.firebase.sessions.WallClock.INSTANCE = r0
            return
    }

    private WallClock() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.firebase.sessions.TimeProvider
    public long currentTimeUs() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            return r0
    }
}
