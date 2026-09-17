package com.google.android.datatransport.runtime.scheduling;

@com.google.android.datatransport.runtime.dagger.Module
/* loaded from: classes.dex */
public abstract class SchedulingConfigModule {
    public SchedulingConfigModule() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig config(@com.google.android.datatransport.runtime.time.WallTime com.google.android.datatransport.runtime.time.Clock r0) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.getDefault(r0)
            return r0
    }
}
