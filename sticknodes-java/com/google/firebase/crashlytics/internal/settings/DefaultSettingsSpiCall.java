package com.google.firebase.crashlytics.internal.settings;

/* loaded from: classes2.dex */
class DefaultSettingsSpiCall implements com.google.firebase.crashlytics.internal.settings.SettingsSpiCall {
    private final com.google.firebase.crashlytics.internal.Logger logger;
    private final com.google.firebase.crashlytics.internal.network.HttpRequestFactory requestFactory;
    private final java.lang.String url;

    public DefaultSettingsSpiCall(java.lang.String r2, com.google.firebase.crashlytics.internal.network.HttpRequestFactory r3) {
            r1 = this;
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r1.<init>(r2, r3, r0)
            return
    }

    DefaultSettingsSpiCall(java.lang.String r1, com.google.firebase.crashlytics.internal.network.HttpRequestFactory r2, com.google.firebase.crashlytics.internal.Logger r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Lc
            r0.logger = r3
            r0.requestFactory = r2
            r0.url = r1
            return
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "url must not be null."
            r1.<init>(r2)
            throw r1
    }

    private com.google.firebase.crashlytics.internal.network.HttpGetRequest applyHeadersTo(com.google.firebase.crashlytics.internal.network.HttpGetRequest r3, com.google.firebase.crashlytics.internal.settings.SettingsRequest r4) {
            r2 = this;
            java.lang.String r0 = r4.googleAppId
            java.lang.String r1 = "X-CRASHLYTICS-GOOGLE-APP-ID"
            r2.applyNonNullHeader(r3, r1, r0)
            java.lang.String r0 = "X-CRASHLYTICS-API-CLIENT-TYPE"
            java.lang.String r1 = "android"
            r2.applyNonNullHeader(r3, r0, r1)
            java.lang.String r0 = com.google.firebase.crashlytics.internal.common.CrashlyticsCore.getVersion()
            java.lang.String r1 = "X-CRASHLYTICS-API-CLIENT-VERSION"
            r2.applyNonNullHeader(r3, r1, r0)
            java.lang.String r0 = "Accept"
            java.lang.String r1 = "application/json"
            r2.applyNonNullHeader(r3, r0, r1)
            java.lang.String r0 = r4.deviceModel
            java.lang.String r1 = "X-CRASHLYTICS-DEVICE-MODEL"
            r2.applyNonNullHeader(r3, r1, r0)
            java.lang.String r0 = r4.osBuildVersion
            java.lang.String r1 = "X-CRASHLYTICS-OS-BUILD-VERSION"
            r2.applyNonNullHeader(r3, r1, r0)
            java.lang.String r0 = r4.osDisplayVersion
            java.lang.String r1 = "X-CRASHLYTICS-OS-DISPLAY-VERSION"
            r2.applyNonNullHeader(r3, r1, r0)
            com.google.firebase.crashlytics.internal.common.InstallIdProvider r4 = r4.installIdProvider
            com.google.firebase.crashlytics.internal.common.InstallIdProvider$InstallIds r4 = r4.getInstallIds()
            java.lang.String r4 = r4.getCrashlyticsInstallId()
            java.lang.String r0 = "X-CRASHLYTICS-INSTALLATION-ID"
            r2.applyNonNullHeader(r3, r0, r4)
            return r3
    }

    private void applyNonNullHeader(com.google.firebase.crashlytics.internal.network.HttpGetRequest r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            if (r3 == 0) goto L5
            r1.header(r2, r3)
        L5:
            return
    }

    private org.json.JSONObject getJsonObjectFrom(java.lang.String r5) {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6
            r0.<init>(r5)     // Catch: java.lang.Exception -> L6
            return r0
        L6:
            r0 = move-exception
            com.google.firebase.crashlytics.internal.Logger r1 = r4.logger
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to parse settings JSON from "
            r2.append(r3)
            java.lang.String r3 = r4.url
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.w(r2, r0)
            com.google.firebase.crashlytics.internal.Logger r0 = r4.logger
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Settings response "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.w(r5)
            r5 = 0
            return r5
    }

    private java.util.Map<java.lang.String, java.lang.String> getQueryParamsFor(com.google.firebase.crashlytics.internal.settings.SettingsRequest r4) {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = r4.buildVersion
            java.lang.String r2 = "build_version"
            r0.put(r2, r1)
            java.lang.String r1 = r4.displayVersion
            java.lang.String r2 = "display_version"
            r0.put(r2, r1)
            int r1 = r4.source
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = "source"
            r0.put(r2, r1)
            java.lang.String r4 = r4.instanceId
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L2b
            java.lang.String r1 = "instance"
            r0.put(r1, r4)
        L2b:
            return r0
    }

