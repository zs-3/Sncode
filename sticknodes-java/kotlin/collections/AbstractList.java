package kotlin.collections;

/* compiled from: AbstractList.kt */
/* loaded from: classes2.dex */
public abstract class AbstractList<E> extends kotlin.collections.AbstractCollection<E> implements java.util.List<E> {
    public static final kotlin.collections.AbstractList.Companion Companion = null;

    /* compiled from: AbstractList.kt */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final void checkElementIndex$kotlin_stdlib(int r4, int r5) {
                r3 = this;
                if (r4 < 0) goto L5
                if (r4 >= r5) goto L5
                return
            L5:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "index: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ", size: "
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        public final void checkPositionIndex$kotlin_stdlib(int r4, int r5) {
                r3 = this;
                if (r4 < 0) goto L5
                if (r4 > r5) goto L5
                return
            L5:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "index: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ", size: "
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }
    }

    static {
            kotlin.collections.AbstractList$Companion r0 = new kotlin.collections.AbstractList$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.AbstractList.Companion = r0
            return
    }
}
