package com.google.android.datatransport.cct.internal;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class ExternalPrivacyContext {

    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.android.datatransport.cct.internal.ExternalPrivacyContext build();

        public abstract com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder setPrequest(com.google.android.datatransport.cct.internal.ExternalPRequestContext r1);
    }

    public ExternalPrivacyContext() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder builder() {
            com.google.android.datatransport.cct.internal.AutoValue_ExternalPrivacyContext$Builder r0 = new com.google.android.datatransport.cct.internal.AutoValue_ExternalPrivacyContext$Builder
            r0.<init>()
            return r0
    }

    public abstract com.google.android.datatransport.cct.internal.ExternalPRequestContext getPrequest();
}
