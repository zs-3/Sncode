package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
public class CommonStatusCodes {
    public static final int API_NOT_CONNECTED = 17;
    public static final int CANCELED = 16;
    public static final int CONNECTION_SUSPENDED_DURING_CALL = 20;
    public static final int DEVELOPER_ERROR = 10;
    public static final int ERROR = 13;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 14;
    public static final int INVALID_ACCOUNT = 5;
    public static final int NETWORK_ERROR = 7;
    public static final int RECONNECTION_TIMED_OUT = 22;
    public static final int RECONNECTION_TIMED_OUT_DURING_UPDATE = 21;
    public static final int REMOTE_EXCEPTION = 19;
    public static final int RESOLUTION_REQUIRED = 6;

    @java.lang.Deprecated
    public static final int SERVICE_DISABLED = 3;

    @java.lang.Deprecated
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int SUCCESS_CACHE = -1;
    public static final int TIMEOUT = 15;

    @com.google.android.gms.common.annotation.KeepForSdk
    protected CommonStatusCodes() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getStatusCodeString(int r2) {
            switch(r2) {
                case -1: goto L4e;
                case 0: goto L4b;
                case 1: goto L3;
                case 2: goto L48;
                case 3: goto L45;
                case 4: goto L42;
                case 5: goto L3f;
                case 6: goto L3c;
                case 7: goto L39;
                case 8: goto L36;
                case 9: goto L3;
                case 10: goto L33;
                case 11: goto L3;
                case 12: goto L3;
                case 13: goto L30;
                case 14: goto L2d;
                case 15: goto L2a;
                case 16: goto L27;
                case 17: goto L24;
                case 18: goto L21;
                case 19: goto L1e;
                case 20: goto L1b;
                case 21: goto L18;
                case 22: goto L15;
                default: goto L3;
            }
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unknown status code: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L15:
            java.lang.String r2 = "RECONNECTION_TIMED_OUT"
            return r2
        L18:
            java.lang.String r2 = "RECONNECTION_TIMED_OUT_DURING_UPDATE"
            return r2
        L1b:
            java.lang.String r2 = "CONNECTION_SUSPENDED_DURING_CALL"
            return r2
        L1e:
            java.lang.String r2 = "REMOTE_EXCEPTION"
            return r2
        L21:
            java.lang.String r2 = "DEAD_CLIENT"
            return r2
        L24:
            java.lang.String r2 = "API_NOT_CONNECTED"
            return r2
        L27:
            java.lang.String r2 = "CANCELED"
            return r2
        L2a:
            java.lang.String r2 = "TIMEOUT"
            return r2
        L2d:
            java.lang.String r2 = "INTERRUPTED"
            return r2
        L30:
            java.lang.String r2 = "ERROR"
            return r2
        L33:
            java.lang.String r2 = "DEVELOPER_ERROR"
            return r2
        L36:
            java.lang.String r2 = "INTERNAL_ERROR"
            return r2
        L39:
            java.lang.String r2 = "NETWORK_ERROR"
            return r2
        L3c:
            java.lang.String r2 = "RESOLUTION_REQUIRED"
            return r2
        L3f:
            java.lang.String r2 = "INVALID_ACCOUNT"
            return r2
        L42:
            java.lang.String r2 = "SIGN_IN_REQUIRED"
            return r2
        L45:
            java.lang.String r2 = "SERVICE_DISABLED"
            return r2
        L48:
            java.lang.String r2 = "SERVICE_VERSION_UPDATE_REQUIRED"
            return r2
        L4b:
            java.lang.String r2 = "SUCCESS"
            return r2
        L4e:
            java.lang.String r2 = "SUCCESS_CACHE"
            return r2
    }
}
