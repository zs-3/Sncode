package org.apache.commons.lang3.time;

/* loaded from: classes2.dex */
class GmtTimeZone extends java.util.TimeZone {
    private static final int HOURS_PER_DAY = 24;
    private static final int MILLISECONDS_PER_MINUTE = 60000;
    private static final int MINUTES_PER_HOUR = 60;
    static final long serialVersionUID = 1;
    private final int offset;
    private final java.lang.String zoneId;

    GmtTimeZone(boolean r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            r0 = 24
            if (r4 >= r0) goto L59
            r0 = 60
            if (r5 >= r0) goto L42
            int r0 = r4 * 60
            int r0 = r0 + r5
            r1 = 60000(0xea60, float:8.4078E-41)
            int r0 = r0 * r1
            if (r3 == 0) goto L16
            int r0 = -r0
        L16:
            r2.offset = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 9
            r0.<init>(r1)
            java.lang.String r1 = "GMT"
            r0.append(r1)
            if (r3 == 0) goto L29
            r3 = 45
            goto L2b
        L29:
            r3 = 43
        L2b:
            r0.append(r3)
            java.lang.StringBuilder r3 = twoDigits(r0, r4)
            r4 = 58
            r3.append(r4)
            java.lang.StringBuilder r3 = twoDigits(r3, r5)
            java.lang.String r3 = r3.toString()
            r2.zoneId = r3
            return
        L42:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            java.lang.String r5 = " minutes out of range"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L59:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " hours out of range"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
    }

    private static java.lang.StringBuilder twoDigits(java.lang.StringBuilder r1, int r2) {
            int r0 = r2 / 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r1.append(r0)
            int r2 = r2 % 10
            int r2 = r2 + 48
            char r2 = (char) r2
            r1.append(r2)
            return r1
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof org.apache.commons.lang3.time.GmtTimeZone
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = r2.zoneId
            org.apache.commons.lang3.time.GmtTimeZone r3 = (org.apache.commons.lang3.time.GmtTimeZone) r3
            java.lang.String r3 = r3.zoneId
            if (r0 != r3) goto Lf
            r1 = 1
        Lf:
            return r1
    }

    @Override // java.util.TimeZone
    public java.lang.String getID() {
            r1 = this;
            java.lang.String r0 = r1.zoneId
            return r0
    }

    @Override // java.util.TimeZone
    public int getOffset(int r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            int r1 = r0.offset
            return r1
    }

    @Override // java.util.TimeZone
    public int getRawOffset() {
            r1 = this;
            int r0 = r1.offset
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.offset
            return r0
    }

    @Override // java.util.TimeZone
    public boolean inDaylightTime(java.util.Date r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.TimeZone
    public void setRawOffset(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[GmtTimeZone id=\""
            r0.append(r1)
            java.lang.String r1 = r2.zoneId
            r0.append(r1)
            java.lang.String r1 = "\",offset="
            r0.append(r1)
            int r1 = r2.offset
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.util.TimeZone
    public boolean useDaylightTime() {
            r1 = this;
            r0 = 0
            return r0
    }
}
