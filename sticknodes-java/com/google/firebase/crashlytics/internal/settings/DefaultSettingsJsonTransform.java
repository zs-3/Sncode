package com.google.firebase.crashlytics.internal.settings;

/* loaded from: classes2.dex */
class DefaultSettingsJsonTransform implements com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform {
    DefaultSettingsJsonTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.firebase.crashlytics.internal.settings.Settings defaultSettings(com.google.firebase.crashlytics.internal.common.CurrentTimeProvider r12) {
            com.google.firebase.crashlytics.internal.settings.Settings$SessionData r3 = new com.google.firebase.crashlytics.internal.settings.Settings$SessionData
            r0 = 8
            r1 = 4
            r3.<init>(r0, r1)
            com.google.firebase.crashlytics.internal.settings.Settings$FeatureFlagData r4 = new com.google.firebase.crashlytics.internal.settings.Settings$FeatureFlagData
            r0 = 1
            r1 = 0
            r4.<init>(r0, r1, r1)
            long r0 = r12.getCurrentTimeMillis()
            r12 = 3600000(0x36ee80, float:5.044674E-39)
            long r5 = (long) r12
            long r1 = r0 + r5
            com.google.firebase.crashlytics.internal.settings.Settings r12 = new com.google.firebase.crashlytics.internal.settings.Settings
            r5 = 0
            r6 = 3600(0xe10, float:5.045E-42)
            r7 = 4621819117588971520(0x4024000000000000, double:10.0)
            r9 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            r11 = 60
            r0 = r12
            r0.<init>(r1, r3, r4, r5, r6, r7, r9, r11)
            return r12
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public com.google.firebase.crashlytics.internal.settings.Settings buildFromJson(com.google.firebase.crashlytics.internal.common.CurrentTimeProvider r1, org.json.JSONObject r2) {
            r0 = this;
            com.google.firebase.crashlytics.internal.settings.Settings r1 = defaultSettings(r1)
            return r1
    }
}
