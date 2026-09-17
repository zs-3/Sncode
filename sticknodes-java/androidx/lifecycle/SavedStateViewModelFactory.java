package androidx.lifecycle;

/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: classes.dex */
public final class SavedStateViewModelFactory extends androidx.lifecycle.ViewModelProvider.OnRequeryFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    private android.app.Application application;
    private android.os.Bundle defaultArgs;
    private final androidx.lifecycle.ViewModelProvider.Factory factory;
    private androidx.lifecycle.Lifecycle lifecycle;
    private androidx.savedstate.SavedStateRegistry savedStateRegistry;

    @android.annotation.SuppressLint({"LambdaLast"})
    public SavedStateViewModelFactory(android.app.Application r2, androidx.savedstate.SavedStateRegistryOwner r3, android.os.Bundle r4) {
            r1 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            androidx.savedstate.SavedStateRegistry r0 = r3.getSavedStateRegistry()
            r1.savedStateRegistry = r0
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            r1.lifecycle = r3
            r1.defaultArgs = r4
            r1.application = r2
            if (r2 == 0) goto L21
            androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion r3 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion
            androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r2 = r3.getInstance(r2)
            goto L26
        L21:
            androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r2 = new androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory
            r2.<init>()
        L26:
            r1.factory = r2
            return
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = r2.getCanonicalName()
            if (r0 == 0) goto L10
            androidx.lifecycle.ViewModel r2 = r1.create(r0, r2)
            return r2
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Local and anonymous classes can not be ViewModels"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r6, androidx.lifecycle.viewmodel.CreationExtras r7) {
            r5 = this;
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "extras"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            androidx.lifecycle.viewmodel.CreationExtras$Key<java.lang.String> r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L84
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.savedstate.SavedStateRegistryOwner> r1 = androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY
            java.lang.Object r1 = r7.get(r1)
            if (r1 == 0) goto L73
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.lifecycle.ViewModelStoreOwner> r1 = androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY
            java.lang.Object r1 = r7.get(r1)
            if (r1 == 0) goto L73
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.app.Application> r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY
            java.lang.Object r0 = r7.get(r0)
            android.app.Application r0 = (android.app.Application) r0
            java.lang.Class<androidx.lifecycle.AndroidViewModel> r1 = androidx.lifecycle.AndroidViewModel.class
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 == 0) goto L3f
            if (r0 == 0) goto L3f
            java.util.List r2 = androidx.lifecycle.SavedStateViewModelFactoryKt.access$getANDROID_VIEWMODEL_SIGNATURE$p()
            java.lang.reflect.Constructor r2 = androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor(r6, r2)
            goto L47
        L3f:
            java.util.List r2 = androidx.lifecycle.SavedStateViewModelFactoryKt.access$getVIEWMODEL_SIGNATURE$p()
            java.lang.reflect.Constructor r2 = androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor(r6, r2)
        L47:
            if (r2 != 0) goto L50
            androidx.lifecycle.ViewModelProvider$Factory r0 = r5.factory
            androidx.lifecycle.ViewModel r6 = r0.create(r6, r7)
            return r6
        L50:
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L66
            if (r0 == 0) goto L66
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r0
            androidx.lifecycle.SavedStateHandle r7 = androidx.lifecycle.SavedStateHandleSupport.createSavedStateHandle(r7)
            r1[r4] = r7
            androidx.lifecycle.ViewModel r6 = androidx.lifecycle.SavedStateViewModelFactoryKt.newInstance(r6, r2, r1)
            goto L7b
        L66:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            androidx.lifecycle.SavedStateHandle r7 = androidx.lifecycle.SavedStateHandleSupport.createSavedStateHandle(r7)
            r0[r3] = r7
            androidx.lifecycle.ViewModel r6 = androidx.lifecycle.SavedStateViewModelFactoryKt.newInstance(r6, r2, r0)
            goto L7b
        L73:
            androidx.lifecycle.Lifecycle r7 = r5.lifecycle
            if (r7 == 0) goto L7c
            androidx.lifecycle.ViewModel r6 = r5.create(r0, r6)
        L7b:
            return r6
        L7c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."
            r6.<init>(r7)
            throw r6
        L84:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "VIEW_MODEL_KEY must always be provided by ViewModelProvider"
            r6.<init>(r7)
            throw r6
    }

    public final <T extends androidx.lifecycle.ViewModel> T create(java.lang.String r7, java.lang.Class<T> r8) {
            r6 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            androidx.lifecycle.Lifecycle r0 = r6.lifecycle
            if (r0 == 0) goto L82
            java.lang.Class<androidx.lifecycle.AndroidViewModel> r0 = androidx.lifecycle.AndroidViewModel.class
            boolean r0 = r0.isAssignableFrom(r8)
            if (r0 == 0) goto L23
            android.app.Application r1 = r6.application
            if (r1 == 0) goto L23
            java.util.List r1 = androidx.lifecycle.SavedStateViewModelFactoryKt.access$getANDROID_VIEWMODEL_SIGNATURE$p()
            java.lang.reflect.Constructor r1 = androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor(r8, r1)
            goto L2b
        L23:
            java.util.List r1 = androidx.lifecycle.SavedStateViewModelFactoryKt.access$getVIEWMODEL_SIGNATURE$p()
            java.lang.reflect.Constructor r1 = androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor(r8, r1)
        L2b:
            if (r1 != 0) goto L43
            android.app.Application r7 = r6.application
            if (r7 == 0) goto L38
            androidx.lifecycle.ViewModelProvider$Factory r7 = r6.factory
            androidx.lifecycle.ViewModel r7 = r7.create(r8)
            goto L42
        L38:
            androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion r7 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion
            androidx.lifecycle.ViewModelProvider$NewInstanceFactory r7 = r7.getInstance()
            androidx.lifecycle.ViewModel r7 = r7.create(r8)
        L42:
            return r7
        L43:
            androidx.savedstate.SavedStateRegistry r2 = r6.savedStateRegistry
            androidx.lifecycle.Lifecycle r3 = r6.lifecycle
            android.os.Bundle r4 = r6.defaultArgs
            androidx.lifecycle.SavedStateHandleController r7 = androidx.lifecycle.LegacySavedStateHandleController.create(r2, r3, r7, r4)
            java.lang.String r2 = "controller.handle"
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L6d
            android.app.Application r0 = r6.application
            if (r0 == 0) goto L6d
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r5[r3] = r0
            androidx.lifecycle.SavedStateHandle r0 = r7.getHandle()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r5[r4] = r0
            androidx.lifecycle.ViewModel r8 = androidx.lifecycle.SavedStateViewModelFactoryKt.newInstance(r8, r1, r5)
            goto L7c
        L6d:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            androidx.lifecycle.SavedStateHandle r4 = r7.getHandle()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)
            r0[r3] = r4
            androidx.lifecycle.ViewModel r8 = androidx.lifecycle.SavedStateViewModelFactoryKt.newInstance(r8, r1, r0)
        L7c:
            java.lang.String r0 = "androidx.lifecycle.savedstate.vm.tag"
            r8.setTagIfAbsent(r0, r7)
            return r8
        L82:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.String r8 = "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."
            r7.<init>(r8)
            throw r7
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(androidx.lifecycle.ViewModel r3) {
            r2 = this;
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.lifecycle.Lifecycle r0 = r2.lifecycle
            if (r0 == 0) goto Le
            androidx.savedstate.SavedStateRegistry r1 = r2.savedStateRegistry
            androidx.lifecycle.LegacySavedStateHandleController.attachHandleIfNeeded(r3, r1, r0)
        Le:
            return
    }
}
