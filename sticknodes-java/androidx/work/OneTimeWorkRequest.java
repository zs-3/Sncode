package androidx.work;

/* loaded from: classes.dex */
public final class OneTimeWorkRequest extends androidx.work.WorkRequest {

    public static final class Builder extends androidx.work.WorkRequest.Builder<androidx.work.OneTimeWorkRequest.Builder, androidx.work.OneTimeWorkRequest> {
        public Builder(java.lang.Class<? extends androidx.work.ListenableWorker> r2) {
                r1 = this;
                r1.<init>(r2)
                androidx.work.impl.model.WorkSpec r2 = r1.mWorkSpec
                java.lang.Class<androidx.work.OverwritingInputMerger> r0 = androidx.work.OverwritingInputMerger.class
                java.lang.String r0 = r0.getName()
                r2.inputMergerClassName = r0
                return
        }

        @Override // androidx.work.WorkRequest.Builder
        androidx.work.OneTimeWorkRequest buildInternal() {
                r2 = this;
                boolean r0 = r2.mBackoffCriteriaSet
                if (r0 == 0) goto L1d
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto L1d
                androidx.work.impl.model.WorkSpec r0 = r2.mWorkSpec
                androidx.work.Constraints r0 = r0.constraints
                boolean r0 = r0.requiresDeviceIdle()
                if (r0 != 0) goto L15
                goto L1d
            L15:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Cannot set backoff criteria on an idle mode job"
                r0.<init>(r1)
                throw r0
            L1d:
                androidx.work.OneTimeWorkRequest r0 = new androidx.work.OneTimeWorkRequest
                r0.<init>(r2)
                return r0
        }

        @Override // androidx.work.WorkRequest.Builder
        /* bridge */ /* synthetic */ androidx.work.WorkRequest buildInternal() {
                r1 = this;
                androidx.work.OneTimeWorkRequest r0 = r1.buildInternal()
                return r0
        }

        @Override // androidx.work.WorkRequest.Builder
        androidx.work.OneTimeWorkRequest.Builder getThis() {
                r0 = this;
                return r0
        }

        @Override // androidx.work.WorkRequest.Builder
        /* bridge */ /* synthetic */ androidx.work.WorkRequest.Builder getThis() {
                r1 = this;
                androidx.work.OneTimeWorkRequest$Builder r0 = r1.getThis()
                return r0
        }
    }

    OneTimeWorkRequest(androidx.work.OneTimeWorkRequest.Builder r3) {
            r2 = this;
            java.util.UUID r0 = r3.mId
            androidx.work.impl.model.WorkSpec r1 = r3.mWorkSpec
            java.util.Set<java.lang.String> r3 = r3.mTags
            r2.<init>(r0, r1, r3)
            return
    }

    public static androidx.work.OneTimeWorkRequest from(java.lang.Class<? extends androidx.work.ListenableWorker> r1) {
            androidx.work.OneTimeWorkRequest$Builder r0 = new androidx.work.OneTimeWorkRequest$Builder
            r0.<init>(r1)
            androidx.work.WorkRequest r1 = r0.build()
            androidx.work.OneTimeWorkRequest r1 = (androidx.work.OneTimeWorkRequest) r1
            return r1
    }
}
