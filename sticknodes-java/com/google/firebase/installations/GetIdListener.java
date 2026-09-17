package com.google.firebase.installations;

/* loaded from: classes2.dex */
class GetIdListener implements com.google.firebase.installations.StateListener {
    final com.google.android.gms.tasks.TaskCompletionSource<java.lang.String> taskCompletionSource;

    public GetIdListener(com.google.android.gms.tasks.TaskCompletionSource<java.lang.String> r1) {
            r0 = this;
            r0.<init>()
            r0.taskCompletionSource = r1
            return
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(java.lang.Exception r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(com.google.firebase.installations.local.PersistedInstallationEntry r2) {
            r1 = this;
            boolean r0 = r2.isUnregistered()
            if (r0 != 0) goto L15
            boolean r0 = r2.isRegistered()
            if (r0 != 0) goto L15
            boolean r0 = r2.isErrored()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r2 = 0
            return r2
        L15:
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.String> r0 = r1.taskCompletionSource
            java.lang.String r2 = r2.getFirebaseInstallationId()
            r0.trySetResult(r2)
            r2 = 1
            return r2
    }
}
