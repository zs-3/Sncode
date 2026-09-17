package com.google.android.datatransport.runtime.scheduling.persistence;

/* loaded from: classes.dex */
public interface ClientHealthMetricsStore {
    com.google.android.datatransport.runtime.firebase.transport.ClientMetrics loadClientMetrics();

    void recordLogEventDropped(long r1, com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason r3, java.lang.String r4);

    void resetClientMetrics();
}
