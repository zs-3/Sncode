package org.apache.commons.lang3.time;

/* loaded from: classes2.dex */
public class FastDatePrinter implements org.apache.commons.lang3.time.DatePrinter, java.io.Serializable {
    public static final int FULL = 0;
    public static final int LONG = 1;
    private static final int MAX_DIGITS = 10;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static final java.util.concurrent.ConcurrentMap<org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey, java.lang.String> cTimeZoneDisplayCache = null;
    private static final long serialVersionUID = 1;
    private final java.util.Locale mLocale;
    private transient int mMaxLengthEstimate;
    private final java.lang.String mPattern;
    private transient org.apache.commons.lang3.time.FastDatePrinter.Rule[] mRules;
    private final java.util.TimeZone mTimeZone;

    private static class CharacterLiteral implements org.apache.commons.lang3.time.FastDatePrinter.Rule {
        private final char mValue;

        CharacterLiteral(char r1) {
                r0 = this;
                r0.<init>()
                r0.mValue = r1
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r1, java.util.Calendar r2) throws java.io.IOException {
                r0 = this;
                char r2 = r0.mValue
                r1.append(r2)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    private static class DayInWeekField implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        private final org.apache.commons.lang3.time.FastDatePrinter.NumberRule mRule;

        DayInWeekField(org.apache.commons.lang3.time.FastDatePrinter.NumberRule r1) {
                r0 = this;
                r0.<init>()
                r0.mRule = r1
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public void appendTo(java.lang.Appendable r2, int r3) throws java.io.IOException {
                r1 = this;
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r0 = r1.mRule
                r0.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r4, java.util.Calendar r5) throws java.io.IOException {
                r3 = this;
                r0 = 7
                int r5 = r5.get(r0)
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r1 = r3.mRule
                r2 = 1
                if (r5 != r2) goto Lb
                goto Ld
            Lb:
                int r0 = r5 + (-1)
            Ld:
                r1.appendTo(r4, r0)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r0 = r1.mRule
                int r0 = r0.estimateLength()
                return r0
        }
    }

    private static class Iso8601_Rule implements org.apache.commons.lang3.time.FastDatePrinter.Rule {
        static final org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule ISO8601_HOURS = null;
        static final org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule ISO8601_HOURS_COLON_MINUTES = null;
        static final org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule ISO8601_HOURS_MINUTES = null;
        final int length;

        static {
                org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule r0 = new org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule
                r1 = 3
                r0.<init>(r1)
                org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS = r0
                org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule r0 = new org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule
                r1 = 5
                r0.<init>(r1)
                org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS_MINUTES = r0
                org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule r0 = new org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule
                r1 = 6
                r0.<init>(r1)
                org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS_COLON_MINUTES = r0
                return
        }

        Iso8601_Rule(int r1) {
                r0 = this;
                r0.<init>()
                r0.length = r1
                return
        }

        static org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule getRule(int r1) {
                r0 = 1
                if (r1 == r0) goto L17
                r0 = 2
                if (r1 == r0) goto L14
                r0 = 3
                if (r1 != r0) goto Lc
                org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule r1 = org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS_COLON_MINUTES
                return r1
            Lc:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "invalid number of X"
                r1.<init>(r0)
                throw r1
            L14:
                org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule r1 = org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS_MINUTES
                return r1
            L17:
                org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule r1 = org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS
                return r1
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r4, java.util.Calendar r5) throws java.io.IOException {
                r3 = this;
                r0 = 15
                int r0 = r5.get(r0)
                r1 = 16
                int r5 = r5.get(r1)
                int r0 = r0 + r5
                if (r0 != 0) goto L15
                java.lang.String r5 = "Z"
                r4.append(r5)
                return
            L15:
                if (r0 >= 0) goto L1e
                r5 = 45
                r4.append(r5)
                int r0 = -r0
                goto L23
            L1e:
                r5 = 43
                r4.append(r5)
            L23:
                r5 = 3600000(0x36ee80, float:5.044674E-39)
                int r5 = r0 / r5
                org.apache.commons.lang3.time.FastDatePrinter.access$000(r4, r5)
                int r1 = r3.length
                r2 = 5
                if (r1 >= r2) goto L31
                return
            L31:
                r2 = 6
                if (r1 != r2) goto L39
                r1 = 58
                r4.append(r1)
            L39:
                r1 = 60000(0xea60, float:8.4078E-41)
                int r0 = r0 / r1
                int r5 = r5 * 60
                int r0 = r0 - r5
                org.apache.commons.lang3.time.FastDatePrinter.access$000(r4, r0)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                int r0 = r1.length
                return r0
        }
    }

    private interface NumberRule extends org.apache.commons.lang3.time.FastDatePrinter.Rule {
        void appendTo(java.lang.Appendable r1, int r2) throws java.io.IOException;
    }

    private static class PaddedNumberField implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        private final int mField;
        private final int mSize;

        PaddedNumberField(int r2, int r3) {
                r1 = this;
                r1.<init>()
                r0 = 3
                if (r3 < r0) goto Lb
                r1.mField = r2
                r1.mSize = r3
                return
            Lb:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r2.<init>()
                throw r2
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public final void appendTo(java.lang.Appendable r2, int r3) throws java.io.IOException {
                r1 = this;
                int r0 = r1.mSize
                org.apache.commons.lang3.time.FastDatePrinter.access$100(r2, r3, r0)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r2, java.util.Calendar r3) throws java.io.IOException {
                r1 = this;
                int r0 = r1.mField
                int r3 = r3.get(r0)
                r1.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                int r0 = r1.mSize
                return r0
        }
    }

    private interface Rule {
        void appendTo(java.lang.Appendable r1, java.util.Calendar r2) throws java.io.IOException;

        int estimateLength();
    }

    private static class StringLiteral implements org.apache.commons.lang3.time.FastDatePrinter.Rule {
        private final java.lang.String mValue;

        StringLiteral(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.mValue = r1
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r1, java.util.Calendar r2) throws java.io.IOException {
                r0 = this;
                java.lang.String r2 = r0.mValue
                r1.append(r2)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                java.lang.String r0 = r1.mValue
                int r0 = r0.length()
                return r0
        }
    }

    private static class TextField implements org.apache.commons.lang3.time.FastDatePrinter.Rule {
        private final int mField;
        private final java.lang.String[] mValues;

        TextField(int r1, java.lang.String[] r2) {
                r0 = this;
                r0.<init>()
                r0.mField = r1
                r0.mValues = r2
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r3, java.util.Calendar r4) throws java.io.IOException {
                r2 = this;
                java.lang.String[] r0 = r2.mValues
                int r1 = r2.mField
                int r4 = r4.get(r1)
                r4 = r0[r4]
                r3.append(r4)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r3 = this;
                java.lang.String[] r0 = r3.mValues
                int r0 = r0.length
                r1 = 0
            L4:
                int r0 = r0 + (-1)
                if (r0 < 0) goto L14
                java.lang.String[] r2 = r3.mValues
                r2 = r2[r0]
                int r2 = r2.length()
                if (r2 <= r1) goto L4
                r1 = r2
                goto L4
            L14:
                return r1
        }
    }

    private static class TimeZoneDisplayKey {
        private final java.util.Locale mLocale;
        private final int mStyle;
        private final java.util.TimeZone mTimeZone;

        TimeZoneDisplayKey(java.util.TimeZone r1, boolean r2, int r3, java.util.Locale r4) {
                r0 = this;
                r0.<init>()
                r0.mTimeZone = r1
                if (r2 == 0) goto Ld
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 | r3
                r0.mStyle = r1
                goto Lf
            Ld:
                r0.mStyle = r3
            Lf:
                r0.mLocale = r4
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey
                r2 = 0
                if (r1 == 0) goto L28
                org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey r5 = (org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey) r5
                java.util.TimeZone r1 = r4.mTimeZone
                java.util.TimeZone r3 = r5.mTimeZone
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L26
                int r1 = r4.mStyle
                int r3 = r5.mStyle
                if (r1 != r3) goto L26
                java.util.Locale r1 = r4.mLocale
                java.util.Locale r5 = r5.mLocale
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L26
                goto L27
            L26:
                r0 = 0
            L27:
                return r0
            L28:
                return r2
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.mStyle
                int r0 = r0 * 31
                java.util.Locale r1 = r2.mLocale
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.TimeZone r1 = r2.mTimeZone
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    private static class TimeZoneNameRule implements org.apache.commons.lang3.time.FastDatePrinter.Rule {
        private final java.lang.String mDaylight;
        private final java.util.Locale mLocale;
        private final java.lang.String mStandard;
        private final int mStyle;

        TimeZoneNameRule(java.util.TimeZone r2, java.util.Locale r3, int r4) {
                r1 = this;
                r1.<init>()
                r1.mLocale = r3
                r1.mStyle = r4
                r0 = 0
                java.lang.String r0 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(r2, r0, r4, r3)
                r1.mStandard = r0
                r0 = 1
                java.lang.String r2 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(r2, r0, r4, r3)
                r1.mDaylight = r2
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r4, java.util.Calendar r5) throws java.io.IOException {
                r3 = this;
                java.util.TimeZone r0 = r5.getTimeZone()
                r1 = 16
                int r5 = r5.get(r1)
                if (r5 != 0) goto L19
                r5 = 0
                int r1 = r3.mStyle
                java.util.Locale r2 = r3.mLocale
                java.lang.String r5 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(r0, r5, r1, r2)
                r4.append(r5)
                goto L25
            L19:
                r5 = 1
                int r1 = r3.mStyle
                java.util.Locale r2 = r3.mLocale
                java.lang.String r5 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(r0, r5, r1, r2)
                r4.append(r5)
            L25:
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r2 = this;
                java.lang.String r0 = r2.mStandard
                int r0 = r0.length()
                java.lang.String r1 = r2.mDaylight
                int r1 = r1.length()
                int r0 = java.lang.Math.max(r0, r1)
                return r0
        }
    }

    private static class TimeZoneNumberRule implements org.apache.commons.lang3.time.FastDatePrinter.Rule {
        static final org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule INSTANCE_COLON = null;
        static final org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule INSTANCE_NO_COLON = null;
        final boolean mColon;

        static {
                org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNumberRule r0 = new org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNumberRule
                r1 = 1
                r0.<init>(r1)
                org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.INSTANCE_COLON = r0
                org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNumberRule r0 = new org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNumberRule
                r1 = 0
                r0.<init>(r1)
                org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.INSTANCE_NO_COLON = r0
                return
        }

        TimeZoneNumberRule(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.mColon = r1
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r3, java.util.Calendar r4) throws java.io.IOException {
                r2 = this;
                r0 = 15
                int r0 = r4.get(r0)
                r1 = 16
                int r4 = r4.get(r1)
                int r0 = r0 + r4
                if (r0 >= 0) goto L16
                r4 = 45
                r3.append(r4)
                int r0 = -r0
                goto L1b
            L16:
                r4 = 43
                r3.append(r4)
            L1b:
                r4 = 3600000(0x36ee80, float:5.044674E-39)
                int r4 = r0 / r4
                org.apache.commons.lang3.time.FastDatePrinter.access$000(r3, r4)
                boolean r1 = r2.mColon
                if (r1 == 0) goto L2c
                r1 = 58
                r3.append(r1)
            L2c:
                r1 = 60000(0xea60, float:8.4078E-41)
                int r0 = r0 / r1
                int r4 = r4 * 60
                int r0 = r0 - r4
                org.apache.commons.lang3.time.FastDatePrinter.access$000(r3, r0)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                r0 = 5
                return r0
        }
    }

    private static class TwelveHourField implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        private final org.apache.commons.lang3.time.FastDatePrinter.NumberRule mRule;

        TwelveHourField(org.apache.commons.lang3.time.FastDatePrinter.NumberRule r1) {
                r0 = this;
                r0.<init>()
                r0.mRule = r1
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public void appendTo(java.lang.Appendable r2, int r3) throws java.io.IOException {
                r1 = this;
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r0 = r1.mRule
                r0.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r3, java.util.Calendar r4) throws java.io.IOException {
                r2 = this;
                r0 = 10
                int r1 = r4.get(r0)
                if (r1 != 0) goto Le
                int r4 = r4.getLeastMaximum(r0)
                int r1 = r4 + 1
            Le:
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r4 = r2.mRule
                r4.appendTo(r3, r1)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r0 = r1.mRule
                int r0 = r0.estimateLength()
                return r0
        }
    }

    private static class TwentyFourHourField implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        private final org.apache.commons.lang3.time.FastDatePrinter.NumberRule mRule;

        TwentyFourHourField(org.apache.commons.lang3.time.FastDatePrinter.NumberRule r1) {
                r0 = this;
                r0.<init>()
                r0.mRule = r1
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public void appendTo(java.lang.Appendable r2, int r3) throws java.io.IOException {
                r1 = this;
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r0 = r1.mRule
                r0.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r3, java.util.Calendar r4) throws java.io.IOException {
                r2 = this;
                r0 = 11
                int r1 = r4.get(r0)
                if (r1 != 0) goto Le
                int r4 = r4.getMaximum(r0)
                int r1 = r4 + 1
            Le:
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r4 = r2.mRule
                r4.appendTo(r3, r1)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r0 = r1.mRule
                int r0 = r0.estimateLength()
                return r0
        }
    }

    private static class TwoDigitMonthField implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        static final org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField INSTANCE = null;

        static {
                org.apache.commons.lang3.time.FastDatePrinter$TwoDigitMonthField r0 = new org.apache.commons.lang3.time.FastDatePrinter$TwoDigitMonthField
                r0.<init>()
                org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField.INSTANCE = r0
                return
        }

        TwoDigitMonthField() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public final void appendTo(java.lang.Appendable r1, int r2) throws java.io.IOException {
                r0 = this;
                org.apache.commons.lang3.time.FastDatePrinter.access$000(r1, r2)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r2, java.util.Calendar r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                int r3 = r3.get(r0)
                int r3 = r3 + 1
                r1.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                r0 = 2
                return r0
        }
    }

    private static class TwoDigitNumberField implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        private final int mField;

        TwoDigitNumberField(int r1) {
                r0 = this;
                r0.<init>()
                r0.mField = r1
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public final void appendTo(java.lang.Appendable r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 100
                if (r3 >= r0) goto L8
                org.apache.commons.lang3.time.FastDatePrinter.access$000(r2, r3)
                goto Lc
            L8:
                r0 = 2
                org.apache.commons.lang3.time.FastDatePrinter.access$100(r2, r3, r0)
            Lc:
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r2, java.util.Calendar r3) throws java.io.IOException {
                r1 = this;
                int r0 = r1.mField
                int r3 = r3.get(r0)
                r1.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                r0 = 2
                return r0
        }
    }

    private static class TwoDigitYearField implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        static final org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField INSTANCE = null;

        static {
                org.apache.commons.lang3.time.FastDatePrinter$TwoDigitYearField r0 = new org.apache.commons.lang3.time.FastDatePrinter$TwoDigitYearField
                r0.<init>()
                org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField.INSTANCE = r0
                return
        }

        TwoDigitYearField() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public final void appendTo(java.lang.Appendable r1, int r2) throws java.io.IOException {
                r0 = this;
                org.apache.commons.lang3.time.FastDatePrinter.access$000(r1, r2)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r2, java.util.Calendar r3) throws java.io.IOException {
                r1 = this;
                r0 = 1
                int r3 = r3.get(r0)
                int r3 = r3 % 100
                r1.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                r0 = 2
                return r0
        }
    }

    private static class UnpaddedMonthField implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        static final org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField INSTANCE = null;

        static {
                org.apache.commons.lang3.time.FastDatePrinter$UnpaddedMonthField r0 = new org.apache.commons.lang3.time.FastDatePrinter$UnpaddedMonthField
                r0.<init>()
                org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField.INSTANCE = r0
                return
        }

        UnpaddedMonthField() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public final void appendTo(java.lang.Appendable r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 10
                if (r3 >= r0) goto Lb
                int r3 = r3 + 48
                char r3 = (char) r3
                r2.append(r3)
                goto Le
            Lb:
                org.apache.commons.lang3.time.FastDatePrinter.access$000(r2, r3)
            Le:
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r2, java.util.Calendar r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                int r3 = r3.get(r0)
                int r3 = r3 + 1
                r1.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                r0 = 2
                return r0
        }
    }

