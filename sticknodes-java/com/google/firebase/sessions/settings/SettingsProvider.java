package com.google.firebase.sessions.settings;

/* compiled from: SettingsProvider.kt */
/* loaded from: classes2.dex */
public interface SettingsProvider {

    /* compiled from: SettingsProvider.kt */
    public static final class DefaultImpls {
        public static java.lang.Object updateSettings(com.google.firebase.sessions.settings.SettingsProvider r0, kotlin.coroutines.Continuation<? super kotlin.Unit> r1) {
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    java.lang.Double getSamplingRate();

    java.lang.Boolean getSessionEnabled();

    /* renamed from: getSessionRestartTimeout-FghU774 */
    kotlin.time.Duration mo69getSessionRestartTimeoutFghU774();

    java.lang.Object updateSettings(kotlin.coroutines.Continuation<? super kotlin.Unit> r1);
}
