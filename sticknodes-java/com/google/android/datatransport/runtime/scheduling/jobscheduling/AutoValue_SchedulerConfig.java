package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* loaded from: classes.dex */
final class AutoValue_SchedulerConfig extends com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig {
    private final com.google.android.datatransport.runtime.time.Clock clock;
    private final java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> values;

    AutoValue_SchedulerConfig(com.google.android.datatransport.runtime.time.Clock r2, java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null clock"
            java.util.Objects.requireNonNull(r2, r0)
            r1.clock = r2
            java.lang.String r2 = "Null values"
            java.util.Objects.requireNonNull(r3, r2)
            r1.values = r3
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
            r2 = 0
            if (r1 == 0) goto L26
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r5 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig) r5
            com.google.android.datatransport.runtime.time.Clock r1 = r4.clock
            com.google.android.datatransport.runtime.time.Clock r3 = r5.getClock()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L24
            java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue> r1 = r4.values
            java.util.Map r5 = r5.getValues()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L24
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
        L26:
            return r2
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    com.google.android.datatransport.runtime.time.Clock getClock() {
            r1 = this;
            com.google.android.datatransport.runtime.time.Clock r0 = r1.clock
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> getValues() {
            r1 = this;
            java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue> r0 = r1.values
            return r0
    }

    public int hashCode() {
            r2 = this;
            com.google.android.datatransport.runtime.time.Clock r0 = r2.clock
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue> r1 = r2.values
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SchedulerConfig{clock="
            r0.append(r1)
            com.google.android.datatransport.runtime.time.Clock r1 = r2.clock
            r0.append(r1)
            java.lang.String r1 = ", values="
            r0.append(r1)
            java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue> r1 = r2.values
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
