package com.google.firebase.crashlytics.internal;

/* loaded from: classes2.dex */
public class RemoteConfigDeferredProxy {
    private final com.google.firebase.inject.Deferred<com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop> remoteConfigInteropDeferred;

    public static /* synthetic */ void $r8$lambda$qTIIDpZnR0Lz43DKjbgGMAwTZe4(com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener r0, com.google.firebase.inject.Provider r1) {
            lambda$setupListener$0(r0, r1)
            return
    }

    public RemoteConfigDeferredProxy(com.google.firebase.inject.Deferred<com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop> r1) {
            r0 = this;
            r0.<init>()
            r0.remoteConfigInteropDeferred = r1
            return
    }

    private static /* synthetic */ void lambda$setupListener$0(com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener r1, com.google.firebase.inject.Provider r2) {
            java.lang.Object r2 = r2.get()
            com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop r2 = (com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop) r2
            java.lang.String r0 = "firebase"
            r2.registerRolloutsStateSubscriber(r0, r1)
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "Registering RemoteConfig Rollouts subscriber"
            r1.d(r2)
            return
    }

    public void setupListener(com.google.firebase.crashlytics.internal.metadata.UserMetadata r3) {
            r2 = this;
            if (r3 != 0) goto Lc
            com.google.firebase.crashlytics.internal.Logger r3 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r0 = "Didn't successfully register with UserMetadata for rollouts listener"
            r3.w(r0)
            return
        Lc:
            com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener r0 = new com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener
            r0.<init>(r3)
            com.google.firebase.inject.Deferred<com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop> r3 = r2.remoteConfigInteropDeferred
            com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy$$ExternalSyntheticLambda0 r1 = new com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy$$ExternalSyntheticLambda0
            r1.<init>(r0)
            r3.whenAvailable(r1)
            return
    }
}
