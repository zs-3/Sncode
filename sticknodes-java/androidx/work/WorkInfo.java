package androidx.work;

/* loaded from: classes.dex */
public final class WorkInfo {
    private java.util.UUID mId;
    private androidx.work.Data mOutputData;
    private androidx.work.Data mProgress;
    private int mRunAttemptCount;
    private androidx.work.WorkInfo.State mState;
    private java.util.Set<java.lang.String> mTags;

    public enum State extends java.lang.Enum<androidx.work.WorkInfo.State> {
        private static final /* synthetic */ androidx.work.WorkInfo.State[] $VALUES = null;
        public static final androidx.work.WorkInfo.State BLOCKED = null;
        public static final androidx.work.WorkInfo.State CANCELLED = null;
        public static final androidx.work.WorkInfo.State ENQUEUED = null;
        public static final androidx.work.WorkInfo.State FAILED = null;
        public static final androidx.work.WorkInfo.State RUNNING = null;
        public static final androidx.work.WorkInfo.State SUCCEEDED = null;

        static {
                androidx.work.WorkInfo$State r0 = new androidx.work.WorkInfo$State
                java.lang.String r1 = "ENQUEUED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.work.WorkInfo.State.ENQUEUED = r0
                androidx.work.WorkInfo$State r1 = new androidx.work.WorkInfo$State
                java.lang.String r3 = "RUNNING"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.work.WorkInfo.State.RUNNING = r1
                androidx.work.WorkInfo$State r3 = new androidx.work.WorkInfo$State
                java.lang.String r5 = "SUCCEEDED"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.work.WorkInfo.State.SUCCEEDED = r3
                androidx.work.WorkInfo$State r5 = new androidx.work.WorkInfo$State
                java.lang.String r7 = "FAILED"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.work.WorkInfo.State.FAILED = r5
                androidx.work.WorkInfo$State r7 = new androidx.work.WorkInfo$State
                java.lang.String r9 = "BLOCKED"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.work.WorkInfo.State.BLOCKED = r7
                androidx.work.WorkInfo$State r9 = new androidx.work.WorkInfo$State
                java.lang.String r11 = "CANCELLED"
                r12 = 5
                r9.<init>(r11, r12)
                androidx.work.WorkInfo.State.CANCELLED = r9
                r11 = 6
                androidx.work.WorkInfo$State[] r11 = new androidx.work.WorkInfo.State[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                androidx.work.WorkInfo.State.$VALUES = r11
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.work.WorkInfo.State valueOf(java.lang.String r1) {
                java.lang.Class<androidx.work.WorkInfo$State> r0 = androidx.work.WorkInfo.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.work.WorkInfo$State r1 = (androidx.work.WorkInfo.State) r1
                return r1
        }

        public static androidx.work.WorkInfo.State[] values() {
                androidx.work.WorkInfo$State[] r0 = androidx.work.WorkInfo.State.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.work.WorkInfo$State[] r0 = (androidx.work.WorkInfo.State[]) r0
                return r0
        }

        public boolean isFinished() {
                r1 = this;
                androidx.work.WorkInfo$State r0 = androidx.work.WorkInfo.State.SUCCEEDED
                if (r1 == r0) goto Lf
                androidx.work.WorkInfo$State r0 = androidx.work.WorkInfo.State.FAILED
                if (r1 == r0) goto Lf
                androidx.work.WorkInfo$State r0 = androidx.work.WorkInfo.State.CANCELLED
                if (r1 != r0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }
    }

    public WorkInfo(java.util.UUID r1, androidx.work.WorkInfo.State r2, androidx.work.Data r3, java.util.List<java.lang.String> r4, androidx.work.Data r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.mId = r1
            r0.mState = r2
            r0.mOutputData = r3
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r4)
            r0.mTags = r1
            r0.mProgress = r5
            r0.mRunAttemptCount = r6
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 == 0) goto L4a
            java.lang.Class<androidx.work.WorkInfo> r1 = androidx.work.WorkInfo.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L10
            goto L4a
        L10:
            androidx.work.WorkInfo r4 = (androidx.work.WorkInfo) r4
            int r1 = r3.mRunAttemptCount
            int r2 = r4.mRunAttemptCount
            if (r1 == r2) goto L19
            return r0
        L19:
            java.util.UUID r1 = r3.mId
            java.util.UUID r2 = r4.mId
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L24
            return r0
        L24:
            androidx.work.WorkInfo$State r1 = r3.mState
            androidx.work.WorkInfo$State r2 = r4.mState
            if (r1 == r2) goto L2b
            return r0
        L2b:
            androidx.work.Data r1 = r3.mOutputData
            androidx.work.Data r2 = r4.mOutputData
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L36
            return r0
        L36:
            java.util.Set<java.lang.String> r1 = r3.mTags
            java.util.Set<java.lang.String> r2 = r4.mTags
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L41
            return r0
        L41:
            androidx.work.Data r0 = r3.mProgress
            androidx.work.Data r4 = r4.mProgress
            boolean r4 = r0.equals(r4)
            return r4
        L4a:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.util.UUID r0 = r2.mId
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            androidx.work.WorkInfo$State r1 = r2.mState
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            androidx.work.Data r1 = r2.mOutputData
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.Set<java.lang.String> r1 = r2.mTags
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            androidx.work.Data r1 = r2.mProgress
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.mRunAttemptCount
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "WorkInfo{mId='"
            r0.append(r1)
            java.util.UUID r1 = r2.mId
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", mState="
            r0.append(r1)
            androidx.work.WorkInfo$State r1 = r2.mState
            r0.append(r1)
            java.lang.String r1 = ", mOutputData="
            r0.append(r1)
            androidx.work.Data r1 = r2.mOutputData
            r0.append(r1)
            java.lang.String r1 = ", mTags="
            r0.append(r1)
            java.util.Set<java.lang.String> r1 = r2.mTags
            r0.append(r1)
            java.lang.String r1 = ", mProgress="
            r0.append(r1)
            androidx.work.Data r1 = r2.mProgress
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
