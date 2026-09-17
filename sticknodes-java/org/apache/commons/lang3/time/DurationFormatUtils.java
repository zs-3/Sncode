package org.apache.commons.lang3.time;

/* loaded from: classes2.dex */
public class DurationFormatUtils {
    static final java.lang.Object H = null;
    public static final java.lang.String ISO_EXTENDED_FORMAT_PATTERN = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'";
    static final java.lang.Object M = null;
    static final java.lang.Object S = null;
    static final java.lang.Object d = null;
    static final java.lang.Object m = null;
    static final java.lang.Object s = null;
    static final java.lang.Object y = null;

    static class Token {
        private int count;
        private final java.lang.Object value;

        Token(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r1 = 1
                r0.count = r1
                return
        }

        Token(java.lang.Object r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r0.count = r2
                return
        }

        static boolean containsTokenWithValue(org.apache.commons.lang3.time.DurationFormatUtils.Token[] r4, java.lang.Object r5) {
                int r0 = r4.length
                r1 = 0
                r2 = 0
            L3:
                if (r2 >= r0) goto L12
                r3 = r4[r2]
                java.lang.Object r3 = r3.getValue()
                if (r3 != r5) goto Lf
                r4 = 1
                return r4
            Lf:
                int r2 = r2 + 1
                goto L3
            L12:
                return r1
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof org.apache.commons.lang3.time.DurationFormatUtils.Token
                r1 = 0
                if (r0 == 0) goto L42
                org.apache.commons.lang3.time.DurationFormatUtils$Token r4 = (org.apache.commons.lang3.time.DurationFormatUtils.Token) r4
                java.lang.Object r0 = r3.value
                java.lang.Class r0 = r0.getClass()
                java.lang.Object r2 = r4.value
                java.lang.Class r2 = r2.getClass()
                if (r0 == r2) goto L16
                return r1
            L16:
                int r0 = r3.count
                int r2 = r4.count
                if (r0 == r2) goto L1d
                return r1
            L1d:
                java.lang.Object r0 = r3.value
                boolean r2 = r0 instanceof java.lang.StringBuilder
                if (r2 == 0) goto L32
                java.lang.String r0 = r0.toString()
                java.lang.Object r4 = r4.value
                java.lang.String r4 = r4.toString()
                boolean r4 = r0.equals(r4)
                return r4
            L32:
                boolean r2 = r0 instanceof java.lang.Number
                if (r2 == 0) goto L3d
                java.lang.Object r4 = r4.value
                boolean r4 = r0.equals(r4)
                return r4
            L3d:
                java.lang.Object r4 = r4.value
                if (r0 != r4) goto L42
                r1 = 1
            L42:
                return r1
        }

        int getCount() {
                r1 = this;
                int r0 = r1.count
                return r0
        }

        java.lang.Object getValue() {
                r1 = this;
                java.lang.Object r0 = r1.value
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.Object r0 = r1.value
                int r0 = r0.hashCode()
                return r0
        }

        void increment() {
                r1 = this;
                int r0 = r1.count
                int r0 = r0 + 1
                r1.count = r0
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.Object r0 = r2.value
                java.lang.String r0 = r0.toString()
                int r1 = r2.count
                java.lang.String r0 = org.apache.commons.lang3.StringUtils.repeat(r0, r1)
                return r0
        }
    }

    static {
            java.lang.String r0 = "y"
            org.apache.commons.lang3.time.DurationFormatUtils.y = r0
            java.lang.String r0 = "M"
            org.apache.commons.lang3.time.DurationFormatUtils.M = r0
            java.lang.String r0 = "d"
            org.apache.commons.lang3.time.DurationFormatUtils.d = r0
            java.lang.String r0 = "H"
            org.apache.commons.lang3.time.DurationFormatUtils.H = r0
            java.lang.String r0 = "m"
            org.apache.commons.lang3.time.DurationFormatUtils.m = r0
            java.lang.String r0 = "s"
            org.apache.commons.lang3.time.DurationFormatUtils.s = r0
            java.lang.String r0 = "S"
            org.apache.commons.lang3.time.DurationFormatUtils.S = r0
            return
    }

