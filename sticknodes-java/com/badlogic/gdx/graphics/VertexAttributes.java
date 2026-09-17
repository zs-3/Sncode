package com.badlogic.gdx.graphics;

/* loaded from: classes.dex */
public final class VertexAttributes implements java.lang.Iterable<com.badlogic.gdx.graphics.VertexAttribute>, java.lang.Comparable<com.badlogic.gdx.graphics.VertexAttributes> {
    private final com.badlogic.gdx.graphics.VertexAttribute[] attributes;
    private int boneWeightUnits;
    private com.badlogic.gdx.graphics.VertexAttributes.ReadonlyIterable<com.badlogic.gdx.graphics.VertexAttribute> iterable;
    private long mask;
    private int textureCoordinates;
    public final int vertexSize;

    private static class ReadonlyIterable<T> implements java.lang.Iterable<T> {
        private final T[] array;
        private com.badlogic.gdx.graphics.VertexAttributes.ReadonlyIterator iterator1;
        private com.badlogic.gdx.graphics.VertexAttributes.ReadonlyIterator iterator2;

        public ReadonlyIterable(T[] r1) {
                r0 = this;
                r0.<init>()
                r0.array = r1
                return
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<T> iterator() {
                r4 = this;
                boolean r0 = com.badlogic.gdx.utils.Collections.allocateIterators
                if (r0 == 0) goto Lc
                com.badlogic.gdx.graphics.VertexAttributes$ReadonlyIterator r0 = new com.badlogic.gdx.graphics.VertexAttributes$ReadonlyIterator
                T[] r1 = r4.array
                r0.<init>(r1)
                return r0
            Lc:
                com.badlogic.gdx.graphics.VertexAttributes$ReadonlyIterator r0 = r4.iterator1
                if (r0 != 0) goto L22
                com.badlogic.gdx.graphics.VertexAttributes$ReadonlyIterator r0 = new com.badlogic.gdx.graphics.VertexAttributes$ReadonlyIterator
                T[] r1 = r4.array
                r0.<init>(r1)
                r4.iterator1 = r0
                com.badlogic.gdx.graphics.VertexAttributes$ReadonlyIterator r0 = new com.badlogic.gdx.graphics.VertexAttributes$ReadonlyIterator
                T[] r1 = r4.array
                r0.<init>(r1)
                r4.iterator2 = r0
            L22:
                com.badlogic.gdx.graphics.VertexAttributes$ReadonlyIterator r0 = r4.iterator1
                boolean r1 = r0.valid
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L33
                r0.index = r3
                r0.valid = r2
                com.badlogic.gdx.graphics.VertexAttributes$ReadonlyIterator r1 = r4.iterator2
                r1.valid = r3
                return r0
            L33:
                com.badlogic.gdx.graphics.VertexAttributes$ReadonlyIterator r1 = r4.iterator2
                r1.index = r3
                r1.valid = r2
                r0.valid = r3
                return r1
        }
    }

    private static class ReadonlyIterator<T> implements java.util.Iterator<T>, java.lang.Iterable<T> {
        private final T[] array;
        int index;
        boolean valid;

        public ReadonlyIterator(T[] r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.valid = r0
                r1.array = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                boolean r0 = r2.valid
                if (r0 == 0) goto Lf
                int r0 = r2.index
                T[] r1 = r2.array
                int r1 = r1.length
                if (r0 >= r1) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                return r0
            Lf:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.String r1 = "#iterator() cannot be used nested."
                r0.<init>(r1)
                throw r0
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<T> iterator() {
                r0 = this;
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                int r0 = r3.index
                T[] r1 = r3.array
                int r2 = r1.length
                if (r0 >= r2) goto L1a
                boolean r2 = r3.valid
                if (r2 == 0) goto L12
                int r2 = r0 + 1
                r3.index = r2
                r0 = r1[r0]
                return r0
            L12:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.String r1 = "#iterator() cannot be used nested."
                r0.<init>(r1)
                throw r0
            L1a:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                int r1 = r3.index
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.String r1 = "Remove not allowed."
                r0.<init>(r1)
                throw r0
        }
    }

