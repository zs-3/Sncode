package kotlinx.coroutines.channels;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes2.dex */
final class ReceiveCatching<E> implements kotlinx.coroutines.Waiter {
    public final kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<? extends E>> cont;

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> r2, int r3) {
            r1 = this;
            kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<? extends E>> r0 = r1.cont
            r0.invokeOnCancellation(r2, r3)
            return
    }
}
