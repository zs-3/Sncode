package com.google.android.datatransport.cct.internal;

/* loaded from: classes.dex */
final class AutoValue_BatchedLogRequest extends com.google.android.datatransport.cct.internal.BatchedLogRequest {
    private final java.util.List<com.google.android.datatransport.cct.internal.LogRequest> logRequests;

    AutoValue_BatchedLogRequest(java.util.List<com.google.android.datatransport.cct.internal.LogRequest> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null logRequests"
            java.util.Objects.requireNonNull(r2, r0)
            r1.logRequests = r2
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.datatransport.cct.internal.BatchedLogRequest
            if (r0 == 0) goto L15
            com.google.android.datatransport.cct.internal.BatchedLogRequest r2 = (com.google.android.datatransport.cct.internal.BatchedLogRequest) r2
            java.util.List<com.google.android.datatransport.cct.internal.LogRequest> r0 = r1.logRequests
            java.util.List r2 = r2.getLogRequests()
            boolean r2 = r0.equals(r2)
            return r2
        L15:
            r2 = 0
            return r2
    }

    @Override // com.google.android.datatransport.cct.internal.BatchedLogRequest
    public java.util.List<com.google.android.datatransport.cct.internal.LogRequest> getLogRequests() {
            r1 = this;
            java.util.List<com.google.android.datatransport.cct.internal.LogRequest> r0 = r1.logRequests
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.util.List<com.google.android.datatransport.cct.internal.LogRequest> r0 = r2.logRequests
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BatchedLogRequest{logRequests="
            r0.append(r1)
            java.util.List<com.google.android.datatransport.cct.internal.LogRequest> r1 = r2.logRequests
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
