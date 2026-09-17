package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
final class zbw implements androidx.loader.app.LoaderManager.LoaderCallbacks {
    final /* synthetic */ com.google.android.gms.auth.api.signin.internal.SignInHubActivity zba;

    /* synthetic */ zbw(com.google.android.gms.auth.api.signin.internal.SignInHubActivity r1, com.google.android.gms.auth.api.signin.internal.zbv r2) {
            r0 = this;
            r0.zba = r1
            r0.<init>()
            return
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final androidx.loader.content.Loader onCreateLoader(int r2, android.os.Bundle r3) {
            r1 = this;
            com.google.android.gms.auth.api.signin.internal.zbc r2 = new com.google.android.gms.auth.api.signin.internal.zbc
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity r3 = r1.zba
            java.util.Set r0 = com.google.android.gms.common.api.GoogleApiClient.getAllClients()
            r2.<init>(r3, r0)
            return r2
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final /* bridge */ /* synthetic */ void onLoadFinished(androidx.loader.content.Loader r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Void r3 = (java.lang.Void) r3
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity r2 = r1.zba
            int r3 = com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zba(r2)
            android.content.Intent r0 = com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zbb(r2)
            r2.setResult(r3, r0)
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity r2 = r1.zba
            r2.finish()
            return
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final void onLoaderReset(androidx.loader.content.Loader r1) {
            r0 = this;
            return
    }
}
