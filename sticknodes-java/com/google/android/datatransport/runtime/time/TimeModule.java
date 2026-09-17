package com.google.android.datatransport.runtime.time;

@com.google.android.datatransport.runtime.dagger.Module
/* loaded from: classes.dex */
public abstract class TimeModule {
    public TimeModule() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    @com.google.android.datatransport.runtime.time.WallTime
    static com.google.android.datatransport.runtime.time.Clock eventClock() {
            com.google.android.datatransport.runtime.time.WallTimeClock r0 = new com.google.android.datatransport.runtime.time.WallTimeClock
            r0.<init>()
            return r0
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    @com.google.android.datatransport.runtime.time.Monotonic
    static com.google.android.datatransport.runtime.time.Clock uptimeClock() {
            com.google.android.datatransport.runtime.time.UptimeClock r0 = new com.google.android.datatransport.runtime.time.UptimeClock
            r0.<init>()
            return r0
    }
}
