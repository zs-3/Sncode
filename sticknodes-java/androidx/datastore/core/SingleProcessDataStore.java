package androidx.datastore.core;

/* compiled from: SingleProcessDataStore.kt */
/* loaded from: classes.dex */
public final class SingleProcessDataStore<T> implements androidx.datastore.core.DataStore<T> {
    public static final androidx.datastore.core.SingleProcessDataStore.Companion Companion = null;
    private static final java.util.Set<java.lang.String> activeFiles = null;
    private static final java.lang.Object activeFilesLock = null;
    private final java.lang.String SCRATCH_SUFFIX;
    private final androidx.datastore.core.SimpleActor<androidx.datastore.core.SingleProcessDataStore.Message<T>> actor;
    private final androidx.datastore.core.CorruptionHandler<T> corruptionHandler;
    private final kotlinx.coroutines.flow.Flow<T> data;
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.datastore.core.State<T>> downstreamFlow;
    private final kotlin.Lazy file$delegate;
    private java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> initTasks;
    private final kotlin.jvm.functions.Function0<java.io.File> produceFile;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final androidx.datastore.core.Serializer<T> serializer;

    /* compiled from: SingleProcessDataStore.kt */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final java.util.Set<java.lang.String> getActiveFiles$datastore_core() {
                r1 = this;
                java.util.Set r0 = androidx.datastore.core.SingleProcessDataStore.access$getActiveFiles$cp()
                return r0
        }

        public final java.lang.Object getActiveFilesLock$datastore_core() {
                r1 = this;
                java.lang.Object r0 = androidx.datastore.core.SingleProcessDataStore.access$getActiveFilesLock$cp()
                return r0
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    private static abstract class Message<T> {

        /* compiled from: SingleProcessDataStore.kt */
        public static final class Read<T> extends androidx.datastore.core.SingleProcessDataStore.Message<T> {
            private final androidx.datastore.core.State<T> lastState;

            public Read(androidx.datastore.core.State<T> r2) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r0)
                    r1.lastState = r2
                    return
            }

            public androidx.datastore.core.State<T> getLastState() {
                    r1 = this;
                    androidx.datastore.core.State<T> r0 = r1.lastState
                    return r0
            }
        }

        /* compiled from: SingleProcessDataStore.kt */
        public static final class Update<T> extends androidx.datastore.core.SingleProcessDataStore.Message<T> {
            private final kotlinx.coroutines.CompletableDeferred<T> ack;
            private final kotlin.coroutines.CoroutineContext callerContext;
            private final androidx.datastore.core.State<T> lastState;
            private final kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> transform;

            public Update(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2, kotlinx.coroutines.CompletableDeferred<T> r3, androidx.datastore.core.State<T> r4, kotlin.coroutines.CoroutineContext r5) {
                    r1 = this;
                    java.lang.String r0 = "transform"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    java.lang.String r0 = "ack"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    java.lang.String r0 = "callerContext"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    r0 = 0
                    r1.<init>(r0)
                    r1.transform = r2
                    r1.ack = r3
                    r1.lastState = r4
                    r1.callerContext = r5
                    return
            }

            public final kotlinx.coroutines.CompletableDeferred<T> getAck() {
                    r1 = this;
                    kotlinx.coroutines.CompletableDeferred<T> r0 = r1.ack
                    return r0
            }

            public final kotlin.coroutines.CoroutineContext getCallerContext() {
                    r1 = this;
                    kotlin.coroutines.CoroutineContext r0 = r1.callerContext
                    return r0
            }

            public androidx.datastore.core.State<T> getLastState() {
                    r1 = this;
                    androidx.datastore.core.State<T> r0 = r1.lastState
                    return r0
            }

            public final kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> getTransform() {
                    r1 = this;
                    kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r0 = r1.transform
                    return r0
            }
        }

