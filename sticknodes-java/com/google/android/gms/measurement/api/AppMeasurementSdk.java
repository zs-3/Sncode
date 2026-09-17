package com.google.android.gms.measurement.api;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes2.dex */
public class AppMeasurementSdk {
    private final com.google.android.gms.internal.measurement.zzff zza;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final class ConditionalUserProperty {

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String ACTIVE = "active";

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String CREATION_TIMESTAMP = "creation_timestamp";

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String EXPIRED_EVENT_NAME = "expired_event_name";

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String EXPIRED_EVENT_PARAMS = "expired_event_params";

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String NAME = "name";

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String ORIGIN = "origin";

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String TIMED_OUT_EVENT_NAME = "timed_out_event_name";

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String TIME_TO_LIVE = "time_to_live";

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String TRIGGERED_EVENT_NAME = "triggered_event_name";

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String TRIGGERED_EVENT_PARAMS = "triggered_event_params";

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String TRIGGERED_TIMESTAMP = "triggered_timestamp";

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String TRIGGER_EVENT_NAME = "trigger_event_name";

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String TRIGGER_TIMEOUT = "trigger_timeout";

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String VALUE = "value";

        private ConditionalUserProperty() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface EventInterceptor extends com.google.android.gms.measurement.internal.zzkb {
        @Override // com.google.android.gms.measurement.internal.zzkb
        @com.google.android.gms.common.internal.ShowFirstParty
        @com.google.android.gms.common.annotation.KeepForSdk
        void interceptEvent(java.lang.String r1, java.lang.String r2, android.os.Bundle r3, long r4);
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface OnEventListener extends com.google.android.gms.measurement.internal.zzkc {
        @Override // com.google.android.gms.measurement.internal.zzkc
        @com.google.android.gms.common.internal.ShowFirstParty
        @com.google.android.gms.common.annotation.KeepForSdk
        void onEvent(java.lang.String r1, java.lang.String r2, android.os.Bundle r3, long r4);
    }

    public AppMeasurementSdk(com.google.android.gms.internal.measurement.zzff r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.measurement.api.AppMeasurementSdk getInstance(android.content.Context r1) {
            r0 = 0
            com.google.android.gms.internal.measurement.zzff r1 = com.google.android.gms.internal.measurement.zzff.zzg(r1, r0, r0, r0, r0)
            com.google.android.gms.measurement.api.AppMeasurementSdk r1 = r1.zzd()
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static com.google.android.gms.measurement.api.AppMeasurementSdk getInstance(android.content.Context r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            com.google.android.gms.internal.measurement.zzff r0 = com.google.android.gms.internal.measurement.zzff.zzg(r0, r1, r2, r3, r4)
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r0.zzd()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void beginAdUnitExposure(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zza
            r0.zzv(r2)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void clearConditionalUserProperty(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zza
            r0.zzw(r2, r3, r4)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void endAdUnitExposure(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zza
            r0.zzx(r2)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public long generateEventId() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r2.zza
            long r0 = r0.zzb()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getAppIdOrigin() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zza
            java.lang.String r0 = r0.zzk()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getAppInstanceId() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zza
            java.lang.String r0 = r0.zzm()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.util.List<android.os.Bundle> getConditionalUserProperties(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zza
            java.util.List r2 = r0.zzq(r2, r3)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getCurrentScreenClass() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zza
            java.lang.String r0 = r0.zzn()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getCurrentScreenName() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zza
            java.lang.String r0 = r0.zzo()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getGmpAppId() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zza
            java.lang.String r0 = r0.zzp()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getMaxUserProperties(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zza
            int r2 = r0.zza(r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.util.Map<java.lang.String, java.lang.Object> getUserProperties(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zza
            java.util.Map r2 = r0.zzr(r2, r3, r4)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void logEvent(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zza
            r0.zzz(r2, r3, r4)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void logEventNoInterceptor(java.lang.String r7, java.lang.String r8, android.os.Bundle r9, long r10) {
            r6 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r6.zza
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.zzA(r1, r2, r3, r4)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void performAction(android.os.Bundle r3) {
            r2 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r2.zza
            r1 = 0
            r0.zzc(r3, r1)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.Bundle performActionWithResponse(android.os.Bundle r3) {
            r2 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r2.zza
            r1 = 1
            android.os.Bundle r3 = r0.zzc(r3, r1)
            return r3
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public void registerOnMeasurementEventListener(com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zza
            r0.zzC(r2)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setConditionalUserProperty(android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zza
            r0.zzF(r2)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public void setConsent(android.os.Bundle r1) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setCurrentScreen(android.app.Activity r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zza
            com.google.android.gms.internal.measurement.zzdj r2 = com.google.android.gms.internal.measurement.zzdj.zza(r2)
            r0.zzH(r2, r3, r4)
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public void setEventInterceptor(com.google.android.gms.measurement.api.AppMeasurementSdk.EventInterceptor r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zza
            r0.zzK(r2)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public void setMeasurementEnabled(java.lang.Boolean r1) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public void setMeasurementEnabled(boolean r1) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setUserProperty(java.lang.String r3, java.lang.String r4, java.lang.Object r5) {
            r2 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r2.zza
            r1 = 1
            r0.zzP(r3, r4, r5, r1)
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public void unregisterOnMeasurementEventListener(com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zza
            r0.zzQ(r2)
            return
    }

    public final void zza(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zza
            r0.zzI(r2)
            return
    }
}
