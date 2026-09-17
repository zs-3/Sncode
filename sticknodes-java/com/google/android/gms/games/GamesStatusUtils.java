package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public final class GamesStatusUtils {
    private GamesStatusUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void zza(com.google.android.gms.tasks.TaskCompletionSource r4, int r5) {
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.games.GamesStatusCodes.zza(r5)
            int r0 = r5.getStatusCode()
            r1 = 1
            if (r0 == r1) goto L15e
            r1 = 2
            if (r0 == r1) goto L15b
            r1 = 3
            if (r0 == r1) goto L158
            r1 = 4
            if (r0 == r1) goto L155
            r1 = 5
            if (r0 == r1) goto L152
            r1 = 6
            if (r0 == r1) goto L14f
            r1 = 7
            if (r0 == r1) goto L14c
            r1 = 1500(0x5dc, float:2.102E-42)
            if (r0 == r1) goto L149
            r1 = 1501(0x5dd, float:2.103E-42)
            if (r0 == r1) goto L146
            switch(r0) {
                case 7: goto L14c;
                case 8: goto L143;
                case 9: goto L140;
                case 500: goto L13d;
                case 9000: goto L13a;
                case 9001: goto L137;
                case 9002: goto L134;
                case 9003: goto L131;
                case 9004: goto L12e;
                case 9006: goto L12b;
                case 9009: goto L128;
                case 9010: goto L125;
                case 9011: goto L122;
                case 9012: goto L11f;
                case 9016: goto L11c;
                case 9017: goto L119;
                case 9018: goto L116;
                case 9200: goto L113;
                case 9202: goto L10f;
                case 10000: goto L10b;
                case 10001: goto L107;
                case 10002: goto L103;
                case 10003: goto Lff;
                case 10004: goto Lfb;
                default: goto L28;
            }
        L28:
            switch(r0) {
                case 1000: goto Lf7;
                case 1001: goto Lf3;
                case 1002: goto Lef;
                case 1003: goto Leb;
                case 1004: goto Le7;
                case 1005: goto Le3;
                case 1006: goto Ldf;
                default: goto L2b;
            }
        L2b:
            switch(r0) {
                case 2000: goto Ldb;
                case 2001: goto Ld7;
                case 2002: goto Ld3;
                default: goto L2e;
            }
        L2e:
            switch(r0) {
                case 3000: goto Lcf;
                case 3001: goto Lcb;
                case 3002: goto Lc7;
                case 3003: goto Lc3;
                default: goto L31;
            }
        L31:
            switch(r0) {
                case 4000: goto Lbf;
                case 4001: goto Lbb;
                case 4002: goto Lb7;
                case 4003: goto Lb3;
                case 4004: goto Laf;
                case 4005: goto Lab;
                case 4006: goto La7;
                default: goto L34;
            }
        L34:
            switch(r0) {
                case 6000: goto La3;
                case 6001: goto L9f;
                case 6002: goto L9b;
                case 6003: goto L97;
                case 6004: goto L93;
                default: goto L37;
            }
        L37:
            switch(r0) {
                case 6500: goto L8f;
                case 6501: goto L8b;
                case 6502: goto L87;
                case 6503: goto L83;
                case 6504: goto L7f;
                case 6505: goto L7b;
                case 6506: goto L77;
                case 6507: goto L73;
                default: goto L3a;
            }
        L3a:
            switch(r0) {
                case 7000: goto L6f;
                case 7001: goto L6b;
                case 7002: goto L67;
                case 7003: goto L63;
                case 7004: goto L5f;
                case 7005: goto L5b;
                case 7006: goto L57;
                case 7007: goto L53;
                default: goto L3d;
            }
        L3d:
            switch(r0) {
                case 8000: goto L4f;
                case 8001: goto L4b;
                case 8002: goto L47;
                case 8003: goto L43;
                default: goto L40;
            }
        L40:
            r1 = r0
            goto L160
        L43:
            r1 = 26613(0x67f5, float:3.7293E-41)
            goto L160
        L47:
            r1 = 26612(0x67f4, float:3.7291E-41)
            goto L160
        L4b:
            r1 = 26611(0x67f3, float:3.729E-41)
            goto L160
        L4f:
            r1 = 26610(0x67f2, float:3.7289E-41)
            goto L160
        L53:
            r1 = 26607(0x67ef, float:3.7284E-41)
            goto L160
        L57:
            r1 = 26606(0x67ee, float:3.7283E-41)
            goto L160
        L5b:
            r1 = 26605(0x67ed, float:3.7282E-41)
            goto L160
        L5f:
            r1 = 26604(0x67ec, float:3.728E-41)
            goto L160
        L63:
            r1 = 26603(0x67eb, float:3.7279E-41)
            goto L160
        L67:
            r1 = 26602(0x67ea, float:3.7277E-41)
            goto L160
        L6b:
            r1 = 26601(0x67e9, float:3.7276E-41)
            goto L160
        L6f:
            r1 = 26600(0x67e8, float:3.7275E-41)
            goto L160
        L73:
            r1 = 26597(0x67e5, float:3.727E-41)
            goto L160
        L77:
            r1 = 26596(0x67e4, float:3.7269E-41)
            goto L160
        L7b:
            r1 = 26595(0x67e3, float:3.7268E-41)
            goto L160
        L7f:
            r1 = 26594(0x67e2, float:3.7266E-41)
            goto L160
        L83:
            r1 = 26593(0x67e1, float:3.7265E-41)
            goto L160
        L87:
            r1 = 26592(0x67e0, float:3.7263E-41)
            goto L160
        L8b:
            r1 = 26591(0x67df, float:3.7262E-41)
            goto L160
        L8f:
            r1 = 26590(0x67de, float:3.726E-41)
            goto L160
        L93:
            r1 = 26584(0x67d8, float:3.7252E-41)
            goto L160
        L97:
            r1 = 26583(0x67d7, float:3.7251E-41)
            goto L160
        L9b:
            r1 = 26582(0x67d6, float:3.725E-41)
            goto L160
        L9f:
            r1 = 26581(0x67d5, float:3.7248E-41)
            goto L160
        La3:
            r1 = 26580(0x67d4, float:3.7247E-41)
            goto L160
        La7:
            r1 = 26576(0x67d0, float:3.7241E-41)
            goto L160
        Lab:
            r1 = 26575(0x67cf, float:3.724E-41)
            goto L160
        Laf:
            r1 = 26574(0x67ce, float:3.7238E-41)
            goto L160
        Lb3:
            r1 = 26573(0x67cd, float:3.7237E-41)
            goto L160
        Lb7:
            r1 = 26572(0x67cc, float:3.7235E-41)
            goto L160
        Lbb:
            r1 = 26571(0x67cb, float:3.7234E-41)
            goto L160
        Lbf:
            r1 = 26570(0x67ca, float:3.7233E-41)
            goto L160
        Lc3:
            r1 = 26563(0x67c3, float:3.7223E-41)
            goto L160
        Lc7:
            r1 = 26562(0x67c2, float:3.7221E-41)
            goto L160
        Lcb:
            r1 = 26561(0x67c1, float:3.722E-41)
            goto L160
        Lcf:
            r1 = 26560(0x67c0, float:3.7218E-41)
            goto L160
        Ld3:
            r1 = 26552(0x67b8, float:3.7207E-41)
            goto L160
        Ld7:
            r1 = 26551(0x67b7, float:3.7206E-41)
            goto L160
        Ldb:
            r1 = 26550(0x67b6, float:3.7204E-41)
            goto L160
        Ldf:
            r1 = 26536(0x67a8, float:3.7185E-41)
            goto L160
        Le3:
            r1 = 26535(0x67a7, float:3.7183E-41)
            goto L160
        Le7:
            r1 = 26534(0x67a6, float:3.7182E-41)
            goto L160
        Leb:
            r1 = 26533(0x67a5, float:3.718E-41)
            goto L160
        Lef:
            r1 = 26532(0x67a4, float:3.7179E-41)
            goto L160
        Lf3:
            r1 = 26531(0x67a3, float:3.7178E-41)
            goto L160
        Lf7:
            r1 = 26530(0x67a2, float:3.7176E-41)
            goto L160
        Lfb:
            r1 = 26704(0x6850, float:3.742E-41)
            goto L160
        Lff:
            r1 = 26703(0x684f, float:3.7419E-41)
            goto L160
        L103:
            r1 = 26702(0x684e, float:3.7417E-41)
            goto L160
        L107:
            r1 = 26701(0x684d, float:3.7416E-41)
            goto L160
        L10b:
            r1 = 26700(0x684c, float:3.7415E-41)
            goto L160
        L10f:
            r1 = 26652(0x681c, float:3.7347E-41)
            goto L160
        L113:
            r1 = 26650(0x681a, float:3.7345E-41)
            goto L160
        L116:
            r1 = 26632(0x6808, float:3.732E-41)
            goto L160
        L119:
            r1 = 26631(0x6807, float:3.7318E-41)
            goto L160
        L11c:
            r1 = 26630(0x6806, float:3.7317E-41)
            goto L160
        L11f:
            r1 = 26629(0x6805, float:3.7315E-41)
            goto L160
        L122:
            r1 = 26628(0x6804, float:3.7314E-41)
            goto L160
        L125:
            r1 = 26627(0x6803, float:3.7312E-41)
            goto L160
        L128:
            r1 = 26626(0x6802, float:3.7311E-41)
            goto L160
        L12b:
            r1 = 26625(0x6801, float:3.731E-41)
            goto L160
        L12e:
            r1 = 26624(0x6800, float:3.7308E-41)
            goto L160
        L131:
            r1 = 26623(0x67ff, float:3.7307E-41)
            goto L160
        L134:
            r1 = 26622(0x67fe, float:3.7305E-41)
            goto L160
        L137:
            r1 = 26621(0x67fd, float:3.7304E-41)
            goto L160
        L13a:
            r1 = 26620(0x67fc, float:3.7303E-41)
            goto L160
        L13d:
            r1 = 26520(0x6798, float:3.7162E-41)
            goto L160
        L140:
            r1 = 26509(0x678d, float:3.7147E-41)
            goto L160
        L143:
            r1 = 26508(0x678c, float:3.7146E-41)
            goto L160
        L146:
            r1 = 26541(0x67ad, float:3.7192E-41)
            goto L160
        L149:
            r1 = 26540(0x67ac, float:3.719E-41)
            goto L160
        L14c:
            r1 = 26507(0x678b, float:3.7144E-41)
            goto L160
        L14f:
            r1 = 26506(0x678a, float:3.7143E-41)
            goto L160
        L152:
            r1 = 26505(0x6789, float:3.7141E-41)
            goto L160
        L155:
            r1 = 26504(0x6788, float:3.714E-41)
            goto L160
        L158:
            r1 = 26503(0x6787, float:3.7139E-41)
            goto L160
        L15b:
            r1 = 26502(0x6786, float:3.7137E-41)
            goto L160
        L15e:
            r1 = 8
        L160:
            int r2 = r5.getStatusCode()
            if (r1 != r2) goto L167
            goto L193
        L167:
            int r2 = r5.getStatusCode()
            java.lang.String r2 = com.google.android.gms.games.GamesStatusCodes.getStatusString(r2)
            java.lang.String r3 = r5.getStatusMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L182
            android.app.PendingIntent r5 = r5.getResolution()
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.games.GamesClientStatusCodes.zzb(r1, r5)
            goto L193
        L182:
            switch(r0) {
                case 2: goto L193;
                case 3: goto L193;
                case 4: goto L193;
                case 5: goto L193;
                case 6: goto L193;
                case 7: goto L193;
                case 8: goto L193;
                case 9: goto L185;
                case 10: goto L193;
                default: goto L185;
            }
        L185:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r2 = r5.getStatusMessage()
            android.app.PendingIntent r5 = r5.getResolution()
            r0.<init>(r1, r2, r5)
            r5 = r0
        L193:
            com.google.android.gms.common.api.ApiException r5 = com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(r5)
            r4.setException(r5)
            return
    }

    public static void zzb(com.google.android.gms.tasks.TaskCompletionSource r1, java.lang.SecurityException r2) {
            if (r1 == 0) goto Lf
            com.google.android.gms.common.api.ApiException r2 = new com.google.android.gms.common.api.ApiException
            r0 = 4
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.games.GamesClientStatusCodes.zza(r0)
            r2.<init>(r0)
            r1.trySetException(r2)
        Lf:
            return
    }
}
