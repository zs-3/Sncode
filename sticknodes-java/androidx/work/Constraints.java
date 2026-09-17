package androidx.work;

/* loaded from: classes.dex */
public final class Constraints {
    public static final androidx.work.Constraints NONE = null;
    private androidx.work.ContentUriTriggers mContentUriTriggers;
    private androidx.work.NetworkType mRequiredNetworkType;
    private boolean mRequiresBatteryNotLow;
    private boolean mRequiresCharging;
    private boolean mRequiresDeviceIdle;
    private boolean mRequiresStorageNotLow;
    private long mTriggerContentUpdateDelay;
    private long mTriggerMaxContentDelay;

    public static final class Builder {
        androidx.work.ContentUriTriggers mContentUriTriggers;
        androidx.work.NetworkType mRequiredNetworkType;
        boolean mRequiresBatteryNotLow;
        boolean mRequiresCharging;
        boolean mRequiresDeviceIdle;
        boolean mRequiresStorageNotLow;
        long mTriggerContentMaxDelay;
        long mTriggerContentUpdateDelay;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mRequiresCharging = r0
                r2.mRequiresDeviceIdle = r0
                androidx.work.NetworkType r1 = androidx.work.NetworkType.NOT_REQUIRED
                r2.mRequiredNetworkType = r1
                r2.mRequiresBatteryNotLow = r0
                r2.mRequiresStorageNotLow = r0
                r0 = -1
                r2.mTriggerContentUpdateDelay = r0
                r2.mTriggerContentMaxDelay = r0
                androidx.work.ContentUriTriggers r0 = new androidx.work.ContentUriTriggers
                r0.<init>()
                r2.mContentUriTriggers = r0
                return
        }

        public androidx.work.Constraints build() {
                r1 = this;
                androidx.work.Constraints r0 = new androidx.work.Constraints
                r0.<init>(r1)
                return r0
        }

