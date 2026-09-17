package androidx.core.os;

/* compiled from: OutcomeReceiver.kt */
/* loaded from: classes.dex */
public final class OutcomeReceiverKt {
    public static final <R, E extends java.lang.Throwable> android.os.OutcomeReceiver<R, E> asOutcomeReceiver(kotlin.coroutines.Continuation<? super R> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.core.os.ContinuationOutcomeReceiver r0 = new androidx.core.os.ContinuationOutcomeReceiver
            r0.<init>(r1)
            return r0
    }
}