    public VertexAttributes(com.badlogic.gdx.graphics.VertexAttribute... r4) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.mask = r0
            r0 = -1
            r3.boneWeightUnits = r0
            r3.textureCoordinates = r0
            int r0 = r4.length
            if (r0 == 0) goto L26
            int r0 = r4.length
            com.badlogic.gdx.graphics.VertexAttribute[] r0 = new com.badlogic.gdx.graphics.VertexAttribute[r0]
            r1 = 0
        L13:
            int r2 = r4.length
            if (r1 >= r2) goto L1d
            r2 = r4[r1]
            r0[r1] = r2
            int r1 = r1 + 1
            goto L13
        L1d:
            r3.attributes = r0
            int r4 = r3.calculateOffsets()
            r3.vertexSize = r4
            return
        L26:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "attributes must be >= 1"
            r4.<init>(r0)
            throw r4
    }

    private int calculateOffsets() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            com.badlogic.gdx.graphics.VertexAttribute[] r2 = r4.attributes
            int r3 = r2.length
            if (r0 >= r3) goto L13
            r2 = r2[r0]
            r2.offset = r1
            int r2 = r2.getSizeInBytes()
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        L13:
            return r1
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.badlogic.gdx.graphics.VertexAttributes r8) {
            r7 = this;
            com.badlogic.gdx.graphics.VertexAttribute[] r0 = r7.attributes
            int r1 = r0.length
            com.badlogic.gdx.graphics.VertexAttribute[] r2 = r8.attributes
            int r3 = r2.length
            if (r1 == r3) goto Lc
            int r8 = r0.length
            int r0 = r2.length
            int r8 = r8 - r0
            return r8
        Lc:
            long r0 = r7.getMask()
            long r2 = r8.getMask()
            r4 = -1
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L1f
            if (r6 >= 0) goto L1d
            goto L1e
        L1d:
            r4 = 1
        L1e:
            return r4
        L1f:
            com.badlogic.gdx.graphics.VertexAttribute[] r0 = r7.attributes
            int r0 = r0.length
            int r0 = r0 - r5
        L23:
            if (r0 < 0) goto L5a
            com.badlogic.gdx.graphics.VertexAttribute[] r1 = r7.attributes
            r1 = r1[r0]
            com.badlogic.gdx.graphics.VertexAttribute[] r2 = r8.attributes
            r2 = r2[r0]
            int r3 = r1.usage
            int r6 = r2.usage
            if (r3 == r6) goto L35
            int r3 = r3 - r6
            return r3
        L35:
            int r3 = r1.unit
            int r6 = r2.unit
            if (r3 == r6) goto L3d
            int r3 = r3 - r6
            return r3
        L3d:
            int r3 = r1.numComponents
            int r6 = r2.numComponents
            if (r3 == r6) goto L45
            int r3 = r3 - r6
            return r3
        L45:
            boolean r3 = r1.normalized
            boolean r6 = r2.normalized
            if (r3 == r6) goto L4f
            if (r3 == 0) goto L4e
            r4 = 1
        L4e:
            return r4
        L4f:
            int r1 = r1.type
            int r2 = r2.type
            if (r1 == r2) goto L57
            int r1 = r1 - r2
            return r1
        L57:
            int r0 = r0 + (-1)
            goto L23
        L5a:
            r8 = 0
            return r8
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.badlogic.gdx.graphics.VertexAttributes r1) {
            r0 = this;
            com.badlogic.gdx.graphics.VertexAttributes r1 = (com.badlogic.gdx.graphics.VertexAttributes) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.badlogic.gdx.graphics.VertexAttributes
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.badlogic.gdx.graphics.VertexAttributes r6 = (com.badlogic.gdx.graphics.VertexAttributes) r6
            com.badlogic.gdx.graphics.VertexAttribute[] r1 = r5.attributes
            int r1 = r1.length
            com.badlogic.gdx.graphics.VertexAttribute[] r3 = r6.attributes
            int r3 = r3.length
            if (r1 == r3) goto L15
            return r2
        L15:
            r1 = 0
        L16:
            com.badlogic.gdx.graphics.VertexAttribute[] r3 = r5.attributes
            int r4 = r3.length
            if (r1 >= r4) goto L2b
            r3 = r3[r1]
            com.badlogic.gdx.graphics.VertexAttribute[] r4 = r6.attributes
            r4 = r4[r1]
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L28
            return r2
        L28:
            int r1 = r1 + 1
            goto L16
        L2b:
            return r0
    }

