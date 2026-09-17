package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public interface SignInClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.auth.api.identity.zbu> {
    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.BeginSignInResult> beginSignIn(com.google.android.gms.auth.api.identity.BeginSignInRequest r1);

    java.lang.String getPhoneNumberFromIntent(android.content.Intent r1) throws com.google.android.gms.common.api.ApiException;

    com.google.android.gms.tasks.Task<android.app.PendingIntent> getPhoneNumberHintIntent(com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest r1);

    @java.lang.Deprecated
    com.google.android.gms.auth.api.identity.SignInCredential getSignInCredentialFromIntent(android.content.Intent r1) throws com.google.android.gms.common.api.ApiException;

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<android.app.PendingIntent> getSignInIntent(com.google.android.gms.auth.api.identity.GetSignInIntentRequest r1);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<java.lang.Void> signOut();
}
