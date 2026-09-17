package androidx.work;

/* loaded from: classes.dex */
public enum OutOfQuotaPolicy extends java.lang.Enum<androidx.work.OutOfQuotaPolicy> {
    private static final /* synthetic */ androidx.work.OutOfQuotaPolicy[] $VALUES = null;
    public static final androidx.work.OutOfQuotaPolicy DROP_WORK_REQUEST = null;
    public static final androidx.work.OutOfQuotaPolicy RUN_AS_NON_EXPEDITED_WORK_REQUEST = null;

    static {
            androidx.work.OutOfQuotaPolicy r0 = new androidx.work.OutOfQuotaPolicy
            java.lang.String r1 = "RUN_AS_NON_EXPEDITED_WORK_REQUEST"
            r2 = 0
            r0.<init>(r1, r2)
            androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST = r0
            androidx.work.OutOfQuotaPolicy r1 = new androidx.work.OutOfQuotaPolicy
            java.lang.String r3 = "DROP_WORK_REQUEST"
            r4 = 1
            r1.<init>(r3, r4)
            androidx.work.OutOfQuotaPolicy.DROP_WORK_REQUEST = r1
            r3 = 2
            androidx.work.OutOfQuotaPolicy[] r3 = new androidx.work.OutOfQuotaPolicy[r3]
            r3[r2] = r0
            r3[r4] = r1
            androidx.work.OutOfQuotaPolicy.$VALUES = r3
            return
    }

    OutOfQuotaPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static androidx.work.OutOfQuotaPolicy valueOf(java.lang.String r1) {
            java.lang.Class<androidx.work.OutOfQuotaPolicy> r0 = androidx.work.OutOfQuotaPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            androidx.work.OutOfQuotaPolicy r1 = (androidx.work.OutOfQuotaPolicy) r1
            return r1
    }

    public static androidx.work.OutOfQuotaPolicy[] values() {
            androidx.work.OutOfQuotaPolicy[] r0 = androidx.work.OutOfQuotaPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            androidx.work.OutOfQuotaPolicy[] r0 = (androidx.work.OutOfQuotaPolicy[]) r0
            return r0
    }
}
