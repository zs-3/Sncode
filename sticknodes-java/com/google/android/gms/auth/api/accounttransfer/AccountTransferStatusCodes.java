package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class AccountTransferStatusCodes extends com.google.android.gms.common.api.CommonStatusCodes {
    public static final int CHALLENGE_NOT_ALLOWED = 20503;
    public static final int INVALID_REQUEST = 20502;
    public static final int NOT_ALLOWED_SECURITY = 20500;
    public static final int NO_DATA_AVAILABLE = 20501;
    public static final int SESSION_INACTIVE = 20504;

    private AccountTransferStatusCodes() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getStatusCodeString(int r0) {
            switch(r0) {
                case 20500: goto L14;
                case 20501: goto L11;
                case 20502: goto Le;
                case 20503: goto Lb;
                case 20504: goto L8;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(r0)
            return r0
        L8:
            java.lang.String r0 = "SESSION_INACTIVE"
            return r0
        Lb:
            java.lang.String r0 = "CHALLENGE_NOT_ALLOWED"
            return r0
        Le:
            java.lang.String r0 = "INVALID_REQUEST"
            return r0
        L11:
            java.lang.String r0 = "NO_DATA_AVAILABLE"
            return r0
        L14:
            java.lang.String r0 = "NOT_ALLOWED_SECURITY"
            return r0
    }
}
