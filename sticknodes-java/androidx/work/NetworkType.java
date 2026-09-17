package androidx.work;

/* loaded from: classes.dex */
public enum NetworkType extends java.lang.Enum<androidx.work.NetworkType> {
    private static final /* synthetic */ androidx.work.NetworkType[] $VALUES = null;
    public static final androidx.work.NetworkType CONNECTED = null;
    public static final androidx.work.NetworkType METERED = null;
    public static final androidx.work.NetworkType NOT_REQUIRED = null;
    public static final androidx.work.NetworkType NOT_ROAMING = null;
    public static final androidx.work.NetworkType TEMPORARILY_UNMETERED = null;
    public static final androidx.work.NetworkType UNMETERED = null;

    static {
            androidx.work.NetworkType r0 = new androidx.work.NetworkType
            java.lang.String r1 = "NOT_REQUIRED"
            r2 = 0
            r0.<init>(r1, r2)
            androidx.work.NetworkType.NOT_REQUIRED = r0
            androidx.work.NetworkType r1 = new androidx.work.NetworkType
            java.lang.String r3 = "CONNECTED"
            r4 = 1
            r1.<init>(r3, r4)
            androidx.work.NetworkType.CONNECTED = r1
            androidx.work.NetworkType r3 = new androidx.work.NetworkType
            java.lang.String r5 = "UNMETERED"
            r6 = 2
            r3.<init>(r5, r6)
            androidx.work.NetworkType.UNMETERED = r3
            androidx.work.NetworkType r5 = new androidx.work.NetworkType
            java.lang.String r7 = "NOT_ROAMING"
            r8 = 3
            r5.<init>(r7, r8)
            androidx.work.NetworkType.NOT_ROAMING = r5
            androidx.work.NetworkType r7 = new androidx.work.NetworkType
            java.lang.String r9 = "METERED"
            r10 = 4
            r7.<init>(r9, r10)
            androidx.work.NetworkType.METERED = r7
            androidx.work.NetworkType r9 = new androidx.work.NetworkType
            java.lang.String r11 = "TEMPORARILY_UNMETERED"
            r12 = 5
            r9.<init>(r11, r12)
            androidx.work.NetworkType.TEMPORARILY_UNMETERED = r9
            r11 = 6
            androidx.work.NetworkType[] r11 = new androidx.work.NetworkType[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            androidx.work.NetworkType.$VALUES = r11
            return
    }

    NetworkType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static androidx.work.NetworkType valueOf(java.lang.String r1) {
            java.lang.Class<androidx.work.NetworkType> r0 = androidx.work.NetworkType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            androidx.work.NetworkType r1 = (androidx.work.NetworkType) r1
            return r1
    }

    public static androidx.work.NetworkType[] values() {
            androidx.work.NetworkType[] r0 = androidx.work.NetworkType.$VALUES
            java.lang.Object r0 = r0.clone()
            androidx.work.NetworkType[] r0 = (androidx.work.NetworkType[]) r0
            return r0
    }
}
