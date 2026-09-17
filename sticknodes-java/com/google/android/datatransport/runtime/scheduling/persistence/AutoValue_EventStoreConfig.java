package com.google.android.datatransport.runtime.scheduling.persistence;

/* loaded from: classes.dex */
final class AutoValue_EventStoreConfig extends com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig {
    private final int criticalSectionEnterTimeoutMs;
    private final long eventCleanUpAge;
    private final int loadBatchSize;
    private final int maxBlobByteSizePerRow;
    private final long maxStorageSizeInBytes;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder {
        private java.lang.Integer criticalSectionEnterTimeoutMs;
        private java.lang.Long eventCleanUpAge;
        private java.lang.Integer loadBatchSize;
        private java.lang.Integer maxBlobByteSizePerRow;
        private java.lang.Long maxStorageSizeInBytes;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig build() {
                r11 = this;
                java.lang.Long r0 = r11.maxStorageSizeInBytes
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " maxStorageSizeInBytes"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                java.lang.Integer r0 = r11.loadBatchSize
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " loadBatchSize"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                java.lang.Integer r0 = r11.criticalSectionEnterTimeoutMs
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " criticalSectionEnterTimeoutMs"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L41:
                java.lang.Long r0 = r11.eventCleanUpAge
                if (r0 != 0) goto L56
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " eventCleanUpAge"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L56:
                java.lang.Integer r0 = r11.maxBlobByteSizePerRow
                if (r0 != 0) goto L6b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " maxBlobByteSizePerRow"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L6b:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L97
                com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig r0 = new com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig
                java.lang.Long r1 = r11.maxStorageSizeInBytes
                long r3 = r1.longValue()
                java.lang.Integer r1 = r11.loadBatchSize
                int r5 = r1.intValue()
                java.lang.Integer r1 = r11.criticalSectionEnterTimeoutMs
                int r6 = r1.intValue()
                java.lang.Long r1 = r11.eventCleanUpAge
                long r7 = r1.longValue()
                java.lang.Integer r1 = r11.maxBlobByteSizePerRow
                int r9 = r1.intValue()
                r10 = 0
                r2 = r0
                r2.<init>(r3, r5, r6, r7, r9, r10)
                return r0
            L97:
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

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setCriticalSectionEnterTimeoutMs(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.criticalSectionEnterTimeoutMs = r1
                return r0
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setEventCleanUpAge(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.eventCleanUpAge = r1
                return r0
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setLoadBatchSize(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.loadBatchSize = r1
                return r0
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setMaxBlobByteSizePerRow(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.maxBlobByteSizePerRow = r1
                return r0
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setMaxStorageSizeInBytes(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.maxStorageSizeInBytes = r1
                return r0
        }
    }

    private AutoValue_EventStoreConfig(long r1, int r3, int r4, long r5, int r7) {
            r0 = this;
            r0.<init>()
            r0.maxStorageSizeInBytes = r1
            r0.loadBatchSize = r3
            r0.criticalSectionEnterTimeoutMs = r4
            r0.eventCleanUpAge = r5
            r0.maxBlobByteSizePerRow = r7
            return
    }

    /* synthetic */ AutoValue_EventStoreConfig(long r1, int r3, int r4, long r5, int r7, com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig.AnonymousClass1 r8) {
            r0 = this;
            r0.<init>(r1, r3, r4, r5, r7)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
            r2 = 0
            if (r1 == 0) goto L3a
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r8 = (com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig) r8
            long r3 = r7.maxStorageSizeInBytes
            long r5 = r8.getMaxStorageSizeInBytes()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L38
            int r1 = r7.loadBatchSize
            int r3 = r8.getLoadBatchSize()
            if (r1 != r3) goto L38
            int r1 = r7.criticalSectionEnterTimeoutMs
            int r3 = r8.getCriticalSectionEnterTimeoutMs()
            if (r1 != r3) goto L38
            long r3 = r7.eventCleanUpAge
            long r5 = r8.getEventCleanUpAge()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L38
            int r1 = r7.maxBlobByteSizePerRow
            int r8 = r8.getMaxBlobByteSizePerRow()
            if (r1 != r8) goto L38
            goto L39
        L38:
            r0 = 0
        L39:
            return r0
        L3a:
            return r2
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    int getCriticalSectionEnterTimeoutMs() {
            r1 = this;
            int r0 = r1.criticalSectionEnterTimeoutMs
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    long getEventCleanUpAge() {
            r2 = this;
            long r0 = r2.eventCleanUpAge
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    int getLoadBatchSize() {
            r1 = this;
            int r0 = r1.loadBatchSize
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    int getMaxBlobByteSizePerRow() {
            r1 = this;
            int r0 = r1.maxBlobByteSizePerRow
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    long getMaxStorageSizeInBytes() {
            r2 = this;
            long r0 = r2.maxStorageSizeInBytes
            return r0
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.maxStorageSizeInBytes
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            int r3 = r7.loadBatchSize
            r1 = r1 ^ r3
            int r1 = r1 * r0
            int r3 = r7.criticalSectionEnterTimeoutMs
            r1 = r1 ^ r3
            int r1 = r1 * r0
            long r3 = r7.eventCleanUpAge
            long r5 = r3 >>> r2
            long r2 = r5 ^ r3
            int r3 = (int) r2
            r1 = r1 ^ r3
            int r1 = r1 * r0
            int r0 = r7.maxBlobByteSizePerRow
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "EventStoreConfig{maxStorageSizeInBytes="
            r0.append(r1)
            long r1 = r3.maxStorageSizeInBytes
            r0.append(r1)
            java.lang.String r1 = ", loadBatchSize="
            r0.append(r1)
            int r1 = r3.loadBatchSize
            r0.append(r1)
            java.lang.String r1 = ", criticalSectionEnterTimeoutMs="
            r0.append(r1)
            int r1 = r3.criticalSectionEnterTimeoutMs
            r0.append(r1)
            java.lang.String r1 = ", eventCleanUpAge="
            r0.append(r1)
            long r1 = r3.eventCleanUpAge
            r0.append(r1)
            java.lang.String r1 = ", maxBlobByteSizePerRow="
            r0.append(r1)
            int r1 = r3.maxBlobByteSizePerRow
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
