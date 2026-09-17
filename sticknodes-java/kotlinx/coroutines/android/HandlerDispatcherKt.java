package kotlinx.coroutines.android;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes2.dex */
public final class HandlerDispatcherKt {
    public static final kotlinx.coroutines.android.HandlerDispatcher Main = null;
    private static volatile android.view.Choreographer choreographer;

    static {
            r0 = 0
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L17
            kotlinx.coroutines.android.HandlerContext r1 = new kotlinx.coroutines.android.HandlerContext     // Catch: java.lang.Throwable -> L17
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L17
            r3 = 1
            android.os.Handler r2 = asHandler(r2, r3)     // Catch: java.lang.Throwable -> L17
            r3 = 2
            r1.<init>(r2, r0, r3, r0)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = kotlin.Result.m72constructorimpl(r1)     // Catch: java.lang.Throwable -> L17
            goto L22
        L17:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m72constructorimpl(r1)
        L22:
            boolean r2 = kotlin.Result.m74isFailureimpl(r1)
            if (r2 == 0) goto L29
            goto L2a
        L29:
            r0 = r1
        L2a:
            kotlinx.coroutines.android.HandlerDispatcher r0 = (kotlinx.coroutines.android.HandlerDispatcher) r0
            kotlinx.coroutines.android.HandlerDispatcherKt.Main = r0
            return
    }

    public static final android.os.Handler asHandler(android.os.Looper r7, boolean r8) {
            if (r8 == 0) goto L56
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            r1 = 0
            r2 = 0
            r3 = 1
            if (r8 < r0) goto L29
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.os.Looper> r4 = android.os.Looper.class
            r0[r2] = r4
            java.lang.String r4 = "createAsync"
            java.lang.reflect.Method r8 = r8.getDeclaredMethod(r4, r0)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r7
            java.lang.Object r7 = r8.invoke(r1, r0)
            java.lang.String r8 = "null cannot be cast to non-null type android.os.Handler"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r8)
            android.os.Handler r7 = (android.os.Handler) r7
            return r7
        L29:
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r0 = 3
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.Class<android.os.Looper> r5 = android.os.Looper.class
            r4[r2] = r5     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.Class<android.os.Handler$Callback> r5 = android.os.Handler.Callback.class
            r4[r3] = r5     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L50
            r6 = 2
            r4[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.reflect.Constructor r8 = r8.getDeclaredConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r7
            r0[r3] = r1
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r0[r6] = r7
            java.lang.Object r7 = r8.newInstance(r0)
            android.os.Handler r7 = (android.os.Handler) r7
            return r7
        L50:
            android.os.Handler r8 = new android.os.Handler
            r8.<init>(r7)
            return r8
        L56:
            android.os.Handler r8 = new android.os.Handler
            r8.<init>(r7)
            return r8
    }
}
