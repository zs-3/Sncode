package androidx.work;

/* loaded from: classes.dex */
public enum ExistingWorkPolicy extends java.lang.Enum<androidx.work.ExistingWorkPolicy> {
    private static final /* synthetic */ androidx.work.ExistingWorkPolicy[] $VALUES = null;
    public static final androidx.work.ExistingWorkPolicy APPEND = null;
    public static final androidx.work.ExistingWorkPolicy APPEND_OR_REPLACE = null;
    public static final androidx.work.ExistingWorkPolicy KEEP = null;
    public static final androidx.work.ExistingWorkPolicy REPLACE = null;

    static {
            androidx.work.ExistingWorkPolicy r0 = new androidx.work.ExistingWorkPolicy
            java.lang.String r1 = "REPLACE"
            r2 = 0
            r0.<init>(r1, r2)
            androidx.work.ExistingWorkPolicy.REPLACE = r0
            androidx.work.ExistingWorkPolicy r1 = new androidx.work.ExistingWorkPolicy
            java.lang.String r3 = "KEEP"
            r4 = 1
            r1.<init>(r3, r4)
            androidx.work.ExistingWorkPolicy.KEEP = r1
            androidx.work.ExistingWorkPolicy r3 = new androidx.work.ExistingWorkPolicy
            java.lang.String r5 = "APPEND"
            r6 = 2
            r3.<init>(r5, r6)
            androidx.work.ExistingWorkPolicy.APPEND = r3
            androidx.work.ExistingWorkPolicy r5 = new androidx.work.ExistingWorkPolicy
            java.lang.String r7 = "APPEND_OR_REPLACE"
            r8 = 3
            r5.<init>(r7, r8)
            androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE = r5
            r7 = 4
            androidx.work.ExistingWorkPolicy[] r7 = new androidx.work.ExistingWorkPolicy[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            androidx.work.ExistingWorkPolicy.$VALUES = r7
            return
    }

    ExistingWorkPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static androidx.work.ExistingWorkPolicy valueOf(java.lang.String r1) {
            java.lang.Class<androidx.work.ExistingWorkPolicy> r0 = androidx.work.ExistingWorkPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            androidx.work.ExistingWorkPolicy r1 = (androidx.work.ExistingWorkPolicy) r1
            return r1
    }

    public static androidx.work.ExistingWorkPolicy[] values() {
            androidx.work.ExistingWorkPolicy[] r0 = androidx.work.ExistingWorkPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            androidx.work.ExistingWorkPolicy[] r0 = (androidx.work.ExistingWorkPolicy[]) r0
            return r0
    }
}
