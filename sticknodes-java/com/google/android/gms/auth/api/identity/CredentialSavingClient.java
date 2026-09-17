package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public interface CredentialSavingClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.auth.api.identity.zbh> {
    com.google.android.gms.common.api.Status getStatusFromIntent(android.content.Intent r1);

    com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult> saveAccountLinkingToken(com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest r1);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.SavePasswordResult> savePassword(com.google.android.gms.auth.api.identity.SavePasswordRequest r1);
}
