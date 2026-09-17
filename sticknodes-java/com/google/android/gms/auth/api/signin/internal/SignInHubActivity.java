package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@com.google.android.gms.common.annotation.KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends androidx.fragment.app.FragmentActivity {
    private static boolean zba;
    private boolean zbb;
    private com.google.android.gms.auth.api.signin.internal.SignInConfiguration zbc;
    private boolean zbd;
    private int zbe;
    private android.content.Intent zbf;

    static {
            return
    }

    public SignInHubActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zbb = r0
            return
    }

    static /* bridge */ /* synthetic */ int zba(com.google.android.gms.auth.api.signin.internal.SignInHubActivity r0) {
            int r0 = r0.zbe
            return r0
    }

    static /* bridge */ /* synthetic */ android.content.Intent zbb(com.google.android.gms.auth.api.signin.internal.SignInHubActivity r0) {
            android.content.Intent r0 = r0.zbf
            return r0
    }

    private final void zbc() {
            r4 = this;
            androidx.loader.app.LoaderManager r0 = r4.getSupportLoaderManager()
            com.google.android.gms.auth.api.signin.internal.zbw r1 = new com.google.android.gms.auth.api.signin.internal.zbw
            r2 = 0
            r1.<init>(r4, r2)
            r3 = 0
            r0.initLoader(r3, r2, r1)
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zba = r3
            return
    }

    private final void zbd(int r3) {
            r2 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r3)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r1 = "googleSignInStatus"
            r3.putExtra(r1, r0)
            r0 = 0
            r2.setResult(r0, r3)
            r2.finish()
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zba = r0
            return
    }

    private final void zbe(java.lang.String r3) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r3)
            java.lang.String r1 = "com.google.android.gms.auth.GOOGLE_SIGN_IN"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L13
            java.lang.String r3 = "com.google.android.gms"
            r0.setPackage(r3)
            goto L1a
        L13:
            java.lang.String r3 = r2.getPackageName()
            r0.setPackage(r3)
        L1a:
            com.google.android.gms.auth.api.signin.internal.SignInConfiguration r3 = r2.zbc
            java.lang.String r1 = "config"
            r0.putExtra(r1, r3)
            r3 = 40962(0xa002, float:5.74E-41)
            r2.startActivityForResult(r0, r3)     // Catch: android.content.ActivityNotFoundException -> L28
            return
        L28:
            r3 = 1
            r2.zbb = r3
            java.lang.String r3 = "AuthSignInClient"
            java.lang.String r0 = "Could not launch sign in Intent. Google Play Service is probably being updated..."
            android.util.Log.w(r3, r0)
            r3 = 17
            r2.zbd(r3)
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int r4, int r5, android.content.Intent r6) {
            r3 = this;
            boolean r0 = r3.zbb
            if (r0 == 0) goto L5
            goto Le
        L5:
            r0 = 0
            r3.setResult(r0)
            r0 = 40962(0xa002, float:5.74E-41)
            if (r4 == r0) goto Lf
        Le:
            return
        Lf:
            r4 = 8
            if (r6 == 0) goto L6c
            java.lang.String r0 = "signInAccount"
            android.os.Parcelable r1 = r6.getParcelableExtra(r0)
            com.google.android.gms.auth.api.signin.SignInAccount r1 = (com.google.android.gms.auth.api.signin.SignInAccount) r1
            if (r1 == 0) goto L56
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = r1.zba()
            if (r2 == 0) goto L56
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r4 = r1.zba()
            if (r4 != 0) goto L36
            java.lang.String r4 = "AuthSignInClient"
            java.lang.String r5 = "Google account is null"
            android.util.Log.e(r4, r5)
            r4 = 12500(0x30d4, float:1.7516E-41)
            r3.zbd(r4)
            return
        L36:
            com.google.android.gms.auth.api.signin.internal.zbn r1 = com.google.android.gms.auth.api.signin.internal.zbn.zbc(r3)
            com.google.android.gms.auth.api.signin.internal.SignInConfiguration r2 = r3.zbc
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = r2.zba()
            r1.zbe(r2, r4)
            r6.removeExtra(r0)
            java.lang.String r0 = "googleSignInAccount"
            r6.putExtra(r0, r4)
            r4 = 1
            r3.zbd = r4
            r3.zbe = r5
            r3.zbf = r6
            r3.zbc()
            return
        L56:
            java.lang.String r5 = "errorCode"
            boolean r0 = r6.hasExtra(r5)
            if (r0 == 0) goto L6c
            int r4 = r6.getIntExtra(r5, r4)
            r5 = 13
            if (r4 != r5) goto L68
            r4 = 12501(0x30d5, float:1.7518E-41)
        L68:
            r3.zbd(r4)
            return
        L6c:
            r3.zbd(r4)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(android.os.Bundle r6) {
            r5 = this;
            super.onCreate(r6)
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = r0.getAction()
            r2 = 12500(0x30d4, float:1.7516E-41)
            java.lang.String r3 = "AuthSignInClient"
            if (r1 != 0) goto L1a
            java.lang.String r6 = "Null action"
            android.util.Log.e(r3, r6)
            r5.zbd(r2)
            return
        L1a:
            java.lang.String r4 = "com.google.android.gms.auth.NO_IMPL"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L2b
            java.lang.String r6 = "Action not implemented"
            android.util.Log.e(r3, r6)
            r5.zbd(r2)
            return
        L2b:
            java.lang.String r2 = "com.google.android.gms.auth.GOOGLE_SIGN_IN"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L51
            java.lang.String r2 = "com.google.android.gms.auth.APPAUTH_SIGN_IN"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L3c
            goto L51
        L3c:
            java.lang.String r6 = r0.getAction()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "Unknown action: "
            java.lang.String r6 = r0.concat(r6)
            android.util.Log.e(r3, r6)
            r5.finish()
            return
        L51:
            java.lang.String r2 = "config"
            android.os.Bundle r0 = r0.getBundleExtra(r2)
            r4 = 0
            if (r0 != 0) goto L66
            java.lang.String r6 = "Activity started with no configuration."
            android.util.Log.e(r3, r6)
            r5.setResult(r4)
            r5.finish()
            return
        L66:
            android.os.Parcelable r0 = r0.getParcelable(r2)
            com.google.android.gms.auth.api.signin.internal.SignInConfiguration r0 = (com.google.android.gms.auth.api.signin.internal.SignInConfiguration) r0
            if (r0 != 0) goto L7a
            java.lang.String r6 = "Activity started with invalid configuration."
            android.util.Log.e(r3, r6)
            r5.setResult(r4)
            r5.finish()
            return
        L7a:
            r5.zbc = r0
            if (r6 != 0) goto L92
            boolean r6 = com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zba
            if (r6 == 0) goto L8b
            r5.setResult(r4)
            r6 = 12502(0x30d6, float:1.7519E-41)
            r5.zbd(r6)
            return
        L8b:
            r6 = 1
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zba = r6
            r5.zbe(r1)
            return
        L92:
            java.lang.String r0 = "signingInGoogleApiClients"
            boolean r0 = r6.getBoolean(r0)
            r5.zbd = r0
            if (r0 == 0) goto Lbf
            java.lang.String r0 = "signInResultCode"
            int r0 = r6.getInt(r0)
            r5.zbe = r0
            java.lang.String r0 = "signInResultData"
            android.os.Parcelable r6 = r6.getParcelable(r0)
            android.content.Intent r6 = (android.content.Intent) r6
            if (r6 != 0) goto Lba
            java.lang.String r6 = "Sign in result data cannot be null"
            android.util.Log.e(r3, r6)
            r5.setResult(r4)
            r5.finish()
            return
        Lba:
            r5.zbf = r6
            r5.zbc()
        Lbf:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
            r1 = this;
            super.onDestroy()
            r0 = 0
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zba = r0
            return
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            boolean r0 = r2.zbd
            java.lang.String r1 = "signingInGoogleApiClients"
            r3.putBoolean(r1, r0)
            boolean r0 = r2.zbd
            if (r0 == 0) goto L1c
            int r0 = r2.zbe
            java.lang.String r1 = "signInResultCode"
            r3.putInt(r1, r0)
            android.content.Intent r0 = r2.zbf
            java.lang.String r1 = "signInResultData"
            r3.putParcelable(r1, r0)
        L1c:
            return
    }
}
