package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class zbt extends com.google.android.gms.auth.api.signin.internal.zbo {
    private final android.content.Context zba;

    public zbt(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            return
    }

    private final void zbd() {
            r4 = this;
            android.content.Context r0 = r4.zba
            int r1 = android.os.Binder.getCallingUid()
            boolean r0 = com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(r0, r1)
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            int r1 = android.os.Binder.getCallingUid()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Calling UID "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " is not Google Play services."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zbp
    public final void zbb() {
            r1 = this;
            r1.zbd()
            android.content.Context r0 = r1.zba
            com.google.android.gms.auth.api.signin.internal.zbn r0 = com.google.android.gms.auth.api.signin.internal.zbn.zbc(r0)
            r0.zbd()
            return
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zbp
    public final void zbc() {
            r3 = this;
            r3.zbd()
            android.content.Context r0 = r3.zba
            com.google.android.gms.auth.api.signin.internal.Storage r0 = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(r0)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r0.getSavedDefaultGoogleSignInAccount()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_SIGN_IN
            if (r1 == 0) goto L15
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = r0.getSavedDefaultGoogleSignInOptions()
        L15:
            android.content.Context r0 = r3.zba
            com.google.android.gms.auth.api.signin.GoogleSignInClient r0 = com.google.android.gms.auth.api.signin.GoogleSignIn.getClient(r0, r2)
            if (r1 == 0) goto L21
            r0.revokeAccess()
            return
        L21:
            r0.signOut()
            return
    }
}
