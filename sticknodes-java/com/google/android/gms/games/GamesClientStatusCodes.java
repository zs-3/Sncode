package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class GamesClientStatusCodes extends com.google.android.gms.common.api.CommonStatusCodes {
    public static final int ACHIEVEMENT_NOT_INCREMENTAL = 26562;
    public static final int ACHIEVEMENT_UNKNOWN = 26561;
    public static final int ACHIEVEMENT_UNLOCKED = 26563;
    public static final int ACHIEVEMENT_UNLOCK_FAILURE = 26560;
    public static final int APP_MISCONFIGURED = 26508;
    public static final int CONSENT_REQUIRED = 26703;
    public static final int GAME_NOT_FOUND = 26509;
    public static final int LICENSE_CHECK_FAILED = 26507;
    public static final int NETWORK_ERROR_NO_DATA = 26504;
    public static final int NETWORK_ERROR_OPERATION_FAILED = 26506;
    public static final int OPERATION_IN_FLIGHT = 26607;
    public static final int SNAPSHOT_COMMIT_FAILED = 26573;
    public static final int SNAPSHOT_CONFLICT_MISSING = 26576;
    public static final int SNAPSHOT_CONTENTS_UNAVAILABLE = 26572;
    public static final int SNAPSHOT_CREATION_FAILED = 26571;
    public static final int SNAPSHOT_FOLDER_UNAVAILABLE = 26575;
    public static final int SNAPSHOT_NOT_FOUND = 26570;
    public static final int VIDEO_ALREADY_CAPTURING = 26625;
    public static final int VIDEO_NOT_ACTIVE = 26620;
    public static final int VIDEO_OUT_OF_DISK_SPACE = 26626;
    public static final int VIDEO_PERMISSION_ERROR = 26622;
    public static final int VIDEO_STORAGE_ERROR = 26623;
    public static final int VIDEO_UNEXPECTED_CAPTURE_ERROR = 26624;
    public static final int VIDEO_UNSUPPORTED = 26621;

    private GamesClientStatusCodes() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getStatusCodeString(int r1) {
            r0 = 26540(0x67ac, float:3.719E-41)
            if (r1 == r0) goto L10c
            r0 = 26541(0x67ad, float:3.7192E-41)
            if (r1 == r0) goto L109
            switch(r1) {
                case 26502: goto L106;
                case 26503: goto L103;
                case 26504: goto L100;
                case 26505: goto Lfd;
                case 26506: goto Lfa;
                case 26507: goto Lf7;
                case 26508: goto Lf4;
                case 26509: goto Lf1;
                case 26520: goto Lee;
                case 26620: goto Leb;
                case 26621: goto Le8;
                case 26622: goto Le5;
                case 26623: goto Le2;
                case 26624: goto Ldf;
                case 26625: goto Ldc;
                case 26626: goto Ld9;
                case 26627: goto Ld6;
                case 26628: goto Ld3;
                case 26629: goto Ld0;
                case 26630: goto Lcd;
                case 26631: goto Lca;
                case 26632: goto Lc7;
                case 26650: goto Lc4;
                case 26652: goto Lc1;
                case 26700: goto Lbe;
                case 26701: goto Lbb;
                case 26702: goto Lb8;
                case 26703: goto Lb5;
                case 26704: goto Lb2;
                default: goto Lb;
            }
        Lb:
            switch(r1) {
                case 26530: goto Laf;
                case 26531: goto Lac;
                case 26532: goto La9;
                case 26533: goto La6;
                case 26534: goto La3;
                case 26535: goto La0;
                case 26536: goto L9d;
                default: goto Le;
            }
        Le:
            switch(r1) {
                case 26550: goto L9a;
                case 26551: goto L97;
                case 26552: goto L94;
                default: goto L11;
            }
        L11:
            switch(r1) {
                case 26560: goto L91;
                case 26561: goto L8e;
                case 26562: goto L8b;
                case 26563: goto L88;
                default: goto L14;
            }
        L14:
            switch(r1) {
                case 26570: goto L85;
                case 26571: goto L82;
                case 26572: goto L7f;
                case 26573: goto L7c;
                case 26574: goto L79;
                case 26575: goto L76;
                case 26576: goto L73;
                default: goto L17;
            }
        L17:
            switch(r1) {
                case 26580: goto L70;
                case 26581: goto L6d;
                case 26582: goto L6a;
                case 26583: goto L67;
                case 26584: goto L64;
                default: goto L1a;
            }
        L1a:
            switch(r1) {
                case 26590: goto L61;
                case 26591: goto L5e;
                case 26592: goto L5b;
                case 26593: goto L58;
                case 26594: goto L55;
                case 26595: goto L52;
                case 26596: goto L4f;
                case 26597: goto L4c;
                default: goto L1d;
            }
        L1d:
            switch(r1) {
                case 26600: goto L49;
                case 26601: goto L46;
                case 26602: goto L43;
                case 26603: goto L40;
                case 26604: goto L3d;
                case 26605: goto L3a;
                case 26606: goto L37;
                case 26607: goto L34;
                default: goto L20;
            }
        L20:
            switch(r1) {
                case 26610: goto L31;
                case 26611: goto L2e;
                case 26612: goto L2b;
                case 26613: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r1 = com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(r1)
            return r1
        L28:
            java.lang.String r1 = "QUEST_NOT_STARTED"
            return r1
        L2b:
            java.lang.String r1 = "QUEST_NO_LONGER_AVAILABLE"
            return r1
        L2e:
            java.lang.String r1 = "MILESTONE_CLAIM_FAILED"
            return r1
        L31:
            java.lang.String r1 = "MILESTONE_CLAIMED_PREVIOUSLY"
            return r1
        L34:
            java.lang.String r1 = "OPERATION_IN_FLIGHT"
            return r1
        L37:
            java.lang.String r1 = "REAL_TIME_SERVICE_NOT_CONNECTED"
            return r1
        L3a:
            java.lang.String r1 = "REAL_TIME_INACTIVE_ROOM"
            return r1
        L3d:
            java.lang.String r1 = "REAL_TIME_ROOM_NOT_JOINED"
            return r1
        L40:
            java.lang.String r1 = "PARTICIPANT_NOT_CONNECTED"
            return r1
        L43:
            java.lang.String r1 = "INVALID_REAL_TIME_ROOM_ID"
            return r1
        L46:
            java.lang.String r1 = "REAL_TIME_MESSAGE_SEND_FAILED"
            return r1
        L49:
            java.lang.String r1 = "REAL_TIME_CONNECTION_FAILED"
            return r1
        L4c:
            java.lang.String r1 = "MATCH_ERROR_LOCALLY_MODIFIED"
            return r1
        L4f:
            java.lang.String r1 = "MATCH_NOT_FOUND"
            return r1
        L52:
            java.lang.String r1 = "MATCH_ERROR_ALREADY_REMATCHED"
            return r1
        L55:
            java.lang.String r1 = "MATCH_ERROR_INVALID_MATCH_RESULTS"
            return r1
        L58:
            java.lang.String r1 = "MATCH_ERROR_OUT_OF_DATE_VERSION"
            return r1
        L5b:
            java.lang.String r1 = "MATCH_ERROR_INVALID_MATCH_STATE"
            return r1
        L5e:
            java.lang.String r1 = "MATCH_ERROR_INACTIVE_MATCH"
            return r1
        L61:
            java.lang.String r1 = "MATCH_ERROR_INVALID_PARTICIPANT_STATE"
            return r1
        L64:
            java.lang.String r1 = "MULTIPLAYER_ERROR_INVALID_OPERATION"
            return r1
        L67:
            java.lang.String r1 = "MULTIPLAYER_DISABLED"
            return r1
        L6a:
            java.lang.String r1 = "MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE"
            return r1
        L6d:
            java.lang.String r1 = "MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER"
            return r1
        L70:
            java.lang.String r1 = "MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED"
            return r1
        L73:
            java.lang.String r1 = "SNAPSHOT_CONFLICT_MISSING"
            return r1
        L76:
            java.lang.String r1 = "SNAPSHOT_FOLDER_UNAVAILABLE"
            return r1
        L79:
            java.lang.String r1 = "SNAPSHOT_CONFLICT"
            return r1
        L7c:
            java.lang.String r1 = "SNAPSHOT_COMMIT_FAILED"
            return r1
        L7f:
            java.lang.String r1 = "SNAPSHOT_CONTENTS_UNAVAILABLE"
            return r1
        L82:
            java.lang.String r1 = "SNAPSHOT_CREATION_FAILED"
            return r1
        L85:
            java.lang.String r1 = "SNAPSHOT_NOT_FOUND"
            return r1
        L88:
            java.lang.String r1 = "ACHIEVEMENT_UNLOCKED"
            return r1
        L8b:
            java.lang.String r1 = "ACHIEVEMENT_NOT_INCREMENTAL"
            return r1
        L8e:
            java.lang.String r1 = "ACHIEVEMENT_UNKNOWN"
            return r1
        L91:
            java.lang.String r1 = "ACHIEVEMENT_UNLOCK_FAILURE"
            return r1
        L94:
            java.lang.String r1 = "REQUEST_TOO_MANY_RECIPIENTS"
            return r1
        L97:
            java.lang.String r1 = "REQUEST_UPDATE_TOTAL_FAILURE"
            return r1
        L9a:
            java.lang.String r1 = "REQUEST_UPDATE_PARTIAL_SUCCESS"
            return r1
        L9d:
            java.lang.String r1 = "AUTH_ERROR_SERVICE_CACHE_MISTAKE"
            return r1
        La0:
            java.lang.String r1 = "AUTH_ERROR_ACCOUNT_UNICORN"
            return r1
        La3:
            java.lang.String r1 = "AUTH_ERROR_ACCOUNT_NOT_USABLE"
            return r1
        La6:
            java.lang.String r1 = "AUTH_ERROR_API_ACCESS_DENIED"
            return r1
        La9:
            java.lang.String r1 = "AUTH_ERROR_UNREGISTERED_CLIENT_ID"
            return r1
        Lac:
            java.lang.String r1 = "AUTH_ERROR_USER_RECOVERABLE"
            return r1
        Laf:
            java.lang.String r1 = "AUTH_ERROR_HARD"
            return r1
        Lb2:
            java.lang.String r1 = "PLAYER_NOT_FOUND"
            return r1
        Lb5:
            java.lang.String r1 = "CONSENT_REQUIRED"
            return r1
        Lb8:
            java.lang.String r1 = "CLIENT_HIDDEN"
            return r1
        Lbb:
            java.lang.String r1 = "CLIENT_EMPTY"
            return r1
        Lbe:
            java.lang.String r1 = "CLIENT_LOADING"
            return r1
        Lc1:
            java.lang.String r1 = "VIDEO_CAPTURE_OVERLAY_VISIBLE"
            return r1
        Lc4:
            java.lang.String r1 = "VIDEO_MISSING_OVERLAY_PERMISSION"
            return r1
        Lc7:
            java.lang.String r1 = "CAPTURE_ALREADY_PAUSED"
            return r1
        Lca:
            java.lang.String r1 = "VIDEO_CAPTURE_VIDEO_PERMISSION_REQUIRED"
            return r1
        Lcd:
            java.lang.String r1 = "VIDEO_RELEASE_TIMEOUT"
            return r1
        Ld0:
            java.lang.String r1 = "VIDEO_SCREEN_OFF"
            return r1
        Ld3:
            java.lang.String r1 = "VIDEO_NO_CAMERA"
            return r1
        Ld6:
            java.lang.String r1 = "VIDEO_NO_MIC"
            return r1
        Ld9:
            java.lang.String r1 = "VIDEO_OUT_OF_DISK_SPACE"
            return r1
        Ldc:
            java.lang.String r1 = "VIDEO_ALREADY_CAPTURING"
            return r1
        Ldf:
            java.lang.String r1 = "VIDEO_UNEXPECTED_CAPTURE_ERROR"
            return r1
        Le2:
            java.lang.String r1 = "VIDEO_STORAGE_ERROR"
            return r1
        Le5:
            java.lang.String r1 = "VIDEO_PERMISSION_ERROR"
            return r1
        Le8:
            java.lang.String r1 = "VIDEO_UNSUPPORTED"
            return r1
        Leb:
            java.lang.String r1 = "VIDEO_NOT_ACTIVE"
            return r1
        Lee:
            java.lang.String r1 = "RESOLVE_STALE_OR_NO_DATA"
            return r1
        Lf1:
            java.lang.String r1 = "GAME_NOT_FOUND"
            return r1
        Lf4:
            java.lang.String r1 = "APP_MISCONFIGURED"
            return r1
        Lf7:
            java.lang.String r1 = "LICENSE_CHECK_FAILED"
            return r1
        Lfa:
            java.lang.String r1 = "NETWORK_ERROR_OPERATION_FAILED"
            return r1
        Lfd:
            java.lang.String r1 = "NETWORK_ERROR_OPERATION_DEFERRED"
            return r1
        L100:
            java.lang.String r1 = "NETWORK_ERROR_NO_DATA"
            return r1
        L103:
            java.lang.String r1 = "NETWORK_ERROR_STALE_DATA"
            return r1
        L106:
            java.lang.String r1 = "CLIENT_RECONNECT_REQUIRED"
            return r1
        L109:
            java.lang.String r1 = "PLAYER_LEVEL_UP"
            return r1
        L10c:
            java.lang.String r1 = "PLAYER_OOB_REQUIRED"
            return r1
    }

    public static com.google.android.gms.common.api.Status zza(int r2) {
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r0 = 4
            java.lang.String r1 = getStatusCodeString(r0)
            r2.<init>(r0, r1)
            return r2
    }

    public static com.google.android.gms.common.api.Status zzb(int r2, android.app.PendingIntent r3) {
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r1 = getStatusCodeString(r2)
            r0.<init>(r2, r1, r3)
            return r0
    }
}
