package kotlin.coroutines.intrinsics;

/* compiled from: Intrinsics.kt */
/* loaded from: classes2.dex */
public enum CoroutineSingletons extends java.lang.Enum<kotlin.coroutines.intrinsics.CoroutineSingletons> {
    private static final /* synthetic */ kotlin.coroutines.intrinsics.CoroutineSingletons[] $VALUES = null;
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons COROUTINE_SUSPENDED = null;
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons RESUMED = null;
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons UNDECIDED = null;

    private static final /* synthetic */ kotlin.coroutines.intrinsics.CoroutineSingletons[] $values() {
            r0 = 3
            kotlin.coroutines.intrinsics.CoroutineSingletons[] r0 = new kotlin.coroutines.intrinsics.CoroutineSingletons[r0]
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 0
            r0[r2] = r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.UNDECIDED
            r2 = 1
            r0[r2] = r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.RESUMED
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = new kotlin.coroutines.intrinsics.CoroutineSingletons
            java.lang.String r1 = "COROUTINE_SUSPENDED"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = new kotlin.coroutines.intrinsics.CoroutineSingletons
            java.lang.String r1 = "UNDECIDED"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.coroutines.intrinsics.CoroutineSingletons.UNDECIDED = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = new kotlin.coroutines.intrinsics.CoroutineSingletons
            java.lang.String r1 = "RESUMED"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.coroutines.intrinsics.CoroutineSingletons.RESUMED = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons[] r0 = $values()
            kotlin.coroutines.intrinsics.CoroutineSingletons.$VALUES = r0
            return
    }

    CoroutineSingletons(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.coroutines.intrinsics.CoroutineSingletons valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.coroutines.intrinsics.CoroutineSingletons> r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = (kotlin.coroutines.intrinsics.CoroutineSingletons) r1
            return r1
    }

    public static kotlin.coroutines.intrinsics.CoroutineSingletons[] values() {
            kotlin.coroutines.intrinsics.CoroutineSingletons[] r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.coroutines.intrinsics.CoroutineSingletons[] r0 = (kotlin.coroutines.intrinsics.CoroutineSingletons[]) r0
            return r0
    }
}
