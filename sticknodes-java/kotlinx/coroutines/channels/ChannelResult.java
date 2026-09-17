package kotlinx.coroutines.channels;

/* compiled from: Channel.kt */
/* loaded from: classes2.dex */
public final class ChannelResult<T> {
    public static final kotlinx.coroutines.channels.ChannelResult.Companion Companion = null;
    private static final kotlinx.coroutines.channels.ChannelResult.Failed failed = null;
    private final java.lang.Object holder;

    /* compiled from: Channel.kt */
    public static final class Closed extends kotlinx.coroutines.channels.ChannelResult.Failed {
        public final java.lang.Throwable cause;

        public Closed(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                r0.cause = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
                if (r0 == 0) goto L12
                java.lang.Throwable r0 = r1.cause
                kotlinx.coroutines.channels.ChannelResult$Closed r2 = (kotlinx.coroutines.channels.ChannelResult.Closed) r2
                java.lang.Throwable r2 = r2.cause
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.lang.Throwable r0 = r1.cause
                if (r0 == 0) goto L9
                int r0 = r0.hashCode()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.Failed
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Closed("
                r0.append(r1)
                java.lang.Throwable r1 = r2.cause
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: Channel.kt */
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

        /* renamed from: closed-JP2dKIU, reason: not valid java name */
        public final <E> java.lang.Object m117closedJP2dKIU(java.lang.Throwable r2) {
                r1 = this;
                kotlinx.coroutines.channels.ChannelResult$Closed r0 = new kotlinx.coroutines.channels.ChannelResult$Closed
                r0.<init>(r2)
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelResult.m108constructorimpl(r0)
                return r2
        }

        /* renamed from: failure-PtdJZtk, reason: not valid java name */
        public final <E> java.lang.Object m118failurePtdJZtk() {
                r1 = this;
                kotlinx.coroutines.channels.ChannelResult$Failed r0 = kotlinx.coroutines.channels.ChannelResult.access$getFailed$cp()
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelResult.m108constructorimpl(r0)
                return r0
        }

        /* renamed from: success-JP2dKIU, reason: not valid java name */
        public final <E> java.lang.Object m119successJP2dKIU(E r1) {
                r0 = this;
                java.lang.Object r1 = kotlinx.coroutines.channels.ChannelResult.m108constructorimpl(r1)
                return r1
        }
    }

    /* compiled from: Channel.kt */
    public static class Failed {
        public Failed() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Failed"
                return r0
        }
    }

    static {
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = new kotlinx.coroutines.channels.ChannelResult$Companion
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.channels.ChannelResult.Companion = r0
            kotlinx.coroutines.channels.ChannelResult$Failed r0 = new kotlinx.coroutines.channels.ChannelResult$Failed
            r0.<init>()
            kotlinx.coroutines.channels.ChannelResult.failed = r0
            return
    }

    private /* synthetic */ ChannelResult(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.holder = r1
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.channels.ChannelResult.Failed access$getFailed$cp() {
            kotlinx.coroutines.channels.ChannelResult$Failed r0 = kotlinx.coroutines.channels.ChannelResult.failed
            return r0
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlinx.coroutines.channels.ChannelResult m107boximpl(java.lang.Object r1) {
            kotlinx.coroutines.channels.ChannelResult r0 = new kotlinx.coroutines.channels.ChannelResult
            r0.<init>(r1)
            return r0
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> java.lang.Object m108constructorimpl(java.lang.Object r0) {
            return r0
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m109equalsimpl(java.lang.Object r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof kotlinx.coroutines.channels.ChannelResult
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlinx.coroutines.channels.ChannelResult r3 = (kotlinx.coroutines.channels.ChannelResult) r3
            java.lang.Object r3 = r3.m116unboximpl()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L13
            return r1
        L13:
            r2 = 1
            return r2
    }

    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final java.lang.Throwable m110exceptionOrNullimpl(java.lang.Object r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            r1 = 0
            if (r0 == 0) goto L8
            kotlinx.coroutines.channels.ChannelResult$Closed r2 = (kotlinx.coroutines.channels.ChannelResult.Closed) r2
            goto L9
        L8:
            r2 = r1
        L9:
            if (r2 == 0) goto Ld
            java.lang.Throwable r1 = r2.cause
        Ld:
            return r1
    }

    /* renamed from: getOrNull-impl, reason: not valid java name */
    public static final T m111getOrNullimpl(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r0 != 0) goto L5
            goto L6
        L5:
            r1 = 0
        L6:
            return r1
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m112hashCodeimpl(java.lang.Object r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r0.hashCode()
        L8:
            return r0
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m113isClosedimpl(java.lang.Object r0) {
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            return r0
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m114isSuccessimpl(java.lang.Object r0) {
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            r0 = r0 ^ 1
            return r0
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m115toStringimpl(java.lang.Object r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            if (r0 == 0) goto Lb
            kotlinx.coroutines.channels.ChannelResult$Closed r2 = (kotlinx.coroutines.channels.ChannelResult.Closed) r2
            java.lang.String r2 = r2.toString()
            goto L21
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Value("
            r0.append(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L21:
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.holder
            boolean r2 = m109equalsimpl(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.holder
            int r0 = m112hashCodeimpl(r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Object r0 = r1.holder
            java.lang.String r0 = m115toStringimpl(r0)
            return r0
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.Object m116unboximpl() {
            r1 = this;
            java.lang.Object r0 = r1.holder
            return r0
    }
}
