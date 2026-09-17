package com.google.android.datatransport.runtime.backends;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class BackendResponse {

    public enum Status extends java.lang.Enum<com.google.android.datatransport.runtime.backends.BackendResponse.Status> {
        private static final /* synthetic */ com.google.android.datatransport.runtime.backends.BackendResponse.Status[] $VALUES = null;
        public static final com.google.android.datatransport.runtime.backends.BackendResponse.Status FATAL_ERROR = null;
        public static final com.google.android.datatransport.runtime.backends.BackendResponse.Status INVALID_PAYLOAD = null;
        public static final com.google.android.datatransport.runtime.backends.BackendResponse.Status OK = null;
        public static final com.google.android.datatransport.runtime.backends.BackendResponse.Status TRANSIENT_ERROR = null;

        static {
                com.google.android.datatransport.runtime.backends.BackendResponse$Status r0 = new com.google.android.datatransport.runtime.backends.BackendResponse$Status
                java.lang.String r1 = "OK"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.datatransport.runtime.backends.BackendResponse.Status.OK = r0
                com.google.android.datatransport.runtime.backends.BackendResponse$Status r1 = new com.google.android.datatransport.runtime.backends.BackendResponse$Status
                java.lang.String r3 = "TRANSIENT_ERROR"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.android.datatransport.runtime.backends.BackendResponse.Status.TRANSIENT_ERROR = r1
                com.google.android.datatransport.runtime.backends.BackendResponse$Status r3 = new com.google.android.datatransport.runtime.backends.BackendResponse$Status
                java.lang.String r5 = "FATAL_ERROR"
                r6 = 2
                r3.<init>(r5, r6)
                com.google.android.datatransport.runtime.backends.BackendResponse.Status.FATAL_ERROR = r3
                com.google.android.datatransport.runtime.backends.BackendResponse$Status r5 = new com.google.android.datatransport.runtime.backends.BackendResponse$Status
                java.lang.String r7 = "INVALID_PAYLOAD"
                r8 = 3
                r5.<init>(r7, r8)
                com.google.android.datatransport.runtime.backends.BackendResponse.Status.INVALID_PAYLOAD = r5
                r7 = 4
                com.google.android.datatransport.runtime.backends.BackendResponse$Status[] r7 = new com.google.android.datatransport.runtime.backends.BackendResponse.Status[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.google.android.datatransport.runtime.backends.BackendResponse.Status.$VALUES = r7
                return
        }

        Status(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.android.datatransport.runtime.backends.BackendResponse.Status valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.datatransport.runtime.backends.BackendResponse$Status> r0 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.datatransport.runtime.backends.BackendResponse$Status r1 = (com.google.android.datatransport.runtime.backends.BackendResponse.Status) r1
                return r1
        }

        public static com.google.android.datatransport.runtime.backends.BackendResponse.Status[] values() {
                com.google.android.datatransport.runtime.backends.BackendResponse$Status[] r0 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.datatransport.runtime.backends.BackendResponse$Status[] r0 = (com.google.android.datatransport.runtime.backends.BackendResponse.Status[]) r0
                return r0
        }
    }

    public BackendResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.backends.BackendResponse fatalError() {
            com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse r0 = new com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r1 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.FATAL_ERROR
            r2 = -1
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.datatransport.runtime.backends.BackendResponse invalidPayload() {
            com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse r0 = new com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r1 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.INVALID_PAYLOAD
            r2 = -1
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.datatransport.runtime.backends.BackendResponse ok(long r2) {
            com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse r0 = new com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r1 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.OK
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.datatransport.runtime.backends.BackendResponse transientError() {
            com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse r0 = new com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r1 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.TRANSIENT_ERROR
            r2 = -1
            r0.<init>(r1, r2)
            return r0
    }

    public abstract long getNextRequestWaitMillis();

    public abstract com.google.android.datatransport.runtime.backends.BackendResponse.Status getStatus();
}
