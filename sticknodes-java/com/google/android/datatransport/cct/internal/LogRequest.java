package com.google.android.datatransport.cct.internal;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class LogRequest {

    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.android.datatransport.cct.internal.LogRequest build();

        public abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setClientInfo(com.google.android.datatransport.cct.internal.ClientInfo r1);

        public abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setLogEvents(java.util.List<com.google.android.datatransport.cct.internal.LogEvent> r1);

        abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setLogSource(java.lang.Integer r1);

        abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setLogSourceName(java.lang.String r1);

        public abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setQosTier(com.google.android.datatransport.cct.internal.QosTier r1);

        public abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setRequestTimeMs(long r1);

        public abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setRequestUptimeMs(long r1);

        public com.google.android.datatransport.cct.internal.LogRequest.Builder setSource(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.google.android.datatransport.cct.internal.LogRequest$Builder r1 = r0.setLogSource(r1)
                return r1
        }

        public com.google.android.datatransport.cct.internal.LogRequest.Builder setSource(java.lang.String r1) {
                r0 = this;
                com.google.android.datatransport.cct.internal.LogRequest$Builder r1 = r0.setLogSourceName(r1)
                return r1
        }
    }

    public LogRequest() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.cct.internal.LogRequest.Builder builder() {
            com.google.android.datatransport.cct.internal.AutoValue_LogRequest$Builder r0 = new com.google.android.datatransport.cct.internal.AutoValue_LogRequest$Builder
            r0.<init>()
            return r0
    }

    public abstract com.google.android.datatransport.cct.internal.ClientInfo getClientInfo();

    public abstract java.util.List<com.google.android.datatransport.cct.internal.LogEvent> getLogEvents();

    public abstract java.lang.Integer getLogSource();

    public abstract java.lang.String getLogSourceName();

    public abstract com.google.android.datatransport.cct.internal.QosTier getQosTier();

    public abstract long getRequestTimeMs();

    public abstract long getRequestUptimeMs();
}
