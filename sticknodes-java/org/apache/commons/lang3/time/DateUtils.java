package org.apache.commons.lang3.time;

/* loaded from: classes2.dex */
public class DateUtils {
    public static final long MILLIS_PER_DAY = 86400000;
    public static final long MILLIS_PER_HOUR = 3600000;
    public static final long MILLIS_PER_MINUTE = 60000;
    public static final long MILLIS_PER_SECOND = 1000;
    public static final int RANGE_MONTH_MONDAY = 6;
    public static final int RANGE_MONTH_SUNDAY = 5;
    public static final int RANGE_WEEK_CENTER = 4;
    public static final int RANGE_WEEK_MONDAY = 2;
    public static final int RANGE_WEEK_RELATIVE = 3;
    public static final int RANGE_WEEK_SUNDAY = 1;
    public static final int SEMI_MONTH = 1001;
    private static final int[][] fields = null;

    static class DateIterator implements java.util.Iterator<java.util.Calendar> {
        private final java.util.Calendar endFinal;
        private final java.util.Calendar spot;

        DateIterator(java.util.Calendar r2, java.util.Calendar r3) {
                r1 = this;
                r1.<init>()
                r1.endFinal = r3
                r1.spot = r2
                r3 = 5
                r0 = -1
                r2.add(r3, r0)
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                java.util.Calendar r0 = r2.spot
                java.util.Calendar r1 = r2.endFinal
                boolean r0 = r0.before(r1)
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.util.Calendar next() {
                r1 = this;
                java.util.Calendar r0 = r1.next2()
                return r0
        }

        @Override // java.util.Iterator
        /* renamed from: next, reason: avoid collision after fix types in other method */
        public java.util.Calendar next2() {
                r3 = this;
                java.util.Calendar r0 = r3.spot
                java.util.Calendar r1 = r3.endFinal
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L1a
                java.util.Calendar r0 = r3.spot
                r1 = 5
                r2 = 1
                r0.add(r1, r2)
                java.util.Calendar r0 = r3.spot
                java.lang.Object r0 = r0.clone()
                java.util.Calendar r0 = (java.util.Calendar) r0
                return r0
            L1a:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }
    }

    private enum ModifyType extends java.lang.Enum<org.apache.commons.lang3.time.DateUtils.ModifyType> {
        private static final /* synthetic */ org.apache.commons.lang3.time.DateUtils.ModifyType[] $VALUES = null;
        public static final org.apache.commons.lang3.time.DateUtils.ModifyType CEILING = null;
        public static final org.apache.commons.lang3.time.DateUtils.ModifyType ROUND = null;
        public static final org.apache.commons.lang3.time.DateUtils.ModifyType TRUNCATE = null;

        static {
                org.apache.commons.lang3.time.DateUtils$ModifyType r0 = new org.apache.commons.lang3.time.DateUtils$ModifyType
                java.lang.String r1 = "TRUNCATE"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.lang3.time.DateUtils.ModifyType.TRUNCATE = r0
                org.apache.commons.lang3.time.DateUtils$ModifyType r1 = new org.apache.commons.lang3.time.DateUtils$ModifyType
                java.lang.String r3 = "ROUND"
                r4 = 1
                r1.<init>(r3, r4)
                org.apache.commons.lang3.time.DateUtils.ModifyType.ROUND = r1
                org.apache.commons.lang3.time.DateUtils$ModifyType r3 = new org.apache.commons.lang3.time.DateUtils$ModifyType
                java.lang.String r5 = "CEILING"
                r6 = 2
                r3.<init>(r5, r6)
                org.apache.commons.lang3.time.DateUtils.ModifyType.CEILING = r3
                r5 = 3
                org.apache.commons.lang3.time.DateUtils$ModifyType[] r5 = new org.apache.commons.lang3.time.DateUtils.ModifyType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                org.apache.commons.lang3.time.DateUtils.ModifyType.$VALUES = r5
                return
        }

        ModifyType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.lang3.time.DateUtils.ModifyType valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.lang3.time.DateUtils$ModifyType> r0 = org.apache.commons.lang3.time.DateUtils.ModifyType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.lang3.time.DateUtils$ModifyType r1 = (org.apache.commons.lang3.time.DateUtils.ModifyType) r1
                return r1
        }

