package com.google.firebase.crashlytics.internal.concurrency;

/* compiled from: CrashlyticsWorkers.kt */
/* loaded from: classes2.dex */
public final class CrashlyticsWorkers {
    public static final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion Companion = null;
    private static boolean enforcement;
    public final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker common;
    public final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker dataCollect;
    public final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker diskWrite;
    public final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker network;

    /* compiled from: CrashlyticsWorkers.kt */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ java.lang.String access$getThreadName(com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion r0) {
                java.lang.String r0 = r0.getThreadName()
                return r0
        }

        public static final /* synthetic */ boolean access$isBackgroundThread(com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion r0) {
                boolean r0 = r0.isBackgroundThread()
                return r0
        }

        public static final /* synthetic */ boolean access$isBlockingThread(com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion r0) {
                boolean r0 = r0.isBlockingThread()
                return r0
        }

        public static final /* synthetic */ boolean access$isNotMainThread(com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion r0) {
                boolean r0 = r0.isNotMainThread()
                return r0
        }

        private final void checkThread(kotlin.jvm.functions.Function0<java.lang.Boolean> r1, kotlin.jvm.functions.Function0<java.lang.String> r2) {
                r0 = this;
                java.lang.Object r1 = r1.invoke()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L1c
                com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
                java.lang.Object r2 = r2.invoke()
                java.lang.String r2 = (java.lang.String) r2
                r1.d(r2)
                r0.getEnforcement()
            L1c:
                return
        }

        private final java.lang.String getThreadName() {
                r1 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.String r0 = r0.getName()
                return r0
        }

        private final boolean isBackgroundThread() {
                r5 = this;
                java.lang.String r0 = r5.getThreadName()
                java.lang.String r1 = "threadName"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.String r1 = "Firebase Background Thread #"
                r2 = 0
                r3 = 2
                r4 = 0
                boolean r0 = kotlin.text.StringsKt.contains$default(r0, r1, r2, r3, r4)
                return r0
        }

        private final boolean isBlockingThread() {
                r5 = this;
                java.lang.String r0 = r5.getThreadName()
                java.lang.String r1 = "threadName"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.String r1 = "Firebase Blocking Thread #"
                r2 = 0
                r3 = 2
                r4 = 0
                boolean r0 = kotlin.text.StringsKt.contains$default(r0, r1, r2, r3, r4)
                return r0
        }

        private final boolean isNotMainThread() {
                r4 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 1
                r2 = 0
                r3 = 23
                if (r0 < r3) goto L13
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                boolean r0 = r0.isCurrentThread()
                if (r0 != 0) goto L22
                goto L23
            L13:
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                android.os.Looper r3 = android.os.Looper.myLooper()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r0 != 0) goto L22
                goto L23
            L22:
                r1 = 0
            L23:
                return r1
        }

        public final void checkBackgroundThread() {
                r2 = this;
                com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBackgroundThread$1 r0 = new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBackgroundThread$1
                r0.<init>(r2)
                com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBackgroundThread$2 r1 = com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBackgroundThread$2.INSTANCE
                r2.checkThread(r0, r1)
                return
        }

        public final void checkBlockingThread() {
                r2 = this;
                com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBlockingThread$1 r0 = new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBlockingThread$1
                r0.<init>(r2)
                com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBlockingThread$2 r1 = com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBlockingThread$2.INSTANCE
                r2.checkThread(r0, r1)
                return
        }

        public final void checkNotMainThread() {
                r2 = this;
                com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkNotMainThread$1 r0 = new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkNotMainThread$1
                r0.<init>(r2)
                com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkNotMainThread$2 r1 = com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkNotMainThread$2.INSTANCE
                r2.checkThread(r0, r1)
                return
        }

        public final boolean getEnforcement() {
                r1 = this;
                boolean r0 = com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.access$getEnforcement$cp()
                return r0
        }

        public final void setEnforcement(boolean r1) {
                r0 = this;
                com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.access$setEnforcement$cp(r1)
                return
        }
    }

    static {
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion r0 = new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion = r0
            return
    }

    public CrashlyticsWorkers(java.util.concurrent.ExecutorService r2, java.util.concurrent.ExecutorService r3) {
            r1 = this;
            java.lang.String r0 = "backgroundExecutorService"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "blockingExecutorService"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r0 = new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker
            r0.<init>(r2)
            r1.common = r0
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r0 = new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker
            r0.<init>(r2)
            r1.diskWrite = r0
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r0 = new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker
            r0.<init>(r2)
            r1.dataCollect = r0
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r2 = new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker
            r2.<init>(r3)
            r1.network = r2
            return
    }

    public static final /* synthetic */ boolean access$getEnforcement$cp() {
            boolean r0 = com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.enforcement
            return r0
    }

    public static final /* synthetic */ void access$setEnforcement$cp(boolean r0) {
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.enforcement = r0
            return
    }

    public static final void checkBackgroundThread() {
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion r0 = com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion
            r0.checkBackgroundThread()
            return
    }

    public static final void checkBlockingThread() {
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion r0 = com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion
            r0.checkBlockingThread()
            return
    }

    public static final void checkNotMainThread() {
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion r0 = com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion
            r0.checkNotMainThread()
            return
    }

    public static final void setEnforcement(boolean r1) {
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion r0 = com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion
            r0.setEnforcement(r1)
            return
    }
}
