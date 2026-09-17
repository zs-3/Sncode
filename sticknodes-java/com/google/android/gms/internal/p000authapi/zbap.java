package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class zbap extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.identity.SignInClient {
    private static final com.google.android.gms.common.api.Api.ClientKey zba = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zbb = null;
    private static final com.google.android.gms.common.api.Api zbc = null;
    private final java.lang.String zbd;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.internal.p000authapi.zbap.zba = r0
            com.google.android.gms.internal.auth-api.zbak r1 = new com.google.android.gms.internal.auth-api.zbak
            r1.<init>()
            com.google.android.gms.internal.p000authapi.zbap.zbb = r1
            com.google.android.gms.common.api.Api r2 = new com.google.android.gms.common.api.Api
            java.lang.String r3 = "Auth.Api.Identity.SignIn.API"
            r2.<init>(r3, r1, r0)
            com.google.android.gms.internal.p000authapi.zbap.zbc = r2
            return
    }

    public zbap(android.app.Activity r3, com.google.android.gms.auth.api.identity.zbu r4) {
            r2 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.internal.p000authapi.zbap.zbc
            com.google.android.gms.common.api.GoogleApi$Settings r1 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r2.<init>(r3, r0, r4, r1)
            java.lang.String r3 = com.google.android.gms.internal.p000authapi.zbas.zba()
            r2.zbd = r3
            return
    }

    public zbap(android.content.Context r3, com.google.android.gms.auth.api.identity.zbu r4) {
            r2 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.internal.p000authapi.zbap.zbc
            com.google.android.gms.common.api.GoogleApi$Settings r1 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r2.<init>(r3, r0, r4, r1)
            java.lang.String r3 = com.google.android.gms.internal.p000authapi.zbas.zba()
            r2.zbd = r3
            return
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.BeginSignInResult> beginSignIn(com.google.android.gms.auth.api.identity.BeginSignInRequest r7) {
            r6 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            com.google.android.gms.auth.api.identity.BeginSignInRequest$Builder r7 = com.google.android.gms.auth.api.identity.BeginSignInRequest.zba(r7)
            java.lang.String r0 = r6.zbd
            r7.zba(r0)
            com.google.android.gms.auth.api.identity.BeginSignInRequest r7 = r7.build()
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = new com.google.android.gms.common.Feature
            java.lang.String r3 = "auth_api_credentials_begin_sign_in"
            r4 = 8
            r2.<init>(r3, r4)
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            com.google.android.gms.internal.auth-api.zbai r1 = new com.google.android.gms.internal.auth-api.zbai
            r1.<init>(r6, r7)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r7 = r0.run(r1)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r7 = r7.setAutoResolveMissingFeatures(r3)
            r0 = 1553(0x611, float:2.176E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r7 = r7.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r7 = r7.build()
            com.google.android.gms.tasks.Task r7 = r6.doRead(r7)
            return r7
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final java.lang.String getPhoneNumberFromIntent(android.content.Intent r3) throws com.google.android.gms.common.api.ApiException {
            r2 = this;
            if (r3 == 0) goto L33
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r0 = com.google.android.gms.common.api.Status.CREATOR
            java.lang.String r1 = "status"
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(r3, r1, r0)
            com.google.android.gms.common.api.Status r0 = (com.google.android.gms.common.api.Status) r0
            if (r0 == 0) goto L2b
            boolean r1 = r0.isSuccess()
            if (r1 == 0) goto L25
            java.lang.String r0 = "phone_number_hint_result"
            java.lang.String r3 = r3.getStringExtra(r0)
            if (r3 == 0) goto L1d
            return r3
        L1d:
            com.google.android.gms.common.api.ApiException r3 = new com.google.android.gms.common.api.ApiException
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR
            r3.<init>(r0)
            throw r3
        L25:
            com.google.android.gms.common.api.ApiException r3 = new com.google.android.gms.common.api.ApiException
            r3.<init>(r0)
            throw r3
        L2b:
            com.google.android.gms.common.api.ApiException r3 = new com.google.android.gms.common.api.ApiException
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_CANCELED
            r3.<init>(r0)
            throw r3
        L33:
            com.google.android.gms.common.api.ApiException r3 = new com.google.android.gms.common.api.ApiException
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR
            r3.<init>(r0)
            throw r3
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final com.google.android.gms.tasks.Task<android.app.PendingIntent> getPhoneNumberHintIntent(com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest r5) {
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.internal.p000authapi.zbar.zbh
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            com.google.android.gms.internal.auth-api.zbag r1 = new com.google.android.gms.internal.auth-api.zbag
            r1.<init>(r4, r5)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r0.run(r1)
            r0 = 1653(0x675, float:2.316E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r5.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r5.build()
            com.google.android.gms.tasks.Task r5 = r4.doRead(r5)
            return r5
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final com.google.android.gms.auth.api.identity.SignInCredential getSignInCredentialFromIntent(android.content.Intent r3) throws com.google.android.gms.common.api.ApiException {
            r2 = this;
            if (r3 == 0) goto L37
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r0 = com.google.android.gms.common.api.Status.CREATOR
            java.lang.String r1 = "status"
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(r3, r1, r0)
            com.google.android.gms.common.api.Status r0 = (com.google.android.gms.common.api.Status) r0
            if (r0 == 0) goto L2f
            boolean r1 = r0.isSuccess()
            if (r1 == 0) goto L29
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.identity.SignInCredential> r0 = com.google.android.gms.auth.api.identity.SignInCredential.CREATOR
            java.lang.String r1 = "sign_in_credential"
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(r3, r1, r0)
            com.google.android.gms.auth.api.identity.SignInCredential r3 = (com.google.android.gms.auth.api.identity.SignInCredential) r3
            if (r3 == 0) goto L21
            return r3
        L21:
            com.google.android.gms.common.api.ApiException r3 = new com.google.android.gms.common.api.ApiException
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR
            r3.<init>(r0)
            throw r3
        L29:
            com.google.android.gms.common.api.ApiException r3 = new com.google.android.gms.common.api.ApiException
            r3.<init>(r0)
            throw r3
        L2f:
            com.google.android.gms.common.api.ApiException r3 = new com.google.android.gms.common.api.ApiException
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_CANCELED
            r3.<init>(r0)
            throw r3
        L37:
            com.google.android.gms.common.api.ApiException r3 = new com.google.android.gms.common.api.ApiException
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR
            r3.<init>(r0)
            throw r3
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final com.google.android.gms.tasks.Task<android.app.PendingIntent> getSignInIntent(com.google.android.gms.auth.api.identity.GetSignInIntentRequest r5) {
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.auth.api.identity.GetSignInIntentRequest$Builder r5 = com.google.android.gms.auth.api.identity.GetSignInIntentRequest.zba(r5)
            java.lang.String r0 = r4.zbd
            r5.zba(r0)
            com.google.android.gms.auth.api.identity.GetSignInIntentRequest r5 = r5.build()
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.internal.p000authapi.zbar.zbf
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            com.google.android.gms.internal.auth-api.zbaj r1 = new com.google.android.gms.internal.auth-api.zbaj
            r1.<init>(r4, r5)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r0.run(r1)
            r0 = 1555(0x613, float:2.179E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r5.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r5.build()
            com.google.android.gms.tasks.Task r5 = r4.doRead(r5)
            return r5
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> signOut() {
            r4 = this;
            android.content.Context r0 = r4.getApplicationContext()
            java.lang.String r1 = "com.google.android.gms.signin"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.apply()
            java.util.Set r0 = com.google.android.gms.common.api.GoogleApiClient.getAllClients()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.GoogleApiClient r1 = (com.google.android.gms.common.api.GoogleApiClient) r1
            r1.maybeSignOut()
            goto L1e
        L2e:
            com.google.android.gms.common.api.internal.GoogleApiManager.reportSignOut()
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r3 = com.google.android.gms.internal.p000authapi.zbar.zbb
            r1[r2] = r3
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            com.google.android.gms.internal.auth-api.zbah r1 = new com.google.android.gms.internal.auth-api.zbah
            r1.<init>(r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setAutoResolveMissingFeatures(r2)
            r1 = 1554(0x612, float:2.178E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r4.doWrite(r0)
            return r0
    }

    final /* synthetic */ void zba(com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest r2, com.google.android.gms.internal.p000authapi.zbaq r3, com.google.android.gms.tasks.TaskCompletionSource r4) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.auth-api.zbao r0 = new com.google.android.gms.internal.auth-api.zbao
            r0.<init>(r1, r4)
            android.os.IInterface r3 = r3.getService()
            com.google.android.gms.internal.auth-api.zbv r3 = (com.google.android.gms.internal.p000authapi.zbv) r3
            java.lang.String r4 = r1.zbd
            r3.zbd(r0, r2, r4)
            return
    }

    final /* synthetic */ void zbb(com.google.android.gms.internal.p000authapi.zbaq r2, com.google.android.gms.tasks.TaskCompletionSource r3) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.auth-api.zbam r0 = new com.google.android.gms.internal.auth-api.zbam
            r0.<init>(r1, r3)
            android.os.IInterface r2 = r2.getService()
            com.google.android.gms.internal.auth-api.zbv r2 = (com.google.android.gms.internal.p000authapi.zbv) r2
            java.lang.String r3 = r1.zbd
            r2.zbf(r0, r3)
            return
    }
}
