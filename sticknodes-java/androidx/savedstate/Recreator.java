package androidx.savedstate;

/* compiled from: Recreator.kt */
/* loaded from: classes.dex */
public final class Recreator implements androidx.lifecycle.LifecycleEventObserver {
    public static final androidx.savedstate.Recreator.Companion Companion = null;
    private final androidx.savedstate.SavedStateRegistryOwner owner;

    /* compiled from: Recreator.kt */
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
    }

    /* compiled from: Recreator.kt */
    public static final class SavedStateProvider implements androidx.savedstate.SavedStateRegistry.SavedStateProvider {
        private final java.util.Set<java.lang.String> classes;

        public SavedStateProvider(androidx.savedstate.SavedStateRegistry r2) {
                r1 = this;
                java.lang.String r0 = "registry"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                r1.classes = r0
                java.lang.String r0 = "androidx.savedstate.Restarter"
                r2.registerSavedStateProvider(r0, r1)
                return
        }

        public final void add(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "className"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.util.Set<java.lang.String> r0 = r1.classes
                r0.add(r2)
                return
        }

        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
        public android.os.Bundle saveState() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.Set<java.lang.String> r2 = r3.classes
                r1.<init>(r2)
                java.lang.String r2 = "classes_to_restore"
                r0.putStringArrayList(r2, r1)
                return r0
        }
    }

    static {
            androidx.savedstate.Recreator$Companion r0 = new androidx.savedstate.Recreator$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.savedstate.Recreator.Companion = r0
            return
    }

    public Recreator(androidx.savedstate.SavedStateRegistryOwner r2) {
            r1 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.owner = r2
            return
    }

    private final void reflectiveNew(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "Class "
            java.lang.Class<androidx.savedstate.Recreator> r1 = androidx.savedstate.Recreator.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L6c
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r5, r2, r1)     // Catch: java.lang.ClassNotFoundException -> L6c
            java.lang.Class<androidx.savedstate.SavedStateRegistry$AutoRecreated> r3 = androidx.savedstate.SavedStateRegistry.AutoRecreated.class
            java.lang.Class r1 = r1.asSubclass(r3)     // Catch: java.lang.ClassNotFoundException -> L6c
            java.lang.String r3 = "{\n                Class.…class.java)\n            }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L6c
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L4d
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L4d
            r1 = 1
            r0.setAccessible(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L35
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = "{\n                constr…wInstance()\n            }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L35
            androidx.savedstate.SavedStateRegistry$AutoRecreated r0 = (androidx.savedstate.SavedStateRegistry.AutoRecreated) r0     // Catch: java.lang.Exception -> L35
            androidx.savedstate.SavedStateRegistryOwner r5 = r4.owner
            r0.onRecreated(r5)
            return
        L35:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to instantiate "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        L4d:
            r5 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = r1.getSimpleName()
            r3.append(r0)
            java.lang.String r0 = " must have default constructor in order to be automatically recreated"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0, r5)
            throw r2
        L6c:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r5)
            java.lang.String r5 = " wasn't found"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r2.<init>(r5, r1)
            throw r2
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            if (r3 != r0) goto L49
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r2.removeObserver(r1)
            androidx.savedstate.SavedStateRegistryOwner r2 = r1.owner
            androidx.savedstate.SavedStateRegistry r2 = r2.getSavedStateRegistry()
            java.lang.String r3 = "androidx.savedstate.Restarter"
            android.os.Bundle r2 = r2.consumeRestoredStateForKey(r3)
            if (r2 != 0) goto L24
            return
        L24:
            java.lang.String r3 = "classes_to_restore"
            java.util.ArrayList r2 = r2.getStringArrayList(r3)
            if (r2 == 0) goto L41
            java.util.Iterator r2 = r2.iterator()
        L30:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.reflectiveNew(r3)
            goto L30
        L40:
            return
        L41:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""
            r2.<init>(r3)
            throw r2
        L49:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Next event must be ON_CREATE"
            r2.<init>(r3)
            throw r2
    }
}
