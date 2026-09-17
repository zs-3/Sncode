package com.google.firebase.sessions;

/* compiled from: SessionEvent.kt */
/* loaded from: classes2.dex */
public final class ProcessDetails {
    private final int importance;
    private final boolean isDefaultProcess;
    private final int pid;
    private final java.lang.String processName;

    public ProcessDetails(java.lang.String r2, int r3, int r4, boolean r5) {
            r1 = this;
            java.lang.String r0 = "processName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.processName = r2
            r1.pid = r3
            r1.importance = r4
            r1.isDefaultProcess = r5
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.sessions.ProcessDetails
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.firebase.sessions.ProcessDetails r5 = (com.google.firebase.sessions.ProcessDetails) r5
            java.lang.String r1 = r4.processName
            java.lang.String r3 = r5.processName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.pid
            int r3 = r5.pid
            if (r1 == r3) goto L1e
            return r2
        L1e:
            int r1 = r4.importance
            int r3 = r5.importance
            if (r1 == r3) goto L25
            return r2
        L25:
            boolean r1 = r4.isDefaultProcess
            boolean r5 = r5.isDefaultProcess
            if (r1 == r5) goto L2c
            return r2
        L2c:
            return r0
    }

    public final int getImportance() {
            r1 = this;
            int r0 = r1.importance
            return r0
    }

    public final int getPid() {
            r1 = this;
            int r0 = r1.pid
            return r0
    }

    public final java.lang.String getProcessName() {
            r1 = this;
            java.lang.String r0 = r1.processName
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.processName
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.pid
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.importance
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.isDefaultProcess
            if (r1 == 0) goto L17
            r1 = 1
        L17:
            int r0 = r0 + r1
            return r0
    }

    public final boolean isDefaultProcess() {
            r1 = this;
            boolean r0 = r1.isDefaultProcess
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ProcessDetails(processName="
            r0.append(r1)
            java.lang.String r1 = r2.processName
            r0.append(r1)
            java.lang.String r1 = ", pid="
            r0.append(r1)
            int r1 = r2.pid
            r0.append(r1)
            java.lang.String r1 = ", importance="
            r0.append(r1)
            int r1 = r2.importance
            r0.append(r1)
            java.lang.String r1 = ", isDefaultProcess="
            r0.append(r1)
            boolean r1 = r2.isDefaultProcess
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
