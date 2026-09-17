package kotlinx.coroutines.channels;

/* compiled from: Channel.kt */
/* loaded from: classes2.dex */
public final class ChannelKt {
    public static final <E> kotlinx.coroutines.channels.Channel<E> Channel(int r3, kotlinx.coroutines.channels.BufferOverflow r4, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r5) {
            r0 = -2
            r1 = 1
            if (r3 == r0) goto L52
            r0 = -1
            r2 = 0
            if (r3 == r0) goto L37
            if (r3 == 0) goto L26
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r0) goto L20
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 != r0) goto L19
            kotlinx.coroutines.channels.BufferedChannel r4 = new kotlinx.coroutines.channels.BufferedChannel
            r4.<init>(r3, r5)
            goto L68
        L19:
            kotlinx.coroutines.channels.ConflatedBufferedChannel r0 = new kotlinx.coroutines.channels.ConflatedBufferedChannel
            r0.<init>(r3, r4, r5)
            r4 = r0
            goto L68
        L20:
            kotlinx.coroutines.channels.BufferedChannel r4 = new kotlinx.coroutines.channels.BufferedChannel
            r4.<init>(r0, r5)
            goto L68
        L26:
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 != r3) goto L30
            kotlinx.coroutines.channels.BufferedChannel r3 = new kotlinx.coroutines.channels.BufferedChannel
            r3.<init>(r2, r5)
            goto L35
        L30:
            kotlinx.coroutines.channels.ConflatedBufferedChannel r3 = new kotlinx.coroutines.channels.ConflatedBufferedChannel
            r3.<init>(r1, r4, r5)
        L35:
            r4 = r3
            goto L68
        L37:
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 != r3) goto L3c
            r2 = 1
        L3c:
            if (r2 == 0) goto L46
            kotlinx.coroutines.channels.ConflatedBufferedChannel r4 = new kotlinx.coroutines.channels.ConflatedBufferedChannel
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            r4.<init>(r1, r3, r5)
            goto L68
        L46:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "CONFLATED capacity cannot be used with non-default onBufferOverflow"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L52:
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 != r3) goto L62
            kotlinx.coroutines.channels.BufferedChannel r3 = new kotlinx.coroutines.channels.BufferedChannel
            kotlinx.coroutines.channels.Channel$Factory r4 = kotlinx.coroutines.channels.Channel.Factory
            int r4 = r4.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()
            r3.<init>(r4, r5)
            goto L35
        L62:
            kotlinx.coroutines.channels.ConflatedBufferedChannel r3 = new kotlinx.coroutines.channels.ConflatedBufferedChannel
            r3.<init>(r1, r4, r5)
            goto L35
        L68:
            return r4
    }

    public static /* synthetic */ kotlinx.coroutines.channels.Channel Channel$default(int r0, kotlinx.coroutines.channels.BufferOverflow r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r0 = 0
        L5:
            r4 = r3 & 2
            if (r4 == 0) goto Lb
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        Lb:
            r3 = r3 & 4
            if (r3 == 0) goto L10
            r2 = 0
        L10:
            kotlinx.coroutines.channels.Channel r0 = Channel(r0, r1, r2)
            return r0
    }
}
