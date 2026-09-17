package com.google.android.datatransport.runtime;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class EventInternal {

    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public final com.google.android.datatransport.runtime.EventInternal.Builder addMetadata(java.lang.String r2, int r3) {
                r1 = this;
                java.util.Map r0 = r1.getAutoMetadata()
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r0.put(r2, r3)
                return r1
        }

        public final com.google.android.datatransport.runtime.EventInternal.Builder addMetadata(java.lang.String r2, long r3) {
                r1 = this;
                java.util.Map r0 = r1.getAutoMetadata()
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r0.put(r2, r3)
                return r1
        }

        public final com.google.android.datatransport.runtime.EventInternal.Builder addMetadata(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.util.Map r0 = r1.getAutoMetadata()
                r0.put(r2, r3)
                return r1
        }

        public abstract com.google.android.datatransport.runtime.EventInternal build();

        protected abstract java.util.Map<java.lang.String, java.lang.String> getAutoMetadata();

        protected abstract com.google.android.datatransport.runtime.EventInternal.Builder setAutoMetadata(java.util.Map<java.lang.String, java.lang.String> r1);

        public abstract com.google.android.datatransport.runtime.EventInternal.Builder setCode(java.lang.Integer r1);

        public abstract com.google.android.datatransport.runtime.EventInternal.Builder setEncodedPayload(com.google.android.datatransport.runtime.EncodedPayload r1);

        public abstract com.google.android.datatransport.runtime.EventInternal.Builder setEventMillis(long r1);

        public abstract com.google.android.datatransport.runtime.EventInternal.Builder setExperimentIdsClear(byte[] r1);

        public abstract com.google.android.datatransport.runtime.EventInternal.Builder setExperimentIdsEncrypted(byte[] r1);

        public abstract com.google.android.datatransport.runtime.EventInternal.Builder setProductId(java.lang.Integer r1);

        public abstract com.google.android.datatransport.runtime.EventInternal.Builder setPseudonymousId(java.lang.String r1);

        public abstract com.google.android.datatransport.runtime.EventInternal.Builder setTransportName(java.lang.String r1);

        public abstract com.google.android.datatransport.runtime.EventInternal.Builder setUptimeMillis(long r1);
    }

    public EventInternal() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.EventInternal.Builder builder() {
            com.google.android.datatransport.runtime.AutoValue_EventInternal$Builder r0 = new com.google.android.datatransport.runtime.AutoValue_EventInternal$Builder
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.datatransport.runtime.EventInternal$Builder r0 = r0.setAutoMetadata(r1)
            return r0
    }

    public final java.lang.String get(java.lang.String r2) {
            r1 = this;
            java.util.Map r0 = r1.getAutoMetadata()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Le
            java.lang.String r2 = ""
        Le:
            return r2
    }

    protected abstract java.util.Map<java.lang.String, java.lang.String> getAutoMetadata();

    public abstract java.lang.Integer getCode();

    public abstract com.google.android.datatransport.runtime.EncodedPayload getEncodedPayload();

    public abstract long getEventMillis();

    public abstract byte[] getExperimentIdsClear();

    public abstract byte[] getExperimentIdsEncrypted();

    public final int getInteger(java.lang.String r2) {
            r1 = this;
            java.util.Map r0 = r1.getAutoMetadata()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Le
            r2 = 0
            goto L16
        Le:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = r2.intValue()
        L16:
            return r2
    }

    public final long getLong(java.lang.String r3) {
            r2 = this;
            java.util.Map r0 = r2.getAutoMetadata()
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto Lf
            r0 = 0
            goto L17
        Lf:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r0 = r3.longValue()
        L17:
            return r0
    }

    public final java.util.Map<java.lang.String, java.lang.String> getMetadata() {
            r1 = this;
            java.util.Map r0 = r1.getAutoMetadata()
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }

    public final java.lang.String getOrDefault(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.Map r0 = r1.getAutoMetadata()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Ld
            goto Le
        Ld:
            r3 = r2
        Le:
            return r3
    }

    @java.lang.Deprecated
    public byte[] getPayload() {
            r1 = this;
            com.google.android.datatransport.runtime.EncodedPayload r0 = r1.getEncodedPayload()
            byte[] r0 = r0.getBytes()
            return r0
    }

    public abstract java.lang.Integer getProductId();

    public abstract java.lang.String getPseudonymousId();

    public abstract java.lang.String getTransportName();

    public abstract long getUptimeMillis();

    public com.google.android.datatransport.runtime.EventInternal.Builder toBuilder() {
            r3 = this;
            com.google.android.datatransport.runtime.AutoValue_EventInternal$Builder r0 = new com.google.android.datatransport.runtime.AutoValue_EventInternal$Builder
            r0.<init>()
            java.lang.String r1 = r3.getTransportName()
            com.google.android.datatransport.runtime.EventInternal$Builder r0 = r0.setTransportName(r1)
            java.lang.Integer r1 = r3.getCode()
            com.google.android.datatransport.runtime.EventInternal$Builder r0 = r0.setCode(r1)
            java.lang.Integer r1 = r3.getProductId()
            com.google.android.datatransport.runtime.EventInternal$Builder r0 = r0.setProductId(r1)
            java.lang.String r1 = r3.getPseudonymousId()
            com.google.android.datatransport.runtime.EventInternal$Builder r0 = r0.setPseudonymousId(r1)
            byte[] r1 = r3.getExperimentIdsClear()
            com.google.android.datatransport.runtime.EventInternal$Builder r0 = r0.setExperimentIdsClear(r1)
            byte[] r1 = r3.getExperimentIdsEncrypted()
            com.google.android.datatransport.runtime.EventInternal$Builder r0 = r0.setExperimentIdsEncrypted(r1)
            com.google.android.datatransport.runtime.EncodedPayload r1 = r3.getEncodedPayload()
            com.google.android.datatransport.runtime.EventInternal$Builder r0 = r0.setEncodedPayload(r1)
            long r1 = r3.getEventMillis()
            com.google.android.datatransport.runtime.EventInternal$Builder r0 = r0.setEventMillis(r1)
            long r1 = r3.getUptimeMillis()
            com.google.android.datatransport.runtime.EventInternal$Builder r0 = r0.setUptimeMillis(r1)
            java.util.HashMap r1 = new java.util.HashMap
            java.util.Map r2 = r3.getAutoMetadata()
            r1.<init>(r2)
            com.google.android.datatransport.runtime.EventInternal$Builder r0 = r0.setAutoMetadata(r1)
            return r0
    }
}
