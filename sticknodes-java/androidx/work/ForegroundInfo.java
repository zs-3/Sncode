package androidx.work;

/* loaded from: classes.dex */
public final class ForegroundInfo {
    private final int mForegroundServiceType;
    private final android.app.Notification mNotification;
    private final int mNotificationId;

    public ForegroundInfo(int r1, android.app.Notification r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.mNotificationId = r1
            r0.mNotification = r2
            r0.mForegroundServiceType = r3
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 == 0) goto L29
            java.lang.Class<androidx.work.ForegroundInfo> r1 = androidx.work.ForegroundInfo.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L10
            goto L29
        L10:
            androidx.work.ForegroundInfo r4 = (androidx.work.ForegroundInfo) r4
            int r1 = r3.mNotificationId
            int r2 = r4.mNotificationId
            if (r1 == r2) goto L19
            return r0
        L19:
            int r1 = r3.mForegroundServiceType
            int r2 = r4.mForegroundServiceType
            if (r1 == r2) goto L20
            return r0
        L20:
            android.app.Notification r0 = r3.mNotification
            android.app.Notification r4 = r4.mNotification
            boolean r4 = r0.equals(r4)
            return r4
        L29:
            return r0
    }

    public int getForegroundServiceType() {
            r1 = this;
            int r0 = r1.mForegroundServiceType
            return r0
    }

    public android.app.Notification getNotification() {
            r1 = this;
            android.app.Notification r0 = r1.mNotification
            return r0
    }

    public int getNotificationId() {
            r1 = this;
            int r0 = r1.mNotificationId
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.mNotificationId
            int r0 = r0 * 31
            int r1 = r2.mForegroundServiceType
            int r0 = r0 + r1
            int r0 = r0 * 31
            android.app.Notification r1 = r2.mNotification
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ForegroundInfo{"
            r0.<init>(r1)
            java.lang.String r1 = "mNotificationId="
            r0.append(r1)
            int r1 = r2.mNotificationId
            r0.append(r1)
            java.lang.String r1 = ", mForegroundServiceType="
            r0.append(r1)
            int r1 = r2.mForegroundServiceType
            r0.append(r1)
            java.lang.String r1 = ", mNotification="
            r0.append(r1)
            android.app.Notification r1 = r2.mNotification
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
