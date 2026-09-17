package com.google.android.datatransport.cct.internal;

/* loaded from: classes.dex */
final class AutoValue_ExternalPrivacyContext extends com.google.android.datatransport.cct.internal.ExternalPrivacyContext {
    private final com.google.android.datatransport.cct.internal.ExternalPRequestContext prequest;

    /* renamed from: com.google.android.datatransport.cct.internal.AutoValue_ExternalPrivacyContext$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder {
        private com.google.android.datatransport.cct.internal.ExternalPRequestContext prequest;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder
        public com.google.android.datatransport.cct.internal.ExternalPrivacyContext build() {
                r3 = this;
                com.google.android.datatransport.cct.internal.AutoValue_ExternalPrivacyContext r0 = new com.google.android.datatransport.cct.internal.AutoValue_ExternalPrivacyContext
                com.google.android.datatransport.cct.internal.ExternalPRequestContext r1 = r3.prequest
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder
        public com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder setPrequest(com.google.android.datatransport.cct.internal.ExternalPRequestContext r1) {
                r0 = this;
                r0.prequest = r1
                return r0
        }
    }

    private AutoValue_ExternalPrivacyContext(com.google.android.datatransport.cct.internal.ExternalPRequestContext r1) {
            r0 = this;
            r0.<init>()
            r0.prequest = r1
            return
    }

    /* synthetic */ AutoValue_ExternalPrivacyContext(com.google.android.datatransport.cct.internal.ExternalPRequestContext r1, com.google.android.datatransport.cct.internal.AutoValue_ExternalPrivacyContext.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.google.android.datatransport.cct.internal.ExternalPrivacyContext
            r2 = 0
            if (r1 == 0) goto L1d
            com.google.android.datatransport.cct.internal.ExternalPrivacyContext r4 = (com.google.android.datatransport.cct.internal.ExternalPrivacyContext) r4
            com.google.android.datatransport.cct.internal.ExternalPRequestContext r1 = r3.prequest
            com.google.android.datatransport.cct.internal.ExternalPRequestContext r4 = r4.getPrequest()
            if (r1 != 0) goto L18
            if (r4 != 0) goto L16
            goto L1c
        L16:
            r0 = 0
            goto L1c
        L18:
            boolean r0 = r1.equals(r4)
        L1c:
            return r0
        L1d:
            return r2
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext
    public com.google.android.datatransport.cct.internal.ExternalPRequestContext getPrequest() {
            r1 = this;
            com.google.android.datatransport.cct.internal.ExternalPRequestContext r0 = r1.prequest
            return r0
    }

    public int hashCode() {
            r2 = this;
            com.google.android.datatransport.cct.internal.ExternalPRequestContext r0 = r2.prequest
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ExternalPrivacyContext{prequest="
            r0.append(r1)
            com.google.android.datatransport.cct.internal.ExternalPRequestContext r1 = r2.prequest
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
