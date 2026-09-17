package com.google.firebase.heartbeatinfo;

/* loaded from: classes2.dex */
final class AutoValue_HeartBeatResult extends com.google.firebase.heartbeatinfo.HeartBeatResult {
    private final java.util.List<java.lang.String> usedDates;
    private final java.lang.String userAgent;

    AutoValue_HeartBeatResult(java.lang.String r2, java.util.List<java.lang.String> r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null userAgent"
            java.util.Objects.requireNonNull(r2, r0)
            r1.userAgent = r2
            java.lang.String r2 = "Null usedDates"
            java.util.Objects.requireNonNull(r3, r2)
            r1.usedDates = r3
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.heartbeatinfo.HeartBeatResult
            r2 = 0
            if (r1 == 0) goto L26
            com.google.firebase.heartbeatinfo.HeartBeatResult r5 = (com.google.firebase.heartbeatinfo.HeartBeatResult) r5
            java.lang.String r1 = r4.userAgent
            java.lang.String r3 = r5.getUserAgent()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L24
            java.util.List<java.lang.String> r1 = r4.usedDates
            java.util.List r5 = r5.getUsedDates()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L24
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
        L26:
            return r2
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public java.util.List<java.lang.String> getUsedDates() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.usedDates
            return r0
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public java.lang.String getUserAgent() {
            r1 = this;
            java.lang.String r0 = r1.userAgent
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.userAgent
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.util.List<java.lang.String> r1 = r2.usedDates
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HeartBeatResult{userAgent="
            r0.append(r1)
            java.lang.String r1 = r2.userAgent
            r0.append(r1)
            java.lang.String r1 = ", usedDates="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r2.usedDates
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
