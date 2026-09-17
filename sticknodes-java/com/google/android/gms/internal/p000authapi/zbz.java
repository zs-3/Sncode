package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class zbz extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.identity.AuthorizationClient {
    private static final com.google.android.gms.common.api.Api.ClientKey zba = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zbb = null;
    private static final com.google.android.gms.common.api.Api zbc = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.internal.p000authapi.zbz.zba = r0
            com.google.android.gms.internal.auth-api.zbx r1 = new com.google.android.gms.internal.auth-api.zbx
            r1.<init>()
            com.google.android.gms.internal.p000authapi.zbz.zbb = r1
            com.google.android.gms.common.api.Api r2 = new com.google.android.gms.common.api.Api
            java.lang.String r3 = "Auth.Api.Identity.Authorization.API"
            r2.<init>(r3, r1, r0)
            com.google.android.gms.internal.p000authapi.zbz.zbc = r2
            return
    }

    public zbz(android.app.Activity r3, com.google.android.gms.auth.api.identity.zbc r4) {
            r2 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.internal.p000authapi.zbz.zbc
            com.google.android.gms.auth.api.identity.zbb r4 = com.google.android.gms.auth.api.identity.zbb.zbc(r4)
            java.lang.String r1 = com.google.android.gms.internal.p000authapi.zbas.zba()
            r4.zba(r1)
            com.google.android.gms.auth.api.identity.zbc r4 = r4.zbb()
            com.google.android.gms.common.api.GoogleApi$Settings r1 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r2.<init>(r3, r0, r4, r1)
            return
    }

    public zbz(android.content.Context r3, com.google.android.gms.auth.api.identity.zbc r4) {
            r2 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.internal.p000authapi.zbz.zbc
            com.google.android.gms.auth.api.identity.zbb r4 = com.google.android.gms.auth.api.identity.zbb.zbc(r4)
            java.lang.String r1 = com.google.android.gms.internal.p000authapi.zbas.zba()
            r4.zba(r1)
            com.google.android.gms.auth.api.identity.zbc r4 = r4.zbb()
            com.google.android.gms.common.api.GoogleApi$Settings r1 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r2.<init>(r3, r0, r4, r1)
            return
    }

    @Override // com.google.android.gms.auth.api.identity.AuthorizationClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.AuthorizationResult> authorize(com.google.android.gms.auth.api.identity.AuthorizationRequest r5) {
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.auth.api.identity.AuthorizationRequest$Builder r5 = com.google.android.gms.auth.api.identity.AuthorizationRequest.zba(r5)
            com.google.android.gms.common.api.Api$ApiOptions r0 = r4.getApiOptions()
            com.google.android.gms.auth.api.identity.zbc r0 = (com.google.android.gms.auth.api.identity.zbc) r0
            java.lang.String r0 = r0.zbb()
            r5.zbb(r0)
            com.google.android.gms.auth.api.identity.AuthorizationRequest r5 = r5.build()
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.internal.p000authapi.zbar.zbc
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            com.google.android.gms.internal.auth-api.zbw r1 = new com.google.android.gms.internal.auth-api.zbw
            r1.<init>(r4, r5)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r0.run(r1)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r5.setAutoResolveMissingFeatures(r3)
            r0 = 1534(0x5fe, float:2.15E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r5.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r5.build()
            com.google.android.gms.tasks.Task r5 = r4.doRead(r5)
            return r5
    }

    @Override // com.google.android.gms.auth.api.identity.AuthorizationClient
    public final com.google.android.gms.auth.api.identity.AuthorizationResult getAuthorizationResultFromIntent(android.content.Intent r3) throws com.google.android.gms.common.api.ApiException {
            r2 = this;
            if (r3 == 0) goto L37
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r0 = com.google.android.gms.common.api.Status.CREATOR
            java.lang.String r1 = "status"
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(r3, r1, r0)
            com.google.android.gms.common.api.Status r0 = (com.google.android.gms.common.api.Status) r0
            if (r0 == 0) goto L2f
            boolean r1 = r0.isSuccess()
            if (r1 == 0) goto L29
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.identity.AuthorizationResult> r0 = com.google.android.gms.auth.api.identity.AuthorizationResult.CREATOR
            java.lang.String r1 = "authorization_result"
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(r3, r1, r0)
            com.google.android.gms.auth.api.identity.AuthorizationResult r3 = (com.google.android.gms.auth.api.identity.AuthorizationResult) r3
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
}
