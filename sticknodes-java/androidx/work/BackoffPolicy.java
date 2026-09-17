package androidx.work;

/* loaded from: classes.dex */
public enum BackoffPolicy extends java.lang.Enum<androidx.work.BackoffPolicy> {
    private static final /* synthetic */ androidx.work.BackoffPolicy[] $VALUES = null;
    public static final androidx.work.BackoffPolicy EXPONENTIAL = null;
    public static final androidx.work.BackoffPolicy LINEAR = null;

    static {
            androidx.work.BackoffPolicy r0 = new androidx.work.BackoffPolicy
            java.lang.String r1 = "EXPONENTIAL"
            r2 = 0
            r0.<init>(r1, r2)
            androidx.work.BackoffPolicy.EXPONENTIAL = r0
            androidx.work.BackoffPolicy r1 = new androidx.work.BackoffPolicy
            java.lang.String r3 = "LINEAR"
            r4 = 1
            r1.<init>(r3, r4)
            androidx.work.BackoffPolicy.LINEAR = r1
            r3 = 2
            androidx.work.BackoffPolicy[] r3 = new androidx.work.BackoffPolicy[r3]
            r3[r2] = r0
            r3[r4] = r1
            androidx.work.BackoffPolicy.$VALUES = r3
            return
    }

    BackoffPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static androidx.work.BackoffPolicy valueOf(java.lang.String r1) {
            java.lang.Class<androidx.work.BackoffPolicy> r0 = androidx.work.BackoffPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            androidx.work.BackoffPolicy r1 = (androidx.work.BackoffPolicy) r1
            return r1
    }

    public static androidx.work.BackoffPolicy[] values() {
            androidx.work.BackoffPolicy[] r0 = androidx.work.BackoffPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            androidx.work.BackoffPolicy[] r0 = (androidx.work.BackoffPolicy[]) r0
            return r0
    }
}
