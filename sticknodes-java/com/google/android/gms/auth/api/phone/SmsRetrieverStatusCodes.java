package com.google.android.gms.auth.api.phone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes.dex */
public final class SmsRetrieverStatusCodes extends com.google.android.gms.common.api.CommonStatusCodes {
    public static final int API_NOT_AVAILABLE = 36501;
    public static final int PLATFORM_NOT_SUPPORTED = 36500;
    public static final int USER_PERMISSION_REQUIRED = 36502;

    private SmsRetrieverStatusCodes() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getStatusCodeString(int r0) {
            switch(r0) {
                case 36500: goto Le;
                case 36501: goto Lb;
                case 36502: goto L8;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(r0)
            return r0
        L8:
            java.lang.String r0 = "USER_PERMISSION_REQUIRED"
            return r0
        Lb:
            java.lang.String r0 = "API_NOT_AVAILABLE"
            return r0
        Le:
            java.lang.String r0 = "PLATFORM_NOT_SUPPORTED"
            return r0
    }
}
