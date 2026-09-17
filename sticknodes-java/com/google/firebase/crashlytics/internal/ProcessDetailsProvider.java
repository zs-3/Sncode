package com.google.firebase.crashlytics.internal;

/* compiled from: ProcessDetailsProvider.kt */
/* loaded from: classes2.dex */
public final class ProcessDetailsProvider {
    public static final com.google.firebase.crashlytics.internal.ProcessDetailsProvider INSTANCE = null;

    static {
            com.google.firebase.crashlytics.internal.ProcessDetailsProvider r0 = new com.google.firebase.crashlytics.internal.ProcessDetailsProvider
            r0.<init>()
            com.google.firebase.crashlytics.internal.ProcessDetailsProvider.INSTANCE = r0
            return
    }

    private ProcessDetailsProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails$default(com.google.firebase.crashlytics.internal.ProcessDetailsProvider r1, java.lang.String r2, int r3, int r4, boolean r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r3 = 0
        L6:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            r4 = 0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            r5 = 0
        L10:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r1 = r1.buildProcessDetails(r2, r3, r4, r5)
            return r1
    }

    private final java.lang.String getProcessName() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = ""
            r2 = 33
            if (r0 < r2) goto L12
            java.lang.String r1 = android.os.Process.myProcessName()
            java.lang.String r0 = "{\n      Process.myProcessName()\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            goto L1e
        L12:
            r2 = 28
            if (r0 < r2) goto L1e
            java.lang.String r0 = android.app.Application.getProcessName()
            if (r0 != 0) goto L1d
            goto L1e
        L1d:
            r1 = r0
        L1e:
            return r1
    }

    public final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(java.lang.String r9, int r10, int r11) {
            r8 = this;
            java.lang.String r0 = "processName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r9 = buildProcessDetails$default(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    public final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(java.lang.String r2, int r3, int r4, boolean r5) {
            r1 = this;
            java.lang.String r0 = "processName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.builder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder r2 = r0.setProcessName(r2)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder r2 = r2.setPid(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder r2 = r2.setImportance(r4)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder r2 = r2.setDefaultProcess(r5)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r2 = r2.build()
            java.lang.String r3 = "builder()\n      .setProc…ltProcess)\n      .build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    public final java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> getAppProcessDetails(android.content.Context r6) {
            r5 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo()
            int r0 = r0.uid
            android.content.pm.ApplicationInfo r1 = r6.getApplicationInfo()
            java.lang.String r1 = r1.processName
            java.lang.String r2 = "activity"
            java.lang.Object r6 = r6.getSystemService(r2)
            boolean r2 = r6 instanceof android.app.ActivityManager
            r3 = 0
            if (r2 == 0) goto L1f
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            goto L20
        L1f:
            r6 = r3
        L20:
            if (r6 == 0) goto L26
            java.util.List r3 = r6.getRunningAppProcesses()
        L26:
            if (r3 != 0) goto L2c
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L2c:
            java.util.List r6 = kotlin.collections.CollectionsKt.filterNotNull(r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
        L39:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L53
            java.lang.Object r3 = r6.next()
            r4 = r3
            android.app.ActivityManager$RunningAppProcessInfo r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4
            int r4 = r4.uid
            if (r4 != r0) goto L4c
            r4 = 1
            goto L4d
        L4c:
            r4 = 0
        L4d:
            if (r4 == 0) goto L39
            r2.add(r3)
            goto L39
        L53:
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r0)
            r6.<init>(r0)
            java.util.Iterator r0 = r2.iterator()
        L62:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder r3 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.builder()
            java.lang.String r4 = r2.processName
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder r3 = r3.setProcessName(r4)
            int r4 = r2.pid
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder r3 = r3.setPid(r4)
            int r4 = r2.importance
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder r3 = r3.setImportance(r4)
            java.lang.String r2 = r2.processName
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder r2 = r3.setDefaultProcess(r2)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r2 = r2.build()
            r6.add(r2)
            goto L62
        L96:
            return r6
    }

    public final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails getCurrentProcessDetails(android.content.Context r9) {
            r8 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            int r3 = android.os.Process.myPid()
            java.util.List r9 = r8.getAppProcessDetails(r9)
            java.util.Iterator r9 = r9.iterator()
        L11:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r9.next()
            r1 = r0
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r1 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails) r1
            int r1 = r1.getPid()
            if (r1 != r3) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            if (r1 == 0) goto L11
            goto L2b
        L2a:
            r0 = 0
        L2b:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r0 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails) r0
            if (r0 != 0) goto L3d
            java.lang.String r2 = r8.getProcessName()
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            r1 = r8
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r0 = buildProcessDetails$default(r1, r2, r3, r4, r5, r6, r7)
        L3d:
            return r0
    }
}
