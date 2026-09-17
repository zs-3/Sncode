package com.google.android.datatransport.runtime.firebase.transport;

/* loaded from: classes.dex */
public final class StorageMetrics {
    private static final com.google.android.datatransport.runtime.firebase.transport.StorageMetrics DEFAULT_INSTANCE = null;
    private final long current_cache_size_bytes_;
    private final long max_cache_size_bytes_;

    public static final class Builder {
        private long current_cache_size_bytes_;
        private long max_cache_size_bytes_;

        Builder() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.current_cache_size_bytes_ = r0
                r2.max_cache_size_bytes_ = r0
                return
        }

        public com.google.android.datatransport.runtime.firebase.transport.StorageMetrics build() {
                r5 = this;
                com.google.android.datatransport.runtime.firebase.transport.StorageMetrics r0 = new com.google.android.datatransport.runtime.firebase.transport.StorageMetrics
                long r1 = r5.current_cache_size_bytes_
                long r3 = r5.max_cache_size_bytes_
                r0.<init>(r1, r3)
                return r0
        }

        public com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.Builder setCurrentCacheSizeBytes(long r1) {
                r0 = this;
                r0.current_cache_size_bytes_ = r1
                return r0
        }

        public com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.Builder setMaxCacheSizeBytes(long r1) {
                r0 = this;
                r0.max_cache_size_bytes_ = r1
                return r0
        }
    }

    static {
            com.google.android.datatransport.runtime.firebase.transport.StorageMetrics$Builder r0 = new com.google.android.datatransport.runtime.firebase.transport.StorageMetrics$Builder
            r0.<init>()
            com.google.android.datatransport.runtime.firebase.transport.StorageMetrics r0 = r0.build()
            com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.DEFAULT_INSTANCE = r0
            return
    }

    StorageMetrics(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.current_cache_size_bytes_ = r1
            r0.max_cache_size_bytes_ = r3
            return
    }

    public static com.google.android.datatransport.runtime.firebase.transport.StorageMetrics getDefaultInstance() {
            com.google.android.datatransport.runtime.firebase.transport.StorageMetrics r0 = com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.DEFAULT_INSTANCE
            return r0
    }

    public static com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.Builder newBuilder() {
            com.google.android.datatransport.runtime.firebase.transport.StorageMetrics$Builder r0 = new com.google.android.datatransport.runtime.firebase.transport.StorageMetrics$Builder
            r0.<init>()
            return r0
    }

    @com.google.firebase.encoders.proto.Protobuf(tag = 1)
    public long getCurrentCacheSizeBytes() {
            r2 = this;
            long r0 = r2.current_cache_size_bytes_
            return r0
    }

    @com.google.firebase.encoders.proto.Protobuf(tag = 2)
    public long getMaxCacheSizeBytes() {
            r2 = this;
            long r0 = r2.max_cache_size_bytes_
            return r0
    }
}
