package com.google.android.gms.auth.api.proxy;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdkWithMembers
/* loaded from: classes.dex */
public class AuthApiStatusCodes extends com.google.android.gms.common.api.CommonStatusCodes {

    @com.google.android.gms.common.internal.ShowFirstParty
    public static final int AUTH_API_ACCESS_FORBIDDEN = 3001;

    @com.google.android.gms.common.internal.ShowFirstParty
    public static final int AUTH_API_CLIENT_ERROR = 3002;

    @com.google.android.gms.common.internal.ShowFirstParty
    public static final int AUTH_API_INVALID_CREDENTIALS = 3000;

    @com.google.android.gms.common.internal.ShowFirstParty
    public static final int AUTH_API_SERVER_ERROR = 3003;

    @com.google.android.gms.common.internal.ShowFirstParty
    public static final int AUTH_APP_CERT_ERROR = 3006;

    @com.google.android.gms.common.internal.ShowFirstParty
    public static final int AUTH_TOKEN_ERROR = 3004;

    @com.google.android.gms.common.internal.ShowFirstParty
    public static final int AUTH_URL_RESOLUTION = 3005;

    private AuthApiStatusCodes() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getStatusCodeString(int r0) {
            switch(r0) {
                case 3000: goto L1a;
                case 3001: goto L17;
                case 3002: goto L14;
                case 3003: goto L11;
                case 3004: goto Le;
                case 3005: goto Lb;
                case 3006: goto L8;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(r0)
            return r0
        L8:
            java.lang.String r0 = "AUTH_APP_CERT_ERROR"
            return r0
        Lb:
            java.lang.String r0 = "AUTH_URL_RESOLUTION"
            return r0
        Le:
            java.lang.String r0 = "AUTH_TOKEN_ERROR"
            return r0
        L11:
            java.lang.String r0 = "AUTH_API_SERVER_ERROR"
            return r0
        L14:
            java.lang.String r0 = "AUTH_API_CLIENT_ERROR"
            return r0
        L17:
            java.lang.String r0 = "AUTH_API_ACCESS_FORBIDDEN"
            return r0
        L1a:
            java.lang.String r0 = "AUTH_API_INVALID_CREDENTIALS"
            return r0
    }
}
