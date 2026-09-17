package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;

/* compiled from: InitializerViewModelFactory.kt */
/* loaded from: classes.dex */
public final class ViewModelInitializer<T extends androidx.lifecycle.ViewModel> {
    private final java.lang.Class<T> clazz;
    private final kotlin.jvm.functions.Function1<androidx.lifecycle.viewmodel.CreationExtras, T> initializer;

    public ViewModelInitializer(java.lang.Class<T> r2, kotlin.jvm.functions.Function1<? super androidx.lifecycle.viewmodel.CreationExtras, ? extends T> r3) {
            r1 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.clazz = r2
            r1.initializer = r3
            return
    }

    public final java.lang.Class<T> getClazz$lifecycle_viewmodel_release() {
            r1 = this;
            java.lang.Class<T extends androidx.lifecycle.ViewModel> r0 = r1.clazz
            return r0
    }

    public final kotlin.jvm.functions.Function1<androidx.lifecycle.viewmodel.CreationExtras, T> getInitializer$lifecycle_viewmodel_release() {
            r1 = this;
            kotlin.jvm.functions.Function1<androidx.lifecycle.viewmodel.CreationExtras, T extends androidx.lifecycle.ViewModel> r0 = r1.initializer
            return r0
    }
}
