package androidx.work;

/* loaded from: classes.dex */
public abstract class WorkRequest {
    private java.util.UUID mId;
    private java.util.Set<java.lang.String> mTags;
    private androidx.work.impl.model.WorkSpec mWorkSpec;

    public static abstract class Builder<B extends androidx.work.WorkRequest.Builder<?, ?>, W extends androidx.work.WorkRequest> {
        boolean mBackoffCriteriaSet;
        java.util.UUID mId;
        java.util.Set<java.lang.String> mTags;
        androidx.work.impl.model.WorkSpec mWorkSpec;
        java.lang.Class<? extends androidx.work.ListenableWorker> mWorkerClass;

        Builder(java.lang.Class<? extends androidx.work.ListenableWorker> r4) {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.mBackoffCriteriaSet = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r3.mTags = r0
                java.util.UUID r0 = java.util.UUID.randomUUID()
                r3.mId = r0
                r3.mWorkerClass = r4
                androidx.work.impl.model.WorkSpec r0 = new androidx.work.impl.model.WorkSpec
                java.util.UUID r1 = r3.mId
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = r4.getName()
                r0.<init>(r1, r2)
                r3.mWorkSpec = r0
                java.lang.String r4 = r4.getName()
                r3.addTag(r4)
                return
        }

        public final B addTag(java.lang.String r2) {
                r1 = this;
                java.util.Set<java.lang.String> r0 = r1.mTags
                r0.add(r2)
                androidx.work.WorkRequest$Builder r2 = r1.getThis()
                return r2
        }

        public final W build() {
                r4 = this;
                androidx.work.WorkRequest r0 = r4.buildInternal()
                androidx.work.impl.model.WorkSpec r1 = r4.mWorkSpec
                androidx.work.Constraints r1 = r1.constraints
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 24
                if (r2 < r3) goto L14
                boolean r3 = r1.hasContentUriTriggers()
                if (r3 != 0) goto L2d
            L14:
                boolean r3 = r1.requiresBatteryNotLow()
                if (r3 != 0) goto L2d
                boolean r3 = r1.requiresCharging()
                if (r3 != 0) goto L2d
                r3 = 23
                if (r2 < r3) goto L2b
                boolean r1 = r1.requiresDeviceIdle()
                if (r1 == 0) goto L2b
                goto L2d
            L2b:
                r1 = 0
                goto L2e
            L2d:
                r1 = 1
            L2e:
                androidx.work.impl.model.WorkSpec r2 = r4.mWorkSpec
                boolean r2 = r2.expedited
                if (r2 == 0) goto L3f
                if (r1 != 0) goto L37
                goto L3f
            L37:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expedited jobs only support network and storage constraints"
                r0.<init>(r1)
                throw r0
            L3f:
                java.util.UUID r1 = java.util.UUID.randomUUID()
                r4.mId = r1
                androidx.work.impl.model.WorkSpec r1 = new androidx.work.impl.model.WorkSpec
                androidx.work.impl.model.WorkSpec r2 = r4.mWorkSpec
                r1.<init>(r2)
                r4.mWorkSpec = r1
                java.util.UUID r2 = r4.mId
                java.lang.String r2 = r2.toString()
                r1.id = r2
                return r0
        }

        abstract W buildInternal();

        abstract B getThis();

        public final B setConstraints(androidx.work.Constraints r2) {
                r1 = this;
                androidx.work.impl.model.WorkSpec r0 = r1.mWorkSpec
                r0.constraints = r2
                androidx.work.WorkRequest$Builder r2 = r1.getThis()
                return r2
        }

        public final B setInputData(androidx.work.Data r2) {
                r1 = this;
                androidx.work.impl.model.WorkSpec r0 = r1.mWorkSpec
                r0.input = r2
                androidx.work.WorkRequest$Builder r2 = r1.getThis()
                return r2
        }
    }

    protected WorkRequest(java.util.UUID r1, androidx.work.impl.model.WorkSpec r2, java.util.Set<java.lang.String> r3) {
            r0 = this;
            r0.<init>()
            r0.mId = r1
            r0.mWorkSpec = r2
            r0.mTags = r3
            return
    }

    public java.lang.String getStringId() {
            r1 = this;
            java.util.UUID r0 = r1.mId
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.util.Set<java.lang.String> getTags() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.mTags
            return r0
    }

    public androidx.work.impl.model.WorkSpec getWorkSpec() {
            r1 = this;
            androidx.work.impl.model.WorkSpec r0 = r1.mWorkSpec
            return r0
    }
}
