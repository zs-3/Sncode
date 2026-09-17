package com.google.android.gms.auth.api.signin;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class GoogleSignInStatusCodes extends com.google.android.gms.common.api.CommonStatusCodes {
    public static final int SIGN_IN_CANCELLED = 12501;
    public static final int SIGN_IN_CURRENTLY_IN_PROGRESS = 12502;
    public static final int SIGN_IN_FAILED = 12500;

    private GoogleSignInStatusCodes() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getStatusCodeString(int r0) {
            switch(r0) {
                case 12500: goto Le;
                case 12501: goto Lb;
                case 12502: goto L8;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(r0)
            return r0
        L8:
            java.lang.String r0 = "Sign-in in progress"
            return r0
        Lb:
            java.lang.String r0 = "Sign in action cancelled"
            return r0
        Le:
            java.lang.String r0 = "A non-recoverable sign in failure occurred"
            return r0
    }
}
