package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaas extends com.google.android.gms.internal.ads.zzte implements com.google.android.gms.internal.ads.zzaay {
    private static final int[] zzb = null;
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private int zzB;
    private long zzC;
    private com.google.android.gms.internal.ads.zzcp zzD;
    private com.google.android.gms.internal.ads.zzcp zzE;
    private int zzF;
    private int zzG;
    private com.google.android.gms.internal.ads.zzaaw zzH;
    private long zzI;
    private long zzJ;
    private boolean zzK;
    private final android.content.Context zze;
    private final boolean zzf;
    private final com.google.android.gms.internal.ads.zzabp zzg;
    private final boolean zzh;
    private final com.google.android.gms.internal.ads.zzaaz zzi;
    private final com.google.android.gms.internal.ads.zzaax zzj;
    private com.google.android.gms.internal.ads.zzaar zzk;
    private boolean zzl;
    private boolean zzm;
    private com.google.android.gms.internal.ads.zzabv zzn;
    private boolean zzo;
    private java.util.List zzp;
    private android.view.Surface zzq;
    private com.google.android.gms.internal.ads.zzaav zzr;
    private com.google.android.gms.internal.ads.zzel zzs;
    private boolean zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
            r0 = 9
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1920, 1600, 1440, 1280, 960, 854, 640, 540, 480} // fill-array
            com.google.android.gms.internal.ads.zzaas.zzb = r0
            return
    }

    public zzaas(android.content.Context r8, com.google.android.gms.internal.ads.zzsr r9, com.google.android.gms.internal.ads.zztg r10, long r11, boolean r13, android.os.Handler r14, com.google.android.gms.internal.ads.zzabq r15, int r16, float r17) {
            r7 = this;
            r6 = r7
            r1 = 2
            r4 = 0
            r5 = 1106247680(0x41f00000, float:30.0)
            r0 = r7
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            android.content.Context r0 = r8.getApplicationContext()
            r6.zze = r0
            r1 = 0
            r6.zzn = r1
            com.google.android.gms.internal.ads.zzabp r2 = new com.google.android.gms.internal.ads.zzabp
            r3 = r14
            r4 = r15
            r2.<init>(r14, r15)
            r6.zzg = r2
            r2 = 1
            r6.zzf = r2
            com.google.android.gms.internal.ads.zzaaz r3 = new com.google.android.gms.internal.ads.zzaaz
            r4 = 0
            r3.<init>(r0, r7, r4)
            r6.zzi = r3
            com.google.android.gms.internal.ads.zzaax r0 = new com.google.android.gms.internal.ads.zzaax
            r0.<init>()
            r6.zzj = r0
            java.lang.String r0 = com.google.android.gms.internal.ads.zzeu.zzc
            java.lang.String r3 = "NVIDIA"
            boolean r0 = r3.equals(r0)
            r6.zzh = r0
            com.google.android.gms.internal.ads.zzel r0 = com.google.android.gms.internal.ads.zzel.zza
            r6.zzs = r0
            r6.zzu = r2
            r0 = 0
            r6.zzv = r0
            com.google.android.gms.internal.ads.zzcp r2 = com.google.android.gms.internal.ads.zzcp.zza
            r6.zzD = r2
            r6.zzG = r0
            r6.zzE = r1
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            r6.zzF = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.zzI = r0
            r6.zzJ = r0
            return
    }

    protected static final boolean zzaU(java.lang.String r17) {
            java.lang.String r0 = "OMX.google"
            r1 = r17
            boolean r0 = r1.startsWith(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            java.lang.Class<com.google.android.gms.internal.ads.zzaas> r2 = com.google.android.gms.internal.ads.zzaas.class
            monitor-enter(r2)
            boolean r0 = com.google.android.gms.internal.ads.zzaas.zzc     // Catch: java.lang.Throwable -> L7aa
            if (r0 != 0) goto L7a6
            int r0 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> L7aa
            r3 = 28
            r4 = 5
            r5 = 6
            r6 = 4
            r7 = 7
            r8 = 2
            r9 = 3
            r10 = -1
            r11 = 1
            if (r0 > r3) goto L83
            java.lang.String r12 = com.google.android.gms.internal.ads.zzeu.zzb     // Catch: java.lang.Throwable -> L7aa
            int r13 = r12.hashCode()     // Catch: java.lang.Throwable -> L7aa
            switch(r13) {
                case -1339091551: goto L71;
                case -1220081023: goto L67;
                case -1220066608: goto L5d;
                case -1012436106: goto L53;
                case -760312546: goto L49;
                case -64886864: goto L3f;
                case 3415681: goto L35;
                case 825323514: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L7b
        L2b:
            java.lang.String r13 = "machuca"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L7b
            r12 = 5
            goto L7c
        L35:
            java.lang.String r13 = "once"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L7b
            r12 = 6
            goto L7c
        L3f:
            java.lang.String r13 = "magnolia"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L7b
            r12 = 4
            goto L7c
        L49:
            java.lang.String r13 = "aquaman"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L7b
            r12 = 0
            goto L7c
        L53:
            java.lang.String r13 = "oneday"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L7b
            r12 = 7
            goto L7c
        L5d:
            java.lang.String r13 = "dangalUHD"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L7b
            r12 = 2
            goto L7c
        L67:
            java.lang.String r13 = "dangalFHD"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L7b
            r12 = 3
            goto L7c
        L71:
            java.lang.String r13 = "dangal"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L7b
            r12 = 1
            goto L7c
        L7b:
            r12 = -1
        L7c:
            switch(r12) {
                case 0: goto L80;
                case 1: goto L80;
                case 2: goto L80;
                case 3: goto L80;
                case 4: goto L80;
                case 5: goto L80;
                case 6: goto L80;
                case 7: goto L80;
                default: goto L7f;
            }
        L7f:
            goto L83
        L80:
            r1 = 1
            goto L7a2
        L83:
            r12 = 27
            if (r0 > r12) goto L92
            java.lang.String r13 = "HWEML"
            java.lang.String r14 = com.google.android.gms.internal.ads.zzeu.zzb     // Catch: java.lang.Throwable -> L7aa
            boolean r13 = r13.equals(r14)     // Catch: java.lang.Throwable -> L7aa
            if (r13 == 0) goto L92
            goto L80
        L92:
            java.lang.String r13 = com.google.android.gms.internal.ads.zzeu.zzd     // Catch: java.lang.Throwable -> L7aa
            int r14 = r13.hashCode()     // Catch: java.lang.Throwable -> L7aa
            r15 = 8
            switch(r14) {
                case -349662828: goto Lef;
                case -321033677: goto Le5;
                case 2006354: goto Ldb;
                case 2006367: goto Ld1;
                case 2006371: goto Lc7;
                case 1785421873: goto Lbd;
                case 1785421876: goto Lb3;
                case 1798172390: goto La8;
                case 2119412532: goto L9e;
                default: goto L9d;
            }
        L9d:
            goto Lf9
        L9e:
            java.lang.String r14 = "AFTEUFF014"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto Lf9
            r14 = 5
            goto Lfa
        La8:
            java.lang.String r14 = "AFTSO001"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto Lf9
            r14 = 8
            goto Lfa
        Lb3:
            java.lang.String r14 = "AFTEU014"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto Lf9
            r14 = 4
            goto Lfa
        Lbd:
            java.lang.String r14 = "AFTEU011"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto Lf9
            r14 = 3
            goto Lfa
        Lc7:
            java.lang.String r14 = "AFTR"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto Lf9
            r14 = 2
            goto Lfa
        Ld1:
            java.lang.String r14 = "AFTN"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto Lf9
            r14 = 1
            goto Lfa
        Ldb:
            java.lang.String r14 = "AFTA"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto Lf9
            r14 = 0
            goto Lfa
        Le5:
            java.lang.String r14 = "AFTKMST12"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto Lf9
            r14 = 7
            goto Lfa
        Lef:
            java.lang.String r14 = "AFTJMST12"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto Lf9
            r14 = 6
            goto Lfa
        Lf9:
            r14 = -1
        Lfa:
            switch(r14) {
                case 0: goto L80;
                case 1: goto L80;
                case 2: goto L80;
                case 3: goto L80;
                case 4: goto L80;
                case 5: goto L80;
                case 6: goto L80;
                case 7: goto L80;
                case 8: goto L80;
                default: goto Lfd;
            }
        Lfd:
            r14 = 26
            if (r0 > r14) goto L7a2
            java.lang.String r0 = com.google.android.gms.internal.ads.zzeu.zzb     // Catch: java.lang.Throwable -> L7aa
            int r16 = r0.hashCode()     // Catch: java.lang.Throwable -> L7aa
            switch(r16) {
                case -2144781245: goto L77e;
                case -2144781185: goto L773;
                case -2144781160: goto L768;
                case -2097309513: goto L75d;
                case -2022874474: goto L752;
                case -1978993182: goto L747;
                case -1978990237: goto L73c;
                case -1936688988: goto L731;
                case -1936688066: goto L726;
                case -1936688065: goto L71a;
                case -1931988508: goto L70e;
                case -1885099851: goto L702;
                case -1696512866: goto L6f6;
                case -1680025915: goto L6ea;
                case -1615810839: goto L6de;
                case -1600724499: goto L6d2;
                case -1554255044: goto L6c6;
                case -1481772737: goto L6ba;
                case -1481772730: goto L6ae;
                case -1481772729: goto L6a2;
                case -1320080169: goto L696;
                case -1217592143: goto L68a;
                case -1180384755: goto L67e;
                case -1139198265: goto L672;
                case -1052835013: goto L666;
                case -993250464: goto L65b;
                case -993250458: goto L650;
                case -965403638: goto L644;
                case -958336948: goto L638;
                case -879245230: goto L62c;
                case -842500323: goto L620;
                case -821392978: goto L614;
                case -797483286: goto L608;
                case -794946968: goto L5fc;
                case -788334647: goto L5f0;
                case -782144577: goto L5e4;
                case -575125681: goto L5d8;
                case -521118391: goto L5cc;
                case -430914369: goto L5c0;
                case -290434366: goto L5b4;
                case -282781963: goto L5a8;
                case -277133239: goto L59c;
                case -173639913: goto L590;
                case -56598463: goto L584;
                case 2126: goto L578;
                case 2564: goto L56c;
                case 2715: goto L560;
                case 2719: goto L554;
                case 3091: goto L548;
                case 3483: goto L53c;
                case 73405: goto L530;
                case 75537: goto L524;
                case 75739: goto L518;
                case 76779: goto L50c;
                case 78669: goto L500;
                case 79305: goto L4f4;
                case 80618: goto L4e8;
                case 88274: goto L4dc;
                case 98846: goto L4d0;
                case 98848: goto L4c4;
                case 99329: goto L4ba;
                case 101481: goto L4ae;
                case 1513190: goto L4a3;
                case 1514184: goto L498;
                case 1514185: goto L48d;
                case 2133089: goto L481;
                case 2133091: goto L475;
                case 2133120: goto L469;
                case 2133151: goto L45d;
                case 2133182: goto L451;
                case 2133184: goto L445;
                case 2436959: goto L439;
                case 2463773: goto L42d;
                case 2464648: goto L421;
                case 2689555: goto L415;
                case 3154429: goto L409;
                case 3284551: goto L3fd;
                case 3351335: goto L3f1;
                case 3386211: goto L3e5;
                case 41325051: goto L3d9;
                case 51349633: goto L3ce;
                case 51350594: goto L3c3;
                case 55178625: goto L3b7;
                case 61542055: goto L3ac;
                case 65355429: goto L3a0;
                case 66214468: goto L394;
                case 66214470: goto L388;
                case 66214473: goto L37c;
                case 66215429: goto L370;
                case 66215431: goto L364;
                case 66215433: goto L358;
                case 66216390: goto L34c;
                case 76402249: goto L340;
                case 76404105: goto L334;
                case 76404911: goto L328;
                case 80963634: goto L31c;
                case 82882791: goto L310;
                case 98715550: goto L304;
                case 101370885: goto L2f8;
                case 102844228: goto L2ec;
                case 165221241: goto L2e0;
                case 182191441: goto L2d4;
                case 245388979: goto L2c8;
                case 287431619: goto L2bc;
                case 307593612: goto L2b0;
                case 308517133: goto L2a4;
                case 316215098: goto L298;
                case 316215116: goto L28c;
                case 316246811: goto L280;
                case 316246818: goto L274;
                case 407160593: goto L268;
                case 507412548: goto L25c;
                case 793982701: goto L250;
                case 794038622: goto L244;
                case 794040393: goto L238;
                case 835649806: goto L22c;
                case 917340916: goto L220;
                case 958008161: goto L214;
                case 1060579533: goto L208;
                case 1150207623: goto L1fc;
                case 1176899427: goto L1f0;
                case 1280332038: goto L1e4;
                case 1306947716: goto L1d8;
                case 1349174697: goto L1cc;
                case 1522194893: goto L1c0;
                case 1691543273: goto L1b4;
                case 1691544261: goto L1a8;
                case 1709443163: goto L19c;
                case 1865889110: goto L190;
                case 1906253259: goto L184;
                case 1977196784: goto L178;
                case 2006372676: goto L16c;
                case 2019281702: goto L160;
                case 2029784656: goto L154;
                case 2030379515: goto L148;
                case 2033393791: goto L13c;
                case 2047190025: goto L130;
                case 2047252157: goto L124;
                case 2048319463: goto L118;
                case 2048855701: goto L10c;
                default: goto L10a;
            }
        L10a:
            goto L789
        L10c:
            java.lang.String r3 = "HWWAS-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 66
            goto L78a
        L118:
            java.lang.String r3 = "HWVNS-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 65
            goto L78a
        L124:
            java.lang.String r3 = "ELUGA_Prim"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 33
            goto L78a
        L130:
            java.lang.String r3 = "ELUGA_Note"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 32
            goto L78a
        L13c:
            java.lang.String r3 = "ASUS_X00AD_2"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 14
            goto L78a
        L148:
            java.lang.String r3 = "HWCAM-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 64
            goto L78a
        L154:
            java.lang.String r3 = "HWBLN-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 63
            goto L78a
        L160:
            java.lang.String r3 = "DM-01K"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 29
            goto L78a
        L16c:
            java.lang.String r3 = "BRAVIA_ATV3_4K"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 19
            goto L78a
        L178:
            java.lang.String r3 = "Infinix-X572"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 69
            goto L78a
        L184:
            java.lang.String r3 = "PB2-670M"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 100
            goto L78a
        L190:
            java.lang.String r3 = "santoni"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 117(0x75, float:1.64E-43)
            goto L78a
        L19c:
            java.lang.String r3 = "iball8735_9806"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 68
            goto L78a
        L1a8:
            java.lang.String r3 = "CPH1715"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 24
            goto L78a
        L1b4:
            java.lang.String r3 = "CPH1609"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 23
            goto L78a
        L1c0:
            java.lang.String r3 = "woods_f"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 133(0x85, float:1.86E-43)
            goto L78a
        L1cc:
            java.lang.String r3 = "htc_e56ml_dtul"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 61
            goto L78a
        L1d8:
            java.lang.String r3 = "EverStar_S"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 35
            goto L78a
        L1e4:
            java.lang.String r3 = "hwALE-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 62
            goto L78a
        L1f0:
            java.lang.String r3 = "itel_S41"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 71
            goto L78a
        L1fc:
            java.lang.String r3 = "LS-5017"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 78
            goto L78a
        L208:
            java.lang.String r3 = "panell_d"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 96
            goto L78a
        L214:
            java.lang.String r3 = "j2xlteins"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 72
            goto L78a
        L220:
            java.lang.String r3 = "A7000plus"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 10
            goto L78a
        L22c:
            java.lang.String r3 = "manning"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 81
            goto L78a
        L238:
            java.lang.String r3 = "GIONEE_WBL7519"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 59
            goto L78a
        L244:
            java.lang.String r3 = "GIONEE_WBL7365"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 58
            goto L78a
        L250:
            java.lang.String r3 = "GIONEE_WBL5708"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 57
            goto L78a
        L25c:
            java.lang.String r3 = "QM16XE_U"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 114(0x72, float:1.6E-43)
            goto L78a
        L268:
            java.lang.String r3 = "Pixi5-10_4G"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 106(0x6a, float:1.49E-43)
            goto L78a
        L274:
            java.lang.String r3 = "TB3-850M"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 125(0x7d, float:1.75E-43)
            goto L78a
        L280:
            java.lang.String r3 = "TB3-850F"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 124(0x7c, float:1.74E-43)
            goto L78a
        L28c:
            java.lang.String r3 = "TB3-730X"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 123(0x7b, float:1.72E-43)
            goto L78a
        L298:
            java.lang.String r3 = "TB3-730F"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 122(0x7a, float:1.71E-43)
            goto L78a
        L2a4:
            java.lang.String r3 = "A7020a48"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 12
            goto L78a
        L2b0:
            java.lang.String r3 = "A7010a48"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 11
            goto L78a
        L2bc:
            java.lang.String r3 = "griffin"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 60
            goto L78a
        L2c8:
            java.lang.String r3 = "marino_f"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 82
            goto L78a
        L2d4:
            java.lang.String r3 = "CPY83_I00"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 25
            goto L78a
        L2e0:
            java.lang.String r3 = "A2016a40"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 8
            goto L78a
        L2ec:
            java.lang.String r3 = "le_x6"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 77
            goto L78a
        L2f8:
            java.lang.String r3 = "l5460"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 76
            goto L78a
        L304:
            java.lang.String r3 = "i9031"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 67
            goto L78a
        L310:
            java.lang.String r3 = "X3_HK"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 135(0x87, float:1.89E-43)
            goto L78a
        L31c:
            java.lang.String r3 = "V23GB"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 128(0x80, float:1.794E-43)
            goto L78a
        L328:
            java.lang.String r3 = "Q4310"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 112(0x70, float:1.57E-43)
            goto L78a
        L334:
            java.lang.String r3 = "Q4260"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 110(0x6e, float:1.54E-43)
            goto L78a
        L340:
            java.lang.String r3 = "PRO7S"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 108(0x6c, float:1.51E-43)
            goto L78a
        L34c:
            java.lang.String r3 = "F3311"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 48
            goto L78a
        L358:
            java.lang.String r3 = "F3215"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 47
            goto L78a
        L364:
            java.lang.String r3 = "F3213"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 46
            goto L78a
        L370:
            java.lang.String r3 = "F3211"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 45
            goto L78a
        L37c:
            java.lang.String r3 = "F3116"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 44
            goto L78a
        L388:
            java.lang.String r3 = "F3113"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 43
            goto L78a
        L394:
            java.lang.String r3 = "F3111"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 42
            goto L78a
        L3a0:
            java.lang.String r3 = "E5643"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 30
            goto L78a
        L3ac:
            java.lang.String r3 = "A1601"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 7
            goto L78a
        L3b7:
            java.lang.String r3 = "Aura_Note_2"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 15
            goto L78a
        L3c3:
            java.lang.String r3 = "602LV"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 4
            goto L78a
        L3ce:
            java.lang.String r3 = "601LV"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 3
            goto L78a
        L3d9:
            java.lang.String r3 = "MEIZU_M5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 83
            goto L78a
        L3e5:
            java.lang.String r3 = "p212"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 92
            goto L78a
        L3f1:
            java.lang.String r3 = "mido"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 85
            goto L78a
        L3fd:
            java.lang.String r3 = "kate"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 75
            goto L78a
        L409:
            java.lang.String r3 = "fugu"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 50
            goto L78a
        L415:
            java.lang.String r3 = "XE2X"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 136(0x88, float:1.9E-43)
            goto L78a
        L421:
            java.lang.String r3 = "Q427"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 111(0x6f, float:1.56E-43)
            goto L78a
        L42d:
            java.lang.String r3 = "Q350"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 109(0x6d, float:1.53E-43)
            goto L78a
        L439:
            java.lang.String r3 = "P681"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 93
            goto L78a
        L445:
            java.lang.String r3 = "F04J"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 41
            goto L78a
        L451:
            java.lang.String r3 = "F04H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 40
            goto L78a
        L45d:
            java.lang.String r3 = "F03H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 39
            goto L78a
        L469:
            java.lang.String r3 = "F02H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 38
            goto L78a
        L475:
            java.lang.String r3 = "F01J"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 37
            goto L78a
        L481:
            java.lang.String r3 = "F01H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 36
            goto L78a
        L48d:
            java.lang.String r3 = "1714"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 2
            goto L78a
        L498:
            java.lang.String r3 = "1713"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 1
            goto L78a
        L4a3:
            java.lang.String r3 = "1601"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 0
            goto L78a
        L4ae:
            java.lang.String r3 = "flo"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 49
            goto L78a
        L4ba:
            java.lang.String r4 = "deb"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L789
            goto L78a
        L4c4:
            java.lang.String r3 = "cv3"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 27
            goto L78a
        L4d0:
            java.lang.String r3 = "cv1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 26
            goto L78a
        L4dc:
            java.lang.String r3 = "Z80"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 139(0x8b, float:1.95E-43)
            goto L78a
        L4e8:
            java.lang.String r3 = "QX1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 115(0x73, float:1.61E-43)
            goto L78a
        L4f4:
            java.lang.String r3 = "PLE"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 107(0x6b, float:1.5E-43)
            goto L78a
        L500:
            java.lang.String r3 = "P85"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 94
            goto L78a
        L50c:
            java.lang.String r3 = "MX6"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 86
            goto L78a
        L518:
            java.lang.String r3 = "M5c"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 80
            goto L78a
        L524:
            java.lang.String r3 = "M04"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 79
            goto L78a
        L530:
            java.lang.String r3 = "JGZ"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 73
            goto L78a
        L53c:
            java.lang.String r3 = "mh"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 84
            goto L78a
        L548:
            java.lang.String r3 = "b5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 16
            goto L78a
        L554:
            java.lang.String r3 = "V5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 129(0x81, float:1.81E-43)
            goto L78a
        L560:
            java.lang.String r3 = "V1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 127(0x7f, float:1.78E-43)
            goto L78a
        L56c:
            java.lang.String r3 = "Q5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 113(0x71, float:1.58E-43)
            goto L78a
        L578:
            java.lang.String r3 = "C1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 20
            goto L78a
        L584:
            java.lang.String r3 = "woods_fn"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 134(0x86, float:1.88E-43)
            goto L78a
        L590:
            java.lang.String r3 = "ELUGA_A3_Pro"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 31
            goto L78a
        L59c:
            java.lang.String r3 = "Z12_PRO"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 138(0x8a, float:1.93E-43)
            goto L78a
        L5a8:
            java.lang.String r3 = "BLACK-1X"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 17
            goto L78a
        L5b4:
            java.lang.String r3 = "taido_row"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 121(0x79, float:1.7E-43)
            goto L78a
        L5c0:
            java.lang.String r3 = "Pixi4-7_3G"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 105(0x69, float:1.47E-43)
            goto L78a
        L5cc:
            java.lang.String r3 = "GIONEE_GBL7360"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 53
            goto L78a
        L5d8:
            java.lang.String r3 = "GiONEE_CBL7513"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 51
            goto L78a
        L5e4:
            java.lang.String r3 = "OnePlus5T"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 91
            goto L78a
        L5f0:
            java.lang.String r3 = "whyred"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 132(0x84, float:1.85E-43)
            goto L78a
        L5fc:
            java.lang.String r3 = "watson"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 131(0x83, float:1.84E-43)
            goto L78a
        L608:
            java.lang.String r3 = "SVP-DTV15"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 119(0x77, float:1.67E-43)
            goto L78a
        L614:
            java.lang.String r3 = "A7000-a"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 9
            goto L78a
        L620:
            java.lang.String r3 = "nicklaus_f"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 88
            goto L78a
        L62c:
            java.lang.String r3 = "tcl_eu"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 126(0x7e, float:1.77E-43)
            goto L78a
        L638:
            java.lang.String r3 = "ELUGA_Ray_X"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 34
            goto L78a
        L644:
            java.lang.String r3 = "s905x018"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 120(0x78, float:1.68E-43)
            goto L78a
        L650:
            java.lang.String r3 = "A10-70L"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 6
            goto L78a
        L65b:
            java.lang.String r3 = "A10-70F"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 5
            goto L78a
        L666:
            java.lang.String r3 = "namath"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 87
            goto L78a
        L672:
            java.lang.String r3 = "Slate_Pro"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 118(0x76, float:1.65E-43)
            goto L78a
        L67e:
            java.lang.String r3 = "iris60"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 70
            goto L78a
        L68a:
            java.lang.String r3 = "BRAVIA_ATV2"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 18
            goto L78a
        L696:
            java.lang.String r3 = "GiONEE_GBL7319"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 52
            goto L78a
        L6a2:
            java.lang.String r3 = "panell_dt"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 99
            goto L78a
        L6ae:
            java.lang.String r3 = "panell_ds"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 98
            goto L78a
        L6ba:
            java.lang.String r3 = "panell_dl"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 97
            goto L78a
        L6c6:
            java.lang.String r3 = "vernee_M5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 130(0x82, float:1.82E-43)
            goto L78a
        L6d2:
            java.lang.String r3 = "pacificrim"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 95
            goto L78a
        L6de:
            java.lang.String r3 = "Phantom6"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 104(0x68, float:1.46E-43)
            goto L78a
        L6ea:
            java.lang.String r3 = "ComioS1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 21
            goto L78a
        L6f6:
            java.lang.String r3 = "XT1663"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 137(0x89, float:1.92E-43)
            goto L78a
        L702:
            java.lang.String r3 = "RAIJIN"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 116(0x74, float:1.63E-43)
            goto L78a
        L70e:
            java.lang.String r3 = "AquaPowerM"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 13
            goto L78a
        L71a:
            java.lang.String r3 = "PGN611"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 103(0x67, float:1.44E-43)
            goto L78a
        L726:
            java.lang.String r3 = "PGN610"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 102(0x66, float:1.43E-43)
            goto L78a
        L731:
            java.lang.String r3 = "PGN528"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 101(0x65, float:1.42E-43)
            goto L78a
        L73c:
            java.lang.String r3 = "NX573J"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 90
            goto L78a
        L747:
            java.lang.String r3 = "NX541J"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 89
            goto L78a
        L752:
            java.lang.String r3 = "CP8676_I02"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 22
            goto L78a
        L75d:
            java.lang.String r3 = "K50a40"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 74
            goto L78a
        L768:
            java.lang.String r3 = "GIONEE_SWW1631"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 56
            goto L78a
        L773:
            java.lang.String r3 = "GIONEE_SWW1627"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 55
            goto L78a
        L77e:
            java.lang.String r3 = "GIONEE_SWW1609"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L789
            r3 = 54
            goto L78a
        L789:
            r3 = -1
        L78a:
            switch(r3) {
                case 0: goto L80;
                case 1: goto L80;
                case 2: goto L80;
                case 3: goto L80;
                case 4: goto L80;
                case 5: goto L80;
                case 6: goto L80;
                case 7: goto L80;
                case 8: goto L80;
                case 9: goto L80;
                case 10: goto L80;
                case 11: goto L80;
                case 12: goto L80;
                case 13: goto L80;
                case 14: goto L80;
                case 15: goto L80;
                case 16: goto L80;
                case 17: goto L80;
                case 18: goto L80;
                case 19: goto L80;
                case 20: goto L80;
                case 21: goto L80;
                case 22: goto L80;
                case 23: goto L80;
                case 24: goto L80;
                case 25: goto L80;
                case 26: goto L80;
                case 27: goto L80;
                case 28: goto L80;
                case 29: goto L80;
                case 30: goto L80;
                case 31: goto L80;
                case 32: goto L80;
                case 33: goto L80;
                case 34: goto L80;
                case 35: goto L80;
                case 36: goto L80;
                case 37: goto L80;
                case 38: goto L80;
                case 39: goto L80;
                case 40: goto L80;
                case 41: goto L80;
                case 42: goto L80;
                case 43: goto L80;
                case 44: goto L80;
                case 45: goto L80;
                case 46: goto L80;
                case 47: goto L80;
                case 48: goto L80;
                case 49: goto L80;
                case 50: goto L80;
                case 51: goto L80;
                case 52: goto L80;
                case 53: goto L80;
                case 54: goto L80;
                case 55: goto L80;
                case 56: goto L80;
                case 57: goto L80;
                case 58: goto L80;
                case 59: goto L80;
                case 60: goto L80;
                case 61: goto L80;
                case 62: goto L80;
                case 63: goto L80;
                case 64: goto L80;
                case 65: goto L80;
                case 66: goto L80;
                case 67: goto L80;
                case 68: goto L80;
                case 69: goto L80;
                case 70: goto L80;
                case 71: goto L80;
                case 72: goto L80;
                case 73: goto L80;
                case 74: goto L80;
                case 75: goto L80;
                case 76: goto L80;
                case 77: goto L80;
                case 78: goto L80;
                case 79: goto L80;
                case 80: goto L80;
                case 81: goto L80;
                case 82: goto L80;
                case 83: goto L80;
                case 84: goto L80;
                case 85: goto L80;
                case 86: goto L80;
                case 87: goto L80;
                case 88: goto L80;
                case 89: goto L80;
                case 90: goto L80;
                case 91: goto L80;
                case 92: goto L80;
                case 93: goto L80;
                case 94: goto L80;
                case 95: goto L80;
                case 96: goto L80;
                case 97: goto L80;
                case 98: goto L80;
                case 99: goto L80;
                case 100: goto L80;
                case 101: goto L80;
                case 102: goto L80;
                case 103: goto L80;
                case 104: goto L80;
                case 105: goto L80;
                case 106: goto L80;
                case 107: goto L80;
                case 108: goto L80;
                case 109: goto L80;
                case 110: goto L80;
                case 111: goto L80;
                case 112: goto L80;
                case 113: goto L80;
                case 114: goto L80;
                case 115: goto L80;
                case 116: goto L80;
                case 117: goto L80;
                case 118: goto L80;
                case 119: goto L80;
                case 120: goto L80;
                case 121: goto L80;
                case 122: goto L80;
                case 123: goto L80;
                case 124: goto L80;
                case 125: goto L80;
                case 126: goto L80;
                case 127: goto L80;
                case 128: goto L80;
                case 129: goto L80;
                case 130: goto L80;
                case 131: goto L80;
                case 132: goto L80;
                case 133: goto L80;
                case 134: goto L80;
                case 135: goto L80;
                case 136: goto L80;
                case 137: goto L80;
                case 138: goto L80;
                case 139: goto L80;
                default: goto L78d;
            }
        L78d:
            int r0 = r13.hashCode()     // Catch: java.lang.Throwable -> L7aa
            r3 = -594534941(0xffffffffdc901de3, float:-3.2452206E17)
            if (r0 == r3) goto L797
            goto L7a0
        L797:
            java.lang.String r0 = "JSN-L21"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L7a0
            r10 = 0
        L7a0:
            if (r10 == 0) goto L80
        L7a2:
            com.google.android.gms.internal.ads.zzaas.zzd = r1     // Catch: java.lang.Throwable -> L7aa
            com.google.android.gms.internal.ads.zzaas.zzc = r11     // Catch: java.lang.Throwable -> L7aa
        L7a6:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7aa
            boolean r0 = com.google.android.gms.internal.ads.zzaas.zzd
            return r0
        L7aa:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7aa
            throw r0
    }

    protected static final boolean zzaV(com.google.android.gms.internal.ads.zzsw r2) {
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 35
            if (r0 < r1) goto Lc
            boolean r2 = r2.zzh
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    private final android.view.Surface zzaW(com.google.android.gms.internal.ads.zzsw r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzabv r0 = r2.zzn
            if (r0 == 0) goto L9
            android.view.Surface r3 = r0.zzd()
            return r3
        L9:
            android.view.Surface r0 = r2.zzq
            if (r0 == 0) goto Le
            return r0
        Le:
            boolean r0 = zzaV(r3)
            if (r0 == 0) goto L16
            r3 = 0
            return r3
        L16:
            boolean r0 = r2.zzbc(r3)
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            com.google.android.gms.internal.ads.zzaav r0 = r2.zzr
            if (r0 == 0) goto L2a
            boolean r1 = r3.zzf
            boolean r0 = r0.zza
            if (r0 == r1) goto L2a
            r2.zzba()
        L2a:
            com.google.android.gms.internal.ads.zzaav r0 = r2.zzr
            if (r0 != 0) goto L38
            android.content.Context r0 = r2.zze
            boolean r3 = r3.zzf
            com.google.android.gms.internal.ads.zzaav r3 = com.google.android.gms.internal.ads.zzaav.zza(r0, r3)
            r2.zzr = r3
        L38:
            com.google.android.gms.internal.ads.zzaav r3 = r2.zzr
            return r3
    }

    private static java.util.List zzaX(android.content.Context r3, com.google.android.gms.internal.ads.zztg r4, com.google.android.gms.internal.ads.zzaf r5, boolean r6, boolean r7) throws com.google.android.gms.internal.ads.zztm {
            java.lang.String r0 = r5.zzn
            if (r0 != 0) goto L9
            com.google.android.gms.internal.ads.zzgax r3 = com.google.android.gms.internal.ads.zzgax.zzn()
            return r3
        L9:
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r2 = 26
            if (r1 < r2) goto L28
            java.lang.String r1 = "video/dolby-vision"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L28
            boolean r3 = com.google.android.gms.internal.ads.zzaaq.zza(r3)
            if (r3 != 0) goto L28
            java.util.List r3 = com.google.android.gms.internal.ads.zzts.zze(r4, r5, r6, r7)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L28
            return r3
        L28:
            java.util.List r3 = com.google.android.gms.internal.ads.zzts.zzg(r4, r5, r6, r7)
            return r3
    }

    private final void zzaY() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcp r0 = r2.zzE
            if (r0 == 0) goto L9
            com.google.android.gms.internal.ads.zzabp r1 = r2.zzg
            r1.zzt(r0)
        L9:
            return
    }

    private final void zzaZ() {
            r2 = this;
            com.google.android.gms.internal.ads.zzabp r0 = r2.zzg
            android.view.Surface r1 = r2.zzq
            r0.zzq(r1)
            r0 = 1
            r2.zzt = r0
            return
    }

    public static int zzad(com.google.android.gms.internal.ads.zzsw r10, com.google.android.gms.internal.ads.zzaf r11) {
            int r0 = r11.zzt
            int r1 = r11.zzu
            r2 = -1
            if (r0 == r2) goto Ld2
            if (r1 != r2) goto Lb
            goto Ld2
        Lb:
            java.lang.String r3 = r11.zzn
            java.util.Objects.requireNonNull(r3)
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            r5 = 2
            r6 = 1
            java.lang.String r7 = "video/avc"
            java.lang.String r8 = "video/hevc"
            if (r4 == 0) goto L37
            android.util.Pair r11 = com.google.android.gms.internal.ads.zzts.zza(r11)
            if (r11 == 0) goto L36
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r11 == r3) goto L34
            if (r11 == r6) goto L34
            if (r11 != r5) goto L36
        L34:
            r3 = r7
            goto L37
        L36:
            r3 = r8
        L37:
            int r11 = r3.hashCode()
            r4 = 3
            r9 = 4
            switch(r11) {
                case -1664118616: goto L78;
                case -1662735862: goto L6f;
                case -1662541442: goto L67;
                case 1187890754: goto L5d;
                case 1331836730: goto L55;
                case 1599127256: goto L4b;
                case 1599127257: goto L41;
                default: goto L40;
            }
        L40:
            goto L82
        L41:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L82
            r5 = 6
            goto L83
        L4b:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L82
            r5 = 3
            goto L83
        L55:
            boolean r11 = r3.equals(r7)
            if (r11 == 0) goto L82
            r5 = 5
            goto L83
        L5d:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L82
            r5 = 1
            goto L83
        L67:
            boolean r11 = r3.equals(r8)
            if (r11 == 0) goto L82
            r5 = 4
            goto L83
        L6f:
            java.lang.String r11 = "video/av01"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L82
            goto L83
        L78:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L82
            r5 = 0
            goto L83
        L82:
            r5 = -1
        L83:
            switch(r5) {
                case 0: goto Lcc;
                case 1: goto Lcc;
                case 2: goto Lcc;
                case 3: goto Lcc;
                case 4: goto Lc0;
                case 5: goto L8a;
                case 6: goto L87;
                default: goto L86;
            }
        L86:
            goto Ld2
        L87:
            r9 = 8
            goto Lcc
        L8a:
            java.lang.String r11 = com.google.android.gms.internal.ads.zzeu.zzd
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Ld2
            java.lang.String r3 = com.google.android.gms.internal.ads.zzeu.zzc
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto Lb2
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Ld2
            java.lang.String r3 = "AFTS"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto Lb2
            boolean r10 = r10.zzf
            if (r10 != 0) goto Ld2
        Lb2:
            int r0 = r0 + 15
            int r1 = r1 + 15
            int r0 = r0 / 16
            int r1 = r1 / 16
            int r0 = r0 * r1
            int r0 = r0 * 768
            int r0 = r0 / r9
            return r0
        Lc0:
            r10 = 2097152(0x200000, float:2.938736E-39)
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r9
            int r10 = java.lang.Math.max(r10, r0)
            return r10
        Lcc:
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r9
            return r0
        Ld2:
            return r2
    }

    protected static int zzae(com.google.android.gms.internal.ads.zzsw r3, com.google.android.gms.internal.ads.zzaf r4) {
            int r0 = r4.zzo
            r1 = -1
            if (r0 == r1) goto L20
            java.util.List r3 = r4.zzq
            int r3 = r3.size()
            r0 = 0
            r1 = 0
        Ld:
            if (r0 >= r3) goto L1c
            java.util.List r2 = r4.zzq
            java.lang.Object r2 = r2.get(r0)
            byte[] r2 = (byte[]) r2
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto Ld
        L1c:
            int r3 = r4.zzo
            int r3 = r3 + r1
            return r3
        L20:
            int r3 = zzad(r3, r4)
            return r3
    }

    static /* bridge */ /* synthetic */ android.view.Surface zzah(com.google.android.gms.internal.ads.zzaas r0) {
            android.view.Surface r0 = r0.zzq
            return r0
    }

    static /* bridge */ /* synthetic */ void zzai(com.google.android.gms.internal.ads.zzaas r0) {
            r0.zzaZ()
            return
    }

    private final void zzba() {
            r1 = this;
            com.google.android.gms.internal.ads.zzaav r0 = r1.zzr
            if (r0 == 0) goto La
            r0.release()
            r0 = 0
            r1.zzr = r0
        La:
            return
    }

    private final boolean zzbb(com.google.android.gms.internal.ads.zzsw r2) {
            r1 = this;
            android.view.Surface r0 = r1.zzq
            if (r0 != 0) goto L13
            boolean r0 = zzaV(r2)
            if (r0 != 0) goto L13
            boolean r2 = r1.zzbc(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    private final boolean zzbc(com.google.android.gms.internal.ads.zzsw r5) {
            r4 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 1
            r2 = 0
            r3 = 23
            if (r0 < r3) goto L1e
            java.lang.String r0 = r5.zza
            boolean r0 = zzaU(r0)
            if (r0 != 0) goto L1e
            boolean r5 = r5.zzf
            if (r5 == 0) goto L1f
            android.content.Context r5 = r4.zze
            boolean r5 = com.google.android.gms.internal.ads.zzaav.zzb(r5)
            if (r5 != 0) goto L1d
            goto L1e
        L1d:
            return r1
        L1e:
            r1 = 0
        L1f:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    protected final void zzA() {
            r2 = this;
            com.google.android.gms.internal.ads.zzabv r0 = r2.zzn
            if (r0 == 0) goto Lb
            boolean r1 = r2.zzf
            if (r1 == 0) goto Lb
            r0.zzo()
        Lb:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz
    protected final void zzC() {
            r4 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2 = 0
            super.zzC()     // Catch: java.lang.Throwable -> L11
            r4.zzo = r2
            r4.zzI = r0
            r4.zzba()
            return
        L11:
            r3 = move-exception
            r4.zzo = r2
            r4.zzI = r0
            r4.zzba()
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    protected final void zzD() {
            r3 = this;
            r0 = 0
            r3.zzx = r0
            com.google.android.gms.internal.ads.zzdj r1 = r3.zzi()
            long r1 = r1.zzb()
            r3.zzw = r1
            r1 = 0
            r3.zzA = r1
            r3.zzB = r0
            com.google.android.gms.internal.ads.zzabv r0 = r3.zzn
            if (r0 == 0) goto L1b
            r0.zzm()
            return
        L1b:
            com.google.android.gms.internal.ads.zzaaz r0 = r3.zzi
            r0.zzg()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    protected final void zzE() {
            r7 = this;
            int r0 = r7.zzx
            r1 = 0
            if (r0 <= 0) goto L1c
            com.google.android.gms.internal.ads.zzdj r0 = r7.zzi()
            long r2 = r0.zzb()
            long r4 = r7.zzw
            long r4 = r2 - r4
            com.google.android.gms.internal.ads.zzabp r0 = r7.zzg
            int r6 = r7.zzx
            r0.zzd(r6, r4)
            r7.zzx = r1
            r7.zzw = r2
        L1c:
            int r0 = r7.zzB
            if (r0 == 0) goto L2d
            com.google.android.gms.internal.ads.zzabp r2 = r7.zzg
            long r3 = r7.zzA
            r2.zzr(r3, r0)
            r2 = 0
            r7.zzA = r2
            r7.zzB = r1
        L2d:
            com.google.android.gms.internal.ads.zzabv r0 = r7.zzn
            if (r0 == 0) goto L35
            r0.zzn()
            return
        L35:
            com.google.android.gms.internal.ads.zzaaz r0 = r7.zzi
            r0.zzh()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz
    protected final void zzF(com.google.android.gms.internal.ads.zzaf[] r3, long r4, long r6, com.google.android.gms.internal.ads.zzuy r8) throws com.google.android.gms.internal.ads.zzij {
            r2 = this;
            super.zzF(r3, r4, r6, r8)
            long r6 = r2.zzI
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 != 0) goto L10
            r2.zzI = r4
        L10:
            com.google.android.gms.internal.ads.zzcc r3 = r2.zzh()
            boolean r4 = r3.zzo()
            if (r4 == 0) goto L1d
            r2.zzJ = r0
            return
        L1d:
            java.lang.Object r4 = r8.zza
            com.google.android.gms.internal.ads.zzca r5 = new com.google.android.gms.internal.ads.zzca
            r5.<init>()
            com.google.android.gms.internal.ads.zzca r3 = r3.zzn(r4, r5)
            long r3 = r3.zzd
            r2.zzJ = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlr
    public final void zzM(float r1, float r2) throws com.google.android.gms.internal.ads.zzij {
            r0 = this;
            super.zzM(r1, r2)
            com.google.android.gms.internal.ads.zzabv r2 = r0.zzn
            if (r2 == 0) goto Lb
            r2.zzt(r1)
            return
        Lb:
            com.google.android.gms.internal.ads.zzaaz r2 = r0.zzi
            r2.zzn(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzlr, com.google.android.gms.internal.ads.zzlu
    public final java.lang.String zzU() {
            r1 = this;
            java.lang.String r0 = "MediaCodecVideoRenderer"
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzlr
    public final void zzV(long r2, long r4) throws com.google.android.gms.internal.ads.zzij {
            r1 = this;
            super.zzV(r2, r4)
            com.google.android.gms.internal.ads.zzabv r0 = r1.zzn
            if (r0 == 0) goto L16
            r0.zzp(r2, r4)     // Catch: com.google.android.gms.internal.ads.zzabu -> Lb
            return
        Lb:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzaf r3 = r2.zza
            r4 = 0
            r5 = 7001(0x1b59, float:9.81E-42)
            com.google.android.gms.internal.ads.zzij r2 = r1.zzcY(r2, r3, r4, r5)
            throw r2
        L16:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzlr
    public final boolean zzW() {
            r2 = this;
            boolean r0 = super.zzW()
            r1 = 0
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.ads.zzabv r0 = r2.zzn
            if (r0 != 0) goto Ld
            r1 = 1
        Ld:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzlr
    public final boolean zzX() {
            r2 = this;
            boolean r0 = super.zzX()
            com.google.android.gms.internal.ads.zzabv r1 = r2.zzn
            if (r1 == 0) goto Ld
            boolean r0 = r1.zzz(r0)
            return r0
        Ld:
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.ads.zzst r1 = r2.zzaz()
            if (r1 == 0) goto L1a
            android.view.Surface r1 = r2.zzq
            if (r1 == 0) goto L1a
            goto L1c
        L1a:
            r0 = 1
            return r0
        L1c:
            com.google.android.gms.internal.ads.zzaaz r1 = r2.zzi
            boolean r0 = r1.zzo(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final float zzZ(float r5, com.google.android.gms.internal.ads.zzaf r6, com.google.android.gms.internal.ads.zzaf[] r7) {
            r4 = this;
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L5:
            int r2 = r7.length
            if (r0 >= r2) goto L17
            r2 = r7[r0]
            float r2 = r2.zzv
            int r3 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r3 == 0) goto L14
            float r1 = java.lang.Math.max(r1, r2)
        L14:
            int r0 = r0 + 1
            goto L5
        L17:
            int r7 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r7 != 0) goto L1c
            return r6
        L1c:
            float r1 = r1 * r5
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final com.google.android.gms.internal.ads.zzsv zzaA(java.lang.Throwable r3, com.google.android.gms.internal.ads.zzsw r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzaan r0 = new com.google.android.gms.internal.ads.zzaan
            android.view.Surface r1 = r2.zzq
            r0.<init>(r3, r4, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final void zzaD(long r1) {
            r0 = this;
            super.zzaD(r1)
            int r1 = r0.zzz
            int r1 = r1 + (-1)
            r0.zzz = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final void zzaE(com.google.android.gms.internal.ads.zzhq r1) throws com.google.android.gms.internal.ads.zzij {
            r0 = this;
            int r1 = r0.zzz
            int r1 = r1 + 1
            r0.zzz = r1
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final void zzaF(com.google.android.gms.internal.ads.zzaf r4) throws com.google.android.gms.internal.ads.zzij {
            r3 = this;
            com.google.android.gms.internal.ads.zzabv r0 = r3.zzn
            if (r0 == 0) goto L11
            r0.zzh(r4)     // Catch: com.google.android.gms.internal.ads.zzabu -> L8
            return
        L8:
            r0 = move-exception
            r1 = 0
            r2 = 7000(0x1b58, float:9.809E-42)
            com.google.android.gms.internal.ads.zzij r4 = r3.zzcY(r0, r4, r1, r2)
            throw r4
        L11:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final void zzaH() {
            r1 = this;
            super.zzaH()
            r0 = 0
            r1.zzz = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final boolean zzaN(com.google.android.gms.internal.ads.zzsw r1) {
            r0 = this;
            boolean r1 = r0.zzbb(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final boolean zzaO(com.google.android.gms.internal.ads.zzhq r7) {
            r6 = this;
            boolean r0 = r7.zzi()
            r1 = 0
            if (r0 != 0) goto L8
            goto L42
        L8:
            boolean r0 = r6.zzQ()
            if (r0 != 0) goto L42
            boolean r0 = r7.zzh()
            if (r0 != 0) goto L42
            long r2 = r6.zzJ
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L42
            long r2 = r7.zze
            long r4 = r6.zzav()
            long r2 = r2 - r4
            long r4 = r6.zzJ
            long r4 = r4 - r2
            r2 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L42
            boolean r0 = r7.zzl()
            if (r0 != 0) goto L42
            long r2 = r7.zze
            long r4 = r6.zzf()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L42
            r7 = 1
            return r7
        L42:
            return r1
    }

    protected final void zzaQ(com.google.android.gms.internal.ads.zzst r1, int r2, long r3) {
            r0 = this;
            java.lang.String r3 = "skipVideoBuffer"
            android.os.Trace.beginSection(r3)
            r3 = 0
            r1.zzo(r2, r3)
            android.os.Trace.endSection()
            com.google.android.gms.internal.ads.zzia r1 = r0.zza
            int r2 = r1.zzf
            int r2 = r2 + 1
            r1.zzf = r2
            return
    }

    protected final void zzaR(int r3, int r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzia r0 = r2.zza
            int r1 = r0.zzh
            int r1 = r1 + r3
            r0.zzh = r1
            int r1 = r0.zzg
            int r3 = r3 + r4
            int r1 = r1 + r3
            r0.zzg = r1
            int r4 = r2.zzx
            int r4 = r4 + r3
            r2.zzx = r4
            int r4 = r2.zzy
            int r4 = r4 + r3
            r2.zzy = r4
            int r3 = r0.zzi
            int r3 = java.lang.Math.max(r4, r3)
            r0.zzi = r3
            return
    }

    protected final void zzaS(long r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzia r0 = r3.zza
            long r1 = r0.zzk
            long r1 = r1 + r4
            r0.zzk = r1
            int r1 = r0.zzl
            int r1 = r1 + 1
            r0.zzl = r1
            long r0 = r3.zzA
            long r0 = r0 + r4
            r3.zzA = r0
            int r4 = r3.zzB
            int r4 = r4 + 1
            r3.zzB = r4
            return
    }

    protected final boolean zzaT(long r3, boolean r5) throws com.google.android.gms.internal.ads.zzij {
            r2 = this;
            int r3 = r2.zzd(r3)
            r4 = 0
            if (r3 != 0) goto L8
            return r4
        L8:
            r0 = 1
            if (r5 == 0) goto L1a
            com.google.android.gms.internal.ads.zzia r5 = r2.zza
            int r1 = r5.zzd
            int r1 = r1 + r3
            r5.zzd = r1
            int r3 = r5.zzf
            int r1 = r2.zzz
            int r3 = r3 + r1
            r5.zzf = r3
            goto L26
        L1a:
            com.google.android.gms.internal.ads.zzia r5 = r2.zza
            int r1 = r5.zzj
            int r1 = r1 + r0
            r5.zzj = r1
            int r5 = r2.zzz
            r2.zzaR(r3, r5)
        L26:
            r2.zzaJ()
            com.google.android.gms.internal.ads.zzabv r3 = r2.zzn
            if (r3 == 0) goto L30
            r3.zzg(r4)
        L30:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final int zzaa(com.google.android.gms.internal.ads.zztg r11, com.google.android.gms.internal.ads.zzaf r12) throws com.google.android.gms.internal.ads.zztm {
            r10 = this;
            java.lang.String r0 = r12.zzn
            boolean r0 = com.google.android.gms.internal.ads.zzbn.zzi(r0)
            r1 = 128(0x80, float:1.794E-43)
            if (r0 != 0) goto Lb
            return r1
        Lb:
            com.google.android.gms.internal.ads.zzy r0 = r12.zzr
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            android.content.Context r4 = r10.zze
            java.util.List r4 = zzaX(r4, r11, r12, r0, r3)
            if (r0 == 0) goto L28
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L28
            android.content.Context r4 = r10.zze
            java.util.List r4 = zzaX(r4, r11, r12, r3, r3)
        L28:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L2f
            goto L36
        L2f:
            boolean r5 = com.google.android.gms.internal.ads.zzte.zzaP(r12)
            if (r5 != 0) goto L39
            r2 = 2
        L36:
            r11 = r2 | 128(0x80, float:1.794E-43)
            return r11
        L39:
            java.lang.Object r5 = r4.get(r3)
            com.google.android.gms.internal.ads.zzsw r5 = (com.google.android.gms.internal.ads.zzsw) r5
            boolean r6 = r5.zze(r12)
            if (r6 != 0) goto L5f
            r7 = 1
        L46:
            int r8 = r4.size()
            if (r7 >= r8) goto L5f
            java.lang.Object r8 = r4.get(r7)
            com.google.android.gms.internal.ads.zzsw r8 = (com.google.android.gms.internal.ads.zzsw) r8
            boolean r9 = r8.zze(r12)
            if (r9 == 0) goto L5c
            r5 = r8
            r4 = 0
            r6 = 1
            goto L60
        L5c:
            int r7 = r7 + 1
            goto L46
        L5f:
            r4 = 1
        L60:
            if (r2 == r6) goto L64
            r7 = 3
            goto L65
        L64:
            r7 = 4
        L65:
            boolean r8 = r5.zzf(r12)
            if (r2 == r8) goto L6e
            r8 = 8
            goto L70
        L6e:
            r8 = 16
        L70:
            boolean r5 = r5.zzg
            if (r2 == r5) goto L76
            r5 = 0
            goto L78
        L76:
            r5 = 64
        L78:
            if (r2 == r4) goto L7b
            r1 = 0
        L7b:
            int r4 = com.google.android.gms.internal.ads.zzeu.zza
            r9 = 26
            if (r4 < r9) goto L95
            java.lang.String r4 = r12.zzn
            java.lang.String r9 = "video/dolby-vision"
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L95
            android.content.Context r4 = r10.zze
            boolean r4 = com.google.android.gms.internal.ads.zzaaq.zza(r4)
            if (r4 != 0) goto L95
            r1 = 256(0x100, float:3.59E-43)
        L95:
            if (r6 == 0) goto Lbb
            android.content.Context r4 = r10.zze
            java.util.List r11 = zzaX(r4, r11, r12, r0, r2)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto Lbb
            java.util.List r11 = com.google.android.gms.internal.ads.zzts.zzh(r11, r12)
            java.lang.Object r11 = r11.get(r3)
            com.google.android.gms.internal.ads.zzsw r11 = (com.google.android.gms.internal.ads.zzsw) r11
            boolean r0 = r11.zze(r12)
            if (r0 == 0) goto Lbb
            boolean r11 = r11.zzf(r12)
            if (r11 == 0) goto Lbb
            r3 = 32
        Lbb:
            r11 = r7 | r8
            r11 = r11 | r3
            r11 = r11 | r5
            r11 = r11 | r1
            return r11
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final com.google.android.gms.internal.ads.zzib zzab(com.google.android.gms.internal.ads.zzsw r9, com.google.android.gms.internal.ads.zzaf r10, com.google.android.gms.internal.ads.zzaf r11) {
            r8 = this;
            com.google.android.gms.internal.ads.zzib r0 = r9.zzb(r10, r11)
            int r1 = r0.zze
            com.google.android.gms.internal.ads.zzaar r2 = r8.zzk
            java.util.Objects.requireNonNull(r2)
            int r3 = r11.zzt
            int r4 = r2.zza
            if (r3 > r4) goto L17
            int r3 = r11.zzu
            int r4 = r2.zzb
            if (r3 <= r4) goto L19
        L17:
            r1 = r1 | 256(0x100, float:3.59E-43)
        L19:
            int r3 = zzae(r9, r11)
            int r2 = r2.zzc
            if (r3 <= r2) goto L23
            r1 = r1 | 64
        L23:
            java.lang.String r3 = r9.zza
            com.google.android.gms.internal.ads.zzib r9 = new com.google.android.gms.internal.ads.zzib
            r2 = 0
            if (r1 == 0) goto L2d
            r7 = r1
            r6 = 0
            goto L31
        L2d:
            int r0 = r0.zzd
            r6 = r0
            r7 = 0
        L31:
            r2 = r9
            r4 = r10
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return r9
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final com.google.android.gms.internal.ads.zzib zzac(com.google.android.gms.internal.ads.zzkm r3) throws com.google.android.gms.internal.ads.zzij {
            r2 = this;
            com.google.android.gms.internal.ads.zzib r0 = super.zzac(r3)
            com.google.android.gms.internal.ads.zzaf r3 = r3.zza
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.ads.zzabp r1 = r2.zzg
            r1.zzf(r3, r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final com.google.android.gms.internal.ads.zzsq zzaf(com.google.android.gms.internal.ads.zzsw r19, com.google.android.gms.internal.ads.zzaf r20, android.media.MediaCrypto r21, float r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            com.google.android.gms.internal.ads.zzaf[] r4 = r18.zzT()
            int r5 = r4.length
            int r6 = zzae(r19, r20)
            int r7 = r2.zzt
            int r8 = r2.zzu
            r10 = -1
            r12 = 1
            if (r5 != r12) goto L2d
            if (r6 == r10) goto L128
            int r4 = zzad(r19, r20)
            if (r4 == r10) goto L128
            float r5 = (float) r6
            r6 = 1069547520(0x3fc00000, float:1.5)
            float r5 = r5 * r6
            int r5 = (int) r5
            int r6 = java.lang.Math.min(r5, r4)
            goto L128
        L2d:
            r13 = 0
            r14 = 0
        L2f:
            if (r13 >= r5) goto L72
            r15 = r4[r13]
            com.google.android.gms.internal.ads.zzo r9 = r2.zzA
            if (r9 == 0) goto L48
            com.google.android.gms.internal.ads.zzo r9 = r15.zzA
            if (r9 != 0) goto L48
            com.google.android.gms.internal.ads.zzad r9 = r15.zzb()
            com.google.android.gms.internal.ads.zzo r15 = r2.zzA
            r9.zzB(r15)
            com.google.android.gms.internal.ads.zzaf r15 = r9.zzaf()
        L48:
            com.google.android.gms.internal.ads.zzib r9 = r1.zzb(r2, r15)
            int r9 = r9.zzd
            if (r9 == 0) goto L6f
            int r9 = r15.zzt
            if (r9 == r10) goto L5b
            int r11 = r15.zzu
            if (r11 != r10) goto L59
            goto L5b
        L59:
            r11 = 0
            goto L5c
        L5b:
            r11 = 1
        L5c:
            r14 = r14 | r11
            int r7 = java.lang.Math.max(r7, r9)
            int r9 = r15.zzu
            int r8 = java.lang.Math.max(r8, r9)
            int r9 = zzae(r1, r15)
            int r6 = java.lang.Math.max(r6, r9)
        L6f:
            int r13 = r13 + 1
            goto L2f
        L72:
            if (r14 == 0) goto L128
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Resolutions unknown. Codec max resolution: "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r5 = "x"
            r4.append(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = "MediaCodecVideoRenderer"
            com.google.android.gms.internal.ads.zzea.zzf(r9, r4)
            int r4 = r2.zzu
            int r10 = r2.zzt
            if (r4 <= r10) goto L9a
            r11 = 1
            goto L9b
        L9a:
            r11 = 0
        L9b:
            if (r11 == 0) goto L9f
            r13 = r4
            goto La0
        L9f:
            r13 = r10
        La0:
            if (r12 != r11) goto La3
            r4 = r10
        La3:
            int[] r10 = com.google.android.gms.internal.ads.zzaas.zzb
            r14 = 0
        La6:
            r15 = 9
            if (r14 >= r15) goto Le9
            float r15 = (float) r4
            float r12 = (float) r13
            r3 = r10[r14]
            r16 = r10
            float r10 = (float) r3
            if (r3 <= r13) goto Le9
            float r15 = r15 / r12
            float r10 = r10 * r15
            int r10 = (int) r10
            if (r10 > r4) goto Lba
            goto Le9
        Lba:
            r12 = 1
            if (r12 == r11) goto Lbf
            r15 = r3
            goto Lc0
        Lbf:
            r15 = r10
        Lc0:
            if (r12 != r11) goto Lc3
            goto Lc4
        Lc3:
            r3 = r10
        Lc4:
            android.graphics.Point r3 = r1.zza(r15, r3)
            float r10 = r2.zzv
            if (r3 == 0) goto Ldb
            r12 = r11
            double r10 = (double) r10
            int r15 = r3.x
            r17 = r4
            int r4 = r3.y
            boolean r4 = r1.zzg(r15, r4, r10)
            if (r4 == 0) goto Lde
            goto Lea
        Ldb:
            r17 = r4
            r12 = r11
        Lde:
            int r14 = r14 + 1
            r3 = r22
            r11 = r12
            r10 = r16
            r4 = r17
            r12 = 1
            goto La6
        Le9:
            r3 = 0
        Lea:
            if (r3 == 0) goto L128
            int r4 = r3.x
            int r7 = java.lang.Math.max(r7, r4)
            int r3 = r3.y
            int r8 = java.lang.Math.max(r8, r3)
            com.google.android.gms.internal.ads.zzad r3 = r20.zzb()
            r3.zzae(r7)
            r3.zzJ(r8)
            com.google.android.gms.internal.ads.zzaf r3 = r3.zzaf()
            int r3 = zzad(r1, r3)
            int r6 = java.lang.Math.max(r6, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Codec max resolution adjusted to: "
            r3.append(r4)
            r3.append(r7)
            r3.append(r5)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r9, r3)
        L128:
            java.lang.String r3 = r1.zzc
            com.google.android.gms.internal.ads.zzaar r4 = new com.google.android.gms.internal.ads.zzaar
            r4.<init>(r7, r8, r6)
            r0.zzk = r4
            boolean r5 = r0.zzh
            android.media.MediaFormat r6 = new android.media.MediaFormat
            r6.<init>()
            java.lang.String r7 = "mime"
            r6.setString(r7, r3)
            int r3 = r2.zzt
            java.lang.String r7 = "width"
            r6.setInteger(r7, r3)
            int r3 = r2.zzu
            java.lang.String r7 = "height"
            r6.setInteger(r7, r3)
            java.util.List r3 = r2.zzq
            com.google.android.gms.internal.ads.zzed.zzb(r6, r3)
            float r3 = r2.zzv
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 == 0) goto L15d
            java.lang.String r8 = "frame-rate"
            r6.setFloat(r8, r3)
        L15d:
            int r3 = r2.zzw
            java.lang.String r8 = "rotation-degrees"
            com.google.android.gms.internal.ads.zzed.zza(r6, r8, r3)
            com.google.android.gms.internal.ads.zzo r3 = r2.zzA
            if (r3 == 0) goto L18a
            int r8 = r3.zzd
            java.lang.String r9 = "color-transfer"
            com.google.android.gms.internal.ads.zzed.zza(r6, r9, r8)
            int r8 = r3.zzb
            java.lang.String r9 = "color-standard"
            com.google.android.gms.internal.ads.zzed.zza(r6, r9, r8)
            int r8 = r3.zzc
            java.lang.String r9 = "color-range"
            com.google.android.gms.internal.ads.zzed.zza(r6, r9, r8)
            byte[] r3 = r3.zze
            if (r3 == 0) goto L18a
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            java.lang.String r8 = "hdr-static-info"
            r6.setByteBuffer(r8, r3)
        L18a:
            java.lang.String r3 = r2.zzn
            java.lang.String r8 = "video/dolby-vision"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L1a7
            android.util.Pair r3 = com.google.android.gms.internal.ads.zzts.zza(r20)
            if (r3 == 0) goto L1a7
            java.lang.Object r3 = r3.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r8 = "profile"
            com.google.android.gms.internal.ads.zzed.zza(r6, r8, r3)
        L1a7:
            int r3 = r4.zza
            java.lang.String r8 = "max-width"
            r6.setInteger(r8, r3)
            int r3 = r4.zzb
            java.lang.String r8 = "max-height"
            r6.setInteger(r8, r3)
            int r3 = r4.zzc
            java.lang.String r4 = "max-input-size"
            com.google.android.gms.internal.ads.zzed.zza(r6, r4, r3)
            int r3 = com.google.android.gms.internal.ads.zzeu.zza
            r4 = 23
            if (r3 < r4) goto L1d3
            java.lang.String r4 = "priority"
            r8 = 0
            r6.setInteger(r4, r8)
            r4 = r22
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 == 0) goto L1d3
            java.lang.String r7 = "operating-rate"
            r6.setFloat(r7, r4)
        L1d3:
            if (r5 == 0) goto L1e2
            java.lang.String r4 = "no-post-process"
            r5 = 1
            r6.setInteger(r4, r5)
            java.lang.String r4 = "auto-frc"
            r5 = 0
            r6.setInteger(r4, r5)
            goto L1e3
        L1e2:
            r5 = 0
        L1e3:
            r4 = 35
            if (r3 < r4) goto L1f3
            int r3 = r0.zzF
            int r3 = -r3
            int r3 = java.lang.Math.max(r5, r3)
            java.lang.String r4 = "importance"
            r6.setInteger(r4, r3)
        L1f3:
            android.view.Surface r3 = r18.zzaW(r19)
            com.google.android.gms.internal.ads.zzabv r4 = r0.zzn
            if (r4 == 0) goto L206
            boolean r4 = r4.zzy()
            if (r4 != 0) goto L206
            java.lang.String r4 = "allow-frame-drop"
            r6.setInteger(r4, r5)
        L206:
            r4 = 0
            com.google.android.gms.internal.ads.zzsq r1 = com.google.android.gms.internal.ads.zzsq.zzb(r1, r6, r2, r3, r4)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final java.util.List zzag(com.google.android.gms.internal.ads.zztg r2, com.google.android.gms.internal.ads.zzaf r3, boolean r4) throws com.google.android.gms.internal.ads.zztm {
            r1 = this;
            android.content.Context r4 = r1.zze
            r0 = 0
            java.util.List r2 = zzaX(r4, r2, r3, r0, r0)
            java.util.List r2 = com.google.android.gms.internal.ads.zzts.zzh(r2, r3)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzte
    @android.annotation.TargetApi(29)
    protected final void zzaj(com.google.android.gms.internal.ads.zzhq r8) throws com.google.android.gms.internal.ads.zzij {
            r7 = this;
            boolean r0 = r7.zzm
            if (r0 != 0) goto L5
            goto L5b
        L5:
            java.nio.ByteBuffer r8 = r8.zzf
            java.util.Objects.requireNonNull(r8)
            int r0 = r8.remaining()
            r1 = 7
            if (r0 < r1) goto L5b
            byte r0 = r8.get()
            short r1 = r8.getShort()
            short r2 = r8.getShort()
            byte r3 = r8.get()
            byte r4 = r8.get()
            r5 = 0
            r8.position(r5)
            r6 = -75
            if (r0 != r6) goto L5b
            r0 = 60
            if (r1 != r0) goto L5b
            r0 = 1
            if (r2 != r0) goto L5b
            r1 = 4
            if (r3 != r1) goto L5b
            if (r4 == 0) goto L3b
            if (r4 != r0) goto L5b
        L3b:
            int r0 = r8.remaining()
            byte[] r0 = new byte[r0]
            r8.get(r0)
            r8.position(r5)
            com.google.android.gms.internal.ads.zzst r8 = r7.zzaz()
            java.util.Objects.requireNonNull(r8)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "hdr10-plus-info"
            r1.putByteArray(r2, r0)
            r8.zzq(r1)
        L5b:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final void zzak(java.lang.Exception r3) {
            r2 = this;
            java.lang.String r0 = "MediaCodecVideoRenderer"
            java.lang.String r1 = "Video codec error"
            com.google.android.gms.internal.ads.zzea.zzd(r0, r1, r3)
            com.google.android.gms.internal.ads.zzabp r0 = r2.zzg
            r0.zzs(r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final void zzal(java.lang.String r7, com.google.android.gms.internal.ads.zzsq r8, long r9, long r11) {
            r6 = this;
            com.google.android.gms.internal.ads.zzabp r0 = r6.zzg
            r1 = r7
            r2 = r9
            r4 = r11
            r0.zza(r1, r2, r4)
            boolean r7 = zzaU(r7)
            r6.zzl = r7
            com.google.android.gms.internal.ads.zzsw r7 = r6.zzaB()
            java.util.Objects.requireNonNull(r7)
            int r8 = com.google.android.gms.internal.ads.zzeu.zza
            r9 = 29
            r10 = 0
            if (r8 < r9) goto L3b
            java.lang.String r8 = r7.zzb
            java.lang.String r9 = "video/x-vnd.on2.vp9"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L3b
            android.media.MediaCodecInfo$CodecProfileLevel[] r7 = r7.zzh()
            int r8 = r7.length
            r9 = 0
        L2c:
            if (r9 >= r8) goto L3b
            r11 = r7[r9]
            int r11 = r11.profile
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r11 != r12) goto L38
            r10 = 1
            goto L3b
        L38:
            int r9 = r9 + 1
            goto L2c
        L3b:
            r6.zzm = r10
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final void zzam(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzabp r0 = r1.zzg
            r0.zzb(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final void zzan(com.google.android.gms.internal.ads.zzaf r9, android.media.MediaFormat r10) {
            r8 = this;
            com.google.android.gms.internal.ads.zzst r0 = r8.zzaz()
            if (r0 == 0) goto Lb
            int r1 = r8.zzu
            r0.zzr(r1)
        Lb:
            java.util.Objects.requireNonNull(r10)
            java.lang.String r0 = "crop-right"
            boolean r1 = r10.containsKey(r0)
            java.lang.String r2 = "crop-top"
            java.lang.String r3 = "crop-bottom"
            java.lang.String r4 = "crop-left"
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L32
            boolean r1 = r10.containsKey(r4)
            if (r1 == 0) goto L32
            boolean r1 = r10.containsKey(r3)
            if (r1 == 0) goto L32
            boolean r1 = r10.containsKey(r2)
            if (r1 == 0) goto L32
            r1 = 1
            goto L33
        L32:
            r1 = 0
        L33:
            if (r1 == 0) goto L40
            int r0 = r10.getInteger(r0)
            int r4 = r10.getInteger(r4)
            int r0 = r0 - r4
            int r0 = r0 + r5
            goto L46
        L40:
            java.lang.String r0 = "width"
            int r0 = r10.getInteger(r0)
        L46:
            if (r1 == 0) goto L53
            int r1 = r10.getInteger(r3)
            int r10 = r10.getInteger(r2)
            int r1 = r1 - r10
            int r1 = r1 + r5
            goto L59
        L53:
            java.lang.String r1 = "height"
            int r1 = r10.getInteger(r1)
        L59:
            float r10 = r9.zzx
            int r2 = r9.zzw
            r3 = 90
            if (r2 == r3) goto L65
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L6c
        L65:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r10 = r2 / r10
            r7 = r1
            r1 = r0
            r0 = r7
        L6c:
            com.google.android.gms.internal.ads.zzcp r2 = new com.google.android.gms.internal.ads.zzcp
            r2.<init>(r0, r1, r10)
            r8.zzD = r2
            com.google.android.gms.internal.ads.zzabv r2 = r8.zzn
            if (r2 == 0) goto L90
            boolean r3 = r8.zzK
            if (r3 == 0) goto L90
            com.google.android.gms.internal.ads.zzad r9 = r9.zzb()
            r9.zzae(r0)
            r9.zzJ(r1)
            r9.zzV(r10)
            com.google.android.gms.internal.ads.zzaf r9 = r9.zzaf()
            r2.zzj(r5, r9)
            goto L97
        L90:
            com.google.android.gms.internal.ads.zzaaz r10 = r8.zzi
            float r9 = r9.zzv
            r10.zzl(r9)
        L97:
            r8.zzK = r6
            return
    }

    protected final void zzao(com.google.android.gms.internal.ads.zzst r1, int r2, long r3, long r5) {
            r0 = this;
            java.lang.String r3 = "releaseOutputBuffer"
            android.os.Trace.beginSection(r3)
            r1.zzn(r2, r5)
            android.os.Trace.endSection()
            com.google.android.gms.internal.ads.zzia r1 = r0.zza
            int r2 = r1.zze
            int r2 = r2 + 1
            r1.zze = r2
            r1 = 0
            r0.zzy = r1
            com.google.android.gms.internal.ads.zzabv r1 = r0.zzn
            if (r1 != 0) goto L42
            com.google.android.gms.internal.ads.zzcp r1 = r0.zzD
            com.google.android.gms.internal.ads.zzcp r2 = com.google.android.gms.internal.ads.zzcp.zza
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L33
            com.google.android.gms.internal.ads.zzcp r2 = r0.zzE
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L33
            r0.zzE = r1
            com.google.android.gms.internal.ads.zzabp r2 = r0.zzg
            r2.zzt(r1)
        L33:
            com.google.android.gms.internal.ads.zzaaz r1 = r0.zzi
            boolean r1 = r1.zzp()
            if (r1 == 0) goto L42
            android.view.Surface r1 = r0.zzq
            if (r1 == 0) goto L42
            r0.zzaZ()
        L42:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final void zzap() {
            r9 = this;
            com.google.android.gms.internal.ads.zzabv r0 = r9.zzn
            if (r0 == 0) goto L17
            long r1 = r9.zzaw()
            long r3 = r9.zzav()
            long r5 = r9.zzI
            long r5 = -r5
            long r7 = r9.zzf()
            r0.zzu(r1, r3, r5, r7)
            goto L1c
        L17:
            com.google.android.gms.internal.ads.zzaaz r0 = r9.zzi
            r0.zzf()
        L1c:
            r0 = 1
            r9.zzK = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final boolean zzar(long r20, long r22, com.google.android.gms.internal.ads.zzst r24, java.nio.ByteBuffer r25, int r26, int r27, int r28, long r29, boolean r31, boolean r32, com.google.android.gms.internal.ads.zzaf r33) throws com.google.android.gms.internal.ads.zzij {
            r19 = this;
            r7 = r19
            r0 = r24
            r4 = r26
            java.util.Objects.requireNonNull(r24)
            long r1 = r19.zzav()
            long r5 = r29 - r1
            com.google.android.gms.internal.ads.zzabv r8 = r7.zzn
            r14 = 0
            if (r8 == 0) goto L3f
            long r1 = r7.zzI
            long r1 = -r1
            long r9 = r29 + r1
            com.google.android.gms.internal.ads.zzaap r16 = new com.google.android.gms.internal.ads.zzaap     // Catch: com.google.android.gms.internal.ads.zzabu -> L34
            r1 = r16
            r2 = r19
            r3 = r24
            r4 = r26
            r1.<init>(r2, r3, r4, r5)     // Catch: com.google.android.gms.internal.ads.zzabu -> L34
            r11 = r32
            r12 = r20
            r1 = 0
            r14 = r22
            boolean r0 = r8.zzx(r9, r11, r12, r14, r16)     // Catch: com.google.android.gms.internal.ads.zzabu -> L32
            return r0
        L32:
            r0 = move-exception
            goto L36
        L34:
            r0 = move-exception
            r1 = 0
        L36:
            com.google.android.gms.internal.ads.zzaf r2 = r0.zza
            r3 = 7001(0x1b59, float:9.81E-42)
            com.google.android.gms.internal.ads.zzij r0 = r7.zzcY(r0, r2, r1, r3)
            throw r0
        L3f:
            r1 = 0
            com.google.android.gms.internal.ads.zzaaz r8 = r7.zzi
            long r15 = r19.zzaw()
            com.google.android.gms.internal.ads.zzaax r2 = r7.zzj
            r9 = r29
            r11 = r20
            r13 = r22
            r17 = r32
            r18 = r2
            int r2 = r8.zza(r9, r11, r13, r15, r17, r18)
            r3 = 4
            if (r2 != r3) goto L5a
            return r1
        L5a:
            r3 = 1
            if (r31 == 0) goto L64
            if (r32 == 0) goto L60
            goto L64
        L60:
            r7.zzaQ(r0, r4, r5)
            return r3
        L64:
            android.view.Surface r8 = r7.zzq
            if (r8 != 0) goto L82
            com.google.android.gms.internal.ads.zzaax r2 = r7.zzj
            long r8 = r2.zzc()
            r10 = 30000(0x7530, double:1.4822E-319)
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 >= 0) goto L81
            r7.zzaQ(r0, r4, r5)
            com.google.android.gms.internal.ads.zzaax r0 = r7.zzj
            long r0 = r0.zzc()
            r7.zzaS(r0)
            return r3
        L81:
            return r1
        L82:
            if (r2 == 0) goto Le6
            if (r2 == r3) goto Lbf
            r8 = 2
            if (r2 == r8) goto La7
            r8 = 3
            if (r2 == r8) goto L9a
            r0 = 5
            if (r2 != r0) goto L90
            return r1
        L90:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.<init>(r1)
            throw r0
        L9a:
            r7.zzaQ(r0, r4, r5)
            com.google.android.gms.internal.ads.zzaax r0 = r7.zzj
            long r0 = r0.zzc()
            r7.zzaS(r0)
            return r3
        La7:
            java.lang.String r2 = "dropVideoBuffer"
            android.os.Trace.beginSection(r2)
            r0.zzo(r4, r1)
            android.os.Trace.endSection()
            r7.zzaR(r1, r3)
            com.google.android.gms.internal.ads.zzaax r0 = r7.zzj
            long r0 = r0.zzc()
            r7.zzaS(r0)
            return r3
        Lbf:
            com.google.android.gms.internal.ads.zzaax r1 = r7.zzj
            long r8 = r1.zzd()
            long r1 = r1.zzc()
            long r10 = r7.zzC
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto Ld3
            r7.zzaQ(r0, r4, r5)
            goto Le0
        Ld3:
            r27 = r19
            r28 = r24
            r29 = r26
            r30 = r5
            r32 = r8
            r27.zzao(r28, r29, r30, r32)
        Le0:
            r7.zzaS(r1)
            r7.zzC = r8
            return r3
        Le6:
            com.google.android.gms.internal.ads.zzdj r1 = r19.zzi()
            long r1 = r1.zzc()
            r27 = r19
            r28 = r24
            r29 = r26
            r30 = r5
            r32 = r1
            r27.zzao(r28, r29, r30, r32)
            com.google.android.gms.internal.ads.zzaax r0 = r7.zzj
            long r0 = r0.zzc()
            r7.zzaS(r0)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzte
    protected final int zzau(com.google.android.gms.internal.ads.zzhq r1) {
            r0 = this;
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlr
    public final void zzt() {
            r1 = this;
            com.google.android.gms.internal.ads.zzabv r0 = r1.zzn
            if (r0 == 0) goto L8
            r0.zzf()
            return
        L8:
            com.google.android.gms.internal.ads.zzaaz r0 = r1.zzi
            r0.zzb()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlm
    public final void zzu(int r9, java.lang.Object r10) throws com.google.android.gms.internal.ads.zzij {
            r8 = this;
            r0 = 0
            r1 = 35
            r2 = 1
            if (r9 == r2) goto Lc9
            r2 = 7
            if (r9 == r2) goto Lba
            r2 = 10
            if (r9 == r2) goto Laa
            r2 = 16
            if (r9 == r2) goto L80
            r0 = 4
            if (r9 == r0) goto L6b
            r0 = 5
            if (r9 == r0) goto L52
            r0 = 13
            if (r9 == r0) goto L43
            r0 = 14
            if (r9 == r0) goto L23
            super.zzu(r9, r10)
            return
        L23:
            java.util.Objects.requireNonNull(r10)
            com.google.android.gms.internal.ads.zzel r10 = (com.google.android.gms.internal.ads.zzel) r10
            int r9 = r10.zzb()
            if (r9 == 0) goto L158
            int r9 = r10.zza()
            if (r9 == 0) goto L158
            r8.zzs = r10
            com.google.android.gms.internal.ads.zzabv r9 = r8.zzn
            if (r9 == 0) goto L158
            android.view.Surface r0 = r8.zzq
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            r9.zzs(r0, r10)
            return
        L43:
            java.util.Objects.requireNonNull(r10)
            java.util.List r10 = (java.util.List) r10
            r8.zzp = r10
            com.google.android.gms.internal.ads.zzabv r9 = r8.zzn
            if (r9 == 0) goto L158
            r9.zzv(r10)
            return
        L52:
            java.util.Objects.requireNonNull(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r9 = r10.intValue()
            r8.zzv = r9
            com.google.android.gms.internal.ads.zzabv r10 = r8.zzn
            if (r10 == 0) goto L65
            r10.zzq(r9)
            return
        L65:
            com.google.android.gms.internal.ads.zzaaz r10 = r8.zzi
            r10.zzj(r9)
            return
        L6b:
            java.util.Objects.requireNonNull(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r9 = r10.intValue()
            r8.zzu = r9
            com.google.android.gms.internal.ads.zzst r10 = r8.zzaz()
            if (r10 == 0) goto L158
            r10.zzr(r9)
            return
        L80:
            java.util.Objects.requireNonNull(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r9 = r10.intValue()
            r8.zzF = r9
            com.google.android.gms.internal.ads.zzst r9 = r8.zzaz()
            if (r9 == 0) goto L158
            int r10 = com.google.android.gms.internal.ads.zzeu.zza
            if (r10 < r1) goto L158
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            int r1 = r8.zzF
            int r1 = -r1
            int r0 = java.lang.Math.max(r0, r1)
            java.lang.String r1 = "importance"
            r10.putInt(r1, r0)
            r9.zzq(r10)
            return
        Laa:
            java.util.Objects.requireNonNull(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r9 = r10.intValue()
            int r10 = r8.zzG
            if (r10 == r9) goto L158
            r8.zzG = r9
            return
        Lba:
            java.util.Objects.requireNonNull(r10)
            com.google.android.gms.internal.ads.zzaaw r10 = (com.google.android.gms.internal.ads.zzaaw) r10
            r8.zzH = r10
            com.google.android.gms.internal.ads.zzabv r9 = r8.zzn
            if (r9 == 0) goto L158
            r9.zzw(r10)
            return
        Lc9:
            boolean r9 = r10 instanceof android.view.Surface
            r3 = 0
            if (r9 == 0) goto Ld1
            android.view.Surface r10 = (android.view.Surface) r10
            goto Ld2
        Ld1:
            r10 = r3
        Ld2:
            android.view.Surface r9 = r8.zzq
            if (r9 == r10) goto L146
            r8.zzq = r10
            com.google.android.gms.internal.ads.zzabv r9 = r8.zzn
            if (r9 != 0) goto Le1
            com.google.android.gms.internal.ads.zzaaz r9 = r8.zzi
            r9.zzm(r10)
        Le1:
            r8.zzt = r0
            int r9 = r8.zzcV()
            com.google.android.gms.internal.ads.zzst r0 = r8.zzaz()
            if (r0 == 0) goto L126
            com.google.android.gms.internal.ads.zzabv r4 = r8.zzn
            if (r4 != 0) goto L126
            com.google.android.gms.internal.ads.zzsw r4 = r8.zzaB()
            java.util.Objects.requireNonNull(r4)
            boolean r5 = r8.zzbb(r4)
            int r6 = com.google.android.gms.internal.ads.zzeu.zza
            r7 = 23
            if (r6 < r7) goto L120
            if (r5 == 0) goto L120
            boolean r5 = r8.zzl
            if (r5 != 0) goto L120
            android.view.Surface r4 = r8.zzaW(r4)
            if (r6 < r7) goto L114
            if (r4 == 0) goto L114
            r0.zzp(r4)
            goto L126
        L114:
            if (r6 < r1) goto L11a
            r0.zzi()
            goto L126
        L11a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L120:
            r8.zzaG()
            r8.zzaC()
        L126:
            if (r10 == 0) goto L13c
            r8.zzaY()
            r10 = 2
            if (r9 != r10) goto L158
            com.google.android.gms.internal.ads.zzabv r9 = r8.zzn
            if (r9 == 0) goto L136
            r9.zzi(r2)
            return
        L136:
            com.google.android.gms.internal.ads.zzaaz r9 = r8.zzi
            r9.zzc(r2)
            return
        L13c:
            r8.zzE = r3
            com.google.android.gms.internal.ads.zzabv r9 = r8.zzn
            if (r9 == 0) goto L158
            r9.zze()
            return
        L146:
            if (r10 == 0) goto L158
            r8.zzaY()
            android.view.Surface r9 = r8.zzq
            if (r9 == 0) goto L158
            boolean r10 = r8.zzt
            if (r10 == 0) goto L158
            com.google.android.gms.internal.ads.zzabp r10 = r8.zzg
            r10.zzq(r9)
        L158:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz
    protected final void zzx() {
            r3 = this;
            r0 = 0
            r3.zzE = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.zzJ = r0
            com.google.android.gms.internal.ads.zzabv r0 = r3.zzn
            if (r0 == 0) goto L12
            r0.zzk()
            goto L17
        L12:
            com.google.android.gms.internal.ads.zzaaz r0 = r3.zzi
            r0.zzd()
        L17:
            r0 = 0
            r3.zzt = r0
            super.zzx()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzabp r0 = r3.zzg
            com.google.android.gms.internal.ads.zzia r1 = r3.zza
            r0.zzc(r1)
            com.google.android.gms.internal.ads.zzabp r0 = r3.zzg
            com.google.android.gms.internal.ads.zzcp r1 = com.google.android.gms.internal.ads.zzcp.zza
            r0.zzt(r1)
            return
        L2c:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzabp r1 = r3.zzg
            com.google.android.gms.internal.ads.zzia r2 = r3.zza
            r1.zzc(r2)
            com.google.android.gms.internal.ads.zzabp r1 = r3.zzg
            com.google.android.gms.internal.ads.zzcp r2 = com.google.android.gms.internal.ads.zzcp.zza
            r1.zzt(r2)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz
    protected final void zzy(boolean r3, boolean r4) throws com.google.android.gms.internal.ads.zzij {
            r2 = this;
            super.zzy(r3, r4)
            r2.zzn()
            com.google.android.gms.internal.ads.zzabp r3 = r2.zzg
            com.google.android.gms.internal.ads.zzia r0 = r2.zza
            r3.zze(r0)
            boolean r3 = r2.zzo
            if (r3 != 0) goto L36
            java.util.List r3 = r2.zzp
            if (r3 == 0) goto L33
            com.google.android.gms.internal.ads.zzabv r3 = r2.zzn
            if (r3 != 0) goto L33
            android.content.Context r3 = r2.zze
            com.google.android.gms.internal.ads.zzaaz r0 = r2.zzi
            com.google.android.gms.internal.ads.zzzx r1 = new com.google.android.gms.internal.ads.zzzx
            r1.<init>(r3, r0)
            com.google.android.gms.internal.ads.zzdj r3 = r2.zzi()
            r1.zzd(r3)
            com.google.android.gms.internal.ads.zzaak r3 = r1.zze()
            com.google.android.gms.internal.ads.zzabv r3 = r3.zzh()
            r2.zzn = r3
        L33:
            r3 = 1
            r2.zzo = r3
        L36:
            com.google.android.gms.internal.ads.zzabv r3 = r2.zzn
            if (r3 == 0) goto L85
            com.google.android.gms.internal.ads.zzaao r0 = new com.google.android.gms.internal.ads.zzaao
            r0.<init>(r2)
            java.util.concurrent.Executor r1 = com.google.android.gms.internal.ads.zzggf.zzb()
            r3.zzr(r0, r1)
            com.google.android.gms.internal.ads.zzaaw r3 = r2.zzH
            if (r3 == 0) goto L4f
            com.google.android.gms.internal.ads.zzabv r0 = r2.zzn
            r0.zzw(r3)
        L4f:
            android.view.Surface r3 = r2.zzq
            if (r3 == 0) goto L66
            com.google.android.gms.internal.ads.zzel r3 = r2.zzs
            com.google.android.gms.internal.ads.zzel r0 = com.google.android.gms.internal.ads.zzel.zza
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L66
            com.google.android.gms.internal.ads.zzabv r3 = r2.zzn
            android.view.Surface r0 = r2.zzq
            com.google.android.gms.internal.ads.zzel r1 = r2.zzs
            r3.zzs(r0, r1)
        L66:
            com.google.android.gms.internal.ads.zzabv r3 = r2.zzn
            int r0 = r2.zzv
            r3.zzq(r0)
            com.google.android.gms.internal.ads.zzabv r3 = r2.zzn
            float r0 = r2.zzat()
            r3.zzt(r0)
            java.util.List r3 = r2.zzp
            if (r3 == 0) goto L7f
            com.google.android.gms.internal.ads.zzabv r0 = r2.zzn
            r0.zzv(r3)
        L7f:
            com.google.android.gms.internal.ads.zzabv r3 = r2.zzn
            r3.zzl(r4)
            return
        L85:
            com.google.android.gms.internal.ads.zzaaz r3 = r2.zzi
            com.google.android.gms.internal.ads.zzdj r0 = r2.zzi()
            r3.zzk(r0)
            com.google.android.gms.internal.ads.zzaaz r3 = r2.zzi
            r3.zze(r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz
    protected final void zzz(long r12, boolean r14) throws com.google.android.gms.internal.ads.zzij {
            r11 = this;
            com.google.android.gms.internal.ads.zzabv r0 = r11.zzn
            if (r0 == 0) goto L1e
            r1 = 1
            r0.zzg(r1)
            com.google.android.gms.internal.ads.zzabv r2 = r11.zzn
            long r3 = r11.zzaw()
            long r5 = r11.zzav()
            long r7 = r11.zzI
            long r7 = -r7
            long r9 = r11.zzf()
            r2.zzu(r3, r5, r7, r9)
            r11.zzK = r1
        L1e:
            super.zzz(r12, r14)
            com.google.android.gms.internal.ads.zzabv r12 = r11.zzn
            if (r12 != 0) goto L2a
            com.google.android.gms.internal.ads.zzaaz r12 = r11.zzi
            r12.zzi()
        L2a:
            r12 = 0
            if (r14 == 0) goto L3a
            com.google.android.gms.internal.ads.zzabv r13 = r11.zzn
            if (r13 == 0) goto L35
            r13.zzi(r12)
            goto L3a
        L35:
            com.google.android.gms.internal.ads.zzaaz r13 = r11.zzi
            r13.zzc(r12)
        L3a:
            r11.zzy = r12
            return
    }
}
