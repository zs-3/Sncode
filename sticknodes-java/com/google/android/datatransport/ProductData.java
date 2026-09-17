package com.google.android.datatransport;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class ProductData {
    public ProductData() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.ProductData withProductId(java.lang.Integer r1) {
            com.google.android.datatransport.AutoValue_ProductData r0 = new com.google.android.datatransport.AutoValue_ProductData
            r0.<init>(r1)
            return r0
    }

    public abstract java.lang.Integer getProductId();
}