        public static org.apache.commons.lang3.time.DateUtils.ModifyType[] values() {
                org.apache.commons.lang3.time.DateUtils$ModifyType[] r0 = org.apache.commons.lang3.time.DateUtils.ModifyType.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.lang3.time.DateUtils$ModifyType[] r0 = (org.apache.commons.lang3.time.DateUtils.ModifyType[]) r0
                return r0
        }
    }

    static {
            r0 = 8
            int[][] r0 = new int[r0][]
            r1 = 1
            int[] r2 = new int[r1]
            r3 = 14
            r4 = 0
            r2[r4] = r3
            r0[r4] = r2
            int[] r2 = new int[r1]
            r3 = 13
            r2[r4] = r3
            r0[r1] = r2
            int[] r2 = new int[r1]
            r3 = 12
            r2[r4] = r3
            r3 = 2
            r0[r3] = r2
            int[] r2 = new int[r3]
            r2 = {x0048: FILL_ARRAY_DATA , data: [11, 10} // fill-array
            r5 = 3
            r0[r5] = r2
            int[] r2 = new int[r5]
            r2 = {x0050: FILL_ARRAY_DATA , data: [5, 5, 9} // fill-array
            r5 = 4
            r0[r5] = r2
            int[] r2 = new int[r3]
            r2 = {x005a: FILL_ARRAY_DATA , data: [2, 1001} // fill-array
            r3 = 5
            r0[r3] = r2
            int[] r2 = new int[r1]
            r2[r4] = r1
            r3 = 6
            r0[r3] = r2
            int[] r1 = new int[r1]
            r1[r4] = r4
            r2 = 7
            r0[r2] = r1
            org.apache.commons.lang3.time.DateUtils.fields = r0
            return
    }

    public DateUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.util.Date add(java.util.Date r1, int r2, int r3) {
            validateDateNotNull(r1)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTime(r1)
            r0.add(r2, r3)
            java.util.Date r1 = r0.getTime()
            return r1
    }

    public static java.util.Date addDays(java.util.Date r1, int r2) {
            r0 = 5
            java.util.Date r1 = add(r1, r0, r2)
            return r1
    }

    public static java.util.Date addHours(java.util.Date r1, int r2) {
            r0 = 11
            java.util.Date r1 = add(r1, r0, r2)
            return r1
    }

    public static java.util.Date addMilliseconds(java.util.Date r1, int r2) {
            r0 = 14
            java.util.Date r1 = add(r1, r0, r2)
            return r1
    }

    public static java.util.Date addMinutes(java.util.Date r1, int r2) {
            r0 = 12
            java.util.Date r1 = add(r1, r0, r2)
            return r1
    }

    public static java.util.Date addMonths(java.util.Date r1, int r2) {
            r0 = 2
            java.util.Date r1 = add(r1, r0, r2)
            return r1
    }

    public static java.util.Date addSeconds(java.util.Date r1, int r2) {
            r0 = 13
            java.util.Date r1 = add(r1, r0, r2)
            return r1
    }

    public static java.util.Date addWeeks(java.util.Date r1, int r2) {
            r0 = 3
            java.util.Date r1 = add(r1, r0, r2)
            return r1
    }

    public static java.util.Date addYears(java.util.Date r1, int r2) {
            r0 = 1
            java.util.Date r1 = add(r1, r0, r2)
            return r1
    }

    public static java.util.Calendar ceiling(java.util.Calendar r1, int r2) {
            if (r1 == 0) goto Le
            java.lang.Object r1 = r1.clone()
            java.util.Calendar r1 = (java.util.Calendar) r1
            org.apache.commons.lang3.time.DateUtils$ModifyType r0 = org.apache.commons.lang3.time.DateUtils.ModifyType.CEILING
            modify(r1, r2, r0)
            return r1
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The date must not be null"
            r1.<init>(r2)
            throw r1
    }

    public static java.util.Date ceiling(java.lang.Object r2, int r3) {
            if (r2 == 0) goto L37
            boolean r0 = r2 instanceof java.util.Date
            if (r0 == 0) goto Ld
            java.util.Date r2 = (java.util.Date) r2
            java.util.Date r2 = ceiling(r2, r3)
            return r2
        Ld:
            boolean r0 = r2 instanceof java.util.Calendar
            if (r0 == 0) goto L1c
            java.util.Calendar r2 = (java.util.Calendar) r2
            java.util.Calendar r2 = ceiling(r2, r3)
            java.util.Date r2 = r2.getTime()
            return r2
        L1c:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not find ceiling of for type: "
            r0.append(r1)
            java.lang.Class r2 = r2.getClass()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L37:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The date must not be null"
            r2.<init>(r3)
            throw r2
    }

    public static java.util.Date ceiling(java.util.Date r1, int r2) {
            validateDateNotNull(r1)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTime(r1)
            org.apache.commons.lang3.time.DateUtils$ModifyType r1 = org.apache.commons.lang3.time.DateUtils.ModifyType.CEILING
            modify(r0, r2, r1)
            java.util.Date r1 = r0.getTime()
            return r1
    }

    private static long getFragment(java.util.Calendar r10, int r11, java.util.concurrent.TimeUnit r12) {
            if (r10 == 0) goto L8a
            r0 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r3 = 1
            if (r12 != r2) goto Lb
            r4 = 0
            goto Lc
        Lb:
            r4 = 1
        Lc:
            r5 = 6
            r6 = 5
            r7 = 2
            if (r11 == r3) goto L1f
            if (r11 == r7) goto L14
            goto L2a
        L14:
            int r8 = r10.get(r6)
            int r8 = r8 - r4
            long r8 = (long) r8
            long r8 = r12.convert(r8, r2)
            goto L29
        L1f:
            int r8 = r10.get(r5)
            int r8 = r8 - r4
            long r8 = (long) r8
            long r8 = r12.convert(r8, r2)
        L29:
            long r0 = r0 + r8
        L2a:
            if (r11 == r3) goto L51
            if (r11 == r7) goto L51
            if (r11 == r6) goto L51
            if (r11 == r5) goto L51
            switch(r11) {
                case 11: goto L5f;
                case 12: goto L6d;
                case 13: goto L7b;
                case 14: goto L89;
                default: goto L35;
            }
        L35:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "The fragment "
            r12.append(r0)
            r12.append(r11)
            java.lang.String r11 = " is not supported"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L51:
            r11 = 11
            int r11 = r10.get(r11)
            long r2 = (long) r11
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.HOURS
            long r2 = r12.convert(r2, r11)
            long r0 = r0 + r2
        L5f:
            r11 = 12
            int r11 = r10.get(r11)
            long r2 = (long) r11
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MINUTES
            long r2 = r12.convert(r2, r11)
            long r0 = r0 + r2
        L6d:
            r11 = 13
            int r11 = r10.get(r11)
            long r2 = (long) r11
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r12.convert(r2, r11)
            long r0 = r0 + r2
        L7b:
            r11 = 14
            int r10 = r10.get(r11)
            long r10 = (long) r10
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r10 = r12.convert(r10, r2)
            long r0 = r0 + r10
        L89:
            return r0
        L8a:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "The date must not be null"
            r10.<init>(r11)
            throw r10
    }

    private static long getFragment(java.util.Date r1, int r2, java.util.concurrent.TimeUnit r3) {
            validateDateNotNull(r1)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTime(r1)
            long r1 = getFragment(r0, r2, r3)
            return r1
    }

    public static long getFragmentInDays(java.util.Calendar r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static long getFragmentInDays(java.util.Date r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static long getFragmentInHours(java.util.Calendar r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static long getFragmentInHours(java.util.Date r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static long getFragmentInMilliseconds(java.util.Calendar r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static long getFragmentInMilliseconds(java.util.Date r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static long getFragmentInMinutes(java.util.Calendar r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static long getFragmentInMinutes(java.util.Date r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static long getFragmentInSeconds(java.util.Calendar r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static long getFragmentInSeconds(java.util.Date r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static boolean isSameDay(java.util.Calendar r4, java.util.Calendar r5) {
            if (r4 == 0) goto L27
            if (r5 == 0) goto L27
            r0 = 0
            int r1 = r4.get(r0)
            int r2 = r5.get(r0)
            r3 = 1
            if (r1 != r2) goto L26
            int r1 = r4.get(r3)
            int r2 = r5.get(r3)
            if (r1 != r2) goto L26
            r1 = 6
            int r4 = r4.get(r1)
            int r5 = r5.get(r1)
            if (r4 != r5) goto L26
            r0 = 1
        L26:
            return r0
        L27:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "The date must not be null"
            r4.<init>(r5)
            throw r4
    }

    public static boolean isSameDay(java.util.Date r1, java.util.Date r2) {
            if (r1 == 0) goto L17
            if (r2 == 0) goto L17
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTime(r1)
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r1.setTime(r2)
            boolean r1 = isSameDay(r0, r1)
            return r1
        L17:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The date must not be null"
            r1.<init>(r2)
            throw r1
    }

    public static boolean isSameInstant(java.util.Calendar r3, java.util.Calendar r4) {
            if (r3 == 0) goto L1c
            if (r4 == 0) goto L1c
            java.util.Date r3 = r3.getTime()
            long r0 = r3.getTime()
            java.util.Date r3 = r4.getTime()
            long r3 = r3.getTime()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L1a
            r3 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            return r3
        L1c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The date must not be null"
            r3.<init>(r4)
            throw r3
    }

    public static boolean isSameInstant(java.util.Date r3, java.util.Date r4) {
            if (r3 == 0) goto L14
            if (r4 == 0) goto L14
            long r0 = r3.getTime()
            long r3 = r4.getTime()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            return r3
        L14:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The date must not be null"
            r3.<init>(r4)
            throw r3
    }

    public static boolean isSameLocalTime(java.util.Calendar r4, java.util.Calendar r5) {
            if (r4 == 0) goto L62
            if (r5 == 0) goto L62
            r0 = 14
            int r1 = r4.get(r0)
            int r0 = r5.get(r0)
            r2 = 1
            r3 = 0
            if (r1 != r0) goto L60
            r0 = 13
            int r1 = r4.get(r0)
            int r0 = r5.get(r0)
            if (r1 != r0) goto L60
            r0 = 12
            int r1 = r4.get(r0)
            int r0 = r5.get(r0)
            if (r1 != r0) goto L60
            r0 = 11
            int r1 = r4.get(r0)
            int r0 = r5.get(r0)
            if (r1 != r0) goto L60
            r0 = 6
            int r1 = r4.get(r0)
            int r0 = r5.get(r0)
            if (r1 != r0) goto L60
            int r0 = r4.get(r2)
            int r1 = r5.get(r2)
            if (r0 != r1) goto L60
            int r0 = r4.get(r3)
            int r1 = r5.get(r3)
            if (r0 != r1) goto L60
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r5 = r5.getClass()
            if (r4 != r5) goto L60
            goto L61
        L60:
            r2 = 0
        L61:
            return r2
        L62:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "The date must not be null"
            r4.<init>(r5)
            throw r4
    }

    public static java.util.Iterator<?> iterator(java.lang.Object r2, int r3) {
            if (r2 == 0) goto L2f
            boolean r0 = r2 instanceof java.util.Date
            if (r0 == 0) goto Ld
            java.util.Date r2 = (java.util.Date) r2
            java.util.Iterator r2 = iterator(r2, r3)
            return r2
        Ld:
            boolean r0 = r2 instanceof java.util.Calendar
            if (r0 == 0) goto L18
            java.util.Calendar r2 = (java.util.Calendar) r2
            java.util.Iterator r2 = iterator(r2, r3)
            return r2
        L18:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not iterate based on "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L2f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The date must not be null"
            r2.<init>(r3)
            throw r2
    }

    public static java.util.Iterator<java.util.Calendar> iterator(java.util.Calendar r8, int r9) {
            if (r8 == 0) goto L92
            r0 = -1
            r1 = 2
            r2 = 5
            r3 = 1
            r4 = 7
            switch(r9) {
                case 1: goto L41;
                case 2: goto L41;
                case 3: goto L41;
                case 4: goto L41;
                case 5: goto L26;
                case 6: goto L26;
                default: goto La;
            }
        La:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "The range style "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = " is not valid."
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9)
            throw r8
        L26:
            java.util.Calendar r8 = truncate(r8, r1)
            java.lang.Object r5 = r8.clone()
            java.util.Calendar r5 = (java.util.Calendar) r5
            r5.add(r1, r3)
            r5.add(r2, r0)
            r6 = 6
            if (r9 != r6) goto L3c
            r6 = r5
            r5 = r8
            goto L67
        L3c:
            r6 = r5
            r1 = 1
            r5 = r8
            r8 = 7
            goto L68
        L41:
            java.util.Calendar r5 = truncate(r8, r2)
            java.util.Calendar r6 = truncate(r8, r2)
            if (r9 == r1) goto L67
            r1 = 3
            if (r9 == r1) goto L60
            r7 = 4
            if (r9 == r7) goto L54
            r8 = 7
            r1 = 1
            goto L68
        L54:
            int r9 = r8.get(r4)
            int r9 = r9 - r1
            int r8 = r8.get(r4)
            int r8 = r8 + r1
            r1 = r9
            goto L68
        L60:
            int r1 = r8.get(r4)
            int r8 = r1 + (-1)
            goto L68
        L67:
            r8 = 1
        L68:
            if (r1 >= r3) goto L6c
            int r1 = r1 + 7
        L6c:
            if (r1 <= r4) goto L70
            int r1 = r1 + (-7)
        L70:
            if (r8 >= r3) goto L74
            int r8 = r8 + 7
        L74:
            if (r8 <= r4) goto L78
            int r8 = r8 + (-7)
        L78:
            int r9 = r5.get(r4)
            if (r9 == r1) goto L82
            r5.add(r2, r0)
            goto L78
        L82:
            int r9 = r6.get(r4)
            if (r9 == r8) goto L8c
            r6.add(r2, r3)
            goto L82
        L8c:
            org.apache.commons.lang3.time.DateUtils$DateIterator r8 = new org.apache.commons.lang3.time.DateUtils$DateIterator
            r8.<init>(r5, r6)
            return r8
        L92:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "The date must not be null"
            r8.<init>(r9)
            throw r8
    }

    public static java.util.Iterator<java.util.Calendar> iterator(java.util.Date r1, int r2) {
            validateDateNotNull(r1)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTime(r1)
            java.util.Iterator r1 = iterator(r0, r2)
            return r1
    }

    private static void modify(java.util.Calendar r16, int r17, org.apache.commons.lang3.time.DateUtils.ModifyType r18) {
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = 1
            int r4 = r0.get(r3)
            r5 = 280000000(0x10b07600, float:6.960157E-29)
            if (r4 > r5) goto L154
            r4 = 14
            if (r1 != r4) goto L15
            return
        L15:
            java.util.Date r5 = r16.getTime()
            long r6 = r5.getTime()
            int r4 = r0.get(r4)
            org.apache.commons.lang3.time.DateUtils$ModifyType r8 = org.apache.commons.lang3.time.DateUtils.ModifyType.TRUNCATE
            if (r8 == r2) goto L29
            r9 = 500(0x1f4, float:7.0E-43)
            if (r4 >= r9) goto L2b
        L29:
            long r9 = (long) r4
            long r6 = r6 - r9
        L2b:
            r4 = 13
            if (r1 != r4) goto L31
            r10 = 1
            goto L32
        L31:
            r10 = 0
        L32:
            int r4 = r0.get(r4)
            r11 = 30
            if (r10 != 0) goto L44
            if (r8 == r2) goto L3e
            if (r4 >= r11) goto L44
        L3e:
            long r12 = (long) r4
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r14
            long r6 = r6 - r12
        L44:
            r4 = 12
            if (r1 != r4) goto L49
            r10 = 1
        L49:
            int r12 = r0.get(r4)
            if (r10 != 0) goto L5a
            if (r8 == r2) goto L53
            if (r12 >= r11) goto L5a
        L53:
            long r10 = (long) r12
            r12 = 60000(0xea60, double:2.9644E-319)
            long r10 = r10 * r12
            long r6 = r6 - r10
        L5a:
            long r10 = r5.getTime()
            int r8 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r8 == 0) goto L68
            r5.setTime(r6)
            r0.setTime(r5)
        L68:
            int[][] r5 = org.apache.commons.lang3.time.DateUtils.fields
            int r6 = r5.length
            r7 = 0
            r8 = 0
        L6d:
            if (r7 >= r6) goto L138
            r10 = r5[r7]
            int r11 = r10.length
            r12 = 0
        L73:
            r13 = 15
            r14 = 2
            r15 = 1001(0x3e9, float:1.403E-42)
            r4 = 5
            if (r12 >= r11) goto Lc6
            r9 = r10[r12]
            if (r9 != r1) goto Lc0
            org.apache.commons.lang3.time.DateUtils$ModifyType r5 = org.apache.commons.lang3.time.DateUtils.ModifyType.CEILING
            if (r2 == r5) goto L89
            org.apache.commons.lang3.time.DateUtils$ModifyType r5 = org.apache.commons.lang3.time.DateUtils.ModifyType.ROUND
            if (r2 != r5) goto Lbf
            if (r8 == 0) goto Lbf
        L89:
            if (r1 != r15) goto L9e
            int r1 = r0.get(r4)
            if (r1 != r3) goto L95
            r0.add(r4, r13)
            goto Lbf
        L95:
            r1 = -15
            r0.add(r4, r1)
            r0.add(r14, r3)
            goto Lbf
        L9e:
            r2 = 9
            if (r1 != r2) goto Lb9
            r1 = 11
            int r2 = r0.get(r1)
            if (r2 != 0) goto Lb0
            r2 = 12
            r0.add(r1, r2)
            goto Lbf
        Lb0:
            r2 = -12
            r0.add(r1, r2)
            r0.add(r4, r3)
            goto Lbf
        Lb9:
            r9 = 0
            r1 = r10[r9]
            r0.add(r1, r3)
        Lbf:
            return
        Lc0:
            r9 = 0
            int r12 = r12 + 1
            r4 = 12
            goto L73
        Lc6:
            r9 = 0
            r11 = 9
            if (r1 == r11) goto Le8
            if (r1 == r15) goto Ld0
        Lcd:
            r9 = 12
            goto L102
        Ld0:
            r11 = r10[r9]
            if (r11 != r4) goto Lcd
            int r4 = r0.get(r4)
            int r4 = r4 - r3
            if (r4 < r13) goto Ldd
            int r4 = r4 + (-15)
        Ldd:
            r8 = 7
            if (r4 <= r8) goto Le2
            r8 = 1
            goto Le3
        Le2:
            r8 = 0
        Le3:
            r11 = r4
            r4 = 1
            r9 = 12
            goto L104
        Le8:
            r4 = 0
            r9 = r10[r4]
            r4 = 11
            if (r9 != r4) goto Lcd
            int r4 = r0.get(r4)
            r9 = 12
            if (r4 < r9) goto Lf9
            int r4 = r4 + (-12)
        Lf9:
            r8 = 6
            if (r4 < r8) goto Lfe
            r8 = 1
            goto Lff
        Lfe:
            r8 = 0
        Lff:
            r11 = r4
            r4 = 1
            goto L104
        L102:
            r4 = 0
            r11 = 0
        L104:
            if (r4 != 0) goto L123
            r4 = 0
            r8 = r10[r4]
            int r8 = r0.getActualMinimum(r8)
            r11 = r10[r4]
            int r11 = r0.getActualMaximum(r11)
            r12 = r10[r4]
            int r12 = r0.get(r12)
            int r12 = r12 - r8
            int r11 = r11 - r8
            int r11 = r11 / r14
            if (r12 <= r11) goto L120
            r8 = 1
            goto L121
        L120:
            r8 = 0
        L121:
            r11 = r12
            goto L124
        L123:
            r4 = 0
        L124:
            if (r11 == 0) goto L132
            r12 = r10[r4]
            r10 = r10[r4]
            int r10 = r0.get(r10)
            int r10 = r10 - r11
            r0.set(r12, r10)
        L132:
            int r7 = r7 + 1
            r4 = 12
            goto L6d
        L138:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The field "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " is not supported"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L154:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Calendar value too large for accurate calculations"
            r0.<init>(r1)
            throw r0
    }

    public static java.util.Date parseDate(java.lang.String r1, java.util.Locale r2, java.lang.String... r3) throws java.text.ParseException {
            r0 = 1
            java.util.Date r1 = parseDateWithLeniency(r1, r2, r3, r0)
            return r1
    }

    public static java.util.Date parseDate(java.lang.String r1, java.lang.String... r2) throws java.text.ParseException {
            r0 = 0
            java.util.Date r1 = parseDate(r1, r0, r2)
            return r1
    }

    public static java.util.Date parseDateStrictly(java.lang.String r1, java.util.Locale r2, java.lang.String... r3) throws java.text.ParseException {
            r0 = 0
            java.util.Date r1 = parseDateWithLeniency(r1, r2, r3, r0)
            return r1
    }

    public static java.util.Date parseDateStrictly(java.lang.String r1, java.lang.String... r2) throws java.text.ParseException {
            r0 = 0
            java.util.Date r1 = parseDateStrictly(r1, r0, r2)
            return r1
    }

    private static java.util.Date parseDateWithLeniency(java.lang.String r7, java.util.Locale r8, java.lang.String[] r9, boolean r10) throws java.text.ParseException {
            if (r7 == 0) goto L5c
            if (r9 == 0) goto L5c
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            if (r8 != 0) goto Le
            java.util.Locale r8 = java.util.Locale.getDefault()
        Le:
            java.text.ParsePosition r1 = new java.text.ParsePosition
            r2 = 0
            r1.<init>(r2)
            java.util.Calendar r3 = java.util.Calendar.getInstance(r0, r8)
            r3.setLenient(r10)
            int r10 = r9.length
            r4 = 0
        L1d:
            if (r4 >= r10) goto L44
            r5 = r9[r4]
            org.apache.commons.lang3.time.FastDateParser r6 = new org.apache.commons.lang3.time.FastDateParser
            r6.<init>(r5, r0, r8)
            r3.clear()
            boolean r5 = r6.parse(r7, r1, r3)     // Catch: java.lang.IllegalArgumentException -> L3e
            if (r5 == 0) goto L3e
            int r5 = r1.getIndex()     // Catch: java.lang.IllegalArgumentException -> L3e
            int r6 = r7.length()     // Catch: java.lang.IllegalArgumentException -> L3e
            if (r5 != r6) goto L3e
            java.util.Date r7 = r3.getTime()     // Catch: java.lang.IllegalArgumentException -> L3e
            return r7
        L3e:
            r1.setIndex(r2)
            int r4 = r4 + 1
            goto L1d
        L44:
            java.text.ParseException r8 = new java.text.ParseException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unable to parse the date: "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r9 = -1
            r8.<init>(r7, r9)
            throw r8
        L5c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Date and Patterns must not be null"
            r7.<init>(r8)
            throw r7
    }

    public static java.util.Calendar round(java.util.Calendar r1, int r2) {
            if (r1 == 0) goto Le
            java.lang.Object r1 = r1.clone()
            java.util.Calendar r1 = (java.util.Calendar) r1
            org.apache.commons.lang3.time.DateUtils$ModifyType r0 = org.apache.commons.lang3.time.DateUtils.ModifyType.ROUND
            modify(r1, r2, r0)
            return r1
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The date must not be null"
            r1.<init>(r2)
            throw r1
    }

    public static java.util.Date round(java.lang.Object r2, int r3) {
            if (r2 == 0) goto L33
            boolean r0 = r2 instanceof java.util.Date
            if (r0 == 0) goto Ld
            java.util.Date r2 = (java.util.Date) r2
            java.util.Date r2 = round(r2, r3)
            return r2
        Ld:
            boolean r0 = r2 instanceof java.util.Calendar
            if (r0 == 0) goto L1c
            java.util.Calendar r2 = (java.util.Calendar) r2
            java.util.Calendar r2 = round(r2, r3)
            java.util.Date r2 = r2.getTime()
            return r2
        L1c:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not round "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L33:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The date must not be null"
            r2.<init>(r3)
            throw r2
    }

    public static java.util.Date round(java.util.Date r1, int r2) {
            validateDateNotNull(r1)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTime(r1)
            org.apache.commons.lang3.time.DateUtils$ModifyType r1 = org.apache.commons.lang3.time.DateUtils.ModifyType.ROUND
            modify(r0, r2, r1)
            java.util.Date r1 = r0.getTime()
            return r1
    }

    private static java.util.Date set(java.util.Date r2, int r3, int r4) {
            validateDateNotNull(r2)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 0
            r0.setLenient(r1)
            r0.setTime(r2)
            r0.set(r3, r4)
            java.util.Date r2 = r0.getTime()
            return r2
    }

    public static java.util.Date setDays(java.util.Date r1, int r2) {
            r0 = 5
            java.util.Date r1 = set(r1, r0, r2)
            return r1
    }

    public static java.util.Date setHours(java.util.Date r1, int r2) {
            r0 = 11
            java.util.Date r1 = set(r1, r0, r2)
            return r1
    }

    public static java.util.Date setMilliseconds(java.util.Date r1, int r2) {
            r0 = 14
            java.util.Date r1 = set(r1, r0, r2)
            return r1
    }

    public static java.util.Date setMinutes(java.util.Date r1, int r2) {
            r0 = 12
            java.util.Date r1 = set(r1, r0, r2)
            return r1
    }

    public static java.util.Date setMonths(java.util.Date r1, int r2) {
            r0 = 2
            java.util.Date r1 = set(r1, r0, r2)
            return r1
    }

    public static java.util.Date setSeconds(java.util.Date r1, int r2) {
            r0 = 13
            java.util.Date r1 = set(r1, r0, r2)
            return r1
    }

    public static java.util.Date setYears(java.util.Date r1, int r2) {
            r0 = 1
            java.util.Date r1 = set(r1, r0, r2)
            return r1
    }

    public static java.util.Calendar toCalendar(java.util.Date r1) {
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTime(r1)
            return r0
    }

    public static java.util.Calendar toCalendar(java.util.Date r0, java.util.TimeZone r1) {
            java.util.Calendar r1 = java.util.Calendar.getInstance(r1)
            r1.setTime(r0)
            return r1
    }

    public static java.util.Calendar truncate(java.util.Calendar r1, int r2) {
            if (r1 == 0) goto Le
            java.lang.Object r1 = r1.clone()
            java.util.Calendar r1 = (java.util.Calendar) r1
            org.apache.commons.lang3.time.DateUtils$ModifyType r0 = org.apache.commons.lang3.time.DateUtils.ModifyType.TRUNCATE
            modify(r1, r2, r0)
            return r1
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The date must not be null"
            r1.<init>(r2)
            throw r1
    }

    public static java.util.Date truncate(java.lang.Object r2, int r3) {
            if (r2 == 0) goto L33
            boolean r0 = r2 instanceof java.util.Date
            if (r0 == 0) goto Ld
            java.util.Date r2 = (java.util.Date) r2
            java.util.Date r2 = truncate(r2, r3)
            return r2
        Ld:
            boolean r0 = r2 instanceof java.util.Calendar
            if (r0 == 0) goto L1c
            java.util.Calendar r2 = (java.util.Calendar) r2
            java.util.Calendar r2 = truncate(r2, r3)
            java.util.Date r2 = r2.getTime()
            return r2
        L1c:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not truncate "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L33:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The date must not be null"
            r2.<init>(r3)
            throw r2
    }

    public static java.util.Date truncate(java.util.Date r1, int r2) {
            validateDateNotNull(r1)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTime(r1)
            org.apache.commons.lang3.time.DateUtils$ModifyType r1 = org.apache.commons.lang3.time.DateUtils.ModifyType.TRUNCATE
            modify(r0, r2, r1)
            java.util.Date r1 = r0.getTime()
            return r1
    }

    public static int truncatedCompareTo(java.util.Calendar r0, java.util.Calendar r1, int r2) {
            java.util.Calendar r0 = truncate(r0, r2)
            java.util.Calendar r1 = truncate(r1, r2)
            int r0 = r0.compareTo(r1)
            return r0
    }

    public static int truncatedCompareTo(java.util.Date r0, java.util.Date r1, int r2) {
            java.util.Date r0 = truncate(r0, r2)
            java.util.Date r1 = truncate(r1, r2)
            int r0 = r0.compareTo(r1)
            return r0
    }

    public static boolean truncatedEquals(java.util.Calendar r0, java.util.Calendar r1, int r2) {
            int r0 = truncatedCompareTo(r0, r1, r2)
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static boolean truncatedEquals(java.util.Date r0, java.util.Date r1, int r2) {
            int r0 = truncatedCompareTo(r0, r1, r2)
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private static void validateDateNotNull(java.util.Date r2) {
            r0 = 0
            if (r2 == 0) goto L5
            r2 = 1
            goto L6
        L5:
            r2 = 0
        L6:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "The date must not be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r1, r0)
            return
    }
}
