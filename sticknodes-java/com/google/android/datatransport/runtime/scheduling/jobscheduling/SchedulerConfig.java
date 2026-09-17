package com.google.android.datatransport.runtime.scheduling.jobscheduling;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class SchedulerConfig {
    private static final long BACKOFF_LOG_BASE = 10000;
    private static final long ONE_SECOND = 1000;
    private static final long THIRTY_SECONDS = 30000;
    private static final long TWENTY_FOUR_HOURS = 86400000;

    public static class Builder {
        private com.google.android.datatransport.runtime.time.Clock clock;
        private java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> values;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.values = r0
                return
        }

        public com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Builder addConfig(com.google.android.datatransport.Priority r2, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue r3) {
                r1 = this;
                java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue> r0 = r1.values
                r0.put(r2, r3)
                return r1
        }

        public com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig build() {
                r2 = this;
                com.google.android.datatransport.runtime.time.Clock r0 = r2.clock
                java.lang.String r1 = "missing required property: clock"
                java.util.Objects.requireNonNull(r0, r1)
                java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue> r0 = r2.values
                java.util.Set r0 = r0.keySet()
                int r0 = r0.size()
                com.google.android.datatransport.Priority[] r1 = com.google.android.datatransport.Priority.values()
                int r1 = r1.length
                if (r0 < r1) goto L28
                java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue> r0 = r2.values
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r2.values = r1
                com.google.android.datatransport.runtime.time.Clock r1 = r2.clock
                com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.create(r1, r0)
                return r0
            L28:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Not all priorities have been configured"
                r0.<init>(r1)
                throw r0
        }

        public com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Builder setClock(com.google.android.datatransport.runtime.time.Clock r1) {
                r0 = this;
                r0.clock = r1
                return r0
        }
    }

    @com.google.auto.value.AutoValue
    public static abstract class ConfigValue {

        @com.google.auto.value.AutoValue.Builder
        public static abstract class Builder {
            public Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public abstract com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue build();

            public abstract com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder setDelta(long r1);

            public abstract com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder setFlags(java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> r1);

            public abstract com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder setMaxAllowedDelay(long r1);
        }

        public ConfigValue() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder builder() {
                com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue$Builder r0 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue$Builder
                r0.<init>()
                java.util.Set r1 = java.util.Collections.emptySet()
                com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue$Builder r0 = r0.setFlags(r1)
                return r0
        }

        abstract long getDelta();

        abstract java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> getFlags();

        abstract long getMaxAllowedDelay();
    }

    public enum Flag extends java.lang.Enum<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> {
        private static final /* synthetic */ com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag[] $VALUES = null;
        public static final com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag DEVICE_CHARGING = null;
        public static final com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag DEVICE_IDLE = null;
        public static final com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag NETWORK_UNMETERED = null;

        static {
                com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag r0 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag
                java.lang.String r1 = "NETWORK_UNMETERED"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag.NETWORK_UNMETERED = r0
                com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag r1 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag
                java.lang.String r3 = "DEVICE_IDLE"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag.DEVICE_IDLE = r1
                com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag r3 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag
                java.lang.String r5 = "DEVICE_CHARGING"
                r6 = 2
                r3.<init>(r5, r6)
                com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag.DEVICE_CHARGING = r3
                r5 = 3
                com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag[] r5 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag.$VALUES = r5
                return
        }

        Flag(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag> r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag r1 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag) r1
                return r1
        }

        public static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag[] values() {
                com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag[] r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag[] r0 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag[]) r0
                return r0
        }
    }

    public SchedulerConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    private long adjustedExponentialBackoff(int r7, long r8) {
            r6 = this;
            int r7 = r7 + (-1)
            r0 = 1
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto La
            r0 = r8
            goto Lc
        La:
            r0 = 2
        Lc:
            r2 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r2 = java.lang.Math.log(r2)
            long r4 = (long) r7
            long r0 = r0 * r4
            double r0 = (double) r0
            double r0 = java.lang.Math.log(r0)
            double r2 = r2 / r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = java.lang.Math.max(r0, r2)
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r4 = (double) r7
            double r2 = java.lang.Math.pow(r2, r4)
            double r7 = (double) r8
            double r2 = r2 * r7
            double r2 = r2 * r0
            long r7 = (long) r2
            return r7
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Builder builder() {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Builder r0 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Builder
            r0.<init>()
            return r0
    }

    static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig create(com.google.android.datatransport.runtime.time.Clock r1, java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> r2) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig r0 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig getDefault(com.google.android.datatransport.runtime.time.Clock r7) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Builder r0 = builder()
            com.google.android.datatransport.Priority r1 = com.google.android.datatransport.Priority.DEFAULT
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue$Builder r2 = com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.builder()
            r3 = 30000(0x7530, double:1.4822E-319)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue$Builder r2 = r2.setDelta(r3)
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue$Builder r2 = r2.setMaxAllowedDelay(r3)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue r2 = r2.build()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Builder r0 = r0.addConfig(r1, r2)
            com.google.android.datatransport.Priority r1 = com.google.android.datatransport.Priority.HIGHEST
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue$Builder r2 = com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.builder()
            r5 = 1000(0x3e8, double:4.94E-321)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue$Builder r2 = r2.setDelta(r5)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue$Builder r2 = r2.setMaxAllowedDelay(r3)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue r2 = r2.build()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Builder r0 = r0.addConfig(r1, r2)
            com.google.android.datatransport.Priority r1 = com.google.android.datatransport.Priority.VERY_LOW
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue$Builder r2 = com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.builder()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue$Builder r2 = r2.setDelta(r3)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue$Builder r2 = r2.setMaxAllowedDelay(r3)
            r3 = 1
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag[] r3 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag[r3]
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag r4 = com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag.DEVICE_IDLE
            r5 = 0
            r3[r5] = r4
            java.util.Set r3 = immutableSetOf(r3)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue$Builder r2 = r2.setFlags(r3)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue r2 = r2.build()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Builder r0 = r0.addConfig(r1, r2)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Builder r7 = r0.setClock(r7)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r7 = r7.build()
            return r7
    }

    private static <T> java.util.Set<T> immutableSetOf(T... r1) {
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r0)
            return r1
    }

    private void populateFlags(android.app.job.JobInfo.Builder r3, java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> r4) {
            r2 = this;
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag.NETWORK_UNMETERED
            boolean r0 = r4.contains(r0)
            r1 = 1
            if (r0 == 0) goto Le
            r0 = 2
            r3.setRequiredNetworkType(r0)
            goto L11
        Le:
            r3.setRequiredNetworkType(r1)
        L11:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag.DEVICE_CHARGING
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L1c
            r3.setRequiresCharging(r1)
        L1c:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag.DEVICE_IDLE
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L27
            r3.setRequiresDeviceIdle(r1)
        L27:
            return
    }

    public android.app.job.JobInfo.Builder configureJob(android.app.job.JobInfo.Builder r1, com.google.android.datatransport.Priority r2, long r3, int r5) {
            r0 = this;
            long r3 = r0.getScheduleDelay(r2, r3, r5)
            r1.setMinimumLatency(r3)
            java.util.Map r3 = r0.getValues()
            java.lang.Object r2 = r3.get(r2)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue r2 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue) r2
            java.util.Set r2 = r2.getFlags()
            r0.populateFlags(r1, r2)
            return r1
    }

    abstract com.google.android.datatransport.runtime.time.Clock getClock();

    public java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> getFlags(com.google.android.datatransport.Priority r2) {
            r1 = this;
            java.util.Map r0 = r1.getValues()
            java.lang.Object r2 = r0.get(r2)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue r2 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue) r2
            java.util.Set r2 = r2.getFlags()
            return r2
    }

    public long getScheduleDelay(com.google.android.datatransport.Priority r3, long r4, int r6) {
            r2 = this;
            com.google.android.datatransport.runtime.time.Clock r0 = r2.getClock()
            long r0 = r0.getTime()
            long r4 = r4 - r0
            java.util.Map r0 = r2.getValues()
            java.lang.Object r3 = r0.get(r3)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue r3 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue) r3
            long r0 = r3.getDelta()
            long r0 = r2.adjustedExponentialBackoff(r6, r0)
            long r4 = java.lang.Math.max(r0, r4)
            long r0 = r3.getMaxAllowedDelay()
            long r3 = java.lang.Math.min(r4, r0)
            return r3
    }

    abstract java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> getValues();
}