    protected com.google.firebase.crashlytics.internal.network.HttpGetRequest createHttpGetRequest(java.util.Map<java.lang.String, java.lang.String> r3) {
            r2 = this;
            com.google.firebase.crashlytics.internal.network.HttpRequestFactory r0 = r2.requestFactory
            java.lang.String r1 = r2.url
            com.google.firebase.crashlytics.internal.network.HttpGetRequest r3 = r0.buildHttpGetRequest(r1, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Crashlytics Android SDK/"
            r0.append(r1)
            java.lang.String r1 = com.google.firebase.crashlytics.internal.common.CrashlyticsCore.getVersion()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "User-Agent"
            com.google.firebase.crashlytics.internal.network.HttpGetRequest r3 = r3.header(r1, r0)
            java.lang.String r0 = "X-CRASHLYTICS-DEVELOPER-TOKEN"
            java.lang.String r1 = "470fa2b4ae81cd56ecbcda9735803434cec591fa"
            com.google.firebase.crashlytics.internal.network.HttpGetRequest r3 = r3.header(r0, r1)
            return r3
    }

    org.json.JSONObject handleResponse(com.google.firebase.crashlytics.internal.network.HttpResponse r5) {
            r4 = this;
            int r0 = r5.code()
            com.google.firebase.crashlytics.internal.Logger r1 = r4.logger
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Settings response code was: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.v(r2)
            boolean r1 = r4.requestWasSuccessful(r0)
            if (r1 == 0) goto L29
            java.lang.String r5 = r5.body()
            org.json.JSONObject r5 = r4.getJsonObjectFrom(r5)
            goto L4a
        L29:
            com.google.firebase.crashlytics.internal.Logger r5 = r4.logger
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Settings request failed; (status: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ") from "
            r1.append(r0)
            java.lang.String r0 = r4.url
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.e(r0)
            r5 = 0
        L4a:
            return r5
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsSpiCall
    public org.json.JSONObject invoke(com.google.firebase.crashlytics.internal.settings.SettingsRequest r4, boolean r5) {
            r3 = this;
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkBlockingThread()
            if (r5 == 0) goto L52
            java.util.Map r5 = r3.getQueryParamsFor(r4)     // Catch: java.io.IOException -> L48
            com.google.firebase.crashlytics.internal.network.HttpGetRequest r0 = r3.createHttpGetRequest(r5)     // Catch: java.io.IOException -> L48
            com.google.firebase.crashlytics.internal.network.HttpGetRequest r4 = r3.applyHeadersTo(r0, r4)     // Catch: java.io.IOException -> L48
            com.google.firebase.crashlytics.internal.Logger r0 = r3.logger     // Catch: java.io.IOException -> L48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L48
            r1.<init>()     // Catch: java.io.IOException -> L48
            java.lang.String r2 = "Requesting settings from "
            r1.append(r2)     // Catch: java.io.IOException -> L48
            java.lang.String r2 = r3.url     // Catch: java.io.IOException -> L48
            r1.append(r2)     // Catch: java.io.IOException -> L48
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L48
            r0.d(r1)     // Catch: java.io.IOException -> L48
            com.google.firebase.crashlytics.internal.Logger r0 = r3.logger     // Catch: java.io.IOException -> L48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L48
            r1.<init>()     // Catch: java.io.IOException -> L48
            java.lang.String r2 = "Settings query params were: "
            r1.append(r2)     // Catch: java.io.IOException -> L48
            r1.append(r5)     // Catch: java.io.IOException -> L48
            java.lang.String r5 = r1.toString()     // Catch: java.io.IOException -> L48
            r0.v(r5)     // Catch: java.io.IOException -> L48
            com.google.firebase.crashlytics.internal.network.HttpResponse r4 = r4.execute()     // Catch: java.io.IOException -> L48
            org.json.JSONObject r4 = r3.handleResponse(r4)     // Catch: java.io.IOException -> L48
            goto L51
        L48:
            r4 = move-exception
            com.google.firebase.crashlytics.internal.Logger r5 = r3.logger
            java.lang.String r0 = "Settings request failed."
            r5.e(r0, r4)
            r4 = 0
        L51:
            return r4
        L52:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "An invalid data collection token was used."
            r4.<init>(r5)
            throw r4
    }

    boolean requestWasSuccessful(int r2) {
            r1 = this;
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto L13
            r0 = 201(0xc9, float:2.82E-43)
            if (r2 == r0) goto L13
            r0 = 202(0xca, float:2.83E-43)
            if (r2 == r0) goto L13
            r0 = 203(0xcb, float:2.84E-43)
            if (r2 != r0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }
}
