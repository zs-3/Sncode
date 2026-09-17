package com.google.android.datatransport;

/* loaded from: classes.dex */
public enum Priority extends java.lang.Enum<com.google.android.datatransport.Priority> {
    private static final /* synthetic */ com.google.android.datatransport.Priority[] $VALUES = null;
    public static final com.google.android.datatransport.Priority DEFAULT = null;
    public static final com.google.android.datatransport.Priority HIGHEST = null;
    public static final com.google.android.datatransport.Priority VERY_LOW = null;

    static {
            com.google.android.datatransport.Priority r0 = new com.google.android.datatransport.Priority
            java.lang.String r1 = "DEFAULT"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.datatransport.Priority.DEFAULT = r0
            com.google.android.datatransport.Priority r1 = new com.google.android.datatransport.Priority
            java.lang.String r3 = "VERY_LOW"
            r4 = 1
            r1.<init>(r3, r4)
            com.google.android.datatransport.Priority.VERY_LOW = r1
            com.google.android.datatransport.Priority r3 = new com.google.android.datatransport.Priority
            java.lang.String r5 = "HIGHEST"
            r6 = 2
            r3.<init>(r5, r6)
            com.google.android.datatransport.Priority.HIGHEST = r3
            r5 = 3
            com.google.android.datatransport.Priority[] r5 = new com.google.android.datatransport.Priority[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.google.android.datatransport.Priority.$VALUES = r5
            return
    }

    Priority(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.android.datatransport.Priority valueOf(java.lang.String r1) {
            java.lang.Class<com.google.android.datatransport.Priority> r0 = com.google.android.datatransport.Priority.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.android.datatransport.Priority r1 = (com.google.android.datatransport.Priority) r1
            return r1
    }

    public static com.google.android.datatransport.Priority[] values() {
            com.google.android.datatransport.Priority[] r0 = com.google.android.datatransport.Priority.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.android.datatransport.Priority[] r0 = (com.google.android.datatransport.Priority[]) r0
            return r0
    }
}