    public com.badlogic.gdx.graphics.VertexAttribute get(int r2) {
            r1 = this;
            com.badlogic.gdx.graphics.VertexAttribute[] r0 = r1.attributes
            r2 = r0[r2]
            return r2
    }

    public long getMask() {
            r5 = this;
            long r0 = r5.mask
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1b
            r0 = 0
            r2 = 0
        Lb:
            com.badlogic.gdx.graphics.VertexAttribute[] r3 = r5.attributes
            int r4 = r3.length
            if (r2 >= r4) goto L19
            r3 = r3[r2]
            int r3 = r3.usage
            long r3 = (long) r3
            long r0 = r0 | r3
            int r2 = r2 + 1
            goto Lb
        L19:
            r5.mask = r0
        L1b:
            long r0 = r5.mask
            return r0
    }

    public int hashCode() {
            r6 = this;
            com.badlogic.gdx.graphics.VertexAttribute[] r0 = r6.attributes
            int r0 = r0.length
            int r0 = r0 * 61
            long r0 = (long) r0
            r2 = 0
        L7:
            com.badlogic.gdx.graphics.VertexAttribute[] r3 = r6.attributes
            int r4 = r3.length
            if (r2 >= r4) goto L1b
            r4 = 61
            long r0 = r0 * r4
            r3 = r3[r2]
            int r3 = r3.hashCode()
            long r3 = (long) r3
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L7
        L1b:
            r2 = 32
            long r2 = r0 >> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            return r1
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<com.badlogic.gdx.graphics.VertexAttribute> iterator() {
            r2 = this;
            com.badlogic.gdx.graphics.VertexAttributes$ReadonlyIterable<com.badlogic.gdx.graphics.VertexAttribute> r0 = r2.iterable
            if (r0 != 0) goto Ld
            com.badlogic.gdx.graphics.VertexAttributes$ReadonlyIterable r0 = new com.badlogic.gdx.graphics.VertexAttributes$ReadonlyIterable
            com.badlogic.gdx.graphics.VertexAttribute[] r1 = r2.attributes
            r0.<init>(r1)
            r2.iterable = r0
        Ld:
            com.badlogic.gdx.graphics.VertexAttributes$ReadonlyIterable<com.badlogic.gdx.graphics.VertexAttribute> r0 = r2.iterable
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public int size() {
            r1 = this;
            com.badlogic.gdx.graphics.VertexAttribute[] r0 = r1.attributes
            int r0 = r0.length
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            r1 = 0
        Lb:
            com.badlogic.gdx.graphics.VertexAttribute[] r2 = r4.attributes
            int r2 = r2.length
            if (r1 >= r2) goto L51
            java.lang.String r2 = "("
            r0.append(r2)
            com.badlogic.gdx.graphics.VertexAttribute[] r2 = r4.attributes
            r2 = r2[r1]
            java.lang.String r2 = r2.alias
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            com.badlogic.gdx.graphics.VertexAttribute[] r3 = r4.attributes
            r3 = r3[r1]
            int r3 = r3.usage
            r0.append(r3)
            r0.append(r2)
            com.badlogic.gdx.graphics.VertexAttribute[] r3 = r4.attributes
            r3 = r3[r1]
            int r3 = r3.numComponents
            r0.append(r3)
            r0.append(r2)
            com.badlogic.gdx.graphics.VertexAttribute[] r2 = r4.attributes
            r2 = r2[r1]
            int r2 = r2.offset
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = "\n"
            r0.append(r2)
            int r1 = r1 + 1
            goto Lb
        L51:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
