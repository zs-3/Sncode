package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes2.dex */
public class RolloutAssignmentList {
    private final int maxEntries;
    private final java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> rolloutsState;

    public RolloutAssignmentList(int r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.rolloutsState = r0
            r1.maxEntries = r2
            return
    }

    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> getReportRolloutsState() {
            r4 = this;
            java.util.List r0 = r4.getRolloutAssignmentList()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        La:
            int r3 = r0.size()
            if (r2 >= r3) goto L20
            java.lang.Object r3 = r0.get(r2)
            com.google.firebase.crashlytics.internal.metadata.RolloutAssignment r3 = (com.google.firebase.crashlytics.internal.metadata.RolloutAssignment) r3
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment r3 = r3.toReportProto()
            r1.add(r3)
            int r2 = r2 + 1
            goto La
        L20:
            return r1
    }

    public synchronized java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> getRolloutAssignmentList() {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le
            java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> r1 = r2.rolloutsState     // Catch: java.lang.Throwable -> Le
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public synchronized boolean updateRolloutAssignmentList(java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> r0 = r4.rolloutsState     // Catch: java.lang.Throwable -> L47
            r0.clear()     // Catch: java.lang.Throwable -> L47
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L47
            int r1 = r4.maxEntries     // Catch: java.lang.Throwable -> L47
            if (r0 <= r1) goto L3f
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r1.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "Ignored "
            r1.append(r2)     // Catch: java.lang.Throwable -> L47
            r2 = 0
            r1.append(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = " entries when adding rollout assignments. Maximum allowable: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L47
            int r3 = r4.maxEntries     // Catch: java.lang.Throwable -> L47
            r1.append(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L47
            r0.w(r1)     // Catch: java.lang.Throwable -> L47
            int r0 = r4.maxEntries     // Catch: java.lang.Throwable -> L47
            java.util.List r5 = r5.subList(r2, r0)     // Catch: java.lang.Throwable -> L47
            java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> r0 = r4.rolloutsState     // Catch: java.lang.Throwable -> L47
            boolean r5 = r0.addAll(r5)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r4)
            return r5
        L3f:
            java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> r0 = r4.rolloutsState     // Catch: java.lang.Throwable -> L47
            boolean r5 = r0.addAll(r5)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r4)
            return r5
        L47:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }
}
