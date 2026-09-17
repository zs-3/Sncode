package kotlinx.coroutines.internal;

/* compiled from: MainDispatchers.kt */
/* loaded from: classes2.dex */
public final class MainDispatcherLoader {
    private static final boolean FAST_SERVICE_LOADER_ENABLED = false;
    public static final kotlinx.coroutines.internal.MainDispatcherLoader INSTANCE = null;
    public static final kotlinx.coroutines.MainCoroutineDispatcher dispatcher = null;

    static {
            kotlinx.coroutines.internal.MainDispatcherLoader r0 = new kotlinx.coroutines.internal.MainDispatcherLoader
            r0.<init>()
            kotlinx.coroutines.internal.MainDispatcherLoader.INSTANCE = r0
            java.lang.String r1 = "kotlinx.coroutines.fast.service.loader"
            r2 = 1
            boolean r1 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r1, r2)
            kotlinx.coroutines.internal.MainDispatcherLoader.FAST_SERVICE_LOADER_ENABLED = r1
            kotlinx.coroutines.MainCoroutineDispatcher r0 = r0.loadMainDispatcher()
            kotlinx.coroutines.internal.MainDispatcherLoader.dispatcher = r0
            return
    }

    private MainDispatcherLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlinx.coroutines.MainCoroutineDispatcher loadMainDispatcher() {
            r7 = this;
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r0 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            r1 = 0
            boolean r2 = kotlinx.coroutines.internal.MainDispatcherLoader.FAST_SERVICE_LOADER_ENABLED     // Catch: java.lang.Throwable -> L65
            if (r2 == 0) goto Le
            kotlinx.coroutines.internal.FastServiceLoader r0 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE     // Catch: java.lang.Throwable -> L65
            java.util.List r0 = r0.loadMainDispatcherFactory$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L65
            goto L22
        Le:
            java.lang.ClassLoader r2 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L65
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r2)     // Catch: java.lang.Throwable -> L65
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L65
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.asSequence(r0)     // Catch: java.lang.Throwable -> L65
            java.util.List r0 = kotlin.sequences.SequencesKt.toList(r0)     // Catch: java.lang.Throwable -> L65
        L22:
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L65
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L65
            if (r3 != 0) goto L2e
            r3 = r1
            goto L55
        L2e:
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L65
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L65
            if (r4 != 0) goto L39
            goto L55
        L39:
            r4 = r3
            kotlinx.coroutines.internal.MainDispatcherFactory r4 = (kotlinx.coroutines.internal.MainDispatcherFactory) r4     // Catch: java.lang.Throwable -> L65
            int r4 = r4.getLoadPriority()     // Catch: java.lang.Throwable -> L65
        L40:
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L65
            r6 = r5
            kotlinx.coroutines.internal.MainDispatcherFactory r6 = (kotlinx.coroutines.internal.MainDispatcherFactory) r6     // Catch: java.lang.Throwable -> L65
            int r6 = r6.getLoadPriority()     // Catch: java.lang.Throwable -> L65
            if (r4 >= r6) goto L4f
            r3 = r5
            r4 = r6
        L4f:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L65
            if (r5 != 0) goto L40
        L55:
            kotlinx.coroutines.internal.MainDispatcherFactory r3 = (kotlinx.coroutines.internal.MainDispatcherFactory) r3     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L5f
            kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.internal.MainDispatchersKt.tryCreateDispatcher(r3, r0)     // Catch: java.lang.Throwable -> L65
            if (r0 != 0) goto L6b
        L5f:
            r0 = 3
            kotlinx.coroutines.internal.MissingMainCoroutineDispatcher r0 = kotlinx.coroutines.internal.MainDispatchersKt.createMissingDispatcher$default(r1, r1, r0, r1)     // Catch: java.lang.Throwable -> L65
            goto L6b
        L65:
            r0 = move-exception
            r2 = 2
            kotlinx.coroutines.internal.MissingMainCoroutineDispatcher r0 = kotlinx.coroutines.internal.MainDispatchersKt.createMissingDispatcher$default(r0, r1, r2, r1)
        L6b:
            return r0
    }
}
