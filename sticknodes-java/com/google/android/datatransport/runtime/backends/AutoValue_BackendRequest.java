package com.google.android.datatransport.runtime.backends;

/* loaded from: classes.dex */
final class AutoValue_BackendRequest extends com.google.android.datatransport.runtime.backends.BackendRequest {
    private final java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> events;
    private final byte[] extras;

    /* renamed from: com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.android.datatransport.runtime.backends.BackendRequest.Builder {
        private java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> events;
        private byte[] extras;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public com.google.android.datatransport.runtime.backends.BackendRequest build() {
                r4 = this;
                java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> r0 = r4.events
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " events"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L28
                com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest r0 = new com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest
                java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> r1 = r4.events
                byte[] r2 = r4.extras
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
            L28:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Missing required properties:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public com.google.android.datatransport.runtime.backends.BackendRequest.Builder setEvents(java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> r2) {
                r1 = this;
                java.lang.String r0 = "Null events"
                java.util.Objects.requireNonNull(r2, r0)
                r1.events = r2
                return r1
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public com.google.android.datatransport.runtime.backends.BackendRequest.Builder setExtras(byte[] r1) {
                r0 = this;
                r0.extras = r1
                return r0
        }
    }

    private AutoValue_BackendRequest(java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> r1, byte[] r2) {
            r0 = this;
            r0.<init>()
            r0.events = r1
            r0.extras = r2
            return
    }

    /* synthetic */ AutoValue_BackendRequest(java.lang.Iterable r1, byte[] r2, com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.datatransport.runtime.backends.BackendRequest
            r2 = 0
            if (r1 == 0) goto L2f
            com.google.android.datatransport.runtime.backends.BackendRequest r5 = (com.google.android.datatransport.runtime.backends.BackendRequest) r5
            java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> r1 = r4.events
            java.lang.Iterable r3 = r5.getEvents()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2d
            byte[] r1 = r4.extras
            boolean r3 = r5 instanceof com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest
            if (r3 == 0) goto L22
            com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest r5 = (com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest) r5
            byte[] r5 = r5.extras
            goto L26
        L22:
            byte[] r5 = r5.getExtras()
        L26:
            boolean r5 = java.util.Arrays.equals(r1, r5)
            if (r5 == 0) goto L2d
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
        L2f:
            return r2
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> getEvents() {
            r1 = this;
            java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> r0 = r1.events
            return r0
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public byte[] getExtras() {
            r1 = this;
            byte[] r0 = r1.extras
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> r0 = r2.events
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            byte[] r1 = r2.extras
            int r1 = java.util.Arrays.hashCode(r1)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BackendRequest{events="
            r0.append(r1)
            java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> r1 = r2.events
            r0.append(r1)
            java.lang.String r1 = ", extras="
            r0.append(r1)
            byte[] r1 = r2.extras
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
