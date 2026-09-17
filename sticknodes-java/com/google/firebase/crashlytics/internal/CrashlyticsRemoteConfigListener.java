package com.google.firebase.crashlytics.internal;

/* compiled from: CrashlyticsRemoteConfigListener.kt */
/* loaded from: classes2.dex */
public final class CrashlyticsRemoteConfigListener implements com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber {
    private final com.google.firebase.crashlytics.internal.metadata.UserMetadata userMetadata;

    public CrashlyticsRemoteConfigListener(com.google.firebase.crashlytics.internal.metadata.UserMetadata r2) {
            r1 = this;
            java.lang.String r0 = "userMetadata"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.userMetadata = r2
            return
    }
}
