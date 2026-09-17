package kotlinx.coroutines;

/* compiled from: CoroutineStart.kt */
/* loaded from: classes2.dex */
public enum CoroutineStart extends java.lang.Enum<kotlinx.coroutines.CoroutineStart> {
    private static final /* synthetic */ kotlinx.coroutines.CoroutineStart[] $VALUES = null;
    public static final kotlinx.coroutines.CoroutineStart ATOMIC = null;
    public static final kotlinx.coroutines.CoroutineStart DEFAULT = null;
    public static final kotlinx.coroutines.CoroutineStart LAZY = null;
    public static final kotlinx.coroutines.CoroutineStart UNDISPATCHED = null;

    /* compiled from: CoroutineStart.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlinx.coroutines.CoroutineStart[] r0 = kotlinx.coroutines.CoroutineStart.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.DEFAULT     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.ATOMIC     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.LAZY     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L2b:
                kotlinx.coroutines.CoroutineStart.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    private static final /* synthetic */ kotlinx.coroutines.CoroutineStart[] $values() {
            r0 = 4
            kotlinx.coroutines.CoroutineStart[] r0 = new kotlinx.coroutines.CoroutineStart[r0]
            kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.DEFAULT
            r2 = 0
            r0[r2] = r1
            kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.LAZY
            r2 = 1
            r0[r2] = r1
            kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.ATOMIC
            r2 = 2
            r0[r2] = r1
            kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            r2 = 3
            r0[r2] = r1
            return r0
    }

    static {
            kotlinx.coroutines.CoroutineStart r0 = new kotlinx.coroutines.CoroutineStart
            java.lang.String r1 = "DEFAULT"
            r2 = 0
            r0.<init>(r1, r2)
            kotlinx.coroutines.CoroutineStart.DEFAULT = r0
            kotlinx.coroutines.CoroutineStart r0 = new kotlinx.coroutines.CoroutineStart
            java.lang.String r1 = "LAZY"
            r2 = 1
            r0.<init>(r1, r2)
            kotlinx.coroutines.CoroutineStart.LAZY = r0
            kotlinx.coroutines.CoroutineStart r0 = new kotlinx.coroutines.CoroutineStart
            java.lang.String r1 = "ATOMIC"
            r2 = 2
            r0.<init>(r1, r2)
            kotlinx.coroutines.CoroutineStart.ATOMIC = r0
            kotlinx.coroutines.CoroutineStart r0 = new kotlinx.coroutines.CoroutineStart
            java.lang.String r1 = "UNDISPATCHED"
            r2 = 3
            r0.<init>(r1, r2)
            kotlinx.coroutines.CoroutineStart.UNDISPATCHED = r0
            kotlinx.coroutines.CoroutineStart[] r0 = $values()
            kotlinx.coroutines.CoroutineStart.$VALUES = r0
            return
    }

    CoroutineStart(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlinx.coroutines.CoroutineStart valueOf(java.lang.String r1) {
            java.lang.Class<kotlinx.coroutines.CoroutineStart> r0 = kotlinx.coroutines.CoroutineStart.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlinx.coroutines.CoroutineStart r1 = (kotlinx.coroutines.CoroutineStart) r1
            return r1
    }

    public static kotlinx.coroutines.CoroutineStart[] values() {
            kotlinx.coroutines.CoroutineStart[] r0 = kotlinx.coroutines.CoroutineStart.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlinx.coroutines.CoroutineStart[] r0 = (kotlinx.coroutines.CoroutineStart[]) r0
            return r0
    }

    public final <R, T> void invoke(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r7, R r8, kotlin.coroutines.Continuation<? super T> r9) {
            r6 = this;
            int[] r0 = kotlinx.coroutines.CoroutineStart.WhenMappings.$EnumSwitchMapping$0
            int r1 = r6.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L23
            r1 = 2
            if (r0 == r1) goto L1f
            r1 = 3
            if (r0 == r1) goto L1b
            r7 = 4
            if (r0 != r7) goto L15
            goto L2c
        L15:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L1b:
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUndispatched(r7, r8, r9)
            goto L2c
        L1f:
            kotlin.coroutines.ContinuationKt.startCoroutine(r7, r8, r9)
            goto L2c
        L23:
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable$default(r0, r1, r2, r3, r4, r5)
        L2c:
            return
    }

    public final boolean isLazy() {
            r1 = this;
            kotlinx.coroutines.CoroutineStart r0 = kotlinx.coroutines.CoroutineStart.LAZY
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
