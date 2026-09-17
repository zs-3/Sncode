package androidx.work.impl;

/* loaded from: classes.dex */
public interface Scheduler {
    void cancel(java.lang.String r1);

    boolean hasLimitedSchedulingSlots();

    void schedule(androidx.work.impl.model.WorkSpec... r1);
}
