package com.google.android.datatransport.runtime;

/* loaded from: classes.dex */
final class AutoValue_SendRequest extends com.google.android.datatransport.runtime.SendRequest {
    private final com.google.android.datatransport.Encoding encoding;
    private final com.google.android.datatransport.Event<?> event;
    private final com.google.android.datatransport.Transformer<?, byte[]> transformer;
    private final com.google.android.datatransport.runtime.TransportContext transportContext;
    private final java.lang.String transportName;

    /* renamed from: com.google.android.datatransport.runtime.AutoValue_SendRequest$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.android.datatransport.runtime.SendRequest.Builder {
        private com.google.android.datatransport.Encoding encoding;
        private com.google.android.datatransport.Event<?> event;
        private com.google.android.datatransport.Transformer<?, byte[]> transformer;
        private com.google.android.datatransport.runtime.TransportContext transportContext;
        private java.lang.String transportName;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public com.google.android.datatransport.runtime.SendRequest build() {
                r9 = this;
                com.google.android.datatransport.runtime.TransportContext r0 = r9.transportContext
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " transportContext"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                java.lang.String r0 = r9.transportName
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " transportName"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                com.google.android.datatransport.Event<?> r0 = r9.event
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " event"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L41:
                com.google.android.datatransport.Transformer<?, byte[]> r0 = r9.transformer
                if (r0 != 0) goto L56
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " transformer"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L56:
                com.google.android.datatransport.Encoding r0 = r9.encoding
                if (r0 != 0) goto L6b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " encoding"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L6b:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L83
                com.google.android.datatransport.runtime.AutoValue_SendRequest r0 = new com.google.android.datatransport.runtime.AutoValue_SendRequest
                com.google.android.datatransport.runtime.TransportContext r3 = r9.transportContext
                java.lang.String r4 = r9.transportName
                com.google.android.datatransport.Event<?> r5 = r9.event
                com.google.android.datatransport.Transformer<?, byte[]> r6 = r9.transformer
                com.google.android.datatransport.Encoding r7 = r9.encoding
                r8 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7, r8)
                return r0
            L83:
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

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        com.google.android.datatransport.runtime.SendRequest.Builder setEncoding(com.google.android.datatransport.Encoding r2) {
                r1 = this;
                java.lang.String r0 = "Null encoding"
                java.util.Objects.requireNonNull(r2, r0)
                r1.encoding = r2
                return r1
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        com.google.android.datatransport.runtime.SendRequest.Builder setEvent(com.google.android.datatransport.Event<?> r2) {
                r1 = this;
                java.lang.String r0 = "Null event"
                java.util.Objects.requireNonNull(r2, r0)
                r1.event = r2
                return r1
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        com.google.android.datatransport.runtime.SendRequest.Builder setTransformer(com.google.android.datatransport.Transformer<?, byte[]> r2) {
                r1 = this;
                java.lang.String r0 = "Null transformer"
                java.util.Objects.requireNonNull(r2, r0)
                r1.transformer = r2
                return r1
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public com.google.android.datatransport.runtime.SendRequest.Builder setTransportContext(com.google.android.datatransport.runtime.TransportContext r2) {
                r1 = this;
                java.lang.String r0 = "Null transportContext"
                java.util.Objects.requireNonNull(r2, r0)
                r1.transportContext = r2
                return r1
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public com.google.android.datatransport.runtime.SendRequest.Builder setTransportName(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null transportName"
                java.util.Objects.requireNonNull(r2, r0)
                r1.transportName = r2
                return r1
        }
    }

    private AutoValue_SendRequest(com.google.android.datatransport.runtime.TransportContext r1, java.lang.String r2, com.google.android.datatransport.Event<?> r3, com.google.android.datatransport.Transformer<?, byte[]> r4, com.google.android.datatransport.Encoding r5) {
            r0 = this;
            r0.<init>()
            r0.transportContext = r1
            r0.transportName = r2
            r0.event = r3
            r0.transformer = r4
            r0.encoding = r5
            return
    }

    /* synthetic */ AutoValue_SendRequest(com.google.android.datatransport.runtime.TransportContext r1, java.lang.String r2, com.google.android.datatransport.Event r3, com.google.android.datatransport.Transformer r4, com.google.android.datatransport.Encoding r5, com.google.android.datatransport.runtime.AutoValue_SendRequest.AnonymousClass1 r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.datatransport.runtime.SendRequest
            r2 = 0
            if (r1 == 0) goto L4a
            com.google.android.datatransport.runtime.SendRequest r5 = (com.google.android.datatransport.runtime.SendRequest) r5
            com.google.android.datatransport.runtime.TransportContext r1 = r4.transportContext
            com.google.android.datatransport.runtime.TransportContext r3 = r5.getTransportContext()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L48
            java.lang.String r1 = r4.transportName
            java.lang.String r3 = r5.getTransportName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L48
            com.google.android.datatransport.Event<?> r1 = r4.event
            com.google.android.datatransport.Event r3 = r5.getEvent()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L48
            com.google.android.datatransport.Transformer<?, byte[]> r1 = r4.transformer
            com.google.android.datatransport.Transformer r3 = r5.getTransformer()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L48
            com.google.android.datatransport.Encoding r1 = r4.encoding
            com.google.android.datatransport.Encoding r5 = r5.getEncoding()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L48
            goto L49
        L48:
            r0 = 0
        L49:
            return r0
        L4a:
            return r2
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public com.google.android.datatransport.Encoding getEncoding() {
            r1 = this;
            com.google.android.datatransport.Encoding r0 = r1.encoding
            return r0
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    com.google.android.datatransport.Event<?> getEvent() {
            r1 = this;
            com.google.android.datatransport.Event<?> r0 = r1.event
            return r0
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    com.google.android.datatransport.Transformer<?, byte[]> getTransformer() {
            r1 = this;
            com.google.android.datatransport.Transformer<?, byte[]> r0 = r1.transformer
            return r0
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public com.google.android.datatransport.runtime.TransportContext getTransportContext() {
            r1 = this;
            com.google.android.datatransport.runtime.TransportContext r0 = r1.transportContext
            return r0
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public java.lang.String getTransportName() {
            r1 = this;
            java.lang.String r0 = r1.transportName
            return r0
    }

    public int hashCode() {
            r3 = this;
            com.google.android.datatransport.runtime.TransportContext r0 = r3.transportContext
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r3.transportName
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.android.datatransport.Event<?> r2 = r3.event
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.android.datatransport.Transformer<?, byte[]> r2 = r3.transformer
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.android.datatransport.Encoding r1 = r3.encoding
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SendRequest{transportContext="
            r0.append(r1)
            com.google.android.datatransport.runtime.TransportContext r1 = r2.transportContext
            r0.append(r1)
            java.lang.String r1 = ", transportName="
            r0.append(r1)
            java.lang.String r1 = r2.transportName
            r0.append(r1)
            java.lang.String r1 = ", event="
            r0.append(r1)
            com.google.android.datatransport.Event<?> r1 = r2.event
            r0.append(r1)
            java.lang.String r1 = ", transformer="
            r0.append(r1)
            com.google.android.datatransport.Transformer<?, byte[]> r1 = r2.transformer
            r0.append(r1)
            java.lang.String r1 = ", encoding="
            r0.append(r1)
            com.google.android.datatransport.Encoding r1 = r2.encoding
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
