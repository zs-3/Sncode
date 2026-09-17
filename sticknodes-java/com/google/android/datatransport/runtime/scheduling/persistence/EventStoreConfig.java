package com.google.android.datatransport.runtime.scheduling.persistence;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
abstract class EventStoreConfig {
    static final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig DEFAULT = null;
    private static final long DURATION_ONE_WEEK_MS = 604800000;
    private static final int LOAD_BATCH_SIZE = 200;
    private static final int LOCK_TIME_OUT_MS = 10000;
    private static final int MAX_BLOB_BYTE_SIZE_PER_ROW = 81920;
    private static final long MAX_DB_STORAGE_SIZE_IN_BYTES = 10485760;

    @com.google.auto.value.AutoValue.Builder
    static abstract class Builder {
        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig build();

        abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setCriticalSectionEnterTimeoutMs(int r1);

        abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setEventCleanUpAge(long r1);

        abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setLoadBatchSize(int r1);

        abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setMaxBlobByteSizePerRow(int r1);

        abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setMaxStorageSizeInBytes(long r1);
    }

    static {
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig$Builder r0 = builder()
            r1 = 10485760(0xa00000, double:5.180654E-317)
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig$Builder r0 = r0.setMaxStorageSizeInBytes(r1)
            r1 = 200(0xc8, float:2.8E-43)
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig$Builder r0 = r0.setLoadBatchSize(r1)
            r1 = 10000(0x2710, float:1.4013E-41)
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig$Builder r0 = r0.setCriticalSectionEnterTimeoutMs(r1)
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig$Builder r0 = r0.setEventCleanUpAge(r1)
            r1 = 81920(0x14000, float:1.14794E-40)
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig$Builder r0 = r0.setMaxBlobByteSizePerRow(r1)
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r0 = r0.build()
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.DEFAULT = r0
            return
    }

    EventStoreConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder builder() {
            com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig$Builder r0 = new com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig$Builder
            r0.<init>()
            return r0
    }

    abstract int getCriticalSectionEnterTimeoutMs();

    abstract long getEventCleanUpAge();

    abstract int getLoadBatchSize();

    abstract int getMaxBlobByteSizePerRow();

    abstract long getMaxStorageSizeInBytes();

    com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder toBuilder() {
            r3 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig$Builder r0 = builder()
            long r1 = r3.getMaxStorageSizeInBytes()
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig$Builder r0 = r0.setMaxStorageSizeInBytes(r1)
            int r1 = r3.getLoadBatchSize()
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig$Builder r0 = r0.setLoadBatchSize(r1)
            int r1 = r3.getCriticalSectionEnterTimeoutMs()
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig$Builder r0 = r0.setCriticalSectionEnterTimeoutMs(r1)
            long r1 = r3.getEventCleanUpAge()
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig$Builder r0 = r0.setEventCleanUpAge(r1)
            int r1 = r3.getMaxBlobByteSizePerRow()
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig$Builder r0 = r0.setMaxBlobByteSizePerRow(r1)
            return r0
    }
}