    public DurationFormatUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String format(org.apache.commons.lang3.time.DurationFormatUtils.Token[] r16, long r17, long r19, long r21, long r23, long r25, long r27, long r29, boolean r31) {
            r0 = r16
            r1 = r29
            r3 = r31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r0.length
            r7 = 0
            r8 = 0
        Le:
            if (r7 >= r5) goto Le1
            r9 = r0[r7]
            java.lang.Object r10 = r9.getValue()
            int r9 = r9.getCount()
            boolean r11 = r10 instanceof java.lang.StringBuilder
            if (r11 == 0) goto L2c
            java.lang.String r9 = r10.toString()
            r4.append(r9)
            r11 = r23
            r13 = r25
            r0 = r5
            r15 = r7
            goto L44
        L2c:
            java.lang.Object r11 = org.apache.commons.lang3.time.DurationFormatUtils.y
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L48
            r13 = r17
            java.lang.String r8 = paddedValue(r13, r3, r9)
            r4.append(r8)
            r11 = r23
            r13 = r25
            r0 = r5
            r15 = r7
        L43:
            r8 = 0
        L44:
            r5 = r27
            goto Lda
        L48:
            r13 = r17
            java.lang.Object r11 = org.apache.commons.lang3.time.DurationFormatUtils.M
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L62
            r15 = r7
            r6 = r19
            java.lang.String r8 = paddedValue(r6, r3, r9)
            r4.append(r8)
        L5c:
            r11 = r23
        L5e:
            r13 = r25
        L60:
            r0 = r5
            goto L43
        L62:
            r15 = r7
            r6 = r19
            java.lang.Object r11 = org.apache.commons.lang3.time.DurationFormatUtils.d
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L77
            r12 = r21
            java.lang.String r8 = paddedValue(r12, r3, r9)
            r4.append(r8)
            goto L5c
        L77:
            r12 = r21
            java.lang.Object r14 = org.apache.commons.lang3.time.DurationFormatUtils.H
            boolean r14 = r10.equals(r14)
            if (r14 == 0) goto L8b
            r11 = r23
            java.lang.String r8 = paddedValue(r11, r3, r9)
            r4.append(r8)
            goto L5e
        L8b:
            r11 = r23
            java.lang.Object r14 = org.apache.commons.lang3.time.DurationFormatUtils.m
            boolean r14 = r10.equals(r14)
            if (r14 == 0) goto L9f
            r13 = r25
            java.lang.String r8 = paddedValue(r13, r3, r9)
            r4.append(r8)
            goto L60
        L9f:
            r13 = r25
            java.lang.Object r0 = org.apache.commons.lang3.time.DurationFormatUtils.s
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto Lb5
            r0 = r5
            r5 = r27
            java.lang.String r7 = paddedValue(r5, r3, r9)
            r4.append(r7)
            r8 = 1
            goto Lda
        Lb5:
            r0 = r5
            r5 = r27
            java.lang.Object r7 = org.apache.commons.lang3.time.DurationFormatUtils.S
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto Lda
            if (r8 == 0) goto Ld2
            r7 = 3
            if (r3 == 0) goto Lc9
            int r7 = java.lang.Math.max(r7, r9)
        Lc9:
            r8 = 1
            java.lang.String r7 = paddedValue(r1, r8, r7)
            r4.append(r7)
            goto Ld9
        Ld2:
            java.lang.String r7 = paddedValue(r1, r3, r9)
            r4.append(r7)
        Ld9:
            r8 = 0
        Lda:
            int r7 = r15 + 1
            r5 = r0
            r0 = r16
            goto Le
        Le1:
            java.lang.String r0 = r4.toString()
            return r0
    }

    public static java.lang.String formatDuration(long r1, java.lang.String r3) {
            r0 = 1
            java.lang.String r1 = formatDuration(r1, r3, r0)
            return r1
    }

