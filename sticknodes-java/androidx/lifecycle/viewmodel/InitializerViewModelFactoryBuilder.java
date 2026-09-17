package androidx.lifecycle.viewmodel;

/* compiled from: InitializerViewModelFactory.kt */
/* loaded from: classes.dex */
public final class InitializerViewModelFactoryBuilder {
    private final java.util.List<androidx.lifecycle.viewmodel.ViewModelInitializer<?>> initializers;

    public InitializerViewModelFactoryBuilder() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.initializers = r0
            return
    }

    public final <T extends androidx.lifecycle.ViewModel> void addInitializer(kotlin.reflect.KClass<T> r3, kotlin.jvm.functions.Function1<? super androidx.lifecycle.viewmodel.CreationExtras, ? extends T> r4) {
            r2 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.List<androidx.lifecycle.viewmodel.ViewModelInitializer<?>> r0 = r2.initializers
            androidx.lifecycle.viewmodel.ViewModelInitializer r1 = new androidx.lifecycle.viewmodel.ViewModelInitializer
            java.lang.Class r3 = kotlin.jvm.JvmClassMappingKt.getJavaClass(r3)
            r1.<init>(r3, r4)
            r0.add(r1)
            return
    }

    public final androidx.lifecycle.ViewModelProvider.Factory build() {
            r3 = this;
            androidx.lifecycle.viewmodel.InitializerViewModelFactory r0 = new androidx.lifecycle.viewmodel.InitializerViewModelFactory
            java.util.List<androidx.lifecycle.viewmodel.ViewModelInitializer<?>> r1 = r3.initializers
            r2 = 0
            androidx.lifecycle.viewmodel.ViewModelInitializer[] r2 = new androidx.lifecycle.viewmodel.ViewModelInitializer[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            java.util.Objects.requireNonNull(r1, r2)
            androidx.lifecycle.viewmodel.ViewModelInitializer[] r1 = (androidx.lifecycle.viewmodel.ViewModelInitializer[]) r1
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            androidx.lifecycle.viewmodel.ViewModelInitializer[] r1 = (androidx.lifecycle.viewmodel.ViewModelInitializer[]) r1
            r0.<init>(r1)
            return r0
    }
}
