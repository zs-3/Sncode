package androidx.savedstate;

/* compiled from: SavedStateRegistryController.kt */
/* loaded from: classes.dex */
public final class SavedStateRegistryController {
    public static final androidx.savedstate.SavedStateRegistryController.Companion Companion = null;
    private boolean attached;
    private final androidx.savedstate.SavedStateRegistryOwner owner;
    private final androidx.savedstate.SavedStateRegistry savedStateRegistry;

    /* compiled from: SavedStateRegistryController.kt */
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

        public final androidx.savedstate.SavedStateRegistryController create(androidx.savedstate.SavedStateRegistryOwner r3) {
                r2 = this;
                java.lang.String r0 = "owner"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.savedstate.SavedStateRegistryController r0 = new androidx.savedstate.SavedStateRegistryController
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }
    }

    static {
            androidx.savedstate.SavedStateRegistryController$Companion r0 = new androidx.savedstate.SavedStateRegistryController$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.savedstate.SavedStateRegistryController.Companion = r0
            return
    }

    private SavedStateRegistryController(androidx.savedstate.SavedStateRegistryOwner r1) {
            r0 = this;
            r0.<init>()
            r0.owner = r1
            androidx.savedstate.SavedStateRegistry r1 = new androidx.savedstate.SavedStateRegistry
            r1.<init>()
            r0.savedStateRegistry = r1
            return
    }

    public /* synthetic */ SavedStateRegistryController(androidx.savedstate.SavedStateRegistryOwner r1, kotlin.jvm.internal.DefaultConstructorMarker r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static final androidx.savedstate.SavedStateRegistryController create(androidx.savedstate.SavedStateRegistryOwner r1) {
            androidx.savedstate.SavedStateRegistryController$Companion r0 = androidx.savedstate.SavedStateRegistryController.Companion
            androidx.savedstate.SavedStateRegistryController r1 = r0.create(r1)
            return r1
    }

    public final androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            r1 = this;
            androidx.savedstate.SavedStateRegistry r0 = r1.savedStateRegistry
            return r0
    }

    public final void performAttach() {
            r4 = this;
            androidx.savedstate.SavedStateRegistryOwner r0 = r4.owner
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            java.lang.String r1 = "owner.lifecycle"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            r3 = 1
            if (r1 != r2) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L2b
            androidx.savedstate.Recreator r1 = new androidx.savedstate.Recreator
            androidx.savedstate.SavedStateRegistryOwner r2 = r4.owner
            r1.<init>(r2)
            r0.addObserver(r1)
            androidx.savedstate.SavedStateRegistry r1 = r4.savedStateRegistry
            r1.performAttach$savedstate_release(r0)
            r4.attached = r3
            return
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Restarter must be created only during owner's initialization stage"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void performRestore(android.os.Bundle r4) {
            r3 = this;
            boolean r0 = r3.attached
            if (r0 != 0) goto L7
            r3.performAttach()
        L7:
            androidx.savedstate.SavedStateRegistryOwner r0 = r3.owner
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            java.lang.String r1 = "owner.lifecycle"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r1 = r1.isAtLeast(r2)
            r1 = r1 ^ 1
            if (r1 == 0) goto L26
            androidx.savedstate.SavedStateRegistry r0 = r3.savedStateRegistry
            r0.performRestore$savedstate_release(r4)
            return
        L26:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "performRestore cannot be called when owner is "
            r4.append(r1)
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public final void performSave(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "outBundle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.savedstate.SavedStateRegistry r0 = r1.savedStateRegistry
            r0.performSave(r2)
            return
    }
}
