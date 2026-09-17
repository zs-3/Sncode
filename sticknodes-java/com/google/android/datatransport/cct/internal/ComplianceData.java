package com.google.android.datatransport.cct.internal;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class ComplianceData {

    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.android.datatransport.cct.internal.ComplianceData build();

        public abstract com.google.android.datatransport.cct.internal.ComplianceData.Builder setPrivacyContext(com.google.android.datatransport.cct.internal.ExternalPrivacyContext r1);

        public abstract com.google.android.datatransport.cct.internal.ComplianceData.Builder setProductIdOrigin(com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin r1);
    }

    public enum ProductIdOrigin extends java.lang.Enum<com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin> {
        private static final /* synthetic */ com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin[] $VALUES = null;
        public static final com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin EVENT_OVERRIDE = null;
        public static final com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin NOT_SET = null;
        private static final android.util.SparseArray<com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin> valueMap = null;
        private final int value;

        static {
                com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin r0 = new com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin
                java.lang.String r1 = "NOT_SET"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin.NOT_SET = r0
                com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin r1 = new com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin
                java.lang.String r3 = "EVENT_OVERRIDE"
                r4 = 1
                r5 = 5
                r1.<init>(r3, r4, r5)
                com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin.EVENT_OVERRIDE = r1
                r3 = 2
                com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin[] r3 = new com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin.$VALUES = r3
                android.util.SparseArray r3 = new android.util.SparseArray
                r3.<init>()
                com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin.valueMap = r3
                r3.put(r2, r0)
                r3.put(r5, r1)
                return
        }

        ProductIdOrigin(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin forNumber(int r1) {
                android.util.SparseArray<com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin> r0 = com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin.valueMap
                java.lang.Object r1 = r0.get(r1)
                com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin r1 = (com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin) r1
                return r1
        }

        public static com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin> r0 = com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin r1 = (com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin) r1
                return r1
        }

        public static com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin[] values() {
                com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin[] r0 = com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin[] r0 = (com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin[]) r0
                return r0
        }

        public int getValue() {
                r1 = this;
                int r0 = r1.value
                return r0
        }
    }

    public ComplianceData() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.cct.internal.ComplianceData.Builder builder() {
            com.google.android.datatransport.cct.internal.AutoValue_ComplianceData$Builder r0 = new com.google.android.datatransport.cct.internal.AutoValue_ComplianceData$Builder
            r0.<init>()
            return r0
    }

    public abstract com.google.android.datatransport.cct.internal.ExternalPrivacyContext getPrivacyContext();

    public abstract com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin getProductIdOrigin();
}
