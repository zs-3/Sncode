package com.google.firebase.crashlytics.internal.settings;

/* loaded from: classes2.dex */
public class Settings {
    public final int cacheDuration;
    public final long expiresAtMillis;
    public final com.google.firebase.crashlytics.internal.settings.Settings.FeatureFlagData featureFlagData;
    public final double onDemandBackoffBase;
    public final int onDemandBackoffStepDurationSeconds;
    public final double onDemandUploadRatePerMinute;
    public final com.google.firebase.crashlytics.internal.settings.Settings.SessionData sessionData;
    public final int settingsVersion;

    public static class FeatureFlagData {
        public final boolean collectAnrs;
        public final boolean collectBuildIds;
        public final boolean collectReports;

        public FeatureFlagData(boolean r1, boolean r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.collectReports = r1
                r0.collectAnrs = r2
                r0.collectBuildIds = r3
                return
        }
    }

    public static class SessionData {
        public final int maxCompleteSessionsCount;
        public final int maxCustomExceptionEvents;

        public SessionData(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.maxCustomExceptionEvents = r1
                r0.maxCompleteSessionsCount = r2
                return
        }
    }

    public Settings(long r1, com.google.firebase.crashlytics.internal.settings.Settings.SessionData r3, com.google.firebase.crashlytics.internal.settings.Settings.FeatureFlagData r4, int r5, int r6, double r7, double r9, int r11) {
            r0 = this;
            r0.<init>()
            r0.expiresAtMillis = r1
            r0.sessionData = r3
            r0.featureFlagData = r4
            r0.settingsVersion = r5
            r0.cacheDuration = r6
            r0.onDemandUploadRatePerMinute = r7
            r0.onDemandBackoffBase = r9
            r0.onDemandBackoffStepDurationSeconds = r11
            return
    }

    public boolean isExpired(long r4) {
            r3 = this;
            long r0 = r3.expiresAtMillis
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L8
            r4 = 1
            goto L9
        L8:
            r4 = 0
        L9:
            return r4
    }
}
