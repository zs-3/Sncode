package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public final class OnDemandCounter {
    private final java.util.concurrent.atomic.AtomicInteger droppedOnDemandExceptions;
    private final java.util.concurrent.atomic.AtomicInteger recordedOnDemandExceptions;

    public OnDemandCounter() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.recordedOnDemandExceptions = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.droppedOnDemandExceptions = r0
            return
    }

    public void incrementDroppedOnDemandExceptions() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.droppedOnDemandExceptions
            r0.getAndIncrement()
            return
    }

    public void incrementRecordedOnDemandExceptions() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.recordedOnDemandExceptions
            r0.getAndIncrement()
            return
    }

    public void resetDroppedOnDemandExceptions() {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.droppedOnDemandExceptions
            r1 = 0
            r0.set(r1)
            return
    }
}
