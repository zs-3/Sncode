package androidx.lifecycle;

/* compiled from: ViewModelProvider.kt */
/* loaded from: classes.dex */
public final class ViewModelProviderGetKt {
    public static final androidx.lifecycle.viewmodel.CreationExtras defaultCreationExtras(androidx.lifecycle.ViewModelStoreOwner r1) {
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r0 == 0) goto L15
            androidx.lifecycle.HasDefaultViewModelProviderFactory r1 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r1
            androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
            java.lang.String r0 = "{\n        owner.defaultV…ModelCreationExtras\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            goto L17
        L15:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r1 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
        L17:
            return r1
    }
}
