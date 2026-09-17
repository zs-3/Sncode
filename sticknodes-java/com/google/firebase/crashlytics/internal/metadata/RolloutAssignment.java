package com.google.firebase.crashlytics.internal.metadata;

@com.google.auto.value.AutoValue
/* loaded from: classes2.dex */
public abstract class RolloutAssignment {
    public static final com.google.firebase.encoders.DataEncoder ROLLOUT_ASSIGNMENT_JSON_ENCODER = null;

    static {
            com.google.firebase.encoders.json.JsonDataEncoderBuilder r0 = new com.google.firebase.encoders.json.JsonDataEncoderBuilder
            r0.<init>()
            com.google.firebase.encoders.config.Configurator r1 = com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.CONFIG
            com.google.firebase.encoders.json.JsonDataEncoderBuilder r0 = r0.configureWith(r1)
            com.google.firebase.encoders.DataEncoder r0 = r0.build()
            com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.ROLLOUT_ASSIGNMENT_JSON_ENCODER = r0
            return
    }

    public RolloutAssignment() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.firebase.crashlytics.internal.metadata.RolloutAssignment create(java.lang.String r7) throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r7)
            java.lang.String r7 = "rolloutId"
            java.lang.String r1 = r0.getString(r7)
            java.lang.String r7 = "parameterKey"
            java.lang.String r2 = r0.getString(r7)
            java.lang.String r7 = "parameterValue"
            java.lang.String r3 = r0.getString(r7)
            java.lang.String r7 = "variantId"
            java.lang.String r4 = r0.getString(r7)
            java.lang.String r7 = "templateVersion"
            long r5 = r0.getLong(r7)
            com.google.firebase.crashlytics.internal.metadata.RolloutAssignment r7 = create(r1, r2, r3, r4, r5)
            return r7
    }

    public static com.google.firebase.crashlytics.internal.metadata.RolloutAssignment create(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, long r11) {
            java.lang.String r3 = validate(r9)
            com.google.firebase.crashlytics.internal.metadata.AutoValue_RolloutAssignment r9 = new com.google.firebase.crashlytics.internal.metadata.AutoValue_RolloutAssignment
            r0 = r9
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return r9
    }

    private static java.lang.String validate(java.lang.String r2) {
            int r0 = r2.length()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 <= r1) goto Ld
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)
        Ld:
            return r2
    }

    public abstract java.lang.String getParameterKey();

    public abstract java.lang.String getParameterValue();

    public abstract java.lang.String getRolloutId();

    public abstract long getTemplateVersion();

    public abstract java.lang.String getVariantId();

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment toReportProto() {
            r3 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.builder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder r1 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.builder()
            java.lang.String r2 = r3.getVariantId()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder r1 = r1.setVariantId(r2)
            java.lang.String r2 = r3.getRolloutId()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder r1 = r1.setRolloutId(r2)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant r1 = r1.build()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$Builder r0 = r0.setRolloutVariant(r1)
            java.lang.String r1 = r3.getParameterKey()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$Builder r0 = r0.setParameterKey(r1)
            java.lang.String r1 = r3.getParameterValue()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$Builder r0 = r0.setParameterValue(r1)
            long r1 = r3.getTemplateVersion()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$Builder r0 = r0.setTemplateVersion(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment r0 = r0.build()
            return r0
    }
}
