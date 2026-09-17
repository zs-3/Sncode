package androidx.lifecycle.viewmodel;

/* compiled from: CreationExtras.kt */
/* loaded from: classes.dex */
public final class MutableCreationExtras extends androidx.lifecycle.viewmodel.CreationExtras {
    public MutableCreationExtras() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public MutableCreationExtras(androidx.lifecycle.viewmodel.CreationExtras r2) {
            r1 = this;
            java.lang.String r0 = "initialExtras"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            java.util.Map r0 = r1.getMap$lifecycle_viewmodel_release()
            java.util.Map r2 = r2.getMap$lifecycle_viewmodel_release()
            r0.putAll(r2)
            return
    }

    public /* synthetic */ MutableCreationExtras(androidx.lifecycle.viewmodel.CreationExtras r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            androidx.lifecycle.viewmodel.CreationExtras$Empty r1 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
        L6:
            r0.<init>(r1)
            return
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    public <T> T get(androidx.lifecycle.viewmodel.CreationExtras.Key<T> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Map r0 = r1.getMap$lifecycle_viewmodel_release()
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public final <T> void set(androidx.lifecycle.viewmodel.CreationExtras.Key<T> r2, T r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Map r0 = r1.getMap$lifecycle_viewmodel_release()
            r0.put(r2, r3)
            return
    }
}
