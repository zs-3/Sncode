package com.google.android.datatransport.cct.internal;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class LogEvent {

    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.android.datatransport.cct.internal.LogEvent build();

        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setComplianceData(com.google.android.datatransport.cct.internal.ComplianceData r1);

        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setEventCode(java.lang.Integer r1);

        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setEventTimeMs(long r1);

        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setEventUptimeMs(long r1);

        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setExperimentIds(com.google.android.datatransport.cct.internal.ExperimentIds r1);

        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setNetworkConnectionInfo(com.google.android.datatransport.cct.internal.NetworkConnectionInfo r1);

        abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setSourceExtension(byte[] r1);

        abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setSourceExtensionJsonProto3(java.lang.String r1);

        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setTimezoneOffsetSeconds(long r1);
    }

    public LogEvent() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.android.datatransport.cct.internal.LogEvent.Builder builder() {
            com.google.android.datatransport.cct.internal.AutoValue_LogEvent$Builder r0 = new com.google.android.datatransport.cct.internal.AutoValue_LogEvent$Builder
            r0.<init>()
            return r0
    }

    public static com.google.android.datatransport.cct.internal.LogEvent.Builder jsonBuilder(java.lang.String r1) {
            com.google.android.datatransport.cct.internal.LogEvent$Builder r0 = builder()
            com.google.android.datatransport.cct.internal.LogEvent$Builder r1 = r0.setSourceExtensionJsonProto3(r1)
            return r1
    }

    public static com.google.android.datatransport.cct.internal.LogEvent.Builder protoBuilder(byte[] r1) {
            com.google.android.datatransport.cct.internal.LogEvent$Builder r0 = builder()
            com.google.android.datatransport.cct.internal.LogEvent$Builder r1 = r0.setSourceExtension(r1)
            return r1
    }

    public abstract com.google.android.datatransport.cct.internal.ComplianceData getComplianceData();

    public abstract java.lang.Integer getEventCode();

    public abstract long getEventTimeMs();

    public abstract long getEventUptimeMs();

    public abstract com.google.android.datatransport.cct.internal.ExperimentIds getExperimentIds();

    public abstract com.google.android.datatransport.cct.internal.NetworkConnectionInfo getNetworkConnectionInfo();

    public abstract byte[] getSourceExtension();

    public abstract java.lang.String getSourceExtensionJsonProto3();

    public abstract long getTimezoneOffsetSeconds();
}
