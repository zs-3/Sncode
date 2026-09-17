package androidx.lifecycle;

/* loaded from: classes.dex */
public class ViewTreeLifecycleOwner {
    public static void set(android.view.View r1, androidx.lifecycle.LifecycleOwner r2) {
            int r0 = androidx.lifecycle.runtime.R$id.view_tree_lifecycle_owner
            r1.setTag(r0, r2)
            return
    }
}
