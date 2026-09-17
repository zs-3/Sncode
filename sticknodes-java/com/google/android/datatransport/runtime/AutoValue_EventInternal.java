package com.google.android.datatransport.runtime;

/* loaded from: classes.dex */
final class AutoValue_EventInternal extends com.google.android.datatransport.runtime.EventInternal {
    private final java.util.Map<java.lang.String, java.lang.String> autoMetadata;
    private final java.lang.Integer code;
    private final com.google.android.datatransport.runtime.EncodedPayload encodedPayload;
    private final long eventMillis;
    private final byte[] experimentIdsClear;
    private final byte[] experimentIdsEncrypted;
    private final java.lang.Integer productId;
    private final java.lang.String pseudonymousId;
    private final java.lang.String transportName;
    private final long uptimeMillis;

    /* renamed from: com.google.android.datatransport.runtime.AutoValue_EventInternal$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.android.datatransport.runtime.EventInternal.Builder {
        private java.util.Map<java.lang.String, java.lang.String> autoMetadata;
        private java.lang.Integer code;
        private com.google.android.datatransport.runtime.EncodedPayload encodedPayload;
        private java.lang.Long eventMillis;
        private byte[] experimentIdsClear;
        private byte[] experimentIdsEncrypted;
        private java.lang.Integer productId;
        private java.lang.String pseudonymousId;
        private java.lang.String transportName;
        private java.lang.Long uptimeMillis;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal build() {
                r17 = this;
                r0 = r17
                java.lang.String r1 = r0.transportName
                java.lang.String r2 = ""
                if (r1 != 0) goto L19
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = " transportName"
                r1.append(r2)
                java.lang.String r2 = r1.toString()
            L19:
                com.google.android.datatransport.runtime.EncodedPayload r1 = r0.encodedPayload
                if (r1 != 0) goto L2e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = " encodedPayload"
                r1.append(r2)
                java.lang.String r2 = r1.toString()
            L2e:
                java.lang.Long r1 = r0.eventMillis
                if (r1 != 0) goto L43
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = " eventMillis"
                r1.append(r2)
                java.lang.String r2 = r1.toString()
            L43:
                java.lang.Long r1 = r0.uptimeMillis
                if (r1 != 0) goto L58
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = " uptimeMillis"
                r1.append(r2)
                java.lang.String r2 = r1.toString()
            L58:
                java.util.Map<java.lang.String, java.lang.String> r1 = r0.autoMetadata
                if (r1 != 0) goto L6d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = " autoMetadata"
                r1.append(r2)
                java.lang.String r2 = r1.toString()
            L6d:
                boolean r1 = r2.isEmpty()
                if (r1 == 0) goto L98
                com.google.android.datatransport.runtime.AutoValue_EventInternal r1 = new com.google.android.datatransport.runtime.AutoValue_EventInternal
                java.lang.String r4 = r0.transportName
                java.lang.Integer r5 = r0.code
                com.google.android.datatransport.runtime.EncodedPayload r6 = r0.encodedPayload
                java.lang.Long r2 = r0.eventMillis
                long r7 = r2.longValue()
                java.lang.Long r2 = r0.uptimeMillis
                long r9 = r2.longValue()
                java.util.Map<java.lang.String, java.lang.String> r11 = r0.autoMetadata
                java.lang.Integer r12 = r0.productId
                java.lang.String r13 = r0.pseudonymousId
                byte[] r14 = r0.experimentIdsClear
                byte[] r15 = r0.experimentIdsEncrypted
                r16 = 0
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r9, r11, r12, r13, r14, r15, r16)
                return r1
            L98:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Missing required properties:"
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        protected java.util.Map<java.lang.String, java.lang.String> getAutoMetadata() {
                r2 = this;
                java.util.Map<java.lang.String, java.lang.String> r0 = r2.autoMetadata
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Property \"autoMetadata\" has not been set"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        protected com.google.android.datatransport.runtime.EventInternal.Builder setAutoMetadata(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                java.lang.String r0 = "Null autoMetadata"
                java.util.Objects.requireNonNull(r2, r0)
                r1.autoMetadata = r2
                return r1
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setCode(java.lang.Integer r1) {
                r0 = this;
                r0.code = r1
                return r0
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setEncodedPayload(com.google.android.datatransport.runtime.EncodedPayload r2) {
                r1 = this;
                java.lang.String r0 = "Null encodedPayload"
                java.util.Objects.requireNonNull(r2, r0)
                r1.encodedPayload = r2
                return r1
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setEventMillis(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.eventMillis = r1
                return r0
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setExperimentIdsClear(byte[] r1) {
                r0 = this;
                r0.experimentIdsClear = r1
                return r0
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setExperimentIdsEncrypted(byte[] r1) {
                r0 = this;
                r0.experimentIdsEncrypted = r1
                return r0
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setProductId(java.lang.Integer r1) {
                r0 = this;
                r0.productId = r1
                return r0
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setPseudonymousId(java.lang.String r1) {
                r0 = this;
                r0.pseudonymousId = r1
                return r0
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setTransportName(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null transportName"
                java.util.Objects.requireNonNull(r2, r0)
                r1.transportName = r2
                return r1
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setUptimeMillis(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.uptimeMillis = r1
                return r0
        }
    }

    private AutoValue_EventInternal(java.lang.String r1, java.lang.Integer r2, com.google.android.datatransport.runtime.EncodedPayload r3, long r4, long r6, java.util.Map<java.lang.String, java.lang.String> r8, java.lang.Integer r9, java.lang.String r10, byte[] r11, byte[] r12) {
            r0 = this;
            r0.<init>()
            r0.transportName = r1
            r0.code = r2
            r0.encodedPayload = r3
            r0.eventMillis = r4
            r0.uptimeMillis = r6
            r0.autoMetadata = r8
            r0.productId = r9
            r0.pseudonymousId = r10
            r0.experimentIdsClear = r11
            r0.experimentIdsEncrypted = r12
            return
    }

    /* synthetic */ AutoValue_EventInternal(java.lang.String r1, java.lang.Integer r2, com.google.android.datatransport.runtime.EncodedPayload r3, long r4, long r6, java.util.Map r8, java.lang.Integer r9, java.lang.String r10, byte[] r11, byte[] r12, com.google.android.datatransport.runtime.AutoValue_EventInternal.AnonymousClass1 r13) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.datatransport.runtime.EventInternal
            r2 = 0
            if (r1 == 0) goto Lae
            com.google.android.datatransport.runtime.EventInternal r8 = (com.google.android.datatransport.runtime.EventInternal) r8
            java.lang.String r1 = r7.transportName
            java.lang.String r3 = r8.getTransportName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lac
            java.lang.Integer r1 = r7.code
            if (r1 != 0) goto L22
            java.lang.Integer r1 = r8.getCode()
            if (r1 != 0) goto Lac
            goto L2c
        L22:
            java.lang.Integer r3 = r8.getCode()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lac
        L2c:
            com.google.android.datatransport.runtime.EncodedPayload r1 = r7.encodedPayload
            com.google.android.datatransport.runtime.EncodedPayload r3 = r8.getEncodedPayload()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lac
            long r3 = r7.eventMillis
            long r5 = r8.getEventMillis()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto Lac
            long r3 = r7.uptimeMillis
            long r5 = r8.getUptimeMillis()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto Lac
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.autoMetadata
            java.util.Map r3 = r8.getAutoMetadata()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lac
            java.lang.Integer r1 = r7.productId
            if (r1 != 0) goto L63
            java.lang.Integer r1 = r8.getProductId()
            if (r1 != 0) goto Lac
            goto L6d
        L63:
            java.lang.Integer r3 = r8.getProductId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lac
        L6d:
            java.lang.String r1 = r7.pseudonymousId
            if (r1 != 0) goto L78
            java.lang.String r1 = r8.getPseudonymousId()
            if (r1 != 0) goto Lac
            goto L82
        L78:
            java.lang.String r3 = r8.getPseudonymousId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lac
        L82:
            byte[] r1 = r7.experimentIdsClear
            boolean r3 = r8 instanceof com.google.android.datatransport.runtime.AutoValue_EventInternal
            if (r3 == 0) goto L8e
            r4 = r8
            com.google.android.datatransport.runtime.AutoValue_EventInternal r4 = (com.google.android.datatransport.runtime.AutoValue_EventInternal) r4
            byte[] r4 = r4.experimentIdsClear
            goto L92
        L8e:
            byte[] r4 = r8.getExperimentIdsClear()
        L92:
            boolean r1 = java.util.Arrays.equals(r1, r4)
            if (r1 == 0) goto Lac
            byte[] r1 = r7.experimentIdsEncrypted
            if (r3 == 0) goto La1
            com.google.android.datatransport.runtime.AutoValue_EventInternal r8 = (com.google.android.datatransport.runtime.AutoValue_EventInternal) r8
            byte[] r8 = r8.experimentIdsEncrypted
            goto La5
        La1:
            byte[] r8 = r8.getExperimentIdsEncrypted()
        La5:
            boolean r8 = java.util.Arrays.equals(r1, r8)
            if (r8 == 0) goto Lac
            goto Lad
        Lac:
            r0 = 0
        Lad:
            return r0
        Lae:
            return r2
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    protected java.util.Map<java.lang.String, java.lang.String> getAutoMetadata() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.autoMetadata
            return r0
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public java.lang.Integer getCode() {
            r1 = this;
            java.lang.Integer r0 = r1.code
            return r0
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public com.google.android.datatransport.runtime.EncodedPayload getEncodedPayload() {
            r1 = this;
            com.google.android.datatransport.runtime.EncodedPayload r0 = r1.encodedPayload
            return r0
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getEventMillis() {
            r2 = this;
            long r0 = r2.eventMillis
            return r0
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public byte[] getExperimentIdsClear() {
            r1 = this;
            byte[] r0 = r1.experimentIdsClear
            return r0
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public byte[] getExperimentIdsEncrypted() {
            r1 = this;
            byte[] r0 = r1.experimentIdsEncrypted
            return r0
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public java.lang.Integer getProductId() {
            r1 = this;
            java.lang.Integer r0 = r1.productId
            return r0
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public java.lang.String getPseudonymousId() {
            r1 = this;
            java.lang.String r0 = r1.pseudonymousId
            return r0
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public java.lang.String getTransportName() {
            r1 = this;
            java.lang.String r0 = r1.transportName
            return r0
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getUptimeMillis() {
            r2 = this;
            long r0 = r2.uptimeMillis
            return r0
    }

    public int hashCode() {
            r8 = this;
            java.lang.String r0 = r8.transportName
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.Integer r2 = r8.code
            r3 = 0
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.android.datatransport.runtime.EncodedPayload r2 = r8.encodedPayload
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            long r4 = r8.eventMillis
            r2 = 32
            long r6 = r4 >>> r2
            long r4 = r4 ^ r6
            int r5 = (int) r4
            r0 = r0 ^ r5
            int r0 = r0 * r1
            long r4 = r8.uptimeMillis
            long r6 = r4 >>> r2
            long r4 = r4 ^ r6
            int r2 = (int) r4
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.Map<java.lang.String, java.lang.String> r2 = r8.autoMetadata
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.Integer r2 = r8.productId
            if (r2 != 0) goto L46
            r2 = 0
            goto L4a
        L46:
            int r2 = r2.hashCode()
        L4a:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r8.pseudonymousId
            if (r2 != 0) goto L52
            goto L56
        L52:
            int r3 = r2.hashCode()
        L56:
            r0 = r0 ^ r3
            int r0 = r0 * r1
            byte[] r2 = r8.experimentIdsClear
            int r2 = java.util.Arrays.hashCode(r2)
            r0 = r0 ^ r2
            int r0 = r0 * r1
            byte[] r1 = r8.experimentIdsEncrypted
            int r1 = java.util.Arrays.hashCode(r1)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "EventInternal{transportName="
            r0.append(r1)
            java.lang.String r1 = r3.transportName
            r0.append(r1)
            java.lang.String r1 = ", code="
            r0.append(r1)
            java.lang.Integer r1 = r3.code
            r0.append(r1)
            java.lang.String r1 = ", encodedPayload="
            r0.append(r1)
            com.google.android.datatransport.runtime.EncodedPayload r1 = r3.encodedPayload
            r0.append(r1)
            java.lang.String r1 = ", eventMillis="
            r0.append(r1)
            long r1 = r3.eventMillis
            r0.append(r1)
            java.lang.String r1 = ", uptimeMillis="
            r0.append(r1)
            long r1 = r3.uptimeMillis
            r0.append(r1)
            java.lang.String r1 = ", autoMetadata="
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.autoMetadata
            r0.append(r1)
            java.lang.String r1 = ", productId="
            r0.append(r1)
            java.lang.Integer r1 = r3.productId
            r0.append(r1)
            java.lang.String r1 = ", pseudonymousId="
            r0.append(r1)
            java.lang.String r1 = r3.pseudonymousId
            r0.append(r1)
            java.lang.String r1 = ", experimentIdsClear="
            r0.append(r1)
            byte[] r1 = r3.experimentIdsClear
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ", experimentIdsEncrypted="
            r0.append(r1)
            byte[] r1 = r3.experimentIdsEncrypted
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
