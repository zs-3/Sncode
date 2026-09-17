package androidx.fragment.app;

/* loaded from: classes.dex */
class FragmentViewLifecycleOwner implements androidx.lifecycle.HasDefaultViewModelProviderFactory, androidx.savedstate.SavedStateRegistryOwner, androidx.lifecycle.ViewModelStoreOwner {
    private final androidx.fragment.app.Fragment mFragment;
    private androidx.lifecycle.LifecycleRegistry mLifecycleRegistry;
    private androidx.savedstate.SavedStateRegistryController mSavedStateRegistryController;
    private final androidx.lifecycle.ViewModelStore mViewModelStore;

    FragmentViewLifecycleOwner(androidx.fragment.app.Fragment r2, androidx.lifecycle.ViewModelStore r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mLifecycleRegistry = r0
            r1.mSavedStateRegistryController = r0
            r1.mFragment = r2
            r1.mViewModelStore = r3
            return
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.content.Context r0 = r0.requireContext()
            android.content.Context r0 = r0.getApplicationContext()
        La:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L1c
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L15
            android.app.Application r0 = (android.app.Application) r0
            goto L1d
        L15:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto La
        L1c:
            r0 = 0
        L1d:
            androidx.lifecycle.viewmodel.MutableCreationExtras r1 = new androidx.lifecycle.viewmodel.MutableCreationExtras
            r1.<init>()
            if (r0 == 0) goto L29
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.app.Application> r2 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY
            r1.set(r2, r0)
        L29:
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.savedstate.SavedStateRegistryOwner> r0 = androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY
            androidx.fragment.app.Fragment r2 = r3.mFragment
            r1.set(r0, r2)
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.lifecycle.ViewModelStoreOwner> r0 = androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY
            r1.set(r0, r3)
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.os.Bundle r0 = r0.getArguments()
            if (r0 == 0) goto L48
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.os.Bundle> r0 = androidx.lifecycle.SavedStateHandleSupport.DEFAULT_ARGS_KEY
            androidx.fragment.app.Fragment r2 = r3.mFragment
            android.os.Bundle r2 = r2.getArguments()
            r1.set(r0, r2)
        L48:
            return r1
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            r1.initialize()
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            return r0
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            r1 = this;
            r1.initialize()
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            androidx.savedstate.SavedStateRegistry r0 = r0.getSavedStateRegistry()
            return r0
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
            r1 = this;
            r1.initialize()
            androidx.lifecycle.ViewModelStore r0 = r1.mViewModelStore
            return r0
    }

    void handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event r2) {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            r0.handleLifecycleEvent(r2)
            return
    }

    void initialize() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            if (r0 != 0) goto L14
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.mLifecycleRegistry = r0
            androidx.savedstate.SavedStateRegistryController r0 = androidx.savedstate.SavedStateRegistryController.create(r1)
            r1.mSavedStateRegistryController = r0
            r0.performAttach()
        L14:
            return
    }

    boolean isInitialized() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    void performRestore(android.os.Bundle r2) {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            r0.performRestore(r2)
            return
    }

    void performSave(android.os.Bundle r2) {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            r0.performSave(r2)
            return
    }

    void setCurrentState(androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            r0.setCurrentState(r2)
            return
    }
}
