package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class TelemetryLoggingOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    public static final com.google.android.gms.common.internal.TelemetryLoggingOptions zaa = null;
    private final java.lang.String zab;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class Builder {
        private java.lang.String zaa;

        private Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Builder(com.google.android.gms.common.internal.zaac r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.internal.TelemetryLoggingOptions build() {
                r3 = this;
                com.google.android.gms.common.internal.TelemetryLoggingOptions r0 = new com.google.android.gms.common.internal.TelemetryLoggingOptions
                java.lang.String r1 = r3.zaa
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.internal.TelemetryLoggingOptions.Builder setApi(java.lang.String r1) {
                r0 = this;
                r0.zaa = r1
                return r0
        }
    }

    static {
            com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder r0 = builder()
            com.google.android.gms.common.internal.TelemetryLoggingOptions r0 = r0.build()
            com.google.android.gms.common.internal.TelemetryLoggingOptions.zaa = r0
            return
    }

    /* synthetic */ TelemetryLoggingOptions(java.lang.String r1, com.google.android.gms.common.internal.zaad r2) {
            r0 = this;
            r0.<init>()
            r0.zab = r1
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.internal.TelemetryLoggingOptions.Builder builder() {
            com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder r0 = new com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.common.internal.TelemetryLoggingOptions
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.common.internal.TelemetryLoggingOptions r2 = (com.google.android.gms.common.internal.TelemetryLoggingOptions) r2
            java.lang.String r0 = r1.zab
            java.lang.String r2 = r2.zab
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zab
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r0
    }

    public final android.os.Bundle zaa() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r3.zab
            if (r1 == 0) goto Le
            java.lang.String r2 = "api"
            r0.putString(r2, r1)
        Le:
            return r0
    }
}