        public androidx.work.Constraints.Builder setRequiredNetworkType(androidx.work.NetworkType r1) {
                r0 = this;
                r0.mRequiredNetworkType = r1
                return r0
        }
    }

    static {
            androidx.work.Constraints$Builder r0 = new androidx.work.Constraints$Builder
            r0.<init>()
            androidx.work.Constraints r0 = r0.build()
            androidx.work.Constraints.NONE = r0
            return
    }

    public Constraints() {
            r2 = this;
            r2.<init>()
            androidx.work.NetworkType r0 = androidx.work.NetworkType.NOT_REQUIRED
            r2.mRequiredNetworkType = r0
            r0 = -1
            r2.mTriggerContentUpdateDelay = r0
            r2.mTriggerMaxContentDelay = r0
            androidx.work.ContentUriTriggers r0 = new androidx.work.ContentUriTriggers
            r0.<init>()
            r2.mContentUriTriggers = r0
            return
    }

    Constraints(androidx.work.Constraints.Builder r3) {
            r2 = this;
            r2.<init>()
            androidx.work.NetworkType r0 = androidx.work.NetworkType.NOT_REQUIRED
            r2.mRequiredNetworkType = r0
            r0 = -1
            r2.mTriggerContentUpdateDelay = r0
            r2.mTriggerMaxContentDelay = r0
            androidx.work.ContentUriTriggers r0 = new androidx.work.ContentUriTriggers
            r0.<init>()
            r2.mContentUriTriggers = r0
            boolean r0 = r3.mRequiresCharging
            r2.mRequiresCharging = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L24
            boolean r1 = r3.mRequiresDeviceIdle
            if (r1 == 0) goto L24
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            r2.mRequiresDeviceIdle = r1
            androidx.work.NetworkType r1 = r3.mRequiredNetworkType
            r2.mRequiredNetworkType = r1
            boolean r1 = r3.mRequiresBatteryNotLow
            r2.mRequiresBatteryNotLow = r1
            boolean r1 = r3.mRequiresStorageNotLow
            r2.mRequiresStorageNotLow = r1
            r1 = 24
            if (r0 < r1) goto L43
            androidx.work.ContentUriTriggers r0 = r3.mContentUriTriggers
            r2.mContentUriTriggers = r0
            long r0 = r3.mTriggerContentUpdateDelay
            r2.mTriggerContentUpdateDelay = r0
            long r0 = r3.mTriggerContentMaxDelay
            r2.mTriggerMaxContentDelay = r0
        L43:
            return
    }

    public Constraints(androidx.work.Constraints r3) {
            r2 = this;
            r2.<init>()
            androidx.work.NetworkType r0 = androidx.work.NetworkType.NOT_REQUIRED
            r2.mRequiredNetworkType = r0
            r0 = -1
            r2.mTriggerContentUpdateDelay = r0
            r2.mTriggerMaxContentDelay = r0
            androidx.work.ContentUriTriggers r0 = new androidx.work.ContentUriTriggers
            r0.<init>()
            r2.mContentUriTriggers = r0
            boolean r0 = r3.mRequiresCharging
            r2.mRequiresCharging = r0
            boolean r0 = r3.mRequiresDeviceIdle
            r2.mRequiresDeviceIdle = r0
            androidx.work.NetworkType r0 = r3.mRequiredNetworkType
            r2.mRequiredNetworkType = r0
            boolean r0 = r3.mRequiresBatteryNotLow
            r2.mRequiresBatteryNotLow = r0
            boolean r0 = r3.mRequiresStorageNotLow
            r2.mRequiresStorageNotLow = r0
            androidx.work.ContentUriTriggers r3 = r3.mContentUriTriggers
            r2.mContentUriTriggers = r3
            return
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 != r7) goto L4
            r7 = 1
            return r7
        L4:
            r0 = 0
            if (r7 == 0) goto L50
            java.lang.Class<androidx.work.Constraints> r1 = androidx.work.Constraints.class
            java.lang.Class r2 = r7.getClass()
            if (r1 == r2) goto L10
            goto L50
        L10:
            androidx.work.Constraints r7 = (androidx.work.Constraints) r7
            boolean r1 = r6.mRequiresCharging
            boolean r2 = r7.mRequiresCharging
            if (r1 == r2) goto L19
            return r0
        L19:
            boolean r1 = r6.mRequiresDeviceIdle
            boolean r2 = r7.mRequiresDeviceIdle
            if (r1 == r2) goto L20
            return r0
        L20:
            boolean r1 = r6.mRequiresBatteryNotLow
            boolean r2 = r7.mRequiresBatteryNotLow
            if (r1 == r2) goto L27
            return r0
        L27:
            boolean r1 = r6.mRequiresStorageNotLow
            boolean r2 = r7.mRequiresStorageNotLow
            if (r1 == r2) goto L2e
            return r0
        L2e:
            long r1 = r6.mTriggerContentUpdateDelay
            long r3 = r7.mTriggerContentUpdateDelay
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L37
            return r0
        L37:
            long r1 = r6.mTriggerMaxContentDelay
            long r3 = r7.mTriggerMaxContentDelay
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L40
            return r0
        L40:
            androidx.work.NetworkType r1 = r6.mRequiredNetworkType
            androidx.work.NetworkType r2 = r7.mRequiredNetworkType
            if (r1 == r2) goto L47
            return r0
        L47:
            androidx.work.ContentUriTriggers r0 = r6.mContentUriTriggers
            androidx.work.ContentUriTriggers r7 = r7.mContentUriTriggers
            boolean r7 = r0.equals(r7)
            return r7
        L50:
            return r0
    }

    public androidx.work.ContentUriTriggers getContentUriTriggers() {
            r1 = this;
            androidx.work.ContentUriTriggers r0 = r1.mContentUriTriggers
            return r0
    }

    public androidx.work.NetworkType getRequiredNetworkType() {
            r1 = this;
            androidx.work.NetworkType r0 = r1.mRequiredNetworkType
            return r0
    }

    public long getTriggerContentUpdateDelay() {
            r2 = this;
            long r0 = r2.mTriggerContentUpdateDelay
            return r0
    }

    public long getTriggerMaxContentDelay() {
            r2 = this;
            long r0 = r2.mTriggerMaxContentDelay
            return r0
    }

    public boolean hasContentUriTriggers() {
            r1 = this;
            androidx.work.ContentUriTriggers r0 = r1.mContentUriTriggers
            int r0 = r0.size()
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public int hashCode() {
            r6 = this;
            androidx.work.NetworkType r0 = r6.mRequiredNetworkType
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r6.mRequiresCharging
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r6.mRequiresDeviceIdle
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r6.mRequiresBatteryNotLow
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r6.mRequiresStorageNotLow
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r6.mTriggerContentUpdateDelay
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r6.mTriggerMaxContentDelay
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            androidx.work.ContentUriTriggers r1 = r6.mContentUriTriggers
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public boolean requiresBatteryNotLow() {
            r1 = this;
            boolean r0 = r1.mRequiresBatteryNotLow
            return r0
    }

    public boolean requiresCharging() {
            r1 = this;
            boolean r0 = r1.mRequiresCharging
            return r0
    }

    public boolean requiresDeviceIdle() {
            r1 = this;
            boolean r0 = r1.mRequiresDeviceIdle
            return r0
    }

    public boolean requiresStorageNotLow() {
            r1 = this;
            boolean r0 = r1.mRequiresStorageNotLow
            return r0
    }

    public void setContentUriTriggers(androidx.work.ContentUriTriggers r1) {
            r0 = this;
            r0.mContentUriTriggers = r1
            return
    }

    public void setRequiredNetworkType(androidx.work.NetworkType r1) {
            r0 = this;
            r0.mRequiredNetworkType = r1
            return
    }

    public void setRequiresBatteryNotLow(boolean r1) {
            r0 = this;
            r0.mRequiresBatteryNotLow = r1
            return
    }

    public void setRequiresCharging(boolean r1) {
            r0 = this;
            r0.mRequiresCharging = r1
            return
    }

    public void setRequiresDeviceIdle(boolean r1) {
            r0 = this;
            r0.mRequiresDeviceIdle = r1
            return
    }

    public void setRequiresStorageNotLow(boolean r1) {
            r0 = this;
            r0.mRequiresStorageNotLow = r1
            return
    }

    public void setTriggerContentUpdateDelay(long r1) {
            r0 = this;
            r0.mTriggerContentUpdateDelay = r1
            return
    }

    public void setTriggerMaxContentDelay(long r1) {
            r0 = this;
            r0.mTriggerMaxContentDelay = r1
            return
    }
}
