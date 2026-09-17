package com.google.firebase.analytics.connector.internal;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* loaded from: classes2.dex */
public final class zze {
    final java.util.Set zza;
    private final com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener zzb;
    private final com.google.android.gms.measurement.api.AppMeasurementSdk zzc;
    private final com.google.firebase.analytics.connector.internal.zzd zzd;

    public zze(com.google.android.gms.measurement.api.AppMeasurementSdk r1, com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r2
            r0.zzc = r1
            com.google.firebase.analytics.connector.internal.zzd r2 = new com.google.firebase.analytics.connector.internal.zzd
            r2.<init>(r0)
            r0.zzd = r2
            r1.registerOnMeasurementEventListener(r2)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.zza = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener zzd(com.google.firebase.analytics.connector.internal.zze r0) {
            com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorListener r0 = r0.zzb
            return r0
    }
}
