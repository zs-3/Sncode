package com.google.android.datatransport;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class EventContext {

    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.android.datatransport.EventContext build();

        public abstract com.google.android.datatransport.EventContext.Builder setExperimentIdsClear(byte[] r1);

        public abstract com.google.android.datatransport.EventContext.Builder setExperimentIdsEncrypted(byte[] r1);

        public abstract com.google.android.datatransport.EventContext.Builder setPseudonymousId(java.lang.String r1);
    }

    public EventContext() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.EventContext.Builder builder() {
            com.google.android.datatransport.AutoValue_EventContext$Builder r0 = new com.google.android.datatransport.AutoValue_EventContext$Builder
            r0.<init>()
            return r0
    }

    public abstract byte[] getExperimentIdsClear();

    public abstract byte[] getExperimentIdsEncrypted();

    public abstract java.lang.String getPseudonymousId();
}
