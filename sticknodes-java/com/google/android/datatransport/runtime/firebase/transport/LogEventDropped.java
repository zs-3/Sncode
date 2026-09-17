package com.google.android.datatransport.runtime.firebase.transport;

/* loaded from: classes.dex */
public final class LogEventDropped {
    private static final com.google.android.datatransport.runtime.firebase.transport.LogEventDropped DEFAULT_INSTANCE = null;
    private final long events_dropped_count_;
    private final com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason reason_;

    public static final class Builder {
        private long events_dropped_count_;
        private com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason reason_;

        Builder() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.events_dropped_count_ = r0
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r0 = com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.REASON_UNKNOWN
                r2.reason_ = r0
                return
        }

        public com.google.android.datatransport.runtime.firebase.transport.LogEventDropped build() {
                r4 = this;
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped r0 = new com.google.android.datatransport.runtime.firebase.transport.LogEventDropped
                long r1 = r4.events_dropped_count_
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r3 = r4.reason_
                r0.<init>(r1, r3)
                return r0
        }

        public com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Builder setEventsDroppedCount(long r1) {
                r0 = this;
                r0.events_dropped_count_ = r1
                return r0
        }

        public com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Builder setReason(com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason r1) {
                r0 = this;
                r0.reason_ = r1
                return r0
        }
    }

    public enum Reason extends java.lang.Enum<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason> implements com.google.firebase.encoders.proto.ProtoEnum {
        private static final /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason[] $VALUES = null;
        public static final com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason CACHE_FULL = null;
        public static final com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason INVALID_PAYLOD = null;
        public static final com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason MAX_RETRIES_REACHED = null;
        public static final com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason MESSAGE_TOO_OLD = null;
        public static final com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason PAYLOAD_TOO_BIG = null;
        public static final com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason REASON_UNKNOWN = null;
        public static final com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason SERVER_ERROR = null;
        private final int number_;

        static {
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r0 = new com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason
                java.lang.String r1 = "REASON_UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.REASON_UNKNOWN = r0
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r1 = new com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason
                java.lang.String r3 = "MESSAGE_TOO_OLD"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.MESSAGE_TOO_OLD = r1
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r3 = new com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason
                java.lang.String r5 = "CACHE_FULL"
                r6 = 2
                r3.<init>(r5, r6, r6)
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.CACHE_FULL = r3
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r5 = new com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason
                java.lang.String r7 = "PAYLOAD_TOO_BIG"
                r8 = 3
                r5.<init>(r7, r8, r8)
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.PAYLOAD_TOO_BIG = r5
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r7 = new com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason
                java.lang.String r9 = "MAX_RETRIES_REACHED"
                r10 = 4
                r7.<init>(r9, r10, r10)
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.MAX_RETRIES_REACHED = r7
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r9 = new com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason
                java.lang.String r11 = "INVALID_PAYLOD"
                r12 = 5
                r9.<init>(r11, r12, r12)
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.INVALID_PAYLOD = r9
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r11 = new com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason
                java.lang.String r13 = "SERVER_ERROR"
                r14 = 6
                r11.<init>(r13, r14, r14)
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.SERVER_ERROR = r11
                r13 = 7
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason[] r13 = new com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.$VALUES = r13
                return
        }

        Reason(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.number_ = r3
                return
        }

        public static com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason> r0 = com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r1 = (com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason) r1
                return r1
        }

        public static com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason[] values() {
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason[] r0 = com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason[] r0 = (com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason[]) r0
                return r0
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
                r1 = this;
                int r0 = r1.number_
                return r0
        }
    }

    static {
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Builder r0 = new com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Builder
            r0.<init>()
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped r0 = r0.build()
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.DEFAULT_INSTANCE = r0
            return
    }

    LogEventDropped(long r1, com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason r3) {
            r0 = this;
            r0.<init>()
            r0.events_dropped_count_ = r1
            r0.reason_ = r3
            return
    }

    public static com.google.android.datatransport.runtime.firebase.transport.LogEventDropped getDefaultInstance() {
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped r0 = com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.DEFAULT_INSTANCE
            return r0
    }

    public static com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Builder newBuilder() {
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Builder r0 = new com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Builder
            r0.<init>()
            return r0
    }

    @com.google.firebase.encoders.proto.Protobuf(tag = 1)
    public long getEventsDroppedCount() {
            r2 = this;
            long r0 = r2.events_dropped_count_
            return r0
    }

    @com.google.firebase.encoders.proto.Protobuf(tag = 3)
    public com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason getReason() {
            r1 = this;
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r0 = r1.reason_
            return r0
    }
}
