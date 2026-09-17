package org.apache.commons.lang3.tuple;

/* loaded from: classes2.dex */
public final class ImmutableTriple<L, M, R> extends org.apache.commons.lang3.tuple.Triple<L, M, R> {
    private static final org.apache.commons.lang3.tuple.ImmutableTriple NULL = null;
    private static final long serialVersionUID = 1;
    public final L left;
    public final M middle;
    public final R right;

    static {
            r0 = 0
            org.apache.commons.lang3.tuple.ImmutableTriple r0 = of(r0, r0, r0)
            org.apache.commons.lang3.tuple.ImmutableTriple.NULL = r0
            return
    }

    public ImmutableTriple(L r1, M r2, R r3) {
            r0 = this;
            r0.<init>()
            r0.left = r1
            r0.middle = r2
            r0.right = r3
            return
    }

    public static <L, M, R> org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R> nullTriple() {
            org.apache.commons.lang3.tuple.ImmutableTriple r0 = org.apache.commons.lang3.tuple.ImmutableTriple.NULL
            return r0
    }

    public static <L, M, R> org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R> of(L r1, M r2, R r3) {
            org.apache.commons.lang3.tuple.ImmutableTriple r0 = new org.apache.commons.lang3.tuple.ImmutableTriple
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public L getLeft() {
            r1 = this;
            L r0 = r1.left
            return r0
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public M getMiddle() {
            r1 = this;
            M r0 = r1.middle
            return r0
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public R getRight() {
            r1 = this;
            R r0 = r1.right
            return r0
    }
}
