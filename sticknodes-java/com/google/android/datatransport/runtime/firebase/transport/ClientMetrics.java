package com.google.android.datatransport.runtime.firebase.transport;

/* loaded from: classes.dex */
public final class ClientMetrics {
    private static final com.google.android.datatransport.runtime.firebase.transport.ClientMetrics DEFAULT_INSTANCE = null;
    private final java.lang.String app_namespace_;
    private final com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics global_metrics_;
    private final java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics> log_source_metrics_;
    private final com.google.android.datatransport.runtime.firebase.transport.TimeWindow window_;

    public static final class Builder {
        private java.lang.String app_namespace_;
        private com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics global_metrics_;
        private java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics> log_source_metrics_;
        private com.google.android.datatransport.runtime.firebase.transport.TimeWindow window_;

        Builder() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.window_ = r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r2.log_source_metrics_ = r1
                r2.global_metrics_ = r0
                java.lang.String r0 = ""
                r2.app_namespace_ = r0
                return
        }

        public com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder addLogSourceMetrics(com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics r2) {
                r1 = this;
                java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics> r0 = r1.log_source_metrics_
                r0.add(r2)
                return r1
        }

        public com.google.android.datatransport.runtime.firebase.transport.ClientMetrics build() {
                r5 = this;
                com.google.android.datatransport.runtime.firebase.transport.ClientMetrics r0 = new com.google.android.datatransport.runtime.firebase.transport.ClientMetrics
                com.google.android.datatransport.runtime.firebase.transport.TimeWindow r1 = r5.window_
                java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics> r2 = r5.log_source_metrics_
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics r3 = r5.global_metrics_
                java.lang.String r4 = r5.app_namespace_
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder setAppNamespace(java.lang.String r1) {
                r0 = this;
                r0.app_namespace_ = r1
                return r0
        }

        public com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder setGlobalMetrics(com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics r1) {
                r0 = this;
                r0.global_metrics_ = r1
                return r0
        }

        public com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder setLogSourceMetricsList(java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics> r1) {
                r0 = this;
                r0.log_source_metrics_ = r1
                return r0
        }

        public com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder setWindow(com.google.android.datatransport.runtime.firebase.transport.TimeWindow r1) {
                r0 = this;
                r0.window_ = r1
                return r0
        }
    }

    static {
            com.google.android.datatransport.runtime.firebase.transport.ClientMetrics$Builder r0 = new com.google.android.datatransport.runtime.firebase.transport.ClientMetrics$Builder
            r0.<init>()
            com.google.android.datatransport.runtime.firebase.transport.ClientMetrics r0 = r0.build()
            com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.DEFAULT_INSTANCE = r0
            return
    }

    ClientMetrics(com.google.android.datatransport.runtime.firebase.transport.TimeWindow r1, java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics> r2, com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.window_ = r1
            r0.log_source_metrics_ = r2
            r0.global_metrics_ = r3
            r0.app_namespace_ = r4
            return
    }

    public static com.google.android.datatransport.runtime.firebase.transport.ClientMetrics getDefaultInstance() {
            com.google.android.datatransport.runtime.firebase.transport.ClientMetrics r0 = com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.DEFAULT_INSTANCE
            return r0
    }

    public static com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder newBuilder() {
            com.google.android.datatransport.runtime.firebase.transport.ClientMetrics$Builder r0 = new com.google.android.datatransport.runtime.firebase.transport.ClientMetrics$Builder
            r0.<init>()
            return r0
    }

    @com.google.firebase.encoders.proto.Protobuf(tag = 4)
    public java.lang.String getAppNamespace() {
            r1 = this;
            java.lang.String r0 = r1.app_namespace_
            return r0
    }

    public com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics getGlobalMetrics() {
            r1 = this;
            com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics r0 = r1.global_metrics_
            if (r0 != 0) goto L8
            com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics r0 = com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics.getDefaultInstance()
        L8:
            return r0
    }

    @com.google.firebase.encoders.proto.Protobuf(tag = 3)
    public com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics getGlobalMetricsInternal() {
            r1 = this;
            com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics r0 = r1.global_metrics_
            return r0
    }

    @com.google.firebase.encoders.proto.Protobuf(tag = 2)
    public java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics> getLogSourceMetricsList() {
            r1 = this;
            java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics> r0 = r1.log_source_metrics_
            return r0
    }

    public com.google.android.datatransport.runtime.firebase.transport.TimeWindow getWindow() {
            r1 = this;
            com.google.android.datatransport.runtime.firebase.transport.TimeWindow r0 = r1.window_
            if (r0 != 0) goto L8
            com.google.android.datatransport.runtime.firebase.transport.TimeWindow r0 = com.google.android.datatransport.runtime.firebase.transport.TimeWindow.getDefaultInstance()
        L8:
            return r0
    }

    @com.google.firebase.encoders.proto.Protobuf(tag = 1)
    public com.google.android.datatransport.runtime.firebase.transport.TimeWindow getWindowInternal() {
            r1 = this;
            com.google.android.datatransport.runtime.firebase.transport.TimeWindow r0 = r1.window_
            return r0
    }

    public byte[] toByteArray() {
            r1 = this;
            byte[] r0 = com.google.android.datatransport.runtime.ProtoEncoderDoNotUse.encode(r1)
            return r0
    }

    public void writeTo(java.io.OutputStream r1) throws java.io.IOException {
            r0 = this;
            com.google.android.datatransport.runtime.ProtoEncoderDoNotUse.encode(r0, r1)
            return
    }
}
