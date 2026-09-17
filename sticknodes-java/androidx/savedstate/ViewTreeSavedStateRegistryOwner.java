package androidx.savedstate;

/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
/* loaded from: classes.dex */
public final class ViewTreeSavedStateRegistryOwner {
    public static final void set(android.view.View r1, androidx.savedstate.SavedStateRegistryOwner r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = androidx.savedstate.R$id.view_tree_saved_state_registry_owner
            r1.setTag(r0, r2)
            return
    }
}
