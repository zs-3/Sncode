package kotlinx.coroutines.internal;

/* compiled from: MainDispatchers.kt */
/* loaded from: classes2.dex */
public final class MainDispatchersKt {
    private static final boolean SUPPORT_MISSING = true;

    static {
            return
    }

    private static final kotlinx.coroutines.internal.MissingMainCoroutineDispatcher createMissingDispatcher(java.lang.Throwable r1, java.lang.String r2) {
            boolean r0 = kotlinx.coroutines.internal.MainDispatchersKt.SUPPORT_MISSING
            if (r0 == 0) goto La
            kotlinx.coroutines.internal.MissingMainCoroutineDispatcher r0 = new kotlinx.coroutines.internal.MissingMainCoroutineDispatcher
            r0.<init>(r1, r2)
            return r0
        La:
            if (r1 == 0) goto Ld
            throw r1
        Ld:
            throwMissingMainDispatcherException()
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    static /* synthetic */ kotlinx.coroutines.internal.MissingMainCoroutineDispatcher createMissingDispatcher$default(java.lang.Throwable r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            r0 = 0
            if (r4 == 0) goto L6
            r1 = r0
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            r2 = r0
        Lb:
            kotlinx.coroutines.internal.MissingMainCoroutineDispatcher r1 = createMissingDispatcher(r1, r2)
            return r1
    }

    public static final boolean isMissing(kotlinx.coroutines.MainCoroutineDispatcher r0) {
            kotlinx.coroutines.MainCoroutineDispatcher r0 = r0.getImmediate()
            boolean r0 = r0 instanceof kotlinx.coroutines.internal.MissingMainCoroutineDispatcher
            return r0
    }

    public static final java.lang.Void throwMissingMainDispatcherException() {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r0.<init>(r1)
            throw r0
    }

    public static final kotlinx.coroutines.MainCoroutineDispatcher tryCreateDispatcher(kotlinx.coroutines.internal.MainDispatcherFactory r0, java.util.List<? extends kotlinx.coroutines.internal.MainDispatcherFactory> r1) {
            kotlinx.coroutines.MainCoroutineDispatcher r0 = r0.createDispatcher(r1)     // Catch: java.lang.Throwable -> L5
            goto Le
        L5:
            r1 = move-exception
            java.lang.String r0 = r0.hintOnError()
            kotlinx.coroutines.internal.MissingMainCoroutineDispatcher r0 = createMissingDispatcher(r1, r0)
        Le:
            return r0
    }
}
