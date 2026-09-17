package com.google.firebase.analytics.connector.internal;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* loaded from: classes2.dex */
final class zzf implements com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener {
    final /* synthetic */ com.google.firebase.analytics.connector.internal.zzg zza;

    public zzf(com.google.firebase.analytics.connector.internal.zzg r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzkc
    public final void onEvent(java.lang.String r2, java.lang.String r3, android.os.Bundle r4, long r5) {
            r1 = this;
            if (r2 == 0) goto L26
            boolean r2 = com.google.firebase.analytics.connector.internal.zzc.zzc(r3)
            if (r2 == 0) goto L26
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r0 = "name"
            r2.putString(r0, r3)
            java.lang.String r3 = "timestampInMillis"
            r2.putLong(r3, r5)
            java.lang.String r3 = "params"
            r2.putBundle(r3, r4)
            com.google.firebase.analytics.connector.internal.zzg r3 = r1.zza
            com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorListener r3 = com.google.firebase.analytics.connector.internal.zzg.zzd(r3)
            r4 = 3
            r3.onMessageTriggered(r4, r2)
        L26:
            return
    }
}
