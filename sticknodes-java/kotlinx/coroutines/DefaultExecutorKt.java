package kotlinx.coroutines;

/* compiled from: DefaultExecutor.kt */
/* loaded from: classes2.dex */
public final class DefaultExecutorKt {
    private static final kotlinx.coroutines.Delay DefaultDelay = null;
    private static final boolean defaultMainDelayOptIn = false;

    static {
            java.lang.String r0 = "kotlinx.coroutines.main.delay"
            r1 = 0
            boolean r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0, r1)
            kotlinx.coroutines.DefaultExecutorKt.defaultMainDelayOptIn = r0
            kotlinx.coroutines.Delay r0 = initializeDefaultDelay()
            kotlinx.coroutines.DefaultExecutorKt.DefaultDelay = r0
            return
    }

    public static final kotlinx.coroutines.Delay getDefaultDelay() {
            kotlinx.coroutines.Delay r0 = kotlinx.coroutines.DefaultExecutorKt.DefaultDelay
            return r0
    }

    private static final kotlinx.coroutines.Delay initializeDefaultDelay() {
            boolean r0 = kotlinx.coroutines.DefaultExecutorKt.defaultMainDelayOptIn
            if (r0 != 0) goto L7
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            return r0
        L7:
            kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()
            boolean r1 = kotlinx.coroutines.internal.MainDispatchersKt.isMissing(r0)
            if (r1 != 0) goto L19
            boolean r1 = r0 instanceof kotlinx.coroutines.Delay
            if (r1 != 0) goto L16
            goto L19
        L16:
            kotlinx.coroutines.Delay r0 = (kotlinx.coroutines.Delay) r0
            goto L1b
        L19:
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
        L1b:
            return r0
    }
}
