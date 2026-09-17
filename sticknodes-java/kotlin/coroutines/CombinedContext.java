package kotlin.coroutines;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes2.dex */
public final class CombinedContext implements kotlin.coroutines.CoroutineContext, java.io.Serializable {
    private final kotlin.coroutines.CoroutineContext.Element element;
    private final kotlin.coroutines.CoroutineContext left;


    public CombinedContext(kotlin.coroutines.CoroutineContext r2, kotlin.coroutines.CoroutineContext.Element r3) {
            r1 = this;
            java.lang.String r0 = "left"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "element"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.left = r2
            r1.element = r3
            return
    }

    private final boolean contains(kotlin.coroutines.CoroutineContext.Element r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext$Key r0 = r2.getKey()
            kotlin.coroutines.CoroutineContext$Element r0 = r1.get(r0)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            return r2
    }

    private final boolean containsAll(kotlin.coroutines.CombinedContext r2) {
            r1 = this;
        L0:
            kotlin.coroutines.CoroutineContext$Element r0 = r2.element
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            kotlin.coroutines.CoroutineContext r2 = r2.left
            boolean r0 = r2 instanceof kotlin.coroutines.CombinedContext
            if (r0 == 0) goto L13
            kotlin.coroutines.CombinedContext r2 = (kotlin.coroutines.CombinedContext) r2
            goto L0
        L13:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r0)
            kotlin.coroutines.CoroutineContext$Element r2 = (kotlin.coroutines.CoroutineContext.Element) r2
            boolean r2 = r1.contains(r2)
            return r2
    }

    private final int size() {
            r3 = this;
            r0 = 2
            r1 = r3
        L2:
            kotlin.coroutines.CoroutineContext r1 = r1.left
            boolean r2 = r1 instanceof kotlin.coroutines.CombinedContext
            if (r2 == 0) goto Lb
            kotlin.coroutines.CombinedContext r1 = (kotlin.coroutines.CombinedContext) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 != 0) goto Lf
            return r0
        Lf:
            int r0 = r0 + 1
            goto L2
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 == r3) goto L1b
            boolean r0 = r3 instanceof kotlin.coroutines.CombinedContext
            if (r0 == 0) goto L19
            kotlin.coroutines.CombinedContext r3 = (kotlin.coroutines.CombinedContext) r3
            int r0 = r3.size()
            int r1 = r2.size()
            if (r0 != r1) goto L19
            boolean r3 = r3.containsAll(r2)
            if (r3 == 0) goto L19
            goto L1b
        L19:
            r3 = 0
            goto L1c
        L1b:
            r3 = 1
        L1c:
            return r3
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r2, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.coroutines.CoroutineContext r0 = r1.left
            java.lang.Object r2 = r0.fold(r2, r3)
            kotlin.coroutines.CoroutineContext$Element r0 = r1.element
            java.lang.Object r2 = r3.invoke(r2, r0)
            return r2
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> r3) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
        L6:
            kotlin.coroutines.CoroutineContext$Element r1 = r0.element
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r3)
            if (r1 == 0) goto Lf
            return r1
        Lf:
            kotlin.coroutines.CoroutineContext r0 = r0.left
            boolean r1 = r0 instanceof kotlin.coroutines.CombinedContext
            if (r1 == 0) goto L18
            kotlin.coroutines.CombinedContext r0 = (kotlin.coroutines.CombinedContext) r0
            goto L6
        L18:
            kotlin.coroutines.CoroutineContext$Element r3 = r0.get(r3)
            return r3
    }

    public int hashCode() {
            r2 = this;
            kotlin.coroutines.CoroutineContext r0 = r2.left
            int r0 = r0.hashCode()
            kotlin.coroutines.CoroutineContext$Element r1 = r2.element
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> r3) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.coroutines.CoroutineContext$Element r0 = r2.element
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r3)
            if (r0 == 0) goto L10
            kotlin.coroutines.CoroutineContext r3 = r2.left
            return r3
        L10:
            kotlin.coroutines.CoroutineContext r0 = r2.left
            kotlin.coroutines.CoroutineContext r3 = r0.minusKey(r3)
            kotlin.coroutines.CoroutineContext r0 = r2.left
            if (r3 != r0) goto L1c
            r3 = r2
            goto L2b
        L1c:
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r3 != r0) goto L23
            kotlin.coroutines.CoroutineContext$Element r3 = r2.element
            goto L2b
        L23:
            kotlin.coroutines.CombinedContext r0 = new kotlin.coroutines.CombinedContext
            kotlin.coroutines.CoroutineContext$Element r1 = r2.element
            r0.<init>(r3, r1)
            r3 = r0
        L2b:
            return r3
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext r1 = kotlin.coroutines.CoroutineContext.DefaultImpls.plus(r0, r1)
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            kotlin.coroutines.CombinedContext$toString$1 r1 = kotlin.coroutines.CombinedContext.AnonymousClass1.INSTANCE
            java.lang.String r2 = ""
            java.lang.Object r1 = r3.fold(r2, r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
