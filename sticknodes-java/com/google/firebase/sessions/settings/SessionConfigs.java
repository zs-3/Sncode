package com.google.firebase.sessions.settings;

/* compiled from: SettingsCache.kt */
/* loaded from: classes2.dex */
public final class SessionConfigs {
    private final java.lang.Integer cacheDuration;
    private final java.lang.Long cacheUpdatedTime;
    private final java.lang.Boolean sessionEnabled;
    private final java.lang.Integer sessionRestartTimeout;
    private final java.lang.Double sessionSamplingRate;

    public SessionConfigs(java.lang.Boolean r1, java.lang.Double r2, java.lang.Integer r3, java.lang.Integer r4, java.lang.Long r5) {
            r0 = this;
            r0.<init>()
            r0.sessionEnabled = r1
            r0.sessionSamplingRate = r2
            r0.sessionRestartTimeout = r3
            r0.cacheDuration = r4
            r0.cacheUpdatedTime = r5
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.sessions.settings.SessionConfigs
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.firebase.sessions.settings.SessionConfigs r5 = (com.google.firebase.sessions.settings.SessionConfigs) r5
            java.lang.Boolean r1 = r4.sessionEnabled
            java.lang.Boolean r3 = r5.sessionEnabled
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Double r1 = r4.sessionSamplingRate
            java.lang.Double r3 = r5.sessionSamplingRate
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.Integer r1 = r4.sessionRestartTimeout
            java.lang.Integer r3 = r5.sessionRestartTimeout
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.Integer r1 = r4.cacheDuration
            java.lang.Integer r3 = r5.cacheDuration
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.Long r1 = r4.cacheUpdatedTime
            java.lang.Long r5 = r5.cacheUpdatedTime
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final java.lang.Integer getCacheDuration() {
            r1 = this;
            java.lang.Integer r0 = r1.cacheDuration
            return r0
    }

    public final java.lang.Long getCacheUpdatedTime() {
            r1 = this;
            java.lang.Long r0 = r1.cacheUpdatedTime
            return r0
    }

    public final java.lang.Boolean getSessionEnabled() {
            r1 = this;
            java.lang.Boolean r0 = r1.sessionEnabled
            return r0
    }

    public final java.lang.Integer getSessionRestartTimeout() {
            r1 = this;
            java.lang.Integer r0 = r1.sessionRestartTimeout
            return r0
    }

    public final java.lang.Double getSessionSamplingRate() {
            r1 = this;
            java.lang.Double r0 = r1.sessionSamplingRate
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.Boolean r0 = r3.sessionEnabled
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            java.lang.Double r2 = r3.sessionSamplingRate
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Integer r2 = r3.sessionRestartTimeout
            if (r2 != 0) goto L20
            r2 = 0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Integer r2 = r3.cacheDuration
            if (r2 != 0) goto L2d
            r2 = 0
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Long r2 = r3.cacheUpdatedTime
            if (r2 != 0) goto L39
            goto L3d
        L39:
            int r1 = r2.hashCode()
        L3d:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SessionConfigs(sessionEnabled="
            r0.append(r1)
            java.lang.Boolean r1 = r2.sessionEnabled
            r0.append(r1)
            java.lang.String r1 = ", sessionSamplingRate="
            r0.append(r1)
            java.lang.Double r1 = r2.sessionSamplingRate
            r0.append(r1)
            java.lang.String r1 = ", sessionRestartTimeout="
            r0.append(r1)
            java.lang.Integer r1 = r2.sessionRestartTimeout
            r0.append(r1)
            java.lang.String r1 = ", cacheDuration="
            r0.append(r1)
            java.lang.Integer r1 = r2.cacheDuration
            r0.append(r1)
            java.lang.String r1 = ", cacheUpdatedTime="
            r0.append(r1)
            java.lang.Long r1 = r2.cacheUpdatedTime
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
