package kotlin;

/* compiled from: LazyJVM.kt */
/* loaded from: classes2.dex */
final class SynchronizedLazyImpl<T> implements kotlin.Lazy<T>, java.io.Serializable {
    private volatile java.lang.Object _value;
    private kotlin.jvm.functions.Function0<? extends T> initializer;
    private final java.lang.Object lock;

    public SynchronizedLazyImpl(kotlin.jvm.functions.Function0<? extends T> r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.initializer = r2
            kotlin.UNINITIALIZED_VALUE r2 = kotlin.UNINITIALIZED_VALUE.INSTANCE
            r1._value = r2
            if (r3 != 0) goto L11
            r3 = r1
        L11:
            r1.lock = r3
            return
    }

    public /* synthetic */ SynchronizedLazyImpl(kotlin.jvm.functions.Function0 r1, java.lang.Object r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.Lazy
    public T getValue() {
            r3 = this;
            java.lang.Object r0 = r3._value
            kotlin.UNINITIALIZED_VALUE r1 = kotlin.UNINITIALIZED_VALUE.INSTANCE
            if (r0 == r1) goto L7
            return r0
        L7:
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            java.lang.Object r2 = r3._value     // Catch: java.lang.Throwable -> L1f
            if (r2 == r1) goto Lf
            goto L1d
        Lf:
            kotlin.jvm.functions.Function0<? extends T> r1 = r3.initializer     // Catch: java.lang.Throwable -> L1f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r1.invoke()     // Catch: java.lang.Throwable -> L1f
            r3._value = r2     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            r3.initializer = r1     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r0)
            return r2
        L1f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public boolean isInitialized() {
            r2 = this;
            java.lang.Object r0 = r2._value
            kotlin.UNINITIALIZED_VALUE r1 = kotlin.UNINITIALIZED_VALUE.INSTANCE
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            boolean r0 = r1.isInitialized()
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L11
        Lf:
            java.lang.String r0 = "Lazy value not initialized yet."
        L11:
            return r0
    }
}
