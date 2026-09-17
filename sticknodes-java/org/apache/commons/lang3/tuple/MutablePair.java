package org.apache.commons.lang3.tuple;

/* loaded from: classes2.dex */
public class MutablePair<L, R> extends org.apache.commons.lang3.tuple.Pair<L, R> {
    private static final long serialVersionUID = 4954918890077093841L;
    public L left;
    public R right;

    public MutablePair() {
            r0 = this;
            r0.<init>()
            return
    }

    public MutablePair(L r1, R r2) {
            r0 = this;
            r0.<init>()
            r0.left = r1
            r0.right = r2
            return
    }

    public static <L, R> org.apache.commons.lang3.tuple.MutablePair<L, R> of(L r1, R r2) {
            org.apache.commons.lang3.tuple.MutablePair r0 = new org.apache.commons.lang3.tuple.MutablePair
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

    public void setLeft(L r1) {
            r0 = this;
            r0.left = r1
            return
    }

    public void setRight(R r1) {
            r0 = this;
            r0.right = r1
            return
    }

    @Override // java.util.Map.Entry
    public R setValue(R r2) {
            r1 = this;
            java.lang.Object r0 = r1.getRight()
            r1.setRight(r2)
            return r0
    }
}
