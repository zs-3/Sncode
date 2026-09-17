package kotlin;

/* compiled from: Tuples.kt */
/* loaded from: classes2.dex */
public final class Pair<A, B> implements java.io.Serializable {
    private final A first;
    private final B second;

    public Pair(A r1, B r2) {
            r0 = this;
            r0.<init>()
            r0.first = r1
            r0.second = r2
            return
    }

    public final A component1() {
            r1 = this;
            A r0 = r1.first
            return r0
    }

    public final B component2() {
            r1 = this;
            B r0 = r1.second
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.Pair
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.Pair r5 = (kotlin.Pair) r5
            A r1 = r4.first
            A r3 = r5.first
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            B r1 = r4.second
            B r5 = r5.second
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final A getFirst() {
            r1 = this;
            A r0 = r1.first
            return r0
    }

    public final B getSecond() {
            r1 = this;
            B r0 = r1.second
            return r0
    }

    public int hashCode() {
            r3 = this;
            A r0 = r3.first
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            B r2 = r3.second
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r1 = r2.hashCode()
        L16:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            A r1 = r2.first
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            B r1 = r2.second
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
