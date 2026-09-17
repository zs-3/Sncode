package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class Identity {
    private Identity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.auth.api.identity.AuthorizationClient getAuthorizationClient(android.app.Activity r3) {
            com.google.android.gms.internal.auth-api.zbz r0 = new com.google.android.gms.internal.auth-api.zbz
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            android.app.Activity r3 = (android.app.Activity) r3
            com.google.android.gms.auth.api.identity.zbb r1 = new com.google.android.gms.auth.api.identity.zbb
            r2 = 0
            r1.<init>(r2)
            com.google.android.gms.auth.api.identity.zbc r1 = r1.zbb()
            r0.<init>(r3, r1)
            return r0
    }

    public static com.google.android.gms.auth.api.identity.AuthorizationClient getAuthorizationClient(android.content.Context r3) {
            com.google.android.gms.internal.auth-api.zbz r0 = new com.google.android.gms.internal.auth-api.zbz
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            android.content.Context r3 = (android.content.Context) r3
            com.google.android.gms.auth.api.identity.zbb r1 = new com.google.android.gms.auth.api.identity.zbb
            r2 = 0
            r1.<init>(r2)
            com.google.android.gms.auth.api.identity.zbc r1 = r1.zbb()
            r0.<init>(r3, r1)
            return r0
    }

    public static com.google.android.gms.auth.api.identity.CredentialSavingClient getCredentialSavingClient(android.app.Activity r2) {
            com.google.android.gms.internal.auth-api.zbaf r0 = new com.google.android.gms.internal.auth-api.zbaf
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.app.Activity r2 = (android.app.Activity) r2
            com.google.android.gms.auth.api.identity.zbh r1 = new com.google.android.gms.auth.api.identity.zbh
            r1.<init>()
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.android.gms.auth.api.identity.CredentialSavingClient getCredentialSavingClient(android.content.Context r2) {
            com.google.android.gms.internal.auth-api.zbaf r0 = new com.google.android.gms.internal.auth-api.zbaf
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.content.Context r2 = (android.content.Context) r2
            com.google.android.gms.auth.api.identity.zbh r1 = new com.google.android.gms.auth.api.identity.zbh
            r1.<init>()
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.android.gms.auth.api.identity.SignInClient getSignInClient(android.app.Activity r2) {
            com.google.android.gms.internal.auth-api.zbap r0 = new com.google.android.gms.internal.auth-api.zbap
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.app.Activity r2 = (android.app.Activity) r2
            com.google.android.gms.auth.api.identity.zbu r1 = new com.google.android.gms.auth.api.identity.zbu
            r1.<init>()
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.android.gms.auth.api.identity.SignInClient getSignInClient(android.content.Context r2) {
            com.google.android.gms.internal.auth-api.zbap r0 = new com.google.android.gms.internal.auth-api.zbap
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.content.Context r2 = (android.content.Context) r2
            com.google.android.gms.auth.api.identity.zbu r1 = new com.google.android.gms.auth.api.identity.zbu
            r1.<init>()
            r0.<init>(r2, r1)
            return r0
    }
}
