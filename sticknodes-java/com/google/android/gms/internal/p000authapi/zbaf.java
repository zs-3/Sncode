package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class zbaf extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.identity.CredentialSavingClient {
    private static final com.google.android.gms.common.api.Api.ClientKey zba = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zbb = null;
    private static final com.google.android.gms.common.api.Api zbc = null;
    private final java.lang.String zbd;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.internal.p000authapi.zbaf.zba = r0
            com.google.android.gms.internal.auth-api.zbac r1 = new com.google.android.gms.internal.auth-api.zbac
            r1.<init>()
            com.google.android.gms.internal.p000authapi.zbaf.zbb = r1
            com.google.android.gms.common.api.Api r2 = new com.google.android.gms.common.api.Api
            java.lang.String r3 = "Auth.Api.Identity.CredentialSaving.API"
            r2.<init>(r3, r1, r0)
            com.google.android.gms.internal.p000authapi.zbaf.zbc = r2
            return
    }

    public zbaf(android.app.Activity r3, com.google.android.gms.auth.api.identity.zbh r4) {
            r2 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.internal.p000authapi.zbaf.zbc
            com.google.android.gms.common.api.GoogleApi$Settings r1 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r2.<init>(r3, r0, r4, r1)
            java.lang.String r3 = com.google.android.gms.internal.p000authapi.zbas.zba()
            r2.zbd = r3
            return
    }

    public zbaf(android.content.Context r3, com.google.android.gms.auth.api.identity.zbh r4) {
            r2 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.internal.p000authapi.zbaf.zbc
            com.google.android.gms.common.api.GoogleApi$Settings r1 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r2.<init>(r3, r0, r4, r1)
            java.lang.String r3 = com.google.android.gms.internal.p000authapi.zbas.zba()
            r2.zbd = r3
            return
    }

    @Override // com.google.android.gms.auth.api.identity.CredentialSavingClient
    public final com.google.android.gms.common.api.Status getStatusFromIntent(android.content.Intent r3) {
            r2 = this;
            if (r3 != 0) goto L5
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR
            return r3
        L5:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r0 = com.google.android.gms.common.api.Status.CREATOR
            java.lang.String r1 = "status"
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(r3, r1, r0)
            com.google.android.gms.common.api.Status r3 = (com.google.android.gms.common.api.Status) r3
            if (r3 != 0) goto L13
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR
        L13:
            return r3
    }

    @Override // com.google.android.gms.auth.api.identity.CredentialSavingClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult> saveAccountLinkingToken(com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest r5) {
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$Builder r5 = com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.zba(r5)
            java.lang.String r0 = r4.zbd
            r5.zba(r0)
            com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest r5 = r5.build()
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.internal.p000authapi.zbar.zbg
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            com.google.android.gms.internal.auth-api.zbaa r1 = new com.google.android.gms.internal.auth-api.zbaa
            r1.<init>(r4, r5)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r0.run(r1)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r5.setAutoResolveMissingFeatures(r3)
            r0 = 1535(0x5ff, float:2.151E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r5.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r5.build()
            com.google.android.gms.tasks.Task r5 = r4.doRead(r5)
            return r5
    }

    @Override // com.google.android.gms.auth.api.identity.CredentialSavingClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.SavePasswordResult> savePassword(com.google.android.gms.auth.api.identity.SavePasswordRequest r5) {
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.auth.api.identity.SavePasswordRequest$Builder r5 = com.google.android.gms.auth.api.identity.SavePasswordRequest.zba(r5)
            java.lang.String r0 = r4.zbd
            r5.zba(r0)
            com.google.android.gms.auth.api.identity.SavePasswordRequest r5 = r5.build()
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.internal.p000authapi.zbar.zbe
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            com.google.android.gms.internal.auth-api.zbab r1 = new com.google.android.gms.internal.auth-api.zbab
            r1.<init>(r4, r5)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r0.run(r1)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r5.setAutoResolveMissingFeatures(r3)
            r0 = 1536(0x600, float:2.152E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r5 = r5.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r5.build()
            com.google.android.gms.tasks.Task r5 = r4.doRead(r5)
            return r5
    }
}
