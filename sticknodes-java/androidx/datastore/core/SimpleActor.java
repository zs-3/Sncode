package androidx.datastore.core;

/* compiled from: SimpleActor.kt */
/* loaded from: classes.dex */
public final class SimpleActor<T> {
    private final kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> consumeMessage;
    private final kotlinx.coroutines.channels.Channel<T> messageQueue;
    private final java.util.concurrent.atomic.AtomicInteger remainingMessages;
    private final kotlinx.coroutines.CoroutineScope scope;


    /* compiled from: SimpleActor.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.SimpleActor$offer$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        java.lang.Object L$0;
        int label;
        final /* synthetic */ androidx.datastore.core.SimpleActor<T> this$0;

        AnonymousClass2(androidx.datastore.core.SimpleActor<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.SimpleActor.AnonymousClass2> r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r2, kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                androidx.datastore.core.SimpleActor$offer$2 r2 = new androidx.datastore.core.SimpleActor$offer$2
                androidx.datastore.core.SimpleActor<T> r0 = r1.this$0
                r2.<init>(r0, r3)
                return r2
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                androidx.datastore.core.SimpleActor$offer$2 r1 = (androidx.datastore.core.SimpleActor.AnonymousClass2) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.throwOnFailure(r8)
                r8 = r7
                goto L6e
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r1 = r7.L$0
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
                kotlin.ResultKt.throwOnFailure(r8)
                r4 = r1
                r1 = r0
                r0 = r7
                goto L60
            L26:
                kotlin.ResultKt.throwOnFailure(r8)
                androidx.datastore.core.SimpleActor<T> r8 = r7.this$0
                java.util.concurrent.atomic.AtomicInteger r8 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r8)
                int r8 = r8.get()
                if (r8 <= 0) goto L37
                r8 = 1
                goto L38
            L37:
                r8 = 0
            L38:
                if (r8 == 0) goto L7d
                r8 = r7
            L3b:
                androidx.datastore.core.SimpleActor<T> r1 = r8.this$0
                kotlinx.coroutines.CoroutineScope r1 = androidx.datastore.core.SimpleActor.access$getScope$p(r1)
                kotlinx.coroutines.CoroutineScopeKt.ensureActive(r1)
                androidx.datastore.core.SimpleActor<T> r1 = r8.this$0
                kotlin.jvm.functions.Function2 r1 = androidx.datastore.core.SimpleActor.access$getConsumeMessage$p(r1)
                androidx.datastore.core.SimpleActor<T> r4 = r8.this$0
                kotlinx.coroutines.channels.Channel r4 = androidx.datastore.core.SimpleActor.access$getMessageQueue$p(r4)
                r8.L$0 = r1
                r8.label = r3
                java.lang.Object r4 = r4.receive(r8)
                if (r4 != r0) goto L5b
                return r0
            L5b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r1
                r1 = r6
            L60:
                r5 = 0
                r0.L$0 = r5
                r0.label = r2
                java.lang.Object r8 = r4.invoke(r8, r0)
                if (r8 != r1) goto L6c
                return r1
            L6c:
                r8 = r0
                r0 = r1
            L6e:
                androidx.datastore.core.SimpleActor<T> r1 = r8.this$0
                java.util.concurrent.atomic.AtomicInteger r1 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r1)
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L3b
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L7d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
        }
    }

    public SimpleActor(kotlinx.coroutines.CoroutineScope r3, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r4, kotlin.jvm.functions.Function2<? super T, ? super java.lang.Throwable, kotlin.Unit> r5, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6) {
            r2 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "onComplete"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "onUndeliveredElement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "consumeMessage"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r2.<init>()
            r2.scope = r3
            r2.consumeMessage = r6
            r6 = 2147483647(0x7fffffff, float:NaN)
            r0 = 0
            r1 = 6
            kotlinx.coroutines.channels.Channel r6 = kotlinx.coroutines.channels.ChannelKt.Channel$default(r6, r0, r0, r1, r0)
            r2.messageQueue = r6
            java.util.concurrent.atomic.AtomicInteger r6 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 0
            r6.<init>(r0)
            r2.remainingMessages = r6
            kotlin.coroutines.CoroutineContext r3 = r3.getCoroutineContext()
            kotlinx.coroutines.Job$Key r6 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r3 = r3.get(r6)
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3
            if (r3 != 0) goto L3d
            goto L45
        L3d:
            androidx.datastore.core.SimpleActor$1 r6 = new androidx.datastore.core.SimpleActor$1
            r6.<init>(r4, r2, r5)
            r3.invokeOnCompletion(r6)
        L45:
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function2 access$getConsumeMessage$p(androidx.datastore.core.SimpleActor r0) {
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r0.consumeMessage
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.channels.Channel access$getMessageQueue$p(androidx.datastore.core.SimpleActor r0) {
            kotlinx.coroutines.channels.Channel<T> r0 = r0.messageQueue
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicInteger access$getRemainingMessages$p(androidx.datastore.core.SimpleActor r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.remainingMessages
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.CoroutineScope access$getScope$p(androidx.datastore.core.SimpleActor r0) {
            kotlinx.coroutines.CoroutineScope r0 = r0.scope
            return r0
    }

    public final void offer(T r7) {
            r6 = this;
            kotlinx.coroutines.channels.Channel<T> r0 = r6.messageQueue
            java.lang.Object r7 = r0.mo106trySendJP2dKIU(r7)
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            if (r0 == 0) goto L18
            java.lang.Throwable r7 = kotlinx.coroutines.channels.ChannelResult.m110exceptionOrNullimpl(r7)
            if (r7 != 0) goto L17
            kotlinx.coroutines.channels.ClosedSendChannelException r7 = new kotlinx.coroutines.channels.ClosedSendChannelException
            java.lang.String r0 = "Channel was closed normally"
            r7.<init>(r0)
        L17:
            throw r7
        L18:
            boolean r7 = kotlinx.coroutines.channels.ChannelResult.m114isSuccessimpl(r7)
            if (r7 == 0) goto L36
            java.util.concurrent.atomic.AtomicInteger r7 = r6.remainingMessages
            int r7 = r7.getAndIncrement()
            if (r7 != 0) goto L35
            kotlinx.coroutines.CoroutineScope r0 = r6.scope
            r1 = 0
            r2 = 0
            androidx.datastore.core.SimpleActor$offer$2 r3 = new androidx.datastore.core.SimpleActor$offer$2
            r7 = 0
            r3.<init>(r6, r7)
            r4 = 3
            r5 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
        L35:
            return
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
    }
}
