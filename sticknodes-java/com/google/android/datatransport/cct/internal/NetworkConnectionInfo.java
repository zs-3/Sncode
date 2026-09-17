package com.google.android.datatransport.cct.internal;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class NetworkConnectionInfo {

    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.android.datatransport.cct.internal.NetworkConnectionInfo build();

        public abstract com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder setMobileSubtype(com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype r1);

        public abstract com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder setNetworkType(com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType r1);
    }

    public enum MobileSubtype extends java.lang.Enum<com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype> {
        private static final /* synthetic */ com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype[] $VALUES = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype CDMA = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype COMBINED = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype EDGE = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype EHRPD = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype EVDO_0 = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype EVDO_A = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype EVDO_B = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype GPRS = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype GSM = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype HSDPA = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype HSPA = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype HSPAP = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype HSUPA = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype IDEN = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype IWLAN = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype LTE = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype LTE_CA = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype RTT = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype TD_SCDMA = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype UMTS = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype UNKNOWN_MOBILE_SUBTYPE = null;
        private static final android.util.SparseArray<com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype> valueMap = null;
        private final int value;

        static {
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r0 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r1 = "UNKNOWN_MOBILE_SUBTYPE"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE = r0
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r1 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r3 = "GPRS"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.GPRS = r1
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r3 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r5 = "EDGE"
                r6 = 2
                r3.<init>(r5, r6, r6)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.EDGE = r3
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r5 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r7 = "UMTS"
                r8 = 3
                r5.<init>(r7, r8, r8)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.UMTS = r5
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r7 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r9 = "CDMA"
                r10 = 4
                r7.<init>(r9, r10, r10)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.CDMA = r7
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r9 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r11 = "EVDO_0"
                r12 = 5
                r9.<init>(r11, r12, r12)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.EVDO_0 = r9
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r11 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r13 = "EVDO_A"
                r14 = 6
                r11.<init>(r13, r14, r14)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.EVDO_A = r11
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r13 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r15 = "RTT"
                r14 = 7
                r13.<init>(r15, r14, r14)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.RTT = r13
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r15 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r14 = "HSDPA"
                r12 = 8
                r15.<init>(r14, r12, r12)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.HSDPA = r15
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r14 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r12 = "HSUPA"
                r10 = 9
                r14.<init>(r12, r10, r10)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.HSUPA = r14
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r12 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r10 = "HSPA"
                r8 = 10
                r12.<init>(r10, r8, r8)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.HSPA = r12
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r10 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r8 = "IDEN"
                r6 = 11
                r10.<init>(r8, r6, r6)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.IDEN = r10
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r8 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r6 = "EVDO_B"
                r4 = 12
                r8.<init>(r6, r4, r4)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.EVDO_B = r8
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r6 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r4 = "LTE"
                r2 = 13
                r6.<init>(r4, r2, r2)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.LTE = r6
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r4 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r2 = "EHRPD"
                r16 = r6
                r6 = 14
                r4.<init>(r2, r6, r6)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.EHRPD = r4
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r2 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r6 = "HSPAP"
                r17 = r4
                r4 = 15
                r2.<init>(r6, r4, r4)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.HSPAP = r2
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r6 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r4 = "GSM"
                r18 = r2
                r2 = 16
                r6.<init>(r4, r2, r2)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.GSM = r6
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r4 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r2 = "TD_SCDMA"
                r19 = r6
                r6 = 17
                r4.<init>(r2, r6, r6)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.TD_SCDMA = r4
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r2 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r6 = "IWLAN"
                r20 = r4
                r4 = 18
                r2.<init>(r6, r4, r4)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.IWLAN = r2
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r6 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r4 = "LTE_CA"
                r21 = r2
                r2 = 19
                r6.<init>(r4, r2, r2)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.LTE_CA = r6
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r4 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype
                java.lang.String r2 = "COMBINED"
                r22 = r6
                r6 = 20
                r23 = r8
                r8 = 100
                r4.<init>(r2, r6, r8)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.COMBINED = r4
                r2 = 21
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype[] r2 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype[r2]
                r8 = 0
                r2[r8] = r0
                r8 = 1
                r2[r8] = r1
                r8 = 2
                r2[r8] = r3
                r8 = 3
                r2[r8] = r5
                r8 = 4
                r2[r8] = r7
                r8 = 5
                r2[r8] = r9
                r8 = 6
                r2[r8] = r11
                r8 = 7
                r2[r8] = r13
                r8 = 8
                r2[r8] = r15
                r8 = 9
                r2[r8] = r14
                r8 = 10
                r2[r8] = r12
                r8 = 11
                r2[r8] = r10
                r8 = 12
                r2[r8] = r23
                r8 = 13
                r2[r8] = r16
                r8 = 14
                r2[r8] = r17
                r8 = 15
                r2[r8] = r18
                r8 = 16
                r2[r8] = r19
                r8 = 17
                r2[r8] = r20
                r8 = 18
                r2[r8] = r21
                r8 = 19
                r2[r8] = r22
                r2[r6] = r4
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.$VALUES = r2
                android.util.SparseArray r2 = new android.util.SparseArray
                r2.<init>()
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.valueMap = r2
                r4 = 0
                r2.put(r4, r0)
                r0 = 1
                r2.put(r0, r1)
                r0 = 2
                r2.put(r0, r3)
                r0 = 3
                r2.put(r0, r5)
                r0 = 4
                r2.put(r0, r7)
                r0 = 5
                r2.put(r0, r9)
                r0 = 6
                r2.put(r0, r11)
                r0 = 7
                r2.put(r0, r13)
                r0 = 8
                r2.put(r0, r15)
                r0 = 9
                r2.put(r0, r14)
                r0 = 10
                r2.put(r0, r12)
                r0 = 11
                r2.put(r0, r10)
                r0 = r23
                r1 = 12
                r2.put(r1, r0)
                r0 = r16
                r1 = 13
                r2.put(r1, r0)
                r0 = r17
                r1 = 14
                r2.put(r1, r0)
                r0 = r18
                r1 = 15
                r2.put(r1, r0)
                r0 = r19
                r1 = 16
                r2.put(r1, r0)
                r0 = r20
                r1 = 17
                r2.put(r1, r0)
                r0 = r21
                r1 = 18
                r2.put(r1, r0)
                r0 = r22
                r1 = 19
                r2.put(r1, r0)
                return
        }

        MobileSubtype(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype forNumber(int r1) {
                android.util.SparseArray<com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype> r0 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.valueMap
                java.lang.Object r1 = r0.get(r1)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r1 = (com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype) r1
                return r1
        }

        public static com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype> r0 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r1 = (com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype) r1
                return r1
        }

        public static com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype[] values() {
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype[] r0 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype[] r0 = (com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype[]) r0
                return r0
        }

        public int getValue() {
                r1 = this;
                int r0 = r1.value
                return r0
        }
    }

    public enum NetworkType extends java.lang.Enum<com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType> {
        private static final /* synthetic */ com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType[] $VALUES = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType BLUETOOTH = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType DUMMY = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType ETHERNET = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType MOBILE = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType MOBILE_CBS = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType MOBILE_DUN = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType MOBILE_EMERGENCY = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType MOBILE_FOTA = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType MOBILE_HIPRI = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType MOBILE_IA = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType MOBILE_IMS = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType MOBILE_MMS = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType MOBILE_SUPL = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType NONE = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType PROXY = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType VPN = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType WIFI = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType WIFI_P2P = null;
        public static final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType WIMAX = null;
        private static final android.util.SparseArray<com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType> valueMap = null;
        private final int value;

        static {
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r0 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r1 = "MOBILE"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.MOBILE = r0
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r1 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r3 = "WIFI"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.WIFI = r1
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r3 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r5 = "MOBILE_MMS"
                r6 = 2
                r3.<init>(r5, r6, r6)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.MOBILE_MMS = r3
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r5 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r7 = "MOBILE_SUPL"
                r8 = 3
                r5.<init>(r7, r8, r8)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.MOBILE_SUPL = r5
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r7 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r9 = "MOBILE_DUN"
                r10 = 4
                r7.<init>(r9, r10, r10)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.MOBILE_DUN = r7
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r9 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r11 = "MOBILE_HIPRI"
                r12 = 5
                r9.<init>(r11, r12, r12)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.MOBILE_HIPRI = r9
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r11 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r13 = "WIMAX"
                r14 = 6
                r11.<init>(r13, r14, r14)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.WIMAX = r11
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r13 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r15 = "BLUETOOTH"
                r14 = 7
                r13.<init>(r15, r14, r14)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.BLUETOOTH = r13
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r15 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r14 = "DUMMY"
                r12 = 8
                r15.<init>(r14, r12, r12)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.DUMMY = r15
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r14 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r12 = "ETHERNET"
                r10 = 9
                r14.<init>(r12, r10, r10)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.ETHERNET = r14
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r12 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r10 = "MOBILE_FOTA"
                r8 = 10
                r12.<init>(r10, r8, r8)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.MOBILE_FOTA = r12
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r10 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r8 = "MOBILE_IMS"
                r6 = 11
                r10.<init>(r8, r6, r6)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.MOBILE_IMS = r10
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r8 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r6 = "MOBILE_CBS"
                r4 = 12
                r8.<init>(r6, r4, r4)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.MOBILE_CBS = r8
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r6 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r4 = "WIFI_P2P"
                r2 = 13
                r6.<init>(r4, r2, r2)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.WIFI_P2P = r6
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r4 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r2 = "MOBILE_IA"
                r30 = r6
                r6 = 14
                r4.<init>(r2, r6, r6)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.MOBILE_IA = r4
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r2 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r6 = "MOBILE_EMERGENCY"
                r32 = r4
                r4 = 15
                r2.<init>(r6, r4, r4)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.MOBILE_EMERGENCY = r2
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r6 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r4 = "PROXY"
                r34 = r2
                r2 = 16
                r6.<init>(r4, r2, r2)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.PROXY = r6
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r4 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r2 = "VPN"
                r36 = r6
                r6 = 17
                r4.<init>(r2, r6, r6)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.VPN = r4
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r2 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType
                java.lang.String r6 = "NONE"
                r38 = r4
                r4 = 18
                r39 = r8
                r8 = -1
                r2.<init>(r6, r4, r8)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.NONE = r2
                r6 = 19
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType[] r6 = new com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType[r6]
                r28 = 0
                r6[r28] = r0
                r26 = 1
                r6[r26] = r1
                r24 = 2
                r6[r24] = r3
                r22 = 3
                r6[r22] = r5
                r20 = 4
                r6[r20] = r7
                r18 = 5
                r6[r18] = r9
                r16 = 6
                r6[r16] = r11
                r17 = 7
                r6[r17] = r13
                r19 = 8
                r6[r19] = r15
                r21 = 9
                r6[r21] = r14
                r23 = 10
                r6[r23] = r12
                r25 = 11
                r6[r25] = r10
                r27 = 12
                r6[r27] = r39
                r29 = 13
                r6[r29] = r30
                r31 = 14
                r6[r31] = r32
                r33 = 15
                r6[r33] = r34
                r35 = 16
                r6[r35] = r36
                r37 = 17
                r6[r37] = r38
                r6[r4] = r2
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.$VALUES = r6
                android.util.SparseArray r4 = new android.util.SparseArray
                r4.<init>()
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.valueMap = r4
                r6 = 0
                r4.put(r6, r0)
                r0 = 1
                r4.put(r0, r1)
                r0 = 2
                r4.put(r0, r3)
                r0 = 3
                r4.put(r0, r5)
                r0 = 4
                r4.put(r0, r7)
                r0 = 5
                r4.put(r0, r9)
                r0 = 6
                r4.put(r0, r11)
                r0 = 7
                r4.put(r0, r13)
                r0 = 8
                r4.put(r0, r15)
                r0 = 9
                r4.put(r0, r14)
                r0 = 10
                r4.put(r0, r12)
                r0 = 11
                r4.put(r0, r10)
                r0 = r39
                r1 = 12
                r4.put(r1, r0)
                r0 = r30
                r1 = 13
                r4.put(r1, r0)
                r0 = r32
                r1 = 14
                r4.put(r1, r0)
                r0 = r34
                r1 = 15
                r4.put(r1, r0)
                r0 = r36
                r1 = 16
                r4.put(r1, r0)
                r0 = r38
                r1 = 17
                r4.put(r1, r0)
                r4.put(r8, r2)
                return
        }

        NetworkType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType forNumber(int r1) {
                android.util.SparseArray<com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType> r0 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.valueMap
                java.lang.Object r1 = r0.get(r1)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r1 = (com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType) r1
                return r1
        }

        public static com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType> r0 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r1 = (com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType) r1
                return r1
        }

        public static com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType[] values() {
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType[] r0 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType[] r0 = (com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType[]) r0
                return r0
        }

        public int getValue() {
                r1 = this;
                int r0 = r1.value
                return r0
        }
    }

    public NetworkConnectionInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder builder() {
            com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo$Builder r0 = new com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo$Builder
            r0.<init>()
            return r0
    }

    public abstract com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype getMobileSubtype();

    public abstract com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType getNetworkType();
}
