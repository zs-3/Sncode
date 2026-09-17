package com.google.android.datatransport.runtime.firebase.transport;

/* loaded from: classes.dex */
public final class LogSourceMetrics {
    private static final com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics DEFAULT_INSTANCE = null;
    private final java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped> log_event_dropped_;
    private final java.lang.String log_source_;

    public static final class Builder {
        private java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped> log_event_dropped_;
        private java.lang.String log_source_;

        Builder() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ""
                r1.log_source_ = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.log_event_dropped_ = r0
                return
        }

        public com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics.Builder addLogEventDropped(com.google.android.datatransport.runtime.firebase.transport.LogEventDropped r2) {
                r1 = this;
                java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped> r0 = r1.log_event_dropped_
                r0.add(r2)
                return r1
        }

        public com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics build() {
                r3 = this;
                com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics r0 = new com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics
                java.lang.String r1 = r3.log_source_
                java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped> r2 = r3.log_event_dropped_
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r0.<init>(r1, r2)
                return r0
        }

        public com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics.Builder setLogEventDroppedList(java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped> r1) {
                r0 = this;
                r0.log_event_dropped_ = r1
                return r0
        }

        public com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics.Builder setLogSource(java.lang.String r1) {
                r0 = this;
                r0.log_source_ = r1
                return r0
        }
    }

    static {
            com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics$Builder r0 = new com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics$Builder
            r0.<init>()
            com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics r0 = r0.build()
            com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics.DEFAULT_INSTANCE = r0
            return
    }

    LogSourceMetrics(java.lang.String r1, java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped> r2) {
            r0 = this;
            r0.<init>()
            r0.log_source_ = r1
            r0.log_event_dropped_ = r2
            return
    }

    public static com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics getDefaultInstance() {
            com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics r0 = com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics.DEFAULT_INSTANCE
            return r0
    }

    public static com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics.Builder newBuilder() {
            com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics$Builder r0 = new com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics$Builder
            r0.<init>()
            return r0
    }

    @com.google.firebase.encoders.proto.Protobuf(tag = 2)
    public java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped> getLogEventDroppedList() {
            r1 = this;
            java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped> r0 = r1.log_event_dropped_
            return r0
    }

    @com.google.firebase.encoders.proto.Protobuf(tag = 1)
    public java.lang.String getLogSource() {
            r1 = this;
            java.lang.String r0 = r1.log_source_
            return r0
    }
}
