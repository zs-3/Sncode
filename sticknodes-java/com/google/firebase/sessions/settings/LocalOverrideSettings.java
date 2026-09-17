package com.google.firebase.sessions.settings;

/* compiled from: LocalOverrideSettings.kt */
/* loaded from: classes2.dex */
public final class LocalOverrideSettings implements com.google.firebase.sessions.settings.SettingsProvider {
    private static final com.google.firebase.sessions.settings.LocalOverrideSettings.Companion Companion = null;
    private final android.os.Bundle metadata;

    /* compiled from: LocalOverrideSettings.kt */
    private static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            com.google.firebase.sessions.settings.LocalOverrideSettings$Companion r0 = new com.google.firebase.sessions.settings.LocalOverrideSettings$Companion
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.sessions.settings.LocalOverrideSettings.Companion = r0
            return
    }

    public LocalOverrideSettings(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.<init>()
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            java.lang.String r3 = r3.getPackageName()
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo(r3, r1)
            android.os.Bundle r3 = r3.metaData
            if (r3 != 0) goto L1c
            android.os.Bundle r3 = android.os.Bundle.EMPTY
        L1c:
            r2.metadata = r3
            return
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public java.lang.Double getSamplingRate() {
            r2 = this;
            android.os.Bundle r0 = r2.metadata
            java.lang.String r1 = "firebase_sessions_sampling_rate"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L15
            android.os.Bundle r0 = r2.metadata
            double r0 = r0.getDouble(r1)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public java.lang.Boolean getSessionEnabled() {
            r2 = this;
            android.os.Bundle r0 = r2.metadata
            java.lang.String r1 = "firebase_sessions_enabled"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L15
            android.os.Bundle r0 = r2.metadata
            boolean r0 = r0.getBoolean(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /* renamed from: getSessionRestartTimeout-FghU774, reason: not valid java name */
    public kotlin.time.Duration mo69getSessionRestartTimeoutFghU774() {
            r2 = this;
            android.os.Bundle r0 = r2.metadata
            java.lang.String r1 = "firebase_sessions_sessions_restart_timeout"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L1b
            android.os.Bundle r0 = r2.metadata
            int r0 = r0.getInt(r1)
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.SECONDS
            long r0 = kotlin.time.DurationKt.toDuration(r0, r1)
            kotlin.time.Duration r0 = kotlin.time.Duration.m77boximpl(r0)
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public java.lang.Object updateSettings(kotlin.coroutines.Continuation<? super kotlin.Unit> r1) {
            r0 = this;
            java.lang.Object r1 = com.google.firebase.sessions.settings.SettingsProvider.DefaultImpls.updateSettings(r0, r1)
            return r1
    }
}
