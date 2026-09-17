package com.google.android.gms.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
@java.lang.Deprecated
/* loaded from: classes2.dex */
public class AppMeasurement {

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String CRASH_ORIGIN = "crash";

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String FCM_ORIGIN = "fcm";

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String FIAM_ORIGIN = "fiam";
    private static volatile com.google.android.gms.measurement.AppMeasurement zza;
    private final com.google.android.gms.measurement.zzc zzb;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class ConditionalUserProperty {

        @com.google.android.gms.common.internal.ShowFirstParty
        @androidx.annotation.Keep
        @com.google.android.gms.common.annotation.KeepForSdk
        public boolean mActive;

        @com.google.android.gms.common.internal.ShowFirstParty
        @androidx.annotation.Keep
        @com.google.android.gms.common.annotation.KeepForSdk
        public java.lang.String mAppId;

        @com.google.android.gms.common.internal.ShowFirstParty
        @androidx.annotation.Keep
        @com.google.android.gms.common.annotation.KeepForSdk
        public long mCreationTimestamp;

        @androidx.annotation.Keep
        public java.lang.String mExpiredEventName;

        @androidx.annotation.Keep
        public android.os.Bundle mExpiredEventParams;

        @com.google.android.gms.common.internal.ShowFirstParty
        @androidx.annotation.Keep
        @com.google.android.gms.common.annotation.KeepForSdk
        public java.lang.String mName;

        @com.google.android.gms.common.internal.ShowFirstParty
        @androidx.annotation.Keep
        @com.google.android.gms.common.annotation.KeepForSdk
        public java.lang.String mOrigin;

        @com.google.android.gms.common.internal.ShowFirstParty
        @androidx.annotation.Keep
        @com.google.android.gms.common.annotation.KeepForSdk
        public long mTimeToLive;

        @androidx.annotation.Keep
        public java.lang.String mTimedOutEventName;

        @androidx.annotation.Keep
        public android.os.Bundle mTimedOutEventParams;

        @com.google.android.gms.common.internal.ShowFirstParty
        @androidx.annotation.Keep
        @com.google.android.gms.common.annotation.KeepForSdk
        public java.lang.String mTriggerEventName;

        @com.google.android.gms.common.internal.ShowFirstParty
        @androidx.annotation.Keep
        @com.google.android.gms.common.annotation.KeepForSdk
        public long mTriggerTimeout;

        @androidx.annotation.Keep
        public java.lang.String mTriggeredEventName;

        @androidx.annotation.Keep
        public android.os.Bundle mTriggeredEventParams;

        @com.google.android.gms.common.internal.ShowFirstParty
        @androidx.annotation.Keep
        @com.google.android.gms.common.annotation.KeepForSdk
        public long mTriggeredTimestamp;

        @com.google.android.gms.common.internal.ShowFirstParty
        @androidx.annotation.Keep
        @com.google.android.gms.common.annotation.KeepForSdk
        public java.lang.Object mValue;

        @com.google.android.gms.common.annotation.KeepForSdk
        public ConditionalUserProperty() {
                r0 = this;
                r0.<init>()
                return
        }

        ConditionalUserProperty(android.os.Bundle r7) {
                r6 = this;
                java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r6.<init>()
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
                java.lang.String r2 = "app_id"
                r3 = 0
                java.lang.Object r2 = com.google.android.gms.measurement.internal.zzjt.zza(r7, r2, r1, r3)
                java.lang.String r2 = (java.lang.String) r2
                r6.mAppId = r2
                java.lang.String r2 = "origin"
                java.lang.Object r2 = com.google.android.gms.measurement.internal.zzjt.zza(r7, r2, r1, r3)
                java.lang.String r2 = (java.lang.String) r2
                r6.mOrigin = r2
                java.lang.String r2 = "name"
                java.lang.Object r2 = com.google.android.gms.measurement.internal.zzjt.zza(r7, r2, r1, r3)
                java.lang.String r2 = (java.lang.String) r2
                r6.mName = r2
                java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                java.lang.String r4 = "value"
                java.lang.Object r2 = com.google.android.gms.measurement.internal.zzjt.zza(r7, r4, r2, r3)
                r6.mValue = r2
                java.lang.String r2 = "trigger_event_name"
                java.lang.Object r2 = com.google.android.gms.measurement.internal.zzjt.zza(r7, r2, r1, r3)
                java.lang.String r2 = (java.lang.String) r2
                r6.mTriggerEventName = r2
                r4 = 0
                java.lang.Long r2 = java.lang.Long.valueOf(r4)
                java.lang.String r4 = "trigger_timeout"
                java.lang.Object r4 = com.google.android.gms.measurement.internal.zzjt.zza(r7, r4, r0, r2)
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                r6.mTriggerTimeout = r4
                java.lang.String r4 = "timed_out_event_name"
                java.lang.Object r4 = com.google.android.gms.measurement.internal.zzjt.zza(r7, r4, r1, r3)
                java.lang.String r4 = (java.lang.String) r4
                r6.mTimedOutEventName = r4
                java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
                java.lang.String r5 = "timed_out_event_params"
                java.lang.Object r4 = com.google.android.gms.measurement.internal.zzjt.zza(r7, r5, r4, r3)
                android.os.Bundle r4 = (android.os.Bundle) r4
                r6.mTimedOutEventParams = r4
                java.lang.String r4 = "triggered_event_name"
                java.lang.Object r4 = com.google.android.gms.measurement.internal.zzjt.zza(r7, r4, r1, r3)
                java.lang.String r4 = (java.lang.String) r4
                r6.mTriggeredEventName = r4
                java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
                java.lang.String r5 = "triggered_event_params"
                java.lang.Object r4 = com.google.android.gms.measurement.internal.zzjt.zza(r7, r5, r4, r3)
                android.os.Bundle r4 = (android.os.Bundle) r4
                r6.mTriggeredEventParams = r4
                java.lang.String r4 = "time_to_live"
                java.lang.Object r4 = com.google.android.gms.measurement.internal.zzjt.zza(r7, r4, r0, r2)
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                r6.mTimeToLive = r4
                java.lang.String r4 = "expired_event_name"
                java.lang.Object r1 = com.google.android.gms.measurement.internal.zzjt.zza(r7, r4, r1, r3)
                java.lang.String r1 = (java.lang.String) r1
                r6.mExpiredEventName = r1
                java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
                java.lang.String r4 = "expired_event_params"
                java.lang.Object r1 = com.google.android.gms.measurement.internal.zzjt.zza(r7, r4, r1, r3)
                android.os.Bundle r1 = (android.os.Bundle) r1
                r6.mExpiredEventParams = r1
                java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                java.lang.String r4 = "active"
                java.lang.Object r1 = com.google.android.gms.measurement.internal.zzjt.zza(r7, r4, r1, r3)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r6.mActive = r1
                java.lang.String r1 = "creation_timestamp"
                java.lang.Object r1 = com.google.android.gms.measurement.internal.zzjt.zza(r7, r1, r0, r2)
                java.lang.Long r1 = (java.lang.Long) r1
                long r3 = r1.longValue()
                r6.mCreationTimestamp = r3
                java.lang.String r1 = "triggered_timestamp"
                java.lang.Object r7 = com.google.android.gms.measurement.internal.zzjt.zza(r7, r1, r0, r2)
                java.lang.Long r7 = (java.lang.Long) r7
                long r0 = r7.longValue()
                r6.mTriggeredTimestamp = r0
                return
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public ConditionalUserProperty(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty r3) {
                r2 = this;
                r2.<init>()
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
                java.lang.String r0 = r3.mAppId
                r2.mAppId = r0
                java.lang.String r0 = r3.mOrigin
                r2.mOrigin = r0
                long r0 = r3.mCreationTimestamp
                r2.mCreationTimestamp = r0
                java.lang.String r0 = r3.mName
                r2.mName = r0
                java.lang.Object r0 = r3.mValue
                if (r0 == 0) goto L26
                java.lang.Object r0 = com.google.android.gms.measurement.internal.zzmg.zza(r0)
                r2.mValue = r0
                if (r0 != 0) goto L26
                java.lang.Object r0 = r3.mValue
                r2.mValue = r0
            L26:
                boolean r0 = r3.mActive
                r2.mActive = r0
                java.lang.String r0 = r3.mTriggerEventName
                r2.mTriggerEventName = r0
                long r0 = r3.mTriggerTimeout
                r2.mTriggerTimeout = r0
                java.lang.String r0 = r3.mTimedOutEventName
                r2.mTimedOutEventName = r0
                android.os.Bundle r0 = r3.mTimedOutEventParams
                if (r0 == 0) goto L41
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>(r0)
                r2.mTimedOutEventParams = r1
            L41:
                java.lang.String r0 = r3.mTriggeredEventName
                r2.mTriggeredEventName = r0
                android.os.Bundle r0 = r3.mTriggeredEventParams
                if (r0 == 0) goto L50
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>(r0)
                r2.mTriggeredEventParams = r1
            L50:
                long r0 = r3.mTriggeredTimestamp
                r2.mTriggeredTimestamp = r0
                long r0 = r3.mTimeToLive
                r2.mTimeToLive = r0
                java.lang.String r0 = r3.mExpiredEventName
                r2.mExpiredEventName = r0
                android.os.Bundle r3 = r3.mExpiredEventParams
                if (r3 == 0) goto L67
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>(r3)
                r2.mExpiredEventParams = r0
            L67:
                return
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface EventInterceptor extends com.google.android.gms.measurement.internal.zzkb {
        @Override // com.google.android.gms.measurement.internal.zzkb
        @com.google.android.gms.common.internal.ShowFirstParty
        @com.google.android.gms.common.annotation.KeepForSdk
        void interceptEvent(java.lang.String r1, java.lang.String r2, android.os.Bundle r3, long r4);
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface OnEventListener extends com.google.android.gms.measurement.internal.zzkc {
        @Override // com.google.android.gms.measurement.internal.zzkc
        @com.google.android.gms.common.internal.ShowFirstParty
        @com.google.android.gms.common.annotation.KeepForSdk
        void onEvent(java.lang.String r1, java.lang.String r2, android.os.Bundle r3, long r4);
    }

    public AppMeasurement(com.google.android.gms.measurement.internal.zzio r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.measurement.zza r0 = new com.google.android.gms.measurement.zza
            r0.<init>(r2)
            r1.zzb = r0
            return
    }

    public AppMeasurement(com.google.android.gms.measurement.internal.zzlx r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.measurement.zzb r0 = new com.google.android.gms.measurement.zzb
            r0.<init>(r2)
            r1.zzb = r0
            return
    }

    @androidx.annotation.Keep
    @java.lang.Deprecated
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r14) {
            com.google.android.gms.measurement.AppMeasurement r0 = com.google.android.gms.measurement.AppMeasurement.zza
            if (r0 != 0) goto L59
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = com.google.android.gms.measurement.AppMeasurement.zza     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L54
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            java.lang.String r3 = "getScionFrontendApiImplementation"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L56
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L56
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            r8 = 1
            r5[r8] = r6     // Catch: java.lang.Throwable -> L56
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch: java.lang.Throwable -> L56
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L56
            r3[r7] = r14     // Catch: java.lang.Throwable -> L56
            r3[r8] = r1     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.internal.zzlx r2 = (com.google.android.gms.measurement.internal.zzlx) r2     // Catch: java.lang.Throwable -> L56
            goto L2f
        L2e:
            r2 = r1
        L2f:
            if (r2 == 0) goto L39
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch: java.lang.Throwable -> L56
            r14.<init>(r2)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.AppMeasurement.zza = r14     // Catch: java.lang.Throwable -> L56
            goto L54
        L39:
            com.google.android.gms.internal.measurement.zzdh r13 = new com.google.android.gms.internal.measurement.zzdh     // Catch: java.lang.Throwable -> L56
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.internal.zzio r14 = com.google.android.gms.measurement.internal.zzio.zzp(r14, r13, r1)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch: java.lang.Throwable -> L56
            r1.<init>(r14)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.AppMeasurement.zza = r1     // Catch: java.lang.Throwable -> L56
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            goto L59
        L56:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            throw r14
        L59:
            com.google.android.gms.measurement.AppMeasurement r14 = com.google.android.gms.measurement.AppMeasurement.zza
            return r14
    }

    @androidx.annotation.Keep
    public void beginAdUnitExposure(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            r0.zzp(r2)
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @androidx.annotation.Keep
    @com.google.android.gms.common.annotation.KeepForSdk
    public void clearConditionalUserProperty(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            r0.zzq(r2, r3, r4)
            return
    }

    @androidx.annotation.Keep
    public void endAdUnitExposure(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            r0.zzr(r2)
            return
    }

    @androidx.annotation.Keep
    public long generateEventId() {
            r2 = this;
            com.google.android.gms.measurement.zzc r0 = r2.zzb
            long r0 = r0.zzb()
            return r0
    }

    @androidx.annotation.Keep
    public java.lang.String getAppInstanceId() {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            java.lang.String r0 = r0.zzh()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.Boolean getBoolean() {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            java.lang.Boolean r0 = r0.zzc()
            return r0
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @androidx.annotation.Keep
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.util.List<com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty> getConditionalUserProperties(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.measurement.zzc r0 = r2.zzb
            java.util.List r3 = r0.zzm(r3, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            if (r3 != 0) goto Lc
            r0 = 0
            goto L10
        Lc:
            int r0 = r3.size()
        L10:
            r4.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()
            android.os.Bundle r0 = (android.os.Bundle) r0
            com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty r1 = new com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty
            r1.<init>(r0)
            r4.add(r1)
            goto L17
        L2c:
            return r4
    }

    @androidx.annotation.Keep
    public java.lang.String getCurrentScreenClass() {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            java.lang.String r0 = r0.zzi()
            return r0
    }

    @androidx.annotation.Keep
    public java.lang.String getCurrentScreenName() {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            java.lang.String r0 = r0.zzj()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.Double getDouble() {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            java.lang.Double r0 = r0.zzd()
            return r0
    }

    @androidx.annotation.Keep
    public java.lang.String getGmpAppId() {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            java.lang.String r0 = r0.zzk()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.Integer getInteger() {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            java.lang.Integer r0 = r0.zze()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.Long getLong() {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            java.lang.Long r0 = r0.zzf()
            return r0
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @androidx.annotation.Keep
    @com.google.android.gms.common.annotation.KeepForSdk
    public int getMaxUserProperties(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            int r2 = r0.zza(r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getString() {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            java.lang.String r0 = r0.zzl()
            return r0
    }

    @androidx.annotation.Keep
    protected java.util.Map<java.lang.String, java.lang.Object> getUserProperties(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            java.util.Map r2 = r0.zzo(r2, r3, r4)
            return r2
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.util.Map<java.lang.String, java.lang.Object> getUserProperties(boolean r2) {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            java.util.Map r2 = r0.zzn(r2)
            return r2
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @androidx.annotation.Keep
    public void logEventInternal(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            r0.zzs(r2, r3, r4)
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public void logEventInternalNoInterceptor(java.lang.String r7, java.lang.String r8, android.os.Bundle r9, long r10) {
            r6 = this;
            com.google.android.gms.measurement.zzc r0 = r6.zzb
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.zzt(r1, r2, r3, r4)
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public void registerOnMeasurementEventListener(com.google.android.gms.measurement.AppMeasurement.OnEventListener r2) {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            r0.zzu(r2)
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @androidx.annotation.Keep
    @com.google.android.gms.common.annotation.KeepForSdk
    public void setConditionalUserProperty(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty r6) {
            r5 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r6.mAppId
            if (r1 == 0) goto L11
            java.lang.String r2 = "app_id"
            r0.putString(r2, r1)
        L11:
            java.lang.String r1 = r6.mOrigin
            if (r1 == 0) goto L1a
            java.lang.String r2 = "origin"
            r0.putString(r2, r1)
        L1a:
            java.lang.String r1 = r6.mName
            if (r1 == 0) goto L23
            java.lang.String r2 = "name"
            r0.putString(r2, r1)
        L23:
            java.lang.Object r1 = r6.mValue
            if (r1 == 0) goto L2a
            com.google.android.gms.measurement.internal.zzjt.zzb(r0, r1)
        L2a:
            java.lang.String r1 = r6.mTriggerEventName
            if (r1 == 0) goto L33
            java.lang.String r2 = "trigger_event_name"
            r0.putString(r2, r1)
        L33:
            long r1 = r6.mTriggerTimeout
            java.lang.String r3 = "trigger_timeout"
            r0.putLong(r3, r1)
            java.lang.String r1 = r6.mTimedOutEventName
            if (r1 == 0) goto L43
            java.lang.String r2 = "timed_out_event_name"
            r0.putString(r2, r1)
        L43:
            android.os.Bundle r1 = r6.mTimedOutEventParams
            if (r1 == 0) goto L4c
            java.lang.String r2 = "timed_out_event_params"
            r0.putBundle(r2, r1)
        L4c:
            java.lang.String r1 = r6.mTriggeredEventName
            if (r1 == 0) goto L55
            java.lang.String r2 = "triggered_event_name"
            r0.putString(r2, r1)
        L55:
            android.os.Bundle r1 = r6.mTriggeredEventParams
            if (r1 == 0) goto L5e
            java.lang.String r2 = "triggered_event_params"
            r0.putBundle(r2, r1)
        L5e:
            long r1 = r6.mTimeToLive
            java.lang.String r3 = "time_to_live"
            r0.putLong(r3, r1)
            java.lang.String r1 = r6.mExpiredEventName
            if (r1 == 0) goto L6e
            java.lang.String r2 = "expired_event_name"
            r0.putString(r2, r1)
        L6e:
            android.os.Bundle r1 = r6.mExpiredEventParams
            if (r1 == 0) goto L77
            java.lang.String r2 = "expired_event_params"
            r0.putBundle(r2, r1)
        L77:
            com.google.android.gms.measurement.zzc r1 = r5.zzb
            long r2 = r6.mCreationTimestamp
            java.lang.String r4 = "creation_timestamp"
            r0.putLong(r4, r2)
            boolean r2 = r6.mActive
            java.lang.String r3 = "active"
            r0.putBoolean(r3, r2)
            long r2 = r6.mTriggeredTimestamp
            java.lang.String r6 = "triggered_timestamp"
            r0.putLong(r6, r2)
            r1.zzv(r0)
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public void setEventInterceptor(com.google.android.gms.measurement.AppMeasurement.EventInterceptor r2) {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            r0.zzw(r2)
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public void unregisterOnMeasurementEventListener(com.google.android.gms.measurement.AppMeasurement.OnEventListener r2) {
            r1 = this;
            com.google.android.gms.measurement.zzc r0 = r1.zzb
            r0.zzx(r2)
            return
    }
}
