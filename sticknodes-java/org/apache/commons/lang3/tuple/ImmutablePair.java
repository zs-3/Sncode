package org.apache.commons.lang3.tuple;

/* loaded from: classes2.dex */
public final class ImmutablePair<L, R> extends org.apache.commons.lang3.tuple.Pair<L, R> {
    private static final org.apache.commons.lang3.tuple.ImmutablePair NULL = null;
    private static final long serialVersionUID = 4954918890077093841L;
    public final L left;
    public final R right;

    static {
            r0 = 0
            org.apache.commons.lang3.tuple.ImmutablePair r0 = of(r0, r0)
            org.apache.commons.lang3.tuple.ImmutablePair.NULL = r0
            return
    }

    public ImmutablePair(L r1, R r2) {
            r0 = this;
            r0.<init>()
            r0.left = r1
            r0.right = r2
            return
    }

    public static <L, R> org.apache.commons.lang3.tuple.ImmutablePair<L, R> nullPair() {
            org.apache.commons.lang3.tuple.ImmutablePair r0 = org.apache.commons.lang3.tuple.ImmutablePair.NULL
            return r0
    }

    public static <L, R> org.apache.commons.lang3.tuple.ImmutablePair<L, R> of(L r1, R r2) {
            org.apache.commons.lang3.tuple.ImmutablePair r0 = new org.apache.commons.lang3.tuple.ImmutablePair
            r0.<init>(r1, r2)
            return r0
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public L getLeft() {
            r1 = this;
            L r0 = r1.left
            return r0
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public R getRight() {
            r1 = this;
            R r0 = r1.right
            return r0
    }

    @Override // java.util.Map.Entry
    public R setValue(R r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
