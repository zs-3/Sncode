package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public interface InstallIdProvider {

    @com.google.auto.value.AutoValue
    public static abstract class InstallIds {
        public InstallIds() {
                r0 = this;
                r0.<init>()
                return
        }

        static com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds create(java.lang.String r2, com.google.firebase.crashlytics.internal.common.FirebaseInstallationId r3) {
                com.google.firebase.crashlytics.internal.common.AutoValue_InstallIdProvider_InstallIds r0 = new com.google.firebase.crashlytics.internal.common.AutoValue_InstallIdProvider_InstallIds
                java.lang.String r1 = r3.getFid()
                java.lang.String r3 = r3.getAuthToken()
                r0.<init>(r2, r1, r3)
                return r0
        }

        public static com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds createWithoutFid(java.lang.String r2) {
                com.google.firebase.crashlytics.internal.common.AutoValue_InstallIdProvider_InstallIds r0 = new com.google.firebase.crashlytics.internal.common.AutoValue_InstallIdProvider_InstallIds
                r1 = 0
                r0.<init>(r2, r1, r1)
                return r0
        }

        public abstract java.lang.String getCrashlyticsInstallId();

        public abstract java.lang.String getFirebaseAuthenticationToken();

        public abstract java.lang.String getFirebaseInstallationId();
    }

    com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds getInstallIds();
}
