package com.google.android.datatransport.runtime.time;

@com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata({"com.google.android.datatransport.runtime.time.Monotonic"})
@com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata
@com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated
/* loaded from: classes.dex */
public final class TimeModule_UptimeClockFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.time.Clock> {

    private static final class InstanceHolder {
        private static final com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory INSTANCE = null;

        static {
                com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory r0 = new com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory
                r0.<init>()
                com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory.InstanceHolder.INSTANCE = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory access$000() {
                com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory r0 = com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory.InstanceHolder.INSTANCE
                return r0
        }
    }

    public TimeModule_UptimeClockFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory create() {
            com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory r0 = com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory.InstanceHolder.access$000()
            return r0
    }

    public static com.google.android.datatransport.runtime.time.Clock uptimeClock() {
            com.google.android.datatransport.runtime.time.Clock r0 = com.google.android.datatransport.runtime.time.TimeModule.uptimeClock()
            java.lang.Object r0 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNullFromProvides(r0)
            com.google.android.datatransport.runtime.time.Clock r0 = (com.google.android.datatransport.runtime.time.Clock) r0
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public com.google.android.datatransport.runtime.time.Clock get() {
            r1 = this;
            com.google.android.datatransport.runtime.time.Clock r0 = uptimeClock()
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            com.google.android.datatransport.runtime.time.Clock r0 = r1.get()
            return r0
    }
}
