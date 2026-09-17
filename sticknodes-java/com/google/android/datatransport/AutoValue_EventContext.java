package com.google.android.datatransport;

/* loaded from: classes.dex */
final class AutoValue_EventContext extends com.google.android.datatransport.EventContext {
    private final byte[] experimentIdsClear;
    private final byte[] experimentIdsEncrypted;
    private final java.lang.String pseudonymousId;

    /* renamed from: com.google.android.datatransport.AutoValue_EventContext$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.android.datatransport.EventContext.Builder {
        private byte[] experimentIdsClear;
        private byte[] experimentIdsEncrypted;
        private java.lang.String pseudonymousId;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public com.google.android.datatransport.EventContext build() {
                r5 = this;
                com.google.android.datatransport.AutoValue_EventContext r0 = new com.google.android.datatransport.AutoValue_EventContext
                java.lang.String r1 = r5.pseudonymousId
                byte[] r2 = r5.experimentIdsClear
                byte[] r3 = r5.experimentIdsEncrypted
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public com.google.android.datatransport.EventContext.Builder setExperimentIdsClear(byte[] r1) {
                r0 = this;
                r0.experimentIdsClear = r1
                return r0
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public com.google.android.datatransport.EventContext.Builder setExperimentIdsEncrypted(byte[] r1) {
                r0 = this;
                r0.experimentIdsEncrypted = r1
                return r0
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public com.google.android.datatransport.EventContext.Builder setPseudonymousId(java.lang.String r1) {
                r0 = this;
                r0.pseudonymousId = r1
                return r0
        }
    }

    private AutoValue_EventContext(java.lang.String r1, byte[] r2, byte[] r3) {
            r0 = this;
            r0.<init>()
            r0.pseudonymousId = r1
            r0.experimentIdsClear = r2
            r0.experimentIdsEncrypted = r3
            return
    }

    /* synthetic */ AutoValue_EventContext(java.lang.String r1, byte[] r2, byte[] r3, com.google.android.datatransport.AutoValue_EventContext.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.datatransport.EventContext
            r2 = 0
            if (r1 == 0) goto L4c
            com.google.android.datatransport.EventContext r6 = (com.google.android.datatransport.EventContext) r6
            java.lang.String r1 = r5.pseudonymousId
            if (r1 != 0) goto L16
            java.lang.String r1 = r6.getPseudonymousId()
            if (r1 != 0) goto L4a
            goto L20
        L16:
            java.lang.String r3 = r6.getPseudonymousId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4a
        L20:
            byte[] r1 = r5.experimentIdsClear
            boolean r3 = r6 instanceof com.google.android.datatransport.AutoValue_EventContext
            if (r3 == 0) goto L2c
            r4 = r6
            com.google.android.datatransport.AutoValue_EventContext r4 = (com.google.android.datatransport.AutoValue_EventContext) r4
            byte[] r4 = r4.experimentIdsClear
            goto L30
        L2c:
            byte[] r4 = r6.getExperimentIdsClear()
        L30:
            boolean r1 = java.util.Arrays.equals(r1, r4)
            if (r1 == 0) goto L4a
            byte[] r1 = r5.experimentIdsEncrypted
            if (r3 == 0) goto L3f
            com.google.android.datatransport.AutoValue_EventContext r6 = (com.google.android.datatransport.AutoValue_EventContext) r6
            byte[] r6 = r6.experimentIdsEncrypted
            goto L43
        L3f:
            byte[] r6 = r6.getExperimentIdsEncrypted()
        L43:
            boolean r6 = java.util.Arrays.equals(r1, r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            r0 = 0
        L4b:
            return r0
        L4c:
            return r2
    }

    @Override // com.google.android.datatransport.EventContext
    public byte[] getExperimentIdsClear() {
            r1 = this;
            byte[] r0 = r1.experimentIdsClear
            return r0
    }

    @Override // com.google.android.datatransport.EventContext
    public byte[] getExperimentIdsEncrypted() {
            r1 = this;
            byte[] r0 = r1.experimentIdsEncrypted
            return r0
    }

    @Override // com.google.android.datatransport.EventContext
    public java.lang.String getPseudonymousId() {
            r1 = this;
            java.lang.String r0 = r1.pseudonymousId
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.pseudonymousId
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            byte[] r2 = r3.experimentIdsClear
            int r2 = java.util.Arrays.hashCode(r2)
            r0 = r0 ^ r2
            int r0 = r0 * r1
            byte[] r1 = r3.experimentIdsEncrypted
            int r1 = java.util.Arrays.hashCode(r1)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "EventContext{pseudonymousId="
            r0.append(r1)
            java.lang.String r1 = r2.pseudonymousId
            r0.append(r1)
            java.lang.String r1 = ", experimentIdsClear="
            r0.append(r1)
            byte[] r1 = r2.experimentIdsClear
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ", experimentIdsEncrypted="
            r0.append(r1)
            byte[] r1 = r2.experimentIdsEncrypted
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
