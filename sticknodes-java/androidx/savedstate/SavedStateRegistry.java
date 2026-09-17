package androidx.savedstate;

/* compiled from: SavedStateRegistry.kt */
@android.annotation.SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {
    private static final androidx.savedstate.SavedStateRegistry.Companion Companion = null;
    private boolean attached;
    private final androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry.SavedStateProvider> components;
    private boolean isAllowingSavingState;
    private boolean isRestored;
    private androidx.savedstate.Recreator.SavedStateProvider recreatorProvider;
    private android.os.Bundle restoredState;

    /* compiled from: SavedStateRegistry.kt */
    public interface AutoRecreated {
        void onRecreated(androidx.savedstate.SavedStateRegistryOwner r1);
    }

    /* compiled from: SavedStateRegistry.kt */
    private static final class Companion {
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
    }

    /* compiled from: SavedStateRegistry.kt */
    public interface SavedStateProvider {
        android.os.Bundle saveState();
    }

    public static /* synthetic */ void $r8$lambda$fqOml4yVknvVr08QjHEXC_isf3A(androidx.savedstate.SavedStateRegistry r0, androidx.lifecycle.LifecycleOwner r1, androidx.lifecycle.Lifecycle.Event r2) {
            m16performAttach$lambda4(r0, r1, r2)
            return
    }

    static {
            androidx.savedstate.SavedStateRegistry$Companion r0 = new androidx.savedstate.SavedStateRegistry$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.savedstate.SavedStateRegistry.Companion = r0
            return
    }

    public SavedStateRegistry() {
            r1 = this;
            r1.<init>()
            androidx.arch.core.internal.SafeIterableMap r0 = new androidx.arch.core.internal.SafeIterableMap
            r0.<init>()
            r1.components = r0
            r0 = 1
            r1.isAllowingSavingState = r0
            return
    }

    /* renamed from: performAttach$lambda-4, reason: not valid java name */
    private static final void m16performAttach$lambda4(androidx.savedstate.SavedStateRegistry r1, androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "<anonymous parameter 0>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_START
            if (r3 != r2) goto L17
            r2 = 1
            r1.isAllowingSavingState = r2
            goto L1e
        L17:
            androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            if (r3 != r2) goto L1e
            r2 = 0
            r1.isAllowingSavingState = r2
        L1e:
            return
    }

    public final android.os.Bundle consumeRestoredStateForKey(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r3.isRestored
            if (r0 == 0) goto L2f
            android.os.Bundle r0 = r3.restoredState
            r1 = 0
            if (r0 == 0) goto L2e
            if (r0 == 0) goto L15
            android.os.Bundle r0 = r0.getBundle(r4)
            goto L16
        L15:
            r0 = r1
        L16:
            android.os.Bundle r2 = r3.restoredState
            if (r2 == 0) goto L1d
            r2.remove(r4)
        L1d:
            android.os.Bundle r4 = r3.restoredState
            r2 = 0
            if (r4 == 0) goto L29
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L29
            r2 = 1
        L29:
            if (r2 != 0) goto L2d
            r3.restoredState = r1
        L2d:
            return r0
        L2e:
            return r1
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "You can consumeRestoredStateForKey only after super.onCreate of corresponding component"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    public final androidx.savedstate.SavedStateRegistry.SavedStateProvider getSavedStateProvider(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r3.components
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r2 = "components"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r1 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r1
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 == 0) goto Lb
            goto L30
        L2f:
            r1 = 0
        L30:
            return r1
    }

    public final void performAttach$savedstate_release(androidx.lifecycle.Lifecycle r3) {
            r2 = this;
            java.lang.String r0 = "lifecycle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r2.attached
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L16
            androidx.savedstate.SavedStateRegistry$$ExternalSyntheticLambda0 r0 = new androidx.savedstate.SavedStateRegistry$$ExternalSyntheticLambda0
            r0.<init>(r2)
            r3.addObserver(r0)
            r2.attached = r1
            return
        L16:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "SavedStateRegistry was already attached."
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public final void performRestore$savedstate_release(android.os.Bundle r3) {
            r2 = this;
            boolean r0 = r2.attached
            if (r0 == 0) goto L25
            boolean r0 = r2.isRestored
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L19
            if (r3 == 0) goto L13
            java.lang.String r0 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            android.os.Bundle r3 = r3.getBundle(r0)
            goto L14
        L13:
            r3 = 0
        L14:
            r2.restoredState = r3
            r2.isRestored = r1
            return
        L19:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "SavedStateRegistry was already restored."
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L25:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "You must call performAttach() before calling performRestore(Bundle)."
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public final void performSave(android.os.Bundle r5) {
            r4 = this;
            java.lang.String r0 = "outBundle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.os.Bundle r1 = r4.restoredState
            if (r1 == 0) goto L11
            r0.putAll(r1)
        L11:
            androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r1 = r4.components
            androidx.arch.core.internal.SafeIterableMap$IteratorWithAdditions r1 = r1.iteratorWithAdditions()
            java.lang.String r2 = "this.components.iteratorWithAdditions()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r2 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r2
            android.os.Bundle r2 = r2.saveState()
            r0.putBundle(r3, r2)
            goto L1c
        L3c:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L47
            java.lang.String r1 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            r5.putBundle(r1, r0)
        L47:
            return
    }

    public final void registerSavedStateProvider(java.lang.String r2, androidx.savedstate.SavedStateRegistry.SavedStateProvider r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "provider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r1.components
            java.lang.Object r2 = r0.putIfAbsent(r2, r3)
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r2 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r2
            if (r2 != 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            if (r2 == 0) goto L1a
            return
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "SavedStateProvider with the given key is already registered"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public final void runOnNextRecreation(java.lang.Class<? extends androidx.savedstate.SavedStateRegistry.AutoRecreated> r5) {
            r4 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r4.isAllowingSavingState
            if (r0 == 0) goto L4c
            androidx.savedstate.Recreator$SavedStateProvider r0 = r4.recreatorProvider
            if (r0 != 0) goto L12
            androidx.savedstate.Recreator$SavedStateProvider r0 = new androidx.savedstate.Recreator$SavedStateProvider
            r0.<init>(r4)
        L12:
            r4.recreatorProvider = r0
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L2b
            r5.getDeclaredConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L2b
            androidx.savedstate.Recreator$SavedStateProvider r0 = r4.recreatorProvider
            if (r0 == 0) goto L2a
            java.lang.String r5 = r5.getName()
            java.lang.String r1 = "clazz.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            r0.add(r5)
        L2a:
            return
        L2b:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Class "
            r2.append(r3)
            java.lang.String r5 = r5.getSimpleName()
            r2.append(r5)
            java.lang.String r5 = " must have default constructor in order to be automatically recreated"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can not perform this action after onSaveInstanceState"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }
}
