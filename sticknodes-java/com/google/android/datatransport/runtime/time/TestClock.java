package com.google.android.datatransport.runtime.time;

/* loaded from: classes.dex */
public class TestClock implements com.google.android.datatransport.runtime.time.Clock {
    private final java.util.concurrent.atomic.AtomicLong timestamp;

    public TestClock(long r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>(r2)
            r1.timestamp = r0
            return
    }

    public void advance(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto Lc
            java.util.concurrent.atomic.AtomicLong r0 = r3.timestamp
            r0.addAndGet(r4)
            return
        Lc:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "cannot advance time backwards."
            r4.<init>(r5)
            throw r4
    }

    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.timestamp
            long r0 = r0.get()
            return r0
    }

    public void tick() {
            r2 = this;
            r0 = 1
            r2.advance(r0)
            return
    }
}
