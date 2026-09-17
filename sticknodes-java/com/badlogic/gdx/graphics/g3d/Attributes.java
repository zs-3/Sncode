package com.badlogic.gdx.graphics.g3d;

/* loaded from: classes.dex */
public class Attributes implements java.lang.Iterable<com.badlogic.gdx.graphics.g3d.Attribute>, java.util.Comparator<com.badlogic.gdx.graphics.g3d.Attribute>, java.lang.Comparable<com.badlogic.gdx.graphics.g3d.Attributes> {
    protected final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.Attribute> attributes;
    protected long mask;
    protected boolean sorted;

    public Attributes() {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.attributes = r0
            r0 = 1
            r1.sorted = r0
            return
    }

    private final void enable(long r3) {
            r2 = this;
            long r0 = r2.mask
            long r3 = r3 | r0
            r2.mask = r3
            return
    }

    public int attributesHash() {
            r9 = this;
            r9.sort()
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.Attribute> r0 = r9.attributes
            int r0 = r0.size
            long r1 = r9.mask
            r3 = 71
            long r1 = r1 + r3
            r3 = 1
            r4 = 0
        Le:
            if (r4 >= r0) goto L2e
            long r5 = r9.mask
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.Attribute> r7 = r9.attributes
            java.lang.Object r7 = r7.get(r4)
            com.badlogic.gdx.graphics.g3d.Attribute r7 = (com.badlogic.gdx.graphics.g3d.Attribute) r7
            int r7 = r7.hashCode()
            long r7 = (long) r7
            long r5 = r5 * r7
            int r3 = r3 * 7
            r7 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r7
            long r7 = (long) r3
            long r5 = r5 * r7
            long r1 = r1 + r5
            int r4 = r4 + 1
            goto Le
        L2e:
            r0 = 32
            long r3 = r1 >> r0
            long r0 = r1 ^ r3
            int r1 = (int) r0
            return r1
    }

    /* renamed from: compare, reason: avoid collision after fix types in other method */
    public final int compare2(com.badlogic.gdx.graphics.g3d.Attribute r3, com.badlogic.gdx.graphics.g3d.Attribute r4) {
            r2 = this;
            long r0 = r3.type
            long r3 = r4.type
            long r0 = r0 - r3
            int r3 = (int) r0
            return r3
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(com.badlogic.gdx.graphics.g3d.Attribute r1, com.badlogic.gdx.graphics.g3d.Attribute r2) {
            r0 = this;
            com.badlogic.gdx.graphics.g3d.Attribute r1 = (com.badlogic.gdx.graphics.g3d.Attribute) r1
            com.badlogic.gdx.graphics.g3d.Attribute r2 = (com.badlogic.gdx.graphics.g3d.Attribute) r2
            int r1 = r0.compare2(r1, r2)
            return r1
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.badlogic.gdx.graphics.g3d.Attributes r9) {
            r8 = this;
            r0 = 0
            if (r9 != r8) goto L4
            return r0
        L4:
            long r1 = r8.mask
            long r3 = r9.mask
            r5 = -1
            r6 = 1
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L15
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 >= 0) goto L13
            goto L14
        L13:
            r5 = 1
        L14:
            return r5
        L15:
            r8.sort()
            r9.sort()
            r1 = 0
        L1c:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.Attribute> r2 = r8.attributes
            int r3 = r2.size
            if (r1 >= r3) goto L3f
            java.lang.Object r2 = r2.get(r1)
            com.badlogic.gdx.graphics.g3d.Attribute r2 = (com.badlogic.gdx.graphics.g3d.Attribute) r2
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.Attribute> r3 = r9.attributes
            java.lang.Object r3 = r3.get(r1)
            int r2 = r2.compareTo(r3)
            if (r2 == 0) goto L3c
            if (r2 >= 0) goto L38
            r0 = -1
            goto L3b
        L38:
            if (r2 <= 0) goto L3b
            r0 = 1
        L3b:
            return r0
        L3c:
            int r1 = r1 + 1
            goto L1c
        L3f:
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.badlogic.gdx.graphics.g3d.Attributes r1) {
            r0 = this;
            com.badlogic.gdx.graphics.g3d.Attributes r1 = (com.badlogic.gdx.graphics.g3d.Attributes) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.badlogic.gdx.graphics.g3d.Attributes
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            r0 = 1
            if (r2 != r1) goto La
            return r0
        La:
            com.badlogic.gdx.graphics.g3d.Attributes r2 = (com.badlogic.gdx.graphics.g3d.Attributes) r2
            boolean r2 = r1.same(r2, r0)
            return r2
    }

    public final boolean has(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto Lf
            long r0 = r3.mask
            long r0 = r0 & r4
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = 0
        L10:
            return r4
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.attributesHash()
            return r0
    }

    protected int indexOf(long r5) {
            r4 = this;
            boolean r0 = r4.has(r5)
            if (r0 == 0) goto L1d
            r0 = 0
        L7:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.Attribute> r1 = r4.attributes
            int r2 = r1.size
            if (r0 >= r2) goto L1d
            java.lang.Object r1 = r1.get(r0)
            com.badlogic.gdx.graphics.g3d.Attribute r1 = (com.badlogic.gdx.graphics.g3d.Attribute) r1
            long r1 = r1.type
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L1a
            return r0
        L1a:
            int r0 = r0 + 1
            goto L7
        L1d:
            r5 = -1
            return r5
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<com.badlogic.gdx.graphics.g3d.Attribute> iterator() {
            r1 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.Attribute> r0 = r1.attributes
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
            return r0
    }

    public final boolean same(com.badlogic.gdx.graphics.g3d.Attributes r8, boolean r9) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L39
            long r2 = r7.mask
            long r4 = r8.mask
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L10
            goto L39
        L10:
            if (r9 != 0) goto L13
            return r0
        L13:
            r7.sort()
            r8.sort()
            r9 = 0
        L1a:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.Attribute> r2 = r7.attributes
            int r3 = r2.size
            if (r9 >= r3) goto L38
            java.lang.Object r2 = r2.get(r9)
            com.badlogic.gdx.graphics.g3d.Attribute r2 = (com.badlogic.gdx.graphics.g3d.Attribute) r2
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.Attribute> r3 = r8.attributes
            java.lang.Object r3 = r3.get(r9)
            com.badlogic.gdx.graphics.g3d.Attribute r3 = (com.badlogic.gdx.graphics.g3d.Attribute) r3
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L35
            return r1
        L35:
            int r9 = r9 + 1
            goto L1a
        L38:
            return r0
        L39:
            return r1
    }

    public final void set(com.badlogic.gdx.graphics.g3d.Attribute r3) {
            r2 = this;
            long r0 = r3.type
            int r0 = r2.indexOf(r0)
            if (r0 >= 0) goto L16
            long r0 = r3.type
            r2.enable(r0)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.Attribute> r0 = r2.attributes
            r0.add(r3)
            r3 = 0
            r2.sorted = r3
            goto L1b
        L16:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.Attribute> r1 = r2.attributes
            r1.set(r0, r3)
        L1b:
            r2.sort()
            return
    }

    public final void sort() {
            r1 = this;
            boolean r0 = r1.sorted
            if (r0 != 0) goto Lc
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.Attribute> r0 = r1.attributes
            r0.sort(r1)
            r0 = 1
            r1.sorted = r0
        Lc:
            return
    }
}
