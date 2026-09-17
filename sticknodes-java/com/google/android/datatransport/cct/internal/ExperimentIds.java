package com.google.android.datatransport.cct.internal;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class ExperimentIds {

    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.android.datatransport.cct.internal.ExperimentIds build();

        public abstract com.google.android.datatransport.cct.internal.ExperimentIds.Builder setClearBlob(byte[] r1);

        public abstract com.google.android.datatransport.cct.internal.ExperimentIds.Builder setEncryptedBlob(byte[] r1);
    }

    public ExperimentIds() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.cct.internal.ExperimentIds.Builder builder() {
            com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds$Builder r0 = new com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds$Builder
            r0.<init>()
            return r0
    }

    public abstract byte[] getClearBlob();

    public abstract byte[] getEncryptedBlob();
}
