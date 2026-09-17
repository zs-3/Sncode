package com.google.firebase.sessions;

/* compiled from: ProcessDetailsProvider.kt */
/* loaded from: classes2.dex */
public final class ProcessDetailsProvider {
    public static final com.google.firebase.sessions.ProcessDetailsProvider INSTANCE = null;

    static {
            com.google.firebase.sessions.ProcessDetailsProvider r0 = new com.google.firebase.sessions.ProcessDetailsProvider
            r0.<init>()
            com.google.firebase.sessions.ProcessDetailsProvider.INSTANCE = r0
            return
    }

    private ProcessDetailsProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    private final com.google.firebase.sessions.ProcessDetails buildProcessDetails(java.lang.String r2, int r3, int r4, boolean r5) {
            r1 = this;
            com.google.firebase.sessions.ProcessDetails r0 = new com.google.firebase.sessions.ProcessDetails
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    static /* synthetic */ com.google.firebase.sessions.ProcessDetails buildProcessDetails$default(com.google.firebase.sessions.ProcessDetailsProvider r1, java.lang.String r2, int r3, int r4, boolean r5, int r6, java.lang.Object r7) {
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
            com.google.firebase.sessions.ProcessDetails r1 = r1.buildProcessDetails(r2, r3, r4, r5)
            return r1
    }

    public final java.util.List<com.google.firebase.sessions.ProcessDetails> getAppProcessDetails(android.content.Context r8) {
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            android.content.pm.ApplicationInfo r0 = r8.getApplicationInfo()
            int r0 = r0.uid
            android.content.pm.ApplicationInfo r1 = r8.getApplicationInfo()
            java.lang.String r1 = r1.processName
            java.lang.String r2 = "activity"
            java.lang.Object r8 = r8.getSystemService(r2)
            boolean r2 = r8 instanceof android.app.ActivityManager
            r3 = 0
            if (r2 == 0) goto L1f
            android.app.ActivityManager r8 = (android.app.ActivityManager) r8
            goto L20
        L1f:
            r8 = r3
        L20:
            if (r8 == 0) goto L26
            java.util.List r3 = r8.getRunningAppProcesses()
        L26:
            if (r3 != 0) goto L2c
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L2c:
            java.util.List r8 = kotlin.collections.CollectionsKt.filterNotNull(r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L39:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L53
            java.lang.Object r3 = r8.next()
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
            java.util.ArrayList r8 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r0)
            r8.<init>(r0)
            java.util.Iterator r0 = r2.iterator()
        L62:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L88
            java.lang.Object r2 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            com.google.firebase.sessions.ProcessDetails r3 = new com.google.firebase.sessions.ProcessDetails
            java.lang.String r4 = r2.processName
            java.lang.String r5 = "runningAppProcessInfo.processName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            int r5 = r2.pid
            int r6 = r2.importance
            java.lang.String r2 = r2.processName
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r1)
            r3.<init>(r4, r5, r6, r2)
            r8.add(r3)
            goto L62
        L88:
            return r8
    }

    public final com.google.firebase.sessions.ProcessDetails getCurrentProcessDetails(android.content.Context r9) {
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
            com.google.firebase.sessions.ProcessDetails r1 = (com.google.firebase.sessions.ProcessDetails) r1
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
            com.google.firebase.sessions.ProcessDetails r0 = (com.google.firebase.sessions.ProcessDetails) r0
            if (r0 != 0) goto L3d
            java.lang.String r2 = r8.getProcessName$com_google_firebase_firebase_sessions()
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            r1 = r8
            com.google.firebase.sessions.ProcessDetails r0 = buildProcessDetails$default(r1, r2, r3, r4, r5, r6, r7)
        L3d:
            return r0
    }

    public final java.lang.String getProcessName$com_google_firebase_firebase_sessions() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L10
            java.lang.String r0 = android.os.Process.myProcessName()
            java.lang.String r1 = "myProcessName()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        L10:
            r1 = 28
            if (r0 < r1) goto L1b
            java.lang.String r0 = android.app.Application.getProcessName()
            if (r0 == 0) goto L1b
            return r0
        L1b:
            java.lang.String r0 = com.google.android.gms.common.util.ProcessUtils.getMyProcessName()
            if (r0 == 0) goto L22
            return r0
        L22:
            java.lang.String r0 = ""
            return r0
    }
}
