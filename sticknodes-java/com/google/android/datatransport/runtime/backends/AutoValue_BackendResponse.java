package com.google.android.datatransport.runtime.backends;

/* loaded from: classes.dex */
final class AutoValue_BackendResponse extends com.google.android.datatransport.runtime.backends.BackendResponse {
    private final long nextRequestWaitMillis;
    private final com.google.android.datatransport.runtime.backends.BackendResponse.Status status;

    AutoValue_BackendResponse(com.google.android.datatransport.runtime.backends.BackendResponse.Status r2, long r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null status"
            java.util.Objects.requireNonNull(r2, r0)
            r1.status = r2
            r1.nextRequestWaitMillis = r3
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.datatransport.runtime.backends.BackendResponse
            r2 = 0
            if (r1 == 0) goto L24
            com.google.android.datatransport.runtime.backends.BackendResponse r8 = (com.google.android.datatransport.runtime.backends.BackendResponse) r8
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r1 = r7.status
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r3 = r8.getStatus()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L22
            long r3 = r7.nextRequestWaitMillis
            long r5 = r8.getNextRequestWaitMillis()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L22
            goto L23
        L22:
            r0 = 0
        L23:
            return r0
        L24:
            return r2
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long getNextRequestWaitMillis() {
            r2 = this;
            long r0 = r2.nextRequestWaitMillis
            return r0
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public com.google.android.datatransport.runtime.backends.BackendResponse.Status getStatus() {
            r1 = this;
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r0 = r1.status
            return r0
    }

    public int hashCode() {
            r5 = this;
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r0 = r5.status
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            long r1 = r5.nextRequestWaitMillis
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            r0 = r0 ^ r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BackendResponse{status="
            r0.append(r1)
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r1 = r3.status
            r0.append(r1)
            java.lang.String r1 = ", nextRequestWaitMillis="
            r0.append(r1)
            long r1 = r3.nextRequestWaitMillis
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
