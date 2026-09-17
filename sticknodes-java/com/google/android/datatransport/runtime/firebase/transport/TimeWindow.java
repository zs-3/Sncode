package com.google.android.datatransport.runtime.firebase.transport;

/* loaded from: classes.dex */
public final class TimeWindow {
    private static final com.google.android.datatransport.runtime.firebase.transport.TimeWindow DEFAULT_INSTANCE = null;
    private final long end_ms_;
    private final long start_ms_;

    public static final class Builder {
        private long end_ms_;
        private long start_ms_;

        Builder() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.start_ms_ = r0
                r2.end_ms_ = r0
                return
        }

        public com.google.android.datatransport.runtime.firebase.transport.TimeWindow build() {
                r5 = this;
                com.google.android.datatransport.runtime.firebase.transport.TimeWindow r0 = new com.google.android.datatransport.runtime.firebase.transport.TimeWindow
                long r1 = r5.start_ms_
                long r3 = r5.end_ms_
                r0.<init>(r1, r3)
                return r0
        }

        public com.google.android.datatransport.runtime.firebase.transport.TimeWindow.Builder setEndMs(long r1) {
                r0 = this;
                r0.end_ms_ = r1
                return r0
        }

        public com.google.android.datatransport.runtime.firebase.transport.TimeWindow.Builder setStartMs(long r1) {
                r0 = this;
                r0.start_ms_ = r1
                return r0
        }
    }

    static {
            com.google.android.datatransport.runtime.firebase.transport.TimeWindow$Builder r0 = new com.google.android.datatransport.runtime.firebase.transport.TimeWindow$Builder
            r0.<init>()
            com.google.android.datatransport.runtime.firebase.transport.TimeWindow r0 = r0.build()
            com.google.android.datatransport.runtime.firebase.transport.TimeWindow.DEFAULT_INSTANCE = r0
            return
    }

    TimeWindow(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.start_ms_ = r1
            r0.end_ms_ = r3
            return
    }

    public static com.google.android.datatransport.runtime.firebase.transport.TimeWindow getDefaultInstance() {
            com.google.android.datatransport.runtime.firebase.transport.TimeWindow r0 = com.google.android.datatransport.runtime.firebase.transport.TimeWindow.DEFAULT_INSTANCE
            return r0
    }

    public static com.google.android.datatransport.runtime.firebase.transport.TimeWindow.Builder newBuilder() {
            com.google.android.datatransport.runtime.firebase.transport.TimeWindow$Builder r0 = new com.google.android.datatransport.runtime.firebase.transport.TimeWindow$Builder
            r0.<init>()
            return r0
    }

    @com.google.firebase.encoders.proto.Protobuf(tag = 2)
    public long getEndMs() {
            r2 = this;
            long r0 = r2.end_ms_
            return r0
    }

    @com.google.firebase.encoders.proto.Protobuf(tag = 1)
    public long getStartMs() {
            r2 = this;
            long r0 = r2.start_ms_
            return r0
    }
}
