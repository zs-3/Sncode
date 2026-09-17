package com.google.firebase;

/* loaded from: classes2.dex */
final class AutoValue_StartupTime extends com.google.firebase.StartupTime {
    private final long elapsedRealtime;
    private final long epochMillis;
    private final long uptimeMillis;

    AutoValue_StartupTime(long r1, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.epochMillis = r1
            r0.elapsedRealtime = r3
            r0.uptimeMillis = r5
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.firebase.StartupTime
            r2 = 0
            if (r1 == 0) goto L2c
            com.google.firebase.StartupTime r8 = (com.google.firebase.StartupTime) r8
            long r3 = r7.epochMillis
            long r5 = r8.getEpochMillis()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2a
            long r3 = r7.elapsedRealtime
            long r5 = r8.getElapsedRealtime()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2a
            long r3 = r7.uptimeMillis
            long r5 = r8.getUptimeMillis()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L2a
            goto L2b
        L2a:
            r0 = 0
        L2b:
            return r0
        L2c:
            return r2
    }

    @Override // com.google.firebase.StartupTime
    public long getElapsedRealtime() {
            r2 = this;
            long r0 = r2.elapsedRealtime
            return r0
    }

    @Override // com.google.firebase.StartupTime
    public long getEpochMillis() {
            r2 = this;
            long r0 = r2.epochMillis
            return r0
    }

    @Override // com.google.firebase.StartupTime
    public long getUptimeMillis() {
            r2 = this;
            long r0 = r2.uptimeMillis
            return r0
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.epochMillis
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            long r3 = r7.elapsedRealtime
            long r5 = r3 >>> r2
            long r3 = r3 ^ r5
            int r4 = (int) r3
            r1 = r1 ^ r4
            int r1 = r1 * r0
            long r3 = r7.uptimeMillis
            long r5 = r3 >>> r2
            long r2 = r5 ^ r3
            int r0 = (int) r2
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "StartupTime{epochMillis="
            r0.append(r1)
            long r1 = r3.epochMillis
            r0.append(r1)
            java.lang.String r1 = ", elapsedRealtime="
            r0.append(r1)
            long r1 = r3.elapsedRealtime
            r0.append(r1)
            java.lang.String r1 = ", uptimeMillis="
            r0.append(r1)
            long r1 = r3.uptimeMillis
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
