package com.google.firebase.analytics.connector.internal;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzg {
    private final com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener zza;
    private final com.google.android.gms.measurement.api.AppMeasurementSdk zzb;
    private final com.google.firebase.analytics.connector.internal.zzf zzc;

    public zzg(com.google.android.gms.measurement.api.AppMeasurementSdk r1, com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            r0.zzb = r1
            com.google.firebase.analytics.connector.internal.zzf r2 = new com.google.firebase.analytics.connector.internal.zzf
            r2.<init>(r0)
            r0.zzc = r2
            r1.registerOnMeasurementEventListener(r2)
            return
    }

    static /* bridge */ /* synthetic */ com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener zzd(com.google.firebase.analytics.connector.internal.zzg r0) {
            com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorListener r0 = r0.zza
            return r0
    }
}
