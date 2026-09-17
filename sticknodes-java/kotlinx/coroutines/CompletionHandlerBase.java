package kotlinx.coroutines;

/* compiled from: CompletionHandler.kt */
/* loaded from: classes2.dex */
public abstract class CompletionHandlerBase extends kotlinx.coroutines.internal.LockFreeLinkedListNode implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {
    public CompletionHandlerBase() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void invoke(java.lang.Throwable r1);
}
