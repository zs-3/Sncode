package com.google.firebase.installations;

/* loaded from: classes2.dex */
class GetAuthTokenListener implements com.google.firebase.installations.StateListener {
    private final com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.installations.InstallationTokenResult> resultTaskCompletionSource;
    private final com.google.firebase.installations.Utils utils;

    public GetAuthTokenListener(com.google.firebase.installations.Utils r1, com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.installations.InstallationTokenResult> r2) {
            r0 = this;
            r0.<init>()
            r0.utils = r1
            r0.resultTaskCompletionSource = r2
            return
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(java.lang.Exception r2) {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.installations.InstallationTokenResult> r0 = r1.resultTaskCompletionSource
            r0.trySetException(r2)
            r2 = 1
            return r2
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(com.google.firebase.installations.local.PersistedInstallationEntry r5) {
            r4 = this;
            boolean r0 = r5.isRegistered()
            if (r0 == 0) goto L35
            com.google.firebase.installations.Utils r0 = r4.utils
            boolean r0 = r0.isAuthTokenExpired(r5)
            if (r0 != 0) goto L35
            com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.installations.InstallationTokenResult> r0 = r4.resultTaskCompletionSource
            com.google.firebase.installations.InstallationTokenResult$Builder r1 = com.google.firebase.installations.InstallationTokenResult.builder()
            java.lang.String r2 = r5.getAuthToken()
            com.google.firebase.installations.InstallationTokenResult$Builder r1 = r1.setToken(r2)
            long r2 = r5.getExpiresInSecs()
            com.google.firebase.installations.InstallationTokenResult$Builder r1 = r1.setTokenExpirationTimestamp(r2)
            long r2 = r5.getTokenCreationEpochInSecs()
            com.google.firebase.installations.InstallationTokenResult$Builder r5 = r1.setTokenCreationTimestamp(r2)
            com.google.firebase.installations.InstallationTokenResult r5 = r5.build()
            r0.setResult(r5)
            r5 = 1
            return r5
        L35:
            r5 = 0
            return r5
    }
}
