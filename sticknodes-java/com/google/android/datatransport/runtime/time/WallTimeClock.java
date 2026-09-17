package com.google.android.datatransport.runtime.time;

/* loaded from: classes.dex */
public class WallTimeClock implements com.google.android.datatransport.runtime.time.Clock {
    public WallTimeClock() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            return r0
    }
}
