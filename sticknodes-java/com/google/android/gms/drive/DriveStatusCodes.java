package com.google.android.gms.drive;

/* loaded from: classes.dex */
public final class DriveStatusCodes extends com.google.android.gms.common.api.CommonStatusCodes {
    public static final int DRIVE_CONTENTS_TOO_LARGE = 1508;

    @java.lang.Deprecated
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int DRIVE_RATE_LIMIT_EXCEEDED = 1507;
    public static final int DRIVE_RESOURCE_NOT_AVAILABLE = 1502;

    private DriveStatusCodes() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getStatusCodeString(int r1) {
            r0 = 3004(0xbbc, float:4.21E-42)
            if (r1 == r0) goto L2d
            switch(r1) {
                case 1501: goto L2a;
                case 1502: goto L27;
                case 1503: goto L24;
                case 1504: goto L21;
                case 1505: goto L1e;
                case 1506: goto L1b;
                case 1507: goto L18;
                case 1508: goto L15;
                case 1509: goto L12;
                case 1510: goto Lf;
                case 1511: goto Lc;
                default: goto L7;
            }
        L7:
            java.lang.String r1 = com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(r1)
            return r1
        Lc:
            java.lang.String r1 = "DRIVE_INSUFFICIENT_SCOPES"
            return r1
        Lf:
            java.lang.String r1 = "DRIVE_INAPPLICABLE_OPERATION"
            return r1
        L12:
            java.lang.String r1 = "DRIVE_RESOURCE_PERMISSION_FORBIDDEN"
            return r1
        L15:
            java.lang.String r1 = "DRIVE_CONTENTS_TOO_LARGE"
            return r1
        L18:
            java.lang.String r1 = "DRIVE_RATE_LIMIT_EXCEEDED"
            return r1
        L1b:
            java.lang.String r1 = "DRIVE_FULL_SYNC_REQUIRED"
            return r1
        L1e:
            java.lang.String r1 = "DRIVE_REALTIME_INVALID_COMPOUND_OP"
            return r1
        L21:
            java.lang.String r1 = "DRIVE_REALTIME_CONCURRENT_CREATION"
            return r1
        L24:
            java.lang.String r1 = "DRIVE_RESOURCE_FORBIDDEN"
            return r1
        L27:
            java.lang.String r1 = "DRIVE_RESOURCE_NOT_AVAILABLE"
            return r1
        L2a:
            java.lang.String r1 = "DRIVE_RESOURCE_ALREADY_EXISTS"
            return r1
        L2d:
            java.lang.String r1 = "DRIVE_REALTIME_TOKEN_REFRESH_REQUIRED"
            return r1
    }
}