    private static class UnpaddedNumberField implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        private final int mField;

        UnpaddedNumberField(int r1) {
                r0 = this;
                r0.<init>()
                r0.mField = r1
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public final void appendTo(java.lang.Appendable r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 10
                if (r3 >= r0) goto Lb
                int r3 = r3 + 48
                char r3 = (char) r3
                r2.append(r3)
                goto L17
            Lb:
                r0 = 100
                if (r3 >= r0) goto L13
                org.apache.commons.lang3.time.FastDatePrinter.access$000(r2, r3)
                goto L17
            L13:
                r0 = 1
                org.apache.commons.lang3.time.FastDatePrinter.access$100(r2, r3, r0)
            L17:
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r2, java.util.Calendar r3) throws java.io.IOException {
                r1 = this;
                int r0 = r1.mField
                int r3 = r3.get(r0)
                r1.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                r0 = 4
                return r0
        }
    }

    private static class WeekYear implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        private final org.apache.commons.lang3.time.FastDatePrinter.NumberRule mRule;

        WeekYear(org.apache.commons.lang3.time.FastDatePrinter.NumberRule r1) {
                r0 = this;
                r0.<init>()
                r0.mRule = r1
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public void appendTo(java.lang.Appendable r2, int r3) throws java.io.IOException {
                r1 = this;
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r0 = r1.mRule
                r0.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r2, java.util.Calendar r3) throws java.io.IOException {
                r1 = this;
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r0 = r1.mRule
                int r3 = r3.getWeekYear()
                r0.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r0 = r1.mRule
                int r0 = r0.estimateLength()
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 7
            r0.<init>(r1)
            org.apache.commons.lang3.time.FastDatePrinter.cTimeZoneDisplayCache = r0
            return
    }

    protected FastDatePrinter(java.lang.String r1, java.util.TimeZone r2, java.util.Locale r3) {
            r0 = this;
            r0.<init>()
            r0.mPattern = r1
            r0.mTimeZone = r2
            r0.mLocale = r3
            r0.init()
            return
    }

    static /* synthetic */ void access$000(java.lang.Appendable r0, int r1) throws java.io.IOException {
            appendDigits(r0, r1)
            return
    }

    static /* synthetic */ void access$100(java.lang.Appendable r0, int r1, int r2) throws java.io.IOException {
            appendFullDigits(r0, r1, r2)
            return
    }

    private static void appendDigits(java.lang.Appendable r1, int r2) throws java.io.IOException {
            int r0 = r2 / 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r1.append(r0)
            int r2 = r2 % 10
            int r2 = r2 + 48
            char r2 = (char) r2
            r1.append(r2)
            return
    }

    private static void appendFullDigits(java.lang.Appendable r8, int r9, int r10) throws java.io.IOException {
            r0 = 10
            r1 = 48
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r9 >= r2) goto L5c
            r2 = 2
            r3 = 3
            r4 = 4
            r5 = 1
            r6 = 1000(0x3e8, float:1.401E-42)
            r7 = 100
            if (r9 >= r6) goto L1c
            if (r9 >= r7) goto L1a
            if (r9 >= r0) goto L18
            r6 = 1
            goto L1d
        L18:
            r6 = 2
            goto L1d
        L1a:
            r6 = 3
            goto L1d
        L1c:
            r6 = 4
        L1d:
            int r10 = r10 - r6
        L1e:
            if (r10 <= 0) goto L26
            r8.append(r1)
            int r10 = r10 + (-1)
            goto L1e
        L26:
            if (r6 == r5) goto L56
            if (r6 == r2) goto L47
            if (r6 == r3) goto L38
            if (r6 == r4) goto L2f
            goto L7f
        L2f:
            int r10 = r9 / 1000
            int r10 = r10 + r1
            char r10 = (char) r10
            r8.append(r10)
            int r9 = r9 % 1000
        L38:
            if (r9 < r7) goto L44
            int r10 = r9 / 100
            int r10 = r10 + r1
            char r10 = (char) r10
            r8.append(r10)
            int r9 = r9 % 100
            goto L47
        L44:
            r8.append(r1)
        L47:
            if (r9 < r0) goto L53
            int r10 = r9 / 10
            int r10 = r10 + r1
            char r10 = (char) r10
            r8.append(r10)
            int r9 = r9 % 10
            goto L56
        L53:
            r8.append(r1)
        L56:
            int r9 = r9 + r1
            char r9 = (char) r9
            r8.append(r9)
            goto L7f
        L5c:
            char[] r0 = new char[r0]
            r2 = 0
        L5f:
            if (r9 == 0) goto L6d
            int r3 = r2 + 1
            int r4 = r9 % 10
            int r4 = r4 + r1
            char r4 = (char) r4
            r0[r2] = r4
            int r9 = r9 / 10
            r2 = r3
            goto L5f
        L6d:
            if (r2 >= r10) goto L75
            r8.append(r1)
            int r10 = r10 + (-1)
            goto L6d
        L75:
            int r2 = r2 + (-1)
            if (r2 < 0) goto L7f
            char r9 = r0[r2]
            r8.append(r9)
            goto L75
        L7f:
            return
    }

