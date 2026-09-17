package com.google.android.datatransport.cct.internal;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class ExternalPRequestContext {

    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.android.datatransport.cct.internal.ExternalPRequestContext build();

        public abstract com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder setOriginAssociatedProductId(java.lang.Integer r1);
    }

    public ExternalPRequestContext() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder builder() {
            com.google.android.datatransport.cct.internal.AutoValue_ExternalPRequestContext$Builder r0 = new com.google.android.datatransport.cct.internal.AutoValue_ExternalPRequestContext$Builder
            r0.<init>()
            return r0
    }

    public abstract java.lang.Integer getOriginAssociatedProductId();
}
