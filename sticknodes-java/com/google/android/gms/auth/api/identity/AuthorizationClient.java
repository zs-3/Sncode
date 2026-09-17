package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public interface AuthorizationClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.auth.api.identity.zbc> {
    com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.AuthorizationResult> authorize(com.google.android.gms.auth.api.identity.AuthorizationRequest r1);

    com.google.android.gms.auth.api.identity.AuthorizationResult getAuthorizationResultFromIntent(android.content.Intent r1) throws com.google.android.gms.common.api.ApiException;
}