    private <B extends java.lang.Appendable> B applyRules(java.util.Calendar r5, B r6) {
            r4 = this;
            org.apache.commons.lang3.time.FastDatePrinter$Rule[] r0 = r4.mRules     // Catch: java.io.IOException -> Le
            int r1 = r0.length     // Catch: java.io.IOException -> Le
            r2 = 0
        L4:
            if (r2 >= r1) goto L12
            r3 = r0[r2]     // Catch: java.io.IOException -> Le
            r3.appendTo(r6, r5)     // Catch: java.io.IOException -> Le
            int r2 = r2 + 1
            goto L4
        Le:
            r5 = move-exception
            org.apache.commons.lang3.exception.ExceptionUtils.rethrow(r5)
        L12:
            return r6
    }

    private java.lang.String applyRulesToString(java.util.Calendar r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r2.mMaxLengthEstimate
            r0.<init>(r1)
            java.lang.Appendable r3 = r2.applyRules(r3, r0)
            java.lang.StringBuilder r3 = (java.lang.StringBuilder) r3
            java.lang.String r3 = r3.toString()
            return r3
    }

    static java.lang.String getTimeZoneDisplay(java.util.TimeZone r3, boolean r4, int r5, java.util.Locale r6) {
            org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey r0 = new org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey
            r0.<init>(r3, r4, r5, r6)
            java.util.concurrent.ConcurrentMap<org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey, java.lang.String> r1 = org.apache.commons.lang3.time.FastDatePrinter.cTimeZoneDisplayCache
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L1c
            java.lang.String r2 = r3.getDisplayName(r4, r5, r6)
            java.lang.Object r3 = r1.putIfAbsent(r0, r2)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L1c
            r2 = r3
        L1c:
            return r2
    }

