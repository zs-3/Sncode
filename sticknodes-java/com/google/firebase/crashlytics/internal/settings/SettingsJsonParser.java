package com.google.firebase.crashlytics.internal.settings;

/* loaded from: classes2.dex */
public class SettingsJsonParser {
    private final com.google.firebase.crashlytics.internal.common.CurrentTimeProvider currentTimeProvider;

    SettingsJsonParser(com.google.firebase.crashlytics.internal.common.CurrentTimeProvider r1) {
            r0 = this;
            r0.<init>()
            r0.currentTimeProvider = r1
            return
    }

    private static com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform getJsonTransformForVersion(int r3) {
            r0 = 3
            if (r3 == r0) goto L26
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not determine SettingsJsonTransform for settings version "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ". Using default settings values."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.e(r3)
            com.google.firebase.crashlytics.internal.settings.DefaultSettingsJsonTransform r3 = new com.google.firebase.crashlytics.internal.settings.DefaultSettingsJsonTransform
            r3.<init>()
            return r3
        L26:
            com.google.firebase.crashlytics.internal.settings.SettingsV3JsonTransform r3 = new com.google.firebase.crashlytics.internal.settings.SettingsV3JsonTransform
            r3.<init>()
            return r3
    }

    public com.google.firebase.crashlytics.internal.settings.Settings parseSettingsJson(org.json.JSONObject r3) throws org.json.JSONException {
            r2 = this;
            java.lang.String r0 = "settings_version"
            int r0 = r3.getInt(r0)
            com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform r0 = getJsonTransformForVersion(r0)
            com.google.firebase.crashlytics.internal.common.CurrentTimeProvider r1 = r2.currentTimeProvider
            com.google.firebase.crashlytics.internal.settings.Settings r3 = r0.buildFromJson(r1, r3)
            return r3
    }
}
