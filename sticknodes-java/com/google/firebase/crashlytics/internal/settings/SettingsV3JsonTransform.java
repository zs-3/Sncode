package com.google.firebase.crashlytics.internal.settings;

/* loaded from: classes2.dex */
class SettingsV3JsonTransform implements com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform {
    SettingsV3JsonTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.firebase.crashlytics.internal.settings.Settings.FeatureFlagData buildFeatureFlagDataFrom(org.json.JSONObject r4) {
            java.lang.String r0 = "collect_reports"
            r1 = 1
            boolean r0 = r4.optBoolean(r0, r1)
            java.lang.String r1 = "collect_anrs"
            r2 = 0
            boolean r1 = r4.optBoolean(r1, r2)
            java.lang.String r3 = "collect_build_ids"
            boolean r4 = r4.optBoolean(r3, r2)
            com.google.firebase.crashlytics.internal.settings.Settings$FeatureFlagData r2 = new com.google.firebase.crashlytics.internal.settings.Settings$FeatureFlagData
            r2.<init>(r0, r1, r4)
            return r2
    }

    private static com.google.firebase.crashlytics.internal.settings.Settings.SessionData buildSessionDataFrom(org.json.JSONObject r2) {
            java.lang.String r0 = "max_custom_exception_events"
            r1 = 8
            int r2 = r2.optInt(r0, r1)
            com.google.firebase.crashlytics.internal.settings.Settings$SessionData r0 = new com.google.firebase.crashlytics.internal.settings.Settings$SessionData
            r1 = 4
            r0.<init>(r2, r1)
            return r0
    }

    private static long getExpiresAtFrom(com.google.firebase.crashlytics.internal.common.CurrentTimeProvider r4, long r5, org.json.JSONObject r7) {
            java.lang.String r0 = "expires_at"
            boolean r1 = r7.has(r0)
            if (r1 == 0) goto Ld
            long r4 = r7.optLong(r0)
            goto L17
        Ld:
            long r0 = r4.getCurrentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r2
            long r4 = r0 + r5
        L17:
            return r4
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public com.google.firebase.crashlytics.internal.settings.Settings buildFromJson(com.google.firebase.crashlytics.internal.common.CurrentTimeProvider r16, org.json.JSONObject r17) throws org.json.JSONException {
            r15 = this;
            r0 = r17
            java.lang.String r1 = "settings_version"
            r2 = 0
            int r8 = r0.optInt(r1, r2)
            java.lang.String r1 = "cache_duration"
            r2 = 3600(0xe10, float:5.045E-42)
            int r9 = r0.optInt(r1, r2)
            java.lang.String r1 = "on_demand_upload_rate_per_minute"
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r10 = r0.optDouble(r1, r2)
            java.lang.String r1 = "on_demand_backoff_base"
            r2 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            double r12 = r0.optDouble(r1, r2)
            java.lang.String r1 = "on_demand_backoff_step_duration_seconds"
            r2 = 60
            int r14 = r0.optInt(r1, r2)
            java.lang.String r1 = "session"
            boolean r2 = r0.has(r1)
            if (r2 == 0) goto L3d
            org.json.JSONObject r1 = r0.getJSONObject(r1)
            com.google.firebase.crashlytics.internal.settings.Settings$SessionData r1 = buildSessionDataFrom(r1)
            goto L46
        L3d:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.google.firebase.crashlytics.internal.settings.Settings$SessionData r1 = buildSessionDataFrom(r1)
        L46:
            r6 = r1
            java.lang.String r1 = "features"
            org.json.JSONObject r1 = r0.getJSONObject(r1)
            com.google.firebase.crashlytics.internal.settings.Settings$FeatureFlagData r7 = buildFeatureFlagDataFrom(r1)
            long r1 = (long) r9
            r3 = r16
            long r4 = getExpiresAtFrom(r3, r1, r0)
            com.google.firebase.crashlytics.internal.settings.Settings r0 = new com.google.firebase.crashlytics.internal.settings.Settings
            r3 = r0
            r3.<init>(r4, r6, r7, r8, r9, r10, r12, r14)
            return r0
    }
}