    private void init() {
            r3 = this;
            java.util.List r0 = r3.parsePattern()
            int r1 = r0.size()
            org.apache.commons.lang3.time.FastDatePrinter$Rule[] r1 = new org.apache.commons.lang3.time.FastDatePrinter.Rule[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            org.apache.commons.lang3.time.FastDatePrinter$Rule[] r0 = (org.apache.commons.lang3.time.FastDatePrinter.Rule[]) r0
            r3.mRules = r0
            int r0 = r0.length
            r1 = 0
        L14:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L22
            org.apache.commons.lang3.time.FastDatePrinter$Rule[] r2 = r3.mRules
            r2 = r2[r0]
            int r2 = r2.estimateLength()
            int r1 = r1 + r2
            goto L14
        L22:
            r3.mMaxLengthEstimate = r1
            return
    }

    private java.util.Calendar newCalendar() {
            r2 = this;
            java.util.TimeZone r0 = r2.mTimeZone
            java.util.Locale r1 = r2.mLocale
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0, r1)
            return r0
    }

    private void readObject(java.io.ObjectInputStream r1) throws java.io.IOException, java.lang.ClassNotFoundException {
            r0 = this;
            r1.defaultReadObject()
            r0.init()
            return
    }

    @java.lang.Deprecated
    protected java.lang.StringBuffer applyRules(java.util.Calendar r1, java.lang.StringBuffer r2) {
            r0 = this;
            java.lang.Appendable r1 = r0.applyRules(r1, r2)
            java.lang.StringBuffer r1 = (java.lang.StringBuffer) r1
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof org.apache.commons.lang3.time.FastDatePrinter
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            org.apache.commons.lang3.time.FastDatePrinter r4 = (org.apache.commons.lang3.time.FastDatePrinter) r4
            java.lang.String r0 = r3.mPattern
            java.lang.String r2 = r4.mPattern
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L27
            java.util.TimeZone r0 = r3.mTimeZone
            java.util.TimeZone r2 = r4.mTimeZone
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L27
            java.util.Locale r0 = r3.mLocale
            java.util.Locale r4 = r4.mLocale
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L27
            r1 = 1
        L27:
            return r1
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public <B extends java.lang.Appendable> B format(long r2, B r4) {
            r1 = this;
            java.util.Calendar r0 = r1.newCalendar()
            r0.setTimeInMillis(r2)
            java.lang.Appendable r2 = r1.applyRules(r0, r4)
            return r2
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public <B extends java.lang.Appendable> B format(java.util.Calendar r3, B r4) {
            r2 = this;
            java.util.TimeZone r0 = r3.getTimeZone()
            java.util.TimeZone r1 = r2.mTimeZone
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            java.lang.Object r3 = r3.clone()
            java.util.Calendar r3 = (java.util.Calendar) r3
            java.util.TimeZone r0 = r2.mTimeZone
            r3.setTimeZone(r0)
        L17:
            java.lang.Appendable r3 = r2.applyRules(r3, r4)
            return r3
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public <B extends java.lang.Appendable> B format(java.util.Date r2, B r3) {
            r1 = this;
            java.util.Calendar r0 = r1.newCalendar()
            r0.setTime(r2)
            java.lang.Appendable r2 = r1.applyRules(r0, r3)
            return r2
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.lang.String format(long r2) {
            r1 = this;
            java.util.Calendar r0 = r1.newCalendar()
            r0.setTimeInMillis(r2)
            java.lang.String r2 = r1.applyRulesToString(r0)
            return r2
    }

    java.lang.String format(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Date
            if (r0 == 0) goto Lb
            java.util.Date r4 = (java.util.Date) r4
            java.lang.String r4 = r3.format(r4)
            return r4
        Lb:
            boolean r0 = r4 instanceof java.util.Calendar
            if (r0 == 0) goto L16
            java.util.Calendar r4 = (java.util.Calendar) r4
            java.lang.String r4 = r3.format(r4)
            return r4
        L16:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L25
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
            java.lang.String r4 = r3.format(r0)
            return r4
        L25:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown class: "
            r1.append(r2)
            if (r4 != 0) goto L36
            java.lang.String r4 = "<null>"
            goto L3e
        L36:
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
        L3e:
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.lang.String format(java.util.Calendar r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r2.mMaxLengthEstimate
            r0.<init>(r1)
            java.lang.Appendable r3 = r2.format(r3, r0)
            java.lang.StringBuilder r3 = (java.lang.StringBuilder) r3
            java.lang.String r3 = r3.toString()
            return r3
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.lang.String format(java.util.Date r2) {
            r1 = this;
            java.util.Calendar r0 = r1.newCalendar()
            r0.setTime(r2)
            java.lang.String r2 = r1.applyRulesToString(r0)
            return r2
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.lang.StringBuffer format(long r2, java.lang.StringBuffer r4) {
            r1 = this;
            java.util.Calendar r0 = r1.newCalendar()
            r0.setTimeInMillis(r2)
            java.lang.Appendable r2 = r1.applyRules(r0, r4)
            java.lang.StringBuffer r2 = (java.lang.StringBuffer) r2
            return r2
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    @java.lang.Deprecated
    public java.lang.StringBuffer format(java.lang.Object r3, java.lang.StringBuffer r4, java.text.FieldPosition r5) {
            r2 = this;
            boolean r5 = r3 instanceof java.util.Date
            if (r5 == 0) goto Lb
            java.util.Date r3 = (java.util.Date) r3
            java.lang.StringBuffer r3 = r2.format(r3, r4)
            return r3
        Lb:
            boolean r5 = r3 instanceof java.util.Calendar
            if (r5 == 0) goto L16
            java.util.Calendar r3 = (java.util.Calendar) r3
            java.lang.StringBuffer r3 = r2.format(r3, r4)
            return r3
        L16:
            boolean r5 = r3 instanceof java.lang.Long
            if (r5 == 0) goto L25
            java.lang.Long r3 = (java.lang.Long) r3
            long r0 = r3.longValue()
            java.lang.StringBuffer r3 = r2.format(r0, r4)
            return r3
        L25:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Unknown class: "
            r5.append(r0)
            if (r3 != 0) goto L36
            java.lang.String r3 = "<null>"
            goto L3e
        L36:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
        L3e:
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.lang.StringBuffer format(java.util.Calendar r1, java.lang.StringBuffer r2) {
            r0 = this;
            java.util.Date r1 = r1.getTime()
            java.lang.StringBuffer r1 = r0.format(r1, r2)
            return r1
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.lang.StringBuffer format(java.util.Date r2, java.lang.StringBuffer r3) {
            r1 = this;
            java.util.Calendar r0 = r1.newCalendar()
            r0.setTime(r2)
            java.lang.Appendable r2 = r1.applyRules(r0, r3)
            java.lang.StringBuffer r2 = (java.lang.StringBuffer) r2
            return r2
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.util.Locale getLocale() {
            r1 = this;
            java.util.Locale r0 = r1.mLocale
            return r0
    }

    public int getMaxLengthEstimate() {
            r1 = this;
            int r0 = r1.mMaxLengthEstimate
            return r0
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.lang.String getPattern() {
            r1 = this;
            java.lang.String r0 = r1.mPattern
            return r0
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.util.TimeZone getTimeZone() {
            r1 = this;
            java.util.TimeZone r0 = r1.mTimeZone
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.mPattern
            int r0 = r0.hashCode()
            java.util.TimeZone r1 = r3.mTimeZone
            int r1 = r1.hashCode()
            java.util.Locale r2 = r3.mLocale
            int r2 = r2.hashCode()
            int r2 = r2 * 13
            int r1 = r1 + r2
            int r1 = r1 * 13
            int r0 = r0 + r1
            return r0
    }

    protected java.util.List<org.apache.commons.lang3.time.FastDatePrinter.Rule> parsePattern() {
            r16 = this;
            r0 = r16
            java.text.DateFormatSymbols r1 = new java.text.DateFormatSymbols
            java.util.Locale r2 = r0.mLocale
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String[] r3 = r1.getEras()
            java.lang.String[] r4 = r1.getMonths()
            java.lang.String[] r5 = r1.getShortMonths()
            java.lang.String[] r6 = r1.getWeekdays()
            java.lang.String[] r7 = r1.getShortWeekdays()
            java.lang.String[] r1 = r1.getAmPmStrings()
            java.lang.String r8 = r0.mPattern
            int r8 = r8.length()
            r9 = 1
            int[] r10 = new int[r9]
            r11 = 0
            r12 = 0
        L31:
            if (r12 >= r8) goto L184
            r10[r11] = r12
            java.lang.String r12 = r0.mPattern
            java.lang.String r12 = r0.parseToken(r12, r10)
            r13 = r10[r11]
            int r14 = r12.length()
            if (r14 != 0) goto L45
            goto L184
        L45:
            char r15 = r12.charAt(r11)
            r11 = 121(0x79, float:1.7E-43)
            r9 = 4
            if (r15 == r11) goto L82
            r11 = 122(0x7a, float:1.71E-43)
            if (r15 == r11) goto L148
            r11 = 7
            switch(r15) {
                case 39: goto L12a;
                case 75: goto L123;
                case 77: goto L108;
                case 83: goto L101;
                case 97: goto Lf9;
                case 100: goto Lf3;
                case 104: goto Le7;
                case 107: goto Ldb;
                case 109: goto Ld4;
                case 115: goto Lcd;
                case 117: goto Lc3;
                case 119: goto Lbd;
                default: goto L56;
            }
        L56:
            switch(r15) {
                case 68: goto Lb3;
                case 69: goto La8;
                case 70: goto La1;
                case 71: goto L97;
                case 72: goto L90;
                default: goto L59;
            }
        L59:
            switch(r15) {
                case 87: goto L8b;
                case 88: goto L86;
                case 89: goto L82;
                case 90: goto L73;
                default: goto L5c;
            }
        L5c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Illegal pattern component: "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L73:
            r9 = 1
            if (r14 != r9) goto L79
            org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNumberRule r9 = org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.INSTANCE_NO_COLON
            goto Lb8
        L79:
            r9 = 2
            if (r14 != r9) goto L7f
            org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule r9 = org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS_COLON_MINUTES
            goto Lb8
        L7f:
            org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNumberRule r9 = org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.INSTANCE_COLON
            goto Lb8
        L82:
            r11 = 0
            r12 = 2
            goto L162
        L86:
            org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule r9 = org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.getRule(r14)
            goto Lb8
        L8b:
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r14)
            goto Lb8
        L90:
            r9 = 11
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r14)
            goto Lb8
        L97:
            org.apache.commons.lang3.time.FastDatePrinter$TextField r9 = new org.apache.commons.lang3.time.FastDatePrinter$TextField
            r11 = 0
            r9.<init>(r11, r3)
            r12 = r9
            r9 = 1
            goto L17d
        La1:
            r9 = 8
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r14)
            goto Lb8
        La8:
            org.apache.commons.lang3.time.FastDatePrinter$TextField r12 = new org.apache.commons.lang3.time.FastDatePrinter$TextField
            if (r14 >= r9) goto Lae
            r9 = r7
            goto Laf
        Lae:
            r9 = r6
        Laf:
            r12.<init>(r11, r9)
            goto Lb9
        Lb3:
            r9 = 6
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r14)
        Lb8:
            r12 = r9
        Lb9:
            r9 = 1
            r11 = 0
            goto L17d
        Lbd:
            r9 = 3
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r14)
            goto Lb8
        Lc3:
            org.apache.commons.lang3.time.FastDatePrinter$DayInWeekField r9 = new org.apache.commons.lang3.time.FastDatePrinter$DayInWeekField
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r11 = r0.selectNumberRule(r11, r14)
            r9.<init>(r11)
            goto Lb8
        Lcd:
            r9 = 13
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r14)
            goto Lb8
        Ld4:
            r9 = 12
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r14)
            goto Lb8
        Ldb:
            org.apache.commons.lang3.time.FastDatePrinter$TwentyFourHourField r9 = new org.apache.commons.lang3.time.FastDatePrinter$TwentyFourHourField
            r11 = 11
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r11 = r0.selectNumberRule(r11, r14)
            r9.<init>(r11)
            goto Lb8
        Le7:
            org.apache.commons.lang3.time.FastDatePrinter$TwelveHourField r9 = new org.apache.commons.lang3.time.FastDatePrinter$TwelveHourField
            r11 = 10
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r11 = r0.selectNumberRule(r11, r14)
            r9.<init>(r11)
            goto Lb8
        Lf3:
            r9 = 5
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r14)
            goto Lb8
        Lf9:
            org.apache.commons.lang3.time.FastDatePrinter$TextField r9 = new org.apache.commons.lang3.time.FastDatePrinter$TextField
            r11 = 9
            r9.<init>(r11, r1)
            goto Lb8
        L101:
            r9 = 14
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r14)
            goto Lb8
        L108:
            if (r14 < r9) goto L111
            org.apache.commons.lang3.time.FastDatePrinter$TextField r9 = new org.apache.commons.lang3.time.FastDatePrinter$TextField
            r11 = 2
            r9.<init>(r11, r4)
            goto Lb8
        L111:
            r9 = 3
            r11 = 2
            if (r14 != r9) goto L11b
            org.apache.commons.lang3.time.FastDatePrinter$TextField r9 = new org.apache.commons.lang3.time.FastDatePrinter$TextField
            r9.<init>(r11, r5)
            goto Lb8
        L11b:
            if (r14 != r11) goto L120
            org.apache.commons.lang3.time.FastDatePrinter$TwoDigitMonthField r9 = org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField.INSTANCE
            goto Lb8
        L120:
            org.apache.commons.lang3.time.FastDatePrinter$UnpaddedMonthField r9 = org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField.INSTANCE
            goto Lb8
        L123:
            r9 = 10
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r14)
            goto Lb8
        L12a:
            r9 = 1
            java.lang.String r11 = r12.substring(r9)
            int r12 = r11.length()
            if (r12 != r9) goto L141
            org.apache.commons.lang3.time.FastDatePrinter$CharacterLiteral r9 = new org.apache.commons.lang3.time.FastDatePrinter$CharacterLiteral
            r12 = 0
            char r11 = r11.charAt(r12)
            r9.<init>(r11)
            goto Lb8
        L141:
            org.apache.commons.lang3.time.FastDatePrinter$StringLiteral r9 = new org.apache.commons.lang3.time.FastDatePrinter$StringLiteral
            r9.<init>(r11)
            goto Lb8
        L148:
            if (r14 < r9) goto L156
            org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNameRule r9 = new org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNameRule
            java.util.TimeZone r11 = r0.mTimeZone
            java.util.Locale r12 = r0.mLocale
            r14 = 1
            r9.<init>(r11, r12, r14)
            goto Lb8
        L156:
            org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNameRule r9 = new org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNameRule
            java.util.TimeZone r11 = r0.mTimeZone
            java.util.Locale r12 = r0.mLocale
            r14 = 0
            r9.<init>(r11, r12, r14)
            goto Lb8
        L162:
            if (r14 != r12) goto L169
            org.apache.commons.lang3.time.FastDatePrinter$TwoDigitYearField r9 = org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField.INSTANCE
            r12 = r9
            r9 = 1
            goto L173
        L169:
            if (r14 >= r9) goto L16e
            r9 = 1
            r14 = 4
            goto L16f
        L16e:
            r9 = 1
        L16f:
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r12 = r0.selectNumberRule(r9, r14)
        L173:
            r14 = 89
            if (r15 != r14) goto L17d
            org.apache.commons.lang3.time.FastDatePrinter$WeekYear r14 = new org.apache.commons.lang3.time.FastDatePrinter$WeekYear
            r14.<init>(r12)
            r12 = r14
        L17d:
            r2.add(r12)
            int r12 = r13 + 1
            goto L31
        L184:
            return r2
    }

    protected java.lang.String parseToken(java.lang.String r14, int[] r15) {
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = r15[r1]
            int r3 = r14.length()
            char r4 = r14.charAt(r2)
            r5 = 90
            r6 = 65
            if (r4 < r6) goto L18
            if (r4 <= r5) goto L20
        L18:
            r7 = 122(0x7a, float:1.71E-43)
            r8 = 97
            if (r4 < r8) goto L32
            if (r4 > r7) goto L32
        L20:
            r0.append(r4)
        L23:
            int r5 = r2 + 1
            if (r5 >= r3) goto L65
            char r6 = r14.charAt(r5)
            if (r6 != r4) goto L65
            r0.append(r4)
            r2 = r5
            goto L23
        L32:
            r4 = 39
            r0.append(r4)
            r9 = 0
        L38:
            if (r2 >= r3) goto L65
            char r10 = r14.charAt(r2)
            if (r10 != r4) goto L52
            int r11 = r2 + 1
            if (r11 >= r3) goto L4f
            char r12 = r14.charAt(r11)
            if (r12 != r4) goto L4f
            r0.append(r10)
            r2 = r11
            goto L62
        L4f:
            r9 = r9 ^ 1
            goto L62
        L52:
            if (r9 != 0) goto L5f
            if (r10 < r6) goto L58
            if (r10 <= r5) goto L5c
        L58:
            if (r10 < r8) goto L5f
            if (r10 > r7) goto L5f
        L5c:
            int r2 = r2 + (-1)
            goto L65
        L5f:
            r0.append(r10)
        L62:
            int r2 = r2 + 1
            goto L38
        L65:
            r15[r1] = r2
            java.lang.String r14 = r0.toString()
            return r14
    }

    protected org.apache.commons.lang3.time.FastDatePrinter.NumberRule selectNumberRule(int r2, int r3) {
            r1 = this;
            r0 = 1
            if (r3 == r0) goto L12
            r0 = 2
            if (r3 == r0) goto Lc
            org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField r0 = new org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField
            r0.<init>(r2, r3)
            return r0
        Lc:
            org.apache.commons.lang3.time.FastDatePrinter$TwoDigitNumberField r3 = new org.apache.commons.lang3.time.FastDatePrinter$TwoDigitNumberField
            r3.<init>(r2)
            return r3
        L12:
            org.apache.commons.lang3.time.FastDatePrinter$UnpaddedNumberField r3 = new org.apache.commons.lang3.time.FastDatePrinter$UnpaddedNumberField
            r3.<init>(r2)
            return r3
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FastDatePrinter["
            r0.append(r1)
            java.lang.String r1 = r3.mPattern
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            java.util.Locale r2 = r3.mLocale
            r0.append(r2)
            r0.append(r1)
            java.util.TimeZone r1 = r3.mTimeZone
            java.lang.String r1 = r1.getID()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
