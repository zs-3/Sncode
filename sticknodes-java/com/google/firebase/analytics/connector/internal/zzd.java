package com.google.firebase.analytics.connector.internal;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* loaded from: classes2.dex */
final class zzd implements com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener {
    final /* synthetic */ com.google.firebase.analytics.connector.internal.zze zza;

    public zzd(com.google.firebase.analytics.connector.internal.zze r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzkc
    public final void onEvent(java.lang.String r1, java.lang.String r2, android.os.Bundle r3, long r4) {
            r0 = this;
            com.google.firebase.analytics.connector.internal.zze r1 = r0.zza
            java.util.Set r3 = r1.zza
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto Lb
            return
        Lb:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            int r4 = com.google.firebase.analytics.connector.internal.zzc.zza
            java.lang.String r4 = com.google.android.gms.measurement.internal.zzjy.zza(r2)
            if (r4 == 0) goto L19
            r2 = r4
        L19:
            java.lang.String r4 = "events"
            r3.putString(r4, r2)
            com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorListener r1 = com.google.firebase.analytics.connector.internal.zze.zzd(r1)
            r2 = 2
            r1.onMessageTriggered(r2, r3)
            return
    }
}
