package com.google.android.datatransport.runtime.firebase.transport;

/* loaded from: classes.dex */
public final class GlobalMetrics {
    private static final com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics DEFAULT_INSTANCE = null;
    private final com.google.android.datatransport.runtime.firebase.transport.StorageMetrics storage_metrics_;

    public static final class Builder {
        private com.google.android.datatransport.runtime.firebase.transport.StorageMetrics storage_metrics_;

        Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.storage_metrics_ = r0
                return
        }

        public com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics build() {
                r2 = this;
                com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics r0 = new com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics
                com.google.android.datatransport.runtime.firebase.transport.StorageMetrics r1 = r2.storage_metrics_
                r0.<init>(r1)
                return r0
        }

        public com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics.Builder setStorageMetrics(com.google.android.datatransport.runtime.firebase.transport.StorageMetrics r1) {
                r0 = this;
                r0.storage_metrics_ = r1
                return r0
        }
    }

    static {
            com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics$Builder r0 = new com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics$Builder
            r0.<init>()
            com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics r0 = r0.build()
            com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics.DEFAULT_INSTANCE = r0
            return
    }

    GlobalMetrics(com.google.android.datatransport.runtime.firebase.transport.StorageMetrics r1) {
            r0 = this;
            r0.<init>()
            r0.storage_metrics_ = r1
            return
    }

    public static com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics getDefaultInstance() {
            com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics r0 = com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics.DEFAULT_INSTANCE
            return r0
    }

    public static com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics.Builder newBuilder() {
            com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics$Builder r0 = new com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics$Builder
            r0.<init>()
            return r0
    }

    public com.google.android.datatransport.runtime.firebase.transport.StorageMetrics getStorageMetrics() {
            r1 = this;
            com.google.android.datatransport.runtime.firebase.transport.StorageMetrics r0 = r1.storage_metrics_
            if (r0 != 0) goto L8
            com.google.android.datatransport.runtime.firebase.transport.StorageMetrics r0 = com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.getDefaultInstance()
        L8:
            return r0
    }

    @com.google.firebase.encoders.proto.Protobuf(tag = 1)
    public com.google.android.datatransport.runtime.firebase.transport.StorageMetrics getStorageMetricsInternal() {
            r1 = this;
            com.google.android.datatransport.runtime.firebase.transport.StorageMetrics r0 = r1.storage_metrics_
            return r0
    }
}
