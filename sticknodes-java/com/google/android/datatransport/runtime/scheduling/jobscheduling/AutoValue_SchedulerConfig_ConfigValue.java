package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* loaded from: classes.dex */
final class AutoValue_SchedulerConfig_ConfigValue extends com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue {
    private final long delta;
    private final java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> flags;
    private final long maxAllowedDelay;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder {
        private java.lang.Long delta;
        private java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> flags;
        private java.lang.Long maxAllowedDelay;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue build() {
                r9 = this;
                java.lang.Long r0 = r9.delta
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " delta"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                java.lang.Long r0 = r9.maxAllowedDelay
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " maxAllowedDelay"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag> r0 = r9.flags
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " flags"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L41:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L5d
                com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue r0 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue
                java.lang.Long r1 = r9.delta
                long r3 = r1.longValue()
                java.lang.Long r1 = r9.maxAllowedDelay
                long r5 = r1.longValue()
                java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag> r7 = r9.flags
                r8 = 0
                r2 = r0
                r2.<init>(r3, r5, r7, r8)
                return r0
            L5d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Missing required properties:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder setDelta(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.delta = r1
                return r0
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder setFlags(java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> r2) {
                r1 = this;
                java.lang.String r0 = "Null flags"
                java.util.Objects.requireNonNull(r2, r0)
                r1.flags = r2
                return r1
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder setMaxAllowedDelay(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.maxAllowedDelay = r1
                return r0
        }
    }

    private AutoValue_SchedulerConfig_ConfigValue(long r1, long r3, java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> r5) {
            r0 = this;
            r0.<init>()
            r0.delta = r1
            r0.maxAllowedDelay = r3
            r0.flags = r5
            return
    }

    /* synthetic */ AutoValue_SchedulerConfig_ConfigValue(long r1, long r3, java.util.Set r5, com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue.AnonymousClass1 r6) {
            r0 = this;
            r0.<init>(r1, r3, r5)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
            r2 = 0
            if (r1 == 0) goto L2e
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue r8 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue) r8
            long r3 = r7.delta
            long r5 = r8.getDelta()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2c
            long r3 = r7.maxAllowedDelay
            long r5 = r8.getMaxAllowedDelay()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2c
            java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag> r1 = r7.flags
            java.util.Set r8 = r8.getFlags()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L2c
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
        L2e:
            return r2
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    long getDelta() {
            r2 = this;
            long r0 = r2.delta
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> getFlags() {
            r1 = this;
            java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag> r0 = r1.flags
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    long getMaxAllowedDelay() {
            r2 = this;
            long r0 = r2.maxAllowedDelay
            return r0
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.delta
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            long r3 = r7.maxAllowedDelay
            long r5 = r3 >>> r2
            long r2 = r5 ^ r3
            int r3 = (int) r2
            r1 = r1 ^ r3
            int r1 = r1 * r0
            java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag> r0 = r7.flags
            int r0 = r0.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ConfigValue{delta="
            r0.append(r1)
            long r1 = r3.delta
            r0.append(r1)
            java.lang.String r1 = ", maxAllowedDelay="
            r0.append(r1)
            long r1 = r3.maxAllowedDelay
            r0.append(r1)
            java.lang.String r1 = ", flags="
            r0.append(r1)
            java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag> r1 = r3.flags
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
