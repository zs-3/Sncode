package com.google.android.datatransport.runtime;

/* loaded from: classes.dex */
final class AutoValue_TransportContext extends com.google.android.datatransport.runtime.TransportContext {
    private final java.lang.String backendName;
    private final byte[] extras;
    private final com.google.android.datatransport.Priority priority;

    /* renamed from: com.google.android.datatransport.runtime.AutoValue_TransportContext$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.android.datatransport.runtime.TransportContext.Builder {
        private java.lang.String backendName;
        private byte[] extras;
        private com.google.android.datatransport.Priority priority;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public com.google.android.datatransport.runtime.TransportContext build() {
                r5 = this;
                java.lang.String r0 = r5.backendName
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " backendName"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                com.google.android.datatransport.Priority r0 = r5.priority
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " priority"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L3f
                com.google.android.datatransport.runtime.AutoValue_TransportContext r0 = new com.google.android.datatransport.runtime.AutoValue_TransportContext
                java.lang.String r1 = r5.backendName
                byte[] r2 = r5.extras
                com.google.android.datatransport.Priority r3 = r5.priority
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return r0
            L3f:
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

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public com.google.android.datatransport.runtime.TransportContext.Builder setBackendName(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null backendName"
                java.util.Objects.requireNonNull(r2, r0)
                r1.backendName = r2
                return r1
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public com.google.android.datatransport.runtime.TransportContext.Builder setExtras(byte[] r1) {
                r0 = this;
                r0.extras = r1
                return r0
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public com.google.android.datatransport.runtime.TransportContext.Builder setPriority(com.google.android.datatransport.Priority r2) {
                r1 = this;
                java.lang.String r0 = "Null priority"
                java.util.Objects.requireNonNull(r2, r0)
                r1.priority = r2
                return r1
        }
    }

    private AutoValue_TransportContext(java.lang.String r1, byte[] r2, com.google.android.datatransport.Priority r3) {
            r0 = this;
            r0.<init>()
            r0.backendName = r1
            r0.extras = r2
            r0.priority = r3
            return
    }

    /* synthetic */ AutoValue_TransportContext(java.lang.String r1, byte[] r2, com.google.android.datatransport.Priority r3, com.google.android.datatransport.runtime.AutoValue_TransportContext.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.datatransport.runtime.TransportContext
            r2 = 0
            if (r1 == 0) goto L3c
            com.google.android.datatransport.runtime.TransportContext r5 = (com.google.android.datatransport.runtime.TransportContext) r5
            java.lang.String r1 = r4.backendName
            java.lang.String r3 = r5.getBackendName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3a
            byte[] r1 = r4.extras
            boolean r3 = r5 instanceof com.google.android.datatransport.runtime.AutoValue_TransportContext
            if (r3 == 0) goto L23
            r3 = r5
            com.google.android.datatransport.runtime.AutoValue_TransportContext r3 = (com.google.android.datatransport.runtime.AutoValue_TransportContext) r3
            byte[] r3 = r3.extras
            goto L27
        L23:
            byte[] r3 = r5.getExtras()
        L27:
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L3a
            com.google.android.datatransport.Priority r1 = r4.priority
            com.google.android.datatransport.Priority r5 = r5.getPriority()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L3a
            goto L3b
        L3a:
            r0 = 0
        L3b:
            return r0
        L3c:
            return r2
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public java.lang.String getBackendName() {
            r1 = this;
            java.lang.String r0 = r1.backendName
            return r0
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public byte[] getExtras() {
            r1 = this;
            byte[] r0 = r1.extras
            return r0
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public com.google.android.datatransport.Priority getPriority() {
            r1 = this;
            com.google.android.datatransport.Priority r0 = r1.priority
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.backendName
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            byte[] r2 = r3.extras
            int r2 = java.util.Arrays.hashCode(r2)
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.android.datatransport.Priority r1 = r3.priority
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }
}
