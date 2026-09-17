package androidx.lifecycle.viewmodel;

/* compiled from: CreationExtras.kt */
/* loaded from: classes.dex */
public abstract class CreationExtras {
    private final java.util.Map<androidx.lifecycle.viewmodel.CreationExtras.Key<?>, java.lang.Object> map;

    /* compiled from: CreationExtras.kt */
    public static final class Empty extends androidx.lifecycle.viewmodel.CreationExtras {
        public static final androidx.lifecycle.viewmodel.CreationExtras.Empty INSTANCE = null;

        static {
                androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = new androidx.lifecycle.viewmodel.CreationExtras$Empty
                r0.<init>()
                androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE = r0
                return
        }

        private Empty() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        public <T> T get(androidx.lifecycle.viewmodel.CreationExtras.Key<T> r2) {
                r1 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r2 = 0
                return r2
        }
    }

    /* compiled from: CreationExtras.kt */
    public interface Key<T> {
    }

    public CreationExtras() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.map = r0
            return
    }

    public abstract <T> T get(androidx.lifecycle.viewmodel.CreationExtras.Key<T> r1);

    public final java.util.Map<androidx.lifecycle.viewmodel.CreationExtras.Key<?>, java.lang.Object> getMap$lifecycle_viewmodel_release() {
            r1 = this;
            java.util.Map<androidx.lifecycle.viewmodel.CreationExtras$Key<?>, java.lang.Object> r0 = r1.map
            return r0
    }
}
