package com.google.android.datatransport.cct.internal;

/* loaded from: classes.dex */
public enum QosTier extends java.lang.Enum<com.google.android.datatransport.cct.internal.QosTier> {
    private static final /* synthetic */ com.google.android.datatransport.cct.internal.QosTier[] $VALUES = null;
    public static final com.google.android.datatransport.cct.internal.QosTier DEFAULT = null;
    public static final com.google.android.datatransport.cct.internal.QosTier FAST_IF_RADIO_AWAKE = null;
    public static final com.google.android.datatransport.cct.internal.QosTier NEVER = null;
    public static final com.google.android.datatransport.cct.internal.QosTier UNMETERED_ONLY = null;
    public static final com.google.android.datatransport.cct.internal.QosTier UNMETERED_OR_DAILY = null;
    public static final com.google.android.datatransport.cct.internal.QosTier UNRECOGNIZED = null;
    private static final android.util.SparseArray<com.google.android.datatransport.cct.internal.QosTier> valueMap = null;
    private final int value;

    static {
            com.google.android.datatransport.cct.internal.QosTier r0 = new com.google.android.datatransport.cct.internal.QosTier
            java.lang.String r1 = "DEFAULT"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.datatransport.cct.internal.QosTier.DEFAULT = r0
            com.google.android.datatransport.cct.internal.QosTier r1 = new com.google.android.datatransport.cct.internal.QosTier
            java.lang.String r3 = "UNMETERED_ONLY"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.datatransport.cct.internal.QosTier.UNMETERED_ONLY = r1
            com.google.android.datatransport.cct.internal.QosTier r3 = new com.google.android.datatransport.cct.internal.QosTier
            java.lang.String r5 = "UNMETERED_OR_DAILY"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.google.android.datatransport.cct.internal.QosTier.UNMETERED_OR_DAILY = r3
            com.google.android.datatransport.cct.internal.QosTier r5 = new com.google.android.datatransport.cct.internal.QosTier
            java.lang.String r7 = "FAST_IF_RADIO_AWAKE"
            r8 = 3
            r5.<init>(r7, r8, r8)
            com.google.android.datatransport.cct.internal.QosTier.FAST_IF_RADIO_AWAKE = r5
            com.google.android.datatransport.cct.internal.QosTier r7 = new com.google.android.datatransport.cct.internal.QosTier
            java.lang.String r9 = "NEVER"
            r10 = 4
            r7.<init>(r9, r10, r10)
            com.google.android.datatransport.cct.internal.QosTier.NEVER = r7
            com.google.android.datatransport.cct.internal.QosTier r9 = new com.google.android.datatransport.cct.internal.QosTier
            java.lang.String r11 = "UNRECOGNIZED"
            r12 = 5
            r13 = -1
            r9.<init>(r11, r12, r13)
            com.google.android.datatransport.cct.internal.QosTier.UNRECOGNIZED = r9
            r11 = 6
            com.google.android.datatransport.cct.internal.QosTier[] r11 = new com.google.android.datatransport.cct.internal.QosTier[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            com.google.android.datatransport.cct.internal.QosTier.$VALUES = r11
            android.util.SparseArray r11 = new android.util.SparseArray
            r11.<init>()
            com.google.android.datatransport.cct.internal.QosTier.valueMap = r11
            r11.put(r2, r0)
            r11.put(r4, r1)
            r11.put(r6, r3)
            r11.put(r8, r5)
            r11.put(r10, r7)
            r11.put(r13, r9)
            return
    }

    QosTier(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.google.android.datatransport.cct.internal.QosTier forNumber(int r1) {
            if (r1 == 0) goto L1c
            r0 = 1
            if (r1 == r0) goto L19
            r0 = 2
            if (r1 == r0) goto L16
            r0 = 3
            if (r1 == r0) goto L13
            r0 = 4
            if (r1 == r0) goto L10
            r1 = 0
            return r1
        L10:
            com.google.android.datatransport.cct.internal.QosTier r1 = com.google.android.datatransport.cct.internal.QosTier.NEVER
            return r1
        L13:
            com.google.android.datatransport.cct.internal.QosTier r1 = com.google.android.datatransport.cct.internal.QosTier.FAST_IF_RADIO_AWAKE
            return r1
        L16:
            com.google.android.datatransport.cct.internal.QosTier r1 = com.google.android.datatransport.cct.internal.QosTier.UNMETERED_OR_DAILY
            return r1
        L19:
            com.google.android.datatransport.cct.internal.QosTier r1 = com.google.android.datatransport.cct.internal.QosTier.UNMETERED_ONLY
            return r1
        L1c:
            com.google.android.datatransport.cct.internal.QosTier r1 = com.google.android.datatransport.cct.internal.QosTier.DEFAULT
            return r1
    }

    public static com.google.android.datatransport.cct.internal.QosTier valueOf(java.lang.String r1) {
            java.lang.Class<com.google.android.datatransport.cct.internal.QosTier> r0 = com.google.android.datatransport.cct.internal.QosTier.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.android.datatransport.cct.internal.QosTier r1 = (com.google.android.datatransport.cct.internal.QosTier) r1
            return r1
    }

    public static com.google.android.datatransport.cct.internal.QosTier[] values() {
            com.google.android.datatransport.cct.internal.QosTier[] r0 = com.google.android.datatransport.cct.internal.QosTier.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.android.datatransport.cct.internal.QosTier[] r0 = (com.google.android.datatransport.cct.internal.QosTier[]) r0
            return r0
    }

    public final int getNumber() {
            r1 = this;
            int r0 = r1.value
            return r0
    }
}
