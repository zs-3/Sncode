package androidx.core.os;

import java.lang.Throwable;

/* compiled from: OutcomeReceiver.kt */
/* loaded from: classes.dex */
final class ContinuationOutcomeReceiver<R, E extends java.lang.Throwable> extends java.util.concurrent.atomic.AtomicBoolean implements android.os.OutcomeReceiver<R, E> {
    private final kotlin.coroutines.Continuation<R> continuation;

    public ContinuationOutcomeReceiver(kotlin.coroutines.Continuation<? super R> r2) {
            r1 = this;
            java.lang.String r0 = "continuation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            r1.<init>(r0)
            r1.continuation = r2
            return
    }

    @Override // android.os.OutcomeReceiver
    public void onError(E r3) {
            r2 = this;
            java.lang.String r0 = "error"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = 1
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L1c
            kotlin.coroutines.Continuation<R> r0 = r2.continuation
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r3 = kotlin.Result.m72constructorimpl(r3)
            r0.resumeWith(r3)
        L1c:
            return
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L13
            kotlin.coroutines.Continuation<R> r0 = r2.continuation
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.Result.m72constructorimpl(r3)
            r0.resumeWith(r3)
        L13:
            return
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ContinuationOutcomeReceiver(outcomeReceived = "
            r0.append(r1)
            boolean r1 = r2.get()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
