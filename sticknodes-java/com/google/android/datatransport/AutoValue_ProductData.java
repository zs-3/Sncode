package com.google.android.datatransport;

/* loaded from: classes.dex */
final class AutoValue_ProductData extends com.google.android.datatransport.ProductData {
    private final java.lang.Integer productId;

    AutoValue_ProductData(java.lang.Integer r1) {
            r0 = this;
            r0.<init>()
            r0.productId = r1
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.google.android.datatransport.ProductData
            r2 = 0
            if (r1 == 0) goto L1d
            com.google.android.datatransport.ProductData r4 = (com.google.android.datatransport.ProductData) r4
            java.lang.Integer r1 = r3.productId
            java.lang.Integer r4 = r4.getProductId()
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

    @Override // com.google.android.datatransport.ProductData
    public java.lang.Integer getProductId() {
            r1 = this;
            java.lang.Integer r0 = r1.productId
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Integer r0 = r2.productId
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
            java.lang.String r1 = "ProductData{productId="
            r0.append(r1)
            java.lang.Integer r1 = r2.productId
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
