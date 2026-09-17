package com.google.firebase.analytics.connector;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* loaded from: classes2.dex */
public class AnalyticsConnectorImpl implements com.google.firebase.analytics.connector.AnalyticsConnector {
    private static volatile com.google.firebase.analytics.connector.AnalyticsConnector zzc;
    final com.google.android.gms.measurement.api.AppMeasurementSdk zza;
    final java.util.Map zzb;


    AnalyticsConnectorImpl(com.google.android.gms.measurement.api.AppMeasurementSdk r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zza = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.zzb = r1
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.firebase.analytics.connector.AnalyticsConnector getInstance(com.google.firebase.FirebaseApp r5, android.content.Context r6, com.google.firebase.events.Subscriber r7) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            android.content.Context r0 = r6.getApplicationContext()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.firebase.analytics.connector.AnalyticsConnector r0 = com.google.firebase.analytics.connector.AnalyticsConnectorImpl.zzc
            if (r0 != 0) goto L54
            java.lang.Class<com.google.firebase.analytics.connector.AnalyticsConnectorImpl> r0 = com.google.firebase.analytics.connector.AnalyticsConnectorImpl.class
            monitor-enter(r0)
            com.google.firebase.analytics.connector.AnalyticsConnector r1 = com.google.firebase.analytics.connector.AnalyticsConnectorImpl.zzc     // Catch: java.lang.Throwable -> L51
            if (r1 != 0) goto L4f
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> L51
            r2 = 1
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L51
            boolean r2 = r5.isDefaultApp()     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L3f
            java.lang.Class<com.google.firebase.DataCollectionDefaultChange> r2 = com.google.firebase.DataCollectionDefaultChange.class
            com.google.firebase.analytics.connector.zza r3 = new com.google.firebase.analytics.connector.zza     // Catch: java.lang.Throwable -> L51
            r3.<init>()     // Catch: java.lang.Throwable -> L51
            com.google.firebase.analytics.connector.zzb r4 = new com.google.firebase.analytics.connector.zzb     // Catch: java.lang.Throwable -> L51
            r4.<init>()     // Catch: java.lang.Throwable -> L51
            r7.subscribe(r2, r3, r4)     // Catch: java.lang.Throwable -> L51
            java.lang.String r7 = "dataCollectionDefaultEnabled"
            boolean r5 = r5.isDataCollectionDefaultEnabled()     // Catch: java.lang.Throwable -> L51
            r1.putBoolean(r7, r5)     // Catch: java.lang.Throwable -> L51
        L3f:
            com.google.firebase.analytics.connector.AnalyticsConnectorImpl r5 = new com.google.firebase.analytics.connector.AnalyticsConnectorImpl     // Catch: java.lang.Throwable -> L51
            r7 = 0
            com.google.android.gms.internal.measurement.zzff r6 = com.google.android.gms.internal.measurement.zzff.zzg(r6, r7, r7, r7, r1)     // Catch: java.lang.Throwable -> L51
            com.google.android.gms.measurement.api.AppMeasurementSdk r6 = r6.zzd()     // Catch: java.lang.Throwable -> L51
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L51
            com.google.firebase.analytics.connector.AnalyticsConnectorImpl.zzc = r5     // Catch: java.lang.Throwable -> L51
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            goto L54
        L51:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            throw r5
        L54:
            com.google.firebase.analytics.connector.AnalyticsConnector r5 = com.google.firebase.analytics.connector.AnalyticsConnectorImpl.zzc
            return r5
    }

    static /* synthetic */ void zza(com.google.firebase.events.Event r2) {
            java.lang.Object r2 = r2.getPayload()
            com.google.firebase.DataCollectionDefaultChange r2 = (com.google.firebase.DataCollectionDefaultChange) r2
            boolean r2 = r2.enabled
            java.lang.Class<com.google.firebase.analytics.connector.AnalyticsConnectorImpl> r0 = com.google.firebase.analytics.connector.AnalyticsConnectorImpl.class
            monitor-enter(r0)
            com.google.firebase.analytics.connector.AnalyticsConnector r1 = com.google.firebase.analytics.connector.AnalyticsConnectorImpl.zzc     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L1a
            com.google.firebase.analytics.connector.AnalyticsConnectorImpl r1 = (com.google.firebase.analytics.connector.AnalyticsConnectorImpl) r1     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.api.AppMeasurementSdk r1 = r1.zza     // Catch: java.lang.Throwable -> L1a
            r1.zza(r2)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r2
    }

    private final boolean zzc(java.lang.String r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L16
            java.util.Map r0 = r2.zzb
            boolean r1 = r0.containsKey(r3)
            if (r1 == 0) goto L16
            java.lang.Object r3 = r0.get(r3)
            if (r3 == 0) goto L16
            r3 = 1
            return r3
        L16:
            r3 = 0
            return r3
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @com.google.android.gms.common.annotation.KeepForSdk
    public void logEvent(java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
            r3 = this;
            if (r6 != 0) goto L7
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
        L7:
            boolean r0 = com.google.firebase.analytics.connector.internal.zzc.zzd(r4)
            if (r0 != 0) goto Le
            goto L36
        Le:
            boolean r0 = com.google.firebase.analytics.connector.internal.zzc.zzb(r5, r6)
            if (r0 == 0) goto L36
            boolean r0 = com.google.firebase.analytics.connector.internal.zzc.zza(r4, r5, r6)
            if (r0 == 0) goto L36
            java.lang.String r0 = "clx"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L31
            java.lang.String r0 = "_ae"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L31
            r0 = 1
            java.lang.String r2 = "_r"
            r6.putLong(r2, r0)
        L31:
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r3.zza
            r0.logEvent(r4, r5, r6)
        L36:
            return
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener(java.lang.String r4, com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener r5) {
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            boolean r0 = com.google.firebase.analytics.connector.internal.zzc.zzd(r4)
            r1 = 0
            if (r0 != 0) goto Lb
            goto L3d
        Lb:
            boolean r0 = r3.zzc(r4)
            if (r0 != 0) goto L3d
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r3.zza
            java.lang.String r2 = "fiam"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L21
            com.google.firebase.analytics.connector.internal.zze r2 = new com.google.firebase.analytics.connector.internal.zze
            r2.<init>(r0, r5)
            goto L30
        L21:
            java.lang.String r2 = "clx"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L2f
            com.google.firebase.analytics.connector.internal.zzg r2 = new com.google.firebase.analytics.connector.internal.zzg
            r2.<init>(r0, r5)
            goto L30
        L2f:
            r2 = r1
        L30:
            if (r2 == 0) goto L3d
            java.util.Map r5 = r3.zzb
            r5.put(r4, r2)
            com.google.firebase.analytics.connector.AnalyticsConnectorImpl$1 r5 = new com.google.firebase.analytics.connector.AnalyticsConnectorImpl$1
            r5.<init>(r3, r4)
            return r5
        L3d:
            return r1
    }
}
