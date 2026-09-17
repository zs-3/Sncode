package org.apache.commons.lang3;

/* loaded from: classes2.dex */
public final class Range<T> implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final java.util.Comparator<T> comparator;
    private transient int hashCode;
    private final T maximum;
    private final T minimum;
    private transient java.lang.String toString;

    private enum ComparableComparator extends java.lang.Enum<org.apache.commons.lang3.Range.ComparableComparator> implements java.util.Comparator {
        private static final /* synthetic */ org.apache.commons.lang3.Range.ComparableComparator[] $VALUES = null;
        public static final org.apache.commons.lang3.Range.ComparableComparator INSTANCE = null;

        static {
                org.apache.commons.lang3.Range$ComparableComparator r0 = new org.apache.commons.lang3.Range$ComparableComparator
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.lang3.Range.ComparableComparator.INSTANCE = r0
                r1 = 1
                org.apache.commons.lang3.Range$ComparableComparator[] r1 = new org.apache.commons.lang3.Range.ComparableComparator[r1]
                r1[r2] = r0
                org.apache.commons.lang3.Range.ComparableComparator.$VALUES = r1
                return
        }

        ComparableComparator(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.lang3.Range.ComparableComparator valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.lang3.Range$ComparableComparator> r0 = org.apache.commons.lang3.Range.ComparableComparator.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.lang3.Range$ComparableComparator r1 = (org.apache.commons.lang3.Range.ComparableComparator) r1
                return r1
        }

        public static org.apache.commons.lang3.Range.ComparableComparator[] values() {
                org.apache.commons.lang3.Range$ComparableComparator[] r0 = org.apache.commons.lang3.Range.ComparableComparator.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.lang3.Range$ComparableComparator[] r0 = (org.apache.commons.lang3.Range.ComparableComparator[]) r0
                return r0
        }

        @Override // java.util.Comparator
        public int compare(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Comparable r1 = (java.lang.Comparable) r1
                int r1 = r1.compareTo(r2)
                return r1
        }
    }

    private Range(T r3, T r4, java.util.Comparator<T> r5) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L23
            if (r4 == 0) goto L23
            if (r5 != 0) goto Le
            org.apache.commons.lang3.Range$ComparableComparator r5 = org.apache.commons.lang3.Range.ComparableComparator.INSTANCE
            r2.comparator = r5
            goto L10
        Le:
            r2.comparator = r5
        L10:
            java.util.Comparator<T> r5 = r2.comparator
            int r5 = r5.compare(r3, r4)
            r0 = 1
            if (r5 >= r0) goto L1e
            r2.minimum = r3
            r2.maximum = r4
            goto L22
        L1e:
            r2.minimum = r4
            r2.maximum = r3
        L22:
            return
        L23:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Elements in a range must not be null: element1="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ", element2="
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            r5.<init>(r3)
            throw r5
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<TT;>;>(TT;TT;)Lorg/apache/commons/lang3/Range<TT;>; */
    public static org.apache.commons.lang3.Range between(java.lang.Comparable r1, java.lang.Comparable r2) {
            r0 = 0
            org.apache.commons.lang3.Range r1 = between(r1, r2, r0)
            return r1
    }

    public static <T> org.apache.commons.lang3.Range<T> between(T r1, T r2, java.util.Comparator<T> r3) {
            org.apache.commons.lang3.Range r0 = new org.apache.commons.lang3.Range
            r0.<init>(r1, r2, r3)
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<TT;>;>(TT;)Lorg/apache/commons/lang3/Range<TT;>; */
    public static org.apache.commons.lang3.Range is(java.lang.Comparable r1) {
            r0 = 0
            org.apache.commons.lang3.Range r1 = between(r1, r1, r0)
            return r1
    }

    public static <T> org.apache.commons.lang3.Range<T> is(T r0, java.util.Comparator<T> r1) {
            org.apache.commons.lang3.Range r0 = between(r0, r0, r1)
            return r0
    }

    public boolean contains(T r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.Comparator<T> r1 = r4.comparator
            T r2 = r4.minimum
            int r1 = r1.compare(r5, r2)
            r2 = -1
            r3 = 1
            if (r1 <= r2) goto L1b
            java.util.Comparator<T> r1 = r4.comparator
            T r2 = r4.maximum
            int r5 = r1.compare(r5, r2)
            if (r5 >= r3) goto L1b
            r0 = 1
        L1b:
            return r0
    }

    public boolean containsRange(org.apache.commons.lang3.Range<T> r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            T r1 = r3.minimum
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L15
            T r3 = r3.maximum
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L15
            r0 = 1
        L15:
            return r0
    }

    public int elementCompareTo(T r4) {
            r3 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Element is null"
            org.apache.commons.lang3.Validate.notNull(r4, r2, r1)
            boolean r1 = r3.isAfter(r4)
            if (r1 == 0) goto L10
            r4 = -1
            return r4
        L10:
            boolean r4 = r3.isBefore(r4)
            if (r4 == 0) goto L18
            r4 = 1
            return r4
        L18:
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L29
            java.lang.Class r2 = r5.getClass()
            java.lang.Class<org.apache.commons.lang3.Range> r3 = org.apache.commons.lang3.Range.class
            if (r2 == r3) goto L10
            goto L29
        L10:
            org.apache.commons.lang3.Range r5 = (org.apache.commons.lang3.Range) r5
            T r2 = r4.minimum
            T r3 = r5.minimum
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L27
            T r2 = r4.maximum
            T r5 = r5.maximum
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
        L29:
            return r1
    }

    public java.util.Comparator<T> getComparator() {
            r1 = this;
            java.util.Comparator<T> r0 = r1.comparator
            return r0
    }

    public T getMaximum() {
            r1 = this;
            T r0 = r1.maximum
            return r0
    }

    public T getMinimum() {
            r1 = this;
            T r0 = r1.minimum
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.hashCode
            if (r0 != 0) goto L21
            r0 = 629(0x275, float:8.81E-43)
            java.lang.Class<org.apache.commons.lang3.Range> r1 = org.apache.commons.lang3.Range.class
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 37
            T r1 = r2.minimum
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 37
            T r1 = r2.maximum
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            r2.hashCode = r0
        L21:
            return r0
    }

    public org.apache.commons.lang3.Range<T> intersectionWith(org.apache.commons.lang3.Range<T> r5) {
            r4 = this;
            boolean r0 = r4.isOverlappedBy(r5)
            if (r0 == 0) goto L3c
            boolean r0 = r4.equals(r5)
            if (r0 == 0) goto Ld
            return r4
        Ld:
            java.util.Comparator r0 = r4.getComparator()
            T r1 = r4.minimum
            T r2 = r5.minimum
            int r0 = r0.compare(r1, r2)
            if (r0 >= 0) goto L1e
            T r0 = r5.minimum
            goto L20
        L1e:
            T r0 = r4.minimum
        L20:
            java.util.Comparator r1 = r4.getComparator()
            T r2 = r4.maximum
            T r3 = r5.maximum
            int r1 = r1.compare(r2, r3)
            if (r1 >= 0) goto L31
            T r5 = r4.maximum
            goto L33
        L31:
            T r5 = r5.maximum
        L33:
            java.util.Comparator r1 = r4.getComparator()
            org.apache.commons.lang3.Range r5 = between(r0, r5, r1)
            return r5
        L3c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            java.lang.String r5 = "Cannot calculate intersection with non-overlapping range %s"
            java.lang.String r5 = java.lang.String.format(r5, r1)
            r0.<init>(r5)
            throw r0
    }

    public boolean isAfter(T r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.Comparator<T> r1 = r3.comparator
            T r2 = r3.minimum
            int r4 = r1.compare(r4, r2)
            if (r4 >= 0) goto Lf
            r0 = 1
        Lf:
            return r0
    }

    public boolean isAfterRange(org.apache.commons.lang3.Range<T> r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            T r1 = r1.maximum
            boolean r1 = r0.isAfter(r1)
            return r1
    }

    public boolean isBefore(T r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.Comparator<T> r1 = r3.comparator
            T r2 = r3.maximum
            int r4 = r1.compare(r4, r2)
            if (r4 <= 0) goto Lf
            r0 = 1
        Lf:
            return r0
    }

    public boolean isBeforeRange(org.apache.commons.lang3.Range<T> r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            T r1 = r1.minimum
            boolean r1 = r0.isBefore(r1)
            return r1
    }

    public boolean isEndedBy(T r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.Comparator<T> r1 = r3.comparator
            T r2 = r3.maximum
            int r4 = r1.compare(r4, r2)
            if (r4 != 0) goto Lf
            r0 = 1
        Lf:
            return r0
    }

    public boolean isNaturalOrdering() {
            r2 = this;
            java.util.Comparator<T> r0 = r2.comparator
            org.apache.commons.lang3.Range$ComparableComparator r1 = org.apache.commons.lang3.Range.ComparableComparator.INSTANCE
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isOverlappedBy(org.apache.commons.lang3.Range<T> r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            T r1 = r2.minimum
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L1c
            T r1 = r2.maximum
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L1c
            T r3 = r3.minimum
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L1d
        L1c:
            r0 = 1
        L1d:
            return r0
    }

    public boolean isStartedBy(T r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.Comparator<T> r1 = r3.comparator
            T r2 = r3.minimum
            int r4 = r1.compare(r4, r2)
            if (r4 != 0) goto Lf
            r0 = 1
        Lf:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.toString
            if (r0 != 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            T r1 = r2.minimum
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            T r1 = r2.maximum
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.toString = r0
        L28:
            java.lang.String r0 = r2.toString
            return r0
    }

    public java.lang.String toString(java.lang.String r4) {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            T r1 = r3.minimum
            r2 = 0
            r0[r2] = r1
            T r1 = r3.maximum
            r2 = 1
            r0[r2] = r1
            java.util.Comparator<T> r1 = r3.comparator
            r2 = 2
            r0[r2] = r1
            java.lang.String r4 = java.lang.String.format(r4, r0)
            return r4
    }
}
