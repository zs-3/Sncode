package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class GamesCallbackStatusCodes {

    @java.lang.Deprecated
    public static final int CLIENT_RECONNECT_REQUIRED = 2;
    public static final int INTERNAL_ERROR = 1;
    public static final int OK = 0;

    private GamesCallbackStatusCodes() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getStatusCodeString(int r2) {
            if (r2 == 0) goto L3c
            r0 = 1
            if (r2 == r0) goto L39
            r0 = 2
            if (r2 == r0) goto L36
            r0 = 6003(0x1773, float:8.412E-42)
            if (r2 == r0) goto L33
            r0 = 7004(0x1b5c, float:9.815E-42)
            if (r2 == r0) goto L30
            r0 = 7000(0x1b58, float:9.809E-42)
            if (r2 == r0) goto L2d
            r0 = 7001(0x1b59, float:9.81E-42)
            if (r2 == r0) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unknown games callback status code: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L2a:
            java.lang.String r2 = "REAL_TIME_MESSAGE_SEND_FAILED"
            return r2
        L2d:
            java.lang.String r2 = "REAL_TIME_CONNECTION_FAILED"
            return r2
        L30:
            java.lang.String r2 = "REAL_TIME_ROOM_NOT_JOINED"
            return r2
        L33:
            java.lang.String r2 = "MULTIPLAYER_DISABLED"
            return r2
        L36:
            java.lang.String r2 = "CLIENT_RECONNECT_REQUIRED"
            return r2
        L39:
            java.lang.String r2 = "INTERNAL_ERROR"
            return r2
        L3c:
            java.lang.String r2 = "OK"
            return r2
    }
}
