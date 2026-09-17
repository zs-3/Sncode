package com.google.android.datatransport.runtime.scheduling;

@com.google.android.datatransport.runtime.dagger.Module
/* loaded from: classes.dex */
public abstract class SchedulingModule {
    public SchedulingModule() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    static com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler(android.content.Context r0, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r1, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r2, @com.google.android.datatransport.runtime.time.Monotonic com.google.android.datatransport.runtime.time.Clock r3) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler r3 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler
            r3.<init>(r0, r1, r2)
            return r3
    }

    @com.google.android.datatransport.runtime.dagger.Binds
    abstract com.google.android.datatransport.runtime.scheduling.Scheduler scheduler(com.google.android.datatransport.runtime.scheduling.DefaultScheduler r1);
}
