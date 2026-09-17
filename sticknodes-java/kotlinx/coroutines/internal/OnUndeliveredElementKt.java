package kotlinx.coroutines.internal;

/* compiled from: OnUndeliveredElement.kt */
/* loaded from: classes2.dex */
public final class OnUndeliveredElementKt {


    public static final <E> kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> bindCancellationFun(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r1, E r2, kotlin.coroutines.CoroutineContext r3) {
            kotlinx.coroutines.internal.OnUndeliveredElementKt$bindCancellationFun$1 r0 = new kotlinx.coroutines.internal.OnUndeliveredElementKt$bindCancellationFun$1
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static final <E> void callUndeliveredElement(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r1, E r2, kotlin.coroutines.CoroutineContext r3) {
            r0 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r1 = callUndeliveredElementCatchingException(r1, r2, r0)
            if (r1 == 0) goto La
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r3, r1)
        La:
            return
    }

    public static final <E> kotlinx.coroutines.internal.UndeliveredElementException callUndeliveredElementCatchingException(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r2, E r3, kotlinx.coroutines.internal.UndeliveredElementException r4) {
            r2.invoke(r3)     // Catch: java.lang.Throwable -> L4
            goto L10
        L4:
            r2 = move-exception
            if (r4 == 0) goto L11
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == r2) goto L11
            kotlin.ExceptionsKt.addSuppressed(r4, r2)
        L10:
            return r4
        L11:
            kotlinx.coroutines.internal.UndeliveredElementException r4 = new kotlinx.coroutines.internal.UndeliveredElementException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Exception in undelivered element handler for "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3, r2)
            return r4
    }

    public static /* synthetic */ kotlinx.coroutines.internal.UndeliveredElementException callUndeliveredElementCatchingException$default(kotlin.jvm.functions.Function1 r0, java.lang.Object r1, kotlinx.coroutines.internal.UndeliveredElementException r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlinx.coroutines.internal.UndeliveredElementException r0 = callUndeliveredElementCatchingException(r0, r1, r2)
            return r0
    }
}
