package com.google.firebase.crashlytics.internal.settings;

/* loaded from: classes2.dex */
interface SettingsJsonTransform {
    com.google.firebase.crashlytics.internal.settings.Settings buildFromJson(com.google.firebase.crashlytics.internal.common.CurrentTimeProvider r1, org.json.JSONObject r2) throws org.json.JSONException;
}