        private Message() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Message(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    private static final class UncloseableOutputStream extends java.io.OutputStream {
        private final java.io.FileOutputStream fileOutputStream;

        public UncloseableOutputStream(java.io.FileOutputStream r2) {
                r1 = this;
                java.lang.String r0 = "fileOutputStream"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.fileOutputStream = r2
                return
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
                return
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
                r1 = this;
                java.io.FileOutputStream r0 = r1.fileOutputStream
                r0.flush()
                return
        }

        @Override // java.io.OutputStream
        public void write(int r2) {
                r1 = this;
                java.io.FileOutputStream r0 = r1.fileOutputStream
                r0.write(r2)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r2) {
                r1 = this;
                java.lang.String r0 = "b"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.io.FileOutputStream r0 = r1.fileOutputStream
                r0.write(r2)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "bytes"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.io.FileOutputStream r0 = r1.fileOutputStream
                r0.write(r2, r3, r4)
                return
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$handleUpdate$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.SingleProcessDataStore<T> this$0;

        AnonymousClass1(androidx.datastore.core.SingleProcessDataStore<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.SingleProcessDataStore.AnonymousClass1> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                androidx.datastore.core.SingleProcessDataStore<T> r2 = r1.this$0
                r0 = 0
                java.lang.Object r2 = androidx.datastore.core.SingleProcessDataStore.access$handleUpdate(r2, r0, r1)
                return r2
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInit$1, reason: invalid class name and case insensitive filesystem */
    static final class C00291 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.SingleProcessDataStore<T> this$0;

        C00291(androidx.datastore.core.SingleProcessDataStore<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.SingleProcessDataStore.C00291> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                androidx.datastore.core.SingleProcessDataStore<T> r2 = r1.this$0
                java.lang.Object r2 = androidx.datastore.core.SingleProcessDataStore.access$readAndInit(r2, r1)
                return r2
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1, reason: invalid class name and case insensitive filesystem */
    static final class C00301 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.SingleProcessDataStore<T> this$0;

        C00301(androidx.datastore.core.SingleProcessDataStore<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.SingleProcessDataStore.C00301> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                androidx.datastore.core.SingleProcessDataStore<T> r2 = r1.this$0
                java.lang.Object r2 = androidx.datastore.core.SingleProcessDataStore.access$readAndInitOrPropagateAndThrowFailure(r2, r1)
                return r2
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1, reason: invalid class name and case insensitive filesystem */
    static final class C00311 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.SingleProcessDataStore<T> this$0;

        C00311(androidx.datastore.core.SingleProcessDataStore<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.SingleProcessDataStore.C00311> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                androidx.datastore.core.SingleProcessDataStore<T> r2 = r1.this$0
                java.lang.Object r2 = androidx.datastore.core.SingleProcessDataStore.access$readAndInitOrPropagateFailure(r2, r1)
                return r2
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$readData$1, reason: invalid class name and case insensitive filesystem */
    static final class C00321 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.SingleProcessDataStore<T> this$0;

        C00321(androidx.datastore.core.SingleProcessDataStore<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.SingleProcessDataStore.C00321> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                androidx.datastore.core.SingleProcessDataStore<T> r2 = r1.this$0
                java.lang.Object r2 = androidx.datastore.core.SingleProcessDataStore.access$readData(r2, r1)
                return r2
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1, reason: invalid class name and case insensitive filesystem */
    static final class C00331 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.SingleProcessDataStore<T> this$0;

        C00331(androidx.datastore.core.SingleProcessDataStore<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.SingleProcessDataStore.C00331> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                androidx.datastore.core.SingleProcessDataStore<T> r2 = r1.this$0
                java.lang.Object r2 = androidx.datastore.core.SingleProcessDataStore.access$readDataOrHandleCorruption(r2, r1)
                return r2
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1, reason: invalid class name and case insensitive filesystem */
    static final class C00341 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.SingleProcessDataStore<T> this$0;

        C00341(androidx.datastore.core.SingleProcessDataStore<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.SingleProcessDataStore.C00341> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                androidx.datastore.core.SingleProcessDataStore<T> r2 = r1.this$0
                r0 = 0
                java.lang.Object r2 = androidx.datastore.core.SingleProcessDataStore.access$transformAndWrite(r2, r0, r0, r1)
                return r2
        }
    }

    static {
            androidx.datastore.core.SingleProcessDataStore$Companion r0 = new androidx.datastore.core.SingleProcessDataStore$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.datastore.core.SingleProcessDataStore.Companion = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            androidx.datastore.core.SingleProcessDataStore.activeFiles = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.datastore.core.SingleProcessDataStore.activeFilesLock = r0
            return
    }

    public SingleProcessDataStore(kotlin.jvm.functions.Function0<? extends java.io.File> r2, androidx.datastore.core.Serializer<T> r3, java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> r4, androidx.datastore.core.CorruptionHandler<T> r5, kotlinx.coroutines.CoroutineScope r6) {
            r1 = this;
            java.lang.String r0 = "produceFile"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "initTasksList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "corruptionHandler"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r1.<init>()
            r1.produceFile = r2
            r1.serializer = r3
            r1.corruptionHandler = r5
            r1.scope = r6
            androidx.datastore.core.SingleProcessDataStore$data$1 r2 = new androidx.datastore.core.SingleProcessDataStore$data$1
            r3 = 0
            r2.<init>(r1, r3)
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.flow(r2)
            r1.data = r2
            java.lang.String r2 = ".tmp"
            r1.SCRATCH_SUFFIX = r2
            androidx.datastore.core.SingleProcessDataStore$file$2 r2 = new androidx.datastore.core.SingleProcessDataStore$file$2
            r2.<init>(r1)
            kotlin.Lazy r2 = kotlin.LazyKt.lazy(r2)
            r1.file$delegate = r2
            androidx.datastore.core.UnInitialized r2 = androidx.datastore.core.UnInitialized.INSTANCE
            kotlinx.coroutines.flow.MutableStateFlow r2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(r2)
            r1.downstreamFlow = r2
            java.util.List r2 = kotlin.collections.CollectionsKt.toList(r4)
            r1.initTasks = r2
            androidx.datastore.core.SimpleActor r2 = new androidx.datastore.core.SimpleActor
            androidx.datastore.core.SingleProcessDataStore$actor$1 r4 = new androidx.datastore.core.SingleProcessDataStore$actor$1
            r4.<init>(r1)
            androidx.datastore.core.SingleProcessDataStore$actor$2 r5 = androidx.datastore.core.SingleProcessDataStore$actor$2.INSTANCE
            androidx.datastore.core.SingleProcessDataStore$actor$3 r0 = new androidx.datastore.core.SingleProcessDataStore$actor$3
            r0.<init>(r1, r3)
            r2.<init>(r6, r4, r5, r0)
            r1.actor = r2
            return
    }

    public static final /* synthetic */ java.util.Set access$getActiveFiles$cp() {
            java.util.Set<java.lang.String> r0 = androidx.datastore.core.SingleProcessDataStore.activeFiles
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$getActiveFilesLock$cp() {
            java.lang.Object r0 = androidx.datastore.core.SingleProcessDataStore.activeFilesLock
            return r0
    }

    public static final /* synthetic */ androidx.datastore.core.SimpleActor access$getActor$p(androidx.datastore.core.SingleProcessDataStore r0) {
            androidx.datastore.core.SimpleActor<androidx.datastore.core.SingleProcessDataStore$Message<T>> r0 = r0.actor
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.flow.MutableStateFlow access$getDownstreamFlow$p(androidx.datastore.core.SingleProcessDataStore r0) {
            kotlinx.coroutines.flow.MutableStateFlow<androidx.datastore.core.State<T>> r0 = r0.downstreamFlow
            return r0
    }

    public static final /* synthetic */ java.io.File access$getFile(androidx.datastore.core.SingleProcessDataStore r0) {
            java.io.File r0 = r0.getFile()
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function0 access$getProduceFile$p(androidx.datastore.core.SingleProcessDataStore r0) {
            kotlin.jvm.functions.Function0<java.io.File> r0 = r0.produceFile
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$handleRead(androidx.datastore.core.SingleProcessDataStore r0, androidx.datastore.core.SingleProcessDataStore.Message.Read r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.handleRead(r1, r2)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$handleUpdate(androidx.datastore.core.SingleProcessDataStore r0, androidx.datastore.core.SingleProcessDataStore.Message.Update r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.handleUpdate(r1, r2)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$readAndInit(androidx.datastore.core.SingleProcessDataStore r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.readAndInit(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$readAndInitOrPropagateAndThrowFailure(androidx.datastore.core.SingleProcessDataStore r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.readAndInitOrPropagateAndThrowFailure(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$readAndInitOrPropagateFailure(androidx.datastore.core.SingleProcessDataStore r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.readAndInitOrPropagateFailure(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$readData(androidx.datastore.core.SingleProcessDataStore r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.readData(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$readDataOrHandleCorruption(androidx.datastore.core.SingleProcessDataStore r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.readDataOrHandleCorruption(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$transformAndWrite(androidx.datastore.core.SingleProcessDataStore r0, kotlin.jvm.functions.Function2 r1, kotlin.coroutines.CoroutineContext r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r0.transformAndWrite(r1, r2, r3)
            return r0
    }

    private final void createParentDirectories(java.io.File r3) {
            r2 = this;
            java.io.File r0 = r3.getCanonicalFile()
            java.io.File r0 = r0.getParentFile()
            if (r0 != 0) goto Lb
            goto L14
        Lb:
            r0.mkdirs()
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto L15
        L14:
            return
        L15:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Unable to create parent directories of "
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r3)
            r0.<init>(r3)
            throw r0
    }

    private final java.io.File getFile() {
            r1 = this;
            kotlin.Lazy r0 = r1.file$delegate
            java.lang.Object r0 = r0.getValue()
            java.io.File r0 = (java.io.File) r0
            return r0
    }

    private final java.lang.Object handleRead(androidx.datastore.core.SingleProcessDataStore.Message.Read<T> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlinx.coroutines.flow.MutableStateFlow<androidx.datastore.core.State<T>> r0 = r2.downstreamFlow
            java.lang.Object r0 = r0.getValue()
            androidx.datastore.core.State r0 = (androidx.datastore.core.State) r0
            boolean r1 = r0 instanceof androidx.datastore.core.Data
            if (r1 == 0) goto Ld
            goto L3f
        Ld:
            boolean r1 = r0 instanceof androidx.datastore.core.ReadException
            if (r1 == 0) goto L25
            androidx.datastore.core.State r3 = r3.getLastState()
            if (r0 != r3) goto L3f
            java.lang.Object r3 = r2.readAndInitOrPropagateFailure(r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L22
            return r3
        L22:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L25:
            androidx.datastore.core.UnInitialized r3 = androidx.datastore.core.UnInitialized.INSTANCE
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r2.readAndInitOrPropagateFailure(r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L38
            return r3
        L38:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L3b:
            boolean r3 = r0 instanceof androidx.datastore.core.Final
            if (r3 != 0) goto L42
        L3f:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L42:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Can't read in final state."
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    private final java.lang.Object handleUpdate(androidx.datastore.core.SingleProcessDataStore.Message.Update<T> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            r8 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.SingleProcessDataStore.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.datastore.core.SingleProcessDataStore$handleUpdate$1 r0 = (androidx.datastore.core.SingleProcessDataStore.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$handleUpdate$1 r0 = new androidx.datastore.core.SingleProcessDataStore$handleUpdate$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4a
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.CompletableDeferred r9 = (kotlinx.coroutines.CompletableDeferred) r9
            goto L4e
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.CompletableDeferred r9 = (kotlinx.coroutines.CompletableDeferred) r9
            java.lang.Object r2 = r0.L$1
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            java.lang.Object r4 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore$Message$Update r4 = (androidx.datastore.core.SingleProcessDataStore.Message.Update) r4
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L52
            r10 = r9
            r9 = r4
            goto La0
        L4a:
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.CompletableDeferred r9 = (kotlinx.coroutines.CompletableDeferred) r9
        L4e:
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L52
            goto Lb8
        L52:
            r10 = move-exception
            goto Ld9
        L55:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.CompletableDeferred r10 = r9.getAck()
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Ld5
            kotlinx.coroutines.flow.MutableStateFlow<androidx.datastore.core.State<T>> r2 = r8.downstreamFlow     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> Ld5
            androidx.datastore.core.State r2 = (androidx.datastore.core.State) r2     // Catch: java.lang.Throwable -> Ld5
            boolean r6 = r2 instanceof androidx.datastore.core.Data     // Catch: java.lang.Throwable -> Ld5
            if (r6 == 0) goto L81
            kotlin.jvm.functions.Function2 r2 = r9.getTransform()     // Catch: java.lang.Throwable -> Ld5
            kotlin.coroutines.CoroutineContext r9 = r9.getCallerContext()     // Catch: java.lang.Throwable -> Ld5
            r0.L$0 = r10     // Catch: java.lang.Throwable -> Ld5
            r0.label = r5     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r9 = r8.transformAndWrite(r2, r9, r0)     // Catch: java.lang.Throwable -> Ld5
            if (r9 != r1) goto L7d
            return r1
        L7d:
            r7 = r10
            r10 = r9
            r9 = r7
            goto Lb8
        L81:
            boolean r6 = r2 instanceof androidx.datastore.core.ReadException     // Catch: java.lang.Throwable -> Ld5
            if (r6 == 0) goto L86
            goto L88
        L86:
            boolean r5 = r2 instanceof androidx.datastore.core.UnInitialized     // Catch: java.lang.Throwable -> Ld5
        L88:
            if (r5 == 0) goto Lc4
            androidx.datastore.core.State r5 = r9.getLastState()     // Catch: java.lang.Throwable -> Ld5
            if (r2 != r5) goto Lbd
            r0.L$0 = r9     // Catch: java.lang.Throwable -> Ld5
            r0.L$1 = r8     // Catch: java.lang.Throwable -> Ld5
            r0.L$2 = r10     // Catch: java.lang.Throwable -> Ld5
            r0.label = r4     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r2 = r8.readAndInitOrPropagateAndThrowFailure(r0)     // Catch: java.lang.Throwable -> Ld5
            if (r2 != r1) goto L9f
            return r1
        L9f:
            r2 = r8
        La0:
            kotlin.jvm.functions.Function2 r4 = r9.getTransform()     // Catch: java.lang.Throwable -> Ld5
            kotlin.coroutines.CoroutineContext r9 = r9.getCallerContext()     // Catch: java.lang.Throwable -> Ld5
            r0.L$0 = r10     // Catch: java.lang.Throwable -> Ld5
            r5 = 0
            r0.L$1 = r5     // Catch: java.lang.Throwable -> Ld5
            r0.L$2 = r5     // Catch: java.lang.Throwable -> Ld5
            r0.label = r3     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r9 = r2.transformAndWrite(r4, r9, r0)     // Catch: java.lang.Throwable -> Ld5
            if (r9 != r1) goto L7d
            return r1
        Lb8:
            java.lang.Object r10 = kotlin.Result.m72constructorimpl(r10)     // Catch: java.lang.Throwable -> L52
            goto Le3
        Lbd:
            androidx.datastore.core.ReadException r2 = (androidx.datastore.core.ReadException) r2     // Catch: java.lang.Throwable -> Ld5
            java.lang.Throwable r9 = r2.getReadException()     // Catch: java.lang.Throwable -> Ld5
            throw r9     // Catch: java.lang.Throwable -> Ld5
        Lc4:
            boolean r9 = r2 instanceof androidx.datastore.core.Final     // Catch: java.lang.Throwable -> Ld5
            if (r9 == 0) goto Lcf
            androidx.datastore.core.Final r2 = (androidx.datastore.core.Final) r2     // Catch: java.lang.Throwable -> Ld5
            java.lang.Throwable r9 = r2.getFinalException()     // Catch: java.lang.Throwable -> Ld5
            throw r9     // Catch: java.lang.Throwable -> Ld5
        Lcf:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> Ld5
            r9.<init>()     // Catch: java.lang.Throwable -> Ld5
            throw r9     // Catch: java.lang.Throwable -> Ld5
        Ld5:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        Ld9:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.m72constructorimpl(r10)
        Le3:
            kotlinx.coroutines.CompletableDeferredKt.completeWith(r9, r10)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
    }

    private final java.lang.Object readAndInit(kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
            r13 = this;
            boolean r0 = r14 instanceof androidx.datastore.core.SingleProcessDataStore.C00291
            if (r0 == 0) goto L13
            r0 = r14
            androidx.datastore.core.SingleProcessDataStore$readAndInit$1 r0 = (androidx.datastore.core.SingleProcessDataStore.C00291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readAndInit$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInit$1
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L7b
            if (r2 == r6) goto L67
            if (r2 == r4) goto L4a
            if (r2 != r3) goto L42
            java.lang.Object r1 = r0.L$3
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            java.lang.Object r2 = r0.L$2
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref$BooleanRef) r2
            java.lang.Object r3 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref$ObjectRef) r3
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            kotlin.ResultKt.throwOnFailure(r14)
            goto L117
        L42:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L4a:
            java.lang.Object r2 = r0.L$5
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r8 = r0.L$4
            androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1 r8 = (androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1) r8
            java.lang.Object r9 = r0.L$3
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref$BooleanRef) r9
            java.lang.Object r10 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.sync.Mutex r11 = (kotlinx.coroutines.sync.Mutex) r11
            java.lang.Object r12 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r12 = (androidx.datastore.core.SingleProcessDataStore) r12
            kotlin.ResultKt.throwOnFailure(r14)
            goto Ld8
        L67:
            java.lang.Object r2 = r0.L$3
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r8 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref$ObjectRef) r8
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.sync.Mutex r9 = (kotlinx.coroutines.sync.Mutex) r9
            java.lang.Object r10 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r10 = (androidx.datastore.core.SingleProcessDataStore) r10
            kotlin.ResultKt.throwOnFailure(r14)
            goto Lb8
        L7b:
            kotlin.ResultKt.throwOnFailure(r14)
            kotlinx.coroutines.flow.MutableStateFlow<androidx.datastore.core.State<T>> r14 = r13.downstreamFlow
            java.lang.Object r14 = r14.getValue()
            androidx.datastore.core.UnInitialized r2 = androidx.datastore.core.UnInitialized.INSTANCE
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual(r14, r2)
            if (r14 != 0) goto L99
            kotlinx.coroutines.flow.MutableStateFlow<androidx.datastore.core.State<T>> r14 = r13.downstreamFlow
            java.lang.Object r14 = r14.getValue()
            boolean r14 = r14 instanceof androidx.datastore.core.ReadException
            if (r14 == 0) goto L97
            goto L99
        L97:
            r14 = 0
            goto L9a
        L99:
            r14 = 1
        L9a:
            if (r14 == 0) goto L136
            kotlinx.coroutines.sync.Mutex r9 = kotlinx.coroutines.sync.MutexKt.Mutex$default(r5, r6, r7)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            r0.L$0 = r13
            r0.L$1 = r9
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r6
            java.lang.Object r14 = r13.readDataOrHandleCorruption(r0)
            if (r14 != r1) goto Lb6
            return r1
        Lb6:
            r10 = r13
            r8 = r2
        Lb8:
            r2.element = r14
            kotlin.jvm.internal.Ref$BooleanRef r14 = new kotlin.jvm.internal.Ref$BooleanRef
            r14.<init>()
            androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1 r2 = new androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1
            r2.<init>(r9, r14, r8, r10)
            java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> r11 = r10.initTasks
            if (r11 != 0) goto Lce
            r2 = r1
            r1 = r9
            r9 = r14
            r14 = r0
            r0 = r10
            goto Lfe
        Lce:
            java.util.Iterator r11 = r11.iterator()
            r12 = r10
            r10 = r8
            r8 = r2
            r2 = r11
            r11 = r9
            r9 = r14
        Ld8:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto Lf9
            java.lang.Object r14 = r2.next()
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            r0.L$0 = r12
            r0.L$1 = r11
            r0.L$2 = r10
            r0.L$3 = r9
            r0.L$4 = r8
            r0.L$5 = r2
            r0.label = r4
            java.lang.Object r14 = r14.invoke(r8, r0)
            if (r14 != r1) goto Ld8
            return r1
        Lf9:
            r14 = r0
            r2 = r1
            r8 = r10
            r1 = r11
            r0 = r12
        Lfe:
            r0.initTasks = r7
            r14.L$0 = r0
            r14.L$1 = r8
            r14.L$2 = r9
            r14.L$3 = r1
            r14.L$4 = r7
            r14.L$5 = r7
            r14.label = r3
            java.lang.Object r14 = r1.lock(r7, r14)
            if (r14 != r2) goto L115
            return r2
        L115:
            r3 = r8
            r2 = r9
        L117:
            r2.element = r6     // Catch: java.lang.Throwable -> L131
            kotlin.Unit r14 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L131
            r1.unlock(r7)
            kotlinx.coroutines.flow.MutableStateFlow<androidx.datastore.core.State<T>> r0 = r0.downstreamFlow
            androidx.datastore.core.Data r1 = new androidx.datastore.core.Data
            T r2 = r3.element
            if (r2 == 0) goto L12a
            int r5 = r2.hashCode()
        L12a:
            r1.<init>(r2, r5)
            r0.setValue(r1)
            return r14
        L131:
            r14 = move-exception
            r1.unlock(r7)
            throw r14
        L136:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
    }

    private final java.lang.Object readAndInitOrPropagateAndThrowFailure(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.SingleProcessDataStore.C00301
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.SingleProcessDataStore.C00301) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L48
            r0.label = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.readAndInit(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L48:
            r5 = move-exception
            r0 = r4
        L4a:
            kotlinx.coroutines.flow.MutableStateFlow<androidx.datastore.core.State<T>> r0 = r0.downstreamFlow
            androidx.datastore.core.ReadException r1 = new androidx.datastore.core.ReadException
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
    }

    private final java.lang.Object readAndInitOrPropagateFailure(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.SingleProcessDataStore.C00311
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 r0 = (androidx.datastore.core.SingleProcessDataStore.C00311) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L45
            r0.label = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.readAndInit(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L51
            return r1
        L45:
            r5 = move-exception
            r0 = r4
        L47:
            kotlinx.coroutines.flow.MutableStateFlow<androidx.datastore.core.State<T>> r0 = r0.downstreamFlow
            androidx.datastore.core.ReadException r1 = new androidx.datastore.core.ReadException
            r1.<init>(r5)
            r0.setValue(r1)
        L51:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }

    private final java.lang.Object readData(kotlin.coroutines.Continuation<? super T> r6) {
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.SingleProcessDataStore.C00321
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.SingleProcessDataStore$readData$1 r0 = (androidx.datastore.core.SingleProcessDataStore.C00321) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readData$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.L$2
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.L$1
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L35
            goto L60
        L35:
            r6 = move-exception
            goto L68
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            kotlin.ResultKt.throwOnFailure(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6e
            java.io.File r6 = r5.getFile()     // Catch: java.io.FileNotFoundException -> L6e
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6e
            r6 = 0
            androidx.datastore.core.Serializer<T> r4 = r5.serializer     // Catch: java.lang.Throwable -> L66
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L66
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L66
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L66
            r0.label = r3     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = r4.readFrom(r2, r0)     // Catch: java.lang.Throwable -> L66
            if (r0 != r1) goto L5d
            return r1
        L5d:
            r1 = r6
            r6 = r0
            r0 = r5
        L60:
            kotlin.io.CloseableKt.closeFinally(r2, r1)     // Catch: java.io.FileNotFoundException -> L64
            return r6
        L64:
            r6 = move-exception
            goto L70
        L66:
            r6 = move-exception
            r0 = r5
        L68:
            throw r6     // Catch: java.lang.Throwable -> L69
        L69:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r6)     // Catch: java.io.FileNotFoundException -> L64
            throw r1     // Catch: java.io.FileNotFoundException -> L64
        L6e:
            r6 = move-exception
            r0 = r5
        L70:
            java.io.File r1 = r0.getFile()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L81
            androidx.datastore.core.Serializer<T> r6 = r0.serializer
            java.lang.Object r6 = r6.getDefaultValue()
            return r6
        L81:
            throw r6
    }

    private final java.lang.Object readDataOrHandleCorruption(kotlin.coroutines.Continuation<? super T> r8) {
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.SingleProcessDataStore.C00331
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 r0 = (androidx.datastore.core.SingleProcessDataStore.C00331) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.L$1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.io.IOException -> L35
            goto L87
        L35:
            r8 = move-exception
            goto L8a
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.L$1
            androidx.datastore.core.CorruptionException r2 = (androidx.datastore.core.CorruptionException) r2
            java.lang.Object r4 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r4 = (androidx.datastore.core.SingleProcessDataStore) r4
            kotlin.ResultKt.throwOnFailure(r8)
            goto L79
        L4b:
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: androidx.datastore.core.CorruptionException -> L53
            goto L63
        L53:
            r8 = move-exception
            goto L66
        L55:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.L$0 = r7     // Catch: androidx.datastore.core.CorruptionException -> L64
            r0.label = r5     // Catch: androidx.datastore.core.CorruptionException -> L64
            java.lang.Object r8 = r7.readData(r0)     // Catch: androidx.datastore.core.CorruptionException -> L64
            if (r8 != r1) goto L63
            return r1
        L63:
            return r8
        L64:
            r8 = move-exception
            r2 = r7
        L66:
            androidx.datastore.core.CorruptionHandler<T> r5 = r2.corruptionHandler
            r0.L$0 = r2
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r4 = r5.handleCorruption(r8, r0)
            if (r4 != r1) goto L75
            return r1
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.L$0 = r2     // Catch: java.io.IOException -> L88
            r0.L$1 = r8     // Catch: java.io.IOException -> L88
            r0.label = r3     // Catch: java.io.IOException -> L88
            java.lang.Object r0 = r4.writeData$datastore_core(r8, r0)     // Catch: java.io.IOException -> L88
            if (r0 != r1) goto L86
            return r1
        L86:
            r1 = r8
        L87:
            return r1
        L88:
            r8 = move-exception
            r0 = r2
        L8a:
            kotlin.ExceptionsKt.addSuppressed(r0, r8)
            throw r0
    }

    private final java.lang.Object transformAndWrite(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r8, kotlin.coroutines.CoroutineContext r9, kotlin.coroutines.Continuation<? super T> r10) {
            r7 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.SingleProcessDataStore.C00341
            if (r0 == 0) goto L13
            r0 = r10
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 r0 = (androidx.datastore.core.SingleProcessDataStore.C00341) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 r0 = new androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.L$1
            java.lang.Object r9 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r9 = (androidx.datastore.core.SingleProcessDataStore) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L8e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.L$2
            java.lang.Object r9 = r0.L$1
            androidx.datastore.core.Data r9 = (androidx.datastore.core.Data) r9
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            kotlin.ResultKt.throwOnFailure(r10)
            goto L73
        L49:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.flow.MutableStateFlow<androidx.datastore.core.State<T>> r10 = r7.downstreamFlow
            java.lang.Object r10 = r10.getValue()
            androidx.datastore.core.Data r10 = (androidx.datastore.core.Data) r10
            r10.checkHashCode()
            java.lang.Object r2 = r10.getValue()
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1 r6 = new androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1
            r6.<init>(r8, r2, r3)
            r0.L$0 = r7
            r0.L$1 = r10
            r0.L$2 = r2
            r0.label = r5
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r9, r6, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L73:
            r9.checkHashCode()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r10)
            if (r9 == 0) goto L7d
            goto La0
        L7d:
            r0.L$0 = r2
            r0.L$1 = r10
            r0.L$2 = r3
            r0.label = r4
            java.lang.Object r8 = r2.writeData$datastore_core(r10, r0)
            if (r8 != r1) goto L8c
            return r1
        L8c:
            r8 = r10
            r9 = r2
        L8e:
            kotlinx.coroutines.flow.MutableStateFlow<androidx.datastore.core.State<T>> r9 = r9.downstreamFlow
            androidx.datastore.core.Data r10 = new androidx.datastore.core.Data
            if (r8 == 0) goto L99
            int r0 = r8.hashCode()
            goto L9a
        L99:
            r0 = 0
        L9a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        La0:
            return r8
    }

    @Override // androidx.datastore.core.DataStore
    public kotlinx.coroutines.flow.Flow<T> getData() {
            r1 = this;
            kotlinx.coroutines.flow.Flow<T> r0 = r1.data
            return r0
    }

    @Override // androidx.datastore.core.DataStore
    public java.lang.Object updateData(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super T> r6) {
            r4 = this;
            r0 = 0
            r1 = 1
            kotlinx.coroutines.CompletableDeferred r0 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(r0, r1, r0)
            kotlinx.coroutines.flow.MutableStateFlow<androidx.datastore.core.State<T>> r1 = r4.downstreamFlow
            java.lang.Object r1 = r1.getValue()
            androidx.datastore.core.State r1 = (androidx.datastore.core.State) r1
            androidx.datastore.core.SingleProcessDataStore$Message$Update r2 = new androidx.datastore.core.SingleProcessDataStore$Message$Update
            kotlin.coroutines.CoroutineContext r3 = r6.getContext()
            r2.<init>(r5, r0, r1, r3)
            androidx.datastore.core.SimpleActor<androidx.datastore.core.SingleProcessDataStore$Message<T>> r5 = r4.actor
            r5.offer(r2)
            java.lang.Object r5 = r0.await(r6)
            return r5
    }

    public final java.lang.Object writeData$datastore_core(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            r7 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.SingleProcessDataStore$writeData$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.datastore.core.SingleProcessDataStore$writeData$1 r0 = (androidx.datastore.core.SingleProcessDataStore$writeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$writeData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$writeData$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r8 = r0.L$4
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.L$3
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.L$2
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.L$1
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L3d
            goto L89
        L3d:
            r8 = move-exception
            goto Lbe
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L48:
            kotlin.ResultKt.throwOnFailure(r9)
            java.io.File r9 = r7.getFile()
            r7.createParentDirectories(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.getFile()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.SCRATCH_SUFFIX
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lc7
            r2.<init>(r9)     // Catch: java.io.IOException -> Lc7
            r4 = 0
            androidx.datastore.core.Serializer<T> r5 = r7.serializer     // Catch: java.lang.Throwable -> Lbc
            androidx.datastore.core.SingleProcessDataStore$UncloseableOutputStream r6 = new androidx.datastore.core.SingleProcessDataStore$UncloseableOutputStream     // Catch: java.lang.Throwable -> Lbc
            r6.<init>(r2)     // Catch: java.lang.Throwable -> Lbc
            r0.L$0 = r7     // Catch: java.lang.Throwable -> Lbc
            r0.L$1 = r9     // Catch: java.lang.Throwable -> Lbc
            r0.L$2 = r2     // Catch: java.lang.Throwable -> Lbc
            r0.L$3 = r4     // Catch: java.lang.Throwable -> Lbc
            r0.L$4 = r2     // Catch: java.lang.Throwable -> Lbc
            r0.label = r3     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r8 = r5.writeTo(r8, r6, r0)     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r1) goto L85
            return r1
        L85:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r4
        L89:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L3d
            r8.sync()     // Catch: java.lang.Throwable -> L3d
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3d
            kotlin.io.CloseableKt.closeFinally(r2, r1)     // Catch: java.io.IOException -> Lc4
            java.io.File r9 = r0.getFile()     // Catch: java.io.IOException -> Lc4
            boolean r9 = r3.renameTo(r9)     // Catch: java.io.IOException -> Lc4
            if (r9 == 0) goto La0
            return r8
        La0:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lc4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lc4
            r9.<init>()     // Catch: java.io.IOException -> Lc4
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch: java.io.IOException -> Lc4
            r9.append(r3)     // Catch: java.io.IOException -> Lc4
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lc4
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lc4
            r8.<init>(r9)     // Catch: java.io.IOException -> Lc4
            throw r8     // Catch: java.io.IOException -> Lc4
        Lbc:
            r8 = move-exception
            r3 = r9
        Lbe:
            throw r8     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r9 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r8)     // Catch: java.io.IOException -> Lc4
            throw r9     // Catch: java.io.IOException -> Lc4
        Lc4:
            r8 = move-exception
            r9 = r3
            goto Lc8
        Lc7:
            r8 = move-exception
        Lc8:
            boolean r0 = r9.exists()
            if (r0 == 0) goto Ld1
            r9.delete()
        Ld1:
            throw r8
    }
}
