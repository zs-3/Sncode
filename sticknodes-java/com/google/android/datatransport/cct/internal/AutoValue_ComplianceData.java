package com.google.android.datatransport.cct.internal;

/* loaded from: classes.dex */
final class AutoValue_ComplianceData extends com.google.android.datatransport.cct.internal.ComplianceData {
    private final com.google.android.datatransport.cct.internal.ExternalPrivacyContext privacyContext;
    private final com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin productIdOrigin;

    /* renamed from: com.google.android.datatransport.cct.internal.AutoValue_ComplianceData$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.ComplianceData.Builder {
        private com.google.android.datatransport.cct.internal.ExternalPrivacyContext privacyContext;
        private com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin productIdOrigin;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public com.google.android.datatransport.cct.internal.ComplianceData build() {
                r4 = this;
                com.google.android.datatransport.cct.internal.AutoValue_ComplianceData r0 = new com.google.android.datatransport.cct.internal.AutoValue_ComplianceData
                com.google.android.datatransport.cct.internal.ExternalPrivacyContext r1 = r4.privacyContext
                com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin r2 = r4.productIdOrigin
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public com.google.android.datatransport.cct.internal.ComplianceData.Builder setPrivacyContext(com.google.android.datatransport.cct.internal.ExternalPrivacyContext r1) {
                r0 = this;
                r0.privacyContext = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public com.google.android.datatransport.cct.internal.ComplianceData.Builder setProductIdOrigin(com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin r1) {
                r0 = this;
                r0.productIdOrigin = r1
                return r0
        }
    }

    private AutoValue_ComplianceData(com.google.android.datatransport.cct.internal.ExternalPrivacyContext r1, com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin r2) {
            r0 = this;
            r0.<init>()
            r0.privacyContext = r1
            r0.productIdOrigin = r2
            return
    }

    /* synthetic */ AutoValue_ComplianceData(com.google.android.datatransport.cct.internal.ExternalPrivacyContext r1, com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin r2, com.google.android.datatransport.cct.internal.AutoValue_ComplianceData.AnonymousClass1 r3) {
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
            boolean r1 = r5 instanceof com.google.android.datatransport.cct.internal.ComplianceData
            r2 = 0
            if (r1 == 0) goto L38
            com.google.android.datatransport.cct.internal.ComplianceData r5 = (com.google.android.datatransport.cct.internal.ComplianceData) r5
            com.google.android.datatransport.cct.internal.ExternalPrivacyContext r1 = r4.privacyContext
            if (r1 != 0) goto L16
            com.google.android.datatransport.cct.internal.ExternalPrivacyContext r1 = r5.getPrivacyContext()
            if (r1 != 0) goto L36
            goto L20
        L16:
            com.google.android.datatransport.cct.internal.ExternalPrivacyContext r3 = r5.getPrivacyContext()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L36
        L20:
            com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin r1 = r4.productIdOrigin
            if (r1 != 0) goto L2b
            com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin r5 = r5.getProductIdOrigin()
            if (r5 != 0) goto L36
            goto L37
        L2b:
            com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin r5 = r5.getProductIdOrigin()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L36
            goto L37
        L36:
            r0 = 0
        L37:
            return r0
        L38:
            return r2
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public com.google.android.datatransport.cct.internal.ExternalPrivacyContext getPrivacyContext() {
            r1 = this;
            com.google.android.datatransport.cct.internal.ExternalPrivacyContext r0 = r1.privacyContext
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin getProductIdOrigin() {
            r1 = this;
            com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin r0 = r1.productIdOrigin
            return r0
    }

    public int hashCode() {
            r3 = this;
            com.google.android.datatransport.cct.internal.ExternalPrivacyContext r0 = r3.privacyContext
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            r2 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r2
            int r0 = r0 * r2
            com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin r2 = r3.productIdOrigin
            if (r2 != 0) goto L16
            goto L1a
        L16:
            int r1 = r2.hashCode()
        L1a:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ComplianceData{privacyContext="
            r0.append(r1)
            com.google.android.datatransport.cct.internal.ExternalPrivacyContext r1 = r2.privacyContext
            r0.append(r1)
            java.lang.String r1 = ", productIdOrigin="
            r0.append(r1)
            com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin r1 = r2.productIdOrigin
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
