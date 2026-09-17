package com.google.android.datatransport.runtime.time;

/* loaded from: classes.dex */
public class UptimeClock implements com.google.android.datatransport.runtime.time.Clock {
    public UptimeClock() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
            r2 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            return r0
    }
}