    public static java.lang.String formatDuration(long r23, java.lang.String r25, boolean r26) {
            r0 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r6 = "durationMillis must not be negative"
            r4 = r23
            org.apache.commons.lang3.Validate.inclusiveBetween(r0, r2, r4, r6)
            org.apache.commons.lang3.time.DurationFormatUtils$Token[] r7 = lexx(r25)
            java.lang.Object r0 = org.apache.commons.lang3.time.DurationFormatUtils.d
            boolean r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r7, r0)
            r1 = 0
            if (r0 == 0) goto L27
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = r23 / r3
            long r3 = r3 * r5
            long r3 = r23 - r3
            r12 = r5
            goto L2a
        L27:
            r3 = r23
            r12 = r1
        L2a:
            java.lang.Object r0 = org.apache.commons.lang3.time.DurationFormatUtils.H
            boolean r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r7, r0)
            if (r0 == 0) goto L3c
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r3 / r5
            long r5 = r5 * r8
            long r3 = r3 - r5
            r14 = r8
            goto L3d
        L3c:
            r14 = r1
        L3d:
            java.lang.Object r0 = org.apache.commons.lang3.time.DurationFormatUtils.m
            boolean r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r7, r0)
            if (r0 == 0) goto L50
            r5 = 60000(0xea60, double:2.9644E-319)
            long r8 = r3 / r5
            long r5 = r5 * r8
            long r3 = r3 - r5
            r16 = r8
            goto L52
        L50:
            r16 = r1
        L52:
            java.lang.Object r0 = org.apache.commons.lang3.time.DurationFormatUtils.s
            boolean r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r7, r0)
            if (r0 == 0) goto L66
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r3 / r0
            long r0 = r0 * r5
            long r3 = r3 - r0
            r20 = r3
            r18 = r5
            goto L6a
        L66:
            r18 = r1
            r20 = r3
        L6a:
            r8 = 0
            r10 = 0
            r22 = r26
            java.lang.String r0 = format(r7, r8, r10, r12, r14, r16, r18, r20, r22)
            return r0
    }

    public static java.lang.String formatDurationHMS(long r1) {
            java.lang.String r0 = "HH:mm:ss.SSS"
            java.lang.String r1 = formatDuration(r1, r0)
            return r1
    }

    public static java.lang.String formatDurationISO(long r2) {
            java.lang.String r0 = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'"
            r1 = 0
            java.lang.String r2 = formatDuration(r2, r0, r1)
            return r2
    }

    public static java.lang.String formatDurationWords(long r7, boolean r9, boolean r10) {
            java.lang.String r0 = "d' days 'H' hours 'm' minutes 's' seconds'"
            java.lang.String r7 = formatDuration(r7, r0)
            java.lang.String r8 = " 0 minutes"
            java.lang.String r0 = " 0 hours"
            java.lang.String r1 = " 0 seconds"
            java.lang.String r2 = " 0 days"
            java.lang.String r3 = " "
            java.lang.String r4 = ""
            if (r9 == 0) goto L5e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.String r9 = org.apache.commons.lang3.StringUtils.replaceOnce(r7, r2, r4)
            int r5 = r9.length()
            int r6 = r7.length()
            if (r5 == r6) goto L53
            java.lang.String r7 = org.apache.commons.lang3.StringUtils.replaceOnce(r9, r0, r4)
            int r5 = r7.length()
            int r6 = r9.length()
            if (r5 == r6) goto L52
            java.lang.String r7 = org.apache.commons.lang3.StringUtils.replaceOnce(r7, r8, r4)
            int r9 = r7.length()
            int r5 = r7.length()
            if (r9 == r5) goto L53
            java.lang.String r7 = org.apache.commons.lang3.StringUtils.replaceOnce(r7, r1, r4)
            goto L53
        L52:
            r7 = r9
        L53:
            boolean r9 = r7.isEmpty()
            if (r9 != 0) goto L5e
            r9 = 1
            java.lang.String r7 = r7.substring(r9)
        L5e:
            if (r10 == 0) goto L90
            java.lang.String r9 = org.apache.commons.lang3.StringUtils.replaceOnce(r7, r1, r4)
            int r10 = r9.length()
            int r1 = r7.length()
            if (r10 == r1) goto L90
            java.lang.String r7 = org.apache.commons.lang3.StringUtils.replaceOnce(r9, r8, r4)
            int r8 = r7.length()
            int r10 = r9.length()
            if (r8 == r10) goto L8f
            java.lang.String r8 = org.apache.commons.lang3.StringUtils.replaceOnce(r7, r0, r4)
            int r9 = r8.length()
            int r10 = r7.length()
            if (r9 == r10) goto L90
            java.lang.String r7 = org.apache.commons.lang3.StringUtils.replaceOnce(r8, r2, r4)
            goto L90
        L8f:
            r7 = r9
        L90:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = " 1 seconds"
            java.lang.String r9 = " 1 second"
            java.lang.String r7 = org.apache.commons.lang3.StringUtils.replaceOnce(r7, r8, r9)
            java.lang.String r8 = " 1 minutes"
            java.lang.String r9 = " 1 minute"
            java.lang.String r7 = org.apache.commons.lang3.StringUtils.replaceOnce(r7, r8, r9)
            java.lang.String r8 = " 1 hours"
            java.lang.String r9 = " 1 hour"
            java.lang.String r7 = org.apache.commons.lang3.StringUtils.replaceOnce(r7, r8, r9)
            java.lang.String r8 = " 1 days"
            java.lang.String r9 = " 1 day"
            java.lang.String r7 = org.apache.commons.lang3.StringUtils.replaceOnce(r7, r8, r9)
            java.lang.String r7 = r7.trim()
            return r7
    }

    public static java.lang.String formatPeriod(long r7, long r9, java.lang.String r11) {
            java.util.TimeZone r6 = java.util.TimeZone.getDefault()
            r5 = 1
            r0 = r7
            r2 = r9
            r4 = r11
            java.lang.String r7 = formatPeriod(r0, r2, r4, r5, r6)
            return r7
    }

    public static java.lang.String formatPeriod(long r25, long r27, java.lang.String r29, boolean r30, java.util.TimeZone r31) {
            r0 = r25
            r2 = r27
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto Lc
            r6 = 1
            goto Ld
        Lc:
            r6 = 0
        Ld:
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r8 = "startMillis must not be greater than endMillis"
            org.apache.commons.lang3.Validate.isTrue(r6, r8, r7)
            org.apache.commons.lang3.time.DurationFormatUtils$Token[] r9 = lexx(r29)
            java.util.Calendar r6 = java.util.Calendar.getInstance(r31)
            java.util.Date r7 = new java.util.Date
            r7.<init>(r0)
            r6.setTime(r7)
            java.util.Calendar r0 = java.util.Calendar.getInstance(r31)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r2)
            r0.setTime(r1)
            r1 = 14
            int r2 = r0.get(r1)
            int r1 = r6.get(r1)
            int r2 = r2 - r1
            r1 = 13
            int r3 = r0.get(r1)
            int r1 = r6.get(r1)
            int r3 = r3 - r1
            r1 = 12
            int r7 = r0.get(r1)
            int r1 = r6.get(r1)
            int r7 = r7 - r1
            r1 = 11
            int r8 = r0.get(r1)
            int r1 = r6.get(r1)
            int r8 = r8 - r1
            r1 = 5
            int r10 = r0.get(r1)
            int r11 = r6.get(r1)
            int r10 = r10 - r11
            r11 = 2
            int r12 = r0.get(r11)
            int r13 = r6.get(r11)
            int r12 = r12 - r13
            int r13 = r0.get(r5)
            int r14 = r6.get(r5)
            int r13 = r13 - r14
        L79:
            if (r2 >= 0) goto L80
            int r2 = r2 + 1000
            int r3 = r3 + (-1)
            goto L79
        L80:
            if (r3 >= 0) goto L87
            int r3 = r3 + 60
            int r7 = r7 + (-1)
            goto L80
        L87:
            if (r7 >= 0) goto L8e
            int r7 = r7 + 60
            int r8 = r8 + (-1)
            goto L87
        L8e:
            if (r8 >= 0) goto L95
            int r8 = r8 + 24
            int r10 = r10 + (-1)
            goto L8e
        L95:
            java.lang.Object r14 = org.apache.commons.lang3.time.DurationFormatUtils.M
            boolean r14 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r9, r14)
            if (r14 == 0) goto Lc2
        L9d:
            if (r10 >= 0) goto Laa
            int r0 = r6.getActualMaximum(r1)
            int r10 = r10 + r0
            int r12 = r12 + (-1)
            r6.add(r11, r5)
            goto L9d
        Laa:
            if (r12 >= 0) goto Lb1
            int r12 = r12 + 12
            int r13 = r13 + (-1)
            goto Laa
        Lb1:
            java.lang.Object r0 = org.apache.commons.lang3.time.DurationFormatUtils.y
            boolean r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r9, r0)
            if (r0 != 0) goto L122
            if (r13 == 0) goto L122
        Lbb:
            if (r13 == 0) goto L122
            int r13 = r13 * 12
            int r12 = r12 + r13
            r13 = 0
            goto Lbb
        Lc2:
            java.lang.Object r14 = org.apache.commons.lang3.time.DurationFormatUtils.y
            boolean r14 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r9, r14)
            if (r14 != 0) goto L101
            int r13 = r0.get(r5)
            if (r12 >= 0) goto Ld2
            int r13 = r13 + (-1)
        Ld2:
            int r12 = r6.get(r5)
            if (r12 == r13) goto L100
            r12 = 6
            int r14 = r6.getActualMaximum(r12)
            int r15 = r6.get(r12)
            int r14 = r14 - r15
            int r10 = r10 + r14
            boolean r14 = r6 instanceof java.util.GregorianCalendar
            if (r14 == 0) goto Lf7
            int r14 = r6.get(r11)
            if (r14 != r5) goto Lf7
            int r14 = r6.get(r1)
            r15 = 29
            if (r14 != r15) goto Lf7
            int r10 = r10 + 1
        Lf7:
            r6.add(r5, r5)
            int r12 = r6.get(r12)
            int r10 = r10 + r12
            goto Ld2
        L100:
            r13 = 0
        L101:
            int r12 = r6.get(r11)
            int r14 = r0.get(r11)
            if (r12 == r14) goto L114
            int r12 = r6.getActualMaximum(r1)
            int r10 = r10 + r12
            r6.add(r11, r5)
            goto L101
        L114:
            r12 = 0
        L115:
            if (r10 >= 0) goto L122
            int r0 = r6.getActualMaximum(r1)
            int r10 = r10 + r0
            int r12 = r12 + (-1)
            r6.add(r11, r5)
            goto L115
        L122:
            java.lang.Object r0 = org.apache.commons.lang3.time.DurationFormatUtils.d
            boolean r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r9, r0)
            if (r0 != 0) goto L12e
            int r10 = r10 * 24
            int r8 = r8 + r10
            r10 = 0
        L12e:
            java.lang.Object r0 = org.apache.commons.lang3.time.DurationFormatUtils.H
            boolean r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r9, r0)
            if (r0 != 0) goto L13a
            int r8 = r8 * 60
            int r7 = r7 + r8
            r8 = 0
        L13a:
            java.lang.Object r0 = org.apache.commons.lang3.time.DurationFormatUtils.m
            boolean r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r9, r0)
            if (r0 != 0) goto L146
            int r7 = r7 * 60
            int r3 = r3 + r7
            r7 = 0
        L146:
            java.lang.Object r0 = org.apache.commons.lang3.time.DurationFormatUtils.s
            boolean r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r9, r0)
            if (r0 != 0) goto L152
            int r3 = r3 * 1000
            int r2 = r2 + r3
            goto L153
        L152:
            r4 = r3
        L153:
            long r0 = (long) r13
            long r12 = (long) r12
            long r14 = (long) r10
            long r5 = (long) r8
            long r7 = (long) r7
            long r3 = (long) r4
            long r10 = (long) r2
            r22 = r10
            r10 = r0
            r16 = r5
            r18 = r7
            r20 = r3
            r24 = r30
            java.lang.String r0 = format(r9, r10, r12, r14, r16, r18, r20, r22, r24)
            return r0
    }

    public static java.lang.String formatPeriodISO(long r7, long r9) {
            java.util.TimeZone r6 = java.util.TimeZone.getDefault()
            java.lang.String r4 = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'"
            r5 = 0
            r0 = r7
            r2 = r9
            java.lang.String r7 = formatPeriod(r0, r2, r4, r5, r6)
            return r7
    }

    static org.apache.commons.lang3.time.DurationFormatUtils.Token[] lexx(java.lang.String r9) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.length()
            r0.<init>(r1)
            r1 = 0
            r2 = 0
            r5 = r2
            r6 = r5
            r3 = 0
            r4 = 0
        Lf:
            int r7 = r9.length()
            if (r3 >= r7) goto L9f
            char r7 = r9.charAt(r3)
            r8 = 39
            if (r4 == 0) goto L24
            if (r7 == r8) goto L24
            r5.append(r7)
            goto L9b
        L24:
            if (r7 == r8) goto L6a
            r8 = 72
            if (r7 == r8) goto L67
            r8 = 77
            if (r7 == r8) goto L64
            r8 = 83
            if (r7 == r8) goto L61
            r8 = 100
            if (r7 == r8) goto L5e
            r8 = 109(0x6d, float:1.53E-43)
            if (r7 == r8) goto L5b
            r8 = 115(0x73, float:1.61E-43)
            if (r7 == r8) goto L58
            r8 = 121(0x79, float:1.7E-43)
            if (r7 == r8) goto L55
            if (r5 != 0) goto L51
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            org.apache.commons.lang3.time.DurationFormatUtils$Token r8 = new org.apache.commons.lang3.time.DurationFormatUtils$Token
            r8.<init>(r5)
            r0.add(r8)
        L51:
            r5.append(r7)
            goto L7e
        L55:
            java.lang.Object r7 = org.apache.commons.lang3.time.DurationFormatUtils.y
            goto L7f
        L58:
            java.lang.Object r7 = org.apache.commons.lang3.time.DurationFormatUtils.s
            goto L7f
        L5b:
            java.lang.Object r7 = org.apache.commons.lang3.time.DurationFormatUtils.m
            goto L7f
        L5e:
            java.lang.Object r7 = org.apache.commons.lang3.time.DurationFormatUtils.d
            goto L7f
        L61:
            java.lang.Object r7 = org.apache.commons.lang3.time.DurationFormatUtils.S
            goto L7f
        L64:
            java.lang.Object r7 = org.apache.commons.lang3.time.DurationFormatUtils.M
            goto L7f
        L67:
            java.lang.Object r7 = org.apache.commons.lang3.time.DurationFormatUtils.H
            goto L7f
        L6a:
            if (r4 == 0) goto L70
            r5 = r2
            r7 = r5
            r4 = 0
            goto L7f
        L70:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            org.apache.commons.lang3.time.DurationFormatUtils$Token r4 = new org.apache.commons.lang3.time.DurationFormatUtils$Token
            r4.<init>(r5)
            r0.add(r4)
            r4 = 1
        L7e:
            r7 = r2
        L7f:
            if (r7 == 0) goto L9b
            if (r6 == 0) goto L91
            java.lang.Object r5 = r6.getValue()
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L91
            r6.increment()
            goto L9a
        L91:
            org.apache.commons.lang3.time.DurationFormatUtils$Token r5 = new org.apache.commons.lang3.time.DurationFormatUtils$Token
            r5.<init>(r7)
            r0.add(r5)
            r6 = r5
        L9a:
            r5 = r2
        L9b:
            int r3 = r3 + 1
            goto Lf
        L9f:
            if (r4 != 0) goto Lae
            int r9 = r0.size()
            org.apache.commons.lang3.time.DurationFormatUtils$Token[] r9 = new org.apache.commons.lang3.time.DurationFormatUtils.Token[r9]
            java.lang.Object[] r9 = r0.toArray(r9)
            org.apache.commons.lang3.time.DurationFormatUtils$Token[] r9 = (org.apache.commons.lang3.time.DurationFormatUtils.Token[]) r9
            return r9
        Lae:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unmatched quote in format: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
    }

    private static java.lang.String paddedValue(long r0, boolean r2, int r3) {
            java.lang.String r0 = java.lang.Long.toString(r0)
            if (r2 == 0) goto Lc
            r1 = 48
            java.lang.String r0 = org.apache.commons.lang3.StringUtils.leftPad(r0, r3, r1)
        Lc:
            return r0
    }
}
